package telran.text;

public abstract class PerformanceTest {
	int nRuns;
	String testName;
	public PerformanceTest(int nRuns,String testName) {
		this.nRuns=nRuns;
		this.testName=testName;
	}
	protected abstract void runTest();
	public void run() {
		long startTime=System.currentTimeMillis();
		for(int i=0;i<=nRuns;i++) {
			runTest();
			
		
		}
		long endTime=System.currentTimeMillis();
		long runningTime=endTime-startTime;
		System.out.println("Test: " + testName);
        System.out.println("Number of runs: " + nRuns);
        System.out.println("Running time (ms): " + runningTime);
	}
	
	
	
	

}
