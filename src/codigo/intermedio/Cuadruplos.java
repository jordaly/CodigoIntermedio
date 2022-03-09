package codigo.intermedio;

import java.util.ArrayList;
import java.util.List;

public class Cuadruplos {
	private List<String> c;

	public List<String> cuadruplos(String cadena) {
		List<String> s = new ArrayList<String>();
		c = new ArrayList<String>();
		String sAux = "";
		String asg = "";
		int k = 0;
		if(cadena.charAt(1) == '=') {
			asg = String.valueOf(cadena.charAt(0));
			cadena = cadena.substring(2);
		}
		if(cadena.contains("(") && cadena.contains(")")) {
			String subcadena = cadena.substring(cadena.indexOf("("), cadena.indexOf(")") + 1);
			sAux = subcadena;
			for(int i = 0; i < subcadena.length(); i++) {
				switch(subcadena.charAt(i)) {
				case '+':
					s.add(String.valueOf(subcadena.charAt(i)));
					break;
				case '-':
					s.add(String.valueOf(subcadena.charAt(i)));
					break;
				case '*':
					s.add(String.valueOf(subcadena.charAt(i)));
					break;
				case '/':
					s.add(String.valueOf(subcadena.charAt(i)));
					break;
				}
			}
			for(int i = 0; i < s.size(); i++) {
				if(s.get(i).equals("*") || s.get(i).equals("/")) {
					int posicion = subcadena.indexOf(s.get(i));
					k++;
					if(isNumeric(String.valueOf(subcadena.charAt(posicion - 1))) && String.valueOf(subcadena.charAt(posicion + 1)).equals("t")) {
						c.add("("+ subcadena.charAt(posicion) + ","+ subcadena.substring(posicion - 2, posicion) + ","+ subcadena.substring(posicion + 1, posicion + 3) + "," + "t" + k + ")");
						subcadena = subcadena.substring(0, posicion - 2) + "t" + k + subcadena.substring(posicion + 2);
					}
					else if(isNumeric(String.valueOf(subcadena.charAt(posicion - 1)))) {
						c.add("("+ subcadena.charAt(posicion) + ","+ subcadena.substring(posicion - 2, posicion) + ","+ subcadena.charAt(posicion + 1) + "," + "t" + k + ")");
						subcadena = subcadena.substring(0, posicion - 2) + "t" + k + subcadena.substring(posicion + 2);
					}
					else if(String.valueOf(subcadena.charAt(posicion + 1)).equals("t")) {
						c.add("("+ subcadena.charAt(posicion) + ","+ subcadena.charAt(posicion - 1) + ","+ subcadena.substring(posicion + 1, posicion + 3) + "," + "t" + k + ")");
						subcadena = subcadena.substring(0, posicion - 1) + "t" + k + subcadena.substring(posicion + 3);
					}
					else {
						c.add("("+ subcadena.charAt(posicion) + ","+ subcadena.charAt(posicion - 1) + ","+ subcadena.charAt(posicion + 1) + "," + "t" + k + ")");
						subcadena = subcadena.substring(0, posicion - 1) + "t" + k + subcadena.substring(posicion + 2);
					}
				}
			}

			for(int i = 0; i < s.size(); i++) {
				if(s.get(i).equals("+") || s.get(i).equals("-")) {
					int posicion = subcadena.indexOf(s.get(i));
					k++;
					if(isNumeric(String.valueOf(subcadena.charAt(posicion - 1))) && String.valueOf(subcadena.charAt(posicion + 1)).equals("t")) {
						c.add("("+ subcadena.charAt(posicion) + ","+ subcadena.substring(posicion - 2, posicion) + ","+ subcadena.substring(posicion + 1, posicion + 3) + "," + "t" + k + ")");
						subcadena = subcadena.substring(0, posicion - 2) + "t" + k + subcadena.substring(posicion + 2);
					}
					else if(isNumeric(String.valueOf(subcadena.charAt(posicion - 1)))) {
						c.add("("+ subcadena.charAt(posicion) + ","+ subcadena.substring(posicion - 2, posicion) + ","+ subcadena.charAt(posicion + 1) + "," + "t" + k + ")");
						subcadena = subcadena.substring(0, posicion - 2) + "t" + k + subcadena.substring(posicion + 2);
					}
					else if(String.valueOf(subcadena.charAt(posicion + 1)).equals("t")) {
						c.add("("+ subcadena.charAt(posicion) + ","+ subcadena.charAt(posicion - 1) + ","+ subcadena.substring(posicion + 1, posicion + 3) + "," + "t" + k + ")");
						subcadena = subcadena.substring(0, posicion - 1) + "t" + k + subcadena.substring(posicion + 3);
					}
					else {
						c.add("("+ subcadena.charAt(posicion) + ","+ subcadena.charAt(posicion - 1) + ","+ subcadena.charAt(posicion + 1) + "," + "t" + k + ")");
						subcadena = subcadena.substring(0, posicion - 1) + "t" + k + subcadena.substring(posicion + 2);
					}
				}
			}
			s.clear();
			cadena = cadena.replace(sAux, "t" + k);

			for(int i = 0; i < cadena.length(); i++) {
				switch(cadena.charAt(i)) {
				case '+':
					s.add(String.valueOf(cadena.charAt(i)));
					break;
				case '-':
					s.add(String.valueOf(cadena.charAt(i)));
					break;
				case '*':
					s.add(String.valueOf(cadena.charAt(i)));
					break;
				case '/':
					s.add(String.valueOf(cadena.charAt(i)));
					break;
				}
			}

			for(int i = 0; i < s.size(); i++) {
				if(s.get(i).equals("*") || s.get(i).equals("/")) {
					int posicion = cadena.indexOf(s.get(i));
					k++;
					if(isNumeric(String.valueOf(cadena.charAt(posicion - 1))) && String.valueOf(cadena.charAt(posicion + 1)).equals("t")) {
						c.add("("+ cadena.charAt(posicion) + ","+ cadena.substring(posicion - 2, posicion) + ","+ cadena.substring(posicion + 1, posicion + 3) + "," + "t" + k + ")");
						cadena = cadena.substring(0, posicion - 2) + "t" + k + cadena.substring(posicion + 2);
					}
					else if(isNumeric(String.valueOf(cadena.charAt(posicion - 1)))) {
						c.add("("+ cadena.charAt(posicion) + ","+ cadena.substring(posicion - 2, posicion) + ","+ cadena.charAt(posicion + 1) + "," + "t" + k + ")");
						cadena = cadena.substring(0, posicion - 2) + "t" + k + cadena.substring(posicion + 2);
					}
					else if(String.valueOf(cadena.charAt(posicion + 1)).equals("t")) {
						c.add("("+ cadena.charAt(posicion) + ","+ cadena.charAt(posicion - 1) + ","+ cadena.substring(posicion + 1, posicion + 3) + "," + "t" + k + ")");
						cadena = cadena.substring(0, posicion - 1) + "t" + k + cadena.substring(posicion + 3);
					}
					else {
						c.add("("+ cadena.charAt(posicion) + ","+ cadena.charAt(posicion - 1) + ","+ cadena.charAt(posicion + 1) + "," + "t" + k + ")");
						cadena = cadena.substring(0, posicion - 1) + "t" + k + cadena.substring(posicion + 2);
					}
				}
			}

			for(int i = 0; i < s.size(); i++) {
				if(s.get(i).equals("+") || s.get(i).equals("-")) {
					int posicion = cadena.indexOf(s.get(i));
					k++;
					if(isNumeric(String.valueOf(cadena.charAt(posicion - 1))) && String.valueOf(cadena.charAt(posicion + 1)).equals("t")) {
						c.add("("+ cadena.charAt(posicion) + ","+ cadena.substring(posicion - 2, posicion) + ","+ cadena.substring(posicion + 1, posicion + 3) + "," + "t" + k + ")");
						cadena = cadena.substring(0, posicion - 2) + "t" + k + cadena.substring(posicion + 2);
					}
					else if(isNumeric(String.valueOf(cadena.charAt(posicion - 1)))) {
						c.add("("+ cadena.charAt(posicion) + ","+ cadena.substring(posicion - 2, posicion) + ","+ cadena.charAt(posicion + 1) + "," + "t" + k + ")");
						cadena = cadena.substring(0, posicion - 2) + "t" + k + cadena.substring(posicion + 2);
					}
					else if(String.valueOf(cadena.charAt(posicion + 1)).equals("t")) {
						c.add("("+ cadena.charAt(posicion) + ","+ cadena.charAt(posicion - 1) + ","+ cadena.substring(posicion + 1, posicion + 3) + "," + "t" + k + ")");
						cadena = cadena.substring(0, posicion - 1) + "t" + k + cadena.substring(posicion + 3);
					}
					else {
						c.add("("+ cadena.charAt(posicion) + ","+ cadena.charAt(posicion - 1) + ","+ cadena.charAt(posicion + 1) + "," + "t" + k + ")");
						cadena = cadena.substring(0, posicion - 1) + "t" + k + cadena.substring(posicion + 2);
					}
				}
			}
			if(!asg.isEmpty())
				c.set(c.size() - 1, c.get(c.size() - 1).replace("t"+ k, asg));
			return c;
		}
		else {
			for(int i = 0; i < cadena.length(); i++) {
				switch(cadena.charAt(i)) {
				case '+':
					s.add(String.valueOf(cadena.charAt(i)));
					break;
				case '-':
					s.add(String.valueOf(cadena.charAt(i)));
					break;
				case '*':
					s.add(String.valueOf(cadena.charAt(i)));
					break;
				case '/':
					s.add(String.valueOf(cadena.charAt(i)));
					break;
				}
			}

			for(int i = 0; i < s.size(); i++) {
				if(s.get(i).equals("*") || s.get(i).equals("/")) {
					int posicion = cadena.indexOf(s.get(i));
					k++;
					if(isNumeric(String.valueOf(cadena.charAt(posicion - 1))) && String.valueOf(cadena.charAt(posicion + 1)).equals("t")) {
						c.add("("+ cadena.charAt(posicion) + ","+ cadena.substring(posicion - 2, posicion) + ","+ cadena.substring(posicion + 1, posicion + 3) + "," + "t" + k + ")");
						cadena = cadena.substring(0, posicion - 2) + "t" + k + cadena.substring(posicion + 2);
					}
					else if(isNumeric(String.valueOf(cadena.charAt(posicion - 1)))) {
						c.add("("+ cadena.charAt(posicion) + ","+ cadena.substring(posicion - 2, posicion) + ","+ cadena.charAt(posicion + 1) + "," + "t" + k + ")");
						cadena = cadena.substring(0, posicion - 2) + "t" + k + cadena.substring(posicion + 2);
					}
					else if(String.valueOf(cadena.charAt(posicion + 1)).equals("t")) {
						c.add("("+ cadena.charAt(posicion) + ","+ cadena.charAt(posicion - 1) + ","+ cadena.substring(posicion + 1, posicion + 3) + "," + "t" + k + ")");
						cadena = cadena.substring(0, posicion - 1) + "t" + k + cadena.substring(posicion + 3);
					}
					else {
						c.add("("+ cadena.charAt(posicion) + ","+ cadena.charAt(posicion - 1) + ","+ cadena.charAt(posicion + 1) + "," + "t" + k + ")");
						cadena = cadena.substring(0, posicion - 1) + "t" + k + cadena.substring(posicion + 2);
					}
				}
			}

			for(int i = 0; i < s.size(); i++) {
				if(s.get(i).equals("+") || s.get(i).equals("-")) {
					int posicion = cadena.indexOf(s.get(i));
					k++;
					if(isNumeric(String.valueOf(cadena.charAt(posicion - 1))) && String.valueOf(cadena.charAt(posicion + 1)).equals("t")) {
						c.add("("+ cadena.charAt(posicion) + ","+ cadena.substring(posicion - 2, posicion) + ","+ cadena.substring(posicion + 1, posicion + 3) + "," + "t" + k + ")");
						cadena = cadena.substring(0, posicion - 2) + "t" + k + cadena.substring(posicion + 2);
					}
					else if(isNumeric(String.valueOf(cadena.charAt(posicion - 1)))) {
						c.add("("+ cadena.charAt(posicion) + ","+ cadena.substring(posicion - 2, posicion) + ","+ cadena.charAt(posicion + 1) + "," + "t" + k + ")");
						cadena = cadena.substring(0, posicion - 2) + "t" + k + cadena.substring(posicion + 2);
					}
					else if(String.valueOf(cadena.charAt(posicion + 1)).equals("t")) {
						c.add("("+ cadena.charAt(posicion) + ","+ cadena.charAt(posicion - 1) + ","+ cadena.substring(posicion + 1, posicion + 3) + "," + "t" + k + ")");
						cadena = cadena.substring(0, posicion - 1) + "t" + k + cadena.substring(posicion + 3);
					}
					else {
						c.add("("+ cadena.charAt(posicion) + ","+ cadena.charAt(posicion - 1) + ","+ cadena.charAt(posicion + 1) + "," + "t" + k + ")");
						cadena = cadena.substring(0, posicion - 1) + "t" + k + cadena.substring(posicion + 2);
					}
				}
			}
			if(!asg.isEmpty())
				c.set(c.size() - 1, c.get(c.size() - 1).replace("t"+ k, asg));
			return c;
		}
	}
	
	//public List<String> getCuadruplos() {
	//	return cuadruplos;
	//}
	
	public boolean isNumeric(String cadena) {
		boolean v;
		try {
			Integer.parseInt(cadena);
			v = true;
		} catch (NumberFormatException excepcion) {
			v = false;
		}

		return v;
	}
}