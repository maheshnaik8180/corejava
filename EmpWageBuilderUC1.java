public class EmpWageBuilderUC1 {
public static void main(String[] args) {
			int perHr =20;
			int dailywageFull = 0;
			int dailywagepart = 0;

		System.out.println("Welcome to Daily Employee wage");

        for ( int i=0; i<=20; i++ )
			{
           int empcheck = (int) (Math.random() *10) % 3;
        switch (empcheck)
			{
				case 1:
				System.out.println("Full time Employee is Present");
        dailywageFull = dailywageFull + perHr * 8;
				break;

				case 2:
                System.out.println("part time Employee is present");
			dailywagepart = dailywagepart + perHr * 8;
				break;
				
				default:
					System.out.println("Employee is Abscent");


        }
}
				System.out.println("Full time Employee wage:" + dailywageFull);
				System.out.println("part time Employee wage:" + dailywagepart);
				System.out.println("Total Employee wage" +(dailywageFull + dailywagepart));
}

}
