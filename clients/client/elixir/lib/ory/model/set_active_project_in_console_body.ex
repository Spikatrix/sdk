# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule Ory.Model.SetActiveProjectInConsoleBody do
  @moduledoc """
  Set active project in the Ory Network Console Request Body
  """

  @derive [Poison.Encoder]
  defstruct [
    :project_id
  ]

  @type t :: %__MODULE__{
    :project_id => String.t
  }
end

defimpl Poison.Decoder, for: Ory.Model.SetActiveProjectInConsoleBody do
  def decode(value, _options) do
    value
  end
end

