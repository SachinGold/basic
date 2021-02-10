package basic;

public class stringopration {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("sachin"); //21
		System.out.println("capacity before append:");
		System.out.println(sb.capacity());
		
	StringBuffer sb1=sb.append("sachin");//27
		System.out.println("capacity after append:");
		
		System.out.println(sb1.capacity());
		System.out.println(sb);
		//System.out.println(sb.capacity());
	}

}
