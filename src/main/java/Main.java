import io.javalin.Javalin;
import java.util.*;
import io.javalin.http.Handler;
import objects.ShoppingItem;

public class Main {

    static ArrayList<ShoppingItem> items = new ArrayList<>();

    //TO-DO create array

    public static void main(String[] args) {


        // Adding new ShoppingItems to the list
        items.add(new ShoppingItem("Shirt", 30.0f));
        items.add(new ShoppingItem("Pants", 35.0f));

        // TO-DO add to your array
        
        Javalin app = Javalin.create().start(4100);

        app.get("/", ctx -> ctx.render("index.jte"));

        app.get("/shoppingList", shoppingHandler);

        // TO-DO create route

    }

    public static Handler shoppingHandler = ctx -> {
        
        ctx.render("shoppingList.jte", Collections.singletonMap("items", items));

    };

  // TO-DO create handler

}
