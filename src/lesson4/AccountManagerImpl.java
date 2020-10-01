package lesson4;

import lesson3.Product;
import lesson3.ProductAlreadyExists;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class AccountManagerImpl implements MailAccountManager{
    CSVReader data = new CSVReader("/Users/Administrator/data2.csv");
    ArrayList<String[]> bd = data.read();
    public void registerNewAccount(String email, String password, Person person)
            throws DuplicateAccountException {
        for (String[] item: bd){
            String mail = item[0];
            if(mail.equals(email)){
                throw new DuplicateAccountException("Пользователь с такой почтой уже есть!");
            }
            else{
                String[] newLine = {email,password,person.getName(),
                        person.getSurname(), person.getPatronymic(), person.getDateOfBirth()};
                bd.add(newLine);
                data.write(bd);
            }

        }

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
