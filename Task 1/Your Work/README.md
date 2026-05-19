# Software Requirements Specification (SRS)

## Preface

This document provides the Software Requirements Specification (SRS) for the **Online Health Management System (OHMS)**. It defines the system’s functionalities, performance criteria, security requirements, and overall system architecture necessary for development.

----------

## Version History

-   **Version 1.0** – Initial Draft.
    


----------

# 1. Introduction

## Purpose

The **Online Health Management System (OHMS)** is a web-based application designed to improve healthcare service management by enabling patients, doctors, and administrators to efficiently manage appointments, medical records, prescriptions, billing, and communication.

The system aims to digitize healthcare operations, reduce paperwork, improve patient care, and ensure secure access to medical information.

----------

## Document Conventions

This document follows the IEEE SRS standard, using:

-   **Must** – Indicates mandatory requirements.
    
-   **Should** – Indicates recommended features.
    
-   **May** – Indicates optional enhancements.
    

----------

## Intended Audience and Reading Suggestions

-   **Developers & System Architects** – For implementation and system design.
    
-   **Hospital Administrators & Stakeholders** – To understand system capabilities.
    
-   **Doctors & Medical Staff** – To review operational workflows.
    
-   **Testers & QA Teams** – To validate compliance with requirements.
    

----------

## Scope

The system provides:

-   Online patient registration and authentication
    
-   Appointment scheduling and management
    
-   Electronic medical records management
    
-   Prescription and diagnosis management
    
-   Billing and payment tracking
    
-   Notifications and reminders
    
-   Role-based access and security controls
    

----------

## References

-   IEEE Standard 830-1998 (Software Requirements Specification)
    
-   Healthcare Information Security Guidelines
    
-   Internal Business Requirement Specification (BRS)
    
-   System Modeling Documentation
    

----------

# 2. Overall Description

## Product Perspective

The **Online Health Management System** is a standalone cloud-based web application that may integrate with external services such as:

-   SMS and Email APIs
    
-   Online Payment Gateways
    
-   Laboratory Management Systems
    
-   Telemedicine Platforms
    

----------

## Product Functions

-   **Patient Management:** Register and manage patient profiles.
    
-   **Appointment Scheduling:** Book, update, and cancel appointments.
    
-   **Doctor Management:** Manage doctor schedules and specializations.
    
-   **Medical Records:** Store diagnoses, prescriptions, and treatment history.
    
-   **Billing & Payments:** Generate invoices and process payments.
    
-   **Reporting & Analytics:** Generate healthcare and operational reports.
    
-   **Notifications:** Send reminders for appointments and medications.
    

----------

## User Classes and Characteristics

### Admin

-   Manages users, doctors, departments, and system settings.
    
-   Has full system access.
    

### Doctor

-   Reviews patient records.
    
-   Creates prescriptions and diagnoses.
    
-   Updates treatment progress.
    

### Receptionist

-   Handles appointments and billing.
    
-   Registers patients.
    

### Patient

-   Books appointments.
    
-   Views prescriptions and medical history.
    
-   Receives notifications and reminders.
    

----------

## Operating Environment

-   Web-based application accessible through Chrome, Firefox, Edge, and Safari.
    
-   Cloud-hosted infrastructure.
    
-   **Database:** MongoDB / MySQL.
    
-   Compatible with Windows, Linux, and MacOS.
    

----------

## Design and Implementation Constraints

-   Compliance with healthcare privacy laws and security regulations.
    
-   Secure handling of patient medical data.
    
-   Scalability to support multiple hospitals or clinics.
    

----------

## Assumptions and Dependencies

-   Internet access is required for system operation.
    
-   External APIs are available for notifications and payments.
    
-   Future mobile application integration may be considered.
    

----------

# 3. System Requirements Specification

# Functional Requirements

## User Authentication

-   The system must allow users to register, log in, and reset passwords.
    
-   The system must enforce role-based authentication (Admin, Doctor, Receptionist, Patient).
    
