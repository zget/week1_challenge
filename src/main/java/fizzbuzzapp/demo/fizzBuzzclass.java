package fizzbuzzapp.demo;


public class fizzBuzzclass
{




    public  String fizzBuzz(int i)
    {
        String message_from_method=" ";
        if(i%3==0 && i%5==0)
            message_from_method="FizzBuzz";
        else if(i%3==0)
            message_from_method="Fizz";
        else if(i%5==0)
            message_from_method="Buzz";
        else
            message_from_method=Integer.toString(i);

        return message_from_method;
    }


}




