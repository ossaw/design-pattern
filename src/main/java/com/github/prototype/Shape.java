package com.github.prototype;

public abstract class Shape implements Cloneable {
    protected String id;
    protected String type;

    public Shape() {}

    protected Shape(String id, String type) {
        this.id = id;
        this.type = type;
    }
    
    protected abstract void draw();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    protected Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

}
