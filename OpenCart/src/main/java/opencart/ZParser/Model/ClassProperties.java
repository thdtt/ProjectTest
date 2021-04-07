package opencart.ZParser.Model;

import java.util.HashSet;
import java.util.Set;

public class ClassProperties extends NamedEntity {
    private Set<Method> methodName = new HashSet<>();
    private Set<Field> fieldName = new HashSet<>();
    private Set<Constructor> consName = new HashSet<>();

    public void addMethod(Method method) {
        this.methodName.add(method);
    }

    public void addField(Field var) {
        this.fieldName.add(var);
    }

    public void addCons(Constructor cons) {
        this.consName.add(cons);
    }

    public void print() {
        System.out.println(super.getName());
        System.out.println();
        for (Field bf : fieldName) {
            System.out.println(bf.toString());
        }
        System.out.println();
        for (Constructor bf : consName) {
            System.out.println(bf.toString());
        }
        System.out.println();
        for (Method bf : methodName) {
            System.out.println(bf.toString());
        }
    }

}
