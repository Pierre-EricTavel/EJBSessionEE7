
package itta.cours;

import javax.ejb.Stateless;


@Stateless()
public class PerrinSessionBean implements PerrinSessionBeanLocal {

    public String helloWorld(){
        return "Hello World";
    }
    
}
