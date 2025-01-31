// Time Complexity : O(rows^2)
// Space Complexity : O(rows^2)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
//as the pattern suggests there is  1 at the start of each row and end of each row starting from row 2 and each element is the sum of sum of
//element at its same index and an element b4 it.
//so whenever we start new row we create a list asdd keep addding elements to that list depending upon the list of row above it 

class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> x = new ArrayList<>();
        x.add(1);
        result.add(x);
        for(int i=1; i<numRows; i++){
            List<Integer> li = new ArrayList<>(); 
            List<Integer> prev = result.get(i-1); 
            li.add(1);
            for(int j=1; j<i; j++){
                li.add(prev.get(j-1)+prev.get(j));
                System.out.println("jdhf");
            }
            
            li.add(1);
            System.out.println(li);
            result.add(li);
        }
        return result;
    }
}