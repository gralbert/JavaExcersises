package lesson4;

import lesson3.Product;

public class AccountManagerImpl implements MailAccountManager{
    public void registerNewAccount(String email, String password, Person person)
            throws DuplicateAccountException{

    }
    public void removeAccount(String email, String password){

    }
    public boolean hasAccount(String email){
        return true;
    }
    public Person getPerson(String email, String password) throws
            TooManyLoginAttemptsException{
        Person person1 = new Person(54554, "Vladimir",
                "Petrov", "Semenovich", "11.08.1987");
        return person1;
    }
    public int numOfAccounts(){
        return 1;
    }

}
