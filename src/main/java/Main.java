import io.javalin.Javalin;
import java.util.*;
import io.javalin.http.Handler;
import objects.ShoppingItem;

public class Main {

    static ArrayList<ShoppingItem> items = new ArrayList<>();

    public static void main(String[] args) {


        // Adding new ShoppingItems to the list
        items.add(new ShoppingItem("Shirt", 30.0f));
        items.add(new ShoppingItem("Pants", 35.0f));
        
        Javalin app = Javalin.create().start(4100);

        app.get("/", itemHandler);

    }

    public static Handler itemHandler = ctx -> {
        
        ctx.render("index.jte", Collections.singletonMap("items", items));

    };


}
