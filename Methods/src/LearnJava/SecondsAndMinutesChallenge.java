package LearnJava;

public class SecondsAndMinutesChallenge {

	public static final String INVALID_VALUE_MESSAGE = "Invalid Value";

	public static void main(String[] args) {
		System.out.println(getDurationString(69, 5));
		System.out.println(getDurationString(780));

	}
	public static String getDurationString(int minutes , int seconds) {
		if((minutes >= 0) && (seconds >= 0 && seconds <= 59)) {
			int hours = minutes /60;
			int remainingMinutes = minutes % 60;
			String stringHours = hours + "h";
			if(hours <= 9) {
				stringHours = "0" + stringHours; 
			}
			String stringMinutes = remainingMinutes + "m";
			if(remainingMinutes <= 9) {
				stringMinutes = "0" + stringMinutes; 
			}
			String stringSeconds = seconds + "s";
			if(seconds <= 9) {
				stringSeconds = "0" + stringSeconds; 
			}
			return stringHours + " " + stringMinutes + " " + stringSeconds;

		}else {
			return INVALID_VALUE_MESSAGE;
		}
	}
	public static String getDurationString(int seconds) {
		if(seconds >= 0) {
			int minutes = seconds / 60;
			int remainingSeconds = seconds % 60;
			return getDurationString(minutes , remainingSeconds);
		}else {
			return INVALID_VALUE_MESSAGE;
		}

	}
}