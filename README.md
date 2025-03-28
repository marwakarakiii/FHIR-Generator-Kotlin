# FHIR Generator App

## Overview
This is a Kotlin-based (XML, NOT Jetpack Compose) Android application that generates **FHIR-compliant JSON** for patient records. It takes user input (name, date of birth, gender) and converts it into an **HL7 FHIR** document using the **HAPI-FHIR** library.

## What is FHIR?
FHIR (Fast Healthcare Interoperability Resources) is a standard developed by HL7 for exchanging healthcare information electronically. It defines structured resources for healthcare data, making it easier to share patient information across systems.

### HL7 vs FHIR
- **HL7 v2 & v3** are older standards primarily used in hospital systems for messaging and interoperability.
- **FHIR** is a modern standard using RESTful APIs and JSON/XML formats, making it more flexible and developer-friendly.

## Tech Stack
- **Kotlin (Android)** for UI & logic
- **HAPI-FHIR** for FHIR document generation

## Features
✔ Takes user input (Patient Name, DOB, Gender)
✔ Converts into FHIR JSON format
✔ Displays the structured output
✔ Uses HAPI-FHIR for compliance

## Setup & Dependencies
1. Clone the repository:
   ```sh
   git clone https://github.com/yourusername/FHIR-Generator-App.git
   ```
2. Add dependencies to `build.gradle.kts`:
   ```kotlin
   dependencies {
       implementation("ca.uhn.hapi.fhir:hapi-fhir-base:6.8.0")
       implementation("ca.uhn.hapi.fhir:hapi-fhir-structures-r4:6.8.0")
   }
   ```
3. Run the app and generate a FHIR-compliant document.
