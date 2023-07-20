There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.

Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.

Note that multiple kids can have the greatest number of candies.

 public class Greatest_no_of_candies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        List<Boolean> ans = new ArrayList<Boolean>();
        int greatest=0;
        for (int i = 0;i<candies.length;i++){
            if(candies[i]>=greatest){
                greatest = candies[i];
            }
        }

        for(int i=0;i<candies.length;i++){
            candies[i] += extraCandies;
            if(candies[i]>=greatest){
                ans.add(true);
            }else{
                ans.add(false);
            }
        }
        for(boolean fruit:ans)
            System.out.print(fruit+",");
    }

}
