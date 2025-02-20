/*
 * Ory Identities API
 *
 * This is the API specification for Ory Identities with features such as registration, login, recovery, account verification, profile settings, password reset, identity management, session management, email and sms delivery, and more. 
 *
 * The version of the OpenAPI document: v0.11.0
 * Contact: office@ory.sh
 * Generated by: https://openapi-generator.tech
 */

/// DeleteMySessionsCount : Deleted Session Count



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct DeleteMySessionsCount {
    /// The number of sessions that were revoked.
    #[serde(rename = "count", skip_serializing_if = "Option::is_none")]
    pub count: Option<i64>,
}

impl Default for DeleteMySessionsCount {
    fn default() -> Self {
        Self::new()
    }
}

impl DeleteMySessionsCount {
    /// Deleted Session Count
    pub fn new() -> DeleteMySessionsCount {
        DeleteMySessionsCount {
                count: None,
        }
    }
}


