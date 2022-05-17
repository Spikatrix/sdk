/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.0.1-alpha.177
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 */

/// JsonPatch : JSON Patch allows you to target individual keys in a JSON document for updates.  For more examples see: https://jsonpatch.com



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct JsonPatch {
    /// The JSON Patch operation
    #[serde(rename = "op")]
    pub op: Op,
    /// The JSON Pointer to the target key
    #[serde(rename = "path")]
    pub path: String,
    /// The value to be used. Only available for `add` and `replace` operations.
    #[serde(rename = "value", skip_serializing_if = "Option::is_none")]
    pub value: Option<serde_json::Value>,
}

impl JsonPatch {
    /// JSON Patch allows you to target individual keys in a JSON document for updates.  For more examples see: https://jsonpatch.com
    pub fn new(op: Op, path: String) -> JsonPatch {
        JsonPatch {
            op,
            path,
            value: None,
        }
    }
}

/// The JSON Patch operation
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum Op {
    #[serde(rename = "add")]
    Add,
    #[serde(rename = "remove")]
    Remove,
    #[serde(rename = "replace")]
    Replace,
    #[serde(rename = "move")]
    _Move,
    #[serde(rename = "copy")]
    Copy,
    #[serde(rename = "test")]
    Test,
}