-   The system must support secure password encryption.
    

----------

## Patient Management

-   Receptionists and Admins must be able to register patients.
    
-   Patients must be able to update personal information.
    
-   The system must maintain patient medical history.
    

----------

## Appointment Management

-   Patients must be able to book appointments online.
    
-   Doctors must be able to approve or reschedule appointments.
    
-   The system must notify users about appointment confirmations and reminders.
    

----------

## Doctor Management

-   Admins must be able to add and manage doctor profiles.
    
-   Doctors must be assigned schedules and departments.
    
-   Patients should be able to search doctors by specialization.
    

----------

## Medical Records Management

-   Doctors must be able to create and update prescriptions.
    
-   The system must securely store diagnoses and treatment records.
    
-   Patients should be able to view their medical reports.
    

----------

## Billing & Payment

-   The system must generate invoices for consultations and treatments.
    
-   Patients must be able to make online payments.
    
-   Payment history must be stored securely.
    

----------

## Reporting & Analytics

-   Admins must be able to generate reports on patient visits, revenue, and doctor performance.
    
-   Reports should be exportable in PDF and CSV formats.
    

----------

## Notifications

-   The system must send reminders for appointments and medications.
    
-   The system should notify doctors about scheduled appointments.
    

----------

# Non-Functional Requirements

## Performance Requirements

-   The system must support 1000+ concurrent users.
    
-   Appointment and record updates must reflect in real time.
    
-   The average response time should not exceed 3 seconds.
    

----------

## Security Requirements

-   The system must implement role-based access control.
    
-   All sensitive patient data must be encrypted.
    
-   The system must use HTTPS secure communication.
    
-   The system should maintain audit logs for critical activities.
    

----------

## Usability Requirements

-   The system should provide an intuitive and user-friendly interface.
    
-   The system must support accessibility standards.
    
-   Navigation should be simple for non-technical users.
    

----------

## Reliability and Availability

-   The system must ensure 99.9% uptime.
    
-   A backup and disaster recovery mechanism must be implemented.
    
-   The system should automatically recover from minor failures.
    

----------

## Maintainability and Support

-   The system must support modular architecture.
    
-   Proper logging and debugging mechanisms must be implemented.
    
-   The system should allow easy future upgrades.
    

----------

## Portability

-   The system should support deployment on cloud platforms.
    
-   The system must be accessible from Windows, Linux, and MacOS.
    
-   Future mobile platform support should be possible.
    

----------

# 4. System Models

> -   **CONTEXT DIAGRAM**  
<img src="images/context diagram.png">


# 5. System Evolution

## Assumptions

-   AI may be integrated for disease prediction and appointment recommendations.
    
-   Telemedicine and video consultation support may be added.
    
-   Mobile applications may be introduced in future versions.
    

----------

## Expected Changes

-   Integration with wearable healthcare devices.
    
-   AI-powered health analytics.
    
-   Multi-hospital support.
    
-   Advanced patient monitoring systems.
    

----------

# 6. Appendices

## Hardware Requirements

-   Cloud-based scalable servers.
    
-   Backup storage infrastructure.
    
-   Secure networking environment.
    

----------

## Database Requirements

-   Database system: MongoDB / MySQL.
    
-   Daily automated backups.
    
-   Secure patient data storage and encryption.
    

----------

## Software Requirements

-   Frontend: React.js / Angular
    
-   Backend: Node.js / Django / Spring Boot
    
-   Database: MongoDB / MySQL
    
-   API Integration: REST APIs
    
-   Cloud Platform: AWS / Azure / Google Cloud
    

----------

# 7. Glossary

Term

Description

OHMS

Online Health Management System

EMR

Electronic Medical Record

Admin

System administrator with full access

Appointment

Scheduled meeting between patient and doctor

Prescription

Medication and treatment instructions provided by a doctor

Role-Based Access Control

Restricts system access based on user roles
