"""
    Ory Identities API

    This is the API specification for Ory Identities with features such as registration, login, recovery, account verification, profile settings, password reset, identity management, session management, email and sms delivery, and more.   # noqa: E501

    The version of the OpenAPI document: v0.11.0
    Contact: office@ory.sh
    Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import ory_kratos_client
from ory_kratos_client.model.update_registration_flow_with_oidc_method import UpdateRegistrationFlowWithOidcMethod
from ory_kratos_client.model.update_registration_flow_with_password_method import UpdateRegistrationFlowWithPasswordMethod
from ory_kratos_client.model.update_registration_flow_with_web_authn_method import UpdateRegistrationFlowWithWebAuthnMethod
globals()['UpdateRegistrationFlowWithOidcMethod'] = UpdateRegistrationFlowWithOidcMethod
globals()['UpdateRegistrationFlowWithPasswordMethod'] = UpdateRegistrationFlowWithPasswordMethod
globals()['UpdateRegistrationFlowWithWebAuthnMethod'] = UpdateRegistrationFlowWithWebAuthnMethod
from ory_kratos_client.model.update_registration_flow_body import UpdateRegistrationFlowBody


class TestUpdateRegistrationFlowBody(unittest.TestCase):
    """UpdateRegistrationFlowBody unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testUpdateRegistrationFlowBody(self):
        """Test UpdateRegistrationFlowBody"""
        # FIXME: construct object with mandatory attributes with example values
        # model = UpdateRegistrationFlowBody()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
