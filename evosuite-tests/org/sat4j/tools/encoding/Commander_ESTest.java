/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 17 12:28:25 GMT 2019
 */

package org.sat4j.tools.encoding;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.sat4j.LightFactory;
import org.sat4j.MUSLauncher;
import org.sat4j.core.ASolverFactory;
import org.sat4j.core.ReadOnlyVecInt;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.constraints.CardinalityDataStructureYanMin;
import org.sat4j.minisat.core.SearchParams;
import org.sat4j.minisat.core.Solver;
import org.sat4j.minisat.learning.MiniSATLearning;
import org.sat4j.minisat.learning.NoLearningNoHeuristics;
import org.sat4j.minisat.learning.PercentLengthLearning;
import org.sat4j.minisat.orders.LevelBasedVarOrderHeap;
import org.sat4j.minisat.orders.PhaseInLastLearnedClauseSelectionStrategy;
import org.sat4j.minisat.orders.PositiveLiteralSelectionStrategy;
import org.sat4j.minisat.orders.TabuListDecorator;
import org.sat4j.minisat.orders.VarOrderHeap;
import org.sat4j.minisat.restarts.EMARestarts;
import org.sat4j.minisat.restarts.LubyRestarts;
import org.sat4j.minisat.restarts.MiniSATRestarts;
import org.sat4j.opt.MaxSatDecorator;
import org.sat4j.specs.IConstr;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.tools.AbstractMinimalModel;
import org.sat4j.tools.CheckMUSSolutionListener;
import org.sat4j.tools.DimacsOutputSolver;
import org.sat4j.tools.DimacsStringSolver;
import org.sat4j.tools.ManyCore;
import org.sat4j.tools.NegationDecorator;
import org.sat4j.tools.OptToSatAdapter;
import org.sat4j.tools.StatisticsSolver;
import org.sat4j.tools.SubModelIterator;
import org.sat4j.tools.encoding.Commander;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Commander_ESTest extends Commander_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Commander commander0 = new Commander();
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      LubyRestarts lubyRestarts0 = new LubyRestarts(887);
      MiniSATLearning<CardinalityDataStructureYanMin> miniSATLearning0 = new MiniSATLearning<CardinalityDataStructureYanMin>();
      CardinalityDataStructureYanMin cardinalityDataStructureYanMin0 = new CardinalityDataStructureYanMin();
      Solver<CardinalityDataStructureYanMin> solver0 = new Solver<CardinalityDataStructureYanMin>(miniSATLearning0, cardinalityDataStructureYanMin0, varOrderHeap0, lubyRestarts0);
      int[] intArray0 = new int[2];
      intArray0[0] = 887;
      intArray0[1] = 32;
      VecInt vecInt0 = new VecInt(intArray0);
      IVecInt iVecInt0 = solver0.dimacs2internal(vecInt0);
      commander0.addAtMostOne(solver0, iVecInt0);
      assertEquals(0, iVecInt0.size());
      assertEquals(1, solver0.nConstraints());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Commander commander0 = new Commander();
      SubModelIterator[] subModelIteratorArray0 = new SubModelIterator[0];
      ManyCore<SubModelIterator> manyCore0 = new ManyCore<SubModelIterator>(false, subModelIteratorArray0);
      int[] intArray0 = new int[3];
      VecInt vecInt0 = new VecInt(intArray0);
      commander0.addExactlyOne(manyCore0, vecInt0);
      assertFalse(vecInt0.isEmpty());
      assertEquals(3, vecInt0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Commander commander0 = new Commander();
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      VecInt vecInt0 = new VecInt();
      IConstr iConstr0 = commander0.addExactly(dimacsOutputSolver0, vecInt0, 0);
      assertFalse(iConstr0.canBePropagatedMultipleTimes());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Commander commander0 = new Commander();
      NoLearningNoHeuristics<CardinalityDataStructureYanMin> noLearningNoHeuristics0 = new NoLearningNoHeuristics<CardinalityDataStructureYanMin>();
      CardinalityDataStructureYanMin cardinalityDataStructureYanMin0 = new CardinalityDataStructureYanMin();
      SearchParams searchParams0 = new SearchParams((-1944.619971504), (-1944.619971504), (-1944.619971504), (-1067));
      PositiveLiteralSelectionStrategy positiveLiteralSelectionStrategy0 = new PositiveLiteralSelectionStrategy();
      VarOrderHeap varOrderHeap0 = new VarOrderHeap(positiveLiteralSelectionStrategy0);
      MiniSATRestarts miniSATRestarts0 = new MiniSATRestarts();
      MUSLauncher mUSLauncher0 = new MUSLauncher();
      Solver<CardinalityDataStructureYanMin> solver0 = new Solver<CardinalityDataStructureYanMin>(noLearningNoHeuristics0, cardinalityDataStructureYanMin0, searchParams0, varOrderHeap0, miniSATRestarts0, mUSLauncher0);
      ISolver iSolver0 = solver0.getSolvingEngine();
      AbstractMinimalModel abstractMinimalModel0 = new AbstractMinimalModel(iSolver0);
      IVecInt iVecInt0 = AbstractMinimalModel.positiveLiterals(abstractMinimalModel0);
      try { 
        commander0.addExactlyOne(iSolver0, iVecInt0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.card.MinWatchCard", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Commander commander0 = new Commander();
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(dimacsStringSolver0, true);
      ASolverFactory<SubModelIterator> aSolverFactory0 = (ASolverFactory<SubModelIterator>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      CheckMUSSolutionListener checkMUSSolutionListener0 = new CheckMUSSolutionListener(aSolverFactory0);
      OptToSatAdapter optToSatAdapter0 = new OptToSatAdapter(maxSatDecorator0, checkMUSSolutionListener0);
      ReadOnlyVecInt readOnlyVecInt0 = new ReadOnlyVecInt((IVecInt) null);
      // Undeclared exception!
      try { 
        commander0.addExactlyOne(optToSatAdapter0, readOnlyVecInt0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.core.ReadOnlyVecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Commander commander0 = new Commander();
      PercentLengthLearning<CardinalityDataStructureYanMin> percentLengthLearning0 = new PercentLengthLearning<CardinalityDataStructureYanMin>();
      CardinalityDataStructureYanMin cardinalityDataStructureYanMin0 = new CardinalityDataStructureYanMin();
      PhaseInLastLearnedClauseSelectionStrategy phaseInLastLearnedClauseSelectionStrategy0 = new PhaseInLastLearnedClauseSelectionStrategy();
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap(phaseInLastLearnedClauseSelectionStrategy0);
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator(levelBasedVarOrderHeap0);
      LubyRestarts lubyRestarts0 = new LubyRestarts(887);
      Solver<CardinalityDataStructureYanMin> solver0 = new Solver<CardinalityDataStructureYanMin>(percentLengthLearning0, cardinalityDataStructureYanMin0, tabuListDecorator0, lubyRestarts0);
      int[] intArray0 = new int[1];
      VecInt vecInt0 = new VecInt(intArray0);
      // Undeclared exception!
      try { 
        commander0.addExactlyOne(solver0, vecInt0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is not a valid variable identifier
         //
         verifyException("org.sat4j.minisat.core.Solver", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Commander commander0 = new Commander();
      LightFactory lightFactory0 = LightFactory.instance();
      ISolver iSolver0 = lightFactory0.lightSolver();
      MiniSATLearning<CardinalityDataStructureYanMin> miniSATLearning0 = new MiniSATLearning<CardinalityDataStructureYanMin>();
      CardinalityDataStructureYanMin cardinalityDataStructureYanMin0 = new CardinalityDataStructureYanMin();
      SearchParams searchParams0 = new SearchParams();
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      EMARestarts eMARestarts0 = new EMARestarts();
      MUSLauncher mUSLauncher0 = new MUSLauncher();
      Solver<CardinalityDataStructureYanMin> solver0 = new Solver<CardinalityDataStructureYanMin>(miniSATLearning0, cardinalityDataStructureYanMin0, searchParams0, varOrderHeap0, eMARestarts0, mUSLauncher0);
      IVecInt iVecInt0 = solver0.createBlockingClauseForCurrentModel();
      try { 
        commander0.addExactly(iSolver0, iVecInt0, 364);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.card.AtLeast", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Commander commander0 = new Commander();
      int[] intArray0 = new int[1];
      VecInt vecInt0 = new VecInt(intArray0);
      // Undeclared exception!
      try { 
        commander0.addExactly((ISolver) null, vecInt0, (-507));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.encoding.EncodingStrategyAdapter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Commander commander0 = new Commander();
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      int[] intArray0 = new int[6];
      VecInt vecInt0 = new VecInt(intArray0);
      // Undeclared exception!
      try { 
        commander0.addExactly(iSolver0, vecInt0, 2300);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is not a valid variable identifier
         //
         verifyException("org.sat4j.minisat.core.Solver", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Commander commander0 = new Commander();
      int[] intArray0 = new int[8];
      VecInt vecInt0 = new VecInt(intArray0);
      StatisticsSolver statisticsSolver0 = new StatisticsSolver();
      // Undeclared exception!
      try { 
        commander0.addAtMostOne(statisticsSolver0, vecInt0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.tools.StatisticsSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Commander commander0 = new Commander();
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      // Undeclared exception!
      try { 
        commander0.addAtMostOne(dimacsOutputSolver0, (IVecInt) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.encoding.Commander", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PercentLengthLearning<CardinalityDataStructureYanMin> percentLengthLearning0 = new PercentLengthLearning<CardinalityDataStructureYanMin>();
      CardinalityDataStructureYanMin cardinalityDataStructureYanMin0 = new CardinalityDataStructureYanMin();
      PhaseInLastLearnedClauseSelectionStrategy phaseInLastLearnedClauseSelectionStrategy0 = new PhaseInLastLearnedClauseSelectionStrategy();
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap(phaseInLastLearnedClauseSelectionStrategy0);
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator(levelBasedVarOrderHeap0);
      LubyRestarts lubyRestarts0 = new LubyRestarts(887);
      Solver<CardinalityDataStructureYanMin> solver0 = new Solver<CardinalityDataStructureYanMin>(percentLengthLearning0, cardinalityDataStructureYanMin0, tabuListDecorator0, lubyRestarts0);
      int[] intArray0 = new int[4];
      intArray0[0] = 887;
      VecInt vecInt0 = new VecInt(intArray0);
      SubModelIterator subModelIterator0 = new SubModelIterator(solver0, vecInt0, 887);
      NegationDecorator<SubModelIterator> negationDecorator0 = new NegationDecorator<SubModelIterator>(subModelIterator0);
      Commander commander0 = new Commander();
      // Undeclared exception!
      try { 
        commander0.addAtMostOne(negationDecorator0, vecInt0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Please call newVar(int) before adding constraints!!!
         //
         verifyException("org.sat4j.tools.AbstractClauseSelectorSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Commander commander0 = new Commander();
      PercentLengthLearning<CardinalityDataStructureYanMin> percentLengthLearning0 = new PercentLengthLearning<CardinalityDataStructureYanMin>();
      CardinalityDataStructureYanMin cardinalityDataStructureYanMin0 = new CardinalityDataStructureYanMin();
      PhaseInLastLearnedClauseSelectionStrategy phaseInLastLearnedClauseSelectionStrategy0 = new PhaseInLastLearnedClauseSelectionStrategy();
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap(phaseInLastLearnedClauseSelectionStrategy0);
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator(levelBasedVarOrderHeap0);
      LubyRestarts lubyRestarts0 = new LubyRestarts(887);
      Solver<CardinalityDataStructureYanMin> solver0 = new Solver<CardinalityDataStructureYanMin>(percentLengthLearning0, cardinalityDataStructureYanMin0, tabuListDecorator0, lubyRestarts0);
      int[] intArray0 = new int[4];
      VecInt vecInt0 = new VecInt(intArray0);
      // Undeclared exception!
      try { 
        commander0.addAtMostOne(solver0, vecInt0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is not a valid variable identifier
         //
         verifyException("org.sat4j.minisat.core.Solver", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Commander commander0 = new Commander();
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      int[] intArray0 = new int[8];
      VecInt vecInt0 = new VecInt(intArray0);
      commander0.addAtMostOne(dimacsOutputSolver0, vecInt0);
      assertEquals(3, dimacsOutputSolver0.nVars());
      assertEquals(3, dimacsOutputSolver0.realNumberOfVariables());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Commander commander0 = new Commander();
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      // Undeclared exception!
      try { 
        commander0.addExactlyOne(dimacsOutputSolver0, (IVecInt) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.DimacsOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      VecInt vecInt0 = new VecInt();
      Commander commander0 = new Commander();
      // Undeclared exception!
      try { 
        commander0.addExactly(dimacsStringSolver0, vecInt0, (-435));
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not a clausal problem! degree 435
         //
         verifyException("org.sat4j.tools.DimacsStringSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Commander commander0 = new Commander();
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      VecInt vecInt0 = new VecInt(1718, 1718);
      // Undeclared exception!
      commander0.addAtMostOne(dimacsStringSolver0, vecInt0);
  }
}
