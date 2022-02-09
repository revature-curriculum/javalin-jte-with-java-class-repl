@import java.util.*
@import objects.SeaCreature
@param ArrayList<SeaCreature> seaCreatures

<html lang="en">

<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/water.css@2/out/light.min.css">
</head>

<body>

  Some facts about my favorite sea creatures:
    @for(SeaCreature seaCreature : seaCreatures)
      <li>${seaCreature.getName()} have a size of ${seaCreature.getSize()} feet and are ${seaCreature.getColor()} in color</li>
    @endfor

</body>

</html>