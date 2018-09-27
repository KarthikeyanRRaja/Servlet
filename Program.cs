using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System;
using System.IO;
namespace App1
{
    class Program
    {
        static void Main(string[] args)
        {
            if (File.Exists("test.txt"))
            {
                string content = File.ReadAllText("test.txt");
                Console.WriteLine("Current content of file:");
                Console.WriteLine(content);
            }
            Console.WriteLine("Please enter new content for the file:");
            string newContent = Console.ReadLine();
            File.WriteAllText("test.txt", newContent);
        }
    }
}
