/*
 * Ory Identities API
 *
 * This is the API specification for Ory Identities with features such as registration, login, recovery, account verification, profile settings, password reset, identity management, session management, email and sms delivery, and more. 
 *
 * The version of the OpenAPI document: v0.11.0
 * Contact: office@ory.sh
 * Generated by: https://openapi-generator.tech
 */

/// UpdateLoginFlowWithTotpMethod : Update Login Flow with TOTP Method



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct UpdateLoginFlowWithTotpMethod {
    /// Sending the anti-csrf token is only required for browser login flows.
    #[serde(rename = "csrf_token", skip_serializing_if = "Option::is_none")]
    pub csrf_token: Option<String>,
    /// Method should be set to \"totp\" when logging in using the TOTP strategy.
    #[serde(rename = "method")]
    pub method: String,
    /// The TOTP code.
    #[serde(rename = "totp_code")]
    pub totp_code: String,
}


impl UpdateLoginFlowWithTotpMethod {
    /// Update Login Flow with TOTP Method
    pub fn new(method: String, totp_code: String) -> UpdateLoginFlowWithTotpMethod {
        UpdateLoginFlowWithTotpMethod {
                csrf_token: None,
                method,
                totp_code,
        }
    }
}


