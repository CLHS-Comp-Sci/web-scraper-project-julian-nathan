package brokenWings;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class runicBlade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "C:\\Users\\Chau\\Desktop\\Blade\\scraped.txt";
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
			int pageNumber = 1;
			boolean productPage;
			
			do {
				String website = "https://www.maxgaming.com/en/news?page=" + pageNumber;
				System.out.println(website);
				try {
					Document document = Jsoup.connect(website).get();
					Elements elements = document.select(".lower");
					productPage = !elements.isEmpty();
					if (productPage) {
						for (Element farming : elements) {
							String title = farming.select(".PT_Beskr").text();
							String price = farming.select(".PT_PrisNormal").text();
							System.out.println(title + " -> " + price);
							writer.write(title + " -> " + price);
							writer.newLine();
						}
						pageNumber = pageNumber + 1;
					}
				} catch (IOException e) {
					e.printStackTrace();
					break;
				}
			} while (productPage);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
