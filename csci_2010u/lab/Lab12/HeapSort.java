public class HeapSort {
	private int[] heap;
  	private int len;

	public HeapSort() {
	}

	public int left(int i) {
  		return 2*i+1;
  	}

  	public int right(int i) {
  		return 2*i+2;
	}

	public void buildHeap(int[] arr){
	    heap = new int[len];
	    for(int j = 0; j < len; j++) 
	    	heap[j] = arr[j];

	    for(int i = len/2 - 1; i >= 0; i--) {
	      	fixHeap(i);
	  	}
	}

	public void fixHeap(int pos) {
	   	if(left(pos) < len) {
	      	int largest = pos;
	      	int r = right(pos);
	      	int l = left(pos);
	      	
	      	if(r < len && heap[largest] < heap[r]) 
	      		largest = r;
	      	if(l < len && heap[largest] < heap[l]) 
	      		largest = l;

	      	if(largest != pos) {
	        	swap(pos, largest);
	        	fixHeap(largest);
	    	}
	    }
  	}

	public int extractMax() {
		int max = heap[0];
	    heap[0] = heap[--len];
	    fixHeap(0);
	    return max;
	}

  	public int[] sort(int[] arr, boolean ascend){
  		len = arr.length;
    	buildHeap(arr);

    	for(int i = len - 1; i >= 0; i--){
      		heap[i] = extractMax();
    	}

    	if(!ascend) {
    		int k = arr.length;
    		for(int i=0; i<=arr.length/2-1; i++)
    			swap(i, --k);
    	}

    	return heap;
  	}

  	public void swap(int i, int j){
    	heap[i] = heap[i] + heap[j];
    	heap[j] = heap[i] - heap[j];
    	heap[i] = heap[i] - heap[j];
  	}
}