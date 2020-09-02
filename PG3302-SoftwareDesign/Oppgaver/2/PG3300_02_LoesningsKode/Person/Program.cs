using System;

namespace Person_project
{
	class Program
	{
		static void Main()
		{
			// Testing Person class:
			var person = new Person();
			Console.WriteLine("\nWriting first name of Person before we have set it to any value. FirstName is: \"{0}\"", person.FirstName);
			person.FirstName = "Mark";
			Console.WriteLine("Writing frist name of Person after it is set. FirstName is: \"{0}\"", person.FirstName);
            Console.WriteLine("Writing full name of Person before we set last name. FullName is: \"{0}\"", person.FullName);
            person.LastName = "Williams";
            Console.WriteLine("Writing full name of Person after last name is set. FullName is: \"{0}\"", person.FullName);
            person.FullName = "Harry Potter";
            Console.WriteLine("Writing full name of Person after we reset it directly. FullName is: \"{0}\"", person.FullName);

            // To keep console window open until a key is pressed (in debugging mode).
            Console.Write("\n\nPress any key to continue ...");
			Console.ReadKey(true);
		}
	}
}
