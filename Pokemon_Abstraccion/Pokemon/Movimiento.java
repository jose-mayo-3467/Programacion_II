package pokemon;

class Movimiento {
    private String nombre;
    private int PuntosDeAtaque;
    private int pp; //significa puntos de poder, al llegar a 0 el pokemon ya no puede segir atacando
    private Tipo tipo;

    public Movimiento(String nombre, int PuntosDeAtaque, int pp, Tipo tipo) {
        this.nombre = nombre;
        this.PuntosDeAtaque = PuntosDeAtaque;
        this.pp = pp;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntosDeAtaque() {
        return PuntosDeAtaque;
    }

    public int getPp() {
        return pp;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setPp(int pp) {
        this.pp = pp;
    }
    
}

    public void setPp(int pp) {
        this.pp = pp;
    }
    
}
