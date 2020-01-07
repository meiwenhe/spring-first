package bean.processor;

import java.util.List;

public class HelloWorld {
   private List<String> strings ;

   public List<String> getStrings() {
      return strings;
   }

   public void setStrings(List<String> strings) {
      this.strings = strings;
   }

   private String message;
   public void setMessage(String message){
      this.message  = message;
   }
   public void getMessage(){
      System.out.println("Your Message : " + message);
   }
   public void init(){
      System.out.println("Bean is going through init.");
   }
   public void destroy(){
      System.out.println("Bean will destroy now.");
   }
}