import java.util.Scanner;



import java.util.*; 
public class MobilePhone{
    private ArrayList<Contacts> ContactList =new ArrayList<Contacts>();
    Scanner scanner = new Scanner(System.in);
    public MobilePhone(){

    }

    public ArrayList<Contacts> getContactList() {

        return ContactList;
    }
    public void  printContractList() {
        for (Integer i=0;i<ContactList.size();i++){
            System.out.println(ContactList.get(i).getName());
        }
    }
    public boolean contact_exist(String name){
        for (Integer i=0;i<ContactList.size();i++){
            if (ContactList.get(i).getName().equals(name)){
                return true;
            }
        } 
        return false;
    }
    public void addContactList(Contacts contact1) {
        ContactList.add(contact1);
    }
    public void removeContactList(Contacts contact1) {
        ContactList.remove(contact1);
    }
    public String repeat(){
        
        System.out.println("Please enter one of the following commands:Print_contacts,Add_contact,Remove_contact or exit ");
        String command=scanner.next();
        return command;
    }
    public void whichcommand(MobilePhone phone1 ){
        String command=scanner.next();
        while (!command.equals("exit")){
            if (command.equals("Print_contacts"))
            {
                System.out.println("Here are the contacts on the phone");
                phone1.printContractList();  
                command=phone1.repeat();              

                
            }
            else if (command.equals("Add_contact"))
            {
                System.out.println("Please add the contact by entering the contact's name, last_name, phone_number and email address,separeted by comma");
                String []contact_info= scanner.next().split(",");
                while (phone1.contact_exist(contact_info[0])==true){
                    System.out.println("The user you try to add already exists");
                    System.out.println("Please add the contact by entering the contact's name, last_name, phone_number and email address,separeted by comma");
                    contact_info= scanner.next().split(",");
                }
                Integer phone_num=Integer.valueOf(contact_info[2]);
                Contacts contact1=new Contacts(contact_info[0],contact_info[1],phone_num,contact_info[3]);
                phone1.addContactList(contact1);
                System.out.println("The user you have successfully added this user");
                command=phone1.repeat();   

                
            }
            else if (command.equals("Remove_contact"))
            {   
                System.out.println("Please enter the name of the contact that you want to delete ");
                String name= scanner.next();
                while (phone1.contact_exist(name)==false){
                    System.out.println("The user you try to delete does not exist");
                    System.out.println("Please add the contact you want to delete");
                    name= scanner.next();
                }
                for (Integer i=0;i<ContactList.size();i++){
                    if (ContactList.get(i).getName().equals(name)){
                        ContactList.remove(i);
                    }
                } 
                System.out.println("You have successfully removed this contact");
                command=phone1.repeat();    

            }
            else{
                System.out.println("Please enter a valid commmand");
                command=phone1.repeat();    

            }
        }
        System.out.println("You have exited the program ");
        


    }


}