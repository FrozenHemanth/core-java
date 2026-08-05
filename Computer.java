55class Computer{

    void install(Browser browser){
        System.out.println("Executing install metod in Computer class");
		if(browser != null){
        browser.open(); 
		}
		
		 if (browser instanceof ChromeBrowser){
            ChromeBrowser chrome=(ChromeBrowser) browser;
            chrome.fastOpen();
        }
		
		if (browser instanceof MobileChromeBrowser){
            MobileChromeBrowser mobile=(MobileChromeBrowser) browser;
            mobile.offline();
		}
	
    }
}