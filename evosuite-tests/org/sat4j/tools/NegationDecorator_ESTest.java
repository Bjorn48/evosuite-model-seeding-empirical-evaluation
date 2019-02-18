/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 18 01:08:58 GMT 2019
 */

package org.sat4j.tools;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.sat4j.BasicLauncher;
import org.sat4j.LightFactory;
import org.sat4j.core.ASolverFactory;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.constraints.CardinalityDataStructure;
import org.sat4j.minisat.core.SearchParams;
import org.sat4j.minisat.core.Solver;
import org.sat4j.minisat.learning.FixedLengthLearning;
import org.sat4j.minisat.orders.PureOrder;
import org.sat4j.minisat.orders.RandomWalkDecorator;
import org.sat4j.minisat.orders.TabuListDecorator;
import org.sat4j.minisat.orders.VarOrderHeap;
import org.sat4j.minisat.restarts.EMARestarts;
import org.sat4j.minisat.restarts.LubyRestarts;
import org.sat4j.opt.MaxSatDecorator;
import org.sat4j.opt.MinOneDecorator;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.tools.AbstractMinimalModel;
import org.sat4j.tools.CheckMUSSolutionListener;
import org.sat4j.tools.ClausalCardinalitiesDecorator;
import org.sat4j.tools.DimacsOutputSolver;
import org.sat4j.tools.DimacsStringSolver;
import org.sat4j.tools.GateTranslator;
import org.sat4j.tools.GroupClauseSelectorSolver;
import org.sat4j.tools.LexicoDecorator;
import org.sat4j.tools.ManyCore;
import org.sat4j.tools.Minimal4CardinalityModel;
import org.sat4j.tools.Minimal4InclusionModel;
import org.sat4j.tools.ModelIterator;
import org.sat4j.tools.ModelIteratorToSATAdapter;
import org.sat4j.tools.NegationDecorator;
import org.sat4j.tools.SingleSolutionDetector;
import org.sat4j.tools.StatisticsSolver;
import org.sat4j.tools.SubModelIterator;
import org.sat4j.tools.encoding.EncodingStrategy;
import org.sat4j.tools.encoding.EncodingStrategyAdapter;
import org.sat4j.tools.encoding.Policy;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NegationDecorator_ESTest extends NegationDecorator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FixedLengthLearning<CardinalityDataStructure> fixedLengthLearning0 = new FixedLengthLearning<CardinalityDataStructure>();
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      SearchParams searchParams0 = new SearchParams((-68.23362929), (-68.23362929), (-68.23362929), 5000);
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(varOrderHeap0, (-60.4943622));
      LubyRestarts lubyRestarts0 = new LubyRestarts();
      ASolverFactory<DimacsOutputSolver> aSolverFactory0 = (ASolverFactory<DimacsOutputSolver>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      BasicLauncher<DimacsOutputSolver> basicLauncher0 = new BasicLauncher<DimacsOutputSolver>(aSolverFactory0);
      Solver<CardinalityDataStructure> solver0 = new Solver<CardinalityDataStructure>(fixedLengthLearning0, cardinalityDataStructure0, searchParams0, randomWalkDecorator0, lubyRestarts0, basicLauncher0);
      ISolver iSolver0 = solver0.getSolvingEngine();
      GateTranslator gateTranslator0 = new GateTranslator(iSolver0);
      NegationDecorator<GateTranslator> negationDecorator0 = new NegationDecorator<GateTranslator>(gateTranslator0);
      VecInt vecInt0 = new VecInt();
      AbstractMinimalModel abstractMinimalModel0 = new AbstractMinimalModel(negationDecorator0, vecInt0);
      GroupClauseSelectorSolver<AbstractMinimalModel> groupClauseSelectorSolver0 = new GroupClauseSelectorSolver<AbstractMinimalModel>(abstractMinimalModel0);
      NegationDecorator<GroupClauseSelectorSolver<AbstractMinimalModel>> negationDecorator1 = new NegationDecorator<GroupClauseSelectorSolver<AbstractMinimalModel>>(groupClauseSelectorSolver0);
      // Undeclared exception!
      try { 
        negationDecorator1.isSatisfiable((IVecInt) vecInt0, false);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.sat4j.core.ConstrGroup cannot be cast to org.sat4j.specs.Constr
         //
         verifyException("org.sat4j.minisat.core.Solver", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FixedLengthLearning<CardinalityDataStructure> fixedLengthLearning0 = new FixedLengthLearning<CardinalityDataStructure>(1);
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      SearchParams searchParams0 = new SearchParams(1, 1);
      PureOrder pureOrder0 = new PureOrder(0);
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator(pureOrder0);
      EMARestarts eMARestarts0 = new EMARestarts();
      Solver<CardinalityDataStructure> solver0 = new Solver<CardinalityDataStructure>(fixedLengthLearning0, cardinalityDataStructure0, searchParams0, tabuListDecorator0, eMARestarts0);
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(solver0);
      NegationDecorator<MaxSatDecorator> negationDecorator0 = new NegationDecorator<MaxSatDecorator>(maxSatDecorator0);
      VecInt vecInt0 = new VecInt();
      boolean boolean0 = negationDecorator0.isSatisfiable((IVecInt) vecInt0, true);
      assertEquals(0, vecInt0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FixedLengthLearning<CardinalityDataStructure> fixedLengthLearning0 = new FixedLengthLearning<CardinalityDataStructure>();
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      SearchParams searchParams0 = new SearchParams((-68.23362929), (-68.23362929), (-68.23362929), 5000);
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(varOrderHeap0, 5000);
      LubyRestarts lubyRestarts0 = new LubyRestarts();
      ASolverFactory<DimacsOutputSolver> aSolverFactory0 = (ASolverFactory<DimacsOutputSolver>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      BasicLauncher<DimacsOutputSolver> basicLauncher0 = new BasicLauncher<DimacsOutputSolver>(aSolverFactory0);
      Solver<CardinalityDataStructure> solver0 = new Solver<CardinalityDataStructure>(fixedLengthLearning0, cardinalityDataStructure0, searchParams0, randomWalkDecorator0, lubyRestarts0, basicLauncher0);
      ASolverFactory<DimacsStringSolver> aSolverFactory1 = (ASolverFactory<DimacsStringSolver>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      CheckMUSSolutionListener checkMUSSolutionListener0 = new CheckMUSSolutionListener(aSolverFactory1);
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(solver0, checkMUSSolutionListener0);
      NegationDecorator<Minimal4CardinalityModel> negationDecorator0 = new NegationDecorator<Minimal4CardinalityModel>(minimal4CardinalityModel0);
      VecInt vecInt0 = new VecInt();
      boolean boolean0 = negationDecorator0.isSatisfiable((IVecInt) vecInt0, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IVecInt iVecInt0 = VecInt.EMPTY;
      ASolverFactory<Minimal4CardinalityModel> aSolverFactory0 = (ASolverFactory<Minimal4CardinalityModel>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      String[] stringArray0 = new String[0];
      ManyCore<Minimal4CardinalityModel> manyCore0 = new ManyCore<Minimal4CardinalityModel>(aSolverFactory0, true, stringArray0);
      Minimal4InclusionModel minimal4InclusionModel0 = new Minimal4InclusionModel(manyCore0, iVecInt0);
      NegationDecorator<AbstractMinimalModel> negationDecorator0 = new NegationDecorator<AbstractMinimalModel>(minimal4InclusionModel0);
      try { 
        negationDecorator0.isSatisfiable(iVecInt0, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.ManyCore", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IVecInt iVecInt0 = VecInt.EMPTY;
      NegationDecorator<AbstractMinimalModel> negationDecorator0 = new NegationDecorator<AbstractMinimalModel>((AbstractMinimalModel) null);
      // Undeclared exception!
      try { 
        negationDecorator0.isSatisfiable(iVecInt0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.SolverDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FixedLengthLearning<CardinalityDataStructure> fixedLengthLearning0 = new FixedLengthLearning<CardinalityDataStructure>();
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      SearchParams searchParams0 = new SearchParams((-68.23362929), (-68.23362929), (-68.23362929), 5000);
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(varOrderHeap0, 5000);
      LubyRestarts lubyRestarts0 = new LubyRestarts();
      ASolverFactory<DimacsOutputSolver> aSolverFactory0 = (ASolverFactory<DimacsOutputSolver>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      BasicLauncher<DimacsOutputSolver> basicLauncher0 = new BasicLauncher<DimacsOutputSolver>(aSolverFactory0);
      Solver<CardinalityDataStructure> solver0 = new Solver<CardinalityDataStructure>(fixedLengthLearning0, cardinalityDataStructure0, searchParams0, randomWalkDecorator0, lubyRestarts0, basicLauncher0);
      ISolver iSolver0 = solver0.getSolvingEngine();
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(iSolver0);
      GroupClauseSelectorSolver<MaxSatDecorator> groupClauseSelectorSolver0 = new GroupClauseSelectorSolver<MaxSatDecorator>(maxSatDecorator0);
      LexicoDecorator<GroupClauseSelectorSolver<MaxSatDecorator>> lexicoDecorator0 = new LexicoDecorator<GroupClauseSelectorSolver<MaxSatDecorator>>(groupClauseSelectorSolver0);
      ASolverFactory<SingleSolutionDetector> aSolverFactory1 = (ASolverFactory<SingleSolutionDetector>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      CheckMUSSolutionListener checkMUSSolutionListener0 = new CheckMUSSolutionListener(aSolverFactory1);
      AbstractMinimalModel abstractMinimalModel0 = new AbstractMinimalModel(lexicoDecorator0, checkMUSSolutionListener0);
      NegationDecorator<AbstractMinimalModel> negationDecorator0 = new NegationDecorator<AbstractMinimalModel>(abstractMinimalModel0);
      int[] intArray0 = new int[5];
      intArray0[0] = 5000;
      VecInt vecInt0 = new VecInt(intArray0);
      // Undeclared exception!
      try { 
        negationDecorator0.isSatisfiable((IVecInt) vecInt0, false);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // removed unit clause which caused propagations
         //
         verifyException("org.sat4j.minisat.constraints.cnf.UnitClauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver(1);
      VecInt vecInt0 = new VecInt();
      GateTranslator gateTranslator0 = new GateTranslator(dimacsStringSolver0);
      NegationDecorator<GateTranslator> negationDecorator0 = new NegationDecorator<GateTranslator>(gateTranslator0);
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(negationDecorator0);
      EncodingStrategy encodingStrategy0 = EncodingStrategy.BINARY;
      EncodingStrategyAdapter encodingStrategyAdapter0 = Policy.getAdapterFromEncodingName(encodingStrategy0);
      ClausalCardinalitiesDecorator<MinOneDecorator> clausalCardinalitiesDecorator0 = new ClausalCardinalitiesDecorator<MinOneDecorator>(minOneDecorator0, encodingStrategyAdapter0);
      NegationDecorator<ClausalCardinalitiesDecorator<MinOneDecorator>> negationDecorator1 = new NegationDecorator<ClausalCardinalitiesDecorator<MinOneDecorator>>(clausalCardinalitiesDecorator0);
      ModelIterator modelIterator0 = new ModelIterator(negationDecorator1, 1);
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(modelIterator0);
      GroupClauseSelectorSolver<MaxSatDecorator> groupClauseSelectorSolver0 = new GroupClauseSelectorSolver<MaxSatDecorator>(maxSatDecorator0);
      NegationDecorator<GroupClauseSelectorSolver<MaxSatDecorator>> negationDecorator2 = new NegationDecorator<GroupClauseSelectorSolver<MaxSatDecorator>>(groupClauseSelectorSolver0);
      // Undeclared exception!
      try { 
        negationDecorator2.isSatisfiable((IVecInt) vecInt0, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The constraint you entered cannot be removed from the solver.
         //
         verifyException("org.sat4j.core.ConstrGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StatisticsSolver statisticsSolver0 = new StatisticsSolver();
      NegationDecorator<StatisticsSolver> negationDecorator0 = new NegationDecorator<StatisticsSolver>(statisticsSolver0);
      VecInt vecInt0 = new VecInt();
      Minimal4InclusionModel minimal4InclusionModel0 = new Minimal4InclusionModel(negationDecorator0);
      NegationDecorator<Minimal4InclusionModel> negationDecorator1 = new NegationDecorator<Minimal4InclusionModel>(minimal4InclusionModel0);
      // Undeclared exception!
      try { 
        negationDecorator1.addClause(vecInt0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.tools.StatisticsSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      NegationDecorator<DimacsOutputSolver> negationDecorator0 = new NegationDecorator<DimacsOutputSolver>(dimacsOutputSolver0);
      // Undeclared exception!
      try { 
        negationDecorator0.addClause((IVecInt) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.AbstractClauseSelectorSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver(17);
      VecInt vecInt0 = new VecInt(17, 17);
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(dimacsStringSolver0, vecInt0);
      GateTranslator gateTranslator0 = new GateTranslator(minimal4CardinalityModel0);
      NegationDecorator<GateTranslator> negationDecorator0 = new NegationDecorator<GateTranslator>(gateTranslator0);
      // Undeclared exception!
      try { 
        negationDecorator0.addClause(vecInt0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Please call newVar(int) before adding constraints!!!
         //
         verifyException("org.sat4j.tools.AbstractClauseSelectorSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver(1);
      VecInt vecInt0 = new VecInt(1, 1);
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(dimacsStringSolver0, vecInt0);
      GateTranslator gateTranslator0 = new GateTranslator(minimal4CardinalityModel0);
      NegationDecorator<GateTranslator> negationDecorator0 = new NegationDecorator<GateTranslator>(gateTranslator0);
      // Undeclared exception!
      try { 
        negationDecorator0.addClause(vecInt0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The constraint you entered cannot be removed from the solver.
         //
         verifyException("org.sat4j.core.ConstrGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FixedLengthLearning<CardinalityDataStructure> fixedLengthLearning0 = new FixedLengthLearning<CardinalityDataStructure>();
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      SearchParams searchParams0 = new SearchParams((-68.23362929), (-68.23362929), (-68.23362929), 5000);
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(varOrderHeap0, 5000);
      LubyRestarts lubyRestarts0 = new LubyRestarts();
      ASolverFactory<DimacsOutputSolver> aSolverFactory0 = (ASolverFactory<DimacsOutputSolver>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      BasicLauncher<DimacsOutputSolver> basicLauncher0 = new BasicLauncher<DimacsOutputSolver>(aSolverFactory0);
      Solver<CardinalityDataStructure> solver0 = new Solver<CardinalityDataStructure>(fixedLengthLearning0, cardinalityDataStructure0, searchParams0, randomWalkDecorator0, lubyRestarts0, basicLauncher0);
      ASolverFactory<DimacsStringSolver> aSolverFactory1 = (ASolverFactory<DimacsStringSolver>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      CheckMUSSolutionListener checkMUSSolutionListener0 = new CheckMUSSolutionListener(aSolverFactory1);
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(solver0, checkMUSSolutionListener0);
      NegationDecorator<Minimal4CardinalityModel> negationDecorator0 = new NegationDecorator<Minimal4CardinalityModel>(minimal4CardinalityModel0);
      VecInt vecInt0 = new VecInt();
      ModelIteratorToSATAdapter modelIteratorToSATAdapter0 = new ModelIteratorToSATAdapter(negationDecorator0, 0L, checkMUSSolutionListener0);
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(modelIteratorToSATAdapter0);
      NegationDecorator<MaxSatDecorator> negationDecorator1 = new NegationDecorator<MaxSatDecorator>(maxSatDecorator0);
      negationDecorator1.addClause(vecInt0);
      // Undeclared exception!
      try { 
        negationDecorator1.isSatisfiable((IVecInt) vecInt0, true);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.sat4j.core.ConstrGroup cannot be cast to org.sat4j.specs.Constr
         //
         verifyException("org.sat4j.minisat.core.Solver", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FixedLengthLearning<CardinalityDataStructure> fixedLengthLearning0 = new FixedLengthLearning<CardinalityDataStructure>();
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      SearchParams searchParams0 = new SearchParams((-68.23362929), (-68.23362929), (-68.23362929), 5000);
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(varOrderHeap0, 5000);
      LubyRestarts lubyRestarts0 = new LubyRestarts();
      ASolverFactory<DimacsOutputSolver> aSolverFactory0 = (ASolverFactory<DimacsOutputSolver>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      BasicLauncher<DimacsOutputSolver> basicLauncher0 = new BasicLauncher<DimacsOutputSolver>(aSolverFactory0);
      Solver<CardinalityDataStructure> solver0 = new Solver<CardinalityDataStructure>(fixedLengthLearning0, cardinalityDataStructure0, searchParams0, randomWalkDecorator0, lubyRestarts0, basicLauncher0);
      ISolver iSolver0 = solver0.getSolvingEngine();
      GateTranslator gateTranslator0 = new GateTranslator(iSolver0);
      NegationDecorator<GateTranslator> negationDecorator0 = new NegationDecorator<GateTranslator>(gateTranslator0);
      VecInt vecInt0 = new VecInt(5000, 5000);
      solver0.dimacs2internal(vecInt0);
      // Undeclared exception!
      negationDecorator0.addClause(vecInt0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FixedLengthLearning<CardinalityDataStructure> fixedLengthLearning0 = new FixedLengthLearning<CardinalityDataStructure>();
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      SearchParams searchParams0 = new SearchParams((-68.23362929), (-68.23362929), (-68.23362929), 5000);
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(varOrderHeap0, 5000);
      LubyRestarts lubyRestarts0 = new LubyRestarts();
      ASolverFactory<DimacsOutputSolver> aSolverFactory0 = (ASolverFactory<DimacsOutputSolver>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      BasicLauncher<DimacsOutputSolver> basicLauncher0 = new BasicLauncher<DimacsOutputSolver>(aSolverFactory0);
      Solver<CardinalityDataStructure> solver0 = new Solver<CardinalityDataStructure>(fixedLengthLearning0, cardinalityDataStructure0, searchParams0, randomWalkDecorator0, lubyRestarts0, basicLauncher0);
      ASolverFactory<DimacsStringSolver> aSolverFactory1 = (ASolverFactory<DimacsStringSolver>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      CheckMUSSolutionListener checkMUSSolutionListener0 = new CheckMUSSolutionListener(aSolverFactory1);
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(solver0, checkMUSSolutionListener0);
      NegationDecorator<Minimal4CardinalityModel> negationDecorator0 = new NegationDecorator<Minimal4CardinalityModel>(minimal4CardinalityModel0);
      ModelIteratorToSATAdapter modelIteratorToSATAdapter0 = new ModelIteratorToSATAdapter(negationDecorator0, 0L, checkMUSSolutionListener0);
      NegationDecorator<ModelIteratorToSATAdapter> negationDecorator1 = new NegationDecorator<ModelIteratorToSATAdapter>(modelIteratorToSATAdapter0);
      Collection<Integer> collection0 = negationDecorator1.getAddedVars();
      assertFalse(collection0.contains(5000));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NegationDecorator<MinOneDecorator> negationDecorator0 = new NegationDecorator<MinOneDecorator>((MinOneDecorator) null);
      // Undeclared exception!
      try { 
        negationDecorator0.addAtLeast((IVecInt) null, 37);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.tools.NegationDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LightFactory lightFactory0 = LightFactory.instance();
      ISolver iSolver0 = lightFactory0.lightSolver();
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(iSolver0);
      VecInt vecInt0 = new VecInt(5000);
      SubModelIterator subModelIterator0 = new SubModelIterator(minOneDecorator0, vecInt0, 15);
      NegationDecorator<SubModelIterator> negationDecorator0 = new NegationDecorator<SubModelIterator>(subModelIterator0);
      // Undeclared exception!
      try { 
        negationDecorator0.addAtMost(vecInt0, 15);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.tools.NegationDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      NegationDecorator<DimacsOutputSolver> negationDecorator0 = new NegationDecorator<DimacsOutputSolver>(dimacsOutputSolver0);
      // Undeclared exception!
      try { 
        negationDecorator0.addExactly(vecInt0, 0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.tools.NegationDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      NegationDecorator<DimacsStringSolver> negationDecorator0 = new NegationDecorator<DimacsStringSolver>(dimacsStringSolver0);
      VecInt vecInt0 = new VecInt(5000, 5000);
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(negationDecorator0, vecInt0);
      NegationDecorator<AbstractMinimalModel> negationDecorator1 = new NegationDecorator<AbstractMinimalModel>(minimal4CardinalityModel0);
      // Undeclared exception!
      try { 
        negationDecorator1.isSatisfiable((IVecInt) vecInt0, false);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.AbstractOutputSolver", e);
      }
  }
}
