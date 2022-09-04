package com.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
		features = "Baselogin.feature",
		glue =  {"com.stepdef.StepDefeition"}
		
		)




public class RunnerClass extends AbstractTestNGCucumberTests{

}
