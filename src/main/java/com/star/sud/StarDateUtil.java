package com.star.sud;
/*@Author Sudarshan*/
import java.util.Calendar;

public class StarDateUtil {

	public static String getTodayDateAsRev(String splitter) {

		Integer[] dateArr = getTodayDateAsArr();
		return dateArr[2] + splitter + dateArr[1] + splitter + dateArr[0];
	}

	public static Integer[] getTodayDateAsArr() {

		Integer[] dateArr = new Integer[3];
		Calendar cal = Calendar.getInstance();

		dateArr[0] = cal.get(Calendar.DAY_OF_MONTH);
		dateArr[1] = cal.get(Calendar.MONTH) + 1;
		dateArr[2] = cal.get(Calendar.YEAR);

		return dateArr;
	}
}
