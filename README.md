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
* classstructureconstructors - Konstruktorok
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
* classstructureintegrate - UML, példányok konzol íráskor/olvasáskor
##### *Termék*

---

Az alábbi diagram és a leírás alapján készítsd el a Product osztályt!

![image](https://user-images.githubusercontent.com/67753819/110314047-a36eb500-8007-11eb-8134-fa766804851d.png)

Az attribútumok kezdőértéket a konstruktorban kapnak. Az increasePrice() a paraméter értékével növeli, a decreasePrice() pedig csökkenti az aktuális árat.
Próbáld ki az osztály működését main() metódusban, ahol a példány létrehozásához szükséges adatokat a felhasználótól kéred be!

##### *Bankszámlák*

---

Az UML diagram és a leírás alapján készítsd el a BankAccount osztályt!

![image](https://user-images.githubusercontent.com/67753819/110313823-4a068600-8007-11eb-86fd-b9da35321985.png)

Számlanyitáshoz mindhárom attribútum értékét meg kell adni. A számlára lehet befizetni (deposit()), lehet róla pénzt kivenni (withdraw()), illetve másik számlára át lehet utalni összeget (transfer()). Ez utóbbi esetben a számla saját egyenlege csökken, de a másik számla egyenlegére jóváírás történik.
A getInfo() metódus a számla adatait az alábbi formában adja vissza Stringként:    Tóth Kálmán (10073217-12000098-67341590): 103400 Ft
Készíts egy Bank osztályt, amely main() metódusában létrehozol két bankszámlát! Próbáld ki az összes elkészített metódust, hogy jól működik-e! A szükséges adatokat a felhasználótól kérd be! Átutalásnál ellenőrizd mindkét számla új egyenlegét!

##### *2021.03.07 (week02d02) órai-feladat*

---

Írj egy Phone osztályt, type (String) és mem (int) attribútumokkal! Generálj konstruktort, gettert és settert! Írj bele egy main metódust, amivel példányosítasz egy osztályt, és kiírod az attribútumok értékeit!

##### *2021.03.08 (week02d03) órai-feladat*

---

Írj egy Product oszályt String name és String code attribútumokkal! 

![image](https://user-images.githubusercontent.com/67753819/110371772-b5734680-804d-11eb-9eae-cd73b4c7e8f6.png)

Legyen egy konstruktora a két attribútummal, Getterekkel! Legyen egy areTheyEqual() metódusa, mely kap egy másik Product példányt, és eldönti, hogy azonos-e az adott példánnyal. Két termék akkor egyezik, ha a nevük megegyezik.
**Bónusz:** szigorúbb egyelőség a feltételre: és a két termék kódjának hosszának különbsége maximum egy karakter lehet.

##### *2021.03.11 (week02d04) órai-feladat*

---

Hozz létre egy InputNames Java osztályt, melynek van egy main metódusa. Ciklusban kérj be öt nevet! A neveket tárold el egy tömbben! Írd ki a tömb tartalmát, sortöréssel elválasztva (írd bele, hogy hanyadik elem - 1-től sorszámozva)!

##### *2021.03.11 (week02d05) órai-feladat*

---

Hozz létre egy Languages osztályt, main metódussal! Ebben hozz létre egy listát, mely karakterláncokat tartalmaz! Vegyetek fel 3 elemet: Java, Python, JavaScript!
Írd ki, az öt karakternél hosszabb programozási nyelveket!
