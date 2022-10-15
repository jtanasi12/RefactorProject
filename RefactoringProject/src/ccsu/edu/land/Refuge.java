package ccsu.edu.land;

import ccsu.edu.xml.*;

public class Refuge extends Land implements XMLAble{

	public Refuge() {}

	@Override
	public String toXML() {
		return XMLUtil.createXML(this);
	}
}
