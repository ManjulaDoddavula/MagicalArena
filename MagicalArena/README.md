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
bin/: Output directory for compiled `.class` files.
lib/: Directory for external libraries (e.g., JUnit).

Setup Instructions:

1. Clone the repository.
2. Ensure you have Java JDK installed (version X.X or higher).
3. Download the JUnit standalone JAR (version X.X) and place it in the `lib/` directory.

4. Compile the main classes:
javac -d bin src/Magical_Arena/*.java

5. Compile the test classes
javac -d bin -cp bin;lib/junit-platform-console-standalone-X.X.jar;lib/hamcrest-core-X.X.jar src/Magical_Arena_Tests/*.java

6. Run the tests:
java -jar lib/junit-platform-console-standalone-X.X.jar --class-path bin --scan-class-path

Usage:
To simulate a battle in the Magical Arena between two players, you can modify and run the `Main.java` class, which initializes players and simulates battles based on predefined rules.

Example output for tests after running:

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

If the tests run successfully and you see the expected output
