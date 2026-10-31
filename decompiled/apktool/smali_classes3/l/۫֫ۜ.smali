.class public final Ll/۫֫ۜ;
.super Ljava/lang/Object;
.source "1761"


# direct methods
.method public static ֫(Ljava/lang/String;Ljava/util/List;)I
    .locals 2

    .line 1179
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۟ܺۢ;

    .line 1180
    iget-object v1, v1, Ll/۟ܺۢ;->ܳ:Ljava/lang/String;

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public static ֫(D)J
    .locals 3

    .line 0
    invoke-static {p0, p1}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {p0, p1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-nez v0, :cond_2

    const-wide/16 v0, 0x0

    cmpg-double v2, p0, v0

    if-gtz v2, :cond_0

    goto :goto_0

    :cond_0
    const-wide/high16 v0, 0x3ff4000000000000L    # 1.25

    mul-double p0, p0, v0

    const-wide/high16 v0, 0x43e0000000000000L    # 9.223372036854776E18

    cmpl-double v2, p0, v0

    if-ltz v2, :cond_1

    const-wide p0, 0x7fffffffffffffffL

    return-wide p0

    .line 1432
    :cond_1
    invoke-static {p0, p1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide p0

    double-to-long p0, p0

    return-wide p0

    :cond_2
    :goto_0
    const-wide/16 p0, 0x0

    return-wide p0
.end method

.method public static ֫(ILjava/lang/String;)Lbin/mt/json/JSONArray;
    .locals 3

    .line 1298
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 1299
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    if-gtz p0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    .line 1303
    :goto_0
    invoke-virtual {v0}, Lbin/mt/json/JSONArray;->size()I

    move-result v2

    if-ge v2, p0, :cond_2

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_2

    const/16 v2, 0xa

    .line 1304
    invoke-virtual {p1, v2, v1}, Ljava/lang/String;->indexOf(II)I

    move-result v2

    if-gez v2, :cond_1

    .line 1306
    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    return-object v0

    .line 1309
    :cond_1
    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    add-int/lit8 v1, v2, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-object v0
.end method

.method public static ֫(Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONArray;
    .locals 4

    .line 877
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 878
    invoke-virtual {p0}, Lbin/mt/json/JSONArray;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbin/mt/json/JSONValue;

    .line 879
    invoke-virtual {v1}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "tool"

    const/4 v3, 0x0

    .line 880
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "mt_apk_workspace_open"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 881
    new-instance v2, Lbin/mt/json/JSONObject;

    invoke-direct {v2, v1}, Lbin/mt/json/JSONObject;-><init>(Lbin/mt/json/JSONObject;)V

    invoke-virtual {v0, v2}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public static ֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;
    .locals 2

    const-string v0, "reason"

    const-string v1, "meaning"

    .line 0
    invoke-static {v0, p1, v1, p2}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string p2, "completionReason"

    .line 682
    invoke-virtual {p1, p2, p3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string p2, "warningCode"

    const-string p3, ""

    .line 683
    invoke-virtual {p0, p2, p3}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string p2, "warning"

    .line 684
    invoke-virtual {p0, p2, p3}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p2, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;
    .locals 4

    .line 2132
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "string"

    const-string v2, "Workspace id, or empty string when unavailable."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "workspaceId"

    .line 2133
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Edit session id, or empty string for base APK or unavailable context."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "editSessionId"

    .line 2134
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "zip_entry locator, or empty string when unavailable."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "locator"

    .line 2135
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Requested address kind, or empty string when unavailable."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "addressKind"

    .line 2136
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Parsed input address as lowercase 0x hex, or empty string when unavailable."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "address"

    .line 2137
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Requested instruction mode, or empty string when unavailable."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "instructionMode"

    .line 2138
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "reason"

    .line 96
    invoke-static {v1, p0}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    .line 2139
    invoke-virtual {v0, v2, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v0, "addressModeHint"

    .line 96
    invoke-static {v1, p1}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    .line 2140
    invoke-virtual {p0, v0, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "Instruction modes corresponding one-to-one with root nextActions retry actions, in the same order. Empty when no retry action is available."

    .line 2141
    invoke-static {p1}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v0, "retryInstructionModes"

    invoke-virtual {p0, v0, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;
    .locals 2

    const-string v0, "workspaceId"

    const-string v1, "editSessionId"

    .line 0
    invoke-static {v0, p0, v1, p1}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "locator"

    .line 611
    invoke-virtual {p0, p1, p2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/֡۟᩻;Ll/ۛܺۢ;)Lbin/mt/json/JSONObject;
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 206
    iget-object v2, v0, Ll/֡۟᩻;->ᩳ:Ljava/lang/String;

    iget-object v3, v0, Ll/֡۟᩻;->֫:Ljava/lang/String;

    iget-object v0, v0, Ll/֡۟᩻;->ܽ:Ljava/lang/String;

    invoke-static {v2, v3, v0}, Ll/۫֫ۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "type"

    iget-object v6, v1, Ll/ۛܺۢ;->֨:Ljava/lang/String;

    .line 207
    invoke-virtual {v4, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "arch"

    iget-object v6, v1, Ll/ۛܺۢ;->ۧ:Ljava/lang/String;

    .line 208
    invoke-virtual {v4, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "cpu"

    iget-object v6, v1, Ll/ۛܺۢ;->᩻:Ljava/lang/String;

    .line 209
    invoke-virtual {v4, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "machine"

    iget-object v6, v1, Ll/ۛܺۢ;->ۘ:Ljava/lang/String;

    .line 210
    invoke-virtual {v4, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "abi"

    iget-object v6, v1, Ll/ۛܺۢ;->֫:Ljava/lang/String;

    .line 211
    invoke-virtual {v4, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "os"

    iget-object v6, v1, Ll/ۛܺۢ;->᩵:Ljava/lang/String;

    .line 212
    invoke-virtual {v4, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "subsystem"

    iget-object v6, v1, Ll/ۛܺۢ;->ۚ:Ljava/lang/String;

    .line 213
    invoke-virtual {v4, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "interpreter"

    iget-object v6, v1, Ll/ۛܺۢ;->ۖ:Ljava/lang/String;

    .line 214
    invoke-virtual {v4, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "archBits"

    iget v6, v1, Ll/ۛܺۢ;->ᩳ:I

    .line 215
    invoke-virtual {v4, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "hasVirtualAddress"

    iget-boolean v6, v1, Ll/ۛܺۢ;->ۡ:Z

    .line 216
    invoke-virtual {v4, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "positionIndependent"

    iget-boolean v6, v1, Ll/ۛܺۢ;->֡:Z

    .line 217
    invoke-virtual {v4, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "nx"

    iget-boolean v6, v1, Ll/ۛܺۢ;->ᩴ:Z

    .line 218
    invoke-virtual {v4, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "canary"

    iget-boolean v6, v1, Ll/ۛܺۢ;->ܿ:Z

    .line 219
    invoke-virtual {v4, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v4

    iget-wide v5, v1, Ll/ۛܺۢ;->ܽ:J

    .line 220
    invoke-static {v5, v6}, Ll/۫֫ۜ;->֫(J)Lbin/mt/json/JSONValue;

    move-result-object v5

    const-string v6, "baseAddress"

    invoke-virtual {v4, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    iget-wide v5, v1, Ll/ۛܺۢ;->᩷:J

    .line 221
    invoke-static {v5, v6}, Ll/۫֫ۜ;->֫(J)Lbin/mt/json/JSONValue;

    move-result-object v5

    const-string v6, "entryVirtualAddress"

    invoke-virtual {v4, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    iget-wide v5, v1, Ll/ۛܺۢ;->ۜ:J

    .line 222
    invoke-static {v5, v6}, Ll/۫֫ۜ;->֫(J)Lbin/mt/json/JSONValue;

    move-result-object v5

    const-string v6, "entryFileOffset"

    invoke-virtual {v4, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    iget-wide v5, v1, Ll/ۛܺۢ;->ܺ:J

    .line 223
    invoke-static {v5, v6}, Ll/۫֫ۜ;->֫(J)Lbin/mt/json/JSONValue;

    move-result-object v5

    const-string v6, "initVirtualAddress"

    invoke-virtual {v4, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    iget-wide v5, v1, Ll/ۛܺۢ;->ۢ:J

    .line 224
    invoke-static {v5, v6}, Ll/۫֫ۜ;->֫(J)Lbin/mt/json/JSONValue;

    move-result-object v5

    const-string v6, "finiVirtualAddress"

    invoke-virtual {v4, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    iget-object v1, v1, Ll/ۛܺۢ;->ܳ:Ll/ۤܺۢ;

    .line 1039
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v5

    iget v6, v1, Ll/ۤܺۢ;->ܿ:I

    const-string v7, "neededLibraries"

    .line 1040
    invoke-virtual {v5, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v5

    iget v6, v1, Ll/ۤܺۢ;->᩻:I

    const-string v8, "sections"

    .line 1041
    invoke-virtual {v5, v8, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v5

    iget v9, v1, Ll/ۤܺۢ;->ۜ:I

    const-string v10, "segments"

    .line 1042
    invoke-virtual {v5, v10, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v5

    iget v11, v1, Ll/ۤܺۢ;->ܽ:I

    const-string v12, "imports"

    .line 1043
    invoke-virtual {v5, v12, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v5

    iget v13, v1, Ll/ۤܺۢ;->᩷:I

    const-string v14, "symbols"

    .line 1044
    invoke-virtual {v5, v14, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v5

    iget v15, v1, Ll/ۤܺۢ;->֫:I

    move/from16 p0, v6

    const-string v6, "entries"

    .line 1045
    invoke-virtual {v5, v6, v15}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v5

    move/from16 p1, v9

    iget v9, v1, Ll/ۤܺۢ;->ᩳ:I

    move/from16 v16, v11

    const-string v11, "initArray"

    .line 1046
    invoke-virtual {v5, v11, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v5

    move/from16 v17, v9

    iget v9, v1, Ll/ۤܺۢ;->ۧ:I

    move/from16 v18, v13

    const-string v13, "finiArray"

    .line 1047
    invoke-virtual {v5, v13, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v5

    move/from16 v19, v9

    iget v9, v1, Ll/ۤܺۢ;->ܳ:I

    move/from16 v20, v15

    const-string v15, "relocations"

    .line 1048
    invoke-virtual {v5, v15, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v15, "counts"

    .line 225
    invoke-virtual {v4, v15, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 937
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v5

    const/4 v15, 0x0

    move/from16 v21, v9

    :goto_0
    const/16 v9, 0x9

    if-ge v15, v9, :cond_9

    .line 938
    sget-object v9, Ll/ܶܺۢ;->֫:[Ljava/lang/String;

    aget-object v9, v9, v15

    .line 61
    invoke-static {v9}, Ll/ܶܺۢ;->ۧ(Ljava/lang/String;)V

    .line 62
    invoke-virtual {v7, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_0

    move-object/from16 v22, v7

    .line 63
    iget v7, v1, Ll/ۤܺۢ;->ܿ:I

    goto :goto_1

    :cond_0
    move-object/from16 v22, v7

    .line 64
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    move/from16 v7, p0

    goto :goto_1

    .line 66
    :cond_1
    invoke-virtual {v10, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    move/from16 v7, p1

    goto :goto_1

    .line 68
    :cond_2
    invoke-virtual {v12, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    move/from16 v7, v16

    goto :goto_1

    .line 70
    :cond_3
    invoke-virtual {v14, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    move/from16 v7, v18

    goto :goto_1

    .line 72
    :cond_4
    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    move/from16 v7, v20

    goto :goto_1

    .line 74
    :cond_5
    invoke-virtual {v11, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    move/from16 v7, v17

    goto :goto_1

    .line 76
    :cond_6
    invoke-virtual {v13, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    move/from16 v7, v19

    goto :goto_1

    :cond_7
    move/from16 v7, v21

    :goto_1
    if-gtz v7, :cond_8

    move-object/from16 v23, v1

    move-object/from16 v24, v6

    goto :goto_2

    :cond_8
    const-string v7, "Read first page of native "

    .line 942
    invoke-virtual {v7, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v23, v1

    .line 944
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    move-object/from16 v24, v6

    const-string v6, "workspaceId"

    .line 945
    invoke-virtual {v1, v6, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v6, "editSessionId"

    .line 946
    invoke-virtual {v1, v6, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v6, "locator"

    .line 947
    invoke-virtual {v1, v6, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v6, "itemKind"

    .line 948
    invoke-virtual {v1, v6, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v6, "namePrefix"

    const-string v9, ""

    .line 949
    invoke-virtual {v1, v6, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v6, "demangle"

    const/4 v9, 0x0

    .line 950
    invoke-virtual {v1, v6, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v6, "limit"

    const/16 v9, 0x64

    .line 951
    invoke-virtual {v1, v6, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v6, "mt_apk_native_list_items"

    const-string v9, "inspect"

    .line 942
    invoke-static {v1, v6, v9, v7}, Ll/ۤۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-virtual {v5, v1}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    :goto_2
    add-int/lit8 v15, v15, 0x1

    move-object/from16 v7, v22

    move-object/from16 v1, v23

    move-object/from16 v6, v24

    goto/16 :goto_0

    .line 226
    :cond_9
    invoke-static {v4, v5}, Ll/᩶ۛ᩻;->֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public static ֫(Ll/ۗ֫ۜ;)Lbin/mt/json/JSONObject;
    .locals 11

    .line 456
    iget-object v0, p0, Ll/ۗ֫ۜ;->֫:[B

    array-length v1, v0

    .line 457
    iget-object v2, p0, Ll/ۗ֫ۜ;->᩻:Ll/ܶ۟᩻;

    iget-object v3, v2, Ll/ܶ۟᩻;->ۡ:Ljava/lang/String;

    iget-object v4, v2, Ll/ܶ۟᩻;->ᩳ:Ljava/lang/String;

    iget-object v5, v2, Ll/ܶ۟᩻;->ۜ:Ljava/lang/String;

    invoke-static {v3, v4, v5}, Ll/۫֫ۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "addressKind"

    iget-object v8, v2, Ll/ܶ۟᩻;->ܽ:Ljava/lang/String;

    .line 459
    invoke-virtual {v6, v7, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "address"

    iget-object v8, v2, Ll/ܶ۟᩻;->ۧ:Ljava/lang/String;

    .line 460
    invoke-virtual {v6, v7, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    iget-wide v7, p0, Ll/ۗ֫ۜ;->ܽ:J

    .line 461
    invoke-static {v7, v8}, Ll/۫֫ۜ;->֫(J)Lbin/mt/json/JSONValue;

    move-result-object v7

    const-string v8, "effectiveAddress"

    invoke-virtual {v6, v8, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v6

    iget-object v7, p0, Ll/ۗ֫ۜ;->ܿ:Ll/ۘܺۢ;

    .line 462
    invoke-static {v7}, Ll/۫֫ۜ;->֫(Ll/ۘܺۢ;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v8, "mapping"

    invoke-virtual {v6, v8, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v6

    iget-wide v7, p0, Ll/ۗ֫ۜ;->ܳ:J

    .line 463
    invoke-static {v7, v8}, Ll/۫֫ۜ;->֫(J)Lbin/mt/json/JSONValue;

    move-result-object v9

    const-string v10, "patchedFileOffset"

    invoke-virtual {v6, v10, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v9, "textEncoding"

    const-string v10, "utf8"

    .line 464
    invoke-virtual {v6, v9, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    iget-object v9, v2, Ll/ܶ۟᩻;->ܳ:[B

    array-length v9, v9

    const-string v10, "expectedTextByteCount"

    .line 465
    invoke-virtual {v6, v10, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v6

    iget-object v9, v2, Ll/ܶ۟᩻;->ۢ:[B

    array-length v9, v9

    const-string v10, "replacementTextByteCount"

    .line 466
    invoke-virtual {v6, v10, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v9, "extraPaddingBytesConsumed"

    iget v10, p0, Ll/ۗ֫ۜ;->ᩳ:I

    .line 467
    invoke-virtual {v6, v9, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v9, "terminatorPreserved"

    iget-boolean v10, p0, Ll/ۗ֫ۜ;->ۜ:Z

    .line 468
    invoke-virtual {v6, v9, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v9, "bytesPatched"

    .line 469
    invoke-virtual {v6, v9, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    iget-object p0, p0, Ll/ۗ֫ۜ;->ۧ:[B

    .line 470
    invoke-static {p0}, Ll/ۙ۟᩻;->֫([B)Ljava/lang/String;

    move-result-object p0

    const-string v6, "beforeHex"

    invoke-virtual {v1, v6, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v1, "afterHex"

    .line 471
    invoke-static {v0}, Ll/ۙ۟᩻;->֫([B)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0, v1, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v1, "paddingMode"

    iget-object v2, v2, Ll/ܶ۟᩻;->᩷:Ljava/lang/String;

    .line 472
    invoke-virtual {p0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    .line 717
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v1

    .line 720
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v6, "workspaceId"

    .line 721
    invoke-virtual {v2, v6, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "editSessionId"

    .line 722
    invoke-virtual {v2, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "locator"

    .line 723
    invoke-virtual {v2, v3, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "byteOffset"

    long-to-int v4, v7

    .line 724
    invoke-virtual {v2, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "maxBytes"

    array-length v0, v0

    .line 725
    invoke-virtual {v2, v3, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "mt_apk_read_bytes"

    const-string v3, "inspect"

    const-string v4, "Read back the exact patched native string byte window"

    .line 717
    invoke-static {v0, v2, v3, v4}, Ll/ۤۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-virtual {v1, v0}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 473
    invoke-static {p0, v0}, Ll/᩶ۛ᩻;->֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ۗۛ᩻;)Lbin/mt/json/JSONObject;
    .locals 14

    .line 729
    invoke-static {p0}, Ll/ۜ֫ۜ;->ۧ(Ll/ۗۛ᩻;)Z

    move-result v0

    iget-object v1, p0, Ll/ۗۛ᩻;->᩶:Lbin/mt/json/JSONObject;

    const-string v2, "locator"

    const-string v3, "editSessionId"

    const-string v4, "workspaceId"

    const-string v5, "expectedHex"

    const-string v6, "message"

    const-string v7, "arch"

    const-string v8, "remainingBytes"

    const-string v9, "assembledBytes"

    const-string v10, "expectedBytes"

    const-string v11, "patchedFileOffset"

    if-nez v0, :cond_1

    .line 730
    invoke-virtual {v1, v11}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    if-nez v0, :cond_1

    .line 731
    invoke-virtual {v1, v10}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    if-nez v0, :cond_1

    .line 732
    invoke-virtual {v1, v9}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    if-nez v0, :cond_1

    .line 733
    invoke-virtual {v1, v8}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    if-nez v0, :cond_1

    .line 734
    invoke-virtual {v1, v7}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    if-nez v0, :cond_1

    .line 735
    invoke-virtual {v1, v6}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 520
    :cond_0
    sget-object v0, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto/16 :goto_2

    .line 740
    :cond_1
    :goto_0
    invoke-static {p0}, Ll/ۜ֫ۜ;->ۧ(Ll/ۗۛ᩻;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 741
    invoke-static {p0}, Ll/ۜ֫ۜ;->֫(Ll/ۗۛ᩻;)Lbin/mt/json/JSONObject;

    move-result-object v0

    goto :goto_1

    .line 791
    :cond_2
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 792
    invoke-static {v1, v4}, Ll/۫֫ۜ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v0, v4, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 793
    invoke-static {v1, v3}, Ll/۫֫ۜ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v0, v3, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 794
    invoke-static {v1, v2}, Ll/۫֫ۜ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v0, v2, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v12, "addressKind"

    .line 795
    invoke-static {v1, v12}, Ll/۫֫ۜ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v0, v12, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v12, "address"

    .line 796
    invoke-static {v1, v12}, Ll/۫֫ۜ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v0, v12, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v12, "instructionMode"

    .line 797
    invoke-static {v1, v12}, Ll/۫֫ۜ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v0, v12, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v12, "reason"

    const-string v13, ""

    .line 798
    invoke-virtual {v0, v12, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v12, "addressModeHint"

    .line 799
    invoke-virtual {v0, v12, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v12, "retryInstructionModes"

    .line 800
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v13

    invoke-virtual {v0, v12, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 743
    :goto_1
    invoke-static {v1, v11}, Ll/۫֫ۜ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v12

    invoke-virtual {v0, v11, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 744
    invoke-static {v1, v5}, Ll/۫֫ۜ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v11

    invoke-virtual {v0, v5, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v11, "actualHex"

    .line 745
    invoke-static {v1, v11}, Ll/۫֫ۜ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v12

    invoke-virtual {v0, v11, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 746
    invoke-static {v1, v10}, Ll/۫֫ۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v11

    invoke-virtual {v0, v10, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 747
    invoke-static {v1, v9}, Ll/۫֫ۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v10

    invoke-virtual {v0, v9, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v9, "paddingMode"

    .line 748
    invoke-static {v1, v9}, Ll/۫֫ۜ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v10

    invoke-virtual {v0, v9, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 749
    invoke-static {v1, v8}, Ll/۫֫ۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v9

    invoke-virtual {v0, v8, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v8, "instructionSet"

    .line 750
    invoke-static {v1, v8}, Ll/۫֫ۜ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v9

    invoke-virtual {v0, v8, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v8, "instructionWidth"

    .line 751
    invoke-static {v1, v8}, Ll/۫֫ۜ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v9

    invoke-virtual {v0, v8, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 752
    invoke-static {v1, v7}, Ll/۫֫ۜ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v8

    invoke-virtual {v0, v7, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v7, "bits"

    .line 753
    invoke-static {v1, v7}, Ll/۫֫ۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v8

    invoke-virtual {v0, v7, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 754
    invoke-static {v1, v6}, Ll/۫֫ۜ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v7

    invoke-virtual {v0, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 804
    :goto_2
    invoke-static {p0}, Ll/ۜ֫ۜ;->ۧ(Ll/ۗۛ᩻;)Z

    move-result v6

    iget-object v7, p0, Ll/ۗۛ᩻;->ۗ:Lbin/mt/json/JSONArray;

    if-eqz v6, :cond_3

    goto/16 :goto_5

    .line 807
    :cond_3
    invoke-static {v7}, Ll/۫֫ۜ;->֫(Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONArray;

    move-result-object v7

    .line 808
    invoke-virtual {v7}, Lbin/mt/json/JSONArray;->size()I

    move-result v6

    if-lez v6, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v6, "PATCH_EXPECTED_MISMATCH"

    .line 811
    iget-object v7, p0, Ll/ۗۛ᩻;->᩸:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_5

    .line 812
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v7

    goto/16 :goto_5

    .line 815
    :cond_5
    invoke-static {v1, v4}, Ll/۫֫ۜ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 816
    invoke-static {v1, v3}, Ll/۫֫ۜ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 817
    invoke-static {v1, v2}, Ll/۫֫ۜ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v9, "byteOffset"

    .line 908
    invoke-virtual {v1, v9}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v10

    const/4 v11, -0x1

    if-eqz v10, :cond_7

    .line 909
    invoke-virtual {v10}, Lbin/mt/json/JSONValue;->isNumber()Z

    move-result v12

    if-nez v12, :cond_6

    goto :goto_3

    .line 913
    :cond_6
    :try_start_0
    invoke-virtual {v10}, Lbin/mt/json/JSONValue;->asInt()I

    move-result v11
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    nop

    .line 819
    :cond_7
    :goto_3
    invoke-static {v1, v5}, Ll/۫֫ۜ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 820
    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_9

    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_9

    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_9

    if-ltz v11, :cond_9

    .line 821
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v5

    const/4 v10, 0x2

    if-ge v5, v10, :cond_8

    goto :goto_4

    .line 824
    :cond_8
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    div-int/2addr v1, v10

    const/4 v5, 0x1

    invoke-static {v5, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 825
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v5

    .line 0
    invoke-static {v4, v6, v3, v7}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 831
    invoke-virtual {v3, v2, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 832
    invoke-virtual {v2, v9, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "maxBytes"

    .line 833
    invoke-virtual {v2, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "mt_apk_read_bytes"

    const-string v3, "retry"

    const-string v4, "Read current bytes at the stale native patch window, then retry mt_apk_native_patch_instructions with refreshed expectedHex."

    .line 825
    invoke-static {v1, v2, v3, v4}, Ll/ۤۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-virtual {v5, v1}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object v7

    goto :goto_5

    .line 822
    :cond_9
    :goto_4
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v7

    .line 521
    :goto_5
    invoke-static {p0, v0, v7}, Ll/᩶ۛ᩻;->֫(Ll/ۗۛ᩻;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ۘܺۢ;)Lbin/mt/json/JSONObject;
    .locals 4

    .line 1568
    invoke-static {p0}, Ll/۫֫ۜ;->ܽ(Ll/ۘܺۢ;)V

    .line 1569
    iget-boolean v0, p0, Ll/ۘܺۢ;->ۧ:Z

    if-nez v0, :cond_0

    .line 1570
    invoke-static {}, Ll/۫֫ۜ;->ܽ()Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0

    .line 1572
    :cond_0
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "sectionName"

    iget-object v2, p0, Ll/ۘܺۢ;->᩷:Ljava/lang/String;

    .line 1573
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iget-wide v1, p0, Ll/ۘܺۢ;->ܺ:J

    .line 1574
    invoke-static {v1, v2}, Ll/۫֫ۜ;->֫(J)Lbin/mt/json/JSONValue;

    move-result-object v1

    const-string v2, "virtualAddress"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iget-wide v1, p0, Ll/ۘܺۢ;->ۜ:J

    .line 1575
    invoke-static {v1, v2}, Ll/۫֫ۜ;->֫(J)Lbin/mt/json/JSONValue;

    move-result-object v1

    const-string v2, "fileOffset"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iget-wide v1, p0, Ll/ۘܺۢ;->᩻:J

    .line 1576
    invoke-static {v1, v2}, Ll/۫֫ۜ;->֫(J)Lbin/mt/json/JSONValue;

    move-result-object v1

    const-string v2, "rangeOffset"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "size"

    iget-wide v2, p0, Ll/ۘܺۢ;->ۡ:J

    .line 1577
    invoke-virtual {v0, v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "isLoaded"

    iget-boolean v2, p0, Ll/ۘܺۢ;->ܳ:Z

    .line 1578
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "isExecutable"

    iget-boolean v2, p0, Ll/ۘܺۢ;->ܿ:Z

    .line 1579
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "segment"

    iget-boolean p0, p0, Ll/ۘܺۢ;->ۢ:Z

    .line 1580
    invoke-virtual {v0, v1, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ۙ֫ۜ;)Lbin/mt/json/JSONObject;
    .locals 19

    move-object/from16 v0, p0

    .line 428
    iget-object v1, v0, Ll/ۙ֫ۜ;->֫:[B

    array-length v2, v1

    .line 429
    iget-object v3, v0, Ll/ۙ֫ۜ;->ۢ:Ll/۠۟᩻;

    iget-object v4, v3, Ll/۠۟᩻;->ܺ:Ljava/lang/String;

    iget-object v5, v3, Ll/۠۟᩻;->ᩳ:Ljava/lang/String;

    iget-object v6, v3, Ll/۠۟᩻;->᩷:Ljava/lang/String;

    invoke-static {v4, v5, v6}, Ll/۫֫ۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    iget-object v8, v3, Ll/۠۟᩻;->ܽ:Ljava/lang/String;

    const-string v9, "addressKind"

    .line 431
    invoke-virtual {v7, v9, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    iget-object v8, v3, Ll/۠۟᩻;->ۧ:Ljava/lang/String;

    const-string v10, "address"

    .line 432
    invoke-virtual {v7, v10, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    iget-object v8, v3, Ll/۠۟᩻;->ۜ:Ljava/lang/String;

    const-string v11, "instructionMode"

    .line 433
    invoke-virtual {v7, v11, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    iget-object v8, v0, Ll/ۙ֫ۜ;->ۡ:Ljava/lang/String;

    const-string v12, "resolvedInstructionMode"

    .line 434
    invoke-virtual {v7, v12, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    iget-wide v12, v0, Ll/ۙ֫ۜ;->ܿ:J

    .line 435
    invoke-static {v12, v13}, Ll/۫֫ۜ;->֫(J)Lbin/mt/json/JSONValue;

    move-result-object v14

    const-string v15, "effectiveAddress"

    invoke-virtual {v7, v15, v14}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v7

    iget-object v14, v0, Ll/ۙ֫ۜ;->ۜ:Ll/ۘܺۢ;

    .line 436
    invoke-static {v14}, Ll/۫֫ۜ;->֫(Ll/ۘܺۢ;)Lbin/mt/json/JSONObject;

    move-result-object v14

    const-string v15, "mapping"

    invoke-virtual {v7, v15, v14}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v14, "arch"

    iget-object v15, v0, Ll/ۙ֫ۜ;->ۧ:Ljava/lang/String;

    .line 437
    invoke-virtual {v7, v14, v15}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v14, "archBits"

    iget v15, v0, Ll/ۙ֫ۜ;->ܽ:I

    .line 438
    invoke-virtual {v7, v14, v15}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v14, "instructionSet"

    iget-object v15, v0, Ll/ۙ֫ۜ;->ܳ:Ljava/lang/String;

    .line 439
    invoke-virtual {v7, v14, v15}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v14, "instructionWidth"

    iget-object v15, v0, Ll/ۙ֫ۜ;->᩻:Ljava/lang/String;

    .line 440
    invoke-virtual {v7, v14, v15}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v14, "patchedVirtualAddress"

    .line 441
    invoke-static {v12, v13}, Ll/۫֫ۜ;->֫(J)Lbin/mt/json/JSONValue;

    move-result-object v15

    invoke-virtual {v7, v14, v15}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v7

    iget-wide v14, v0, Ll/ۙ֫ۜ;->᩷:J

    move-object/from16 v16, v8

    .line 442
    invoke-static {v14, v15}, Ll/۫֫ۜ;->֫(J)Lbin/mt/json/JSONValue;

    move-result-object v8

    move-wide/from16 v17, v14

    const-string v14, "patchedFileOffset"

    invoke-virtual {v7, v14, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v8, "bytesPatched"

    .line 443
    invoke-virtual {v7, v8, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v8, "expectedHex"

    iget-object v14, v3, Ll/۠۟᩻;->᩻:Ljava/lang/String;

    .line 444
    invoke-virtual {v7, v8, v14}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    iget-object v0, v0, Ll/ۙ֫ۜ;->ᩳ:[B

    .line 445
    invoke-static {v0}, Ll/ۙ۟᩻;->֫([B)Ljava/lang/String;

    move-result-object v8

    const-string v14, "assembledHex"

    invoke-virtual {v7, v14, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v8, "afterHex"

    .line 446
    invoke-static {v1}, Ll/ۙ۟᩻;->֫([B)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v7, v8, v14}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v8, "paddingMode"

    iget-object v3, v3, Ll/۠۟᩻;->ۢ:Ljava/lang/String;

    .line 447
    invoke-virtual {v7, v8, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    array-length v0, v0

    sub-int/2addr v2, v0

    const-string v0, "nopBytesInserted"

    .line 448
    invoke-virtual {v3, v0, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 688
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v2

    .line 689
    array-length v1, v1

    const/16 v3, 0x10

    .line 690
    invoke-static {v3, v1}, Ljava/lang/Math;->max(II)I

    move-result v3

    const/16 v7, 0x1000

    invoke-static {v7, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 694
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v8, "workspaceId"

    .line 695
    invoke-virtual {v7, v8, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v14, "editSessionId"

    .line 696
    invoke-virtual {v7, v14, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v15, "locator"

    .line 697
    invoke-virtual {v7, v15, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    move-object/from16 p0, v0

    const-string v0, "virtual"

    .line 698
    invoke-virtual {v7, v9, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 699
    invoke-static {v12, v13}, Ll/ۙ۟᩻;->֫(J)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v10, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    move-object/from16 v7, v16

    .line 700
    invoke-virtual {v0, v11, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v7, "stopAtSymbolBoundary"

    const/4 v9, 0x0

    .line 701
    invoke-virtual {v0, v7, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v7, "maxBytes"

    .line 702
    invoke-virtual {v0, v7, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "maxInstructions"

    const/16 v9, 0x10

    .line 703
    invoke-virtual {v0, v3, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "mt_apk_native_disassemble"

    const-string v9, "inspect"

    const-string v10, "Disassemble the patched instruction window"

    .line 691
    invoke-static {v0, v3, v9, v10}, Ll/ۤۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-virtual {v2, v0}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    .line 707
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 708
    invoke-virtual {v0, v8, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 709
    invoke-virtual {v0, v14, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 710
    invoke-virtual {v0, v15, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "byteOffset"

    move-wide/from16 v4, v17

    long-to-int v5, v4

    .line 711
    invoke-virtual {v0, v3, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 712
    invoke-virtual {v0, v7, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "mt_apk_read_bytes"

    const-string v3, "Read back the exact patched byte window"

    .line 704
    invoke-static {v0, v1, v9, v3}, Ll/ۤۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-virtual {v2, v0}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-object/from16 v0, p0

    .line 449
    invoke-static {v0, v2}, Ll/᩶ۛ᩻;->֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public static ֫(Ll/ۚ۟᩻;Ll/ۘܺۢ;)Lbin/mt/json/JSONObject;
    .locals 11

    .line 259
    iget-object v0, p0, Ll/ۚ۟᩻;->᩻:Ljava/lang/String;

    iget-object v1, p0, Ll/ۚ۟᩻;->ᩳ:Ljava/lang/String;

    iget-object v2, p0, Ll/ۚ۟᩻;->ܳ:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ll/۫֫ۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "addressKind"

    iget-object v2, p0, Ll/ۚ۟᩻;->ܽ:Ljava/lang/String;

    .line 260
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "address"

    iget-object p0, p0, Ll/ۚ۟᩻;->ۧ:Ljava/lang/String;

    .line 261
    invoke-virtual {v0, v1, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    iget-boolean v0, p1, Ll/ۘܺۢ;->ۧ:Z

    const-string v1, "found"

    .line 262
    invoke-virtual {p0, v1, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object p0

    .line 1587
    invoke-static {p1}, Ll/۫֫ۜ;->ܽ(Ll/ۘܺۢ;)V

    .line 1588
    invoke-static {p1}, Ll/۫֫ۜ;->ۧ(Ll/ۘܺۢ;)V

    if-eqz v0, :cond_0

    .line 1589
    invoke-static {p1}, Ll/۫֫ۜ;->֫(Ll/ۘܺۢ;)Lbin/mt/json/JSONObject;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-static {}, Ll/۫֫ۜ;->ܽ()Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 1590
    :goto_0
    iget-object p1, p1, Ll/ۘܺۢ;->֫:Ll/ۖܺۢ;

    .line 1609
    iget-boolean v2, p1, Ll/ۖܺۢ;->ۧ:Z

    const-string v3, "size"

    const-string v4, "offset"

    const-string v5, "startFileOffset"

    const-string v6, "startVirtualAddress"

    const-string v7, "instructionMode"

    const-string v8, "demangledName"

    const-string v9, "name"

    if-nez v2, :cond_1

    .line 1610
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object p1

    const/4 v2, 0x0

    .line 1611
    invoke-virtual {p1, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v1, ""

    .line 1612
    invoke-virtual {p1, v9, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    .line 1613
    invoke-virtual {p1, v8, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    .line 1614
    invoke-virtual {p1, v7, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    sget-object v1, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    .line 1615
    invoke-virtual {p1, v6, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p1

    .line 1616
    invoke-virtual {p1, v5, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p1

    .line 1617
    invoke-virtual {p1, v4, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p1

    .line 1618
    invoke-virtual {p1, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p1

    goto :goto_1

    .line 1620
    :cond_1
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    const/4 v10, 0x1

    .line 1621
    invoke-virtual {v2, v1, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v1

    iget-object v2, p1, Ll/ۖܺۢ;->ᩳ:Ljava/lang/String;

    .line 1622
    invoke-virtual {v1, v9, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    iget-object v2, p1, Ll/ۖܺۢ;->֫:Ljava/lang/String;

    .line 1623
    invoke-virtual {v1, v8, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    iget-object v2, p1, Ll/ۖܺۢ;->ܽ:Ljava/lang/String;

    .line 1624
    invoke-virtual {v1, v7, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    iget-wide v7, p1, Ll/ۖܺۢ;->ۜ:J

    .line 1625
    invoke-static {v7, v8}, Ll/۫֫ۜ;->֫(J)Lbin/mt/json/JSONValue;

    move-result-object v2

    invoke-virtual {v1, v6, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    iget-wide v6, p1, Ll/ۖܺۢ;->᩻:J

    .line 1626
    invoke-static {v6, v7}, Ll/۫֫ۜ;->֫(J)Lbin/mt/json/JSONValue;

    move-result-object v2

    invoke-virtual {v1, v5, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    iget-wide v5, p1, Ll/ۖܺۢ;->ܿ:J

    .line 1627
    invoke-static {v5, v6}, Ll/۫֫ۜ;->֫(J)Lbin/mt/json/JSONValue;

    move-result-object v2

    invoke-virtual {v1, v4, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    iget-wide v4, p1, Ll/ۖܺۢ;->ܳ:J

    .line 1628
    invoke-virtual {v1, v3, v4, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object p1

    :goto_1
    const-string v1, "enclosingSymbol"

    .line 1590
    invoke-virtual {v0, v1, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v0, "mapping"

    .line 263
    invoke-virtual {p0, v0, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    .line 264
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object p1

    invoke-static {p0, p1}, Ll/᩶ۛ᩻;->֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ᩴ۟᩻;Ljava/lang/String;JLl/ۘܺۢ;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IIZLjava/util/List;Ll/۬֫ۜ;ZLbin/mt/json/JSONValue;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p13

    move/from16 v2, p14

    move-object/from16 v3, p15

    move-object/from16 v4, p16

    move-object/from16 v5, p17

    .line 333
    iget-object v6, v0, Ll/ᩴ۟᩻;->ۡ:Ljava/lang/String;

    iget-object v7, v0, Ll/ᩴ۟᩻;->ᩳ:Ljava/lang/String;

    iget-object v8, v0, Ll/ᩴ۟᩻;->᩻:Ljava/lang/String;

    invoke-static {v6, v7, v8}, Ll/۫֫ۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    iget-object v10, v0, Ll/ᩴ۟᩻;->ܽ:Ljava/lang/String;

    const-string v11, "addressKind"

    .line 334
    invoke-virtual {v9, v11, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    iget-object v10, v0, Ll/ᩴ۟᩻;->ۧ:Ljava/lang/String;

    const-string v12, "address"

    .line 335
    invoke-virtual {v9, v12, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    iget-object v10, v0, Ll/ᩴ۟᩻;->ܳ:Ljava/lang/String;

    const-string v13, "instructionMode"

    .line 336
    invoke-virtual {v9, v13, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    iget-boolean v10, v0, Ll/ᩴ۟᩻;->ۢ:Z

    const-string v14, "stopAtSymbolBoundary"

    .line 337
    invoke-virtual {v9, v14, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v9

    const-string v15, "resolvedInstructionMode"

    move-object/from16 v0, p1

    .line 338
    invoke-virtual {v9, v15, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v9, "effectiveAddress"

    .line 339
    invoke-static/range {p2 .. p3}, Ll/۫֫ۜ;->֫(J)Lbin/mt/json/JSONValue;

    move-result-object v15

    invoke-virtual {v0, v9, v15}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v9, "mapping"

    .line 340
    invoke-static/range {p4 .. p4}, Ll/۫֫ۜ;->֫(Ll/ۘܺۢ;)Lbin/mt/json/JSONObject;

    move-result-object v15

    invoke-virtual {v0, v9, v15}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 1635
    iget-boolean v9, v1, Ll/۬֫ۜ;->֫:Z

    const-string v15, "size"

    move/from16 v16, v10

    const-string v10, "offset"

    move-object/from16 v17, v14

    const-string v14, "endVirtualAddressExclusive"

    move-object/from16 v18, v13

    const-string v13, "startVirtualAddress"

    move-object/from16 v19, v12

    const-string v12, "demangledName"

    move-object/from16 v20, v11

    const-string v11, "name"

    move-object/from16 v21, v8

    const-string v8, "endReached"

    move-object/from16 v22, v7

    const-string v7, "applied"

    move-object/from16 v23, v6

    const-string v6, "requested"

    if-nez v9, :cond_0

    .line 1636
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v9

    iget-boolean v1, v1, Ll/۬֫ۜ;->᩻:Z

    .line 1637
    invoke-virtual {v9, v6, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v1

    const/4 v6, 0x0

    .line 1638
    invoke-virtual {v1, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 1639
    invoke-virtual {v1, v8, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v7, ""

    .line 1640
    invoke-virtual {v1, v11, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 1641
    invoke-virtual {v1, v12, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    sget-object v7, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    .line 1642
    invoke-virtual {v1, v13, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 1643
    invoke-virtual {v1, v14, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 1644
    invoke-virtual {v1, v10, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 1645
    invoke-virtual {v1, v15, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    goto :goto_0

    .line 1647
    :cond_0
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v9

    const/4 v5, 0x1

    .line 1648
    invoke-virtual {v9, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v6

    .line 1649
    invoke-virtual {v6, v7, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v5

    iget-boolean v6, v1, Ll/۬֫ۜ;->ܽ:Z

    .line 1650
    invoke-virtual {v5, v8, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v5

    iget-object v6, v1, Ll/۬֫ۜ;->ܿ:Ljava/lang/String;

    .line 1651
    invoke-virtual {v5, v11, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    iget-object v6, v1, Ll/۬֫ۜ;->ۧ:Ljava/lang/String;

    .line 1652
    invoke-virtual {v5, v12, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    iget-wide v6, v1, Ll/۬֫ۜ;->᩷:J

    .line 1653
    invoke-static {v6, v7}, Ll/۫֫ۜ;->֫(J)Lbin/mt/json/JSONValue;

    move-result-object v6

    invoke-virtual {v5, v13, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v5

    iget-wide v6, v1, Ll/۬֫ۜ;->ᩳ:J

    .line 1654
    invoke-static {v6, v7}, Ll/۫֫ۜ;->֫(J)Lbin/mt/json/JSONValue;

    move-result-object v6

    invoke-virtual {v5, v14, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v5

    iget-wide v6, v1, Ll/۬֫ۜ;->ܳ:J

    .line 1655
    invoke-static {v6, v7}, Ll/۫֫ۜ;->֫(J)Lbin/mt/json/JSONValue;

    move-result-object v6

    invoke-virtual {v5, v10, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v5

    iget-wide v6, v1, Ll/۬֫ۜ;->ۜ:J

    .line 1656
    invoke-virtual {v5, v15, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v1

    :goto_0
    const-string v5, "symbolBoundary"

    .line 341
    invoke-virtual {v0, v5, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "arch"

    move-object/from16 v5, p5

    .line 342
    invoke-virtual {v0, v1, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "archBits"

    move/from16 v5, p6

    .line 343
    invoke-virtual {v0, v1, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "instructionSet"

    move-object/from16 v5, p7

    .line 344
    invoke-virtual {v0, v1, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "instructionWidth"

    move-object/from16 v5, p8

    .line 345
    invoke-virtual {v0, v1, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "bytesRead"

    move/from16 v5, p9

    .line 346
    invoke-virtual {v0, v1, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "bytesConsumed"

    move/from16 v5, p10

    .line 347
    invoke-virtual {v0, v1, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "incompleteInstructionAtEnd"

    move/from16 v5, p11

    .line 348
    invoke-virtual {v0, v1, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 1677
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1678
    invoke-interface/range {p12 .. p12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩶֫ۜ;

    .line 1679
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v7

    if-lez v7, :cond_1

    const/16 v7, 0xa

    .line 1680
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1682
    :cond_1
    iget-wide v7, v6, Ll/᩶֫ۜ;->֫:J

    invoke-static {v7, v8}, Ll/ۙ۟᩻;->֫(J)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, ": "

    .line 1683
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v7, v6, Ll/᩶֫ۜ;->ۧ:Ljava/lang/String;

    .line 1684
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v7, 0x20

    .line 1685
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v6, v6, Ll/᩶֫ۜ;->ᩳ:Ljava/lang/String;

    .line 1686
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 1688
    :cond_2
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v5, "disassemblyText"

    .line 349
    invoke-virtual {v0, v5, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "instructionCount"

    .line 350
    invoke-interface/range {p12 .. p12}, Ljava/util/List;->size()I

    move-result v5

    invoke-virtual {v0, v1, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "hasMore"

    .line 351
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "nextAddressKind"

    .line 352
    invoke-virtual {v0, v1, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "nextAddress"

    .line 353
    invoke-virtual {v0, v1, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "nextInstructionMode"

    move-object/from16 v5, p17

    .line 354
    invoke-virtual {v0, v1, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 355
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v1

    if-eqz v2, :cond_3

    .line 360
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v6, "workspaceId"

    move-object/from16 v7, v23

    .line 361
    invoke-virtual {v2, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v6, "editSessionId"

    move-object/from16 v7, v22

    .line 362
    invoke-virtual {v2, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v6, "locator"

    move-object/from16 v7, v21

    .line 363
    invoke-virtual {v2, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    move-object/from16 v6, v20

    .line 364
    invoke-virtual {v2, v6, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    move-object/from16 v3, v19

    .line 365
    invoke-virtual {v2, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    move-object/from16 v3, v18

    .line 366
    invoke-virtual {v2, v3, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    move/from16 v3, v16

    move-object/from16 v4, v17

    .line 367
    invoke-virtual {v2, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "maxBytes"

    move-object/from16 v4, p0

    iget v5, v4, Ll/ᩴ۟᩻;->ۜ:I

    .line 368
    invoke-virtual {v2, v3, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "maxInstructions"

    iget v4, v4, Ll/ᩴ۟᩻;->᩷:I

    .line 369
    invoke-virtual {v2, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "mt_apk_native_disassemble"

    const-string v4, "continue"

    const-string v5, "Read the next contiguous instruction window"

    .line 358
    invoke-static {v2, v3, v4, v5}, Ll/ۤۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    invoke-virtual {v1, v2}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    .line 371
    :cond_3
    invoke-static {v0, v1}, Ll/᩶ۛ᩻;->֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public static ֫(Ll/᩵۟᩻;Ljava/lang/String;JLl/ۘܺۢ;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ll/ܿۖۢ;)Lbin/mt/json/JSONObject;
    .locals 41

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    move-object/from16 v8, p9

    .line 386
    iget-object v9, v0, Ll/᩵۟᩻;->ܳ:Ljava/lang/String;

    iget-object v10, v0, Ll/᩵۟᩻;->ۧ:Ljava/lang/String;

    iget-object v11, v0, Ll/᩵۟᩻;->ܽ:Ljava/lang/String;

    iget-object v12, v8, Ll/ܿۖۢ;->ܳ:Ljava/util/List;

    iget-object v13, v8, Ll/ܿۖۢ;->᩻:Ll/ܽۖۢ;

    iget-object v14, v8, Ll/ܿۖۢ;->᩷:Ljava/util/List;

    iget-object v15, v8, Ll/ܿۖۢ;->ᩳ:Ljava/util/List;

    .line 387
    iget-object v5, v0, Ll/᩵۟᩻;->ۡ:Ljava/lang/String;

    iget v6, v0, Ll/᩵۟᩻;->ۢ:I

    iget v3, v0, Ll/᩵۟᩻;->᩷:I

    iget v4, v0, Ll/᩵۟᩻;->ۜ:I

    iget-object v1, v0, Ll/᩵۟᩻;->᩻:Ljava/lang/String;

    iget-object v2, v0, Ll/᩵۟᩻;->ᩳ:Ljava/lang/String;

    move-object/from16 v16, v14

    iget-object v14, v0, Ll/᩵۟᩻;->ܺ:Ljava/lang/String;

    move-object/from16 v17, v12

    const-string v12, "summary"

    move-object/from16 v18, v15

    invoke-virtual {v12, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    move-object/from16 v19, v12

    .line 1345
    iget-object v12, v8, Ll/ܿۖۢ;->֫:Ll/ܰܺۢ;

    iget-object v8, v12, Ll/ܰܺۢ;->ܽ:Ljava/lang/String;

    iget v7, v12, Ll/ܰܺۢ;->᩻:I

    move/from16 v20, v15

    iget v15, v12, Ll/ܰܺۢ;->ܿ:I

    move/from16 v21, v15

    iget v15, v12, Ll/ܰܺۢ;->֫:I

    move-object/from16 v22, v9

    iget v9, v12, Ll/ܰܺۢ;->ۧ:I

    move-object/from16 v23, v12

    const-string v12, "max_analysis_bytes_reached"

    .line 1370
    invoke-virtual {v12, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v24

    move-object/from16 v25, v10

    const-string v10, "max_instructions_reached"

    move-object/from16 v26, v11

    const-string v11, "max_blocks_reached"

    const-wide/16 v27, 0x0

    move-object/from16 v29, v1

    if-nez v24, :cond_1

    .line 1371
    invoke-virtual {v11, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v24

    if-nez v24, :cond_1

    .line 1372
    invoke-virtual {v10, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_0

    goto :goto_0

    .line 1348
    :cond_0
    new-instance v1, Ll/᩹֫ۜ;

    iget v3, v0, Ll/᩵۟᩻;->ۜ:I

    iget v4, v0, Ll/᩵۟᩻;->᩷:I

    iget v0, v0, Ll/᩵۟᩻;->ۢ:I

    const/16 v35, 0x0

    const/16 v34, 0x0

    move-object/from16 v30, v1

    move/from16 v31, v3

    move/from16 v32, v4

    move/from16 v33, v0

    invoke-direct/range {v30 .. v35}, Ll/᩹֫ۜ;-><init>(IIIZZ)V

    move-object/from16 v34, v2

    move-object/from16 v32, v5

    move/from16 v24, v7

    move/from16 v33, v9

    move-object v9, v10

    move-object/from16 v30, v13

    move-object/from16 v31, v14

    move-object/from16 v10, v29

    move-object v2, v1

    move-object v1, v11

    move/from16 v29, v15

    goto/16 :goto_c

    :cond_1
    :goto_0
    const/16 v1, 0x10

    if-lt v9, v1, :cond_7

    const/4 v1, 0x1

    if-lt v7, v1, :cond_7

    if-ge v15, v1, :cond_2

    goto/16 :goto_4

    :cond_2
    move-object/from16 v24, v2

    .line 1421
    iget-wide v1, v13, Ll/ܽۖۢ;->ۜ:J

    cmp-long v30, v1, v27

    if-gtz v30, :cond_3

    .line 1398
    invoke-static {v0, v8}, Ll/۫֫ۜ;->֫(Ll/᩵۟᩻;Ljava/lang/String;)Ll/᩸֫ۜ;

    move-result-object v0

    move-object/from16 v32, v5

    move/from16 v33, v9

    move-object v9, v10

    move-object/from16 v35, v11

    move-object/from16 v30, v13

    move-object/from16 v31, v14

    move-object/from16 v34, v24

    move-object/from16 v10, v29

    move v11, v3

    move/from16 v24, v7

    move/from16 v29, v15

    move v7, v4

    move v15, v6

    goto/16 :goto_5

    :cond_3
    long-to-double v1, v1

    move-object/from16 v30, v13

    move-object/from16 v31, v14

    .line 1401
    invoke-static {v1, v2}, Ll/۫֫ۜ;->֫(D)J

    move-result-wide v13

    move-object/from16 v32, v5

    move/from16 v33, v6

    int-to-double v5, v7

    move-object/from16 v34, v10

    move-object/from16 v35, v11

    int-to-double v10, v9

    div-double v36, v5, v10

    mul-double v36, v36, v1

    move-wide/from16 v38, v13

    .line 1402
    invoke-static/range {v36 .. v37}, Ll/۫֫ۜ;->֫(D)J

    move-result-wide v13

    move/from16 v36, v3

    move/from16 v37, v4

    int-to-double v3, v15

    div-double v10, v3, v10

    mul-double v10, v10, v1

    long-to-double v1, v13

    div-double/2addr v3, v5

    mul-double v1, v1, v3

    .line 1404
    invoke-static {v10, v11, v1, v2}, Ljava/lang/Math;->max(DD)D

    move-result-wide v1

    invoke-static {v1, v2}, Ll/۫֫ۜ;->֫(D)J

    move-result-wide v1

    .line 1407
    invoke-virtual {v12, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    const-wide/16 v4, 0x2

    if-eqz v3, :cond_4

    move/from16 v3, v37

    int-to-long v10, v3

    mul-long v10, v10, v4

    move-wide/from16 v4, v38

    .line 1408
    invoke-static {v4, v5, v10, v11}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    move v11, v9

    move/from16 v6, v36

    goto :goto_1

    :cond_4
    move-object/from16 v10, v35

    move/from16 v3, v37

    move-wide/from16 v37, v38

    .line 1409
    invoke-virtual {v10, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    move v11, v9

    move-object/from16 v35, v10

    move/from16 v6, v36

    int-to-long v9, v6

    mul-long v9, v9, v4

    .line 1410
    invoke-static {v1, v2, v9, v10}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    move-wide/from16 v4, v37

    :goto_1
    move/from16 v10, v33

    move-object/from16 v9, v34

    goto :goto_2

    :cond_5
    move v11, v9

    move-object/from16 v35, v10

    move-object/from16 v9, v34

    move/from16 v6, v36

    .line 1411
    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_6

    move/from16 v10, v33

    move-wide/from16 v33, v1

    int-to-long v1, v10

    mul-long v1, v1, v4

    .line 1412
    invoke-static {v13, v14, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    move-wide v13, v1

    move-wide/from16 v1, v37

    goto :goto_3

    :cond_6
    move/from16 v10, v33

    move-wide/from16 v33, v1

    move-wide/from16 v4, v37

    :goto_2
    move-wide/from16 v33, v1

    move-wide v1, v4

    :goto_3
    move-object/from16 v0, p0

    move-object/from16 v4, v24

    move-object/from16 v5, v29

    move/from16 v24, v7

    move/from16 v29, v10

    move v7, v3

    move-object v10, v4

    move-wide/from16 v3, v33

    move-object/from16 v34, v10

    move/from16 v33, v11

    move-object v10, v5

    move v11, v6

    move/from16 v40, v29

    move/from16 v29, v15

    move/from16 v15, v40

    move-wide v5, v13

    .line 1414
    invoke-static/range {v0 .. v6}, Ll/۫֫ۜ;->֫(Ll/᩵۟᩻;JJJ)Ll/᩸֫ۜ;

    move-result-object v0

    goto :goto_5

    :cond_7
    :goto_4
    move-object/from16 v34, v2

    move-object/from16 v32, v5

    move/from16 v24, v7

    move/from16 v33, v9

    move-object v9, v10

    move-object/from16 v35, v11

    move-object/from16 v30, v13

    move-object/from16 v31, v14

    move-object/from16 v10, v29

    move v11, v3

    move v7, v4

    move/from16 v29, v15

    move v15, v6

    .line 1354
    invoke-static {v0, v8}, Ll/۫֫ۜ;->֫(Ll/᩵۟᩻;Ljava/lang/String;)Ll/᩸֫ۜ;

    move-result-object v0

    .line 1356
    :goto_5
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v8}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/4 v2, -0x1

    sparse-switch v1, :sswitch_data_0

    :goto_6
    goto :goto_7

    :sswitch_0
    invoke-virtual {v8, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    goto :goto_6

    :cond_8
    const/4 v2, 0x2

    goto :goto_7

    :sswitch_1
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    goto :goto_6

    :cond_9
    const/4 v2, 0x1

    :goto_7
    move-object/from16 v1, v35

    goto :goto_8

    :sswitch_2
    move-object/from16 v1, v35

    invoke-virtual {v8, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_a

    goto :goto_8

    :cond_a
    const/4 v2, 0x0

    :goto_8
    packed-switch v2, :pswitch_data_0

    goto :goto_a

    .line 1358
    :pswitch_0
    iget v2, v0, Ll/᩸֫ۜ;->ۧ:I

    if-le v2, v7, :cond_b

    goto :goto_9

    .line 1361
    :pswitch_1
    iget v2, v0, Ll/᩸֫ۜ;->ᩳ:I

    if-le v2, v15, :cond_b

    goto :goto_9

    .line 1359
    :pswitch_2
    iget v2, v0, Ll/᩸֫ۜ;->ܽ:I

    if-le v2, v11, :cond_b

    :goto_9
    const/4 v2, 0x1

    const/4 v7, 0x1

    goto :goto_b

    :cond_b
    :goto_a
    const/4 v2, 0x0

    const/4 v7, 0x0

    .line 1364
    :goto_b
    new-instance v2, Ll/᩹֫ۜ;

    iget v4, v0, Ll/᩸֫ۜ;->ۧ:I

    iget v5, v0, Ll/᩸֫ۜ;->ܽ:I

    iget v6, v0, Ll/᩸֫ۜ;->ᩳ:I

    iget-boolean v8, v0, Ll/᩸֫ۜ;->֫:Z

    move-object v3, v2

    invoke-direct/range {v3 .. v8}, Ll/᩹֫ۜ;-><init>(IIIZZ)V

    :goto_c
    move-object/from16 v3, v31

    move-object/from16 v0, v34

    .line 389
    invoke-static {v3, v0, v10}, Ll/۫֫ۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "addressKind"

    move-object/from16 v6, v26

    .line 390
    invoke-virtual {v4, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v7, "address"

    move-object/from16 v8, v25

    .line 391
    invoke-virtual {v4, v7, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v11, "instructionMode"

    move-object/from16 v13, v22

    .line 392
    invoke-virtual {v4, v11, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v14, "outputMode"

    move-object/from16 v15, v32

    .line 393
    invoke-virtual {v4, v14, v15}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v15, "detailOmitted"

    move-object/from16 p0, v14

    move/from16 v14, v20

    .line 394
    invoke-virtual {v4, v15, v14}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v15, "resolvedInstructionMode"

    move-object/from16 v20, v11

    move/from16 v13, v24

    move-object/from16 v11, p1

    .line 395
    invoke-virtual {v4, v15, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v15, "effectiveAddress"

    .line 396
    invoke-static/range {p2 .. p3}, Ll/۫֫ۜ;->֫(J)Lbin/mt/json/JSONValue;

    move-result-object v11

    invoke-virtual {v4, v15, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v11, "mapping"

    .line 397
    invoke-static/range {p4 .. p4}, Ll/۫֫ۜ;->֫(Ll/ۘܺۢ;)Lbin/mt/json/JSONObject;

    move-result-object v15

    invoke-virtual {v4, v11, v15}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v11, "arch"

    move-object/from16 v15, p5

    .line 398
    invoke-virtual {v4, v11, v15}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v11, "archBits"

    move/from16 v15, p6

    .line 399
    invoke-virtual {v4, v11, v15}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v11, "instructionSet"

    move-object/from16 v15, p7

    .line 400
    invoke-virtual {v4, v11, v15}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v11, "instructionWidth"

    move-object/from16 v15, p8

    .line 401
    invoke-virtual {v4, v11, v15}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 402
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v11

    move-object/from16 v24, v7

    move-object/from16 v15, v30

    iget-wide v7, v15, Ll/ܽۖۢ;->᩻:J

    .line 403
    invoke-static {v7, v8}, Ll/۫֫ۜ;->֫(J)Lbin/mt/json/JSONValue;

    move-result-object v7

    const-string v8, "startVirtualAddress"

    invoke-virtual {v11, v8, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v7

    move-object v11, v5

    iget-wide v5, v15, Ll/ܽۖۢ;->ܿ:J

    .line 404
    invoke-static {v5, v6}, Ll/۫֫ۜ;->֫(J)Lbin/mt/json/JSONValue;

    move-result-object v5

    const-string v6, "startFileOffset"

    invoke-virtual {v7, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v7, "name"

    move-object/from16 p4, v11

    iget-object v11, v15, Ll/ܽۖۢ;->ᩳ:Ljava/lang/String;

    .line 405
    invoke-virtual {v5, v7, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v7, "demangledName"

    iget-object v11, v15, Ll/ܽۖۢ;->ܽ:Ljava/lang/String;

    .line 406
    invoke-virtual {v5, v7, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v7, "symbolSize"

    move-object/from16 v30, v10

    iget-wide v10, v15, Ll/ܽۖۢ;->ۜ:J

    .line 407
    invoke-virtual {v5, v7, v10, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v7, "startSource"

    iget-object v10, v15, Ll/ܽۖۢ;->ܳ:Ljava/lang/String;

    .line 408
    invoke-virtual {v5, v7, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v7, "boundarySource"

    iget-object v10, v15, Ll/ܽۖۢ;->ۧ:Ljava/lang/String;

    .line 409
    invoke-virtual {v5, v7, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    iget-wide v10, v15, Ll/ܽۖۢ;->֫:J

    .line 411
    invoke-static {v10, v11}, Ll/۫֫ۜ;->֫(J)Lbin/mt/json/JSONValue;

    move-result-object v7

    const-string v10, "boundaryEndVirtualAddress"

    .line 410
    invoke-virtual {v5, v10, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v7, "function"

    .line 402
    invoke-virtual {v4, v7, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "terminator"

    const-string v7, "instructionCount"

    const-string v10, "size"

    if-eqz v14, :cond_d

    .line 412
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v11

    :cond_c
    move-object/from16 v34, v0

    move-object/from16 v31, v2

    move-object/from16 v32, v3

    goto :goto_e

    .line 1052
    :cond_d
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v11

    .line 1053
    invoke-interface/range {v18 .. v18}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_d
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v31

    if-eqz v31, :cond_c

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v31

    move-object/from16 p5, v15

    move-object/from16 v15, v31

    check-cast v15, Ll/۟ܺۢ;

    move-object/from16 v34, v0

    .line 1054
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    move-object/from16 v31, v2

    move-object/from16 v32, v3

    iget-wide v2, v15, Ll/۟ܺۢ;->ܿ:J

    .line 1055
    invoke-static {v2, v3}, Ll/۫֫ۜ;->֫(J)Lbin/mt/json/JSONValue;

    move-result-object v2

    invoke-virtual {v0, v8, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iget-wide v2, v15, Ll/۟ܺۢ;->ᩳ:J

    .line 1056
    invoke-static {v2, v3}, Ll/۫֫ۜ;->֫(J)Lbin/mt/json/JSONValue;

    move-result-object v2

    invoke-virtual {v0, v6, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iget-wide v2, v15, Ll/۟ܺۢ;->ܽ:J

    .line 1057
    invoke-virtual {v0, v10, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v0

    iget v2, v15, Ll/۟ܺۢ;->ۧ:I

    .line 1058
    invoke-virtual {v0, v7, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    iget-object v2, v15, Ll/۟ܺۢ;->ܳ:Ljava/lang/String;

    .line 1059
    invoke-virtual {v0, v5, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "assemblyText"

    iget-object v3, v15, Ll/۟ܺۢ;->֫:Ljava/lang/String;

    .line 1060
    invoke-virtual {v0, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 1054
    invoke-virtual {v11, v0}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-object/from16 v15, p5

    move-object/from16 v2, v31

    move-object/from16 v3, v32

    move-object/from16 v0, v34

    goto :goto_d

    :goto_e
    const-string v0, "blocks"

    .line 412
    invoke-virtual {v4, v0, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    if-eqz v14, :cond_e

    .line 413
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v2

    move-object/from16 p7, v5

    move-object/from16 p6, v6

    goto :goto_10

    :cond_e
    move-object/from16 v2, p9

    iget-object v3, v2, Ll/ܿۖۢ;->ܿ:Ljava/util/List;

    .line 1066
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v4

    .line 1067
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_f
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_f

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/֫ۖۢ;

    .line 1068
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v15

    move-object/from16 p5, v3

    iget-wide v2, v11, Ll/֫ۖۢ;->֫:J

    .line 1069
    invoke-static {v2, v3}, Ll/۫֫ۜ;->֫(J)Lbin/mt/json/JSONValue;

    move-result-object v2

    const-string v3, "fromVirtualAddress"

    invoke-virtual {v15, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    move-object/from16 p7, v5

    move-object/from16 p6, v6

    iget-wide v5, v11, Ll/֫ۖۢ;->ܽ:J

    .line 1070
    invoke-static {v5, v6}, Ll/۫֫ۜ;->֫(J)Lbin/mt/json/JSONValue;

    move-result-object v3

    const-string v5, "toVirtualAddress"

    invoke-virtual {v2, v5, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "kind"

    iget-object v5, v11, Ll/֫ۖۢ;->ۧ:Ljava/lang/String;

    .line 1071
    invoke-virtual {v2, v3, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 1068
    invoke-virtual {v4, v2}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-object/from16 v3, p5

    move-object/from16 v6, p6

    move-object/from16 v5, p7

    move-object/from16 v2, p9

    goto :goto_f

    :cond_f
    move-object/from16 p7, v5

    move-object/from16 p6, v6

    move-object v2, v4

    :goto_10
    const-string v3, "edges"

    .line 413
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "reason"

    const-string v3, "targetVirtualAddress"

    const-string v4, "flowKind"

    const-string v5, "sourceVirtualAddress"

    if-eqz v14, :cond_11

    .line 414
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v6

    :cond_10
    move-object/from16 v35, v7

    move-object/from16 p8, v8

    move-object v8, v10

    goto :goto_12

    .line 1077
    :cond_11
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v6

    .line 1078
    invoke-interface/range {v17 .. v17}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_11
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_10

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ll/ۧۖۢ;

    move-object/from16 p5, v11

    .line 1079
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v11

    move-object/from16 v35, v7

    move-object/from16 p8, v8

    iget-wide v7, v15, Ll/ۧۖۢ;->ܽ:J

    .line 1080
    invoke-static {v7, v8}, Ll/۫֫ۜ;->֫(J)Lbin/mt/json/JSONValue;

    move-result-object v7

    invoke-virtual {v11, v5, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v7

    iget-object v8, v15, Ll/ۧۖۢ;->֫:Ljava/lang/String;

    .line 1081
    invoke-virtual {v7, v4, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    move-object v8, v10

    iget-wide v10, v15, Ll/ۧۖۢ;->ᩳ:J

    .line 1082
    invoke-static {v10, v11}, Ll/۫֫ۜ;->֫(J)Lbin/mt/json/JSONValue;

    move-result-object v10

    invoke-virtual {v7, v3, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v7

    iget-object v10, v15, Ll/ۧۖۢ;->ۧ:Ljava/lang/String;

    .line 1083
    invoke-virtual {v7, v2, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    .line 1079
    invoke-virtual {v6, v7}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-object/from16 v11, p5

    move-object v10, v8

    move-object/from16 v7, v35

    move-object/from16 v8, p8

    goto :goto_11

    :goto_12
    const-string v7, "externalFlows"

    .line 414
    invoke-virtual {v0, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    if-eqz v14, :cond_12

    .line 415
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v2

    goto :goto_14

    .line 1089
    :cond_12
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v6

    .line 1090
    invoke-interface/range {v16 .. v16}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_13
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_14

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ᩳۖۢ;

    .line 1091
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v11

    iget-wide v14, v10, Ll/ᩳۖۢ;->ᩳ:J

    .line 1092
    invoke-static {v14, v15}, Ll/۫֫ۜ;->֫(J)Lbin/mt/json/JSONValue;

    move-result-object v14

    invoke-virtual {v11, v5, v14}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v11

    iget-object v14, v10, Ll/ᩳۖۢ;->֫:Ljava/lang/String;

    .line 1093
    invoke-virtual {v11, v4, v14}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v11

    .line 1094
    iget-boolean v14, v10, Ll/ᩳۖۢ;->ۧ:Z

    if-eqz v14, :cond_13

    .line 1095
    iget-wide v14, v10, Ll/ᩳۖۢ;->ܿ:J

    invoke-static {v14, v15}, Ll/۫֫ۜ;->֫(J)Lbin/mt/json/JSONValue;

    move-result-object v14

    invoke-virtual {v11, v3, v14}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    .line 1097
    :cond_13
    iget-object v10, v10, Ll/ᩳۖۢ;->ܽ:Ljava/lang/String;

    invoke-virtual {v11, v2, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    .line 1098
    invoke-virtual {v6, v11}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto :goto_13

    :cond_14
    move-object v2, v6

    :goto_14
    const-string v3, "unresolvedFlows"

    .line 415
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 1104
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "controlFlowComplete"

    move-object/from16 v4, v23

    iget-boolean v5, v4, Ll/ܰܺۢ;->ᩳ:Z

    .line 1105
    invoke-virtual {v2, v3, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v2

    iget-object v3, v4, Ll/ܰܺۢ;->ܽ:Ljava/lang/String;

    const-string v5, "completionReason"

    .line 1106
    invoke-virtual {v2, v5, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v5, "meaning"

    .line 1107
    invoke-static {v3}, Ll/۫֫ۜ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v5, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "bytesAnalyzed"

    move/from16 v5, v33

    .line 1108
    invoke-virtual {v2, v3, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "instructionsAnalyzed"

    .line 1109
    invoke-virtual {v2, v3, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "analysisSummary"

    .line 416
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 1117
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "blockCount"

    move/from16 v5, v29

    .line 1118
    invoke-virtual {v2, v3, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "edgeCount"

    move/from16 v6, v21

    .line 1119
    invoke-virtual {v2, v3, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "externalFlowCount"

    iget v7, v4, Ll/ܰܺۢ;->ܳ:I

    .line 1120
    invoke-virtual {v2, v3, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "unresolvedFlowCount"

    iget v7, v4, Ll/ܰܺۢ;->ۜ:I

    .line 1121
    invoke-virtual {v2, v3, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 1128
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v7, "fallthrough"

    move-object/from16 v10, v18

    .line 1129
    invoke-static {v7, v10}, Ll/۫֫ۜ;->֫(Ljava/lang/String;Ljava/util/List;)I

    move-result v11

    invoke-virtual {v3, v7, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v7, "conditional_jump"

    .line 1130
    invoke-static {v7, v10}, Ll/۫֫ۜ;->֫(Ljava/lang/String;Ljava/util/List;)I

    move-result v11

    invoke-virtual {v3, v7, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v11, "jump"

    .line 1131
    invoke-static {v11, v10}, Ll/۫֫ۜ;->֫(Ljava/lang/String;Ljava/util/List;)I

    move-result v13

    invoke-virtual {v3, v11, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v11, "indirect_jump"

    .line 1132
    invoke-static {v11, v10}, Ll/۫֫ۜ;->֫(Ljava/lang/String;Ljava/util/List;)I

    move-result v13

    invoke-virtual {v3, v11, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v13, "return"

    .line 1133
    invoke-static {v13, v10}, Ll/۫֫ۜ;->֫(Ljava/lang/String;Ljava/util/List;)I

    move-result v14

    invoke-virtual {v3, v13, v14}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v14, "trap"

    .line 1134
    invoke-static {v14, v10}, Ll/۫֫ۜ;->֫(Ljava/lang/String;Ljava/util/List;)I

    move-result v15

    invoke-virtual {v3, v14, v15}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v14, "invalid"

    .line 1135
    invoke-static {v14, v10}, Ll/۫֫ۜ;->֫(Ljava/lang/String;Ljava/util/List;)I

    move-result v15

    invoke-virtual {v3, v14, v15}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v15, "budget_boundary"

    move-object/from16 p5, v8

    .line 1136
    invoke-static {v15, v10}, Ll/۫֫ۜ;->֫(Ljava/lang/String;Ljava/util/List;)I

    move-result v8

    invoke-virtual {v3, v15, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v8, "terminatorCounts"

    .line 1122
    invoke-virtual {v2, v8, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 1140
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v8, "target_not_executable"

    move-object/from16 v4, v16

    move-object/from16 v16, v13

    .line 1141
    invoke-static {v8, v4}, Ll/۫֫ۜ;->ۧ(Ljava/lang/String;Ljava/util/List;)I

    move-result v13

    invoke-virtual {v3, v8, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v13, "unaligned_or_overlapping_target"

    move-object/from16 v18, v8

    .line 1143
    invoke-static {v13, v4}, Ll/۫֫ۜ;->ۧ(Ljava/lang/String;Ljava/util/List;)I

    move-result v8

    .line 1142
    invoke-virtual {v3, v13, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v8, "instruction_mode_transition"

    move-object/from16 v21, v13

    .line 1145
    invoke-static {v8, v4}, Ll/۫֫ۜ;->ۧ(Ljava/lang/String;Ljava/util/List;)I

    move-result v13

    .line 1144
    invoke-virtual {v3, v8, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 1146
    invoke-static {v1, v4}, Ll/۫֫ۜ;->ۧ(Ljava/lang/String;Ljava/util/List;)I

    move-result v13

    invoke-virtual {v3, v1, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 1148
    invoke-static {v12, v4}, Ll/۫֫ۜ;->ۧ(Ljava/lang/String;Ljava/util/List;)I

    move-result v13

    .line 1147
    invoke-virtual {v3, v12, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 1150
    invoke-static {v9, v4}, Ll/۫֫ۜ;->ۧ(Ljava/lang/String;Ljava/util/List;)I

    move-result v13

    .line 1149
    invoke-virtual {v3, v9, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v13, "invalid_instruction"

    move-object/from16 v29, v9

    .line 1151
    invoke-static {v13, v4}, Ll/۫֫ۜ;->ۧ(Ljava/lang/String;Ljava/util/List;)I

    move-result v9

    invoke-virtual {v3, v13, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v9, "indirect_target"

    move-object/from16 v33, v13

    .line 1152
    invoke-static {v9, v4}, Ll/۫֫ۜ;->ۧ(Ljava/lang/String;Ljava/util/List;)I

    move-result v13

    invoke-virtual {v3, v9, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v13, "unresolvedReasonCounts"

    .line 1123
    invoke-virtual {v2, v13, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 1156
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v3

    if-nez v5, :cond_15

    move-object/from16 v36, v1

    move-object/from16 v37, v12

    goto :goto_15

    .line 1161
    :cond_15
    invoke-static {v7, v10}, Ll/۫֫ۜ;->֫(Ljava/lang/String;Ljava/util/List;)I

    move-result v7

    .line 1162
    invoke-static {v11, v10}, Ll/۫֫ۜ;->֫(Ljava/lang/String;Ljava/util/List;)I

    move-result v13

    move-object/from16 v36, v1

    .line 1163
    invoke-static {v15, v10}, Ll/۫֫ۜ;->֫(Ljava/lang/String;Ljava/util/List;)I

    move-result v1

    move-object/from16 v37, v12

    const/4 v12, 0x1

    if-le v5, v12, :cond_16

    if-nez v7, :cond_16

    if-nez v13, :cond_16

    add-int/lit8 v12, v5, -0x1

    if-ne v6, v12, :cond_16

    const-string v12, "observed_linear"

    .line 1166
    invoke-virtual {v3, v12}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    :cond_16
    if-gtz v7, :cond_17

    if-le v6, v5, :cond_18

    :cond_17
    const-string v6, "observed_branchy"

    .line 1169
    invoke-virtual {v3, v6}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    :cond_18
    if-gtz v13, :cond_19

    const/16 v6, 0x10

    if-lt v5, v6, :cond_1a

    const/4 v5, 0x4

    if-lt v1, v5, :cond_1a

    :cond_19
    const-string v1, "observed_dispatcher_like"

    .line 1172
    invoke-virtual {v3, v1}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    :cond_1a
    :goto_15
    const-string v1, "observedShapeHints"

    .line 1124
    invoke-virtual {v2, v1, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "observedGraphSummary"

    .line 417
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 1199
    invoke-static/range {p9 .. p9}, Ll/۫֫ۜ;->֫(Ll/ܿۖۢ;)Ll/۟ܺۢ;

    move-result-object v1

    .line 1200
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    if-eqz v1, :cond_1b

    const/4 v3, 0x1

    goto :goto_16

    :cond_1b
    const/4 v3, 0x0

    :goto_16
    const-string v5, "available"

    .line 1201
    invoke-virtual {v2, v5, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v2

    if-nez v1, :cond_1c

    .line 1202
    sget-object v3, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_17

    .line 1203
    :cond_1c
    iget-wide v5, v1, Ll/۟ܺۢ;->ܿ:J

    invoke-static {v5, v6}, Ll/۫֫ۜ;->֫(J)Lbin/mt/json/JSONValue;

    move-result-object v3

    :goto_17
    move-object/from16 v5, p8

    .line 1202
    invoke-virtual {v2, v5, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    if-nez v1, :cond_1d

    .line 1204
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v1

    goto :goto_18

    .line 1205
    :cond_1d
    iget-object v1, v1, Ll/۟ܺۢ;->֫:Ljava/lang/String;

    const/16 v3, 0x10

    invoke-static {v3, v1}, Ll/۫֫ۜ;->֫(ILjava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v1

    :goto_18
    const-string v3, "lines"

    .line 1204
    invoke-virtual {v2, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "entryPreview"

    .line 418
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 1225
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1226
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 1227
    invoke-static/range {p9 .. p9}, Ll/۫֫ۜ;->֫(Ll/ܿۖۢ;)Ll/۟ܺۢ;

    move-result-object v3

    invoke-static {v1, v2, v3}, Ll/۫֫ۜ;->֫(Ljava/util/ArrayList;Ljava/util/HashSet;Ll/۟ܺۢ;)V

    .line 1228
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1e
    :goto_19
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const/16 v7, 0x8

    if-eqz v6, :cond_21

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/۟ܺۢ;

    .line 1229
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v12

    if-lt v12, v7, :cond_1f

    goto :goto_1a

    .line 1232
    :cond_1f
    iget-object v7, v6, Ll/۟ܺۢ;->ܳ:Ljava/lang/String;

    invoke-virtual {v15, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_20

    invoke-virtual {v14, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_20

    .line 1233
    invoke-virtual {v11, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1e

    .line 1234
    :cond_20
    invoke-static {v1, v2, v6}, Ll/۫֫ۜ;->֫(Ljava/util/ArrayList;Ljava/util/HashSet;Ll/۟ܺۢ;)V

    goto :goto_19

    .line 1238
    :cond_21
    :goto_1a
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v3, v7, :cond_28

    .line 1241
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v6, 0x0

    :goto_1b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_28

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/۟ܺۢ;

    .line 1242
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v12

    if-lt v12, v7, :cond_22

    goto :goto_1e

    .line 1245
    :cond_22
    iget-wide v12, v11, Ll/۟ܺۢ;->ܿ:J

    iget-wide v14, v11, Ll/۟ܺۢ;->ܽ:J

    add-long/2addr v12, v14

    .line 1246
    :goto_1c
    invoke-interface/range {v17 .. v17}, Ljava/util/List;->size()I

    move-result v7

    if-ge v6, v7, :cond_23

    move-object/from16 v7, v17

    .line 1247
    invoke-interface {v7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ll/ۧۖۢ;

    iget-wide v14, v14, Ll/ۧۖۢ;->ܽ:J

    move-object/from16 p8, v8

    move-object/from16 v17, v9

    iget-wide v8, v11, Ll/۟ܺۢ;->ܿ:J

    cmp-long v38, v14, v8

    if-gez v38, :cond_24

    add-int/lit8 v6, v6, 0x1

    move-object/from16 v8, p8

    move-object/from16 v9, v17

    move-object/from16 v17, v7

    goto :goto_1c

    :cond_23
    move-object/from16 p8, v8

    move-object/from16 v7, v17

    move-object/from16 v17, v9

    .line 1251
    :cond_24
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v8

    if-ge v6, v8, :cond_25

    .line 1252
    invoke-interface {v7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ۧۖۢ;

    iget-wide v8, v8, Ll/ۧۖۢ;->ܽ:J

    cmp-long v14, v8, v12

    if-gez v14, :cond_25

    const/4 v8, 0x1

    goto :goto_1d

    :cond_25
    const/4 v8, 0x0

    .line 1253
    :goto_1d
    iget-object v9, v11, Ll/۟ܺۢ;->ܳ:Ljava/lang/String;

    move-object/from16 v12, v16

    invoke-virtual {v12, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_26

    if-eqz v8, :cond_27

    .line 1254
    :cond_26
    invoke-static {v1, v2, v11}, Ll/۫֫ۜ;->֫(Ljava/util/ArrayList;Ljava/util/HashSet;Ll/۟ܺۢ;)V

    :cond_27
    const/16 v8, 0x8

    move-object/from16 v8, p8

    move-object/from16 v16, v12

    move-object/from16 v9, v17

    move-object/from16 v17, v7

    const/16 v7, 0x8

    goto :goto_1b

    :cond_28
    :goto_1e
    move-object/from16 p8, v8

    move-object/from16 v17, v9

    .line 1259
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/16 v6, 0x8

    if-ge v3, v6, :cond_2a

    .line 1260
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v10}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 1261
    new-instance v6, Ll/۠֫ۜ;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 1262
    invoke-static {v6}, Ll/۠۬ᩴ;->comparingLong(Ljava/util/function/ToLongFunction;)Ljava/util/Comparator;

    move-result-object v6

    invoke-static {v6}, Ll/ܶ۬ᩴ;->reversed(Ljava/util/Comparator;)Ljava/util/Comparator;

    move-result-object v6

    new-instance v7, Ll/ܶ֫ۜ;

    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 1263
    invoke-static {v6, v7}, Ll/ܶ۬ᩴ;->thenComparingLong(Ljava/util/Comparator;Ljava/util/function/ToLongFunction;)Ljava/util/Comparator;

    move-result-object v6

    .line 1261
    invoke-static {v3, v6}, Ll/ۛ۬ᩴ;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 1264
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1f
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2a

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/۟ܺۢ;

    .line 1265
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v7

    const/16 v8, 0x8

    if-lt v7, v8, :cond_29

    goto :goto_20

    .line 1268
    :cond_29
    invoke-static {v1, v2, v6}, Ll/۫֫ۜ;->֫(Ljava/util/ArrayList;Ljava/util/HashSet;Ll/۟ܺۢ;)V

    goto :goto_1f

    .line 1271
    :cond_2a
    :goto_20
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v2

    .line 1272
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_21
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۟ܺۢ;

    .line 1273
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v6

    iget-wide v7, v3, Ll/۟ܺۢ;->ܿ:J

    .line 1274
    invoke-static {v7, v8}, Ll/۫֫ۜ;->֫(J)Lbin/mt/json/JSONValue;

    move-result-object v7

    invoke-virtual {v6, v5, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v6

    iget-wide v7, v3, Ll/۟ܺۢ;->ᩳ:J

    .line 1275
    invoke-static {v7, v8}, Ll/۫֫ۜ;->֫(J)Lbin/mt/json/JSONValue;

    move-result-object v7

    move-object/from16 v8, p6

    invoke-virtual {v6, v8, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v6

    iget-wide v9, v3, Ll/۟ܺۢ;->ܽ:J

    move-object/from16 v7, p5

    .line 1276
    invoke-virtual {v6, v7, v9, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v6

    iget v9, v3, Ll/۟ܺۢ;->ۧ:I

    move-object/from16 v10, v35

    .line 1277
    invoke-virtual {v6, v10, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v6

    iget-object v9, v3, Ll/۟ܺۢ;->ܳ:Ljava/lang/String;

    move-object/from16 v11, p7

    .line 1278
    invoke-virtual {v6, v11, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    iget-object v3, v3, Ll/۟ܺۢ;->֫:Ljava/lang/String;

    const/4 v9, 0x4

    .line 1279
    invoke-static {v9, v3}, Ll/۫֫ۜ;->֫(ILjava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v3

    const-string v9, "previewLines"

    invoke-virtual {v6, v9, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 1273
    invoke-virtual {v2, v3}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto :goto_21

    :cond_2b
    const-string v1, "notableBlocks"

    .line 419
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 1460
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v1

    move-object/from16 v2, v31

    .line 1461
    iget-boolean v3, v2, Ll/᩹֫ۜ;->ۧ:Z

    const-string v5, "maxInstructions"

    const-string v6, "locator"

    const-string v7, "editSessionId"

    const-string v8, "workspaceId"

    if-eqz v3, :cond_2d

    .line 1462
    iget-boolean v3, v2, Ll/᩹֫ۜ;->֫:Z

    if-eqz v3, :cond_2c

    const-string v3, "Retry CFG from the beginning with budgets clamped to public limits in summary mode; the new result replaces this partial graph and may still be incomplete."

    goto :goto_22

    :cond_2c
    const-string v3, "Retry CFG from the beginning with recommended budgets in summary mode; the new result replaces this partial graph."

    :goto_22
    move-object/from16 v10, v32

    move-object/from16 v9, v34

    .line 0
    invoke-static {v8, v10, v7, v9}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    move-object/from16 v11, v30

    .line 1470
    invoke-virtual {v4, v6, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    move-object/from16 v12, p4

    move-object/from16 v6, v26

    .line 1471
    invoke-virtual {v4, v12, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    move-object/from16 v13, v24

    move-object/from16 v6, v25

    .line 1472
    invoke-virtual {v4, v13, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    move-object/from16 v14, v20

    move-object/from16 v6, v22

    .line 1473
    invoke-virtual {v4, v14, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    move-object/from16 v7, p0

    move-object/from16 v6, v19

    .line 1474
    invoke-virtual {v4, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v6, "maxAnalysisBytes"

    iget v7, v2, Ll/᩹֫ۜ;->ܽ:I

    .line 1475
    invoke-virtual {v4, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v6, "maxBlocks"

    iget v7, v2, Ll/᩹֫ۜ;->ᩳ:I

    .line 1476
    invoke-virtual {v4, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v4

    iget v2, v2, Ll/᩹֫ۜ;->ܿ:I

    .line 1477
    invoke-virtual {v4, v5, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "mt_apk_native_analyze_control_flow"

    const-string v5, "retry"

    .line 1465
    invoke-static {v2, v4, v5, v3}, Ll/ۤۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    invoke-virtual {v1, v2}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto/16 :goto_29

    :cond_2d
    move-object/from16 v12, p4

    move-object/from16 v14, v20

    move-object/from16 v2, v23

    move-object/from16 v13, v24

    move-object/from16 v11, v30

    move-object/from16 v10, v32

    move-object/from16 v9, v34

    .line 1478
    iget-boolean v3, v2, Ll/ܰܺۢ;->ᩳ:Z

    if-nez v3, :cond_3a

    cmp-long v3, p2, v27

    if-ltz v3, :cond_3a

    .line 1501
    iget-object v2, v2, Ll/ܰܺۢ;->ܽ:Ljava/lang/String;

    .line 1502
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_23
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_39

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ᩳۖۢ;

    .line 1503
    iget-object v15, v4, Ll/ᩳۖۢ;->ܽ:Ljava/lang/String;

    .line 1519
    invoke-virtual {v2, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_2f

    move-object/from16 p0, v3

    :cond_2e
    move-object/from16 v3, p8

    goto :goto_24

    :cond_2f
    move-object/from16 p0, v3

    const-string v3, "unresolved_indirect_flow"

    .line 1522
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_30

    move-object/from16 v3, v17

    .line 1523
    invoke-virtual {v3, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    move-object/from16 v3, p8

    goto :goto_25

    :cond_30
    const-string v3, "invalid_control_flow_target"

    .line 1525
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_32

    move-object/from16 v3, v18

    .line 1526
    invoke-virtual {v3, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v16

    if-nez v16, :cond_2e

    move-object/from16 v3, v21

    .line 1527
    invoke-virtual {v3, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v16

    move-object/from16 v3, p8

    if-nez v16, :cond_31

    .line 1528
    invoke-virtual {v3, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_33

    :cond_31
    :goto_24
    const/4 v15, 0x1

    goto :goto_25

    :cond_32
    move-object/from16 v3, p8

    :cond_33
    const/4 v15, 0x0

    :goto_25
    if-nez v15, :cond_34

    move-object/from16 p8, v3

    move-object/from16 v3, p0

    goto :goto_23

    :cond_34
    move-object/from16 v15, v37

    .line 1370
    invoke-virtual {v15, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_36

    move-object/from16 v3, v36

    .line 1371
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_36

    move-object/from16 v3, v29

    .line 1372
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_35

    goto :goto_26

    :cond_35
    const/4 v3, 0x0

    goto :goto_27

    :cond_36
    :goto_26
    const/4 v3, 0x1

    :goto_27
    if-nez v3, :cond_37

    move-object/from16 v3, v33

    .line 1507
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_38

    :cond_37
    iget-boolean v2, v4, Ll/ᩳۖۢ;->ۧ:Z

    if-eqz v2, :cond_38

    .line 1508
    iget-wide v2, v4, Ll/ᩳۖۢ;->ܿ:J

    goto :goto_28

    .line 1510
    :cond_38
    iget-wide v2, v4, Ll/ᩳۖۢ;->ᩳ:J

    goto :goto_28

    :cond_39
    move-wide/from16 v2, p2

    .line 0
    :goto_28
    invoke-static {v8, v10, v7, v9}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 1486
    invoke-virtual {v4, v6, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v6, "virtual"

    .line 1487
    invoke-virtual {v4, v12, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 1488
    invoke-static {v2, v3}, Ll/ۙ۟᩻;->֫(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v13, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    move-object/from16 v3, p1

    .line 1489
    invoke-virtual {v2, v14, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "stopAtSymbolBoundary"

    const/4 v4, 0x0

    .line 1490
    invoke-virtual {v2, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "maxBytes"

    const/16 v4, 0x1000

    .line 1491
    invoke-virtual {v2, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v2

    const/16 v3, 0xc8

    .line 1492
    invoke-virtual {v2, v5, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "mt_apk_native_disassemble"

    const-string v4, "inspect"

    const-string v5, "Inspect a local instruction window because no larger CFG retry is available."

    .line 1480
    invoke-static {v2, v3, v4, v5}, Ll/ۤۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    invoke-virtual {v1, v2}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    .line 420
    :cond_3a
    :goto_29
    invoke-static {v0, v1}, Ll/᩶ۛ᩻;->֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x25ae482c -> :sswitch_2
        0x66a7a8b3 -> :sswitch_1
        0x7df35e96 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ֫(Ll/᩸۟᩻;Ll/᩸ܺۢ;Ljava/lang/String;)Lbin/mt/json/JSONObject;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    .line 235
    iget-object v3, v0, Ll/᩸۟᩻;->ܺ:Ljava/lang/String;

    if-eqz v2, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 236
    :goto_0
    iget-object v5, v0, Ll/᩸۟᩻;->ܳ:Ljava/lang/String;

    iget-object v6, v0, Ll/᩸۟᩻;->ۢ:Ljava/lang/String;

    iget-object v7, v0, Ll/᩸۟᩻;->ᩳ:Ljava/lang/String;

    iget-object v8, v0, Ll/᩸۟᩻;->᩷:Ljava/lang/String;

    invoke-static {v3, v7, v8}, Ll/۫֫ۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    iget-object v9, v1, Ll/᩸ܺۢ;->֫:Ljava/lang/String;

    iget-object v10, v1, Ll/᩸ܺۢ;->ۧ:Ljava/util/List;

    const-string v11, "itemKind"

    .line 237
    invoke-virtual {v8, v11, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v9, "namePrefix"

    .line 238
    invoke-virtual {v8, v9, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v9, "demangle"

    iget-boolean v11, v0, Ll/᩸۟᩻;->ܽ:Z

    .line 239
    invoke-virtual {v8, v9, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v9, "initArray"

    .line 920
    invoke-virtual {v9, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    const-string v11, "message"

    const-string v12, "code"

    if-nez v9, :cond_1

    const-string v9, "finiArray"

    .line 921
    invoke-virtual {v9, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 922
    :cond_1
    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_2

    const-string v5, "name_prefix_not_applicable"

    const-string v6, "This itemKind has no name field, so a non-empty namePrefix filters out every item; retry with namePrefix=\"\" to read the list."

    .line 0
    invoke-static {v12, v5, v11, v6}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    goto :goto_1

    :cond_2
    const-string v5, ""

    invoke-static {v12, v5, v11, v5}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    :goto_1
    const-string v6, "filterHint"

    .line 240
    invoke-virtual {v8, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v5

    .line 957
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v6

    .line 958
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_9

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/۠ܺۢ;

    .line 965
    instance-of v11, v9, Ll/᩹ܺۢ;

    const-string v12, "name"

    if-eqz v11, :cond_3

    .line 966
    check-cast v9, Ll/᩹ܺۢ;

    .line 967
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v11

    iget-object v9, v9, Ll/᩹ܺۢ;->֫:Ljava/lang/String;

    invoke-virtual {v11, v12, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    move-object/from16 v17, v3

    move/from16 v19, v4

    move-object/from16 v18, v7

    move-object/from16 v16, v8

    goto/16 :goto_3

    .line 968
    :cond_3
    instance-of v11, v9, Ll/ۗܺۢ;

    const-string v13, "size"

    const-string v14, "fileOffset"

    const-string v15, "virtualAddress"

    move-object/from16 v16, v8

    const-string v8, "type"

    if-eqz v11, :cond_4

    .line 969
    check-cast v9, Ll/ۗܺۢ;

    .line 970
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v11

    move-object/from16 v17, v3

    iget-object v3, v9, Ll/ۗܺۢ;->ᩳ:Ljava/lang/String;

    .line 971
    invoke-virtual {v11, v12, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    iget-object v11, v9, Ll/ۗܺۢ;->᩷:Ljava/lang/String;

    .line 972
    invoke-virtual {v3, v8, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v8, "arch"

    iget-object v11, v9, Ll/ۗܺۢ;->֫:Ljava/lang/String;

    .line 973
    invoke-virtual {v3, v8, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    iget-wide v11, v9, Ll/ۗܺۢ;->ۢ:J

    .line 974
    invoke-static {v11, v12}, Ll/۫֫ۜ;->֫(J)Lbin/mt/json/JSONValue;

    move-result-object v8

    invoke-virtual {v3, v15, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    iget-wide v11, v9, Ll/ۗܺۢ;->ܳ:J

    .line 975
    invoke-static {v11, v12}, Ll/۫֫ۜ;->֫(J)Lbin/mt/json/JSONValue;

    move-result-object v8

    invoke-virtual {v3, v14, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    iget-wide v11, v9, Ll/ۗܺۢ;->ۜ:J

    .line 976
    invoke-virtual {v3, v13, v11, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v8, "virtualSize"

    iget-wide v11, v9, Ll/ۗܺۢ;->ۡ:J

    .line 977
    invoke-virtual {v3, v8, v11, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v8, "permissions"

    iget-wide v11, v9, Ll/ۗܺۢ;->ܿ:J

    .line 978
    invoke-virtual {v3, v8, v11, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v8, "flags"

    iget-wide v11, v9, Ll/ۗܺۢ;->ܽ:J

    .line 979
    invoke-virtual {v3, v8, v11, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v8, "data"

    iget-boolean v11, v9, Ll/ۗܺۢ;->ۧ:Z

    .line 980
    invoke-virtual {v3, v8, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v8, "segment"

    iget-boolean v9, v9, Ll/ۗܺۢ;->᩻:Z

    .line 981
    invoke-virtual {v3, v8, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v9

    move/from16 v19, v4

    move-object/from16 v18, v7

    goto/16 :goto_3

    :cond_4
    move-object/from16 v17, v3

    .line 982
    instance-of v3, v9, Ll/ۚܺۢ;

    const-string v11, "imported"

    move-object/from16 v18, v7

    const-string v7, "className"

    const-string v0, "bind"

    const-string v2, "library"

    move/from16 v19, v4

    const-string v4, "demangledName"

    if-eqz v3, :cond_5

    .line 983
    check-cast v9, Ll/ۚܺۢ;

    .line 984
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    iget-object v13, v9, Ll/ۚܺۢ;->᩻:Ljava/lang/String;

    .line 985
    invoke-virtual {v3, v12, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    iget-object v12, v9, Ll/ۚܺۢ;->ܽ:Ljava/lang/String;

    .line 986
    invoke-virtual {v3, v4, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    iget-object v4, v9, Ll/ۚܺۢ;->ܳ:Ljava/lang/String;

    .line 987
    invoke-virtual {v3, v2, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    iget-object v3, v9, Ll/ۚܺۢ;->֫:Ljava/lang/String;

    .line 988
    invoke-virtual {v2, v0, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iget-object v2, v9, Ll/ۚܺۢ;->᩷:Ljava/lang/String;

    .line 989
    invoke-virtual {v0, v8, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iget-object v2, v9, Ll/ۚܺۢ;->ۧ:Ljava/lang/String;

    .line 990
    invoke-virtual {v0, v7, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "descriptor"

    iget-object v3, v9, Ll/ۚܺۢ;->ᩳ:Ljava/lang/String;

    .line 991
    invoke-virtual {v0, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "ordinal"

    iget-wide v3, v9, Ll/ۚܺۢ;->ۜ:J

    .line 992
    invoke-virtual {v0, v2, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "inSectionHeader"

    iget-boolean v3, v9, Ll/ۚܺۢ;->ܿ:Z

    .line 993
    invoke-virtual {v0, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    const/4 v2, 0x1

    .line 995
    invoke-virtual {v0, v11, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v9

    goto/16 :goto_3

    .line 996
    :cond_5
    instance-of v3, v9, Ll/ۨܺۢ;

    if-eqz v3, :cond_6

    .line 997
    check-cast v9, Ll/ۨܺۢ;

    .line 998
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    iget-object v1, v9, Ll/ۨܺۢ;->᩻:Ljava/lang/String;

    .line 999
    invoke-virtual {v3, v12, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    iget-object v3, v9, Ll/ۨܺۢ;->ᩳ:Ljava/lang/String;

    .line 1000
    invoke-virtual {v1, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    iget-object v3, v9, Ll/ۨܺۢ;->ܽ:Ljava/lang/String;

    .line 1001
    invoke-virtual {v1, v7, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    iget-object v3, v9, Ll/ۨܺۢ;->ܳ:Ljava/lang/String;

    .line 1002
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    iget-object v2, v9, Ll/ۨܺۢ;->֫:Ljava/lang/String;

    .line 1003
    invoke-virtual {v1, v0, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iget-object v1, v9, Ll/ۨܺۢ;->ۢ:Ljava/lang/String;

    .line 1004
    invoke-virtual {v0, v8, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iget-boolean v1, v9, Ll/ۨܺۢ;->ܿ:Z

    .line 1005
    invoke-virtual {v0, v11, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    iget-wide v1, v9, Ll/ۨܺۢ;->ۡ:J

    .line 1006
    invoke-static {v1, v2}, Ll/۫֫ۜ;->֫(J)Lbin/mt/json/JSONValue;

    move-result-object v1

    invoke-virtual {v0, v15, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iget-wide v1, v9, Ll/ۨܺۢ;->ۜ:J

    .line 1007
    invoke-static {v1, v2}, Ll/۫֫ۜ;->֫(J)Lbin/mt/json/JSONValue;

    move-result-object v1

    invoke-virtual {v0, v14, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iget-wide v1, v9, Ll/ۨܺۢ;->᩷:J

    .line 1008
    invoke-virtual {v0, v13, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "symbolBits"

    iget v2, v9, Ll/ۨܺۢ;->ۧ:I

    .line 1009
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v9

    goto/16 :goto_3

    .line 1010
    :cond_6
    instance-of v0, v9, Ll/֨ܺۢ;

    if-eqz v0, :cond_7

    .line 1011
    check-cast v9, Ll/֨ܺۢ;

    .line 1012
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "arrayName"

    iget-object v2, v9, Ll/֨ܺۢ;->ۧ:Ljava/lang/String;

    .line 1013
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "arrayIndex"

    iget v2, v9, Ll/֨ܺۢ;->֫:I

    .line 1014
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    iget-wide v1, v9, Ll/֨ܺۢ;->ܿ:J

    .line 1015
    invoke-static {v1, v2}, Ll/۫֫ۜ;->֫(J)Lbin/mt/json/JSONValue;

    move-result-object v1

    const-string v2, "slotVirtualAddress"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iget-wide v1, v9, Ll/֨ܺۢ;->ᩳ:J

    .line 1016
    invoke-static {v1, v2}, Ll/۫֫ۜ;->֫(J)Lbin/mt/json/JSONValue;

    move-result-object v1

    const-string v2, "slotFileOffset"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iget-wide v1, v9, Ll/֨ܺۢ;->ۜ:J

    .line 1017
    invoke-static {v1, v2}, Ll/۫֫ۜ;->֫(J)Lbin/mt/json/JSONValue;

    move-result-object v1

    const-string v2, "targetVirtualAddress"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iget-wide v1, v9, Ll/֨ܺۢ;->᩻:J

    .line 1018
    invoke-static {v1, v2}, Ll/۫֫ۜ;->֫(J)Lbin/mt/json/JSONValue;

    move-result-object v1

    const-string v2, "targetFileOffset"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "targetInstructionMode"

    iget-object v2, v9, Ll/֨ܺۢ;->ܳ:Ljava/lang/String;

    .line 1019
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "pointerSize"

    iget v2, v9, Ll/֨ܺۢ;->ܽ:I

    .line 1020
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v9

    goto :goto_3

    .line 1021
    :cond_7
    instance-of v0, v9, Ll/᩶ܺۢ;

    if-eqz v0, :cond_8

    .line 1022
    check-cast v9, Ll/᩶ܺۢ;

    .line 1023
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    iget-object v1, v9, Ll/᩶ܺۢ;->ܳ:Ljava/lang/String;

    .line 1024
    invoke-virtual {v0, v12, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iget-object v1, v9, Ll/᩶ܺۢ;->ܽ:Ljava/lang/String;

    .line 1025
    invoke-virtual {v0, v4, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iget-object v1, v9, Ll/᩶ܺۢ;->ܿ:Ljava/lang/String;

    .line 1026
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iget-wide v1, v9, Ll/᩶ܺۢ;->᩷:J

    .line 1027
    invoke-virtual {v0, v8, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "numericType"

    iget-wide v2, v9, Ll/᩶ܺۢ;->᩻:J

    .line 1028
    invoke-virtual {v0, v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v0

    iget-wide v1, v9, Ll/᩶ܺۢ;->ۢ:J

    .line 1029
    invoke-static {v1, v2}, Ll/۫֫ۜ;->֫(J)Lbin/mt/json/JSONValue;

    move-result-object v1

    invoke-virtual {v0, v15, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iget-wide v1, v9, Ll/᩶ܺۢ;->ۜ:J

    .line 1030
    invoke-static {v1, v2}, Ll/۫֫ۜ;->֫(J)Lbin/mt/json/JSONValue;

    move-result-object v1

    invoke-virtual {v0, v14, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "addend"

    iget-wide v2, v9, Ll/᩶ܺۢ;->֫:J

    .line 1031
    invoke-virtual {v0, v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "additive"

    iget-boolean v2, v9, Ll/᩶ܺۢ;->ۧ:Z

    .line 1032
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "ifunc"

    iget-boolean v2, v9, Ll/᩶ܺۢ;->ᩳ:Z

    .line 1033
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v9

    .line 959
    :goto_3
    invoke-virtual {v6, v9}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v8, v16

    move-object/from16 v3, v17

    move-object/from16 v7, v18

    move/from16 v4, v19

    goto/16 :goto_2

    .line 1035
    :cond_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unsupported native item type"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    move-object/from16 v17, v3

    move/from16 v19, v4

    move-object/from16 v18, v7

    const-string v0, "items"

    .line 241
    invoke-virtual {v5, v0, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 242
    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v1

    move-object/from16 v2, p1

    iget v2, v2, Ll/᩸ܺۢ;->ܿ:I

    int-to-long v2, v2

    .line 1661
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/16 v3, 0x1f4

    move-object/from16 v4, p2

    move/from16 v5, v19

    invoke-static {v5, v4, v1, v3, v2}, Ll/۫֫ۜ;->֫(ZLjava/lang/String;IILjava/lang/Long;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "pagination"

    .line 242
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 244
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v1

    if-eqz v5, :cond_a

    move-object/from16 v2, p0

    .line 246
    iget v2, v2, Ll/᩸۟᩻;->ۜ:I

    const-string v3, "workspaceId"

    const-string v5, "editSessionId"

    move-object/from16 v6, v17

    move-object/from16 v7, v18

    .line 0
    invoke-static {v3, v6, v5, v7}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "nextCursor"

    .line 619
    invoke-virtual {v3, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "limit"

    .line 620
    invoke-virtual {v3, v4, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "mt_apk_continue"

    const-string v4, "continue"

    const-string v5, "Continue native item page"

    .line 246
    invoke-static {v2, v3, v4, v5}, Ll/ۤۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    invoke-virtual {v1, v2}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    .line 251
    :cond_a
    invoke-static {v0, v1}, Ll/᩶ۛ᩻;->֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public static ֫(Ll/᩹۟᩻;Ljava/lang/String;ZLl/ۘܺۢ;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ll/ܺۖۢ;Ljava/lang/String;)Lbin/mt/json/JSONObject;
    .locals 18

    move-object/from16 v0, p0

    move/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p8

    move-object/from16 v4, p9

    .line 280
    iget-object v5, v0, Ll/᩹۟᩻;->᩹:Ljava/lang/String;

    iget-object v6, v0, Ll/᩹۟᩻;->ۚ:Ljava/util/List;

    iget-object v7, v0, Ll/᩹۟᩻;->ܶ:Ljava/lang/String;

    iget-wide v8, v2, Ll/ۘܺۢ;->ܺ:J

    iget v10, v3, Ll/ܺۖۢ;->᩷:I

    iget-object v11, v3, Ll/ܺۖۢ;->ۧ:Ljava/util/List;

    iget-boolean v12, v3, Ll/ܺۖۢ;->ۜ:Z

    if-eqz v4, :cond_0

    const/4 v13, 0x1

    goto :goto_0

    :cond_0
    const/4 v13, 0x0

    :goto_0
    const-string v14, ""

    const-string v15, "warning"

    const-string v4, "warningCode"

    if-eqz v1, :cond_2

    const-string v2, "code"

    .line 672
    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "both"

    .line 673
    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    :cond_1
    const-string v2, "data"

    .line 674
    invoke-interface {v6, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const-wide/16 v16, 0x0

    cmp-long v2, v8, v16

    if-ltz v2, :cond_2

    const-wide/16 v16, 0x1000

    cmp-long v2, v8, v16

    if-gez v2, :cond_2

    const-string v2, "low_address_instruction_data_reference_noise"

    move-wide/from16 v16, v8

    const-string v8, "Low target virtual addresses can be confused with ordinary instruction immediates; code/both instruction data refs may contain false positives. To inspect strings, tables, or pointer slots only, retry with scanKind=data, referenceKinds=[\"data\"], and instructionMode=auto."

    .line 0
    invoke-static {v4, v2, v15, v8}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    goto :goto_1

    :cond_2
    move-wide/from16 v16, v8

    invoke-static {v4, v14, v15, v14}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    :goto_1
    if-nez v1, :cond_4

    .line 631
    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_3

    if-nez v10, :cond_3

    if-eqz v12, :cond_3

    if-nez v13, :cond_3

    const-string v3, "No scan ran because the target has no loaded file-backed mapping; it may be a miss, virtual-only address, or non-loaded file bytes."

    const-string v4, "target_not_mapped"

    .line 634
    invoke-static {v2, v4, v3, v4}, Ll/۫֫ۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    goto :goto_4

    .line 632
    :cond_3
    invoke-static {}, Ll/۫֫ۜ;->֫()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 637
    :cond_4
    iget-object v3, v3, Ll/ܺۖۢ;->֫:Ljava/lang/String;

    if-eqz v12, :cond_6

    if-nez v13, :cond_5

    goto :goto_2

    .line 638
    :cond_5
    invoke-static {}, Ll/۫֫ۜ;->֫()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_6
    :goto_2
    if-nez v12, :cond_8

    if-eqz v13, :cond_7

    goto :goto_3

    .line 641
    :cond_7
    invoke-static {}, Ll/۫֫ۜ;->֫()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 643
    :cond_8
    :goto_3
    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_9

    const-string v4, "refs_found"

    const-string v8, "This page contains direct references matching scanKind and referenceKinds; continue if pagination.hasMore is true."

    .line 644
    invoke-static {v2, v4, v8, v3}, Ll/۫֫ۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    goto :goto_4

    :cond_9
    if-eqz v13, :cond_a

    const-string v4, "scan_incomplete"

    const-string v8, "This page has no refs, but scanning is not complete; continue with mt_apk_continue before concluding no references."

    .line 648
    invoke-static {v2, v4, v8, v3}, Ll/۫֫ۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    goto :goto_4

    :cond_a
    if-eqz v12, :cond_14

    const-string v4, "no_refs_found"

    const-string v8, "This bounded direct-reference scan completed for the current scanKind, referenceKinds, and maxScanBytes, and found no direct references."

    .line 652
    invoke-static {v2, v4, v8, v3}, Ll/۫֫ۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 282
    :goto_4
    iget-object v3, v0, Ll/᩹۟᩻;->᩷:Ljava/lang/String;

    iget-object v4, v0, Ll/᩹۟᩻;->ۖ:Ljava/lang/String;

    invoke-static {v5, v3, v4}, Ll/۫֫ۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v8, "addressKind"

    iget-object v9, v0, Ll/᩹۟᩻;->ܽ:Ljava/lang/String;

    .line 283
    invoke-virtual {v4, v8, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v8, "address"

    iget-object v9, v0, Ll/᩹۟᩻;->ۧ:Ljava/lang/String;

    .line 284
    invoke-virtual {v4, v8, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v8, "instructionMode"

    iget-object v9, v0, Ll/᩹۟᩻;->ۡ:Ljava/lang/String;

    .line 285
    invoke-virtual {v4, v8, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v8, "resolvedInstructionMode"

    move-object/from16 v9, p1

    .line 286
    invoke-virtual {v4, v8, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v8, "scanKind"

    .line 287
    invoke-virtual {v4, v8, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 2385
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v7

    .line 2386
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_b

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    .line 2387
    invoke-virtual {v7, v8}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    goto :goto_5

    :cond_b
    const-string v6, "referenceKinds"

    .line 288
    invoke-virtual {v4, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v6, "targetMapped"

    .line 289
    invoke-virtual {v4, v6, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v4

    if-eqz v1, :cond_c

    .line 290
    invoke-static/range {v16 .. v17}, Ll/۫֫ۜ;->֫(J)Lbin/mt/json/JSONValue;

    move-result-object v6

    goto :goto_6

    :cond_c
    sget-object v6, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    :goto_6
    const-string v7, "targetVirtualAddress"

    invoke-virtual {v4, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    if-eqz v1, :cond_d

    move-object/from16 v1, p3

    .line 291
    iget-wide v6, v1, Ll/ۘܺۢ;->ۜ:J

    invoke-static {v6, v7}, Ll/۫֫ۜ;->֫(J)Lbin/mt/json/JSONValue;

    move-result-object v6

    goto :goto_7

    :cond_d
    move-object/from16 v1, p3

    sget-object v6, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    :goto_7
    const-string v7, "targetFileOffset"

    invoke-virtual {v4, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v6, "mapping"

    .line 292
    invoke-static/range {p3 .. p3}, Ll/۫֫ۜ;->֫(Ll/ۘܺۢ;)Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-virtual {v4, v6, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v4, "arch"

    move-object/from16 v6, p4

    .line 293
    invoke-virtual {v1, v4, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v4, "archBits"

    move/from16 v6, p5

    .line 294
    invoke-virtual {v1, v4, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v4, "instructionSet"

    move-object/from16 v6, p6

    .line 295
    invoke-virtual {v1, v4, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v4, "instructionWidth"

    move-object/from16 v6, p7

    .line 296
    invoke-virtual {v1, v4, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 2306
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v4

    .line 2307
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_8
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_12

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۡۖۢ;

    .line 2308
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v8

    move-object v9, v14

    iget-wide v14, v7, Ll/ۡۖۢ;->᩻:J

    .line 2309
    invoke-static {v14, v15}, Ll/۫֫ۜ;->֫(J)Lbin/mt/json/JSONValue;

    move-result-object v14

    const-string v15, "sourceVirtualAddress"

    invoke-virtual {v8, v15, v14}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v8

    iget-wide v14, v7, Ll/ۡۖۢ;->ܽ:J

    .line 2310
    invoke-static {v14, v15}, Ll/۫֫ۜ;->֫(J)Lbin/mt/json/JSONValue;

    move-result-object v14

    const-string v15, "sourceFileOffset"

    invoke-virtual {v8, v15, v14}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v14, "sourceKind"

    iget-object v15, v7, Ll/ۡۖۢ;->ᩳ:Ljava/lang/String;

    .line 2311
    invoke-virtual {v8, v14, v15}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v14, "sourceSize"

    iget v15, v7, Ll/ۡۖۢ;->ܿ:I

    .line 2312
    invoke-virtual {v8, v14, v15}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v8

    iget-object v14, v7, Ll/ۡۖۢ;->ܳ:Ll/ۘۖۢ;

    if-eqz v14, :cond_11

    .line 2340
    iget-object v15, v14, Ll/ۘۖۢ;->ۧ:Ljava/lang/String;

    move-object/from16 p1, v6

    const/4 v6, 0x1

    invoke-static {v15, v6}, Ll/۫֫ۜ;->֫(Ljava/lang/String;Z)Z

    move-result v6

    if-nez v6, :cond_e

    move-object/from16 v16, v3

    goto :goto_9

    .line 2343
    :cond_e
    iget-object v6, v14, Ll/ۘۖۢ;->֫:Ljava/lang/String;

    move-object/from16 p2, v9

    const/4 v9, 0x0

    .line 2344
    invoke-static {v6, v9}, Ll/۫֫ۜ;->֫(Ljava/lang/String;Z)Z

    move-result v9

    if-eqz v9, :cond_f

    invoke-virtual {v6, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_10

    :cond_f
    move-object/from16 v6, p2

    :cond_10
    const-string v9, "name"

    move-object/from16 v16, v3

    const-string v3, "demangledName"

    .line 0
    invoke-static {v9, v15, v3, v6}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    move-object v9, v5

    .line 2349
    iget-wide v5, v14, Ll/ۘۖۢ;->ܳ:J

    .line 2350
    invoke-static {v5, v6}, Ll/۫֫ۜ;->֫(J)Lbin/mt/json/JSONValue;

    move-result-object v5

    const-string v6, "startVirtualAddress"

    invoke-virtual {v3, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    iget-wide v5, v14, Ll/ۘۖۢ;->ܿ:J

    .line 2351
    invoke-static {v5, v6}, Ll/۫֫ۜ;->֫(J)Lbin/mt/json/JSONValue;

    move-result-object v5

    const-string v6, "startFileOffset"

    invoke-virtual {v3, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    iget-wide v5, v14, Ll/ۘۖۢ;->ܽ:J

    .line 2352
    invoke-static {v5, v6}, Ll/۫֫ۜ;->֫(J)Lbin/mt/json/JSONValue;

    move-result-object v5

    const-string v6, "offset"

    invoke-virtual {v3, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "size"

    iget-wide v14, v14, Ll/ۘۖۢ;->ᩳ:J

    .line 2353
    invoke-virtual {v3, v5, v14, v15}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v3

    goto :goto_a

    :cond_11
    move-object/from16 v16, v3

    move-object/from16 p1, v6

    :goto_9
    move-object/from16 p2, v9

    move-object v9, v5

    .line 2341
    sget-object v3, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    :goto_a
    const-string v5, "sourceSymbol"

    .line 2313
    invoke-virtual {v8, v5, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "bytes"

    iget-object v6, v7, Ll/ۡۖۢ;->֫:Ljava/lang/String;

    .line 2314
    invoke-virtual {v3, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "text"

    iget-object v6, v7, Ll/ۡۖۢ;->ۜ:Ljava/lang/String;

    .line 2315
    invoke-virtual {v3, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "referenceKind"

    iget-object v6, v7, Ll/ۡۖۢ;->ۧ:Ljava/lang/String;

    .line 2316
    invoke-virtual {v3, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 2308
    invoke-virtual {v4, v3}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-object/from16 v6, p1

    move-object/from16 v14, p2

    move-object v5, v9

    move-object/from16 v3, v16

    goto/16 :goto_8

    :cond_12
    move-object/from16 v16, v3

    move-object v9, v5

    const-string v3, "refs"

    .line 297
    invoke-virtual {v1, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "scannedBytes"

    .line 298
    invoke-virtual {v1, v3, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "scanComplete"

    .line 299
    invoke-virtual {v1, v3, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "scanSummary"

    .line 300
    invoke-virtual {v1, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 301
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v2

    const/16 v3, 0xc8

    const/4 v4, 0x0

    move-object/from16 v5, p9

    invoke-static {v13, v5, v2, v3, v4}, Ll/۫֫ۜ;->֫(ZLjava/lang/String;IILjava/lang/Long;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "pagination"

    invoke-virtual {v1, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 303
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v2

    if-eqz v13, :cond_13

    .line 305
    iget v0, v0, Ll/᩹۟᩻;->ܺ:I

    const-string v3, "workspaceId"

    const-string v4, "editSessionId"

    move-object v6, v9

    move-object/from16 v7, v16

    .line 0
    invoke-static {v3, v6, v4, v7}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "nextCursor"

    .line 619
    invoke-virtual {v3, v4, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "limit"

    .line 620
    invoke-virtual {v3, v4, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "mt_apk_continue"

    const-string v4, "continue"

    const-string v5, "Continue native xref scan"

    .line 305
    invoke-static {v0, v3, v4, v5}, Ll/ۤۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-virtual {v2, v0}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    .line 310
    :cond_13
    invoke-static {v1, v2}, Ll/᩶ۛ᩻;->֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0

    .line 655
    :cond_14
    invoke-static {}, Ll/۫֫ۜ;->֫()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
.end method

.method public static ֫(ZLjava/lang/String;IILjava/lang/Long;)Lbin/mt/json/JSONObject;
    .locals 2

    .line 1666
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "hasMore"

    .line 1667
    invoke-virtual {v0, v1, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object p0

    if-nez p1, :cond_0

    .line 1668
    sget-object p1, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p1

    :goto_0
    const-string v0, "nextCursor"

    invoke-virtual {p0, v0, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "returnedCount"

    .line 1669
    invoke-virtual {p0, p1, p2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "limitMax"

    .line 1670
    invoke-virtual {p0, p1, p3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p0

    if-nez p4, :cond_1

    .line 1672
    sget-object p1, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_1

    :cond_1
    invoke-virtual {p4}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    invoke-static {p1, p2}, Lbin/mt/json/JSON;->value(J)Lbin/mt/json/JSONValue;

    move-result-object p1

    :goto_1
    const-string p2, "totalAvailableCount"

    .line 1671
    invoke-virtual {p0, p2, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(J)Lbin/mt/json/JSONValue;
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p0, v0

    if-gez v2, :cond_0

    .line 1700
    sget-object p0, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    return-object p0

    .line 1702
    :cond_0
    invoke-static {p0, p1}, Ll/ۙ۟᩻;->֫(J)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONValue;
    .locals 0

    .line 893
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 894
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isNumber()Z

    move-result p1

    if-eqz p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "complete"

    .line 1319
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p0, "All statically resolvable direct control flow within the selected function boundary was explored."

    return-object p0

    :cond_0
    const-string v0, "max_analysis_bytes_reached"

    .line 1322
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p0, "Reachable work remains, but maxAnalysisBytes prevented decoding another instruction. Use the CFG retry action to replace this partial graph when present; no retry action means the public byte-budget limit has been reached."

    return-object p0

    :cond_1
    const-string v0, "max_blocks_reached"

    .line 1325
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string p0, "Reachable block targets remain, but maxBlocks prevented scheduling another candidate. Use the CFG retry action to replace this partial graph when present; no retry action means the public block-budget limit has been reached."

    return-object p0

    :cond_2
    const-string v0, "max_instructions_reached"

    .line 1328
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string p0, "Reachable work remains, but maxInstructions prevented decoding another instruction. Use the CFG retry action to replace this partial graph when present; no retry action means the public instruction-budget limit has been reached."

    return-object p0

    :cond_3
    const-string v0, "invalid_instruction"

    .line 1331
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string p0, "At least one reachable path stopped because an instruction could not be decoded."

    return-object p0

    :cond_4
    const-string v0, "unresolved_indirect_flow"

    .line 1334
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const-string p0, "At least one reachable indirect jump target could not be resolved statically."

    return-object p0

    :cond_5
    const-string v0, "invalid_control_flow_target"

    .line 1337
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_6

    const-string p0, "At least one reachable target was non-executable, overlapping, misaligned, or required a different instruction mode."

    return-object p0

    :cond_6
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ֫()Ll/ۗۛ᩻;
    .locals 2

    const-string v0, "NATIVE_ANALYZER_INVALID_RESULT"

    const-string v1, "Native ELF analysis returned an inconsistent result."

    .line 603
    invoke-static {v0, v1}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    return-object v0
.end method

.method public static ֫(Ll/ܿۖۢ;)Ll/۟ܺۢ;
    .locals 7

    .line 1209
    iget-object v0, p0, Ll/ܿۖۢ;->ᩳ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 1212
    :cond_0
    iget-object p0, p0, Ll/ܿۖۢ;->᩻:Ll/ܽۖۢ;

    iget-wide v1, p0, Ll/ܽۖۢ;->᩻:J

    .line 1213
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۟ܺۢ;

    .line 1214
    iget-wide v4, v3, Ll/۟ܺۢ;->ܿ:J

    cmp-long v6, v4, v1

    if-nez v6, :cond_1

    return-object v3

    :cond_2
    const/4 p0, 0x0

    .line 1218
    invoke-interface {v0, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/۟ܺۢ;

    return-object p0
.end method

.method public static ֫(Ll/᩵۟᩻;JJJ)Ll/᩸֫ۜ;
    .locals 7

    const-wide/32 v0, 0x10000

    cmp-long v2, p1, v0

    if-gtz v2, :cond_1

    const-wide/16 v0, 0x1000

    cmp-long v2, p3, v0

    if-gtz v2, :cond_1

    const-wide/16 v0, 0x2710

    cmp-long v2, p5, v0

    if-lez v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 1441
    :goto_1
    new-instance v1, Ll/᩸֫ۜ;

    iget v2, p0, Ll/᩵۟᩻;->ۜ:I

    const/high16 v3, 0x10000

    int-to-long v3, v3

    int-to-long v5, v2

    .line 1451
    invoke-static {v5, v6, p1, p2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    invoke-static {v3, v4, p1, p2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    long-to-int p2, p1

    .line 1442
    iget p1, p0, Ll/᩵۟᩻;->᩷:I

    const/16 v2, 0x1000

    int-to-long v2, v2

    int-to-long v4, p1

    .line 1451
    invoke-static {v4, v5, p3, p4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p3

    invoke-static {v2, v3, p3, p4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p3

    long-to-int p1, p3

    .line 1444
    iget p0, p0, Ll/᩵۟᩻;->ۢ:I

    const/16 p3, 0x2710

    int-to-long p3, p3

    int-to-long v2, p0

    .line 1451
    invoke-static {v2, v3, p5, p6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p5

    invoke-static {p3, p4, p5, p6}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p3

    long-to-int p0, p3

    .line 1445
    invoke-direct {v1, p2, p1, p0, v0}, Ll/᩸֫ۜ;-><init>(IIIZ)V

    return-object v1
.end method

.method public static ֫(Ll/᩵۟᩻;Ljava/lang/String;)Ll/᩸֫ۜ;
    .locals 14

    .line 1380
    iget v0, p0, Ll/᩵۟᩻;->ۜ:I

    int-to-long v1, v0

    .line 1381
    iget v3, p0, Ll/᩵۟᩻;->᩷:I

    int-to-long v3, v3

    .line 1382
    iget v5, p0, Ll/᩵۟᩻;->ۢ:I

    int-to-long v5, v5

    const-string v7, "max_analysis_bytes_reached"

    .line 1383
    invoke-virtual {v7, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    const-wide/16 v8, 0x2

    if-eqz v7, :cond_1

    int-to-long v0, v0

    mul-long v1, v0, v8

    :cond_0
    :goto_0
    move-wide v8, v1

    move-wide v10, v3

    move-wide v12, v5

    goto :goto_1

    :cond_1
    const-string v0, "max_blocks_reached"

    .line 1385
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    mul-long v3, v3, v8

    goto :goto_0

    :cond_2
    const-string v0, "max_instructions_reached"

    .line 1387
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    mul-long v5, v5, v8

    goto :goto_0

    :goto_1
    move-object v7, p0

    .line 1390
    invoke-static/range {v7 .. v13}, Ll/۫֫ۜ;->֫(Ll/᩵۟᩻;JJJ)Ll/᩸֫ۜ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/util/ArrayList;Ljava/util/HashSet;Ll/۟ܺۢ;)V
    .locals 2

    if-eqz p2, :cond_0

    .line 1288
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/16 v1, 0x8

    if-ge v0, v1, :cond_0

    iget-wide v0, p2, Ll/۟ܺۢ;->ܿ:J

    .line 1289
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 1290
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public static ֫(Ljava/lang/String;Z)Z
    .locals 2

    if-eqz p0, :cond_2

    if-eqz p1, :cond_0

    .line 2368
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_2

    .line 2369
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p1

    const/16 v0, 0x400

    if-le p1, v0, :cond_1

    goto :goto_0

    .line 2373
    :cond_1
    :try_start_0
    sget-object p1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p1}, Ljava/nio/charset/Charset;->newEncoder()Ljava/nio/charset/CharsetEncoder;

    move-result-object p1

    sget-object v1, Ljava/nio/charset/CodingErrorAction;->REPORT:Ljava/nio/charset/CodingErrorAction;

    .line 2374
    invoke-virtual {p1, v1}, Ljava/nio/charset/CharsetEncoder;->onMalformedInput(Ljava/nio/charset/CodingErrorAction;)Ljava/nio/charset/CharsetEncoder;

    move-result-object p1

    .line 2375
    invoke-virtual {p1, v1}, Ljava/nio/charset/CharsetEncoder;->onUnmappableCharacter(Ljava/nio/charset/CodingErrorAction;)Ljava/nio/charset/CharsetEncoder;

    move-result-object p1

    .line 2376
    invoke-static {p0}, Ljava/nio/CharBuffer;->wrap(Ljava/lang/CharSequence;)Ljava/nio/CharBuffer;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/nio/charset/CharsetEncoder;->encode(Ljava/nio/CharBuffer;)Ljava/nio/ByteBuffer;

    move-result-object p0

    .line 2377
    invoke-virtual {p0}, Ljava/nio/Buffer;->remaining()I

    move-result p0
    :try_end_0
    .catch Ljava/nio/charset/CharacterCodingException; {:try_start_0 .. :try_end_0} :catch_0

    if-gt p0, v0, :cond_2

    const/4 p0, 0x1

    return p0

    :catch_0
    :cond_2
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ۜ()Lbin/mt/json/JSONObject;
    .locals 19

    .line 1978
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "string"

    const-string v2, "Workspace id."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "workspaceId"

    .line 1979
    invoke-virtual {v0, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "Edit session id that was modified."

    .line 96
    invoke-static {v1, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "editSessionId"

    .line 1980
    invoke-virtual {v0, v5, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "zip_entry locator."

    .line 96
    invoke-static {v1, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v6, "locator"

    .line 1981
    invoke-virtual {v0, v6, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "Parsed input address kind: virtual or file_offset."

    .line 96
    invoke-static {v1, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v7, "addressKind"

    .line 1982
    invoke-virtual {v0, v7, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "Parsed input address as lowercase 0x hex. ARM32 odd Thumb virtual input keeps bit0 here."

    .line 96
    invoke-static {v1, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v8, "address"

    .line 1983
    invoke-virtual {v0, v8, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "Requested instruction mode."

    .line 96
    invoke-static {v1, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v9, "instructionMode"

    .line 1984
    invoke-virtual {v0, v9, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "Resolved instruction mode used for assembly and follow-up disassembly."

    .line 96
    invoke-static {v1, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v10, "resolvedInstructionMode"

    .line 1985
    invoke-virtual {v0, v10, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "Effective virtual address used for mapping and assembly. Thumb virtual input clears the T-bit here."

    .line 103
    invoke-static {v1, v3}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v10, "effectiveAddress"

    .line 1986
    invoke-virtual {v0, v10, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "Address mapping details. Address fields are null on miss. isLoaded means this file-backed mapping belongs to a loaded ELF range; virtual-only runtime bytes without file backing may still miss. isExecutable means that loaded mapping is executable."

    .line 2248
    invoke-static {}, Ll/۫֫ۜ;->᩻()Lbin/mt/json/JSONObject;

    move-result-object v10

    .line 2247
    invoke-static {v10, v3}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v10, "mapping"

    .line 1987
    invoke-virtual {v0, v10, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "Architecture passed to the assembler."

    .line 96
    invoke-static {v1, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v10, "arch"

    .line 1988
    invoke-virtual {v0, v10, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "integer"

    const-string v11, "ELF class/ABI bit width; ARM32 stays 32 even when patching Thumb instructions."

    .line 110
    invoke-static {v3, v11}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v11

    const-string v12, "archBits"

    .line 1989
    invoke-virtual {v0, v12, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v11, "Instruction set used for this patch: thumb, arm, aarch64, x86, or x86_64."

    .line 96
    invoke-static {v1, v11}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v11

    const-string v12, "instructionSet"

    .line 1990
    invoke-virtual {v0, v12, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v11, "Instruction encoding width category: mixed16_32 for Thumb, fixed32 for ARM/AArch64, or variable for x86."

    .line 96
    invoke-static {v1, v11}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v11

    const-string v13, "instructionWidth"

    .line 1991
    invoke-virtual {v0, v13, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v11, "Virtual address actually patched. This equals effectiveAddress and never includes the ARM Thumb T-bit."

    .line 103
    invoke-static {v1, v11}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v11

    const-string v14, "patchedVirtualAddress"

    .line 1992
    invoke-virtual {v0, v14, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v11, "ELF file offset inside the zip_entry bytes that was patched."

    .line 103
    invoke-static {v1, v11}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v11

    const-string v14, "patchedFileOffset"

    .line 1993
    invoke-virtual {v0, v14, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v11, "Final equal-length byte count written to the edit session."

    .line 110
    invoke-static {v3, v11}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v11

    const-string v15, "bytesPatched"

    .line 1994
    invoke-virtual {v0, v15, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v11, "Expected bytes that were verified before writing, uppercase hex without spaces."

    .line 96
    invoke-static {v1, v11}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v11

    const-string v15, "expectedHex"

    .line 1995
    invoke-virtual {v0, v15, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v11, "Raw bytes produced by the assembler before optional NOP padding, uppercase hex without spaces."

    .line 96
    invoke-static {v1, v11}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v11

    move-object/from16 v16, v9

    const-string v9, "assembledHex"

    .line 1996
    invoke-virtual {v0, v9, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v9, "Final bytes written after optional NOP padding, uppercase hex without spaces."

    .line 96
    invoke-static {v1, v9}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    const-string v11, "afterHex"

    .line 1997
    invoke-virtual {v0, v11, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v9, "Padding mode used for this patch: none or nop."

    .line 96
    invoke-static {v1, v9}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    const-string v11, "paddingMode"

    .line 1998
    invoke-virtual {v0, v11, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v9, "nopBytesInserted"

    move-object/from16 v17, v8

    const-string v8, "Number of NOP padding bytes appended to assembledHex before writing."

    move-object/from16 v18, v7

    const-string v7, "Native instruction patch result."

    .line 0
    invoke-static {v0, v3, v8, v9, v7}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v7, "Stable instruction-mode reason token for retryable ARM32 patch errors. Empty string means this is not an instruction-mode retry error; ignore addressModeHint and retryInstructionModes and inspect the other diagnostics fields instead."

    const-string v8, "Fixed ARM32 address hint string. Empty string means this is not an instruction-mode retry error."

    .line 2086
    invoke-static {v7, v8}, Ll/۫֫ۜ;->֫(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v8, "Patch ELF file offset for expectedHex mismatch, or null."

    .line 103
    invoke-static {v1, v8}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    .line 2089
    invoke-virtual {v7, v14, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v9, "Expected uppercase hex for a stale guard mismatch, or null."

    .line 103
    invoke-static {v1, v9}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    .line 2090
    invoke-virtual {v8, v15, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v9, "Actual uppercase hex read from the current edit session view, or null."

    .line 103
    invoke-static {v1, v9}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    const-string v14, "actualHex"

    .line 2091
    invoke-virtual {v8, v14, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v9, "Patch window byte count for length errors, or null."

    .line 117
    invoke-static {v3, v9}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    const-string v14, "expectedBytes"

    .line 2092
    invoke-virtual {v8, v14, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v9, "Assembler output byte count for length errors, or null."

    .line 117
    invoke-static {v3, v9}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    const-string v14, "assembledBytes"

    .line 2093
    invoke-virtual {v8, v14, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v9, "Requested padding mode for length errors, or null."

    .line 103
    invoke-static {v1, v9}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    .line 2094
    invoke-virtual {v8, v11, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v9, "Bytes left to fill when NOP padding is unavailable, or null."

    .line 117
    invoke-static {v3, v9}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    const-string v14, "remainingBytes"

    .line 2095
    invoke-virtual {v8, v14, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v9, "Instruction set for NOP padding diagnostics, or null."

    .line 103
    invoke-static {v1, v9}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    .line 2096
    invoke-virtual {v8, v12, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v9, "Instruction width for NOP padding diagnostics, or null."

    .line 103
    invoke-static {v1, v9}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    .line 2097
    invoke-virtual {v8, v13, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v9, "Assembler architecture for assembly failures, or null."

    .line 103
    invoke-static {v1, v9}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    .line 2098
    invoke-virtual {v8, v10, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v9, "Assembler bit width for assembly failures, or null."

    .line 117
    invoke-static {v3, v9}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v9, "bits"

    .line 2099
    invoke-virtual {v8, v9, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v8, "Sanitized assembler failure message, or null."

    .line 103
    invoke-static {v1, v8}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v9, "message"

    .line 2100
    invoke-virtual {v3, v9, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    const-string v3, "native_patch_instructions diagnostics. diagnostics is null for unrelated argument errors. The instruction-mode fields reason, addressModeHint, and retryInstructionModes apply only to ARM32 retry errors; when reason is empty, ignore those fields and use expectedHex/actualHex, expectedBytes/assembledBytes, remainingBytes, or message to decide the next step."

    .line 2101
    invoke-static {v7, v3}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 164
    invoke-static {v3}, Ll/֫ۛ᩻;->ۧ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 168
    invoke-static {}, Ll/ۧᩳܽ;->ܿ()Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v8, "mt_apk_native_disassemble"

    const-string v9, "inspect"

    .line 166
    invoke-static {v7, v8, v9}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    .line 171
    invoke-static {}, Ll/ۧᩳܽ;->ۜ()Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v10, "mt_apk_read_bytes"

    .line 169
    invoke-static {v8, v10, v9}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    .line 166
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v9

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 167
    invoke-virtual {v9, v4, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "Non-empty edit session id returned by mt_apk_session_create."

    .line 96
    invoke-static {v1, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 168
    invoke-virtual {v2, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "ZIP entry locator for the native ELF."

    .line 96
    invoke-static {v1, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 169
    invoke-virtual {v2, v6, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "virtual"

    const-string v5, "file_offset"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v4

    const-string v5, "Address kind: virtual or file_offset."

    .line 170
    invoke-static {v5, v4}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    move-object/from16 v5, v18

    invoke-virtual {v2, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "Unsigned target address string copied from the failed request. The effective address must be 4-byte aligned for AArch64/ARM or 2-byte aligned for Thumb after clearing the virtual-address T-bit."

    .line 96
    invoke-static {v1, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    move-object/from16 v5, v17

    .line 171
    invoke-virtual {v2, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "arm"

    const-string v5, "thumb"

    const-string v6, "auto"

    filled-new-array {v6, v4, v5}, [Ljava/lang/String;

    move-result-object v4

    const-string v5, "Instruction mode: auto, arm, or thumb."

    .line 172
    invoke-static {v5, v4}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    move-object/from16 v5, v16

    invoke-virtual {v2, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "Stale-view guard bytes for the patch window. Copy from mt_apk_read_bytes or mt_apk_native_disassemble for the same editSessionId and locator; do not invent it or use replacement bytes."

    .line 96
    invoke-static {v1, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 173
    invoke-virtual {v2, v15, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "Assembly source text containing instructions and labels only, not a tool command. Assembler directives such as .arm, .bits, .hex, .fill, and .incbin are rejected before assembly."

    .line 96
    invoke-static {v1, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v4, "replacementAssembly"

    .line 174
    invoke-virtual {v2, v4, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "none"

    const-string v4, "nop"

    filled-new-array {v2, v4}, [Ljava/lang/String;

    move-result-object v2

    const-string v4, "Padding mode: none or nop."

    .line 175
    invoke-static {v4, v2}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    invoke-virtual {v1, v11, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "Arguments for mt_apk_native_patch_instructions."

    .line 166
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "mt_apk_native_patch_instructions"

    const-string v4, "retry"

    .line 172
    invoke-static {v1, v2, v4}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 177
    invoke-static {}, Ll/ۧᩳܽ;->ۜ()Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 175
    invoke-static {v2, v10, v4}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v5, "mt_apk_workspace_open"

    .line 180
    invoke-static {}, Ll/ۧᩳܽ;->ܳ()Lbin/mt/json/JSONObject;

    move-result-object v6

    .line 178
    invoke-static {v6, v5, v4}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const/4 v5, 0x5

    new-array v5, v5, [Lbin/mt/json/JSONObject;

    const/4 v6, 0x0

    aput-object v7, v5, v6

    const/4 v6, 0x1

    aput-object v8, v5, v6

    const/4 v6, 0x2

    aput-object v1, v5, v6

    const/4 v1, 0x3

    aput-object v2, v5, v1

    const/4 v1, 0x4

    aput-object v4, v5, v1

    const-string v1, "Successful native instruction patch returns disassemble and read_bytes verification actions. ARM32 instructionMode errors may return native patch retry actions; stale expectedHex errors may return read_bytes recovery. A corrupt workspace whose source APK remains accessible may return mt_apk_workspace_open to recreate it."

    .line 165
    invoke-static {v1, v5}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "Result for mt_apk_native_patch_instructions. Verified instruction replacement. assembledHex contains assembled bytes; afterHex includes any NOP padding. Use nextActions for read-back or error recovery."

    .line 162
    invoke-static {v2, v0, v3, v1}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public static ۢ()Lbin/mt/json/JSONObject;
    .locals 21

    .line 2024
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "string"

    const-string v2, "Workspace id."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "workspaceId"

    .line 2025
    invoke-virtual {v0, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "Edit session id, or empty string for base APK."

    .line 96
    invoke-static {v1, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "editSessionId"

    .line 2026
    invoke-virtual {v0, v5, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "zip_entry locator."

    .line 96
    invoke-static {v1, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v6, "locator"

    .line 2027
    invoke-virtual {v0, v6, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "Parsed input address kind: virtual or file_offset."

    .line 96
    invoke-static {v1, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v7, "addressKind"

    .line 2028
    invoke-virtual {v0, v7, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "Parsed input address as lowercase 0x hex."

    .line 96
    invoke-static {v1, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v8, "address"

    .line 2029
    invoke-virtual {v0, v8, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "Requested instruction mode."

    .line 96
    invoke-static {v1, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v9, "instructionMode"

    .line 2030
    invoke-virtual {v0, v9, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "Resolved instruction mode used for scanning source instructions; data-only scans return auto."

    .line 96
    invoke-static {v1, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v10, "resolvedInstructionMode"

    .line 2031
    invoke-virtual {v0, v10, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "Scan domain used for this page: code, data, or both."

    .line 96
    invoke-static {v1, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v10, "scanKind"

    .line 2032
    invoke-virtual {v0, v10, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "Reference kinds used for this scan, normalized in fixed order. Values are call, jump, data, and unknown; jump covers branch/jump instructions. In data phases only data refs are emitted."

    .line 2033
    invoke-static {v3}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v11, "referenceKinds"

    invoke-virtual {v0, v11, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "boolean"

    const-string v12, "Whether the target has a loaded file-backed mapping usable for this xref scan. false may mean miss, virtual-only address, or mapping.isLoaded=false."

    .line 124
    invoke-static {v3, v12}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v12

    const-string v13, "targetMapped"

    .line 2034
    invoke-virtual {v0, v13, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v12, "Mapped target virtual address when targetMapped=true, otherwise null. ARM32 odd virtual input clears bit0 only for an executable mapping; a loaded non-executable odd target stays exact. Executable ARM32 targets may still match odd Thumb function pointers when this value is even."

    .line 103
    invoke-static {v1, v12}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v12

    const-string v13, "targetVirtualAddress"

    .line 2035
    invoke-virtual {v0, v13, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v12, "Mapped target ELF file offset within the zip_entry bytes when targetMapped=true, otherwise null."

    .line 103
    invoke-static {v1, v12}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v12

    const-string v13, "targetFileOffset"

    .line 2036
    invoke-virtual {v0, v13, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v12, "Address mapping details. Address fields are null on miss. isLoaded means this file-backed mapping belongs to a loaded ELF range; virtual-only runtime bytes without file backing may still miss. isExecutable means that loaded mapping is executable."

    .line 2248
    invoke-static {}, Ll/۫֫ۜ;->᩻()Lbin/mt/json/JSONObject;

    move-result-object v13

    .line 2247
    invoke-static {v13, v12}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v12

    const-string v13, "mapping"

    .line 2037
    invoke-virtual {v0, v13, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v12, "Architecture used for scanning."

    .line 96
    invoke-static {v1, v12}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v12

    const-string v13, "arch"

    .line 2038
    invoke-virtual {v0, v13, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v12, "integer"

    const-string v13, "ELF class/ABI bit width; ARM32 stays 32 even when scanning Thumb instructions."

    .line 110
    invoke-static {v12, v13}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v13

    const-string v14, "archBits"

    .line 2039
    invoke-virtual {v0, v14, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v13, "Instruction set used for source instructions: thumb, arm, aarch64, x86, or x86_64; data-only scans return an empty string."

    .line 96
    invoke-static {v1, v13}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v13

    const-string v14, "instructionSet"

    .line 2040
    invoke-virtual {v0, v14, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v13, "Instruction encoding width category: mixed16_32 for Thumb, fixed32 for ARM/AArch64, or variable for x86; data-only scans return an empty string."

    .line 96
    invoke-static {v1, v13}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v13

    const-string v14, "instructionWidth"

    .line 2041
    invoke-virtual {v0, v14, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v13, "Best-effort direct static references found on this page after applying data.scanKind and data.referenceKinds. Use data.scanSummary.reason, data.scanSummary.meaning, and data.scanSummary.completionReason to interpret empty refs; read data.scanSummary.warningCode and data.scanSummary.warning before trusting low-address instruction data refs. Do not treat empty refs alone as proof that no matching reference exists."

    const-string v14, "type"

    const-string v15, "array"

    move-object/from16 v16, v9

    const-string v9, "description"

    .line 0
    invoke-static {v14, v15, v9, v13}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v13

    move-object/from16 v17, v9

    .line 2325
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v9

    move-object/from16 v18, v14

    const-string v14, "Source virtual address."

    .line 103
    invoke-static {v1, v14}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v14

    move-object/from16 v19, v15

    const-string v15, "sourceVirtualAddress"

    .line 2326
    invoke-virtual {v9, v15, v14}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v9

    const-string v14, "Source ELF file offset within the zip_entry bytes; convert this 0x hex string to a decimal byteOffset before calling mt_apk_read_bytes."

    .line 103
    invoke-static {v1, v14}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v14

    const-string v15, "sourceFileOffset"

    .line 2327
    invoke-virtual {v9, v15, v14}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v9

    const-string v14, "Source kind: instruction, data_relocation, or data_pointer."

    .line 96
    invoke-static {v1, v14}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v14

    const-string v15, "sourceKind"

    .line 2328
    invoke-virtual {v9, v15, v14}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v9

    const-string v14, "Source byte size represented by bytes: instruction size for sourceKind=instruction, or data slot size for data_relocation/data_pointer."

    .line 110
    invoke-static {v12, v14}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v14

    const-string v15, "sourceSize"

    .line 2329
    invoke-virtual {v9, v15, v14}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v9

    .line 2358
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v14

    const-string v15, "Raw ELF symbol name."

    .line 96
    invoke-static {v1, v15}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v15

    move-object/from16 v20, v8

    const-string v8, "name"

    .line 2359
    invoke-virtual {v14, v8, v15}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v14, "Best-effort C++ demangled name when available and different from name, otherwise empty string."

    .line 96
    invoke-static {v1, v14}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v14

    const-string v15, "demangledName"

    .line 2360
    invoke-virtual {v8, v15, v14}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v14, "Symbol start virtual address as a lowercase 0x hex string."

    .line 96
    invoke-static {v1, v14}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v14

    const-string v15, "startVirtualAddress"

    .line 2361
    invoke-virtual {v8, v15, v14}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v14, "Symbol start ELF file offset within the zip_entry bytes, or null when unknown."

    .line 103
    invoke-static {v1, v14}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v14

    const-string v15, "startFileOffset"

    .line 2362
    invoke-virtual {v8, v15, v14}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v14, "Offset from startVirtualAddress to this ref source address as a lowercase 0x hex string."

    .line 96
    invoke-static {v1, v14}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v14

    const-string v15, "offset"

    .line 2363
    invoke-virtual {v8, v15, v14}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v14, "Symbol size in bytes; this is best-effort metadata, not proof of an exact function boundary."

    .line 110
    invoke-static {v12, v14}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v14

    const-string v15, "size"

    .line 2364
    invoke-virtual {v8, v15, v14}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v14, "Best-effort non-imported sized ELF symbol containing this ref source address. null means no safe symbol context is available; stripped or malformed symbol metadata can cause null. For sourceKind=instruction, use startVirtualAddress with mt_apk_native_analyze_control_flow, copy xref data.resolvedInstructionMode to preserve ARM32 source mode, and choose outputMode=summary for triage or outputMode=full for detail arrays; use mt_apk_native_disassemble for exact bytes. For data sources, this is owner context for the slot or pointer, not a CFG function entry or caller relationship."

    .line 2357
    invoke-static {v8, v14}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    .line 2330
    invoke-static {v8}, Ll/֫ۛ᩻;->ܽ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v14, "sourceSymbol"

    invoke-virtual {v9, v14, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v9, "Source bytes as lowercase hex."

    .line 96
    invoke-static {v1, v9}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    const-string v14, "bytes"

    .line 2331
    invoke-virtual {v8, v14, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v9, "Disassembled instruction text, relocation summary, or data pointer text, truncated to 512 characters."

    .line 96
    invoke-static {v1, v9}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    const-string v14, "text"

    .line 2332
    invoke-virtual {v8, v14, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v9, "referenceKind"

    const-string v14, "Reference kind: call, jump, data, or unknown. jump covers branch/jump instructions."

    const-string v15, "Native xref item."

    .line 0
    invoke-static {v8, v1, v14, v9, v15}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v9, "items"

    .line 2325
    invoke-virtual {v13, v9, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v13, "refs"

    .line 2042
    invoke-virtual {v0, v13, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v8, "Code/data-pointer bytes scanned on this page; relocation item scanning is not counted here and uses its own per-page budget."

    .line 110
    invoke-static {v12, v8}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v13, "scannedBytes"

    .line 2043
    invoke-virtual {v0, v13, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v8, "Whether this xref request has no more pages. Prefer data.scanSummary.reason, meaning, and completionReason to interpret empty refs and progress."

    .line 124
    invoke-static {v3, v8}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v8, "scanComplete"

    .line 2044
    invoke-virtual {v0, v8, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 2054
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v8, "Stable reason token: target_not_mapped, refs_found, scan_incomplete, or no_refs_found."

    .line 96
    invoke-static {v1, v8}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v13, "reason"

    .line 2055
    invoke-virtual {v3, v13, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v8, "Short explanation of this page and whether to continue."

    .line 96
    invoke-static {v1, v8}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v13, "meaning"

    .line 2056
    invoke-virtual {v3, v13, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v8, "Stable page-stop token: target_not_mapped, result_limit_reached, scan_budget_exhausted, relocation_page_budget_exhausted, or scan_space_exhausted."

    .line 96
    invoke-static {v1, v8}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v13, "completionReason"

    .line 2057
    invoke-virtual {v3, v13, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v8, "Stable warning token, or empty string when no warning applies. low_address_instruction_data_reference_noise means code/both instruction data refs may match ordinary immediates."

    .line 96
    invoke-static {v1, v8}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v13, "warningCode"

    .line 2058
    invoke-virtual {v3, v13, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v8, "warning"

    const-string v13, "Short warning text, or empty string when no warning applies."

    const-string v14, "Stable explanation of this native xref page. reason is one of target_not_mapped, refs_found, scan_incomplete, or no_refs_found. completionReason explains why this page stopped: target_not_mapped means no scan ran; result_limit_reached means this page stopped after returning limit refs; scan_budget_exhausted means this page used maxScanBytes and can continue; relocation_page_budget_exhausted means this page used the relocation item page budget and can continue; scan_space_exhausted means the selected direct-reference scan space is exhausted, but it is not proof of a complete caller graph. data.scanSummary.warningCode and data.scanSummary.warning are empty unless this request has a known AI interpretation risk. Read meaning before treating empty refs as no references."

    .line 0
    invoke-static {v3, v1, v13, v8, v14}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v8, "scanSummary"

    .line 2045
    invoke-virtual {v0, v8, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "Maximum limit accepted by mt_apk_continue for later native xref pages."

    const-string v8, "Always null for native xref because the tool does not pre-scan the whole SO; null means unknown, not zero. Use hasMore only as the continuation signal; use data.scanSummary to interpret scan meaning."

    const-string v13, "Number of refs returned on this page."

    .line 2046
    invoke-static {v13, v3, v8}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v8, "pagination"

    invoke-virtual {v0, v8, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "Native xref scan result."

    .line 2024
    invoke-static {v0, v3}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "Stable reason token: arm32_mode_required or data_scan_requires_auto."

    const-string v8, "Fixed hint string: ARM32 file/even address does not identify ARM or Thumb, data scan does not decode instructions, odd target virtual address does not identify source instruction mode, or empty string when no mode hint is available."

    .line 2078
    invoke-static {v3, v8}, Ll/۫֫ۜ;->֫(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v8, "Requested scan kind, or empty string when unavailable."

    .line 96
    invoke-static {v1, v8}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    .line 2081
    invoke-virtual {v3, v10, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v8, "Requested reference kinds, or empty when unavailable."

    .line 2082
    invoke-static {v8}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    invoke-virtual {v3, v11, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v8, "Instruction mode diagnostics for ARM32/data-scan mt_apk_native_xref errors; diagnostics is null for unrelated argument or runtime errors."

    .line 2077
    invoke-static {v3, v8}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 109
    invoke-static {v3}, Ll/֫ۛ᩻;->ۧ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v8, "continue"

    .line 113
    invoke-static {}, Ll/ۧᩳܽ;->֫()Lbin/mt/json/JSONObject;

    move-result-object v13

    const-string v14, "mt_apk_continue"

    .line 111
    invoke-static {v13, v14, v8}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    .line 182
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v13

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 183
    invoke-virtual {v13, v4, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "Edit session id. Empty string reads the base APK; otherwise copy the id from the edited session."

    .line 96
    invoke-static {v1, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 184
    invoke-virtual {v2, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "ZIP entry locator for the native ELF."

    .line 96
    invoke-static {v1, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 185
    invoke-virtual {v2, v6, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "virtual"

    const-string v5, "file_offset"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v4

    const-string v5, "Address kind: virtual or file_offset."

    .line 186
    invoke-static {v5, v4}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    invoke-virtual {v2, v7, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "Unsigned target address string copied from the failed request."

    .line 96
    invoke-static {v1, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    move-object/from16 v4, v20

    .line 187
    invoke-virtual {v2, v4, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "arm"

    const-string v4, "thumb"

    const-string v5, "auto"

    filled-new-array {v5, v2, v4}, [Ljava/lang/String;

    move-result-object v2

    const-string v4, "Instruction mode: auto, arm, or thumb."

    .line 188
    invoke-static {v4, v2}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    move-object/from16 v4, v16

    invoke-virtual {v1, v4, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "both"

    const-string v4, "code"

    const-string v5, "data"

    filled-new-array {v4, v5, v2}, [Ljava/lang/String;

    move-result-object v2

    const-string v4, "Scan domain: code, data, or both."

    .line 189
    invoke-static {v4, v2}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    invoke-virtual {v1, v10, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "Reference kinds to return."

    move-object/from16 v7, v17

    move-object/from16 v4, v18

    move-object/from16 v6, v19

    .line 0
    invoke-static {v4, v6, v7, v2}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "jump"

    const-string v6, "unknown"

    const-string v7, "call"

    .line 191
    filled-new-array {v7, v4, v5, v6}, [Ljava/lang/String;

    move-result-object v4

    const-string v5, "Reference kind."

    .line 192
    invoke-static {v5, v4}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    invoke-virtual {v2, v9, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 190
    invoke-virtual {v1, v11, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "Maximum code/data-pointer bytes to consume on this xref page."

    .line 110
    invoke-static {v12, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "maxScanBytes"

    .line 193
    invoke-virtual {v1, v4, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "limit"

    const-string v4, "Maximum refs to return on this page."

    const-string v5, "Arguments for mt_apk_native_xref."

    .line 0
    invoke-static {v1, v12, v4, v2, v5}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "mt_apk_native_xref"

    const-string v4, "retry"

    .line 114
    invoke-static {v1, v2, v4}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "mt_apk_workspace_open"

    .line 119
    invoke-static {}, Ll/ۧᩳܽ;->ܳ()Lbin/mt/json/JSONObject;

    move-result-object v5

    .line 117
    invoke-static {v5, v2, v4}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const/4 v4, 0x3

    new-array v4, v4, [Lbin/mt/json/JSONObject;

    const/4 v5, 0x0

    aput-object v8, v4, v5

    const/4 v5, 0x1

    aput-object v1, v4, v5

    const/4 v1, 0x2

    aput-object v2, v4, v1

    const-string v1, "Success continuation uses mt_apk_continue when data.pagination.hasMore=true. ARM32 or data-scan instructionMode errors may return mt_apk_native_xref retry actions; copy those arguments directly. A corrupt workspace whose source APK remains accessible may return mt_apk_workspace_open to recreate it."

    .line 110
    invoke-static {v1, v4}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "Result for mt_apk_native_xref. Direct static references. Read scanSummary before interpreting empty refs or warnings; pagination.hasMore controls continuation. Results are not a complete caller graph."

    .line 108
    invoke-static {v2, v0, v3, v1}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public static ۧ(Ljava/lang/String;Ljava/util/List;)I
    .locals 2

    .line 1190
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩳۖۢ;

    .line 1191
    iget-object v1, v1, Ll/ᩳۖۢ;->ܽ:Ljava/lang/String;

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public static ۧ()Lbin/mt/json/JSONObject;
    .locals 8

    .line 1759
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "string"

    const-string v2, "Workspace id."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "workspaceId"

    .line 1760
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Edit session id, or empty string for base APK."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "editSessionId"

    .line 1761
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "zip_entry locator."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "locator"

    .line 1762
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Parsed address kind: virtual or file_offset."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "addressKind"

    .line 1763
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Parsed input address as lowercase 0x hex."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "address"

    .line 1764
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Requested instruction mode."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "instructionMode"

    .line 1765
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "boolean"

    const-string v3, "Whether this window should use the containing best-effort sized ELF symbol end as an upper bound when available."

    .line 124
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "stopAtSymbolBoundary"

    .line 1766
    invoke-virtual {v0, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "Resolved instruction mode."

    .line 96
    invoke-static {v1, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "resolvedInstructionMode"

    .line 1767
    invoke-virtual {v0, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "Effective virtual address."

    .line 103
    invoke-static {v1, v3}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "effectiveAddress"

    .line 1768
    invoke-virtual {v0, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "Address mapping details. Address fields are null on miss. isLoaded means this file-backed mapping belongs to a loaded ELF range; virtual-only runtime bytes without file backing may still miss. isExecutable means that loaded mapping is executable."

    .line 2248
    invoke-static {}, Ll/۫֫ۜ;->᩻()Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 2247
    invoke-static {v4, v3}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "mapping"

    .line 1769
    invoke-virtual {v0, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 2293
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Whether stopAtSymbolBoundary was requested."

    .line 124
    invoke-static {v2, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "requested"

    .line 2294
    invoke-virtual {v3, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Whether a non-imported sized ELF symbol end is available as an upper bound for this disassembly view."

    .line 124
    invoke-static {v2, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "applied"

    .line 2295
    invoke-virtual {v3, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Whether bytesConsumed reaches endVirtualAddressExclusive in this response."

    .line 124
    invoke-static {v2, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "endReached"

    .line 2296
    invoke-virtual {v3, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Raw ELF symbol name when applied, otherwise empty string."

    .line 96
    invoke-static {v1, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "name"

    .line 2297
    invoke-virtual {v3, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Best-effort C++ demangled symbol name when applied and available, otherwise empty string."

    .line 96
    invoke-static {v1, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "demangledName"

    .line 2298
    invoke-virtual {v3, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Symbol start virtual address, or null."

    .line 103
    invoke-static {v1, v4}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "startVirtualAddress"

    .line 2299
    invoke-virtual {v3, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Symbol end address, the first address after this symbol, or null."

    .line 103
    invoke-static {v1, v4}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "endVirtualAddressExclusive"

    .line 2300
    invoke-virtual {v3, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Offset from startVirtualAddress to data.effectiveAddress, or null."

    .line 103
    invoke-static {v1, v4}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "offset"

    .line 2301
    invoke-virtual {v3, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "integer"

    const-string v5, "Symbol size in bytes, or 0 when not applied."

    const-string v6, "size"

    const-string v7, "Best-effort disassembly stop boundary. applied=true means a symbol end address is available as an upper bound for this view; maxBytes or maxInstructions may still stop the response earlier. Disassembly never crosses endVirtualAddressExclusive when applied=true. endReached=true only means this response consumed bytes up to that end address, not that a full function was disassembled."

    .line 0
    invoke-static {v3, v4, v5, v6, v7}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "symbolBoundary"

    .line 1770
    invoke-virtual {v0, v5, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "Architecture used for disassembly."

    .line 96
    invoke-static {v1, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "arch"

    .line 1771
    invoke-virtual {v0, v5, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "ELF class/ABI bit width; ARM32 stays 32 even when decoding Thumb instructions."

    .line 110
    invoke-static {v4, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "archBits"

    .line 1772
    invoke-virtual {v0, v5, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "Instruction set used for this disassembly: thumb, arm, aarch64, x86, or x86_64."

    .line 96
    invoke-static {v1, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "instructionSet"

    .line 1773
    invoke-virtual {v0, v5, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "Instruction encoding width category: mixed16_32 for Thumb, fixed32 for ARM/AArch64, or variable for x86."

    .line 96
    invoke-static {v1, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "instructionWidth"

    .line 1774
    invoke-virtual {v0, v5, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "Logical byte window length exposed for this response, capped by maxBytes and the current mapping or applied symbol boundary."

    .line 110
    invoke-static {v4, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "bytesRead"

    .line 1775
    invoke-virtual {v0, v5, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "Bytes represented by disassemblyText."

    .line 110
    invoke-static {v4, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "bytesConsumed"

    .line 1776
    invoke-virtual {v0, v5, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "Whether the byte window ended with leftover bytes that are too short to form one complete instruction. These leftover bytes are not counted in bytesConsumed; retry the same address with a larger maxBytes instead of treating this as invalid code."

    .line 124
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "incompleteInstructionAtEnd"

    .line 1777
    invoke-virtual {v0, v5, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "Compact instruction text. Each line is \"0x<hex-address>: <hex-bytes> <assembly>\"; addresses include the 0x prefix and can be copied directly with addressKind=virtual, addresses have no leading zero padding. Lines have no indentation and use one space between columns. Machine bytes are contiguous lowercase hex in original byte order, ready to concatenate into expectedHex. The address is the effective virtual address, not the input file offset or original odd Thumb address."

    .line 96
    invoke-static {v1, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "disassemblyText"

    .line 1778
    invoke-virtual {v0, v5, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "Instruction count represented in disassemblyText."

    .line 110
    invoke-static {v4, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "instructionCount"

    .line 1779
    invoke-virtual {v0, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "Whether another contiguous window is available."

    .line 124
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "hasMore"

    .line 1780
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Value to pass as addressKind on the next mt_apk_native_disassemble call, or null."

    .line 103
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "nextAddressKind"

    .line 1781
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Value to pass as address on the next mt_apk_native_disassemble call, or null."

    .line 103
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "nextAddress"

    .line 1783
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Value to pass as instructionMode on the next mt_apk_native_disassemble call, or null."

    .line 103
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "nextInstructionMode"

    .line 1785
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Disassembly result."

    .line 1759
    invoke-static {v0, v1}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Stable reason token: arm32_mode_required or arm32_thumb_address_conflict."

    const-string v2, "Fixed hint string: odd virtual address indicates Thumb T-bit, ARM32 file/even address does not identify ARM or Thumb, or empty string when no mode hint is available."

    .line 2064
    invoke-static {v1, v2}, Ll/۫֫ۜ;->֫(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "Instruction mode diagnostics for ARM32 mt_apk_native_disassemble errors; diagnostics is null for unrelated argument or runtime errors."

    .line 2063
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 127
    invoke-static {v1}, Ll/֫ۛ᩻;->ۧ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "continue"

    .line 131
    invoke-static {}, Ll/ۧᩳܽ;->ܿ()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "mt_apk_native_disassemble"

    .line 129
    invoke-static {v3, v4, v2}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 134
    invoke-static {}, Ll/ۧᩳܽ;->ܿ()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "retry"

    .line 132
    invoke-static {v3, v4, v5}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "mt_apk_workspace_open"

    .line 137
    invoke-static {}, Ll/ۧᩳܽ;->ܳ()Lbin/mt/json/JSONObject;

    move-result-object v6

    .line 135
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

    const-string v2, "When data.hasMore=true, a purpose=continue action calls mt_apk_native_disassemble with complete arguments for the next window; otherwise success has no actions. ARM32 instructionMode errors may return mt_apk_native_disassemble retry actions; copy those arguments directly. Follow each action\'s tool and purpose, not mt_apk_continue. A corrupt workspace whose source APK remains accessible may return mt_apk_workspace_open to recreate it."

    .line 128
    invoke-static {v2, v5}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Result for mt_apk_native_disassemble. An instruction window in disassemblyText with address, mode, boundary, and continuation metadata. Check incompleteInstructionAtEnd before interpreting trailing bytes."

    .line 126
    invoke-static {v3, v0, v1, v2}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public static ۧ(Ll/ۗۛ᩻;)Lbin/mt/json/JSONObject;
    .locals 14

    .line 758
    iget-object v0, p0, Ll/ۗۛ᩻;->᩸:Ljava/lang/String;

    iget-object v1, p0, Ll/ۗۛ᩻;->᩶:Lbin/mt/json/JSONObject;

    const-string v2, "PATCH_EXPECTED_MISMATCH"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    const-string v4, "actualHex"

    const-string v5, "paddingMode"

    const-string v6, "locator"

    const-string v7, "editSessionId"

    const-string v8, "workspaceId"

    const-string v9, "NATIVE_STRING_PADDING_MISMATCH"

    if-nez v3, :cond_1

    const-string v3, "NATIVE_STRING_LENGTH_MISMATCH"

    .line 759
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 760
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    const-string v3, "NATIVE_STRING_TOO_LARGE"

    .line 761
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    const-string v3, "NATIVE_STRING_RANGE_OUT_OF_ENTRY"

    .line 762
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    .line 530
    :cond_0
    sget-object v3, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto/16 :goto_2

    .line 767
    :cond_1
    :goto_0
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 768
    invoke-static {v1, v8}, Ll/۫֫ۜ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v3, v8, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 769
    invoke-static {v1, v7}, Ll/۫֫ۜ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v3, v7, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 770
    invoke-static {v1, v6}, Ll/۫֫ۜ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v3, v6, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v10, "addressKind"

    .line 771
    invoke-static {v1, v10}, Ll/۫֫ۜ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v3, v10, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v10, "address"

    .line 772
    invoke-static {v1, v10}, Ll/۫֫ۜ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v3, v10, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v10, "patchedFileOffset"

    .line 773
    invoke-static {v1, v10}, Ll/۫֫ۜ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v11

    invoke-virtual {v3, v10, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 774
    invoke-static {v1, v5}, Ll/۫֫ۜ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v10

    invoke-virtual {v3, v5, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v10, "expectedText"

    .line 775
    invoke-static {v1, v10}, Ll/۫֫ۜ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v11

    invoke-virtual {v3, v10, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v10, "actualText"

    .line 776
    invoke-static {v1, v10}, Ll/۫֫ۜ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v11

    invoke-virtual {v3, v10, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v10, "expectedHex"

    .line 777
    invoke-static {v1, v10}, Ll/۫֫ۜ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v11

    invoke-virtual {v3, v10, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 778
    invoke-static {v1, v4}, Ll/۫֫ۜ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v10

    invoke-virtual {v3, v4, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v10, "expectedTextByteCount"

    .line 779
    invoke-static {v1, v10}, Ll/۫֫ۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v11

    invoke-virtual {v3, v10, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v10, "replacementTextByteCount"

    .line 780
    invoke-static {v1, v10}, Ll/۫֫ۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v11

    invoke-virtual {v3, v10, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v10, "requiredPaddingBytes"

    .line 781
    invoke-static {v1, v10}, Ll/۫֫ۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v11

    invoke-virtual {v3, v10, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v10, "actualPaddingHex"

    .line 782
    invoke-static {v1, v10}, Ll/۫֫ۜ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v11

    invoke-virtual {v3, v10, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v10, "terminatorRequired"

    .line 898
    invoke-virtual {v1, v10}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v11

    if-eqz v11, :cond_2

    .line 899
    invoke-virtual {v11}, Lbin/mt/json/JSONValue;->isBoolean()Z

    move-result v12

    if-eqz v12, :cond_2

    goto :goto_1

    :cond_2
    sget-object v11, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    .line 783
    :goto_1
    invoke-virtual {v3, v10, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v10, "bytesPatched"

    .line 784
    invoke-static {v1, v10}, Ll/۫֫ۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v11

    invoke-virtual {v3, v10, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v10, "limitBytes"

    .line 785
    invoke-static {v1, v10}, Ll/۫֫ۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v11

    invoke-virtual {v3, v10, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v10, "endByteOffset"

    .line 786
    invoke-static {v1, v10}, Ll/۫֫ۜ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v11

    invoke-virtual {v3, v10, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v10, "entrySize"

    .line 787
    invoke-static {v1, v10}, Ll/۫֫ۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v11

    invoke-virtual {v3, v10, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 837
    :goto_2
    iget-object v10, p0, Ll/ۗۛ᩻;->ۗ:Lbin/mt/json/JSONArray;

    invoke-static {v10}, Ll/۫֫ۜ;->֫(Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONArray;

    move-result-object v10

    .line 838
    invoke-virtual {v10}, Lbin/mt/json/JSONArray;->size()I

    move-result v11

    if-lez v11, :cond_3

    goto/16 :goto_7

    .line 841
    :cond_3
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    .line 842
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 843
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v10

    goto/16 :goto_7

    .line 846
    :cond_4
    invoke-static {v1, v8}, Ll/۫֫ۜ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 847
    invoke-static {v1, v7}, Ll/۫֫ۜ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 848
    invoke-static {v1, v6}, Ll/۫֫ۜ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-string v10, "byteOffset"

    .line 908
    invoke-virtual {v1, v10}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v11

    const/4 v12, -0x1

    if-eqz v11, :cond_6

    .line 909
    invoke-virtual {v11}, Lbin/mt/json/JSONValue;->isNumber()Z

    move-result v13

    if-nez v13, :cond_5

    goto :goto_3

    .line 913
    :cond_5
    :try_start_0
    invoke-virtual {v11}, Lbin/mt/json/JSONValue;->asInt()I

    move-result v12
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    nop

    .line 850
    :cond_6
    :goto_3
    invoke-static {v1, v5}, Ll/۫֫ۜ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 851
    invoke-static {v1, v4}, Ll/۫֫ۜ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 852
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_a

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_a

    invoke-virtual {v9}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_a

    if-ltz v12, :cond_a

    .line 853
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    const/4 v11, 0x2

    if-lt v4, v11, :cond_a

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    and-int/lit8 v4, v4, 0x1

    if-eqz v4, :cond_7

    goto :goto_6

    :cond_7
    const-string v4, "null_pad"

    .line 856
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8

    const/16 v1, 0x1000

    goto :goto_4

    .line 858
    :cond_8
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    div-int/2addr v1, v11

    :goto_4
    if-eqz v4, :cond_9

    const-string v4, "Read up to the native string patch limit and stop at the first NUL, then retry mt_apk_native_patch_string with the bytes before that terminator as refreshed expectedText."

    goto :goto_5

    :cond_9
    const-string v4, "Read the exact observed patch window, then retry mt_apk_native_patch_string only with refreshed expectedText derived from these bytes; do not include later bytes unless the fixed slot boundary is known independently."

    .line 862
    :goto_5
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v5

    .line 0
    invoke-static {v8, v0, v7, v2}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 868
    invoke-virtual {v0, v6, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 869
    invoke-virtual {v0, v10, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "maxBytes"

    .line 870
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "mt_apk_read_bytes"

    const-string v2, "retry"

    .line 862
    invoke-static {v0, v1, v2, v4}, Ll/ۤۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-virtual {v5, v0}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object v10

    goto :goto_7

    .line 854
    :cond_a
    :goto_6
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v10

    .line 531
    :goto_7
    invoke-static {p0, v3, v10}, Ll/᩶ۛ᩻;->֫(Ll/ۗۛ᩻;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 903
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 904
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isString()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const-string p0, ""

    return-object p0
.end method

.method public static ۧ(Ll/ۘܺۢ;)V
    .locals 13

    .line 558
    iget-object v0, p0, Ll/ۘܺۢ;->֫:Ll/ۖܺۢ;

    .line 559
    iget-boolean v1, v0, Ll/ۖܺۢ;->ۧ:Z

    iget-wide v2, v0, Ll/ۖܺۢ;->ܳ:J

    iget-wide v4, v0, Ll/ۖܺۢ;->ܿ:J

    iget-wide v6, v0, Ll/ۖܺۢ;->ۜ:J

    iget-object v8, v0, Ll/ۖܺۢ;->֫:Ljava/lang/String;

    iget-object v9, v0, Ll/ۖܺۢ;->ᩳ:Ljava/lang/String;

    iget-object v10, v0, Ll/ۖܺۢ;->ܽ:Ljava/lang/String;

    const-wide/16 v11, 0x0

    if-nez v1, :cond_1

    .line 560
    invoke-virtual {v9}, Ljava/lang/String;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_0

    .line 561
    invoke-virtual {v10}, Ljava/lang/String;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_0

    cmp-long p0, v6, v11

    if-nez p0, :cond_0

    iget-wide v0, v0, Ll/ۖܺۢ;->᩻:J

    cmp-long p0, v0, v11

    if-nez p0, :cond_0

    cmp-long p0, v4, v11

    if-nez p0, :cond_0

    cmp-long p0, v2, v11

    if-nez p0, :cond_0

    goto :goto_0

    .line 564
    :cond_0
    invoke-static {}, Ll/۫֫ۜ;->֫()Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    .line 568
    :cond_1
    iget-boolean v0, p0, Ll/ۘܺۢ;->ۧ:Z

    if-eqz v0, :cond_3

    invoke-virtual {v9}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {v10}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 583
    invoke-virtual {v10}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "auto"

    .line 584
    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "arm"

    .line 585
    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "thumb"

    .line 586
    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "unknown"

    .line 587
    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    cmp-long v0, v6, v11

    if-ltz v0, :cond_3

    cmp-long v0, v4, v11

    if-ltz v0, :cond_3

    cmp-long v0, v2, v11

    if-lez v0, :cond_3

    cmp-long v0, v4, v2

    if-gez v0, :cond_3

    const-wide v0, 0x7fffffffffffffffL

    sub-long/2addr v0, v2

    cmp-long v2, v6, v0

    if-gtz v2, :cond_3

    add-long/2addr v6, v4

    .line 569
    iget-wide v0, p0, Ll/ۘܺۢ;->ܺ:J

    cmp-long p0, v6, v0

    if-nez p0, :cond_3

    .line 574
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result p0

    const/16 v0, 0x1000

    if-gt p0, v0, :cond_3

    :goto_0
    return-void

    .line 575
    :cond_3
    invoke-static {}, Ll/۫֫ۜ;->֫()Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method public static ܳ()Lbin/mt/json/JSONObject;
    .locals 7

    .line 1748
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "string"

    const-string v2, "Workspace id."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "workspaceId"

    .line 1749
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Edit session id, or empty string for base APK."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "editSessionId"

    .line 1750
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "zip_entry locator."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "locator"

    .line 1751
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Parsed address kind: virtual or file_offset."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "addressKind"

    .line 1752
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Parsed input address as lowercase 0x hex."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "address"

    .line 1753
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "boolean"

    const-string v3, "For virtual input, whether the address is in a loaded file-backed ELF range; virtual-only runtime bytes can still miss. For file_offset input, whether SO file bytes contain the offset. Check mapping.isLoaded before treating the mapped address as loaded at runtime."

    .line 124
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "found"

    .line 1754
    invoke-virtual {v0, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 2256
    invoke-static {}, Ll/۫֫ۜ;->᩻()Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 2280
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "Whether a non-imported sized ELF symbol contains the mapped virtual address."

    .line 124
    invoke-static {v2, v6}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 2281
    invoke-virtual {v5, v4, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "Raw ELF symbol name, or empty string when not found."

    .line 96
    invoke-static {v1, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "name"

    .line 2282
    invoke-virtual {v2, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "Best-effort C++ demangled symbol name when available and different from name, otherwise empty string."

    .line 96
    invoke-static {v1, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "demangledName"

    .line 2283
    invoke-virtual {v2, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "Best-effort mode hint for mt_apk_native_disassemble or mt_apk_native_analyze_control_flow: auto, arm, thumb, unknown, or empty string when not found. unknown is not a valid tool input; try thumb and arm separately."

    .line 96
    invoke-static {v1, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "instructionMode"

    .line 2284
    invoke-virtual {v2, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "Symbol start virtual address, or null."

    .line 103
    invoke-static {v1, v4}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "startVirtualAddress"

    .line 2285
    invoke-virtual {v2, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "Symbol start ELF file offset within the zip_entry bytes, or null when unknown."

    .line 103
    invoke-static {v1, v4}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "startFileOffset"

    .line 2286
    invoke-virtual {v2, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "Offset from startVirtualAddress to the mapped virtual address, or null."

    .line 103
    invoke-static {v1, v4}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v4, "offset"

    .line 2287
    invoke-virtual {v2, v4, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "Symbol size in bytes, or 0 when not found."

    const-string v4, "integer"

    const-string v5, "size"

    const-string v6, "Best-effort non-imported sized ELF symbol that contains mapping.virtualAddress. It may be a function or another symbol type, and does not guarantee exact function boundaries. When mapping.isExecutable=true and startVirtualAddress is not null, copy startVirtualAddress to mt_apk_native_analyze_control_flow.address and choose outputMode=summary for triage or outputMode=full when detail arrays are needed. instructionMode is only a follow-up hint: auto, arm, and thumb can be copied to mt_apk_native_disassemble or mt_apk_native_analyze_control_flow; unknown means try thumb and arm separately, and empty string means no hint is available."

    .line 0
    invoke-static {v1, v4, v2, v5, v6}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "enclosingSymbol"

    .line 2257
    invoke-virtual {v3, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "Address mapping details. Address fields are null on miss. isLoaded means this file-backed mapping belongs to a loaded ELF range; virtual-only runtime bytes without file backing may still miss. isExecutable means that loaded mapping is executable. enclosingSymbol is best-effort and uses only non-imported sized ELF symbols; enclosingSymbol.found=false may mean stripped symbols, missing symbol sizes, or unavailable symbol metadata, not that no function contains the address. enclosingSymbol.instructionMode is a best-effort follow-up hint, not proof of the symbol\'s real instruction state."

    .line 2255
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "mapping"

    .line 1755
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Address mapping result."

    .line 1748
    invoke-static {v0, v1}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "No tool-specific diagnostics."

    .line 2393
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    invoke-static {v2, v1}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 100
    invoke-static {v1}, Ll/֫ۛ᩻;->ۧ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "mt_apk_native_map_address nextActions is intentionally empty."

    .line 2403
    invoke-static {v2}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Result for mt_apk_native_map_address. ELF address mapping. Check found, mapping.isLoaded, and mapping.isExecutable before following an address. enclosingSymbol is best-effort context."

    .line 99
    invoke-static {v3, v0, v1, v2}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public static ܽ()Lbin/mt/json/JSONObject;
    .locals 3

    .line 1594
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "sectionName"

    const-string v2, ""

    .line 1595
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    sget-object v1, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    const-string v2, "virtualAddress"

    .line 1596
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "fileOffset"

    .line 1597
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "rangeOffset"

    .line 1598
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "size"

    const/4 v2, 0x0

    .line 1599
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "isLoaded"

    .line 1600
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "isExecutable"

    .line 1601
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "segment"

    .line 1602
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public static ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONValue;
    .locals 0

    .line 888
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 889
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isString()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    return-object p0

    :cond_0
    sget-object p0, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    return-object p0
.end method

.method public static ܽ(Ll/ۘܺۢ;)V
    .locals 6

    .line 539
    iget-boolean v0, p0, Ll/ۘܺۢ;->ۧ:Z

    iget-boolean v1, p0, Ll/ۘܺۢ;->ܿ:Z

    iget-boolean v2, p0, Ll/ۘܺۢ;->ܳ:Z

    if-nez v0, :cond_1

    if-nez v2, :cond_0

    if-nez v1, :cond_0

    goto :goto_1

    .line 541
    :cond_0
    invoke-static {}, Ll/۫֫ۜ;->֫()Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    :cond_1
    if-eqz v1, :cond_3

    if-eqz v2, :cond_2

    goto :goto_0

    .line 546
    :cond_2
    invoke-static {}, Ll/۫֫ۜ;->֫()Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    .line 548
    :cond_3
    :goto_0
    iget-wide v0, p0, Ll/ۘܺۢ;->ܺ:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-ltz v4, :cond_4

    iget-wide v0, p0, Ll/ۘܺۢ;->ۜ:J

    cmp-long v4, v0, v2

    if-ltz v4, :cond_4

    iget-wide v0, p0, Ll/ۘܺۢ;->᩻:J

    cmp-long v4, v0, v2

    if-ltz v4, :cond_4

    iget-wide v4, p0, Ll/ۘܺۢ;->ۡ:J

    cmp-long p0, v4, v2

    if-ltz p0, :cond_4

    cmp-long p0, v0, v4

    if-gtz p0, :cond_4

    :goto_1
    return-void

    .line 550
    :cond_4
    invoke-static {}, Ll/۫֫ۜ;->ܿ()Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method public static ܿ()Ll/ۗۛ᩻;
    .locals 2

    const-string v0, "NATIVE_INVALID_ELF_MAPPING"

    const-string v1, "ELF address mapping is invalid."

    .line 598
    invoke-static {v0, v1}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    return-object v0
.end method

.method public static ᩳ()Lbin/mt/json/JSONObject;
    .locals 46

    .line 1790
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "string"

    const-string v2, "Workspace id."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "workspaceId"

    .line 1791
    invoke-virtual {v0, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "Edit session id, or empty string for base APK."

    .line 96
    invoke-static {v1, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "editSessionId"

    .line 1792
    invoke-virtual {v0, v5, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "zip_entry locator."

    .line 96
    invoke-static {v1, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v6, "locator"

    .line 1793
    invoke-virtual {v0, v6, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "Parsed address kind: virtual or file_offset."

    .line 96
    invoke-static {v1, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v7, "addressKind"

    .line 1794
    invoke-virtual {v0, v7, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "Parsed input address as lowercase 0x hex; odd ARM32 virtual input keeps the Thumb T-bit here."

    .line 96
    invoke-static {v1, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v8, "address"

    .line 1795
    invoke-virtual {v0, v8, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "Requested instruction mode."

    .line 96
    invoke-static {v1, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v9, "instructionMode"

    .line 1796
    invoke-virtual {v0, v9, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "full"

    const-string v10, "summary"

    filled-new-array {v3, v10}, [Ljava/lang/String;

    move-result-object v11

    const-string v12, "Requested output mode: full or summary."

    .line 1797
    invoke-static {v12, v11}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v11

    const-string v12, "outputMode"

    invoke-virtual {v0, v12, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v11, "boolean"

    const-string v13, "true only when outputMode=summary; blocks, edges, externalFlows, and unresolvedFlows remain present as empty arrays while observed counts remain populated."

    .line 124
    invoke-static {v11, v13}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v13

    const-string v14, "detailOmitted"

    .line 1799
    invoke-virtual {v0, v14, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v13, "Instruction mode used to decode this CFG."

    .line 96
    invoke-static {v1, v13}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v13

    const-string v14, "resolvedInstructionMode"

    .line 1800
    invoke-virtual {v0, v14, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v13, "Mapped virtual address for the request; ARM32 Thumb clears the T-bit."

    .line 96
    invoke-static {v1, v13}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v13

    const-string v14, "effectiveAddress"

    .line 1801
    invoke-virtual {v0, v14, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v13, "Address mapping details. Address fields are null on miss. isLoaded means this file-backed mapping belongs to a loaded ELF range; virtual-only runtime bytes without file backing may still miss. isExecutable means that loaded mapping is executable."

    .line 2248
    invoke-static {}, Ll/۫֫ۜ;->᩻()Lbin/mt/json/JSONObject;

    move-result-object v14

    .line 2247
    invoke-static {v14, v13}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v13

    const-string v14, "mapping"

    .line 1802
    invoke-virtual {v0, v14, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v13, "Architecture used for CFG decoding."

    .line 96
    invoke-static {v1, v13}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v13

    const-string v14, "arch"

    .line 1803
    invoke-virtual {v0, v14, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v13, "integer"

    const-string v14, "ELF class/ABI bit width; ARM32 stays 32 for Thumb CFGs."

    .line 110
    invoke-static {v13, v14}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v14

    const-string v15, "archBits"

    .line 1804
    invoke-virtual {v0, v15, v14}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v14, "Instruction set used for this graph: thumb, arm, aarch64, x86, or x86_64."

    .line 96
    invoke-static {v1, v14}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v14

    const-string v15, "instructionSet"

    .line 1805
    invoke-virtual {v0, v15, v14}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v14, "Instruction width category: mixed16_32, fixed32, or variable."

    .line 96
    invoke-static {v1, v14}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v14

    const-string v15, "instructionWidth"

    .line 1806
    invoke-virtual {v0, v15, v14}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 1819
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v14

    const-string v15, "Function candidate start virtual address as lowercase 0x hex."

    .line 96
    invoke-static {v1, v15}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v15

    move-object/from16 v16, v12

    const-string v12, "startVirtualAddress"

    .line 1820
    invoke-virtual {v14, v12, v15}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v14

    const-string v15, "Function candidate start ELF file offset as lowercase 0x hex."

    .line 96
    invoke-static {v1, v15}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v15

    move-object/from16 v17, v3

    const-string v3, "startFileOffset"

    .line 1821
    invoke-virtual {v14, v3, v15}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v14

    const-string v15, "Raw ELF symbol name, or empty string for requested_address fallback."

    .line 96
    invoke-static {v1, v15}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v15

    move-object/from16 v18, v10

    const-string v10, "name"

    .line 1822
    invoke-virtual {v14, v10, v15}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v10

    const-string v14, "Best-effort C++ demangled name when available, otherwise empty string."

    .line 96
    invoke-static {v1, v14}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v14

    const-string v15, "demangledName"

    .line 1823
    invoke-virtual {v10, v15, v14}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v10

    const-string v14, "Sized symbol byte length, or 0 for requested_address fallback."

    .line 110
    invoke-static {v13, v14}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v14

    const-string v15, "symbolSize"

    .line 1824
    invoke-virtual {v10, v15, v14}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v10

    const-string v14, "requested_address"

    const-string v15, "function_symbol"

    move-object/from16 v19, v9

    const-string v9, "executable_symbol"

    filled-new-array {v15, v9, v14}, [Ljava/lang/String;

    move-result-object v14

    move-object/from16 v20, v8

    const-string v8, "How the start was selected."

    .line 1825
    invoke-static {v8, v14}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v14, "startSource"

    invoke-virtual {v10, v14, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v10, "executable_mapping"

    filled-new-array {v15, v9, v10}, [Ljava/lang/String;

    move-result-object v9

    const-string v10, "How the exclusive end boundary was selected."

    .line 1827
    invoke-static {v10, v9}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    const-string v10, "boundarySource"

    invoke-virtual {v8, v10, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v9, "boundaryEndVirtualAddress"

    const-string v10, "Exclusive function boundary end as lowercase 0x hex."

    const-string v14, "Selected function candidate and exclusive analysis boundary. Symbol-based boundaries are best-effort ELF metadata; requested_address falls back to the initial executable mapping."

    .line 0
    invoke-static {v8, v1, v10, v9, v14}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v9, "function"

    .line 1807
    invoke-virtual {v0, v9, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v8, "Basic-block details sorted by virtual address. In outputMode=full, this array contains the observed blocks. In outputMode=summary, this field remains present as an empty array; use observedGraphSummary.blockCount for the observed count. assemblyText is compact factual disassembly without machine bytes; each line is 0xaddress: mnemonic operands."

    const-string v9, "type"

    const-string v10, "array"

    const-string v14, "description"

    .line 0
    invoke-static {v9, v10, v14, v8}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    .line 1836
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v15

    move-object/from16 v21, v7

    const-string v7, "Block start virtual address as lowercase 0x hex."

    move-object/from16 v22, v6

    .line 96
    invoke-static {v1, v7}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    .line 1837
    invoke-virtual {v15, v12, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v15, "Block start ELF file offset as lowercase 0x hex."

    move-object/from16 v23, v5

    .line 96
    invoke-static {v1, v15}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    .line 1838
    invoke-virtual {v6, v3, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "Unique decoded instruction bytes in this block."

    move-object/from16 v24, v4

    .line 110
    invoke-static {v13, v6}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    move-object/from16 v25, v2

    const-string v2, "size"

    .line 1839
    invoke-virtual {v5, v2, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "Instruction lines in assemblyText."

    .line 110
    invoke-static {v13, v5}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    move-object/from16 v26, v2

    const-string v2, "instructionCount"

    .line 1840
    invoke-virtual {v4, v2, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v33, "invalid"

    const-string v34, "budget_boundary"

    const-string v27, "fallthrough"

    const-string v28, "conditional_jump"

    const-string v29, "jump"

    const-string v30, "indirect_jump"

    const-string v31, "return"

    const-string v32, "trap"

    filled-new-array/range {v27 .. v34}, [Ljava/lang/String;

    move-result-object v5

    move-object/from16 v27, v2

    const-string v2, "How this block path ends."

    .line 1841
    invoke-static {v2, v5}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v5, "terminator"

    invoke-virtual {v4, v5, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "assemblyText"

    move-object/from16 v28, v5

    const-string v5, "One line per instruction in the form 0xaddress: mnemonic operands; no machine bytes."

    move-object/from16 v29, v6

    const-string v6, "One returned basic block."

    .line 0
    invoke-static {v2, v1, v5, v4, v6}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "items"

    .line 1836
    invoke-virtual {v8, v4, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v5, "blocks"

    .line 1808
    invoke-virtual {v0, v5, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Confirmed direct edge details. In outputMode=full, both endpoints are block starts present in blocks. In outputMode=summary, this field remains present as an empty array; use observedGraphSummary.edgeCount for the observed count. Calls are not CFG edges."

    .line 0
    invoke-static {v9, v10, v14, v2}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 1851
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "Source block start as lowercase 0x hex."

    .line 96
    invoke-static {v1, v6}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v8, "fromVirtualAddress"

    .line 1852
    invoke-virtual {v5, v8, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "Target block start as lowercase 0x hex."

    .line 96
    invoke-static {v1, v6}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v8, "toVirtualAddress"

    .line 1853
    invoke-virtual {v5, v8, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "fallthrough"

    const-string v8, "branch_true"

    move-object/from16 v30, v3

    const-string v3, "branch_false"

    move-object/from16 v31, v15

    const-string v15, "jump"

    move-object/from16 v32, v7

    filled-new-array {v6, v8, v3, v15}, [Ljava/lang/String;

    move-result-object v7

    move-object/from16 v33, v12

    const-string v12, "Edge kind."

    .line 1854
    invoke-static {v12, v7}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v12, "kind"

    invoke-virtual {v5, v12, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v7, "One direct block edge."

    .line 1851
    invoke-static {v5, v7}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    invoke-virtual {v2, v4, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v5, "edges"

    .line 1809
    invoke-virtual {v0, v5, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Known direct exit details from the selected function. In outputMode=summary, this field remains present as an empty array; use observedGraphSummary.externalFlowCount for the observed count. These are expected exits and do not make controlFlowComplete false."

    .line 0
    invoke-static {v9, v10, v14, v2}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 1862
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v7, "Source instruction address as lowercase 0x hex."

    .line 96
    invoke-static {v1, v7}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v12

    move-object/from16 v34, v13

    const-string v13, "sourceVirtualAddress"

    .line 1863
    invoke-virtual {v5, v13, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v5

    filled-new-array {v6, v8, v3, v15}, [Ljava/lang/String;

    move-result-object v12

    move-object/from16 v35, v11

    const-string v11, "Flow kind."

    .line 1864
    invoke-static {v11, v12}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v12

    move-object/from16 v36, v9

    const-string v9, "flowKind"

    invoke-virtual {v5, v9, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v12, "Known external target as lowercase 0x hex."

    .line 96
    invoke-static {v1, v12}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v12

    move-object/from16 v37, v10

    const-string v10, "targetVirtualAddress"

    .line 1866
    invoke-virtual {v5, v10, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v12, "outside_function_boundary"

    move-object/from16 v38, v14

    const-string v14, "other_function_symbol"

    filled-new-array {v12, v14}, [Ljava/lang/String;

    move-result-object v12

    const-string v14, "Why this target was not followed."

    .line 1867
    invoke-static {v14, v12}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v12

    const-string v14, "reason"

    invoke-virtual {v5, v14, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v12, "One known external flow."

    .line 1862
    invoke-static {v5, v12}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    invoke-virtual {v2, v4, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v5, "externalFlows"

    .line 1810
    invoke-virtual {v0, v5, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 1872
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 96
    invoke-static {v1, v7}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    .line 1873
    invoke-virtual {v2, v13, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    filled-new-array {v6, v8, v3, v15}, [Ljava/lang/String;

    move-result-object v3

    .line 1874
    invoke-static {v11, v3}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    invoke-virtual {v2, v9, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Known target address as lowercase 0x hex."

    .line 96
    invoke-static {v1, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 1876
    invoke-virtual {v2, v10, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v44, "max_instructions_reached"

    const-string v45, "invalid_instruction"

    const-string v39, "target_not_executable"

    const-string v40, "unaligned_or_overlapping_target"

    const-string v41, "instruction_mode_transition"

    const-string v42, "max_blocks_reached"

    const-string v43, "max_analysis_bytes_reached"

    filled-new-array/range {v39 .. v45}, [Ljava/lang/String;

    move-result-object v3

    const-string v5, "Why the target was unresolved."

    .line 1877
    invoke-static {v5, v3}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    invoke-virtual {v2, v14, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Known target that could not become a returned block."

    .line 1872
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 1882
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 96
    invoke-static {v1, v7}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    .line 1883
    invoke-virtual {v3, v13, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "Indirect jump flow."

    const-string v7, "indirect_jump"

    .line 1884
    invoke-static {v7, v5}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    invoke-virtual {v3, v9, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "The target is not statically known."

    const-string v8, "indirect_target"

    .line 1885
    invoke-static {v8, v5}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    invoke-virtual {v3, v14, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "Indirect jump whose target was not statically known."

    .line 1882
    invoke-static {v3, v5}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 1886
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v10, "Function candidate start as lowercase 0x hex."

    .line 96
    invoke-static {v1, v10}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v10

    .line 1887
    invoke-virtual {v5, v13, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v10, "decode"

    const-string v11, "Entry decode flow."

    .line 1888
    invoke-static {v10, v11}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v10

    invoke-virtual {v5, v9, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v9, "The entry instruction could not be decoded."

    const-string v10, "invalid_instruction"

    .line 1889
    invoke-static {v10, v9}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    invoke-virtual {v5, v14, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v9, "Function entry could not be decoded."

    .line 1886
    invoke-static {v5, v9}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v9, "Details for control-flow paths not converted into confirmed block edges. In outputMode=summary, this field remains present as an empty array; use observedGraphSummary.unresolvedFlowCount and observedGraphSummary.unresolvedReasonCounts for observed totals and reason counts. Read analysisSummary.completionReason before retrying or drawing conclusions."

    move-object/from16 v11, v36

    move-object/from16 v12, v37

    move-object/from16 v13, v38

    .line 0
    invoke-static {v11, v12, v13, v9}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    .line 1893
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v14

    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v11

    .line 1894
    invoke-virtual {v11, v2}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object v2

    invoke-virtual {v2, v3}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object v2

    invoke-virtual {v2, v5}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object v2

    const-string v3, "anyOf"

    .line 1893
    invoke-virtual {v14, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    invoke-virtual {v9, v4, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "unresolvedFlows"

    .line 1811
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 1898
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Whether all statically resolvable direct flow inside the selected boundary was explored with no unresolved flows."

    move-object/from16 v5, v35

    .line 124
    invoke-static {v5, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v9, "controlFlowComplete"

    .line 1899
    invoke-virtual {v2, v9, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v42, "unresolved_indirect_flow"

    const-string v43, "invalid_control_flow_target"

    const-string v37, "complete"

    const-string v38, "max_analysis_bytes_reached"

    const-string v39, "max_blocks_reached"

    const-string v40, "max_instructions_reached"

    const-string v41, "invalid_instruction"

    filled-new-array/range {v37 .. v43}, [Ljava/lang/String;

    move-result-object v3

    const-string v9, "Primary completion reason in fixed priority order."

    .line 1900
    invoke-static {v9, v3}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v9, "completionReason"

    invoke-virtual {v2, v9, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Stable explanation of completionReason and retry semantics."

    .line 96
    invoke-static {v1, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v9, "meaning"

    .line 1904
    invoke-virtual {v2, v9, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Unique successfully decoded instruction bytes."

    move-object/from16 v9, v34

    .line 110
    invoke-static {v9, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v11, "bytesAnalyzed"

    .line 1905
    invoke-virtual {v2, v11, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "instructionsAnalyzed"

    const-string v11, "Unique successfully decoded instructions."

    const-string v14, "CFG completeness and budget usage. controlFlowComplete is true only when completionReason=complete and observedGraphSummary.unresolvedFlowCount=0. Read observedGraphSummary for counts in both output modes. Budget retry results replace this graph and must not be merged; a budget reason without a retry action means its limiting budget is already at the public limit."

    .line 0
    invoke-static {v2, v9, v11, v3, v14}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "analysisSummary"

    .line 1812
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 1911
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Observed basic-block count; this can be lower than the consumed candidate budget."

    .line 110
    invoke-static {v9, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v11, "blockCount"

    .line 1912
    invoke-virtual {v2, v11, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Observed confirmed direct edge count."

    .line 110
    invoke-static {v9, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v11, "edgeCount"

    .line 1913
    invoke-virtual {v2, v11, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Observed known external flow count."

    .line 110
    invoke-static {v9, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v11, "externalFlowCount"

    .line 1914
    invoke-virtual {v2, v11, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Observed unresolved flow count."

    .line 110
    invoke-static {v9, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v11, "unresolvedFlowCount"

    .line 1915
    invoke-virtual {v2, v11, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 1924
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v11, "Observed fallthrough terminator count."

    .line 110
    invoke-static {v9, v11}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v11

    .line 1925
    invoke-virtual {v3, v6, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v6, "Observed conditional_jump terminator count."

    .line 110
    invoke-static {v9, v6}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v11, "conditional_jump"

    .line 1926
    invoke-virtual {v3, v11, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v6, "Observed jump terminator count."

    .line 110
    invoke-static {v9, v6}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    .line 1927
    invoke-virtual {v3, v15, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v6, "Observed indirect_jump terminator count."

    .line 110
    invoke-static {v9, v6}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    .line 1928
    invoke-virtual {v3, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v6, "Observed return terminator count."

    .line 110
    invoke-static {v9, v6}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "return"

    .line 1929
    invoke-virtual {v3, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v6, "Observed trap terminator count."

    .line 110
    invoke-static {v9, v6}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "trap"

    .line 1930
    invoke-virtual {v3, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v6, "Observed invalid terminator count."

    .line 110
    invoke-static {v9, v6}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "invalid"

    .line 1931
    invoke-virtual {v3, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v6, "budget_boundary"

    const-string v7, "Observed budget_boundary terminator count."

    const-string v11, "Observed basic-block terminator counts; all fields are present and 0 means no observed block used that terminator."

    .line 0
    invoke-static {v3, v9, v7, v6, v11}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v6, "terminatorCounts"

    .line 1916
    invoke-virtual {v2, v6, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 1937
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v6, "Observed target_not_executable count."

    .line 110
    invoke-static {v9, v6}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "target_not_executable"

    .line 1938
    invoke-virtual {v3, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v6, "Observed unaligned_or_overlapping_target count."

    .line 110
    invoke-static {v9, v6}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "unaligned_or_overlapping_target"

    .line 1939
    invoke-virtual {v3, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v6, "Observed instruction_mode_transition count."

    .line 110
    invoke-static {v9, v6}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "instruction_mode_transition"

    .line 1941
    invoke-virtual {v3, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v6, "Observed max_blocks_reached count."

    .line 110
    invoke-static {v9, v6}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "max_blocks_reached"

    .line 1943
    invoke-virtual {v3, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v6, "Observed max_analysis_bytes_reached count."

    .line 110
    invoke-static {v9, v6}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "max_analysis_bytes_reached"

    .line 1944
    invoke-virtual {v3, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v6, "Observed max_instructions_reached count."

    .line 110
    invoke-static {v9, v6}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "max_instructions_reached"

    .line 1946
    invoke-virtual {v3, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v6, "Observed invalid_instruction count."

    .line 110
    invoke-static {v9, v6}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    .line 1948
    invoke-virtual {v3, v10, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v6, "Observed indirect_target count."

    const-string v7, "Observed unresolved-flow reason counts; all fields are present and 0 means no observed unresolved flow used that reason."

    .line 0
    invoke-static {v3, v9, v6, v8, v7}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v6, "unresolvedReasonCounts"

    .line 1917
    invoke-virtual {v2, v6, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Conservative observed-only hints. Values may include observed_linear, observed_branchy, and observed_dispatcher_like. Empty array means no hint matched."

    .line 1918
    invoke-static {v3}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v6, "observedShapeHints"

    invoke-virtual {v2, v6, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Observed CFG summary for the subgraph analyzed in this call. Counts remain populated in both output modes. In summary mode, the four detail array fields remain present but empty, so use these counts instead of their lengths. observedShapeHints are conservative hints about the observed subgraph only."

    .line 1910
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "observedGraphSummary"

    .line 1813
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 1954
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Whether an entry or fallback first block was available."

    .line 124
    invoke-static {v5, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "available"

    .line 1955
    invoke-virtual {v2, v5, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Preview block start address, or null when unavailable."

    .line 103
    invoke-static {v1, v3}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    move-object/from16 v5, v33

    .line 1956
    invoke-virtual {v2, v5, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "At most 16 original assemblyText lines from the entry or fallback first block."

    .line 1957
    invoke-static {v3}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v6, "lines"

    invoke-virtual {v2, v6, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Entry block preview copied from the original assemblyText lines without reparsing addresses or instructions."

    .line 1953
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "entryPreview"

    .line 1814
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "At most 8 representative observed blocks selected for summary triage. Preview lines are copied from original assemblyText without reparsing."

    move-object/from16 v3, v36

    .line 0
    invoke-static {v3, v12, v13, v2}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 1965
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    move-object/from16 v6, v32

    .line 103
    invoke-static {v1, v6}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    .line 1966
    invoke-virtual {v3, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    move-object/from16 v5, v31

    .line 103
    invoke-static {v1, v5}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    move-object/from16 v6, v30

    .line 1967
    invoke-virtual {v3, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    move-object/from16 v5, v29

    .line 110
    invoke-static {v9, v5}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    move-object/from16 v6, v26

    .line 1968
    invoke-virtual {v3, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "Instruction count reported for the full block."

    .line 110
    invoke-static {v9, v5}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    move-object/from16 v6, v27

    .line 1969
    invoke-virtual {v3, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v35, "invalid"

    const-string v36, "budget_boundary"

    const-string v29, "fallthrough"

    const-string v30, "conditional_jump"

    const-string v31, "jump"

    const-string v32, "indirect_jump"

    const-string v33, "return"

    const-string v34, "trap"

    filled-new-array/range {v29 .. v36}, [Ljava/lang/String;

    move-result-object v5

    const-string v6, "How this observed block path ends."

    .line 1970
    invoke-static {v6, v5}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    move-object/from16 v6, v28

    invoke-virtual {v3, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "At most 4 original assemblyText lines from this block."

    .line 1973
    invoke-static {v5}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "previewLines"

    invoke-virtual {v3, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "One observed notable block preview."

    .line 1965
    invoke-static {v3, v5}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    invoke-virtual {v2, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "notableBlocks"

    .line 1815
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Function-local direct static CFG result. Read analysisSummary before treating this graph as complete; a budget retry replaces this result rather than extending it."

    .line 1790
    invoke-static {v0, v2}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Stable reason token: arm32_mode_required or arm32_thumb_address_conflict."

    const-string v3, "Fixed hint string: odd virtual address indicates Thumb T-bit, ARM32 file/even address does not identify ARM or Thumb, or empty string when no mode hint is available."

    .line 2071
    invoke-static {v2, v3}, Ll/۫֫ۜ;->֫(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Instruction mode diagnostics for ARM32 mt_apk_native_analyze_control_flow errors; diagnostics is null for unrelated argument or runtime errors."

    .line 2070
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 145
    invoke-static {v2}, Ll/֫ۛ᩻;->ۧ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 148
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    move-object/from16 v4, v25

    .line 96
    invoke-static {v1, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    move-object/from16 v5, v24

    .line 149
    invoke-virtual {v3, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Edit session id. Empty string reads the base APK; otherwise copy the id from the edited session."

    .line 96
    invoke-static {v1, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    move-object/from16 v5, v23

    .line 150
    invoke-virtual {v3, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "ZIP entry locator for the native ELF."

    .line 96
    invoke-static {v1, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    move-object/from16 v5, v22

    .line 151
    invoke-virtual {v3, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "virtual"

    const-string v5, "file_offset"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v4

    const-string v5, "Address kind: virtual or file_offset."

    .line 152
    invoke-static {v5, v4}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    move-object/from16 v5, v21

    invoke-virtual {v3, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Unsigned address string for a function symbol or an address inside the function candidate."

    .line 96
    invoke-static {v1, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    move-object/from16 v4, v20

    .line 153
    invoke-virtual {v3, v4, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "arm"

    const-string v4, "thumb"

    const-string v5, "auto"

    filled-new-array {v5, v3, v4}, [Ljava/lang/String;

    move-result-object v3

    const-string v4, "Instruction mode: auto, arm, or thumb."

    .line 154
    invoke-static {v4, v3}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    move-object/from16 v4, v19

    invoke-virtual {v1, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "Output mode: full populates graph detail arrays; summary keeps the required detail arrays present but empty while observed counts remain populated."

    move-object/from16 v4, v17

    move-object/from16 v5, v18

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v4

    .line 155
    invoke-static {v3, v4}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    move-object/from16 v4, v16

    invoke-virtual {v1, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "Unique successfully decoded instruction-byte budget."

    .line 110
    invoke-static {v9, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "maxAnalysisBytes"

    .line 157
    invoke-virtual {v1, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "Candidate basic-block start budget."

    .line 110
    invoke-static {v9, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "maxBlocks"

    .line 158
    invoke-virtual {v1, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "maxInstructions"

    const-string v4, "Unique successfully decoded instruction budget."

    const-string v5, "Arguments for mt_apk_native_analyze_control_flow."

    .line 0
    invoke-static {v1, v9, v4, v3, v5}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "mt_apk_native_analyze_control_flow"

    const-string v4, "retry"

    .line 147
    invoke-static {v1, v3, v4}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "inspect"

    .line 152
    invoke-static {}, Ll/ۧᩳܽ;->ܿ()Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "mt_apk_native_disassemble"

    .line 150
    invoke-static {v5, v6, v3}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "mt_apk_workspace_open"

    .line 155
    invoke-static {}, Ll/ۧᩳܽ;->ܳ()Lbin/mt/json/JSONObject;

    move-result-object v6

    .line 153
    invoke-static {v6, v5, v4}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const/4 v5, 0x3

    new-array v5, v5, [Lbin/mt/json/JSONObject;

    const/4 v6, 0x0

    aput-object v1, v5, v6

    const/4 v1, 0x1

    aput-object v3, v5, v1

    const/4 v1, 0x2

    aput-object v4, v5, v1

    const-string v1, "Budget or ARM32 mode errors may return mt_apk_native_analyze_control_flow retry actions. A retry result replaces the previous graph and must not be merged. When no larger CFG retry is available, mt_apk_native_disassemble may inspect a local instruction window. A corrupt workspace whose source APK remains accessible may return mt_apk_workspace_open."

    .line 146
    invoke-static {v1, v5}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "Result for mt_apk_native_analyze_control_flow. A bounded function graph or summary. Read analysisSummary for completeness. Shape hints describe only the observed subgraph. Retry results replace the previous graph; never merge them."

    .line 144
    invoke-static {v3, v0, v2, v1}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public static ᩷()Lbin/mt/json/JSONObject;
    .locals 16

    .line 2003
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "string"

    const-string v2, "Workspace id."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "workspaceId"

    .line 2004
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Edit session id that was modified."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "editSessionId"

    .line 2005
    invoke-virtual {v0, v4, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "zip_entry locator."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v5, "locator"

    .line 2006
    invoke-virtual {v0, v5, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Parsed input address kind: virtual or file_offset."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v6, "addressKind"

    .line 2007
    invoke-virtual {v0, v6, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Parsed input address as lowercase 0x hex."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v7, "address"

    .line 2008
    invoke-virtual {v0, v7, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Mapped virtual address used for context, or null when file_offset input is not mapped."

    .line 103
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v8, "effectiveAddress"

    .line 2009
    invoke-virtual {v0, v8, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Address mapping details. Address fields are null on miss. isLoaded means this file-backed mapping belongs to a loaded ELF range; virtual-only runtime bytes without file backing may still miss. isExecutable means that loaded mapping is executable."

    .line 2248
    invoke-static {}, Ll/۫֫ۜ;->᩻()Lbin/mt/json/JSONObject;

    move-result-object v8

    .line 2247
    invoke-static {v8, v2}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v8, "mapping"

    .line 2010
    invoke-virtual {v0, v8, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Patched SO file offset inside the zip_entry bytes as lowercase 0x hex. Use nextActions[].arguments.byteOffset for decimal mt_apk_read_bytes input."

    .line 103
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v8, "patchedFileOffset"

    .line 2011
    invoke-virtual {v0, v8, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Always utf8; this is not an input option."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v9, "textEncoding"

    .line 2012
    invoke-virtual {v0, v9, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "integer"

    const-string v9, "UTF-8 byte count of expectedText."

    .line 110
    invoke-static {v2, v9}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    const-string v10, "expectedTextByteCount"

    .line 2013
    invoke-virtual {v0, v10, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v9, "UTF-8 byte count of replacementText."

    .line 110
    invoke-static {v2, v9}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    const-string v11, "replacementTextByteCount"

    .line 2014
    invoke-virtual {v0, v11, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v9, "Extra padding bytes consumed after expectedText when replacementText is longer; 0 when equal or shorter."

    .line 110
    invoke-static {v2, v9}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    const-string v12, "extraPaddingBytesConsumed"

    .line 2015
    invoke-virtual {v0, v12, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v9, "boolean"

    const-string v12, "true only for successful null_pad patches; false for none and space_pad."

    .line 124
    invoke-static {v9, v12}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v12

    const-string v13, "terminatorPreserved"

    .line 2016
    invoke-virtual {v0, v13, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v12, "Complete patch window byte count, not actual changed byte count."

    .line 110
    invoke-static {v2, v12}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v12

    const-string v13, "bytesPatched"

    .line 2017
    invoke-virtual {v0, v13, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v12, "Complete bytes verified before writing, uppercase hex. Includes padding or final NUL when applicable."

    .line 96
    invoke-static {v1, v12}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v12

    const-string v14, "beforeHex"

    .line 2018
    invoke-virtual {v0, v14, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v12, "Complete bytes written, uppercase hex. Includes padding or final NUL when applicable."

    .line 96
    invoke-static {v1, v12}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v12

    const-string v14, "afterHex"

    .line 2019
    invoke-virtual {v0, v14, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v12, "Padding mode used for this patch: none, null_pad, or space_pad."

    const-string v14, "paddingMode"

    const-string v15, "Native UTF-8 string patch result."

    .line 0
    invoke-static {v0, v1, v12, v14, v15}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 2107
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v12

    const-string v15, "Workspace id, or empty string when unavailable."

    .line 96
    invoke-static {v1, v15}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v15

    .line 2108
    invoke-virtual {v12, v3, v15}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v12, "Edit session id, or empty string when unavailable."

    .line 96
    invoke-static {v1, v12}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v12

    .line 2109
    invoke-virtual {v3, v4, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "zip_entry locator, or empty string when unavailable."

    .line 96
    invoke-static {v1, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 2110
    invoke-virtual {v3, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Requested address kind, or empty string when unavailable."

    .line 96
    invoke-static {v1, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 2111
    invoke-virtual {v3, v6, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Parsed input address as lowercase 0x hex, or empty string when unavailable."

    .line 96
    invoke-static {v1, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 2112
    invoke-virtual {v3, v7, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Patched SO file offset as lowercase 0x hex, or null."

    .line 103
    invoke-static {v1, v4}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 2113
    invoke-virtual {v3, v8, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Requested padding mode, or null."

    .line 103
    invoke-static {v1, v4}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 2114
    invoke-virtual {v3, v14, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Expected UTF-8 text stale guard, or null."

    .line 103
    invoke-static {v1, v4}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "expectedText"

    .line 2115
    invoke-virtual {v3, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Best-effort readable actual text prefix, or null. The exact bytes are in actualHex."

    .line 103
    invoke-static {v1, v4}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "actualText"

    .line 2116
    invoke-virtual {v3, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Expected full patch window bytes as uppercase hex, or null."

    .line 103
    invoke-static {v1, v4}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "expectedHex"

    .line 2117
    invoke-virtual {v3, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Actual current bytes as uppercase hex, or null."

    .line 103
    invoke-static {v1, v4}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "actualHex"

    .line 2118
    invoke-virtual {v3, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "UTF-8 byte count of expectedText, or null."

    .line 117
    invoke-static {v2, v4}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 2119
    invoke-virtual {v3, v10, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "UTF-8 byte count of replacementText, or null."

    .line 117
    invoke-static {v2, v4}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 2120
    invoke-virtual {v3, v11, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Padding bytes checked after expectedText, or null."

    .line 117
    invoke-static {v2, v4}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "requiredPaddingBytes"

    .line 2121
    invoke-virtual {v3, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Actual padding/terminator bytes as uppercase hex, or null."

    .line 103
    invoke-static {v1, v4}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "actualPaddingHex"

    .line 2122
    invoke-virtual {v3, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Whether null_pad required a final NUL terminator, or null."

    .line 2123
    invoke-static {v9, v4}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "terminatorRequired"

    invoke-virtual {v3, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Complete patch window byte count, or null."

    .line 117
    invoke-static {v2, v4}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 2124
    invoke-virtual {v3, v13, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Maximum supported patch window bytes, or null."

    .line 117
    invoke-static {v2, v4}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "limitBytes"

    .line 2125
    invoke-virtual {v3, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Exclusive end SO file offset as lowercase 0x hex, or null."

    .line 103
    invoke-static {v1, v4}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v4, "endByteOffset"

    .line 2126
    invoke-virtual {v3, v4, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "SO entry size in bytes, or null."

    .line 117
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "entrySize"

    .line 2127
    invoke-virtual {v1, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "native_patch_string diagnostics. diagnostics is null for unrelated argument errors. actualText is only a readable best-effort prefix; use actualHex as the exact stale-guard fact."

    .line 2106
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 189
    invoke-static {v1}, Ll/֫ۛ᩻;->ۧ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "inspect"

    .line 193
    invoke-static {}, Ll/ۧᩳܽ;->ۜ()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "mt_apk_read_bytes"

    .line 191
    invoke-static {v3, v4, v2}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 196
    invoke-static {}, Ll/ۧᩳܽ;->ۜ()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "retry"

    .line 194
    invoke-static {v3, v4, v5}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "mt_apk_workspace_open"

    .line 199
    invoke-static {}, Ll/ۧᩳܽ;->ܳ()Lbin/mt/json/JSONObject;

    move-result-object v6

    .line 197
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

    const-string v2, "Successful native string patch returns one read_bytes verification action. Stale expectedText or padding errors use a 4096-byte recovery window only for null_pad; space_pad and none stay within the exact observed window because their slot boundary is not self-describing. A corrupt workspace whose source APK remains accessible may return mt_apk_workspace_open to recreate it."

    .line 190
    invoke-static {v2, v5}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Result for mt_apk_native_patch_string. String patch result. beforeHex and afterHex cover the full byte window including padding or a final NUL. Use nextActions to verify the result."

    .line 187
    invoke-static {v3, v0, v1, v2}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public static ᩻()Lbin/mt/json/JSONObject;
    .locals 4

    .line 2264
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "string"

    const-string v2, "Section or segment name, or empty string on miss."

    .line 96
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "sectionName"

    .line 2265
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Mapped virtual address, or null."

    .line 103
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "virtualAddress"

    .line 2266
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Mapped ELF file offset within the zip_entry bytes, or null."

    .line 103
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "fileOffset"

    .line 2267
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Offset inside mapped range, or null."

    .line 103
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "rangeOffset"

    .line 2268
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Mapped range size, or 0 on miss."

    const-string v2, "integer"

    .line 110
    invoke-static {v2, v1}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "size"

    .line 2269
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "boolean"

    const-string v2, "Whether this file-backed mapping belongs to a loaded ELF range. false means do not treat it as a runtime address; true does not make virtual-only bytes outside file backing mappable."

    .line 124
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "isLoaded"

    .line 2270
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Whether this loaded mapping is executable; do not disassemble when false."

    .line 124
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "isExecutable"

    .line 2271
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Whether the mapping came from a segment; this does not mean the address is loaded."

    .line 124
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "segment"

    .line 2272
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method
