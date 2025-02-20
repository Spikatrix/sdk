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

// DeleteMySessionsCount Deleted Session Count
type DeleteMySessionsCount struct {
	// The number of sessions that were revoked.
	Count *int64 `json:"count,omitempty"`
}

// NewDeleteMySessionsCount instantiates a new DeleteMySessionsCount object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewDeleteMySessionsCount() *DeleteMySessionsCount {
	this := DeleteMySessionsCount{}
	return &this
}

// NewDeleteMySessionsCountWithDefaults instantiates a new DeleteMySessionsCount object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewDeleteMySessionsCountWithDefaults() *DeleteMySessionsCount {
	this := DeleteMySessionsCount{}
	return &this
}

// GetCount returns the Count field value if set, zero value otherwise.
func (o *DeleteMySessionsCount) GetCount() int64 {
	if o == nil || o.Count == nil {
		var ret int64
		return ret
	}
	return *o.Count
}

// GetCountOk returns a tuple with the Count field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *DeleteMySessionsCount) GetCountOk() (*int64, bool) {
	if o == nil || o.Count == nil {
		return nil, false
	}
	return o.Count, true
}

// HasCount returns a boolean if a field has been set.
func (o *DeleteMySessionsCount) HasCount() bool {
	if o != nil && o.Count != nil {
		return true
	}

	return false
}

// SetCount gets a reference to the given int64 and assigns it to the Count field.
func (o *DeleteMySessionsCount) SetCount(v int64) {
	o.Count = &v
}

func (o DeleteMySessionsCount) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Count != nil {
		toSerialize["count"] = o.Count
	}
	return json.Marshal(toSerialize)
}

type NullableDeleteMySessionsCount struct {
	value *DeleteMySessionsCount
	isSet bool
}

func (v NullableDeleteMySessionsCount) Get() *DeleteMySessionsCount {
	return v.value
}

func (v *NullableDeleteMySessionsCount) Set(val *DeleteMySessionsCount) {
	v.value = val
	v.isSet = true
}

func (v NullableDeleteMySessionsCount) IsSet() bool {
	return v.isSet
}

func (v *NullableDeleteMySessionsCount) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableDeleteMySessionsCount(val *DeleteMySessionsCount) *NullableDeleteMySessionsCount {
	return &NullableDeleteMySessionsCount{value: val, isSet: true}
}

func (v NullableDeleteMySessionsCount) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableDeleteMySessionsCount) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


