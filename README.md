# Automation task using Selenium/Java & Python scripting

## Update V2

I optimized the code by improving algorithm efficiency and memory management, ensuring better performance and resource usage. Additionally, I enhanced adherence to OOP principles, implementing design patterns and improving encapsulation for better modularity. In Task 1, I noted that changes to the Amazon website now prevent using multiple filters simultaneously, which impacts our approach. I also developed detailed test cases, focusing on edge scenarios to ensure robustness and reliability, leading to a more maintainable and scalable codebase.

## Description

This Selenium automation tasks utilize the Page Object Model (POM) design pattern to streamline the testing process. By encapsulating web elements and their related functionality into separate classes, the code becomes modular and easier to maintain. With POM, each page or component has its own corresponding class, enhancing code reusability and readability. Selenium's powerful features are leveraged to interact with web elements and simulate user actions such as clicking buttons and entering text, ensuring a robust and efficient testing framework. Meanwhile, automate data extraction from a CSV file and perform statistical analysis using Python, leveraging libraries like pandas. This streamlines data processing, reducing error margins and manual intervention. Python's scripting capabilities facilitate quick and accurate data insights, paving the way for more complex analysis pipelines. These automation tasks enhance productivity, ensuring seamless execution and informed decision-making.

## Task 1

**<dt>Very Important Note</dt>**

<dd>In this task, the website that was used is <mark>https://www.amazon.eg/</mark> instead of <mark>https://www.amazon.com/</mark> because this website needs human interaction for authentication, and this will force us to have a manual part in this automated task. </dd>

### Steps

<ul>
  <li>Scenario 1</li>
  <ol>
     <li>Open amazon link “https://www.amazon.eg/” then type " car accessories"</li>
     <li>Select the first Item</li>
     <li>Add item to the cart</li>
     <li>Go to the cart and check that item is added successfully</li>
  </ol>
  <li>Scenario 2</li>

**In this scenario, in the 2nd step, there was no filter for "Headphones" so instead of using Headphones as a filter, we used "Electronics" and there was no force page; we chose the 2nd page**

  <ol>
     <li>Open today's deals</li>
     <li>from the left side filters select "grocery"</li>
     <li>from the discount part choose "10% off or more"</li>
     <li>go to the fourth page then select any item and add it to the cart</li>
  </ol>
</ul>

## Task 2

### Steps

  <ol>
     <li>Open this website: “https://ksrtc.in/oprs-web/guest/home.do?h=1”</li>
     <li>Choose the following ((from "CHIKKAMAGALURU" to "BENGALURU”)) from the popular routes</li>
     <li>Click “Search for bus”</li>
     <li>Select a seat</li>
     <li>Choose the boarding point and dropping point</li>
     <li>Fill the “Customer” and “Passenger” details (Note: you can use this phone number: 6789125987)</li>
     <li>Click on “make payment” and fill all the fields without submitting the payment</li>
  </ol>

## Task 3

### Steps

<ol>
   <li>Remove any duplicates in the table</li>
   <li>Remove any decimal places in the Age column</li>
   <li>Convert the USD salary to EGP</li>
   <li>Print in the console some stats like:</li>
   <ul>
     <li>Average age</li>
     <li>Median Salaries</li>
     <li>Ration between males and female employees</li>
   </ul>
   <li>write the data in a new CSV file</li>
</ol>
