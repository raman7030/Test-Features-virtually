.class public final Ll/ᩴܳۜ;
.super Ll/ۙۛ᩻;
.source "776Z"


# instance fields
.field public ֫:Lbin/mt/json/JSONObject;

.field public ۧ:Lbin/mt/json/JSONObject;

.field public final ܽ:Ll/᩵᩻ۜ;


# direct methods
.method public constructor <init>(Ll/᩵᩻ۜ;)V
    .locals 0

    .line 42
    invoke-direct {p0}, Ll/ۙۛ᩻;-><init>()V

    .line 43
    iput-object p1, p0, Ll/ᩴܳۜ;->ܽ:Ll/᩵᩻ۜ;

    return-void
.end method

.method public static varargs ֫([Ljava/lang/String;)Lbin/mt/json/JSONObject;
    .locals 3

    .line 549
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "resource_table"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "Scope that produced the hit."

    .line 550
    invoke-static {v2, v1}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "scope"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Exact resource-table reference kind."

    .line 552
    invoke-static {v1, p0}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v1, "matchKind"

    invoke-virtual {v0, v1, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v0, "string"

    const-string v1, "Non-null source resource locator. Reuse data.workspaceId and data.editSessionId and pass this value to mt_apk_resource_read.reads[].locator, use sourceVariant as reads[].variant, and provide the required budget fields."

    .line 96
    invoke-static {v0, v1}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "sourceLocator"

    .line 554
    invoke-virtual {p0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v1, "Source snippet; empty string when unavailable."

    .line 96
    invoke-static {v0, v1}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "snippet"

    .line 555
    invoke-virtual {p0, v1, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Z)Ljava/lang/String;
    .locals 4

    .line 337
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    invoke-virtual {v0}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v0

    const-string v1, "Invalid "

    const-string v2, "<value>"

    if-nez v0, :cond_1

    .line 338
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    .line 339
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v1

    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    if-eqz p2, :cond_0

    const-string v2, ""

    :cond_0
    invoke-virtual {v3, p1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p2

    .line 338
    invoke-static {v0, p1, p0, v1, p2}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    :cond_1
    const/4 v0, 0x0

    .line 341
    invoke-virtual {p0, p1, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-nez p2, :cond_3

    .line 342
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_2

    goto :goto_0

    .line 343
    :cond_2
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p0}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    .line 344
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-virtual {v1, p1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 343
    invoke-static {p2, p1, p0, v0, v1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    :cond_3
    :goto_0
    return-object p0
.end method

.method public static ֫(Ljava/lang/String;Lbin/mt/json/JSONValue;)Ljava/lang/String;
    .locals 8

    const-string v0, "locator"

    .line 467
    :try_start_0
    invoke-static {p0}, Ll/۬ܳۜ;->᩻(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v0}, Ll/ۡᩳۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ll/ۗۛ᩻; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    const-string p0, "0x00000000..0xffffffff"

    .line 469
    filled-new-array {p0}, [Ljava/lang/String;

    move-result-object p0

    .line 470
    invoke-static {p0}, Lbin/mt/json/JSON;->array([Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object p0

    .line 471
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const/4 v6, 0x0

    const-string v7, "0x7f010000"

    const-string v2, "resource"

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Ll/۬ܳۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "Invalid locator"

    .line 469
    invoke-static {v2, v0, p1, p0, v1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method public static ֫(Lbin/mt/json/JSONArray;Lbin/mt/json/JSONValue;)Ljava/util/ArrayList;
    .locals 8

    const-string v0, "resource_table"

    const-string v1, "axml"

    const-string v2, "dex"

    if-eqz p0, :cond_8

    .line 375
    invoke-virtual {p0}, Lbin/mt/json/JSONArray;->size()I

    move-result v3

    if-eqz v3, :cond_8

    .line 380
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 381
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    const/4 v5, 0x0

    .line 382
    :goto_0
    invoke-virtual {p0}, Lbin/mt/json/JSONArray;->size()I

    move-result v6

    if-ge v5, v6, :cond_7

    .line 383
    invoke-virtual {p0, v5}, Lbin/mt/json/JSONArray;->get(I)Lbin/mt/json/JSONValue;

    move-result-object v6

    if-eqz v6, :cond_5

    .line 384
    invoke-virtual {v6}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v7

    if-nez v7, :cond_0

    goto :goto_3

    .line 387
    :cond_0
    invoke-virtual {v6}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v6

    .line 388
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_2

    .line 389
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_2

    .line 390
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_2

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    move-object p0, p1

    .line 391
    :goto_1
    invoke-static {p0}, Ll/ᩴܳۜ;->֫(Lbin/mt/json/JSONValue;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    .line 393
    :cond_2
    invoke-virtual {v3, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_4

    if-nez p1, :cond_3

    goto :goto_2

    :cond_3
    move-object p0, p1

    .line 394
    :goto_2
    invoke-static {p0}, Ll/ᩴܳۜ;->֫(Lbin/mt/json/JSONValue;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    .line 396
    :cond_4
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_5
    :goto_3
    if-nez p1, :cond_6

    goto :goto_4

    :cond_6
    move-object p0, p1

    .line 385
    :goto_4
    invoke-static {p0}, Ll/ᩴܳۜ;->֫(Lbin/mt/json/JSONValue;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    :cond_7
    return-object v4

    .line 376
    :cond_8
    filled-new-array {v2, v1, v0}, [Ljava/lang/String;

    move-result-object p1

    .line 377
    invoke-static {p1}, Lbin/mt/json/JSON;->array([Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object p1

    .line 378
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    filled-new-array {v2, v1, v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lbin/mt/json/JSON;->array([Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v0

    const-string v1, "scopes"

    invoke-virtual {v3, v1, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Invalid scopes"

    .line 376
    invoke-static {v2, v1, p0, p1, v0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method public static ֫(Lbin/mt/json/JSONValue;)Ll/ۗۛ᩻;
    .locals 5

    const-string v0, "dex"

    const-string v1, "axml"

    const-string v2, "resource_table"

    .line 405
    filled-new-array {v0, v1, v2}, [Ljava/lang/String;

    move-result-object v3

    .line 406
    invoke-static {v3}, Lbin/mt/json/JSON;->array([Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v3

    .line 407
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v4

    filled-new-array {v0, v1, v2}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lbin/mt/json/JSON;->array([Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v0

    const-string v1, "scopes"

    invoke-virtual {v4, v1, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Invalid scopes"

    .line 405
    invoke-static {v2, v1, p0, v3, v0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method private ֫(Ll/ܿۜۜ;Ljava/lang/String;)Ll/۬ۛ᩻;
    .locals 5

    .line 192
    iget-object v0, p1, Ll/ܿۜۜ;->ܳ:Ljava/lang/String;

    iget-object v1, p0, Ll/ᩴܳۜ;->ܽ:Ll/᩵᩻ۜ;

    invoke-virtual {v1, v0}, Ll/᩵᩻ۜ;->ܽ(Ljava/lang/String;)V

    .line 194
    invoke-virtual {v1}, Ll/᩵᩻ۜ;->ۧ()Ll/᩵᩺᩻;

    move-result-object v2

    .line 195
    :try_start_0
    iget-object v3, p1, Ll/ܿۜۜ;->֫:Ljava/lang/String;

    new-instance v4, Ll/ۘܳۜ;

    invoke-direct {v4, p0, p1}, Ll/ۘܳۜ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v0, v3, p2, v4}, Ll/᩵᩻ۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ۘ᩻ۜ;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۬ۛ᩻;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 202
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    return-object p1

    :catchall_0
    move-exception p1

    .line 194
    :try_start_1
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
.end method

.method public static ֫(Ll/ᩴܳۜ;Ll/ܿۜۜ;I)Ll/۬ۛ᩻;
    .locals 25

    move-object/from16 v0, p1

    .line 197
    iget-object v1, v0, Ll/ܿۜۜ;->֫:Ljava/lang/String;

    move-object/from16 v2, p0

    iget-object v2, v2, Ll/ᩴܳۜ;->ܽ:Ll/᩵᩻ۜ;

    new-instance v3, Ll/ܺۨ᩻;

    .line 15
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 197
    invoke-virtual {v2, v0, v3}, Ll/᩵᩻ۜ;->֫(Ll/ܿۜۜ;Ll/ܺۨ᩻;)Ll/ܿ᩷ۜ;

    move-result-object v2

    .line 199
    sget v3, Ll/ۡۨ᩻;->֫:I

    .line 200
    new-instance v3, Ll/۬ۛ᩻;

    .line 211
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v4

    iget-object v5, v2, Ll/ܿ᩷ۜ;->֫:Ll/᩸᩷ۜ;

    iget-object v6, v2, Ll/ܿ᩷ۜ;->ᩳ:Ljava/lang/String;

    iget-object v7, v2, Ll/ܿ᩷ۜ;->ۧ:Ljava/util/ArrayList;

    if-eqz v5, :cond_0

    const/4 v8, 0x1

    goto :goto_0

    :cond_0
    const/4 v8, 0x0

    :goto_0
    const-string v9, "hasMore"

    .line 212
    invoke-virtual {v4, v9, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v8, "nextCursor"

    const/4 v9, 0x0

    .line 213
    invoke-virtual {v4, v8, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v10, "returnedCount"

    .line 214
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v11

    invoke-virtual {v4, v10, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v10, "limitMax"

    const/16 v11, 0xc8

    .line 215
    invoke-virtual {v4, v10, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v11, "totalAvailableCount"

    .line 217
    invoke-virtual {v4, v11, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    .line 221
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v9

    const-string v11, "workspaceId"

    .line 222
    invoke-virtual {v9, v11, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    iget v11, v0, Ll/ܿۜۜ;->ۧ:I

    const-string v12, "editSessionId"

    .line 223
    invoke-virtual {v9, v12, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    const/16 v16, 0x0

    iget-object v15, v2, Ll/ܿ᩷ۜ;->ܽ:Ljava/lang/String;

    const-string v12, "resource"

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v17, 0x0

    move-object/from16 v18, v15

    move-object/from16 v15, v17

    move-object/from16 v17, v18

    .line 224
    invoke-static/range {v12 .. v17}, Ll/۬ܳۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    const-string v13, "targetLocator"

    invoke-virtual {v9, v13, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    .line 246
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v12

    .line 247
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_3

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ll/ᩳ᩷ۜ;

    .line 248
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v15

    move-object/from16 p0, v7

    iget-object v7, v14, Ll/ᩳ᩷ۜ;->ܿ:Ljava/lang/String;

    move-object/from16 v16, v3

    iget-object v3, v14, Ll/ᩳ᩷ۜ;->ܽ:Ljava/lang/String;

    move-object/from16 v17, v1

    const-string v1, "scope"

    .line 249
    invoke-virtual {v15, v1, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v7, "matchKind"

    iget-object v15, v14, Ll/ᩳ᩷ۜ;->ᩳ:Ljava/lang/String;

    .line 250
    invoke-virtual {v1, v7, v15}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    iget-object v7, v14, Ll/ᩳ᩷ۜ;->᩻:Ljava/lang/String;

    iget-object v15, v14, Ll/ᩳ᩷ۜ;->ۜ:Ljava/lang/String;

    move-object/from16 v18, v6

    .line 275
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v7, 0x3a

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const-string v7, "sourceLocator"

    .line 251
    invoke-virtual {v1, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v6, "snippet"

    iget-object v7, v14, Ll/ᩳ᩷ۜ;->ܳ:Ljava/lang/String;

    .line 252
    invoke-virtual {v1, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v6, "resource_table"

    .line 253
    iget-object v7, v14, Ll/ᩳ᩷ۜ;->ܿ:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const-string v6, "sourceType"

    .line 254
    iget-object v7, v14, Ll/ᩳ᩷ۜ;->ۢ:Ljava/lang/String;

    invoke-virtual {v1, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "sourceName"

    iget-object v15, v14, Ll/ᩳ᩷ۜ;->᩷:Ljava/lang/String;

    .line 255
    invoke-virtual {v6, v7, v15}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "sourceVariant"

    iget-object v15, v14, Ll/ᩳ᩷ۜ;->ۡ:Ljava/lang/String;

    .line 256
    invoke-virtual {v6, v7, v15}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    if-eqz v3, :cond_2

    const-string v6, "itemKey"

    .line 259
    iget-object v7, v14, Ll/ᩳ᩷ۜ;->֫:Ljava/lang/String;

    invoke-virtual {v1, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    .line 260
    iget-object v7, v14, Ll/ᩳ᩷ۜ;->ۧ:Ljava/lang/String;

    if-nez v7, :cond_1

    sget-object v7, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_2

    :cond_1
    const/16 v22, 0x0

    const/16 v23, 0x0

    const-string v19, "resource"

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v24, v7

    .line 261
    invoke-static/range {v19 .. v24}, Ll/۬ܳۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v7

    :goto_2
    const-string v14, "itemKeyLocator"

    .line 260
    invoke-virtual {v6, v14, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "itemValueKind"

    .line 263
    invoke-virtual {v6, v7, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    .line 266
    :cond_2
    invoke-virtual {v12, v1}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-object/from16 v7, p0

    move-object/from16 v3, v16

    move-object/from16 v1, v17

    move-object/from16 v6, v18

    goto/16 :goto_1

    :cond_3
    move-object/from16 v17, v1

    move-object/from16 v16, v3

    move-object/from16 v18, v6

    const-string v1, "refs"

    .line 226
    invoke-virtual {v9, v1, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "pagination"

    .line 227
    invoke-virtual {v1, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 228
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v4

    if-eqz v5, :cond_5

    .line 230
    iget-object v2, v2, Ll/ܿ᩷ۜ;->ᩳ:Ljava/lang/String;

    iget-object v6, v0, Ll/ܿۜۜ;->֫:Ljava/lang/String;

    .line 282
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v7

    .line 283
    iget-object v9, v0, Ll/ܿۜۜ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_3
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_4

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    .line 284
    invoke-virtual {v7, v12}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    goto :goto_3

    .line 286
    :cond_4
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v9

    const/16 v23, 0x0

    iget-object v0, v0, Ll/ܿۜۜ;->ܿ:Ljava/lang/String;

    const-string v19, "resource"

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v24, v0

    .line 287
    invoke-static/range {v19 .. v24}, Ll/۬ܳۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v13, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v9, "scopes"

    .line 289
    invoke-virtual {v0, v9, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v7, "recommendedLimit"

    .line 290
    invoke-virtual {v0, v7, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    const/16 v7, 0xc8

    .line 291
    invoke-virtual {v0, v10, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v23

    .line 94
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v7, "scopeIndex"

    iget v9, v5, Ll/᩸᩷ۜ;->ܳ:I

    .line 95
    invoke-virtual {v0, v7, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v7, "entryIndex"

    iget v9, v5, Ll/᩸᩷ۜ;->ۧ:I

    .line 96
    invoke-virtual {v0, v7, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v7, "classIndex"

    iget v9, v5, Ll/᩸᩷ۜ;->֫:I

    .line 97
    invoke-virtual {v0, v7, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v7, "memberIndex"

    iget v9, v5, Ll/᩸᩷ۜ;->ܿ:I

    .line 98
    invoke-virtual {v0, v7, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v7, "instructionIndex"

    iget v9, v5, Ll/᩸᩷ۜ;->ᩳ:I

    .line 99
    invoke-virtual {v0, v7, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v7, "innerIndex"

    iget v5, v5, Ll/᩸᩷ۜ;->ܽ:I

    .line 100
    invoke-virtual {v0, v7, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v24

    const-string v19, "resource_xref"

    move-object/from16 v20, v2

    move-object/from16 v21, v6

    move/from16 v22, p2

    .line 230
    invoke-static/range {v19 .. v24}, Ll/ᩴۨ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    .line 233
    invoke-virtual {v1, v3}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    invoke-virtual {v2, v8, v0}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    const-string v2, "Continue resource xref next page"

    move-object/from16 v3, v17

    move-object/from16 v5, v18

    .line 236
    invoke-static {v5, v11, v3, v0}, Ll/۬ܳۜ;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "mt_apk_continue"

    const-string v5, "continue"

    .line 234
    invoke-static {v0, v3, v5, v2}, Ll/ۤۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-virtual {v4, v0}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    .line 239
    :cond_5
    invoke-static {v1, v4}, Ll/᩶ۛ᩻;->֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object v0

    move-object/from16 v1, v16

    .line 200
    invoke-direct {v1, v0}, Ll/۬ۛ᩻;-><init>(Lbin/mt/json/JSONObject;)V

    return-object v1
.end method

.method public static ۧ(Lbin/mt/json/JSONObject;)Ll/ܿۜۜ;
    .locals 19

    move-object/from16 v0, p0

    const-string v1, "workspaceId"

    const-string v2, "editSessionId"

    const-string v3, "locator"

    const-string v4, "scopes"

    const-string v5, "limit"

    .line 175
    filled-new-array {v1, v2, v3, v4, v5}, [Ljava/lang/String;

    move-result-object v6

    .line 312
    invoke-virtual/range {p0 .. p0}, Lbin/mt/json/JSONObject;->names()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    const/4 v9, 0x0

    const/4 v10, 0x5

    if-eqz v8, :cond_3

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    const/4 v11, 0x0

    :goto_1
    if-ge v11, v10, :cond_1

    .line 325
    aget-object v12, v6, v11

    .line 326
    invoke-virtual {v12, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_0

    goto :goto_0

    :cond_0
    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    .line 316
    :cond_1
    invoke-virtual {v0, v8}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    .line 35
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v1

    :goto_2
    if-ge v9, v10, :cond_2

    .line 36
    aget-object v2, v6, v9

    .line 37
    invoke-virtual {v1, v2}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    .line 316
    :cond_2
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Invalid resource_xref argument"

    .line 315
    invoke-static {v3, v8, v0, v1, v2}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 298
    :cond_3
    filled-new-array {v1, v2, v3, v4, v5}, [Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    :goto_3
    if-ge v7, v10, :cond_5

    .line 299
    aget-object v8, v6, v7

    .line 300
    invoke-virtual {v0, v8}, Lbin/mt/json/JSONObject;->contains(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_4

    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    :cond_4
    const-string v0, "Missing parameter: "

    .line 0
    invoke-static {v0, v8}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 302
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v1

    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "<required>"

    invoke-virtual {v2, v8, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const/4 v3, 0x0

    .line 301
    invoke-static {v0, v8, v3, v1, v2}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 178
    :cond_5
    invoke-static {v0, v1, v9}, Ll/ᩴܳۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v6

    const/4 v1, 0x1

    .line 179
    invoke-static {v0, v2, v1}, Ll/ᩴܳۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v7

    .line 353
    invoke-virtual {v0, v3}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v2

    const-string v8, "Invalid locator"

    const-string v9, "resource"

    if-eqz v2, :cond_9

    .line 354
    invoke-virtual {v2}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v10

    if-eqz v10, :cond_9

    .line 360
    invoke-virtual {v2}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v2

    .line 361
    invoke-static {v2}, Ll/۬ܳۜ;->ܳ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    .line 362
    invoke-static {v2}, Ll/۬ܳۜ;->᩻(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_8

    .line 180
    invoke-virtual {v0, v3}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v3

    invoke-static {v2, v3}, Ll/ᩴܳۜ;->֫(Ljava/lang/String;Lbin/mt/json/JSONValue;)Ljava/lang/String;

    move-result-object v8

    .line 181
    invoke-virtual {v0, v4}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v2

    invoke-virtual {v0, v4}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v3

    invoke-static {v2, v3}, Ll/ᩴܳۜ;->֫(Lbin/mt/json/JSONArray;Lbin/mt/json/JSONValue;)Ljava/util/ArrayList;

    move-result-object v9

    .line 414
    invoke-virtual {v0, v5}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    const/16 v2, 0x32

    const-string v3, "Invalid limit"

    const/16 v4, 0xc8

    if-eqz v0, :cond_7

    .line 415
    invoke-virtual {v0}, Lbin/mt/json/JSONValue;->isNumber()Z

    move-result v10

    if-eqz v10, :cond_7

    .line 421
    :try_start_0
    invoke-static {v0}, Ll/֨ۙ᩵;->ۧ(Lbin/mt/json/JSONValue;)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/ArithmeticException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    if-lt v0, v1, :cond_6

    if-gt v0, v4, :cond_6

    .line 183
    new-instance v10, Ll/ܿۜۜ;

    .line 55
    new-instance v18, Ll/᩸᩷ۜ;

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v11, v18

    invoke-direct/range {v11 .. v17}, Ll/᩸᩷ۜ;-><init>(IIIIII)V

    move-object v1, v10

    move-object v2, v6

    move-object v3, v7

    move-object v4, v8

    move-object v5, v9

    move v6, v0

    move-object/from16 v7, v18

    .line 184
    invoke-direct/range {v1 .. v7}, Ll/ܿۜۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;ILl/᩸᩷ۜ;)V

    return-object v10

    .line 427
    :cond_6
    invoke-static {v0}, Lbin/mt/json/JSON;->value(I)Lbin/mt/json/JSONValue;

    move-result-object v0

    filled-new-array {v1, v4}, [I

    move-result-object v1

    .line 428
    invoke-static {v1}, Lbin/mt/json/JSON;->array([I)Lbin/mt/json/JSONArray;

    move-result-object v1

    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v4

    invoke-virtual {v4, v5, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 427
    invoke-static {v3, v5, v0, v1, v2}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 423
    :catch_0
    filled-new-array {v1, v4}, [I

    move-result-object v1

    .line 424
    invoke-static {v1}, Lbin/mt/json/JSON;->array([I)Lbin/mt/json/JSONArray;

    move-result-object v1

    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v4

    invoke-virtual {v4, v5, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 423
    invoke-static {v3, v5, v0, v1, v2}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 416
    :cond_7
    filled-new-array {v1, v4}, [I

    move-result-object v1

    .line 417
    invoke-static {v1}, Lbin/mt/json/JSON;->array([I)Lbin/mt/json/JSONArray;

    move-result-object v1

    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v4

    invoke-virtual {v4, v5, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 416
    invoke-static {v3, v5, v0, v1, v2}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 364
    :cond_8
    invoke-virtual {v0, v3}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    filled-new-array {v9}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lbin/mt/json/JSON;->array([Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v1

    .line 365
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    const/4 v13, 0x0

    const-string v14, "0x7f010000"

    const-string v9, "resource"

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v9 .. v14}, Ll/۬ܳۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 363
    invoke-static {v8, v3, v0, v1, v2}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 356
    :cond_9
    invoke-virtual {v0, v3}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    filled-new-array {v9}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lbin/mt/json/JSON;->array([Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v1

    .line 357
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    const/4 v13, 0x0

    const-string v14, "0x7f010000"

    const-string v9, "resource"

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v9 .. v14}, Ll/۬ܳۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 355
    invoke-static {v8, v3, v0, v1, v2}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
.end method


# virtual methods
.method public final ֫()Lbin/mt/json/JSONObject;
    .locals 3

    .line 63
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "readOnlyHint"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ۗۛ᩻;)Lbin/mt/json/JSONObject;
    .locals 0

    .line 123
    invoke-static {p1}, Ll/᩶ۛ᩻;->֫(Ll/ۗۛ᩻;)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Lbin/mt/json/JSONObject;)Ll/۬ۛ᩻;
    .locals 1

    .line 137
    :try_start_0
    invoke-static {p1}, Ll/ᩴܳۜ;->ۧ(Lbin/mt/json/JSONObject;)Ll/ܿۜۜ;

    move-result-object p1

    const/4 v0, 0x0

    .line 138
    invoke-direct {p0, p1, v0}, Ll/ᩴܳۜ;->֫(Ll/ܿۜۜ;Ljava/lang/String;)Ll/۬ۛ᩻;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 140
    sget v0, Ll/ۡۨ᩻;->֫:I

    return-object p1

    :catchall_0
    move-exception p1

    sget v0, Ll/ۡۨ᩻;->֫:I

    .line 141
    throw p1
.end method

.method public final ֫(Ll/ۖۨ᩻;Lbin/mt/json/JSONObject;)Ll/۬ۛ᩻;
    .locals 12

    .line 149
    iget v0, p1, Ll/ۖۨ᩻;->ᩳ:I

    iget v1, p1, Ll/ۖۨ᩻;->֫:I

    const-string v2, "nextCursor"

    const-string v3, "workspaceId"

    const/4 v4, 0x0

    invoke-virtual {p2, v3, v4}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v3, "editSessionId"

    const-string v5, ""

    .line 150
    invoke-virtual {p2, v3, v5}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v3, "limit"

    .line 438
    invoke-virtual {p2, v3}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v5

    if-eqz v5, :cond_2

    .line 443
    invoke-virtual {v5}, Lbin/mt/json/JSONValue;->isNull()Z

    move-result v8

    const-string v9, "Invalid limit"

    if-nez v8, :cond_1

    invoke-virtual {v5}, Lbin/mt/json/JSONValue;->isNumber()Z

    move-result v8

    if-eqz v8, :cond_1

    const/4 v8, 0x1

    .line 449
    :try_start_0
    invoke-static {v5}, Ll/֨ۙ᩵;->ۧ(Lbin/mt/json/JSONValue;)I

    move-result v10
    :try_end_0
    .catch Ljava/lang/ArithmeticException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_1

    if-lt v10, v8, :cond_0

    .line 454
    iget-object v11, p1, Ll/ۖۨ᩻;->ۧ:Lbin/mt/json/JSONObject;

    if-gt v10, v1, :cond_0

    :try_start_1
    const-string v0, "targetLocator"

    .line 156
    invoke-virtual {v11, v0, v4}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 157
    invoke-virtual {p2, v2}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ᩴܳۜ;->֫(Ljava/lang/String;Lbin/mt/json/JSONValue;)Ljava/lang/String;

    move-result-object v8

    const-string v0, "scopes"

    .line 158
    invoke-virtual {v11, v0}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 159
    invoke-virtual {p2, v2}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v1

    .line 158
    invoke-static {v0, v1}, Ll/ᩴܳۜ;->֫(Lbin/mt/json/JSONArray;Lbin/mt/json/JSONValue;)Ljava/util/ArrayList;

    move-result-object v9

    .line 160
    iget-object p1, p1, Ll/ۖۨ᩻;->ܽ:Lbin/mt/json/JSONObject;

    .line 161
    invoke-virtual {p2, v2}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    .line 160
    invoke-static {p1, v0}, Ll/᩸᩷ۜ;->֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONValue;)Ll/᩸᩷ۜ;

    move-result-object v11
    :try_end_1
    .catch Ll/ۗۛ᩻; {:try_start_1 .. :try_end_1} :catch_0

    .line 167
    new-instance p1, Ll/ܿۜۜ;

    move-object v5, p1

    invoke-direct/range {v5 .. v11}, Ll/ܿۜۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;ILl/᩸᩷ۜ;)V

    .line 168
    invoke-virtual {p2, v2, v4}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 167
    invoke-direct {p0, p1, p2}, Ll/ᩴܳۜ;->֫(Ll/ܿۜۜ;Ljava/lang/String;)Ll/۬ۛ᩻;

    move-result-object p1

    return-object p1

    .line 164
    :catch_0
    invoke-virtual {p2, v2}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p1

    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object p2

    .line 165
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "<cursor>"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Invalid cursor"

    .line 163
    invoke-static {v1, v2, p1, p2, v0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1

    .line 455
    :cond_0
    filled-new-array {v8, v1}, [I

    move-result-object p1

    .line 456
    invoke-static {p1}, Lbin/mt/json/JSON;->array([I)Lbin/mt/json/JSONArray;

    move-result-object p1

    .line 457
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object p2

    invoke-virtual {p2, v3, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p2

    .line 455
    invoke-static {v9, v3, v5, p1, p2}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1

    .line 451
    :catch_1
    filled-new-array {v8, v1}, [I

    move-result-object p1

    .line 452
    invoke-static {p1}, Lbin/mt/json/JSON;->array([I)Lbin/mt/json/JSONArray;

    move-result-object p1

    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object p2

    invoke-virtual {p2, v3, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p2

    .line 451
    invoke-static {v9, v3, v5, p1, p2}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1

    :cond_1
    const/4 p1, 0x1

    .line 444
    filled-new-array {p1, v1}, [I

    move-result-object p1

    .line 445
    invoke-static {p1}, Lbin/mt/json/JSON;->array([I)Lbin/mt/json/JSONArray;

    move-result-object p1

    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object p2

    invoke-virtual {p2, v3, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p2

    .line 444
    invoke-static {v9, v3, v5, p1, p2}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1

    .line 441
    :cond_2
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object p1

    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object p2

    invoke-virtual {p2, v3, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string v0, "Missing parameter: limit"

    .line 440
    invoke-static {v0, v3, v4, p1, p2}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    const-string v0, "Find stable references to one resources.arsc resource id. All input fields are required; use scopes=[\"dex\",\"axml\",\"resource_table\"] and limit=50 for a broad check. This tool reports only exact resource id/reference matches, not resource names, string values, or file-path weak matches. Each ref contains only fields applicable to its scope; inspect ref.scope and field presence."

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    const-string v0, "Find APK Resource Xrefs"

    return-object v0
.end method

.method public final ܽ()Lbin/mt/json/JSONObject;
    .locals 1

    .line 68
    iget-object v0, p0, Ll/ᩴܳۜ;->֫:Lbin/mt/json/JSONObject;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Edit session id. Pass the id returned by mt_apk_session_create to inspect the edited session; pass an empty string to inspect the base workspace.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"Resource locator string such as resource:0x7f010000. The resource: prefix is required; hex input is case-insensitive and output is lowercase.\"\n  },\n  \"scopes\": {\n    \"type\": \"array\",\n    \"description\": \"Required non-empty scopes. Suggested value is [\\\"dex\\\",\\\"axml\\\",\\\"resource_table\\\"].\",\n    \"items\": {\n      \"type\": \"string\",\n      \"enum\": [\n        \"dex\",\n        \"axml\",\n        \"resource_table\"\n      ]\n    }\n  },\n  \"limit\": {\n    \"type\": \"integer\",\n    \"description\": \"Maximum refs on this page. Suggested value is 50; allowed range is 1..200.\"\n  }\n}\n"

    .line 71
    invoke-static {v0}, Ll/ۘܳ֨;->֫(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Ll/ᩴܳۜ;->֫:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ܿ()Lbin/mt/json/JSONObject;
    .locals 18

    move-object/from16 v0, p0

    .line 108
    iget-object v1, v0, Ll/ᩴܳۜ;->ۧ:Lbin/mt/json/JSONObject;

    if-eqz v1, :cond_0

    return-object v1

    .line 480
    :cond_0
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "string"

    const-string v3, "Workspace id."

    .line 103
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "workspaceId"

    .line 481
    invoke-virtual {v1, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "Edit session id."

    .line 103
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "editSessionId"

    .line 482
    invoke-virtual {v1, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "Target resource locator."

    .line 103
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "targetLocator"

    .line 483
    invoke-virtual {v1, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "Exact resource references."

    const-string v4, "type"

    const-string v5, "array"

    const-string v6, "description"

    .line 0
    invoke-static {v4, v5, v6, v3}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 496
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "One exact resource xref hit. The branch is selected by scope and item field presence."

    .line 497
    invoke-virtual {v4, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 498
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v5

    .line 508
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "dex"

    const-string v8, "axml"

    filled-new-array {v7, v8}, [Ljava/lang/String;

    move-result-object v7

    const-string v8, "Scope that produced the hit."

    .line 509
    invoke-static {v8, v7}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v8, "scope"

    invoke-virtual {v6, v8, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "resource_id"

    filled-new-array {v7}, [Ljava/lang/String;

    move-result-object v7

    const-string v8, "Exact resource-id match."

    .line 511
    invoke-static {v8, v7}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v8, "matchKind"

    invoke-virtual {v6, v8, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "Non-null dex_method or axml locator. Reuse data.workspaceId and data.editSessionId and pass this value to mt_apk_read_text.locator."

    .line 96
    invoke-static {v2, v7}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v8, "sourceLocator"

    .line 513
    invoke-virtual {v6, v8, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "snippet"

    const-string v8, "Source snippet; empty string when unavailable."

    const-string v9, "Dex or decoded AXML resource-id reference."

    .line 0
    invoke-static {v6, v2, v8, v7, v9}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    .line 499
    invoke-virtual {v5, v6}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object v5

    const-string v6, "parent_reference"

    const-string v7, "reference"

    .line 521
    filled-new-array {v7, v6}, [Ljava/lang/String;

    move-result-object v6

    .line 522
    invoke-static {v6}, Ll/ᩴܳۜ;->֫([Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v8, "Source resource type."

    .line 96
    invoke-static {v2, v8}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    const-string v10, "sourceType"

    .line 524
    invoke-virtual {v6, v10, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v9, "Source resource name."

    .line 96
    invoke-static {v2, v9}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v11

    const-string v12, "sourceName"

    .line 525
    invoke-virtual {v6, v12, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v11, "Source resource variant. Use this as mt_apk_resource_read.reads[].variant."

    const-string v13, "sourceVariant"

    const-string v14, "Top-level value or parent reference from the resource table."

    .line 0
    invoke-static {v6, v2, v11, v13, v14}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    .line 500
    invoke-virtual {v5, v6}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object v5

    .line 533
    filled-new-array {v7}, [Ljava/lang/String;

    move-result-object v6

    .line 534
    invoke-static {v6}, Ll/ᩴܳۜ;->֫([Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    .line 96
    invoke-static {v2, v8}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    .line 535
    invoke-virtual {v6, v10, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v6

    .line 96
    invoke-static {v2, v9}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    .line 536
    invoke-virtual {v6, v12, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v6

    .line 96
    invoke-static {v2, v11}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    .line 537
    invoke-virtual {v6, v13, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "Source bag item key, or null for a default item."

    .line 103
    invoke-static {v2, v7}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v8, "itemKey"

    .line 538
    invoke-virtual {v6, v8, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "Resource locator for the source item key when addressable; null for default or non-resource keys."

    .line 103
    invoke-static {v2, v7}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v7, "itemKeyLocator"

    .line 539
    invoke-virtual {v6, v7, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v16, "null_value"

    const-string v17, "unparsed"

    const-string v6, "text"

    const-string v7, "styled_text"

    const-string v8, "number"

    const-string v9, "boolean"

    const-string v10, "color"

    const-string v11, "dimension"

    const-string v12, "fraction"

    const-string v13, "reference"

    const-string v14, "attribute"

    const-string v15, "file_path"

    filled-new-array/range {v6 .. v17}, [Ljava/lang/String;

    move-result-object v6

    const-string v7, "Value kind of the source bag item, not of the xref target."

    .line 540
    invoke-static {v7, v6}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "itemValueKind"

    invoke-virtual {v2, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v6, "Reference from one resource-table bag item."

    .line 533
    invoke-static {v2, v6}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 501
    invoke-virtual {v5, v2}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object v2

    const-string v5, "anyOf"

    .line 498
    invoke-virtual {v4, v5, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "items"

    .line 487
    invoke-virtual {v3, v4, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "refs"

    .line 484
    invoke-virtual {v1, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "Maximum accepted xref limit."

    const-string v3, "Total available count when known, or null."

    const-string v4, "Number of refs returned."

    .line 170
    invoke-static {v4, v2, v3}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 488
    invoke-static {v2}, Ll/֫ۛ᩻;->ܽ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "pagination"

    invoke-virtual {v1, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "Successful mt_apk_resource_xref data."

    .line 480
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "No tool-specific diagnostics."

    .line 113
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 112
    invoke-static {v3, v2}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    invoke-static {v2}, Ll/֫ۛ᩻;->ۧ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "continue"

    .line 116
    invoke-static {}, Ll/ۧᩳܽ;->֫()Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "mt_apk_continue"

    .line 115
    invoke-static {v4, v5, v3}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "retry"

    .line 118
    invoke-static {}, Ll/ۧᩳܽ;->ܳ()Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "mt_apk_workspace_open"

    .line 117
    invoke-static {v5, v6, v4}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const/4 v5, 0x2

    new-array v5, v5, [Lbin/mt/json/JSONObject;

    const/4 v6, 0x0

    aput-object v3, v5, v6

    const/4 v3, 0x1

    aput-object v4, v5, v3

    const-string v3, "Continuation or retry actions."

    .line 114
    invoke-static {v3, v5}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Result for mt_apk_resource_xref."

    .line 111
    invoke-static {v4, v1, v2, v3}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v1

    iput-object v1, v0, Ll/ᩴܳۜ;->ۧ:Lbin/mt/json/JSONObject;

    return-object v1
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    const-string v0, "mt_apk_resource_xref"

    return-object v0
.end method
