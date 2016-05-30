interface PriQueue
{
	// Notkun: x = p.deleteMin();
	// Fyrir:  p er ekki t�m.
	// Eftir:  x er strengur, sem var � p fyrir a�ger�ina, og 
	//         enginn annar minni strengur var � p.  x hefur 
	//         veri� fjarl�g�ur �r p (�� geta veri� x-gildi 
	//         eftir � p, ef fleiri en eitt sl�kt gildi var � p).
	public String deleteMin();

	// Notkun: p.put(x);
	// Fyrir:  p er ekki full.
	// Eftir:  x hefur veri� b�tt ofan � p.
	public void put( String x );

	// Notkun: n = p.count();
	// Eftir:  n inniheldur fj�lda gilda � p.
	public int count();

	// Notkun: b = p.isFull();
	// Eftir:  b er satt �� og �v� a�eins a� p s� full.
	public boolean isFull();
}
