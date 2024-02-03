    
    //Малинин Андрей
    
    public class Main {
        public static void main(String[] args) {
            Participant[] participants = {
                    new Human("Вася", 100, 2),
                    new Human("Петя", 150, 3),
                    new Cat("Барсик", 150, 3),
                    new Robot("RB", 200, 4)
            };
    
            Object[] obstacles = {
                    new Treadmill(120),
                    new Wall(2),
                    new Treadmill(200),
                    new Wall(3)
            };
    
            for (Participant participant : participants) {
                for (Object obstacle : obstacles) {
                    if (obstacle instanceof Treadmill) {
                        ((Treadmill) obstacle).overcome(participant);
                    } else if (obstacle instanceof Wall) {
                        ((Wall) obstacle).overcome(participant);
                    }
                }
            }
        }
    }
    
    
    
    
    