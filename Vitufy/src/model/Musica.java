package model;

public class Musica
{
	public String nome;
	public String artista;
	public int duracao;
	
	public Musica(String nome, String artista, int duracao)
	{
		super();
		this.nome = nome;
		this.artista = artista;
		this.duracao = duracao;
	}
	
	@Override
	public String toString()
	{
		return "Música: " + this.nome + " - Artista: " + this.artista + " - Duração: " + this.duracao;
	}
}
