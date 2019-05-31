package Model;

import java.time.LocalTime;



public class Evento implements Comparable<Evento>{

	private LocalTime tempo;
	private TipoEvento tipo;
	
	public enum TipoEvento{
		ARRIVO_CLIENTI,
		TAVOLO_LIBERO
	}
	
	public Evento(LocalTime tempo, TipoEvento tipo) {
		super();
		this.tempo = tempo;
		this.tipo = tipo;
	}

	@Override
	public int compareTo(Evento altro) {

		return this.tempo.compareTo(altro.tempo);
	}

	public LocalTime getTempo() {
		return tempo;
	}

	public void setTempo(LocalTime tempo) {
		this.tempo = tempo;
	}

	public TipoEvento getTipo() {
		return tipo;
	}

	public void setTipo(TipoEvento tipo) {
		this.tipo = tipo;
	}
	
	
}
