package java8NewFeature.lambda;

public class LambbaDemo1 {
	
	//普通方法
	public int add(int x, int y) {
		return x + y;
	}
	
	//匿名方法 
	//1. (int x, int y) -> {return x+y};
	//2. (x,y)-> x+y;
	
	public Runnable run1 = ()->{System.out.println("run1....................");}; 
	public Runnable run2 = new Runnable() {
		@Override
		public void run() {
			System.out.println("run2...........");
			
		}
	};
	
	public static void main(String[] args) {
		LambbaDemo1 demo = new LambbaDemo1();
		demo.run1.run();
		demo.run2.run();
	}

}
