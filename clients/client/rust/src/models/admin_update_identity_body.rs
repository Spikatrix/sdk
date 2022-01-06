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
pub struct AdminUpdateIdentityBody {
    /// SchemaID is the ID of the JSON Schema to be used for validating the identity's traits. If set will update the Identity's SchemaID.
    #[serde(rename = "schema_id", skip_serializing_if = "Option::is_none")]
    pub schema_id: Option<String>,
    #[serde(rename = "state")]
    pub state: crate::models::IdentityState,
    /// Traits represent an identity's traits. The identity is able to create, modify, and delete traits in a self-service manner. The input will always be validated against the JSON Schema defined in `schema_id`.
    #[serde(rename = "traits")]
    pub traits: serde_json::Value,
}

impl AdminUpdateIdentityBody {
    pub fn new(state: crate::models::IdentityState, traits: serde_json::Value) -> AdminUpdateIdentityBody {
        AdminUpdateIdentityBody {
            schema_id: None,
            state,
            traits,
        }
    }
}


