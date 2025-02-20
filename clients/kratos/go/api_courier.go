/*
Ory Identities API

This is the API specification for Ory Identities with features such as registration, login, recovery, account verification, profile settings, password reset, identity management, session management, email and sms delivery, and more. 

API version: v0.11.0
Contact: office@ory.sh
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"bytes"
	"context"
	"io/ioutil"
	"net/http"
	"net/url"
)


type CourierApi interface {

	/*
	ListCourierMessages List Messages

	Lists all messages by given status and recipient.

	@param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
	@return CourierApiListCourierMessagesRequest
	*/
	ListCourierMessages(ctx context.Context) CourierApiListCourierMessagesRequest

	// ListCourierMessagesExecute executes the request
	//  @return []Message
	ListCourierMessagesExecute(r CourierApiListCourierMessagesRequest) ([]Message, *http.Response, error)
}

// CourierApiService CourierApi service
type CourierApiService service

type CourierApiListCourierMessagesRequest struct {
	ctx context.Context
	ApiService CourierApi
	perPage *int64
	page *int64
	status *CourierMessageStatus
	recipient *string
}

// Items per Page  This is the number of items per page.
func (r CourierApiListCourierMessagesRequest) PerPage(perPage int64) CourierApiListCourierMessagesRequest {
	r.perPage = &perPage
	return r
}

// Pagination Page  This value is currently an integer, but it is not sequential. The value is not the page number, but a reference. The next page can be any number and some numbers might return an empty list.  For example, page 2 might not follow after page 1. And even if page 3 and 5 exist, but page 4 might not exist.
func (r CourierApiListCourierMessagesRequest) Page(page int64) CourierApiListCourierMessagesRequest {
	r.page = &page
	return r
}

// Status filters out messages based on status. If no value is provided, it doesn&#39;t take effect on filter.
func (r CourierApiListCourierMessagesRequest) Status(status CourierMessageStatus) CourierApiListCourierMessagesRequest {
	r.status = &status
	return r
}

// Recipient filters out messages based on recipient. If no value is provided, it doesn&#39;t take effect on filter.
func (r CourierApiListCourierMessagesRequest) Recipient(recipient string) CourierApiListCourierMessagesRequest {
	r.recipient = &recipient
	return r
}

func (r CourierApiListCourierMessagesRequest) Execute() ([]Message, *http.Response, error) {
	return r.ApiService.ListCourierMessagesExecute(r)
}

/*
ListCourierMessages List Messages

Lists all messages by given status and recipient.

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return CourierApiListCourierMessagesRequest
*/
func (a *CourierApiService) ListCourierMessages(ctx context.Context) CourierApiListCourierMessagesRequest {
	return CourierApiListCourierMessagesRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
//  @return []Message
func (a *CourierApiService) ListCourierMessagesExecute(r CourierApiListCourierMessagesRequest) ([]Message, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodGet
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  []Message
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "CourierApiService.ListCourierMessages")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/admin/courier/messages"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if r.perPage != nil {
		localVarQueryParams.Add("per_page", parameterToString(*r.perPage, ""))
	}
	if r.page != nil {
		localVarQueryParams.Add("page", parameterToString(*r.page, ""))
	}
	if r.status != nil {
		localVarQueryParams.Add("status", parameterToString(*r.status, ""))
	}
	if r.recipient != nil {
		localVarQueryParams.Add("recipient", parameterToString(*r.recipient, ""))
	}
	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{"application/json"}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	if r.ctx != nil {
		// API Key Authentication
		if auth, ok := r.ctx.Value(ContextAPIKeys).(map[string]APIKey); ok {
			if apiKey, ok := auth["oryAccessToken"]; ok {
				var key string
				if apiKey.Prefix != "" {
					key = apiKey.Prefix + " " + apiKey.Key
				} else {
					key = apiKey.Key
				}
				localVarHeaderParams["Authorization"] = key
			}
		}
	}
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, formFiles)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	localVarBody, err := ioutil.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = ioutil.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		if localVarHTTPResponse.StatusCode == 400 {
			var v ErrorGeneric
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
			newErr.model = v
			return localVarReturnValue, localVarHTTPResponse, newErr
		}
			var v ErrorGeneric
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
			newErr.model = v
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	err = a.client.decode(&localVarReturnValue, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
	if err != nil {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: err.Error(),
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	return localVarReturnValue, localVarHTTPResponse, nil
}
