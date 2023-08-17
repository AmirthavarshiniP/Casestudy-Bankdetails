package Bank;

public abstract class Savingsaccount implements Bankaccount{
    int depo = 500000;
    int r = 6;
    int n = 5;
    int interest = (depo*r*n)/100;

    @Override
    public void createaccount() {
        System.out.println("Your amount in account is Rs."+depo);
    }

    @Override
    public void interestrate() {
        System.out.println("Your account incurred a interest of Rs."+interest);
    }
}
