package telran.text;

public class JoinStringsPerformanceAppl {
	private static final int N_STRINGS=1000;
	private static final int N_RUNS=100;
	public static void main(String[]args) {
		String delimiter="";
		String[] array=new String[N_STRINGS];
		for(int i=0;i<array.length;i++) {
			array[i]="ba";
			
		}
		JoinStringsPerformanceTest test1 = new JoinStringsPerformanceTest(N_RUNS, "JoinStringsBuilderImpl test", new JoinStringsOnBuilder(), array);
        JoinStringsPerformanceTest test3 = new JoinStringsPerformanceTest(N_RUNS, "JoinStringsOnString test", new JoinStringsOnString(), array);

        // Step 3.2.3: Call the run method for test1
        test1.run();

      

        // Step 3.2.5: Call the run method for test3
        test3.run();
	}
	

}
