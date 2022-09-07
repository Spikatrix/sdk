/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.2.0-alpha.32
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 */




#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct UpdateSubscriptionPayload {
    #[serde(rename = "plan_or_price")]
    pub plan_or_price: String,
    #[serde(rename = "return_to", skip_serializing_if = "Option::is_none")]
    pub return_to: Option<String>,
}


impl UpdateSubscriptionPayload {
    pub fn new(plan_or_price: String) -> UpdateSubscriptionPayload {
        UpdateSubscriptionPayload {
                plan_or_price,
                return_to: None,
        }
    }
}


