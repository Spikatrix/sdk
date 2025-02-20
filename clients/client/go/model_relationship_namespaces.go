/*
Ory APIs

Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 

API version: v1.1.3
Contact: support@ory.sh
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"encoding/json"
)

// RelationshipNamespaces Relationship Namespace List
type RelationshipNamespaces struct {
	Namespaces []Namespace `json:"namespaces,omitempty"`
}

// NewRelationshipNamespaces instantiates a new RelationshipNamespaces object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewRelationshipNamespaces() *RelationshipNamespaces {
	this := RelationshipNamespaces{}
	return &this
}

// NewRelationshipNamespacesWithDefaults instantiates a new RelationshipNamespaces object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewRelationshipNamespacesWithDefaults() *RelationshipNamespaces {
	this := RelationshipNamespaces{}
	return &this
}

// GetNamespaces returns the Namespaces field value if set, zero value otherwise.
func (o *RelationshipNamespaces) GetNamespaces() []Namespace {
	if o == nil || o.Namespaces == nil {
		var ret []Namespace
		return ret
	}
	return o.Namespaces
}

// GetNamespacesOk returns a tuple with the Namespaces field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RelationshipNamespaces) GetNamespacesOk() ([]Namespace, bool) {
	if o == nil || o.Namespaces == nil {
		return nil, false
	}
	return o.Namespaces, true
}

// HasNamespaces returns a boolean if a field has been set.
func (o *RelationshipNamespaces) HasNamespaces() bool {
	if o != nil && o.Namespaces != nil {
		return true
	}

	return false
}

// SetNamespaces gets a reference to the given []Namespace and assigns it to the Namespaces field.
func (o *RelationshipNamespaces) SetNamespaces(v []Namespace) {
	o.Namespaces = v
}

func (o RelationshipNamespaces) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Namespaces != nil {
		toSerialize["namespaces"] = o.Namespaces
	}
	return json.Marshal(toSerialize)
}

type NullableRelationshipNamespaces struct {
	value *RelationshipNamespaces
	isSet bool
}

func (v NullableRelationshipNamespaces) Get() *RelationshipNamespaces {
	return v.value
}

func (v *NullableRelationshipNamespaces) Set(val *RelationshipNamespaces) {
	v.value = val
	v.isSet = true
}

func (v NullableRelationshipNamespaces) IsSet() bool {
	return v.isSet
}

func (v *NullableRelationshipNamespaces) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableRelationshipNamespaces(val *RelationshipNamespaces) *NullableRelationshipNamespaces {
	return &NullableRelationshipNamespaces{value: val, isSet: true}
}

func (v NullableRelationshipNamespaces) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableRelationshipNamespaces) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


