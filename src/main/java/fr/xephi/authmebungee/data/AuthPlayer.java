package fr.xephi.authmebungee.data;

public class AuthPlayer {

    private String name;
    private boolean isLogged;

    public AuthPlayer(String name, boolean isLogged) {
        this.name = name.toLowerCase();
        this.isLogged = isLogged;
    }

    public AuthPlayer(String name) {
        this(name, false);
    }

    public String getName() {
        return name;
    }

    public boolean isLogged() {
        return isLogged;
    }

    public void setLogged(boolean isLogged) {
        this.isLogged = isLogged;
    }

}
