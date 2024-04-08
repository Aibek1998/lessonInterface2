public class Hotel implements Payments{
    @Override
    public String livein() {
        return "Rent";
    }

    @Override
    public String nameOfPayments() {
        return "Daily payment";
    }
}
