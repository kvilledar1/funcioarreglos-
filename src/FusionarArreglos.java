
public class FusionarArreglos {
    public int[] fusionarYOrdenar(int[] nums1, int[] nums2) {
        int[] resultado = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;
        
        
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                resultado[k++] = nums1[i++];
            } else {
                resultado[k++] = nums2[j++];
            }
        }
        
        
        while (i < nums1.length) {
            resultado[k++] = nums1[i++];
        }
        
        
        while (j < nums2.length) {
            resultado[k++] = nums2[j++];
        }
        
        return resultado;
    }
}
