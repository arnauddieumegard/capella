/*******************************************************************************
 * Copyright (c) 2019 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.test.diagram.filters.ju.ldfb;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import org.eclipse.sirius.diagram.DDiagramElement;
import org.polarsys.capella.core.sirius.analysis.constants.IFilterNameConstants;
import org.polarsys.capella.test.diagram.filters.ju.DiagramFilterUtils;

public class CollapsePortsForLDFB extends FiltersForLDFB {

  @Override
  protected String getFilterName() {
    return IFilterNameConstants.FILTER_LDFB_COLLAPSE_PORTS;
  }

  @Override
  protected List<String> getFilteredObjetIDs() {
    return Arrays.asList(FUNCTION_OUTPUT_PORT_1_ID, FUNCTION_OUTPUT_PORT_2_ID, FUNCTION_OUTPUT_PORT_3_ID,
        FUNCTION_INPUT_PORT_1_ID, FUNCTION_INPUT_PORT_2_ID, FUNCTION_INPUT_PORT_3_ID,
        FUNCTION_PORT_WITHOUT_EXCHANGES_ID, EXCHANGE_CATEGORY_ID);
  }

  @Override
  protected Predicate<DDiagramElement> getElementsToNotFilterExtraConditionPredicate() {
    return DiagramFilterUtils.FUNCTIONAL_EXCHANGE_EDGE_DECORATOR_PREDICATE;
  }

}
