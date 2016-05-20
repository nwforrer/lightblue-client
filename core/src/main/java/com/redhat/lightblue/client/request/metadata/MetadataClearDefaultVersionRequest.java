package com.redhat.lightblue.client.request.metadata;

import com.fasterxml.jackson.databind.JsonNode;
import com.redhat.lightblue.client.http.HttpMethod;
import com.redhat.lightblue.client.request.AbstractLightblueMetadataRequest;

/**
 * DELETE /metadata/{entityName}/default
 */
public class MetadataClearDefaultVersionRequest extends AbstractLightblueMetadataRequest {

    public MetadataClearDefaultVersionRequest(String entityName) {
        super(HttpMethod.DELETE, "default", entityName);
    }
}
