package ui;

import java.util.*;
import business.Tank;
import util.Console;

public class TankBattleApp {

	private static List<Tank> tanks = new ArrayList<>();

	public static void main(String[] args) {

		Tank t1 = new Tank(1, "Axis", "Heavy", "Panzerkampfwagen VI (Tiger I)", 800, 1000);
		Tank t2 = new Tank(2, "Axis", "Medium", "Panzerkampfwagen V (Panther I)", 800, 800);
		Tank t3 = new Tank(3, "Axis", "Light", "Panzerkampfwagen IV (Panzer IV)", 500, 500);
		Tank t4 = new Tank(4, "Allies", "Heavy", "M26 Pershing", 750, 1000);
		Tank t5 = new Tank(5, "Allies", "Medium", "M4 Sherman (Firefly)", 750, 600);
		Tank t6 = new Tank(6, "Allies", "Light", "M3 Stuart", 500, 500);
		tanks.add(t1);
		tanks.add(t2);
		tanks.add(t3);
		tanks.add(t4);
		tanks.add(t5);
		tanks.add(t6);

		System.out.println("Tank Battle!\n");
		String userName = Console.getString("Enter new username: ", true);
		System.out.println("Welcome, " + userName + ", to the Tank Battle App!\n");
		String command = "";
		while (!command.equalsIgnoreCase("exit")) {
			displayMenu();
			command = Console.getString("Command: ", true);
			switch (command) {
			case "tanks":
				listTanks();
				break;
			case "history":
				history();
				break;
			case "play":
				play();
			case "exit":
				break;
			default:
				System.out.println("Invalid Entry. Try again");
				break;
			}
		}
		System.out.println();
		System.out.println("Thanks for playing!");

	}

