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
using JsonSubTypes;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Ory.Kratos.Client.Client.OpenAPIDateConverter;
using System.Reflection;

namespace Ory.Kratos.Client.Model
{
    /// <summary>
    /// nolint:deadcode,unused
    /// </summary>
    [JsonConverter(typeof(KratosUpdateVerificationFlowBodyJsonConverter))]
    [DataContract(Name = "updateVerificationFlowBody")]
    public partial class KratosUpdateVerificationFlowBody : AbstractOpenAPISchema, IEquatable<KratosUpdateVerificationFlowBody>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="KratosUpdateVerificationFlowBody" /> class
        /// with the <see cref="KratosUpdateVerificationFlowWithLinkMethod" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of KratosUpdateVerificationFlowWithLinkMethod.</param>
        public KratosUpdateVerificationFlowBody(KratosUpdateVerificationFlowWithLinkMethod actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }


        private Object _actualInstance;

        /// <summary>
        /// Gets or Sets ActualInstance
        /// </summary>
        public override Object ActualInstance
        {
            get
            {
                return _actualInstance;
            }
            set
            {
                if (value.GetType() == typeof(KratosUpdateVerificationFlowWithLinkMethod))
                {
                    this._actualInstance = value;
                }
                else
                {
                    throw new ArgumentException("Invalid instance found. Must be the following types: KratosUpdateVerificationFlowWithLinkMethod");
                }
            }
        }

        /// <summary>
        /// Get the actual instance of `KratosUpdateVerificationFlowWithLinkMethod`. If the actual instance is not `KratosUpdateVerificationFlowWithLinkMethod`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of KratosUpdateVerificationFlowWithLinkMethod</returns>
        public KratosUpdateVerificationFlowWithLinkMethod GetKratosUpdateVerificationFlowWithLinkMethod()
        {
            return (KratosUpdateVerificationFlowWithLinkMethod)this.ActualInstance;
        }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class KratosUpdateVerificationFlowBody {\n");
            sb.Append("  ActualInstance: ").Append(this.ActualInstance).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public override string ToJson()
        {
            return JsonConvert.SerializeObject(this.ActualInstance, KratosUpdateVerificationFlowBody.SerializerSettings);
        }

        /// <summary>
        /// Converts the JSON string into an instance of KratosUpdateVerificationFlowBody
        /// </summary>
        /// <param name="jsonString">JSON string</param>
        /// <returns>An instance of KratosUpdateVerificationFlowBody</returns>
        public static KratosUpdateVerificationFlowBody FromJson(string jsonString)
        {
            KratosUpdateVerificationFlowBody newKratosUpdateVerificationFlowBody = null;

            if (string.IsNullOrEmpty(jsonString))
            {
                return newKratosUpdateVerificationFlowBody;
            }
            int match = 0;
            List<string> matchedTypes = new List<string>();

            try
            {
                // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
                if (typeof(KratosUpdateVerificationFlowWithLinkMethod).GetProperty("AdditionalProperties") == null)
                {
                    newKratosUpdateVerificationFlowBody = new KratosUpdateVerificationFlowBody(JsonConvert.DeserializeObject<KratosUpdateVerificationFlowWithLinkMethod>(jsonString, KratosUpdateVerificationFlowBody.SerializerSettings));
                }
                else
                {
                    newKratosUpdateVerificationFlowBody = new KratosUpdateVerificationFlowBody(JsonConvert.DeserializeObject<KratosUpdateVerificationFlowWithLinkMethod>(jsonString, KratosUpdateVerificationFlowBody.AdditionalPropertiesSerializerSettings));
                }
                matchedTypes.Add("KratosUpdateVerificationFlowWithLinkMethod");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into KratosUpdateVerificationFlowWithLinkMethod: {1}", jsonString, exception.ToString()));
            }

            if (match == 0)
            {
                throw new InvalidDataException("The JSON string `" + jsonString + "` cannot be deserialized into any schema defined.");
            }
            else if (match > 1)
            {
                throw new InvalidDataException("The JSON string `" + jsonString + "` incorrectly matches more than one schema (should be exactly one match): " + matchedTypes);
            }

            // deserialization is considered successful at this point if no exception has been thrown.
            return newKratosUpdateVerificationFlowBody;
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as KratosUpdateVerificationFlowBody);
        }

        /// <summary>
        /// Returns true if KratosUpdateVerificationFlowBody instances are equal
        /// </summary>
        /// <param name="input">Instance of KratosUpdateVerificationFlowBody to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(KratosUpdateVerificationFlowBody input)
        {
            if (input == null)
                return false;

            return this.ActualInstance.Equals(input.ActualInstance);
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
                if (this.ActualInstance != null)
                    hashCode = hashCode * 59 + this.ActualInstance.GetHashCode();
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

    /// <summary>
    /// Custom JSON converter for KratosUpdateVerificationFlowBody
    /// </summary>
    public class KratosUpdateVerificationFlowBodyJsonConverter : JsonConverter
    {
        /// <summary>
        /// To write the JSON string
        /// </summary>
        /// <param name="writer">JSON writer</param>
        /// <param name="value">Object to be converted into a JSON string</param>
        /// <param name="serializer">JSON Serializer</param>
        public override void WriteJson(JsonWriter writer, object value, JsonSerializer serializer)
        {
            writer.WriteRawValue((string)(typeof(KratosUpdateVerificationFlowBody).GetMethod("ToJson").Invoke(value, null)));
        }

        /// <summary>
        /// To convert a JSON string into an object
        /// </summary>
        /// <param name="reader">JSON reader</param>
        /// <param name="objectType">Object type</param>
        /// <param name="existingValue">Existing value</param>
        /// <param name="serializer">JSON Serializer</param>
        /// <returns>The object converted from the JSON string</returns>
        public override object ReadJson(JsonReader reader, Type objectType, object existingValue, JsonSerializer serializer)
        {
            if(reader.TokenType != JsonToken.Null)
            {
                return KratosUpdateVerificationFlowBody.FromJson(JObject.Load(reader).ToString(Formatting.None));
            }
            return null;
        }

        /// <summary>
        /// Check if the object can be converted
        /// </summary>
        /// <param name="objectType">Object type</param>
        /// <returns>True if the object can be converted</returns>
        public override bool CanConvert(Type objectType)
        {
            return false;
        }
    }

}
