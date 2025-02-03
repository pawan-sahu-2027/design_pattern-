package prototypeDesignPattern;

public class InteligentStudent extends Student  {
   private int iq;
   public int getIq(){
       return iq;
   }
    public void setIq( int iq){
        this.iq = iq;
    }
   public InteligentStudent(){

   }
   public InteligentStudent(InteligentStudent inteligentStudent){
       super(inteligentStudent);
         this.iq = inteligentStudent.iq;
   }
  public InteligentStudent clone(){
       return new InteligentStudent(this);
  }
}
