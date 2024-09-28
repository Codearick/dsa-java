public class DuplicateString {
    public static void main(String [] argruments){
        removeDuplicate("rohangautam", 0, new StringBuilder(""), new boolean [26]);
    }

    public static void removeDuplicate(String name, int index, StringBuilder newString, boolean [] map){

        if(index == name.length()){
            System.out.println(newString);
            return;
        }

        char currChar = name.charAt(index);

        if(map[currChar - 'a'] == true){
           removeDuplicate(name, index + 1, newString, map);

        } else {
            map[currChar - 'a'] = true;
            removeDuplicate(name, index + 1, newString.append(currChar), map);
        }
        
    }
}
