package main.java.SohuSpider;

import main.java.SohuSpider.service.SpiderService;

public class main{
	/**
	 * 河南省公安厅要闻爬虫入口
	 * 
	 * @param 
	 * @throws InterruptedException 
	 * 
	 */
	public static void main(String[] args) throws InterruptedException{
		SpiderService spider = new SpiderService();
		spider.start();
	}
}
