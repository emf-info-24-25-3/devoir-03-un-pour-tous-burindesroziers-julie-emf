## REPONSES :
1. Peut-on modifier l'âge d'un chien une fois qu'il a été créé (essayez de donner 10 ans à chien3 pour vérifier) ? 

On ne peut pas sans ajouter de code.
Mais si on ajoute un setAge on peut.

2. Que se passe-t-il si on modifie le nom de chien2 ?

Avant la création : rien. Le chien s'appellera toujours Scooby Doo.
Après création : on ne peut pas sans rajouter du code.

3. Pourquoi tous les chiens ont tous le même nom ?

Parce que l'attribut nom est en static.

4. Observez avec attention les lignes N°20 à N°26 du main() et réfléchissez : par quel miracle le chien3 à la ligne N°26 s'affiche correctement ?
   Répondez à cette question en expliquant avec précision ce qui se passe et pourquoi.

Le miracle qui fait que chien3 s'affiche correctement repose sur le fait que tu as surcharge la méthode toString() dans la classe Chien. Quand tu essaies d'imprimer un objet dans Java, la méthode toString() est appelée automatiquement.

Cependant, le miracle ici est que, même si nom est statique, la méthode toString() est appelée sur l'objet chien3. À ce moment-là, le nom de tous les chiens (car ils partagent tous le même nom statique) sera utilisé, et l'affichage sera basé sur cette valeur partagée. Si tu changes le nom de l'un des chiens (comme expliqué dans la question 2), tous les chiens afficheront le même nom modifié.

En résumé, le chien s'affiche correctement car la méthode toString() formatte la sortie en utilisant le nom statique de l'objet Chien et l'âge de l'instance particulière. Cependant, comme l'attribut nom est statique, tous les chiens afficheront le même nom (le dernier nom qui a été affecté).

