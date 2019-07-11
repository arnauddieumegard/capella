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
package org.polarsys.capella.core.semantic.queries.basic.queries;

import java.util.ArrayList;
import java.util.List;

import org.polarsys.capella.common.helpers.query.IQuery;
import org.polarsys.capella.core.data.ctx.Capability;
import org.polarsys.capella.core.data.interaction.AbstractCapability;
import org.polarsys.capella.core.data.la.CapabilityRealization;

/**
 * Return Involved Actor of current AbstractCapability
 */
public class Capability_InvolvedComponents implements IQuery {

  /**
   * 
   */
  public Capability_InvolvedComponents() {
    // do nothing
  }

  /**
   * current.participatingActors
   * @see org.polarsys.capella.common.helpers.query.IQuery#compute(java.lang.Object)
   */
  public List<Object> compute(Object object) {
    List<Object> result = new ArrayList<Object>();
    if (object instanceof AbstractCapability) {
      if (object instanceof Capability) {
        Capability cap = (Capability) object;
        result.addAll(cap.getInvolvedSystemComponents());

      } else if (object instanceof CapabilityRealization) {
        CapabilityRealization cap = (CapabilityRealization) object;
        result.addAll(cap.getInvolvedComponents());
      }
    }
    return result;
  }
}
