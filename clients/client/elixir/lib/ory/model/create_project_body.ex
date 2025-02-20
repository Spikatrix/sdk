# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule Ory.Model.CreateProjectBody do
  @moduledoc """
  Create Project Request Body
  """

  @derive [Poison.Encoder]
  defstruct [
    :name
  ]

  @type t :: %__MODULE__{
    :name => String.t
  }
end

defimpl Poison.Decoder, for: Ory.Model.CreateProjectBody do
  def decode(value, _options) do
    value
  end
end

