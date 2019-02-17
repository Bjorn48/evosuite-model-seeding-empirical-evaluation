/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 17 12:31:06 GMT 2019
 */

package org.sat4j.minisat.orders;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.PrintWriter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.junit.runner.RunWith;
import org.sat4j.minisat.constraints.CardinalityDataStructure;
import org.sat4j.minisat.constraints.cnf.Lits;
import org.sat4j.minisat.core.Heap;
import org.sat4j.minisat.core.ILits;
import org.sat4j.minisat.core.IPhaseSelectionStrategy;
import org.sat4j.minisat.orders.LevelBasedVarOrderHeap;
import org.sat4j.minisat.orders.PhaseInLastLearnedClauseSelectionStrategy;
import org.sat4j.minisat.orders.PureOrder;
import org.sat4j.minisat.orders.RSATLastLearnedClausesPhaseSelectionStrategy;
import org.sat4j.minisat.orders.RSATPhaseSelectionStrategy;
import org.sat4j.minisat.orders.RandomWalkDecorator;
import org.sat4j.minisat.orders.SubsetVarOrder;
import org.sat4j.minisat.orders.VarOrderHeap;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class VarOrderHeap_ESTest extends VarOrderHeap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      Lits lits0 = new Lits();
      lits0.ensurePool(1624);
      levelBasedVarOrderHeap0.setLits(lits0);
      levelBasedVarOrderHeap0.init();
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      ILits iLits0 = cardinalityDataStructure0.getVocabulary();
      levelBasedVarOrderHeap0.setLits(iLits0);
      levelBasedVarOrderHeap0.init();
      assertEquals(0, levelBasedVarOrderHeap0.numberOfInterestingVariables());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      Lits lits0 = new Lits();
      lits0.ensurePool(37);
      levelBasedVarOrderHeap0.setLits(lits0);
      levelBasedVarOrderHeap0.init();
      levelBasedVarOrderHeap0.updateVar(37);
      int int0 = levelBasedVarOrderHeap0.numberOfInterestingVariables();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder();
      pureOrder0.setVarDecay((-204.625));
      pureOrder0.varDecayActivity();
      assertEquals(0, pureOrder0.numberOfInterestingVariables());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      File file0 = MockFile.createTempFile("{-6Sz[d[/0+Wwz<f", "{-6Sz[d[/0+Wwz<f");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(file0);
      levelBasedVarOrderHeap0.printStat(mockPrintWriter0, "q_1I{yq8R^3;'>*RC");
      assertEquals(0, levelBasedVarOrderHeap0.numberOfInterestingVariables());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      double double0 = varOrderHeap0.varActivity(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(levelBasedVarOrderHeap0, 455.038247384);
      Lits lits0 = new Lits();
      randomWalkDecorator0.setLits(lits0);
      levelBasedVarOrderHeap0.init();
      double double0 = levelBasedVarOrderHeap0.varActivity(0);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(varOrderHeap0, 5);
      Lits lits0 = new Lits();
      randomWalkDecorator0.setLits(lits0);
      ILits iLits0 = varOrderHeap0.getVocabulary();
      assertEquals(0, iLits0.nVars());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      Lits lits0 = new Lits();
      lits0.getFromPool(627);
      levelBasedVarOrderHeap0.setLits(lits0);
      ILits iLits0 = levelBasedVarOrderHeap0.getVocabulary();
      assertEquals(627, iLits0.nVars());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap((IPhaseSelectionStrategy) null);
      IPhaseSelectionStrategy iPhaseSelectionStrategy0 = varOrderHeap0.getPhaseSelectionStrategy();
      assertNull(iPhaseSelectionStrategy0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      levelBasedVarOrderHeap0.setPhaseSelectionStrategy((IPhaseSelectionStrategy) null);
      // Undeclared exception!
      try { 
        levelBasedVarOrderHeap0.updateVarAtDecisionLevel(100);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.VarOrderHeap", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int[] intArray0 = new int[2];
      SubsetVarOrder subsetVarOrder0 = new SubsetVarOrder(intArray0);
      // Undeclared exception!
      try { 
        subsetVarOrder0.updateVar(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.PhaseInLastLearnedClauseSelectionStrategy", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      // Undeclared exception!
      try { 
        levelBasedVarOrderHeap0.updateVar(7);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.sat4j.minisat.orders.VarOrderHeap", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      // Undeclared exception!
      try { 
        levelBasedVarOrderHeap0.updateActivity((-3446));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3446
         //
         verifyException("org.sat4j.minisat.orders.VarOrderHeap", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      // Undeclared exception!
      try { 
        varOrderHeap0.undo(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.VarOrderHeap", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      Lits lits0 = new Lits();
      levelBasedVarOrderHeap0.setLits(lits0);
      levelBasedVarOrderHeap0.init();
      // Undeclared exception!
      try { 
        levelBasedVarOrderHeap0.undo((-2841));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      // Undeclared exception!
      try { 
        levelBasedVarOrderHeap0.select();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.VarOrderHeap", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      varOrderHeap0.activity = null;
      // Undeclared exception!
      try { 
        varOrderHeap0.numberOfInterestingVariables();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      Lits lits0 = new Lits();
      lits0.getFromPool((-5368));
      levelBasedVarOrderHeap0.setLits(lits0);
      levelBasedVarOrderHeap0.init();
      // Undeclared exception!
      levelBasedVarOrderHeap0.init();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      // Undeclared exception!
      try { 
        levelBasedVarOrderHeap0.init();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      Lits lits0 = new Lits();
      int[] intArray0 = new int[1];
      intArray0[0] = 1150;
      levelBasedVarOrderHeap0.addLevel(intArray0);
      levelBasedVarOrderHeap0.setLits(lits0);
      // Undeclared exception!
      try { 
        levelBasedVarOrderHeap0.init();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RSATPhaseSelectionStrategy rSATPhaseSelectionStrategy0 = new RSATPhaseSelectionStrategy();
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap(rSATPhaseSelectionStrategy0);
      // Undeclared exception!
      try { 
        levelBasedVarOrderHeap0.assignLiteral(1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.RSATPhaseSelectionStrategy", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      int[] intArray0 = new int[2];
      SubsetVarOrder subsetVarOrder0 = new SubsetVarOrder(intArray0);
      RSATLastLearnedClausesPhaseSelectionStrategy rSATLastLearnedClausesPhaseSelectionStrategy0 = new RSATLastLearnedClausesPhaseSelectionStrategy();
      rSATLastLearnedClausesPhaseSelectionStrategy0.phase = intArray0;
      subsetVarOrder0.phaseStrategy = (IPhaseSelectionStrategy) rSATLastLearnedClausesPhaseSelectionStrategy0;
      // Undeclared exception!
      try { 
        subsetVarOrder0.assignLiteral(1331);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 665
         //
         verifyException("org.sat4j.minisat.orders.RSATLastLearnedClausesPhaseSelectionStrategy", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      Lits lits0 = new Lits();
      lits0.ensurePool(29);
      levelBasedVarOrderHeap0.setLits(lits0);
      levelBasedVarOrderHeap0.init();
      levelBasedVarOrderHeap0.updateVar(29);
      levelBasedVarOrderHeap0.updateVar(29);
      int int0 = levelBasedVarOrderHeap0.numberOfInterestingVariables();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      Lits lits0 = new Lits();
      lits0.getFromPool(627);
      levelBasedVarOrderHeap0.setLits(lits0);
      levelBasedVarOrderHeap0.init();
      levelBasedVarOrderHeap0.updateVar(1254);
      assertEquals(0, levelBasedVarOrderHeap0.numberOfInterestingVariables());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      Lits lits0 = new Lits();
      lits0.getFromPool(386);
      levelBasedVarOrderHeap0.setLits(lits0);
      levelBasedVarOrderHeap0.init();
      levelBasedVarOrderHeap0.updateVar(601);
      double double0 = levelBasedVarOrderHeap0.varActivity(601);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      Lits lits0 = new Lits();
      lits0.ensurePool(40);
      levelBasedVarOrderHeap0.setLits(lits0);
      levelBasedVarOrderHeap0.init();
      levelBasedVarOrderHeap0.undo(40);
      assertEquals(0, levelBasedVarOrderHeap0.numberOfInterestingVariables());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      Lits lits0 = new Lits();
      lits0.getFromPool(40);
      levelBasedVarOrderHeap0.setLits(lits0);
      levelBasedVarOrderHeap0.init();
      levelBasedVarOrderHeap0.undo(40);
      assertEquals(0, levelBasedVarOrderHeap0.numberOfInterestingVariables());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      Lits lits0 = new Lits();
      lits0.getFromPool(18);
      levelBasedVarOrderHeap0.setLits(lits0);
      levelBasedVarOrderHeap0.init();
      levelBasedVarOrderHeap0.updateActivity(18);
      int int0 = levelBasedVarOrderHeap0.select();
      assertEquals(0, levelBasedVarOrderHeap0.numberOfInterestingVariables());
      assertEquals(37, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      Lits lits0 = new Lits();
      lits0.getFromPool(386);
      levelBasedVarOrderHeap0.setLits(lits0);
      levelBasedVarOrderHeap0.init();
      int int0 = levelBasedVarOrderHeap0.select();
      assertEquals(773, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      String string0 = varOrderHeap0.toString();
      assertEquals("VSIDS like heuristics from MiniSAT using a heap phase appearing in latest learned clause", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      double[] doubleArray0 = levelBasedVarOrderHeap0.getVariableHeuristics();
      assertEquals(1, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      levelBasedVarOrderHeap0.updateVarAtDecisionLevel(40);
      assertEquals(0, levelBasedVarOrderHeap0.numberOfInterestingVariables());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      double[] doubleArray0 = new double[0];
      Heap heap0 = varOrderHeap0.createHeap(doubleArray0);
      assertTrue(heap0.empty());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      ILits iLits0 = levelBasedVarOrderHeap0.getVocabulary();
      assertNull(iLits0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      levelBasedVarOrderHeap0.assignLiteral(601);
      assertEquals(0, levelBasedVarOrderHeap0.numberOfInterestingVariables());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      // Undeclared exception!
      try { 
        levelBasedVarOrderHeap0.varActivity(601);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 300
         //
         verifyException("org.sat4j.minisat.orders.VarOrderHeap", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      PhaseInLastLearnedClauseSelectionStrategy phaseInLastLearnedClauseSelectionStrategy0 = (PhaseInLastLearnedClauseSelectionStrategy)levelBasedVarOrderHeap0.getPhaseSelectionStrategy();
      assertEquals("phase appearing in latest learned clause", phaseInLastLearnedClauseSelectionStrategy0.toString());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      Lits lits0 = new Lits();
      levelBasedVarOrderHeap0.setLits(lits0);
      levelBasedVarOrderHeap0.init();
      int int0 = levelBasedVarOrderHeap0.select();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      // Undeclared exception!
      try { 
        varOrderHeap0.printStat((PrintWriter) null, "0o]q\n-0");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.VarOrderHeap", e);
      }
  }
}
