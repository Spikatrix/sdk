/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.1.3
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 */

/// ProjectBranding : The Project Branding



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct ProjectBranding {
    /// The Customization Creation Date
    #[serde(rename = "created_at")]
    pub created_at: String,
    #[serde(rename = "default_theme")]
    pub default_theme: Box<crate::models::ProjectBrandingTheme>,
    /// The customization ID.
    #[serde(rename = "id")]
    pub id: String,
    /// The Project's ID this customization is associated with
    #[serde(rename = "project_id")]
    pub project_id: String,
    /// The Project Branding Themes
    #[serde(rename = "themes")]
    pub themes: Vec<crate::models::ProjectBrandingTheme>,
    /// Last Time Branding was Updated
    #[serde(rename = "updated_at")]
    pub updated_at: String,
}


impl ProjectBranding {
    /// The Project Branding
    pub fn new(created_at: String, default_theme: crate::models::ProjectBrandingTheme, id: String, project_id: String, themes: Vec<crate::models::ProjectBrandingTheme>, updated_at: String) -> ProjectBranding {
        ProjectBranding {
                created_at,
                default_theme: Box::new(default_theme),
                id,
                project_id,
                themes,
                updated_at,
        }
    }
}


