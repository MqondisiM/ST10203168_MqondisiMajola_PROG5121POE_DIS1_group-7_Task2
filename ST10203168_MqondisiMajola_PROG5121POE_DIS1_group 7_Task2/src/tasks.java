import javax.swing.JOptionPane;

public class tasks {
static void checkTaskDescription(String taskDescription ) {
	if(taskDescription.length() >50) {
		JOptionPane.showMessageDialog(null, "No more than 50 characters can be entered");
	}
}
static void printTaskDetails(String taskName, int taskNumber, String taskDescription, String developerDetails, int taskDuration, int taskID, String taskStatus) {
		
		JOptionPane.showMessageDialog(null,"Task name: " + taskName
				+ "\n"
				+ "Task number: " + taskNumber
				+ "\n"
				+ "Task description: " + taskDescription
				+ "\n"
				+ "Developemnt: " + developerDetails
				+ "\n"
				+ "Task duration: " + taskDuration
				+ "\n"
				+ "Task ID: " + taskID
				+ "\n"
				+ "Task status: " + taskStatus);
		}
static void returnTotalHours(int taskDuration, int totalDuration, int i) {
	totalDuration = taskDuration + i;
}
	public static void main(String[] args) {
		
		
		String[] task1 = {"Task name ", "Task number", "Task Discription", "DeveloperDetails", "Task duration", "Task ID", "Task status"};
		String[] task2 = {"Task", "Task number 2", "Pseudocode for programming", "5hrs", "Task2", "Active"};
		String[] task3 = {"Task", "Task number 3", "Development of application", "10hrs", "Task3", "Active"};
		
		String taskName;
		String taskDescription; 
		String developerDetails;
		int taskDuration;
		String taskStatus;
		
		int taskNumber=0;
		int taskID=0;
		int numericMenu = 1;
		int totalDuration = 0;
		
		JOptionPane.showMessageDialog(null, "Welcome Kyrie Irving");
		
		while (numericMenu !=3) {
		
			int count = Integer.parseInt(JOptionPane.showInputDialog("Choose one of the options below \n"
				+ "1) Add tasks \n"
				+ "2) Show report \n"
				+ "3) Quit \n"));
			if(count ==1) {
				int numberOfTasks = Integer.parseInt(JOptionPane.showInputDialog("Add the number of tasks"));
					if(numberOfTasks ==0) {
						JOptionPane.showMessageDialog(null, "Add tasks for you to work in!!");
						
					if(numberOfTasks >3) {
						JOptionPane.showMessageDialog(null, "No more than 100 Tasks can be entered");
				}
					
					}
					else if(numberOfTasks ==1) {
							taskName = (JOptionPane.showInputDialog(task1[0]));
							taskNumber = taskNumber + 1;
							taskDescription = (JOptionPane.showInputDialog(task1[2]));
							checkTaskDescription(taskDescription);
							developerDetails = (JOptionPane.showInputDialog(task1[3]));
							taskDuration = Integer.parseInt(JOptionPane.showInputDialog(task1[4]));
							taskID = taskID + 1;
							taskStatus = (JOptionPane.showInputDialog(task1[6]));
						
							printTaskDetails(taskName, taskNumber, taskDescription, developerDetails, taskDuration, taskID, taskStatus);
						}
					else if (numberOfTasks >1) {
						for(int i = 1; i <=numberOfTasks; i++) {
							taskName = (JOptionPane.showInputDialog(task1[0]));
							taskNumber = taskNumber +  i;
							taskDescription = (JOptionPane.showInputDialog(task1[2]));
							checkTaskDescription(taskDescription);
							developerDetails = (JOptionPane.showInputDialog(task1[3]));
							taskDuration = Integer.parseInt(JOptionPane.showInputDialog(task1[4]));
							returnTotalHours(taskDuration, totalDuration, i);
							taskID = taskID + i;
							taskStatus = (JOptionPane.showInputDialog(task1[6]));
							
							printTaskDetails(taskName, taskNumber, taskDescription, developerDetails, taskDuration, taskID, taskStatus);
						}
						
					}
						
					
			}
			
			else if(count == 2) {
				JOptionPane.showMessageDialog(null, "COMING SOON!!");
			}
				
			else {
				System.exit(count);
			}	
		}
		}
			
			
		}


