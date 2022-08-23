/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.2.0-alpha.15
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 */

/// UiNodeInputAttributes : InputAttributes represents the attributes of an input node



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct UiNodeInputAttributes {
    /// The autocomplete attribute for the input.
    #[serde(rename = "autocomplete", skip_serializing_if = "Option::is_none")]
    pub autocomplete: Option<String>,
    /// Sets the input's disabled field to true or false.
    #[serde(rename = "disabled")]
    pub disabled: bool,
    #[serde(rename = "label", skip_serializing_if = "Option::is_none")]
    pub label: Option<Box<crate::models::UiText>>,
    /// The input's element name.
    #[serde(rename = "name")]
    pub name: String,
    /// NodeType represents this node's types. It is a mirror of `node.type` and is primarily used to allow compatibility with OpenAPI 3.0.  In this struct it technically always is \"input\".
    #[serde(rename = "node_type")]
    pub node_type: String,
    /// OnClick may contain javascript which should be executed on click. This is primarily used for WebAuthn.
    #[serde(rename = "onclick", skip_serializing_if = "Option::is_none")]
    pub onclick: Option<String>,
    /// The input's pattern.
    #[serde(rename = "pattern", skip_serializing_if = "Option::is_none")]
    pub pattern: Option<String>,
    /// Mark this input field as required.
    #[serde(rename = "required", skip_serializing_if = "Option::is_none")]
    pub required: Option<bool>,
    /// The input's element type.
    #[serde(rename = "type")]
    pub _type: TypeEnum,
    /// The input's value.
    #[serde(rename = "value", skip_serializing_if = "Option::is_none")]
    pub value: Option<serde_json::Value>,
}


impl UiNodeInputAttributes {
    /// InputAttributes represents the attributes of an input node
    pub fn new(disabled: bool, name: String, node_type: String, _type: TypeEnum) -> UiNodeInputAttributes {
        UiNodeInputAttributes {
                autocomplete: None,
                disabled,
                label: None,
                name,
                node_type,
                onclick: None,
                pattern: None,
                required: None,
                _type,
                value: None,
        }
    }
}

/// The input's element type.
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum TypeEnum {
    #[serde(rename = "text")]
    Text,
    #[serde(rename = "password")]
    Password,
    #[serde(rename = "number")]
    Number,
    #[serde(rename = "checkbox")]
    Checkbox,
    #[serde(rename = "hidden")]
    Hidden,
    #[serde(rename = "email")]
    Email,
    #[serde(rename = "tel")]
    Tel,
    #[serde(rename = "submit")]
    Submit,
    #[serde(rename = "button")]
    Button,
    #[serde(rename = "datetime-local")]
    DatetimeLocal,
    #[serde(rename = "date")]
    Date,
    #[serde(rename = "url")]
    Url,
}

