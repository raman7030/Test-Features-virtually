.class public final Ll/ۖܳۜ;
.super Ljava/lang/Object;
.source "Q7AJ"


# instance fields
.field public final ֫:Ll/᩵᩻ۜ;


# direct methods
.method public constructor <init>(Ll/᩵᩻ۜ;)V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Ll/ۖܳۜ;->֫:Ll/᩵᩻ۜ;

    return-void
.end method

.method public static ֫(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;
    .locals 2

    .line 319
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "hasMore"

    invoke-virtual {v0, v1, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v0, "nextCursor"

    invoke-virtual {p1, v0, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ܰܽۜ;)Lbin/mt/json/JSONValue;
    .locals 3

    if-nez p0, :cond_0

    .line 349
    sget-object p0, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    return-object p0

    .line 351
    :cond_0
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    iget-object v1, p0, Ll/ܰܽۜ;->֫:Ljava/lang/String;

    .line 352
    invoke-static {v1}, Ll/ۖܳۜ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "locator"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "missing"

    iget-boolean v2, p0, Ll/ܰܽۜ;->ۧ:Z

    .line 353
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "type"

    iget-object v2, p0, Ll/ܰܽۜ;->ܿ:Ljava/lang/String;

    .line 354
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "name"

    iget-object v2, p0, Ll/ܰܽۜ;->ܽ:Ljava/lang/String;

    .line 355
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "variant"

    iget-object v2, p0, Ll/ܰܽۜ;->ۜ:Ljava/lang/String;

    .line 356
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "valueKind"

    iget-object v2, p0, Ll/ܰܽۜ;->ܳ:Ljava/lang/String;

    .line 357
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "valueSnippet"

    iget-object v2, p0, Ll/ܰܽۜ;->᩻:Ljava/lang/String;

    .line 358
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "valueTruncated"

    iget-boolean p0, p0, Ll/ܰܽۜ;->ᩳ:Z

    .line 359
    invoke-virtual {v0, v1, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 341
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v6

    const-string v1, "resource"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 326
    invoke-static/range {v1 .. v6}, Ll/۬ܳۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ۖܳۜ;Ll/֫ۜۜ;Ll/ܺۨ᩻;I)Ll/۬ۛ᩻;
    .locals 42

    move-object/from16 v0, p1

    move-object/from16 v1, p0

    .line 52
    iget-object v1, v1, Ll/ۖܳۜ;->֫:Ll/᩵᩻ۜ;

    move-object/from16 v2, p2

    invoke-virtual {v1, v0, v2}, Ll/᩵᩻ۜ;->֫(Ll/֫ۜۜ;Ll/ܺۨ᩻;)Ll/ۖ᩹ۢ;

    move-result-object v1

    .line 53
    sget v2, Ll/ۡۨ᩻;->֫:I

    .line 54
    new-instance v2, Ll/۬ۛ᩻;

    iget-object v0, v0, Ll/֫ۜۜ;->֫:Ljava/lang/String;

    .line 93
    instance-of v3, v1, Ll/ۧ᩷ۜ;

    if-nez v3, :cond_11

    .line 96
    instance-of v3, v1, Ll/᩹ۜۜ;

    const-string v9, ""

    const-string v10, "continue"

    const-string v11, "mt_apk_continue"

    const-string v4, "limitMax"

    const-string v5, "recommendedLimit"

    const-string v6, "format"

    const-string v7, "target"

    const-string v12, "nextActions"

    const-string v13, "pagination"

    const-string v14, "workspaceId"

    const-string v15, "editSessionId"

    const-string v8, "locator"

    move-object/from16 p0, v2

    const-string v2, "name"

    move-object/from16 p1, v9

    const-string v9, "data"

    if-eqz v3, :cond_6

    check-cast v1, Ll/᩹ۜۜ;

    move-object/from16 p2, v10

    move-object/from16 v16, v11

    .line 271
    iget-wide v10, v1, Ll/᩹ۜۜ;->ܽ:J

    iget-object v3, v1, Ll/᩹ۜۜ;->᩷:Ljava/lang/String;

    move-object/from16 v17, v13

    iget v13, v1, Ll/᩹ۜۜ;->ܿ:I

    move-object/from16 v18, v4

    iget-object v4, v1, Ll/᩹ۜۜ;->ۧ:[B

    move-object/from16 v19, v5

    iget v5, v1, Ll/᩹ۜۜ;->ܳ:I

    move-object/from16 v20, v6

    iget-object v6, v1, Ll/᩹ۜۜ;->ۜ:Ll/ᩳۜۜ;

    const-wide/16 v21, 0x0

    cmp-long v23, v10, v21

    if-ltz v23, :cond_0

    const-wide v21, 0x1fffffffffffffL

    cmp-long v23, v10, v21

    if-lez v23, :cond_1

    :cond_0
    const-wide/16 v10, -0x1

    :cond_1
    move-object/from16 v21, v7

    .line 273
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v7

    move-object/from16 v22, v1

    .line 274
    invoke-static {v4}, Ll/ܰۘܺ;->֫([B)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v23, v12

    const-string v12, "hex"

    invoke-virtual {v7, v12, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v7, "byteOffset"

    .line 275
    invoke-virtual {v1, v7, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    move-object/from16 v24, v12

    int-to-long v12, v13

    array-length v4, v4

    move/from16 v25, v5

    int-to-long v4, v4

    add-long/2addr v12, v4

    const-string v5, "nextByteOffset"

    .line 276
    invoke-virtual {v1, v5, v12, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v12, "totalBytes"

    .line 277
    invoke-virtual {v1, v12, v10, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 0
    invoke-static {v14, v3, v15, v0}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 281
    invoke-static {v6}, Ll/۬ܳۜ;->֫(Ll/ᩳۜۜ;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v4, v8, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 282
    invoke-virtual {v6}, Ll/ᩳۜۜ;->֫()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v4, v2, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v10, "maxBytes"

    move/from16 v11, v25

    .line 283
    invoke-virtual {v4, v10, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 284
    invoke-virtual {v4, v9, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 285
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v4

    move-object/from16 v13, v23

    invoke-virtual {v1, v13, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    move-object/from16 v4, v22

    move-object/from16 v22, v3

    .line 286
    iget-boolean v3, v4, Ll/᩹ۜۜ;->ᩳ:Z

    if-eqz v3, :cond_2

    .line 287
    iget-object v3, v4, Ll/᩹ۜۜ;->᩷:Ljava/lang/String;

    move-object/from16 v23, v3

    .line 1446
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 1447
    invoke-static {v6}, Ll/۬ܳۜ;->֫(Ll/ᩳۜۜ;)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v25, v5

    move-object/from16 v5, v21

    invoke-virtual {v3, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    move-object/from16 v6, v20

    move-object/from16 v5, v24

    .line 1448
    invoke-virtual {v3, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    move-object/from16 v6, v19

    .line 1449
    invoke-virtual {v3, v6, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v3

    const/high16 v6, 0x10000

    move-object/from16 v19, v7

    move-object/from16 v7, v18

    .line 1450
    invoke-virtual {v3, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v7

    .line 289
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v6, "hexOffset"

    iget v4, v4, Ll/᩹ۜۜ;->᩻:I

    invoke-virtual {v3, v6, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v18

    const-string v3, "read"

    move-object/from16 v6, v22

    move-object/from16 v4, v23

    move-object/from16 v20, v12

    move-object/from16 v26, v25

    move-object v12, v5

    move-object v5, v0

    move-object/from16 v24, v12

    move-object v12, v6

    move/from16 v6, p3

    move-object/from16 v27, v19

    move-object/from16 v19, v9

    move-object v9, v8

    move-object/from16 v8, v18

    .line 287
    invoke-static/range {v3 .. v8}, Ll/ᩴۨ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    .line 290
    invoke-static {v3, v4}, Ll/ۖܳۜ;->֫(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v4

    move-object/from16 v8, v17

    invoke-virtual {v1, v8, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    .line 291
    invoke-virtual {v1, v13}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v4

    const-string v5, "Continue reading next hex byte page"

    .line 293
    invoke-static {v12, v11, v0, v3}, Ll/۬ܳۜ;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    move-object/from16 v11, p2

    move-object/from16 v12, v16

    .line 291
    invoke-static {v0, v12, v11, v5}, Ll/ۤۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-virtual {v4, v0}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    const/4 v0, 0x0

    goto :goto_0

    :cond_2
    move-object/from16 v26, v5

    move-object/from16 v27, v7

    move-object/from16 v19, v9

    move-object/from16 v20, v12

    move-object v9, v8

    move-object/from16 v8, v17

    const/4 v0, 0x0

    const/4 v3, 0x0

    .line 295
    invoke-static {v3, v0}, Ll/ۖܳۜ;->֫(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-virtual {v1, v8, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-object v0, v3

    .line 80
    :goto_0
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 81
    invoke-virtual {v1, v14, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v14, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    move-object/from16 v4, p1

    .line 82
    invoke-virtual {v1, v15, v4}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v15, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 83
    invoke-virtual {v1, v9}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v5

    invoke-static {v5}, Ll/֨ۙ᩵;->ܽ(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONValue;

    move-result-object v5

    invoke-virtual {v3, v9, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 84
    invoke-virtual {v1, v2, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v2, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 85
    invoke-virtual {v1, v10}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v2

    if-nez v2, :cond_3

    sget-object v2, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_1

    :cond_3
    invoke-virtual {v1, v10}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v2

    :goto_1
    invoke-virtual {v0, v10, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    move-object/from16 v10, v19

    .line 86
    invoke-virtual {v1, v10}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    if-nez v2, :cond_4

    .line 170
    sget-object v2, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_3

    .line 172
    :cond_4
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    move-object/from16 v5, v24

    .line 173
    invoke-virtual {v2, v5, v4}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    move-object/from16 v4, v27

    .line 174
    invoke-virtual {v2, v4}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v5

    if-nez v5, :cond_5

    sget-object v5, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_2

    :cond_5
    invoke-virtual {v2, v4}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v5

    :goto_2
    invoke-virtual {v3, v4, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-wide/16 v4, 0x0

    move-object/from16 v6, v26

    .line 175
    invoke-virtual {v2, v6, v4, v5}, Lbin/mt/json/JSONObject;->getLong(Ljava/lang/String;J)J

    move-result-wide v4

    invoke-virtual {v3, v6, v4, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-wide/16 v4, -0x1

    move-object/from16 v6, v20

    .line 176
    invoke-virtual {v2, v6, v4, v5}, Lbin/mt/json/JSONObject;->getLong(Ljava/lang/String;J)J

    move-result-wide v4

    invoke-virtual {v3, v6, v4, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v2

    :goto_3
    const-string v3, "byteWindow"

    .line 86
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 87
    invoke-virtual {v1, v8}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    invoke-virtual {v0, v8, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 88
    invoke-virtual {v1, v13}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v1

    invoke-static {v0, v1}, Ll/᩶ۛ᩻;->֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object v0

    goto/16 :goto_c

    :cond_6
    move-object v3, v5

    move-object v5, v7

    move-object v7, v4

    move-object/from16 v4, p1

    move-object/from16 v41, v9

    move-object v9, v8

    move-object v8, v13

    move-object v13, v12

    move-object v12, v11

    move-object v11, v10

    move-object/from16 v10, v41

    .line 99
    check-cast v1, Ll/ۢ᩷ۜ;

    iget-object v4, v1, Ll/ۢ᩷ۜ;->ۢ:Ll/֨ۨ᩻;

    move-object/from16 p2, v11

    .line 108
    iget v11, v1, Ll/ۢ᩷ۜ;->ᩳ:I

    move-object/from16 v16, v12

    iget-object v12, v1, Ll/ۢ᩷ۜ;->ۡ:Ljava/lang/String;

    move-object/from16 v17, v8

    iget-object v8, v1, Ll/ۢ᩷ۜ;->ۧ:Ljava/lang/Integer;

    move-object/from16 v18, v7

    .line 109
    iget-object v7, v1, Ll/ۢ᩷ۜ;->᩷:Ll/ᩳۜۜ;

    move-object/from16 v19, v3

    invoke-static {v7}, Ll/۬ܳۜ;->֫(Ll/ᩳۜۜ;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v20, v6

    .line 110
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v6

    move-object/from16 v21, v5

    iget-object v5, v4, Ll/֨ۨ᩻;->ۡ:Ljava/lang/String;

    move-object/from16 v23, v13

    iget-boolean v13, v4, Ll/֨ۨ᩻;->֫:Z

    move-object/from16 v22, v10

    const-string v10, "text"

    .line 111
    invoke-virtual {v6, v10, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    iget v6, v4, Ll/֨ۨ᩻;->ܳ:I

    move-object/from16 v24, v10

    const-string v10, "startLine"

    .line 112
    invoke-virtual {v5, v10, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v5

    move-object/from16 v25, v10

    iget v10, v4, Ll/֨ۨ᩻;->ۧ:I

    move/from16 v26, v11

    const-string v11, "startColumn"

    .line 113
    invoke-virtual {v5, v11, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v5

    iget v10, v4, Ll/֨ۨ᩻;->ܿ:I

    move-object/from16 v27, v11

    const-string v11, "nextLine"

    .line 114
    invoke-virtual {v5, v11, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v5

    move-object/from16 v28, v11

    iget v11, v4, Ll/֨ۨ᩻;->ᩳ:I

    move/from16 v29, v13

    const-string v13, "nextColumn"

    .line 115
    invoke-virtual {v5, v13, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v5

    iget v11, v4, Ll/֨ۨ᩻;->ܽ:I

    move-object/from16 v30, v13

    const-string v13, "returnedLineCount"

    .line 116
    invoke-virtual {v5, v13, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v5

    iget-object v11, v4, Ll/֨ۨ᩻;->ۡ:Ljava/lang/String;

    move-object/from16 v31, v13

    .line 117
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v13

    move-object/from16 v32, v2

    const/4 v2, 0x0

    invoke-virtual {v11, v2, v13}, Ljava/lang/String;->codePointCount(II)I

    move-result v2

    const-string v11, "returnedCodePoints"

    invoke-virtual {v5, v11, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 118
    iget-boolean v5, v1, Ll/ۢ᩷ۜ;->᩻:Z

    if-eqz v5, :cond_7

    const/4 v13, -0x1

    goto :goto_4

    :cond_7
    iget v13, v4, Ll/֨ۨ᩻;->ۢ:I

    :goto_4
    move-object/from16 v33, v11

    const-string v11, "totalLineCount"

    invoke-virtual {v2, v11, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v2

    iget-boolean v13, v4, Ll/֨ۨ᩻;->᩻:Z

    move-object/from16 v34, v11

    const-string v11, "lineTruncated"

    .line 119
    invoke-virtual {v2, v11, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v13, "absoluteEndLine"

    move-object/from16 v35, v11

    const-string v11, "absoluteStartLine"

    if-eqz v8, :cond_8

    .line 121
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v36

    add-int v6, v36, v6

    invoke-virtual {v2, v11, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v6

    .line 122
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    add-int/2addr v8, v10

    invoke-virtual {v6, v13, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    .line 0
    :cond_8
    invoke-static {v14, v12, v15, v0}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    .line 127
    invoke-virtual {v6, v9, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 128
    invoke-virtual {v7}, Ll/ᩳۜۜ;->֫()Ljava/lang/String;

    move-result-object v6

    move-object/from16 v10, v32

    invoke-virtual {v3, v10, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    iget-object v6, v1, Ll/ۢ᩷ۜ;->ܳ:Ljava/lang/String;

    const-string v8, "textSourceKind"

    .line 129
    invoke-virtual {v3, v8, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    iget-object v6, v1, Ll/ۢ᩷ۜ;->ܽ:Ljava/lang/String;

    move-object/from16 v32, v13

    const-string v13, "targetVersion"

    .line 130
    invoke-virtual {v3, v13, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    if-nez v29, :cond_a

    if-eqz v5, :cond_9

    goto :goto_5

    :cond_9
    const/4 v5, 0x0

    goto :goto_6

    :cond_a
    :goto_5
    const/4 v5, 0x1

    :goto_6
    const-string v6, "truncated"

    .line 131
    invoke-virtual {v3, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "limit"

    move-object/from16 v36, v11

    move/from16 v11, v26

    .line 132
    invoke-virtual {v3, v5, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v3

    move-object/from16 v26, v13

    move-object/from16 v13, v22

    .line 133
    invoke-virtual {v3, v13, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 134
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v3

    move-object/from16 v13, v23

    invoke-virtual {v2, v13, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 135
    iget-object v3, v1, Ll/ۢ᩷ۜ;->ۜ:Ljava/lang/String;

    move-object/from16 v23, v10

    const-string v10, "truncatedReason"

    if-eqz v3, :cond_b

    .line 136
    invoke-virtual {v2, v10, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    goto :goto_7

    :cond_b
    if-eqz v29, :cond_c

    const-string v3, "window"

    .line 138
    invoke-virtual {v2, v10, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    :cond_c
    :goto_7
    if-eqz v29, :cond_e

    .line 140
    iget-object v3, v4, Ll/֨ۨ᩻;->᩷:Ljava/lang/Integer;

    if-eqz v3, :cond_e

    .line 305
    iget-object v3, v1, Ll/ۢ᩷ۜ;->ۡ:Ljava/lang/String;

    move-object/from16 v29, v3

    .line 1434
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 1435
    invoke-static {v7}, Ll/۬ܳۜ;->֫(Ll/ᩳۜۜ;)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v37, v5

    move-object/from16 v5, v21

    invoke-virtual {v3, v5, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    move-object/from16 v5, v20

    move-object/from16 v7, v24

    .line 1436
    invoke-virtual {v3, v5, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    move-object/from16 v5, v19

    .line 1437
    invoke-virtual {v3, v5, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v3

    const/16 v5, 0x7d0

    move-object/from16 v19, v6

    move-object/from16 v6, v18

    .line 1438
    invoke-virtual {v3, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "maxChars"

    iget v1, v1, Ll/ۢ᩷ۜ;->ܿ:I

    .line 1439
    invoke-virtual {v3, v5, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 307
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    iget-object v5, v4, Ll/֨ۨ᩻;->᩷:Ljava/lang/Integer;

    .line 308
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const-string v6, "lineOffset"

    invoke-virtual {v3, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 309
    iget-object v4, v4, Ll/֨ۨ᩻;->ۜ:Ljava/lang/Integer;

    if-nez v4, :cond_d

    const/4 v4, 0x0

    goto :goto_8

    :cond_d
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    :goto_8
    const-string v5, "lineCharOffset"

    invoke-virtual {v3, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v18

    const-string v3, "read"

    move-object/from16 v4, v29

    move-object/from16 v6, p1

    move-object/from16 p1, v10

    move-object/from16 v10, v37

    move-object v5, v0

    move-object/from16 v38, v19

    move-object v10, v6

    move/from16 v6, p3

    move-object/from16 v39, v7

    move-object v7, v1

    move-object/from16 v40, v8

    move-object/from16 v1, v17

    move-object/from16 v8, v18

    .line 305
    invoke-static/range {v3 .. v8}, Ll/ᩴۨ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    .line 310
    invoke-static {v3, v4}, Ll/ۖܳۜ;->֫(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v4

    invoke-virtual {v2, v1, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    .line 311
    invoke-virtual {v2, v13}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v4

    const-string v5, "Continue reading next page"

    .line 313
    invoke-static {v12, v11, v0, v3}, Ll/۬ܳۜ;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    move-object/from16 v3, p2

    move-object/from16 v6, v16

    .line 311
    invoke-static {v0, v6, v3, v5}, Ll/ۤۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-virtual {v4, v0}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    const/4 v0, 0x0

    goto :goto_9

    :cond_e
    move-object/from16 v37, v5

    move-object/from16 v38, v6

    move-object/from16 v40, v8

    move-object/from16 v1, v17

    move-object/from16 v39, v24

    move-object/from16 v41, v10

    move-object/from16 v10, p1

    move-object/from16 p1, v41

    const/4 v0, 0x0

    const/4 v3, 0x0

    .line 143
    invoke-static {v3, v0}, Ll/ۖܳۜ;->֫(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-virtual {v2, v1, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-object v0, v3

    .line 61
    :goto_9
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 62
    invoke-virtual {v2, v14, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v14, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 63
    invoke-virtual {v2, v15, v10}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v15, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 64
    invoke-virtual {v2, v9}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v4

    invoke-static {v4}, Ll/֨ۙ᩵;->ܽ(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONValue;

    move-result-object v4

    invoke-virtual {v3, v9, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    move-object/from16 v4, v23

    .line 65
    invoke-virtual {v2, v4, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    move-object/from16 v4, v40

    .line 66
    invoke-virtual {v2, v4, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    move-object/from16 v4, v26

    .line 67
    invoke-virtual {v2, v4, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    move-object/from16 v4, v37

    .line 68
    invoke-virtual {v2, v4}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v5

    if-nez v5, :cond_f

    sget-object v5, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_a

    :cond_f
    invoke-virtual {v2, v4}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v5

    :goto_a
    invoke-virtual {v3, v4, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const/4 v4, 0x0

    move-object/from16 v5, v38

    .line 69
    invoke-virtual {v2, v5, v4}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v6

    invoke-virtual {v3, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v3

    move-object/from16 v5, p1

    .line 70
    invoke-virtual {v2, v5, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v5, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    move-object/from16 v3, v22

    .line 71
    invoke-virtual {v2, v3}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    if-nez v3, :cond_10

    .line 149
    sget-object v3, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto/16 :goto_b

    .line 151
    :cond_10
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v5

    move-object/from16 v6, v39

    .line 152
    invoke-virtual {v3, v6, v10}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    move-object/from16 v6, v25

    .line 153
    invoke-virtual {v3, v6, v4}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v7

    invoke-virtual {v5, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v5

    move-object/from16 v6, v27

    .line 154
    invoke-virtual {v3, v6, v4}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v7

    invoke-virtual {v5, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v5

    move-object/from16 v6, v28

    .line 155
    invoke-virtual {v3, v6, v4}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v7

    invoke-virtual {v5, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v5

    move-object/from16 v6, v30

    .line 156
    invoke-virtual {v3, v6, v4}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v7

    invoke-virtual {v5, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v5

    move-object/from16 v6, v31

    .line 157
    invoke-virtual {v3, v6, v4}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v7

    invoke-virtual {v5, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v5

    move-object/from16 v6, v33

    .line 158
    invoke-virtual {v3, v6, v4}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v7

    invoke-virtual {v5, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v5

    const/4 v6, -0x1

    move-object/from16 v7, v34

    .line 159
    invoke-virtual {v3, v7, v6}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v6

    invoke-virtual {v5, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v5

    move-object/from16 v6, v35

    .line 160
    invoke-virtual {v3, v6, v4}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v4

    invoke-virtual {v5, v6, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v4

    move-object/from16 v5, v36

    .line 161
    invoke-virtual {v3, v5}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v6

    invoke-static {v6}, Ll/֨ۙ᩵;->ᩳ(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONValue;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    move-object/from16 v5, v32

    .line 162
    invoke-virtual {v3, v5}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v3

    invoke-static {v3}, Ll/֨ۙ᩵;->ᩳ(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONValue;

    move-result-object v3

    invoke-virtual {v4, v5, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    :goto_b
    const-string v4, "textWindow"

    .line 71
    invoke-virtual {v0, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 72
    invoke-virtual {v2, v1}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 73
    invoke-virtual {v2, v13}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v1

    invoke-static {v0, v1}, Ll/᩶ۛ᩻;->֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object v0

    :goto_c
    move-object/from16 v1, p0

    .line 54
    invoke-direct {v1, v0}, Ll/۬ۛ᩻;-><init>(Lbin/mt/json/JSONObject;)V

    return-object v1

    :cond_11
    const-string v0, "UNSUPPORTED_RESOURCE_READ"

    const-string v1, "Resource reads must use mt_apk_resource_read batch arguments."

    .line 94
    invoke-static {v0, v1}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
.end method


# virtual methods
.method public final ֫(Ll/֫ۜۜ;Ll/ܺۨ᩻;)Ll/۬ۛ᩻;
    .locals 3

    .line 49
    iget-object v0, p1, Ll/֫ۜۜ;->ܺ:Ljava/lang/String;

    iget-object v1, p1, Ll/֫ۜۜ;->֫:Ljava/lang/String;

    new-instance v2, Ll/ܺܳۜ;

    invoke-direct {v2, p0, p1, p2}, Ll/ܺܳۜ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, p0, Ll/ۖܳۜ;->֫:Ll/᩵᩻ۜ;

    const/4 p2, 0x0

    invoke-virtual {p1, v0, v1, p2, v2}, Ll/᩵᩻ۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ۘ᩻ۜ;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/۬ۛ᩻;

    .line 56
    invoke-virtual {p1, v0}, Ll/᩵᩻ۜ;->֫(Ljava/lang/String;)V

    return-object p2
.end method

.method public final ֫(Ll/ۖۨ᩻;Lbin/mt/json/JSONObject;Ll/ܺۨ᩻;)Ll/۬ۛ᩻;
    .locals 4

    const-string v0, "workspaceId"

    const/4 v1, 0x0

    .line 82
    invoke-virtual {p2, v0, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "editSessionId"

    const-string v3, ""

    invoke-virtual {p2, v2, v3}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 81
    invoke-static {v0, v2, p1, p2}, Ll/۬ܳۜ;->ܽ(Ljava/lang/String;Ljava/lang/String;Ll/ۖۨ᩻;Lbin/mt/json/JSONObject;)Ll/֫ۜۜ;

    move-result-object p1

    const-string v0, "nextCursor"

    .line 84
    invoke-virtual {p2, v0, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 49
    iget-object v0, p1, Ll/֫ۜۜ;->ܺ:Ljava/lang/String;

    iget-object v1, p1, Ll/֫ۜۜ;->֫:Ljava/lang/String;

    new-instance v2, Ll/ܺܳۜ;

    invoke-direct {v2, p0, p1, p3}, Ll/ܺܳۜ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, p0, Ll/ۖܳۜ;->֫:Ll/᩵᩻ۜ;

    invoke-virtual {p1, v0, v1, p2, v2}, Ll/᩵᩻ۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ۘ᩻ۜ;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/۬ۛ᩻;

    .line 56
    invoke-virtual {p1, v0}, Ll/᩵᩻ۜ;->֫(Ljava/lang/String;)V

    return-object p2
.end method

.method public final ֫(Ll/ܽۜۜ;)Ll/۬ۛ᩻;
    .locals 35

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 69
    iget-object v2, v0, Ll/ۖܳۜ;->֫:Ll/᩵᩻ۜ;

    invoke-virtual {v2, v1}, Ll/᩵᩻ۜ;->֫(Ll/ܽۜۜ;)Ll/ܰۜۜ;

    move-result-object v3

    .line 70
    sget v4, Ll/ۡۨ᩻;->֫:I

    .line 71
    iget-object v4, v1, Ll/ܽۜۜ;->֫:Ljava/lang/String;

    .line 153
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v5

    .line 154
    iget-object v6, v3, Ll/ܰۜۜ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    const-string v8, "locator"

    if-eqz v7, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ܽ᩷ۜ;

    .line 155
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v9

    iget-object v10, v7, Ll/ܽ᩷ۜ;->֫:Ljava/lang/String;

    .line 156
    invoke-static {v10}, Ll/ۖܳۜ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v8, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    iget-object v7, v7, Ll/ܽ᩷ۜ;->ۧ:Ljava/util/ArrayList;

    .line 157
    invoke-static {v7}, Ll/֨ۙ᩵;->֫(Ljava/lang/Iterable;)Lbin/mt/json/JSONArray;

    move-result-object v7

    const-string v9, "variants"

    invoke-virtual {v8, v9, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v7

    .line 155
    invoke-virtual {v5, v7}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto :goto_0

    .line 159
    :cond_0
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v6

    .line 160
    iget-object v7, v3, Ll/ܰۜۜ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_23

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/᩺ۜۜ;

    .line 177
    iget-object v10, v9, Ll/᩺ۜۜ;->֫:Ljava/lang/String;

    iget-object v11, v9, Ll/᩺ۜۜ;->᩻:Ljava/lang/String;

    iget-object v12, v9, Ll/᩺ۜۜ;->ܿ:Ljava/lang/String;

    iget v13, v9, Ll/᩺ۜۜ;->ۧ:I

    iget-object v14, v9, Ll/᩺ۜۜ;->ܽ:Ll/۬ܽۜ;

    const-string v15, "name"

    const-string v0, "type"

    move-object/from16 v16, v7

    const-string v7, "variant"

    move-object/from16 v17, v2

    const-string v2, "index"

    if-eqz v10, :cond_3

    .line 178
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 179
    invoke-virtual {v1, v2, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 180
    invoke-static {v12}, Ll/ۖܳۜ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v8, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 181
    invoke-virtual {v1, v7, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "errorCode"

    .line 182
    invoke-virtual {v1, v2, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "message"

    iget-object v7, v9, Ll/᩺ۜۜ;->ᩳ:Ljava/lang/String;

    .line 183
    invoke-virtual {v1, v2, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "RESOURCE_NOT_FOUND"

    .line 184
    invoke-virtual {v2, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_2

    :cond_1
    const-string v2, "RESOURCE_VARIANT_NOT_FOUND"

    .line 187
    invoke-virtual {v2, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    if-eqz v14, :cond_2

    .line 188
    iget-object v2, v14, Ll/۬ܽۜ;->ܳ:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iget-object v1, v14, Ll/۬ܽۜ;->ۧ:Ljava/lang/String;

    .line 189
    invoke-virtual {v0, v15, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    :goto_2
    move-object/from16 v21, v3

    move-object/from16 v20, v4

    move-object/from16 v19, v5

    move-object v0, v6

    move-object/from16 v18, v8

    goto/16 :goto_17

    .line 191
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unsupported resource read error: "

    invoke-virtual {v1, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    if-eqz v14, :cond_22

    .line 193
    iget-object v1, v9, Ll/᩺ۜۜ;->ܳ:Ll/ۧᩳۜ;

    if-eqz v1, :cond_22

    .line 197
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v9

    .line 198
    invoke-virtual {v9, v2, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 199
    invoke-static {v12}, Ll/ۖܳۜ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v2, v8, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 200
    invoke-virtual {v2, v7, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    iget-object v7, v14, Ll/۬ܽۜ;->ܳ:Ljava/lang/String;

    .line 201
    invoke-virtual {v2, v0, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iget-object v2, v14, Ll/۬ܽۜ;->ۧ:Ljava/lang/String;

    .line 202
    invoke-virtual {v0, v15, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iget-object v2, v1, Ll/ۧᩳۜ;->ᩴ:Ljava/lang/String;

    iget-boolean v7, v1, Ll/ۧᩳۜ;->ۖ:Z

    iget-object v9, v1, Ll/ۧᩳۜ;->ۘ:Ljava/lang/String;

    const-string v10, "valueKind"

    .line 203
    invoke-virtual {v0, v10, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 204
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v11

    const-string v12, "boolean"

    const-string v13, "attribute"

    const-string v14, "text"

    const-string v15, "unparsed"

    move-object/from16 v18, v8

    const-string v8, "reference"

    move-object/from16 v19, v5

    const-string v5, "number"

    move-object/from16 v20, v4

    const-string v4, "dimension"

    move-object/from16 v21, v3

    const-string v3, "file_path"

    move-object/from16 v22, v6

    const-string v6, "fraction"

    move-object/from16 v23, v10

    const-string v10, "null_value"

    sparse-switch v11, :sswitch_data_0

    goto/16 :goto_4

    :sswitch_0
    const-string v11, "styled_text"

    invoke-virtual {v2, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_4

    goto/16 :goto_4

    :cond_4
    const/16 v11, 0xc

    goto/16 :goto_3

    :sswitch_1
    const-string v11, "color"

    invoke-virtual {v2, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_5

    goto/16 :goto_4

    :cond_5
    const/16 v11, 0xb

    goto/16 :goto_3

    :sswitch_2
    invoke-virtual {v2, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_6

    goto/16 :goto_4

    :cond_6
    const/16 v11, 0xa

    goto/16 :goto_3

    :sswitch_3
    invoke-virtual {v2, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_7

    goto/16 :goto_4

    :cond_7
    const/16 v11, 0x9

    goto/16 :goto_3

    :sswitch_4
    invoke-virtual {v2, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_8

    goto :goto_4

    :cond_8
    const/16 v11, 0x8

    goto :goto_3

    :sswitch_5
    invoke-virtual {v2, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_9

    goto :goto_4

    :cond_9
    const/4 v11, 0x7

    goto :goto_3

    :sswitch_6
    invoke-virtual {v2, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_a

    goto :goto_4

    :cond_a
    const/4 v11, 0x6

    goto :goto_3

    :sswitch_7
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_b

    goto :goto_4

    :cond_b
    const/4 v11, 0x5

    goto :goto_3

    :sswitch_8
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_c

    goto :goto_4

    :cond_c
    const/4 v11, 0x4

    goto :goto_3

    :sswitch_9
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_d

    goto :goto_4

    :cond_d
    const/4 v11, 0x3

    goto :goto_3

    :sswitch_a
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_e

    goto :goto_4

    :cond_e
    const/4 v11, 0x2

    goto :goto_3

    :sswitch_b
    invoke-virtual {v2, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_f

    goto :goto_4

    :cond_f
    const/4 v11, 0x1

    goto :goto_3

    :sswitch_c
    const-string v11, "item_list"

    invoke-virtual {v2, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_10

    goto :goto_4

    :cond_10
    const/4 v11, 0x0

    :goto_3
    move-object/from16 v24, v2

    goto :goto_5

    :goto_4
    const/4 v11, -0x1

    goto :goto_3

    :goto_5
    const-string v2, "zip_entry"

    move-object/from16 v25, v10

    const-string v10, "fileLocator"

    move-object/from16 v26, v6

    const-string v6, "resolvedTarget"

    move-object/from16 v27, v3

    const-string v3, "targetLocator"

    move-object/from16 v28, v4

    const-string v4, "valueTruncated"

    move-object/from16 v29, v5

    const-string v5, "value"

    packed-switch v11, :pswitch_data_0

    .line 218
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unsupported resource value kind: "

    move-object/from16 v2, v24

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 208
    :pswitch_0
    invoke-virtual {v0, v5, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 209
    invoke-virtual {v2, v4, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v2

    iget-object v4, v1, Ll/ۧᩳۜ;->ۢ:Ljava/lang/String;

    if-nez v4, :cond_11

    .line 335
    sget-object v4, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_6

    .line 337
    :cond_11
    invoke-static {v4}, Ll/ۖܳۜ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v4

    .line 210
    :goto_6
    invoke-virtual {v2, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    iget-object v3, v1, Ll/ۧᩳۜ;->ۜ:Ll/ܰܽۜ;

    .line 211
    invoke-static {v3}, Ll/ۖܳۜ;->֫(Ll/ܰܽۜ;)Lbin/mt/json/JSONValue;

    move-result-object v3

    invoke-virtual {v2, v6, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    goto :goto_7

    .line 212
    :pswitch_1
    invoke-virtual {v0, v5, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 213
    invoke-virtual {v3, v4, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v3

    iget-object v4, v1, Ll/ۧᩳۜ;->ܽ:Ljava/lang/String;

    .line 214
    invoke-static {v2, v4}, Ll/۬ܳۜ;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v2

    invoke-virtual {v3, v10, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    goto :goto_7

    .line 206
    :pswitch_2
    invoke-virtual {v0, v5, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 207
    invoke-virtual {v2, v4, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    :goto_7
    move-object v2, v0

    move-object v3, v1

    goto/16 :goto_15

    .line 215
    :pswitch_3
    iget-object v7, v1, Ll/ۧᩳۜ;->ᩳ:Ljava/util/ArrayList;

    .line 240
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v9

    .line 241
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_8
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_20

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/ۧᩳۜ;

    move-object/from16 v24, v7

    .line 242
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v7

    move-object/from16 v30, v1

    iget-object v1, v11, Ll/ۧᩳۜ;->ܳ:Ljava/lang/String;

    move-object/from16 v31, v0

    iget-boolean v0, v11, Ll/ۧᩳۜ;->ۖ:Z

    move-object/from16 v32, v9

    iget-object v9, v11, Ll/ۧᩳۜ;->ۘ:Ljava/lang/String;

    move-object/from16 v33, v10

    iget-object v10, v11, Ll/ۧᩳۜ;->ᩴ:Ljava/lang/String;

    move-object/from16 v34, v2

    const-string v2, "key"

    .line 243
    invoke-virtual {v7, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    iget-object v2, v11, Ll/ۧᩳۜ;->᩻:Ljava/lang/String;

    if-nez v2, :cond_12

    .line 335
    sget-object v2, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_9

    .line 337
    :cond_12
    invoke-static {v2}, Ll/ۖܳۜ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v2

    :goto_9
    const-string v7, "keyLocator"

    .line 244
    invoke-virtual {v1, v7, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    move-object/from16 v2, v23

    .line 245
    invoke-virtual {v1, v2, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 246
    invoke-virtual {v10}, Ljava/lang/String;->hashCode()I

    move-result v7

    sparse-switch v7, :sswitch_data_1

    :goto_a
    move-object/from16 v7, v29

    move-object/from16 v29, v2

    goto/16 :goto_e

    :sswitch_d
    const-string v7, "styled_text"

    invoke-virtual {v10, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_13

    goto :goto_a

    :cond_13
    const/16 v7, 0xb

    move-object/from16 v7, v29

    const/16 v23, 0xb

    goto/16 :goto_b

    :sswitch_e
    const-string v7, "color"

    invoke-virtual {v10, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_14

    goto :goto_a

    :cond_14
    const/16 v7, 0xa

    move-object/from16 v7, v29

    const/16 v23, 0xa

    goto :goto_b

    :sswitch_f
    invoke-virtual {v10, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_15

    goto :goto_a

    :cond_15
    const/16 v7, 0x9

    move-object/from16 v7, v29

    const/16 v23, 0x9

    goto :goto_b

    :sswitch_10
    invoke-virtual {v10, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_16

    goto :goto_a

    :cond_16
    const/16 v7, 0x8

    move-object/from16 v7, v29

    const/16 v23, 0x8

    goto :goto_b

    :sswitch_11
    invoke-virtual {v10, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_17

    goto :goto_a

    :cond_17
    const/4 v7, 0x7

    move-object/from16 v7, v29

    const/16 v23, 0x7

    goto :goto_b

    :sswitch_12
    invoke-virtual {v10, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_18

    goto :goto_a

    :cond_18
    const/4 v7, 0x6

    move-object/from16 v7, v29

    const/16 v23, 0x6

    goto :goto_b

    :sswitch_13
    invoke-virtual {v10, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_19

    goto :goto_a

    :cond_19
    const/4 v7, 0x5

    move-object/from16 v7, v29

    const/16 v23, 0x5

    goto :goto_b

    :sswitch_14
    move-object/from16 v7, v29

    invoke-virtual {v10, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v23

    if-nez v23, :cond_1a

    move-object/from16 v29, v2

    goto :goto_c

    :cond_1a
    const/16 v23, 0x4

    :goto_b
    move-object/from16 v29, v2

    goto :goto_f

    :sswitch_15
    move-object/from16 v7, v29

    move-object/from16 v29, v2

    move-object/from16 v2, v28

    invoke-virtual {v10, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v23

    if-nez v23, :cond_1b

    move-object/from16 v28, v2

    goto :goto_c

    :cond_1b
    const/16 v23, 0x3

    move-object/from16 v28, v2

    goto :goto_f

    :sswitch_16
    move-object/from16 v7, v29

    move-object/from16 v29, v2

    move-object/from16 v2, v27

    invoke-virtual {v10, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v23

    if-nez v23, :cond_1c

    move-object/from16 v27, v2

    :goto_c
    move-object/from16 v2, v26

    goto :goto_d

    :cond_1c
    const/16 v23, 0x2

    move-object/from16 v27, v2

    goto :goto_f

    :sswitch_17
    move-object/from16 v7, v29

    move-object/from16 v29, v2

    move-object/from16 v2, v26

    invoke-virtual {v10, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v23

    if-nez v23, :cond_1d

    :goto_d
    move-object/from16 v26, v2

    :goto_e
    move-object/from16 v2, v25

    goto :goto_10

    :cond_1d
    const/16 v23, 0x1

    move-object/from16 v26, v2

    :goto_f
    move-object/from16 v2, v25

    goto :goto_11

    :sswitch_18
    move-object/from16 v7, v29

    move-object/from16 v29, v2

    move-object/from16 v2, v25

    invoke-virtual {v10, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v23

    if-nez v23, :cond_1e

    goto :goto_10

    :cond_1e
    const/16 v23, 0x0

    goto :goto_11

    :goto_10
    const/16 v23, -0x1

    :goto_11
    packed-switch v23, :pswitch_data_1

    .line 257
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unsupported resource child value kind: "

    invoke-virtual {v1, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 250
    :pswitch_4
    invoke-virtual {v1, v5, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    .line 251
    invoke-virtual {v9, v4, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    iget-object v9, v11, Ll/ۧᩳۜ;->ۢ:Ljava/lang/String;

    if-nez v9, :cond_1f

    .line 335
    sget-object v9, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_12

    .line 337
    :cond_1f
    invoke-static {v9}, Ll/ۖܳۜ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v9

    .line 252
    :goto_12
    invoke-virtual {v0, v3, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iget-object v9, v11, Ll/ۧᩳۜ;->ۜ:Ll/ܰܽۜ;

    .line 253
    invoke-static {v9}, Ll/ۖܳۜ;->֫(Ll/ܰܽۜ;)Lbin/mt/json/JSONValue;

    move-result-object v9

    invoke-virtual {v0, v6, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-object/from16 v0, v32

    move-object/from16 v10, v33

    move-object/from16 v11, v34

    goto :goto_14

    .line 254
    :pswitch_5
    invoke-virtual {v1, v5, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    .line 255
    invoke-virtual {v9, v4, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    iget-object v9, v11, Ll/ۧᩳۜ;->ܽ:Ljava/lang/String;

    move-object/from16 v11, v34

    .line 256
    invoke-static {v11, v9}, Ll/۬ܳۜ;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v9

    move-object/from16 v10, v33

    invoke-virtual {v0, v10, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    goto :goto_13

    :pswitch_6
    move-object/from16 v10, v33

    move-object/from16 v11, v34

    .line 248
    invoke-virtual {v1, v5, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    .line 249
    invoke-virtual {v9, v4, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    :goto_13
    move-object/from16 v0, v32

    .line 260
    :goto_14
    invoke-virtual {v0, v1}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-object v9, v0

    move-object/from16 v25, v2

    move-object v2, v11

    move-object/from16 v23, v29

    move-object/from16 v1, v30

    move-object/from16 v0, v31

    move-object/from16 v29, v7

    move-object/from16 v7, v24

    goto/16 :goto_8

    :cond_20
    move-object/from16 v31, v0

    move-object/from16 v30, v1

    move-object v0, v9

    const-string v1, "items"

    move-object/from16 v2, v31

    .line 215
    invoke-virtual {v2, v1, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "itemsTruncated"

    move-object/from16 v3, v30

    iget-boolean v4, v3, Ll/ۧᩳۜ;->ܿ:Z

    .line 216
    invoke-virtual {v0, v1, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "totalItemCount"

    iget v4, v3, Ll/ۧᩳۜ;->ܺ:I

    .line 217
    invoke-virtual {v0, v1, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    :goto_15
    const-string v0, "targetVersion"

    .line 227
    iget-object v1, v3, Ll/ۧᩳۜ;->ۡ:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "valueXml"

    iget-object v2, v3, Ll/ۧᩳۜ;->᩵:Ljava/lang/String;

    .line 228
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 229
    iget-object v1, v3, Ll/ۧᩳۜ;->֡:Ljava/lang/Integer;

    if-nez v1, :cond_21

    sget-object v1, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_16

    .line 230
    :cond_21
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v1}, Lbin/mt/json/JSON;->value(I)Lbin/mt/json/JSONValue;

    move-result-object v1

    :goto_16
    const-string v2, "valueXmlCharCount"

    .line 229
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "valueXmlTruncated"

    iget-boolean v2, v3, Ll/ۧᩳۜ;->ۚ:Z

    .line 231
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "editable"

    iget-boolean v2, v3, Ll/ۧᩳۜ;->֫:Z

    .line 232
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "editableReason"

    iget-object v2, v3, Ll/ۧᩳۜ;->ۧ:Ljava/lang/String;

    .line 233
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    move-object/from16 v0, v22

    .line 161
    :goto_17
    invoke-virtual {v0, v1}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-object/from16 v1, p1

    move-object v6, v0

    move-object/from16 v7, v16

    move-object/from16 v2, v17

    move-object/from16 v8, v18

    move-object/from16 v5, v19

    move-object/from16 v4, v20

    move-object/from16 v3, v21

    move-object/from16 v0, p0

    goto/16 :goto_1

    .line 194
    :cond_22
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Missing successful resource read value"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_23
    move-object/from16 v17, v2

    move-object/from16 v21, v3

    move-object/from16 v20, v4

    move-object/from16 v19, v5

    move-object v0, v6

    .line 163
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "workspaceId"

    iget-object v4, v3, Ll/ܰۜۜ;->ܿ:Ljava/lang/String;

    .line 164
    invoke-virtual {v1, v2, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "editSessionId"

    move-object/from16 v4, v20

    .line 165
    invoke-virtual {v1, v2, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    iget-object v2, v3, Ll/ܰۜۜ;->ۧ:Ll/ܺᩳۜ;

    .line 166
    invoke-virtual {v2}, Ll/ܺᩳۜ;->֫()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "resourceNamePolicy"

    invoke-virtual {v1, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "variantSets"

    move-object/from16 v3, v19

    .line 167
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "results"

    .line 168
    invoke-virtual {v1, v2, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "nextActions"

    .line 169
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 170
    invoke-static {v0}, Ll/ۜܳۜ;->ۧ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v0

    move-object/from16 v1, p1

    .line 72
    iget-object v1, v1, Ll/ܽۜۜ;->᩻:Ljava/lang/String;

    move-object/from16 v2, v17

    invoke-virtual {v2, v1}, Ll/᩵᩻ۜ;->֫(Ljava/lang/String;)V

    .line 73
    new-instance v1, Ll/۬ۛ᩻;

    invoke-direct {v1, v0}, Ll/۬ۛ᩻;-><init>(Lbin/mt/json/JSONObject;)V

    return-object v1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7fa31db6 -> :sswitch_c
        -0x7841c747 -> :sswitch_b
        -0x62923dfe -> :sswitch_a
        -0x4e76caf8 -> :sswitch_9
        -0x4144929a -> :sswitch_8
        -0x3da724b7 -> :sswitch_7
        -0x3724c0b5 -> :sswitch_6
        -0x67dcc16 -> :sswitch_5
        0x36452d -> :sswitch_4
        0xc7aa9c -> :sswitch_3
        0x3db6c28 -> :sswitch_2
        0x5a72f63 -> :sswitch_1
        0xa45f119 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_2
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        -0x7841c747 -> :sswitch_18
        -0x62923dfe -> :sswitch_17
        -0x4e76caf8 -> :sswitch_16
        -0x4144929a -> :sswitch_15
        -0x3da724b7 -> :sswitch_14
        -0x3724c0b5 -> :sswitch_13
        -0x67dcc16 -> :sswitch_12
        0x36452d -> :sswitch_11
        0xc7aa9c -> :sswitch_10
        0x3db6c28 -> :sswitch_f
        0x5a72f63 -> :sswitch_e
        0xa45f119 -> :sswitch_d
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_6
        :pswitch_6
        :pswitch_5
        :pswitch_6
        :pswitch_6
        :pswitch_4
        :pswitch_6
        :pswitch_6
        :pswitch_4
        :pswitch_6
        :pswitch_6
        :pswitch_6
    .end packed-switch
.end method
