/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.0.1-alpha.117
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 */




#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct ProjectRevisionThirdPartyLoginProvider {
    #[serde(rename = "apple_private_key", skip_serializing_if = "Option::is_none")]
    pub apple_private_key: Option<Box<crate::models::SqlNullString>>,
    /// Apple Private Key Identifier  Sign In with Apple Private Key Identifier needed for generating a JWT token for client secret
    #[serde(rename = "apple_private_key_id", skip_serializing_if = "Option::is_none")]
    pub apple_private_key_id: Option<String>,
    /// Apple Developer Team ID  Apple Developer Team ID needed for generating a JWT token for client secret
    #[serde(rename = "apple_team_id", skip_serializing_if = "Option::is_none")]
    pub apple_team_id: Option<String>,
    /// AuthURL is the authorize url, typically something like: https://example.org/oauth2/auth Should only be used when the OAuth2 / OpenID Connect server is not supporting OpenID Connect Discovery and when `provider` is set to `generic`.
    #[serde(rename = "auth_url", skip_serializing_if = "Option::is_none")]
    pub auth_url: Option<String>,
    /// Tenant is the Azure AD Tenant to use for authentication, and must be set when `provider` is set to `microsoft`.  Can be either `common`, `organizations`, `consumers` for a multitenant application or a specific tenant like `8eaef023-2b34-4da1-9baa-8bc8c9d6a490` or `contoso.onmicrosoft.com`.
    #[serde(rename = "azure_tenant", skip_serializing_if = "Option::is_none")]
    pub azure_tenant: Option<String>,
    /// ClientID is the application's Client ID.
    #[serde(rename = "client_id", skip_serializing_if = "Option::is_none")]
    pub client_id: Option<String>,
    #[serde(rename = "client_secret", skip_serializing_if = "Option::is_none")]
    pub client_secret: Option<Box<crate::models::SqlNullString>>,
    /// The Project's Revision Creation Date
    #[serde(rename = "created_at", skip_serializing_if = "Option::is_none")]
    pub created_at: Option<String>,
    #[serde(rename = "id", skip_serializing_if = "Option::is_none")]
    pub id: Option<String>,
    /// IssuerURL is the OpenID Connect Server URL. You can leave this empty if `provider` is not set to `generic`. If set, neither `auth_url` nor `token_url` are required.
    #[serde(rename = "issuer_url", skip_serializing_if = "Option::is_none")]
    pub issuer_url: Option<String>,
    /// Label represents an optional label which can be used in the UI generation.
    #[serde(rename = "label", skip_serializing_if = "Option::is_none")]
    pub label: Option<String>,
    /// Mapper specifies the JSONNet code snippet which uses the OpenID Connect Provider's data (e.g. GitHub or Google profile information) to hydrate the identity's data.  It can be either a URL (file://, http(s)://, base64://) or an inline JSONNet code snippet.
    #[serde(rename = "mapper_url", skip_serializing_if = "Option::is_none")]
    pub mapper_url: Option<String>,
    #[serde(rename = "project_revision_id", skip_serializing_if = "Option::is_none")]
    pub project_revision_id: Option<String>,
    /// Provider is either \"generic\" for a generic OAuth 2.0 / OpenID Connect Provider or one of: generic google github gitlab microsoft discord slack facebook vk yandex apple
    #[serde(rename = "provider", skip_serializing_if = "Option::is_none")]
    pub provider: Option<String>,
    /// ID is the provider's ID
    #[serde(rename = "provider_id", skip_serializing_if = "Option::is_none")]
    pub provider_id: Option<String>,
    #[serde(rename = "requested_claims", skip_serializing_if = "Option::is_none")]
    pub requested_claims: Option<serde_json::Value>,
    #[serde(rename = "scope", skip_serializing_if = "Option::is_none")]
    pub scope: Option<Vec<String>>,
    /// TokenURL is the token url, typically something like: https://example.org/oauth2/token  Should only be used when the OAuth2 / OpenID Connect server is not supporting OpenID Connect Discovery and when `provider` is set to `generic`.
    #[serde(rename = "token_url", skip_serializing_if = "Option::is_none")]
    pub token_url: Option<String>,
    /// Last Time Project's Revision was Updated
    #[serde(rename = "updated_at", skip_serializing_if = "Option::is_none")]
    pub updated_at: Option<String>,
}

impl ProjectRevisionThirdPartyLoginProvider {
    pub fn new() -> ProjectRevisionThirdPartyLoginProvider {
        ProjectRevisionThirdPartyLoginProvider {
            apple_private_key: None,
            apple_private_key_id: None,
            apple_team_id: None,
            auth_url: None,
            azure_tenant: None,
            client_id: None,
            client_secret: None,
            created_at: None,
            id: None,
            issuer_url: None,
            label: None,
            mapper_url: None,
            project_revision_id: None,
            provider: None,
            provider_id: None,
            requested_claims: None,
            scope: None,
            token_url: None,
            updated_at: None,
        }
    }
}


