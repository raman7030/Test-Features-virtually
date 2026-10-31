.class public final Ll/۫ۢۜ;
.super Ljava/lang/Object;
.source "K6XC"


# instance fields
.field public final ֫:Ll/᩵᩻ۜ;

.field public final ۧ:Ll/۬ۖۜ;


# direct methods
.method public constructor <init>(Ll/۬ۖۜ;Ll/᩵᩻ۜ;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Ll/۫ۢۜ;->ۧ:Ll/۬ۖۜ;

    .line 32
    iput-object p2, p0, Ll/۫ۢۜ;->֫:Ll/᩵᩻ۜ;

    return-void
.end method

.method public static bridge synthetic ֫()Ll/ۗۛ᩻;
    .locals 1

    const-string v0, "Local source byte count does not match bytes written."

    .line 0
    invoke-static {v0}, Ll/۫ۢۜ;->֫(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    return-object v0
.end method

.method public static ֫(Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 4

    .line 184
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "backendReason"

    const-string v2, "byte_count_mismatch"

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "WORKSPACE_ENTRY_SOURCE_INVALID"

    const-string v2, "fatal"

    const/4 v3, 0x0

    .line 181
    invoke-static {v1, p0, v2, v3, v0}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ۗۛ᩻;Ll/ۙۢۜ;)Ll/ۗۛ᩻;
    .locals 11

    .line 216
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 217
    iget-object v1, p0, Ll/ۗۛ᩻;->᩶:Lbin/mt/json/JSONObject;

    iget-object v2, p0, Ll/ۗۛ᩻;->ۗ:Lbin/mt/json/JSONArray;

    iget-object v3, p0, Ll/ۗۛ᩻;->᩹:Ljava/lang/String;

    iget-object v4, p0, Ll/ۗۛ᩻;->᩸:Ljava/lang/String;

    invoke-virtual {v1}, Lbin/mt/json/JSONObject;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lbin/mt/json/JSONObject$Member;

    .line 218
    invoke-virtual {v5}, Lbin/mt/json/JSONObject$Member;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5}, Lbin/mt/json/JSONObject$Member;->getValue()Lbin/mt/json/JSONValue;

    move-result-object v5

    invoke-virtual {v0, v6, v5}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    goto :goto_0

    :cond_0
    const-string v1, "direction"

    .line 220
    iget-object v5, p1, Ll/ۙۢۜ;->ܽ:Ljava/lang/String;

    invoke-virtual {v0, v1, v5}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v5, "workspaceId"

    iget-object v6, p1, Ll/ۙۢۜ;->ܺ:Ljava/lang/String;

    .line 221
    invoke-virtual {v1, v5, v6}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 222
    iget-object v5, p1, Ll/ۙۢۜ;->ܿ:Ljava/lang/String;

    if-nez v5, :cond_1

    .line 223
    sget-object v5, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_1

    :cond_1
    invoke-static {v5}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v5

    :goto_1
    const-string v6, "editSessionId"

    .line 222
    invoke-virtual {v1, v6, v5}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v5, "entryName"

    iget-object v6, p1, Ll/ۙۢۜ;->ܳ:Ljava/lang/String;

    .line 224
    invoke-virtual {v1, v5, v6}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    iget-object v6, p1, Ll/ۙۢۜ;->ܳ:Ljava/lang/String;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-string v5, "zip_entry"

    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 258
    invoke-static/range {v5 .. v10}, Ll/۬ܳۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "locator"

    .line 225
    invoke-virtual {v1, v6, v5}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    .line 226
    iget-object v1, p1, Ll/ۙۢۜ;->᩻:Ljava/lang/String;

    if-eqz v1, :cond_2

    const-string v5, "localPath"

    .line 227
    invoke-virtual {v0, v5, v1}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    :cond_2
    const-string v1, "operation"

    .line 229
    invoke-virtual {v0, v1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v5

    if-eqz v5, :cond_3

    .line 254
    invoke-virtual {v5}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v5

    if-eqz v5, :cond_3

    goto :goto_3

    .line 230
    :cond_3
    iget-object v5, p1, Ll/ۙۢۜ;->ۜ:Ljava/lang/String;

    if-nez v5, :cond_4

    .line 231
    sget-object v5, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_2

    :cond_4
    invoke-static {v5}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v5

    .line 230
    :goto_2
    invoke-virtual {v0, v1, v5}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    :goto_3
    const-string v1, "backendReason"

    .line 233
    invoke-virtual {v0, v1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v5

    if-eqz v5, :cond_5

    .line 254
    invoke-virtual {v5}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v5

    if-eqz v5, :cond_5

    goto :goto_4

    .line 234
    :cond_5
    sget-object v5, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    invoke-virtual {v0, v1, v5}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    :goto_4
    const-string v1, "changed"

    .line 236
    iget-boolean v5, p1, Ll/ۙۢۜ;->ۧ:Z

    invoke-virtual {v0, v1, v5}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 237
    iget-object v5, p1, Ll/ۙۢۜ;->᩷:Ljava/lang/String;

    if-nez v5, :cond_6

    .line 238
    sget-object v5, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_5

    :cond_6
    invoke-static {v5}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v5

    :goto_5
    const-string v6, "operationMode"

    .line 237
    invoke-virtual {v1, v6, v5}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v5, "stateKnown"

    iget-boolean v6, p1, Ll/ۙۢۜ;->ۢ:Z

    .line 239
    invoke-virtual {v1, v5, v6}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v1

    new-instance v5, Lbin/mt/json/JSONArray;

    iget-object v6, p1, Ll/ۙۢۜ;->ۡ:Lbin/mt/json/JSONArray;

    invoke-direct {v5, v6}, Lbin/mt/json/JSONArray;-><init>(Lbin/mt/json/JSONArray;)V

    const-string v6, "warnings"

    .line 240
    invoke-virtual {v1, v6, v5}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 241
    iget-wide v5, p1, Ll/ۙۢۜ;->֫:J

    const-wide/16 v7, 0x0

    cmp-long v9, v5, v7

    if-gez v9, :cond_7

    .line 242
    sget-object v5, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_6

    :cond_7
    invoke-static {v5, v6}, Lbin/mt/json/JSON;->value(J)Lbin/mt/json/JSONValue;

    move-result-object v5

    :goto_6
    const-string v6, "bytesCopied"

    .line 241
    invoke-virtual {v1, v6, v5}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 243
    iget-object v5, p1, Ll/ۙۢۜ;->ᩳ:Ljava/lang/Integer;

    if-nez v5, :cond_8

    .line 244
    sget-object v5, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_7

    :cond_8
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static {v5}, Lbin/mt/json/JSON;->value(I)Lbin/mt/json/JSONValue;

    move-result-object v5

    :goto_7
    const-string v6, "editRevision"

    .line 243
    invoke-virtual {v1, v6, v5}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    iget-boolean v5, p1, Ll/ۙۢۜ;->ۢ:Z

    if-eqz v5, :cond_9

    iget-boolean p1, p1, Ll/ۙۢۜ;->ۧ:Z

    if-nez p1, :cond_9

    const/4 p1, 0x1

    goto :goto_8

    :cond_9
    const/4 p1, 0x0

    :goto_8
    const-string v5, "safeToRetry"

    .line 245
    invoke-virtual {v1, v5, p1}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    .line 246
    iget-boolean p1, p0, Ll/ۗۛ᩻;->۫:Z

    if-eqz p1, :cond_a

    .line 247
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-static {v4, p0, v3, v2, v0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0

    .line 249
    :cond_a
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-static {v4, p0, v3, v2, v0}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ֫(Ll/۫ۢۜ;Ll/ۙۢۜ;Ll/ۜۜۜ;Ljava/io/BufferedOutputStream;)Ll/ۡ᩷ۜ;
    .locals 4

    const-string v0, "workspace_read"

    .line 87
    iput-object v0, p1, Ll/ۙۢۜ;->ۜ:Ljava/lang/String;

    .line 88
    new-instance v0, Ll/ۗۢۜ;

    invoke-direct {v0, p3}, Ll/ۗۢۜ;-><init>(Ljava/io/FilterOutputStream;)V

    .line 91
    :try_start_0
    iget-object p0, p0, Ll/۫ۢۜ;->֫:Ll/᩵᩻ۜ;

    .line 92
    invoke-virtual {p0, p2, v0}, Ll/᩵᩻ۜ;->֫(Ll/ۜۜۜ;Ljava/io/OutputStream;)Ll/ۡ᩷ۜ;

    move-result-object p0

    .line 93
    iget-object p2, p0, Ll/ۡ᩷ۜ;->ۧ:Ljava/lang/Integer;

    iput-object p2, p1, Ll/ۙۢۜ;->ᩳ:Ljava/lang/Integer;

    .line 94
    iget-wide p2, p0, Ll/ۡ᩷ۜ;->֫:J

    invoke-static {v0}, Ll/ۗۢۜ;->֫(Ll/ۗۢۜ;)J

    move-result-wide v1

    cmp-long v3, p2, v1

    if-nez v3, :cond_0

    const-string p2, "local_publish"

    .line 98
    iput-object p2, p1, Ll/ۙۢۜ;->ۜ:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 101
    invoke-static {p1, v0}, Ll/ۙۢۜ;->֫(Ll/ۙۢۜ;Ll/ۗۢۜ;)V

    return-object p0

    :cond_0
    :try_start_1
    const-string p0, "Workspace entry byte count does not match bytes written."

    .line 95
    invoke-static {p0}, Ll/۫ۢۜ;->֫(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p0

    .line 101
    invoke-static {p1, v0}, Ll/ۙۢۜ;->֫(Ll/ۙۢۜ;Ll/ۗۢۜ;)V

    .line 102
    throw p0
.end method

.method public static synthetic ֫(Ll/۫ۢۜ;Ll/ۙۢۜ;Ll/᩷ۜۜ;Ll/᩸ۖۜ;)Ll/ۡ᩷ۜ;
    .locals 1

    .line 135
    iget-object v0, p3, Ll/᩸ۖۜ;->ܿ:Ljava/lang/String;

    iput-object v0, p1, Ll/ۙۢۜ;->᩻:Ljava/lang/String;

    const-string v0, "atomic"

    .line 136
    iput-object v0, p1, Ll/ۙۢۜ;->᩷:Ljava/lang/String;

    const-string v0, "overlay_publish"

    .line 137
    iput-object v0, p1, Ll/ۙۢۜ;->ۜ:Ljava/lang/String;

    .line 138
    iget-object p0, p0, Ll/۫ۢۜ;->֫:Ll/᩵᩻ۜ;

    new-instance v0, Ll/᩶ۢۜ;

    invoke-direct {v0, p3, p1}, Ll/᩶ۢۜ;-><init>(Ll/᩸ۖۜ;Ll/ۙۢۜ;)V

    invoke-virtual {p0, p2, v0}, Ll/᩵᩻ۜ;->֫(Ll/᩷ۜۜ;Ll/ᩴ᩻ۜ;)Ll/ۡ᩷ۜ;

    move-result-object p0

    return-object p0
.end method

.method private ֫(Ll/ۙۢۜ;Ljava/lang/String;Z)Ll/۬ۢۜ;
    .locals 9

    .line 129
    new-instance v0, Ll/᩷ۜۜ;

    iget-object v1, p1, Ll/ۙۢۜ;->ܺ:Ljava/lang/String;

    iget-object v2, p1, Ll/ۙۢۜ;->ܿ:Ljava/lang/String;

    iget-object v3, p1, Ll/ۙۢۜ;->ܳ:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, p3}, Ll/᩷ۜۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string p3, "local_read"

    .line 132
    iput-object p3, p1, Ll/ۙۢۜ;->ۜ:Ljava/lang/String;

    .line 133
    new-instance p3, Ll/᩹ۢۜ;

    invoke-direct {p3, p0, p1, v0}, Ll/᩹ۢۜ;-><init>(Ll/۫ۢۜ;Ll/ۙۢۜ;Ll/᩷ۜۜ;)V

    .line 134
    iget-object v0, p0, Ll/۫ۢۜ;->ۧ:Ll/۬ۖۜ;

    invoke-virtual {v0, p2, p3}, Ll/۬ۖۜ;->֫(Ljava/lang/String;Ll/᩹ۢۜ;)Ll/ۡ᩷ۜ;

    move-result-object p2

    const/4 p3, 0x1

    .line 165
    iput-boolean p3, p1, Ll/ۙۢۜ;->ۧ:Z

    .line 166
    iput-boolean p3, p1, Ll/ۙۢۜ;->ۢ:Z

    .line 167
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object p3

    iput-object p3, p1, Ll/ۙۢۜ;->ۡ:Lbin/mt/json/JSONArray;

    .line 168
    iget-object p3, p2, Ll/ۡ᩷ۜ;->ۧ:Ljava/lang/Integer;

    iput-object p3, p1, Ll/ۙۢۜ;->ᩳ:Ljava/lang/Integer;

    .line 169
    iget-wide v0, p2, Ll/ۡ᩷ۜ;->֫:J

    iput-wide v0, p1, Ll/ۙۢۜ;->֫:J

    const-wide/16 v2, 0x0

    cmp-long p3, v0, v2

    if-ltz p3, :cond_0

    .line 173
    new-instance p3, Ll/۬ۢۜ;

    iget-object v1, p1, Ll/ۙۢۜ;->ܽ:Ljava/lang/String;

    iget-object v2, p2, Ll/ۡ᩷ۜ;->ܿ:Ljava/lang/String;

    iget-object v3, p2, Ll/ۡ᩷ۜ;->ܽ:Ljava/lang/String;

    iget-object v4, p2, Ll/ۡ᩷ۜ;->ᩳ:Ljava/lang/String;

    iget-object v5, p1, Ll/ۙۢۜ;->᩻:Ljava/lang/String;

    .line 175
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v6

    iget-wide v7, p2, Ll/ۡ᩷ۜ;->֫:J

    move-object v0, p3

    invoke-direct/range {v0 .. v8}, Ll/۬ۢۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;J)V

    return-object p3

    :cond_0
    const-string p1, "Workspace returned an invalid copied byte count."

    .line 171
    invoke-static {p1}, Ll/۫ۢۜ;->֫(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1
.end method

.method private ۧ(Ll/ۙۢۜ;Ljava/lang/String;Z)Ll/۬ۢۜ;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 81
    new-instance v2, Ll/ۜۜۜ;

    iget-object v3, v1, Ll/ۙۢۜ;->ܺ:Ljava/lang/String;

    iget-object v4, v1, Ll/ۙۢۜ;->ܿ:Ljava/lang/String;

    iget-object v5, v1, Ll/ۙۢۜ;->ܳ:Ljava/lang/String;

    invoke-direct {v2, v3, v4, v5}, Ll/ۜۜۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 85
    new-instance v3, Ll/᩸ۢۜ;

    invoke-direct {v3, v0, v1, v2}, Ll/᩸ۢۜ;-><init>(Ll/۫ۢۜ;Ll/ۙۢۜ;Ll/ۜۜۜ;)V

    .line 86
    iget-object v2, v0, Ll/۫ۢۜ;->ۧ:Ll/۬ۖۜ;

    move-object/from16 v4, p2

    move/from16 v5, p3

    invoke-virtual {v2, v4, v5, v3}, Ll/۬ۖۜ;->֫(Ljava/lang/String;ZLl/᩸ۢۜ;)Ll/ۙۖۜ;

    move-result-object v2

    .line 105
    iget-object v3, v2, Ll/ۙۖۜ;->ۧ:Ljava/lang/String;

    iput-object v3, v1, Ll/ۙۢۜ;->᩻:Ljava/lang/String;

    const/4 v3, 0x1

    .line 106
    iput-boolean v3, v1, Ll/ۙۢۜ;->ۧ:Z

    .line 107
    iput-boolean v3, v1, Ll/ۙۢۜ;->ۢ:Z

    .line 108
    iget-object v3, v2, Ll/ۙۖۜ;->ܽ:Ljava/lang/String;

    iput-object v3, v1, Ll/ۙۢۜ;->᩷:Ljava/lang/String;

    .line 109
    new-instance v3, Lbin/mt/json/JSONArray;

    iget-object v4, v2, Ll/ۙۖۜ;->ܳ:Lbin/mt/json/JSONArray;

    invoke-direct {v3, v4}, Lbin/mt/json/JSONArray;-><init>(Lbin/mt/json/JSONArray;)V

    iput-object v3, v1, Ll/ۙۢۜ;->ۡ:Lbin/mt/json/JSONArray;

    const-string v3, "local_publish"

    .line 110
    iput-object v3, v1, Ll/ۙۢۜ;->ۜ:Ljava/lang/String;

    .line 111
    iget-object v3, v2, Ll/ۙۖۜ;->ᩳ:Ljava/lang/Object;

    check-cast v3, Ll/ۡ᩷ۜ;

    .line 113
    iget-object v5, v3, Ll/ۡ᩷ۜ;->ۧ:Ljava/lang/Integer;

    iput-object v5, v1, Ll/ۙۢۜ;->ᩳ:Ljava/lang/Integer;

    .line 114
    iget-wide v5, v2, Ll/ۙۖۜ;->ܿ:J

    iput-wide v5, v1, Ll/ۙۢۜ;->֫:J

    .line 115
    iget-wide v7, v3, Ll/ۡ᩷ۜ;->֫:J

    cmp-long v9, v7, v5

    if-nez v9, :cond_0

    .line 118
    new-instance v5, Ll/۬ۢۜ;

    iget-object v11, v1, Ll/ۙۢۜ;->ܽ:Ljava/lang/String;

    iget-object v12, v3, Ll/ۡ᩷ۜ;->ܿ:Ljava/lang/String;

    iget-object v13, v3, Ll/ۡ᩷ۜ;->ܽ:Ljava/lang/String;

    iget-object v14, v3, Ll/ۡ᩷ۜ;->ᩳ:Ljava/lang/String;

    iget-object v15, v2, Ll/ۙۖۜ;->ۧ:Ljava/lang/String;

    new-instance v1, Lbin/mt/json/JSONArray;

    invoke-direct {v1, v4}, Lbin/mt/json/JSONArray;-><init>(Lbin/mt/json/JSONArray;)V

    iget-wide v2, v2, Ll/ۙۖۜ;->ܿ:J

    move-object v10, v5

    move-object/from16 v16, v1

    move-wide/from16 v17, v2

    invoke-direct/range {v10 .. v18}, Ll/۬ۢۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;J)V

    return-object v5

    :cond_0
    const-string v1, "Published local size does not match the workspace byte count."

    .line 116
    invoke-static {v1}, Ll/۫ۢۜ;->֫(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v1

    throw v1
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ll/۬ۢۜ;
    .locals 6

    const-string v0, "backendReason"

    const-string v1, "EDIT_SESSION_STORAGE_FAILED"

    const-string v2, "workspace_to_local"

    .line 204
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    const/4 v4, 0x0

    const-string v5, "local_to_edit_session"

    if-nez v3, :cond_1

    .line 205
    invoke-virtual {v5, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    .line 207
    :cond_0
    invoke-static {p1}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v4

    :goto_0
    filled-new-array {v2, v5}, [Ljava/lang/String;

    move-result-object p1

    .line 208
    invoke-static {p1}, Lbin/mt/json/JSON;->array([Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object p1

    .line 210
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string p3, "direction"

    invoke-virtual {p2, p3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string p4, "Invalid direction"

    .line 206
    invoke-static {p4, p3, v4, p1, p2}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1

    .line 42
    :cond_1
    invoke-virtual {v5, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    if-eqz p3, :cond_2

    .line 43
    invoke-virtual {p3}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_4

    :cond_2
    if-nez p3, :cond_3

    goto :goto_1

    .line 46
    :cond_3
    invoke-static {p3}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v4

    .line 47
    :goto_1
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object p1

    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string p3, "ab12cd34"

    const-string p4, "editSessionId"

    invoke-virtual {p2, p4, p3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string p3, "local_to_edit_session requires a non-empty editSessionId"

    .line 44
    invoke-static {p3, p4, v4, p1, p2}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1

    .line 49
    :cond_4
    new-instance v3, Ll/ۙۢۜ;

    invoke-direct {v3, p1, p2, p3, p4}, Ll/ۙۢۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    :try_start_0
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 52
    invoke-direct {p0, v3, p5, p6}, Ll/۫ۢۜ;->ۧ(Ll/ۙۢۜ;Ljava/lang/String;Z)Ll/۬ۢۜ;

    move-result-object p1

    return-object p1

    .line 54
    :cond_5
    invoke-direct {p0, v3, p5, p6}, Ll/۫ۢۜ;->֫(Ll/ۙۢۜ;Ljava/lang/String;Z)Ll/۬ۢۜ;

    move-result-object p1
    :try_end_0
    .catch Ll/ۗۛ᩻; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 71
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string p3, "operation"

    const-string p4, "overlay_publish"

    .line 72
    invoke-virtual {p2, p3, p4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p2

    .line 73
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, v0, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string p2, "Failed to write the workspace ZIP entry."

    const-string p3, "fatal"

    .line 67
    invoke-static {v1, p2, p3, v4, p1}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 74
    invoke-static {p1, v3}, Ll/۫ۢۜ;->֫(Ll/ۗۛ᩻;Ll/ۙۢۜ;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1

    :catch_1
    move-exception p1

    .line 56
    iget-boolean p2, p1, Ll/ۗۛ᩻;->ۙ:Z

    if-nez p2, :cond_13

    .line 189
    iget-object p2, p1, Ll/ۗۛ᩻;->᩸:Ljava/lang/String;

    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_6

    goto :goto_3

    .line 192
    :cond_6
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object p3

    .line 193
    iget-object p4, p1, Ll/ۗۛ᩻;->᩶:Lbin/mt/json/JSONObject;

    invoke-virtual {p4}, Lbin/mt/json/JSONObject;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :goto_2
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result p5

    if-eqz p5, :cond_7

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Lbin/mt/json/JSONObject$Member;

    .line 194
    invoke-virtual {p5}, Lbin/mt/json/JSONObject$Member;->getName()Ljava/lang/String;

    move-result-object p6

    invoke-virtual {p5}, Lbin/mt/json/JSONObject$Member;->getValue()Lbin/mt/json/JSONValue;

    move-result-object p5

    invoke-virtual {p3, p6, p5}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    goto :goto_2

    :cond_7
    const-string p4, "workspace_storage_failure"

    .line 196
    invoke-virtual {p3, v0, p4}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    .line 197
    iget-object p4, p1, Ll/ۗۛ᩻;->᩹:Ljava/lang/String;

    iget-object p1, p1, Ll/ۗۛ᩻;->ۗ:Lbin/mt/json/JSONArray;

    const-string p5, "Edit session storage failed."

    invoke-static {p2, p5, p4, p1, p3}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 376
    :goto_3
    iget-object p2, p1, Ll/ۗۛ᩻;->᩸:Ljava/lang/String;

    iget-object p3, p1, Ll/ۗۛ᩻;->᩶:Lbin/mt/json/JSONObject;

    const-string p4, "localPath"

    .line 377
    invoke-virtual {p3, p4}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p4

    if-eqz p4, :cond_8

    .line 378
    invoke-virtual {p4}, Lbin/mt/json/JSONValue;->isString()Z

    move-result p5

    if-eqz p5, :cond_8

    .line 379
    invoke-virtual {p4}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object p4

    iput-object p4, v3, Ll/ۙۢۜ;->᩻:Ljava/lang/String;

    goto :goto_4

    :cond_8
    const-string p4, "FILE_ACCESS_DENIED"

    .line 380
    invoke-virtual {p4, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p4

    if-nez p4, :cond_9

    const-string p4, "FILE_ACCESS_ROOT_PROTECTED"

    .line 381
    invoke-virtual {p4, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_a

    :cond_9
    const-string p4, "path"

    .line 382
    invoke-virtual {p3, p4}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p5

    if-eqz p5, :cond_a

    .line 254
    invoke-virtual {p5}, Lbin/mt/json/JSONValue;->isString()Z

    move-result p5

    if-eqz p5, :cond_a

    .line 384
    invoke-virtual {p3, p4}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p4

    invoke-virtual {p4}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object p4

    iput-object p4, v3, Ll/ۙۢۜ;->᩻:Ljava/lang/String;

    :cond_a
    :goto_4
    const-string p4, "changed"

    .line 386
    invoke-virtual {p3, p4}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p4

    if-eqz p4, :cond_b

    .line 387
    invoke-virtual {p4}, Lbin/mt/json/JSONValue;->isBoolean()Z

    move-result p5

    if-eqz p5, :cond_b

    .line 388
    invoke-virtual {p4}, Lbin/mt/json/JSONValue;->asBoolean()Z

    move-result p4

    iput-boolean p4, v3, Ll/ۙۢۜ;->ۧ:Z

    :cond_b
    const-string p4, "stateKnown"

    .line 390
    invoke-virtual {p3, p4}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p4

    if-eqz p4, :cond_c

    .line 391
    invoke-virtual {p4}, Lbin/mt/json/JSONValue;->isBoolean()Z

    move-result p5

    if-eqz p5, :cond_c

    .line 392
    invoke-virtual {p4}, Lbin/mt/json/JSONValue;->asBoolean()Z

    move-result p4

    iput-boolean p4, v3, Ll/ۙۢۜ;->ۢ:Z

    :cond_c
    const-string p4, "operationMode"

    .line 394
    invoke-virtual {p3, p4}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p4

    if-eqz p4, :cond_d

    .line 395
    invoke-virtual {p4}, Lbin/mt/json/JSONValue;->isString()Z

    move-result p5

    if-eqz p5, :cond_d

    .line 396
    invoke-virtual {p4}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object p4

    iput-object p4, v3, Ll/ۙۢۜ;->᩷:Ljava/lang/String;

    :cond_d
    const-string p4, "warnings"

    .line 398
    invoke-virtual {p3, p4}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p4

    if-eqz p4, :cond_e

    .line 399
    invoke-virtual {p4}, Lbin/mt/json/JSONValue;->isArray()Z

    move-result p5

    if-eqz p5, :cond_e

    .line 400
    new-instance p5, Lbin/mt/json/JSONArray;

    invoke-virtual {p4}, Lbin/mt/json/JSONValue;->asArray()Lbin/mt/json/JSONArray;

    move-result-object p4

    invoke-direct {p5, p4}, Lbin/mt/json/JSONArray;-><init>(Lbin/mt/json/JSONArray;)V

    iput-object p5, v3, Ll/ۙۢۜ;->ۡ:Lbin/mt/json/JSONArray;

    :cond_e
    const-string p4, "bytesCopied"

    .line 402
    invoke-virtual {p3, p4}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p4

    const-wide/16 p5, -0x1

    if-eqz p4, :cond_10

    .line 404
    invoke-virtual {p4}, Lbin/mt/json/JSONValue;->isNumber()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-virtual {p4}, Lbin/mt/json/JSONValue;->asLong()J

    move-result-wide v4

    goto :goto_5

    :cond_f
    move-wide v4, p5

    :goto_5
    iput-wide v4, v3, Ll/ۙۢۜ;->֫:J

    :cond_10
    const-string p4, "editRevision"

    .line 406
    invoke-virtual {p3, p4}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p3

    if-eqz p3, :cond_11

    .line 407
    invoke-virtual {p3}, Lbin/mt/json/JSONValue;->isNumber()Z

    move-result p4

    if-eqz p4, :cond_11

    .line 408
    invoke-virtual {p3}, Lbin/mt/json/JSONValue;->asInt()I

    move-result p3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    iput-object p3, v3, Ll/ۙۢۜ;->ᩳ:Ljava/lang/Integer;

    .line 61
    :cond_11
    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_12

    .line 63
    iput-wide p5, v3, Ll/ۙۢۜ;->֫:J

    .line 65
    :cond_12
    invoke-static {p1, v3}, Ll/۫ۢۜ;->֫(Ll/ۗۛ᩻;Ll/ۙۢۜ;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1

    .line 57
    :cond_13
    throw p1
.end method
