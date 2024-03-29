package br.com.ufpb.dce.poo.projeto.farmacia;


import java.util.LinkedList;
import java.util.List;

public class Farmacia {
	private GerenteDeProdutos gerenteProduto;
	
	private GerenteDeClientes gerenteCliente;
	
	public Farmacia() {
		gerenteProduto = new GerenteDeProdutos();
		gerenteCliente = new GerenteDeClientes();
	}

	public void cadastraProduto(Produto p){
		this.gerenteProduto.cadastraProduto(p);
	}
	public void removerProdutoPeloCodigo(int numProduto){
		this.gerenteProduto.removerProdutoPeloCodigo(numProduto);
	}
	public Produto pesquisarProdutoPeloNome(String nome) {
		return this.gerenteProduto.pesquisarProdutoPeloNome(nome);
	}
	public void adicionarProdutoEmEstoque(int codProduto, int quantidade) {
		this.gerenteProduto.adicionarProdutoEmEstoque(codProduto, quantidade);
	}
	public List<Produto> buscarProdutosPeloPreco(double preco) {
		return this.gerenteProduto.buscarProdutosPeloPreco(preco);
	}
	public List<Produto> listProdutos() {
		return this.gerenteProduto.listProdutos();
	}
	public Produto getProduto(long codProduto) {
		return this.gerenteProduto.getProduto(codProduto);
	}

	public void cadastrarCliente(Cliente c) {
		this.gerenteCliente.cadastrarCliente(c);
		// TODO Auto-generated method stub
		
	}

	public Cliente pesquisarCliente(String id) {
		return this.gerenteCliente.pesquisarCliente(id);
	}

	public List<Cliente> listClientes() {
		return this.gerenteCliente.listClientes();
	}

	public void removerCliente(String id) {
		this.gerenteCliente.removerCliente(id);
		
	}
}
