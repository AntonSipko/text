package telran.strings;

public class Strings {
static public String javaVariable() {
	//TODO
	return"[a-zA-z$][\\w$]*|_[\\w$]+";
	
	
}
public static String zero_300() {
	return"[1-9]\\d?|[1-2]\\d\\d|300|0";
}
public static String ipv40ctet() {
	return "\\d\\d?|[0-1]\\d\\d|2([0-4]\\d|5[0-5])";
	
}
public static String ipV4Adrees() {
	String octet=ipv40ctet();
	return String.format("(%s)(\\.(%s)){3}", octet,octet);
}
private static String operand() {
    return String.format("((\\d+)?\\.(\\d+)?|\\d+|%s)",javaVariable());
}

private static String operator() {
    return "(\\+|\\-|\\*|\\/)";
}

public static String arithmeticExpression() {
    return String.format("\\s*%1$s(\\s*%2$s\\s*%1$s)*\\s*", operand(), operator());
}
}