	private static void history() {
		System.out.println();
		System.out.println("Please select a tank");
		System.out.println("----------------------");
		for (Tank t : tanks) {
			System.out.println(t);
		}
		int tankId = Console.getInt("Tank ID: ", 0, tanks.size() + 1);
		System.out.println(tankId + " was selected.");
		if (tankId == 1) {
			System.out.println("Panzerkampfwagen VI (Tiger I)\n");
			System.out.println(
					"The Tiger I, a German heavy tank of World War II, operated from 1942 in Africa and Europe, usually in\n"
							+ " independent heavy tank battalions. Its late war designation was Panzerkampfwagen VI Tiger Ausf. E.\n"
							+ "The early war variant was designated Panzerkampfwagen VI Tiger Ausf. H1. Often times, people refer\n"
							+ " to both of the variants as Tiger. The Tiger I gave the German Army its first armoured fighting\n"
							+ " vehicle that mounted the 8.8 cm KwK 36 gun (derived from the 8.8 cm Flak 36). 1,347 were built\n"
							+ " between August 1942 and August 1944. After August 1944, production of the Tiger I was phased out\n"
							+ " in favour of the Tiger II.\n\n"
							+ " The tank was given its nickname \"Tiger\" by Ferdinand Porsche, and the Roman numeral was added\n"
							+ " after the later Tiger II entered production. The initial designation was\n"
							+ " Panzerkampfwagen VI Ausführung H (literally 'Armored Combat Wagon/Vehicle VI version H',\n"
							+ " abbreviated PzKpfw VI Ausf. H) where 'H' denoted Henschel as the designer/manufacturer. It was\n"
							+ " classified with ordnance inventory designation Sd.Kfz. 182. The tank was later re-designated as\n"
							+ " PzKpfw VI Ausf. E in March 1943, with ordnance inventory designation Sd.Kfz. 181.\n");
		}
		if (tankId == 2) {
			System.out.println("Panzerkampfwagen V (Panther I)");
			System.out.println(
					"The Panther is a German medium tank deployed during World War II on the Eastern and Western Fronts in\n"
							+ " Europe from mid-1943 to the war's end in 1945.  The Panther was intended to counter the Soviet T-34\n"
							+ " and to replace the Panzer III and Panzer IV. Nevertheless, it served alongside the Panzer IV and the\n"
							+ " heavier Tiger I until the end of the war.\n\n"
							+ " While having essentially the same Maybach V12 petrol (690 hp) engine as the Tiger I, it had more efficient\n"
							+ " frontal hull armour, better gun penetration, was lighter and faster, and could traverse rough terrain better\n"
							+ " than the Tiger I. The trade-off was weaker side armour, which made it vulnerable to flanking fire.\n"
							+ " The Panther proved to be effective in open country and long range engagements, but did not provide enough high\n"
							+ " explosive firepower against infantry.\n");
		}
		if (tankId == 3) {
			System.out.println("Panzerkampfwagen IV (Panzer IV)");
			System.out.println(
					"The Panzer IV was the most numerous German tank and the second-most numerous German armored fighting vehicle of the\n"
							+ " Second World War, with some 8,500 built. It received various upgrades and design modifications, intended to counter\n"
							+ " new threats, extending its service life. Generally, these involved increasing the Panzer IV's armor protection or\n"
							+ " upgrading its weapons, although during the last months of the war, with Germany's pressing need for rapid replacement\n"
							+ " of losses, design changes also included simplifications to speed up the manufacturing process.  The Panzer IV saw service\n"
							+ " in all combat theaters involving Germany and was the only German tank to remain in continuous production throughout the war.\n");
		}
		if (tankId == 4) {
			System.out.println("M26 Pershing");
			System.out.println("The M26 Pershing was a heavy tank/medium tank of the United States Army.  It was used in the last months of World War II during\n"
							+ " the invasion of Germany.  Intended as a replacement of the M4 Sherman,[citation needed] a prolonged development period meant that\n"
							+ " only a small number saw combat in Europe, notably in the 9th Armored Division's dash to take the Ludendorff Bridge during the Battle\n"
							+ " of Remagen.  Based on the criteria of firepower, mobility, and protection, American historian R. P. Hunnicutt ranked the Pershing\n"
							+ " behind the German Panther medium tank, but ahead of the Tiger I heavy tank.\n");
		}
		if (tankId == 5) {
			System.out.println("M4 Sherman");
			System.out.println("The M4 Sherman, officially Medium Tank, M4, was the most widely used medium tank by the United States and Western Allies in World War II.\n"
							+ " The M4 Sherman proved to be reliable, relatively cheap to produce, and available in great numbers. It was also the basis of several\n"
							+ " successful tank destroyers, such as the M10, Achilles and M36. Tens of thousands were distributed through the Lend-Lease program to the\n"
							+ " British Commonwealth and Soviet Union. The tank was named by the British for the American Civil War general William Tecumseh Sherman.\n"
							+ " The M4 Sherman evolved from the M3 Medium Tank,[N 1] which had its main armament in a side sponson mount. The M4 retained much of the\n"
							+ " previous mechanical design, but moved the main 75 mm gun into a fully traversing central turret.\n\n"
							+ " Even by 1944, most M4 Shermans kept their dual-purpose 75 mm gun.[11] By then, the M4 was inferior in firepower and armor to increasing\n"
							+ " numbers of German heavy tanks, but was able to fight on with the help of considerable numerical superiority, greater mechanical reliability,\n"
							+ " better logistical support, and support from growing numbers of fighter-bombers and artillery pieces.  Some Shermans were produced with a more\n"
							+ " capable gun, the 76 mm gun M1, or refitted with a 76.2mm calibre Ordnance QF 17-pounder gun by the British (the Sherman Firefly).\n"
							+ " The M4 went on to be produced in large numbers, being the most produced tank in American history.\n");
		}
		if (tankId == 6) {
			System.out.println("M3 Lee");
			System.out.println("The M3 Stuart, officially Light Tank, M3, was an American light tank of World War II.  It was supplied to British and other Commonwealth forces\n"
							+ " under lend-lease prior to the entry of the U.S. into the war. Thereafter, it was used by U.S. and Allied forces until the end of the war.\n"
							+ " Stuarts were the first American-crewed tanks in World War II to engage the enemy in tank versus tank combat.  the M3 was initially armed with a\n"
							+ " 37 mm M5 gun and five .30-06 Browning M1919A4 machine guns: coaxial with the gun, on top of the turret in an M20 anti-aircraft mount, in a ball mount\n"
							+ " in right bow, and in the right and left hull sponsons.  For a light tank, the Stuart was fairly heavily armored. It had 38 mm of armor on the upper front\n"
							+ " hull, 44 mm on the lower front hull, 51 mm on the gun mantlet, 38 mm on the turret sides, 25 mm on the hull sides, and 25 mm on the hull rear.\n");
		}
	}

	// TODO select Tank and play game?
	private static void play() {

	}

	private static void listTanks() {
		System.out.println();
		System.out.println("Available Tanks\n" + "---------------\n");
		for (Tank t : tanks) {
			System.out.println(t);
		}
	}

	private static void displayMenu() {
		StringBuilder menu = new StringBuilder("COMMAND MENU\n" + "===============\n");
		menu.append("tanks     -     show available tanks\n");
		menu.append("upgrate   -     show available upgrades - THIS FEATURE NOT YET AVAILABLE\n");
		menu.append("history   -     select a tank for information\n");
		menu.append("exit      -     exit program\n");
		System.out.println(menu);
	}
}
