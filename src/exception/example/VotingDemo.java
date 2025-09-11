package exception.example;

// exception made by the user

class InvalidAgeException extends Exception{
    public InvalidAgeException(String msg){
        super(msg);
    }

    public InvalidAgeException() {

    }
}

class Voting{
    public void checkEligibility(int age) throws InvalidAgeException {
        if(age < 18){
            throw new InvalidAgeException("You are not eleigible to vote");
        }else{
            System.out.println("you are eleigible");
        }
    }
}

public class VotingDemo extends Voting {

    public static  void main(String[] args) throws InvalidAgeException{
    VotingDemo v = new VotingDemo();


        try {
        v.checkEligibility(7);
    }
//    catch(InvalidAgeException ex)

//    {
//        System.out.println(" Inc the age");
//    }
        finally {
            System.out.println("By Default Votes goes to BJP");
        }
}



}
