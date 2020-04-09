package visitor;

public interface ComputerPartVisitor {
    void visit(Computer computer);
    void visit(RAM ram);
    void visit(CPU cpu);
    void visit(GPU gpu);
    void visit(HDD hdd);
    void visit(Motherboard motherboard);
    void visit(PSU psu);
}
