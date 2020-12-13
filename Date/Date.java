

public class Date{
    private int month, day, year;

    public Date(int month, int day, int year){
        if(month > 0 && month < 13)
            this.month = month;
        else{
            System.out.println("month invalid arguement.. setting default month = 1");
            this.month = 1;
        }
        if(day > 0 && month < 32)
            this.day = day;
        else{
            System.out.println("day invalid arguement.. setting default day = 1");
            this.day = 1;
        }
        if(year > 0)
            this.year = year;
        else{
            System.out.println("year invalid arguement.. setting default year = 2020");
            this.year = 2020;
        }
    }

    public void setDate(int month, int day, int year){
        if(month > 0 && month < 13)
            this.month = month;
        else{
            System.out.println("month invalid arguement.. month not set");
        }
        if(day > 0 && month < 32)
            this.day = day;
        else{
            System.out.println("day invalid arguement.. day not set");
        }
        if(year > 0)
            this.year = year;
        else{
            System.out.println("year invalid arguement.. year not set");
        }
    }

    public int getDay(){
        return this.day;
    }
    public int getMonth(){
        return this.month;
    }
    public int getYear(){
        return this.year;
    }
    public void printDate(){
        System.out.printf("%d/%d/%d", this.day, this.month, this.year);
    }

    public static void main(String[] args) {
        Date mydate = new Date(6, 17, 1999);
        System.out.print("date1: ");
        mydate.printDate();
        System.out.println();
        mydate.setDate(14, 17, 1999); // get invalid arg error
        System.out.print("date2: ");
        mydate.printDate();
        System.out.println();
        System.out.printf("get year = %d\n", mydate.getYear());
    }
}
