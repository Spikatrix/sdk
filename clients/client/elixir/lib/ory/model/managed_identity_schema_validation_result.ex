# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule Ory.Model.ManagedIdentitySchemaValidationResult do
  @moduledoc """
  Ory Identity Schema Validation Result
  """

  @derive [Poison.Encoder]
  defstruct [
    :message,
    :valid
  ]

  @type t :: %__MODULE__{
    :message => String.t | nil,
    :valid => boolean() | nil
  }
end

defimpl Poison.Decoder, for: Ory.Model.ManagedIdentitySchemaValidationResult do
  def decode(value, _options) do
    value
  end
end

