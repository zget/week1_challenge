package fizzbuzzapp.demo;


public class fizzBuzzclass
{




    public  String fizzBuzz(int i)
    {
        String message_from_method=" ";
        if(i%3==0 && i%5==0)
            message_from_method="FizzBuzz<br/>";
        else if(i%3==0)
            message_from_method="Fizz<br/>";
        else if(i%5==0)
            message_from_method="Buzz<br/>";
        else
            message_from_method=Integer.toString(i)+"<br/>";

        return message_from_method;
    }


}




