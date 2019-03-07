public abstract class Employee {
    private String str;
    protected Payment pmnt;

    public Employee(String s) {

    }

    public String getName() {return this.str;}

    public String getPayType() {return this.pmnt.getType();}

    public abstract void calcSalary();

    public abstract String getEmpType();

    public void setPayment(Payment p) {}
}
