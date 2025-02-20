"""
    Ory Identities API

    This is the API specification for Ory Identities with features such as registration, login, recovery, account verification, profile settings, password reset, identity management, session management, email and sms delivery, and more.   # noqa: E501

    The version of the OpenAPI document: v0.11.0
    Contact: office@ory.sh
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

from ory_kratos_client.api_client import ApiClient, Endpoint as _Endpoint
from ory_kratos_client.model_utils import (  # noqa: F401
    check_allowed_values,
    check_validations,
    date,
    datetime,
    file_type,
    none_type,
    validate_and_convert_types
)
from ory_kratos_client.model.courier_message_status import CourierMessageStatus
from ory_kratos_client.model.error_generic import ErrorGeneric
from ory_kratos_client.model.message import Message


class CourierApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client
        self.list_courier_messages_endpoint = _Endpoint(
            settings={
                'response_type': ([Message],),
                'auth': [
                    'oryAccessToken'
                ],
                'endpoint_path': '/admin/courier/messages',
                'operation_id': 'list_courier_messages',
                'http_method': 'GET',
                'servers': None,
            },
            params_map={
                'all': [
                    'per_page',
                    'page',
                    'status',
                    'recipient',
                ],
                'required': [],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                    'per_page',
                    'page',
                ]
            },
            root_map={
                'validations': {
                    ('per_page',): {

                        'inclusive_maximum': 1000,
                        'inclusive_minimum': 1,
                    },
                    ('page',): {

                        'inclusive_minimum': 1,
                    },
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'per_page':
                        (int,),
                    'page':
                        (int,),
                    'status':
                        (CourierMessageStatus,),
                    'recipient':
                        (str,),
                },
                'attribute_map': {
                    'per_page': 'per_page',
                    'page': 'page',
                    'status': 'status',
                    'recipient': 'recipient',
                },
                'location_map': {
                    'per_page': 'query',
                    'page': 'query',
                    'status': 'query',
                    'recipient': 'query',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/json'
                ],
                'content_type': [],
            },
            api_client=api_client
        )

    def list_courier_messages(
        self,
        **kwargs
    ):
        """List Messages  # noqa: E501

        Lists all messages by given status and recipient.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.list_courier_messages(async_req=True)
        >>> result = thread.get()


        Keyword Args:
            per_page (int): Items per Page  This is the number of items per page.. [optional] if omitted the server will use the default value of 250
            page (int): Pagination Page  This value is currently an integer, but it is not sequential. The value is not the page number, but a reference. The next page can be any number and some numbers might return an empty list.  For example, page 2 might not follow after page 1. And even if page 3 and 5 exist, but page 4 might not exist.. [optional] if omitted the server will use the default value of 1
            status (CourierMessageStatus): Status filters out messages based on status. If no value is provided, it doesn't take effect on filter.. [optional]
            recipient (str): Recipient filters out messages based on recipient. If no value is provided, it doesn't take effect on filter.. [optional]
            _return_http_data_only (bool): response data without head status
                code and headers. Default is True.
            _preload_content (bool): if False, the urllib3.HTTPResponse object
                will be returned without reading/decoding response data.
                Default is True.
            _request_timeout (int/float/tuple): timeout setting for this request. If
                one number provided, it will be total request timeout. It can also
                be a pair (tuple) of (connection, read) timeouts.
                Default is None.
            _check_input_type (bool): specifies if type checking
                should be done one the data sent to the server.
                Default is True.
            _check_return_type (bool): specifies if type checking
                should be done one the data received from the server.
                Default is True.
            _spec_property_naming (bool): True if the variable names in the input data
                are serialized names, as specified in the OpenAPI document.
                False if the variable names in the input data
                are pythonic names, e.g. snake case (default)
            _content_type (str/None): force body content-type.
                Default is None and content-type will be predicted by allowed
                content-types and body.
            _host_index (int/None): specifies the index of the server
                that we want to use.
                Default is read from the configuration.
            _request_auths (list): set to override the auth_settings for an a single
                request; this effectively ignores the authentication
                in the spec for a single request.
                Default is None
            async_req (bool): execute request asynchronously

        Returns:
            [Message]
                If the method is called asynchronously, returns the request
                thread.
        """
        kwargs['async_req'] = kwargs.get(
            'async_req', False
        )
        kwargs['_return_http_data_only'] = kwargs.get(
            '_return_http_data_only', True
        )
        kwargs['_preload_content'] = kwargs.get(
            '_preload_content', True
        )
        kwargs['_request_timeout'] = kwargs.get(
            '_request_timeout', None
        )
        kwargs['_check_input_type'] = kwargs.get(
            '_check_input_type', True
        )
        kwargs['_check_return_type'] = kwargs.get(
            '_check_return_type', True
        )
        kwargs['_spec_property_naming'] = kwargs.get(
            '_spec_property_naming', False
        )
        kwargs['_content_type'] = kwargs.get(
            '_content_type')
        kwargs['_host_index'] = kwargs.get('_host_index')
        kwargs['_request_auths'] = kwargs.get('_request_auths', None)
        return self.list_courier_messages_endpoint.call_with_http_info(**kwargs)

