public class HornerScheme {

    public static float hornerScheme(float x) {
        float[] coefficients = {2, -1, 3};
        float result = coefficients[0]; // Инициализируем результат значением первого коэффициента

        for (int i = 1; i < coefficients.length; i++) {
            result = result * x + coefficients[i]; // Применяем схему Горнера для вычисления значения
        }

        return result;
    }
}