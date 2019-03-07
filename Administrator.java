public class Administrator extends Employee {

    public Administrator(String s) {
        super(s);
    }

    @Override
    public String getEmpType() {return this.getPayType();}

    @Override
    public void calcSalary() {}
}
