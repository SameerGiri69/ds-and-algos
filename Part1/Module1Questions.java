
import javax.print.attribute.standard.DateTimeAtCreation;

public class Module1Questions {
    int [] n; // no of members 
    DateTimeAtCreation [] m;

    public Module1Questions(int N)
    {
        n = new int[N]; // initializes the array 
        for ( int i = 0; i < N; i++)
            n[i] = i; // sets each element as its own component 
    }
}
