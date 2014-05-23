package test;

import static org.junit.Assert.*;

import org.junit.Test;

import EqSolver.EqSolver;
//hey hey
public class Test1 {

	@Test
	public void test() {
		EqSolver solver = new EqSolver();
		double result = solver.solve(1,-2,1);
		//System.out.println(result);
		assertEquals((int)result, 1,0);
        
	}

}
