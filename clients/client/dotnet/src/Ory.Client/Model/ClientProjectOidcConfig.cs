/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.0.1-alpha.41
 * Contact: support@ory.sh
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Ory.Client.Client.OpenAPIDateConverter;

namespace Ory.Client.Model
{
    /// <summary>
    /// ClientProjectOidcConfig
    /// </summary>
    [DataContract(Name = "projectOidcConfig")]
    public partial class ClientProjectOidcConfig : IEquatable<ClientProjectOidcConfig>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientProjectOidcConfig" /> class.
        /// </summary>
        /// <param name="authUrl">AuthURL is the authorize url, typically something like: https://example.org/oauth2/auth Should only be used when the OAuth2 / OpenID Connect server is not supporting OpenID Connect Discovery and when &#x60;provider&#x60; is set to &#x60;generic&#x60;..</param>
        /// <param name="clientId">ClientID is the application&#39;s Client ID..</param>
        /// <param name="clientSecret">ClientSecret is the application&#39;s secret..</param>
        /// <param name="id">ID is the provider&#39;s ID.</param>
        /// <param name="issuerUrl">IssuerURL is the OpenID Connect Server URL. You can leave this empty if &#x60;provider&#x60; is not set to &#x60;generic&#x60;. If set, neither &#x60;auth_url&#x60; nor &#x60;token_url&#x60; are required..</param>
        /// <param name="label">Label represents an optional label which can be used in the UI generation..</param>
        /// <param name="mapperUrl">Mapper specifies the JSONNet code snippet which uses the OpenID Connect Provider&#39;s data (e.g. GitHub or Google profile information) to hydrate the identity&#39;s data.  It can be either a URL (file://, http(s)://, base64://) or an inline JSONNet code snippet..</param>
        /// <param name="provider">Provider is either \&quot;generic\&quot; for a generic OAuth 2.0 / OpenID Connect Provider or one of: generic google github gitlab microsoft discord slack facebook vk yandex.</param>
        /// <param name="requestedClaims">RequestedClaims string encoded json object that specifies claims and optionally their properties which should be included in the id_token or returned from the UserInfo Endpoint.  More information: https://openid.net/specs/openid-connect-core-1_0.html#ClaimsParameter.</param>
        /// <param name="scope">Scope specifies optional requested permissions..</param>
        /// <param name="_string">_string.</param>
        /// <param name="tenant">Tenant is the Azure AD Tenant to use for authentication, and must be set when &#x60;provider&#x60; is set to &#x60;microsoft&#x60;. Can be either &#x60;common&#x60;, &#x60;organizations&#x60;, &#x60;consumers&#x60; for a multitenant application or a specific tenant like &#x60;8eaef023-2b34-4da1-9baa-8bc8c9d6a490&#x60; or &#x60;contoso.onmicrosoft.com&#x60;..</param>
        /// <param name="tokenUrl">TokenURL is the token url, typically something like: https://example.org/oauth2/token Should only be used when the OAuth2 / OpenID Connect server is not supporting OpenID Connect Discovery and when &#x60;provider&#x60; is set to &#x60;generic&#x60;..</param>
        public ClientProjectOidcConfig(string authUrl = default(string), string clientId = default(string), string clientSecret = default(string), string id = default(string), string issuerUrl = default(string), string label = default(string), string mapperUrl = default(string), string provider = default(string), Object requestedClaims = default(Object), List<string> scope = default(List<string>), string _string = default(string), string tenant = default(string), string tokenUrl = default(string))
        {
            this.AuthUrl = authUrl;
            this.ClientId = clientId;
            this.ClientSecret = clientSecret;
            this.Id = id;
            this.IssuerUrl = issuerUrl;
            this.Label = label;
            this.MapperUrl = mapperUrl;
            this.Provider = provider;
            this.RequestedClaims = requestedClaims;
            this.Scope = scope;
            this.String = _string;
            this.Tenant = tenant;
            this.TokenUrl = tokenUrl;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// AuthURL is the authorize url, typically something like: https://example.org/oauth2/auth Should only be used when the OAuth2 / OpenID Connect server is not supporting OpenID Connect Discovery and when &#x60;provider&#x60; is set to &#x60;generic&#x60;.
        /// </summary>
        /// <value>AuthURL is the authorize url, typically something like: https://example.org/oauth2/auth Should only be used when the OAuth2 / OpenID Connect server is not supporting OpenID Connect Discovery and when &#x60;provider&#x60; is set to &#x60;generic&#x60;.</value>
        [DataMember(Name = "auth_url", EmitDefaultValue = false)]
        public string AuthUrl { get; set; }

        /// <summary>
        /// ClientID is the application&#39;s Client ID.
        /// </summary>
        /// <value>ClientID is the application&#39;s Client ID.</value>
        [DataMember(Name = "client_id", EmitDefaultValue = false)]
        public string ClientId { get; set; }

        /// <summary>
        /// ClientSecret is the application&#39;s secret.
        /// </summary>
        /// <value>ClientSecret is the application&#39;s secret.</value>
        [DataMember(Name = "client_secret", EmitDefaultValue = false)]
        public string ClientSecret { get; set; }

        /// <summary>
        /// ID is the provider&#39;s ID
        /// </summary>
        /// <value>ID is the provider&#39;s ID</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public string Id { get; set; }

        /// <summary>
        /// IssuerURL is the OpenID Connect Server URL. You can leave this empty if &#x60;provider&#x60; is not set to &#x60;generic&#x60;. If set, neither &#x60;auth_url&#x60; nor &#x60;token_url&#x60; are required.
        /// </summary>
        /// <value>IssuerURL is the OpenID Connect Server URL. You can leave this empty if &#x60;provider&#x60; is not set to &#x60;generic&#x60;. If set, neither &#x60;auth_url&#x60; nor &#x60;token_url&#x60; are required.</value>
        [DataMember(Name = "issuer_url", EmitDefaultValue = false)]
        public string IssuerUrl { get; set; }

        /// <summary>
        /// Label represents an optional label which can be used in the UI generation.
        /// </summary>
        /// <value>Label represents an optional label which can be used in the UI generation.</value>
        [DataMember(Name = "label", EmitDefaultValue = false)]
        public string Label { get; set; }

        /// <summary>
        /// Mapper specifies the JSONNet code snippet which uses the OpenID Connect Provider&#39;s data (e.g. GitHub or Google profile information) to hydrate the identity&#39;s data.  It can be either a URL (file://, http(s)://, base64://) or an inline JSONNet code snippet.
        /// </summary>
        /// <value>Mapper specifies the JSONNet code snippet which uses the OpenID Connect Provider&#39;s data (e.g. GitHub or Google profile information) to hydrate the identity&#39;s data.  It can be either a URL (file://, http(s)://, base64://) or an inline JSONNet code snippet.</value>
        [DataMember(Name = "mapper_url", EmitDefaultValue = false)]
        public string MapperUrl { get; set; }

        /// <summary>
        /// Provider is either \&quot;generic\&quot; for a generic OAuth 2.0 / OpenID Connect Provider or one of: generic google github gitlab microsoft discord slack facebook vk yandex
        /// </summary>
        /// <value>Provider is either \&quot;generic\&quot; for a generic OAuth 2.0 / OpenID Connect Provider or one of: generic google github gitlab microsoft discord slack facebook vk yandex</value>
        [DataMember(Name = "provider", EmitDefaultValue = false)]
        public string Provider { get; set; }

        /// <summary>
        /// RequestedClaims string encoded json object that specifies claims and optionally their properties which should be included in the id_token or returned from the UserInfo Endpoint.  More information: https://openid.net/specs/openid-connect-core-1_0.html#ClaimsParameter
        /// </summary>
        /// <value>RequestedClaims string encoded json object that specifies claims and optionally their properties which should be included in the id_token or returned from the UserInfo Endpoint.  More information: https://openid.net/specs/openid-connect-core-1_0.html#ClaimsParameter</value>
        [DataMember(Name = "requested_claims", EmitDefaultValue = false)]
        public Object RequestedClaims { get; set; }

        /// <summary>
        /// Scope specifies optional requested permissions.
        /// </summary>
        /// <value>Scope specifies optional requested permissions.</value>
        [DataMember(Name = "scope", EmitDefaultValue = false)]
        public List<string> Scope { get; set; }

        /// <summary>
        /// Gets or Sets String
        /// </summary>
        [DataMember(Name = "string", EmitDefaultValue = false)]
        public string String { get; set; }

        /// <summary>
        /// Tenant is the Azure AD Tenant to use for authentication, and must be set when &#x60;provider&#x60; is set to &#x60;microsoft&#x60;. Can be either &#x60;common&#x60;, &#x60;organizations&#x60;, &#x60;consumers&#x60; for a multitenant application or a specific tenant like &#x60;8eaef023-2b34-4da1-9baa-8bc8c9d6a490&#x60; or &#x60;contoso.onmicrosoft.com&#x60;.
        /// </summary>
        /// <value>Tenant is the Azure AD Tenant to use for authentication, and must be set when &#x60;provider&#x60; is set to &#x60;microsoft&#x60;. Can be either &#x60;common&#x60;, &#x60;organizations&#x60;, &#x60;consumers&#x60; for a multitenant application or a specific tenant like &#x60;8eaef023-2b34-4da1-9baa-8bc8c9d6a490&#x60; or &#x60;contoso.onmicrosoft.com&#x60;.</value>
        [DataMember(Name = "tenant", EmitDefaultValue = false)]
        public string Tenant { get; set; }

        /// <summary>
        /// TokenURL is the token url, typically something like: https://example.org/oauth2/token Should only be used when the OAuth2 / OpenID Connect server is not supporting OpenID Connect Discovery and when &#x60;provider&#x60; is set to &#x60;generic&#x60;.
        /// </summary>
        /// <value>TokenURL is the token url, typically something like: https://example.org/oauth2/token Should only be used when the OAuth2 / OpenID Connect server is not supporting OpenID Connect Discovery and when &#x60;provider&#x60; is set to &#x60;generic&#x60;.</value>
        [DataMember(Name = "token_url", EmitDefaultValue = false)]
        public string TokenUrl { get; set; }

        /// <summary>
        /// Gets or Sets additional properties
        /// </summary>
        [JsonExtensionData]
        public IDictionary<string, object> AdditionalProperties { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ClientProjectOidcConfig {\n");
            sb.Append("  AuthUrl: ").Append(AuthUrl).Append("\n");
            sb.Append("  ClientId: ").Append(ClientId).Append("\n");
            sb.Append("  ClientSecret: ").Append(ClientSecret).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  IssuerUrl: ").Append(IssuerUrl).Append("\n");
            sb.Append("  Label: ").Append(Label).Append("\n");
            sb.Append("  MapperUrl: ").Append(MapperUrl).Append("\n");
            sb.Append("  Provider: ").Append(Provider).Append("\n");
            sb.Append("  RequestedClaims: ").Append(RequestedClaims).Append("\n");
            sb.Append("  Scope: ").Append(Scope).Append("\n");
            sb.Append("  String: ").Append(String).Append("\n");
            sb.Append("  Tenant: ").Append(Tenant).Append("\n");
            sb.Append("  TokenUrl: ").Append(TokenUrl).Append("\n");
            sb.Append("  AdditionalProperties: ").Append(AdditionalProperties).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as ClientProjectOidcConfig);
        }

        /// <summary>
        /// Returns true if ClientProjectOidcConfig instances are equal
        /// </summary>
        /// <param name="input">Instance of ClientProjectOidcConfig to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ClientProjectOidcConfig input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.AuthUrl == input.AuthUrl ||
                    (this.AuthUrl != null &&
                    this.AuthUrl.Equals(input.AuthUrl))
                ) && 
                (
                    this.ClientId == input.ClientId ||
                    (this.ClientId != null &&
                    this.ClientId.Equals(input.ClientId))
                ) && 
                (
                    this.ClientSecret == input.ClientSecret ||
                    (this.ClientSecret != null &&
                    this.ClientSecret.Equals(input.ClientSecret))
                ) && 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.IssuerUrl == input.IssuerUrl ||
                    (this.IssuerUrl != null &&
                    this.IssuerUrl.Equals(input.IssuerUrl))
                ) && 
                (
                    this.Label == input.Label ||
                    (this.Label != null &&
                    this.Label.Equals(input.Label))
                ) && 
                (
                    this.MapperUrl == input.MapperUrl ||
                    (this.MapperUrl != null &&
                    this.MapperUrl.Equals(input.MapperUrl))
                ) && 
                (
                    this.Provider == input.Provider ||
                    (this.Provider != null &&
                    this.Provider.Equals(input.Provider))
                ) && 
                (
                    this.RequestedClaims == input.RequestedClaims ||
                    (this.RequestedClaims != null &&
                    this.RequestedClaims.Equals(input.RequestedClaims))
                ) && 
                (
                    this.Scope == input.Scope ||
                    this.Scope != null &&
                    input.Scope != null &&
                    this.Scope.SequenceEqual(input.Scope)
                ) && 
                (
                    this.String == input.String ||
                    (this.String != null &&
                    this.String.Equals(input.String))
                ) && 
                (
                    this.Tenant == input.Tenant ||
                    (this.Tenant != null &&
                    this.Tenant.Equals(input.Tenant))
                ) && 
                (
                    this.TokenUrl == input.TokenUrl ||
                    (this.TokenUrl != null &&
                    this.TokenUrl.Equals(input.TokenUrl))
                )
                && (this.AdditionalProperties.Count == input.AdditionalProperties.Count && !this.AdditionalProperties.Except(input.AdditionalProperties).Any());
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.AuthUrl != null)
                    hashCode = hashCode * 59 + this.AuthUrl.GetHashCode();
                if (this.ClientId != null)
                    hashCode = hashCode * 59 + this.ClientId.GetHashCode();
                if (this.ClientSecret != null)
                    hashCode = hashCode * 59 + this.ClientSecret.GetHashCode();
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.IssuerUrl != null)
                    hashCode = hashCode * 59 + this.IssuerUrl.GetHashCode();
                if (this.Label != null)
                    hashCode = hashCode * 59 + this.Label.GetHashCode();
                if (this.MapperUrl != null)
                    hashCode = hashCode * 59 + this.MapperUrl.GetHashCode();
                if (this.Provider != null)
                    hashCode = hashCode * 59 + this.Provider.GetHashCode();
                if (this.RequestedClaims != null)
                    hashCode = hashCode * 59 + this.RequestedClaims.GetHashCode();
                if (this.Scope != null)
                    hashCode = hashCode * 59 + this.Scope.GetHashCode();
                if (this.String != null)
                    hashCode = hashCode * 59 + this.String.GetHashCode();
                if (this.Tenant != null)
                    hashCode = hashCode * 59 + this.Tenant.GetHashCode();
                if (this.TokenUrl != null)
                    hashCode = hashCode * 59 + this.TokenUrl.GetHashCode();
                if (this.AdditionalProperties != null)
                    hashCode = hashCode * 59 + this.AdditionalProperties.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
