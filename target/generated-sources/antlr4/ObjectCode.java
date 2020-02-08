import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class ObjectCode {
	
	public static class Operator {
		
		public String str ;
		
		Operator(String str){
			this.str = str;
		}
	}
	
	public static class Instruction {
		
		String code,op1,op2;

		public Instruction(String code, String op1, String op2) {
			
			this.code = code;
			this.op1 = op1;
			this.op2 = op2;
		}
		
		public Instruction(String code, String op1) {
			
			this.code = code;
			this.op1 = op1;
			this.op2 = null;
		}
		
        @Override
        public String toString()
        {
            return code + " " + op1 + ", " + ((op2 == null)?"":op2);
        }		
		
		
	}
	
	ArrayList<Quad> quads = new ArrayList<>();
	LinkedList<Instruction> instructions = new LinkedList<>();
	HashMap<String,InstGenerator> map = new HashMap<>();
	HashMap<Integer,Integer> jumpsMap = new HashMap<>(); // for jumps
	
	Operator ope = new Operator("");
	
	ObjectCode(ArrayList<Quad> quads){
		
		map.put(":=", new InstGenerator.MOV(this));
		map.put("+", new InstGenerator.ADD(this));
		map.put("-", new InstGenerator.SUB(this));
		map.put("*", new InstGenerator.MUL(this));
		map.put("/", new InstGenerator.DIV(this));
		map.put("%", new InstGenerator.MOD(this));		
		map.put("BR", new InstGenerator.BR(this));
		map.put("BL", new InstGenerator.BL(this));
		map.put("BG", new InstGenerator.BG(this));
		map.put("BE", new InstGenerator.BE(this));
		map.put("BLE", new InstGenerator.BLE(this));
		map.put("BGE", new InstGenerator.BGE(this));
		map.put("BNE", new InstGenerator.BNE(this));
		map.put("END", new InstGenerator.END(this));
		map.put("CHS", new InstGenerator.CHS(this));
		
		this.quads = quads;
		
	}
	
	ArrayList<Instruction> getInstructions(Quad quad){
		
		return map.get(quad.get(0)).getInst(quad);
	}
	
	boolean isJumpInst(String inst) {
		String[] jumps = {"JMP","JLE","JGE","JNE","JE","JG","JL"} ;
		
		for(int i = 0; i < jumps.length; i++) {
			if(inst.compareTo(jumps[i]) == 0) {
				return true;
			}
		}
		return false;
	}
	
	public LinkedList<Instruction> generateCode(){
		
		LinkedList<Instruction> jumpInsts = new LinkedList<>();
		
		for(int i = 0; i < quads.size(); i++) {
			
			ArrayList<Instruction> insts = getInstructions(quads.get(i));
			
			if(!insts.isEmpty()) {
			jumpsMap.put(i, instructions.size());
			
			for(int j = 0; j < insts.size(); j++) {
				instructions.add(insts.get(j));
				
				if(isJumpInst(insts.get(j).code)) {
					jumpInsts.add(insts.get(j));
				}
			}
			}
			
		}
		
		for(int i = 0; i < jumpInsts.size(); i++) {
			jumpInsts.get(i).op1 = "" + jumpsMap.get(Integer.parseInt(jumpInsts.get(i).op1));
		}
		
		System.out.println("\nStart generating Object code ------------------------------------------");
		int cpt = 0;
		for(Instruction ins : instructions) {
			
			System.out.println("\n" + cpt + " --- " + ins.toString());
			cpt++;
		}
		System.out.println("\nFinished generating Object code ------------------------------------------\n");
		
		return instructions ;
	}
	
    public Operator getACC() {
        return ope;
    }

    public void setACC(String acc) {
        this.ope.str = acc;
    }	
	
    public ArrayList<Instruction> getInACC(Operator op1,Operator op2)
    {
        ArrayList<Instruction> insts = null;
        
        if(op1.str.equals(ope.str)) op1.str = "AX";
        else if(!op2.str.equals("") && op2.str.equals(ope.str))
        {
            op2.str = op1.str;
        }
        else if(!ope.str.equals("") && !isNumber(ope.str))
        {
            insts = new ArrayList<>();
            insts.add(0, new Instruction("STORE",ope.str,"AX"));
            insts.add(1, new Instruction("LOAD","AX",op1.str));
            ope.str = op1.str;
        }
        else
        {
        	insts = new ArrayList<>();
        	insts.add(0, new Instruction("LOAD","AX",op1.str));
            ope.str = op1.str;
        }
        	op1.str = "AX";
        	return insts;
    }
    
    
    private boolean isNumber(String s)
    {
        for (int i=0;i<s.length();i++)
            if(s.charAt(i) > '9' || s.charAt(i) < '0')
                return false;
        return true;
    }    

}
