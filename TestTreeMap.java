import java.util.Comparator;
import java.util.TreeMap;

class Employee implements Comparable<Employee> {

    public String name;
    public int age;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Employee o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", age=" + age + "]";
    }

}

public class TestTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(4, "Abhinav");
        map.put(1, "John");
        map.put(3, "dhaios");
        map.put(2, "ujn");

        map.forEach((k, v) -> System.out.println(k + " : " + v));

        TreeMap<Employee, Integer> mp = new TreeMap<>();
        mp.put(new Employee("abcd", 23), 100);
        mp.put(new Employee("ijkl", 25), 300);
        mp.put(new Employee("efgh", 24), 24);

        mp.forEach((emp, val) -> System.out.println(emp.name + " : " + emp.age + " : " + val));

        TreeMap<Employee, Integer> mp2 = new TreeMap<>(
                new Comparator<Employee>() {
                    @Override
                    public int compare(Employee e1, Employee e2) {
                        if (e1.age < e2.age)
                            return 1;
                        else if (e1.age > e2.age)
                            return -1;
                        return 0;
                    }
                });
        mp2.put(new Employee("Mike", 20), 100);
        mp2.put(new Employee("John", 10), 500);
        mp2.put(new Employee("Lisa", 15), 200);
        mp2.put(new Employee("Ryan", 40), 400);

        mp2.forEach((k, v) -> System.out.println(k + " : " + v));

    }
}
