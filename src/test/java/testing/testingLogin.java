package testing;
import servlets_devops.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class testingLogin {

	@Test
	public void test() {
		loginServlet s= new loginServlet();
		int x=s.testing("admin","admin");
		assertEquals(1,x);	
		
	}

}
