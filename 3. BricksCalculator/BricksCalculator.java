public class BricksCalculator {
    public static void main(String[] args){
        int amountOfBricks = 63;
        int containerCapacity = 6;

        //calculating the quantity of full containers
        int fullContainers = amountOfBricks / containerCapacity;
        System.out.println("the number of full containers is " + fullContainers);

        //calculating the quantity of all containers
        float allContainers = (float) amountOfBricks / containerCapacity;
        System.out.println("the number of all containers is " + (Math.round(allContainers)));

        //calculating the quantity of bricks in not fully filled container
        int bricksLeft = amountOfBricks % containerCapacity;
        System.out.println("the number of blocks in an incomplete container is " + bricksLeft);

    }
}
