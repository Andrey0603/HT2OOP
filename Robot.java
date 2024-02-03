
class Robot extends Participant {
    public Robot(String name, int maxRunDistance, int maxJumpHeight) {
        super(name, maxRunDistance, maxJumpHeight);
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