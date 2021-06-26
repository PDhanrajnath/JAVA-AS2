class MainClass {

    public static void main(String[] args) {
        try {
            Assignment obj = new Assignment();
            obj.Auth("Dhanrajnath","GBG3Y93","Zemoso");
//            obj.Auth("Zem","GBG3Y93","Zemoso");
        }
        catch(UserName | Id | Dept e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Exception not caught.");
        }

    }

}