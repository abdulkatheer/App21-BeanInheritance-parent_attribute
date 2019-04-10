package client;

import beans.Hai;
import beans.Hello;
import beans.Wish;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        /*
        Bean Inheritance is not like OOPs inheritance. It is the concept of reusing the commonly used
        attributes in all beans to reduce the XML code

        1. 'parent' attribute is used for BeanInheritance
        2. We can override specific properties in the inheriting bean
        3. How it works?
        a) For example, if we take a bean 'Hello' which contains two attributes 'name' and 'message'.
        <bean id="hello" class="beans.Hello>
            <property name="name" value="Katheer"/>
            <property name="message value="Good Morning"/>
        </bean>

        b) Another bean 'Hai' which contains three attributes 'name', 'wish' and 'dept'.
        <bean id="hai" class="beans.Hai">
            <!-- I'm not giving any value for name attribute, I wanna use from hello bean -->
            <property name="wish" value="Good Evening"/>
            <property name="dept" value="IT"/>
        </bean>

        c) If I extend Hai from Hello, (think like this way)it just copies all property tags and paste it in the top of
        'hai' bean definition. We can assume it like this.
        <bean id="hai" class="beans.Hai" parent="hello">
            <property name="name" value="Katheer"/>
            <property name="message value="Good Morning"/>
            <property name="wish" value="Good Evening"/>
            <property name="dept" value="IT"/>
        </bean>

        Now it will set values in the top-down manner.
            i) Tries to Set 'name' value as 'Katheer' through 'setName() method.
            ii) Tries to Set 'message' value as 'Good Morning' through 'setMessage' method. But no setMessage() method
                in Hai bean. So it throws RT exception saying that 'Property message is not writable'\

        Conclusion:
        This can be used only if the inheriting bean has all properties and setXXX of parent bean.
        */
        ApplicationContext context = new ClassPathXmlApplicationContext("resources/applicationContext.xml");

        Hai hai = (Hai) context.getBean("hai");
        Hello hello = (Hello) context.getBean("hello");
        Wish wish = (Wish) context.getBean("wish");

        hai.sayHai();
        wish.wishUser();
        hello.sayHello();
    }
}
