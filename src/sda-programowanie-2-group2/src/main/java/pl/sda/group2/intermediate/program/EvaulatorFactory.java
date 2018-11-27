package pl.sda.group2.intermediate.program;

public class EvaulatorFactory {


    ProgramMemory programMemory;

    public EvaulatorFactory(ProgramMemory programMemory) {
        this.programMemory = programMemory;
    }

    TaskEvaluator createInstructionEvaulatore(Instruction instruction) {
        String type = instruction.getType();
        if ("PRINT".equalsIgnoreCase(type)) {
            return new PrintEvaulator(instruction, programMemory);
        }
        if ("SET".equalsIgnoreCase(type)) {
            return new SetEvaulator(programMemory, instruction);
        }
        if ("GET".equalsIgnoreCase(type)) {
            return new GetEvaulator(programMemory, instruction);
        }
        if ("GOTO".equalsIgnoreCase(type)) {
            return new GetEvaulator(programMemory, instruction);
        } else {
            return new ErrorEvaulator(instruction);
        }

    }
}
