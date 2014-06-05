/*******************************************************************************
 * Copyright (c) 2014 Lars Pfannenschmidt and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Lars Pfannenschmidt - initial API and implementation, ongoing development and documentation
 *******************************************************************************/

package com.swookiee.runtime.metrics;

import org.osgi.service.component.annotations.Component;

import com.codahale.metrics.MetricRegistry;

@Component(service = {MetricRegistry.class, SwookieeMetricRegistry.class}, property = {"metricPrefix=swookiee"})
public class SwookieeMetricRegistry extends MetricRegistry {

}
