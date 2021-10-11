class OrderedStream {
    //time O(1)
    
    int pointer;
    String[] res;

    public OrderedStream(int n) {
        pointer = 0;
        res = new String[n];
        
    }
    
    public List<String> insert(int idKey, String value) {
        
        List<String> list = new ArrayList<String>();
        
        res[idKey - 1] = value;
        
        while(pointer < res.length && res[pointer] != null){
            
            list.add(res[pointer]);
            pointer++;
        }
    return list;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */
