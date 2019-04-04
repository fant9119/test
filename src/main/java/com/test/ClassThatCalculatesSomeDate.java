package com.test;

import java.util.Calendar;
import java.util.Date;

public class ClassThatCalculatesSomeDate {

	private Date someDate;

	public ClassThatCalculatesSomeDate(int retainedYears) {
		someDate = calculateSomeDate(retainedYears);
	}

	private Date calculateSomeDate(int retainedYears) {
		Calendar baseCalendar = Calendar.getInstance();
		baseCalendar.add(Calendar.YEAR, -retainedYears);
		return baseCalendar.getTime();
	}
}
