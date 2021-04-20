public class Encapsulation {

    static class Encapsulate {

        private String Name;
        private int Roll;
        private int Age;


        public int getAge() {
            return Age;
        }


        public String getName() {
            return Name;
        }

        public int getRoll() {
            return Roll;
        }

        public void setAge(int newAge) {
            Age = newAge;
            if (Age<18)
                System.out.println("Yaş 18'den küçük olamaz!");

        }


        public void setName(String newName) {
            Name = newName;
        }


        public void setRoll(int newRoll) {
            Roll = newRoll;
        }
    }
}


