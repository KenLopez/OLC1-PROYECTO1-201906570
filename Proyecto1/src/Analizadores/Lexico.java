/* The following code was generated by JFlex 1.7.0 */

package Analizadores;
import java_cup.runtime.Symbol;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>src/Analizadores/Lexico.jflex</tt>
 */
public class Lexico implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\1\1\3\1\11\1\11\1\10\22\0\1\1\1\13\1\2"+
    "\2\24\1\33\1\24\1\22\2\0\1\35\1\34\1\45\1\30\1\32"+
    "\1\7\12\15\1\27\1\31\1\12\1\0\1\14\1\36\1\0\2\16"+
    "\1\37\6\16\1\43\3\16\1\20\1\41\13\16\1\0\1\4\2\0"+
    "\1\6\1\0\2\17\1\40\6\17\1\44\3\17\1\21\1\42\13\17"+
    "\1\25\1\5\1\26\1\23\6\0\1\11\u1fa2\0\1\11\1\11\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\1\1\3\1\1\1\4\3\1"+
    "\1\5\1\6\2\7\1\10\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\2\7\1\22\1\0"+
    "\1\23\3\0\1\24\1\25\6\0\1\25\1\0\1\26"+
    "\1\0\1\26\1\27\2\2\3\0\1\27\1\30\1\31"+
    "\1\32\1\25\1\23\1\0\1\2\1\0\1\33\1\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[62];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\46\0\114\0\162\0\46\0\230\0\276\0\344"+
    "\0\u010a\0\u0130\0\46\0\u0156\0\u017c\0\u01a2\0\46\0\46"+
    "\0\46\0\46\0\46\0\46\0\u0130\0\46\0\46\0\46"+
    "\0\u01c8\0\u01ee\0\46\0\u0214\0\46\0\u023a\0\u0260\0\u0286"+
    "\0\46\0\276\0\u02ac\0\u02d2\0\u02f8\0\u031e\0\u0344\0\u036a"+
    "\0\u0390\0\u03b6\0\46\0\u03dc\0\u03b6\0\u03b6\0\46\0\u0402"+
    "\0\u0428\0\u044e\0\u0474\0\46\0\u031e\0\46\0\46\0\u049a"+
    "\0\u03b6\0\u04c0\0\u0474\0\u04e6\0\276\0\u050c";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[62];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\2\1\10"+
    "\1\3\1\0\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\15\1\16\2\2\1\12\1\17\1\20\1\21\1\22"+
    "\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32"+
    "\1\15\1\16\1\15\1\16\1\33\47\0\1\3\6\0"+
    "\1\3\35\0\2\34\1\35\1\36\1\37\16\34\1\40"+
    "\22\34\2\0\1\41\15\0\3\41\30\0\2\42\6\0"+
    "\5\42\15\0\6\42\10\0\1\43\51\0\1\44\55\0"+
    "\1\45\37\0\1\14\5\0\1\46\27\0\2\42\6\0"+
    "\5\42\1\0\1\47\13\0\6\42\6\0\2\42\6\0"+
    "\5\42\1\0\1\50\13\0\6\42\6\0\2\42\6\0"+
    "\5\42\1\0\1\47\13\0\2\42\2\51\2\42\6\0"+
    "\2\42\6\0\5\42\1\0\1\50\13\0\2\42\2\51"+
    "\2\42\1\0\2\52\1\53\1\0\1\54\41\52\2\0"+
    "\1\53\43\0\2\52\1\55\1\0\1\54\43\52\1\53"+
    "\1\0\1\54\6\52\1\56\10\52\1\56\6\52\1\56"+
    "\12\52\3\43\1\57\4\43\1\60\1\0\34\43\13\61"+
    "\1\62\1\63\31\61\2\0\1\64\10\0\1\64\10\0"+
    "\1\64\6\0\1\64\27\0\1\65\46\0\1\66\1\0"+
    "\1\66\16\0\1\66\1\0\1\66\1\0\1\66\21\0"+
    "\1\67\1\0\1\67\16\0\1\67\1\0\1\67\1\0"+
    "\1\67\6\0\2\42\6\0\3\42\2\70\15\0\6\42"+
    "\1\0\2\52\1\35\1\0\1\54\43\52\1\71\1\0"+
    "\1\54\41\52\3\0\1\57\42\0\13\61\1\72\45\61"+
    "\1\62\1\73\31\61\14\0\1\74\36\0\2\42\6\0"+
    "\5\42\15\0\4\42\2\75\1\0\13\74\1\76\1\57"+
    "\31\74\13\61\1\72\1\63\44\61\1\72\1\73\31\61";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1330];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\2\1\1\11\5\1\1\11\3\1\6\11"+
    "\1\1\3\11\2\1\1\11\1\0\1\11\3\0\1\11"+
    "\1\1\6\0\1\1\1\0\1\11\1\0\2\1\1\11"+
    "\1\1\3\0\1\11\1\1\2\11\2\1\1\0\1\1"+
    "\1\0\1\1\1\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[62];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true iff the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true iff the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexico(java.io.Reader in) {
      yyline = 1;
    yychar = 1;
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 152) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { System.err.println("Error léxico en: "+yytext()+", en la linea: "+(yyline)+", en la columna: "+(yychar));
            } 
            // fall through
          case 28: break;
          case 2: 
            { 
            } 
            // fall through
          case 29: break;
          case 3: 
            { yychar=1;
            } 
            // fall through
          case 30: break;
          case 4: 
            { return new Symbol(sym.orchar, yyline, yychar, yytext());
            } 
            // fall through
          case 31: break;
          case 5: 
            { return new Symbol(sym.flecha, yyline, yychar, yytext());
            } 
            // fall through
          case 32: break;
          case 6: 
            { return new Symbol(sym.dig, yyline, yychar, yytext());
            } 
            // fall through
          case 33: break;
          case 7: 
            { return new Symbol(sym.letra, yyline, yychar, yytext());
            } 
            // fall through
          case 34: break;
          case 8: 
            { return new Symbol(sym.llaveI, yyline, yychar, yytext());
            } 
            // fall through
          case 35: break;
          case 9: 
            { return new Symbol(sym.llaveC, yyline, yychar, yytext());
            } 
            // fall through
          case 36: break;
          case 10: 
            { return new Symbol(sym.dospt, yyline, yychar, yytext());
            } 
            // fall through
          case 37: break;
          case 11: 
            { return new Symbol(sym.guion, yyline, yychar, yytext());
            } 
            // fall through
          case 38: break;
          case 12: 
            { return new Symbol(sym.ptcoma, yyline, yychar, yytext());
            } 
            // fall through
          case 39: break;
          case 13: 
            { return new Symbol(sym.punto, yyline, yychar, yytext());
            } 
            // fall through
          case 40: break;
          case 14: 
            { return new Symbol(sym.porcentaje, yyline, yychar, yytext());
            } 
            // fall through
          case 41: break;
          case 15: 
            { return new Symbol(sym.mas, yyline, yychar, yytext());
            } 
            // fall through
          case 42: break;
          case 16: 
            { return new Symbol(sym.asterisco, yyline, yychar, yytext());
            } 
            // fall through
          case 43: break;
          case 17: 
            { return new Symbol(sym.interrog, yyline, yychar, yytext());
            } 
            // fall through
          case 44: break;
          case 18: 
            { return new Symbol(sym.coma, yyline, yychar, yytext());
            } 
            // fall through
          case 45: break;
          case 19: 
            { return new Symbol(sym.cadena, yyline, yychar, 
(yytext()).substring(1,yytext().length()-1));
            } 
            // fall through
          case 46: break;
          case 20: 
            { return new Symbol(sym.especial, yyline, yychar, yytext());
            } 
            // fall through
          case 47: break;
          case 21: 
            { return new Symbol(sym.id, yyline, yychar, yytext());
            } 
            // fall through
          case 48: break;
          case 22: 
            { return new Symbol(sym.letraexp, yyline, yychar, 
(yytext()).substring(1,yytext().length()-1));
            } 
            // fall through
          case 49: break;
          case 23: 
            { return new Symbol(sym.caso4, yyline, yychar, yytext());
            } 
            // fall through
          case 50: break;
          case 24: 
            { return new Symbol(sym.caso1, yyline, yychar, yytext());
            } 
            // fall through
          case 51: break;
          case 25: 
            { return new Symbol(sym.caso2, yyline, yychar, yytext());
            } 
            // fall through
          case 52: break;
          case 26: 
            { return new Symbol(sym.caso3, yyline, yychar, yytext());
            } 
            // fall through
          case 53: break;
          case 27: 
            { return new Symbol(sym.conjj, yyline, yychar, yytext());
            } 
            // fall through
          case 54: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
