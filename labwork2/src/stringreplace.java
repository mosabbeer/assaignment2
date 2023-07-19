public class stringreplace {
    private String StateName;
    public  stringreplace(){
        StateName="Mississippi";
    }

    public int replaceI(){
        String newStateName;
        int string_length;
        newStateName=StateName.replace("i","ii");
        string_length=newStateName.length();
        return string_length;
    }
    public int replaceSS(){
        String newStateName;
        int string_length;
        newStateName = StateName.replace("ss","s");
        string_length = newStateName.length();
        return string_length;
    }

}
