namespace Person_project
{
	public class Person
	{
		private string _firstName;
        private string _lastName;

		public string FirstName
		{
			get { return ((_firstName != null) ? _firstName : "Ukjent"); }
			set { _firstName = value; }
		}

        public string LastName {
            get { return ((_lastName != null) ? _lastName : "Ukjent"); }
            set { _lastName = value; }
        }

        public string FullName {
            get { return FirstName + " " + LastName; }
            set {
                string[] parts = value.Split(' ');
                FirstName = parts[0];
                LastName = parts[1];
            }
        }

    }
}
