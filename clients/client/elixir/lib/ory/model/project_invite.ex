# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule Ory.Model.ProjectInvite do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :created_at,
    :id,
    :invitee_email,
    :invitee_id,
    :owner_email,
    :owner_id,
    :project_id,
    :status,
    :updated_at
  ]

  @type t :: %__MODULE__{
    :created_at => DateTime.t,
    :id => String.t,
    :invitee_email => String.t,
    :invitee_id => String.t | nil,
    :owner_email => String.t,
    :owner_id => String.t,
    :project_id => String.t,
    :status => String.t,
    :updated_at => DateTime.t
  }
end

defimpl Poison.Decoder, for: Ory.Model.ProjectInvite do
  def decode(value, _options) do
    value
  end
end

