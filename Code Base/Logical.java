public class Logical {
    public static void main(String [] args){
        boolean islogged = true;
        boolean isadmin = false;
        System.out.println("Regular User:  " + (islogged && isadmin));
        System.out.println("Has Access: " + (islogged || isadmin));
        System.out.println("Not logged in: "+ !islogged);
    }
    
}
