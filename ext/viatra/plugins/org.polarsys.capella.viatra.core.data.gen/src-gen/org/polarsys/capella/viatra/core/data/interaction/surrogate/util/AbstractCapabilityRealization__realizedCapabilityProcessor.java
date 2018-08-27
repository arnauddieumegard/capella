/**
 * 
 *   Copyright (c) 2006, 2019 THALES DMS FRANCE.
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 *  
 *   Contributors:
 *      Thales - initial API and implementation
 *  
 */
package org.polarsys.capella.viatra.core.data.interaction.surrogate.util;

import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.polarsys.capella.core.data.interaction.AbstractCapability;
import org.polarsys.capella.core.data.interaction.AbstractCapabilityRealization;
import org.polarsys.capella.viatra.core.data.interaction.surrogate.AbstractCapabilityRealization__realizedCapabilityMatch;

/**
 * A match processor tailored for the org.polarsys.capella.viatra.core.data.interaction.surrogate.AbstractCapabilityRealization__realizedCapability pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class AbstractCapabilityRealization__realizedCapabilityProcessor implements IMatchProcessor<AbstractCapabilityRealization__realizedCapabilityMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pSelf the value of pattern parameter self in the currently processed match
   * @param pTarget the value of pattern parameter target in the currently processed match
   * 
   */
  public abstract void process(final AbstractCapabilityRealization pSelf, final AbstractCapability pTarget);
  
  @Override
  public void process(final AbstractCapabilityRealization__realizedCapabilityMatch match) {
    process(match.getSelf(), match.getTarget());
  }
}
