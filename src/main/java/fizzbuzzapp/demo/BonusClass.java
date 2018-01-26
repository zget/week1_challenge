package fizzbuzzapp.demo;

public class BonusClass
{
    int multipleOf7, multipleOf17,multipleOf23;
    public  String multiplesCounter(int upperLimit)
    {
        for(int i=1;i<=upperLimit;i++) {
            if (i % 7 == 0 && i % 17 == 0 && i % 23 == 0) {
                multipleOf7++;
                multipleOf17++;
                multipleOf23++;
            } else if (i % 7 == 0 && i % 17 == 0) {
                multipleOf7++;
                multipleOf17++;
            } else if (i % 7 == 0 && i % 23 == 0) {
                multipleOf7++;
                multipleOf23++;
            } else if (i % 17 == 0 && i % 23 == 0) {
                multipleOf17++;
                multipleOf23++;
            } else if (i % 7 == 0) {
                multipleOf7++;
            } else if (i % 17 == 0) {
                multipleOf17++;
            } else if (i % 23 == 0) {
                multipleOf23++;
            }
        }
        return " the number of multiples of 7 is: "+multipleOf7+"<br/>"+" the number of multiples of 17 is: "+multipleOf17+"<br/>"+
                " the number of multiples of 23 is: "+multipleOf23;
    }


}
