package Bank;

public abstract class Currentaccount implements Bankaccount{
    int depo = 500000;
    int r = 7;
    int n = 5;
    int interest = (depo*r*n)/100;
    @Override
    public void createaccount() {
        System.out.println("Your amount in account is Rs."+depo);
    }

    @Override
    public void interestrate() {
        System.out.println("The interest offered is:"+interest);
    }
}
