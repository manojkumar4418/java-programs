//The access level of a private modifier is only within the class. It cannot be accessed from outside the class.
import java.lang.reflect.Method;

 public class PrivateModifier{
    public static void main(String[] args) throws Exception
     {
       Method method = Meth.class.getDeclaredMethod("someMethod");
       method.setAccessible(true);
       method.invoke(null);
    }
}
