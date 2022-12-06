grammar HTMLHighlighting;

start returns [String val] : headerNode
    { $val = $headerNode.val;};

headerNode returns [String val] : packageNode? importNode?
    { $val = Tools.getClass($packageNode.val,"var") + Tools.nextLine(2) +Tools.getClass($importNode.val + ";","simple") + Tools.nextLine() ; };

packageNode returns [String val] :PACKAGE PACKAGE_NAME';'
    { $val = Tools.getPackage($PACKAGE_NAME.text) ; };

importNode returns [String val] :
    IMPORT PACKAGE_NAME PACKAGE_END? ';' importNode
        { $val = "fj" }
    | IMPORT PACKAGE_NAME PACKAGE_END? ';'
        { $val = Tools.getImport($PACKAGE_NAME.text); };

//заниеения примитивов

//название типа

//атрибуты переменной

//объявление

//присваивание

//аннотация к функции

//атрибуты функции

//аргументы функции

//возваращаемое значение

//функция

//функция с ошибкой

//if

//for

// try catch finally

//наследование

//



PACKAGE: 'package';
PACKAGE_END: '.*';
IMPORT: 'import';
NAME : [a-zA-Z_0-9]+ ;
PACKAGE_NAME : NAME(('.')NAME)*;
STRING : '"'[a-zA-Z_0-9]*'"';

WS: [ \t\r\n]+ -> channel(HIDDEN);