## Demonstrating JBoss RESTEasy service and client implementation.
   JBoss RESTEasy is another implementation for JAX-RS Specification.

## Prerequisites.  
   1. JDK 7.  
   2. JBoss AS 7.  
   3. Maven.  

## How  to Run?
  1. Clone or Download as Zip to your local machine.  
  2. Enter into the root directory through command prompt.  
  3. Run below maven tasks.  

     ``` > mvn compile war ```  

  4. upon successfully build, you can find ```*.war``` in target folder. Deploy it in JBoss AS 7.  

  5. Use ```RestEasyApplicationTest.java``` to test the services.  

## How to import into IDE?
  1. Eclipse.  
     Enter  into root directory of the project. and run the below maven tasks. 

     ``` > mvn eclipse ```  
     
     This will create eclipse related files, then you are good to import.  
