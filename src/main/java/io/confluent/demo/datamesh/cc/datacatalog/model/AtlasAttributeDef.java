/*
 * Confluent Data Catalog
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.confluent.demo.datamesh.cc.datacatalog.model;

import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.confluent.demo.datamesh.cc.datacatalog.model.AtlasConstraintDef;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * AtlasAttributeDef
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-05T12:27:07.994303-05:00[America/Chicago]")
public class AtlasAttributeDef {
  @SerializedName("name")
  private String name = null;

  @SerializedName("typeName")
  private String typeName = null;

  @SerializedName("isOptional")
  private Boolean isOptional = null;

  /**
   * Gets or Sets cardinality
   */
  @JsonAdapter(CardinalityEnum.Adapter.class)
  public enum CardinalityEnum {
    SINGLE("SINGLE"),
    LIST("LIST"),
    SET("SET");

    private String value;

    CardinalityEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static CardinalityEnum fromValue(String text) {
      for (CardinalityEnum b : CardinalityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<CardinalityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CardinalityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CardinalityEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return CardinalityEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("cardinality")
  private CardinalityEnum cardinality = null;

  @SerializedName("valuesMinCount")
  private Integer valuesMinCount = null;

  @SerializedName("valuesMaxCount")
  private Integer valuesMaxCount = null;

  @SerializedName("isUnique")
  private Boolean isUnique = null;

  @SerializedName("isIndexable")
  private Boolean isIndexable = null;

  @SerializedName("includeInNotification")
  private Boolean includeInNotification = null;

  @SerializedName("defaultValue")
  private String defaultValue = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("searchWeight")
  private Integer searchWeight = null;

  /**
   * Gets or Sets indexType
   */
  @JsonAdapter(IndexTypeEnum.Adapter.class)
  public enum IndexTypeEnum {
    DEFAULT("DEFAULT"),
    STRING("STRING");

    private String value;

    IndexTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static IndexTypeEnum fromValue(String text) {
      for (IndexTypeEnum b : IndexTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<IndexTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IndexTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IndexTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return IndexTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("indexType")
  private IndexTypeEnum indexType = null;

  @SerializedName("constraints")
  private List<AtlasConstraintDef> constraints = null;

  @SerializedName("options")
  private Map<String, String> options = null;

  @SerializedName("displayName")
  private String displayName = null;

  public AtlasAttributeDef name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AtlasAttributeDef typeName(String typeName) {
    this.typeName = typeName;
    return this;
  }

   /**
   * Get typeName
   * @return typeName
  **/
  @Schema(description = "")
  public String getTypeName() {
    return typeName;
  }

  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }

  public AtlasAttributeDef isOptional(Boolean isOptional) {
    this.isOptional = isOptional;
    return this;
  }

   /**
   * Get isOptional
   * @return isOptional
  **/
  @Schema(description = "")
  public Boolean isIsOptional() {
    return isOptional;
  }

  public void setIsOptional(Boolean isOptional) {
    this.isOptional = isOptional;
  }

  public AtlasAttributeDef cardinality(CardinalityEnum cardinality) {
    this.cardinality = cardinality;
    return this;
  }

   /**
   * Get cardinality
   * @return cardinality
  **/
  @Schema(description = "")
  public CardinalityEnum getCardinality() {
    return cardinality;
  }

  public void setCardinality(CardinalityEnum cardinality) {
    this.cardinality = cardinality;
  }

  public AtlasAttributeDef valuesMinCount(Integer valuesMinCount) {
    this.valuesMinCount = valuesMinCount;
    return this;
  }

   /**
   * Get valuesMinCount
   * @return valuesMinCount
  **/
  @Schema(description = "")
  public Integer getValuesMinCount() {
    return valuesMinCount;
  }

  public void setValuesMinCount(Integer valuesMinCount) {
    this.valuesMinCount = valuesMinCount;
  }

  public AtlasAttributeDef valuesMaxCount(Integer valuesMaxCount) {
    this.valuesMaxCount = valuesMaxCount;
    return this;
  }

   /**
   * Get valuesMaxCount
   * @return valuesMaxCount
  **/
  @Schema(description = "")
  public Integer getValuesMaxCount() {
    return valuesMaxCount;
  }

  public void setValuesMaxCount(Integer valuesMaxCount) {
    this.valuesMaxCount = valuesMaxCount;
  }

  public AtlasAttributeDef isUnique(Boolean isUnique) {
    this.isUnique = isUnique;
    return this;
  }

   /**
   * Get isUnique
   * @return isUnique
  **/
  @Schema(description = "")
  public Boolean isIsUnique() {
    return isUnique;
  }

  public void setIsUnique(Boolean isUnique) {
    this.isUnique = isUnique;
  }

  public AtlasAttributeDef isIndexable(Boolean isIndexable) {
    this.isIndexable = isIndexable;
    return this;
  }

   /**
   * Get isIndexable
   * @return isIndexable
  **/
  @Schema(description = "")
  public Boolean isIsIndexable() {
    return isIndexable;
  }

  public void setIsIndexable(Boolean isIndexable) {
    this.isIndexable = isIndexable;
  }

  public AtlasAttributeDef includeInNotification(Boolean includeInNotification) {
    this.includeInNotification = includeInNotification;
    return this;
  }

   /**
   * Get includeInNotification
   * @return includeInNotification
  **/
  @Schema(description = "")
  public Boolean isIncludeInNotification() {
    return includeInNotification;
  }

  public void setIncludeInNotification(Boolean includeInNotification) {
    this.includeInNotification = includeInNotification;
  }

  public AtlasAttributeDef defaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

   /**
   * Get defaultValue
   * @return defaultValue
  **/
  @Schema(description = "")
  public String getDefaultValue() {
    return defaultValue;
  }

  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }

  public AtlasAttributeDef description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AtlasAttributeDef searchWeight(Integer searchWeight) {
    this.searchWeight = searchWeight;
    return this;
  }

   /**
   * Get searchWeight
   * @return searchWeight
  **/
  @Schema(description = "")
  public Integer getSearchWeight() {
    return searchWeight;
  }

  public void setSearchWeight(Integer searchWeight) {
    this.searchWeight = searchWeight;
  }

  public AtlasAttributeDef indexType(IndexTypeEnum indexType) {
    this.indexType = indexType;
    return this;
  }

   /**
   * Get indexType
   * @return indexType
  **/
  @Schema(description = "")
  public IndexTypeEnum getIndexType() {
    return indexType;
  }

  public void setIndexType(IndexTypeEnum indexType) {
    this.indexType = indexType;
  }

  public AtlasAttributeDef constraints(List<AtlasConstraintDef> constraints) {
    this.constraints = constraints;
    return this;
  }

  public AtlasAttributeDef addConstraintsItem(AtlasConstraintDef constraintsItem) {
    if (this.constraints == null) {
      this.constraints = new ArrayList<AtlasConstraintDef>();
    }
    this.constraints.add(constraintsItem);
    return this;
  }

   /**
   * Get constraints
   * @return constraints
  **/
  @Schema(description = "")
  public List<AtlasConstraintDef> getConstraints() {
    return constraints;
  }

  public void setConstraints(List<AtlasConstraintDef> constraints) {
    this.constraints = constraints;
  }

  public AtlasAttributeDef options(Map<String, String> options) {
    this.options = options;
    return this;
  }

  public AtlasAttributeDef putOptionsItem(String key, String optionsItem) {
    if (this.options == null) {
      this.options = new HashMap<String, String>();
    }
    this.options.put(key, optionsItem);
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @Schema(description = "")
  public Map<String, String> getOptions() {
    return options;
  }

  public void setOptions(Map<String, String> options) {
    this.options = options;
  }

  public AtlasAttributeDef displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @Schema(description = "")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AtlasAttributeDef atlasAttributeDef = (AtlasAttributeDef) o;
    return Objects.equals(this.name, atlasAttributeDef.name) &&
        Objects.equals(this.typeName, atlasAttributeDef.typeName) &&
        Objects.equals(this.isOptional, atlasAttributeDef.isOptional) &&
        Objects.equals(this.cardinality, atlasAttributeDef.cardinality) &&
        Objects.equals(this.valuesMinCount, atlasAttributeDef.valuesMinCount) &&
        Objects.equals(this.valuesMaxCount, atlasAttributeDef.valuesMaxCount) &&
        Objects.equals(this.isUnique, atlasAttributeDef.isUnique) &&
        Objects.equals(this.isIndexable, atlasAttributeDef.isIndexable) &&
        Objects.equals(this.includeInNotification, atlasAttributeDef.includeInNotification) &&
        Objects.equals(this.defaultValue, atlasAttributeDef.defaultValue) &&
        Objects.equals(this.description, atlasAttributeDef.description) &&
        Objects.equals(this.searchWeight, atlasAttributeDef.searchWeight) &&
        Objects.equals(this.indexType, atlasAttributeDef.indexType) &&
        Objects.equals(this.constraints, atlasAttributeDef.constraints) &&
        Objects.equals(this.options, atlasAttributeDef.options) &&
        Objects.equals(this.displayName, atlasAttributeDef.displayName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, typeName, isOptional, cardinality, valuesMinCount, valuesMaxCount, isUnique, isIndexable, includeInNotification, defaultValue, description, searchWeight, indexType, constraints, options, displayName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AtlasAttributeDef {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    typeName: ").append(toIndentedString(typeName)).append("\n");
    sb.append("    isOptional: ").append(toIndentedString(isOptional)).append("\n");
    sb.append("    cardinality: ").append(toIndentedString(cardinality)).append("\n");
    sb.append("    valuesMinCount: ").append(toIndentedString(valuesMinCount)).append("\n");
    sb.append("    valuesMaxCount: ").append(toIndentedString(valuesMaxCount)).append("\n");
    sb.append("    isUnique: ").append(toIndentedString(isUnique)).append("\n");
    sb.append("    isIndexable: ").append(toIndentedString(isIndexable)).append("\n");
    sb.append("    includeInNotification: ").append(toIndentedString(includeInNotification)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    searchWeight: ").append(toIndentedString(searchWeight)).append("\n");
    sb.append("    indexType: ").append(toIndentedString(indexType)).append("\n");
    sb.append("    constraints: ").append(toIndentedString(constraints)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}