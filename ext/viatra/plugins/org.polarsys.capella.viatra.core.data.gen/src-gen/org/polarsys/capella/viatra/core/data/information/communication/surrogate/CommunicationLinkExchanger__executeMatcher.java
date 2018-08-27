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
package org.polarsys.capella.viatra.core.data.information.communication.surrogate;

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
import org.polarsys.capella.core.data.information.communication.CommunicationLink;
import org.polarsys.capella.core.data.information.communication.CommunicationLinkExchanger;
import org.polarsys.capella.viatra.core.data.information.communication.surrogate.CommunicationLinkExchanger__executeMatch;
import org.polarsys.capella.viatra.core.data.information.communication.surrogate.util.CommunicationLinkExchanger__executeQuerySpecification;

/**
 * Generated pattern matcher API of the org.polarsys.capella.viatra.core.data.information.communication.surrogate.CommunicationLinkExchanger__execute pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link CommunicationLinkExchanger__executeMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * {@literal @}Surrogate(feature="execute")
 * pattern CommunicationLinkExchanger__execute(self : CommunicationLinkExchanger, target : CommunicationLink) {
 * 	CommunicationLinkExchanger.ownedCommunicationLinks(self, target);
 * CommunicationLink.kind(target, ::EXECUTE);
 * }
 * </pre></code>
 * 
 * @see CommunicationLinkExchanger__executeMatch
 * @see CommunicationLinkExchanger__executeProcessor
 * @see CommunicationLinkExchanger__executeQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class CommunicationLinkExchanger__executeMatcher extends BaseMatcher<CommunicationLinkExchanger__executeMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static CommunicationLinkExchanger__executeMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    CommunicationLinkExchanger__executeMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
        matcher = (CommunicationLinkExchanger__executeMatcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static CommunicationLinkExchanger__executeMatcher create() throws ViatraQueryException {
    return new CommunicationLinkExchanger__executeMatcher();
  }
  
  private final static int POSITION_SELF = 0;
  
  private final static int POSITION_TARGET = 1;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(CommunicationLinkExchanger__executeMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private CommunicationLinkExchanger__executeMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSelf the fixed value of pattern parameter self, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @return matches represented as a CommunicationLinkExchanger__executeMatch object.
   * 
   */
  public Collection<CommunicationLinkExchanger__executeMatch> getAllMatches(final CommunicationLinkExchanger pSelf, final CommunicationLink pTarget) {
    return rawGetAllMatches(new Object[]{pSelf, pTarget});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSelf the fixed value of pattern parameter self, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @return a match represented as a CommunicationLinkExchanger__executeMatch object, or null if no match is found.
   * 
   */
  public CommunicationLinkExchanger__executeMatch getOneArbitraryMatch(final CommunicationLinkExchanger pSelf, final CommunicationLink pTarget) {
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
  public boolean hasMatch(final CommunicationLinkExchanger pSelf, final CommunicationLink pTarget) {
    return rawHasMatch(new Object[]{pSelf, pTarget});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSelf the fixed value of pattern parameter self, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final CommunicationLinkExchanger pSelf, final CommunicationLink pTarget) {
    return rawCountMatches(new Object[]{pSelf, pTarget});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pSelf the fixed value of pattern parameter self, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final CommunicationLinkExchanger pSelf, final CommunicationLink pTarget, final IMatchProcessor<? super CommunicationLinkExchanger__executeMatch> processor) {
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
  public boolean forOneArbitraryMatch(final CommunicationLinkExchanger pSelf, final CommunicationLink pTarget, final IMatchProcessor<? super CommunicationLinkExchanger__executeMatch> processor) {
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
  public CommunicationLinkExchanger__executeMatch newMatch(final CommunicationLinkExchanger pSelf, final CommunicationLink pTarget) {
    return CommunicationLinkExchanger__executeMatch.newMatch(pSelf, pTarget);
  }
  
  /**
   * Retrieve the set of values that occur in matches for self.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<CommunicationLinkExchanger> rawAccumulateAllValuesOfself(final Object[] parameters) {
    Set<CommunicationLinkExchanger> results = new HashSet<CommunicationLinkExchanger>();
    rawAccumulateAllValues(POSITION_SELF, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for self.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<CommunicationLinkExchanger> getAllValuesOfself() {
    return rawAccumulateAllValuesOfself(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for self.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<CommunicationLinkExchanger> getAllValuesOfself(final CommunicationLinkExchanger__executeMatch partialMatch) {
    return rawAccumulateAllValuesOfself(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for self.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<CommunicationLinkExchanger> getAllValuesOfself(final CommunicationLink pTarget) {
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
  protected Set<CommunicationLink> rawAccumulateAllValuesOftarget(final Object[] parameters) {
    Set<CommunicationLink> results = new HashSet<CommunicationLink>();
    rawAccumulateAllValues(POSITION_TARGET, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for target.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<CommunicationLink> getAllValuesOftarget() {
    return rawAccumulateAllValuesOftarget(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for target.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<CommunicationLink> getAllValuesOftarget(final CommunicationLinkExchanger__executeMatch partialMatch) {
    return rawAccumulateAllValuesOftarget(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for target.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<CommunicationLink> getAllValuesOftarget(final CommunicationLinkExchanger pSelf) {
    return rawAccumulateAllValuesOftarget(new Object[]{
    pSelf, 
    null
    });
  }
  
  @Override
  protected CommunicationLinkExchanger__executeMatch tupleToMatch(final Tuple t) {
    try {
        return CommunicationLinkExchanger__executeMatch.newMatch((CommunicationLinkExchanger) t.get(POSITION_SELF), (CommunicationLink) t.get(POSITION_TARGET));
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in tuple not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected CommunicationLinkExchanger__executeMatch arrayToMatch(final Object[] match) {
    try {
        return CommunicationLinkExchanger__executeMatch.newMatch((CommunicationLinkExchanger) match[POSITION_SELF], (CommunicationLink) match[POSITION_TARGET]);
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in array not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected CommunicationLinkExchanger__executeMatch arrayToMatchMutable(final Object[] match) {
    try {
        return CommunicationLinkExchanger__executeMatch.newMutableMatch((CommunicationLinkExchanger) match[POSITION_SELF], (CommunicationLink) match[POSITION_TARGET]);
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
  public static IQuerySpecification<CommunicationLinkExchanger__executeMatcher> querySpecification() throws ViatraQueryException {
    return CommunicationLinkExchanger__executeQuerySpecification.instance();
  }
}
