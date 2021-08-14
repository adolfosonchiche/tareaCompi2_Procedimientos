package com.adolfo.analizadores;
/*primera seccion: codigo usuario*/
import java_cup.runtime.*;
import static com.adolfo.analizadores.sym.*;
import com.adolfo.analizadores.Token;
import java.util.ArrayList;
import java.util.List;
%%

/*segunda seccion: configuaracion*/
%class Lexico
%cup
%cupdebug
%line
%column
%public 

/*datos de los simbolos a utilizar*/
//COMILLA = [\"]
PAREIN = [\(]
PAREOUT = [\)]
COMA = [,]
NUMEROS = [0-9]+
SALTOS =   [ \n\f\t\b\r]+
PUNTOCOMA = [;]
DOSP = [:]
IGUAL = [=]
/*texto palno*/
PROGRAMA = "programa"
FUNCION = "procedimiento"
END = "end"
ENTERO = "integer"
PARAMETRO = "param"
BEGIN = "begin"
ID = [a-zA-Z]+[a-zA-Z0-9]* 


%{
private List<String> errorList;

%}

%{
	private Symbol symbol(int type) {
        String lexeme = yytext();
        //System.out.printf("Token tipo %d, lexeme %s, en linea %d, columna %d\n", type, lexeme == null ? "" : lexeme, yyline + 1, yycolumn + 1);
        return new Symbol(type, new Token(lexeme, yyline + 1, yycolumn + 1));
    }

    private Symbol symbol(int type, String lexeme) {
        //System.out.printf("Token tipo %d, lexeme %s, en linea %d, columna %d\n", type, lexeme == null ? "" : lexeme, yyline + 1, yycolumn + 1);
        return new Symbol(type, new Token(lexeme, yyline + 1, yycolumn + 1));
    }

    private void error(String lexeme) {
       // System.out.printf("Error Lexico en el Texto: %s  linea %d,  columna %d. \n", lexeme, yyline + 1, yycolumn + 1);
        errorList.add(String.format("Error Lexico del simbolo: %s , linea %d, columna %d,  no reconocido, resuelva!.", lexeme, yyline + 1, yycolumn + 1));
    }

    public List<String> getErrorList() {
        return errorList;
    }
%}

%init{
    errorList = new  ArrayList<>();
%init}


%%

<YYINITIAL> {
    {PAREIN}           { return symbol(PAREIN, yytext()); }
    {PAREOUT}           { return symbol(PAREOUT, yytext()); }
    {DOSP}          { return symbol(DOSP, yytext()); }
    {COMA}          { return symbol(COMA, yytext()); }
    {IGUAL}         { return symbol(IGUAL, yytext()); }
    
    {PUNTOCOMA}     { return symbol(PUNTOCOMA, yytext()); }
    {PARAMETRO}          { return symbol(PARAMETRO, yytext()); }
    {NUMEROS}       { return symbol(NUMEROS, yytext()); }
    {PROGRAMA}       { return symbol(PROGRAMA, yytext()); }
    {FUNCION}       { return symbol(FUNCION, yytext()); }
    {END}       { return symbol(END, yytext()); }
    {ENTERO}       { return symbol(ENTERO, yytext()); }
    {BEGIN}       { return symbol(BEGIN, yytext()); }
    {ID}            { return symbol(ID, yytext()); }
    {SALTOS}        {/*ignoramos*/ }
    [^]             { error(yytext()); } 

}
