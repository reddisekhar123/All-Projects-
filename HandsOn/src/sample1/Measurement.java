package sample1;

public class Measurement {
private int value;
public Measurement(int m) {
	value= m;
}
public int getValue() {
	return value;
}
public void add(Measurement m) {
	value=value+m.getValue();
}
public void subtract(Measurement m) {
	value=value-m.getValue();
}
}
