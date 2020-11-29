
package com.hsbc.hbau.digital.refdata.decorator.audigitalrefdatadecoratoreapi.model;

import java.util.HashMap;
import java.util.List;
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
    "profiles",
    "label",
    "version",
    "state",
    "propertySources"
})
@Data
public class ReferenceData {

    @JsonProperty("name")
    private String name;
    @JsonProperty("profiles")
    private List<String> profiles = null;
    @JsonProperty("label")
    private Object label;
    @JsonProperty("version")
    private Object version;
    @JsonProperty("state")
    private Object state;
    @JsonProperty("propertySources")
    private List<PropertySource> propertySources = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
}
