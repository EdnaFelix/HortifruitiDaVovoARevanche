
public class Pera extends Produto {

	public Pera() {
        super(10.50, "P�ra");
    }
	@Override
	public double getPreco() {
	 return this.getPrecoUnitario()*this.getQtde();	
	}
}
