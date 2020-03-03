public class Person {
        public String name;
        public int id;
        public static int nextId = 0;

        public Person(String name) {
            this.name = name;
            id = nextId;
            nextId++;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }
