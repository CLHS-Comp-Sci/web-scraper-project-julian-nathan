[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/L5GNwFiz)
_Keep track of this ReadME file as you go. Delete this line when ready_ 
# Insert Project Name
### 2025 CLHS Cybersecurity
Nathan Chau Julian Falcon

## WebScraping and Web Cracking
Price scraping

## Description
This project is a Java-based web scraper that extracts product names and prices from the MaxGaming News page. Using the JSoup library, it connects to the site, parses the HTML content, and collects relevant data. The program automatically loops through all available pages until no more product listings are found. Each product's title and price are written to a .txt file for easy access. The code can be easily modified to fit most websites with similar HTML structures. Accordance with robots.txt policies.

## Use
- This program scrapes product names and prices from MaxGaming News and writes the results to a .txt file.
- Change the filePath in the code to a valid location on your machine.
- java -cp .;jsoup-x.x.x.jar brokenWings.runicBlade (Eclipse)
- Output will be saved to the specified .txt file in the format: Product Name -> Price

## Sources
[Video](https://www.youtube.com/watch?v=tI1qGwhn_bs)

## Requirement Checklist
_Feel free to add any checklist items below to best communicate with your group_
[Instructions for how to use GitHub text formatting] (https://docs.github.com/en/get-started/writing-on-github/getting-started-with-writing-and-formatting-on-github/basic-writing-and-formatting-syntax) 

_To mark a box as complete enter an X in between the brackets. See the first check for an example_
- [ ] Created github repository
- [ ] edited MarkDown file for my group with project name and group members.
- [ ] Research and define webscraping and web cracking in md file
- [ ] Decide Project using research and personal preference. Fill in Description on md file when ready.
- [ ] Code and Create Project
- [ ] Presentation
   - [ ] code snippets
   - [ ] video of running program
   - [ ] At least 11 slides **_See Instructions_**
- [ ] Project Write-Up
- [ ] Works Cited

## Writeup
For this project, I developed a web scraper named RunicBlade using Java. The primary purpose of the program is to scrape product names and prices from the MaxGaming News website and write the data to a .txt file. Web scraping, in this case, refers to the automated process of extracting information from a website, typically by fetching the HTML content and parsing it to extract relevant data. The first step in creating this program was to choose a programming language. I decided to use Java because it provides a stable, well-documented environment for web scraping tasks. Additionally, Java's widespread use and comprehensive libraries make it an ideal choice for someone looking to learn about web scraping in a real-world context. To accomplish this, I used the JSoup library, which is a Java-based library specifically designed for working with HTML. JSoup allows you to easily retrieve, parse, and manipulate HTML, making it perfect for scraping tasks. JSoup also provides robust support for CSS selectors, which I used to target specific elements on the web page. The MaxGaming website contains product data displayed across multiple pages. In the program, I implemented a pagination mechanism that automatically loops through the pages by checking the presence of product elements. The program identifies pages with product listings by checking for the existence of HTML elements that contain product titles and prices. Once the data is collected, it is written into a .txt file in a simple format: “Product Name -> Price”. This process continues until no more product data is available. One of the biggest challenges I faced during this project was reading and understanding HTML code for the first time. As a beginner to web scraping, I was unfamiliar with how to navigate HTML documents and extract useful data from them.
- https://jsoup.org/
- https://www.youtube.com/watch?v=tI1qGwhn_bs
- https://www.oracle.com/corporate/features/jsoup-html-parsing-library.html
- https://developer.mozilla.org/en-US/docs/Web/HTTP
- https://www.geeksforgeeks.org/jsoup-html-parser-in-java/
