//package p564;
//
//import java.time.*;
//import java.time.temporal.*;
//import java.time.DayOfWeek.*;
//import java.time.temporal.TemporalAdjusters.*;
//
//import java.time.DayOfWeek.*;
//import java.time.temporal.*;
//
//class DayAfterTomorrow implements TemporalAdjuster {
//
//	@Override
//	public Temporal adjustInto(Temporal temporal) {		
//		return temporal.plus(2, ChronoUnit.DAYS);
//	}	
//}
//
//public class NewTimeEx3 {
//	
//	public static void main(String[] args) {
//		LocalDate today = LocalDate.now();
//		LocalDate date = today.with(new DayAfterTomorrow());
//		
//		p(today);
//		p(date);
//		p(today.with(firstDayOfNextMonth()));
//		p(today.with(firstDayOfMonth()));
//		p(today.with(lastDayOfMonth()));
//		p(today.with(firstInMonth(TUESDAY)));
//		p(today.with(lastInMonth(TUESDAY)));
//		p(today.with(previous(TUESDAY)));
//		p(today.with(previousOrSame(TUESDAY)));
//		p(today.with(next(TUESDAY)));
//		p(today.with(nextOrSame(TUESDAY)));
//		p(today.with(dayOfWeekInMonth(TUESDAY)));
//	}
//
//	static void p(Object obj) {
//		System.out.println(obj);
//		
//	}
//
//}
