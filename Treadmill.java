
class Treadmill {
    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    public void overcome(Participant participant) {
        if (!participant.isDisqualified()) {
            participant.run(length);
        }
    }
}
