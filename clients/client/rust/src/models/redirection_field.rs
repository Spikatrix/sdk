/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.0.1-alpha.41
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 */




#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct RedirectionField {
    #[serde(rename = "main", skip_serializing_if = "Option::is_none")]
    pub main: Option<String>,
    #[serde(rename = "oidc", skip_serializing_if = "Option::is_none")]
    pub oidc: Option<String>,
    #[serde(rename = "password", skip_serializing_if = "Option::is_none")]
    pub password: Option<String>,
    #[serde(rename = "profile", skip_serializing_if = "Option::is_none")]
    pub profile: Option<String>,
}

impl RedirectionField {
    pub fn new() -> RedirectionField {
        RedirectionField {
            main: None,
            oidc: None,
            password: None,
            profile: None,
        }
    }
}


