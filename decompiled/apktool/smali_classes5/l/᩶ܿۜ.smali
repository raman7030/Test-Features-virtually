.class public final Ll/᩶ܿۜ;
.super Ll/ۙۛ᩻;
.source "E6L4"


# instance fields
.field public ֫:Lbin/mt/json/JSONObject;

.field public ۧ:Lbin/mt/json/JSONObject;

.field public final ܽ:Ll/᩵᩻ۜ;


# direct methods
.method public constructor <init>(Ll/᩵᩻ۜ;)V
    .locals 0

    .line 23
    invoke-direct {p0}, Ll/ۙۛ᩻;-><init>()V

    .line 24
    iput-object p1, p0, Ll/᩶ܿۜ;->ܽ:Ll/᩵᩻ۜ;

    return-void
.end method

.method public static ֫(Ljava/lang/String;)Lbin/mt/json/JSONObject;
    .locals 4

    const-string v0, "{\n  \"variant\": {\n    \"type\": \"string\",\n    \"description\": \"Concrete configuration: default or canonical Android qualifiers with a leading hyphen, such as -en, -fr or -land. Do not pass *; equivalent aliases are rejected.\"\n  },\n  \"valueXml\": {\n    \"type\": \"string\"\n  }\n}\n"

    .line 106
    invoke-static {v0}, Ll/ۘܳ֨;->֫(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "properties"

    .line 117
    invoke-virtual {v0, v1}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "valueXml"

    invoke-virtual {v1, v2}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Complete single-entry XML in the valueXml format returned by mt_apk_resource_read, at most 1048576 UTF-16 code units. Do not use a resources wrapper or an item root. "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " On name-confused tables, use eight-digit hex IDs for app references and style attribute names; android: names remain accepted."

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v2, "description"

    invoke-virtual {v1, v2, p0}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    .line 121
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v1, "type"

    const-string v3, "array"

    invoke-virtual {p0, v1, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v1, "One or more new configurations for this resource, with no duplicate variants."

    .line 122
    invoke-virtual {p0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v1, "items"

    .line 123
    invoke-virtual {p0, v1, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final ֫()Lbin/mt/json/JSONObject;
    .locals 3

    .line 44
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "readOnlyHint"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ۗۛ᩻;)Lbin/mt/json/JSONObject;
    .locals 8

    .line 78
    iget-object v0, p1, Ll/ۗۛ᩻;->᩶:Lbin/mt/json/JSONObject;

    .line 79
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "workspaceId"

    .line 0
    invoke-static {v0, v2, v1, v2}, Ll/ܽ᩷ᩳ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "editSessionId"

    invoke-static {v0, v2, v1, v2}, Ll/ܽ᩷ᩳ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "failedAddIndex"

    .line 82
    invoke-virtual {v0, v2}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 105
    invoke-virtual {v3}, Lbin/mt/json/JSONValue;->isNumber()Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_0
    sget-object v3, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    .line 82
    :goto_0
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "failedValueIndex"

    .line 83
    invoke-virtual {v0, v2}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 105
    invoke-virtual {v3}, Lbin/mt/json/JSONValue;->isNumber()Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_1

    :cond_1
    sget-object v3, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    .line 83
    :goto_1
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "locator"

    .line 84
    invoke-virtual {v0, v2}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v3

    invoke-static {v3}, Ll/֨ۙ᩵;->ܽ(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONValue;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "variant"

    .line 0
    invoke-static {v0, v2, v1, v2}, Ll/ܽ᩷ᩳ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "availablePackageIds"

    .line 86
    invoke-virtual {v0, v2}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v3

    if-nez v3, :cond_2

    .line 87
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    goto :goto_2

    :cond_2
    new-instance v3, Lbin/mt/json/JSONArray;

    invoke-virtual {v0, v2}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v0

    invoke-direct {v3, v0}, Lbin/mt/json/JSONArray;-><init>(Lbin/mt/json/JSONArray;)V

    move-object v0, v3

    .line 86
    :goto_2
    invoke-virtual {v1, v2, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 88
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v1

    .line 89
    iget-object v2, p1, Ll/ۗۛ᩻;->ۗ:Lbin/mt/json/JSONArray;

    invoke-virtual {v2}, Lbin/mt/json/JSONArray;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lbin/mt/json/JSONValue;

    .line 90
    invoke-virtual {v3}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "purpose"

    const/4 v5, 0x0

    .line 91
    invoke-virtual {v3, v4, v5}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v6, "tool"

    .line 92
    invoke-virtual {v3, v6, v5}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "mt_apk_resource_read"

    .line 93
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    const-string v7, "retry"

    if-eqz v6, :cond_4

    const-string v6, "inspect"

    .line 94
    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_5

    .line 95
    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_5

    :cond_4
    const-string v6, "mt_apk_workspace_open"

    .line 96
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 97
    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 98
    :cond_5
    new-instance v4, Lbin/mt/json/JSONObject;

    invoke-direct {v4, v3}, Lbin/mt/json/JSONObject;-><init>(Lbin/mt/json/JSONObject;)V

    invoke-virtual {v1, v4}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto :goto_3

    .line 101
    :cond_6
    invoke-static {p1, v0, v1}, Ll/᩶ۛ᩻;->֫(Ll/ۗۛ᩻;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Lbin/mt/json/JSONObject;)Ll/۬ۛ᩻;
    .locals 1

    .line 149
    :try_start_0
    invoke-static {}, Ll/ܽۨ᩻;->֫()V

    .line 150
    invoke-static {p1}, Ll/᩹ܿۜ;->֫(Lbin/mt/json/JSONObject;)Ll/ܶ᩻ۜ;

    move-result-object p1

    .line 151
    iget-object v0, p0, Ll/᩶ܿۜ;->ܽ:Ll/᩵᩻ۜ;

    invoke-virtual {v0, p1}, Ll/᩵᩻ۜ;->֫(Ll/ܶ᩻ۜ;)Ll/ۛۜۜ;

    move-result-object p1

    .line 152
    sget v0, Ll/ۡۨ᩻;->֫:I

    .line 153
    new-instance v0, Ll/۬ۛ᩻;

    invoke-static {p1}, Ll/᩶ۛ᩻;->֫(Ll/ۛۜۜ;)Lbin/mt/json/JSONObject;

    move-result-object p1

    invoke-direct {v0, p1}, Ll/۬ۛ᩻;-><init>(Lbin/mt/json/JSONObject;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    move-exception p1

    .line 155
    sget v0, Ll/ۡۨ᩻;->֫:I

    .line 156
    throw p1
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    const-string v0, "Add new resources or missing variants to an APK edit session. Use kind=resource to allocate a new ID in an existing package, or kind=variant to add values to an existing resource locator. Requires an existing resources.arsc; missing types and configurations can be created. The whole batch succeeds or leaves the session unchanged. For kind=resource, an existing name in the selected package/type is a conflict; for kind=variant, an existing configuration on the target is a conflict, even when values match. Use mt_apk_resource_edit to change existing values. Adding attr resources or their variants is unsupported. IDs already present are preserved. File resource values only add resource-table records; add the corresponding ZIP entries separately. Follow the returned mt_apk_resource_read action to inspect the new values."

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    const-string v0, "Add APK Resource"

    return-object v0
.end method

.method public final ܽ()Lbin/mt/json/JSONObject;
    .locals 8

    .line 49
    iget-object v0, p0, Ll/᩶ܿۜ;->֫:Lbin/mt/json/JSONObject;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "{\n  \"kind\": {\n    \"type\": \"string\",\n    \"enum\": [\"resource\"],\n    \"description\": \"Create a new resource with an automatically allocated ID. Its name must be absent from the selected package/type; put all of its configurations in this values array.\"\n  },\n  \"packageId\": {\n    \"type\": \"string\",\n    \"description\": \"Existing package ID as 0x plus two hex digits, in 0x01..0xff. It is the first byte of a resource ID: resource:0x7f010000 belongs to package 0x7f. Use mt_apk_list with view=resource_table to discover resource locators.\"\n  }\n}\n"

    .line 52
    invoke-static {v0}, Ll/ۘܳ֨;->֫(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "{\n  \"kind\": {\n    \"type\": \"string\",\n    \"enum\": [\"variant\"],\n    \"description\": \"Add missing configurations to a resource already present before this call.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"Locator of a resource already present before this call, such as resource:0x7f010000. Each requested configuration must be absent on this resource.\"\n  }\n}\n"

    .line 65
    invoke-static {v1}, Ll/ۘܳ֨;->֫(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "properties"

    .line 78
    invoke-virtual {v0, v2}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "All values must use the same new name and resource type. The name starts with an ASCII letter or underscore, followed by ASCII letters, digits, underscores or dots. Roots bool, color, dimen, float, fraction, id, integer, plurals, string and style determine the type; array, string-array and integer-array use type array. For example: <string name=\'welcome_message\'>Welcome</string> or <id name=\'new_id\'/>. Roots path, reference, dynamic-reference, attribute, dynamic-attribute and complex require type=\'resource type\', for example <path type=\'drawable\' name=\'icon\'>res/drawable/icon.png</path>. An explicit type on other roots must agree with the inferred type. A type supplied for a generic root uses lowercase ASCII letters, digits or underscores, starts with a letter or underscore, and cannot end with a digit; custom types are supported."

    invoke-static {v4}, Ll/᩶ܿۜ;->֫(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "values"

    invoke-virtual {v3, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    const-string v3, "required"

    .line 80
    invoke-virtual {v0, v3}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v4

    invoke-virtual {v4, v5}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    .line 81
    invoke-virtual {v1, v2}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v6, "Read an existing configuration with mt_apk_resource_read and use its valueXml as a template. Keep the root name attribute unchanged. The resource type is inherited from the target; the root tag only determines the value format, so a drawable color value uses <color>. Any explicit type must match the target resource type."

    invoke-static {v6}, Ll/᩶ܿۜ;->֫(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    .line 83
    invoke-virtual {v1, v3}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v4

    invoke-virtual {v4, v5}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    const-string v4, "{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace ID returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Non-empty edit session ID returned by mt_apk_session_create.\"\n  }\n}\n"

    .line 84
    invoke-static {v4}, Ll/ۘܳ֨;->֫(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    iput-object v4, p0, Ll/᩶ܿۜ;->֫:Lbin/mt/json/JSONObject;

    .line 96
    invoke-virtual {v4, v2}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "description"

    const-string v5, "Non-empty atomic batch. Across all adds, values must total 1..200; around 20 is recommended. Where app name references are supported, values can reference resources added elsewhere in this batch."

    const-string v6, "type"

    const-string v7, "array"

    .line 0
    invoke-static {v6, v7, v4, v5}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 99
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v5

    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v6

    invoke-virtual {v6, v0}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object v0

    invoke-virtual {v0, v1}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object v0

    const-string v1, "anyOf"

    invoke-virtual {v5, v1, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "items"

    invoke-virtual {v4, v1, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "adds"

    .line 96
    invoke-virtual {v2, v1, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    .line 100
    iget-object v0, p0, Ll/᩶ܿۜ;->֫:Lbin/mt/json/JSONObject;

    invoke-virtual {v0, v3}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v0

    invoke-virtual {v0, v1}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    .line 101
    iget-object v0, p0, Ll/᩶ܿۜ;->֫:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ܿ()Lbin/mt/json/JSONObject;
    .locals 12

    .line 128
    iget-object v0, p0, Ll/᩶ܿۜ;->ۧ:Lbin/mt/json/JSONObject;

    if-nez v0, :cond_0

    .line 21
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "string"

    const-string v2, "Canonical variant; same order as input values[]."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "variant"

    .line 22
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "targetVersion"

    const-string v4, "Version after the whole batch. Copy unchanged when editing this locator and variant in the same session."

    const-string v5, "One newly added resource configuration."

    .line 0
    invoke-static {v0, v1, v4, v2, v5}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 24
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "integer"

    const-string v5, "0-based input adds[] index."

    .line 110
    invoke-static {v4, v5}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "index"

    .line 25
    invoke-virtual {v2, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v5, "Resource locator to use for subsequent read, edit or xref calls."

    .line 96
    invoke-static {v1, v5}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "locator"

    .line 26
    invoke-virtual {v2, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 27
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v7, "type"

    const-string v8, "array"

    invoke-virtual {v5, v7, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v9, "items"

    invoke-virtual {v5, v9, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v5, "values"

    invoke-virtual {v2, v5, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "One input add result."

    .line 24
    invoke-static {v0, v2}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 28
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v5, "Workspace ID for follow-up calls."

    .line 96
    invoke-static {v1, v5}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v10, "workspaceId"

    .line 29
    invoke-virtual {v2, v10, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v5, "Keep this non-empty session ID for reads, edits and build."

    .line 96
    invoke-static {v1, v5}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v11, "editSessionId"

    .line 30
    invoke-virtual {v2, v11, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 31
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v5

    invoke-virtual {v5, v7, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    invoke-virtual {v5, v9, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v5, "results"

    invoke-virtual {v2, v5, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Committed additions, in input adds[] order."

    .line 28
    invoke-static {v0, v2}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 32
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v5, "Workspace ID when known."

    .line 103
    invoke-static {v1, v5}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    .line 33
    invoke-virtual {v2, v10, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v5, "Edit session ID when known."

    .line 103
    invoke-static {v1, v5}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    .line 34
    invoke-virtual {v2, v11, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v5, "0-based adds[] index, or null for an error not tied to one add."

    .line 117
    invoke-static {v4, v5}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v10, "failedAddIndex"

    .line 35
    invoke-virtual {v2, v10, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v5, "0-based values[] index within the failed add, or null if no specific value failed."

    .line 117
    invoke-static {v4, v5}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "failedValueIndex"

    .line 36
    invoke-virtual {v2, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "Requested target or existing conflicting resource locator, when known; a requested target may be missing. Uncommitted new resources have no usable locator, so this field is null."

    .line 103
    invoke-static {v1, v4}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 37
    invoke-virtual {v2, v6, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "Rejected variant when known."

    .line 103
    invoke-static {v1, v4}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 38
    invoke-virtual {v2, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "description"

    const-string v4, "Existing package IDs for correcting a missing package, otherwise empty."

    .line 0
    invoke-static {v7, v8, v3, v4}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Package ID such as 0x7f."

    .line 96
    invoke-static {v1, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 41
    invoke-virtual {v3, v9, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "availablePackageIds"

    .line 39
    invoke-virtual {v2, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "A failed batch leaves the session unchanged."

    .line 32
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 43
    invoke-static {v1}, Ll/֫ۛ᩻;->ۧ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "inspect"

    .line 46
    invoke-static {}, Ll/ۧᩳܽ;->᩷()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "mt_apk_resource_read"

    .line 45
    invoke-static {v3, v4, v2}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 48
    invoke-static {}, Ll/ۧᩳܽ;->᩷()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "retry"

    .line 47
    invoke-static {v3, v4, v5}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "mt_apk_workspace_open"

    .line 50
    invoke-static {}, Ll/ۧᩳܽ;->ܳ()Lbin/mt/json/JSONObject;

    move-result-object v6

    .line 49
    invoke-static {v6, v4, v5}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const/4 v5, 0x3

    new-array v5, v5, [Lbin/mt/json/JSONObject;

    const/4 v6, 0x0

    aput-object v2, v5, v6

    const/4 v2, 0x1

    aput-object v3, v5, v2

    const/4 v2, 0x2

    aput-object v4, v5, v2

    const-string v2, "Success returns one action to read every added value; conflicts may offer a read of the existing resource."

    .line 43
    invoke-static {v2, v5}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Result for mt_apk_resource_add."

    .line 42
    invoke-static {v3, v0, v1, v2}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 129
    iput-object v0, p0, Ll/᩶ܿۜ;->ۧ:Lbin/mt/json/JSONObject;

    .line 131
    :cond_0
    iget-object v0, p0, Ll/᩶ܿۜ;->ۧ:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    const-string v0, "mt_apk_resource_add"

    return-object v0
.end method
