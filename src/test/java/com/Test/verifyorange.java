package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.Orangepom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class verifyorange extends BaseClass{

	@Test
	public void verifyorange_tc001() {
		Orangepom orange=PageFactory.initElements(driver, Orangepom.class);
		Library.Custom_senkeys(orange.getUsername(),"Admin");
		Library.Custom_senkeys(orange.getPassword(),"admin123");
		Library.Custom_Click(orange.getLoginbtn());
	}
}
