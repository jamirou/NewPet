package com.jamirodev.mynewpet.ui

import androidx.lifecycle.ViewModel

class FactsViewModel : ViewModel() {

    fun generateRandomFact(selectedAnimal:String):String {
        return if (selectedAnimal == "Dog") {
            getDogFacts().random()
        }else {
            getCatFacts().random()
        }
    }

    fun getDogFacts(): List<String> {
        val dogFacts = listOf(
            "El perro fue el primer animal en ser domesticado por el ser humano a partir del lobo asiático y el dingo.",
            "todas las razas de perros pertenecen a la misma especie: Canis familiaris.",
            "Los perros establecen unas sociedades democráticas en las que el que es dominante hoy, puede dejar de serlo mañana. Es decir, los perros no siguen una jerarquía lineal",
            "A diferencia de los gatos, los perros no son carnívoros estrictos.",
            "Los perros son animales voraces por naturaleza, pues en su estado natural estaban acostumbrados a realizar comidas abundantes para poder soportar varios días de ayuno hasta conseguir una nueva presa.",
            "Al igual que las personas, los perros también tienen una primera dentición de leche o decidua, la cual se reemplaza por la dentición permanente o definitiva entre los 2 y los 6 meses de edad",
            "Su olfato: está unas 15 veces más desarrollado que el de las personas, pudiendo detectar olores a muy baja concentración y distinguir miles de olores diferentes.",
            "Su oído: es 4 veces más agudo que el del ser humano, pudiendo percibir sonidos a una frecuencia 3 veces superior a la nuestra.",
            "Su gusto: está pobremente desarrollado en comparación con las personas.",
            "Su vista: tampoco está especialmente desarrollado. Tienen una sensibilidad a los movimientos periféricos unas 10 veces superior a la nuestra, aunque la sensibilidad a la luz y la visión nocturna es similar a la del hombre."
        )
        return dogFacts
    }

    fun getCatFacts(): List<String> {
        val catFacts = listOf(
            "Los gatos aparecieron en la Tierra antes que los perros y que muchos animales que han llegado a ser domésticos, pero han sido uno de los últimos en ser domesticados.",
            "En el Antiguo Egipto los gatos eran adorados y el rapto o la venta de estos animales podía ser penado con la muerte, pues su labor como cazadores de ratas era muy valorado.",
            "En el Antiguo Egipto, si un gato familiar moría, todos los miembros de la familia se depilaban las cejas en señal de duelo.",
            "Las gatas, generalmente, son diestras y los gatos, zurdos.",
            "Las fosas nasales de un gato tienen 19 millones de terminaciones nerviosas. El hombre solo 5 millones.",
            "Los bigotes de los gatos les sirven de indicador de espacio. Los usan para medir la distancia con otro objeto y orientarse. ",
            "Los gatos no tienen papilas gustativas para lo dulce. ",
            "Los gatos duermen una media de 16 horas.",
            "El cerebro de un gato se parece en un 90% al de un ser humano. Tenemos más similitudes con ellos que con los perros.",
            "Los gatos, con el paso de los años, se vuelven intolerantes a la lactosa.",
            "Los gatos tienen más memoria a largo plazo que los perros, sobre todo cuando aprenden algo haciéndolo. ",
            "Los gatos pueden saltar hasta 6 veces si longitud.",
            "Los gatos hacen cerca de 100 sonidos, mientras que los perros solo 10.",
            "Un gato tiene la capacidad de cambiar su maullido para conseguir lo que quiera. Puede hasta imitar el llanto de un bebé para obtener comida."
        )
        return catFacts
    }
}