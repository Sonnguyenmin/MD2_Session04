package ra.Session01.BTTH03_ProductClass;

public class Category {
    private int CategoryId;
    private String CategoryName;

    public Category() {
    }

    public Category(int categoryId, String categoryName) {
        this.CategoryId = categoryId;
        this.CategoryName = categoryName;
    }

    public int getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(int categoryId) {
        CategoryId = categoryId;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }

    public void displayCategory() {
        System.out.println("Category Id: " + CategoryId + "\n");
        System.out.println("Category Name: " + CategoryName);
    }
}
