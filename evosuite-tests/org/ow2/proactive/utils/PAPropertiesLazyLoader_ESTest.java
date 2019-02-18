/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 18 01:43:00 GMT 2019
 */

package org.ow2.proactive.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Properties;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import org.ow2.proactive.utils.PAPropertiesLazyLoader;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PAPropertiesLazyLoader_ESTest extends PAPropertiesLazyLoader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("null/lq_pr{rIrQ'Pw");
      FileSystemHandling.createFolder(evoSuiteFile0);
      PAPropertiesLazyLoader pAPropertiesLazyLoader0 = new PAPropertiesLazyLoader("lq_pr{rIrQ'Pw", "lq_pr{rIrQ'Pw", "lq_pr{rIrQ'Pw", "lq_pr{rIrQ'Pw");
      // Undeclared exception!
      try { 
        pAPropertiesLazyLoader0.getProperties();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.FileNotFoundException
         //
         verifyException("org.ow2.proactive.utils.PAPropertiesLazyLoader", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PAPropertiesLazyLoader pAPropertiesLazyLoader0 = new PAPropertiesLazyLoader(">^r:jR)e*>", "", "", "org.apache.log4j.helpers.LogLog");
      Properties properties0 = pAPropertiesLazyLoader0.getProperties();
      properties0.clear();
      Properties properties1 = pAPropertiesLazyLoader0.getProperties();
      assertTrue(properties1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PAPropertiesLazyLoader pAPropertiesLazyLoader0 = new PAPropertiesLazyLoader((String) null, (String) null, (String) null);
      // Undeclared exception!
      try { 
        pAPropertiesLazyLoader0.getProperties();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PAPropertiesLazyLoader pAPropertiesLazyLoader0 = new PAPropertiesLazyLoader("", "", "", "");
      // Undeclared exception!
      try { 
        pAPropertiesLazyLoader0.getProperties();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PAPropertiesLazyLoader pAPropertiesLazyLoader0 = new PAPropertiesLazyLoader(">^r:jR)e*>", "", "", "org.apache.log4j.helpers.LogLog");
      Properties properties0 = pAPropertiesLazyLoader0.getProperties();
      assertNotNull(properties0);
      
      PAPropertiesLazyLoader.updateWithSystemProperties(properties0);
      assertFalse(properties0.isEmpty());
      assertEquals(72, properties0.size());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PAPropertiesLazyLoader.updateWithSystemProperties((Properties) null);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("null/Loading properties from file ");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "Loading properties from file ");
      PAPropertiesLazyLoader pAPropertiesLazyLoader0 = new PAPropertiesLazyLoader("Loading properties from file ", "Loading properties from file ", "Loading properties from file ");
      Properties properties0 = pAPropertiesLazyLoader0.getProperties();
      assertNotNull(properties0);
      assertEquals(73, properties0.size());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      PAPropertiesLazyLoader pAPropertiesLazyLoader0 = new PAPropertiesLazyLoader("java.version", "java.version", "lsMyhFkTzKQ:");
      // Undeclared exception!
      try { 
        pAPropertiesLazyLoader0.getProperties();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Properties file not found : '1.8.0_91/1.8.0_91'
         //
         verifyException("org.ow2.proactive.utils.PAPropertiesLazyLoader", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      PAPropertiesLazyLoader pAPropertiesLazyLoader0 = new PAPropertiesLazyLoader("/y<t}}W/0", "/y<t}}W/0", "/y<t}}W/0");
      Properties properties0 = pAPropertiesLazyLoader0.getProperties();
      assertEquals(72, properties0.size());
      assertNotNull(properties0);
  }
}
