package pl.sda.group2.intermediate.program;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GetEvaulator implements TaskEvaluator {


    public static final Pattern PATTERN = Pattern.compile("(\\w+)\\s+(\\w+)");
    private ProgramMemory programMemory;
    private Instruction instruction;

    public GetEvaulator(ProgramMemory programMemory, Instruction instruction) {
        this.programMemory = programMemory;
        this.instruction = instruction;
    }

    @Override
    public void evaluateTask(){
        String temp = instruction.getArguments();
        Matcher matcher = PATTERN.matcher(temp);

        if(matcher.find()){
            String key = matcher.group(1);
            String value = programMemory.getSetInstructions().get(matcher.group(2));
            programMemory.addSetInstructions(key, value);
        }
    }



}
