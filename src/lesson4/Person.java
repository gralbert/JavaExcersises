package lesson4;

public class Person {
    final long id;
    protected String name;
    protected String surname;
    protected String patronymic;
    protected String dateOfBirth;


    public Person(long id, String name, String surname,
                  String patronymic,  String dateOfBirth) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
    }

    public long getID(){
        return id;
    }

    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public String getPatronymic(){
        return patronymic;
    }
    public String getDateOfBirth(){
        return dateOfBirth;
    }

    public void setName(String name){
        this.name = name;
    }

    public void printInfo() {
        System.out.println("ИД: " + id +
                ", Фамилия: " + surname +
                ", Имя: "+ name +
                ", Отчество: " + patronymic);
    }

}