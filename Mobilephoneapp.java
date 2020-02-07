public class Mobilephoneapp{
    
    public static void main (String[] args){
        System.out.println("Welcome to use the program");
        System.out.println("Please choose one to the following options: Print_contacts, Add_contact, Remove_contact and exit");
        Contacts contact1=new Contacts("Rex","Xu",123456789,"fsf@gmail.com");
        Contacts contact2=new Contacts("John","fs",1234562,"ffsfsf@gmail.com");
        MobilePhone phone1=new MobilePhone();
        phone1.addContactList(contact1);
        phone1.addContactList(contact2);
        phone1.whichcommand(phone1);
    }
}