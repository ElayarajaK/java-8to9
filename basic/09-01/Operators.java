class Operators{

    /*
     * 1. i++ (post inc)
     * 2.++i (pre inc)
     * 3. i-- (post dec)
     * 4. --i(pre dec)
     */
    public static void main(String[] args) {
        
        int i=1;

        i=i++ + i;
        i=i++ + i;;
        // 1  + 2
        System.out.println(i);

    }
}