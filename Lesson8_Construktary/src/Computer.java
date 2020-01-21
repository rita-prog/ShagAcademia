public class Computer {
    String name;
    String mainColor;       //основной цвет
    String bodyColor;       //цвет корпуса
    int yearOfIssue;      //год выпуска
    String operatingSystem;    //операционная система
    String processorModel;       //Модель процессора
    int numberOfProcessorCores;      //Количество ядер процессора
    double length;             //Длина в мм (299 мм)
    double width;          //Ширина в мм   (88  мм)
    double height;         //Высота в мм (281,3 мм )
    String typeOfInternetAccess;        // Вид доступа в Интернет (WiFi, Ethernet)
    int networkAdapterSpeed;//Скорость сетевого адаптера в Мбит/с   (1000 Мбит/с)


    public Computer(String name, String mainColor, String bodyColor, int yearOfIssue, String operatingSystem, String processorModel,
                    int numberOfProcessorCores, double length, double width, double height, String typeOfInternetAccess,
                    int networkAdapterSpeed) {

        this.name = name;
        this.mainColor = mainColor;
        this.bodyColor = bodyColor;
        this.yearOfIssue = yearOfIssue;
        this.operatingSystem = operatingSystem;
        this.processorModel = processorModel;
        this.numberOfProcessorCores = numberOfProcessorCores;
        this.length = length;
        this.width = width;
        this.height = height;
        this.typeOfInternetAccess = typeOfInternetAccess;
        this.networkAdapterSpeed = networkAdapterSpeed;


        if (yearOfIssue < 1000) {
            System.out.println("Тут должен быть РЕАЛЬНЫЙ год!");
            throw new IllegalArgumentException();
        } else if (numberOfProcessorCores < 2) {
            System.out.println("Такого количества ядер процессора не существует!");
            throw new IllegalArgumentException();
        } else if (networkAdapterSpeed < 10) {
            System.out.println("Такой скорости у сетевого адаптера не может быть!");
            throw new IllegalArgumentException();
        }
    }

    public Computer(String name, String mainColor, String processorModel,
                    int numberOfProcessorCores, double length, double width, double height, String typeOfInternetAccess,
                    int networkAdapterSpeed) {

        this.name = name;
        this.mainColor = mainColor;
        this.processorModel = processorModel;
        this.numberOfProcessorCores = numberOfProcessorCores;
        this.length = length;
        this.width = width;
        this.height = height;
        this.typeOfInternetAccess = typeOfInternetAccess;
        this.networkAdapterSpeed = networkAdapterSpeed;

        if (numberOfProcessorCores < 2) {
            System.out.println("Такого количества ядер процессора не существует!");
            throw new IllegalArgumentException();
        } else if (networkAdapterSpeed < 10) {
            System.out.println("Такой скорости у сетевого адаптера не может быть!");
            throw new IllegalArgumentException();

        }
    }

    public Computer(String name, int numberOfProcessorCores, String typeOfInternetAccess, int yearOfIssue,
                    String operatingSystem, String processorModel, int networkAdapterSpeed) {

        this.name = name;
        this.yearOfIssue = yearOfIssue;
        this.operatingSystem = operatingSystem;
        this.processorModel = processorModel;
        this.numberOfProcessorCores = numberOfProcessorCores;
        this.typeOfInternetAccess = typeOfInternetAccess;
        this.networkAdapterSpeed = networkAdapterSpeed;

        if (yearOfIssue < 1000) {
            System.out.println("Тут должен быть РЕАЛЬНЫЙ год!");
            throw new IllegalArgumentException();
        } else if (numberOfProcessorCores < 2) {
            System.out.println("Такого количества ядер процессора не существует!");
            throw new IllegalArgumentException();
        } else if (networkAdapterSpeed < 10) {
            System.out.println("Такой скорости у сетевого адаптера не может быть!");
            throw new IllegalArgumentException();
        }

    }

    public Computer() {
    }
}