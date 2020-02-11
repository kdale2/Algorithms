public class MED {
	
	/*  
	 * program to implement the dynamic programming algorithm for computing the 
	 * minimum edit distance (MED) between two strings. Use the recurrence relation given 
	 * in the slides to determine the size and contents of the table to do this. For this program, 
	 * only output the distance. Don't worry about outputting a series of edit instructions. 
	 */
	
	public static void main(String[] args) {
		
		String one = "depaul";
		String two = "declaw";		
		int answer = MEDistance(one, two);
		System.out.println(answer);
	}
	
	public static int MEDistance(String one, String two) {
		
		int m = one.length();
		int n = two.length();
		
		int solution[][] = new int[m+1][n+1];
		
		for (int i = 0; i <= n; i++) {
			solution[0][i] = i;
		}
		
		for (int j = 0; j <= m; j++) {
			solution[j][0] = j;
		}
		
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				
				if (one.charAt(i-1) == two.charAt(j-1))
					solution[i][j] = solution[i-1][j-1];
				else {
					solution[i][j] = 	1 +	 Math.min(solution[i][j-1],        //insert
											 Math.min(solution[i-1][j],  	   //remove
													  solution[i-1][j-1]));	   //replace
				}
			}
		}
		return solution[m][n];		
	}
}
