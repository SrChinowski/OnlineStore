package dataBase;

import java.io.Serializable;

public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private String password;
    private String email;
    private String creditCard;
    private String PIN;

    Usuario(String name, String email, String password, String creditCard) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.creditCard = creditCard;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public String getPIN() {
        return PIN;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public void setPIN(String PIN) {
        this.PIN = PIN;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", creditCard='" + creditCard + '\'' +
                '}';
    }
}
