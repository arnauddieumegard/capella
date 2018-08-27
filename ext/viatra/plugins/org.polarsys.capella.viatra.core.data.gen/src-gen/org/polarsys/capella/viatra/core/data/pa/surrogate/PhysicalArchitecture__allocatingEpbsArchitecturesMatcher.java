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
package org.polarsys.capella.viatra.core.data.pa.surrogate;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import org.polarsys.capella.core.data.epbs.EPBSArchitecture;
import org.polarsys.capella.core.data.pa.PhysicalArchitecture;
import org.polarsys.capella.viatra.core.data.pa.surrogate.PhysicalArchitecture__allocatingEpbsArchitecturesMatch;
import org.polarsys.capella.viatra.core.data.pa.surrogate.util.PhysicalArchitecture__allocatingEpbsArchitecturesQuerySpecification;

/**
 * Generated pattern matcher API of the org.polarsys.capella.viatra.core.data.pa.surrogate.PhysicalArchitecture__allocatingEpbsArchitectures pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link PhysicalArchitecture__allocatingEpbsArchitecturesMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * {@literal @}Surrogate(feature="allocatingEpbsArchitectures")
 * pattern PhysicalArchitecture__allocatingEpbsArchitectures(self : PhysicalArchitecture, target : EPBSArchitecture) {
 * 	PhysicalArchitecture.allocatingArchitectures(self, target);
 * }
 * </pre></code>
 * 
 * @see PhysicalArchitecture__allocatingEpbsArchitecturesMatch
 * @see PhysicalArchitecture__allocatingEpbsArchitecturesProcessor
 * @see PhysicalArchitecture__allocatingEpbsArchitecturesQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class PhysicalArchitecture__allocatingEpbsArchitecturesMatcher extends BaseMatcher<PhysicalArchitecture__allocatingEpbsArchitecturesMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static PhysicalArchitecture__allocatingEpbsArchitecturesMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    PhysicalArchitecture__allocatingEpbsArchitecturesMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
        matcher = (PhysicalArchitecture__allocatingEpbsArchitecturesMatcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static PhysicalArchitecture__allocatingEpbsArchitecturesMatcher create() throws ViatraQueryException {
    return new PhysicalArchitecture__allocatingEpbsArchitecturesMatcher();
  }
  
  private final static int POSITION_SELF = 0;
  
  private final static int POSITION_TARGET = 1;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(PhysicalArchitecture__allocatingEpbsArchitecturesMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private PhysicalArchitecture__allocatingEpbsArchitecturesMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSelf the fixed value of pattern parameter self, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @return matches represented as a PhysicalArchitecture__allocatingEpbsArchitecturesMatch object.
   * 
   */
  public Collection<PhysicalArchitecture__allocatingEpbsArchitecturesMatch> getAllMatches(final PhysicalArchitecture pSelf, final EPBSArchitecture pTarget) {
    return rawGetAllMatches(new Object[]{pSelf, pTarget});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSelf the fixed value of pattern parameter self, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @return a match represented as a PhysicalArchitecture__allocatingEpbsArchitecturesMatch object, or null if no match is found.
   * 
   */
  public PhysicalArchitecture__allocatingEpbsArchitecturesMatch getOneArbitraryMatch(final PhysicalArchitecture pSelf, final EPBSArchitecture pTarget) {
    return rawGetOneArbitraryMatch(new Object[]{pSelf, pTarget});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pSelf the fixed value of pattern parameter self, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final PhysicalArchitecture pSelf, final EPBSArchitecture pTarget) {
    return rawHasMatch(new Object[]{pSelf, pTarget});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSelf the fixed value of pattern parameter self, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final PhysicalArchitecture pSelf, final EPBSArchitecture pTarget) {
    return rawCountMatches(new Object[]{pSelf, pTarget});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pSelf the fixed value of pattern parameter self, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final PhysicalArchitecture pSelf, final EPBSArchitecture pTarget, final IMatchProcessor<? super PhysicalArchitecture__allocatingEpbsArchitecturesMatch> processor) {
    rawForEachMatch(new Object[]{pSelf, pTarget}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSelf the fixed value of pattern parameter self, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final PhysicalArchitecture pSelf, final EPBSArchitecture pTarget, final IMatchProcessor<? super PhysicalArchitecture__allocatingEpbsArchitecturesMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pSelf, pTarget}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pSelf the fixed value of pattern parameter self, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public PhysicalArchitecture__allocatingEpbsArchitecturesMatch newMatch(final PhysicalArchitecture pSelf, final EPBSArchitecture pTarget) {
    return PhysicalArchitecture__allocatingEpbsArchitecturesMatch.newMatch(pSelf, pTarget);
  }
  
  /**
   * Retrieve the set of values that occur in matches for self.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<PhysicalArchitecture> rawAccumulateAllValuesOfself(final Object[] parameters) {
    Set<PhysicalArchitecture> results = new HashSet<PhysicalArchitecture>();
    rawAccumulateAllValues(POSITION_SELF, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for self.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<PhysicalArchitecture> getAllValuesOfself() {
    return rawAccumulateAllValuesOfself(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for self.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<PhysicalArchitecture> getAllValuesOfself(final PhysicalArchitecture__allocatingEpbsArchitecturesMatch partialMatch) {
    return rawAccumulateAllValuesOfself(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for self.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<PhysicalArchitecture> getAllValuesOfself(final EPBSArchitecture pTarget) {
    return rawAccumulateAllValuesOfself(new Object[]{
    null, 
    pTarget
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for target.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<EPBSArchitecture> rawAccumulateAllValuesOftarget(final Object[] parameters) {
    Set<EPBSArchitecture> results = new HashSet<EPBSArchitecture>();
    rawAccumulateAllValues(POSITION_TARGET, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for target.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<EPBSArchitecture> getAllValuesOftarget() {
    return rawAccumulateAllValuesOftarget(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for target.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<EPBSArchitecture> getAllValuesOftarget(final PhysicalArchitecture__allocatingEpbsArchitecturesMatch partialMatch) {
    return rawAccumulateAllValuesOftarget(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for target.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<EPBSArchitecture> getAllValuesOftarget(final PhysicalArchitecture pSelf) {
    return rawAccumulateAllValuesOftarget(new Object[]{
    pSelf, 
    null
    });
  }
  
  @Override
  protected PhysicalArchitecture__allocatingEpbsArchitecturesMatch tupleToMatch(final Tuple t) {
    try {
        return PhysicalArchitecture__allocatingEpbsArchitecturesMatch.newMatch((PhysicalArchitecture) t.get(POSITION_SELF), (EPBSArchitecture) t.get(POSITION_TARGET));
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in tuple not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected PhysicalArchitecture__allocatingEpbsArchitecturesMatch arrayToMatch(final Object[] match) {
    try {
        return PhysicalArchitecture__allocatingEpbsArchitecturesMatch.newMatch((PhysicalArchitecture) match[POSITION_SELF], (EPBSArchitecture) match[POSITION_TARGET]);
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in array not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected PhysicalArchitecture__allocatingEpbsArchitecturesMatch arrayToMatchMutable(final Object[] match) {
    try {
        return PhysicalArchitecture__allocatingEpbsArchitecturesMatch.newMutableMatch((PhysicalArchitecture) match[POSITION_SELF], (EPBSArchitecture) match[POSITION_TARGET]);
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in array not properly typed!",e);
        return null;
    }
  }
  
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<PhysicalArchitecture__allocatingEpbsArchitecturesMatcher> querySpecification() throws ViatraQueryException {
    return PhysicalArchitecture__allocatingEpbsArchitecturesQuerySpecification.instance();
  }
}
