import java.util.Scanner;

class project{
public static void main(String arg[]){
    Scanner sc = new Scanner(System.in);

    int number = 1 + (int)(100 * Math.random());
    int number2 = 1 + (int)(100 * Math.random());
    int number3 = 1 + (int)(100 * Math.random());
    int number4 = 1 + (int)(100 * Math.random());
    int number5 = 1 + (int)(100 * Math.random());
    int number6 = 1 + (int)(100 * Math.random());
    int number7 = 1 + (int)(100 * Math.random());
    int number8 = 1 + (int)(100 * Math.random());
    int number9 = 1 + (int)(100 * Math.random());
    int number10 = 1 + (int)(100 * Math.random());
    int K = 5;
    int i;
    int guess;
    int score = 0;
    System.out.println("A number is chosen" + " between 1 to 100." + " Guess the number" + " within 5 tries.");
    
    for(i = 0; i < K; i++){
        System.out.println("Guess the number: ");

        guess = sc.nextInt();

    if(number == guess){
        System.out.println("CONGRATS YOU FOUND THE RIGHT NUMBER");
        System.out.println("The number was " + number);
        System.out.println("You have guessed the number in " + i + " tries!");
        score++;
        break;
        }

    if(number > guess && i != K - 1){ 
        System.out.println("The number is" + " greater than " + guess);
        }
    
    if(number < guess && i != K - 1){
        System.out.println("The number is " + "less than " + guess);
        }
        if(number == guess){
        System.out.println("CONGRATS YOU FOUND THE RIGHT NUMBER");
        System.out.println("The number was " + number);
        System.out.println("You have guessed the number in " + i + " tries!");
        score++;
        }

    if(number > guess && i != K - 1){ 
        System.out.println("The number is" + " greater than " + guess);
        }
    }
    for(i = 0; i < K; i++){
        System.out.println("Guess the number: ");
        guess = sc.nextInt();
    
    if(number2 < guess && i != K - 1){
        System.out.println("The number is " + "less than " + guess);
        }
        if(number2 == guess){
        System.out.println("CONGRATS YOU FOUND THE RIGHT NUMBER");
        System.out.println("The number was " + number2);
        System.out.println("You have guessed the number in " + i + " tries!");
        score++;
        break;
        }

    if(number2 > guess && i != K - 1){ 
        System.out.println("The number is" + " greater than " + guess);
        }
    }
    
    for(i = 0; i < K; i++){
        System.out.println("Guess the number: ");
        guess = sc.nextInt();
    if(number3 < guess && i != K - 1){
        System.out.println("The number is " + "less than " + guess);
        }
        if(number3 == guess){
        System.out.println("CONGRATS YOU FOUND THE RIGHT NUMBER");
        System.out.println("The number was " + number3);
        System.out.println("You have guessed the number in " + i + " tries!");
        score++;
        break;
        }

    if(number3 > guess && i != K - 1){ 
        System.out.println("The number is" + " greater than " + guess);
        }
    }
    for(i = 0; i < K; i++){
        System.out.println("Guess the number: ");
        guess = sc.nextInt();
    if(number4 < guess && i != K - 1){
        System.out.println("The number is " + "less than " + guess);
        }
        if(number4 == guess){
        System.out.println("CONGRATS YOU FOUND THE RIGHT NUMBER");
        System.out.println("The number was " + number4);
        System.out.println("You have guessed the number in " + i + " tries!");
        score++;
        break;
        }

    if(number4 > guess && i != K - 1){ 
        System.out.println("The number is" + " greater than " + guess);
        }
    }
    for(i = 0; i < K; i++){
        System.out.println("Guess the number: ");
        guess = sc.nextInt();
    if(number5 < guess && i != K - 1){
        System.out.println("The number is " + "less than " + guess);
        }
        if(number5 == guess){
        System.out.println("CONGRATS YOU FOUND THE RIGHT NUMBER");
        System.out.println("The number was " + number5);
        System.out.println("You have guessed the number in " + i + " tries!");
        score++;
        break;
        }

    if(number5 > guess && i != K - 1){ 
        System.out.println("The number is" + " greater than " + guess);
        }
    }
    for(i = 0; i < K; i++){
        System.out.println("Guess the number: ");
        guess = sc.nextInt();
    if(number6 < guess && i != K - 1){
        System.out.println("The number is " + "less than " + guess);
        }
        if(number6 == guess){
        System.out.println("CONGRATS YOU FOUND THE RIGHT NUMBER");
        System.out.println("The number was " + number6);
        System.out.println("You have guessed the number in " + i + " tries!");
        score++;
        break;
        }

    if(number6 > guess && i != K - 1){ 
        System.out.println("The number is" + " greater than " + guess);
        }
    }
    for(i = 0; i < K; i++){
        System.out.println("Guess the number: ");
        guess = sc.nextInt();
    if(number7 < guess && i != K - 1){
        System.out.println("The number is " + "less than " + guess);
        }
        if(number7 == guess){
        System.out.println("CONGRATS YOU FOUND THE RIGHT NUMBER");
        System.out.println("The number was " + number7);
        System.out.println("You have guessed the number in " + i + " tries!");
        score++;
        break;
        }

    if(number7 > guess && i != K - 1){ 
        System.out.println("The number is" + " greater than " + guess);
        }
    }
    for(i = 0; i < K; i++){
        System.out.println("Guess the number: ");
        guess = sc.nextInt();
    if(number8 < guess && i != K - 1){
        System.out.println("The number is " + "less than " + guess);
        }
        if(number8 == guess){
        System.out.println("CONGRATS YOU FOUND THE RIGHT NUMBER");
        System.out.println("The number was " + number8);
        System.out.println("You have guessed the number in " + i + " tries!");
        score++;
        break;
        }

    if(number8 > guess && i != K - 1){ 
        System.out.println("The number is" + " greater than " + guess);
        }
    }
    for(i = 0; i < K; i++){
        System.out.println("Guess the number: ");
        guess = sc.nextInt();
    if(number9 < guess && i != K - 1){
        System.out.println("The number is " + "less than " + guess);
        }
        if(number9 == guess){
        System.out.println("CONGRATS YOU FOUND THE RIGHT NUMBER");
        System.out.println("The number was " + number9);
        System.out.println("You have guessed the number in " + i + " tries!");
        score++;
        break;
        }

    if(number9 > guess && i != K - 1){ 
        System.out.println("The number is" + " greater than " + guess);
        }
    }
    for(i = 0; i < K; i++){
        System.out.println("Guess the number: ");
        guess = sc.nextInt();
    if(number10 < guess && i != K - 1){
        System.out.println("The number is " + "less than " + guess);
        }
        if(number10 == guess){
        System.out.println("CONGRATS YOU FOUND THE RIGHT NUMBER");
        System.out.println("The number was " + number10);
        System.out.println("You have guessed the number in " + i + " tries!");
        score++;
        break;
        }

    if(number10 > guess && i != K - 1){ 
        System.out.println("The number is" + " greater than " + guess);
        }
    }
    if(i==K){
        System.out.println("The number was " + number);
        System.out.println("You have used up all " + K + " tries.");
        System.out.println("Your final score is: " + score);
        }
   }
}


    


