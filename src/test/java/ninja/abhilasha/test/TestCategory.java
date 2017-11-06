package ninja.abhilasha.test;

import ninja.abhilasha.test.category.AbTests;
import ninja.abhilasha.test.category.WholeClassTests;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ninja.abhilasha.test.category.ATests;
import ninja.abhilasha.test.category.AaTests;
import ninja.abhilasha.test.category.AbCTests;
import ninja.abhilasha.test.category.AllTests;
import ninja.abhilasha.test.category.BTests;
import ninja.abhilasha.test.category.CTests;
import ninja.abhilasha.test.category.StandaloneTests;

@Category(WholeClassTests.class)
public class TestCategory {
	
	@Test
	@Category(AllTests.class)
	public void onlnyInAllTest(){
		System.out.println("onlnyInAllTest");
	}
	
	@Test
	@Category(ATests.class)
	public void ATest(){
		System.out.println("ATest");
	}
	
	@Test
	@Category(BTests.class)
	public void BTest(){
		System.out.println("BTest");
	}
	
	@Test
	@Category({BTests.class, ATests.class})
	public void ABTest2(){
		System.out.println("ABTest2");
	}
	
	@Test
	@Category(AbTests.class)
	public void ABTest(){
		System.out.println("ABTest");
	}
	
	@Test
	@Category(CTests.class)
	public void CTest(){
		System.out.println("CTest");
	}
	
	@Test
	@Category(AbCTests.class)
	public void AbCTest(){
		System.out.println("AbCTest");
	}
	
	@Test
	@Category(AaTests.class)
	public void AaTest(){
		System.out.println("AaTest");
	}
	
	@Test
	@Category(AbTests.class)
	public void AbTest(){
		System.out.println("AbTest");
	}

	@Test
	@Category(StandaloneTests.class)
	public void standaloneTest(){
		System.out.println("standaloneTest");
	}
	
	@Test
	public void everytimeTest(){
		System.out.println("everytimeTest");
	}
	
	/*

	
	@Test
	@Category(ATests.class)
	public void Atest(){
		System.out.println("Atest");
	}
	
	@Test
	@Category(BTests.class)
	public void Btest(){
		System.out.println("Btest");
	}
	
	@Test
	@Category(CTests.class)
	public void Ctest(){
		System.out.println("Ctest");
	}
	
	@Test
	@Category({ATests.class, BTests.class})
	public void ABtest(){
		System.out.println("ABtest");
	}
	
	@Test
	@Category({ATests.class, CTests.class})
	public void ACtest(){
		System.out.println("ACtest");
	}
	
	@Test
	@Category({BTests.class, CTests.class})
	public void BCtest(){
		System.out.println("BCtest");
	}
	
	*/
	

}
