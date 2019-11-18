package itta.cours;

import javax.ejb.Local;
import javax.ejb.Remote;


@Remote
public interface PerrinSessionBeanLocal {
    public String helloWorld();
}
