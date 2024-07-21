package base;

import pages.PageObjectManager;

public class PicoTextContext {
	
	private BrowserFactory browserFactory;
	private PageObjectManager pageObjectManager;
	
	
	public PicoTextContext()
	{
		browserFactory=new BrowserFactory();
		pageObjectManager=new PageObjectManager(browserFactory.browserInstantiate());
	}


	public BrowserFactory getBrowserFactory() {
		return browserFactory;
	}


	public PageObjectManager getPageObjectManager() {
		return pageObjectManager;
	}

}
