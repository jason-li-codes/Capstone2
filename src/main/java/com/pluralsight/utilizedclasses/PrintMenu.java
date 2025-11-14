package com.pluralsight.utilizedclasses;

public class PrintMenu {

    public static String homepage() {
        return """
                                      ^
                       ^!^               ^
                            _______________________
                    ^!^    |_______________________|
                            |.H.H.H.H.H.H.H.H.H.H.|    ^!^
                       _____||~|~|~|~|~|~|~|~|~|~||_____   ^!^
                      |______DELICATESSEN DELIGHTS______|
                 _)o(_ |  HH  |.H.H.H.H.H.H.H.H.|  HH  | _)o(_
                 /(|)\\ |  HH  ||~|~|~|~|~|~|~|~||  HH  | /(|)\\
                   N   |  __  |_________________|  __  |   N
                   N   |  HH  |.H.H.H.'`'.H.H.H.|  HH  |   N
                   N   |  HH  ||~|~|~|!X!|~|~|~||  HH  |   N
                 ~~^~^"|______|\"\"\"\"\"\"\"|~|\"\"\"\"\"\"\"|______|\"^~^~~
                .|~|.:.......:.|~|.:.......:.|~|.:.......:.|~|.
                _| |_|_|_|_|_|_| |_|_|_|_|_|_| |_|_|_|_|_|_| |_
                ~| |~~~~~~~~~~~| |~~~~~~~~~~~| |~~~~~~~~~~~| |~
                 | |           | |           | |           | |
                ^~^~^^ ~^  ~ ^~^~^^   ^~ ~  ^~~^^~`  ~~^  ~^^^~
                 ~~~ ^~^~  ^~ ^^~  ~^^   ~^^    ^~^  ~^~   ~^
                """;
    }

    public static String fullMenu() {

        return """
                ╔══════════════════════════════════════════════════════════╗
                ║                DELICATESSEN DELIGHTS MENU                ║
                ╠══════════════════════════════════════════════════════════╣
                ║          (All calorie counts are for SMALL sizes)        ║
                ╠══════════════════════════════════════════════════════════╣
                ║ SANDWICH SIZES                                           ║
                ║   Small  (4")  ............ $5.50                        ║
                ║   Medium (8")  ............ $7.00                        ║
                ║   Large  (12") ............ $8.50                        ║
                ╠══════════════════════════════════════════════════════════╣
                ║ BREAD OPTIONS (Choose 1)                                 ║
                ║     - White (70 cal)             - Wheat (80 cal)        ║
                ║     - Multigrain (90 cal)        - Rye (85 cal)          ║
                ╠══════════════════════════════════════════════════════════╣
                ║ PREMIUM MEATS (Limit: 2 meats)                           ║
                ║   Small:  $1.00  | Extra: $0.50                          ║
                ║   Medium: $2.00  | Extra: $1.00                          ║
                ║   Large:  $3.00  | Extra: $1.50                          ║
                ║     - Turkey (120 cal)           - Roast Beef (200 cal)  ║
                ║     - Ham (100 cal)              - Pastrami (250 cal)    ║
                ║     - Chicken (150 cal)          - Bacon (300 cal)       ║
                ╠══════════════════════════════════════════════════════════╣
                ║ PREMIUM CHEESES (Limit: 2 cheeses)                       ║
                ║   Small:  $0.75  | Extra: $0.30                          ║
                ║   Medium: $1.50  | Extra: $0.60                          ║
                ║   Large:  $2.25  | Extra: $0.90                          ║
                ║     - American (75 cal)          - Cheddar (110 cal)     ║
                ║     - Swiss (100 cal)            - Provolone (90 cal)    ║
                ╠══════════════════════════════════════════════════════════╣
                ║ REGULAR TOPPINGS (Free, Limit: 5 toppings)               ║
                ║     - Lettuce (5)               - Peppers (7)            ║
                ║     - Tomato (10)               - Jalapeños (5)          ║
                ║     - Onion (8)                 - Pickles (5)            ║
                ║     - Olives (15)               - Spinach (10)           ║
                ║     - Mushrooms (12)                                     ║
                ╠══════════════════════════════════════════════════════════╣
                ║ SAUCES (Free, Limit: 3 sauces)                           ║
                ║     - Mayo (50 cal)             - Ranch (120 cal)        ║
                ║     - Mustard (10 cal)          - Caesar (130 cal)       ║
                ║     - Guacamole (150 cal)       - Pesto (200 cal)        ║
                ╠══════════════════════════════════════════════════════════╣
                ║ SIDES (Free, Limit: 2 sides)                             ║
                ║     - Fries (375 cal)           - Pickles (10 cal)       ║
                ╠══════════════════════════════════════════════════════════╣
                ║ DRINKS (Small 8oz / Medium 16oz / Large 24oz)            ║
                ║   Small  ............... $2.00                           ║
                ║   Medium ............... $2.50                           ║
                ║   Large  ............... $3.00                           ║
                ║     - KO-KUH (100 cal)          - PEP-UH-SEE (98 cal)    ║
                ║     - SPRY-TUH (90 cal)         - DOK-TUH-PEP-UH (96)    ║
                ║     - MONS-TUH (95 cal)                                  ║
                ╠══════════════════════════════════════════════════════════╣
                ║ CHIPS (One size only, $1.50)                             ║
                ║     - PO-TAY-TOHZ (150 cal)      - TOASTY-TOHZ (140 cal) ║
                ║     - FREE-TOHZ (160 cal)        - TAKI-TOHZ (155 cal)   ║
                ║     - DORY-TOHZ (140 cal)                                ║
                ╚══════════════════════════════════════════════════════════╝
                """;
    }

