package by.academy.first_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Demo {
public static void main(String... args) {
//	Printable p=new Printable(){
//
//		@Override
//		public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
//			return 100;
//		}
//		
//	};
//	try {
//		System.out.println(p.print(null, null, 0));
//	} catch (PrinterException e) {
//		e.printStackTrace();
//	}
//	Food f=new Food();
//	String s="WTF?";
//	f.prepare(new Cookable() {
//
//		@Override
//		public void cook(String str) {
//			System.out.println("This str = "+str);
//		}
//		
//	},s);
//	Summarized<String, Double, Integer> s=new Summarized<>("WTF", 6.4,5);
//	s.printClass(s.getVariable1(),s.getVariable2(),s.getVariable3());
//	Matrix<Integer> m=new Matrix<>();
//	Integer s=5;
//	m.createMatrix(s);
//	Matrix<Double> m=new Matrix<>();
//	Double s=5.0;
//	m.createMatrix(s);
//	Matrix<Boolean> m=new Matrix<>();
//	Boolean s=true;
//	m.createMatrix(s);
//	Matrix<Character> m=new Matrix<>();
//	Character s='c';
//	m.createMatrix(s);
//	Double[] arr= {3.0,8.0,7.0,1.0,10.0,-20.0,13.0,50.0};
//	MinMax<Double> m=new MinMax<>(arr);
//	m.getMax();
//	m.getMin();
//	Integer[] arr1= {4,10,66,2,8,90,1,6,7,3,-1000};
//	MinMax<Integer> m1=new MinMax<>(arr1);
//	m1.getMax();
//	m1.getMin();
//	Float[] arr2= {3.0f,8.0f,7.0f,1.0f,10.0f,-20.0f,13.0f,50.0f};
//	MinMax<Float> m2=new MinMax<>(arr2);
//	m2.getMax();
//	m2.getMin();
//	System.out.println(Calculator.divide(7, 2));
//	System.out.println(Calculator.multiply(5, 7));
//	System.out.println(Calculator.sum(45, 78));
//	System.out.println(Calculator.subtraction(514, 1014));
	HeavyBox box1=new HeavyBox(10,20,30,40);
	HeavyBox box2=new HeavyBox(20,23,13,458);
	HeavyBox box3=new HeavyBox(30,357,35,37);
	HeavyBox box4=new HeavyBox(40,24,7,2);
	HeavyBox box5=new HeavyBox(50,876,3,44);
	ArrayList<HeavyBox> l=new ArrayList<>();
	l.add(box1);
	l.add(box2);
	l.add(box3);
	l.add(box4);
	l.add(box5);
	for(HeavyBox x:l) {
		System.out.println(x);
	}
	l.get(0).setWeight(1);
	for(HeavyBox x:l) {
		System.out.println(x);
	}
	l.remove(l.size()-1);
	for(HeavyBox x:l) {
		System.out.println(x);
	}
	Object[] arr=l.toArray();
	System.out.println(Arrays.toString(arr));
	Object[] arr1=new Object[l.size()];
	for(int i=0;i<l.size();i++) {
		arr1[i]=l.get(i);
	}
	System.out.println(Arrays.toString(arr1));
	HeavyBox[] arr2=l.toArray(new HeavyBox[0]);
	System.out.println(Arrays.toString(arr2));
//	l.clear();
	System.out.println(l.isEmpty());
	Set<HeavyBox> s=new TreeSet<>(l);
	for(HeavyBox x:s) {
		System.out.println(x);
	}
	
}
}
