package Behavioral.TemplateMethod;

public abstract class WebsiteTemplate {

    public void showPage() {
        System.out.println("Header");
        showPageContent();
        System.out.println("Footer");
    }

    public abstract void showPageContent();
}
