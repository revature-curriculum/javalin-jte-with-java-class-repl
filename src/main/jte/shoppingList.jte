@import objects.ShoppingItem
@import java.util.*
@param ArrayList<ShoppingItem> items


<html lang="en">

<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/water.css@2/out/light.min.css">
</head>
<body>

    <p>Hello visitor!</p>

    @for(ShoppingItem item : items)
    <li>${item.getName()} costs ${item.getPrice()}</li>
    @endfor

</body>
</html>