package EqSolver;
import java.lang.Math;
public class EqSolver {
public double solve(int a,int b,int c){
	return (2*b + Math.sqrt(b*b - 4 * a * c))/ 2 * a;
	
}
}
