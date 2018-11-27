package pl.sda.group2.intermediate.program;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
class Instruction {
    private Long address;
    private String type, arguments;
}
