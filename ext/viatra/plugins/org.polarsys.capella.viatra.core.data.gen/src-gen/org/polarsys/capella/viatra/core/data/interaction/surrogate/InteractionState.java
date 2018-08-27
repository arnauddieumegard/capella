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
package org.polarsys.capella.viatra.core.data.interaction.surrogate;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.polarsys.capella.viatra.core.data.interaction.surrogate.InteractionState__coveredMatcher;
import org.polarsys.capella.viatra.core.data.interaction.surrogate.util.InteractionState__coveredQuerySpecification;

/**
 * A pattern group formed of all public patterns defined in InteractionState.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file InteractionState.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package org.polarsys.capella.viatra.core.data.interaction.surrogate, the group contains the definition of the following patterns: <ul>
 * <li>InteractionState__covered</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class InteractionState extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static InteractionState instance() throws ViatraQueryException {
    if (INSTANCE == null) {
        INSTANCE = new InteractionState();
    }
    return INSTANCE;
  }
  
  private static InteractionState INSTANCE;
  
  private InteractionState() throws ViatraQueryException {
    querySpecifications.add(InteractionState__coveredQuerySpecification.instance());
  }
  
  public InteractionState__coveredQuerySpecification getInteractionState__covered() throws ViatraQueryException {
    return InteractionState__coveredQuerySpecification.instance();
  }
  
  public InteractionState__coveredMatcher getInteractionState__covered(final ViatraQueryEngine engine) throws ViatraQueryException {
    return InteractionState__coveredMatcher.on(engine);
  }
}
