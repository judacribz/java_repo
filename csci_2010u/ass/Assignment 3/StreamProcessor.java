/*
	@author: Jude Sheron Balasingam(100504990)
	@title:  Assignment
*/

class StreamProcessor{
  	private int index;
  	private int value;
  	private BTree storage;
  	private BTree storageAVL;
	private BTree iStorage;
	private BTree iStorageAVL;
	long time1, time2, treeSetup = 0, totalSearch = 0, totalAt = 0;
	int size, countSearch = 0, countAt = 0;

  	public StreamProcessor() {
    	this.index = 0;
    	this.storage = new BTree();
    	this.storageAVL = new BTree();
    	this.iStorage = new BTree();
    	this.iStorageAVL = new BTree();
  	}

  	public void consume(int v) {
  		time1 = System.currentTimeMillis();
    	storage.insert(v, index);
    	time2 = System.currentTimeMillis();
    	treeSetup += time2 - time1;

    	iStorage.insert(v, index);
    	index++;
  	}

  	public void consumeAVL(int v) {
  		time1 = System.currentTimeMillis();
  		storageAVL.insertAVL(v, index);
  		time2 = System.currentTimeMillis();
  		treeSetup += time2 - time1;

    	iStorageAVL.insertAVL(v, index);
    	index++;
  	}

  	public void search(int v) { //search binary tree
  		countSearch++;
    	time1 = System.currentTimeMillis();
    	storage.search(v);
    	time2 = System.currentTimeMillis();
    	totalSearch += time2 - time1;
    	
    	size = storage.results.size();
    	Integer[] arr = new Integer[size];
    	storage.results.toArray(arr);

    	System.out.print("search("+v+") = [");
    	for(int i=0; i<size-1; i++)
    		System.out.print(arr[i] + ", ");
    	System.out.println(arr[size-1] + "]");
  	}

  	public void at(int i) { //at binary tree
  		countAt++;
    	time1 = System.currentTimeMillis();
    	iStorage.at(i);
    	time2 = System.currentTimeMillis();
    	totalAt += time2 - time1;

    	if(iStorage.results.size() == 0)
    		System.out.println("at(" + i + ") = undefined");
    	else
    		System.out.println("at(" + i + ") = " + iStorage.results.get(0));
    }

  	public void searchAVL(int v) { //search avl tree
  		countSearch++;
    	time1 = System.currentTimeMillis();
    	storageAVL.search(v);
    	time2 = System.currentTimeMillis();
    	totalSearch += time2 - time1;

    	size = storageAVL.results.size();
   		Integer[] arr = new Integer[size];
    	storageAVL.results.toArray(arr);

    	System.out.print("search("+v+") = [");
    	for(int i=0; i<size-1; i++)
    		System.out.print(arr[i] + ", ");
    	System.out.println(arr[size-1] + "]");
  	}

  	public void atAVL(int i) { //at avl tree
  		countAt++;
    	time1 = System.currentTimeMillis();
    	iStorageAVL.at(i);
    	time2 = System.currentTimeMillis();
    	totalAt += time2 - time1;

    	if(iStorageAVL.results.size() == 0)
    		System.out.println("at(" + i + ") = undefined");
    	else
    		System.out.println("at(" + i + ") = " + iStorageAVL.results.get(0));
  	}

  	public void show() {    
   	 	//System.out.println("Binary Tree(search)");
		//storage.print_dot();
		//System.out.println("Binary Tree(at)");
		//iStorage.print_dot();
		
		System.out.println("time (tree setup) = " + treeSetup + " ms");
		System.out.println("time (average search) = " + (totalSearch/(float)countSearch) + " ms");
		System.out.println("time (average at) = " + (totalAt/(float)countAt) + " ms");
  	}

  	public void showAVL() {
  		//System.out.println("AVL Tree(search)");
		//storageAVL.print_dot();
		//System.out.println("AVL Tree(at)");
		//iStorageAVL.print_dot();

		System.out.println("time (tree setup) = " + treeSetup + " ms");
		System.out.println("time (average search) = " + (totalSearch/(float)countSearch) + " ms");
		System.out.println("time (average at) = " + (totalAt/(float)countAt) + " ms");
  	}
}