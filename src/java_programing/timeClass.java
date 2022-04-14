package java_programing;

import java.util.Scanner;

public class timeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time first_time = new Time(10,10,10);
		Scanner scanner = new Scanner(System.in);
		int hour=scanner.nextInt();
		int min=scanner.nextInt();
		int sec=scanner.nextInt();
		Time second_time = new Time(hour,min,sec);
		Time add_time=first_time.add(second_time);
		Time sub_time=first_time.sub(second_time);
		
		System.out.println("두 시간의 합은");
		add_time.print();
		
		System.out.println("두 시간의 차는");
		sub_time.print();
		
		String result=first_time.compare(second_time);
		System.out.println(result);

	}

}
class Time{
	private int day;
	private int hour;
	private int min;
	private int sec;
	
	public Time(int hour, int min, int sec)
	{
		this.hour=hour;
		this.min=min;
		this.sec=sec;
	}
	
	public Time(int day,int hour, int min, int sec)
	{
		this.day=day;
		this.hour=hour;
		this.min=min;
		this.sec=sec;
	}
	
	public Time add(Time time)
	{
		int add_sec=this.hour*3600+time.hour*3600+this.min*60+time.min*60+this.sec+time.sec;
		int new_hour=add_sec/3600;
		int temp=add_sec%3600;
		int new_min=temp/60;
		int new_sec=temp%60;
		int new_day=0;
		if(new_hour>24)
		{
			new_day=new_day+1;
			new_hour=new_hour-24;
		}
		return new Time(new_day,new_hour,new_min,new_sec);
	}
	
	public Time sub(Time time)
	{
		int sub_sec=(this.hour*3600+this.min*60+this.sec)-(time.hour*3600+time.min*60+time.sec);
		
		int new_hour=sub_sec/3600;
		int temp=sub_sec%3600;
		int new_min=temp/60;
		int new_sec=temp%60;
		int new_day=0;
		if(new_hour<0)
		{
			new_day=new_day-1;
		}
		
		if(sub_sec<0)
		{
			new_hour=new_hour*-1;
			new_min=new_min*-1;
			new_sec=new_sec*-1;
		}
		return new Time(new_day,new_hour,new_min,new_sec);
	}
	
	public String compare(Time time)
	{
		int first_sec=this.hour*3600+this.min*60+this.sec;
		int second_sec=time.hour*3600+time.min*60+time.sec;
		
		if(first_sec==second_sec)
		{
			String result="동일한 날입니다";
			return result;
		}
		else
		{
			String result="다른 날입니다";
			return result;
		}
		
	}
	
	public void print()
	{
		String new_day="";
		if(this.day==-1)
		{
			new_day="전일";
		}
		else if(this.day==1)
		{
			new_day="후일";
		}
		else
		{
			new_day="당일";
		}
		System.out.println(new_day+" "+this.hour+"시"+this.min+"분"+this.sec+"초 입니다.");
	}
}
