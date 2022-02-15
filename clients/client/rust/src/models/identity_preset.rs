/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.0.1-alpha.95
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 */




#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct IdentityPreset {
    /// Schema is the Identity JSON Schema
    #[serde(rename = "schema")]
    pub schema: serde_json::Value,
    /// URL is the preset identifier
    #[serde(rename = "url")]
    pub url: String,
}

impl IdentityPreset {
    pub fn new(schema: serde_json::Value, url: String) -> IdentityPreset {
        IdentityPreset {
            schema,
            url,
        }
    }
}


