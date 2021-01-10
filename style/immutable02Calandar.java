package style;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class immutable02Calandar {
    private final Date releasedDate; 

    public immutable02Calandar(Date releasedDate){
        this.releasedDate = releasedDate;
    }

    /**
     * Not recommended
     * 
     */
	// public boolean isTwothousands(){
	// 	Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("KST"));
	// 	cal.set(2000, Calendar.JANUARY, 1, 0, 0, 0); 
	// 	Date start = cal.getTime();
	// 	cal.set(2010, Calendar.JANUARY, 1, 0, 0, 0);
	// 	Date end = cal.getTime();

	// 	return releasedDate.compareTo(start) >=0 && releasedDate.compareTo(end) <0;
	// }

    private static final Date START; 
	private static final Date END;

	static{
		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("KST"));
		cal.set(2000, Calendar.JANUARY, 1, 0, 0, 0); 
		START= cal.getTime();
		cal.set(2010, Calendar.JANUARY, 1, 0, 0, 0);
		END= cal.getTime();
	}

	public boolean isTwothousands(){
		return releasedDate.compareTo(START) >=0 && releasedDate.compareTo(END) <0;
	}
}
