package pl.sda.group2.intermediate.program;

import java.util.List;

public class GoToEvaulator implements TaskEvaluator {
    ProgramMemory programMemory;
    Instruction instruction;
    int index = 0;

    public GoToEvaulator(ProgramMemory programMemory, Instruction instruction) {
        this.programMemory = programMemory;
        this.instruction = instruction;
    }

    @Override
    public void evaluateTask() {
        index = Integer.parseInt(instruction.getArguments());
        programMemory.setIndex(findAdres(index));

    }

    public int findAdres( int index) {
        List<Instruction> instructionsList = programMemory.getInstructions();
        for ( int i = 0; i < instructionsList.size(); i++){

        }
        return -1;

    }
}