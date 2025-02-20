/*
 * Ory Identities API
 *
 * This is the API specification for Ory Identities with features such as registration, login, recovery, account verification, profile settings, password reset, identity management, session management, email and sms delivery, and more. 
 *
 * The version of the OpenAPI document: v0.11.0
 * Contact: office@ory.sh
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
using OpenAPIDateConverter = Ory.Kratos.Client.Client.OpenAPIDateConverter;

namespace Ory.Kratos.Client.Model
{
    /// <summary>
    /// KratosTokenPagination
    /// </summary>
    [DataContract(Name = "tokenPagination")]
    public partial class KratosTokenPagination : IEquatable<KratosTokenPagination>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="KratosTokenPagination" /> class.
        /// </summary>
        /// <param name="pageSize">Items per page  This is the number of items per page to return. For details on pagination please head over to the [pagination documentation](https://www.ory.sh/docs/ecosystem/api-design#pagination). (default to 250).</param>
        /// <param name="pageToken">Next Page Token  The next page token. For details on pagination please head over to the [pagination documentation](https://www.ory.sh/docs/ecosystem/api-design#pagination). (default to &quot;1&quot;).</param>
        public KratosTokenPagination(long pageSize = 250, string pageToken = "1")
        {
            this.PageSize = pageSize;
            // use default value if no "pageToken" provided
            this.PageToken = pageToken ?? "1";
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// Items per page  This is the number of items per page to return. For details on pagination please head over to the [pagination documentation](https://www.ory.sh/docs/ecosystem/api-design#pagination).
        /// </summary>
        /// <value>Items per page  This is the number of items per page to return. For details on pagination please head over to the [pagination documentation](https://www.ory.sh/docs/ecosystem/api-design#pagination).</value>
        [DataMember(Name = "page_size", EmitDefaultValue = false)]
        public long PageSize { get; set; }

        /// <summary>
        /// Next Page Token  The next page token. For details on pagination please head over to the [pagination documentation](https://www.ory.sh/docs/ecosystem/api-design#pagination).
        /// </summary>
        /// <value>Next Page Token  The next page token. For details on pagination please head over to the [pagination documentation](https://www.ory.sh/docs/ecosystem/api-design#pagination).</value>
        [DataMember(Name = "page_token", EmitDefaultValue = false)]
        public string PageToken { get; set; }

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
            StringBuilder sb = new StringBuilder();
            sb.Append("class KratosTokenPagination {\n");
            sb.Append("  PageSize: ").Append(PageSize).Append("\n");
            sb.Append("  PageToken: ").Append(PageToken).Append("\n");
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
            return this.Equals(input as KratosTokenPagination);
        }

        /// <summary>
        /// Returns true if KratosTokenPagination instances are equal
        /// </summary>
        /// <param name="input">Instance of KratosTokenPagination to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(KratosTokenPagination input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.PageSize == input.PageSize ||
                    this.PageSize.Equals(input.PageSize)
                ) && 
                (
                    this.PageToken == input.PageToken ||
                    (this.PageToken != null &&
                    this.PageToken.Equals(input.PageToken))
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
                hashCode = (hashCode * 59) + this.PageSize.GetHashCode();
                if (this.PageToken != null)
                {
                    hashCode = (hashCode * 59) + this.PageToken.GetHashCode();
                }
                if (this.AdditionalProperties != null)
                {
                    hashCode = (hashCode * 59) + this.AdditionalProperties.GetHashCode();
                }
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        public IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> Validate(ValidationContext validationContext)
        {
            // PageSize (long) maximum
            if (this.PageSize > (long)1000)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for PageSize, must be a value less than or equal to 1000.", new [] { "PageSize" });
            }

            // PageSize (long) minimum
            if (this.PageSize < (long)1)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for PageSize, must be a value greater than or equal to 1.", new [] { "PageSize" });
            }

            yield break;
        }
    }

}
