
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package Analizadores;

import java_cup.runtime.*;
import Estructuras.*;
import java.util.ArrayList;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\036\000\002\002\004\000\002\013\002\000\002\007" +
    "\013\000\002\010\004\000\002\010\004\000\002\010\003" +
    "\000\002\010\003\000\002\005\004\000\002\005\003\000" +
    "\002\006\006\000\002\012\007\000\002\011\005\000\002" +
    "\011\005\000\002\011\004\000\002\011\004\000\002\011" +
    "\004\000\002\011\003\000\002\011\003\000\002\011\005" +
    "\000\002\011\003\000\002\002\011\000\002\003\003\000" +
    "\002\003\003\000\002\003\003\000\002\003\003\000\002" +
    "\003\003\000\002\004\005\000\002\004\005\000\002\004" +
    "\003\000\002\004\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\076\000\004\006\004\001\002\000\006\022\010\024" +
    "\013\001\002\000\004\002\006\001\002\000\004\002\001" +
    "\001\002\000\010\016\ufffb\022\ufffb\024\ufffb\001\002\000" +
    "\004\010\061\001\002\000\010\016\ufffc\022\ufffc\024\ufffc" +
    "\001\002\000\010\016\043\022\010\024\013\001\002\000" +
    "\004\011\014\001\002\000\004\012\015\001\002\000\024" +
    "\005\027\006\023\014\017\015\016\017\026\020\024\021" +
    "\021\025\022\033\020\001\002\000\024\005\027\006\023" +
    "\014\017\015\016\017\026\020\024\021\021\025\022\033" +
    "\020\001\002\000\024\005\027\006\023\014\017\015\016" +
    "\017\026\020\024\021\021\025\022\033\020\001\002\000" +
    "\026\005\uffee\006\uffee\013\uffee\014\uffee\015\uffee\017\uffee" +
    "\020\uffee\021\uffee\025\uffee\033\uffee\001\002\000\024\005" +
    "\027\006\023\014\017\015\016\017\026\020\024\021\021" +
    "\025\022\033\020\001\002\000\026\005\ufff0\006\ufff0\013" +
    "\ufff0\014\ufff0\015\ufff0\017\ufff0\020\ufff0\021\ufff0\025\ufff0" +
    "\033\ufff0\001\002\000\004\024\033\001\002\000\024\005" +
    "\027\006\023\014\017\015\016\017\026\020\024\021\021" +
    "\025\022\033\020\001\002\000\004\013\031\001\002\000" +
    "\024\005\027\006\023\014\017\015\016\017\026\020\024" +
    "\021\021\025\022\033\020\001\002\000\026\005\ufff1\006" +
    "\ufff1\013\ufff1\014\ufff1\015\ufff1\017\ufff1\020\ufff1\021\ufff1" +
    "\025\ufff1\033\ufff1\001\002\000\026\005\ufff4\006\ufff4\013" +
    "\ufff4\014\ufff4\015\ufff4\017\ufff4\020\ufff4\021\ufff4\025\ufff4" +
    "\033\ufff4\001\002\000\010\016\ufff7\022\ufff7\024\ufff7\001" +
    "\002\000\026\005\ufff3\006\ufff3\013\ufff3\014\ufff3\015\ufff3" +
    "\017\ufff3\020\ufff3\021\ufff3\025\ufff3\033\ufff3\001\002\000" +
    "\004\007\034\001\002\000\026\005\uffef\006\uffef\013\uffef" +
    "\014\uffef\015\uffef\017\uffef\020\uffef\021\uffef\025\uffef\033" +
    "\uffef\001\002\000\026\005\ufff2\006\ufff2\013\ufff2\014\ufff2" +
    "\015\ufff2\017\ufff2\020\ufff2\021\ufff2\025\ufff2\033\ufff2\001" +
    "\002\000\024\005\027\006\023\014\017\015\016\017\026" +
    "\020\024\021\021\025\022\033\020\001\002\000\026\005" +
    "\ufff6\006\ufff6\013\ufff6\014\ufff6\015\ufff6\017\ufff6\020\ufff6" +
    "\021\ufff6\025\ufff6\033\ufff6\001\002\000\024\005\027\006" +
    "\023\014\017\015\016\017\026\020\024\021\021\025\022" +
    "\033\020\001\002\000\026\005\ufff5\006\ufff5\013\ufff5\014" +
    "\ufff5\015\ufff5\017\ufff5\020\ufff5\021\ufff5\025\ufff5\033\ufff5" +
    "\001\002\000\010\016\ufffd\022\ufffd\024\ufffd\001\002\000" +
    "\004\016\045\001\002\000\010\016\ufffe\022\ufffe\024\ufffe" +
    "\001\002\000\004\016\046\001\002\000\004\016\047\001" +
    "\002\000\004\024\052\001\002\000\006\007\ufff9\024\ufff9" +
    "\001\002\000\006\007\000\024\052\001\002\000\004\010" +
    "\053\001\002\000\004\004\054\001\002\000\004\013\055" +
    "\001\002\000\006\007\ufff8\024\ufff8\001\002\000\004\007" +
    "\060\001\002\000\006\007\ufffa\024\ufffa\001\002\000\004" +
    "\002\uffff\001\002\000\004\024\062\001\002\000\004\011" +
    "\063\001\002\000\004\012\064\001\002\000\016\025\071" +
    "\026\065\027\072\030\070\031\067\032\066\001\002\000" +
    "\006\013\uffe5\023\uffe5\001\002\000\004\013\uffe8\001\002" +
    "\000\004\013\uffe9\001\002\000\004\013\uffea\001\002\000" +
    "\006\013\uffe4\023\uffe4\001\002\000\004\013\uffeb\001\002" +
    "\000\006\013\uffec\023\076\001\002\000\004\013\075\001" +
    "\002\000\010\016\uffed\022\uffed\024\uffed\001\002\000\006" +
    "\025\100\026\077\001\002\000\006\013\uffe6\023\uffe6\001" +
    "\002\000\006\013\uffe7\023\uffe7\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\076\000\004\007\004\001\001\000\010\002\010\010" +
    "\011\012\006\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\006\002\043\012\041\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\011\024\001\001\000\004\011\037\001" +
    "\001\000\004\011\035\001\001\000\002\001\001\000\004" +
    "\011\034\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\011\031\001\001\000\002\001\001\000\004\011\027" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\011\036\001\001\000\002\001" +
    "\001\000\004\011\040\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\006\005\050\006\047\001\001" +
    "\000\002\001\001\000\006\006\056\013\055\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\006\003\073\004\072\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
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
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    private ArrayList<Arbol> arboles = new ArrayList<Arbol>();
    private ArrayList<String> cadenas = new ArrayList<String>();
    private int contador=0;
    private int contadorH=1;

    public Arbol nuevoArbol(String nombre, NodoArbol raiz){
        return new Arbol(nombre, new NodoArbol(raiz, new NodoArbol(null, null, "#", contador, contadorH),".", contador+1, contadorH));
    }
    
    public ArrayList<Arbol> getArboles(){
        return arboles;
    }

    public ArrayList<String> devolver(){
        return cadenas;
    }

    public void syntax_error(Symbol s){
        System.err.println("Error Sintáctico en la Línea "+(s.left)+
        ", Columna "+s.right+". No se esperaba este componente: "+s.value+".");
    }
    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{
        System.err.println("Error sintáctico irrecurable en la Línea "+
        s.left+", Columna "+s.right+". Componente "+s.value+" no reconocido.");
    }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // NT$0 ::= 
            {
              Object RESULT =null;
System.out.println("Jalo :D");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$0",9, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // INICIO ::= llaveI CUERPO1 porcentaje porcentaje porcentaje porcentaje CUERPO2 NT$0 llaveC 
            {
              Object RESULT =null;
              // propagate RESULT from NT$0
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("INICIO",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-8)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // CUERPO1 ::= CUERPO1 CONJ 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("CUERPO1",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // CUERPO1 ::= CUERPO1 REGULAR 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("CUERPO1",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // CUERPO1 ::= CONJ 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("CUERPO1",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // CUERPO1 ::= REGULAR 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("CUERPO1",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // CUERPO2 ::= CUERPO2 VALIDACION 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("CUERPO2",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // CUERPO2 ::= VALIDACION 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("CUERPO2",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // VALIDACION ::= id dospt cadena ptcoma 
            {
              Object RESULT =null;
		int var1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int var1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		String var1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int var2left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int var2right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String var2 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int var3left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int var3right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String var3 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int var4left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int var4right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String var4 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=parser.cadenas.add(var1+var2+var3+var4);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("VALIDACION",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // REGULAR ::= id guion flecha EXPRESION ptcoma 
            {
              String RESULT =null;
		int var1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int var1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		String var1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		int var2left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int var2right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		NodoArbol var2 = (NodoArbol)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		parser.arboles.add(parser.nuevoArbol(var1, var2));contador=0;contadorH=1;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("REGULAR",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // EXPRESION ::= punto EXPRESION EXPRESION 
            {
              NodoArbol RESULT =null;
		int var1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int var1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		NodoArbol var1 = (NodoArbol)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int var2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int var2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoArbol var2 = (NodoArbol)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=new NodoArbol(var1, var2, ".", parser.contador, parser.contadorH);contador++;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPRESION",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // EXPRESION ::= orchar EXPRESION EXPRESION 
            {
              NodoArbol RESULT =null;
		int var1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int var1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		NodoArbol var1 = (NodoArbol)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int var2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int var2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoArbol var2 = (NodoArbol)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=new NodoArbol(var1, var2, "|", parser.contador, parser.contadorH);contador++;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPRESION",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // EXPRESION ::= mas EXPRESION 
            {
              NodoArbol RESULT =null;
		int var1left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int var1right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoArbol var1 = (NodoArbol)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=new NodoArbol(var1, null, "+", parser.contador, parser.contadorH);contador++;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPRESION",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // EXPRESION ::= asterisco EXPRESION 
            {
              NodoArbol RESULT =null;
		int var1left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int var1right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoArbol var1 = (NodoArbol)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=new NodoArbol(var1, null, "*", parser.contador, parser.contadorH);contador++;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPRESION",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // EXPRESION ::= interrog EXPRESION 
            {
              NodoArbol RESULT =null;
		int var1left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int var1right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoArbol var1 = (NodoArbol)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=new NodoArbol(var1, null, "?", parser.contador, parser.contadorH);contador++;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPRESION",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // EXPRESION ::= letraexp 
            {
              NodoArbol RESULT =null;
		int var1left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int var1right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String var1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=new NodoArbol(null, null, var1, parser.contador, parser.contadorH);contador++;contadorH++;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPRESION",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // EXPRESION ::= dig 
            {
              NodoArbol RESULT =null;
		int var1left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int var1right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String var1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=new NodoArbol(null, null, var1, parser.contador, parser.contadorH);contador++;contadorH++;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPRESION",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // EXPRESION ::= llaveI id llaveC 
            {
              NodoArbol RESULT =null;
		int var1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int var1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String var1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT=new NodoArbol(null, null, var1, parser.contador, parser.contadorH);contador++;contadorH++;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPRESION",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // EXPRESION ::= especial 
            {
              NodoArbol RESULT =null;
		int var1left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int var1right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String var1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=new NodoArbol(null, null, var1, parser.contador, parser.contadorH);contador++;contadorH++;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPRESION",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // CONJ ::= conjj dospt id guion flecha CUERPOCONJ ptcoma 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("CONJ",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // CUERPOCONJ ::= LISTA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("CUERPOCONJ",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // CUERPOCONJ ::= caso1 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("CUERPOCONJ",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // CUERPOCONJ ::= caso2 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("CUERPOCONJ",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // CUERPOCONJ ::= caso3 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("CUERPOCONJ",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // CUERPOCONJ ::= caso4 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("CUERPOCONJ",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // LISTA ::= LISTA coma dig 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("LISTA",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // LISTA ::= LISTA coma letra 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("LISTA",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // LISTA ::= letra 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("LISTA",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // LISTA ::= dig 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("LISTA",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}
