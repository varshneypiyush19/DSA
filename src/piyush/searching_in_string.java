package piyush;

public class searching_in_string {
    public static void main(String[] args) {
        String name ="piyush";
        char target ='p';
        searchinthestring(name,target);
    }

    static void searchinthestring(String name , char target){
        if(name.length() == 0){    //name.isEmpty()
            System.out.println("Empty ");
        }
//        for(char ch : name.toCharArray()){       //system.out.println(Arrays.toString(name.toCharArray()))
//            System.out.println("true");
//        }
        for(int i=0;i<name.length();i++){
           if(target==name.charAt(i)){
               System.out.println(i);
           }
        }

    }
}
