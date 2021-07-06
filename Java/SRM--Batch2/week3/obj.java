package Day13;

public class objcla {

	public static void main(String[] args) {
		String str="varsha";
		System.out.println(str);
		StringBuffer str2=new StringBuffer(str);
		System.out.println(str2.length());
		System.out.println(str2.getClass()+" "+str2.hashCode());
		
		String str1="thaaru";
		System.out.println(str1.toString());
		
		String str3="ramya";
		System.out.println(str3.toString());
		
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		System.out.println(str3.hashCode());
		
		System.out.println(str.getClass());


	}

}
