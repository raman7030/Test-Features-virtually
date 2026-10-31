.class public final Ll/ܿܳۜ;
.super Ll/ۙۛ᩻;
.source "X7AT"


# instance fields
.field public ֫:Lbin/mt/json/JSONObject;

.field public ۧ:Lbin/mt/json/JSONObject;

.field public final ܽ:Ll/᩵᩻ۜ;


# direct methods
.method public constructor <init>(Ll/᩵᩻ۜ;)V
    .locals 0

    .line 34
    invoke-direct {p0}, Ll/ۙۛ᩻;-><init>()V

    .line 35
    iput-object p1, p0, Ll/ܿܳۜ;->ܽ:Ll/᩵᩻ۜ;

    return-void
.end method

.method public static ֫(Ljava/lang/String;Ljava/util/ArrayList;)Lbin/mt/json/JSONArray;
    .locals 11

    .line 186
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 187
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩶᩺᩻;

    const-string v2, "field"

    .line 188
    iget-object v3, v1, Ll/᩶᩺᩻;->ᩳ:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const-string v3, "dex_field"

    if-eqz v2, :cond_0

    move-object v4, v3

    goto :goto_1

    :cond_0
    const-string v2, "dex_method"

    move-object v4, v2

    .line 189
    :goto_1
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v5, "name"

    iget-object v6, v1, Ll/᩶᩺᩻;->ܳ:Ljava/lang/String;

    .line 190
    invoke-virtual {v2, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v5, "sig"

    iget-object v6, v1, Ll/᩶᩺᩻;->᩻:Ljava/lang/String;

    .line 191
    invoke-virtual {v2, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v5, "access"

    iget-object v6, v1, Ll/᩶᩺᩻;->֫:Ljava/lang/String;

    .line 192
    invoke-virtual {v2, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 193
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    const-string v10, "locator"

    if-eqz v3, :cond_1

    .line 194
    iget-object v8, v1, Ll/᩶᩺᩻;->᩻:Ljava/lang/String;

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    move-object v6, p0

    invoke-static/range {v4 .. v9}, Ll/۬ܳۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v10, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    .line 196
    iget-object v3, v1, Ll/᩶᩺᩻;->ۧ:Ll/᩸᩺᩻;

    if-eqz v3, :cond_2

    const-string v4, "constantValue"

    .line 197
    iget-object v3, v3, Ll/᩸᩺᩻;->ۧ:Ljava/lang/String;

    invoke-virtual {v2, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    iget-object v1, v1, Ll/᩶᩺᩻;->ۧ:Ll/᩸᩺᩻;

    iget-boolean v1, v1, Ll/᩸᩺᩻;->֫:Z

    const-string v4, "constantValueTruncated"

    .line 198
    invoke-virtual {v3, v4, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    goto :goto_2

    .line 201
    :cond_1
    iget-object v3, v1, Ll/᩶᩺᩻;->ܿ:Ll/ۙ᩺᩻;

    const-string v5, "instructionCount"

    .line 202
    iget v6, v3, Ll/ۙ᩺᩻;->֫:I

    invoke-virtual {v2, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "stringRefCount"

    iget v7, v3, Ll/ۙ᩺᩻;->ܳ:I

    .line 203
    invoke-virtual {v5, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "resourceRefCount"

    iget v7, v3, Ll/ۙ᩺᩻;->ܿ:I

    .line 204
    invoke-virtual {v5, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "invokeCount"

    iget v7, v3, Ll/ۙ᩺᩻;->ᩳ:I

    .line 205
    invoke-virtual {v5, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v5

    iget-object v6, v3, Ll/ۙ᩺᩻;->ܽ:Ljava/util/ArrayList;

    .line 206
    invoke-static {v6}, Ll/֨ۙ᩵;->֫(Ljava/lang/Iterable;)Lbin/mt/json/JSONArray;

    move-result-object v6

    const-string v7, "interestingStrings"

    invoke-virtual {v5, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v5

    iget-object v3, v3, Ll/ۙ᩺᩻;->ۧ:Ljava/util/ArrayList;

    .line 207
    invoke-static {v3}, Ll/֨ۙ᩵;->֫(Ljava/lang/Iterable;)Lbin/mt/json/JSONArray;

    move-result-object v3

    const-string v6, "interestingInvokes"

    invoke-virtual {v5, v6, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    .line 208
    iget-object v7, v1, Ll/᩶᩺᩻;->᩻:Ljava/lang/String;

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v5, 0x0

    move-object v6, p0

    invoke-static/range {v4 .. v9}, Ll/۬ܳۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v10, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    .line 211
    :cond_2
    :goto_2
    invoke-virtual {v0, v2}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto/16 :goto_0

    :cond_3
    return-object v0
.end method

.method public static ֫(Ll/ܿܳۜ;Ll/ۨ᩻ۜ;Ll/ܺۨ᩻;I)Ll/۬ۛ᩻;
    .locals 30

    move-object/from16 v0, p1

    move-object/from16 v1, p0

    .line 154
    iget-object v1, v1, Ll/ܿܳۜ;->ܽ:Ll/᩵᩻ۜ;

    move-object/from16 v2, p2

    invoke-virtual {v1, v0, v2}, Ll/᩵᩻ۜ;->֫(Ll/ۨ᩻ۜ;Ll/ܺۨ᩻;)Ll/᩶ۜۜ;

    move-result-object v1

    .line 155
    sget v2, Ll/ۡۨ᩻;->֫:I

    .line 138
    new-instance v2, Ll/۬ۛ᩻;

    iget-object v0, v0, Ll/ۨ᩻ۜ;->ۧ:Ljava/lang/String;

    .line 165
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    iget-object v9, v1, Ll/᩶ۜۜ;->ۚ:Ljava/lang/String;

    const-string v10, "workspaceId"

    .line 166
    invoke-virtual {v3, v10, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v11, "editSessionId"

    .line 167
    invoke-virtual {v3, v11, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    iget-object v14, v1, Ll/᩶ۜۜ;->֫:Ljava/lang/String;

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-string v12, "dex_class"

    const/4 v13, 0x0

    const/4 v15, 0x0

    .line 168
    invoke-static/range {v12 .. v17}, Ll/۬ܳۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v12, "locator"

    invoke-virtual {v3, v12, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    iget-object v4, v1, Ll/᩶ۜۜ;->᩻:Ljava/lang/String;

    const-string v13, "javaName"

    .line 170
    invoke-virtual {v3, v13, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    iget-object v4, v1, Ll/᩶ۜۜ;->ܺ:Ll/ۗ᩺᩻;

    iget-object v5, v4, Ll/ۗ᩺᩻;->֫:Ljava/lang/String;

    const-string v14, "classHeader"

    .line 171
    invoke-virtual {v3, v14, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    iget-object v5, v4, Ll/ۗ᩺᩻;->ܿ:Ljava/lang/String;

    const-string v15, "super"

    .line 172
    invoke-virtual {v3, v15, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    iget-object v5, v4, Ll/ۗ᩺᩻;->ۧ:Ljava/util/ArrayList;

    .line 173
    invoke-static {v5}, Ll/֨ۙ᩵;->֫(Ljava/lang/Iterable;)Lbin/mt/json/JSONArray;

    move-result-object v5

    const-string v8, "implements"

    invoke-virtual {v3, v8, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    iget-object v4, v4, Ll/ۗ᩺᩻;->ᩳ:Ljava/lang/String;

    const-string v7, "source"

    .line 174
    invoke-virtual {v3, v7, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    iget-object v4, v1, Ll/᩶ۜۜ;->֫:Ljava/lang/String;

    iget-object v5, v1, Ll/᩶ۜۜ;->ܳ:Ljava/util/ArrayList;

    .line 175
    invoke-static {v4, v5}, Ll/ܿܳۜ;->֫(Ljava/lang/String;Ljava/util/ArrayList;)Lbin/mt/json/JSONArray;

    move-result-object v5

    const-string v6, "fields"

    invoke-virtual {v3, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    iget-object v5, v1, Ll/᩶ۜۜ;->᩷:Ljava/util/ArrayList;

    .line 176
    invoke-static {v4, v5}, Ll/ܿܳۜ;->֫(Ljava/lang/String;Ljava/util/ArrayList;)Lbin/mt/json/JSONArray;

    move-result-object v4

    const-string v5, "methods"

    invoke-virtual {v3, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 177
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v4

    move-object/from16 p0, v2

    const-string v2, "nextActions"

    invoke-virtual {v3, v2, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 222
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    move-object/from16 p1, v4

    iget-boolean v4, v1, Ll/᩶ۜۜ;->᩵:Z

    move-object/from16 p2, v15

    iget v15, v1, Ll/᩶ۜۜ;->ۜ:I

    move-object/from16 v16, v5

    const-string v5, "hasMore"

    .line 223
    invoke-virtual {v3, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "returnedCount"

    move-object/from16 v17, v6

    iget v6, v1, Ll/᩶ۜۜ;->ܽ:I

    .line 224
    invoke-virtual {v3, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "limitMax"

    const/16 v6, 0x3e8

    .line 225
    invoke-virtual {v3, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v6, "totalAvailableCount"

    move-object/from16 v18, v7

    iget v7, v1, Ll/᩶ۜۜ;->ᩴ:I

    .line 226
    invoke-virtual {v3, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v7

    if-eqz v4, :cond_0

    .line 228
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "memberOffset"

    iget v6, v1, Ll/᩶ۜۜ;->ۢ:I

    invoke-virtual {v3, v4, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v19

    .line 229
    iget-object v4, v1, Ll/᩶ۜۜ;->ۚ:Ljava/lang/String;

    .line 1424
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    iget-object v1, v1, Ll/᩶ۜۜ;->֫:Ljava/lang/String;

    const/16 v24, 0x0

    const/16 v25, 0x0

    const-string v20, "dex_class"

    const/16 v21, 0x0

    const/16 v23, 0x0

    move-object/from16 v22, v1

    .line 1425
    invoke-static/range {v20 .. v25}, Ll/۬ܳۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v12, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "recommendedLimit"

    .line 1426
    invoke-virtual {v1, v3, v15}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const/16 v3, 0x3e8

    .line 1427
    invoke-virtual {v1, v5, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "outline_class"

    move-object/from16 v6, p1

    move-object/from16 v26, v16

    move-object v5, v0

    move-object/from16 p1, v14

    move-object/from16 v27, v17

    move-object v14, v6

    move/from16 v6, p3

    move-object/from16 v16, v13

    move-object/from16 v28, v18

    move-object v13, v7

    move-object v7, v1

    move-object v1, v8

    move-object/from16 v8, v19

    .line 229
    invoke-static/range {v3 .. v8}, Ll/ᩴۨ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "nextCursor"

    .line 232
    invoke-virtual {v13, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    .line 233
    invoke-virtual {v14, v2}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v4

    const-string v5, "Continue class outline next page"

    .line 236
    invoke-static {v9, v15, v0, v3}, Ll/۬ܳۜ;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "mt_apk_continue"

    const-string v6, "continue"

    .line 233
    invoke-static {v0, v3, v6, v5}, Ll/ۤۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-virtual {v4, v0}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto :goto_0

    :cond_0
    move-object v1, v8

    move-object/from16 v26, v16

    move-object/from16 v27, v17

    move-object/from16 v28, v18

    move-object/from16 v16, v13

    move-object v13, v7

    move-object/from16 v29, v14

    move-object/from16 v14, p1

    move-object/from16 p1, v29

    :goto_0
    const-string v0, "pagination"

    .line 238
    invoke-virtual {v14, v0, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    .line 121
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    const/4 v4, 0x0

    .line 122
    invoke-virtual {v14, v10, v4}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v10, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, ""

    .line 123
    invoke-virtual {v14, v11, v5}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v11, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 124
    invoke-virtual {v14, v12}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v5

    invoke-static {v5}, Ll/֨ۙ᩵;->ܽ(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONValue;

    move-result-object v5

    invoke-virtual {v3, v12, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    move-object/from16 v5, v16

    .line 125
    invoke-virtual {v14, v5, v4}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    move-object/from16 v5, p1

    .line 126
    invoke-virtual {v14, v5, v4}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    move-object/from16 v5, p2

    .line 127
    invoke-virtual {v14, v5, v4}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 128
    invoke-virtual {v14, v1}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v5

    invoke-static {v5}, Ll/֨ۙ᩵;->֫(Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONArray;

    move-result-object v5

    invoke-virtual {v3, v1, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    move-object/from16 v3, v28

    .line 129
    invoke-virtual {v14, v3, v4}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v3, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    move-object/from16 v3, v27

    .line 130
    invoke-virtual {v14, v3}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v5

    .line 373
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v6

    const-string v7, "access"

    const-string v8, "sig"

    const-string v9, "name"

    if-nez v5, :cond_1

    goto :goto_2

    .line 377
    :cond_1
    invoke-virtual {v5}, Lbin/mt/json/JSONArray;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lbin/mt/json/JSONValue;

    .line 378
    invoke-virtual {v10}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object v10

    .line 379
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v11

    .line 380
    invoke-virtual {v10, v12}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v13

    invoke-static {v13}, Ll/֨ۙ᩵;->ܽ(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONValue;

    move-result-object v13

    invoke-virtual {v11, v12, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v11

    .line 381
    invoke-virtual {v10, v9, v4}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v11, v9, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v11

    .line 382
    invoke-virtual {v10, v8, v4}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v11, v8, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v11

    .line 383
    invoke-virtual {v10, v7, v4}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v11, v7, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v11

    const-string v13, "constantValue"

    .line 384
    invoke-virtual {v10, v13, v4}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v11, v13, v15}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v11

    const/4 v13, 0x0

    const-string v15, "constantValueTruncated"

    .line 385
    invoke-virtual {v10, v15, v13}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v10

    invoke-virtual {v11, v15, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v10

    .line 379
    invoke-virtual {v6, v10}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto :goto_1

    .line 130
    :cond_2
    :goto_2
    invoke-virtual {v1, v3, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    move-object/from16 v3, v26

    .line 131
    invoke-virtual {v14, v3}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v5

    .line 394
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v6

    if-nez v5, :cond_3

    goto/16 :goto_4

    .line 398
    :cond_3
    invoke-virtual {v5}, Lbin/mt/json/JSONArray;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lbin/mt/json/JSONValue;

    .line 399
    invoke-virtual {v10}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object v10

    .line 400
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v11

    .line 401
    invoke-virtual {v10, v12}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v13

    invoke-static {v13}, Ll/֨ۙ᩵;->ܽ(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONValue;

    move-result-object v13

    invoke-virtual {v11, v12, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v11

    .line 402
    invoke-virtual {v10, v9, v4}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v11, v9, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v11

    .line 403
    invoke-virtual {v10, v8, v4}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v11, v8, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v11

    .line 404
    invoke-virtual {v10, v7, v4}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v11, v7, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v11

    const-string v13, "instructionCount"

    .line 405
    invoke-virtual {v10, v13}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v15

    invoke-static {v15}, Ll/֨ۙ᩵;->ᩳ(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONValue;

    move-result-object v15

    invoke-virtual {v11, v13, v15}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v11

    const-string v13, "stringRefCount"

    .line 406
    invoke-virtual {v10, v13}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v15

    invoke-static {v15}, Ll/֨ۙ᩵;->ᩳ(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONValue;

    move-result-object v15

    invoke-virtual {v11, v13, v15}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v11

    const-string v13, "resourceRefCount"

    .line 407
    invoke-virtual {v10, v13}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v15

    invoke-static {v15}, Ll/֨ۙ᩵;->ᩳ(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONValue;

    move-result-object v15

    invoke-virtual {v11, v13, v15}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v11

    const-string v13, "invokeCount"

    .line 408
    invoke-virtual {v10, v13}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v15

    invoke-static {v15}, Ll/֨ۙ᩵;->ᩳ(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONValue;

    move-result-object v15

    invoke-virtual {v11, v13, v15}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v11

    const-string v13, "interestingStrings"

    .line 409
    invoke-virtual {v10, v13}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v15

    invoke-static {v15}, Ll/֨ۙ᩵;->֫(Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONArray;

    move-result-object v15

    invoke-virtual {v11, v13, v15}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v11

    const-string v13, "interestingInvokes"

    .line 410
    invoke-virtual {v10, v13}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v10

    invoke-static {v10}, Ll/֨ۙ᩵;->֫(Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONArray;

    move-result-object v10

    invoke-virtual {v11, v13, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v10

    .line 400
    invoke-virtual {v6, v10}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto/16 :goto_3

    .line 131
    :cond_4
    :goto_4
    invoke-virtual {v1, v3, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 132
    invoke-virtual {v14, v0}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    invoke-static {v3}, Ll/֨ۙ᩵;->֫(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONValue;

    move-result-object v3

    invoke-virtual {v1, v0, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 133
    invoke-virtual {v14, v2}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v1

    invoke-static {v0, v1}, Ll/᩶ۛ᩻;->֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object v0

    move-object/from16 v1, p0

    .line 138
    invoke-direct {v1, v0}, Ll/۬ۛ᩻;-><init>(Lbin/mt/json/JSONObject;)V

    return-object v1
.end method


# virtual methods
.method public final ֫()Lbin/mt/json/JSONObject;
    .locals 3

    .line 58
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

    .line 203
    invoke-static {p1}, Ll/᩶ۛ᩻;->֫(Ll/ۗۛ᩻;)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Lbin/mt/json/JSONObject;)Ll/۬ۛ᩻;
    .locals 5

    .line 114
    :try_start_0
    invoke-static {p1}, Ll/۬ܳۜ;->ۘ(Lbin/mt/json/JSONObject;)Ll/ۨ᩻ۜ;

    move-result-object p1

    .line 115
    new-instance v0, Ll/ܺۨ᩻;

    .line 15
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 135
    iget-object v1, p0, Ll/ܿܳۜ;->ܽ:Ll/᩵᩻ۜ;

    iget-object v2, p1, Ll/ۨ᩻ۜ;->᩷:Ljava/lang/String;

    iget-object v3, p1, Ll/ۨ᩻ۜ;->ۧ:Ljava/lang/String;

    new-instance v4, Ll/ᩳۚܳ;

    invoke-direct {v4, p0, p1, v0}, Ll/ᩳۚܳ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x0

    invoke-virtual {v1, v2, v3, p1, v4}, Ll/᩵᩻ۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ۘ᩻ۜ;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۬ۛ᩻;

    .line 141
    invoke-virtual {v1, v2}, Ll/᩵᩻ۜ;->֫(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 117
    sget v0, Ll/ۡۨ᩻;->֫:I

    return-object p1

    :catchall_0
    move-exception p1

    sget v0, Ll/ۡۨ᩻;->֫:I

    .line 118
    throw p1
.end method

.method public final ֫(Ll/ۖۨ᩻;Lbin/mt/json/JSONObject;Ll/ܺۨ᩻;)Ll/۬ۛ᩻;
    .locals 4

    const-string v0, "workspaceId"

    const/4 v1, 0x0

    .line 127
    invoke-virtual {p2, v0, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "editSessionId"

    const-string v3, ""

    invoke-virtual {p2, v2, v3}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 126
    invoke-static {v0, v2, p1, p2}, Ll/۬ܳۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;Ll/ۖۨ᩻;Lbin/mt/json/JSONObject;)Ll/ۨ᩻ۜ;

    move-result-object p1

    const-string v0, "nextCursor"

    .line 129
    invoke-virtual {p2, v0, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 135
    iget-object v0, p1, Ll/ۨ᩻ۜ;->᩷:Ljava/lang/String;

    iget-object v1, p1, Ll/ۨ᩻ۜ;->ۧ:Ljava/lang/String;

    new-instance v2, Ll/ᩳۚܳ;

    invoke-direct {v2, p0, p1, p3}, Ll/ᩳۚܳ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, p0, Ll/ܿܳۜ;->ܽ:Ll/᩵᩻ۜ;

    invoke-virtual {p1, v0, v1, p2, v2}, Ll/᩵᩻ۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ۘ᩻ۜ;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/۬ۛ᩻;

    .line 141
    invoke-virtual {p1, v0}, Ll/᩵᩻ۜ;->֫(Ljava/lang/String;)V

    return-object p2
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    const-string v0, "Read one dex class outline from an opened APK workspace. Copy one exact dex_class locator, such as dex_class:Lcom/example/Foo;, from mt_apk_list or mt_apk_search into locator. Java names such as com.example.Foo are invalid. This is not a prefix search; use mt_apk_list with view=dex_classes and prefix to discover classes first. Returned field and method locators can be passed with the same workspaceId and editSessionId to mt_apk_read_text. Continue pages via nextActions."

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    const-string v0, "Outline APK Dex Class"

    return-object v0
.end method

.method public final ܽ()Lbin/mt/json/JSONObject;
    .locals 1

    .line 63
    iget-object v0, p0, Ll/ܿܳۜ;->֫:Lbin/mt/json/JSONObject;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Edit session id. Pass the id returned by mt_apk_session_create to outline the edited session; pass an empty string to read the base workspace.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"Exact dex_class locator to outline, such as dex_class:Lcom/example/Foo;. Copy the full locator from mt_apk_list or mt_apk_search. Java names, package prefixes, search queries, dex_method:, and dex_field: are invalid.\"\n  },\n  \"limit\": {\n    \"type\": \"integer\",\n    \"description\": \"Maximum fields plus methods to return on this page. Pass 200 by default unless you need a smaller page; maximum 1000. Use mt_apk_continue for later pages.\"\n  }\n}\n"

    .line 66
    invoke-static {v0}, Ll/ۘܳ֨;->֫(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Ll/ܿܳۜ;->֫:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ܿ()Lbin/mt/json/JSONObject;
    .locals 16

    move-object/from16 v0, p0

    .line 90
    iget-object v1, v0, Ll/ܿܳۜ;->ۧ:Lbin/mt/json/JSONObject;

    if-eqz v1, :cond_0

    return-object v1

    .line 764
    :cond_0
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "string"

    const-string v3, "Workspace id used for this outline result."

    .line 103
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "workspaceId"

    .line 765
    invoke-virtual {v1, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "Edit session id used for this outline result; pass this value together with data.workspaceId for member read calls."

    .line 103
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "editSessionId"

    .line 766
    invoke-virtual {v1, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "dex_class locator for this outline result."

    .line 103
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "locator"

    .line 767
    invoke-virtual {v1, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "Java-style class name."

    .line 103
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "javaName"

    .line 768
    invoke-virtual {v1, v5, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "Raw .class header line, or null."

    .line 103
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "classHeader"

    .line 769
    invoke-virtual {v1, v5, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "Superclass descriptor, or null."

    .line 103
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "super"

    .line 770
    invoke-virtual {v1, v5, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "Implemented interfaces."

    .line 771
    invoke-static {v3}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "implements"

    invoke-virtual {v1, v5, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "Smali .source debug file name, or null; not a ZIP entry locator."

    .line 103
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "source"

    .line 772
    invoke-virtual {v1, v5, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "Current class-outline field page; pass data.workspaceId, data.editSessionId, and fields[i].locator to mt_apk_read_text to read the member."

    const-string v5, "type"

    const-string v6, "array"

    const-string v7, "description"

    .line 0
    invoke-static {v5, v6, v7, v3}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 912
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v9, "dex_field locator for mt_apk_read_text; pass data.workspaceId, data.editSessionId, and this locator."

    .line 96
    invoke-static {v2, v9}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    .line 913
    invoke-virtual {v8, v4, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v9, "Field name."

    .line 96
    invoke-static {v2, v9}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    const-string v10, "name"

    .line 914
    invoke-virtual {v8, v10, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v9, "Field signature."

    .line 96
    invoke-static {v2, v9}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    const-string v11, "sig"

    .line 915
    invoke-virtual {v8, v11, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v9, "Smali access flags text."

    .line 96
    invoke-static {v2, v9}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v12

    const-string v13, "access"

    .line 916
    invoke-virtual {v8, v13, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v12, "Static final dex initial value preview, or null."

    .line 103
    invoke-static {v2, v12}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v12

    const-string v14, "constantValue"

    .line 917
    invoke-virtual {v8, v14, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v12, "Whether constantValue was truncated."

    const-string v14, "boolean"

    const-string v15, "constantValueTruncated"

    const-string v0, "One field outline item."

    .line 0
    invoke-static {v8, v14, v12, v15, v0}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v8, "items"

    .line 908
    invoke-virtual {v3, v8, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "fields"

    .line 773
    invoke-virtual {v1, v3, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Current class-outline method page with method features; pass data.workspaceId, data.editSessionId, and methods[i].locator to mt_apk_read_text to read the member."

    .line 0
    invoke-static {v5, v6, v7, v1}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 929
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "dex_method locator for mt_apk_read_text; pass data.workspaceId, data.editSessionId, and this locator."

    .line 96
    invoke-static {v2, v5}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    .line 930
    invoke-virtual {v3, v4, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Method name."

    .line 96
    invoke-static {v2, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 931
    invoke-virtual {v3, v10, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Method signature."

    .line 96
    invoke-static {v2, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 932
    invoke-virtual {v3, v11, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 96
    invoke-static {v2, v9}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 933
    invoke-virtual {v3, v13, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "integer"

    const-string v4, "Instruction count."

    .line 110
    invoke-static {v3, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "instructionCount"

    .line 934
    invoke-virtual {v2, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "String reference count."

    .line 110
    invoke-static {v3, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "stringRefCount"

    .line 935
    invoke-virtual {v2, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "Resource reference count."

    .line 110
    invoke-static {v3, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "resourceRefCount"

    .line 936
    invoke-virtual {v2, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "Invoke count."

    .line 110
    invoke-static {v3, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "invokeCount"

    .line 937
    invoke-virtual {v2, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Interesting string previews."

    .line 938
    invoke-static {v3}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "interestingStrings"

    invoke-virtual {v2, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Interesting invoke previews."

    .line 939
    invoke-static {v3}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "interestingInvokes"

    invoke-virtual {v2, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "One method outline item."

    .line 929
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 925
    invoke-virtual {v1, v8, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "methods"

    .line 774
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Hard maximum limit accepted by mt_apk_continue for this cursor; keep nextActions[0].arguments.limit within this value."

    const-string v2, "Total available count when cheaply known; null means unknown, not zero. For streamed results such as search, continue based on hasMore, nextCursor, or nextActions."

    const-string v3, "Number of items returned on this page."

    .line 1200
    invoke-static {v3, v1, v2}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 775
    invoke-static {v1}, Ll/֫ۛ᩻;->ܽ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "pagination"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Successful mt_apk_dex_read_class_outline data."

    .line 764
    invoke-static {v0, v1}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 63
    invoke-static {}, Ll/۫ܳۜ;->֫()Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-static {v1}, Ll/֫ۛ᩻;->ۧ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "continue"

    .line 1232
    invoke-static {}, Ll/ۧᩳܽ;->֫()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "mt_apk_continue"

    .line 1231
    invoke-static {v3, v4, v2}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "verify_workspace"

    .line 1234
    invoke-static {}, Ll/ۧᩳܽ;->ᩳ()Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "mt_apk_list"

    .line 1233
    invoke-static {v4, v5, v3}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "retry"

    .line 1236
    invoke-static {}, Ll/ۧᩳܽ;->ܳ()Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "mt_apk_workspace_open"

    .line 1235
    invoke-static {v5, v6, v4}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const/4 v5, 0x3

    new-array v5, v5, [Lbin/mt/json/JSONObject;

    const/4 v6, 0x0

    aput-object v2, v5, v6

    const/4 v2, 0x1

    aput-object v3, v5, v2

    const/4 v2, 0x2

    aput-object v4, v5, v2

    const-string v2, "Executable continue or recovery actions; copy arguments directly."

    .line 1230
    invoke-static {v2, v5}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Result for mt_apk_dex_read_class_outline. data returns class metadata plus paged fields[] and methods[] locators for mt_apk_read_text; pass data.workspaceId, data.editSessionId, and the member locator with follow-up reads; nextActions carries continuation or recovery calls."

    .line 62
    invoke-static {v3, v0, v1, v2}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v0

    move-object/from16 v1, p0

    .line 93
    iput-object v0, v1, Ll/ܿܳۜ;->ۧ:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    const-string v0, "mt_apk_dex_read_class_outline"

    return-object v0
.end method
