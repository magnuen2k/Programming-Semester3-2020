using System;

namespace Date_project
{
	class Program
	{
		static void Main()
		{
			// Testing Date class:
			var date = new Date();
			date.Month = 14;  // Invalid value, shouldn't set anything.
			Console.WriteLine("After trying to set invalid month, value of month is: {0}", date.Month);
			date.Month = 9;
			Console.WriteLine("After setting valid month, value of month is: {0}", date.Month);

			// To keep console window open until a key is pressed (in debugging mode).
			Console.Write("\n\nPress any key to continue ...");
			Console.ReadKey(true);
		}
	}
}
