class Date {
    int day;
    int month;
    int year;
    

    Date() {
        day = 1;
        month = 1;
        year = 1970;
    }
    
    Date(int day) {
        this.day = day;
        month = 1;
        year = 1970;
    }
    
    Date(int day, int month) {
        this.day = day;
        this.month = month;
        year = 1970;
    }
    
    Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    

    Date getPreviousDay() {
        int prevDay = day - 1;
        int prevMonth = month;
        int prevYear = year;
        if (prevDay < 1) {
            prevMonth--;
            if (prevMonth < 1) {
                prevYear--;
                prevMonth = 12;
            }
            prevDay = getDaysInMonth(prevMonth, prevYear);
        }
        return new Date(prevDay, prevMonth, prevYear);
    }
    
 
    Date getNextDay() {
        int nextDay = day + 1;
        int nextMonth = month;
        int nextYear = year;
        int daysInMonth = getDaysInMonth(month, year);
        if (nextDay > daysInMonth) {
            nextMonth++;
            if (nextMonth > 12) {
                nextYear++;
                nextMonth = 1;
            }
            nextDay = 1;
        }
        return new Date(nextDay, nextMonth, nextYear);
    }
    
    
    void print() {
        System.out.println(day + "/" + month + "/" + year);
    }
    

    int getDaysInMonth(int month, int year) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month - 1];
    }
    
 
    boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        }
        return false;
    }


    public static void main(String args[]) {
        Date date = new Date(1, 04, 2023);
        date.print();
        date.getPreviousDay().print();
        date.getNextDay().print();
    }
    
}

