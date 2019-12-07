import java.util.List;

public class SJValue {

    public static SJValue VOID = new SJValue(new Object());

    final Object SJValue;

    public SJValue(Object SJValue) {
        this.SJValue = SJValue;
    }

    public Boolean asBoolean() {
        return (Boolean)SJValue;
    }

    public Double asDouble() {
        return (Double)SJValue;
    }

    public String asString() {
        return String.valueOf(SJValue);
    }

    public boolean isDouble() {
        return SJValue instanceof Double;
    }

    @Override
    public int hashCode() {

        if(SJValue == null) {
            return 0;
        }

        return this.SJValue.hashCode();
    }

    @Override
    public boolean equals(Object o) {

        if(SJValue == o) {
            return true;
        }

        if(SJValue == null || o == null || o.getClass() != SJValue.getClass()) {
            return false;
        }

        SJValue that = (SJValue)o;

        return this.SJValue.equals(that.SJValue);
    }

    @Override
    public String toString() {
        return String.valueOf(SJValue);
    }


}
