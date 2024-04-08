import java.util.Arrays;

public class Family {
     String human [] ;
     String payments;

    public Family(String[] human, String payments) {
        this.human = human;
        this.payments = payments;
    }

    @Override
    public String toString() {
        return "\n" +
                "human : " + Arrays.toString(human) + "\n"+
                "payments : " + payments ;
    }

}
