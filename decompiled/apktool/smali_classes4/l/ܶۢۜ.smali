.class public final Ll/ܶۢۜ;
.super Ll/ۙۛ᩻;
.source "26X3"


# instance fields
.field public ֫:Lbin/mt/json/JSONObject;

.field public ۧ:Lbin/mt/json/JSONObject;

.field public final ܽ:Ll/۫ۢۜ;


# direct methods
.method public constructor <init>(Ll/۫ۢۜ;)V
    .locals 0

    .line 28
    invoke-direct {p0}, Ll/ۙۛ᩻;-><init>()V

    .line 29
    iput-object p1, p0, Ll/ܶۢۜ;->ܽ:Ll/۫ۢۜ;

    return-void
.end method

.method public static ֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 137
    invoke-static {p0, p1}, Ll/ܶۢۜ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 138
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    const-string v0, "Invalid "

    .line 139
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    invoke-static {p0, v0, p1}, Ll/ܶۢۜ;->֫(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method public static ֫(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 2

    .line 157
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    invoke-static {}, Ll/ܶۢۜ;->᩻()Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-static {p1, p2, p0, v0, v1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 127
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 128
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 131
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const-string v0, "Invalid string argument"

    .line 129
    invoke-static {p0, v0, p1}, Ll/ܶۢۜ;->֫(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method public static ᩻()Lbin/mt/json/JSONObject;
    .locals 7

    const-string v0, "workspaceId"

    const-string v1, "workspace1234"

    const-string v2, "direction"

    const-string v3, "workspace_to_local"

    .line 0
    invoke-static {v2, v3, v0, v1}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "editSessionId"

    const-string v2, ""

    .line 165
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-string v1, "zip_entry"

    const-string v2, "assets/data.bin"

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 166
    invoke-static/range {v1 .. v6}, Ll/۬ܳۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "locator"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "localPath"

    const-string v2, "copied/data.bin"

    .line 168
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "overwrite"

    const/4 v2, 0x0

    .line 169
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final ֫()Lbin/mt/json/JSONObject;
    .locals 3

    .line 49
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "readOnlyHint"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "destructiveHint"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ۗۛ᩻;)Lbin/mt/json/JSONObject;
    .locals 11

    .line 93
    iget-object v0, p1, Ll/ۗۛ᩻;->᩶:Lbin/mt/json/JSONObject;

    .line 94
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "direction"

    .line 0
    invoke-static {v0, v2, v1, v2}, Ll/ܽ᩷ᩳ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "workspaceId"

    invoke-static {v0, v2, v1, v2}, Ll/ܽ᩷ᩳ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "editSessionId"

    invoke-static {v0, v2, v1, v2}, Ll/ܽ᩷ᩳ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "locator"

    .line 110
    invoke-virtual {v0, v2}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    .line 111
    invoke-virtual {v3}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    const-string v3, "entryName"

    .line 114
    invoke-virtual {v0, v3, v4}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_2

    .line 115
    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    const/4 v9, 0x0

    const/4 v10, 0x0

    const-string v5, "zip_entry"

    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 147
    invoke-static/range {v5 .. v10}, Ll/۬ܳۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 118
    invoke-static {v3}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v3

    goto :goto_1

    .line 116
    :cond_2
    :goto_0
    sget-object v3, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    .line 98
    :goto_1
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "localPath"

    .line 0
    invoke-static {v0, v2, v1, v2}, Ll/ܽ᩷ᩳ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "changed"

    .line 100
    invoke-virtual {v0, v2}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v3

    const/4 v5, 0x0

    if-eqz v3, :cond_3

    .line 123
    invoke-virtual {v3}, Lbin/mt/json/JSONValue;->isBoolean()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-virtual {v3}, Lbin/mt/json/JSONValue;->asBoolean()Z

    move-result v3

    goto :goto_2

    :cond_3
    const/4 v3, 0x0

    .line 100
    :goto_2
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "operationMode"

    .line 0
    invoke-static {v0, v2, v1, v2}, Ll/ܽ᩷ᩳ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "stateKnown"

    .line 102
    invoke-virtual {v0, v2}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v3

    if-eqz v3, :cond_4

    .line 123
    invoke-virtual {v3}, Lbin/mt/json/JSONValue;->isBoolean()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-virtual {v3}, Lbin/mt/json/JSONValue;->asBoolean()Z

    move-result v3

    goto :goto_3

    :cond_4
    const/4 v3, 0x1

    .line 102
    :goto_3
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "warnings"

    .line 103
    invoke-virtual {v0, v2}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v3

    .line 133
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v6

    if-eqz v3, :cond_7

    .line 134
    invoke-virtual {v3}, Lbin/mt/json/JSONValue;->isArray()Z

    move-result v7

    if-nez v7, :cond_5

    goto :goto_5

    .line 137
    :cond_5
    invoke-virtual {v3}, Lbin/mt/json/JSONValue;->asArray()Lbin/mt/json/JSONArray;

    move-result-object v3

    invoke-virtual {v3}, Lbin/mt/json/JSONArray;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_6
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_7

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lbin/mt/json/JSONValue;

    .line 138
    invoke-virtual {v7}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v8

    if-eqz v8, :cond_6

    .line 139
    invoke-virtual {v7}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    goto :goto_4

    .line 103
    :cond_7
    :goto_5
    invoke-virtual {v1, v2, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "bytesCopied"

    .line 104
    invoke-virtual {v0, v2}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v3

    if-eqz v3, :cond_8

    .line 128
    invoke-virtual {v3}, Lbin/mt/json/JSONValue;->isNumber()Z

    move-result v6

    if-eqz v6, :cond_8

    goto :goto_6

    :cond_8
    sget-object v3, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    .line 104
    :goto_6
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "safeToRetry"

    .line 105
    invoke-virtual {v0, v2}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    if-eqz v0, :cond_9

    .line 123
    invoke-virtual {v0}, Lbin/mt/json/JSONValue;->isBoolean()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-virtual {v0}, Lbin/mt/json/JSONValue;->asBoolean()Z

    move-result v5

    .line 105
    :cond_9
    invoke-virtual {v1, v2, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 50
    iget-object v1, p1, Ll/ۗۛ᩻;->ۗ:Lbin/mt/json/JSONArray;

    .line 76
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v2

    .line 77
    invoke-virtual {v1}, Lbin/mt/json/JSONArray;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_a
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lbin/mt/json/JSONValue;

    .line 78
    invoke-virtual {v3}, Lbin/mt/json/JSONValue;->isObject()Z

    move-result v5

    if-nez v5, :cond_b

    goto :goto_7

    .line 81
    :cond_b
    invoke-virtual {v3}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "tool"

    .line 82
    invoke-virtual {v3, v5, v4}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "mt_apk_workspace_open"

    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_a

    const-string v5, "purpose"

    .line 84
    invoke-virtual {v3, v5, v4}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "retry"

    .line 83
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_a

    .line 85
    new-instance v5, Lbin/mt/json/JSONObject;

    invoke-direct {v5, v3}, Lbin/mt/json/JSONObject;-><init>(Lbin/mt/json/JSONObject;)V

    invoke-virtual {v2, v5}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto :goto_7

    .line 50
    :cond_c
    invoke-static {p1, v0, v2}, Ll/᩶ۛ᩻;->֫(Ll/ۗۛ᩻;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Lbin/mt/json/JSONObject;)Ll/۬ۛ᩻;
    .locals 17

    move-object/from16 v0, p1

    .line 91
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 92
    invoke-virtual/range {p1 .. p1}, Lbin/mt/json/JSONObject;->names()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const-string v4, "overwrite"

    const-string v5, "localPath"

    const-string v6, "locator"

    const-string v7, "editSessionId"

    const-string v8, "workspaceId"

    const-string v9, "direction"

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 93
    invoke-virtual {v9, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_0

    invoke-virtual {v8, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_0

    .line 94
    invoke-virtual {v7, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_0

    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_0

    .line 95
    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 96
    :cond_0
    invoke-virtual {v1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_0

    :cond_1
    const-string v1, "Invalid workspace entry copy argument"

    .line 98
    invoke-virtual {v0, v3}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    .line 97
    invoke-static {v0, v1, v3}, Ll/ܶۢۜ;->֫(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_2
    const-string v14, "localPath"

    const-string v15, "overwrite"

    const-string v10, "direction"

    const-string v11, "workspaceId"

    const-string v12, "editSessionId"

    const-string v13, "locator"

    .line 101
    filled-new-array/range {v10 .. v15}, [Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    :goto_1
    const/4 v10, 0x6

    if-ge v3, v10, :cond_4

    aget-object v10, v2, v3

    .line 103
    invoke-virtual {v1, v10}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_3

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    const-string v0, "Missing parameter: "

    .line 0
    invoke-static {v0, v10}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    .line 104
    invoke-static {v1, v0, v10}, Ll/ܶۢۜ;->֫(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 77
    :cond_4
    invoke-virtual {v0, v9}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v1

    const-string v2, "Invalid direction"

    if-eqz v1, :cond_9

    .line 111
    invoke-virtual {v1}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v3

    if-eqz v3, :cond_9

    .line 114
    invoke-virtual {v1}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v11

    const-string v3, "workspace_to_local"

    .line 115
    invoke-virtual {v3, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_6

    const-string v10, "local_to_edit_session"

    .line 116
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_5

    goto :goto_2

    .line 117
    :cond_5
    filled-new-array {v3, v10}, [Ljava/lang/String;

    move-result-object v0

    .line 118
    invoke-static {v0}, Lbin/mt/json/JSON;->array([Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 119
    invoke-static {}, Ll/ܶۢۜ;->᩻()Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 117
    invoke-static {v2, v9, v1, v0, v3}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 78
    :cond_6
    :goto_2
    invoke-static {v0, v8}, Ll/ܶۢۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 79
    invoke-static {v0, v7}, Ll/ܶۢۜ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 81
    invoke-static {v0, v6}, Ll/ܶۢۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 80
    invoke-static {v1}, Ll/۬ܳۜ;->ۖ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    .line 82
    invoke-static {v0, v5}, Ll/ܶۢۜ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    .line 147
    invoke-virtual {v0, v4}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    if-eqz v0, :cond_8

    .line 148
    invoke-virtual {v0}, Lbin/mt/json/JSONValue;->isBoolean()Z

    move-result v1

    if-eqz v1, :cond_8

    .line 151
    invoke-virtual {v0}, Lbin/mt/json/JSONValue;->asBoolean()Z

    move-result v16

    move-object/from16 v1, p0

    .line 84
    iget-object v10, v1, Ll/ܶۢۜ;->ܽ:Ll/۫ۢۜ;

    invoke-virtual/range {v10 .. v16}, Ll/۫ۢۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ll/۬ۢۜ;

    move-result-object v0

    .line 86
    new-instance v2, Ll/۬ۛ᩻;

    .line 36
    iget-object v11, v0, Ll/۬ۢۜ;->ܽ:Ljava/lang/String;

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-string v10, "zip_entry"

    const/4 v12, 0x0

    const/4 v13, 0x0

    .line 147
    invoke-static/range {v10 .. v15}, Ll/۬ܳۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 37
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v10

    iget-object v11, v0, Ll/۬ۢۜ;->֫:Ljava/lang/String;

    .line 38
    invoke-virtual {v10, v9, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    iget-object v10, v0, Ll/۬ۢۜ;->᩻:Ljava/lang/String;

    .line 39
    invoke-virtual {v9, v8, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    iget-object v12, v0, Ll/۬ۢۜ;->ۧ:Ljava/lang/String;

    .line 40
    invoke-virtual {v9, v7, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    .line 41
    invoke-virtual {v9, v6, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    iget-object v13, v0, Ll/۬ۢۜ;->ᩳ:Ljava/lang/String;

    .line 42
    invoke-virtual {v9, v5, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v9, "warnings"

    iget-object v14, v0, Ll/۬ۢۜ;->ܳ:Lbin/mt/json/JSONArray;

    .line 43
    invoke-virtual {v5, v9, v14}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v9, "size"

    iget-wide v14, v0, Ll/۬ۢۜ;->ܿ:J

    .line 44
    invoke-virtual {v5, v9, v14, v15}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 57
    invoke-virtual {v3, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    const-string v5, "inspect"

    if-eqz v3, :cond_7

    .line 58
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v3

    .line 61
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v6, "path"

    invoke-virtual {v4, v6, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v6, "mt_file_stat"

    const-string v7, "Inspect the copied local file at its normalized destination path."

    .line 58
    invoke-static {v4, v6, v5, v7}, Ll/ۤۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    invoke-virtual {v3, v4}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object v3

    goto :goto_3

    .line 63
    :cond_7
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v3

    .line 0
    invoke-static {v8, v10, v7, v12}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    .line 69
    invoke-virtual {v7, v6, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v6, "byteOffset"

    const/4 v7, 0x0

    .line 70
    invoke-virtual {v4, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v6, "maxBytes"

    const/16 v7, 0x100

    .line 71
    invoke-virtual {v4, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v6, "mt_apk_read_bytes"

    const-string v7, "Read back the first raw byte window from the committed edit-session entry."

    .line 63
    invoke-static {v4, v6, v5, v7}, Ll/ۤۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    invoke-virtual {v3, v4}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object v3

    .line 45
    :goto_3
    invoke-static {v0, v3}, Ll/᩶ۛ᩻;->֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 86
    invoke-direct {v2, v0}, Ll/۬ۛ᩻;-><init>(Lbin/mt/json/JSONObject;)V

    return-object v2

    :cond_8
    move-object/from16 v1, p0

    const-string v2, "Invalid boolean argument"

    .line 149
    invoke-static {v0, v2, v4}, Ll/ܶۢۜ;->֫(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 112
    :cond_9
    invoke-static {v1, v2, v9}, Ll/ܶۢۜ;->֫(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    const-string v0, "Copy the raw content of one ordinary zip_entry between an APK workspace and a local file, preserving the source. workspace_to_local reads the base APK when editSessionId=\"\" or the edited session otherwise; overwrite controls the local destination. local_to_edit_session requires a non-empty editSessionId and copies into the entry; overwrite controls replacement of an existing entry; a deleted entry can be recreated. localPath may be absolute or relative to Home and requires file access permission. Both directions reject classes*.dex, resources.arsc, AXML, and directories. ZIP metadata is not copied and text encoding is not changed. Large files are supported; disconnecting does not cancel a copy already in progress. Inspect failure diagnostics before retrying. After success, nextActions checks local file metadata or reads the first entry bytes; it does not verify complete content equality."

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    const-string v0, "Copy APK Entry"

    return-object v0
.end method

.method public final ܽ()Lbin/mt/json/JSONObject;
    .locals 5

    .line 54
    iget-object v0, p0, Ll/ܶۢۜ;->֫:Lbin/mt/json/JSONObject;

    if-nez v0, :cond_0

    .line 175
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "workspace_to_local"

    const-string v2, "local_to_edit_session"

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "workspace_to_local copies an entry view to localPath; local_to_edit_session copies localPath into an edit session and requires a non-empty editSessionId."

    .line 176
    invoke-static {v2, v1}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "direction"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "string"

    const-string v2, "Non-empty workspace id returned by mt_apk_workspace_open."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "workspaceId"

    .line 181
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "For workspace_to_local, pass an empty string to read the base workspace or a non-empty id to read that edit-session view. For local_to_edit_session, this must be a non-empty id returned by mt_apk_session_create."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "editSessionId"

    .line 183
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Exact ordinary zip_entry locator. classes*.dex, resources.arsc, AXML, and ZIP directory entries are rejected in both directions."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "locator"

    .line 185
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Non-empty absolute or Home-relative local source or destination path, selected by direction."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "localPath"

    .line 187
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "For workspace_to_local, true permits replacing an existing regular local file. For local_to_edit_session, true permits replacing an ordinary entry in the current session view; a tombstoned entry counts as missing."

    const-string v2, "boolean"

    const-string v3, "overwrite"

    const-string v4, "Arguments for mt_apk_copy_entry."

    .line 0
    invoke-static {v0, v2, v1, v3, v4}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 55
    iput-object v0, p0, Ll/ܶۢۜ;->֫:Lbin/mt/json/JSONObject;

    .line 57
    :cond_0
    iget-object v0, p0, Ll/ܶۢۜ;->֫:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ܿ()Lbin/mt/json/JSONObject;
    .locals 1

    .line 62
    iget-object v0, p0, Ll/ܶۢۜ;->ۧ:Lbin/mt/json/JSONObject;

    if-nez v0, :cond_0

    .line 63
    invoke-static {}, Ll/۠ۢۜ;->֫()Lbin/mt/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Ll/ܶۢۜ;->ۧ:Lbin/mt/json/JSONObject;

    .line 65
    :cond_0
    iget-object v0, p0, Ll/ܶۢۜ;->ۧ:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    const-string v0, "mt_apk_copy_entry"

    return-object v0
.end method
