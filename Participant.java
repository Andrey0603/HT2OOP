
abstract class Participant {
    String name;
    int maxRunDistance;
    int maxJumpHeight;
    boolean isDisqualified;

    public Participant(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.isDisqualified = false;
    }

    abstract void run(int distance);
    abstract void jump(int height);

    public boolean isDisqualified() {
        return isDisqualified;
    }

    public void setDisqualified(boolean disqualified) {
        isDisqualified = disqualified;
    }
}

    
