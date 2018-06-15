/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcialpoo;

/**
 *
 * @author Mabel
 */
public class Costos {
    private int elixir;
    private int loralita;
    private int kryptonita;

    public Costos(int elixir, int loralita) {
        this.elixir = elixir;
        this.loralita = loralita;
    }

    
    public int getLoralita() {
        return loralita;
    }

    public void setLoralita(int loralita) {
        this.loralita = loralita;
    }

    public int getElixir() {
        return elixir;
    }

    public void setElixir(int elixir) {
        this.elixir = elixir;
    }

    public int getKryptonita() {
        return kryptonita;
    }

    public void setKryptonita(int kryptonita) {
        this.kryptonita = kryptonita;
    }
    
}
