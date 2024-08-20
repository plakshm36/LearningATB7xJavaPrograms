package ex_Lab17082024.Enum;

public enum COLORS {
   RED("#ff0000");


//constructor+encapsulation gettervalue
    private final String hexValue;

    COLORS(String hexValue) {
        this.hexValue = hexValue;
    }

    public String getValue(){
        return hexValue;
    }

}

