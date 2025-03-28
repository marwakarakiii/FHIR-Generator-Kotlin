package com.marwakaraki.fhir.generator

import ca.uhn.fhir.context.FhirContext
import org.hl7.fhir.r4.model.Patient
import java.text.SimpleDateFormat

object FHIRGenerator {
    private val fhirContext = FhirContext.forR4()

    fun createPatientFHIR(firstName: String, lastName: String, dob: String, gender: String): String {
        val patient = Patient().apply {
            addName().apply {
                family = lastName
                addGiven(firstName)
            }
            birthDate = SimpleDateFormat("yyyy-MM-dd").parse(dob)
            this.gender = when (gender.lowercase()) {
                "male" -> org.hl7.fhir.r4.model.Enumerations.AdministrativeGender.MALE
                "female" -> org.hl7.fhir.r4.model.Enumerations.AdministrativeGender.FEMALE
                else -> org.hl7.fhir.r4.model.Enumerations.AdministrativeGender.UNKNOWN
            }
        }
        return fhirContext.newJsonParser().setPrettyPrint(true).encodeResourceToString(patient)
    }
}
