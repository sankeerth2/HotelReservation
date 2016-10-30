package details;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Date {

	public boolean isWeekDay(String date) {
		SimpleDateFormat format1 = new SimpleDateFormat("MM/dd/yyyy");
		java.util.Date dt1;
		String finalDay = null;
		try {
			dt1 = format1.parse(date);
			DateFormat format2 = new SimpleDateFormat("EEEE");
			finalDay = format2.format(dt1);
			//System.out.println(finalDay);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		if (finalDay.equals("Saturday") || finalDay.equals("Sunday")) {
			return false;
		}

		return true;
	}

	public void dateSplitter(String mixedDates) {

		String[] dates = mixedDates.split(",");
		for (String string : dates) {
			System.out.println(string);

			Date dat = new Date();
			boolean b = dat.isWeekDay(string);
			System.out.println(b);
		}
	}
	
	public static void main(String[] args) {

		Date date = new Date();

		date.dateSplitter("10/30/2016,10/31/2016");
	}

}
