package Hw3;

public class SecondTask {
    public static void main(String[] args) {
        System.out.println("The month is " + printMonthInWordFirstMethode(7));
        System.out.println("The month is " + printMonthInWordSecondMethode(8));
    }

    static String printMonthInWordFirstMethode(int numberOfMonth) {
        if (numberOfMonth == 1) {
            return "JAN";
        } else if (numberOfMonth == 2) {
            return "FEB";
        } else if (numberOfMonth == 3) {
            return "MAR";
        } else if (numberOfMonth == 4) {
            return "APR";
        } else if (numberOfMonth == 5) {
            return "MAY";
        } else if (numberOfMonth == 6) {
            return "JUN";
        } else if (numberOfMonth == 7) {
            return "JUL";
        } else if (numberOfMonth == 8) {
            return "AUG";
        } else if (numberOfMonth == 9) {
            return "SEP";
        } else if (numberOfMonth == 10) {
            return "OCT";
        } else if (numberOfMonth == 11) {
            return "NOV";
        } else if (numberOfMonth == 12) {
            return "DEC";
        }

        return "not valid";
    }

    static String printMonthInWordSecondMethode(int numberOfMonth) {
        String month;

        switch (numberOfMonth) {
            case 1: month = "JAN";
                break;
            case 2: month = "FEB";
                break;
            case 3: month = "MAR";
                break;
            case 4: month = "APR";
                break;
            case 5: month = "MAY";
                break;
            case 6: month = "JUN";
                break;
            case 7: month = "JUL";
                break;
            case 8: month = "AUG";
                break;
            case 9: month = "SEP";
                break;
            case 10: month = "OCT";
                break;
            case 11: month = "NOV";
                break;
            case 12: month = "DEC";
                break;
            default: month = "not valid";
        }

        return month;
    }
}
