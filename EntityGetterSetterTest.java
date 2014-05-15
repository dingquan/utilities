import java.io.IOException;
import java.util.List;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EntityGetterSetterTest {
	
	private GetterSetterTester tester;
	private ClassFinder classFinder;
	
	@BeforeMethod
	public void setup()
	{
		tester = new GetterSetterTester();
		classFinder = new ClassFinder();
	}
	
	/**
	 * find all classes in the entity package and call the setters/getters
	 * @throws ClassNotFoundException 
	 * @throws IOException 
	 */
	@Test
	@SuppressWarnings("rawtypes")
	public void testGettersAndSetters() throws IOException, ClassNotFoundException
	{
		List<Class> clazzes = classFinder.findClassesInPackage("com.example");
		for(Class clazz: clazzes){
			tester.testClass(clazz);
		}
	}

}
