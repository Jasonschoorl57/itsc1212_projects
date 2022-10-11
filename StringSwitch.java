public class StringSwitchdemo {

    public static getMonthNumber (String month) {

    int monthNumber = 0;

    if (month == null) {
        return monthNumber;
    }

    switch (month.toLowerCase()) {
        case "jan":
            monthNumber = 1;
            break;

        case "feb":
            monthNumber = 2;
            break;

        case "march":
            monthNumber = 3;
            break;

        case "April":
            monthNumber = 4;
            break;

        case "may":
            monthNumber = 5;
            break;

        case "june":
            monthNumber = 6;
            break;

        case "july":
            monthNumber = 7;
            break;

        case "august":
            monthNumber = 8;
            break;

        case "sept":
            monthNumber = 9;
            break;

        case "oct":
            monthNumber = 10;
            break;

        case "nov":
            monthNumber = 11;
            break;

        case "dec":
            monthNumber = 12;
            break;

        default:
            monthNumber = 0
            break;

    }
    return monthNumber;
}

public static void main(String[] args) {

    String month = "august";

    int returnedMonthNumber = 
        StringSwitchDemo.getMonthNumber(month);

    if (returnedMonthNumber == 0) {
        System.out.println("Invalid month");
    } else {
        System.out.println(returnedMonthNumber);

    }
}
    }
}
    

