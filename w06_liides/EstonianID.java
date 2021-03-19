import java.time.LocalDate;

public class EstonianID implements PersonalCodeBehaviour {
    private String code;
  
    public EstonianID(String code){
      this.code = code;
    }
  
    @Override
    public String getGender() {
      int gender = Integer.parseInt(code.substring(0, 1));
  
      // if (gender % 2 == 0){
      //   return "Female";
      // } else {
      //   return "Male";
      // }
        // esimene väärtus on true korral ja teine on false korral
        return gender % 2 == 0 ? "Female" : "Male";
    }
  
    @Override
    public int getFullYear() {

      // int fullYear = 1800 + Math.round(Integer.parseInt(code.substring(0,1)/2)*100 + Integer.parseInt(1,3));
      // return fullYear;
      //int year = 1800 + (Integer.parseInt(code.substring(0,1))/2)*100+(Integer.parseInt(code.substring(1,3)));
      int fullyear = Integer.parseInt(code.substring(1, 3));

      if (fullyear < 22){
        return fullyear + 2000;
      } else {
        return fullyear + 1900;
      }
    }
  
    @Override
    public String getDOB() {
      // String dob = Integer.parseInt(code.substring(5,7)) + "." + Integer.parseInt(code.substring(3,5)) + "." + getFullYear();
      // return dob;
      int dob = Integer.parseInt(code.substring(5,7));
      int mob = Integer.parseInt(code.substring(3,5));
      int yob = Integer.parseInt(code.substring(1,3));

      return dob + "." + mob + "." + yob;

    }
    // 01:51:23
    // @Override
    // public String getAge() {
    // //   LocalDate date = LocalDate.of(getFullYear(), getDOB());
    // //   LocalDate now = LocalDate.now();
    // //   String age = Integer.toString(Period.between(date, now).getYear());
    // //   return age;
    // // }
    
  }