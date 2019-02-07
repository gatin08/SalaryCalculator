package salaryTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import salaryPackage.ISalaryModel;
import salaryPackage.SalaryModel;

public class SalaryTest {

	@Test
	public void test() {
		
		ISalaryModel mdl = new SalaryModel();
		
		double inputValue = 1000;
		
		double[] outputValues = mdl.Calculate(inputValue);
		
		assertArrayEquals(new double[] { 870, 130, 302 }, outputValues);
	}

}
