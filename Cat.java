
class Cat extends Participant {
    public Cat(String name, int maxRunDistance, int maxJumpHeight) {
        super(name, maxRunDistance, maxJumpHeight);
        //TODO Auto-generated constructor stub
    }

   
    

    @Override
    void run(int distance) {
        System.out.println(name + " успешно пробежал " + distance + " метров");
    }

    @Override
    void jump(int height) {
        System.out.println(name + " успешно прыгнул на " + height + " метров");
    }
}