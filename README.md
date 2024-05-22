Step 1 : classi astratte

Realizzare un programma che rappresenti il regno animale.

Creiamo quindi una classe astratta Animale e delle classi che la estendono : Cane, Passerotto, Aquila, Delfino

Vogliamo che gli animali abbiano i seguenti metodi: 

void dormi() (mostra a video “Zzz”)

void verso() (mostra a video il verso fatto dall’animale specifico)

void mangia() (mostra a video quello che mangia : erba, carne, ...?)

Una volta create le classi, nel programma istanziare alcuni animali e utilizzare i metodi implementati.

Step 2 : interfacce Alcuni degli animali che abbiamo creato volano, altri nuotano.

Gli animali che volano hanno il seguente metodo :
void vola() (mostra a video “Sto volando!!!“)

Gli animali che nuotano hanno il seguente metodo :
void nuota() (mostra a video “Sto nuotando!!!“)

Scrivere un programma avente 2 metodi :
void faiVolare(IVolante animale)
void faiNuotare(INuotante animale)

Questi metodi prendono come parametro un animale che può o volare / nuotare e richiamano il corrispondente metodo vola() / nuota().
Scrivere un programma che istanzi animali che volano o nuotano e richiamare i metodi faiVolare / faiNuotare passandoglieli come parametro.


ESERCIZIO BONUS: Vogliamo realizzare una classe che si occupi di istanziare un oggetto che può essere un lettore dvd o playstation. Questa classe la chiameremo “Creator”. Esporrà un metodo (che chiameremo create) che preso in input il tipo di dispositivo da restituire (“lettore dvd”o “playstation”) dia in output una nuova istanza di quel dispositivo.
Entrambi i dispositivi avranno due metodi

- play() → che stampa a video “sono un (lettore dvd / playstation in base al dispositivo) e sono in modalità play”
- stop() → che stampa a video “sono un (lettore dvd / playstation in base al dispositivo) e sono in modalità stop”

Nota bene : il Creator può avere un solo metodo “create” e questo metodo potrà restituire istanze o di lettore dvd o di playstation.
