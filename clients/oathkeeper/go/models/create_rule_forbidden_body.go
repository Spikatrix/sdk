// Code generated by go-swagger; DO NOT EDIT.

package models

// This file was generated by the swagger tool.
// Editing this file might prove futile when you re-run the swagger generate command

import (
	"context"

	"github.com/go-openapi/strfmt"
	"github.com/go-openapi/swag"
)

// CreateRuleForbiddenBody CreateRuleForbiddenBody CreateRuleForbiddenBody CreateRuleForbiddenBody CreateRuleForbiddenBody CreateRuleForbiddenBody CreateRuleForbiddenBody CreateRuleForbiddenBody create rule forbidden body
//
// swagger:model CreateRuleForbiddenBody
type CreateRuleForbiddenBody struct {

	// code
	Code int64 `json:"code,omitempty"`

	// details
	Details []interface{} `json:"details"`

	// message
	Message string `json:"message,omitempty"`

	// reason
	Reason string `json:"reason,omitempty"`

	// request
	Request string `json:"request,omitempty"`

	// status
	Status string `json:"status,omitempty"`
}

// Validate validates this create rule forbidden body
func (m *CreateRuleForbiddenBody) Validate(formats strfmt.Registry) error {
	return nil
}

// ContextValidate validates this create rule forbidden body based on context it is used
func (m *CreateRuleForbiddenBody) ContextValidate(ctx context.Context, formats strfmt.Registry) error {
	return nil
}

// MarshalBinary interface implementation
func (m *CreateRuleForbiddenBody) MarshalBinary() ([]byte, error) {
	if m == nil {
		return nil, nil
	}
	return swag.WriteJSON(m)
}

// UnmarshalBinary interface implementation
func (m *CreateRuleForbiddenBody) UnmarshalBinary(b []byte) error {
	var res CreateRuleForbiddenBody
	if err := swag.ReadJSON(b, &res); err != nil {
		return err
	}
	*m = res
	return nil
}
