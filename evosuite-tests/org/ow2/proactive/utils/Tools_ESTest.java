/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 18 01:43:56 GMT 2019
 */

package org.ow2.proactive.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import java.util.ResourceBundle;
import org.apache.log4j.Category;
import org.apache.log4j.Logger;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;
import org.ow2.proactive.utils.ObjectArrayFormatter;
import org.ow2.proactive.utils.Tools;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Tools_ESTest extends Tools_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      // Undeclared exception!
      try { 
        Tools.parsePeriod("|9cd+YQ$+QaM#CQneOC");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid period string: |
         //
         verifyException("org.ow2.proactive.utils.Tools", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String[] stringArray0 = Tools.dataSpaceConfigPropertyToUrls("]\"");
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      long long0 = Tools.formatDate("FB: The ffllowing error rfported: ");
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = Tools.getElapsedTime((-9223372036854775791L));
      assertEquals("-34s ago", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = Tools.getFormattedDate(0L);
      assertEquals("1/1/70 12:00 AM", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = Tools.getFormattedDuration(3600000L, 0L);
      assertEquals(" 1h   0ms", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ObjectArrayFormatter objectArrayFormatter0 = new ObjectArrayFormatter();
      List<String> list0 = ResourceBundle.Control.FORMAT_DEFAULT;
      objectArrayFormatter0.setTitle(list0);
      String string0 = Tools.getStringAsArray(objectArrayFormatter0);
      assertEquals("\t java.class java.properties\n", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      long long0 = Tools.formatDate("5");
      assertEquals(5000L, long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      long long0 = Tools.formatDate("-204");
      assertEquals((-204000L), long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        Tools.parsePeriod((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.ow2.proactive.utils.Tools", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        Tools.parseCommandLine((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.ow2.proactive.utils.Tools", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        Tools.logAvailableScriptEngines((Logger) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.ow2.proactive.utils.Tools", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ObjectArrayFormatter objectArrayFormatter0 = new ObjectArrayFormatter();
      // Undeclared exception!
      try { 
        Tools.getStringAsArray(objectArrayFormatter0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Title array does not contain anything !
         //
         verifyException("org.ow2.proactive.utils.ObjectArrayFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        Tools.getHostURL((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.net.URI$Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        Tools.getHostURL("(Ro!qQy4qT[=");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal character in path at index 10: (Ro!qQy4qT[=
         //
         verifyException("java.net.URI", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      Tools.formatNChar(60000, 60000, '1');
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        Tools.formatDate((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.ow2.proactive.utils.Tools", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        Tools.dataSpaceConfigPropertyToUrls((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.ow2.proactive.utils.Tools", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Logger logger0 = Category.exists("");
      // Undeclared exception!
      try { 
        Tools.logAvailableScriptEngines(logger0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.ow2.proactive.utils.Tools", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Tools.formatNChar((-1), 812, 'c');
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = Tools.formatNChar((-204), (-204), 't');
      assertEquals("-204", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Logger logger0 = Logger.getLogger("#E=.qw1:@oF0*8@iY?");
      Tools.logAvailableScriptEngines(logger0);
      assertTrue(logger0.getAdditivity());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        Tools.parsePeriod("d8e<|");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period length isn't specified
         //
         verifyException("org.ow2.proactive.utils.Tools", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        Tools.parsePeriod("6m6hMf");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid period string: M
         //
         verifyException("org.ow2.proactive.utils.Tools", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        Tools.parsePeriod("s ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period length isn't specified
         //
         verifyException("org.ow2.proactive.utils.Tools", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        Tools.parsePeriod("4 +zw5:|xsl?ZZlt");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid period string: +
         //
         verifyException("org.ow2.proactive.utils.Tools", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        Tools.parsePeriod("9");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period string isn't specified
         //
         verifyException("org.ow2.proactive.utils.Tools", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        Tools.parsePeriod("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period string is empty
         //
         verifyException("org.ow2.proactive.utils.Tools", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      String[] stringArray0 = Tools.dataSpaceConfigPropertyToUrls("\"");
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String[] stringArray0 = Tools.dataSpaceConfigPropertyToUrls(":j5");
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String[] stringArray0 = Tools.dataSpaceConfigPropertyToUrls("");
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      String[] stringArray0 = Tools.dataSpaceConfigPropertyToUrls(" category\">");
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String string0 = Tools.shellExtension();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String[] stringArray0 = Tools.parseCommandLine("4 +zw5:|xsl?ZZlt");
      assertEquals(2, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      String[] stringArray0 = Tools.parseCommandLine("zho@i8%Nx0it+Z8%");
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      String[] stringArray0 = Tools.parseCommandLine("");
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      String string0 = Tools.getHostURL("");
      assertEquals("rmi://localhost/", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      String string0 = Tools.getHostURL("rmi://localhost/");
      assertEquals("rmi://localhost/", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      long long0 = Tools.formatDate(":");
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      System.setCurrentTimeMillis(3600000L);
      String string0 = Tools.getElapsedTime(2675L);
      assertEquals("59mn ago", string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      System.setCurrentTimeMillis(10485760L);
      String string0 = Tools.getElapsedTime((-2L));
      assertEquals("2h54mn ago", string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      String string0 = Tools.getElapsedTime(0L);
      assertEquals("16115d 20h ago", string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      String string0 = Tools.getFormattedDate((-761L));
      assertEquals("Not yet", string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      String string0 = Tools.getFormattedDate(10485760L);
      assertEquals("1/1/70 2:54 AM", string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      String string0 = Tools.getFormattedDuration(0L, 86400000L);
      assertEquals("1 day -   0ms", string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      String string0 = Tools.getFormattedDuration(1073741824L, 2210L);
      assertEquals("12 days - 10h 15m 39s 614ms", string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      String string0 = Tools.getFormattedDuration(9223372036854775807L, (-440L));
      assertEquals("Not yet", string0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      String string0 = Tools.getFormattedDuration((-1664L), (-401L));
      assertEquals("Not yet", string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      String string0 = Tools.getFormattedDuration(60000L, 9223372036854775807L);
      assertEquals("55m  -1ms", string0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Tools tools0 = new Tools();
      assertEquals("", tools0.shellExtension());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      // Undeclared exception!
      try { 
        Tools.getStringAsArray((ObjectArrayFormatter) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.ow2.proactive.utils.Tools", e);
      }
  }
}
