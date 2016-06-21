/*******************************************************************************
 * Copyright (c) 2006, 2016 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.core.business.queries.queries.capellacommon;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.polarsys.capella.common.queries.AbstractQuery;
import org.polarsys.capella.common.queries.interpretor.QueryInterpretor;
import org.polarsys.capella.common.queries.queryContext.IQueryContext;
import org.polarsys.capella.common.queries.queryContext.QueryContext;
import org.polarsys.capella.core.data.capellacommon.StateTransition;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.cs.BlockArchitecture;
import org.polarsys.capella.core.data.cs.Component;
import org.polarsys.capella.core.data.information.Class;
import org.polarsys.capella.core.data.information.ExchangeItem;
import org.polarsys.capella.core.data.information.Operation;
import org.polarsys.capella.core.model.helpers.BlockArchitectureExt;
import org.polarsys.capella.core.model.helpers.ComponentExt;
import org.polarsys.capella.core.model.helpers.SystemEngineeringExt;

public class GetAvailable_StateTransitionEffect extends AbstractQuery {

  @Override
  public List<Object> execute(Object input, IQueryContext context) {
    CapellaElement inputElement = (CapellaElement) input;
    BlockArchitecture arch = SystemEngineeringExt.getRootBlockArchitecture(inputElement);
    if (arch == null) {
      return Collections.emptyList();
    }
    List<CapellaElement> availableElements = new ArrayList<CapellaElement>();
    for (BlockArchitecture block : BlockArchitectureExt.getAllAllocatedArchitectures(arch)) {
      TreeIterator<Object> allContents = EcoreUtil.getAllContents(block, false);
      while (allContents.hasNext()) {
        Object object = allContents.next();
        if ((object instanceof ExchangeItem) || (object instanceof Operation)) {
          availableElements.add((CapellaElement) object);
        }
      }
    }
    EObject eContainer = inputElement.eContainer();
    while (eContainer != null && !(eContainer instanceof Component) && !(eContainer instanceof Class)) {
      eContainer = eContainer.eContainer();
    }
    if ((eContainer instanceof Component) && (inputElement instanceof StateTransition)) {
      availableElements.addAll(getElementsFromComponentAndSubComponents((Component) eContainer));
    }
    if (inputElement instanceof StateTransition) {
      List<CapellaElement> currentElements = QueryInterpretor.executeQuery("GetCurrent_StateTransitionEffect", //$NON-NLS-1$
          inputElement, new QueryContext());
      availableElements.removeAll(currentElements);
    }
    return (List) availableElements;
  }

  /**
   * @param state_p
   * @param component_p
   * @return
   */
  private List<CapellaElement> getElementsFromComponentAndSubComponents(Component component_p) {
    List<CapellaElement> availableElements = new ArrayList<CapellaElement>(1);
    Collection<Component> subComponents = ComponentExt.getAllSubUsedAndDeployedComponents(component_p);
    subComponents.add(component_p);

    for (Component component : subComponents) {
      availableElements.addAll(component.getAllocatedFunctions());
    }
    return availableElements;
  }

}
