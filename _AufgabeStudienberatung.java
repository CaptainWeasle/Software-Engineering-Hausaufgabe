import java.util.Scanner;

main AufgabeStudienberatung{
	public void main(String [] args){

		Scanner peter = new Scanner(System.in);

		System.out.println("Hast du Abitur? \nAntworte bitte mit j/n"); //Question 1

		String answerQ1 = peter.nextLine();


		System.out.println("Hast du Fachabitur?"); //Question 2

		String answerQ2 = peter.nextLine();

		System.out.println("Bist du wissensbegierig?"); //Question 3

		String answerQ3 = peter.nextLine();

		System.out.println("Hast du eine Berufsausbildung?");

		String answerQ4 = peter.nextLine();

	}
}