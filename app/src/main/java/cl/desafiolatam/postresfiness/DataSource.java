package cl.desafiolatam.postresfiness;

import java.util.ArrayList;
import java.util.List;

public class DataSource {

    private static List<Recipe> recipes = new ArrayList<>();

    static {
        recipes.add(new Recipe(0,
                "Brownies bites de banana",
                "Deliciosos y saludables brownies libres de azucar",
                "– 1 scoop de proteína de vainilla o chocolate\n– 2 cucharadas de harina de coco\n1" +
                        "– 2 cucharadas de cacao en polvo sin azúcar\n– 1 cucharadita de polvo de hornear\n" +
                        "– 1/8 de cucharadita de bicarbonato de sodio\n– 1 pizca de sal\n" +
                        "– 3 cucharadas de extracto de stevia natural (o el edulcorante que utilicen, aconsejo ir probando hasta alcanzar el punto deseado de dulzura)\n" +
                        "– 3 claras\n– 1 chorrito de vinagre\n– 1 cucharada de miel o jarabe sin azúcar\n– 1 banano (cambur) maduro\n" +
                        "– 1 cucharadita de esencia de vainilla\n",
                "1. Integra todos los ingredientes secos, reserva.\n" +
                        "2. Bate las claras con el chorrito de vinagre hasta conseguir el punto de nieve.\n" +
                        "3. Mezcla el resto de ingredientes húmedos (banano, miel o jarabe y vainilla) y añádelos a la mezcla seca, luego integra las claras montadas con movimientos envolventes. Revuelve o bate hasta que la mezcla esté homogénea.\n" +
                        "4. Vierte la preparación en moldes engrasados, llenando 3/4 partes de cada uno. Puedes decorar opcionalmente con chips de chocolate sin azúcar o trocitos de cacao.\n" +
                        "5. Hornea por 10-15 minutos a 180°C/350°F. Desmolda y disfruta.",
                R.drawable.brownie_banana));

        recipes.add(new Recipe(1,
                "Crepe con durazno y mango",
                "Rapida y deliciosa crepe con un importante aporte de fibra, vitaminas y totalmente libre de azucar",
                "Para una porción:\n" +
                        "– 2 claras de huevo\n" +
                        "– 1 cucharada de avena molida\n" +
                        "– 1 cucharada de leche vegetal\n" +
                        "– Pizca de edulcorante\n" +
                        "– Pizca de sal\n" +
                        "Para la compota:\n" +
                        "– 1 durazno pequeño\n" +
                        "– 1/2 mango maduro pequeño\n" +
                        "– 2 sobres de edulcorante\n" +
                        "– 4 cucharadas de agua\n" +
                        "– 1 cucharadita de canela",
                "Preparación:\n" +
                        "1. Mezcla todos los ingredientes de la masa de crepes y vierte en una sartén antiadherente.\n" +
                        "2. Deja dorar por 5 minutos y desprende cuidadosamente los bordes de la tortilla, voltear hasta dorar por la otra cara, de 2 a 3 minutos. Retirar de la sartén.\n" +
                        "3. Pica las frutas en trozos y pon a cocinar tapadas junto con el agua, la canela y el edulcorante. Dejar reducir por 10 minutos a fuego bajo.\n" +
                        "4. Rellenar la tortilla con la compota y servir.",
                R.drawable.crepe_con_durazno_y_mango));

        recipes.add(new Recipe(2,
                "French toast sandwich",
                "Riquísimo French Toast Sandwich libre de azucar y grasas",
                "Para dos porciones de french toast sandwich:\n" +
                        "– 4 tajadas de pan integral\n" +
                        "– 1 banano\n" +
                        "– 2 cucharadas de mantequilla de maní o almendras\n" +
                        "– 1 huevo\n" +
                        "– 1 cucharada de leche de almendras\n" +
                        "– 1 cucharada de syrup sin azúcar\n" +
                        "– 1 cucharadita de vainilla\n" +
                        "– 1 cucharadita de canela\n" +
                        "– 1 pizca de sal\n",
                "",
                R.drawable.french_toash_sandwich));
    }

    public static List<Recipe> getRecipes() {
        return recipes;
    }
}
