public class Card {
    String nameBank;        //название банка
    String number;         //номер карты из 16 чисел
    int deadline;           //срок окончания
    String nameUser;           //имя пользователя карты
    int threeDigitNumber;       //номер из трёх цифр сзади карты
    String type;               //тип карты (Виза, МастерКарт, Классик)

    public Card(String nameBank, String number, int deadline, String nameUser, int threeDigitNumber, String type) {
        if (number.length() != 16) {
            System.out.println("Введите корректный номер карточки!");
            throw new IllegalArgumentException();
        } else if (deadline != 4) {
            System.out.println("Тут должно быть 4 цифры!");
            throw new IllegalArgumentException();
        } else if (threeDigitNumber != 3) {
            System.out.println("тут должно быть 3 цифры!");
            throw new IllegalArgumentException();
        }

        this.nameBank = nameBank;
        this.number = number;
        this.deadline = deadline;
        this.nameUser = nameUser;
        this.threeDigitNumber = threeDigitNumber;
        this.type = type;

    }

    public Card(String number, int deadline, int threeDigitNumber) {
        if (number.length() != 16) {
            System.out.println("Введите корректный номер карточки!");
            throw new IllegalArgumentException();
        }

        this.number = number;
        this.deadline = deadline;
        this.threeDigitNumber = threeDigitNumber;
    }

    public Card(String number, int deadline, String nameUser, int threeDigitNumber, String type) {
        if (number.length() != 16) {
            System.out.println("Введите корректный номер карточки!");
            throw new IllegalArgumentException();
        }

        this.number = number;
        this.deadline = deadline;
        this.nameUser = nameUser;
        this.threeDigitNumber = threeDigitNumber;
        this.type = type;
    }
}
