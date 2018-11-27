package pl.sda.group2.intermediate.program;

import lombok.Data;

import java.util.List;
@Data
public class ProgramRunner {
    public void run(ProgramMemory programMemory){
        List<Instruction> instructions = programMemory.getInstructions();
        while (programMemory.hasNext()){
            TaskEvaluator taskEvaluator = new EvaulatorFactory(programMemory).createInstructionEvaulatore(programMemory.getNext());
            taskEvaluator.evaluateTask();
        }



        /*for (Instruction instruction : instructions){
            TaskEvaluator taskEvaluator = new EvaulatorFactory(programMemory).createInstructionEvaulatore(instruction);
            taskEvaluator.evaluateTask();
        }*/
        System.out.println(programMemory.getSetInstructions().entrySet());

    }

}
