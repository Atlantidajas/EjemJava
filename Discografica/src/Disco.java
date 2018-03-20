public class Disco implements Comparable<Disco> {
    private String cantante;
    private String album;
    private Integer anyo;
   
    public Disco(String cantante, String album, Integer anyo) {
        this.cantante = cantante;
        this.album = album;
        this.anyo = anyo;
    }
   
    public Integer getAnyo() {
        return anyo;
    }
    public void setCantante(String cantante) {
        this.cantante = cantante;
    }
   
    public String toString() {
        return cantante + ";" + album + ";" + anyo;
    }
   
    public int compareTo(Disco d) {
        return (this.anyo).compareTo(d.getAnyo());
    }
}