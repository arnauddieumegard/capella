/*******************************************************************************
 * Copyright (c) 2006, 2014 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.core.libraries.extendedqueries.csServices;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.common.libraries.IModel;
import org.polarsys.capella.common.libraries.ILibraryManager;
import org.polarsys.capella.common.libraries.manager.LibraryManagerExt;
import org.polarsys.capella.common.queries.AbstractQuery;
import org.polarsys.capella.common.queries.interpretor.QueryInterpretor;
import org.polarsys.capella.common.queries.queryContext.IQueryContext;
import org.polarsys.capella.core.libraries.model.CapellaModel;
import org.polarsys.capella.core.model.helpers.queries.QueryIdentifierConstants;
import org.polarsys.capella.core.model.helpers.queries.filters.RemoveContextFilter;
import org.polarsys.capella.core.queries.helpers.QueryExt;

public class GetCCIIShowHideComponent__Lib extends AbstractQuery {

  @Override
  public List<Object> execute(Object input, IQueryContext context) {
    List<Object> result = new ArrayList<Object>();
    EObject element = (EObject) input;
    IModel currentProject =  ILibraryManager.INSTANCE.getModel(element);
    Collection<IModel> libraries = LibraryManagerExt.getAllActivesReferences(currentProject);
    for (IModel library : libraries) {
      EObject correspondingInput = QueryExt.getCorrespondingElementInLibrary(element, (CapellaModel) library);
      result.addAll(QueryInterpretor.executeQuery(QueryIdentifierConstants.GET_COMPONENTS, correspondingInput, context));
    }
    result = QueryInterpretor.executeFilter(result, new RemoveContextFilter());
    return result;
  }
}