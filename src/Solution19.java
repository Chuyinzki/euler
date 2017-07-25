public class Solution19 {

    public static void main(String[] args) {
        int year = 1900;
        int day = 1;

        long firstSundayCount = 0;
        day = (day + 365) % 7;
        year++;

        for (int i = year; i < 2001; i++) {
            for (int j = 1; j < 13; j++) {
                day %= 7;
                if (day == 0)
                    firstSundayCount++;
                switch (j) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        day += 31;
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        day += 30;
                        break;
                    case 2:
                        day += (year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0) ? 29 : 28;
                }
            }
        }

        System.out.println("The final solution is: " + firstSundayCount);
    }
}
