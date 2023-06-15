

   public class User {
     private  String userName , email , password , confirmPassword ;

       public User(String userName, String email, String password, String confirmPassword) {
           this.userName = userName;
           this.email = email;
           this.password = password;
           this.confirmPassword = confirmPassword;
       }

       public User() {//for firebase

       }

       public String getUserName() {
           return userName;
       }

       public void setUserName(String userName) {
           this.userName = userName;
       }

       public String getEmail() {
           return email;
       }

       public void setEmail(String email) {
           this.email = email;
       }

       public String getPassword() {
           return password;
       }

       public void setPassword(String password) {
           this.password = password;
       }

       public String getConfirmPassword() {
           return confirmPassword;
       }

       public void setConfirmPassword(String confirmPassword) {
           this.confirmPassword = confirmPassword;
       }

       @Override
       public String toString() {
           return "User{" +
                   "userName='" + userName + '\'' +
                   ", email='" + email + '\'' +
                   ", password='" + password + '\'' +
                   ", confirmPassword='" + confirmPassword + '\'' +
                   '}';
       }
   }
