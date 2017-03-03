package org.compi2.codigo3d.parser;

import java_cup.runtime.Symbol;

//Scanner para generar C3D
%%
%{
    //Código de usuario
    

%}

%cup
%class scanner
%public
%line
%char
%column
%full

MAS		= "+"
MENOS		= "-"
MULT       	= "*"
DIV             = "/"
POT             = "^"
PAR_IZQ         = "("
PAR_DER         = ")"

REL_IGUAL       = "=="
REL_DIF         = "!="
REL_MAY         = ">"
REL_MEN         = "<"
REL_MAYI        = ">="
REL_MENI        = "<="

LOG_AND         = "&&"
LOG_OR          = "||"
LOG_NOT         = "!"

ID              = [A-Za-z][_0-9A-Za-z]*
ENTERO          = [0-9]+
DECIMAL         = [0-9]+"."[0-9]+

SPACE   = [\ \r\t\f\t]
ENTER   = [\ \n]

%%

<YYINITIAL> {ID}            { return new Symbol(sym.ID, yyline, yycolumn, yytext()); }
<YYINITIAL> {ENTERO}        { return new Symbol(sym.ENTERO, yyline, yycolumn, yytext()); }
<YYINITIAL> {DECIMAL}       { return new Symbol(sym.DECIMAL, yyline, yycolumn, yytext()); }
<YYINITIAL> {MAS}           { return new Symbol(sym.MAS, yyline, yycolumn, null); }
<YYINITIAL> {MENOS}	    { return new Symbol(sym.MENOS, yyline, yycolumn, null); }
<YYINITIAL> {MULT}          { return new Symbol(sym.MULT, yyline, yycolumn, null); }
<YYINITIAL> {DIV}	    { return new Symbol(sym.DIV, yyline, yycolumn, null); }
<YYINITIAL> {POT}	    { return new Symbol(sym.POT, yyline, yycolumn, null); }
<YYINITIAL> {PAR_IZQ}	    { return new Symbol(sym.PAR_IZQ, yyline, yycolumn, null); }
<YYINITIAL> {PAR_DER}	    { return new Symbol(sym.PAR_DER, yyline, yycolumn, null); }

<YYINITIAL> {REL_IGUAL}	    { return new Symbol(sym.REL_IGUAL, yyline, yycolumn, null); }
<YYINITIAL> {REL_DIF}	    { return new Symbol(sym.REL_DIF, yyline, yycolumn, null); }
<YYINITIAL> {REL_MAY}	    { return new Symbol(sym.REL_MAY, yyline, yycolumn, null); }
<YYINITIAL> {REL_MEN}	    { return new Symbol(sym.REL_MEN, yyline, yycolumn, null); }
<YYINITIAL> {REL_MAYI}	    { return new Symbol(sym.REL_MAYI, yyline, yycolumn, null); }
<YYINITIAL> {REL_MENI}	    { return new Symbol(sym.REL_MENI, yyline, yycolumn, null); }

<YYINITIAL> {LOG_AND}	    { return new Symbol(sym.LOG_AND, yyline, yycolumn, null); }
<YYINITIAL> {LOG_OR}	    { return new Symbol(sym.LOG_OR, yyline, yycolumn, null); }
<YYINITIAL> {LOG_NOT}	    { return new Symbol(sym.LOG_NOT, yyline, yycolumn, null); }




<YYINITIAL> {SPACE}     { /*Espacios en blanco, ignorados*/ }
<YYINITIAL> {ENTER}     { /*Saltos de linea, ignorados*/}

<YYINITIAL>. {
        String errLex = "Error léxico, caracter irreconocible: '"+yytext()+"' en la línea: "+(yyline+1)+" y columna: "+yycolumn;
        System.err.println(errLex);
}