package telran.text;

public class JoinStringsPerformanceTest extends PerformanceTest {
	private JoinStrings joinStrings;
	private String[] stringsToJoin;
	public JoinStringsPerformanceTest(int nRuns, String testName,JoinStrings joinStrings,String[]stringsToJoin) {
		super(nRuns, testName);
		this.joinStrings=joinStrings;
		this.stringsToJoin=stringsToJoin;
		
	}

	
	@Override
	protected void runTest() {
		joinStrings.join(stringsToJoin, " ");
		
	}

}
