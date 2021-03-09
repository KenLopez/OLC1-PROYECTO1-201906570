package Analizadores;
import java_cup.runtime.Symbol;

%%
%class Lexico
%public
%line
%char
%cup
%unicode
%ignorecase

%init{
    yyline = 1;
    yychar = 1;
%init}

BLANCOS = [ \r\t]+
CADENAS = [\"]([^\"\n]|(\\\"))*[\"]
ID=[A-Z|a-z]+["_"|0-9|A-Z|a-z]*
COMLINEA = ("//".*\r\n)|("//".*\n)|("//".*\r)
COMMULT = "<!""!"*([^!>]|[^!]">"|"!"[^>])*"!"*"!>"
D = [0-9]+
LETRA = [A-Z]|[a-z]
LETRAEXPREG = \"[^\"]\"
ESPECIAL = ("\\n"|"\\""\'"|"\\""\"")
CASO1 = [0-9]"~"[0-9]
CASO2 = [A-Z]"~"[A-Z]
CASO3 = [a-z]"~"[a-z]
CASO4 = [ -}]"~"[ -}]

%%

{COMLINEA}      {}
{COMMULT}       {}
{D}             {return new Symbol(sym.dig, yyline, yychar, yytext());}
{LETRA}         {return new Symbol(sym.letra, yyline, yychar, yytext());}
{ESPECIAL}      {return new Symbol(sym.especial, yyline, yychar, yytext());}
{LETRAEXPREG}   {return new Symbol(sym.letraexp, yyline, yychar, 
(yytext()).substring(1,yytext().length()-1));}
{CADENAS}       {return new Symbol(sym.cadena, yyline, yychar, 
(yytext()).substring(1,yytext().length()-1));}

"{"             {return new Symbol(sym.llaveI, yyline, yychar, yytext());}
"}"             {return new Symbol(sym.llaveC, yyline, yychar, yytext());}                 
":"             {return new Symbol(sym.dospt, yyline, yychar, yytext());}
"-"             {return new Symbol(sym.guion, yyline, yychar, yytext());}
">"             {return new Symbol(sym.flecha, yyline, yychar, yytext());}
";"             {return new Symbol(sym.ptcoma, yyline, yychar, yytext());}
"."             {return new Symbol(sym.punto, yyline, yychar, yytext());}
"|"             {return new Symbol(sym.orchar, yyline, yychar, yytext());}
"%"             {return new Symbol(sym.porcentaje, yyline, yychar, yytext());}
"+"             {return new Symbol(sym.mas, yyline, yychar, yytext());}
"*"             {return new Symbol(sym.asterisco, yyline, yychar, yytext());}
"?"             {return new Symbol(sym.interrog, yyline, yychar, yytext());}
"CONJ"          {return new Symbol(sym.conjj, yyline, yychar, yytext());}
","             {return new Symbol(sym.coma, yyline, yychar, yytext());}


\n              {yychar=1;}

{BLANCOS}       {}
{ID}            {return new Symbol(sym.id, yyline, yychar, yytext());}
{CASO1}         {return new Symbol(sym.caso1, yyline, yychar, yytext());}
{CASO2}         {return new Symbol(sym.caso2, yyline, yychar, yytext());}
{CASO3}         {return new Symbol(sym.caso3, yyline, yychar, yytext());}
{CASO4}         {return new Symbol(sym.caso4, yyline, yychar, yytext());}

. {
    System.err.println("Error léxico en: "+yytext()+", en la linea: "+(yyline)+", en la columna: "+(yychar));
}