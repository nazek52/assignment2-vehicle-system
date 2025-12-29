# Vehicle Management System

## Project Overview
The Vehicle Management System is a Java-based application designed to demonstrate Object-Oriented Programming (OOP) principles, including **inheritance**, **abstraction**, **composition**, and **aggregation**. This system manages different types of vehicles (Car, Motorcycle, Truck) and their associated drivers, allowing the user to simulate starting and stopping engines and display vehicle and driver information.

---

## Class Hierarchy

### Superclass: Vehicle (Abstract)
- **Fields:** `brand` (protected), `year` (protected), `driver` (protected)
- **Abstract Methods:** `startEngine()`, `stopEngine()`
- **Concrete Method:** `displayInfo()` — prints brand and year
- **Access Modifiers:** Protected fields allow subclasses to access data while maintaining encapsulation.

### Subclasses
1. **Car**
   - Fields: `doors`, `fuelType`
   - Overrides `startEngine()` and `stopEngine()` to provide Car-specific behavior.
2. **Motorcycle**
   - Field: `hasSidecar`
   - Overrides engine methods for Motorcycle behavior.
3. **Truck**
   - Fields: `capacity`, `numAxles`
   - Custom engine start/stop behavior for Truck.

### Driver Class
- Fields: `name`, `licenseNumber`
- Method: `displayDriverInfo()`
- **Association:** 
  - Composition: Each Vehicle has a Driver object.
  - Aggregation: A Driver can be associated with multiple Vehicles.

---

## Instructions to Compile and Run

1. Open terminal in the `src` directory.
2. Compile all Java files:
   ```bash
   javac *.java
   Screenshots

##Screenshots are available in the docs/screenshots/ folder, showing program output demonstrating correct behavior of vehicles and drivers.

##Reflection

Inheritance simplified the design by allowing all vehicle types to share common attributes and methods, reducing code duplication. Method overriding enabled each subclass to customize engine behavior according to its specific type. Using protected access modifiers facilitated subclass access to fields while preserving encapsulation, although careful attention was needed to avoid unintended exposure. The composition and aggregation relationships provided a flexible yet structured way to manage Driver–Vehicle associations.
