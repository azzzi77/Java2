package lesson1;

public abstract class Animal implements Competitor {
    protected String type;
    protected String name;

    protected int maxRunDistance;
    protected int maxJumpHeight;
    protected int maxSwimDistance;

    protected boolean onDistance;

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }

    public Animal(String type, String name, int maxRunDistance, int maxJumpHeight, int maxSwimDistance) {
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimDistance = maxSwimDistance;
        this.onDistance = true;
    }

    @Override
    public void run(int dist) {
        if (dist <= maxRunDistance) {
            System.out.println(type + " " + name + " пробежал кросс");
        } else {
            System.out.println(type + " " + name + " не смог пробежать кроссом - выбыл \n");
            onDistance = false;
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(type + " " + name + " успешно перепрыгнул через стену");
        } else {
            System.out.println(type + " " + name + " не смог перепрыгнуть через стену - выбыл \n");
            onDistance = false;
        }
    }

    @Override
    public void swim(int dist) {
        if (maxSwimDistance == 0) {
            System.out.println(type + " " + name + " не умеет плавать - выбыл \n");
            onDistance = false;
            return;
        }
        if (dist <= maxSwimDistance) {
            System.out.println(type + " " + name + " успешно проплыл \n ");
        } else {
            System.out.println(type + " " + name + " не смог проплыть - выбыл \n");
            onDistance = false;
        }
    }

    @Override
    public void result() {
        System.out.println(type + " " + name + ": " + onDistance);
    }
}