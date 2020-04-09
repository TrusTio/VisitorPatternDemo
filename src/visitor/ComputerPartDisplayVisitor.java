package visitor;

public class ComputerPartDisplayVisitor implements  ComputerPartVisitor {

    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying Computer.");
    }

    @Override
    public void visit(RAM ram) {
        System.out.println("Displaying RAM.");
    }

    @Override
    public void visit(CPU cpu) {
        System.out.println("Displaying CPU.");
    }

    @Override
    public void visit(GPU gpu) {
        System.out.println("Displaying GPU.");
    }

    @Override
    public void visit(HDD hdd) {
        System.out.println("Displaying HDD.");
    }

    @Override
    public void visit(Motherboard motherboard) {
        System.out.println("Displaying Motherboard.");
    }

    @Override
    public void visit(PSU psu) {
        System.out.println("Displaying PSU.");
    }
}
