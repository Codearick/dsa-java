public class TrappingRainWater {
    public static int trappingRainWater(int [] height){
        int trappedWater = 0;

        //Calculate left max boundary
        int [] lmax = new int[height.length];
        lmax[0] = height[0];
        for (int i = 1; i < lmax.length; i++) {
            lmax[i] = Math.max(lmax[i - 1], height[i]);
        }

        //Calculate left max boundary
        int [] rmax = new int[height.length];
        rmax[height.length - 1] = height[height.length - 1];
        for (int i = height.length-2; i >= 0; i--) {
            rmax[i] = Math.max(height[i], rmax[i+1]);
        }

        for (int i = 0; i < height.length; i++) {
            int waterLevel = Math.min(lmax[i], rmax[i]);
            trappedWater += waterLevel - height[i];
            System.out.println(rmax[i]);
        }

        return trappedWater;
    }

    public static void main(String[] args){
        int [] height = {4,2,0,6,3,2,5};

        System.out.println("Total trapped water is: "+ trappingRainWater(height));

    }
}
