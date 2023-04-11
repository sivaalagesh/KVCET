package day23;

public class EnumDemo 
{
	public enum Days{MON,TUE,WED,THURS,FRI,SAT,SUN}
	public enum Season{WINTER,SPRING,SUMMER,AUTUMN}

	public static void main(String[] args) 
	{
		System.out.println(Days.TUE);
		
		for(Days d:Days.values())
		{
			System.out.print(d+"\t");
		}
		
		for(Season s:Season.values())
		{
			System.out.println(s);
		}
		
		System.out.println(Season.WINTER);

	}

}
