package Login1;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;

public class WORKINGWITHsikuli {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		Screen obj = new Screen();
		obj.click("C:\\\\Users\\\\hp\\\\Desktop\\\\Automation Testing\\\\SIKULI screenshots\\\\minimize.PNG");
		Thread.sleep(3000);
		obj.doubleClick("C:\\\\Users\\\\hp\\\\Desktop\\\\Automation Testing\\\\SIKULI screenshots\\open resume.PNG");
		Thread.sleep(3000);
		obj.click("C:\\\\Users\\\\hp\\\\Desktop\\\\Automation Testing\\\\SIKULI screenshots\\close resume.PNG");
		Thread.sleep(3000);
	}

}
