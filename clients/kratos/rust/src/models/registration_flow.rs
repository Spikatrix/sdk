/*
 * Ory Identities API
 *
 * This is the API specification for Ory Identities with features such as registration, login, recovery, account verification, profile settings, password reset, identity management, session management, email and sms delivery, and more. 
 *
 * The version of the OpenAPI document: v0.11.0
 * Contact: office@ory.sh
 * Generated by: https://openapi-generator.tech
 */




#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct RegistrationFlow {
    #[serde(rename = "active", skip_serializing_if = "Option::is_none")]
    pub active: Option<crate::models::IdentityCredentialsType>,
    /// ExpiresAt is the time (UTC) when the flow expires. If the user still wishes to log in, a new flow has to be initiated.
    #[serde(rename = "expires_at")]
    pub expires_at: String,
    /// ID represents the flow's unique ID. When performing the registration flow, this represents the id in the registration ui's query parameter: http://<selfservice.flows.registration.ui_url>/?flow=<id>
    #[serde(rename = "id")]
    pub id: String,
    /// IssuedAt is the time (UTC) when the flow occurred.
    #[serde(rename = "issued_at")]
    pub issued_at: String,
    #[serde(rename = "oauth2_login_challenge", skip_serializing_if = "Option::is_none")]
    pub oauth2_login_challenge: Option<String>,
    #[serde(rename = "oauth2_login_request", skip_serializing_if = "Option::is_none")]
    pub oauth2_login_request: Option<Box<crate::models::OAuth2LoginRequest>>,
    /// RequestURL is the initial URL that was requested from Ory Kratos. It can be used to forward information contained in the URL's path or query for example.
    #[serde(rename = "request_url")]
    pub request_url: String,
    /// ReturnTo contains the requested return_to URL.
    #[serde(rename = "return_to", skip_serializing_if = "Option::is_none")]
    pub return_to: Option<String>,
    /// The flow type can either be `api` or `browser`.
    #[serde(rename = "type")]
    pub _type: String,
    #[serde(rename = "ui")]
    pub ui: Box<crate::models::UiContainer>,
}


impl RegistrationFlow {
    pub fn new(expires_at: String, id: String, issued_at: String, request_url: String, _type: String, ui: crate::models::UiContainer) -> RegistrationFlow {
        RegistrationFlow {
                active: None,
                expires_at,
                id,
                issued_at,
                oauth2_login_challenge: None,
                oauth2_login_request: None,
                request_url,
                return_to: None,
                _type,
                ui: Box::new(ui),
        }
    }
}


