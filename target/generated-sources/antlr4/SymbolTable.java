import java.util.ArrayList;

public class SymbolTable {
	
    static public class Symbol {

        public Symbol(String name, int declared, int type, int size) {
            this.name = name;
            this.declared = declared;
            this.type = type;
            this.size = size;
        }

        String name;
        int declared; 
        int type; 
        int size;

        @Override
        public String toString()
        {
            String dec = (declared == 1)? "  Declared  ":" Undeclared ";
            String message;
            message = "   " + name + "   " ;
            
            if(type == 1) message += "|  int_sj  |" ;
            else if(type == 2) message += "| float_sj |" ;
            else if(type == 3 ) message += "| string_sj|" ;
            else	message += "|  keyword  |" ;
            
            message += dec + " | ";
            
            
            return message;
        }
    }


    public ArrayList<Symbol> L = new ArrayList<Symbol>();


    public Symbol getSymbol(String name)
    {
        for (int i = 0; i < L.size(); i++) {
            if(L.get(i).name.compareTo(name)==0)
                return L.get(i);
        }
        return null;
    }

    public boolean containsSymbol(String name)
    {
        return getSymbol(name) != null;
    }

    public void addSymbol(Symbol s)
    {
        L.add(s);
    }

    /*public void deleteSymbol(String name)
    {
        for (int i = 0; i < L.size(); i++) {
            if(L.get(i).name.compareTo(name)==0)
            {
               deleteSymbol(L.get(i));
               return;
            }
        }
    }	*/

    public void deleteSymbol(Symbol s)
    {
        L.remove(s);
    }

    public int getSize()
    {
        return L.size();
    }

    public Symbol getSymbol(int i)
    {
        return L.get(i);
    }		

}
