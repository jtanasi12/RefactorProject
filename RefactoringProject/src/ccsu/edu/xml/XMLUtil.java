package ccsu.edu.xml;
import ccsu.edu.foods.*;

public class XMLUtil {

	public XMLUtil() {}
	
	public String simpleAttributeToXML(XMLAble passed){
		
		String returned = passed.toString();
 		return returned;
	}
	
	public String complexAttributesToXML(XMLAble passed) {
		String returned = " is ready to be delivered.";
		
		return returned;
	}
	public String classToXML(XMLAble passed, String returnXMl) {
		String returned = "\nThank you for your patience!";
		
		
		return returned;
	}
	static public String createXML(XMLAble passed) {
		XMLUtil xmlUtil = new XMLUtil();
		
		String returnXML = xmlUtil.simpleAttributeToXML(passed);
		
		returnXML += xmlUtil.complexAttributesToXML(passed);
		returnXML += xmlUtil.classToXML(passed, returnXML);
		
		return returnXML;
		
	}
}
