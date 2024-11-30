public class Test {
    public static void main(String[] args) {
        Grid grid = new Grid(3,3);
        grid.add(0,0,"Top Left");
        grid.add(1,1,"Middle");
        grid.add(2,2,"Bottom-Right");
        System.out.println(grid.getDescription(1,1));
        System.out.println(grid.getDescription(0,0));
        System.out.println(grid.getDescription(2,2));
        System.out.println(grid.getDescribedLocations());
    }
}
