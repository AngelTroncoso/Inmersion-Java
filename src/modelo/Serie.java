package modelo;

public class Serie extends Titulo{
    private int temporadas;
    private int episodioPorTemporada;
    private int duracionEnMinutosPorEpisodios;

    @Override
    public int getTiempoDeDuracionEnMinutos() {
        return duracionEnMinutosPorEpisodios * episodioPorTemporada * temporadas;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodioPorTemporada() {
        return episodioPorTemporada;
    }

    public void setEpisodioPorTemporada(int episodioPorTemporada) {
        this.episodioPorTemporada = episodioPorTemporada;
    }

    public int getDuracionEnMinutosPorEpisodios() {
        return duracionEnMinutosPorEpisodios;
    }

    public void setDuracionEnMinutosPorEpisodios(int duracionEnMinutosPorEpisodios) {
        this.duracionEnMinutosPorEpisodios = duracionEnMinutosPorEpisodios;
    }
}
