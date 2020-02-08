import java.util.ArrayList;

public class InstGenerator {
	
	ObjectCode oc ;
	
	InstGenerator(ObjectCode oc){
		this.oc = oc ;
	}
	
	public ArrayList<ObjectCode.Instruction> getInst(Quad quad){
		
		return null;
	}
	
	public ArrayList<ObjectCode.Instruction> getInstACC(ObjectCode.Operator op1, ObjectCode.Operator op2){
		
		ArrayList<ObjectCode.Instruction> insts = oc.getInACC(op1,op2);
		
        ArrayList<ObjectCode.Instruction> tab = new ArrayList<ObjectCode.Instruction>();
        
        if(insts!=null)
        for (int i = 0; i < insts.size(); i++)
            tab.add(i, insts.get(i));
        
        return tab;		
		
	}
	
	public static class MOV extends InstGenerator{
		public MOV(ObjectCode oc) {
			super(oc);
		}
		
		public ArrayList<ObjectCode.Instruction> getInst(Quad quad){
			ObjectCode.Operator op1 = new ObjectCode.Operator(quad.get(1)), op2 = new ObjectCode.Operator("");
			ArrayList<ObjectCode.Instruction> tab = getInstACC(op1,op2);
			tab.add(new ObjectCode.Instruction("MOV", quad.get(3), "AX"));
			
			return tab;
		}
	}
	
	public static class ADD extends InstGenerator{
		public ADD(ObjectCode oc) {
			super(oc);
		}
		
		public ArrayList<ObjectCode.Instruction> getInst(Quad quad){
			ObjectCode.Operator op1 = new ObjectCode.Operator(quad.get(1)), op2 = new ObjectCode.Operator(quad.get(2));
			ArrayList<ObjectCode.Instruction> tab = getInstACC(op1,op2);
			tab.add(new ObjectCode.Instruction("ADD", "AX", op2.str));
			oc.setACC(quad.get(3));
			
			return tab;
		}
	}
	
    public static class SUB extends InstGenerator
    {
        public SUB(ObjectCode oc) {
            super(oc);
        }

        public ArrayList<ObjectCode.Instruction> getInst(Quad quad)
        {
            ObjectCode.Operator op1 = new ObjectCode.Operator(quad.get(1)),op2 = new ObjectCode.Operator("");
            ArrayList<ObjectCode.Instruction> tab = getInstACC(op1,op2);
            tab.add(new ObjectCode.Instruction("SUB","AX",quad.get(2)));
            oc.setACC(quad.get(3));
            
            return tab;
        }
    }
    
    public static class CHS extends InstGenerator
    {
        public CHS(ObjectCode oc) {
            super(oc);
        }

        public ArrayList<ObjectCode.Instruction> getInst(Quad quad)
        {
            ObjectCode.Operator op1 = new ObjectCode.Operator(quad.get(1)),op2 = new ObjectCode.Operator("");
            ArrayList<ObjectCode.Instruction> tab = getInstACC(op1,op2);
            tab.add(new ObjectCode.Instruction("MOV","AX",quad.get(1)));
            tab.add(new ObjectCode.Instruction("CHS","AX"));
            oc.setACC(quad.get(3));
            
            return tab;
        }
    }    

    public static class MUL extends InstGenerator
    {
        public MUL(ObjectCode oc) {
            super(oc);
        }

        public ArrayList<ObjectCode.Instruction> getInst(Quad quad)
        {
            ObjectCode.Operator op1 = new ObjectCode.Operator(quad.get(1)),op2 = new ObjectCode.Operator(quad.get(2));
            ArrayList<ObjectCode.Instruction> tab = getInstACC(op1,op2);
            tab.add(new ObjectCode.Instruction("MUL","AX",op2.str));
            oc.setACC(quad.get(3));
            
            return tab;
        }
    }

    public static class DIV extends InstGenerator
    {
        public DIV(ObjectCode oc) {
            super(oc);
        }

        public ArrayList<ObjectCode.Instruction> getInst(Quad quad)
        {
            ObjectCode.Operator op1 = new ObjectCode.Operator(quad.get(1)),op2 = new ObjectCode.Operator("");
            ArrayList<ObjectCode.Instruction> tab = getInstACC(op1,op2);
            tab.add(new ObjectCode.Instruction("DIV", "AX", quad.get(2)));
            oc.setACC(quad.get(3));
            
            return tab;
        }
    }
    
    public static class MOD extends InstGenerator
    {
        public MOD(ObjectCode oc) {
            super(oc);
        }

        public ArrayList<ObjectCode.Instruction> getInst(Quad quad)
        {
            ObjectCode.Operator op1 = new ObjectCode.Operator(quad.get(1)),op2 = new ObjectCode.Operator("");
            ArrayList<ObjectCode.Instruction> tab = getInstACC(op1,op2);
            tab.add(new ObjectCode.Instruction("MOV", "AX", quad.get(1)));
            tab.add(new ObjectCode.Instruction("MOV", "DX", "0"));
            tab.add(new ObjectCode.Instruction("MOV", "BX", quad.get(2)));
            tab.add(new ObjectCode.Instruction("DIV", "BX"));
            oc.setACC(quad.get(3));
            
            return tab;
        }
    }     

