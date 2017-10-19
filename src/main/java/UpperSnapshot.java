public class UpperSnapshot{
    public String changeToUpper(String input){
        return input.toUpperCase();
    }
    public static void main(String[] args){ UpperSnapshot u = new UpperSnapshot();
        //System.out.println(u.changeToUpper("mohanty"));
        System.out.println(u.sum(args[0]));
    }
    public String sum(String inputFromUser){return "ThisIsReturnedFromRelease-1.2"+" "+inputFromUser ;};
}

