grammar HTMLHighlighting;
start returns [String val] : NAME { $val = "<p class=\"var\">" + $NAME.text + "</p>"; };
NAME : [a-zA-Z_0-9]+;
