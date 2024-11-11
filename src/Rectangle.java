import java.util.Scanner;

public class Rectangle {
    private int height, width;
    char character;
    public Rectangle (int h, int w) {
        this.height = h;
        this.width = w;
    }
    public void setHeight(int h) {
        this.height = h;
    }
    public void setWidth(int w) {
        this.width = w;
    }

    public void drawRow(char character) {

        for(int j=0; j<width; j++){
            System.out.print(character);
        }
        System.out.println();
    }


    public void drawFilled(char c) {
        for(int i=0; i<height; i++){
            drawRow(c);
            System.out.println(" ");
        }
        System.out.println();

    }
    public void drawFilled() {

        drawFilled('*');
    }
    public void drawSec(char character) {
        for(int j=0; j<width; j++){
            if(j==0||j==width-1){
                System.out.print(character);
            }else System.out.print(" ");
        }
        System.out.println();
    }

    public void drawEmpty(char character) {
        for(int i=0; i<height; i++){
            if(i==0 || i==height-1){
                drawRow(character);
            } else {
                drawSec(character);
            }

        }
    }
    public void drawEmpty() {

        drawEmpty('*');
    }

    public void readRectFromConsole(){
    System.out.print("Enter height : ");
        Scanner sc = new Scanner(System.in);
        height = sc.nextInt();
        System.out.print("Enter width : ");
        width = sc.nextInt();
        System.out.print("Enter character : ");
        character = sc.next().charAt(0);
        drawFilled(character);
        drawEmpty(character);
    }

}

    /*public void drawEmpty(int height, int width) {
        for (int i =0; i < height; i++)
        {
            for (int j =0; j < width; j++)
            {
                if (i == 0 || i == height-1 ||
                        j == 0 || j == width-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();

        }*/

