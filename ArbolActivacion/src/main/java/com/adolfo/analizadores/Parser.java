
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package com.adolfo.analizadores;

import java_cup.runtime.*;
import java.util.List;
import java.util.ArrayList;
import com.adolfo.analizadores.Token;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\034\000\002\002\004\000\002\002\005\000\002\002" +
    "\004\000\002\003\010\000\002\003\005\000\002\003\002" +
    "\000\002\006\006\000\002\007\004\000\002\007\004\000" +
    "\002\007\003\000\002\007\003\000\002\010\005\000\002" +
    "\010\003\000\002\011\005\000\002\011\005\000\002\011" +
    "\010\000\002\004\004\000\002\004\003\000\002\005\005" +
    "\000\002\005\003\000\002\012\004\000\002\012\004\000" +
    "\002\012\004\000\002\012\003\000\002\013\005\000\002" +
    "\013\005\000\002\013\005\000\002\013\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\075\000\006\003\004\015\006\001\002\000\006\003" +
    "\004\015\006\001\002\000\004\002\076\001\002\000\004" +
    "\011\007\001\002\000\010\002\ufffc\016\ufffc\021\ufffc\001" +
    "\002\000\010\002\000\016\011\021\012\001\002\000\004" +
    "\011\052\001\002\000\006\011\013\017\015\001\002\000" +
    "\006\004\016\006\017\001\002\000\010\002\ufffd\016\ufffd" +
    "\021\ufffd\001\002\000\010\002\ufff5\016\ufff5\021\ufff5\001" +
    "\002\000\012\005\031\011\027\013\030\014\032\001\002" +
    "\000\006\010\022\020\023\001\002\000\006\011\013\017" +
    "\015\001\002\000\010\002\ufff6\016\ufff6\021\ufff6\001\002" +
    "\000\004\011\025\001\002\000\004\012\024\001\002\000" +
    "\006\011\ufff4\017\ufff4\001\002\000\004\004\026\001\002" +
    "\000\012\005\031\011\027\013\030\014\032\001\002\000" +
    "\006\005\037\007\035\001\002\000\006\005\037\007\035" +
    "\001\002\000\010\011\uffea\012\uffea\017\uffea\001\002\000" +
    "\006\005\037\007\035\001\002\000\004\012\034\001\002" +
    "\000\006\011\ufff2\017\ufff2\001\002\000\010\011\040\013" +
    "\041\014\042\001\002\000\010\011\uffec\012\uffec\017\uffec" +
    "\001\002\000\010\011\uffe6\012\uffe6\017\uffe6\001\002\000" +
    "\006\005\037\007\035\001\002\000\006\005\037\007\035" +
    "\001\002\000\006\005\037\007\035\001\002\000\010\011" +
    "\uffe8\012\uffe8\017\uffe8\001\002\000\010\011\uffe9\012\uffe9" +
    "\017\uffe9\001\002\000\010\011\uffe7\012\uffe7\017\uffe7\001" +
    "\002\000\010\011\uffed\012\uffed\017\uffed\001\002\000\010" +
    "\011\uffeb\012\uffeb\017\uffeb\001\002\000\004\012\051\001" +
    "\002\000\006\011\ufff3\017\ufff3\001\002\000\004\004\053" +
    "\001\002\000\006\005\055\013\054\001\002\000\006\005" +
    "\072\007\071\001\002\000\004\011\ufff0\001\002\000\004" +
    "\011\057\001\002\000\004\004\061\001\002\000\010\002" +
    "\ufffe\016\ufffe\021\ufffe\001\002\000\012\005\031\011\027" +
    "\013\030\014\032\001\002\000\010\011\057\012\065\017" +
    "\064\001\002\000\010\002\ufff8\016\ufff8\021\ufff8\001\002" +
    "\000\010\002\ufff7\016\ufff7\021\ufff7\001\002\000\006\011" +
    "\057\017\070\001\002\000\010\002\ufffb\016\ufffb\021\ufffb" +
    "\001\002\000\010\002\ufff9\016\ufff9\021\ufff9\001\002\000" +
    "\010\002\ufffa\016\ufffa\021\ufffa\001\002\000\004\013\074" +
    "\001\002\000\004\011\uffee\001\002\000\004\011\ufff1\001" +
    "\002\000\006\005\072\007\071\001\002\000\004\011\uffef" +
    "\001\002\000\004\002\001\001\002\000\004\002\uffff\001" +
    "\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\075\000\004\002\004\001\001\000\004\002\076\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\003\007" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\010" +
    "\013\001\001\000\004\011\017\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\012\047\001\001\000\002\001" +
    "\001\000\004\010\020\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\012\032\001\001\000\004\013\046\001\001" +
    "\000\004\013\045\001\001\000\002\001\001\000\004\013" +
    "\035\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\013" +
    "\044\001\001\000\004\013\043\001\001\000\004\013\042" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\004\055\001" +
    "\001\000\004\005\072\001\001\000\002\001\001\000\004" +
    "\006\057\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\012\061\001\001\000\006\006\062\007\065\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\006\066\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\005\074\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}




    private List<String> errorSintactico;
    private List<String> datosList;
    private int contador = 0;
    private Generador generador;
    private String arbol;

	public Parser (Lexico lex) {
		super(lex);
        this.errorSintactico = new ArrayList();
        this.datosList = new ArrayList();
        this.generador = new Generador();
        this.arbol = "digraph grafica{\n"
                + "rankdir=TB;\n"
                + "node [shape = record, style=filled, fillcolor=seashell2];\n";
	}

    /*public void report_error(String message, Object info) {
		System.out.println("reporterror");
	}
	public void report_fatal_error(String message, Object info) {
		//System.out.println("reportfatal");
	}
	public void report_fatal_error(Symbol cur) {
		System.out.println("unrecovered_syntax_error");
	}*/
    
    @Override
    public void syntax_error(Symbol st) {
        Token token = (Token) st.value;
        //report_error("Error Sintactico con el  Token:"+ token.getLexema()+" este no pertenece a la estructura - linea: "+token.getLine()+" - columna: "+token.getColumna() + "\n",null);

        System.out.println("err: " + token.getLexema() + " este no pertenece a la estructura - linea: " + token.getLine() + ", columna: " + token.getColumna());
        errorSintactico.add(String.format("Error Sintactico lexema: %s  linea: %d  columna: %d. no se esperaba ese token.", token.getLexema(), token.getLine(), token.getColumna()));
    }

    protected int error_sync_size() {
		return 1;
	}
    //retorna las variables declaradas, que se van a utilizar en otras clases
         public String getArbol(){
	        return arbol;
	    }

    


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Parser$actions {
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action_part00000000(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= s EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // s ::= PROGRAMA ID pr 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Token e = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		System.out.println("inicio.. " + contador); contador++;
                                                arbol += "nodo"+contador +"  [ label =\""+e.getLexema()+"\"];\n";
                                                String raiz = "nodo"+contador;
                                                arbol +=  generador.ordenar(raiz, datosList); 
                                                datosList.clear();
                                            
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("s",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // s ::= error s 
            {
              Object RESULT =null;
		 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("s",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // pr ::= pr FUNCION ID PAREIN va mv 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		Token e = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		System.out.println("pr.. funcion id parin va" + contador); contador++;
                                            arbol += "nodo"+contador +"  [ label =\""+e.getLexema()+"\"];\n";
                                            String raiz = "nodo"+contador;
                                            arbol += generador.ordenar(raiz, datosList); 
                                            datosList.clear();
                                    
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("pr",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // pr ::= pr BEGIN var 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("pr",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // pr ::= 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("pr",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // mv ::= ID PAREIN xa c 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		Token e = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		 contador++;
                                        String hijo = "nodo"+contador;
                                        arbol += "nodo"+contador +"  [ label =\""+e.getLexema()+"\"];\n";
                                        datosList.add(hijo); 
                                         
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("mv",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // c ::= PUNTOCOMA END 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("c",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // c ::= PUNTOCOMA mv 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("c",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // c ::= mv 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("c",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // c ::= END 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("c",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // var ::= ID exp var 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Token e = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object e1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		System.out.println("var..id exp var " + contador); contador++;
                                        String hijo = "nodo"+contador;
                                        arbol += "nodo"+contador +"  [ label =\""+e.getLexema()+"\"];\n";
                                        datosList.add(hijo);
                                        if(!e1.toString().isEmpty()) {
                                            contador++;
                                            String dry = "nodo"+contador;
                                            arbol += "nodo"+contador +"  [ label =\""+e1.toString()+"\"];\n";
                                            arbol += hijo + " -> " + dry + ";\n";
                                        }
                                
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("var",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // var ::= END 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("var",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // exp ::= DOSP ENTERO PUNTOCOMA 
            {
              Object RESULT =null;
		System.out.println("exp..dosp entera " + contador);  RESULT = "";
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("exp",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // exp ::= PAREIN xa PUNTOCOMA 
            {
              Object RESULT =null;
		System.out.println("exp..paruntocoma " + contador);  RESULT = "";
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("exp",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // exp ::= DOSP IGUAL ID PAREIN xa PUNTOCOMA 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		Token e = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		System.out.println("exo..dosa " + contador);  RESULT = e.getLexema();
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("exp",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // va ::= PARAMETRO vva 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("va",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // va ::= PAREOUT 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("va",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // vva ::= COMA PARAMETRO vva 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("vva",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // vva ::= PAREOUT 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("vva",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // xa ::= PARAMETRO xxa 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("xa",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // xa ::= NUMEROS xxa 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("xa",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // xa ::= ID xxa 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("xa",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // xa ::= PAREOUT 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("xa",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // xxa ::= COMA PARAMETRO xxa 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("xxa",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // xxa ::= COMA NUMEROS xxa 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("xxa",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // xxa ::= COMA ID xxa 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("xxa",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // xxa ::= PAREOUT 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("xxa",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
              return CUP$Parser$do_action_part00000000(
                               CUP$Parser$act_num,
                               CUP$Parser$parser,
                               CUP$Parser$stack,
                               CUP$Parser$top);
    }
}

}
