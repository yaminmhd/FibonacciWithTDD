public class FibonacciGenerator {
    public int getNumberAtPosition(int position){
        if(position< 2){
            return position;
        }
        return getNumberAtPosition(position -1 ) + getNumberAtPosition(position - 2);
    }

}
