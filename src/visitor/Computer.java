package visitor;

public class Computer implements ComputerPart {
    ComputerPart[] parts;

    public Computer(){
        parts = new ComputerPart[]{ new RAM(), new CPU(), new GPU(), new HDD(), new PSU(), new Motherboard()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for(ComputerPart part: parts){
            part.accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
