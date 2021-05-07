package test;

public class dynamicBinding {
	public static class superclass {
        void print() {
            System.out.println("print in superclass.");
        }
    }
  
    public static class subclass extends superclass {
    	@Override
        void print() {
            System.out.println("print in subclass.");
        }
    }
  
    public static void main(String[] args) {
        superclass A = new superclass();
        superclass B = new subclass();
        A.print();
        B.print();
    }
}
