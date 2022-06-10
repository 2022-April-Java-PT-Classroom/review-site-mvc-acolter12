package org.wecancoeit.reviews;

public class Reviews {

    private Long id;
    private String productName;
    private String imgUrl;
    private String category;
    private String description;

    public Reviews(long id, String productName, String imgUrl, String category, String description) {
        this.id = id;
        this.productName = productName;
        this.imgUrl = imgUrl;
        this.category = category;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getCategory(){
        return category;
    }

    public String getDescription() {
        return description;
    }
}
