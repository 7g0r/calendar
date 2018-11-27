package pl.sda.group2.intermediate.program;

import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ProgramMemory {
    private List<Instruction> instructions = new ArrayList<>();
    private Map<String, String> setInstructions = new HashMap<>();
    private int index = 0;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void addInstruction(Instruction instruction) {
        instructions.add(instruction);
    }

    public List<Instruction> getInstructions() {
        return instructions;
    }

    public Map<String, String> getSetInstructions() {
        return setInstructions;
    }


    public void addSetInstructions(String key, String value) {
        getSetInstructions().put(key, value);
    }

    public boolean hasNext() {
        return index < instructions.size();
    }

    public Instruction getNext() {
        return instructions.get(index++);
    }
}
