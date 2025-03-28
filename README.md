# FHIR Generator App

## Overview
This is a **Jetpack Compose-based Android application written in Kotlin** that generates **FHIR-compliant JSON** for patient records. It takes user input (name, date of birth, gender), validates the form, and converts it into an **HL7 FHIR** document using the **HAPI-FHIR** library.

## What is FHIR?
FHIR (Fast Healthcare Interoperability Resources) is a standard developed by HL7 for exchanging healthcare information electronically. It defines structured resources for healthcare data, making it easier to share patient information across systems.

### HL7 vs FHIR
- **HL7 v2 & v3** are older standards primarily used in hospital systems for messaging and interoperability.
- **FHIR** is a modern standard using RESTful APIs and JSON/XML formats, making it more flexible and developer-friendly.

## Tech Stack
- **Kotlin** with **Jetpack Compose** for UI
- **HAPI-FHIR** for FHIR document generation
- **Guava (Android)** for compatibility
- **Material3 Compose UI**

## Features
✅ User input for Patient Name, Date of Birth, and Gender  
✅ Gender selection via radio buttons  
✅ Input validation (no empty fields, valid date format `YYYY-MM-DD`)  
✅ Generates a valid FHIR-compliant JSON document using HAPI-FHIR  
✅ Displays formatted JSON on screen  
✅ Ability to **share the generated JSON** via system share sheet
