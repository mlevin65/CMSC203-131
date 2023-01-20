
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ManagementCompanyTestSTUDENT {
	Property p1 ,p2,p3,p4,p5,p6;
	ManagementCompany mgmtC ; 
	
	@Before
	public void setUp() throws Exception {
		//student create a management company
		p1 = new Property ("Hotel Inn", "Silver Spring", 4374.00, "John Doe",5,1,3,3);
		p2 = new Property ("Rock Creek Lodge", "Bethesda", 4395, "Jane Doe",1,4,1,1);
		p3 = new Property ("Sligo Creek Lodge", "Rockville", 3789, "Tyler Smith",3,3,1,3);
		//student add three properties, with plots, to mgmt co
		
		mgmtC = new ManagementCompany("mgmt co","55555555", 6);
		
		mgmtC.addProperty(p1);
		mgmtC.addProperty(p2);
		mgmtC.addProperty(p3);
	}

	@After
	public void tearDown() {
		//student set mgmt co to null
		p1 = p2 = p3 = p4 = p5 = null;
		mgmtC = null;
	}

	@Test
	public void testAddPropertyDefaultPlot() {
		//student should add property with 4 args & default plot (0,0,1,1)
		p4 = new Property ("Cherry Blosum Hotel", "Takoma Park", 3895, "Alex Jones",0,0,1,1);
		//student should add property with 8 args
		p5 = new Property ("Supreme Club", "Wheaton", 4392, "Mark Robert", 1,4,1,1);
		//student should add property that exceeds the size of the mgmt co array and can not be added, add property should return -1
		assertEquals(mgmtC.addProperty(p5),-4,0);
	}
 
	@Test
	public void testMaxRentProp() {
		//student should test if maxRentProp contains the maximum rent of properties
		assertEquals(mgmtC.getMAX_PROPERTY(),5);
	}

	@Test
	public void testTotalRent() {
		//student should test if totalRent returns the total rent of properties
		assertEquals(mgmtC.totalRent(),12558.0,0.0);
	}

 }
