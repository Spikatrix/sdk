/*
 * Ory Identities API
 *
 * This is the API specification for Ory Identities with features such as registration, login, recovery, account verification, profile settings, password reset, identity management, session management, email and sms delivery, and more. 
 *
 * The version of the OpenAPI document: v0.11.0
 * Contact: office@ory.sh
 * Generated by: https://openapi-generator.tech
 */

/// UpdateRegistrationFlowBody : Update Registration Request Body


#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
#[serde(tag = "method")]
pub enum UpdateRegistrationFlowBody {
    #[serde(rename="oidc")]
    UpdateRegistrationFlowWithOidcMethod {
        /// The CSRF Token
        #[serde(rename = "csrf_token", skip_serializing_if = "Option::is_none")]
        // false, false, , String, false
        csrf_token: Option<String>,
        /// The provider to register with
        #[serde(rename = "provider")]
        // true, false, , String, false
        provider: String,
        /// The identity traits
        #[serde(rename = "traits", skip_serializing_if = "Option::is_none")]
        // false, false, , serde_json::Value, false
        traits: Option<serde_json::Value>,
    },
    #[serde(rename="password")]
    UpdateRegistrationFlowWithPasswordMethod {
        /// The CSRF Token
        #[serde(rename = "csrf_token", skip_serializing_if = "Option::is_none")]
        // false, false, , String, false
        csrf_token: Option<String>,
        /// Password to sign the user up with
        #[serde(rename = "password")]
        // true, false, , String, false
        password: String,
        /// The identity's traits
        #[serde(rename = "traits")]
        // true, false, , serde_json::Value, false
        traits: serde_json::Value,
    },
    #[serde(rename="webauthn")]
    UpdateRegistrationFlowWithWebAuthnMethod {
        /// CSRFToken is the anti-CSRF token
        #[serde(rename = "csrf_token", skip_serializing_if = "Option::is_none")]
        // false, false, , String, false
        csrf_token: Option<String>,
        /// The identity's traits
        #[serde(rename = "traits")]
        // true, false, , serde_json::Value, false
        traits: serde_json::Value,
        /// Register a WebAuthn Security Key  It is expected that the JSON returned by the WebAuthn registration process is included here.
        #[serde(rename = "webauthn_register", skip_serializing_if = "Option::is_none")]
        // false, false, , String, false
        webauthn_register: Option<String>,
        /// Name of the WebAuthn Security Key to be Added  A human-readable name for the security key which will be added.
        #[serde(rename = "webauthn_register_displayname", skip_serializing_if = "Option::is_none")]
        // false, false, , String, false
        webauthn_register_displayname: Option<String>,
    },
}





