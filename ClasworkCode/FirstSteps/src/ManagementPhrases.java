
public class ManagementPhrases {

	public static void main(String[] args) {
		String[] firstPhrase = { "Multi-Tier", "B-to-B", "Win-win", "Front-end", "Web-based", "Pervasive", "Smart",
				"Six-sigma", "Critical-path", "Dynamic" };
		String[] secondPhrase = { "empowered", "sticky", "value-added", "oriented", "centric", "distributed",
				"clustered", "branded", "outside-the-box", "positioned", "networked", "focused", "leveraged", "aligned",
				"targeted", "shared", "cooperative", "accelerated" };
		String[] thirdPhrase = { "process", "tipping-point", "solution", "architecture", "core competency", "strategy",
				"mindshare", "portal", "space", "vision", "paradigm", "mission" };

		String finalPhrase = " ";
		for (int i = 0; i < 3; i++) {
			double d = Math.random();
			String phrase = " ";
			int index;
			switch (i) {
			case 0:
				index = (int) (d * firstPhrase.length);
				phrase = firstPhrase[index] + " ";
				break;
			case 1:
				index = (int) (d * secondPhrase.length);
				phrase = secondPhrase[index] + " ";
				break;
			case 2:
				index = (int) (d * thirdPhrase.length);
				phrase = thirdPhrase[index];
			}
			finalPhrase = finalPhrase.concat(phrase);
		}
		System.out.println("Management phrase to be used:" + finalPhrase);

	}

}
