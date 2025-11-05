package com.sbarrasa

import ai.djl.Application
import ai.djl.inference.Predictor
import ai.djl.repository.zoo.Criteria
import ai.djl.repository.zoo.ModelZoo

object Summarizer {
   private val criteria = Criteria.builder()
      .optApplication(Application.NLP.TEXT_GENERATION)
      .setTypes(String::class.java, String::class.java)
      .build()

   private val predictor: Predictor<String, String> = ModelZoo.loadModel(criteria).newPredictor()

   fun summarize(text: String): String {
      val prompt = "Resumí en español en menos de 20 palabras: $text"
      return predictor.predict(prompt)
   }
}
