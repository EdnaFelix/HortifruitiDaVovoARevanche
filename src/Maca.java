class Maca extends Produto {
 
	public Maca() {
        super(1.10,"Ma��");
    }
	@Override
	public double getPreco() {
	 return this.getPrecoUnitario()*this.getQtde();	
	}
}
