/*
 * Ory Keto API
 *
 * Documentation for all of Ory Keto's REST APIs. gRPC is documented separately. 
 *
 * The version of the OpenAPI document: v0.10.0-alpha.0
 * Contact: hi@ory.sh
 * Generated by: https://openapi-generator.tech
 */




#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct IsReady503Response {
    /// Errors contains a list of errors that caused the not ready status.
    #[serde(rename = "errors")]
    pub errors: ::std::collections::HashMap<String, String>,
}


impl IsReady503Response {
    pub fn new(errors: ::std::collections::HashMap<String, String>) -> IsReady503Response {
        IsReady503Response {
                errors,
        }
    }
}


