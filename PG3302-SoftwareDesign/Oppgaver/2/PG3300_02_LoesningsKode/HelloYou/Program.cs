using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HelloYou
{
    class Program
    {
        static void Main(string[] args)
        {
            // Make a list of names.
            string[] names = { "Jhonny", "Liam", "William", "Benjamin" };
            // Create an instance of Random.
            Random rn = new Random();

            // Print a random name by getting the next random int less then the length of the names array as its index.
            Console.WriteLine("Hello, {0}!", names[rn.Next(names.Length)]);

            // To keep console window open until a key is pressed (in debugging mode).
            Console.Write("\n\nPress any key to continue ...");
            Console.ReadKey(true);

        }
    }
}
