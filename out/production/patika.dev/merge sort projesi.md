[16,21,11,8,12,22] -> Merge Sort

Yukarıdaki dizinin sort türüne göre aşamalarını yazınız.

    - Diziyi ikiye böleceğiz: [16,21,11] ve [8,12,22] olarak iki dizi elde ettik.
    - Tekrar böleceğiz: [16,21] [11] [8,12] [22] olarak dört dizi elde ettik.
    - Tek eleman kalana kadar böleceğiz: [16] [21] [11] [8] [12] [22]
    - İkili gruplar halinde ve sıralayarak birleştireceğiz: [16,21] [8,11] [12,22]
    - Sıralayarak birleştirme işlemine devam: [8,11,16,21] [12,22]
    - Son kez birleştireceğiz: [8,11,12,16,21,22]

Big-O gösterimini yazınız.

    Merge Sort için big-o notasyonu log n'dir.
