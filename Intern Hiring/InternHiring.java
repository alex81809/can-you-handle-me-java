import java.util.Scanner;

public class InternHiring {
    public static Candidate getCandidateDetails() throws InvalidInternException {
        Scanner scanner = new Scanner(System.in);
        // we are creating a hiring tool where the HR can register candiates based on eligibility to the database
        // database connection is not done in this program to avoid complexity at this point of time
        // this could be completed using simple if else too btu when systems become complex and big 
        // using the standard approach becomes the best solution
        System.out.println("Enter the candidate detailsT");
        
        System.out.println("Name");
        String name = scanner.next();

        System.out.println("Gender");
        String gender = scanner.next();

        System.out.println("Enter percentage in 10th");
        int percentage = scanner.nextInt();
        //extra eligibility criteria can also be added based on the understanding
        //12th marks
        //does skills contains Java ...........
        if (percentage < 50) {
            throw new InvalidInternException("Registration Failed. Percentage cannot be less than 50%.");
        } else {
            Candidate candidate = new Candidate();
            candidate.setName(name);
            candidate.setGender(gender);
            candidate.setPercentage(percentage);
            
            return candidate;
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to InternHiring Tool");

        try {
            Candidate candidate = getCandidateDetails();
            System.out.println("Registration Successful");
            // consider this was a working application over here if reg is successful
        } catch (InvalidInternException e) {
            System.out.println(e.getMessage());
        }
    }
}
