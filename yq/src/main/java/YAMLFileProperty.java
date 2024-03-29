package main.java;

public class YAMLFileProperty {
    private String key;
    private Object value;

    public YAMLFileProperty(String key, Object value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return this.key;
    }

    public Object getValue() {
        return this.value;
    }
}