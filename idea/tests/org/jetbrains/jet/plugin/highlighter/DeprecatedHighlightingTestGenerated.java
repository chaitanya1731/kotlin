/*
 * Copyright 2010-2013 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.jet.plugin.highlighter;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestSuite;

import java.io.File;
import java.util.regex.Pattern;
import org.jetbrains.jet.JetTestUtils;
import org.jetbrains.jet.test.InnerTestClasses;
import org.jetbrains.jet.test.TestMetadata;

import org.jetbrains.jet.plugin.highlighter.AbstractDeprecatedHighlightingTest;

/** This class is generated by {@link org.jetbrains.jet.generators.tests.GenerateTests}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/testData/highlighter/deprecated")
public class DeprecatedHighlightingTestGenerated extends AbstractDeprecatedHighlightingTest {
    public void testAllFilesPresentInDeprecated() throws Exception {
        JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("idea/testData/highlighter/deprecated"), Pattern.compile("^(.+)\\.kt$"), true);
    }
    
    @TestMetadata("Class.kt")
    public void testClass() throws Exception {
        doTest("idea/testData/highlighter/deprecated/Class.kt");
    }
    
    @TestMetadata("ClassObject.kt")
    public void testClassObject() throws Exception {
        doTest("idea/testData/highlighter/deprecated/ClassObject.kt");
    }
    
    @TestMetadata("Function.kt")
    public void testFunction() throws Exception {
        doTest("idea/testData/highlighter/deprecated/Function.kt");
    }
    
    @TestMetadata("Get.kt")
    public void testGet() throws Exception {
        doTest("idea/testData/highlighter/deprecated/Get.kt");
    }
    
    @TestMetadata("Getter.kt")
    public void testGetter() throws Exception {
        doTest("idea/testData/highlighter/deprecated/Getter.kt");
    }
    
    @TestMetadata("Inc.kt")
    public void testInc() throws Exception {
        doTest("idea/testData/highlighter/deprecated/Inc.kt");
    }
    
    @TestMetadata("Invoke.kt")
    public void testInvoke() throws Exception {
        doTest("idea/testData/highlighter/deprecated/Invoke.kt");
    }
    
    @TestMetadata("Operation.kt")
    public void testOperation() throws Exception {
        doTest("idea/testData/highlighter/deprecated/Operation.kt");
    }
    
    @TestMetadata("Property.kt")
    public void testProperty() throws Exception {
        doTest("idea/testData/highlighter/deprecated/Property.kt");
    }
    
    @TestMetadata("RangeTo.kt")
    public void testRangeTo() throws Exception {
        doTest("idea/testData/highlighter/deprecated/RangeTo.kt");
    }
    
    @TestMetadata("Setter.kt")
    public void testSetter() throws Exception {
        doTest("idea/testData/highlighter/deprecated/Setter.kt");
    }
    
    @TestMetadata("SuperCall.kt")
    public void testSuperCall() throws Exception {
        doTest("idea/testData/highlighter/deprecated/SuperCall.kt");
    }
    
    @TestMetadata("Trait.kt")
    public void testTrait() throws Exception {
        doTest("idea/testData/highlighter/deprecated/Trait.kt");
    }
    
}
