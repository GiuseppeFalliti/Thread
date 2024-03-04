#### Introduzione
Il progetto è un'applicazione Java che utilizza thread per contare il numero di occorrenze di un dato valore in una matrice generata casualmente.

#### Requisiti
- JDK (Java Development Kit) installato sul sistema

#### Utilizzo
1. Clonare il repository sul proprio sistema locale.
2. Compilare il programma eseguendo il seguente comando dalla radice del progetto:
    ```
    javac MainThread.java
    ```
3. Eseguire il programma con il seguente comando:
    ```
    java MainThread
    ```
4. Seguire le istruzioni visualizzate nell'output del programma.

#### Descrizione del Codice
Il codice è costituito da diverse parti:
- La classe `MainThread` estende la classe Thread e implementa la logica principale del programma.
- Viene utilizzata una `CountDownLatch` per sincronizzare l'avvio dei thread.
- Il metodo `RandomMatrix()` genera una matrice di numeri casuali.
- Nel metodo `run()` viene eseguito il conteggio del numero di occorrenze del valore specificato nella matrice.
- Nel metodo `main()` vengono creati e avviati i thread.

#### Personalizzazione
- È possibile modificare la costante `NUM` per contare occorrenze di valori diversi nella matrice.
- La dimensione della matrice può essere modificata modificando il valore `40` in `int[][] matrix = new int[40][40];`.

#### Note
- Questo programma è stato creato a scopo dimostrativo e può essere modificato o esteso in base alle proprie esigenze.

#### Autore
Questo progetto è stato sviluppato da [Giuseppe Falliti](https://github.com/GiuseppeFalliti).

#### Licenza
Questo progetto è distribuito con licenza [Inserire la tua scelta di licenza].

#### Contatti
Per domande o commenti, contattare [il tuo indirizzo email].

### Fine del README

Sostituisci i placeholder come `[Inserire la tua scelta di licenza]`, `[il tuo indirizzo email]`, `[Il tuo nome]` con le informazioni appropriate. Assicurati di personalizzare il README con dettagli pertinenti sul progetto e le istruzioni per l'utilizzo.
