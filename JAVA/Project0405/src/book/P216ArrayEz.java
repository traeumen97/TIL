package book;
//important !!
public class P216ArrayEz {

	public static void main(String[] args) {
		int [][] score = {{1,2,3},{4,5,6}};
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j]+ " ");
			}
			System.out.println();
		}
	}
}