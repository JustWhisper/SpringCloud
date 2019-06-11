import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Test
public class TestDemo {
	@BeforeClass
	public void BeforeApi(){
		System.err.println("test start");
	}

	public class TestApi{

	}

	@AfterClass
	public void AfterApi(){
		System.err.println("test end");
	}
}
