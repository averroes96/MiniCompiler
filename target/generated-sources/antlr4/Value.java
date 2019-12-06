
public class Value {
	
    public static Value VOID = new Value(new Object());

    final Object Value;

    public Value(Object Value) {
        this.Value = Value;
    }

    public Boolean asBoolean() {
        return (Boolean)Value;
    }

    public Double asDouble() {
        return (Double)Value;
    }

    public String asString() {
        return String.valueOf(Value);
    }

    public boolean isDouble() {
        return Value instanceof Double;
    }

    @Override
    public int hashCode() {

        if(Value == null) {
            return 0;
        }

        return this.Value.hashCode();
    }

    @Override
    public boolean equals(Object o) {

        if(Value == o) {
            return true;
        }

        if(Value == null || o == null || o.getClass() != Value.getClass()) {
            return false;
        }

        Value that = (Value)o;

        return this.Value.equals(that.Value);
    }

    @Override
    public String toString() {
        return String.valueOf(Value);
    }

}
