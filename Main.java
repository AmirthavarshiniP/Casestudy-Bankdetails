package Bank;
public class Main {
    public static void main(String[] args) {
        Caccount1 c1 = new Caccount1();
        c1.Basic_account();
        c1.createaccount();
        System.out.println("The interest rate is 7%");
        c1.interestrate();
        System.out.println("\n");
        System.out.println("This is a loan account");
        Educationaloan e1 = new Educationaloan();
        e1.e_loan();
        e1.p_loan();
        e1.createaccount();
        System.out.println("The interest rate is 10%");
        e1.interestrate();
        System.out.println("\n");
        System.out.println("This is a savings account");
        Basicsaving b1 = new Basicsaving();
        b1.bas_save();
        b1.createaccount();
        System.out.println("The interest rate is 6%");
        b1.interestrate();
        }
    }
