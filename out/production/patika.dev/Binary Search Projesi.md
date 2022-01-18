[7, 5, 1, 8, 3, 6, 0, 9, 4, 2] dizisinin Binary-Search-Tree aşamalarını yazınız.

Örnek: root x'dir. root'un sağından y bulunur. Solunda z bulunur vb.

    - sort() fonksiyonu ile elementleri küçükten büyüğe sıralarız. [0,1,2,3,4,5,6,7,8,9]
    - Dizide 10 eleman olduğu için index 5'ten itibaren ikiye ayırırız. 
    - Arayacağımız sayı mid-point'ten küçükse sol, büyükse sağ tarafta kalan diziyi alırız.
    - Aldığımız diziyi tekrar ikiye bölerek işlemi sayıyı bulana kadar tekrar ederiz.

Örnek: 8 sayısının bu dizide bulunup bulunmadığını arayalım.

    - Diziyi küçükten büyüğe sıraladık. [0,1,2,3,4,5,6,7,8,9]
    - Orta noktası olan index 5'te bulunan eleman = [4]
    - Aradığımız sayı [8] ortadaki eleman [4]'ten büyük, sağ tarafta aramaya devam edeceğiz.
    - Yeni arama aralığımız [5,6,7,8,9], orta noktamız ise [7]
    - [8] > [7] olduğu için aramaya sağ tarafta devam edeceğiz. 
    - Yeni arama aralığımız [8,9]. İki elemanlı dizinin hangi indexini orta kabul edeceğimize göre 
      ya bu aşamada ya da bir sonraki aşamada tek eleman kalarak [8] elemanının bu dizide bulunduğunu görüyoruz.
