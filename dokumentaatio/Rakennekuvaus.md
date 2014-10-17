Pacman rakennekuvaus:

Ohjelman Main-metodi pitää sisällään kaksi pääkomponenttia, Peli-luokan olion sekä 
MainWindow-luokan olion. Peli-olio hoitaa sovelluslogiikan ja pelin etenemisen ja
MainWindow-olio kayttöliittymän ja pelitilanteen piirtämisen, sekä näppäimistön kuuntelijan
liikkumista ja muita toimintoja varten.

Peli-luokka sisaltaa ruudukon joka toimii kentän x,y - koordinaatistona sekä liikkuvat osat,
haamut ja Pacmanin. Ruudukko-luokka muodostuu kaksinkertaisesta ArrayListista, joka sisaltaa
Ruutu-luokan olioita. Jokainen ruutu pitää sisällän Piste-luokan tai Hedelmä-luokan olion,
joita Pacman syö päästessään ruutuun.

MainWindow taas pitää sisällään NewGame-napin, GameWindow-ikkunan, sekä pistetilanteen
näyttämisen hoitavan ScoreLabel-luokan. Myös näppäimistönkuuntelija-luokan olio on liitetty
MainWindowiin kuuntelijaksi. MainWindowin komponenteilla on pääsy MainWindowin attribuuttina
olevaan Peli-luokan olioon erinäisiä toimintoja varten.
