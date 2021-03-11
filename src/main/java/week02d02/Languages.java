package week02d02;

import java.util.ArrayList;
import java.util.List;

public class Languages {

    private List<String> programsList = new ArrayList<>();

    public List<String> ProgramLongerThanFiveChars(List<String> programsList) {
        List<String> fillterdProgramList = new ArrayList<>();
        for (String program : programsList) {
            if (program.length() > 5) {
                fillterdProgramList.add(program);
            }
        }
        return fillterdProgramList;
    }

    public static void main(String[] args) {

        Languages languages = new Languages();

        languages.programsList.add("Java");
        languages.programsList.add("Python");
        languages.programsList.add("JavaScrip");

        System.out.println(languages.ProgramLongerThanFiveChars(languages.programsList));
    }
}
