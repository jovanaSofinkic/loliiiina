public class Main {
    public static void main(String[] args) {
        Wall wall = new Wall(5,4);
        System.out.println(wall.getArea());
        wall.setHeight(3);
        System.out.println(wall.getArea());
        wall.setWidth(-1);
        System.out.println(wall.getArea());
    }
}
