package com.essielearning.expensetrackerapi.domain;

public class category {
    private String categoryId;
    private String UserId;
    private String title;
    private String description;
    private String totalExpense;

    public category(String categoryId, String userId, String title, String description, String totalExpense) {
        this.categoryId = categoryId;
        UserId = userId;
        this.title = title;
        this.description = description;
        this.totalExpense = totalExpense;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTotalExpense() {
        return totalExpense;
    }

    public void setTotalExpense(String totalExpense) {
        this.totalExpense = totalExpense;
    }
}