    public static String sandwichMenu() {
        return """
                ╔══════════════════════════════════════════════════════════╗
                ║                  DELICATESSEN DELIGHTS:                  ║
                ║                      SANDWICH MENU                       ║
                ╠══════════════════════════════════════════════════════════╣
                ║          (All calorie counts are for SMALL sizes)        ║
                ╠══════════════════════════════════════════════════════════╣
                ║ SANDWICH SIZES                                           ║
                ║   Small  (4")  ............ $5.50                        ║
                ║   Medium (8")  ............ $7.00                        ║
                ║   Large  (12") ............ $8.50                        ║
                ╠══════════════════════════════════════════════════════════╣
                ║ BREAD OPTIONS (Choose 1)                                 ║
                ║     - White (70 cal)             - Wheat (80 cal)        ║
                ║     - Multigrain (90 cal)        - Rye (85 cal)          ║
                ╠══════════════════════════════════════════════════════════╣
                ║ PREMIUM MEATS (Limit: 2 meats)                           ║
                ║   Small:  $1.00  | Extra: $0.50                          ║
                ║   Medium: $2.00  | Extra: $1.00                          ║
                ║   Large:  $3.00  | Extra: $1.50                          ║
                ║     - Turkey (120 cal)           - Roast Beef (200 cal)  ║
                ║     - Ham (100 cal)              - Pastrami (250 cal)    ║
                ║     - Chicken (150 cal)          - Bacon (300 cal)       ║
                ╠══════════════════════════════════════════════════════════╣
                ║ PREMIUM CHEESES (Limit: 2 cheeses)                       ║
                ║   Small:  $0.75  | Extra: $0.30                          ║
                ║   Medium: $1.50  | Extra: $0.60                          ║
                ║   Large:  $2.25  | Extra: $0.90                          ║
                ║     - American (75 cal)          - Cheddar (110 cal)     ║
                ║     - Swiss (100 cal)            - Provolone (90 cal)    ║
                ╠══════════════════════════════════════════════════════════╣
                ║ REGULAR TOPPINGS (Free, Limit: 5 toppings)               ║
                ║     - Lettuce (5)               - Peppers (7)            ║
                ║     - Tomato (10)               - Jalapeños (5)          ║
                ║     - Onion (8)                 - Pickles (5)            ║
                ║     - Olives (15)               - Spinach (10)           ║
                ║     - Mushrooms (12)                                     ║
                ╠══════════════════════════════════════════════════════════╣
                ║ SAUCES (Free, Limit: 3 sauces)                           ║
                ║     - Mayo (50 cal)             - Ranch (120 cal)        ║
                ║     - Mustard (10 cal)          - Caesar (130 cal)       ║
                ║     - Guacamole (150 cal)       - Pesto (200 cal)        ║
                ╠══════════════════════════════════════════════════════════╣
                ║ SIDES (Free, Limit: 2 sides)                             ║
                ║     - Fries (375 cal)           - Pickles (10 cal)       ║
                ╚══════════════════════════════════════════════════════════╝

    }

    public static String drinksMenu() {

    }

    public static String chipsMenu() {

    }

}
