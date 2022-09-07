package MyFirstPackageGIT;

public class LoginGIT {
        String UserName;
        String Password;
        public LoginGIT(String UserID, String Pass) {
            this.UserName= UserID;
            this.Password= Pass;
        }

        public void setUserName(String userName) {
            UserName = userName;
        }

        public void setPassword(String password) {
            Password = password;
        }

        public String getUserName() {
            return UserName;
        }

        public String getPassword() {
            return Password;
        }

        public static void main(String[] args) {
            LoginGIT Meenu = new LoginGIT("sharma123", "meenu20");
            System.out.println(Meenu.getUserName());
            System.out.println(Meenu.getPassword());
        }
    }


