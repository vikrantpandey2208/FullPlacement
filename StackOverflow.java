
class StackOverFlow{
	public static void main(String args[]){
		fun(1);
	}
	static void fun(int i){
		System.out.println("Java "+i);
		fun(++i);
	}
}