    public static class BR extends InstGenerator{
    	
        public BR(ObjectCode oc) {
            super(oc);
        }

        public ArrayList<ObjectCode.Instruction> getInst(Quad quad)
        {
        	ArrayList<ObjectCode.Instruction> tab = new ArrayList<>();
            tab.add(new ObjectCode.Instruction("JMP", quad.get(3)));          
            
            return tab;
        }    	
    }

    public static class BLE extends InstGenerator{
    	
        public BLE(ObjectCode oc) {
            super(oc);
        }

        public ArrayList<ObjectCode.Instruction> getInst(Quad quad)
        {
        	ObjectCode.Operator op1 = new ObjectCode.Operator(quad.get(1)), op2 = new ObjectCode.Operator("");
        	ArrayList<ObjectCode.Instruction> tab = getInstACC(op1,op2);
        	tab.add(new ObjectCode.Instruction("CMP", "AX", quad.get(2)));
        	tab.add(new ObjectCode.Instruction("JLE", quad.get(3)));          
            
            return tab;
        }    	
    }
    
    public static class BGE extends InstGenerator{
    	
        public BGE(ObjectCode oc) {
            super(oc);
        }

        public ArrayList<ObjectCode.Instruction> getInst(Quad quad)
        {
        	ObjectCode.Operator op1 = new ObjectCode.Operator(quad.get(1)), op2 = new ObjectCode.Operator("");
        	ArrayList<ObjectCode.Instruction> tab = getInstACC(op1,op2);
        	tab.add(new ObjectCode.Instruction("CMP", "AX", quad.get(2)));
        	tab.add(new ObjectCode.Instruction("JGE", quad.get(3)));          
            
            return tab;
        }    	
    }
    
    public static class BG extends InstGenerator{
    	
        public BG(ObjectCode oc) {
            super(oc);
        }

        public ArrayList<ObjectCode.Instruction> getInst(Quad quad)
        {
        	ObjectCode.Operator op1 = new ObjectCode.Operator(quad.get(1)), op2 = new ObjectCode.Operator("");
        	ArrayList<ObjectCode.Instruction> tab = getInstACC(op1,op2);
        	tab.add(new ObjectCode.Instruction("CMP", "AX", quad.get(2)));
        	tab.add(new ObjectCode.Instruction("JG", quad.get(3)));          
            
            return tab;
        }    	
    }
    
    public static class BL extends InstGenerator{
    	
        public BL(ObjectCode oc) {
            super(oc);
        }

        public ArrayList<ObjectCode.Instruction> getInst(Quad quad)
        {
        	ObjectCode.Operator op1 = new ObjectCode.Operator(quad.get(1)), op2 = new ObjectCode.Operator("");
        	ArrayList<ObjectCode.Instruction> tab = getInstACC(op1,op2);
        	tab.add(new ObjectCode.Instruction("CMP", "AX", quad.get(2)));
        	tab.add(new ObjectCode.Instruction("JL.", quad.get(3)));          
            
            return tab;
        }    	
    }
    
    public static class BE extends InstGenerator{
    	
        public BE(ObjectCode oc) {
            super(oc);
        }

        public ArrayList<ObjectCode.Instruction> getInst(Quad quad)
        {
        	ObjectCode.Operator op1 = new ObjectCode.Operator(quad.get(1)), op2 = new ObjectCode.Operator("");
        	ArrayList<ObjectCode.Instruction> tab = getInstACC(op1,op2);
        	tab.add(new ObjectCode.Instruction("CMP", "AX", quad.get(2)));
        	tab.add(new ObjectCode.Instruction("JE.", quad.get(3)));          
            
            return tab;
        }    	
    }
    
    public static class BNE extends InstGenerator{
    	
        public BNE(ObjectCode oc) {
            super(oc);
        }

        public ArrayList<ObjectCode.Instruction> getInst(Quad quad)
        {
        	ObjectCode.Operator op1 = new ObjectCode.Operator(quad.get(1)), op2 = new ObjectCode.Operator("");
        	ArrayList<ObjectCode.Instruction> tab = getInstACC(op1,op2);
        	tab.add(new ObjectCode.Instruction("CMP", "AX", quad.get(2)));
        	tab.add(new ObjectCode.Instruction("JNE.", quad.get(3)));          
            
            return tab;
        }    	
    }    

    public static class END extends InstGenerator{
    	
        public END(ObjectCode oc) {
            super(oc);
        }

        public ArrayList<ObjectCode.Instruction> getInst(Quad quad)
        {
        	ArrayList<ObjectCode.Instruction> tab = new ArrayList<>();
        	tab.add(new ObjectCode.Instruction("MOV", "AX", "4C00H"));
        	tab.add(new ObjectCode.Instruction("INT.", "21H"));          
            
            return tab;
        }    	
    }     
}
