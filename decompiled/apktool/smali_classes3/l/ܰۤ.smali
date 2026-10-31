.class public final Ll/ܰۤ;
.super Ljava/lang/Object;
.source "B5JX"


# direct methods
.method public static ֫()Lbin/mt/json/JSONObject;
    .locals 5

    const-string v0, "description"

    const-string v1, "Edit session prepare failures bound to locator. Success data describes current saved session failures. Error diagnostics describe prepare failures; use overlaySaved to distinguish saved text from rejected edits."

    const-string v2, "type"

    const-string v3, "array"

    .line 0
    invoke-static {v2, v3, v0, v1}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 117
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "string"

    const-string v3, "Failure text locator. Smali compile failures use dex_class because line and column are class-smali coordinates."

    .line 103
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "locator"

    .line 118
    invoke-virtual {v1, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "Dex class descriptor."

    .line 103
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "className"

    .line 119
    invoke-virtual {v1, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "Failure code."

    .line 103
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "errorCode"

    .line 120
    invoke-virtual {v1, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "Compiler error message."

    .line 103
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "message"

    .line 121
    invoke-virtual {v1, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "integer"

    const-string v3, "0-based line, or null."

    .line 117
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "line"

    .line 122
    invoke-virtual {v1, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "0-based column, or null."

    .line 117
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "column"

    .line 123
    invoke-virtual {v1, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "One edit session prepare failure."

    .line 117
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "items"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public static ֫(Ll/ܶۜۜ;)Lbin/mt/json/JSONObject;
    .locals 7

    .line 48
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "workspaceId"

    iget-object v2, p0, Ll/ܶۜۜ;->ۖ:Ljava/lang/String;

    .line 49
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "editSessionId"

    iget-object v2, p0, Ll/ܶۜۜ;->ۜ:Ljava/lang/String;

    .line 50
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "runBuildChecks"

    iget-boolean v2, p0, Ll/ܶۜۜ;->ܺ:Z

    .line 51
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "pendingCompileCount"

    iget v2, p0, Ll/ܶۜۜ;->ۡ:I

    .line 52
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "failedCount"

    iget v2, p0, Ll/ܶۜۜ;->᩷:I

    .line 53
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    iget-object v1, p0, Ll/ܶۜۜ;->ۢ:Ljava/util/ArrayList;

    .line 74
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v2

    .line 75
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֡ۜۜ;

    .line 76
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v4

    iget-object v5, v3, Ll/֡ۜۜ;->ۜ:Ljava/lang/String;

    iget-object v6, v3, Ll/֡ۜۜ;->᩻:Ljava/lang/String;

    .line 77
    invoke-static {v5, v6}, Ll/۬ܳۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v5

    const-string v6, "locator"

    invoke-virtual {v4, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "className"

    iget-object v6, v3, Ll/֡ۜۜ;->֫:Ljava/lang/String;

    .line 78
    invoke-virtual {v4, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "errorCode"

    iget-object v6, v3, Ll/֡ۜۜ;->ᩳ:Ljava/lang/String;

    .line 79
    invoke-virtual {v4, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "message"

    iget-object v6, v3, Ll/֡ۜۜ;->ܳ:Ljava/lang/String;

    .line 80
    invoke-virtual {v4, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 81
    iget-object v5, v3, Ll/֡ۜۜ;->ܿ:Ljava/lang/Integer;

    if-nez v5, :cond_0

    sget-object v5, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_1

    :cond_0
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static {v5}, Lbin/mt/json/JSON;->value(I)Lbin/mt/json/JSONValue;

    move-result-object v5

    :goto_1
    const-string v6, "line"

    invoke-virtual {v4, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 82
    iget-object v3, v3, Ll/֡ۜۜ;->ۧ:Ljava/lang/Integer;

    if-nez v3, :cond_1

    sget-object v3, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_2

    :cond_1
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-static {v3}, Lbin/mt/json/JSON;->value(I)Lbin/mt/json/JSONValue;

    move-result-object v3

    :goto_2
    const-string v5, "column"

    invoke-virtual {v4, v5, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 76
    invoke-virtual {v2, v3}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto :goto_0

    :cond_2
    const-string v1, "failures"

    .line 54
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "buildCheckStatus"

    iget-object v2, p0, Ll/ܶۜۜ;->ۧ:Ljava/lang/String;

    .line 55
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iget-object v1, p0, Ll/ܶۜۜ;->ᩳ:Ljava/util/ArrayList;

    .line 56
    invoke-static {v1}, Ll/֨ۙ᩵;->֫(Ljava/lang/Iterable;)Lbin/mt/json/JSONArray;

    move-result-object v1

    const-string v2, "changedDexEntries"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "changedClassCount"

    iget v2, p0, Ll/ܶۜۜ;->ܽ:I

    .line 57
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "deletedClassCount"

    iget v2, p0, Ll/ܶۜۜ;->ܳ:I

    .line 58
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    iget-object v1, p0, Ll/ܶۜۜ;->֫:Ljava/util/ArrayList;

    .line 59
    invoke-static {v1}, Ll/֨ۙ᩵;->֫(Ljava/lang/Iterable;)Lbin/mt/json/JSONArray;

    move-result-object v1

    const-string v2, "addedZipEntries"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iget-object v1, p0, Ll/ܶۜۜ;->ܿ:Ljava/util/ArrayList;

    .line 60
    invoke-static {v1}, Ll/֨ۙ᩵;->֫(Ljava/lang/Iterable;)Lbin/mt/json/JSONArray;

    move-result-object v1

    const-string v2, "changedZipEntries"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iget-object p0, p0, Ll/ܶۜۜ;->᩻:Ljava/util/ArrayList;

    .line 61
    invoke-static {p0}, Ll/֨ۙ᩵;->֫(Ljava/lang/Iterable;)Lbin/mt/json/JSONArray;

    move-result-object p0

    const-string v1, "deletedZipEntries"

    invoke-virtual {v0, v1, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    .line 37
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    invoke-static {p0, v0}, Ll/᩶ۛ᩻;->֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(I)V
    .locals 0

    if-ltz p0, :cond_0

    return-void

    .line 224
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0
.end method

.method public static ֫(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0

    if-eqz p0, :cond_0

    return-void

    .line 153
    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ljava/lang/String;Z)V
    .locals 0

    if-eqz p1, :cond_0

    return-void

    .line 51
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ۧ()Lbin/mt/json/JSONObject;
    .locals 10

    .line 88
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "string"

    const-string v2, "Workspace id used for this edit check."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "workspaceId"

    .line 89
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Edit session id used for this edit check."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "editSessionId"

    .line 90
    invoke-virtual {v0, v4, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "boolean"

    const-string v5, "Whether this call ran pre-build content checks."

    .line 124
    invoke-static {v2, v5}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "runBuildChecks"

    .line 91
    invoke-virtual {v0, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v5, "integer"

    const-string v7, "Number of edited Smali or AXML targets still awaiting validation."

    .line 110
    invoke-static {v5, v7}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v8, "pendingCompileCount"

    .line 92
    invoke-virtual {v0, v8, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v7, "Current Smali compile or AXML encode failure count."

    .line 110
    invoke-static {v5, v7}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v8, "failedCount"

    .line 93
    invoke-virtual {v0, v8, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 94
    invoke-static {}, Ll/ܰۤ;->֫()Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v8, "failures"

    invoke-virtual {v0, v8, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v7, "not_run means status only; passed means edited content preparation, changed entry reads, and Dex merge passed. This does not validate output paths, signing configuration, final APK packaging, or installability. Failed checks return an error envelope."

    .line 96
    invoke-static {v1, v7}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v9, "buildCheckStatus"

    .line 95
    invoke-virtual {v0, v9, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v7, "Dex entries rewritten or created during dex merge."

    .line 96
    invoke-static {v7}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v9, "changedDexEntries"

    invoke-virtual {v0, v9, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v7, "Modified or deleted class count included in the check."

    .line 110
    invoke-static {v5, v7}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v9, "changedClassCount"

    .line 97
    invoke-virtual {v0, v9, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v7, "Deleted class count included in the check."

    .line 110
    invoke-static {v5, v7}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v7, "deletedClassCount"

    .line 98
    invoke-virtual {v0, v7, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v5, "New AXML or ordinary ZIP entries added by the edit session."

    .line 99
    invoke-static {v5}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v7, "addedZipEntries"

    invoke-virtual {v0, v7, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v5, "Existing AXML or ordinary ZIP entries replaced by the edit session; resource patches appear here as resources.arsc."

    .line 100
    invoke-static {v5}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v7, "changedZipEntries"

    invoke-virtual {v0, v7, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v5, "Existing AXML or ordinary ZIP entries deleted by the edit session."

    .line 101
    invoke-static {v5}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v7, "deletedZipEntries"

    invoke-virtual {v0, v7, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v5, "Successful mt_apk_session_check data."

    .line 88
    invoke-static {v0, v5}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 105
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v7, "Workspace id, or null."

    .line 103
    invoke-static {v1, v7}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    .line 106
    invoke-virtual {v5, v3, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "Edit session id, or null."

    .line 103
    invoke-static {v1, v5}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 107
    invoke-virtual {v3, v4, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "Whether this request was accepted for pre-build content checks. Parameter parsing failures always return false."

    .line 124
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 108
    invoke-virtual {v1, v6, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "Only interpret for SMALI_COMPILE_FAILED_IN_SESSION or EDIT_TEXT_PREPARE_FAILED_IN_SESSION; true means the failing text was already saved in the edit session."

    .line 124
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "overlaySaved"

    .line 109
    invoke-virtual {v1, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 110
    invoke-static {}, Ll/ܰۤ;->֫()Lbin/mt/json/JSONObject;

    move-result-object v2

    invoke-virtual {v1, v8, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "mt_apk_session_check diagnostics."

    .line 105
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 30
    invoke-static {v1}, Ll/֫ۛ᩻;->ۧ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 129
    invoke-static {}, Ll/ۧᩳܽ;->ܳ()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "mt_apk_workspace_open"

    const-string v4, "retry"

    .line 128
    invoke-static {v2, v3, v4}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "mt_apk_read_text"

    .line 131
    invoke-static {}, Ll/ۧᩳܽ;->ۢ()Lbin/mt/json/JSONObject;

    move-result-object v5

    .line 130
    invoke-static {v5, v3, v4}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "mt_apk_read_bytes"

    .line 133
    invoke-static {}, Ll/ۧᩳܽ;->ۜ()Lbin/mt/json/JSONObject;

    move-result-object v6

    .line 132
    invoke-static {v6, v5, v4}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 135
    invoke-static {}, Ll/ۧᩳܽ;->ᩳ()Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "mt_apk_list"

    const-string v7, "verify_workspace"

    .line 134
    invoke-static {v5, v6, v7}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "mt_apk_dex_read_class_outline"

    .line 137
    invoke-static {}, Ll/ۧᩳܽ;->᩻()Lbin/mt/json/JSONObject;

    move-result-object v8

    .line 136
    invoke-static {v8, v6, v7}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const/4 v7, 0x5

    new-array v7, v7, [Lbin/mt/json/JSONObject;

    const/4 v8, 0x0

    aput-object v2, v7, v8

    const/4 v2, 0x1

    aput-object v3, v7, v2

    const/4 v2, 0x2

    aput-object v4, v7, v2

    const/4 v2, 0x3

    aput-object v5, v7, v2

    const/4 v2, 0x4

    aput-object v6, v7, v2

    const-string v2, "mt_apk_session_check success emits no follow-up actions; errors may return retry or workspace verification actions."

    .line 127
    invoke-static {v2, v7}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Result for mt_apk_session_check. data returns edit session status and optional pre-build content checks without producing an APK."

    .line 28
    invoke-static {v3, v0, v1, v2}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method
