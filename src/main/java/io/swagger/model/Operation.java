package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Operation
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-28T08:27:01.906Z")

public class Operation   {
  @JsonProperty("date")
  private OffsetDateTime date = null;

  @JsonProperty("montant")
  private Long montant = null;

  @JsonProperty("libellé")
  private String libell = null;

  @JsonProperty("id")
  private String id = null;

  public Operation date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public Operation montant(Long montant) {
    this.montant = montant;
    return this;
  }

  /**
   * Get montant
   * @return montant
  **/
  @ApiModelProperty(value = "")


  public Long getMontant() {
    return montant;
  }

  public void setMontant(Long montant) {
    this.montant = montant;
  }

  public Operation libell(String libell) {
    this.libell = libell;
    return this;
  }

  /**
   * Get libell
   * @return libell
  **/
  @ApiModelProperty(value = "")


  public String getLibell() {
    return libell;
  }

  public void setLibell(String libell) {
    this.libell = libell;
  }

  public Operation id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Operation operation = (Operation) o;
    return Objects.equals(this.date, operation.date) &&
        Objects.equals(this.montant, operation.montant) &&
        Objects.equals(this.libell, operation.libell) &&
        Objects.equals(this.id, operation.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, montant, libell, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Operation {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    montant: ").append(toIndentedString(montant)).append("\n");
    sb.append("    libell: ").append(toIndentedString(libell)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

