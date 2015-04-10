/*******************************************************************************
 * Copyright (c) 2006, 2015 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.test.diagram.common.ju.headless;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.sirius.analysis.actions.extensions.AffectToMessageDialogBox;
import org.polarsys.capella.core.sirius.analysis.actions.extensions.SelectLinksFromTransferWizard;

/**
 * Interface which have to be implemented by the classes with are used in order to short-cut GUI call from {@link AffectToMessageDialogBox}
 */
public interface IAffectToMessageResult extends IHeadlessResult {
  /**
   * the simulated result.
   * @param selections @see {@link AffectToMessageDialogBox}
   * @param parameters @see {@link AffectToMessageDialogBox}
   * @return the "left" list.
   * @see {@link SelectLinksFromTransferWizard}
   */
  public Object getResult(Collection<? extends EObject> selections, Map<String, Object> parameters);
}
