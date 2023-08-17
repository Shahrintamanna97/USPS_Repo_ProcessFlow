package testdata;

import org.testng.annotations.Test;

import locators.Locators_objectRepository;
import utils.Xls_Reader;
public class readFromExcel {
	Xls_Reader xlobj=new Xls_Reader(System.setProperty(null, "C:\\Users\\17186\\eclipse-workspace\\modulerDrivenFramework.testdata.xlsx"));
	  Locators_objectRepository objLoc=new Locators_objectRepository();

@Test
public void testReadingFromExcel() {
	typeByXpath(objLoc.userNamelocator,xlobj.getCellData("Sign in","username",2));
	//here "sign in" is the name of sheet,
	//"username" is the column name
	//"2" is row number,
}
}