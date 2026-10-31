.class public final Ll/ܽܳۜ;
.super Ll/ۙۛ᩻;
.source "879T"


# instance fields
.field public ֫:Lbin/mt/json/JSONObject;

.field public ۧ:Lbin/mt/json/JSONObject;

.field public final ܽ:Ll/᩵᩻ۜ;


# direct methods
.method public constructor <init>(Ll/᩵᩻ۜ;)V
    .locals 0

    .line 38
    invoke-direct {p0}, Ll/ۙۛ᩻;-><init>()V

    .line 39
    iput-object p1, p0, Ll/ܽܳۜ;->ܽ:Ll/᩵᩻ۜ;

    return-void
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONValue;
    .locals 8

    if-nez p1, :cond_0

    .line 286
    sget-object p0, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    return-object p0

    :cond_0
    const-string v0, "zip_entry"

    .line 287
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    move-object v3, p1

    goto :goto_0

    :cond_1
    move-object v3, v1

    :goto_0
    const-string v0, "resource"

    .line 288
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    move-object v7, p1

    goto :goto_1

    :cond_2
    move-object v7, v1

    :goto_1
    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v2, p0

    .line 286
    invoke-static/range {v2 .. v7}, Ll/۬ܳۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ܽܳۜ;Ll/ۨ᩻ۜ;I)Ll/۬ۛ᩻;
    .locals 52

    move-object/from16 v0, p1

    .line 164
    new-instance v1, Ll/ܺۨ᩻;

    .line 15
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    move-object/from16 v2, p0

    .line 144
    iget-object v2, v2, Ll/ܽܳۜ;->ܽ:Ll/᩵᩻ۜ;

    invoke-virtual {v2, v0, v1}, Ll/᩵᩻ۜ;->֫(Ll/ۨ᩻ۜ;Ll/ܺۨ᩻;)Ll/᩶ۜۜ;

    move-result-object v1

    .line 145
    sget v2, Ll/ۡۨ᩻;->֫:I

    .line 165
    new-instance v2, Ll/۬ۛ᩻;

    iget-object v0, v0, Ll/ۨ᩻ۜ;->ۧ:Ljava/lang/String;

    .line 197
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    iget-object v9, v1, Ll/᩶ۜۜ;->ۚ:Ljava/lang/String;

    iget-boolean v4, v1, Ll/᩶ۜۜ;->᩵:Z

    iget-object v5, v1, Ll/᩶ۜۜ;->ۖ:Ljava/lang/String;

    const-string v10, "workspaceId"

    .line 198
    invoke-virtual {v3, v10, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v11, "editSessionId"

    .line 199
    invoke-virtual {v3, v11, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    iget-object v6, v1, Ll/᩶ۜۜ;->֡:Ljava/lang/String;

    const-string v12, "view"

    .line 200
    invoke-virtual {v3, v12, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 201
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v7

    const-string v13, "nextActions"

    invoke-virtual {v3, v13, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v14

    const-string v3, "zip_entries"

    .line 179
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    const-string v15, "resource"

    const-string v8, "targetLocator"

    const-string v7, "zip_entry"

    move-object/from16 p0, v2

    const-string v2, "fileLocator"

    move-object/from16 p1, v11

    const-string v11, "truncated"

    move-object/from16 v16, v10

    const-string v10, "styled"

    move-object/from16 v17, v9

    const-string v9, "valueSnippet"

    move-object/from16 v18, v13

    const-string v13, "valueKind"

    move-object/from16 v19, v0

    const-string v0, "variant"

    move-object/from16 v20, v12

    const-string v12, "previewValue"

    move/from16 v21, v4

    const-string v4, "valueShape"

    move-object/from16 v22, v12

    const-string v12, "variantCount"

    move-object/from16 v23, v8

    const-string v8, "name"

    move-object/from16 v24, v15

    const-string v15, "type"

    move-object/from16 v25, v2

    const-string v2, "methodCount"

    move-object/from16 v26, v7

    const-string v7, "fieldCount"

    move-object/from16 v27, v11

    const-string v11, "javaName"

    move-object/from16 v28, v10

    const-string v10, "resourceName"

    move-object/from16 v29, v9

    const-string v9, "resourceLocator"

    move-object/from16 v30, v13

    const-string v13, "referencedByResource"

    move-object/from16 v31, v0

    const-string v0, "size"

    move-object/from16 v32, v4

    const-string v4, "locator"

    move-object/from16 v33, v12

    const-string v12, "data"

    move-object/from16 v34, v8

    const-string v8, "prefix"

    if-eqz v3, :cond_3

    .line 180
    invoke-virtual {v14, v8, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    move-object/from16 v35, v15

    iget-object v15, v1, Ll/᩶ۜۜ;->ᩳ:Ljava/util/ArrayList;

    move-object/from16 v36, v2

    iget-object v2, v1, Ll/᩶ۜۜ;->ܿ:Ljava/util/HashMap;

    move-object/from16 v37, v7

    .line 209
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v7

    .line 210
    invoke-virtual {v15}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_0
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v38

    if-eqz v38, :cond_2

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v38

    move-object/from16 v39, v15

    move-object/from16 v15, v38

    check-cast v15, Ll/ܰܳۜ;

    move-object/from16 v38, v11

    .line 211
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v11

    move-object/from16 v46, v1

    iget-object v1, v15, Ll/ܰܳۜ;->֫:Ljava/lang/String;

    const/16 v44, 0x0

    const/16 v45, 0x0

    const-string v40, "zip_entry"

    const/16 v42, 0x0

    const/16 v43, 0x0

    move-object/from16 v41, v1

    .line 212
    invoke-static/range {v40 .. v45}, Ll/۬ܳۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v11, v4, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 214
    iget-object v11, v15, Ll/ܰܳۜ;->ۧ:Ljava/lang/Long;

    if-nez v11, :cond_0

    sget-object v11, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_1

    :cond_0
    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    move-result-wide v40

    invoke-static/range {v40 .. v41}, Lbin/mt/json/JSON;->value(J)Lbin/mt/json/JSONValue;

    move-result-object v11

    :goto_1
    invoke-virtual {v1, v0, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 215
    iget-object v11, v15, Ll/ܰܳۜ;->֫:Ljava/lang/String;

    invoke-virtual {v2, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/ۙۧۜ;

    if-eqz v11, :cond_1

    .line 217
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v15

    const/16 v44, 0x0

    move-object/from16 v47, v2

    iget-object v2, v11, Ll/ۙۧۜ;->֫:Ljava/lang/String;

    const-string v40, "resource"

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    move-object/from16 v45, v2

    .line 218
    invoke-static/range {v40 .. v45}, Ll/۬ܳۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v15, v9, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    iget-object v11, v11, Ll/ۙۧۜ;->ۧ:Ljava/lang/String;

    .line 220
    invoke-virtual {v2, v10, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 217
    invoke-virtual {v1, v13, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    goto :goto_2

    :cond_1
    move-object/from16 v47, v2

    .line 222
    :goto_2
    invoke-virtual {v7, v1}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-object/from16 v11, v38

    move-object/from16 v15, v39

    move-object/from16 v1, v46

    move-object/from16 v2, v47

    goto :goto_0

    :cond_2
    move-object/from16 v46, v1

    move-object/from16 v38, v11

    .line 181
    invoke-virtual {v3, v12, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-object/from16 v39, v10

    move-object/from16 v15, v23

    move-object/from16 v11, v24

    move-object/from16 v41, v33

    move-object/from16 v40, v36

    move-object/from16 v2, v46

    goto/16 :goto_7

    :cond_3
    move-object/from16 v46, v1

    move-object/from16 v36, v2

    move-object/from16 v37, v7

    move-object/from16 v38, v11

    move-object/from16 v35, v15

    const-string v1, "dex_classes"

    .line 182
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 183
    invoke-virtual {v14, v8, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    move-object/from16 v2, v46

    iget-object v3, v2, Ll/᩶ۜۜ;->ۧ:Ljava/util/ArrayList;

    .line 231
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v7

    .line 232
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/᩺ۨ᩻;

    .line 233
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v15

    move-object/from16 v45, v3

    iget-object v3, v11, Ll/᩺ۨ᩻;->֫:Ljava/lang/String;

    const/16 v43, 0x0

    const/16 v44, 0x0

    const-string v39, "dex_class"

    const/16 v40, 0x0

    const/16 v42, 0x0

    move-object/from16 v41, v3

    .line 234
    invoke-static/range {v39 .. v44}, Ll/۬ܳۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v15, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    iget-object v15, v11, Ll/᩺ۨ᩻;->ܽ:Ljava/lang/String;

    move-object/from16 v39, v10

    move-object/from16 v10, v38

    .line 236
    invoke-virtual {v3, v10, v15}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    iget v15, v11, Ll/᩺ۨ᩻;->ۧ:I

    move-object/from16 v10, v37

    .line 237
    invoke-virtual {v3, v10, v15}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v3

    iget v11, v11, Ll/᩺ۨ᩻;->ᩳ:I

    move-object/from16 v15, v36

    .line 238
    invoke-virtual {v3, v15, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 233
    invoke-virtual {v7, v3}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-object/from16 v10, v39

    move-object/from16 v3, v45

    goto :goto_3

    :cond_4
    move-object/from16 v39, v10

    move-object/from16 v15, v36

    move-object/from16 v10, v37

    .line 184
    invoke-virtual {v1, v12, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    goto/16 :goto_6

    :cond_5
    move-object/from16 v39, v10

    move-object/from16 v15, v36

    move-object/from16 v10, v37

    move-object/from16 v2, v46

    const-string v1, "resource_table"

    .line 185
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 186
    invoke-virtual {v14, v8, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    iget-object v3, v2, Ll/᩶ۜۜ;->ۘ:Ljava/util/ArrayList;

    .line 247
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v7

    .line 248
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_7

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/۬ܽۜ;

    move-object/from16 v36, v3

    .line 258
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    move-object/from16 v37, v10

    .line 2285
    iget v10, v11, Ll/۬ܽۜ;->ܿ:I

    .line 727
    invoke-static {v10}, Ll/ۡᩳۜ;->֫(I)Ljava/lang/String;

    move-result-object v45

    const-string v40, "resource"

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    .line 259
    invoke-static/range {v40 .. v45}, Ll/۬ܳۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v3, v4, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    iget-object v10, v11, Ll/۬ܽۜ;->ܳ:Ljava/lang/String;

    move-object/from16 v40, v15

    move-object/from16 v15, v35

    .line 261
    invoke-virtual {v3, v15, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    iget-object v10, v11, Ll/۬ܽۜ;->ۧ:Ljava/lang/String;

    move-object/from16 v15, v34

    .line 262
    invoke-virtual {v3, v15, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    iget v10, v11, Ll/۬ܽۜ;->᩷:I

    move-object/from16 v15, v33

    .line 263
    invoke-virtual {v3, v15, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v3

    iget-object v10, v11, Ll/۬ܽۜ;->ۜ:Ljava/lang/String;

    move-object/from16 v33, v4

    move-object/from16 v4, v32

    .line 264
    invoke-virtual {v3, v4, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    iget-object v10, v11, Ll/۬ܽۜ;->ᩳ:Ll/ۧᩳۜ;

    if-nez v10, :cond_6

    .line 273
    sget-object v10, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    move-object/from16 v32, v4

    move-object/from16 v41, v15

    move-object/from16 v15, v23

    move-object/from16 v11, v24

    goto :goto_5

    .line 275
    :cond_6
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v11

    move-object/from16 v32, v4

    iget-object v4, v10, Ll/ۧᩳۜ;->֨:Ljava/lang/String;

    move-object/from16 v41, v15

    move-object/from16 v15, v31

    .line 276
    invoke-virtual {v11, v15, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    iget-object v11, v10, Ll/ۧᩳۜ;->ᩴ:Ljava/lang/String;

    move-object/from16 v15, v30

    .line 277
    invoke-virtual {v4, v15, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    iget-object v11, v10, Ll/ۧᩳۜ;->ۘ:Ljava/lang/String;

    move-object/from16 v15, v29

    .line 278
    invoke-virtual {v4, v15, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    iget-boolean v11, v10, Ll/ۧᩳۜ;->᩷:Z

    move-object/from16 v15, v28

    .line 279
    invoke-virtual {v4, v15, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v4

    iget-boolean v11, v10, Ll/ۧᩳۜ;->ۖ:Z

    move-object/from16 v15, v27

    .line 280
    invoke-virtual {v4, v15, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v4

    iget-object v11, v10, Ll/ۧᩳۜ;->ܽ:Ljava/lang/String;

    move-object/from16 v15, v26

    .line 281
    invoke-static {v15, v11}, Ll/ܽܳۜ;->֫(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v11

    move-object/from16 v15, v25

    invoke-virtual {v4, v15, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    iget-object v10, v10, Ll/ۧᩳۜ;->ۢ:Ljava/lang/String;

    move-object/from16 v11, v24

    .line 282
    invoke-static {v11, v10}, Ll/ܽܳۜ;->֫(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v10

    move-object/from16 v15, v23

    invoke-virtual {v4, v15, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v10

    :goto_5
    move-object/from16 v4, v22

    .line 265
    invoke-virtual {v3, v4, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 249
    invoke-virtual {v7, v3}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-object/from16 v22, v4

    move-object/from16 v24, v11

    move-object/from16 v23, v15

    move-object/from16 v4, v33

    move-object/from16 v3, v36

    move-object/from16 v10, v37

    move-object/from16 v15, v40

    move-object/from16 v33, v41

    goto/16 :goto_4

    :cond_7
    move-object/from16 v37, v10

    move-object/from16 v40, v15

    move-object/from16 v15, v23

    move-object/from16 v11, v24

    move-object/from16 v41, v33

    move-object/from16 v33, v4

    move-object/from16 v4, v22

    .line 187
    invoke-virtual {v1, v12, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    goto :goto_8

    :cond_8
    move-object/from16 v37, v10

    :goto_6
    move-object/from16 v40, v15

    move-object/from16 v15, v23

    move-object/from16 v11, v24

    move-object/from16 v41, v33

    :goto_7
    move-object/from16 v33, v4

    move-object/from16 v4, v22

    .line 296
    :goto_8
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    iget v10, v2, Ll/᩶ۜۜ;->ۜ:I

    const-string v3, "hasMore"

    move/from16 v7, v21

    .line 297
    invoke-virtual {v1, v3, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "returnedCount"

    move-object/from16 v22, v4

    iget v4, v2, Ll/᩶ۜۜ;->ܽ:I

    .line 298
    invoke-virtual {v1, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "limitMax"

    const/16 v4, 0x3e8

    .line 299
    invoke-virtual {v1, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v4, "totalAvailableCount"

    move-object/from16 v23, v15

    iget v15, v2, Ll/᩶ۜۜ;->ᩴ:I

    .line 300
    invoke-virtual {v1, v4, v15}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    if-eqz v7, :cond_9

    .line 302
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v7, "offset"

    iget v15, v2, Ll/᩶ۜۜ;->ۡ:I

    invoke-virtual {v4, v7, v15}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v15

    .line 303
    iget-object v4, v2, Ll/᩶ۜۜ;->ۚ:Ljava/lang/String;

    .line 304
    sget v2, Ll/۬ܳۜ;->֫:I

    .line 1413
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    move-object/from16 v7, v20

    .line 1414
    invoke-virtual {v2, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v6, "recommendedLimit"

    .line 1415
    invoke-virtual {v2, v6, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v2

    const/16 v6, 0x3e8

    .line 1416
    invoke-virtual {v2, v3, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 1417
    invoke-virtual {v2, v8, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "list"

    move-object/from16 v24, v11

    move-object/from16 v6, v22

    move-object/from16 v5, v32

    move-object/from16 v11, v33

    move-object/from16 v48, v5

    move-object/from16 v5, v19

    move-object/from16 v49, v6

    move/from16 v6, p2

    move-object/from16 v20, v9

    move-object/from16 v21, v13

    move-object/from16 v13, v26

    move-object/from16 v50, v37

    move-object v9, v7

    move-object v7, v2

    move-object v2, v8

    move-object v8, v15

    .line 303
    invoke-static/range {v3 .. v8}, Ll/ᩴۨ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "nextCursor"

    .line 305
    invoke-virtual {v1, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-object/from16 v4, v18

    .line 306
    invoke-virtual {v14, v4}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v5

    const-string v6, "Continue listing next page"

    move-object/from16 v8, v17

    move-object/from16 v7, v19

    .line 308
    invoke-static {v8, v10, v7, v3}, Ll/۬ܳۜ;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v7, "mt_apk_continue"

    const-string v8, "continue"

    .line 306
    invoke-static {v3, v7, v8, v6}, Ll/ۤۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    invoke-virtual {v5, v3}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto :goto_9

    :cond_9
    move-object v2, v8

    move-object/from16 v24, v11

    move-object/from16 v21, v13

    move-object/from16 v4, v18

    move-object/from16 v49, v22

    move-object/from16 v13, v26

    move-object/from16 v48, v32

    move-object/from16 v11, v33

    move-object/from16 v50, v37

    move-object/from16 v51, v20

    move-object/from16 v20, v9

    move-object/from16 v9, v51

    :goto_9
    const-string v3, "pagination"

    .line 311
    invoke-virtual {v14, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    .line 107
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const/4 v5, 0x0

    move-object/from16 v6, v16

    .line 108
    invoke-virtual {v14, v6, v5}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v6, ""

    move-object/from16 v7, p1

    .line 109
    invoke-virtual {v14, v7, v6}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 110
    invoke-virtual {v14, v9, v5}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v9, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 111
    invoke-virtual {v14, v2, v5}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v2, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 112
    invoke-virtual {v14, v12}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v2

    .line 307
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v6

    if-nez v2, :cond_a

    goto/16 :goto_11

    .line 311
    :cond_a
    invoke-virtual {v2}, Lbin/mt/json/JSONArray;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_13

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lbin/mt/json/JSONValue;

    .line 312
    invoke-virtual {v7}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object v7

    .line 313
    invoke-virtual {v7, v11}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v8

    if-eqz v8, :cond_d

    .line 687
    invoke-virtual {v8}, Lbin/mt/json/JSONValue;->isNull()Z

    move-result v9

    if-eqz v9, :cond_b

    goto :goto_b

    .line 690
    :cond_b
    invoke-virtual {v8}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v9

    if-eqz v9, :cond_c

    .line 691
    invoke-virtual {v8}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ll/۬ܳۜ;->ܳ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    goto :goto_c

    .line 693
    :cond_c
    invoke-virtual {v8}, Lbin/mt/json/JSONValue;->isObject()Z

    move-result v9

    if-eqz v9, :cond_d

    .line 694
    invoke-virtual {v8}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object v9

    const-string v10, "kind"

    invoke-virtual {v9, v10, v5}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    goto :goto_c

    :cond_d
    :goto_b
    move-object v9, v5

    .line 315
    :goto_c
    invoke-virtual {v13, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_f

    .line 316
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v9

    .line 317
    invoke-static {v8}, Ll/֨ۙ᩵;->ܽ(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONValue;

    move-result-object v8

    invoke-virtual {v9, v11, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v8

    .line 318
    invoke-virtual {v7, v0}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v9

    invoke-static {v9}, Ll/֨ۙ᩵;->ᩳ(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONValue;

    move-result-object v9

    invoke-virtual {v8, v0, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v8

    move-object/from16 v10, v21

    .line 320
    invoke-virtual {v7, v10}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    if-nez v7, :cond_e

    .line 345
    sget-object v5, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    move-object/from16 v12, v20

    move-object/from16 v15, v39

    goto :goto_d

    .line 347
    :cond_e
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v9

    move-object/from16 v12, v20

    .line 348
    invoke-virtual {v7, v12}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v15

    invoke-static {v15}, Ll/֨ۙ᩵;->ܽ(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONValue;

    move-result-object v15

    invoke-virtual {v9, v12, v15}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v9

    move-object/from16 v15, v39

    .line 349
    invoke-virtual {v7, v15, v5}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v9, v15, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    .line 319
    :goto_d
    invoke-virtual {v8, v10, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v5

    .line 316
    invoke-virtual {v6, v5}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-object/from16 p1, v0

    move-object/from16 p2, v2

    move-object/from16 v21, v10

    move-object/from16 v8, v23

    move-object/from16 v9, v25

    move-object/from16 v10, v27

    move-object/from16 v17, v38

    move-object/from16 v36, v40

    move-object/from16 v33, v41

    move-object/from16 v32, v48

    move-object/from16 v2, v49

    move-object/from16 v16, v50

    goto/16 :goto_10

    :cond_f
    move-object/from16 v12, v20

    move-object/from16 v10, v21

    move-object/from16 v15, v39

    const-string v5, "dex_class"

    .line 321
    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_10

    .line 322
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v5

    .line 323
    invoke-static {v8}, Ll/֨ۙ᩵;->ܽ(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONValue;

    move-result-object v8

    invoke-virtual {v5, v11, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const/4 v8, 0x0

    move-object/from16 v9, v38

    .line 324
    invoke-virtual {v7, v9, v8}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v5, v9, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    move-object/from16 v8, v50

    .line 325
    invoke-virtual {v7, v8}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v16

    move-object/from16 p1, v0

    invoke-static/range {v16 .. v16}, Ll/֨ۙ᩵;->ᩳ(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONValue;

    move-result-object v0

    invoke-virtual {v5, v8, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    move-object/from16 v5, v40

    .line 326
    invoke-virtual {v7, v5}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v7

    invoke-static {v7}, Ll/֨ۙ᩵;->ᩳ(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONValue;

    move-result-object v7

    invoke-virtual {v0, v5, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 322
    invoke-virtual {v6, v0}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-object/from16 p2, v2

    move-object/from16 v36, v5

    move-object/from16 v16, v8

    move-object/from16 v17, v9

    :goto_e
    move-object/from16 v21, v10

    move-object/from16 v8, v23

    move-object/from16 v9, v25

    move-object/from16 v10, v27

    move-object/from16 v33, v41

    move-object/from16 v32, v48

    move-object/from16 v2, v49

    goto/16 :goto_10

    :cond_10
    move-object/from16 p1, v0

    move-object/from16 v0, v24

    move-object/from16 v17, v38

    move-object/from16 v5, v40

    move-object/from16 v16, v50

    .line 327
    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_12

    .line 328
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v9

    .line 329
    invoke-static {v8}, Ll/֨ۙ᩵;->ܽ(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONValue;

    move-result-object v8

    invoke-virtual {v9, v11, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const/4 v9, 0x0

    move-object/from16 v24, v0

    move-object/from16 p2, v2

    move-object/from16 v0, v35

    .line 330
    invoke-virtual {v7, v0, v9}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v8, v0, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    move-object/from16 v8, v34

    .line 331
    invoke-virtual {v7, v8, v9}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v8, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    move-object/from16 v2, v41

    .line 332
    invoke-virtual {v7, v2}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v18

    move-object/from16 v36, v5

    invoke-static/range {v18 .. v18}, Ll/֨ۙ᩵;->ᩳ(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONValue;

    move-result-object v5

    invoke-virtual {v0, v2, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    move-object/from16 v33, v2

    move-object/from16 v5, v48

    .line 333
    invoke-virtual {v7, v5, v9}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v5, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    move-object/from16 v2, v49

    .line 334
    invoke-virtual {v7, v2}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    if-nez v7, :cond_11

    .line 357
    sget-object v7, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    move-object/from16 v32, v5

    move-object/from16 v34, v8

    move-object/from16 v21, v10

    move-object/from16 v8, v23

    move-object/from16 v9, v25

    move-object/from16 v10, v27

    goto :goto_f

    :cond_11
    move-object/from16 v32, v5

    .line 359
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v5

    move-object/from16 v34, v8

    move-object/from16 v21, v10

    move-object/from16 v8, v31

    .line 360
    invoke-virtual {v7, v8, v9}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v5, v8, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    move-object/from16 v10, v30

    .line 361
    invoke-virtual {v7, v10, v9}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v5, v10, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    move-object/from16 v8, v29

    .line 362
    invoke-virtual {v7, v8, v9}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v5, v8, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const/4 v9, 0x0

    move-object/from16 v8, v28

    .line 363
    invoke-virtual {v7, v8, v9}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v10

    invoke-virtual {v5, v8, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v5

    move-object/from16 v10, v27

    .line 364
    invoke-virtual {v7, v10, v9}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v9

    invoke-virtual {v5, v10, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v5

    move-object/from16 v9, v25

    .line 365
    invoke-virtual {v7, v9}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v18

    invoke-static/range {v18 .. v18}, Ll/֨ۙ᩵;->ܽ(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONValue;

    move-result-object v8

    invoke-virtual {v5, v9, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v5

    move-object/from16 v8, v23

    .line 366
    invoke-virtual {v7, v8}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v7

    invoke-static {v7}, Ll/֨ۙ᩵;->ܽ(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONValue;

    move-result-object v7

    invoke-virtual {v5, v8, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v7

    .line 334
    :goto_f
    invoke-virtual {v0, v2, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 328
    invoke-virtual {v6, v0}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto :goto_10

    :cond_12
    move-object/from16 v24, v0

    move-object/from16 p2, v2

    move-object/from16 v36, v5

    goto/16 :goto_e

    :goto_10
    const/4 v5, 0x0

    move-object/from16 v0, p1

    move-object/from16 v49, v2

    move-object/from16 v23, v8

    move-object/from16 v25, v9

    move-object/from16 v27, v10

    move-object/from16 v20, v12

    move-object/from16 v39, v15

    move-object/from16 v50, v16

    move-object/from16 v38, v17

    move-object/from16 v48, v32

    move-object/from16 v41, v33

    move-object/from16 v40, v36

    move-object/from16 v2, p2

    goto/16 :goto_a

    :cond_13
    :goto_11
    const-string v0, "items"

    .line 112
    invoke-virtual {v1, v0, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 113
    invoke-virtual {v14, v3}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-static {v1}, Ll/֨ۙ᩵;->֫(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONValue;

    move-result-object v1

    invoke-virtual {v0, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 114
    invoke-virtual {v14, v4}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v1

    invoke-static {v0, v1}, Ll/᩶ۛ᩻;->֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object v0

    move-object/from16 v1, p0

    .line 165
    invoke-direct {v1, v0}, Ll/۬ۛ᩻;-><init>(Lbin/mt/json/JSONObject;)V

    return-object v1
.end method


# virtual methods
.method public final ֫()Lbin/mt/json/JSONObject;
    .locals 3

    .line 62
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

    .line 196
    invoke-static {p1}, Ll/᩶ۛ᩻;->֫(Ll/ۗۛ᩻;)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Lbin/mt/json/JSONObject;)Ll/۬ۛ᩻;
    .locals 4

    .line 128
    :try_start_0
    invoke-static {p1}, Ll/۬ܳۜ;->ܺ(Lbin/mt/json/JSONObject;)Ll/ۨ᩻ۜ;

    move-result-object p1

    .line 162
    iget-object v0, p0, Ll/ܽܳۜ;->ܽ:Ll/᩵᩻ۜ;

    iget-object v1, p1, Ll/ۨ᩻ۜ;->᩷:Ljava/lang/String;

    iget-object v2, p1, Ll/ۨ᩻ۜ;->ۧ:Ljava/lang/String;

    new-instance v3, Ll/ᩴۡܳ;

    invoke-direct {v3, p0, p1}, Ll/ᩴۡܳ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x0

    invoke-virtual {v0, v1, v2, p1, v3}, Ll/᩵᩻ۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ۘ᩻ۜ;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۬ۛ᩻;

    .line 168
    invoke-virtual {v0, v1}, Ll/᩵᩻ۜ;->֫(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 131
    sget v0, Ll/ۡۨ᩻;->֫:I

    return-object p1

    :catchall_0
    move-exception p1

    sget v0, Ll/ۡۨ᩻;->֫:I

    .line 132
    throw p1
.end method

.method public final ֫(Ll/ۖۨ᩻;Lbin/mt/json/JSONObject;)Ll/۬ۛ᩻;
    .locals 4

    const-string v0, "workspaceId"

    const/4 v1, 0x0

    .line 154
    invoke-virtual {p2, v0, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "editSessionId"

    const-string v3, ""

    invoke-virtual {p2, v2, v3}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 153
    invoke-static {v0, v2, p1, p2}, Ll/۬ܳۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ll/ۖۨ᩻;Lbin/mt/json/JSONObject;)Ll/ۨ᩻ۜ;

    move-result-object p1

    const-string v0, "nextCursor"

    .line 156
    invoke-virtual {p2, v0, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 162
    iget-object v0, p1, Ll/ۨ᩻ۜ;->᩷:Ljava/lang/String;

    iget-object v1, p1, Ll/ۨ᩻ۜ;->ۧ:Ljava/lang/String;

    new-instance v2, Ll/ᩴۡܳ;

    invoke-direct {v2, p0, p1}, Ll/ᩴۡܳ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, p0, Ll/ܽܳۜ;->ܽ:Ll/᩵᩻ۜ;

    invoke-virtual {p1, v0, v1, p2, v2}, Ll/᩵᩻ۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ۘ᩻ۜ;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/۬ۛ᩻;

    .line 168
    invoke-virtual {p1, v0}, Ll/᩵᩻ۜ;->֫(Ljava/lang/String;)V

    return-object p2
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    const-string v0, "Page through an opened APK workspace: ZIP file entries, dex classes, or resource table entries. Use prefix=\"\" for no filter and limit=200 by default. Pass a dex_class item locator to mt_apk_dex_read_class_outline when you need fields and methods for one exact class. For resource table entries, call mt_apk_resource_read with data.workspaceId, data.editSessionId, reads[0].locator, reads[0].variant from previewValue.variant when non-null, and required budget fields. ZIP entry locators can be inspected as raw bytes with mt_apk_read_bytes, whether the entry is text or binary. Continue pages via nextActions."

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    const-string v0, "List APK Structures"

    return-object v0
.end method

.method public final ܽ()Lbin/mt/json/JSONObject;
    .locals 1

    .line 67
    iget-object v0, p0, Ll/ܽܳۜ;->֫:Lbin/mt/json/JSONObject;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Edit session id. Pass the id returned by mt_apk_session_create to list the edited session; pass an empty string to list the base workspace.\"\n  },\n  \"view\": {\n    \"type\": \"string\",\n    \"enum\": [\n      \"zip_entries\",\n      \"dex_classes\",\n      \"resource_table\"\n    ],\n    \"description\": \"Choose the structure page. zip_entries: ZIP file entry list with zip_entry locators; dex_classes: dex class list with dex_class locators for mt_apk_dex_read_class_outline; resource_table: resources.arsc compiled resource table entry list with lightweight value previews.\"\n  },\n  \"prefix\": {\n    \"type\": \"string\",\n    \"description\": \"Pass \\\"\\\" for the default no-filter prefix. For zip_entries, match APK ZIP paths like res/layout/. For dex_classes, match dex descriptors or Java/package prefixes like Lcom/example/ or com.example. For resource_table, match resource locator targets like 0x7f010000, type/name, or name; only 0x resource ids are case-insensitive.\"\n  },\n  \"limit\": {\n    \"type\": \"integer\",\n    \"description\": \"Page size for the first page. Pass 200 by default; maximum 1000. Use mt_apk_continue for later pages.\"\n  }\n}\n"

    .line 70
    invoke-static {v0}, Ll/ۘܳ֨;->֫(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Ll/ܽܳۜ;->֫:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ܿ()Lbin/mt/json/JSONObject;
    .locals 1

    .line 103
    iget-object v0, p0, Ll/ܽܳۜ;->ۧ:Lbin/mt/json/JSONObject;

    if-eqz v0, :cond_0

    return-object v0

    .line 106
    :cond_0
    invoke-static {}, Ll/۠ܳۜ;->֫()Lbin/mt/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Ll/ܽܳۜ;->ۧ:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    const-string v0, "mt_apk_list"

    return-object v0
.end method
