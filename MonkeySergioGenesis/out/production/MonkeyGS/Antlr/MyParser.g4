parser grammar MyParser;

options {
    tokenVocab = Scanner;
}

program  	: statement*                #programa ;

statement  	: LET letStatement          #statLet |
             RETURN returnStatement     #staReturn|
             expressionStatement        #staExpresion;

letStatement    : ID IG expression ( PyCOMA | )         #letStatNodo ;

returnStatement	: expression ( PyCOMA | )               #returnStatNodo;

expressionStatement 	: expression ( PyCOMA | )       #espressionStatNodo;

expression             	: additionExpression comparison #expressionNodo;

comparison            	: ((MEN|MAY|MENI|MAYI|IGIG) additionExpression)*    #comparisionNodo;

additionExpression	: multiplicationExpression additionFactor               #addExprNodo;

additionFactor       	: ((SUM|SUB) multiplicationExpression)*             #addFactNodo;

multiplicationExpression : elementExpression multiplicationFactor           #multExprNodo;

multiplicationFactor	: ((MUL|DIV) elementExpression)*                    #multFactNodo;

elementExpression 	: primitiveExpression (elementAccess | callExpression | ) #elemtExprNodo;

elementAccess       	: PCI expression PCD    #eletAccNodo;

callExpression	: PIZQ expressionList PDER      #callExpNodo;

primitiveExpression	:   INTEGER                 #peInt|
                        STRING                  #peStr|
                        ID                      #peID|
                        TRUE                    #peTrue|
                        FALSE                   #prFalse|
                        PIZQ expression PDER    #peParExpre|
                       arrayLiteral             #peArrLit|
                       arrayFunctions PIZQ expressionList PDER  #peArrFuntExpL|
                       functionLiteral          #peFuntLit|
                       hashLiteral              #peHashLit|
                       printExpression          #pePrintExp|
                       ifExpression             #peIfExp;

arrayFunctions	:   LEN             #arrLen|
                    FIRST           #arrFirst|
                    LAST            #arrLast|
                    REST            #arrRest|
                    PUSH            #arrPush;

arrayLiteral    : PCI expressionList PCD                                #arrLit;

functionLiteral	: FN PIZQ functionParameters PDER blockStatement        #funtLitNodo;

functionParameters	: ID moreIdentifiers                                #funtParaNodo;

moreIdentifiers	: ( COMA ID )*                                          #moreIdNodo;

hashLiteral		: LLI hashContent moreHashContent LLD                   #hashLitNodo;

hashContent	: expression DOSPUN expression                              #hashContNodo;

moreHashContent	: (COMA hashContent)*                                   #moreHCNodo;

expressionList    : expression moreExpressions              #expListllena|   #expListVacia;

moreExpressions   : (COMA expression)*                                  #morExpNodo;

printExpression : PUTS PIZQ expression PDER                             #printExpNodo;

ifExpression : IF expression blockStatement (ELSE blockStatement | )    #ifExpNodo;

blockStatement : LLI statement* LLD                                     #blkStatNodo;


operator :  SUM     #opSum|
            SUB     #opSub|
            MUL     #opMul|
            DIV     #opDiv ;
