package java_2.oop.coffee;
//https://www.homegrounds.co/best-coffee-beans-bucket-list/

class CoffeeBeans {

    private String beanName;
    private String origin;
    private String flavor;
    private boolean isBrewed = false;
    private boolean isRoasted = false;

    public CoffeeBeans(String beanName, String origin, String flavor) {
        this.beanName = beanName;
        this.origin = origin;
        this.flavor = flavor;
    }



    public String getBeanName() {
        return beanName;
    }

    public String getOrigin() {
        return origin;
    }

    public String getFlavor() {
        return flavor;
    }

    public void roast(boolean isRoasted) {
        if(isRoasted){
            System.out.println("Coffee is roasted");
        }
    }

    /*	Properties :
	beanName
	origin
	flavor
	brewed? - boolean flag indicating whether or not the beans have been brewed or not.
	roasted? - boolean flag indicating whether or not the beans have been roasted or not.  

	Methods :
	roast()

 */
}
