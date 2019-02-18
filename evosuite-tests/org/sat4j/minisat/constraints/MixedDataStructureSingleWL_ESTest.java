/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 18 01:37:45 GMT 2019
 */

package org.sat4j.minisat.constraints;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.sat4j.core.ReadOnlyVecInt;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.constraints.MixedDataStructureDanielWL;
import org.sat4j.minisat.constraints.MixedDataStructureSingleWL;
import org.sat4j.minisat.core.ILits;
import org.sat4j.minisat.core.Solver;
import org.sat4j.minisat.learning.MiniSATLearning;
import org.sat4j.minisat.orders.LevelBasedVarOrderHeap;
import org.sat4j.minisat.orders.PositiveLiteralSelectionStrategy;
import org.sat4j.minisat.restarts.NoRestarts;
import org.sat4j.specs.Constr;
import org.sat4j.specs.IVecInt;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MixedDataStructureSingleWL_ESTest extends MixedDataStructureSingleWL_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      VecInt vecInt0 = new VecInt();
      Constr constr0 = mixedDataStructureSingleWL0.createUnregisteredCardinalityConstraint(vecInt0, 2);
      assertEquals(2, constr0.requiredNumberOfSatisfiedLiterals());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      ILits iLits0 = mixedDataStructureSingleWL0.createLits();
      assertEquals(0, iLits0.realnVars());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      IVecInt iVecInt0 = VecInt.EMPTY;
      ReadOnlyVecInt readOnlyVecInt0 = new ReadOnlyVecInt(iVecInt0);
      // Undeclared exception!
      try { 
        mixedDataStructureSingleWL0.createUnregisteredClause(readOnlyVecInt0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.core.ReadOnlyVecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      // Undeclared exception!
      try { 
        mixedDataStructureSingleWL0.createUnregisteredClause((IVecInt) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.WLClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      VecInt vecInt0 = new VecInt();
      IVecInt iVecInt0 = vecInt0.pop();
      // Undeclared exception!
      try { 
        mixedDataStructureSingleWL0.createUnregisteredClause(iVecInt0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.WLClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int[] intArray0 = new int[4];
      VecInt vecInt0 = new VecInt(intArray0);
      vecInt0.shrinkTo(112);
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      // Undeclared exception!
      try { 
        mixedDataStructureSingleWL0.createUnregisteredClause(vecInt0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      VecInt vecInt0 = new VecInt(1000);
      ReadOnlyVecInt readOnlyVecInt0 = new ReadOnlyVecInt(vecInt0);
      // Undeclared exception!
      try { 
        mixedDataStructureSingleWL0.createUnregisteredCardinalityConstraint(readOnlyVecInt0, 3521);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.core.ReadOnlyVecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      VecInt vecInt0 = new VecInt();
      IVecInt iVecInt0 = vecInt0.pop();
      // Undeclared exception!
      try { 
        mixedDataStructureSingleWL0.createUnregisteredCardinalityConstraint(iVecInt0, (-486));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.card.AtLeast", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      // Undeclared exception!
      try { 
        mixedDataStructureSingleWL0.createUnregisteredCardinalityConstraint((IVecInt) null, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cards with degree 1 are clauses!!!!
         //
         verifyException("org.sat4j.minisat.constraints.card.AtLeast", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int[] intArray0 = new int[4];
      VecInt vecInt0 = new VecInt(intArray0);
      vecInt0.shrinkTo(112);
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      // Undeclared exception!
      try { 
        mixedDataStructureSingleWL0.createUnregisteredCardinalityConstraint(vecInt0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      VecInt vecInt0 = new VecInt();
      try { 
        mixedDataStructureSingleWL0.createClause(vecInt0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Creating Empty clause ?
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Clauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      VecInt vecInt0 = new VecInt(4251, 2);
      // Undeclared exception!
      mixedDataStructureSingleWL0.createClause(vecInt0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      VecInt vecInt0 = new VecInt();
      ReadOnlyVecInt readOnlyVecInt0 = new ReadOnlyVecInt(vecInt0);
      // Undeclared exception!
      try { 
        mixedDataStructureSingleWL0.createClause(readOnlyVecInt0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.core.ReadOnlyVecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      int[] intArray0 = new int[2];
      intArray0[1] = (-19);
      VecInt vecInt0 = new VecInt(intArray0);
      // Undeclared exception!
      try { 
        mixedDataStructureSingleWL0.createClause(vecInt0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      VecInt vecInt0 = new VecInt();
      try { 
        mixedDataStructureSingleWL0.createCardinalityConstraint(vecInt0, 3021);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.card.AtLeast", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      VecInt vecInt0 = new VecInt(3327, 1);
      // Undeclared exception!
      mixedDataStructureSingleWL0.createCardinalityConstraint(vecInt0, 3327);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      VecInt vecInt0 = new VecInt(1);
      ReadOnlyVecInt readOnlyVecInt0 = new ReadOnlyVecInt(vecInt0);
      // Undeclared exception!
      try { 
        mixedDataStructureSingleWL0.createCardinalityConstraint(readOnlyVecInt0, (-980));
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.core.ReadOnlyVecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      // Undeclared exception!
      try { 
        mixedDataStructureSingleWL0.createCardinalityConstraint((IVecInt) null, 1079);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.card.AtLeast", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      VecInt vecInt0 = new VecInt(2306, 2306);
      // Undeclared exception!
      try { 
        mixedDataStructureSingleWL0.createCardinalityConstraint(vecInt0, 2306);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[3] = 2;
      intArray0[1] = 14;
      VecInt vecInt0 = new VecInt(intArray0);
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      // Undeclared exception!
      try { 
        mixedDataStructureSingleWL0.createClause(vecInt0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Lits", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      int[] intArray0 = new int[20];
      intArray0[1] = 2;
      VecInt vecInt0 = new VecInt(intArray0);
      // Undeclared exception!
      try { 
        mixedDataStructureSingleWL0.createClause(vecInt0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Lits", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      int[] intArray0 = new int[2];
      intArray0[0] = 1;
      VecInt vecInt0 = new VecInt(intArray0);
      Constr constr0 = mixedDataStructureSingleWL0.createClause(vecInt0);
      assertNull(constr0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      int[] intArray0 = new int[20];
      MiniSATLearning<MixedDataStructureDanielWL> miniSATLearning0 = new MiniSATLearning<MixedDataStructureDanielWL>();
      MixedDataStructureDanielWL mixedDataStructureDanielWL0 = new MixedDataStructureDanielWL();
      PositiveLiteralSelectionStrategy positiveLiteralSelectionStrategy0 = new PositiveLiteralSelectionStrategy();
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap(positiveLiteralSelectionStrategy0);
      NoRestarts noRestarts0 = new NoRestarts();
      Solver<MixedDataStructureDanielWL> solver0 = new Solver<MixedDataStructureDanielWL>(miniSATLearning0, mixedDataStructureDanielWL0, levelBasedVarOrderHeap0, noRestarts0);
      mixedDataStructureSingleWL0.setUnitPropagationListener(solver0);
      VecInt vecInt0 = new VecInt(intArray0);
      Constr constr0 = mixedDataStructureSingleWL0.createClause(vecInt0);
      assertTrue(constr0.isSatisfied());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      VecInt vecInt0 = new VecInt();
      Constr constr0 = mixedDataStructureSingleWL0.createUnregisteredClause(vecInt0);
      assertEquals(0, constr0.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      // Undeclared exception!
      try { 
        mixedDataStructureSingleWL0.createUnregisteredCardinalityConstraint((IVecInt) null, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.card.AtLeast", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      IVecInt iVecInt0 = VecInt.EMPTY;
      Constr constr0 = mixedDataStructureSingleWL0.createCardinalityConstraint(iVecInt0, 0);
      assertFalse(constr0.simplify());
  }
}
