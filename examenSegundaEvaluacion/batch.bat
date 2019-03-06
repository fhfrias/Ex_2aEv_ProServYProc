::cancelamos el echo para que no moleste
 @echo off
 ::mostramos la ruta y el nombre de este bat
 echo estas ejecutando el archivo %0
 ::si se nos pasó algún parámetro, lo mostramos
 if not "%1"=="" (
     echo pasaste el/los parámetro/s %*
 ) else (
     echo no pasaste ningún argumento al programa
 )
 ::espera que se pulse una tecla para terminar
 pause
