# Szabadkai János: Junior Java backend fejlesztő gyakorlati feladatok (javatraining-solutions)
#### Ez a repository tartalmazza a Junior Java backend fejlesztő gyakorlati feladatait és megoldásait valamint az órai-feladatokat és azok megoldásait.
### Bevezetés a nyelvi eszközökbe
#### Java osztályok
* classstructureio - Kiírás és beolvasás konzolról
##### *Számológép*

---

Készíts egy Calculator osztályt a classstructureio csomagba! A main metódusban kérj be a felhasználótól két egész számot! Az első sorban írd ki a műveletet a következő formátumban: 5 + 10! A második sorban írd ki az eredményt (15)!
##### *Regisztráció*

---

Készíts egy Registration osztályt a classstructureio csomagba! A main metódusban kérd be a felhasználótól a nevét és az email címét, majd írd ki, hogy milyen adatokkal regisztrált!
* classstructureattributes - Objektumok és attribútumok
##### *Ügyfél osztály*

---

Hozz létre egy Client osztályt, melynek három attribútuma van: név (name), születési év (year) és cím (address). Típusaik rendre String, int és String.
Hozz létre egy main() metódust a ClientMain osztályba, amelyben kipróbálod a Client osztály működését. Példányosítani kell egy objektumot a Client osztály alapján, majd kérd be az attribútumok értékét a felhasználótól. Ellenőrzésképp írd ki minden attribútumának értékét a konzolra!


##### *Zeneszámok*

---

Készíts egy Song osztályt, melyben eltárolhatod egy dal előadóját (band), címét (title) és a hosszát (length) percben!
Készíts main() metódust egy Music osztályba, ahol kérd be a felhasználótól a kedvenc zeneszáma adatait! Ellenőrzésképp írd ki a megadott adatokat előadó - cím (hossz percben) formában, azaz Britney Spears - Oops!...I Did It Again (4 perc)!
* classstructuremethods - Metódusok
##### *Ügyfél osztály*

---

Hozz létre egy Client osztályt, melynek három private attribútuma van: név (name), születési év (year) és cím (address). Típusaik rendre String, int és String!
Mind a három attribútumra legyen lekérdező és módosító metódus! Legyen egy public void migrate(String address) metódusa is, mely az ügyfél elköltözését implementálja, valójában beállítja a tárolt címet az új, paraméterként átadott címre. Hozz létre egy main() metódust egy ClientMain osztályban, amelyben kipróbálod az osztály működését! Példányosítani kell egy objektumot a Client osztály alapján, majd be kell állítani az attribútumai értékét. Írd ki konzolra az összes adatát, majd hívd meg a migrate() metódust egy másik címmel! Jelezd vissza a felhasználónak a címváltozás sikerességét úgy, hogy kiírod az eltárolt új címet!

##### *Jegyzeteljünk*

---

Készíts egy Note osztályt, melyben a felhasználó rövid szöveges jegyzetét tárolod. Tárolni kell a felhasználó nevét (name), a jegyzet témáját (topic) és szövegét (text). Fejlesztés során ezentúl mindig tartsd be az information hiding elvet, azaz az attribútumok legyenek privátak, és készíts hozzájuk gettereket és settereket! Készíts egy getNoteText() metódust, mely az osztály attribútumai alapján egyetlen szöveget ad vissza name: (topic) text formátumban! Teszteld az osztályod a NoteMain osztály main() metódusából! A Note tartalmának megjelenítésekor használd a getNoteText() metódust!
*classstructureconstructors - Konstruktorok
##### *Könyv osztály*

---

Hozz létre egy Book osztályt, melynek három privát attribútuma van: szerző (author), cím (title) és regisztrációs szám (regNumber), mindhárom típusa String.
A Book példányosításakor csak a szerzőt és a címet kelljen megadni.
Legyen egy public void register(String regNumber) metódusa, mely a nyilvántartásba vételt implementálja, és ennek paraméterül kell megadni a regisztrációs számot.
Írj egy main() metódust a BookMain osztályba, amivel kipróbálod a működését! Az attribútumok kiolvasásához használj gettereket!

##### *Raktár osztály*

---

Készíts egy Store osztályt, mely egy raktárt modellez. A raktár jellemzője az, hogy miből (product) és aktuálisan mekkora mennyiséget (stock) tárol. (Ennek a raktárnak speciális jellemzője, hogy csak egyféle terméket tud tárolni.) Az első attribútuma String, a második int típusú.
A Store példányosításakor elég megadni a tárolt terméket, a mennyiség mindig 0, ezért a konstruktor csak a terméket kapja meg kívülről.
Készíts hozzá két metódust, mely a tárolt mennyiséget változtatja: a store() metódusa a paraméterként kapott mennyiséget eltárolja a raktárban növelve ezzel a készletet, míg a dispatch() metódusa az elszállítást modellezi, azaz a paraméterként kapott mennyiséggel csökkenti a készletet! (Most még nem kell ellenőrizned, hogy elszállításkor van-e a raktárban elegendő mennyiségű terméket.)
A StoreMain osztály main() metódusában készíts két Store példányt, és teszteld, hogy mindkét raktár helyesen és függetlenül működik be- és kiszállítás esetén is!
*classstructureintegrate - UML, példányok konzol íráskor/olvasáskor
