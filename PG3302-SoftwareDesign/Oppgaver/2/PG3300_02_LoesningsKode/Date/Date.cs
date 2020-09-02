namespace Date_project
{
	public class Date
	{
		// There was no mention of default value in the task description. I chose -1, but 1 
		// (or even 0 or not setting it) would be ok as long as no specification is made.
		private int _month = -1;

		public int Month
		{
			get { return _month; }
			set { if ((value > 0) && (value < 13)) { _month = value; } }
		}
	}
}
