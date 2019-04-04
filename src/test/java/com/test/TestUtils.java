package com.test;

import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.powermock.api.mockito.PowerMockito;

import java.util.Calendar;
import java.util.Date;

import static org.mockito.Mockito.when;

public class TestUtils {

	public static void mockCalendarInstance(Date currentDateTime) {
		PowerMockito.mockStatic(Calendar.class);
		when(Calendar.getInstance()).thenAnswer((Answer<Calendar>) invocation -> {
			Calendar realCalendar = Calendar.getInstance();
			realCalendar.setTime(currentDateTime);
			return realCalendar;
		});
	}
}
