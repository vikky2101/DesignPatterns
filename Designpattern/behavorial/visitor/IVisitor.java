package visitor;

public interface IVisitor {

  double visit(Liquor liquorItem);

  double visit(Car carItem);

  double visit(Food foodItem);

}
