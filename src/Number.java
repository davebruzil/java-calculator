public class Number implements Expression {
private double number;
Number(double number) {
    this.number=number;
}
void setNumber(double number) {
    this.number=number;
}
    @Override
    public double calculate() {
        return number;
    }
}
