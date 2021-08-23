// Code generated by go-swagger; DO NOT EDIT.

package models

// This file was generated by the swagger tool.
// Editing this file might prove futile when you re-run the swagger generate command

import (
	"context"
	"strconv"

	"github.com/go-openapi/errors"
	"github.com/go-openapi/strfmt"
	"github.com/go-openapi/swag"
)

// ListRulesOK ListRulesOK ListRulesOK handles this case with default header values.
//
// A list of rules
//
// swagger:model ListRulesOK
type ListRulesOK struct {

	// payload
	Payload []*SwaggerRule `json:"Payload"`
}

// Validate validates this list rules o k
func (m *ListRulesOK) Validate(formats strfmt.Registry) error {
	var res []error

	if err := m.validatePayload(formats); err != nil {
		res = append(res, err)
	}

	if len(res) > 0 {
		return errors.CompositeValidationError(res...)
	}
	return nil
}

func (m *ListRulesOK) validatePayload(formats strfmt.Registry) error {
	if swag.IsZero(m.Payload) { // not required
		return nil
	}

	for i := 0; i < len(m.Payload); i++ {
		if swag.IsZero(m.Payload[i]) { // not required
			continue
		}

		if m.Payload[i] != nil {
			if err := m.Payload[i].Validate(formats); err != nil {
				if ve, ok := err.(*errors.Validation); ok {
					return ve.ValidateName("Payload" + "." + strconv.Itoa(i))
				}
				return err
			}
		}

	}

	return nil
}

// ContextValidate validate this list rules o k based on the context it is used
func (m *ListRulesOK) ContextValidate(ctx context.Context, formats strfmt.Registry) error {
	var res []error

	if err := m.contextValidatePayload(ctx, formats); err != nil {
		res = append(res, err)
	}

	if len(res) > 0 {
		return errors.CompositeValidationError(res...)
	}
	return nil
}

func (m *ListRulesOK) contextValidatePayload(ctx context.Context, formats strfmt.Registry) error {

	for i := 0; i < len(m.Payload); i++ {

		if m.Payload[i] != nil {
			if err := m.Payload[i].ContextValidate(ctx, formats); err != nil {
				if ve, ok := err.(*errors.Validation); ok {
					return ve.ValidateName("Payload" + "." + strconv.Itoa(i))
				}
				return err
			}
		}

	}

	return nil
}

// MarshalBinary interface implementation
func (m *ListRulesOK) MarshalBinary() ([]byte, error) {
	if m == nil {
		return nil, nil
	}
	return swag.WriteJSON(m)
}

// UnmarshalBinary interface implementation
func (m *ListRulesOK) UnmarshalBinary(b []byte) error {
	var res ListRulesOK
	if err := swag.ReadJSON(b, &res); err != nil {
		return err
	}
	*m = res
	return nil
}
