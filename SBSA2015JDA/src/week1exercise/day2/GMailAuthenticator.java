<<<<<<< HEAD
package week1exercise.day2;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;


class GMailAuthenticator extends Authenticator {
     String user;
     String pw;
     public GMailAuthenticator (String username, String password)
     {
        super();
        this.user = username;
        this.pw = password;
     }
    public PasswordAuthentication getPasswordAuthentication()
    {
       return new PasswordAuthentication(user, pw);
    }
=======
package week1exercise.day2;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;


class GMailAuthenticator extends Authenticator {
     String user;
     String pw;
     public GMailAuthenticator (String username, String password)
     {
        super();
        this.user = username;
        this.pw = password;
     }
    public PasswordAuthentication getPasswordAuthentication()
    {
       return new PasswordAuthentication(user, pw);
    }
>>>>>>> a0d16c50b58db7fd4c91f21d228ec42f4562aaec
}