class func {
    static int add(int a , int b){
        return a + b;
    }
    static double add(double a, double b ){
        return a + b;
    }
    public static void main(String[] args) {
        int result = add(5, 6);
        System.out.println(result);

        double result2 = add(5.12 , 6.96);
        System.out.println(result2);

    }
}
