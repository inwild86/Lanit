package food;

public class WrongFoodException extends Exception{
    private Food food;

    public WrongFoodException(String message, Food num){
        super(message);
        food = num;
    }
}
