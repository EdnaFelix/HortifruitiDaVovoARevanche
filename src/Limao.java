public class Limao extends Produto{

	public Limao() {
        super(4.10,"Lim�o");
    }
	@Override
	public double getPreco() {
	 return this.getPrecoUnitario()*this.getQtde();	
	}
}
