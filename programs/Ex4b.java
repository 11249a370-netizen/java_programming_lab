class Staff {
    String name;

    Staff(String n) {
        name = n;
    }

    String role() {
        return "Staff";
    }
}

class Teacher extends Staff {
    Teacher(String n) {
        super(n);
    }

    @Override
    String role() {
        return "Teacher";
    }
}

class Driver extends Staff {
    Driver(String n) {
        super(n);
    }

    @Override
    String role() {
        return "Driver";
    }
}

public class RoleDemo {
    public static void main(String[] args) {
        Staff[] all = {
            new Teacher("kalyani"),
            new Driver("Sharvani"),
            new Staff("Rajeshwari")
        };

        for (Staff s : all) {
            System.out.println(s.name + " -> " + s.role());
        }
    }
}
