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
		//tanks.get(5).getArmor();
		//tanks.get(5).setArmor(tanks.get(5).getArmor()-100);

		System.out.println("            Normandy '44\n\n" + "   	 [ O ]\n" + "     	   \\ \\   \n"
				+ "      	    \\ \\  \n" + "             \\ \\--'---_\n" + "       	   _/ \\ \\   // ~~\\_\n"
				+ "   .//---//__|=//_//------/~~~\\\n" + "   //___________________/O   O \\\n"
				+ "   (===(\\_________(===(Oo o o O)          \n" + "   \\~~~\\____//     \\---\\Oo__o--\n"
				+ "    ~~~~~~~        ~~~~~~~~~~\n");
		String userName = Console.getString("Enter new Commander name: ", true);
		System.out.println(userName + ", welcome to Europe.  Let's get to the front!\n");
		String command = "";
		while (!command.equalsIgnoreCase("exit")) {
			displayMenu();
			command = Console.getString("Command: ", true);
			switch (command) {
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
		System.out.println(tankId + " was selected.\n");
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
			System.out.println("Panzerkampfwagen V (Panther I)\n");
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
			System.out.println("Panzerkampfwagen IV (Panzer IV)\n");
			System.out.println(
					"The Panzer IV was the most numerous German tank and the second-most numerous German armored fighting vehicle of the\n"
							+ " Second World War, with some 8,500 built. It received various upgrades and design modifications, intended to counter\n"
							+ " new threats, extending its service life. Generally, these involved increasing the Panzer IV's armor protection or\n"
							+ " upgrading its weapons, although during the last months of the war, with Germany's pressing need for rapid replacement\n"
							+ " of losses, design changes also included simplifications to speed up the manufacturing process.  The Panzer IV saw service\n"
							+ " in all combat theaters involving Germany and was the only German tank to remain in continuous production throughout the war.\n");
		}
		if (tankId == 4) {
			System.out.println("M26 Pershing\n");
			System.out.println(
					"The M26 Pershing was a heavy tank/medium tank of the United States Army.  It was used in the last months of World War II during\n"
							+ " the invasion of Germany.  Intended as a replacement of the M4 Sherman,[citation needed] a prolonged development period meant that\n"
							+ " only a small number saw combat in Europe, notably in the 9th Armored Division's dash to take the Ludendorff Bridge during the Battle\n"
							+ " of Remagen.  Based on the criteria of firepower, mobility, and protection, American historian R. P. Hunnicutt ranked the Pershing\n"
							+ " behind the German Panther medium tank, but ahead of the Tiger I heavy tank.\n");
		}
		if (tankId == 5) {
			System.out.println("M4 Sherman\n");
			System.out.println(
					"The M4 Sherman, officially Medium Tank, M4, was the most widely used medium tank by the United States and Western Allies in World War II.\n"
							+ " The M4 Sherman proved to be reliable, relatively cheap to produce, and available in great numbers. It was also the basis of several\n"
							+ " successful tank destroyers, such as the M10, Achilles and M36. Tens of thousands were distributed through the Lend-Lease program to the\n"
							+ " British Commonwealth and Soviet Union. The tank was named by the British for the American Civil War general William Tecumseh Sherman.\n"
							+ " The M4 Sherman evolved from the M3 Medium Tank,[N 1] which had its main armament in a side sponson mount. The M4 retained much of the\n"
							+ " previous mechanical design, but moved the main 75 mm gun into a fully traversing central turret.\n\n"
							+ " Even by 1944, most M4 Shermans kept their dual-purpose 75 mm gun. By then, the M4 was inferior in firepower and armor to increasing\n"
							+ " numbers of German heavy tanks, but was able to fight on with the help of considerable numerical superiority, greater mechanical reliability,\n"
							+ " better logistical support, and support from growing numbers of fighter-bombers and artillery pieces.  Some Shermans were produced with a more\n"
							+ " capable gun, the 76 mm gun M1, or refitted with a 76.2mm calibre Ordnance QF 17-pounder gun by the British (the Sherman Firefly).\n"
							+ " The M4 went on to be produced in large numbers, being the most produced tank in American history.\n");
		}
		if (tankId == 6) {
			System.out.println("M3 Stuart\n");
			System.out.println(
					"The M3 Stuart, officially Light Tank, M3, was an American light tank of World War II.  It was supplied to British and other Commonwealth forces\n"
							+ " under lend-lease prior to the entry of the U.S. into the war. Thereafter, it was used by U.S. and Allied forces until the end of the war.\n"
							+ " Stuarts were the first American-crewed tanks in World War II to engage the enemy in tank versus tank combat.  the M3 was initially armed with a\n"
							+ " 37 mm M5 gun and five .30-06 Browning M1919A4 machine guns: coaxial with the gun, on top of the turret in an M20 anti-aircraft mount, in a ball mount\n"
							+ " in right bow, and in the right and left hull sponsons.  For a light tank, the Stuart was fairly heavily armored. It had 38 mm of armor on the upper front\n"
							+ " hull, 44 mm on the lower front hull, 51 mm on the gun mantlet, 38 mm on the turret sides, 25 mm on the hull sides, and 25 mm on the hull rear.\n");
		}
	}

	private static void play() {
		selectTank();
		String choice = Console.getString("Continue? (y/n): ", "y", "n");
		while (choice.equalsIgnoreCase("y")) {
			System.out.println(
					"July 1944.  Barely a month after the Allied invasion of Normandy, the US First Army captured\n"
							+ "Cherbourg, and began their attack south towards Saint-Lo.  After a weather delay, the First Army began\n"
							+ "Operation Cobra on the Saint-Lo-Periers road.  With orders to enter fray at the front,\n"
							+ "you and your crew join an armored column traveling the Saint-Lo-Periers Road.  Near the city,\n"
							+ "your armored column is ambushed by a number of enemy tanks and artillery.  With the elements of the\n"
							+ "front and rear of the column knocked out, your tank becomes trapped in a vortex of murderous fire.\n"
							+ "In a desperate attempt to break the ambush, you move to engage enemy targets...\n");
			System.out.println("COMMANDER: Driver stop! Gunner heat tank!...\n" + "GUNNER: Identified!\n");
			break;
		}
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("LOADER: Up!\n");
			Console.getString("COMMANDER: 'FIRE!' (y): ", true);
			int roll1 = (int) (Math.random() * 6) + 1;
			if ((int) roll1 == 1) {
				System.out.println("GUNNER: On the way!\n" + "COMMANDER: Miss!\n"
						+ "Driver, maneuver to flank posiiton!\n" + "DRIVER: Yes, Sir!\n");
				enemyTank();
				continue;
			} else if ((int) roll1 == 2) {
				System.out.println("GUNNER: On the way!\n" + "COMMANDER: Shot deflected!\n"
						+ "Driver, get this thing in position!\n" + "DRIVER: Maneuvering!\n");
				System.out.println("    ___\r\n" + " __(   )====::\r\n" + "/~~~~~~~~~\\\r\n" + "\\O.O.O.O.O/\n");
				enemyTank();
				continue;
			} else if ((int) roll1 == 3) {
				System.out.println("GUNNER: On the way!\n"
						+ "COMMANDER: On target! Enemy is still engaging.  Get that gun loaded!\n");
				enemyTank();
				continue;
			} else if ((int) roll1 == 4) {
				System.out.println("GUNNER: On the way!\n" + "COMMANDER: Hit! Enemy taking damage!  Stay on target!\n");
				enemyTank();
				continue;
			} else if ((int) roll1 == 5) {
				System.out.println(
						"GUNNER: On the way!\n" + "COMMANDER: Direct hit! Enemy hull penetrated!  Pour it on 'em!\n");
				enemyTank();
				continue;
			} else if ((int) roll1 == 6) {
				System.out.println("GUNNER: On the way!\n" + "COMMANDER: Target cease fire.\n"
						+ "Good shooting! Enemy Tank destroyed!\n");
				break;
			}
		}
		// Console.getString("Continue? (y/n): ", "y", "n");
	}

	private static void selectTank() {
		System.out.println();
		System.out.println("Available Tanks\n" + "---------------\n");
		for (Tank t : tanks) {
			System.out.println(t);
		}
		System.out.println("Select your tank!\n" + "----------------------\n");
		int tankId = Console.getInt("Tank ID: ", 0, tanks.size() + 1);
		if (tankId == 1) {
			System.out.println("Your opponent: M26 Pershing\n");
		} else if (tankId == 2) {
			System.out.println("Your opponent: M4 Sherman\n");
		} else if (tankId == 3) {
			System.out.println("Your opponent: M3 Stuart\n");
		} else if (tankId == 4) {
			System.out.println("Your opponent: Tiger I\n");
		} else if (tankId == 5) {
			System.out.println("Your opponent: Panther I\n");
		} else if (tankId == 6) {
			System.out.println("Your opponent: Panzer IV\n");
		}
	}

	private static void enemyTank() {
		int roll2 = (int) (Math.random() * 6) + 1;
		if ((int) roll2 == 1) {
			System.out.println("Enemy shot: Miss!\n" + "COMMANDER: 'They're trying to flank!'\n");
			System.out.println("      _____");
			System.out.println("   __|_>o<_|__");
			System.out.println("  /___________\\");
			System.out.println("  \\=\\>-----</=/\n");
		}
		if ((int) roll2 == 2) {
			System.out.println("Enemy shot: Enemy shot deflected!\n");
		}
		if ((int) roll2 == 3) {
			System.out.println("Enemy shot: Minor damage.\n" + "COMMANDER: We've taken a hit, sustaining!\n");
		}
		if ((int) roll2 == 4) {
			System.out.println("Enemy shot: Hit.\n" + "DRIVER: Sir, our hydraulics are shot!\n");
		}
		if ((int) roll2 == 5) {
			System.out.println("Enemy shot: Direct hit!\n"
					+ "DRIVER: Sir, we're taking heavy damage! We can't take much more of this!\n"
					+ "COMMANDER: Steady, boys...\n");
		}
		if ((int) roll2 == 6) {
			System.out.println("Enemy shot: \n" + "COMMANDER: INCOMI---!\n"
					+ "SYSTEM: Magazine hit, your tank has been destroyed!\n");
			endGame();
		}
	}

	private static void displayMenu() {
		StringBuilder menu = new StringBuilder("          COMMAND MENU\n" + "        ================\n");
		menu.append("history   -     select a tank for information\n");
		menu.append("play      -     play game\n");
		menu.append("exit      -     exit program\n");
		System.out.println(menu);
	}

	private static void endGame() {
		System.out.println("Game Over");
		String end = Console.getString("Main Menu? (y/n) ", "y", "n");
		if (end.equalsIgnoreCase("y")) {
			mainMenu();
		} else {
			System.out.println("Thank you for playing!");
			System.exit(0);

		}
	}

	private static void mainMenu() {
		String command = "";
		while (!command.equalsIgnoreCase("exit")) {
			displayMenu();
			command = Console.getString("Command: ", true);
			switch (command) {
			case "history":
				history();
				break;
			case "play":
				play();
			case "exit":
				System.out.println("Thanks for playing!");
				System.exit(0);
			default:
				System.out.println("Invalid Entry. Try again");
				break;
			}
		}
	}

}
