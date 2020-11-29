
package com.hsbc.hbau.digital.refdata.decorator.audigitalrefdatadecoratoreapi.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "source"
})
@Data
public class PropertySource {

    @JsonProperty("name")
    private String name;
    @JsonProperty("source")
    private Source source;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
}
