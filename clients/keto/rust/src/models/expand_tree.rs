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
pub struct ExpandTree {
    /// The children of the node, possibly none.
    #[serde(rename = "children", skip_serializing_if = "Option::is_none")]
    pub children: Option<Vec<crate::models::ExpandTree>>,
    #[serde(rename = "tuple", skip_serializing_if = "Option::is_none")]
    pub tuple: Option<Box<crate::models::RelationTuple>>,
    /// The type of the node. union TreeNodeUnion exclusion TreeNodeExclusion intersection TreeNodeIntersection leaf TreeNodeLeaf tuple_to_subject_set TreeNodeTupleToSubjectSet computed_subject_set TreeNodeComputedSubjectSet not TreeNodeNot unspecified TreeNodeUnspecified
    #[serde(rename = "type")]
    pub _type: TypeEnum,
}


impl ExpandTree {
    pub fn new(_type: TypeEnum) -> ExpandTree {
        ExpandTree {
                children: None,
                tuple: None,
                _type,
        }
    }
}

/// The type of the node. union TreeNodeUnion exclusion TreeNodeExclusion intersection TreeNodeIntersection leaf TreeNodeLeaf tuple_to_subject_set TreeNodeTupleToSubjectSet computed_subject_set TreeNodeComputedSubjectSet not TreeNodeNot unspecified TreeNodeUnspecified
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum TypeEnum {
    #[serde(rename = "union")]
    Union,
    #[serde(rename = "exclusion")]
    Exclusion,
    #[serde(rename = "intersection")]
    Intersection,
    #[serde(rename = "leaf")]
    Leaf,
    #[serde(rename = "tuple_to_subject_set")]
    TupleToSubjectSet,
    #[serde(rename = "computed_subject_set")]
    ComputedSubjectSet,
    #[serde(rename = "not")]
    Not,
    #[serde(rename = "unspecified")]
    Unspecified,
}

