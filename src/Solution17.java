public class Solution17 {

    private final static String one = "one";
    private final static String two = "two";
    private final static String three = "three";
    private final static String four = "four";
    private final static String five = "five";
    private final static String six = "six";
    private final static String seven = "seven";
    private final static String eight = "eight";
    private final static String nine = "nine";

    private final static String ten = "ten";
    private final static String eleven = "eleven";
    private final static String twelve = "twelve";
    private final static String thirteen = "thirteen";
    private final static String fifteen = "fifteen";

    private final static String twenty = "twenty";
    private final static String thirty = "thirty";
    private final static String forty = "forty";
    private final static String fifty = "fifty";

    private final static String hundred = "hundred";
    private final static String thousand = "thousand";

    public static void main(String[] args) {
        long count = 0;
        for (int i = 1; i <= 1000; i++)
            count += numToWord(i).replaceAll("\\s", "").replaceAll("-", "").length();
        System.out.println("The final count is: " + count);
    }

    private static String numToWord(int num) {
        StringBuilder builder = new StringBuilder();
        if (num >= 1000) {
            builder.append(underHundredToWord(num / 1000));
            builder.append(" ");
            builder.append(thousand);
            num = num % 1000;
        }
        if (num >= 100) {
            if (builder.length() > 0)
                builder.append(" ");
            builder.append(underHundredToWord(num / 100));
            builder.append(" ");
            builder.append(hundred);
            num = num % 100;
        }
        if (num > 0) {
            if (builder.length() > 0)
                builder.append(" and ");
            builder.append(underHundredToWord(num));
        }
        return builder.toString();
    }

    private static String underHundredToWord(int num) {
        //sub 20
        switch (num) {
            case 1:
                return one;
            case 2:
                return two;
            case 3:
                return three;
            case 4:
                return four;
            case 5:
                return five;
            case 6:
                return six;
            case 7:
                return seven;
            case 8:
                return eight;
            case 9:
                return nine;
            case 10:
                return ten;
            case 11:
                return eleven;
            case 12:
                return twelve;
            case 13:
                return thirteen;
            case 15:
                return fifteen;
        }

        //easy teens
        if (num > 10 && num < 20)
            return underHundredToWord(num % 10) + (num % 10 != 8 ? "t" : "") + "een";

        //tens
        StringBuilder buildy = new StringBuilder();
        switch (num / 10) {
            case 2:
                buildy.append(twenty);
                break;
            case 3:
                buildy.append(thirty);
                break;
            case 4:
                buildy.append(forty);
                break;
            case 5:
                buildy.append(fifty);
                break;
            default:
                buildy.append(underHundredToWord(num / 10));
                buildy.append(num / 10 != 8 ? "ty" : "y");

        }
        if (num % 10 > 0) {
            buildy.append("-");
            buildy.append(underHundredToWord(num % 10));
        }
        return buildy.toString();
    }
}
