public class Vehicle {
    private int modelNo;
    private String category;

    public Vehicle(int modelNo, String category){
        this.modelNo = modelNo;
        this.category = category;
    }

    public void setModelNo(int modelNo) {
        this.modelNo = modelNo;
    }

    public int getModelNo() {
        return modelNo;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void display(){
        System.out.println(modelNo+" "+category);
    }
}
