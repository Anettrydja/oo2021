public class FinnishID implements PersonalCodeBehaviour{
    private String code;

    public FinnishID(String code){
        this.code = code;
    }

    @Override
    public String getGender() {
        int gender = Integer.parseInt(code.substring(7,9));
        return gender % 2 == 0 ? "Female" : "Male";
    }

    @Override
    public int getFullYear() {
        int fullyear = Integer.parseInt(code.substring(4,6));

        if (fullyear < 22){
            return fullyear + 2000;
        } else {
            return fullyear + 1900;
        }
    }

    @Override
    public String getDOB() {
        int dob = Integer.parseInt(code.substring(0,2));
        int mob = Integer.parseInt(code.substring(2,4));
        int yob = Integer.parseInt(code.substring(4,6));

        return dob + "." + mob + "." + yob;
    }

    @Override
    public int getAge() {
        
    }
}
