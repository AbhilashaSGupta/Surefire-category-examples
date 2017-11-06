package ninja.abhilasha.test;

import ninja.abhilasha.test.category.ATests;
import ninja.abhilasha.test.category.AaTests;
import ninja.abhilasha.test.category.AbCTests;
import ninja.abhilasha.test.category.AbTests;
import ninja.abhilasha.test.category.AllTests;
import ninja.abhilasha.test.category.BTests;
import ninja.abhilasha.test.category.CTests;
import ninja.abhilasha.test.category.StandaloneTests;
import ninja.abhilasha.test.category.WholeClassTests;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;


@Category(WholeClassTests.class)
@Ignore
public class TestCategoryCombinations {
	
	@Test
	@Category(AllTests.class)
	public void onlnyInAllTest(){
		System.out.println("onlnyInAllTest");
	}
	
	@Test
	@Category({ AllTests.class,
				ATests.class,
				AbTests.class })
	public void ATest(){
		System.out.println("ATest");
	}
	
	@Test
	@Category({ AllTests.class,
				BTests.class,
				AbTests.class })
	public void BTest(){
		System.out.println("BTest");
	}
	
	@Test
	@Category({AllTests.class, 
        CTests.class,
       AbCTests.class})
	public void CTest(){
		System.out.println("CTest");
	}
	
	@Test
	@Category({ AllTests.class,
				ATests.class,
				AaTests.class,
				AbTests.class })
	public void AaTest(){
		System.out.println("AaTest");
	}
	
	@Test
	@Category({ AllTests.class,
				ATests.class,
				AbTests.class,
				AbCTests.class,
				AbTests.class })
	public void AbTest(){
		System.out.println("AbTest");
	}
	
	@Test
	@Category(StandaloneTests.class)
	public void standaloneTests(){
		System.out.println("standaloneTests");
	}
	
	@Test
	@Category({ AllTests.class,
				ATests.class,
				AaTests.class,
				AbTests.class,
				BTests.class,
				CTests.class,
				AbCTests.class,
				AbTests.class,
				StandaloneTests.class})
	public void everytimeTest(){
		System.out.println("everytimeTest");
	}

}
