public class MyException extends Exception {

    private static final long serialVersionUID = 1L;

    @Override
    public String getMessage() {
        System.out.println("Go away!!  extra student!!");
        return super.getMessage();
    }

}