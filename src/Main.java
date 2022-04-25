import java.io.File;

public class Main {
    public static void main(String[] args) {

        File file = new File("." + File.separator + "data");
        if(!(file.exists())) {
            file.mkdir();
        }

        QuizGui qGui = new QuizGui();

        qGui.display();


    }
}
