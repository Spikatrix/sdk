/*
 * Ory Identities API
 *
 * This is the API specification for Ory Identities with features such as registration, login, recovery, account verification, profile settings, password reset, identity management, session management, email and sms delivery, and more. 
 *
 * The version of the OpenAPI document: v0.11.0
 * Contact: office@ory.sh
 * Generated by: https://openapi-generator.tech
 */

/// VerificationFlowState : The state represents the state of the verification flow.  choose_method: ask the user to choose a method (e.g. recover account via email) sent_email: the email has been sent to the user passed_challenge: the request was successful and the recovery challenge was passed.

/// The state represents the state of the verification flow.  choose_method: ask the user to choose a method (e.g. recover account via email) sent_email: the email has been sent to the user passed_challenge: the request was successful and the recovery challenge was passed.
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum VerificationFlowState {
    #[serde(rename = "choose_method")]
    ChooseMethod,
    #[serde(rename = "sent_email")]
    SentEmail,
    #[serde(rename = "passed_challenge")]
    PassedChallenge,

}

impl ToString for VerificationFlowState {
    fn to_string(&self) -> String {
        match self {
            Self::ChooseMethod => String::from("choose_method"),
            Self::SentEmail => String::from("sent_email"),
            Self::PassedChallenge => String::from("passed_challenge"),
        }
    }
}




