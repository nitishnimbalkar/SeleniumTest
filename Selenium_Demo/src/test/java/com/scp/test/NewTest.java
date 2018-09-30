package com.scp.test;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@SuppressWarnings("unused")
@Listeners(RealTimeReport.class)
public class NewTest {
	Logger log;
	@BeforeTest
	public void setupLogger() {
		log = Logger.getLogger("devpinoyLogger");
	}
	
  @Test
  public void f() {
	  log.debug("Method F - Before Reporter,log execution ");
	  Reporter.log("First reporter string");
	  log.debug("Method F - After Reporter,log execution ");
	  log.debug("Method F - Before Assertion ");
	  Assert.assertEquals("Nitish", "Nitishr","Contents are not matching");
	  log.debug("Method F - After Assertion ");
  }
  @Test
  public void G() {
	  log.debug("Method G - Before Reporter,log execution ");
	  Reporter.log("Second reporter string");
	  log.debug("Method G - After Reporter,log execution ");
	  log.debug("Method G - Before Assertion ");
	  Assert.assertEquals("Nitish", "Nitish","Check content match in G");
	  log.debug("Method G - After Assertion ");
  }
  @Test(dependsOnMethods="f")
  public void H() {
	  log.debug("Method H - Before Reporter,log execution ");
	  Reporter.log("Second reporter string");
	  log.debug("Method H - After Reporter,log execution ");
	  log.debug("Method H - Before Assertion ");
	  Assert.assertEquals("Nitish", "Nitish","Check content match in H");
	  log.debug("Method H - After Assertion ");
  }
}
