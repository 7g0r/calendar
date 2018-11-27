package pl.sda.group2.intermediate.program;

public class ErrorEvaulator implements TaskEvaluator {
    private Instruction instruction;

    public ErrorEvaulator(Instruction instruction) {
        this.instruction = instruction;
    }

    @Override
    public void evaluateTask(){

        System.out.println("No support for " + instruction.getType() + "task");
    }

}
