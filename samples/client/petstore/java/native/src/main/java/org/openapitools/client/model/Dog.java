/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.openapitools.client.model.Animal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.openapitools.client.JSON;
import org.openapitools.client.ApiClient;
/**
 * Dog
 */
@JsonPropertyOrder({
  Dog.JSON_PROPERTY_BREED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0-SNAPSHOT")
@JsonIgnoreProperties(
  value = "className", // ignore manually set className, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the className to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "className", visible = true)

public class Dog extends Animal {
  public static final String JSON_PROPERTY_BREED = "breed";
  private String breed;

  public Dog() { 
  }

  public Dog breed(String breed) {
    this.breed = breed;
    return this;
  }

  /**
   * Get breed
   * @return breed
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BREED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBreed() {
    return breed;
  }


  @JsonProperty(JSON_PROPERTY_BREED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBreed(String breed) {
    this.breed = breed;
  }


  @Override
  public Dog className(String className) {
    this.setClassName(className);
    return this;
  }

  @Override
  public Dog color(String color) {
    this.setColor(color);
    return this;
  }

  /**
   * Return true if this Dog object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dog dog = (Dog) o;
    return Objects.equals(this.breed, dog.breed) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(breed, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dog {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    breed: ").append(toIndentedString(breed)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `className` to the URL query string
    if (getClassName() != null) {
      joiner.add(String.format("%sclassName%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getClassName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `color` to the URL query string
    if (getColor() != null) {
      joiner.add(String.format("%scolor%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getColor()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `breed` to the URL query string
    if (getBreed() != null) {
      joiner.add(String.format("%sbreed%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getBreed()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
static {
  // Initialize and register the discriminator mappings.
  Map<String, Class<?>> mappings = new HashMap<String, Class<?>>();
  mappings.put("Dog", Dog.class);
  JSON.registerDiscriminator(Dog.class, "className", mappings);
}

    public static class Builder extends Animal.Builder {

    private Dog instance;

    public Builder() {
      this(new Dog());
    }

    protected Builder(Dog instance) {
      super(instance);
      this.instance = instance;
    }

    public Dog.Builder breed(String breed) {
      this.instance.breed = breed;
      return this;
    }

    public Dog.Builder className(String className) { // inherited: true
      super.className(className);
      return this;
   }

    public Dog.Builder color(String color) { // inherited: true
      super.color(color);
      return this;
   }


    /**
    * returns a built Dog instance.
    *
    * The builder is not reusable.
    */
    public Dog build() {
      try {
        return this.instance;
      } finally {
        // ensure that this.instance is not reused
        super.build();
        this.instance = null;
      }
    }

    @Override
    public String toString() {
      return getClass() + "=(" + instance + ")";
    }
  }

  /**
  * Create a builder with no initialized field.
  */
  public static Dog.Builder builder() {
    return new Dog.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public Dog.Builder toBuilder() {
    return new Dog.Builder()
      .className(getClassName())
      .color(getColor())
      .breed(getBreed());
  }

}

