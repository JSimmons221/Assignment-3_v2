public class Main {
    public static void main(String[] args){

        SalesManager serenity=new SalesManager(101, "Serenity", null);
        SalesManager jose=new SalesManager(37, "Jose", serenity);
        SalesManager amy=new SalesManager(112, "Amy", serenity);
        SalesAssociate david=new SalesAssociate(105, "David", serenity);
        SalesAssociate emily=new SalesAssociate(42, "Emily", jose);
        SalesAssociate george=new SalesAssociate(58, "George", amy);
        SalesAssociate anne=new SalesAssociate(88, "Anne", amy);
        Customer jordan=new Customer(14, "Jordan", david);
        Customer stephanie=new Customer(14, "Stephanie", emily);
        Customer gary=new Customer(14, "Gary", emily);
        Customer lisa=new Customer(14, "Lisa", anne);
        Customer damien=new Customer(14, "Damien", amy);
        Customer oliver=new Customer(14, "Oliver", george);

        serenity.addEmployee(jose);
        serenity.addEmployee(amy);
        serenity.addEmployee(david);
        david.setManager(serenity);
        amy.setManager(serenity);
        jose.setManager(serenity);

        amy.addEmployee(george);
        amy.addEmployee(anne);

        stephanie.setEmployee(emily);
        damien.setEmployee(amy);

        System.out.println(serenity.toString());
        System.out.println(amy.toString());
        System.out.println(david.toString());
        System.out.println(stephanie.toString());
        System.out.println(jordan.toString());
    }
}
