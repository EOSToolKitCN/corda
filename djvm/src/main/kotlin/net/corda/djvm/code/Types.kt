@file:JvmName("Types")
package net.corda.djvm.code

import org.objectweb.asm.Type
import sandbox.net.corda.djvm.costing.ThresholdViolationException
import sandbox.net.corda.djvm.rules.RuleViolationException

val ruleViolationException: String = Type.getInternalName(RuleViolationException::class.java)
val thresholdViolationException: String = Type.getInternalName(ThresholdViolationException::class.java)

/**
 * Local extension method for normalizing a class name.
 */
val String.asPackagePath: String get() = this.replace('/', '.')
val String.asResourcePath: String get() = this.replace('.', '/')