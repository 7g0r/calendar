package pl.sda.group2.intermediate.program;

import lombok.extern.log4j.Log4j2;

import java.io.IOException;
@Log4j2
class ProgramComilerApplication {

    public static void main(String[] args) throws IOException {
        InstructionParser parser = new InstructionParser();
        ProgramMemory programMemory = new ProgramMemory();
        ProgramLoader loader = new ProgramLoader(programMemory,parser);
        loader.load();
        programMemory.getInstructions().forEach(System.out::println);
        ProgramRunner programRunner = new ProgramRunner();
        programRunner.run(programMemory);
    }
}
