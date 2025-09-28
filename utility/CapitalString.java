package utility;

public class CapitalString {
	public String FirstLetterCapital(String str) {
		if(str==null||str.isEmpty())
			return str;
return Character.toUpperCase(str.charAt(0))+str.substring(1).toLowerCase();
	}

}
