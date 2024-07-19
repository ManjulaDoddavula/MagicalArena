This project implements a Magical Arena where players with health, strength, and attack attributes engage in battles until one player's health reaches zero. Players take turns attacking and defending based on dice rolls, with outcomes calculated based on their attributes.

Features
List the key features or functionalities of your project. For example:

Player attributes: Health, strength, attack.
Turn-based combat system.
Dice rolling mechanics for attack and defense.

Project Structure:

src/: Contains the source code files.
Magical_Arena/: Main package containing classes for the Magical Arena.
Magical_Arena_Tests/: Package for unit tests.
bin/: Output directory for compiled ".class" files.
lib/: Directory for external libraries (e.g., junit-platform-console-standalone  hamcrest-core).

Setup Instructions:

1. Clone the repository.
2. Ensure you have Java JDK installed (version 1.8).
3. Download the JUnit standalone JAR (version 1.8.2) and place it in the "lib/" directory.

4. Compile the main classes:
javac -d bin src/Magical_Arena/*.java

5. Compile the test classes
javac -d bin -cp bin;lib/junit-platform-console-standalone-1.8.2.jar;lib/hamcrest-core-1.3.jar src/Magical_Arena_Tests/*.java

6. Run the tests:
java -jar lib/junit-platform-console-standalone-1.8.2.jar --class-path bin --scan-class-path

Usage:
To simulate a battle in the Magical Arena between two players, you can modify and run the "Main.java" class, which initializes players and simulates battles based on predefined rules.

Example output for tests after running:

Thanks for using JUnit! Support its development at https://junit.org/sponsoring


+-- JUnit Jupiter [OK]
| +-- PlayerTest [OK]
| | +-- testPlayerIsAlive() [OK]
| | '-- testPlayerInitialization() [OK]
| +-- DiceTest [OK]
| | '-- testDiceRoll() [OK]
| '-- ArenaTest [OK]
|   '-- testFight() [OK]
'-- JUnit Vintage [OK]

Test run finished after 160 ms
[         5 containers found      ]
[         0 containers skipped    ]
[         5 containers started    ]
[         0 containers aborted    ]
[         5 containers successful ]
[         0 containers failed     ]
[         4 tests found           ]
[         0 tests skipped         ]
[         4 tests started         ]
[         0 tests aborted         ]
[         4 tests successful      ]
[         0 tests failed          ]

If the tests run successfully and you see the expected output as below 

(After Cloning the Repository, Navigate to the Project Directory and Execute the below commands)

E:\NOTES\s\MagicalArena>javac -d bin src/Magical_Arena/*.java

E:\NOTES\s\MagicalArena>javac -d bin -cp bin;lib/junit-platform-console-standalone-1.8.2.jar;lib/hamcrest-core-1.3.jar src/Magical_Arena_Tests/*.java

E:\NOTES\s\MagicalArena>java -jar lib/junit-platform-console-standalone-1.8.2.jar --class-path bin --scan-class-path
Attacker rolled: 5 -> Damage: 50
Defender rolled: 5 -> Defended: 50
Defender takes 0 damage. Remaining health: 100
Attacker rolled: 5 -> Damage: 50
Defender rolled: 1 -> Defended: 10
Defender takes 40 damage. Remaining health: 60
Attacker rolled: 2 -> Damage: 20
Defender rolled: 2 -> Defended: 20
Defender takes 0 damage. Remaining health: 60
Attacker rolled: 6 -> Damage: 60
Defender rolled: 4 -> Defended: 40
Defender takes 20 damage. Remaining health: 40
Attacker rolled: 2 -> Damage: 10
Defender rolled: 2 -> Defended: 10
Defender takes 0 damage. Remaining health: 50
Attacker rolled: 2 -> Damage: 10
Defender rolled: 1 -> Defended: 5
Defender takes 5 damage. Remaining health: 45
Attacker rolled: 1 -> Damage: 5
Defender rolled: 5 -> Defended: 25
Defender takes 0 damage. Remaining health: 45
Attacker rolled: 2 -> Damage: 10
Defender rolled: 1 -> Defended: 5
Defender takes 5 damage. Remaining health: 40
Attacker rolled: 1 -> Damage: 5
Defender rolled: 6 -> Defended: 30
Defender takes 0 damage. Remaining health: 40
Attacker rolled: 3 -> Damage: 15
Defender rolled: 5 -> Defended: 25
Defender takes 0 damage. Remaining health: 40
Attacker rolled: 6 -> Damage: 30
Defender rolled: 5 -> Defended: 25
Defender takes 5 damage. Remaining health: 35
Attacker rolled: 5 -> Damage: 50
Defender rolled: 4 -> Defended: 40
Defender takes 10 damage. Remaining health: 30
Attacker rolled: 5 -> Damage: 25
Defender rolled: 6 -> Defended: 30
Defender takes 0 damage. Remaining health: 35
Attacker rolled: 5 -> Damage: 25
Defender rolled: 5 -> Defended: 25
Defender takes 0 damage. Remaining health: 35
Attacker rolled: 4 -> Damage: 20
Defender rolled: 2 -> Defended: 10
Defender takes 10 damage. Remaining health: 25
Attacker rolled: 5 -> Damage: 50
Defender rolled: 3 -> Defended: 30
Defender takes 20 damage. Remaining health: 10
Attacker rolled: 4 -> Damage: 20
Defender rolled: 3 -> Defended: 15
Defender takes 5 damage. Remaining health: 20
Attacker rolled: 1 -> Damage: 5
Defender rolled: 5 -> Defended: 25
Defender takes 0 damage. Remaining health: 20
Attacker rolled: 2 -> Damage: 10
Defender rolled: 6 -> Defended: 30
Defender takes 0 damage. Remaining health: 20
Attacker rolled: 3 -> Damage: 15
Defender rolled: 3 -> Defended: 15
Defender takes 0 damage. Remaining health: 20
Attacker rolled: 2 -> Damage: 10
Defender rolled: 1 -> Defended: 5
Defender takes 5 damage. Remaining health: 15
Attacker rolled: 6 -> Damage: 30
Defender rolled: 2 -> Defended: 10
Defender takes 20 damage. Remaining health: -5
Player A has died. Player B wins!

Thanks for using JUnit! Support its development at https://junit.org/sponsoring

.
+-- JUnit Jupiter [OK]
| +-- PlayerTest [OK]
| | +-- testPlayerIsAlive() [OK]
| | '-- testPlayerInitialization() [OK]
| +-- DiceTest [OK]
| | '-- testDiceRoll() [OK]
| '-- ArenaTest [OK]
|   '-- testFight() [OK]
'-- JUnit Vintage [OK]

Test run finished after 93 ms
[         5 containers found      ]
[         0 containers skipped    ]
[         5 containers started    ]
[         0 containers aborted    ]
[         5 containers successful ]
[         0 containers failed     ]
[         4 tests found           ]
[         0 tests skipped         ]
[         4 tests started         ]
[         0 tests aborted         ]
[         4 tests successful      ]
[         0 tests failed          ]
