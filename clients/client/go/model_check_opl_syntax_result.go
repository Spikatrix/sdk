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

// CheckOplSyntaxResult struct for CheckOplSyntaxResult
type CheckOplSyntaxResult struct {
	// The list of syntax errors
	Errors []ParseError `json:"errors,omitempty"`
}

// NewCheckOplSyntaxResult instantiates a new CheckOplSyntaxResult object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCheckOplSyntaxResult() *CheckOplSyntaxResult {
	this := CheckOplSyntaxResult{}
	return &this
}

// NewCheckOplSyntaxResultWithDefaults instantiates a new CheckOplSyntaxResult object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCheckOplSyntaxResultWithDefaults() *CheckOplSyntaxResult {
	this := CheckOplSyntaxResult{}
	return &this
}

// GetErrors returns the Errors field value if set, zero value otherwise.
func (o *CheckOplSyntaxResult) GetErrors() []ParseError {
	if o == nil || o.Errors == nil {
		var ret []ParseError
		return ret
	}
	return o.Errors
}

// GetErrorsOk returns a tuple with the Errors field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CheckOplSyntaxResult) GetErrorsOk() ([]ParseError, bool) {
	if o == nil || o.Errors == nil {
		return nil, false
	}
	return o.Errors, true
}

// HasErrors returns a boolean if a field has been set.
func (o *CheckOplSyntaxResult) HasErrors() bool {
	if o != nil && o.Errors != nil {
		return true
	}

	return false
}

// SetErrors gets a reference to the given []ParseError and assigns it to the Errors field.
func (o *CheckOplSyntaxResult) SetErrors(v []ParseError) {
	o.Errors = v
}

func (o CheckOplSyntaxResult) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Errors != nil {
		toSerialize["errors"] = o.Errors
	}
	return json.Marshal(toSerialize)
}

type NullableCheckOplSyntaxResult struct {
	value *CheckOplSyntaxResult
	isSet bool
}

func (v NullableCheckOplSyntaxResult) Get() *CheckOplSyntaxResult {
	return v.value
}

func (v *NullableCheckOplSyntaxResult) Set(val *CheckOplSyntaxResult) {
	v.value = val
	v.isSet = true
}

func (v NullableCheckOplSyntaxResult) IsSet() bool {
	return v.isSet
}

func (v *NullableCheckOplSyntaxResult) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCheckOplSyntaxResult(val *CheckOplSyntaxResult) *NullableCheckOplSyntaxResult {
	return &NullableCheckOplSyntaxResult{value: val, isSet: true}
}

func (v NullableCheckOplSyntaxResult) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCheckOplSyntaxResult) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


