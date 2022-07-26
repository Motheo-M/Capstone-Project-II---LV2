// Imported modules
import javax.swing.*;
import java.awt.*;

// Class
public class CurrentProject {
    // MAin method
    public static void main(String[] args){
        // Project Input Details
        // Allows user to enter the data for each question asked
        // Try statements for ALL code
        // Will execute catch statements for All code
        try{

            // Try statements for main code
            // Will execute catch statements for this block only
            try {
                // Project Number
                int numProject = Integer.parseInt(JOptionPane.showInputDialog
                        ("What project number is this?"));
                // Project Name
                String nameProject = JOptionPane.showInputDialog("""
                        What is project name?
                        If no name is provided, the name should be the clients
                         name + the building being built. E.g. building.""");
                // Type of building
                String buildingProject = JOptionPane.showInputDialog
                        ("What type of building is being built?");
                // Physical address of new building
                String physicalAddressProject = JOptionPane.showInputDialog
                        ("What is the physical address" +
                                " of the project building?");
                // ERF Number of building
                int erfProject = Integer.parseInt(JOptionPane.showInputDialog
                        ("What is the ERF number of the building?"));
                // Total Fee for project
                int totalFeeProject = Integer.parseInt
                        (JOptionPane.showInputDialog
                        ("What is the total cost of the project?"));
                // Fee paid to date for project
                int paidToDateProject = Integer.parseInt
                        (JOptionPane.showInputDialog
                        ("What is the cost paid so far" +
                                " for the project to date?"));
                // Project deadline
                String deadlineProject = JOptionPane.showInputDialog
                        ("When is the project deadline?");

                /*
                Project details
                We call the Project constructor here
                */
                Project building = new Project();

                // The fields with the necessary data
                // inputs for the Project class
                building.setProjectNumber(numProject);
                building.setProjectName(nameProject);
                building.setBuilding(buildingProject);
                building.setPhysicalAddress(physicalAddressProject);
                building.setERF(erfProject);
                building.setTotalFee(totalFeeProject);
                building.setPaidToDate(paidToDateProject);
                building.setDeadline(deadlineProject);

                // Architect details
                // Allows user to enter the data for each question asked

                // Architect's name
                String nameArchitect = JOptionPane.showInputDialog
                        ("What is the name of the Architect?");
                // Architect's telephone number
                String telephoneArchitect = JOptionPane.showInputDialog
                        ("What is the phone number of the Architect?");
                // Architect's email address
                String emailArchitect = JOptionPane.showInputDialog
                        ("What is the email address of the Architect?");
                // Architect's physical address
                String physicalAddressArchitect = JOptionPane.showInputDialog
                        ("What is the physical address of the Architect?");

                // We call the Architect constructor here
                Architect designer = new Architect();

                // We've set the fields with the necessary
                // data for Architect class
                designer.setName(nameArchitect);
                designer.setTelephoneNumber(telephoneArchitect);
                designer.setEmail(emailArchitect);
                designer.setPhysicalAddress(physicalAddressArchitect);

                // Contractor details
                // Allows user to enter the data for each question asked

                // Contractor's name
                String nameContractor = JOptionPane.showInputDialog
                        ("What is the name of the Contractor?");
                // Contractor's telephone number
                String telephoneContractor = JOptionPane.showInputDialog
                        ("What is the phone number of the Contractor?");
                // Contractor's email address
                String emailContractor = JOptionPane.showInputDialog
                        ("What is the email address of the Contractor?");
                // Contractor's physical address
                String physicalAddressContractor = JOptionPane.showInputDialog
                        ("What is the physical address of the Contractor?");

                // We call the Contractor constructor here
                Contractor builder = new Contractor();

                // We've set the fields with the necessary
                // data for Contractor class
                builder.setName(nameContractor);
                builder.setTelephoneNumber(telephoneContractor);
                builder.setEmail(emailContractor);
                builder.setPhysicalAddress(physicalAddressContractor);

                // Customer details
                // Allows user to enter the data for each question asked

                // Customer's name
                String nameCustomer = JOptionPane.showInputDialog
                        ("What is the name of the Customer?");
                // Customer's telephone number
                String telephoneCustomer = JOptionPane.showInputDialog
                        ("What is the phone number of the Customer?");
                // Customer's email address
                String emailCustomer = JOptionPane.showInputDialog
                        ("What is the email address of the Customer?");
                // Customer's physical address
                String physicalAddressCustomer = JOptionPane.showInputDialog
                        ("What is the physical address of the Customer?");

                // We call the Customer constructor here
                Customer homeowner = new Customer();

                // We've set the fields with the necessary
                // data for Customer class
                homeowner.setName(nameCustomer);
                homeowner.setTelephoneNumber(telephoneCustomer);
                homeowner.setEmail(emailCustomer);
                homeowner.setPhysicalAddress(physicalAddressCustomer);

                // Print out the information of the Project
                System.out.println("Project:\n");
                System.out.println(building.getProjectNumber());
                System.out.println(building.getProjectName());
                System.out.println(building.getBuilding());
                System.out.println(building.getPhysicalAddress());
                System.out.println(building.getERF());
                System.out.println(building.getTotalFee());
                System.out.println(building.getPaidToDate());
                System.out.println(building.getDeadline());

                // Prints out the information of the Architect
                System.out.println("\n\nArchitect:\n");
                System.out.println(designer.getName());
                System.out.println(designer.getTelephoneNumber());
                System.out.println(designer.getEmail());
                System.out.println(designer.getPhysicalAddress());

                // Prints out the information of the Contractor
                System.out.println("\n\nContractor:\n");
                System.out.println(builder.getName());
                System.out.println(builder.getTelephoneNumber());
                System.out.println(builder.getEmail());
                System.out.println(builder.getPhysicalAddress());


                // Prints out the information of the Customer
                System.out.println("\n\nCustomer:\n");
                System.out.println(homeowner.getName());
                System.out.println(homeowner.getTelephoneNumber());
                System.out.println(homeowner.getEmail());
                System.out.println(homeowner.getPhysicalAddress());

                // Ask if user wants to change the deadline of the project
                String choice = JOptionPane.showInputDialog("""
                    Do you want to change the deadline of the project?
                    Yes - Enter Y
                    No - Enter N:
                    """);

                /*
                If statement
                Used to change the deadline and amount paid so far for project
                */
                if (choice.equals("Y")) {
                    // Enter the new deadline for the project
                    String date = JOptionPane.showInputDialog
                            ("Enter a new deadline: \n");
                    building.setDeadline(date);

                    // Prints out the information of the Project
                    System.out.println("\n\nProject:\n");
                    System.out.println(building.getProjectNumber());
                    System.out.println(building.getProjectName());
                    System.out.println(building.getBuilding());
                    System.out.println(building.getPhysicalAddress());
                    System.out.println(building.getERF());
                    System.out.println(building.getTotalFee());
                    System.out.println(building.getPaidToDate());
                    System.out.println(building.getDeadline());
                }

                // Ask if user wants to change the fee
                // paid so far for the project
                String fee = JOptionPane.showInputDialog("""
                    Do you want to update the total fee paid so far?
                    Yes - Enter Y
                    No - Enter N:
                    """);

                // If statement
                if (fee.equals("Y")) {
                    // Enter the new fee paid so far for the project
                    int paidFee = Integer.parseInt(JOptionPane.showInputDialog
                            ("Enter new updated fee paid so far: \n"));
                    building.setPaidToDate(paidFee);

                    // Print out the information of the Project
                    System.out.println("\n\nProject:\n");
                    System.out.println(building.getProjectNumber());
                    System.out.println(building.getProjectName());
                    System.out.println(building.getBuilding());
                    System.out.println(building.getPhysicalAddress());
                    System.out.println(building.getERF());
                    System.out.println(building.getTotalFee());
                    System.out.println(building.getPaidToDate());
                    System.out.println(building.getDeadline());
                }

                // Ask if user wants to change the contractors contact details
                String details = JOptionPane.showInputDialog("""
                    Do you want to update the contractors details?
                    Yes - Enter Y
                    No - Enter N:
                    """);

                /*
                If statement
                Used to change the contractors phone number and email address
                */
                if (details.equals("Y")) {
                    // Ask if user wants to change the
                    // contractors phone numbers
                    String telephone = JOptionPane.showInputDialog("""
                        Do you want to update the contractors phone number?
                        Yes - Enter Y
                        No - Enter N:
                        """);

                    // If statement for phone number
                    if (telephone.equals("Y")){
                        // Ask the user to enter the
                        // contractors new phone numbers
                        String number = JOptionPane.showInputDialog
                                ("Enter new phone numbers: \n");
                        builder.setTelephoneNumber
                                (String.valueOf(Integer.parseInt(number)));
                    }

                    // Ask if user wants to change
                    // the contractors email address
                    String email = JOptionPane.showInputDialog("""
                        Do you want to update the contractors email?
                        Yes - Enter Y
                        No - Enter N:
                        """);

                    if (email.equals("Y")){
                        // Ask the user to enter the
                        // contractors new email address
                        String address = JOptionPane.showInputDialog
                                ("Enter new email address: \n");
                        builder.setEmail(address);
                    }

                    // Print out the information of the Contractor
                    System.out.println("\n\nContractor:\n");
                    System.out.println(builder.getName());
                    System.out.println(builder.getTelephoneNumber());
                    System.out.println(builder.getEmail());
                    System.out.println(builder.getPhysicalAddress());
                }
            } catch (NullPointerException e) {
                // Null exception message if executed
                System.out.println("There is a null value");
                throw e;
            }
        }
        catch(HeadlessException e) {
            // Headless exception message if executed
            System.out.println("You are in a HEADLESS environment");
            throw e;
        }
        catch (RuntimeException e) {
            // Runtime exception message if executed
            System.out.println("Additional exceptions");
            throw e;
        }
    }
}


/* Reference
// https://www.geeksforgeeks.org/types-of-exception-in-java-with-examples/
// https://www.oracle.com/za/technical-resources/articles/java/javadoc-tool
*/

