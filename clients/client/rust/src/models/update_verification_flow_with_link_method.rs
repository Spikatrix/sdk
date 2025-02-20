/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.1.3
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 */

/// UpdateVerificationFlowWithLinkMethod : Update Verification Flow with Link Method



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct UpdateVerificationFlowWithLinkMethod {
    /// Sending the anti-csrf token is only required for browser login flows.
    #[serde(rename = "csrf_token", skip_serializing_if = "Option::is_none")]
    pub csrf_token: Option<String>,
    /// Email to Verify  Needs to be set when initiating the flow. If the email is a registered verification email, a verification link will be sent. If the email is not known, a email with details on what happened will be sent instead.  format: email
    #[serde(rename = "email")]
    pub email: String,
    /// Method supports `link` only right now.
    #[serde(rename = "method")]
    pub method: String,
}


impl UpdateVerificationFlowWithLinkMethod {
    /// Update Verification Flow with Link Method
    pub fn new(email: String, method: String) -> UpdateVerificationFlowWithLinkMethod {
        UpdateVerificationFlowWithLinkMethod {
                csrf_token: None,
                email,
                method,
        }
    }
}


