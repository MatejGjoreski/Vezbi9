package zadacha2;

import java.util.*;

public class ClassMain {
	public static void main(String[] args) {
		List<Vraboten> v = new ArrayList<Vraboten>();
		v.add(new Vraboten("Stefan", "Stefanovski", "10000"));
		v.add(new Vraboten("Aleksandar", "Ristevski", "15000"));
		
		XML xml = new XML();
		xml.createXMLFile("xml2.xml", v);
	}
}
