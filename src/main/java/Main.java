import io.javalin.Javalin;
import java.util.*;
import io.javalin.http.Handler;
import objects.SeaCreature;
import objects.ShoppingItem;

public class Main {

    static ArrayList<ShoppingItem> items = new ArrayList<>();

    static ArrayList<SeaCreature> seaCreatures = new ArrayList<>();

    public static void main(String[] args) {


        // Adding new ShoppingItems to the list
        items.add(new ShoppingItem("Shirt", 30.0f));
        items.add(new ShoppingItem("Pants", 35.0f));

        seaCreatures.add(new SeaCreature("Blobfish", 1.0f, "pink"));
        seaCreatures.add(new SeaCreature("Sea Angel", 0.16f, "green-cyan"));
        seaCreatures.add(new SeaCreature("Peacock Mantis Shrimp", 0.5f, "orange"));
        seaCreatures.add(new SeaCreature("Firefly Squid", 0.25f, "brownish-red"));
        
        Javalin app = Javalin.create().start(4100);

        app.get("/", ctx -> ctx.render("index.jte"));

        app.get("/shoppingList", shoppingHandler);

        app.get("/seaCreatures", scHandler);

    }

    public static Handler shoppingHandler = ctx -> {
        
        ctx.render("shoppingList.jte", Collections.singletonMap("items", items));

    };

    public static Handler scHandler = ctx -> {
      ctx.render("seaCreatures.jte",
      Collections.singletonMap("seaCreatures", seaCreatures));
    };

}
