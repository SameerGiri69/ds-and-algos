public class QuickFindUF {
    private int [] id;

    public QuickFindUF(int N)
    {
        id = new int[N]; // initializes the array 
        for ( int i = 0; i < N; i++)
            id[i] = i; // sets each element as its own component 
    }
    public boolean connected(int p, int q)
    {
        return id[p] == id[q]; // returns true if the components are connected and false if not
    }
    public void union(int p, int q)
    {
        int pid = id[p];
        int qid = id[q];
        for ( int i = 0; i < id.length; i++)
        {
            if (id[i] == pid) id[i] = qid; // to join two indexes of the array (id), we take the two values(id) of that array p and q
                                           // then we change the array value (id) of p to the array value (id) of q
                                           // then we have similar id which "is connected"
        }
    }
}
