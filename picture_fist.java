//Fist
public class Game{
    public static void main(String[] args){
        String[] top={"* ","* ","* ","* "};
        String[] palm={"* ","* ","* "};
        String[] sides={"* ","* ","* ","* ",};
        int x=2;
        enter();
        while(x>0){
            for(int i=0;i<4;i++){
                for(String str: sides){
                    System.out.print(str);
                }
                System.out.print("     ");
            }
            enter();
            x--;
        }
        for(int i=0;i<4;i++){
            for(String str: top){
                System.out.print(str);
            }
            System.out.print("     ");
        }
        enter();
        for(int u=0;u<2;u++){
           for(int i=0;i<8;i++){
            for(String str: palm){
                System.out.print(str);
            }
         }
           enter();
        }
        for(int u=0;u<5;u++){
           for(int i=0;i<9;i++){
            for(String str: palm){
                System.out.print(str);
            }
         }
           enter();
        }
        for(int u=0;u<2;u++){
           for(int i=0;i<8;i++){
            for(String str: palm){
                System.out.print(str);
            }
         }
           enter();
        }
        for(int u=0;u<4;u++){
           System.out.print("           ");
           for(int i=8;i>4;i--){
            for(String str: palm){
                System.out.print(str);
            }
         }
           enter();
        }
    }
    public static void enter(){
        System.out.println("");
    }
}
