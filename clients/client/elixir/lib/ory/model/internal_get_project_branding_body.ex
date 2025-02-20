# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule Ory.Model.InternalGetProjectBrandingBody do
  @moduledoc """
  Get Project Branding Request Body
  """

  @derive [Poison.Encoder]
  defstruct [
    :hostname
  ]

  @type t :: %__MODULE__{
    :hostname => String.t | nil
  }
end

defimpl Poison.Decoder, for: Ory.Model.InternalGetProjectBrandingBody do
  def decode(value, _options) do
    value
  end
end

