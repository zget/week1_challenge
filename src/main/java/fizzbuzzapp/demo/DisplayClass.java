package fizzbuzzapp.demo;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class DisplayClass {


    String message_to_url=" ";
    @RequestMapping("/")
    public String MainController()
    {
        fizzBuzzclass myFizzBuzzInstance=new fizzBuzzclass();
        BonusClass myBonusInstance= new BonusClass();

        System.out.println("Enter the Ending number:");
        Scanner keyboard=new Scanner(System.in);

        int counter=keyboard.nextInt();

        for(int i=1; i<counter;i++)

            message_to_url=message_to_url+"  " + myFizzBuzzInstance.fizzBuzz(i);

        message_to_url=message_to_url+myBonusInstance.multiplesCounter(counter);

        return message_to_url;
    }


}
