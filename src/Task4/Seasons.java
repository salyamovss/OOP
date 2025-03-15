package Task4;

public class Seasons {
    int month;

    public Seasons(int month) {
        this.month = month;
    }

    public String getSeason() {
        if (month < 1 || month > 12) {
            return "Invalid time";
        }

        if (month == 12 || month == 1 || month == 2) {
            return "Right now winter";
        } else if (month >= 3 && month <= 5) {
            return "Right now spring";
        } else if (month >= 6 && month <= 8) {
            return "Right now summer";
        } else {
            return "Right now autumn";
        }


    }
}
