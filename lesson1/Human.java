package lesson1;

public class Human implements Competitor {
    protected String name;

    protected int maxRunDistance;
    protected int maxJumpHeight;
    protected int maxSwimDistance;

    protected boolean active;

    @Override
    public boolean isOnDistance() {
        return active;
    }

    public Human(String name) {
        this.name = name;
        this.maxRunDistance = 10000;
        this.maxJumpHeight = 20;
        this.maxSwimDistance = 500;
        this.active = true;
    }

    @Override
    public void run(int dist) {
        if (dist <= maxRunDistance) {
            System.out.println(name + " пробежал кросс");
        } else {
            System.out.println(name + " не смог пробежать кросс - выбыл \n");
            active = false;
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(name + " перепрыгнул через стену");
        } else {
            System.out.println(name + " не смог перепрыгнуть через стену  - выбыл \n");
            active = false;
        }
    }

    @Override
    public void swim(int dist) {
        if (dist <= maxSwimDistance) {
            System.out.println(name + " успешно проплыл \n");
        } else {
            System.out.println(name + " не смог проплыть - выбыл \n");
            active = false;
        }
    }

    @Override
    public void result() {
        System.out.println("Человек " + name + ": " + active);
    }
}