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
package org.polarsys.capella.core.transition.common.rules;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;

/**
 */
public interface IRuleTransformation {

  /**
   * Returns for the given element_p whether the transposer apply method should be called
   */
  public IStatus applyRequired(EObject element_p, IContext context_p);

  /**
   * Returns for the given element_p whether a transformation is required (already transformed or not according the given context_p)
   */
  public IStatus transformRequired(EObject source_p, IContext context_p);

  public EClass getTargetType(EObject element_p, IContext context_p);

}