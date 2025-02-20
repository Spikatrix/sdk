# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule Ory.Model.SetProject do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :name,
    :services
  ]

  @type t :: %__MODULE__{
    :name => String.t,
    :services => Ory.Model.ProjectServices.t
  }
end

defimpl Poison.Decoder, for: Ory.Model.SetProject do
  import Ory.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:services, :struct, Ory.Model.ProjectServices, options)
  end
end

