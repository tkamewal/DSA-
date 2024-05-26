public class inviteParty {
     
    public static int CallGuests(int n) {
        if(n<=1){
            return 1;
        }
        //single
        int ways1=CallGuests(n-1);

        //pair
        int ways2=(n-1) * CallGuests(n-2);
        int totalWays=ways1+ways2;
        return totalWays;
    }

     public static void main(String[] args) {
        int n=5;
       System.out.println(CallGuests(n));
    }
}
