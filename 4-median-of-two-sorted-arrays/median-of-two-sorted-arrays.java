class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int merged[] = new int [nums1.length + nums2.length];
        int i =0;
        int j =0;
        int k =0;

        while(i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                merged[k] = nums1[i];
                i++;
                
            } else {
                merged[k] = nums2[j];
                j++;
 
            }
            k++;

        }

        while (i<nums1.length) {
            merged[k] = nums1[i];
            i++;
            k++;
        }

            while (j<nums2.length) {
                merged[k] = nums2[j];
                j++;
                k++;

            }
            int n = merged.length;
            if(n%2 != 0){
                return merged[n/2];

            } 
               int mid1 = n/2-1;
               int mid2 = n/2;
               return(merged [mid1] + merged [mid2])/2.0;
            }
    
        }

        

        
    
