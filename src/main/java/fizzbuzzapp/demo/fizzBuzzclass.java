package fizzbuzzapp.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class fizzBuzzclass
{

    String message=" ";
    @RequestMapping("/")
    public String MainController()
    {
        for(int i=1; i<100;i++)

            message=message+"  " + display(i);

        return message;
    }



    public String display(int i) {

        if(i%3==0 && i%5==0)
            message="FizzBuzz";
        else if(i%3==0)
            message="Fizz";
        else if(i%5==0)
            message="Buzz";
        else
            message=Integer.toString(i);

        return message;
    }
}




