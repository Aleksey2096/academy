package by.academy.first_tasks;

public class Calculator {
public static <T,V> double sum(T t, V v) {
	return Double.valueOf(t.toString())+Double.valueOf(v.toString());
}
public static <T,V> double multiply(T t, V v) {
	return Double.valueOf(t.toString())*Double.valueOf(v.toString());
}
public static <T,V> double divide(T t, V v) {
	return Double.valueOf(t.toString())/Double.valueOf(v.toString());
}
public static <T,V> double subtraction(T t, V v) {
	return Double.valueOf(t.toString())-Double.valueOf(v.toString());
}
}
