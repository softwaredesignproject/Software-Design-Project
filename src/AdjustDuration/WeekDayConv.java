package AdjustDuration;


public class WeekDayConv {

	String date;
	WeekDayConv(String date){
		//pass in the string under date tag
		this.date = date;
	}
	
	public Weekday getWeekDay(){
		//Mine is using SE 6, so can't use switch string
		if(date == "Mon"){
			return Weekday.MON;
		}else if(date == "Tue"){
			return Weekday.TUE;
		}else if(date == "Wed"){
			return Weekday.WED;
		}else if(date == "Thu"){
			return Weekday.THU;
		}else if(date == "Fri"){
			return Weekday.FRI;
		}else{
			return Weekday.OTHERS;
		}
	}
}
