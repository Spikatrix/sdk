# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule Ory.Api.Identity do
  @moduledoc """
  API calls for all endpoints tagged `Identity`.
  """

  alias Ory.Connection
  import Ory.RequestBuilder


  @doc """
  Create an Identity
  Create an [identity](https://www.ory.sh/docs/kratos/concepts/identity-user-model).  This endpoint can also be used to [import credentials](https://www.ory.sh/docs/kratos/manage-identities/import-user-accounts-identities) for instance passwords, social sign in configurations or multifactor methods.

  ## Parameters

  - connection (Ory.Connection): Connection to server
  - opts (KeywordList): [optional] Optional parameters
    - :body (CreateIdentityBody): 
  ## Returns

  {:ok, Ory.Model.Identity.t} on success
  {:error, Tesla.Env.t} on failure
  """
  @spec create_identity(Tesla.Env.client, keyword()) :: {:ok, Ory.Model.ErrorGeneric.t} | {:ok, Ory.Model.Identity.t} | {:error, Tesla.Env.t}
  def create_identity(connection, opts \\ []) do
    optional_params = %{
      :body => :body
    }
    %{}
    |> method(:post)
    |> url("/admin/identities")
    |> add_optional_params(optional_params, opts)
    |> ensure_body()
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> evaluate_response([
      { 201, %Ory.Model.Identity{}},
      { 400, %Ory.Model.ErrorGeneric{}},
      { 409, %Ory.Model.ErrorGeneric{}},
      { :default, %Ory.Model.ErrorGeneric{}}
    ])
  end

  @doc """
  Create a Recovery Code
  This endpoint creates a recovery code which should be given to the user in order for them to recover (or activate) their account.

  ## Parameters

  - connection (Ory.Connection): Connection to server
  - opts (KeywordList): [optional] Optional parameters
    - :body (CreateRecoveryCodeForIdentityBody): 
  ## Returns

  {:ok, Ory.Model.RecoveryCodeForIdentity.t} on success
  {:error, Tesla.Env.t} on failure
  """
  @spec create_recovery_code_for_identity(Tesla.Env.client, keyword()) :: {:ok, Ory.Model.ErrorGeneric.t} | {:ok, Ory.Model.RecoveryCodeForIdentity.t} | {:error, Tesla.Env.t}
  def create_recovery_code_for_identity(connection, opts \\ []) do
    optional_params = %{
      :body => :body
    }
    %{}
    |> method(:post)
    |> url("/admin/recovery/code")
    |> add_optional_params(optional_params, opts)
    |> ensure_body()
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> evaluate_response([
      { 201, %Ory.Model.RecoveryCodeForIdentity{}},
      { 400, %Ory.Model.ErrorGeneric{}},
      { 404, %Ory.Model.ErrorGeneric{}},
      { :default, %Ory.Model.ErrorGeneric{}}
    ])
  end

  @doc """
  Create a Recovery Link
  This endpoint creates a recovery link which should be given to the user in order for them to recover (or activate) their account.

  ## Parameters

  - connection (Ory.Connection): Connection to server
  - opts (KeywordList): [optional] Optional parameters
    - :body (CreateRecoveryLinkForIdentityBody): 
  ## Returns

  {:ok, Ory.Model.RecoveryLinkForIdentity.t} on success
  {:error, Tesla.Env.t} on failure
  """
  @spec create_recovery_link_for_identity(Tesla.Env.client, keyword()) :: {:ok, Ory.Model.ErrorGeneric.t} | {:ok, Ory.Model.RecoveryLinkForIdentity.t} | {:error, Tesla.Env.t}
  def create_recovery_link_for_identity(connection, opts \\ []) do
    optional_params = %{
      :body => :body
    }
    %{}
    |> method(:post)
    |> url("/admin/recovery/link")
    |> add_optional_params(optional_params, opts)
    |> ensure_body()
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> evaluate_response([
      { 200, %Ory.Model.RecoveryLinkForIdentity{}},
      { 400, %Ory.Model.ErrorGeneric{}},
      { 404, %Ory.Model.ErrorGeneric{}},
      { :default, %Ory.Model.ErrorGeneric{}}
    ])
  end

  @doc """
  Delete an Identity
  Calling this endpoint irrecoverably and permanently deletes the [identity](https://www.ory.sh/docs/kratos/concepts/identity-user-model) given its ID. This action can not be undone. This endpoint returns 204 when the identity was deleted or when the identity was not found, in which case it is assumed that is has been deleted already.

  ## Parameters

  - connection (Ory.Connection): Connection to server
  - id (String.t): ID is the identity's ID.
  - opts (KeywordList): [optional] Optional parameters
  ## Returns

  {:ok, nil} on success
  {:error, Tesla.Env.t} on failure
  """
  @spec delete_identity(Tesla.Env.client, String.t, keyword()) :: {:ok, nil} | {:ok, Ory.Model.ErrorGeneric.t} | {:error, Tesla.Env.t}
  def delete_identity(connection, id, _opts \\ []) do
    %{}
    |> method(:delete)
    |> url("/admin/identities/#{id}")
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> evaluate_response([
      { 204, false},
      { 404, %Ory.Model.ErrorGeneric{}},
      { :default, %Ory.Model.ErrorGeneric{}}
    ])
  end

  @doc """
  Delete & Invalidate an Identity's Sessions
  Calling this endpoint irrecoverably and permanently deletes and invalidates all sessions that belong to the given Identity.

  ## Parameters

  - connection (Ory.Connection): Connection to server
  - id (String.t): ID is the identity's ID.
  - opts (KeywordList): [optional] Optional parameters
  ## Returns

  {:ok, nil} on success
  {:error, Tesla.Env.t} on failure
  """
  @spec delete_identity_sessions(Tesla.Env.client, String.t, keyword()) :: {:ok, nil} | {:ok, Ory.Model.ErrorGeneric.t} | {:error, Tesla.Env.t}
  def delete_identity_sessions(connection, id, _opts \\ []) do
    %{}
    |> method(:delete)
    |> url("/admin/identities/#{id}/sessions")
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> evaluate_response([
      { 204, false},
      { 400, %Ory.Model.ErrorGeneric{}},
      { 401, %Ory.Model.ErrorGeneric{}},
      { 404, %Ory.Model.ErrorGeneric{}},
      { :default, %Ory.Model.ErrorGeneric{}}
    ])
  end

  @doc """
  Deactivate a Session
  Calling this endpoint deactivates the specified session. Session data is not deleted.

  ## Parameters

  - connection (Ory.Connection): Connection to server
  - id (String.t): ID is the session's ID.
  - opts (KeywordList): [optional] Optional parameters
  ## Returns

  {:ok, nil} on success
  {:error, Tesla.Env.t} on failure
  """
  @spec disable_session(Tesla.Env.client, String.t, keyword()) :: {:ok, nil} | {:ok, Ory.Model.ErrorGeneric.t} | {:error, Tesla.Env.t}
  def disable_session(connection, id, _opts \\ []) do
    %{}
    |> method(:delete)
    |> url("/admin/sessions/#{id}")
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> evaluate_response([
      { 204, false},
      { 400, %Ory.Model.ErrorGeneric{}},
      { 401, %Ory.Model.ErrorGeneric{}},
      { :default, %Ory.Model.ErrorGeneric{}}
    ])
  end

  @doc """
  Extend a Session
  Calling this endpoint extends the given session ID. If `session.earliest_possible_extend` is set it will only extend the session after the specified time has passed.  Retrieve the session ID from the `/sessions/whoami` endpoint / `toSession` SDK method.

  ## Parameters

  - connection (Ory.Connection): Connection to server
  - id (String.t): ID is the session's ID.
  - opts (KeywordList): [optional] Optional parameters
  ## Returns

  {:ok, Ory.Model.Session.t} on success
  {:error, Tesla.Env.t} on failure
  """
  @spec extend_session(Tesla.Env.client, String.t, keyword()) :: {:ok, Ory.Model.ErrorGeneric.t} | {:ok, Ory.Model.Session.t} | {:error, Tesla.Env.t}
  def extend_session(connection, id, _opts \\ []) do
    %{}
    |> method(:patch)
    |> url("/admin/sessions/#{id}/extend")
    |> ensure_body()
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> evaluate_response([
      { 200, %Ory.Model.Session{}},
      { 400, %Ory.Model.ErrorGeneric{}},
      { 404, %Ory.Model.ErrorGeneric{}},
      { :default, %Ory.Model.ErrorGeneric{}}
    ])
  end

  @doc """
  Get an Identity
  Return an [identity](https://www.ory.sh/docs/kratos/concepts/identity-user-model) by its ID. You can optionally include credentials (e.g. social sign in connections) in the response by using the `include_credential` query parameter.

  ## Parameters

  - connection (Ory.Connection): Connection to server
  - id (String.t): ID must be set to the ID of identity you want to get
  - opts (KeywordList): [optional] Optional parameters
    - :include_credential ([String.t]): Include Credentials in Response  Currently, only `oidc` is supported. This will return the initial OAuth 2.0 Access, Refresh and (optionally) OpenID Connect ID Token.
  ## Returns

  {:ok, Ory.Model.Identity.t} on success
  {:error, Tesla.Env.t} on failure
  """
  @spec get_identity(Tesla.Env.client, String.t, keyword()) :: {:ok, Ory.Model.ErrorGeneric.t} | {:ok, Ory.Model.Identity.t} | {:error, Tesla.Env.t}
  def get_identity(connection, id, opts \\ []) do
    optional_params = %{
      :include_credential => :query
    }
    %{}
    |> method(:get)
    |> url("/admin/identities/#{id}")
    |> add_optional_params(optional_params, opts)
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> evaluate_response([
      { 200, %Ory.Model.Identity{}},
      { 404, %Ory.Model.ErrorGeneric{}},
      { :default, %Ory.Model.ErrorGeneric{}}
    ])
  end

  @doc """
  Get Identity JSON Schema
  Return a specific identity schema.

  ## Parameters

  - connection (Ory.Connection): Connection to server
  - id (String.t): ID must be set to the ID of schema you want to get
  - opts (KeywordList): [optional] Optional parameters
  ## Returns

  {:ok, map()} on success
  {:error, Tesla.Env.t} on failure
  """
  @spec get_identity_schema(Tesla.Env.client, String.t, keyword()) :: {:ok, Ory.Model.ErrorGeneric.t} | {:ok, Map.t} | {:error, Tesla.Env.t}
  def get_identity_schema(connection, id, _opts \\ []) do
    %{}
    |> method(:get)
    |> url("/schemas/#{id}")
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> evaluate_response([
      { 200, %{}},
      { 404, %Ory.Model.ErrorGeneric{}},
      { :default, %Ory.Model.ErrorGeneric{}}
    ])
  end

  @doc """
  This endpoint returns the session object with expandables specified.
  This endpoint is useful for:  Getting a session object with all specified expandables that exist in an administrative context.

  ## Parameters

  - connection (Ory.Connection): Connection to server
  - id (String.t): ID is the session's ID.
  - opts (KeywordList): [optional] Optional parameters
    - :expand ([String.t]): ExpandOptions is a query parameter encoded list of all properties that must be expanded in the Session. Example - ?expand=Identity&expand=Devices If no value is provided, the expandable properties are skipped.
  ## Returns

  {:ok, Ory.Model.Session.t} on success
  {:error, Tesla.Env.t} on failure
  """
  @spec get_session(Tesla.Env.client, String.t, keyword()) :: {:ok, Ory.Model.ErrorGeneric.t} | {:ok, Ory.Model.Session.t} | {:error, Tesla.Env.t}
  def get_session(connection, id, opts \\ []) do
    optional_params = %{
      :expand => :query
    }
    %{}
    |> method(:get)
    |> url("/admin/sessions/#{id}")
    |> add_optional_params(optional_params, opts)
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> evaluate_response([
      { 200, %Ory.Model.Session{}},
      { 400, %Ory.Model.ErrorGeneric{}},
      { :default, %Ory.Model.ErrorGeneric{}}
    ])
  end

  @doc """
  List Identities
  Lists all [identities](https://www.ory.sh/docs/kratos/concepts/identity-user-model) in the system.

  ## Parameters

  - connection (Ory.Connection): Connection to server
  - opts (KeywordList): [optional] Optional parameters
    - :per_page (integer()): Items per Page  This is the number of items per page.
    - :page (integer()): Pagination Page  This value is currently an integer, but it is not sequential. The value is not the page number, but a reference. The next page can be any number and some numbers might return an empty list.  For example, page 2 might not follow after page 1. And even if page 3 and 5 exist, but page 4 might not exist.
  ## Returns

  {:ok, [%Identity{}, ...]} on success
  {:error, Tesla.Env.t} on failure
  """
  @spec list_identities(Tesla.Env.client, keyword()) :: {:ok, Ory.Model.ErrorGeneric.t} | {:ok, list(Ory.Model.Identity.t)} | {:error, Tesla.Env.t}
  def list_identities(connection, opts \\ []) do
    optional_params = %{
      :per_page => :query,
      :page => :query
    }
    %{}
    |> method(:get)
    |> url("/admin/identities")
    |> add_optional_params(optional_params, opts)
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> evaluate_response([
      { 200, [%Ory.Model.Identity{}]},
      { :default, %Ory.Model.ErrorGeneric{}}
    ])
  end

  @doc """
  Get all Identity Schemas
  Returns a list of all identity schemas currently in use.

  ## Parameters

  - connection (Ory.Connection): Connection to server
  - opts (KeywordList): [optional] Optional parameters
    - :per_page (integer()): Items per Page  This is the number of items per page.
    - :page (integer()): Pagination Page  This value is currently an integer, but it is not sequential. The value is not the page number, but a reference. The next page can be any number and some numbers might return an empty list.  For example, page 2 might not follow after page 1. And even if page 3 and 5 exist, but page 4 might not exist.
  ## Returns

  {:ok, [%IdentitySchemaContainer{}, ...]} on success
  {:error, Tesla.Env.t} on failure
  """
  @spec list_identity_schemas(Tesla.Env.client, keyword()) :: {:ok, Ory.Model.ErrorGeneric.t} | {:ok, list(Ory.Model.IdentitySchemaContainer.t)} | {:error, Tesla.Env.t}
  def list_identity_schemas(connection, opts \\ []) do
    optional_params = %{
      :per_page => :query,
      :page => :query
    }
    %{}
    |> method(:get)
    |> url("/schemas")
    |> add_optional_params(optional_params, opts)
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> evaluate_response([
      { 200, [%Ory.Model.IdentitySchemaContainer{}]},
      { :default, %Ory.Model.ErrorGeneric{}}
    ])
  end

  @doc """
  List an Identity's Sessions
  This endpoint returns all sessions that belong to the given Identity.

  ## Parameters

  - connection (Ory.Connection): Connection to server
  - id (String.t): ID is the identity's ID.
  - opts (KeywordList): [optional] Optional parameters
    - :per_page (integer()): Items per Page  This is the number of items per page.
    - :page (integer()): Pagination Page  This value is currently an integer, but it is not sequential. The value is not the page number, but a reference. The next page can be any number and some numbers might return an empty list.  For example, page 2 might not follow after page 1. And even if page 3 and 5 exist, but page 4 might not exist.
    - :active (boolean()): Active is a boolean flag that filters out sessions based on the state. If no value is provided, all sessions are returned.
  ## Returns

  {:ok, [%Session{}, ...]} on success
  {:error, Tesla.Env.t} on failure
  """
  @spec list_identity_sessions(Tesla.Env.client, String.t, keyword()) :: {:ok, list(Ory.Model.Session.t)} | {:ok, Ory.Model.ErrorGeneric.t} | {:error, Tesla.Env.t}
  def list_identity_sessions(connection, id, opts \\ []) do
    optional_params = %{
      :per_page => :query,
      :page => :query,
      :active => :query
    }
    %{}
    |> method(:get)
    |> url("/admin/identities/#{id}/sessions")
    |> add_optional_params(optional_params, opts)
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> evaluate_response([
      { 200, [%Ory.Model.Session{}]},
      { 400, %Ory.Model.ErrorGeneric{}},
      { 404, %Ory.Model.ErrorGeneric{}},
      { :default, %Ory.Model.ErrorGeneric{}}
    ])
  end

  @doc """
  List All Sessions
  Listing all sessions that exist.

  ## Parameters

  - connection (Ory.Connection): Connection to server
  - opts (KeywordList): [optional] Optional parameters
    - :page_size (integer()): Items per Page  This is the number of items per page to return. For details on pagination please head over to the [pagination documentation](https://www.ory.sh/docs/ecosystem/api-design#pagination).
    - :page_token (String.t): Next Page Token  The next page token. For details on pagination please head over to the [pagination documentation](https://www.ory.sh/docs/ecosystem/api-design#pagination).
    - :active (boolean()): Active is a boolean flag that filters out sessions based on the state. If no value is provided, all sessions are returned.
    - :expand ([String.t]): ExpandOptions is a query parameter encoded list of all properties that must be expanded in the Session. Example - ?expand=Identity&expand=Devices If no value is provided, the expandable properties are skipped.
  ## Returns

  {:ok, [%Session{}, ...]} on success
  {:error, Tesla.Env.t} on failure
  """
  @spec list_sessions(Tesla.Env.client, keyword()) :: {:ok, list(Ory.Model.Session.t)} | {:ok, Ory.Model.ErrorGeneric.t} | {:error, Tesla.Env.t}
  def list_sessions(connection, opts \\ []) do
    optional_params = %{
      :page_size => :query,
      :page_token => :query,
      :active => :query,
      :expand => :query
    }
    %{}
    |> method(:get)
    |> url("/admin/sessions")
    |> add_optional_params(optional_params, opts)
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> evaluate_response([
      { 200, [%Ory.Model.Session{}]},
      { 400, %Ory.Model.ErrorGeneric{}},
      { :default, %Ory.Model.ErrorGeneric{}}
    ])
  end

  @doc """
  Patch an Identity
  Partially updates an [identity's](https://www.ory.sh/docs/kratos/concepts/identity-user-model) field using [JSON Patch](https://jsonpatch.com/). The fields `id`, `stateChangedAt` and `credentials` can not be updated using this method.

  ## Parameters

  - connection (Ory.Connection): Connection to server
  - id (String.t): ID must be set to the ID of identity you want to update
  - opts (KeywordList): [optional] Optional parameters
    - :body ([Ory.Model.JsonPatch.t]): 
  ## Returns

  {:ok, Ory.Model.Identity.t} on success
  {:error, Tesla.Env.t} on failure
  """
  @spec patch_identity(Tesla.Env.client, String.t, keyword()) :: {:ok, Ory.Model.ErrorGeneric.t} | {:ok, Ory.Model.Identity.t} | {:error, Tesla.Env.t}
  def patch_identity(connection, id, opts \\ []) do
    optional_params = %{
      :body => :body
    }
    %{}
    |> method(:patch)
    |> url("/admin/identities/#{id}")
    |> add_optional_params(optional_params, opts)
    |> ensure_body()
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> evaluate_response([
      { 200, %Ory.Model.Identity{}},
      { 400, %Ory.Model.ErrorGeneric{}},
      { 404, %Ory.Model.ErrorGeneric{}},
      { 409, %Ory.Model.ErrorGeneric{}},
      { :default, %Ory.Model.ErrorGeneric{}}
    ])
  end

  @doc """
  Update an Identity
  This endpoint updates an [identity](https://www.ory.sh/docs/kratos/concepts/identity-user-model). The full identity payload (except credentials) is expected. It is possible to update the identity's credentials as well.

  ## Parameters

  - connection (Ory.Connection): Connection to server
  - id (String.t): ID must be set to the ID of identity you want to update
  - opts (KeywordList): [optional] Optional parameters
    - :body (UpdateIdentityBody): 
  ## Returns

  {:ok, Ory.Model.Identity.t} on success
  {:error, Tesla.Env.t} on failure
  """
  @spec update_identity(Tesla.Env.client, String.t, keyword()) :: {:ok, Ory.Model.ErrorGeneric.t} | {:ok, Ory.Model.Identity.t} | {:error, Tesla.Env.t}
  def update_identity(connection, id, opts \\ []) do
    optional_params = %{
      :body => :body
    }
    %{}
    |> method(:put)
    |> url("/admin/identities/#{id}")
    |> add_optional_params(optional_params, opts)
    |> ensure_body()
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> evaluate_response([
      { 200, %Ory.Model.Identity{}},
      { 400, %Ory.Model.ErrorGeneric{}},
      { 404, %Ory.Model.ErrorGeneric{}},
      { 409, %Ory.Model.ErrorGeneric{}},
      { :default, %Ory.Model.ErrorGeneric{}}
    ])
  end
end
