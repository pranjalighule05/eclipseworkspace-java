package com.tcs;
import java.util.*;


	class Demo extends Thread {
	    ArrayList<Integer> data;

	    Demo(ArrayList<Integer> a) {
	        this.data = a;
	    }

	    public void run() {
	        for(int i=0; i<1000; i++) {
	            data.add(i);
	        }
	    }
	}

	class Test extends Thread {
	    ArrayList<Integer> data;

	    Test(ArrayList<Integer> a) {
	        this.data = a;
	    }

	    public void run() {
	        for(int i=0; i<1000; i++) {
	            data.add(i);
	        }
	    }
	}

	public class Sample {
	    public static void main(String args[]) throws Exception {
	        ArrayList<Integer> a1 = new ArrayList<>();

	        Demo d1 = new Demo(a1);
	        Test t1 = new Test(a1);

	        d1.start();
	        t1.start();

	        d1.join();
	        t1.join();

	        System.out.println(a1.size());
	    }
	}


