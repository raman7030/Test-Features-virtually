.class public final Ll/ܶۡۜ;
.super Ljava/lang/Object;
.source "O6XG"


# instance fields
.field public final ֫:Ll/᩶۫᩷;

.field public final ۧ:Ll/ᩳۖۜ;


# direct methods
.method public constructor <init>(Ll/ᩳۖۜ;)V
    .locals 1

    .line 26
    new-instance v0, Ll/᩶۫᩷;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Ll/ܶۡۜ;->ۧ:Ll/ᩳۖۜ;

    .line 32
    iput-object v0, p0, Ll/ܶۡۜ;->֫:Ll/᩶۫᩷;

    return-void
.end method

.method public static ֫(Ll/ۗۛ᩻;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLbin/mt/json/JSONArray;)Ll/ۗۛ᩻;
    .locals 5

    .line 217
    new-instance v0, Lbin/mt/json/JSONObject;

    iget-object v1, p0, Ll/ۗۛ᩻;->᩶:Lbin/mt/json/JSONObject;

    iget-object v2, p0, Ll/ۗۛ᩻;->ۗ:Lbin/mt/json/JSONArray;

    iget-object v3, p0, Ll/ۗۛ᩻;->᩹:Ljava/lang/String;

    iget-object v4, p0, Ll/ۗۛ᩻;->᩸:Ljava/lang/String;

    invoke-direct {v0, v1}, Lbin/mt/json/JSONObject;-><init>(Lbin/mt/json/JSONObject;)V

    const-string v1, "path"

    .line 218
    invoke-virtual {v0, v1, p1}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    const-string p1, "policyRevision"

    .line 219
    invoke-virtual {v0, p1, p2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    const-string p1, "changed"

    .line 220
    invoke-virtual {v0, p1, p4}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    const-string p1, "operationMode"

    .line 222
    invoke-static {p3}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p2

    .line 221
    invoke-virtual {v0, p1, p2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    const-string p1, "stateKnown"

    .line 223
    invoke-virtual {v0, p1, p5}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    .line 224
    new-instance p1, Lbin/mt/json/JSONArray;

    invoke-direct {p1, p6}, Lbin/mt/json/JSONArray;-><init>(Lbin/mt/json/JSONArray;)V

    const-string p2, "warnings"

    invoke-virtual {v0, p2, p1}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    .line 225
    iget-boolean p1, p0, Ll/ۗۛ᩻;->۫:Z

    if-eqz p1, :cond_0

    .line 226
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-static {v4, p0, v3, v2, v0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0

    .line 229
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-static {v4, p0, v3, v2, v0}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ܶ᩵ܿ;Ljava/lang/String;)Ll/ۙ᩵ܿ;
    .locals 3

    .line 147
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->᩹()Ll/ۤ᩵ܿ;

    move-result-object v0

    sget-object v1, Ll/۬᩵ܿ;->ۗ:Ll/۬᩵ܿ;

    invoke-virtual {v0, v1}, Ll/ۤ᩵ܿ;->֫(Ll/۬᩵ܿ;)Ll/ۙ᩵ܿ;

    move-result-object v0

    .line 149
    sget-object v1, Ll/ۙ᩵ܿ;->ۗ:Ll/ۙ᩵ܿ;

    if-eq v0, v1, :cond_0

    return-object v0

    .line 152
    :cond_0
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p0

    .line 153
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    const-string v1, "path"

    const-string v2, "policyRevision"

    .line 0
    invoke-static {v1, p0, v2, p1}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "operation"

    const-string v1, "delete_file"

    .line 241
    invoke-virtual {p0, p1, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "backendReason"

    const-string v1, "unsupported"

    .line 242
    invoke-virtual {p0, p1, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "changed"

    const/4 v1, 0x0

    .line 243
    invoke-virtual {p0, p1, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "operationMode"

    .line 245
    sget-object v1, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    .line 244
    invoke-virtual {p0, p1, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "stateKnown"

    const/4 v1, 0x1

    .line 246
    invoke-virtual {p0, p1, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object p0

    new-instance p1, Lbin/mt/json/JSONArray;

    invoke-direct {p1, v0}, Lbin/mt/json/JSONArray;-><init>(Lbin/mt/json/JSONArray;)V

    const-string v0, "warnings"

    .line 247
    invoke-virtual {p0, v0, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "fatal"

    const-string v0, "FILE_BACKEND_UNSUPPORTED"

    const-string v1, "The file backend does not support checked permanent deletion."

    const/4 v2, 0x0

    .line 253
    invoke-static {v0, v1, p1, v2, p0}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    .line 150
    throw p0
.end method

.method private ֫(Ljava/lang/String;Ll/۟ۢۜ;)Ll/۠ۡۜ;
    .locals 12

    .line 49
    iget-object v0, p0, Ll/ܶۡۜ;->ۧ:Ll/ᩳۖۜ;

    invoke-virtual {v0, p1}, Ll/ᩳۖۜ;->ܽ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    .line 50
    invoke-direct {p0, v1}, Ll/ܶۡۜ;->֫(Ll/ܶ᩵ܿ;)Ll/۫᩵ܿ;

    move-result-object v2

    invoke-direct {p0, v2, p1}, Ll/ܶۡۜ;->֫(Ll/۫᩵ܿ;Ljava/lang/String;)V

    .line 51
    iget-object p2, p2, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    invoke-static {v1, p2}, Ll/ܶۡۜ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/String;)Ll/ۙ᩵ܿ;

    .line 53
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->getParent()Ljava/lang/String;

    move-result-object p2

    .line 57
    :goto_0
    invoke-virtual {v0}, Ll/ᩳۖۜ;->֫()Ll/۟ۢۜ;

    move-result-object v1

    .line 58
    invoke-virtual {v1, p1}, Ll/۟ۢۜ;->ᩳ(Ljava/lang/String;)V

    iget-object v2, v1, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    if-eqz p2, :cond_0

    .line 61
    invoke-virtual {v1, p2}, Ll/۟ۢۜ;->ᩳ(Ljava/lang/String;)V

    .line 63
    :cond_0
    invoke-virtual {v1, p1}, Ll/۟ۢۜ;->ۧ(Ljava/lang/String;)V

    .line 64
    invoke-virtual {v0, p1}, Ll/ᩳۖۜ;->ܽ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    .line 165
    new-instance v3, Ll/ۨܳۜ;

    invoke-direct {v3, p1, v2}, Ll/ۨܳۜ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1, v3}, Ll/ᩳۖۜ;->֫(Ll/ܶ᩵ܿ;Ll/ܽۖۜ;)V

    .line 66
    invoke-direct {p0, v1}, Ll/ܶۡۜ;->֫(Ll/ܶ᩵ܿ;)Ll/۫᩵ܿ;

    move-result-object v3

    invoke-direct {p0, v3, p1}, Ll/ܶۡۜ;->֫(Ll/۫᩵ܿ;Ljava/lang/String;)V

    .line 67
    invoke-static {v1, v2}, Ll/ܶۡۜ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/String;)Ll/ۙ᩵ܿ;

    .line 69
    invoke-virtual {v0}, Ll/ᩳۖۜ;->֫()Ll/۟ۢۜ;

    move-result-object v1

    .line 70
    iget-object v3, v1, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    .line 75
    :cond_1
    invoke-virtual {v0, p1}, Ll/ᩳۖۜ;->ܽ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p2

    .line 165
    new-instance v2, Ll/ۨܳۜ;

    invoke-direct {v2, p1, v3}, Ll/ۨܳۜ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, p2, v2}, Ll/ᩳۖۜ;->֫(Ll/ܶ᩵ܿ;Ll/ܽۖۜ;)V

    .line 77
    invoke-direct {p0, p2}, Ll/ܶۡۜ;->֫(Ll/ܶ᩵ܿ;)Ll/۫᩵ܿ;

    move-result-object v2

    invoke-direct {p0, v2, p1}, Ll/ܶۡۜ;->֫(Ll/۫᩵ܿ;Ljava/lang/String;)V

    .line 78
    invoke-static {p2, v3}, Ll/ܶۡۜ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/String;)Ll/ۙ᩵ܿ;

    move-result-object v2

    .line 258
    sget-object v3, Ll/ۙ᩵ܿ;->᩹:Ll/ۙ᩵ܿ;

    if-ne v2, v3, :cond_2

    const-string v3, "atomic"

    goto :goto_1

    :cond_2
    const-string v3, "best_effort"

    .line 82
    :goto_1
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v11

    const/4 v4, 0x1

    const/4 v5, 0x0

    .line 88
    :try_start_0
    invoke-virtual {p2}, Ll/ܶ᩵ܿ;->᩹()Ll/ۤ᩵ܿ;

    move-result-object p2

    invoke-virtual {p2}, Ll/ۤ᩵ܿ;->ܿ()V
    :try_end_0
    .catch Ll/᩹᩵ܿ; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p2, 0x1

    const/4 v0, 0x1

    move-object v4, v5

    const/4 v8, 0x1

    const/4 v9, 0x1

    goto/16 :goto_5

    :catch_0
    move-exception p2

    const/4 v6, 0x0

    .line 187
    :try_start_1
    invoke-virtual {v0, p1}, Ll/ᩳۖۜ;->ܽ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->᩹()Ll/ۤ᩵ܿ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۤ᩵ܿ;->ۜ()Ll/۫᩵ܿ;

    move-result-object v0

    .line 188
    invoke-virtual {v0}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v7

    sget-object v8, Ll/ۗ᩵ܿ;->ۙ:Ll/ۗ᩵ܿ;

    if-ne v7, v8, :cond_3

    .line 189
    new-instance v0, Ll/֨ۡۜ;

    invoke-direct {v0, v4, v4}, Ll/֨ۡۜ;-><init>(ZZ)V

    goto :goto_3

    .line 191
    :cond_3
    invoke-virtual {v0}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v0

    sget-object v7, Ll/ۗ᩵ܿ;->۬:Ll/ۗ᩵ܿ;

    if-ne v0, v7, :cond_4

    .line 192
    new-instance v0, Ll/֨ۡۜ;

    invoke-direct {v0, v6, v4}, Ll/֨ۡۜ;-><init>(ZZ)V

    goto :goto_3

    .line 194
    :cond_4
    new-instance v0, Ll/֨ۡۜ;

    invoke-direct {v0, v4, v6}, Ll/֨ۡۜ;-><init>(ZZ)V
    :try_end_1
    .catch Ll/᩹᩵ܿ; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    .line 196
    :catch_1
    sget-object v0, Ll/ۙ᩵ܿ;->᩹:Ll/ۙ᩵ܿ;

    if-ne v2, v0, :cond_5

    goto :goto_2

    :cond_5
    const/4 v4, 0x0

    .line 197
    :goto_2
    new-instance v0, Ll/֨ۡۜ;

    xor-int/lit8 v2, v4, 0x1

    invoke-direct {v0, v2, v4}, Ll/֨ۡۜ;-><init>(ZZ)V

    .line 203
    :goto_3
    invoke-static {p2}, Ll/ᩳۖۜ;->֫(Ll/᩹᩵ܿ;)Ll/ۗۛ᩻;

    move-result-object v2

    .line 204
    invoke-virtual {p2}, Ll/᩹᩵ܿ;->ܽ()Ll/᩸᩵ܿ;

    move-result-object p2

    sget-object v4, Ll/᩸᩵ܿ;->ۗ:Ll/᩸᩵ܿ;

    if-eq p2, v4, :cond_6

    move-object v4, v2

    goto :goto_4

    .line 207
    :cond_6
    new-instance p2, Lbin/mt/json/JSONObject;

    iget-object v2, v2, Ll/ۗۛ᩻;->᩶:Lbin/mt/json/JSONObject;

    invoke-direct {p2, v2}, Lbin/mt/json/JSONObject;-><init>(Lbin/mt/json/JSONObject;)V

    const-string v2, "FILE_DELETE_FAILED"

    const-string v4, "Failed to permanently delete the local file."

    const-string v6, "warning"

    invoke-static {v2, v4, v6, v5, p2}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p2

    move-object v4, p2

    .line 95
    :goto_4
    iget-object v6, v1, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    iget-boolean p2, v0, Ll/֨ۡۜ;->֫:Z

    iget-boolean v0, v0, Ll/֨ۡۜ;->ۧ:Z

    move-object v5, p1

    move-object v7, v3

    move v8, p2

    move v9, v0

    move-object v10, v11

    invoke-static/range {v4 .. v10}, Ll/ܶۡۜ;->֫(Ll/ۗۛ᩻;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLbin/mt/json/JSONArray;)Ll/ۗۛ᩻;

    move-result-object v2

    move-object v4, v2

    :goto_5
    if-nez v8, :cond_7

    if-nez v9, :cond_a

    .line 101
    :cond_7
    :try_start_2
    iget-object p2, p0, Ll/ܶۡۜ;->֫:Ll/᩶۫᩷;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    invoke-static {}, Ll/ᩳ۬᩻;->֫()Ll/ᩳ۬᩻;

    .line 29
    invoke-static {p1}, Ll/ܳۤܳ;->ᩳ(Ljava/lang/String;)V

    .line 31
    invoke-static {}, Ll/ܽ۬᩻;->֫()V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_6

    .line 263
    :catch_2
    invoke-virtual {v11}, Lbin/mt/json/JSONArray;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_8
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const-string v2, "File change notification could not be completed."

    if-eqz v0, :cond_9

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbin/mt/json/JSONValue;

    .line 264
    invoke-virtual {v0}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v5

    if-eqz v5, :cond_8

    invoke-virtual {v0}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    goto :goto_6

    .line 268
    :cond_9
    invoke-virtual {v11, v2}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    :cond_a
    :goto_6
    if-nez v4, :cond_b

    .line 110
    new-instance p2, Ll/۠ۡۜ;

    new-instance v0, Lbin/mt/json/JSONArray;

    invoke-direct {v0, v11}, Lbin/mt/json/JSONArray;-><init>(Lbin/mt/json/JSONArray;)V

    invoke-direct {p2, v0, p1}, Ll/۠ۡۜ;-><init>(Lbin/mt/json/JSONArray;Ljava/lang/String;)V

    return-object p2

    .line 107
    :cond_b
    iget-object v6, v1, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    move-object v5, p1

    move-object v7, v3

    move-object v10, v11

    invoke-static/range {v4 .. v10}, Ll/ܶۡۜ;->֫(Ll/ۗۛ᩻;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLbin/mt/json/JSONArray;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1
.end method

.method private ֫(Ll/ܶ᩵ܿ;)Ll/۫᩵ܿ;
    .locals 1

    .line 116
    :try_start_0
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->᩹()Ll/ۤ᩵ܿ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۤ᩵ܿ;->ۜ()Ll/۫᩵ܿ;

    move-result-object p1
    :try_end_0
    .catch Ll/᩹᩵ܿ; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 118
    iget-object v0, p0, Ll/ܶۡۜ;->ۧ:Ll/ᩳۖۜ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Ll/ᩳۖۜ;->֫(Ll/᩹᩵ܿ;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1
.end method

.method private ֫(Ll/۫᩵ܿ;Ljava/lang/String;)V
    .locals 3

    .line 124
    sget-object v0, Ll/ۚۡۜ;->֫:[I

    invoke-virtual {p1}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, Ll/ܶۡۜ;->ۧ:Ll/ᩳۖۜ;

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    return-void

    :cond_0
    const-string v0, "FILE_UNSUPPORTED_TYPE"

    const-string v1, "Special nodes cannot be deleted by general file tools."

    .line 0
    invoke-static {p1, v2, v0, v1, p2}, Ll/᩶᩵ᩳ;->֫(Ll/۫᩵ܿ;Ll/ᩳۖۜ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 138
    throw p1

    :cond_1
    const-string v0, "FILE_IS_SYMLINK"

    const-string v1, "Symbolic links are not accepted by mt_file_delete."

    .line 0
    invoke-static {p1, v2, v0, v1, p2}, Ll/᩶᩵ᩳ;->֫(Ll/۫᩵ܿ;Ll/ᩳۖۜ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 134
    throw p1

    :cond_2
    const-string v0, "FILE_NOT_REGULAR"

    const-string v1, "Directory paths must be deleted with mt_file_delete_directory."

    .line 0
    invoke-static {p1, v2, v0, v1, p2}, Ll/᩶᩵ᩳ;->֫(Ll/۫᩵ܿ;Ll/ᩳۖۜ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 130
    throw p1

    .line 128
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p2}, Ll/ᩳۖۜ;->ܿ(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)Ll/۠ۡۜ;
    .locals 3

    .line 39
    iget-object v0, p0, Ll/ܶۡۜ;->ۧ:Ll/ᩳۖۜ;

    invoke-virtual {v0}, Ll/ᩳۖۜ;->֫()Ll/۟ۢۜ;

    move-result-object v1

    const-string v2, "path"

    .line 40
    invoke-static {p1, v1, v2}, Ll/ᩳۖۜ;->ۧ(Ljava/lang/String;Ll/۟ۢۜ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 41
    invoke-virtual {v0, p1}, Ll/ᩳۖۜ;->ۧ(Ljava/lang/String;)Ll/ۤۖۜ;

    move-result-object v0

    .line 42
    :try_start_0
    invoke-direct {p0, p1, v1}, Ll/ܶۡۜ;->֫(Ljava/lang/String;Ll/۟ۢۜ;)Ll/۠ۡۜ;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    invoke-virtual {v0}, Ll/ۤۖۜ;->close()V

    return-object p1

    :catchall_0
    move-exception p1

    .line 41
    :try_start_1
    invoke-virtual {v0}, Ll/ۤۖۜ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
.end method
