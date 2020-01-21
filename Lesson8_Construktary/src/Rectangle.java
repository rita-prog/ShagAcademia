public class Rectangle {        //прямоугольник
    int top;        // верхняя координата
    int left;       // левая координата
    int width;      // ширина
    int height;     // высота

    public Rectangle(int top, int left, int width, int height) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public Rectangle(int top, int left) {
        this.top = top;
        this.left = left;
        this.width = 0;
        this.height = 0;
    }

    public Rectangle(int top, int left, int width) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = width;        //высота = ширине
    }

    public Rectangle(){         // надо создать копию другого треугольника и передать его в параметрах
                                // я забыла как это делается

    }


}
