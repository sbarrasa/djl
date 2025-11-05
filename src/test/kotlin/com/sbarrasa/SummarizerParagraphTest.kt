package com.sbarrasa

import kotlin.test.Test
import kotlin.test.assertTrue

class SummarizerParagraphTest {
    @Test
    fun summarizeIA() {
        val largeText = """
            La inteligencia artificial generativa está transformando la forma en que trabajamos y creamos contenido.
            Estos sistemas permiten resumir textos extensos, redactar borradores y responder preguntas de manera rápida,
            lo que ayuda a mejorar la productividad en muchas tareas diarias. Sin embargo, su uso también implica
            desafíos: pueden producir información inexacta, ser sensibles al modo en que se formula una pregunta y
            requieren un manejo cuidadoso de los datos personales. Por eso es importante promover un uso responsable,
            con transparencia y evaluaciones rigurosas, para obtener beneficios reales para la sociedad.
        """.trimIndent()

       val summarizedText = Summarizer.summarize(largeText)
       println("texto resumido: $summarizedText")

       assertTrue(summarizedText.length < largeText.length/2)
    }

   @Test
   fun summarizeIT() {
      val largeText = """
           Las tecnologías de información son disciplinas que estudian y aplican métodos 
           para el desarrollo de software y sistemas informáticos. 
           Incluyen la creación, implementación y mantenimiento de aplicaciones, 
           herramientas digitales y plataformas que permiten procesar, almacenar 
           y transmitir información de manera eficiente. 
        """.trimIndent()

      val summarizedText = Summarizer.summarize(largeText)
      println("texto resumido: $summarizedText")

      assertTrue(summarizedText.length < largeText.length/2)
   }
}
