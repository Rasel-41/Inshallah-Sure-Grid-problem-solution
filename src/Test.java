public class Test {
    public static void main(String[] args) {
        Matrix grid = new Matrix(3,3);
        grid.set(0,0,"Top Left");
        grid.set(1,1,"Middle");
        grid.set(2,2,"Bottom-Right");
        System.out.println(grid.getDescription(1,1));
        System.out.println(grid.getDescription(0,0));
        System.out.println(grid.getDescription(2,2));
        System.out.println(grid.getDescribedCell());
    }
}
