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

package org.jetbrains.jet.codegen.generated;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestSuite;

import java.io.File;
import java.util.regex.Pattern;
import org.jetbrains.jet.JetTestUtils;
import org.jetbrains.jet.test.InnerTestClasses;
import org.jetbrains.jet.test.TestMetadata;

import org.jetbrains.jet.codegen.generated.AbstractBlackBoxCodegenTest;

/** This class is generated by {@link org.jetbrains.jet.generators.tests.GenerateTests}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/codegen/boxWithJava")
@InnerTestClasses({BlackBoxWithJavaCodegenTestGenerated.Enum.class, BlackBoxWithJavaCodegenTestGenerated.Functions.class, BlackBoxWithJavaCodegenTestGenerated.ProtectedStatic.class, BlackBoxWithJavaCodegenTestGenerated.StaticFun.class})
public class BlackBoxWithJavaCodegenTestGenerated extends AbstractBlackBoxCodegenTest {
    public void testAllFilesPresentInBoxWithJava() throws Exception {
        JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("compiler/testData/codegen/boxWithJava"), Pattern.compile("^(.+)\\.kt$"), true);
    }
    
    @TestMetadata("compiler/testData/codegen/boxWithJava/enum")
    public static class Enum extends AbstractBlackBoxCodegenTest {
        public void testAllFilesPresentInEnum() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("compiler/testData/codegen/boxWithJava/enum"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("simpleJavaEnum.kt")
        public void testSimpleJavaEnum() throws Exception {
            blackBoxFileWithJavaByFullPath("compiler/testData/codegen/boxWithJava/enum/simpleJavaEnum.kt");
        }
        
        @TestMetadata("simpleJavaEnumWithFunction.kt")
        public void testSimpleJavaEnumWithFunction() throws Exception {
            blackBoxFileWithJavaByFullPath("compiler/testData/codegen/boxWithJava/enum/simpleJavaEnumWithFunction.kt");
        }
        
        @TestMetadata("simpleJavaEnumWithStaticImport.kt")
        public void testSimpleJavaEnumWithStaticImport() throws Exception {
            blackBoxFileWithJavaByFullPath("compiler/testData/codegen/boxWithJava/enum/simpleJavaEnumWithStaticImport.kt");
        }
        
        @TestMetadata("simpleJavaInnerEnum.kt")
        public void testSimpleJavaInnerEnum() throws Exception {
            blackBoxFileWithJavaByFullPath("compiler/testData/codegen/boxWithJava/enum/simpleJavaInnerEnum.kt");
        }
        
    }
    
    @TestMetadata("compiler/testData/codegen/boxWithJava/functions")
    public static class Functions extends AbstractBlackBoxCodegenTest {
        public void testAllFilesPresentInFunctions() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("compiler/testData/codegen/boxWithJava/functions"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("referencesStaticInnerClassMethod.kt")
        public void testReferencesStaticInnerClassMethod() throws Exception {
            blackBoxFileWithJavaByFullPath("compiler/testData/codegen/boxWithJava/functions/referencesStaticInnerClassMethod.kt");
        }
        
        @TestMetadata("referencesStaticInnerClassMethodL2.kt")
        public void testReferencesStaticInnerClassMethodL2() throws Exception {
            blackBoxFileWithJavaByFullPath("compiler/testData/codegen/boxWithJava/functions/referencesStaticInnerClassMethodL2.kt");
        }
        
        @TestMetadata("removeInIterator.kt")
        public void testRemoveInIterator() throws Exception {
            blackBoxFileWithJavaByFullPath("compiler/testData/codegen/boxWithJava/functions/removeInIterator.kt");
        }
        
    }
    
    @TestMetadata("compiler/testData/codegen/boxWithJava/protectedStatic")
    public static class ProtectedStatic extends AbstractBlackBoxCodegenTest {
        public void testAllFilesPresentInProtectedStatic() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("compiler/testData/codegen/boxWithJava/protectedStatic"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("funCallInConstructor.kt")
        public void testFunCallInConstructor() throws Exception {
            blackBoxFileWithJavaByFullPath("compiler/testData/codegen/boxWithJava/protectedStatic/funCallInConstructor.kt");
        }
        
        @TestMetadata("funClassObject.kt")
        public void testFunClassObject() throws Exception {
            blackBoxFileWithJavaByFullPath("compiler/testData/codegen/boxWithJava/protectedStatic/funClassObject.kt");
        }
        
        @TestMetadata("funGenericClass.kt")
        public void testFunGenericClass() throws Exception {
            blackBoxFileWithJavaByFullPath("compiler/testData/codegen/boxWithJava/protectedStatic/funGenericClass.kt");
        }
        
        @TestMetadata("funNestedStaticClass.kt")
        public void testFunNestedStaticClass() throws Exception {
            blackBoxFileWithJavaByFullPath("compiler/testData/codegen/boxWithJava/protectedStatic/funNestedStaticClass.kt");
        }
        
        @TestMetadata("funNestedStaticClass2.kt")
        public void testFunNestedStaticClass2() throws Exception {
            blackBoxFileWithJavaByFullPath("compiler/testData/codegen/boxWithJava/protectedStatic/funNestedStaticClass2.kt");
        }
        
        @TestMetadata("funNestedStaticGenericClass.kt")
        public void testFunNestedStaticGenericClass() throws Exception {
            blackBoxFileWithJavaByFullPath("compiler/testData/codegen/boxWithJava/protectedStatic/funNestedStaticGenericClass.kt");
        }
        
        @TestMetadata("funNotDirectSuperClass.kt")
        public void testFunNotDirectSuperClass() throws Exception {
            blackBoxFileWithJavaByFullPath("compiler/testData/codegen/boxWithJava/protectedStatic/funNotDirectSuperClass.kt");
        }
        
        @TestMetadata("funObject.kt")
        public void testFunObject() throws Exception {
            blackBoxFileWithJavaByFullPath("compiler/testData/codegen/boxWithJava/protectedStatic/funObject.kt");
        }
        
        @TestMetadata("simpleClass.kt")
        public void testSimpleClass() throws Exception {
            blackBoxFileWithJavaByFullPath("compiler/testData/codegen/boxWithJava/protectedStatic/simpleClass.kt");
        }
        
        @TestMetadata("simpleClass2.kt")
        public void testSimpleClass2() throws Exception {
            blackBoxFileWithJavaByFullPath("compiler/testData/codegen/boxWithJava/protectedStatic/simpleClass2.kt");
        }
        
        @TestMetadata("simpleFun.kt")
        public void testSimpleFun() throws Exception {
            blackBoxFileWithJavaByFullPath("compiler/testData/codegen/boxWithJava/protectedStatic/simpleFun.kt");
        }
        
        @TestMetadata("simpleProperty.kt")
        public void testSimpleProperty() throws Exception {
            blackBoxFileWithJavaByFullPath("compiler/testData/codegen/boxWithJava/protectedStatic/simpleProperty.kt");
        }
        
    }
    
    @TestMetadata("compiler/testData/codegen/boxWithJava/staticFun")
    public static class StaticFun extends AbstractBlackBoxCodegenTest {
        public void testAllFilesPresentInStaticFun() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("compiler/testData/codegen/boxWithJava/staticFun"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("classWithNestedEnum.kt")
        public void testClassWithNestedEnum() throws Exception {
            blackBoxFileWithJavaByFullPath("compiler/testData/codegen/boxWithJava/staticFun/classWithNestedEnum.kt");
        }
        
    }
    
    public static Test suite() {
        TestSuite suite = new TestSuite("BlackBoxWithJavaCodegenTestGenerated");
        suite.addTestSuite(BlackBoxWithJavaCodegenTestGenerated.class);
        suite.addTestSuite(Enum.class);
        suite.addTestSuite(Functions.class);
        suite.addTestSuite(ProtectedStatic.class);
        suite.addTestSuite(StaticFun.class);
        return suite;
    }
}
