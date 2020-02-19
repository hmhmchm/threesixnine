public class ThreeSixNine{
    public static void main(String[] args){
      for(int i = 1; i < 100; i++){
        int e1 = i/10; //십의자리 수
        int e0 = i%10; //일의 자리 수
        String result = "박수";
        
        if(e0%3 == 0 && e0 != 0){
          result = result + "짝";
        }
        if(e1%3 == 0 && e1 != 0){
          result = result + "짝";
        }
        if(result.equals("박수")){
          
        }else{
          System.out.println(i + " " + result);
        }
        
      }
    }
}
