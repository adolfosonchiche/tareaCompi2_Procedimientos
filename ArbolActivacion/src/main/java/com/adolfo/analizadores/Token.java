package com.adolfo.analizadores;

/**
 *
 * @author hectoradolfo
 */
public class Token {

    private final int line;
    private final int columna;
    private final String lexema;

    public Token(String lexema, int line, int columna) {
        this.lexema = lexema;
        this.line = line;
        this.columna = columna;
    }
    
    public Token(int fila, int columna) {
        this(null, fila, columna);
    }

    /**
     * @return the fila
     */
    public int getLine() {
        return line;
    }

    /**
     * @return the columna
     */
    public int getColumna() {
        return columna;
    }

    /**
     * @return the lexema
     */
    public String getLexema() {
        return lexema;
    }

}
