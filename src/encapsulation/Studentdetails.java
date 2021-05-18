package encapsulation;

public class Studentdetails {
private String name="Johnny";
private String CouseName="Java";
private double fees=900.00;
public String getCouseName() {
	return CouseName;
}
public void setCouseName(String couseName) {
	CouseName = couseName;
}
public String getName() {
	return name;
}
public double getFees() {
	return fees;
}
}
