import java.util.ArrayList;

public class Quad {
    
	private ArrayList<String> vals = new ArrayList();

    public Quad(ArrayList<String> vals) {
        this.vals = vals;
    }

    public Quad(String arg1,String arg2,String arg3,String arg4)
    {
    	this.vals.add(0, arg1);
    	this.vals.add(1, arg2);
    	this.vals.add(2, arg3);
    	this.vals.add(3, arg4);
    }

    public String get(int index)
    {
        return this.vals.get(index);
    }

    public void set(int index, String s)
    {
        this.vals.set(index, s);
    }

    @Override
    public String toString()
    {
        return "("+vals.get(0)+","+vals.get(1)+","+vals.get(2)+","+vals.get(3)+")";
    }

}
