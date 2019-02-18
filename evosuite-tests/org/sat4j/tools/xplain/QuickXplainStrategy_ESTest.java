/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 18 01:29:16 GMT 2019
 */

package org.sat4j.tools.xplain;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.sat4j.LightFactory;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.constraints.ClausalDataStructureWL;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.tools.AbstractMinimalModel;
import org.sat4j.tools.DimacsStringSolver;
import org.sat4j.tools.ManyCore;
import org.sat4j.tools.xplain.QuickXplainStrategy;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class QuickXplainStrategy_ESTest extends QuickXplainStrategy_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      QuickXplainStrategy quickXplainStrategy0 = new QuickXplainStrategy();
      LightFactory lightFactory0 = LightFactory.instance();
      ISolver iSolver0 = lightFactory0.lightSolver();
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      IVecInt iVecInt0 = AbstractMinimalModel.positiveLiterals(iSolver0);
      // Undeclared exception!
      try { 
        quickXplainStrategy0.explain(iSolver0, hashMap0, iVecInt0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.xplain.QuickXplainStrategy", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      QuickXplainStrategy quickXplainStrategy0 = new QuickXplainStrategy();
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      VecInt vecInt0 = new VecInt();
      HashMap<Integer, ClausalDataStructureWL> hashMap0 = new HashMap<Integer, ClausalDataStructureWL>();
      // Undeclared exception!
      try { 
        quickXplainStrategy0.explain(dimacsStringSolver0, hashMap0, vecInt0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.AbstractOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      QuickXplainStrategy quickXplainStrategy0 = new QuickXplainStrategy();
      VecInt vecInt0 = new VecInt();
      vecInt0.pop();
      HashMap<Integer, ClausalDataStructureWL> hashMap0 = new HashMap<Integer, ClausalDataStructureWL>();
      // Undeclared exception!
      try { 
        quickXplainStrategy0.explain((ISolver) null, hashMap0, vecInt0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.core.VecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      QuickXplainStrategy quickXplainStrategy0 = new QuickXplainStrategy();
      VecInt vecInt0 = new VecInt();
      DimacsStringSolver[] dimacsStringSolverArray0 = new DimacsStringSolver[0];
      ManyCore<DimacsStringSolver> manyCore0 = new ManyCore<DimacsStringSolver>(dimacsStringSolverArray0);
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      // Undeclared exception!
      try { 
        quickXplainStrategy0.explain(manyCore0, hashMap0, vecInt0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      QuickXplainStrategy quickXplainStrategy0 = new QuickXplainStrategy();
      VecInt vecInt0 = new VecInt();
      vecInt0.shrink((-1431));
      HashMap<Integer, ClausalDataStructureWL> hashMap0 = new HashMap<Integer, ClausalDataStructureWL>();
      // Undeclared exception!
      try { 
        quickXplainStrategy0.explain((ISolver) null, hashMap0, vecInt0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      QuickXplainStrategy quickXplainStrategy0 = new QuickXplainStrategy();
      String string0 = quickXplainStrategy0.toString();
      assertEquals("QuickXplain (AAAI 2004 version) minimization strategy", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      QuickXplainStrategy quickXplainStrategy0 = new QuickXplainStrategy();
      quickXplainStrategy0.cancelExplanationComputation();
      assertEquals("QuickXplain (AAAI 2004 version) minimization strategy", quickXplainStrategy0.toString());
  }
}
