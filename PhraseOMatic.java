public class PhraseOMatic {
    public static void main(String[] args) {
        String[] worldListOne = {"круглосуточный", "трех-звенный", "30000-футовый",
        "взаимный", "обоюдный выигрыш", "фронтэед", "на основе веб-технологий", "проникающий",
                "умный", "шесть сигм", "метод критического пути", "динамичный"};

        String[] worldListTwo = {"уполномоченный", "трудный", "чистый продукт", "ориентированный",
                "центральный", "распределенный", "фирменный", "сетевой", "нестандартный ум", "сфокусированный",
                "нацеленный на", "иди ты в"};

        String[] worldListThree = {"желание", "ржавый", "семнадцать", "рассвет", "печь", "девять", "добросердечный",
                "возращение на Родину", "один", "грузовой вагон"};
        int oneLenght = worldListOne.length;
        int twoLenght = worldListTwo.length;
        int threeLenght = worldListThree.length;

        int rand1 = (int) (Math.random() * oneLenght);
        int rand2 = (int) (Math.random() * twoLenght);
        int rand3 = (int) (Math.random() * threeLenght);

        String phrase = worldListOne[rand1] + " " + worldListTwo[rand2] + " " + worldListThree[rand3];

        System.out.println("Все, что нам нужно, - это " + phrase);
    }
}
