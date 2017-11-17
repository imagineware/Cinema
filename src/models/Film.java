package models;

public class Film {
    private String title;
    private int minutes;
    private int certificate;
    private String director;
    private boolean is3D;

    public Film() {

    }

    public Film(String title, int minutes, int classification, String director, boolean is3D) {
        this.title = title;
        this.minutes = minutes;
        this.certificate = classification;
        this.director = director;
        this.is3D = is3D;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getCertificate() {
        return certificate;
    }

    public void setCertificate(int certificate) {
        this.certificate = certificate;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public boolean is3D() {
        return is3D;
    }

    public void setIs3D(boolean is3D) {
        this.is3D = is3D;
    }
}
