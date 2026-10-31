.class public final Ll/֫ۛ᩻;
.super Ljava/lang/Object;
.source "76WC"


# direct methods
.method public static ֫(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;
    .locals 6

    .line 245
    new-instance v0, Lbin/mt/json/JSONObject;

    invoke-direct {v0, p0}, Lbin/mt/json/JSONObject;-><init>(Lbin/mt/json/JSONObject;)V

    const-string v1, "description"

    .line 246
    invoke-virtual {v0, v1}, Lbin/mt/json/JSONObject;->remove(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    const-string v1, "properties"

    .line 247
    invoke-virtual {p0, v1}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 249
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 250
    invoke-virtual {v2}, Lbin/mt/json/JSONObject;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lbin/mt/json/JSONObject$Member;

    .line 251
    invoke-virtual {v4}, Lbin/mt/json/JSONObject$Member;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4}, Lbin/mt/json/JSONObject$Member;->getValue()Lbin/mt/json/JSONValue;

    move-result-object v4

    invoke-virtual {v4}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object v4

    invoke-static {v4}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v4

    invoke-virtual {v3, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    goto :goto_0

    .line 253
    :cond_0
    invoke-virtual {v0, v1, v3}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    :cond_1
    const-string v1, "items"

    .line 255
    invoke-virtual {p0, v1}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    if-eqz p0, :cond_2

    .line 256
    invoke-static {p0}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    :cond_2
    return-object v0
.end method

.method public static ֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;
    .locals 3

    .line 19
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "type"

    const-string v2, "object"

    .line 20
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "additionalProperties"

    const/4 v2, 0x0

    .line 21
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    if-eqz p1, :cond_0

    const-string v1, "description"

    .line 23
    invoke-virtual {v0, v1, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    :cond_0
    const-string p1, "properties"

    .line 25
    invoke-virtual {v0, p1, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p1

    .line 133
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v1

    .line 134
    invoke-virtual {p0}, Lbin/mt/json/JSONObject;->names()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 135
    invoke-virtual {v1, v2}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    goto :goto_0

    :cond_1
    const-string p0, "required"

    .line 26
    invoke-virtual {p1, p0, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public static ֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;
    .locals 2

    .line 235
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Tool to call."

    .line 236
    invoke-static {p1, v1}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v1, "tool"

    invoke-virtual {v0, v1, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v0, "Action purpose."

    .line 237
    invoke-static {p2, v0}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string v0, "purpose"

    invoke-virtual {p1, v0, p2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string p2, "Why this action is useful."

    const-string v0, "string"

    .line 96
    invoke-static {v0, p2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string v0, "description"

    .line 238
    invoke-virtual {p1, v0, p2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p1

    .line 239
    invoke-static {p0}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p2, "Copy these arguments unchanged. Parameter meanings are defined by the target tool inputSchema."

    .line 240
    invoke-virtual {p0, v0, p2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p2, "arguments"

    .line 239
    invoke-virtual {p1, p2, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const/4 p1, 0x0

    .line 235
    invoke-static {p0, p1}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;)Lbin/mt/json/JSONObject;
    .locals 3

    const-string v0, "array"

    const-string v1, "description"

    const-string v2, "type"

    .line 0
    invoke-static {v2, v0, v1, p0}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v0, "Unused nextActions item; this array is always empty."

    .line 228
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 227
    invoke-static {v1, v0}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "items"

    invoke-virtual {p0, v1, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;
    .locals 3

    .line 44
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Whether the tool call succeeded."

    const-string v2, "boolean"

    .line 124
    invoke-static {v2, v1}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "ok"

    .line 45
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "data"

    .line 46
    invoke-static {p1}, Ll/֫ۛ᩻;->ܽ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v0, "error"

    .line 47
    invoke-static {p2}, Ll/֫ۛ᩻;->ܽ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object p2

    invoke-virtual {p1, v0, p2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string p2, "nextActions"

    .line 48
    invoke-virtual {p1, p2, p3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p1

    .line 44
    invoke-static {p1, p0}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;
    .locals 1

    const-string v0, "string"

    .line 96
    invoke-static {v0, p1}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    .line 131
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    invoke-virtual {v0, p0}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object p0

    const-string v0, "enum"

    invoke-virtual {p1, v0, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;
    .locals 3

    .line 179
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Whether another page is available."

    const-string v2, "boolean"

    .line 124
    invoke-static {v2, v1}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "hasMore"

    .line 180
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Opaque cursor for mt_apk_continue, or null on the last page."

    const-string v2, "string"

    .line 103
    invoke-static {v2, v1}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "nextCursor"

    .line 181
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "integer"

    .line 110
    invoke-static {v1, p0}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v2, "returnedCount"

    .line 182
    invoke-virtual {v0, v2, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v0, "limitMax"

    .line 110
    invoke-static {v1, p1}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    .line 183
    invoke-virtual {p0, v0, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "totalAvailableCount"

    .line 117
    invoke-static {v1, p2}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p2

    .line 184
    invoke-virtual {p0, p1, p2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "Pagination metadata."

    .line 179
    invoke-static {p0, p1}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static varargs ֫(Ljava/lang/String;[Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;
    .locals 13

    .line 191
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 192
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 193
    array-length v2, p1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_3

    aget-object v4, p1, v3

    .line 195
    new-instance v5, Lbin/mt/json/JSONObject;

    const-string v6, "properties"

    invoke-virtual {v4, v6}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    invoke-direct {v5, v7}, Lbin/mt/json/JSONObject;-><init>(Lbin/mt/json/JSONObject;)V

    const-string v7, "purpose"

    .line 196
    invoke-virtual {v5, v7}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    .line 197
    invoke-virtual {v5, v7}, Lbin/mt/json/JSONObject;->remove(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    .line 198
    new-instance v9, Lbin/mt/json/JSONObject;

    invoke-direct {v9, v4}, Lbin/mt/json/JSONObject;-><init>(Lbin/mt/json/JSONObject;)V

    invoke-virtual {v9, v6, v5}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v9

    invoke-virtual {v9}, Lbin/mt/json/JSONValue;->toString()Ljava/lang/String;

    move-result-object v9

    .line 199
    invoke-virtual {v1, v9}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lbin/mt/json/JSONArray;

    const-string v11, "enum"

    if-nez v10, :cond_0

    .line 201
    new-instance v10, Lbin/mt/json/JSONArray;

    invoke-virtual {v8, v11}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v12

    invoke-direct {v10, v12}, Lbin/mt/json/JSONArray;-><init>(Lbin/mt/json/JSONArray;)V

    .line 202
    invoke-virtual {v1, v9, v10}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    new-instance v9, Lbin/mt/json/JSONObject;

    invoke-direct {v9, v8}, Lbin/mt/json/JSONObject;-><init>(Lbin/mt/json/JSONObject;)V

    invoke-virtual {v9, v11, v10}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v8

    invoke-virtual {v5, v7, v8}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    .line 205
    new-instance v8, Lbin/mt/json/JSONObject;

    invoke-virtual {v4, v6}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    invoke-direct {v8, v9}, Lbin/mt/json/JSONObject;-><init>(Lbin/mt/json/JSONObject;)V

    .line 206
    invoke-virtual {v5, v7}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    invoke-virtual {v8, v7, v5}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v5

    .line 207
    new-instance v7, Lbin/mt/json/JSONObject;

    invoke-direct {v7, v4}, Lbin/mt/json/JSONObject;-><init>(Lbin/mt/json/JSONObject;)V

    invoke-virtual {v7, v6, v5}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    invoke-virtual {v0, v4}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto :goto_2

    .line 209
    :cond_0
    invoke-virtual {v8, v11}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v4

    invoke-virtual {v4}, Lbin/mt/json/JSONArray;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lbin/mt/json/JSONValue;

    .line 210
    invoke-virtual {v10}, Lbin/mt/json/JSONArray;->values()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1

    invoke-virtual {v10, v5}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto :goto_1

    :cond_2
    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    :cond_3
    const-string p1, "array"

    const-string v1, "description"

    const-string v2, "type"

    .line 0
    invoke-static {v2, p1, v1, p0}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    .line 217
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v1, "anyOf"

    invoke-virtual {p1, v1, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v0, "items"

    invoke-virtual {p0, v0, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static varargs ֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;
    .locals 4

    const-string v0, "string"

    .line 96
    invoke-static {v0, p0}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    .line 35
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 36
    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, p1, v2

    .line 37
    invoke-virtual {v0, v3}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    const-string p1, "enum"

    .line 138
    invoke-virtual {p0, p1, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;
    .locals 5

    .line 55
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "string"

    const-string v2, "Business error code."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "code"

    .line 56
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Human-readable error message."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "message"

    .line 57
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "warning"

    const-string v3, "fatal"

    const-string v4, "info"

    filled-new-array {v4, v2, v3}, [Ljava/lang/String;

    move-result-object v2

    const-string v3, "info: informational condition; warning: expected or correctable rejection; fatal: blocking execution, access, or capability failure under current conditions, not a permanently impossible task. Use recoverable and retrySameArguments to decide recovery; severity alone does not determine retry."

    .line 58
    invoke-static {v3, v2}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "severity"

    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "boolean"

    const-string v3, "Whether this task has a correction path, possibly by correcting arguments or changing state. This does not imply retrying unchanged arguments, guarantee success, or authorize a different target, access, or destructive scope. nextActions may be empty when the correction requires caller judgment."

    .line 124
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "recoverable"

    .line 60
    invoke-virtual {v0, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "Whether retrying the same arguments is appropriate."

    .line 124
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "retrySameArguments"

    .line 61
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Invalid argument name, or null when not applicable."

    .line 103
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "argument"

    .line 62
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Invalid value as text: strings are returned unchanged; other non-null values are JSON-encoded. Null for JSON null or an unavailable value; use badValueType to distinguish them. Do not JSON-parse a string badValue."

    .line 103
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "badValue"

    .line 63
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Original invalid value JSON type: string, number, boolean, array, object, or null; null when not applicable."

    .line 103
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "badValueType"

    .line 64
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Allowed values as strings."

    .line 65
    invoke-static {v2}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "allowedValues"

    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "JSON-encoded example text, or null when not applicable."

    .line 103
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "example"

    .line 66
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "diagnostics"

    .line 67
    invoke-static {p0}, Ll/֫ۛ᩻;->ܽ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v0, "Tool error details when ok=false."

    .line 55
    invoke-static {p0, v0}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Ljava/lang/String;)Lbin/mt/json/JSONObject;
    .locals 3

    const-string v0, "array"

    const-string v1, "description"

    const-string v2, "type"

    .line 0
    invoke-static {v2, v0, v1, p0}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v0, "String value."

    const-string v1, "string"

    .line 96
    invoke-static {v1, v0}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "items"

    .line 267
    invoke-virtual {p0, v1, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;
    .locals 2

    .line 85
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v1

    invoke-virtual {v1, p0}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object p0

    const-string v1, "null"

    invoke-virtual {p0, v1}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object p0

    const-string v1, "type"

    invoke-virtual {v0, v1, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v0, "description"

    .line 87
    invoke-virtual {p0, v0, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    return-object p0
.end method

.method public static varargs ۧ(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;
    .locals 1

    .line 145
    invoke-static {p0, p1}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "string"

    const-string v0, "null"

    .line 147
    filled-new-array {p1, v0}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lbin/mt/json/JSON;->array([Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object p1

    const-string v0, "type"

    invoke-virtual {p0, v0, p1}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    const-string p1, "enum"

    .line 148
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object p1

    sget-object v0, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    invoke-virtual {p1, v0}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    return-object p0
.end method

.method public static ܽ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;
    .locals 2

    .line 34
    new-instance v0, Lbin/mt/json/JSONObject;

    invoke-direct {v0, p0}, Lbin/mt/json/JSONObject;-><init>(Lbin/mt/json/JSONObject;)V

    .line 35
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object p0

    const-string v1, "object"

    invoke-virtual {p0, v1}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object p0

    const-string v1, "null"

    invoke-virtual {p0, v1}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object p0

    const-string v1, "type"

    invoke-virtual {v0, v1, p0}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public static ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;
    .locals 2

    .line 74
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "type"

    invoke-virtual {v0, v1, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    if-eqz p1, :cond_0

    const-string v0, "description"

    .line 76
    invoke-virtual {p0, v0, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    :cond_0
    return-object p0
.end method
