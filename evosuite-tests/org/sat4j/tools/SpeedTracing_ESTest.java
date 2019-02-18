/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 18 01:09:24 GMT 2019
 */

package org.sat4j.tools;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;
import org.sat4j.minisat.constraints.MixedDataStructureDanielHT;
import org.sat4j.minisat.core.SearchParams;
import org.sat4j.minisat.core.Solver;
import org.sat4j.minisat.learning.FixedLengthLearning;
import org.sat4j.minisat.orders.NegativeLiteralSelectionStrategy;
import org.sat4j.minisat.orders.VarOrderHeap;
import org.sat4j.minisat.restarts.ArminRestarts;
import org.sat4j.specs.Lbool;
import org.sat4j.tools.FileBasedVisualizationTool;
import org.sat4j.tools.IVisualizationTool;
import org.sat4j.tools.SpeedTracing;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SpeedTracing_ESTest extends SpeedTracing_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FileBasedVisualizationTool fileBasedVisualizationTool0 = new FileBasedVisualizationTool("");
      SpeedTracing speedTracing0 = new SpeedTracing(fileBasedVisualizationTool0, fileBasedVisualizationTool0, fileBasedVisualizationTool0);
      speedTracing0.propagating(704555003);
      System.setCurrentTimeMillis((-472L));
      speedTracing0.restarting();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FileBasedVisualizationTool fileBasedVisualizationTool0 = new FileBasedVisualizationTool("");
      SpeedTracing speedTracing0 = new SpeedTracing(fileBasedVisualizationTool0, fileBasedVisualizationTool0, fileBasedVisualizationTool0);
      System.setCurrentTimeMillis((-472L));
      speedTracing0.restarting();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FileBasedVisualizationTool fileBasedVisualizationTool0 = new FileBasedVisualizationTool("Jsz&+");
      SpeedTracing speedTracing0 = new SpeedTracing(fileBasedVisualizationTool0, fileBasedVisualizationTool0, fileBasedVisualizationTool0);
      speedTracing0.propagating(0);
      System.setCurrentTimeMillis(3613L);
      speedTracing0.cleaning();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      System.setCurrentTimeMillis((-1392409281320L));
      FileBasedVisualizationTool fileBasedVisualizationTool0 = new FileBasedVisualizationTool("");
      SpeedTracing speedTracing0 = new SpeedTracing(fileBasedVisualizationTool0, fileBasedVisualizationTool0, fileBasedVisualizationTool0);
      speedTracing0.propagating(704555003);
      speedTracing0.restarting();
      System.setCurrentTimeMillis((-472L));
      speedTracing0.propagating((-2790));
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FileBasedVisualizationTool fileBasedVisualizationTool0 = new FileBasedVisualizationTool("");
      SpeedTracing speedTracing0 = new SpeedTracing(fileBasedVisualizationTool0, fileBasedVisualizationTool0, fileBasedVisualizationTool0);
      System.setCurrentTimeMillis(1392409283320L);
      speedTracing0.propagating((-1));
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SpeedTracing speedTracing0 = null;
      try {
        speedTracing0 = new SpeedTracing((IVisualizationTool) null, (IVisualizationTool) null, (IVisualizationTool) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.SpeedTracing", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      System.setCurrentTimeMillis((-1392409281320L));
      FileBasedVisualizationTool fileBasedVisualizationTool0 = new FileBasedVisualizationTool("");
      SpeedTracing speedTracing0 = new SpeedTracing(fileBasedVisualizationTool0, fileBasedVisualizationTool0, fileBasedVisualizationTool0);
      speedTracing0.propagating(704555003);
      System.setCurrentTimeMillis(0L);
      speedTracing0.propagating((-1));
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      FileBasedVisualizationTool fileBasedVisualizationTool0 = new FileBasedVisualizationTool("");
      SpeedTracing speedTracing0 = new SpeedTracing(fileBasedVisualizationTool0, fileBasedVisualizationTool0, fileBasedVisualizationTool0);
      speedTracing0.start();
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      FileBasedVisualizationTool fileBasedVisualizationTool0 = new FileBasedVisualizationTool("");
      SpeedTracing speedTracing0 = new SpeedTracing(fileBasedVisualizationTool0, fileBasedVisualizationTool0, fileBasedVisualizationTool0);
      MixedDataStructureDanielHT mixedDataStructureDanielHT0 = new MixedDataStructureDanielHT();
      FixedLengthLearning<MixedDataStructureDanielHT> fixedLengthLearning0 = new FixedLengthLearning<MixedDataStructureDanielHT>(0);
      SearchParams searchParams0 = new SearchParams();
      NegativeLiteralSelectionStrategy negativeLiteralSelectionStrategy0 = new NegativeLiteralSelectionStrategy();
      VarOrderHeap varOrderHeap0 = new VarOrderHeap(negativeLiteralSelectionStrategy0);
      ArminRestarts arminRestarts0 = new ArminRestarts();
      Solver<MixedDataStructureDanielHT> solver0 = new Solver<MixedDataStructureDanielHT>(fixedLengthLearning0, mixedDataStructureDanielHT0, searchParams0, varOrderHeap0, arminRestarts0);
      Lbool lbool0 = solver0.truthValue(5);
      speedTracing0.end(lbool0);
      assertEquals("U", lbool0.toString());
  }
}
