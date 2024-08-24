public class ShortestPath{
    public static float getShortestPath(String direction){
        int x = 0, y = 0;
        for (int i = 0; i < direction.length(); i++) {
            if(direction.charAt(i) == 'N'){
                y++;
            } 
            else if(direction.charAt(i) == 'S'){
                y--;
            }
            else if(direction.charAt(i) == 'W'){
                x--;
            } 
            else if(direction.charAt(i) == 'E'){
                x++;
            }
        }
        double result = Math.sqrt((Math.pow(x, 2)) + Math.pow(y, 2));
        return (float) result;
    }
    public static void main(String[] args) {
        String direction = "WNEENESENNN";

        System.out.println("The shortest path is: " + getShortestPath(direction));

    }
}