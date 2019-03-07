public class Technical extends Employee {

    public Technical(String s) {
        super(s);
    }

    @Override
    public String getEmpType() {return this.getPayType();}

    @Override
    public void calcSalary() {}
}
