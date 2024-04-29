package controller;

import lib.model.Lista;
import model.Musica;

public class MusicaController
{
	public MusicaController()
	{
		super();
	}
	
	public void adicionaMusica(Lista<Musica> lista, String musica)
	{
		int primeiro, segundo;
		int i = 0;
		
		while (musica.charAt(i) != ';') i++;
		primeiro = i++;
		
		
		
		String nome;
		String artista;
		int duracao;
	}
}
