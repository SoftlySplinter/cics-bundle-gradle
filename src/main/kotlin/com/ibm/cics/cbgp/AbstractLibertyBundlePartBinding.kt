/*
 * #%L
 * CICS Bundle Gradle Plugin
 * %%
 * Copyright (C) 2019, 2023 IBM Corp.
 * %%
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 * #L%
 */
package com.ibm.cics.cbgp

import org.gradle.api.GradleException
import java.io.File

abstract class AbstractLibertyBundlePartBinding() : AbstractJavaBundlePartBinding() {
	/** Binds to the addCICSAllAuth bundle attribute. */
	var addCICSAllAuthenticatedRole: Boolean = true

	/** Binds to the appConfigFile bundle attribute. */
	var libertyAppConfigFile: File? = null
}
