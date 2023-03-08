
package s8_actividadenclase_carlosespinal_akeemieongham;

import java.util.*;

public class Registro {
    String Username;
    String Password;
    String Email;
    int ID;

    public Registro(String Username, String Password, String Email, int ID) {
        this.Username = Username;
        this.Password = Password;
        this.Email = Email;
        this.ID = ID;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Registro{" + "Username=" + Username + ", Password=" + Password + ", Email=" + Email + ", ID=" + ID + '}';
    }
    
    
}
