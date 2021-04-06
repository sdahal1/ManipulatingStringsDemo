public class StringManipulator{

    public void helloWorld(){
        System.out.println("Waazzzzzaaaaaaaaaa lets manipulate some strings");
    }

    public void helloWorld(String name){
        System.out.println("Hello " + name +  " lets manipulate some strings");
    }

    public String trimAndConcat(String str1, String str2){
        // System.out.println(str1.trim() + str2.trim());
        return (str1.trim() + str2.trim());
    }

    public Integer getIndexOrNull(String str1, char charmander){
        if(str1.indexOf(charmander) == -1){
            return null;
        }
        else{
            return str1.indexOf(charmander);
        }
    }

    public Integer getIndexOrNull(String str1, String charmander){
        if(str1.indexOf(charmander) == -1){
            return null;
        }
        else{
            return str1.indexOf(charmander);
        }
    }


    public String concatSubstring(String str1, int int1, int int2, String str2){
        System.out.println(str1.substring(int1,int2) + str2);

        return str1.substring(int1,int2) + str2;
        
        // String s1="javatpoint";  
        // System.out.println(s1.substring(2,4));//returns va

    }

    
}



// s1.helloWorld()