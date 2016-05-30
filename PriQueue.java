interface PriQueue
{
	// Notkun: x = p.deleteMin();
	// Fyrir:  p er ekki tóm.
	// Eftir:  x er strengur, sem var í p fyrir aðgerðina, og 
	//         enginn annar minni strengur var í p.  x hefur 
	//         verið fjarlægður úr p (þó geta verið x-gildi 
	//         eftir í p, ef fleiri en eitt slíkt gildi var í p).
	public String deleteMin();

	// Notkun: p.put(x);
	// Fyrir:  p er ekki full.
	// Eftir:  x hefur verið bætt ofan í p.
	public void put( String x );

	// Notkun: n = p.count();
	// Eftir:  n inniheldur fjölda gilda í p.
	public int count();

	// Notkun: b = p.isFull();
	// Eftir:  b er satt þá og því aðeins að p sé full.
	public boolean isFull();
}
