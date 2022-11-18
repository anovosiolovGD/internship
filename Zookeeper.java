import java.util.Scanner;

public class Zookeeper {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String exit = " ";

        while (!exit.equals("exit")) {
            promt();
            String input = scanner.next();

            if (input.equals("exit")) {
                exit = input;
                System.out.println("See you later");
                break;
            }

            int habbitatNum = Integer.parseInt(input);
            switch (habbitatNum) {
                case 0:
                    printCamel();
                    break;
                case 1:
                    printLion();
                    break;
                case 2:
                    printDeer();
                    break;

                case 3:
                    printGoose();
                    break;
                case 4:
                    printBat();
                    break;

                case 5:
                    printRabbit();
                    break;

            }



        }

    }

    public static void promt() {
        String promt = "Please enter the number of the habitat you would like to view: ";
        System.out.print(promt);
    }

    public static void printCamel() {
        String camel = """
                Switching on the camera in the camel habitat...
                 ___.-''''-.
                /___  @    |
                ',,,,.     |         _.'''''''._
                     '     |        /           \\
                     |     \\    _.-'             \\
                     |      '.-'                  '-.
                     |                               ',
                     |                                '',
                      ',,-,                           ':;
                           ',,| ;,,                 ,' ;;
                              ! ; !'',,,',',,,,'!  ;   ;:
                             : ;  ! !       ! ! ;  ;   :;
                             ; ;   ! !      ! !  ; ;   ;,
                            ; ;    ! !     ! !   ; ;
                            ; ;    ! !    ! !     ; ;
                           ;,,      !,!   !,!     ;,;
                           /_I      L_I   L_I     /_I
                Look at that! Our little camel is sunbathing!""";
        System.out.println(camel);
    }

    public static void printLion() {
        String lion = """
                Switching on the camera in the lion habitat...
                                                               ,w.
                                                             ,YWMMw  ,M  ,
                                        _.---.._   __..---._.'MMMMMw,wMWmW,
                                   _.-""        '''           YP"WMMMMMMMMMb,
                                .-' __.'                   .'     MMMMW^WMMMM;
                    _,        .'.-'"; `,       /`     .--""      :MMM[==MWMW^;
                 ,mM^"     ,-'.'   /   ;      ;      /   ,       MMMMb_wMW"  @\\
                ,MM:.    .'.-'   .'     ;     `\\    ;     `,     MMMMMMMW `"=./`-,
                WMMm__,-'.'     /      _.\\      F'''-+,,   ;_,_.dMMMMMMMM[,_ / `=_}
                "^MP__.-'    ,-' _.--""   `-,   ;       \\  ; ;MMMMMMMMMMW^``; __|
                           /   .'            ; ;         )  )`{  \\ `"^W^`,   \\  :
                          /  .'             /  (       .'  /     Ww._     `.  `"
                         /  Y,              `,  `-,=,_{   ;      MMMP`""-,  `-._.-,
                        (--, )                `,_ / `) \\/"")      ^"      `-, -;"\\:
                The lion is roaring!""";
        System.out.println(lion);
    }

    public static void printDeer() {
        String deer = """
                Switching on the camera in the deer habitat...
                   /|       |\\
                `__\\       //__'
                   ||      ||
                 \\__`\\     |'__/
                   `_\\   //_'
                   _.,:---;,._
                   \\_:     :_/
                     |@. .@|
                     |     |
                     ,\\.-./ \\
                     ;;`-'   `---__________-----.-.
                     ;;;                         \\_\\
                     ';;;                         |
                      ;    |                      ;
                       \\   \\     \\        |      /
                        \\_, \\    /        \\     |\\
                          |';|  |,,,,,,,,/ \\    \\ \\_
                          |  |  |           \\   /   |
                          \\  \\  |           |  / \\  |
                           | || |           | |   | |
                           | || |           | |   | |
                           | || |           | |   | |
                           |_||_|           |_|   |_|
                          /_//_/           /_/   /_/
                Our 'Bambi' looks hungry. Let's go to feed it!""";
        System.out.println(deer);
    }

    public static void printGoose() {
        String goose = """
                Switching on the camera in the goose habitat...
                            
                                                    _
                                                ,-"" "".
                                              ,'  ____  `.
                                            ,'  ,'    `.  `._
                   (`.         _..--.._   ,'  ,'        \\    \\
                  (`-.\\    .-""        ""'   /          (  d _b
                 (`._  `-"" ,._             (            `-(   \\
                 <_  `     (  <`<            \\              `-._\\
                  <`-       (__< <           :
                   (__        (_<_<          ;
                    `------------------------------------------
                The goose is staring intently at you... Maybe it's time to change the channel?""";
        System.out.println(goose);
    }

    public static void printBat() {
        String bat = """
                Switching on the camera in the bat habitat...
                _________________               _________________
                 ~-.              \\  |\\___/|  /              .-~
                     ~-.           \\ / o o \\ /           .-~
                        >           \\  W  //           <
                       /             /~---~\\             \\
                      /_            |       |            _\\
                         ~-.        |       |        .-~
                            ;        \\     /        i
                           /___      /\\   /\\      ___\\
                                ~-. /  \\_/  \\ .-~
                                   V         V
                This bat looks like it's doing fine.""";
        System.out.println(bat);
    }

    public static void printRabbit() {
        String rabbit = """
                Switching on the camera in the rabbit habitat...
                         ,
                        /|      __
                       / |   ,-~ /
                      Y :|  //  /
                      | jj /( .^
                      >-"~"-v"
                     /       Y
                    jo  o    |
                   ( ~T~     j
                    >._-' _./
                   /   "~"  |
                  Y     _,  |
                 /| ;-"~ _  l
                / l/ ,-"~    \\
                \\//\\/      .- \\
                 Y        /    Y
                 l       I     !
                 ]\\      _\\    /"\\
                (" ~----( ~   Y.  )
                It looks like we will soon have more rabbits!""";
        System.out.println(rabbit);
    }
}