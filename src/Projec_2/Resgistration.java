package Projec_2;

public class Resgistration {
      /*
    Create Registration Class in which you would have variables such as email,
userName and password that have an access scope only within its own class.
After creating an object of the class, the user should be able to call methods
and in each method separately pass values to set users email, username and
password.
Requirements:
● Valid email consider to be only yahoo
● Valid userName and password cannot be empty and should be of
length larger than 6 characters. Also valid passwords cannot contain
userName.
     */
    private  String email;
    private String username;
    private String password;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        if (email.endsWith("@yahoo.com")){
            System.out.println("The email looks good");
        }else {
            System.out.println("Please choose yahoo.com email");
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
        if(username.length()>6){
            System.out.println("The user name is is good to use");
        }else{
            System.out.println("Please choose another user name");
        }

        }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
        if (password.length() > 6 && !password.contains(username)) {
            System.out.println("Strong password");
        } else {
            System.out.println("passwprd is weak");
        }
    }

    public static void main(String[] args) {
        Resgistration resgistration=new Resgistration();
        resgistration.setEmail("Syntaxstudent@yahoo.com");
        resgistration.setUsername("Mr. Karimi");
        resgistration.setPassword("Asghar1234567");
    }
    }