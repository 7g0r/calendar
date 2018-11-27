package pl.sda.group2.intermediate.program;


import lombok.Data;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Data
public class PrintEvaulator implements TaskEvaluator {

    private final Instruction instruction;
    private final ProgramMemory programMemory;
    public static final Pattern PATERN3 = Pattern.compile("\\$(\\w+)");

    public PrintEvaulator(Instruction instruction, ProgramMemory programMemory) {
        this.instruction = instruction;
        this.programMemory = programMemory;
    }
    public void evaluateTask() {
        String arguments = instruction.getArguments();
        System.out.println(parseArgument(arguments));
    }

    private String parseArgument(String arguments) {

        Matcher matcher = PATERN3.matcher(arguments);
        String printedline = arguments;
        while (matcher.find()) {
            String variableName = matcher.group(1);
            String value = programMemory.getSetInstructions().getOrDefault(variableName, "null");
            printedline =printedline.replaceFirst("\\$" + variableName, value);
        }
        return printedline;
    }
}
