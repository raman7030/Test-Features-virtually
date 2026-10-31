.class public final Ll/᩺ܳۜ;
.super Ll/ۙۛ᩻;
.source "D77Z"


# instance fields
.field public ֫:Lbin/mt/json/JSONObject;

.field public ۧ:Lbin/mt/json/JSONObject;

.field public final ܽ:Ll/᩵᩻ۜ;


# direct methods
.method public constructor <init>(Ll/᩵᩻ۜ;)V
    .locals 0

    .line 35
    invoke-direct {p0}, Ll/ۙۛ᩻;-><init>()V

    .line 36
    iput-object p1, p0, Ll/᩺ܳۜ;->ܽ:Ll/᩵᩻ۜ;

    return-void
.end method

.method private ֫(Ll/ۢۜۜ;ZLjava/lang/String;)Ll/۬ۛ᩻;
    .locals 6

    const-string v0, "MT MCP xref out of memory: workspaceId="

    .line 150
    iget-object v1, p1, Ll/ۢۜۜ;->ۜ:Ljava/lang/String;

    iget-object v2, p0, Ll/᩺ܳۜ;->ܽ:Ll/᩵᩻ۜ;

    invoke-virtual {v2, v1}, Ll/᩵᩻ۜ;->ܽ(Ljava/lang/String;)V

    .line 152
    :try_start_0
    invoke-virtual {v2}, Ll/᩵᩻ۜ;->ۧ()Ll/᩵᩺᩻;

    move-result-object v3
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    .line 153
    :try_start_1
    iget-object v4, p1, Ll/ۢۜۜ;->ۧ:Ljava/lang/String;

    new-instance v5, Ll/ۨܳۜ;

    invoke-direct {v5, p0, p1}, Ll/ۨܳۜ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, v1, v4, p3, v5}, Ll/᩵᩻ۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ۘ᩻ۜ;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/۬ۛ᩻;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 160
    :try_start_2
    invoke-interface {v3}, Ljava/lang/AutoCloseable;->close()V
    :try_end_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_0

    return-object p3

    :catchall_0
    move-exception p3

    .line 152
    :try_start_3
    invoke-interface {v3}, Ljava/lang/AutoCloseable;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v2

    :try_start_4
    invoke-virtual {p3, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p3
    :try_end_4
    .catch Ljava/lang/OutOfMemoryError; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception p3

    .line 163
    :try_start_5
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", methodResolution="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, Ll/ۢۜۜ;->ܿ:Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", continuation="

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p1, ", error="

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    invoke-virtual {p3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 163
    invoke-static {p1}, Ll/᩶ۘܽ;->ܽ(Ljava/lang/String;)V
    :try_end_5
    .catch Ljava/lang/OutOfMemoryError; {:try_start_5 .. :try_end_5} :catch_1

    .line 170
    :catch_1
    invoke-static {}, Ll/ᩳ۬᩻;->ۧ()Ll/ۗۛ᩻;

    move-result-object p1

    throw p1
.end method

.method public static ֫(Ll/᩺ܳۜ;Ll/ۢۜۜ;I)Ll/۬ۛ᩻;
    .locals 21

    move-object/from16 v0, p1

    .line 155
    iget-object v1, v0, Ll/ۢۜۜ;->ۧ:Ljava/lang/String;

    move-object/from16 v2, p0

    iget-object v2, v2, Ll/᩺ܳۜ;->ܽ:Ll/᩵᩻ۜ;

    new-instance v3, Ll/ܺۨ᩻;

    .line 15
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 155
    invoke-virtual {v2, v0, v3}, Ll/᩵᩻ۜ;->֫(Ll/ۢۜۜ;Ll/ܺۨ᩻;)Ll/ۖ᩷ۜ;

    move-result-object v2

    .line 156
    sget v3, Ll/ۡۨ᩻;->֫:I

    .line 157
    new-instance v3, Ll/۬ۛ᩻;

    .line 180
    iget-object v4, v2, Ll/ۖ᩷ۜ;->ܿ:Ljava/lang/String;

    iget-object v5, v2, Ll/ۖ᩷ۜ;->ܽ:Ljava/util/ArrayList;

    iget-object v6, v2, Ll/ۖ᩷ۜ;->ۧ:Ll/֫ۢۜ;

    iget-object v7, v2, Ll/ۖ᩷ۜ;->ᩳ:Ljava/lang/String;

    iget-object v8, v2, Ll/ۖ᩷ۜ;->ܳ:Ljava/lang/String;

    .line 237
    invoke-static {v4, v7, v8}, Ll/۬ܳۜ;->ܽ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "dex_field"

    .line 244
    invoke-virtual {v8, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_0

    const-string v4, "field_access"

    goto :goto_0

    :cond_0
    const-string v8, "dex_class"

    .line 246
    invoke-virtual {v8, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const-string v4, "type_reference"

    goto :goto_0

    :cond_1
    const-string v4, "method_call"

    .line 182
    :goto_0
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v9, "workspaceId"

    iget-object v10, v2, Ll/ۖ᩷ۜ;->᩻:Ljava/lang/String;

    .line 183
    invoke-virtual {v8, v9, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    iget v9, v0, Ll/ۢۜۜ;->ܽ:I

    const-string v10, "editSessionId"

    .line 184
    invoke-virtual {v8, v10, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v10, "targetLocator"

    .line 185
    invoke-virtual {v8, v10, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v8, "referenceKind"

    .line 186
    invoke-virtual {v7, v8, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    iget-object v7, v2, Ll/ۖ᩷ۜ;->֫:Ljava/lang/String;

    const-string v8, "methodResolution"

    .line 187
    invoke-virtual {v4, v8, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 213
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v7

    .line 214
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_1
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    const-string v13, "instructionIndex"

    if-eqz v12, :cond_2

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/ܺ᩷ۜ;

    .line 215
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v14

    iget-object v15, v12, Ll/ܺ᩷ۜ;->ܳ:Ljava/lang/String;

    move-object/from16 p0, v11

    iget-object v11, v12, Ll/ܺ᩷ۜ;->᩻:Ljava/lang/String;

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-string v16, "dex_method"

    const/16 v17, 0x0

    move-object/from16 v18, v15

    move-object/from16 v15, v16

    move-object/from16 v16, v17

    move-object/from16 v17, v18

    move-object/from16 v18, v11

    .line 230
    invoke-static/range {v15 .. v20}, Ll/۬ܳۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    const-string v15, "sourceLocator"

    .line 216
    invoke-virtual {v14, v15, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v11

    const-string v14, "referenceOperand"

    iget-object v15, v12, Ll/ܺ᩷ۜ;->ܿ:Ljava/lang/String;

    .line 217
    invoke-virtual {v11, v14, v15}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v11

    const-string v14, "matchKind"

    iget-object v15, v12, Ll/ܺ᩷ۜ;->ܽ:Ljava/lang/String;

    .line 218
    invoke-virtual {v11, v14, v15}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v11

    const-string v14, "dispatchCertainty"

    iget-object v15, v12, Ll/ܺ᩷ۜ;->֫:Ljava/lang/String;

    .line 219
    invoke-virtual {v11, v14, v15}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v11

    const-string v14, "opcode"

    iget-object v15, v12, Ll/ܺ᩷ۜ;->ᩳ:Ljava/lang/String;

    .line 220
    invoke-virtual {v11, v14, v15}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v11

    iget v12, v12, Ll/ܺ᩷ۜ;->ۧ:I

    .line 221
    invoke-virtual {v11, v13, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v11

    .line 215
    invoke-virtual {v7, v11}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-object/from16 v11, p0

    goto :goto_1

    :cond_2
    const-string v11, "data"

    .line 188
    invoke-virtual {v4, v11, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 189
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v7

    const-string v11, "nextActions"

    invoke-virtual {v4, v11, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 190
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v7

    if-eqz v6, :cond_3

    const/4 v12, 0x1

    goto :goto_2

    :cond_3
    const/4 v12, 0x0

    :goto_2
    const-string v14, "hasMore"

    .line 191
    invoke-virtual {v7, v14, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v12, "returnedCount"

    .line 192
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v5

    invoke-virtual {v7, v12, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v7, "limitMax"

    const/16 v12, 0xc8

    .line 193
    invoke-virtual {v5, v7, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v12, "totalAvailableCount"

    const/4 v14, 0x0

    .line 194
    invoke-virtual {v5, v12, v14}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    if-eqz v6, :cond_4

    .line 196
    iget-object v15, v2, Ll/ۖ᩷ۜ;->᩻:Ljava/lang/String;

    iget-object v2, v0, Ll/ۢۜۜ;->ۧ:Ljava/lang/String;

    .line 1484
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v12

    iget-object v14, v0, Ll/ۢۜۜ;->᩻:Ljava/lang/String;

    move-object/from16 p0, v3

    iget-object v3, v0, Ll/ۢۜۜ;->֫:Ljava/lang/String;

    move-object/from16 v20, v1

    iget-object v1, v0, Ll/ۢۜۜ;->ᩳ:Ljava/lang/String;

    .line 1485
    invoke-static {v14, v3, v1}, Ll/۬ܳۜ;->ܽ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v12, v10, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    iget-object v3, v0, Ll/ۢۜۜ;->ܿ:Ljava/lang/String;

    .line 1486
    invoke-virtual {v1, v8, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "recommendedLimit"

    .line 1487
    invoke-virtual {v1, v3, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const/16 v3, 0xc8

    .line 1488
    invoke-virtual {v1, v7, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v18

    .line 79
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "classIndex"

    iget v7, v6, Ll/֫ۢۜ;->֫:I

    .line 80
    invoke-virtual {v1, v3, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "memberIndex"

    iget v7, v6, Ll/֫ۢۜ;->ܽ:I

    .line 81
    invoke-virtual {v1, v3, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    iget v3, v6, Ll/֫ۢۜ;->ۧ:I

    .line 82
    invoke-virtual {v1, v13, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v19

    const-string v14, "xref"

    move-object/from16 v16, v2

    move/from16 v17, p2

    .line 196
    invoke-static/range {v14 .. v19}, Ll/ᩴۨ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "nextCursor"

    .line 199
    invoke-virtual {v5, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    .line 200
    invoke-virtual {v4, v11}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v2

    iget-object v0, v0, Ll/ۢۜۜ;->ۜ:Ljava/lang/String;

    move-object/from16 v3, v20

    .line 202
    invoke-static {v0, v9, v3, v1}, Ll/۬ܳۜ;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "mt_apk_continue"

    const-string v3, "continue"

    const-string v6, "Continue xref next page"

    .line 200
    invoke-static {v0, v1, v3, v6}, Ll/ۤۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-virtual {v2, v0}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto :goto_3

    :cond_4
    move-object/from16 p0, v3

    :goto_3
    const-string v0, "pagination"

    .line 205
    invoke-virtual {v4, v0, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    .line 157
    invoke-static {v4}, Ll/۠ܳۜ;->ܽ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Ll/۬ۛ᩻;-><init>(Lbin/mt/json/JSONObject;)V

    return-object v1
.end method


# virtual methods
.method public final ֫()Lbin/mt/json/JSONObject;
    .locals 3

    .line 59
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

    .line 112
    invoke-static {p1}, Ll/۠ܳۜ;->ۧ(Ll/ۗۛ᩻;)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Lbin/mt/json/JSONObject;)Ll/۬ۛ᩻;
    .locals 2

    .line 126
    :try_start_0
    invoke-static {p1}, Ll/۬ܳۜ;->ܶ(Lbin/mt/json/JSONObject;)Ll/ۢۜۜ;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 127
    invoke-direct {p0, p1, v0, v1}, Ll/᩺ܳۜ;->֫(Ll/ۢۜۜ;ZLjava/lang/String;)Ll/۬ۛ᩻;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 129
    sget v0, Ll/ۡۨ᩻;->֫:I

    return-object p1

    :catchall_0
    move-exception p1

    sget v0, Ll/ۡۨ᩻;->֫:I

    .line 130
    throw p1
.end method

.method public final ֫(Ll/ۖۨ᩻;Lbin/mt/json/JSONObject;)Ll/۬ۛ᩻;
    .locals 4

    const-string v0, "workspaceId"

    const/4 v1, 0x0

    .line 139
    invoke-virtual {p2, v0, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "editSessionId"

    const-string v3, ""

    invoke-virtual {p2, v2, v3}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 138
    invoke-static {v0, v2, p1, p2}, Ll/۬ܳۜ;->ܿ(Ljava/lang/String;Ljava/lang/String;Ll/ۖۨ᩻;Lbin/mt/json/JSONObject;)Ll/ۢۜۜ;

    move-result-object p1

    const-string v0, "nextCursor"

    .line 141
    invoke-virtual {p2, v0, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0, p2}, Ll/᩺ܳۜ;->֫(Ll/ۢۜۜ;ZLjava/lang/String;)Ll/۬ۛ᩻;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    const-string v0, "Use when you have a dex_method locator, dex_field locator, or dex_class locator and need incoming instruction references. All input fields are required; for dex_method use methodResolution=dispatch and limit=50 unless the user asks otherwise; for dex_field or dex_class use methodResolution=not_applicable. exact matches bytecode MethodReference equality, slot finds the visible override family, and dispatch finds calls that may reach the target implementation or method contract. Field and class xrefs are exact instruction references only. Results are read-only; to inspect the containing method, pass data.workspaceId, data.editSessionId, and refs[i].sourceLocator as mt_apk_read_text.locator."

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    const-string v0, "Find APK Dex Xrefs"

    return-object v0
.end method

.method public final ܽ()Lbin/mt/json/JSONObject;
    .locals 1

    .line 64
    iget-object v0, p0, Ll/᩺ܳۜ;->֫:Lbin/mt/json/JSONObject;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Edit session id. Pass the id returned by mt_apk_session_create to xref the edited session; pass an empty string to xref the base workspace.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"Target locator string. Accepted prefixes: dex_method:, dex_field:, dex_class:. For dex_method use a full smali method reference such as dex_method:Lcom/example/Foo;->bar()V; for dex_field use a smali field reference such as dex_field:Lcom/example/Foo;->flag:Z; for dex_class use a class descriptor such as dex_class:Lcom/example/Foo;.\"\n  },\n  \"methodResolution\": {\n    \"type\": \"string\",\n    \"enum\": [\n      \"exact\",\n      \"slot\",\n      \"dispatch\",\n      \"not_applicable\"\n    ],\n    \"description\": \"Required. For dex_method use dispatch unless the user asks for exact bytecode references or slot override family; exact matches MethodReference equality, slot finds the visible override family, and dispatch finds calls that may reach the target. For dex_field and dex_class use not_applicable.\"\n  },\n  \"limit\": {\n    \"type\": \"integer\",\n    \"description\": \"Required page size. Use 50 unless the user asks otherwise; maximum 200 is enforced at runtime. Use mt_apk_continue for later pages.\"\n  }\n}\n"

    .line 67
    invoke-static {v0}, Ll/ۘܳ֨;->֫(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Ll/᩺ܳۜ;->֫:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ܿ()Lbin/mt/json/JSONObject;
    .locals 1

    .line 101
    iget-object v0, p0, Ll/᩺ܳۜ;->ۧ:Lbin/mt/json/JSONObject;

    if-eqz v0, :cond_0

    return-object v0

    .line 104
    :cond_0
    invoke-static {}, Ll/۠ܳۜ;->ܿ()Lbin/mt/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Ll/᩺ܳۜ;->ۧ:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    const-string v0, "mt_apk_dex_xref"

    return-object v0
.end method
