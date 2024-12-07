package java17.ex06;


import java.util.function.Supplier;

import java17.data.Data;
import org.junit.Test;

import java17.data.Person;

/**
 * Exercice 06 - java.util.function.Supplier
 */
public class Function_06_Test {


    // tag::formatAge[]
    // TODO compléter la méthode
    // TODO la méthode retourne une chaîne de caractères de la forme [age=<AGE>] (exemple : [age=12])
    String formatAge(Supplier<Person> supplier) {
        // TODO
        Person p = supplier.get();
        return "[age="+p.getAge()+"]";
    }
    // end::formatAge[]


    @Test
    public void test_supplier_formatAge() throws Exception {
        // TODO compléter le test unitaire pour qu'il soit passant
        Person p = new Person();
        p.setAge(35);
        String result = formatAge(()->p);

        assert result.equals("[age=35]");
    }

}
