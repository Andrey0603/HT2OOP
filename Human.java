
class Human extends Participant {
    public Human(String name, int maxRunDistance, int maxJumpHeight) {
        super(name, maxRunDistance, maxJumpHeight);
    }

    @Override
    void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(name + " успешно пробежал " + distance + " метров");
        } else {
            System.out.println(name + " не смог пробежать " + distance + " метров и выбывает из соревнования");
            setDisqualified(true);
        }
    }

    @Override
    void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(name + " успешно прыгнул на " + height + " метров");
        } else {
            System.out.println(name + " не смог перепрыгнуть " + height + " метров и выбывает из соревнования");
            setDisqualified(true);
        }
    }
}