package pustovit.homework.homework_2;

public class Training {
    private byte variableB;
    private short variableS;
    private long variableL;
    private float variableF;
    private char variableDot;
    private boolean variableBool;
    private String name;
    private int variableI;
    private double variableD;

    // getters & setters
    public byte getByte() {
        return variableB;
    }
    public void setByte(Byte variableB) {
        this.variableB = variableB;
    }
    public short getShort() {
        return variableS;
    }
    public void setShort(short variableS) {
        this.variableS = variableS;
    }
    public long getLong() {
        return variableL;
    }
    public void setLong(long variableL) {
        this.variableL = variableL;
    }
    public float geFloat() {
        return variableF;
    }
    public void setFloat(float variableF) {
        this.variableF = variableF;
    }
    public char getChar() {
        return variableDot;
    }
    public void setChar(char variableDot){
        this.variableDot = variableDot;
    }
    public boolean getBoolean(){
        return variableBool;
    }
    public void setBoolean(boolean variableBool){
        this.variableBool = variableBool;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getInt(){
        return variableI;
    }
    public void setInt(int variableI){
        this.variableI = variableI;
    }
    public double getDouble(){
        return variableD;
    }
    public void setDouble(double variableD){
        this.variableD = variableD;
    }

    // constructors
    public Training(byte variableB) {
        this.variableB = variableB;
    }

    public Training(byte variableB, short variableS) {
        this.variableB = variableB;
        this.variableS = variableS;
    }

    public Training(byte variableB, short variableS, long variableL) {
        this.variableB = variableB;
        this.variableS = variableS;
        this.variableL = variableL;
    }

    public Training(byte variableB, short variableS, long variableL, float variableF) {
        this.variableB = variableB;
        this.variableS = variableS;
        this.variableL = variableL;
        this.variableF = variableF;
    }

    public Training(byte variableB, short variableS, long variableL, float variableF, char variableDot) {
        this.variableB = variableB;
        this.variableS = variableS;
        this.variableL = variableL;
        this.variableF = variableF;
        this.variableDot = variableDot;
    }

    public Training(byte variableB, short variableS, long variableL, float variableF,
                    char variableDot, boolean variableBool) {
        this.variableB = variableB;
        this.variableS = variableS;
        this.variableL = variableL;
        this.variableF = variableF;
        this.variableDot = variableDot;
        this.variableBool = variableBool;
    }

    public Training(byte variableB, short variableS, long variableL, float variableF, char variableDot,
                    boolean variableBool, String name) {
        this.variableB = variableB;
        this.variableS = variableS;
        this.variableL = variableL;
        this.variableF = variableF;
        this.variableDot = variableDot;
        this.variableBool = variableBool;
        this.name = name;
    }

    public Training(byte variableB, short variableS, long variableL, float variableF,
                    char variableDot, boolean variableBool, String name, int variableI) {
        this.variableB = variableB;
        this.variableS = variableS;
        this.variableL = variableL;
        this.variableF = variableF;
        this.variableDot = variableDot;
        this.variableBool = variableBool;
        this.name = name;
        this.variableI = variableI;
    }

    public Training(byte variableB, short variableS, long variableL, float variableF,
                    char variableDot, boolean variableBool, String name, int variableI, double variableD) {
        this.variableB = variableB;
        this.variableS = variableS;
        this.variableL = variableL;
        this.variableF = variableF;
        this.variableDot = variableDot;
        this.variableBool = variableBool;
        this.name = name;
        this.variableI = variableI;
        this.variableD = variableD;
    }
}
