package models;

import java.time.LocalDateTime;

public abstract class BaseModel {
    private int id;
    private LocalDateTime createdBy;
    private LocalDateTime updatedBy;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public BaseModel(){

    }

    public BaseModel(int id, LocalDateTime createdBy, LocalDateTime updatedBy, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
