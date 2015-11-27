
public class Revers {

	public static void main(String[] args) {
		
		
		int a=445342;
		String b=String.valueOf(a);
		System.out.println(b);
		System.out.println(b.length());

		int j=b.length()-1;
        String s="";
		for(int i=0;i<b.length();i++)
		{
			s=s+b.charAt(j);
		//	System.out.println(s);
			j--;
		
		
		}
		System.out.println(s);
		  StringBuffer k = new StringBuffer("Java");
	      System.out.println(k.reverse());
	      k.setCharAt(2,'k');
	      System.out.println(k);
	      k.append('s');
	      System.out.println(k);
	      k.append(true);
	      System.out.println(k);
	}

}
