&nbsp;

&nbsp;

Markdown

\# Logistics & UI Application (Factory Method & Abstract Factory)

Individual assignment for **\*\*ShP-2216 Software Design Patterns\*\*** (Astana IT University).

\#\# Overview  
This Java console application demonstrates the combined usage of two creational design patterns:  
1\. **\*\*Factory Method:\*\*** Decouples transport instantiation (\`Truck\`, \`Ship\`) from the core logistics workflow (\`Logistics\`, \`RoadLogistics\`, \`SeaLogistics\`).  
2\. **\*\*Abstract Factory:\*\*** Enforces consistency when creating matching families of UI components (\`Button\`, \`Checkbox\`) for different operating systems (\`WindowsFactory\`, \`MacOSFactory\`)\[cite: 1\].

Both patterns are configured at runtime via user input without modifying business logic\[cite: 1\].

\---

\#\# Project Structure

\`\`\`text  
src/  
├── factory\_method/       \# Factory Method implementation (Transport & Logistics)  
│   ├── Transport.java  
│   ├── Truck.java  
│   ├── Ship.java  
│   ├── Logistics.java  
│   ├── RoadLogistics.java  
│   └── SeaLogistics.java  
├── abstract\_factory/     \# Abstract Factory implementation (UI components & factories)  
│   ├── Button.java  
│   ├── Checkbox.java  
│   ├── WindowsButton.java  
│   ├── WindowsCheckbox.java  
│   ├── MacOSButton.java  
│   ├── MacOSCheckbox.java  
│   ├── GUIFactory.java  
│   ├── WindowsFactory.java  
│   └── MacOSFactory.java  
├── app/                  \# Client logic  
│   └── DeliveryApplication.java  
└── Main.java             \# Entry point and input validation

## **How to Run**

### **Option 1: IntelliJ IDEA**

> 1. Open the project root folder in IntelliJ IDEA.  
> 2. Locate src/Main.java.  
> 3. Right-click and choose **Run 'Main.main()'**.  
> 4. Enter the delivery mode and UI platform in the console prompt.

### **Option 2: Command Line**

Compile all source files and run the main entry point:

&nbsp;

&nbsp;

&nbsp;

&nbsp;

javac \-d bin src/factory\_method/\*.java src/abstract\_factory/\*.java src/app/\*.java src/Main.java  
java \-cp bin Main

## **Supported Input Combinations**

* **Delivery Mode:** ROAD, SEA  
  \[cite: 1\]  
* **UI Platform:** WINDOWS, MACOS  
  \[cite: 1\]

### **Example Execution**

&nbsp;

&nbsp;

&nbsp;

&nbsp;

Enter delivery mode (ROAD / SEA):  
Road  
Enter UI platform (WINDOWS / MACOS):  
windows  
Rendering Windows button  
Rendering Windows checkbox  
Truck delivers laboratory equipment to Aktau warehouse

&nbsp;

&nbsp;

&nbsp;
