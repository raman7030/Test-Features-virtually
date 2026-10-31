.class public final Ll/ᩴۨ᩻;
.super Ljava/lang/Object;
.source "879H"


# direct methods
.method public static ֫(I)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x4

    if-ne p0, v0, :cond_0

    const-string p0, "list"

    return-object p0

    :cond_0
    const/16 v0, 0xc

    if-ne p0, v0, :cond_1

    const-string p0, "available_apks"

    return-object p0

    :cond_1
    const/4 v0, 0x6

    if-ne p0, v0, :cond_2

    const-string p0, "outline_class"

    return-object p0

    :cond_2
    const/16 v0, 0xe

    if-ne p0, v0, :cond_3

    const-string p0, "read"

    return-object p0

    :cond_3
    const/16 v0, 0x8

    if-ne p0, v0, :cond_4

    const-string p0, "search"

    return-object p0

    :cond_4
    const/16 v0, 0x9

    if-eq p0, v0, :cond_9

    const/16 v0, 0xa

    if-ne p0, v0, :cond_5

    goto :goto_0

    :cond_5
    const/16 v0, 0xd

    if-ne p0, v0, :cond_6

    const-string p0, "resource_xref"

    return-object p0

    :cond_6
    const/16 v0, 0xf

    if-ne p0, v0, :cond_7

    const-string p0, "native_items"

    return-object p0

    :cond_7
    const/16 v0, 0x10

    if-ne p0, v0, :cond_8

    const-string p0, "native_xref"

    return-object p0

    :cond_8
    const/4 p0, 0x0

    .line 1465
    invoke-static {p0}, Ll/ᩴۨ᩻;->֫(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    .line 1106
    throw p0

    :cond_9
    :goto_0
    const-string p0, "xref"

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Ljava/lang/String;
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p4

    move-object/from16 v2, p5

    const-string v3, "list"

    .line 1061
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    const/16 v4, 0xe

    const/16 v5, 0xc

    const/4 v6, 0x4

    const/4 v7, 0x6

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    const/4 v8, 0x4

    goto :goto_0

    :cond_0
    const-string v3, "available_apks"

    .line 1063
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/16 v3, 0xc

    const/16 v8, 0xc

    goto :goto_0

    :cond_1
    const-string v3, "outline_class"

    .line 1065
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v3, 0x6

    const/4 v8, 0x6

    goto :goto_0

    :cond_2
    const-string v3, "read"

    .line 1067
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    const/16 v3, 0xe

    const/16 v8, 0xe

    goto :goto_0

    :cond_3
    const-string v3, "search"

    .line 1069
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x8

    const/16 v8, 0x8

    goto :goto_0

    :cond_4
    const-string v3, "xref"

    .line 1071
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    const/16 v3, 0xa

    const/16 v8, 0xa

    goto :goto_0

    :cond_5
    const-string v3, "resource_xref"

    .line 1073
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    const/16 v3, 0xd

    const/16 v8, 0xd

    goto :goto_0

    :cond_6
    const-string v3, "native_items"

    .line 1075
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    const/16 v3, 0xf

    const/16 v8, 0xf

    goto :goto_0

    :cond_7
    const-string v3, "native_xref"

    .line 1077
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_52

    const/16 v3, 0x10

    const/16 v8, 0x10

    .line 124
    :goto_0
    new-instance v3, Ll/ۤۜܽ;

    const/16 v9, 0x80

    invoke-direct {v3, v9}, Ll/ۤۜܽ;-><init>(I)V

    const/4 v9, 0x3

    .line 125
    invoke-virtual {v3, v9}, Ll/ۤۜܽ;->writeByte(I)V

    .line 126
    invoke-virtual {v3, v8}, Ll/ۤۜܽ;->writeByte(I)V

    const-string v9, "recommendedLimit"

    const/4 v10, -0x1

    .line 127
    invoke-virtual {v1, v9, v10}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v9

    invoke-static {v3, v9}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;I)V

    const-string v9, "limitMax"

    .line 128
    invoke-virtual {v1, v9, v10}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v9

    invoke-static {v3, v9}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;I)V

    const-string v9, "resource_table"

    const-string v11, "zip_entries"

    const-string v12, "offset"

    const-string v13, ""

    const-string v14, "prefix"

    const/4 v15, 0x0

    if-ne v8, v6, :cond_b

    const-string v0, "view"

    .line 294
    invoke-virtual {v1, v0, v15}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1113
    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8

    const/4 v0, 0x1

    goto :goto_1

    :cond_8
    const-string v4, "dex_classes"

    .line 1115
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_9

    const/4 v0, 0x2

    goto :goto_1

    .line 1117
    :cond_9
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_a

    const/4 v0, 0x3

    .line 296
    :goto_1
    invoke-virtual {v3, v0}, Ll/ۤۜܽ;->writeByte(I)V

    .line 297
    invoke-virtual {v1, v14, v13}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;Ljava/lang/String;)V

    .line 298
    invoke-virtual {v2, v12, v10}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v3, v0}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;I)V

    goto :goto_2

    .line 1120
    :cond_a
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Unsupported list view: "

    .line 0
    invoke-static {v2, v0}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1120
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_b
    if-ne v8, v5, :cond_c

    .line 318
    invoke-virtual {v1, v14, v13}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;Ljava/lang/String;)V

    .line 319
    invoke-virtual {v2, v12, v10}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v3, v0}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;I)V

    :goto_2
    move v11, v8

    goto/16 :goto_18

    :cond_c
    const-string v5, "locator"

    if-ne v8, v7, :cond_d

    .line 335
    invoke-virtual {v1, v5, v15}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;Ljava/lang/String;)V

    const-string v0, "memberOffset"

    .line 336
    invoke-virtual {v2, v0, v10}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v3, v0}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;I)V

    goto :goto_2

    :cond_d
    const-string v6, "target"

    if-ne v8, v4, :cond_14

    .line 352
    invoke-virtual {v1, v6, v15}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 353
    invoke-static {v0}, Ll/۬ܳۜ;->ܳ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ll/ᩴۨ᩻;->ᩳ(Ljava/lang/String;)I

    move-result v4

    const-string v5, "format"

    const-string v6, "text"

    .line 354
    invoke-virtual {v1, v5, v6}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 783
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_e

    const/4 v5, 0x1

    goto :goto_3

    :cond_e
    const-string v6, "hex"

    .line 785
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_13

    const/4 v5, 0x2

    :goto_3
    const/4 v6, 0x2

    if-ne v5, v6, :cond_10

    const/4 v9, 0x1

    if-ne v4, v9, :cond_f

    goto :goto_4

    .line 356
    :cond_f
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Byte read cursors are valid only for zip_entry targets"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 358
    :cond_10
    :goto_4
    invoke-virtual {v3, v4}, Ll/ۤۜܽ;->writeByte(I)V

    .line 359
    invoke-static {v3, v4, v0}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;ILjava/lang/String;)V

    .line 360
    invoke-virtual {v3, v5}, Ll/ۤۜܽ;->writeByte(I)V

    if-ne v5, v6, :cond_11

    const-string v0, "hexOffset"

    .line 362
    invoke-virtual {v2, v0, v10}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v3, v0}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;I)V

    goto :goto_2

    :cond_11
    if-ne v4, v7, :cond_12

    const-string v0, "variant"

    .line 364
    invoke-virtual {v1, v0, v15}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;Ljava/lang/String;)V

    const-string v0, "maxValueChars"

    .line 365
    invoke-virtual {v1, v0, v10}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v3, v0}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;I)V

    const-string v0, "maxValueXmlChars"

    const v4, 0x8000

    .line 367
    invoke-virtual {v1, v0, v4}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v3, v0}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;I)V

    const-string v0, "maxItemsPerValue"

    .line 368
    invoke-virtual {v1, v0, v10}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v3, v0}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;I)V

    const-string v0, "resolveDepth"

    .line 369
    invoke-virtual {v1, v0, v10}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v3, v0}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;I)V

    const-string v0, "valueOffset"

    .line 370
    invoke-virtual {v2, v0, v10}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v3, v0}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;I)V

    goto/16 :goto_2

    :cond_12
    const-string v0, "maxChars"

    .line 372
    invoke-virtual {v1, v0, v10}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v3, v0}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;I)V

    const-string v0, "lineOffset"

    .line 373
    invoke-virtual {v2, v0, v10}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v3, v0}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;I)V

    const-string v0, "lineCharOffset"

    .line 374
    invoke-virtual {v2, v0, v10}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v3, v0}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;I)V

    goto/16 :goto_2

    .line 788
    :cond_13
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unsupported read format: "

    .line 0
    invoke-static {v1, v5}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 788
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_14
    const-string v4, "entryIndex"

    const-string v7, "scopeIndex"

    const-string v10, "axml"

    const-string v15, "scopes"

    const-string v0, "exact"

    const-wide/16 v16, 0x0

    move-object/from16 v18, v13

    const-string v13, "memberIndex"

    move-object/from16 v19, v12

    const-string v12, "classIndex"

    move-object/from16 v20, v5

    const/16 v5, 0x8

    if-ne v8, v5, :cond_3e

    const-string v5, "query"

    const/4 v9, 0x0

    .line 414
    invoke-virtual {v1, v5, v9}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v5}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;Ljava/lang/String;)V

    const-string v5, "queryType"

    .line 415
    invoke-virtual {v1, v5, v9}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v9, "literal"

    .line 1189
    invoke-virtual {v9, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_15

    const/4 v5, 0x1

    goto :goto_5

    :cond_15
    const-string v9, "regex"

    .line 1191
    invoke-virtual {v9, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_3d

    const/4 v5, 0x2

    .line 415
    :goto_5
    invoke-virtual {v3, v5}, Ll/ۤۜܽ;->writeByte(I)V

    const-string v5, "caseSensitive"

    const/4 v9, 0x0

    .line 416
    invoke-virtual {v1, v5, v9}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v5

    .line 956
    invoke-virtual {v3, v5}, Ll/ۤۜܽ;->writeByte(I)V

    const-string v5, "matchMode"

    const/4 v9, 0x0

    .line 417
    invoke-virtual {v1, v5, v9}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v9, "contains"

    .line 1213
    invoke-virtual {v9, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_16

    const/4 v0, 0x1

    goto :goto_6

    .line 1215
    :cond_16
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3c

    const/4 v0, 0x2

    .line 417
    :goto_6
    invoke-virtual {v3, v0}, Ll/ۤۜܽ;->writeByte(I)V

    .line 418
    invoke-virtual {v1, v15}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v0

    const/4 v5, 0x0

    const/4 v9, 0x0

    .line 1018
    :goto_7
    invoke-virtual {v0}, Lbin/mt/json/JSONArray;->size()I

    move-result v15

    move/from16 v21, v8

    const-string v8, "smali"

    if-ge v5, v15, :cond_24

    .line 1019
    invoke-virtual {v0, v5}, Lbin/mt/json/JSONArray;->get(I)Lbin/mt/json/JSONValue;

    move-result-object v15

    invoke-virtual {v15}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v15

    .line 1431
    invoke-virtual {v11, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_17

    const/4 v8, 0x1

    :goto_8
    move-object/from16 p0, v0

    goto/16 :goto_9

    .line 1433
    :cond_17
    invoke-virtual {v10, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_18

    const/4 v8, 0x2

    goto :goto_8

    :cond_18
    move-object/from16 p0, v0

    const-string v0, "resource_table_id"

    .line 1435
    invoke-virtual {v0, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_19

    const/4 v8, 0x4

    goto/16 :goto_9

    :cond_19
    const-string v0, "resource_table_name"

    .line 1437
    invoke-virtual {v0, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1a

    const/16 v8, 0x8

    goto :goto_9

    :cond_1a
    const-string v0, "resource_table_value"

    .line 1439
    invoke-virtual {v0, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1b

    const/16 v8, 0x10

    goto :goto_9

    :cond_1b
    const-string v0, "resource_table_file_path"

    .line 1441
    invoke-virtual {v0, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1c

    const/16 v8, 0x400

    goto :goto_9

    :cond_1c
    const-string v0, "dex_class"

    .line 1443
    invoke-virtual {v0, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1d

    const/16 v8, 0x20

    goto :goto_9

    :cond_1d
    const-string v0, "dex_field"

    .line 1445
    invoke-virtual {v0, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1e

    const/16 v8, 0x40

    goto :goto_9

    :cond_1e
    const-string v0, "dex_method"

    .line 1447
    invoke-virtual {v0, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1f

    const/16 v8, 0x80

    goto :goto_9

    :cond_1f
    const-string v0, "dex_string"

    .line 1449
    invoke-virtual {v0, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_20

    const/16 v8, 0x100

    goto :goto_9

    .line 1451
    :cond_20
    invoke-virtual {v8, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_21

    const/16 v8, 0x200

    goto :goto_9

    :cond_21
    const-string v0, "native_symbol"

    .line 1453
    invoke-virtual {v0, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_22

    const/16 v8, 0x800

    goto :goto_9

    :cond_22
    const-string v0, "native_string"

    .line 1455
    invoke-virtual {v0, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_23

    const/16 v8, 0x1000

    :goto_9
    or-int/2addr v9, v8

    add-int/lit8 v5, v5, 0x1

    move-object/from16 v0, p0

    move/from16 v8, v21

    goto/16 :goto_7

    .line 1458
    :cond_23
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unsupported scope: "

    .line 0
    invoke-static {v1, v15}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1458
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 418
    :cond_24
    invoke-static {v3, v9}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;I)V

    const-string v0, "includeSnippet"

    const/4 v5, 0x0

    .line 419
    invoke-virtual {v1, v0, v5}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    .line 956
    invoke-virtual {v3, v0}, Ll/ۤۜܽ;->writeByte(I)V

    const-string v0, "snippetMaxChars"

    const/4 v9, -0x1

    .line 420
    invoke-virtual {v1, v0, v9}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v3, v0}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;I)V

    const-string v0, "explicitScopes"

    .line 421
    invoke-virtual {v1, v0, v5}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    .line 956
    invoke-virtual {v3, v0}, Ll/ۤۜܽ;->writeByte(I)V

    const-string v0, "includeMatchOffsets"

    .line 422
    invoke-virtual {v1, v0, v5}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    .line 956
    invoke-virtual {v3, v0}, Ll/ۤۜܽ;->writeByte(I)V

    const-string v0, "zipEntryPrefix"

    const/4 v9, 0x0

    .line 423
    invoke-virtual {v1, v0, v9}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_25

    .line 931
    invoke-virtual {v3, v5}, Ll/ۤۜܽ;->writeByte(I)V

    goto :goto_a

    :cond_25
    const/4 v10, 0x1

    .line 933
    invoke-virtual {v3, v10}, Ll/ۤۜܽ;->writeByte(I)V

    .line 934
    invoke-static {v3, v0}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;Ljava/lang/String;)V

    :goto_a
    const/4 v0, 0x1

    const-string v10, "resourcePrefix"

    .line 424
    invoke-virtual {v1, v10, v9}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    if-nez v10, :cond_26

    .line 931
    invoke-virtual {v3, v5}, Ll/ۤۜܽ;->writeByte(I)V

    goto :goto_b

    .line 933
    :cond_26
    invoke-virtual {v3, v0}, Ll/ۤۜܽ;->writeByte(I)V

    .line 934
    invoke-static {v3, v10}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;Ljava/lang/String;)V

    :goto_b
    const-string v0, "classPrefixMode"

    .line 425
    invoke-virtual {v1, v0, v9}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v5, "none"

    .line 1237
    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_27

    const/4 v0, 0x0

    goto :goto_c

    .line 1239
    :cond_27
    invoke-virtual {v14, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_28

    const/4 v0, 0x1

    goto :goto_c

    :cond_28
    const-string v5, "descriptorExact"

    .line 1241
    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3b

    const/4 v0, 0x2

    .line 426
    :goto_c
    invoke-virtual {v3, v0}, Ll/ۤۜܽ;->writeByte(I)V

    if-eqz v0, :cond_29

    const-string v0, "classPrefix"

    const/4 v5, 0x0

    .line 428
    invoke-virtual {v1, v0, v5}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;Ljava/lang/String;)V

    goto :goto_d

    :cond_29
    const/4 v5, 0x0

    :goto_d
    const-string v0, "dexStringResultMode"

    .line 430
    invoke-virtual {v1, v0, v5}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v5, "class"

    .line 1265
    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2a

    const/4 v0, 0x1

    goto :goto_e

    :cond_2a
    const-string v5, "member"

    .line 1267
    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3a

    const/4 v0, 0x2

    .line 430
    :goto_e
    invoke-virtual {v3, v0}, Ll/ۤۜܽ;->writeByte(I)V

    const/4 v0, -0x1

    .line 431
    invoke-virtual {v2, v7, v0}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v5

    invoke-static {v3, v5}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;I)V

    .line 432
    invoke-virtual {v2, v4, v0}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v4

    invoke-static {v3, v4}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;I)V

    .line 433
    invoke-virtual {v2, v12, v0}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v4

    invoke-static {v3, v4}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;I)V

    const/4 v4, -0x2

    .line 434
    invoke-virtual {v2, v13, v4}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    invoke-static {v3, v4}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;I)V

    const-string v4, "classCharOffset"

    .line 435
    invoke-virtual {v2, v4, v0}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v3, v0}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;I)V

    const/4 v0, 0x0

    .line 436
    invoke-virtual {v1, v6, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "native_strings"

    if-eqz v0, :cond_36

    .line 437
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_36

    const-string v4, "overview"

    .line 1289
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2b

    const/4 v4, 0x1

    goto/16 :goto_f

    :cond_2b
    const-string v4, "files"

    .line 1291
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2c

    const/4 v4, 0x2

    goto :goto_f

    :cond_2c
    const-string v4, "resource_table_names"

    .line 1293
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2d

    const/4 v4, 0x3

    goto :goto_f

    :cond_2d
    const-string v4, "resource_table_values"

    .line 1295
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2e

    const/4 v4, 0x4

    goto :goto_f

    :cond_2e
    const-string v4, "resource_table_file_paths"

    .line 1297
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2f

    const/4 v4, 0x5

    goto :goto_f

    :cond_2f
    const-string v4, "dex_names"

    .line 1299
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_30

    const/4 v4, 0x6

    goto :goto_f

    :cond_30
    const-string v4, "dex_strings"

    .line 1301
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_31

    const/4 v4, 0x7

    goto :goto_f

    :cond_31
    const-string v4, "dex_string_members"

    .line 1303
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_32

    const/16 v4, 0x8

    goto :goto_f

    .line 1305
    :cond_32
    invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_33

    const/16 v4, 0x9

    goto :goto_f

    :cond_33
    const-string v4, "native_symbols"

    .line 1307
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_34

    const/16 v4, 0xa

    goto :goto_f

    .line 1309
    :cond_34
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_35

    const/16 v4, 0xb

    .line 438
    :goto_f
    invoke-virtual {v3, v4}, Ll/ۤۜܽ;->writeByte(I)V

    goto :goto_10

    .line 1312
    :cond_35
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Unsupported search target: "

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_36
    :goto_10
    const-string v4, "nativeStringTotalCount"

    const/4 v5, -0x1

    .line 440
    invoke-virtual {v2, v4, v5}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v4

    if-ltz v4, :cond_39

    .line 442
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_38

    .line 446
    invoke-static {v3, v4}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;I)V

    const-string v0, "nativeStringScanOffset"

    const-wide/16 v4, -0x1

    .line 447
    invoke-virtual {v2, v0, v4, v5}, Lbin/mt/json/JSONObject;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    cmp-long v2, v0, v16

    if-ltz v2, :cond_37

    const/4 v4, 0x1

    goto :goto_11

    :cond_37
    const/4 v4, 0x0

    .line 956
    :goto_11
    invoke-virtual {v3, v4}, Ll/ۤۜܽ;->writeByte(I)V

    if-ltz v2, :cond_39

    .line 450
    invoke-static {v3, v0, v1}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;J)V

    goto :goto_12

    .line 443
    :cond_38
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Native string scan state requires native_strings target"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_39
    :goto_12
    move/from16 v11, v21

    goto/16 :goto_18

    .line 1270
    :cond_3a
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Unsupported dex string result mode: "

    .line 0
    invoke-static {v2, v0}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1270
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 1244
    :cond_3b
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Unsupported classPrefixMode: "

    .line 0
    invoke-static {v2, v0}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1244
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 1218
    :cond_3c
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unsupported matchMode: "

    .line 0
    invoke-static {v1, v5}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1218
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1194
    :cond_3d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unsupported queryType: "

    .line 0
    invoke-static {v1, v5}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1194
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3e
    move/from16 v21, v8

    const-string v5, "instructionIndex"

    const-string v6, "targetLocator"

    const/16 v8, 0xa

    move/from16 v11, v21

    if-ne v11, v8, :cond_45

    const/4 v4, 0x0

    .line 498
    invoke-virtual {v1, v6, v4}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 499
    invoke-static {v4}, Ll/۬ܳۜ;->ܳ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ll/ᩴۨ᩻;->ᩳ(Ljava/lang/String;)I

    move-result v6

    const/4 v7, 0x4

    if-eq v6, v7, :cond_40

    const/4 v7, 0x5

    if-eq v6, v7, :cond_40

    const/4 v7, 0x3

    if-ne v6, v7, :cond_3f

    goto :goto_13

    .line 501
    :cond_3f
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Xref cursors are valid only for dex targets"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 503
    :cond_40
    :goto_13
    invoke-virtual {v3, v6}, Ll/ۤۜܽ;->writeByte(I)V

    .line 504
    invoke-static {v3, v6, v4}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;ILjava/lang/String;)V

    const-string v4, "methodResolution"

    const/4 v6, 0x0

    .line 505
    invoke-virtual {v1, v4, v6}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1349
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_41

    const/4 v0, 0x1

    goto :goto_14

    :cond_41
    const-string v0, "slot"

    .line 1351
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_42

    const/4 v0, 0x2

    goto :goto_14

    :cond_42
    const-string v0, "dispatch"

    .line 1353
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_43

    const/4 v0, 0x3

    goto :goto_14

    :cond_43
    const-string v0, "not_applicable"

    .line 1355
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_44

    const/4 v0, 0x4

    .line 505
    :goto_14
    invoke-virtual {v3, v0}, Ll/ۤۜܽ;->writeByte(I)V

    const/4 v0, -0x1

    .line 506
    invoke-virtual {v2, v12, v0}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v1

    invoke-static {v3, v1}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;I)V

    .line 507
    invoke-virtual {v2, v13, v0}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v1

    invoke-static {v3, v1}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;I)V

    .line 508
    invoke-virtual {v2, v5, v0}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v3, v0}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;I)V

    goto/16 :goto_18

    .line 1358
    :cond_44
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "Unsupported xref methodResolution: "

    .line 0
    invoke-static {v2, v1}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1358
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_45
    const/16 v0, 0xd

    if-ne v11, v0, :cond_4b

    const/4 v0, 0x0

    .line 549
    invoke-virtual {v1, v6, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 550
    invoke-static {v0}, Ll/۬ܳۜ;->ܳ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ll/ᩴۨ᩻;->ᩳ(Ljava/lang/String;)I

    move-result v6

    const/4 v8, 0x6

    if-ne v6, v8, :cond_4a

    .line 554
    invoke-static {v3, v6, v0}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;ILjava/lang/String;)V

    .line 555
    invoke-virtual {v1, v15}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 556
    invoke-virtual {v0}, Lbin/mt/json/JSONArray;->size()I

    move-result v1

    invoke-static {v3, v1}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;I)V

    const/4 v1, 0x0

    .line 557
    :goto_15
    invoke-virtual {v0}, Lbin/mt/json/JSONArray;->size()I

    move-result v6

    if-ge v1, v6, :cond_49

    .line 558
    invoke-virtual {v0, v1}, Lbin/mt/json/JSONArray;->get(I)Lbin/mt/json/JSONValue;

    move-result-object v6

    invoke-virtual {v6}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v6

    const-string v8, "dex"

    .line 1381
    invoke-virtual {v8, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_46

    const/4 v6, 0x1

    goto :goto_16

    .line 1383
    :cond_46
    invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_47

    const/4 v6, 0x2

    goto :goto_16

    .line 1385
    :cond_47
    invoke-virtual {v9, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_48

    const/4 v6, 0x3

    .line 558
    :goto_16
    invoke-virtual {v3, v6}, Ll/ۤۜܽ;->writeByte(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_15

    .line 1388
    :cond_48
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unsupported resource xref scope: "

    .line 0
    invoke-static {v1, v6}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1388
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_49
    const/4 v0, -0x1

    .line 560
    invoke-virtual {v2, v7, v0}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v1

    invoke-static {v3, v1}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;I)V

    .line 561
    invoke-virtual {v2, v4, v0}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v1

    invoke-static {v3, v1}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;I)V

    .line 562
    invoke-virtual {v2, v12, v0}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v1

    invoke-static {v3, v1}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;I)V

    .line 563
    invoke-virtual {v2, v13, v0}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v1

    invoke-static {v3, v1}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;I)V

    .line 564
    invoke-virtual {v2, v5, v0}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v1

    invoke-static {v3, v1}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;I)V

    const-string v1, "innerIndex"

    .line 565
    invoke-virtual {v2, v1, v0}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v3, v0}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;I)V

    goto/16 :goto_18

    .line 552
    :cond_4a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Resource xref cursors are valid only for resource targets"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4b
    const-wide v4, 0xffffffffL

    const-string v0, "entryCrc"

    const-string v6, "entrySize"

    const/16 v7, 0xf

    if-ne v11, v7, :cond_4f

    const/4 v7, 0x0

    move-object/from16 v8, v20

    .line 598
    invoke-virtual {v1, v8, v7}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v3, v8}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;Ljava/lang/String;)V

    const-string v8, "itemKind"

    .line 599
    invoke-virtual {v1, v8, v7}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x0

    const/16 v10, 0x9

    :goto_17
    if-ge v9, v10, :cond_4e

    .line 1410
    sget-object v12, Ll/ܶܺۢ;->֫:[Ljava/lang/String;

    aget-object v12, v12, v9

    invoke-virtual {v12, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_4d

    add-int/lit8 v9, v9, 0x1

    .line 599
    invoke-virtual {v3, v9}, Ll/ۤۜܽ;->writeByte(I)V

    const-string v8, "namePrefix"

    .line 600
    invoke-virtual {v1, v8, v7}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v3, v7}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;Ljava/lang/String;)V

    const-string v7, "demangle"

    const/4 v8, 0x0

    .line 601
    invoke-virtual {v1, v7, v8}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v7

    .line 956
    invoke-virtual {v3, v7}, Ll/ۤۜܽ;->writeByte(I)V

    const-wide/16 v7, -0x1

    .line 602
    invoke-virtual {v1, v6, v7, v8}, Lbin/mt/json/JSONObject;->getLong(Ljava/lang/String;J)J

    move-result-wide v9

    invoke-static {v3, v9, v10}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;J)V

    .line 603
    invoke-virtual {v1, v0, v7, v8}, Lbin/mt/json/JSONObject;->getLong(Ljava/lang/String;J)J

    move-result-wide v6

    cmp-long v0, v6, v16

    if-ltz v0, :cond_4c

    cmp-long v0, v6, v4

    if-gtz v0, :cond_4c

    .line 607
    invoke-static {v3, v6, v7}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;J)V

    const-string v0, "totalCount"

    const/4 v4, -0x1

    .line 608
    invoke-virtual {v1, v0, v4}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v3, v0}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;I)V

    move-object/from16 v12, v19

    .line 609
    invoke-virtual {v2, v12, v4}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v3, v0}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;I)V

    goto/16 :goto_18

    .line 605
    :cond_4c
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid native entry CRC"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4d
    move-object/from16 v12, v19

    add-int/lit8 v9, v9, 0x1

    goto :goto_17

    .line 1414
    :cond_4e
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unsupported native itemKind: "

    .line 0
    invoke-static {v1, v8}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1414
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4f
    move-object/from16 v8, v20

    const/16 v7, 0x10

    if-ne v11, v7, :cond_51

    move-object/from16 v7, v18

    .line 638
    invoke-virtual {v1, v8, v7}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v3, v8}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;Ljava/lang/String;)V

    const-string v8, "addressKind"

    .line 639
    invoke-virtual {v1, v8, v7}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v3, v8}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;Ljava/lang/String;)V

    const-string v8, "address"

    const-wide/16 v9, -0x1

    .line 640
    invoke-virtual {v1, v8, v9, v10}, Lbin/mt/json/JSONObject;->getLong(Ljava/lang/String;J)J

    move-result-wide v8

    invoke-static {v3, v8, v9}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;J)V

    const-string v8, "instructionMode"

    .line 641
    invoke-virtual {v1, v8, v7}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v3, v8}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;Ljava/lang/String;)V

    const-string v8, "scanKind"

    .line 642
    invoke-virtual {v1, v8, v7}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ll/ۘۢܽ;->֫(Ljava/lang/String;)V

    invoke-static {v3, v8}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;Ljava/lang/String;)V

    const-string v8, "resolvedInstructionMode"

    .line 643
    invoke-virtual {v1, v8, v7}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v3, v8}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;Ljava/lang/String;)V

    const-string v8, "targetVirtualAddress"

    const-wide/16 v9, -0x1

    .line 644
    invoke-virtual {v1, v8, v9, v10}, Lbin/mt/json/JSONObject;->getLong(Ljava/lang/String;J)J

    move-result-wide v8

    invoke-static {v3, v8, v9}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;J)V

    const-string v8, "arch"

    .line 645
    invoke-virtual {v1, v8, v7}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v3, v7}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;Ljava/lang/String;)V

    const-string v7, "bits"

    const/4 v8, -0x1

    .line 646
    invoke-virtual {v1, v7, v8}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v7

    invoke-static {v3, v7}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;I)V

    const-string v7, "referenceKindMask"

    .line 649
    invoke-virtual {v1, v7, v8}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v7

    .line 648
    invoke-static {v7}, Ll/ۖۖۢ;->ۧ(I)V

    invoke-static {v3, v7}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;I)V

    const-string v7, "maxScanBytes"

    .line 650
    invoke-virtual {v1, v7, v8}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v7

    invoke-static {v3, v7}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;I)V

    const-wide/16 v9, -0x1

    .line 651
    invoke-virtual {v1, v6, v9, v10}, Lbin/mt/json/JSONObject;->getLong(Ljava/lang/String;J)J

    move-result-wide v6

    .line 652
    invoke-virtual {v1, v0, v9, v10}, Lbin/mt/json/JSONObject;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    cmp-long v9, v0, v16

    if-ltz v9, :cond_50

    cmp-long v9, v0, v4

    if-gtz v9, :cond_50

    .line 656
    invoke-static {v3, v6, v7}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;J)V

    .line 657
    invoke-static {v3, v0, v1}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;J)V

    const-string v0, "phaseIndex"

    .line 658
    invoke-virtual {v2, v0, v8}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v3, v0}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;I)V

    const-string v0, "rangeIndex"

    .line 659
    invoke-virtual {v2, v0, v8}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v3, v0}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;I)V

    const-string v0, "byteOffsetInRange"

    const-wide/16 v4, -0x1

    .line 660
    invoke-virtual {v2, v0, v4, v5}, Lbin/mt/json/JSONObject;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    invoke-static {v3, v0, v1}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;J)V

    const-string v0, "relocationIndex"

    .line 661
    invoke-virtual {v2, v0, v8}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v3, v0}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;I)V

    :goto_18
    const/16 v0, 0xb

    .line 150
    invoke-virtual {v3}, Ll/ۤۜܽ;->size()I

    move-result v13

    .line 152
    invoke-virtual {v3}, Ll/ۤۜܽ;->ܽ()[B

    move-result-object v12

    move v8, v11

    move-object/from16 v9, p1

    move-object/from16 v10, p2

    move/from16 v11, p3

    .line 151
    invoke-static/range {v8 .. v13}, Ll/ᩴۨ᩻;->֫(ILjava/lang/String;Ljava/lang/String;I[BI)[B

    move-result-object v1

    const/4 v2, 0x2

    const/4 v4, 0x0

    .line 153
    invoke-virtual {v3, v1, v4, v2}, Ll/ۤۜܽ;->write([BII)V

    .line 154
    invoke-virtual {v3}, Ll/ۤۜܽ;->ܽ()[B

    move-result-object v1

    invoke-virtual {v3}, Ll/ۤۜܽ;->size()I

    move-result v2

    invoke-static {v1, v4, v2, v0}, Landroid/util/Base64;->encodeToString([BIII)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 654
    :cond_50
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid native entry CRC"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 148
    :cond_51
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unsupported cursor type: "

    move-object/from16 v2, p0

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_52
    move-object v2, v0

    .line 1080
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unsupported cursor type: "

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ֫(Ll/۬ۜܽ;I)Ljava/lang/String;
    .locals 13

    const/4 v0, 0x6

    const/4 v1, 0x5

    const/4 v2, 0x4

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eq p1, v6, :cond_6

    if-ne p1, v4, :cond_0

    goto :goto_0

    :cond_0
    if-ne p1, v3, :cond_1

    .line 734
    invoke-static {p0}, Ll/ᩴۨ᩻;->ۢ(Ll/۬ۜܽ;)Ljava/lang/String;

    move-result-object v9

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-string v7, "dex_class"

    const/4 v8, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Ll/۬ܳۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    if-ne p1, v2, :cond_2

    .line 737
    invoke-static {p0}, Ll/ᩴۨ᩻;->ۢ(Ll/۬ۜܽ;)Ljava/lang/String;

    move-result-object v2

    .line 738
    invoke-static {p0}, Ll/ᩴۨ᩻;->ۢ(Ll/۬ۜܽ;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-string v0, "dex_method"

    const/4 v1, 0x0

    .line 737
    invoke-static/range {v0 .. v5}, Ll/۬ܳۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    if-ne p1, v1, :cond_3

    .line 740
    invoke-static {p0}, Ll/ᩴۨ᩻;->ۢ(Ll/۬ۜܽ;)Ljava/lang/String;

    move-result-object v2

    .line 741
    invoke-static {p0}, Ll/ᩴۨ᩻;->ۢ(Ll/۬ۜܽ;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    const-string v0, "dex_field"

    const/4 v1, 0x0

    const/4 v3, 0x0

    .line 740
    invoke-static/range {v0 .. v5}, Ll/۬ܳۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_3
    if-ne p1, v0, :cond_5

    .line 986
    invoke-virtual {p0}, Ll/۬ۜܽ;->available()J

    move-result-wide v0

    const-wide/16 v2, 0x4

    cmp-long p1, v0, v2

    if-ltz p1, :cond_4

    .line 989
    invoke-virtual {p0}, Ll/۬ۜܽ;->readInt()I

    move-result p0

    .line 1010
    sget-object p1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    new-array v0, v6, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const-string p0, "0x%08x"

    invoke-static {p1, p0, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const-string v1, "resource"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 743
    invoke-static/range {v1 .. v6}, Ll/۬ܳۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 1465
    :cond_4
    invoke-static {v5}, Ll/ᩴۨ᩻;->֫(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    .line 987
    throw p0

    .line 1465
    :cond_5
    invoke-static {v5}, Ll/ᩴۨ᩻;->֫(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    .line 746
    throw p0

    :cond_6
    :goto_0
    if-ne p1, v6, :cond_7

    const-string p1, "zip_entry"

    :goto_1
    move-object v0, p1

    goto :goto_2

    :cond_7
    if-ne p1, v4, :cond_8

    const-string p1, "axml"

    goto :goto_1

    :cond_8
    if-ne p1, v3, :cond_9

    const-string p1, "dex_class"

    goto :goto_1

    :cond_9
    if-ne p1, v2, :cond_a

    const-string p1, "dex_method"

    goto :goto_1

    :cond_a
    if-ne p1, v1, :cond_b

    const-string p1, "dex_field"

    goto :goto_1

    :cond_b
    if-ne p1, v0, :cond_c

    const-string p1, "resource"

    goto :goto_1

    .line 731
    :goto_2
    invoke-static {p0}, Ll/ᩴۨ᩻;->ۢ(Ll/۬ۜܽ;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Ll/۬ܳۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 1465
    :cond_c
    invoke-static {v5}, Ll/ᩴۨ᩻;->֫(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    .line 1174
    throw p0
.end method

.method public static ֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ll/ۖۨ᩻;
    .locals 11

    const/4 v0, 0x0

    if-eqz p0, :cond_10

    .line 207
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_1

    :cond_0
    const/16 v1, 0xb

    .line 211
    :try_start_0
    invoke-static {p0, v1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v1

    .line 212
    array-length v2, v1

    const/4 v3, 0x2

    if-le v2, v3, :cond_f

    .line 215
    array-length v2, v1

    sub-int/2addr v2, v3

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v8

    .line 216
    new-instance v2, Ll/۬ۜܽ;

    invoke-direct {v2, v8}, Ll/۬ۜܽ;-><init>([B)V

    .line 217
    invoke-static {v2}, Ll/ᩴۨ᩻;->ۡ(Ll/۬ۜܽ;)I

    move-result v4

    const/4 v5, 0x3

    if-ne v4, v5, :cond_e

    .line 220
    invoke-static {v2}, Ll/ᩴۨ᩻;->ۡ(Ll/۬ۜܽ;)I

    move-result v10

    .line 808
    array-length v9, v8

    move v4, v10

    move-object v5, p2

    move-object v6, p3

    move v7, p1

    invoke-static/range {v4 .. v9}, Ll/ᩴۨ᩻;->֫(ILjava/lang/String;Ljava/lang/String;I[BI)[B

    move-result-object p1

    .line 222
    array-length p2, v1

    sub-int/2addr p2, v3

    aget-byte p2, v1, p2

    const/4 p3, 0x0

    aget-byte p3, p1, p3

    if-ne p2, p3, :cond_d

    array-length p2, v1

    const/4 p3, 0x1

    sub-int/2addr p2, p3

    aget-byte p2, v1, p2

    aget-byte p1, p1, p3

    if-ne p2, p1, :cond_d

    .line 225
    invoke-static {v2}, Ll/ᩴۨ᩻;->ܺ(Ll/۬ۜܽ;)I

    move-result v7

    .line 226
    invoke-static {v2}, Ll/ᩴۨ᩻;->ܺ(Ll/۬ۜܽ;)I

    move-result v8

    if-lt v7, p3, :cond_c

    if-lt v8, p3, :cond_c

    if-gt v7, v8, :cond_c

    const/4 p1, 0x4

    if-ne v10, p1, :cond_1

    .line 232
    invoke-static {v2}, Ll/ᩴۨ᩻;->ܽ(Ll/۬ۜܽ;)Ll/ۖۨ᩻;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/16 p1, 0xc

    if-ne v10, p1, :cond_2

    .line 234
    invoke-static {v2}, Ll/ᩴۨ᩻;->֫(Ll/۬ۜܽ;)Ll/ۖۨ᩻;

    move-result-object p1

    goto :goto_0

    :cond_2
    const/4 p1, 0x6

    if-ne v10, p1, :cond_3

    .line 236
    invoke-static {v2}, Ll/ᩴۨ᩻;->ܳ(Ll/۬ۜܽ;)Ll/ۖۨ᩻;

    move-result-object p1

    goto :goto_0

    :cond_3
    const/16 p1, 0xe

    if-ne v10, p1, :cond_4

    .line 238
    invoke-static {v2}, Ll/ᩴۨ᩻;->᩻(Ll/۬ۜܽ;)Ll/ۖۨ᩻;

    move-result-object p1

    goto :goto_0

    :cond_4
    const/16 p1, 0x8

    if-ne v10, p1, :cond_5

    .line 240
    invoke-static {v2}, Ll/ᩴۨ᩻;->᩷(Ll/۬ۜܽ;)Ll/ۖۨ᩻;

    move-result-object p1

    goto :goto_0

    :cond_5
    const/16 p1, 0x9

    if-ne v10, p1, :cond_6

    .line 242
    invoke-static {v2}, Ll/ᩴۨ᩻;->ۘ(Ll/۬ۜܽ;)Ll/ۖۨ᩻;

    move-result-object p1

    goto :goto_0

    :cond_6
    const/16 p1, 0xa

    if-ne v10, p1, :cond_7

    .line 244
    invoke-static {v2}, Ll/ᩴۨ᩻;->ᩴ(Ll/۬ۜܽ;)Ll/ۖۨ᩻;

    move-result-object p1

    goto :goto_0

    :cond_7
    const/16 p1, 0xd

    if-ne v10, p1, :cond_8

    .line 246
    invoke-static {v2}, Ll/ᩴۨ᩻;->ۜ(Ll/۬ۜܽ;)Ll/ۖۨ᩻;

    move-result-object p1

    goto :goto_0

    :cond_8
    const/16 p1, 0xf

    if-ne v10, p1, :cond_9

    .line 248
    invoke-static {v2}, Ll/ᩴۨ᩻;->ᩳ(Ll/۬ۜܽ;)Ll/ۖۨ᩻;

    move-result-object p1

    goto :goto_0

    :cond_9
    const/16 p1, 0x10

    if-ne v10, p1, :cond_b

    .line 250
    invoke-static {v2}, Ll/ᩴۨ᩻;->ܿ(Ll/۬ۜܽ;)Ll/ۖۨ᩻;

    move-result-object p1

    .line 254
    :goto_0
    invoke-virtual {v2}, Ll/۬ۜܽ;->available()J

    move-result-wide p2

    const-wide/16 v1, 0x0

    cmp-long v3, p2, v1

    if-nez v3, :cond_a

    .line 257
    iget-object p2, p1, Ll/ۖۨ᩻;->ۧ:Lbin/mt/json/JSONObject;

    const-string p3, "recommendedLimit"

    invoke-virtual {p2, p3, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string p3, "limitMax"

    .line 258
    invoke-virtual {p2, p3, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    .line 259
    new-instance p2, Ll/ۖۨ᩻;

    invoke-static {v10}, Ll/ᩴۨ᩻;->֫(I)Ljava/lang/String;

    move-result-object v4

    iget-object v5, p1, Ll/ۖۨ᩻;->ۧ:Lbin/mt/json/JSONObject;

    iget-object v6, p1, Ll/ۖۨ᩻;->ܽ:Lbin/mt/json/JSONObject;

    move-object v3, p2

    invoke-direct/range {v3 .. v8}, Ll/ۖۨ᩻;-><init>(Ljava/lang/String;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;II)V

    return-object p2

    .line 1465
    :cond_a
    invoke-static {v0}, Ll/ᩴۨ᩻;->֫(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 255
    throw p1

    .line 1465
    :cond_b
    invoke-static {v0}, Ll/ᩴۨ᩻;->֫(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 252
    throw p1

    .line 1465
    :cond_c
    invoke-static {v0}, Ll/ᩴۨ᩻;->֫(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 228
    throw p1

    .line 1465
    :cond_d
    invoke-static {v0}, Ll/ᩴۨ᩻;->֫(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 223
    throw p1

    .line 1465
    :cond_e
    invoke-static {v0}, Ll/ᩴۨ᩻;->֫(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 218
    throw p1

    .line 1465
    :cond_f
    invoke-static {v0}, Ll/ᩴۨ᩻;->֫(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 213
    throw p1
    :try_end_0
    .catch Ll/ۗۛ᩻; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 263
    :catch_0
    invoke-static {p0}, Ll/ᩴۨ᩻;->֫(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    .line 261
    :catch_1
    invoke-static {p0}, Ll/ᩴۨ᩻;->֫(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    :cond_10
    :goto_1
    return-object v0
.end method

.method public static ֫(Ll/۬ۜܽ;)Ll/ۖۨ᩻;
    .locals 3

    .line 326
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "prefix"

    invoke-static {p0}, Ll/ᩴۨ᩻;->ۢ(Ll/۬ۜܽ;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 327
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "offset"

    invoke-static {p0}, Ll/ᩴۨ᩻;->ܺ(Ll/۬ۜܽ;)I

    move-result p0

    invoke-virtual {v1, v2, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p0

    .line 328
    new-instance v1, Ll/ۖۨ᩻;

    invoke-direct {v1, v0, p0}, Ll/ۖۨ᩻;-><init>(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)V

    return-object v1
.end method

.method public static ֫(Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 4

    if-nez p0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    .line 1473
    :cond_0
    invoke-static {p0}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    .line 1474
    :goto_0
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "<cursor>"

    const-string v3, "nextCursor"

    invoke-virtual {v1, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "Invalid cursor"

    .line 1472
    invoke-static {v2, v3, p0, v0, v1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(IILbin/mt/json/JSONArray;Ljava/lang/String;)V
    .locals 0

    and-int/2addr p0, p1

    if-eqz p0, :cond_0

    .line 1053
    invoke-virtual {p2, p3}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    :cond_0
    return-void
.end method

.method public static ֫(Ll/ۤۜܽ;I)V
    .locals 1

    if-ltz p1, :cond_1

    :goto_0
    and-int/lit8 v0, p1, -0x80

    if-eqz v0, :cond_0

    and-int/lit8 v0, p1, 0x7f

    or-int/lit16 v0, v0, 0x80

    .line 845
    invoke-virtual {p0, v0}, Ll/ۤۜܽ;->writeByte(I)V

    ushr-int/lit8 p1, p1, 0x7

    goto :goto_0

    .line 848
    :cond_0
    invoke-virtual {p0, p1}, Ll/ۤۜܽ;->writeByte(I)V

    return-void

    .line 842
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Negative varint"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ll/ۤۜܽ;ILjava/lang/String;)V
    .locals 7

    .line 706
    invoke-static {p2}, Ll/۬ܳۜ;->᩻(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x1

    if-eq p1, v0, :cond_7

    const/4 v6, 0x2

    if-ne p1, v6, :cond_0

    goto/16 :goto_0

    :cond_0
    const/4 v0, 0x3

    if-ne p1, v0, :cond_1

    .line 710
    invoke-static {p0, p2}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;Ljava/lang/String;)V

    return-void

    :cond_1
    const/4 v0, 0x4

    if-ne p1, v0, :cond_2

    .line 712
    invoke-static {p2}, Ll/ᩴۨ᩻;->ܽ(Ljava/lang/String;)Ll/ۘۨ᩻;

    move-result-object p1

    .line 713
    iget-object p2, p1, Ll/ۘۨ᩻;->֫:Ljava/lang/String;

    invoke-static {p0, p2}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;Ljava/lang/String;)V

    .line 714
    iget-object p1, p1, Ll/ۘۨ᩻;->ۧ:Ljava/lang/String;

    invoke-static {p0, p1}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;Ljava/lang/String;)V

    return-void

    :cond_2
    const/4 v0, 0x5

    if-ne p1, v0, :cond_3

    .line 716
    invoke-static {p2}, Ll/ᩴۨ᩻;->ܽ(Ljava/lang/String;)Ll/ۘۨ᩻;

    move-result-object p1

    .line 717
    iget-object p2, p1, Ll/ۘۨ᩻;->֫:Ljava/lang/String;

    invoke-static {p0, p2}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;Ljava/lang/String;)V

    .line 718
    iget-object p1, p1, Ll/ۘۨ᩻;->ۧ:Ljava/lang/String;

    invoke-static {p0, p1}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;Ljava/lang/String;)V

    return-void

    :cond_3
    const/4 v0, 0x6

    if-ne p1, v0, :cond_6

    const-string p1, "Invalid resource key"

    if-eqz p2, :cond_5

    .line 996
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0xa

    if-ne v0, v1, :cond_5

    const/4 v4, 0x0

    const/4 v5, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-string v3, "0x"

    move-object v0, p2

    invoke-virtual/range {v0 .. v5}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 999
    invoke-virtual {p2, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p2

    const/16 v0, 0x10

    invoke-static {p2, v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p2, v0, v2

    if-ltz p2, :cond_4

    const-wide v2, 0xffffffffL

    cmp-long p2, v0, v2

    if-gtz p2, :cond_4

    long-to-int p1, v0

    .line 720
    invoke-virtual {p0, p1}, Ll/ۤۜܽ;->writeInt(I)V

    return-void

    .line 1001
    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 997
    :cond_5
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 722
    :cond_6
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Unsupported read target"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 708
    :cond_7
    :goto_0
    invoke-static {p0, p2}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;Ljava/lang/String;)V

    return-void
.end method

.method public static ֫(Ll/ۤۜܽ;J)V
    .locals 6

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_1

    :goto_0
    const-wide/16 v2, -0x80

    and-long/2addr v2, p1

    cmp-long v4, v2, v0

    if-eqz v4, :cond_0

    const-wide/16 v2, 0x7f

    and-long/2addr v2, p1

    const-wide/16 v4, 0x80

    or-long/2addr v2, v4

    long-to-int v3, v2

    .line 879
    invoke-virtual {p0, v3}, Ll/ۤۜܽ;->writeByte(I)V

    const/4 v2, 0x7

    ushr-long/2addr p1, v2

    goto :goto_0

    :cond_0
    long-to-int p2, p1

    .line 882
    invoke-virtual {p0, p2}, Ll/ۤۜܽ;->writeByte(I)V

    return-void

    .line 876
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Negative varlong"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ll/ۤۜܽ;Ljava/lang/String;)V
    .locals 2

    if-eqz p1, :cond_0

    .line 909
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    .line 910
    array-length v0, p1

    invoke-static {p0, v0}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;I)V

    const/4 v0, 0x0

    .line 44
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Ll/ۤۜܽ;->write([BII)V

    return-void

    .line 907
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Missing string"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(ILjava/lang/String;Ljava/lang/String;I[BI)[B
    .locals 3

    .line 817
    :try_start_0
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    .line 818
    invoke-virtual {p2, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p2

    .line 819
    new-instance v0, Ll/ۤۜܽ;

    array-length v1, p1

    add-int/lit8 v1, v1, 0x8

    array-length v2, p2

    add-int/2addr v1, v2

    add-int/2addr v1, p5

    invoke-direct {v0, v1}, Ll/ۤۜܽ;-><init>(I)V

    .line 821
    invoke-virtual {v0, p0}, Ll/ۤۜܽ;->writeByte(I)V

    .line 822
    array-length p0, p1

    invoke-static {v0, p0}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;I)V

    .line 44
    array-length p0, p1

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1, p0}, Ll/ۤۜܽ;->write([BII)V

    .line 824
    array-length p0, p2

    invoke-static {v0, p0}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;I)V

    .line 44
    array-length p0, p2

    invoke-virtual {v0, p2, v1, p0}, Ll/ۤۜܽ;->write([BII)V

    .line 826
    invoke-static {v0, p3}, Ll/ᩴۨ᩻;->֫(Ll/ۤۜܽ;I)V

    .line 827
    invoke-virtual {v0, p4, v1, p5}, Ll/ۤۜܽ;->write([BII)V

    .line 828
    invoke-static {}, Ll/ܳۤۡ;->ܽ()Ljava/security/MessageDigest;

    move-result-object p0

    .line 829
    invoke-virtual {v0}, Ll/ۤۜܽ;->ܽ()[B

    move-result-object p1

    invoke-virtual {v0}, Ll/ۤۜܽ;->size()I

    move-result p2

    invoke-virtual {p0, p1, v1, p2}, Ljava/security/MessageDigest;->update([BII)V

    .line 830
    invoke-virtual {p0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p0

    .line 831
    aget-byte p1, p0, v1

    const/4 p2, 0x1

    aget-byte p0, p0, p2

    const/4 p3, 0x2

    new-array p3, p3, [B

    aput-byte p1, p3, v1

    aput-byte p0, p3, p2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p3

    :catch_0
    move-exception p0

    .line 833
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static ۖ(Ll/۬ۜܽ;)J
    .locals 7

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    const/16 v4, 0x9

    if-ge v2, v4, :cond_1

    .line 892
    invoke-static {p0}, Ll/ᩴۨ᩻;->ۡ(Ll/۬ۜܽ;)I

    move-result v4

    and-int/lit8 v5, v4, 0x7f

    int-to-long v5, v5

    shl-long/2addr v5, v3

    or-long/2addr v0, v5

    and-int/lit16 v4, v4, 0x80

    if-nez v4, :cond_0

    return-wide v0

    :cond_0
    add-int/lit8 v3, v3, 0x7

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    .line 1465
    invoke-static {p0}, Ll/ᩴۨ᩻;->֫(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    .line 899
    throw p0
.end method

.method public static ۘ(Ll/۬ۜܽ;)Ll/ۖۨ᩻;
    .locals 4

    const/4 v0, 0x4

    .line 515
    invoke-static {p0, v0}, Ll/ᩴۨ᩻;->֫(Ll/۬ۜܽ;I)Ljava/lang/String;

    move-result-object v0

    .line 516
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "targetLocator"

    .line 517
    invoke-virtual {v1, v2, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 518
    invoke-static {p0}, Ll/ᩴۨ᩻;->ۡ(Ll/۬ۜܽ;)I

    move-result v1

    invoke-static {v1}, Ll/ᩴۨ᩻;->ۧ(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "methodResolution"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 519
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "classIndex"

    .line 520
    invoke-static {p0}, Ll/ᩴۨ᩻;->ܺ(Ll/۬ۜܽ;)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "memberIndex"

    .line 521
    invoke-static {p0}, Ll/ᩴۨ᩻;->ܺ(Ll/۬ۜܽ;)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "instructionIndex"

    .line 522
    invoke-static {p0}, Ll/ᩴۨ᩻;->ܺ(Ll/۬ۜܽ;)I

    move-result p0

    invoke-virtual {v1, v2, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p0

    .line 523
    new-instance v1, Ll/ۖۨ᩻;

    invoke-direct {v1, v0, p0}, Ll/ۖۨ᩻;-><init>(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)V

    return-object v1
.end method

.method public static ۜ(Ll/۬ۜܽ;)Ll/ۖۨ᩻;
    .locals 8

    const/4 v0, 0x6

    .line 572
    invoke-static {p0, v0}, Ll/ᩴۨ᩻;->֫(Ll/۬ۜܽ;I)Ljava/lang/String;

    move-result-object v0

    .line 573
    invoke-static {p0}, Ll/ᩴۨ᩻;->ܺ(Ll/۬ۜܽ;)I

    move-result v1

    const/4 v2, 0x0

    if-lez v1, :cond_4

    const/4 v3, 0x3

    if-gt v1, v3, :cond_4

    .line 577
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v4

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v1, :cond_3

    .line 579
    invoke-static {p0}, Ll/ᩴۨ᩻;->ۡ(Ll/۬ۜܽ;)I

    move-result v6

    const/4 v7, 0x1

    if-ne v6, v7, :cond_0

    const-string v6, "dex"

    goto :goto_1

    :cond_0
    const/4 v7, 0x2

    if-ne v6, v7, :cond_1

    const-string v6, "axml"

    goto :goto_1

    :cond_1
    if-ne v6, v3, :cond_2

    const-string v6, "resource_table"

    :goto_1
    invoke-virtual {v4, v6}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 1465
    :cond_2
    invoke-static {v2}, Ll/ᩴۨ᩻;->֫(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    .line 1402
    throw p0

    .line 581
    :cond_3
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "targetLocator"

    .line 582
    invoke-virtual {v1, v2, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "scopes"

    .line 583
    invoke-virtual {v0, v1, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 584
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "scopeIndex"

    .line 585
    invoke-static {p0}, Ll/ᩴۨ᩻;->ܺ(Ll/۬ۜܽ;)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "entryIndex"

    .line 586
    invoke-static {p0}, Ll/ᩴۨ᩻;->ܺ(Ll/۬ۜܽ;)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "classIndex"

    .line 587
    invoke-static {p0}, Ll/ᩴۨ᩻;->ܺ(Ll/۬ۜܽ;)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "memberIndex"

    .line 588
    invoke-static {p0}, Ll/ᩴۨ᩻;->ܺ(Ll/۬ۜܽ;)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "instructionIndex"

    .line 589
    invoke-static {p0}, Ll/ᩴۨ᩻;->ܺ(Ll/۬ۜܽ;)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "innerIndex"

    .line 590
    invoke-static {p0}, Ll/ᩴۨ᩻;->ܺ(Ll/۬ۜܽ;)I

    move-result p0

    invoke-virtual {v1, v2, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p0

    .line 591
    new-instance v1, Ll/ۖۨ᩻;

    invoke-direct {v1, v0, p0}, Ll/ۖۨ᩻;-><init>(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)V

    return-object v1

    .line 1465
    :cond_4
    invoke-static {v2}, Ll/ᩴۨ᩻;->֫(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    .line 575
    throw p0
.end method

.method public static ۡ(Ll/۬ۜܽ;)I
    .locals 5

    .line 976
    invoke-virtual {p0}, Ll/۬ۜܽ;->available()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    .line 979
    invoke-virtual {p0}, Ll/۬ۜܽ;->readByte()B

    move-result p0

    and-int/lit16 p0, p0, 0xff

    return p0

    :cond_0
    const/4 p0, 0x0

    .line 1465
    invoke-static {p0}, Ll/ᩴۨ᩻;->֫(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    .line 977
    throw p0
.end method

.method public static ۢ(Ll/۬ۜܽ;)Ljava/lang/String;
    .locals 6

    .line 918
    invoke-static {p0}, Ll/ᩴۨ᩻;->ܺ(Ll/۬ۜܽ;)I

    move-result v0

    .line 919
    invoke-virtual {p0}, Ll/۬ۜܽ;->available()J

    move-result-wide v1

    int-to-long v3, v0

    cmp-long v5, v1, v3

    if-ltz v5, :cond_0

    .line 211
    new-array v1, v0, [B

    .line 212
    invoke-virtual {p0, v0, v1}, Ll/۬ۜܽ;->֫(I[B)V

    .line 923
    new-instance p0, Ljava/lang/String;

    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {p0, v1, v0}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    return-object p0

    :cond_0
    const/4 p0, 0x0

    .line 1465
    invoke-static {p0}, Ll/ᩴۨ᩻;->֫(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    .line 920
    throw p0
.end method

.method public static ۧ(I)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    const-string p0, "exact"

    return-object p0

    :cond_0
    const/4 v0, 0x2

    if-ne p0, v0, :cond_1

    const-string p0, "slot"

    return-object p0

    :cond_1
    const/4 v0, 0x3

    if-ne p0, v0, :cond_2

    const-string p0, "dispatch"

    return-object p0

    :cond_2
    const/4 v0, 0x4

    if-ne p0, v0, :cond_3

    const-string p0, "not_applicable"

    return-object p0

    :cond_3
    const/4 p0, 0x0

    .line 1465
    invoke-static {p0}, Ll/ᩴۨ᩻;->֫(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    .line 1374
    throw p0
.end method

.method public static ۧ(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 271
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    .line 278
    invoke-static {}, Ll/ܳۤۡ;->ܽ()Ljava/security/MessageDigest;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object p0

    invoke-static {p0}, Ll/ܳۤۡ;->ۧ([B)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Ll/۬ۜܽ;)Z
    .locals 1

    .line 963
    invoke-static {p0}, Ll/ᩴۨ᩻;->ۡ(Ll/۬ۜܽ;)I

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    const/4 v0, 0x1

    if-ne p0, v0, :cond_1

    return v0

    :cond_1
    const/4 p0, 0x0

    .line 1465
    invoke-static {p0}, Ll/ᩴۨ᩻;->֫(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    .line 969
    throw p0
.end method

.method public static ܳ(Ll/۬ۜܽ;)Ll/ۖۨ᩻;
    .locals 3

    .line 343
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "locator"

    invoke-static {p0}, Ll/ᩴۨ᩻;->ۢ(Ll/۬ۜܽ;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 344
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "memberOffset"

    invoke-static {p0}, Ll/ᩴۨ᩻;->ܺ(Ll/۬ۜܽ;)I

    move-result p0

    invoke-virtual {v1, v2, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p0

    .line 345
    new-instance v1, Ll/ۖۨ᩻;

    invoke-direct {v1, v0, p0}, Ll/ۖۨ᩻;-><init>(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)V

    return-object v1
.end method

.method public static ܺ(Ll/۬ۜܽ;)I
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    const/4 v3, 0x5

    const/4 v4, 0x0

    if-ge v0, v3, :cond_3

    .line 858
    invoke-static {p0}, Ll/ᩴۨ᩻;->ۡ(Ll/۬ۜܽ;)I

    move-result v3

    const/4 v5, 0x4

    if-ne v0, v5, :cond_1

    and-int/lit16 v5, v3, 0xf8

    if-nez v5, :cond_0

    goto :goto_1

    .line 1465
    :cond_0
    invoke-static {v4}, Ll/ᩴۨ᩻;->֫(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    .line 860
    throw p0

    :cond_1
    :goto_1
    and-int/lit8 v4, v3, 0x7f

    shl-int/2addr v4, v2

    or-int/2addr v1, v4

    and-int/lit16 v3, v3, 0x80

    if-nez v3, :cond_2

    return v1

    :cond_2
    add-int/lit8 v2, v2, 0x7

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1465
    :cond_3
    invoke-static {v4}, Ll/ᩴۨ᩻;->֫(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    .line 868
    throw p0
.end method

.method public static ܽ(Ll/۬ۜܽ;)Ll/ۖۨ᩻;
    .locals 4

    .line 305
    invoke-static {p0}, Ll/ᩴۨ᩻;->ۡ(Ll/۬ۜܽ;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const-string v0, "zip_entries"

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    const-string v0, "dex_classes"

    goto :goto_0

    :cond_1
    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    const-string v0, "resource_table"

    .line 307
    :goto_0
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "view"

    invoke-virtual {v1, v2, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 308
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "prefix"

    .line 309
    invoke-static {p0}, Ll/ᩴۨ᩻;->ۢ(Ll/۬ۜܽ;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    const-string v2, "offset"

    .line 310
    invoke-static {p0}, Ll/ᩴۨ᩻;->ܺ(Ll/۬ۜܽ;)I

    move-result p0

    invoke-virtual {v1, v2, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    .line 311
    new-instance p0, Ll/ۖۨ᩻;

    invoke-direct {p0, v0, v1}, Ll/ۖۨ᩻;-><init>(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)V

    return-object p0

    :cond_2
    const/4 p0, 0x0

    .line 1465
    invoke-static {p0}, Ll/ᩴۨ᩻;->֫(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    .line 1134
    throw p0
.end method

.method public static ܽ(Ljava/lang/String;)Ll/ۘۨ᩻;
    .locals 3

    if-eqz p0, :cond_1

    const-string v0, "->"

    .line 756
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    if-lez v1, :cond_0

    .line 757
    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v0

    if-ne v1, v0, :cond_0

    .line 760
    new-instance v0, Ll/ۘۨ᩻;

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    add-int/lit8 v1, v1, 0x2

    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v2, p0}, Ll/ۘۨ᩻;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    .line 758
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid smali target"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 754
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Missing smali target"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ܿ(Ll/۬ۜܽ;)Ll/ۖۨ᩻;
    .locals 11

    .line 668
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "locator"

    .line 669
    invoke-static {p0}, Ll/ᩴۨ᩻;->ۢ(Ll/۬ۜܽ;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "addressKind"

    .line 670
    invoke-static {p0}, Ll/ᩴۨ᩻;->ۢ(Ll/۬ۜܽ;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "address"

    .line 671
    invoke-static {p0}, Ll/ᩴۨ᩻;->ۖ(Ll/۬ۜܽ;)J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "instructionMode"

    .line 672
    invoke-static {p0}, Ll/ᩴۨ᩻;->ۢ(Ll/۬ۜܽ;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 673
    invoke-static {p0}, Ll/ᩴۨ᩻;->ۢ(Ll/۬ۜܽ;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/ۘۢܽ;->֫(Ljava/lang/String;)V

    const-string v2, "scanKind"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "resolvedInstructionMode"

    .line 674
    invoke-static {p0}, Ll/ᩴۨ᩻;->ۢ(Ll/۬ۜܽ;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "targetVirtualAddress"

    .line 675
    invoke-static {p0}, Ll/ᩴۨ᩻;->ۖ(Ll/۬ۜܽ;)J

    move-result-wide v3

    invoke-virtual {v0, v1, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "arch"

    .line 676
    invoke-static {p0}, Ll/ᩴۨ᩻;->ۢ(Ll/۬ۜܽ;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "bits"

    .line 677
    invoke-static {p0}, Ll/ᩴۨ᩻;->ܺ(Ll/۬ۜܽ;)I

    move-result v3

    invoke-virtual {v0, v1, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 679
    invoke-static {p0}, Ll/ᩴۨ᩻;->ܺ(Ll/۬ۜܽ;)I

    move-result v1

    .line 678
    invoke-static {v1}, Ll/ۖۖۢ;->ۧ(I)V

    const-string v3, "referenceKindMask"

    invoke-virtual {v0, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "maxScanBytes"

    .line 680
    invoke-static {p0}, Ll/ᩴۨ᩻;->ܺ(Ll/۬ۜܽ;)I

    move-result v4

    invoke-virtual {v0, v1, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 681
    invoke-static {p0}, Ll/ᩴۨ᩻;->ۖ(Ll/۬ۜܽ;)J

    move-result-wide v4

    .line 682
    invoke-static {p0}, Ll/ᩴۨ᩻;->ۖ(Ll/۬ۜܽ;)J

    move-result-wide v6

    const-wide v8, 0xffffffffL

    const/4 v1, 0x0

    cmp-long v10, v6, v8

    if-gtz v10, :cond_0

    :try_start_0
    const-string v8, ""

    .line 688
    invoke-virtual {v0, v2, v8}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v8, -0x1

    invoke-virtual {v0, v3, v8}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v3

    .line 687
    invoke-static {v3, v2}, Ll/ۘۢܽ;->֫(ILjava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v1, "entrySize"

    .line 692
    invoke-virtual {v0, v1, v4, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "entryCrc"

    .line 693
    invoke-virtual {v1, v2, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    .line 694
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "phaseIndex"

    .line 695
    invoke-static {p0}, Ll/ᩴۨ᩻;->ܺ(Ll/۬ۜܽ;)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "rangeIndex"

    .line 696
    invoke-static {p0}, Ll/ᩴۨ᩻;->ܺ(Ll/۬ۜܽ;)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "byteOffsetInRange"

    .line 697
    invoke-static {p0}, Ll/ᩴۨ᩻;->ۖ(Ll/۬ۜܽ;)J

    move-result-wide v3

    invoke-virtual {v1, v2, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "relocationIndex"

    .line 698
    invoke-static {p0}, Ll/ᩴۨ᩻;->ܺ(Ll/۬ۜܽ;)I

    move-result p0

    invoke-virtual {v1, v2, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p0

    .line 699
    new-instance v1, Ll/ۖۨ᩻;

    invoke-direct {v1, v0, p0}, Ll/ۖۨ᩻;-><init>(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)V

    return-object v1

    .line 1465
    :catch_0
    invoke-static {v1}, Ll/ᩴۨ᩻;->֫(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    .line 690
    throw p0

    .line 1465
    :cond_0
    invoke-static {v1}, Ll/ᩴۨ᩻;->֫(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    .line 684
    throw p0
.end method

.method public static ᩳ(Ljava/lang/String;)I
    .locals 2

    const-string v0, "zip_entry"

    .line 1141
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const-string v0, "axml"

    .line 1143
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p0, 0x2

    return p0

    :cond_1
    const-string v0, "dex_class"

    .line 1145
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 p0, 0x3

    return p0

    :cond_2
    const-string v0, "dex_method"

    .line 1147
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 p0, 0x4

    return p0

    :cond_3
    const-string v0, "dex_field"

    .line 1149
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 p0, 0x5

    return p0

    :cond_4
    const-string v0, "resource"

    .line 1151
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const/4 p0, 0x6

    return p0

    .line 1154
    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unsupported target kind: "

    .line 0
    invoke-static {v1, p0}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 1154
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ᩳ(Ll/۬ۜܽ;)Ll/ۖۨ᩻;
    .locals 9

    .line 616
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "locator"

    .line 617
    invoke-static {p0}, Ll/ᩴۨ᩻;->ۢ(Ll/۬ۜܽ;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 618
    invoke-static {p0}, Ll/ᩴۨ᩻;->ۡ(Ll/۬ۜܽ;)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-lt v1, v3, :cond_1

    const/16 v4, 0x9

    if-gt v1, v4, :cond_1

    sub-int/2addr v1, v3

    .line 1424
    sget-object v3, Ll/ܶܺۢ;->֫:[Ljava/lang/String;

    aget-object v1, v3, v1

    const-string v3, "itemKind"

    .line 618
    invoke-virtual {v0, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "namePrefix"

    .line 619
    invoke-static {p0}, Ll/ᩴۨ᩻;->ۢ(Ll/۬ۜܽ;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "demangle"

    .line 620
    invoke-static {p0}, Ll/ᩴۨ᩻;->ۧ(Ll/۬ۜܽ;)Z

    move-result v3

    invoke-virtual {v0, v1, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 621
    invoke-static {p0}, Ll/ᩴۨ᩻;->ۖ(Ll/۬ۜܽ;)J

    move-result-wide v3

    .line 622
    invoke-static {p0}, Ll/ᩴۨ᩻;->ۖ(Ll/۬ۜܽ;)J

    move-result-wide v5

    const-wide v7, 0xffffffffL

    cmp-long v1, v5, v7

    if-gtz v1, :cond_0

    .line 626
    invoke-static {p0}, Ll/ᩴۨ᩻;->ܺ(Ll/۬ۜܽ;)I

    move-result v1

    const-string v2, "entrySize"

    .line 627
    invoke-virtual {v0, v2, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "entryCrc"

    .line 628
    invoke-virtual {v2, v3, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "totalCount"

    .line 629
    invoke-virtual {v2, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    .line 630
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "offset"

    invoke-static {p0}, Ll/ᩴۨ᩻;->ܺ(Ll/۬ۜܽ;)I

    move-result p0

    invoke-virtual {v1, v2, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p0

    .line 631
    new-instance v1, Ll/ۖۨ᩻;

    invoke-direct {v1, v0, p0}, Ll/ۖۨ᩻;-><init>(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)V

    return-object v1

    .line 1465
    :cond_0
    invoke-static {v2}, Ll/ᩴۨ᩻;->֫(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    .line 624
    throw p0

    .line 1465
    :cond_1
    invoke-static {v2}, Ll/ᩴۨ᩻;->֫(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    .line 1422
    throw p0
.end method

.method public static ᩴ(Ll/۬ۜܽ;)Ll/ۖۨ᩻;
    .locals 4

    .line 530
    invoke-static {p0}, Ll/ᩴۨ᩻;->ۡ(Ll/۬ۜܽ;)I

    move-result v0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    .line 1465
    invoke-static {p0}, Ll/ᩴۨ᩻;->֫(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    .line 532
    throw p0

    .line 534
    :cond_1
    :goto_0
    invoke-static {p0, v0}, Ll/ᩴۨ᩻;->֫(Ll/۬ۜܽ;I)Ljava/lang/String;

    move-result-object v0

    .line 535
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "targetLocator"

    .line 536
    invoke-virtual {v1, v2, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 537
    invoke-static {p0}, Ll/ᩴۨ᩻;->ۡ(Ll/۬ۜܽ;)I

    move-result v1

    invoke-static {v1}, Ll/ᩴۨ᩻;->ۧ(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "methodResolution"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 538
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "classIndex"

    .line 539
    invoke-static {p0}, Ll/ᩴۨ᩻;->ܺ(Ll/۬ۜܽ;)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "memberIndex"

    .line 540
    invoke-static {p0}, Ll/ᩴۨ᩻;->ܺ(Ll/۬ۜܽ;)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "instructionIndex"

    .line 541
    invoke-static {p0}, Ll/ᩴۨ᩻;->ܺ(Ll/۬ۜܽ;)I

    move-result p0

    invoke-virtual {v1, v2, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p0

    .line 542
    new-instance v1, Ll/ۖۨ᩻;

    invoke-direct {v1, v0, p0}, Ll/ۖۨ᩻;-><init>(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)V

    return-object v1
.end method

.method public static ᩷(Ll/۬ۜܽ;)Ll/ۖۨ᩻;
    .locals 15

    .line 459
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "query"

    .line 460
    invoke-static {p0}, Ll/ᩴۨ᩻;->ۢ(Ll/۬ۜܽ;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 461
    invoke-static {p0}, Ll/ᩴۨ᩻;->ۡ(Ll/۬ۜܽ;)I

    move-result v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ne v1, v4, :cond_0

    const-string v1, "literal"

    goto :goto_0

    :cond_0
    if-ne v1, v2, :cond_1d

    const-string v1, "regex"

    :goto_0
    const-string v5, "queryType"

    invoke-virtual {v0, v5, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "caseSensitive"

    .line 462
    invoke-static {p0}, Ll/ᩴۨ᩻;->ۧ(Ll/۬ۜܽ;)Z

    move-result v5

    invoke-virtual {v0, v1, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 463
    invoke-static {p0}, Ll/ᩴۨ᩻;->ۡ(Ll/۬ۜܽ;)I

    move-result v1

    if-ne v1, v4, :cond_1

    const-string v1, "contains"

    goto :goto_1

    :cond_1
    if-ne v1, v2, :cond_1c

    const-string v1, "exact"

    :goto_1
    const-string v5, "matchMode"

    invoke-virtual {v0, v5, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 464
    invoke-static {p0}, Ll/ᩴۨ᩻;->ܺ(Ll/۬ۜܽ;)I

    move-result v1

    and-int/lit16 v5, v1, -0x2000

    if-nez v5, :cond_1b

    if-eqz v1, :cond_1b

    .line 1031
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v5

    const-string v6, "zip_entries"

    .line 1032
    invoke-static {v1, v4, v5, v6}, Ll/ᩴۨ᩻;->֫(IILbin/mt/json/JSONArray;Ljava/lang/String;)V

    const-string v6, "axml"

    .line 1033
    invoke-static {v1, v2, v5, v6}, Ll/ᩴۨ᩻;->֫(IILbin/mt/json/JSONArray;Ljava/lang/String;)V

    const-string v6, "resource_table_id"

    const/4 v7, 0x4

    .line 1034
    invoke-static {v1, v7, v5, v6}, Ll/ᩴۨ᩻;->֫(IILbin/mt/json/JSONArray;Ljava/lang/String;)V

    const-string v6, "resource_table_name"

    const/16 v8, 0x8

    .line 1035
    invoke-static {v1, v8, v5, v6}, Ll/ᩴۨ᩻;->֫(IILbin/mt/json/JSONArray;Ljava/lang/String;)V

    const/16 v6, 0x10

    const-string v9, "resource_table_value"

    .line 1036
    invoke-static {v1, v6, v5, v9}, Ll/ᩴۨ᩻;->֫(IILbin/mt/json/JSONArray;Ljava/lang/String;)V

    const/16 v6, 0x400

    const-string v9, "resource_table_file_path"

    .line 1037
    invoke-static {v1, v6, v5, v9}, Ll/ᩴۨ᩻;->֫(IILbin/mt/json/JSONArray;Ljava/lang/String;)V

    const/16 v6, 0x20

    const-string v9, "dex_class"

    .line 1038
    invoke-static {v1, v6, v5, v9}, Ll/ᩴۨ᩻;->֫(IILbin/mt/json/JSONArray;Ljava/lang/String;)V

    const/16 v6, 0x40

    const-string v9, "dex_field"

    .line 1039
    invoke-static {v1, v6, v5, v9}, Ll/ᩴۨ᩻;->֫(IILbin/mt/json/JSONArray;Ljava/lang/String;)V

    const/16 v6, 0x80

    const-string v9, "dex_method"

    .line 1040
    invoke-static {v1, v6, v5, v9}, Ll/ᩴۨ᩻;->֫(IILbin/mt/json/JSONArray;Ljava/lang/String;)V

    const/16 v6, 0x100

    const-string v9, "dex_string"

    .line 1041
    invoke-static {v1, v6, v5, v9}, Ll/ᩴۨ᩻;->֫(IILbin/mt/json/JSONArray;Ljava/lang/String;)V

    const/16 v6, 0x200

    const-string v9, "smali"

    .line 1042
    invoke-static {v1, v6, v5, v9}, Ll/ᩴۨ᩻;->֫(IILbin/mt/json/JSONArray;Ljava/lang/String;)V

    const/16 v6, 0x800

    const-string v10, "native_symbol"

    .line 1043
    invoke-static {v1, v6, v5, v10}, Ll/ᩴۨ᩻;->֫(IILbin/mt/json/JSONArray;Ljava/lang/String;)V

    const/16 v6, 0x1000

    const-string v10, "native_string"

    .line 1044
    invoke-static {v1, v6, v5, v10}, Ll/ᩴۨ᩻;->֫(IILbin/mt/json/JSONArray;Ljava/lang/String;)V

    const-string v1, "scopes"

    .line 464
    invoke-virtual {v0, v1, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "includeSnippet"

    .line 465
    invoke-static {p0}, Ll/ᩴۨ᩻;->ۧ(Ll/۬ۜܽ;)Z

    move-result v5

    invoke-virtual {v0, v1, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "snippetMaxChars"

    .line 466
    invoke-static {p0}, Ll/ᩴۨ᩻;->ܺ(Ll/۬ۜܽ;)I

    move-result v5

    invoke-virtual {v0, v1, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "explicitScopes"

    .line 467
    invoke-static {p0}, Ll/ᩴۨ᩻;->ۧ(Ll/۬ۜܽ;)Z

    move-result v5

    invoke-virtual {v0, v1, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "includeMatchOffsets"

    .line 468
    invoke-static {p0}, Ll/ᩴۨ᩻;->ۧ(Ll/۬ۜܽ;)Z

    move-result v5

    invoke-virtual {v0, v1, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 943
    invoke-static {p0}, Ll/ᩴۨ᩻;->ۡ(Ll/۬ۜܽ;)I

    move-result v1

    if-nez v1, :cond_2

    move-object v1, v3

    goto :goto_2

    :cond_2
    if-ne v1, v4, :cond_1a

    .line 947
    invoke-static {p0}, Ll/ᩴۨ᩻;->ۢ(Ll/۬ۜܽ;)Ljava/lang/String;

    move-result-object v1

    :goto_2
    const-string v5, "zipEntryPrefix"

    .line 469
    invoke-virtual {v0, v5, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 943
    invoke-static {p0}, Ll/ᩴۨ᩻;->ۡ(Ll/۬ۜܽ;)I

    move-result v1

    if-nez v1, :cond_3

    move-object v1, v3

    goto :goto_3

    :cond_3
    if-ne v1, v4, :cond_19

    .line 947
    invoke-static {p0}, Ll/ᩴۨ᩻;->ۢ(Ll/۬ۜܽ;)Ljava/lang/String;

    move-result-object v1

    :goto_3
    const-string v5, "resourcePrefix"

    .line 470
    invoke-virtual {v0, v5, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 471
    invoke-static {p0}, Ll/ᩴۨ᩻;->ۡ(Ll/۬ۜܽ;)I

    move-result v1

    if-nez v1, :cond_4

    const-string v5, "none"

    goto :goto_4

    :cond_4
    if-ne v1, v4, :cond_5

    const-string v5, "prefix"

    goto :goto_4

    :cond_5
    if-ne v1, v2, :cond_18

    const-string v5, "descriptorExact"

    :goto_4
    const-string v6, "classPrefixMode"

    .line 472
    invoke-virtual {v0, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    if-nez v1, :cond_6

    move-object v1, v3

    goto :goto_5

    .line 473
    :cond_6
    invoke-static {p0}, Ll/ᩴۨ᩻;->ۢ(Ll/۬ۜܽ;)Ljava/lang/String;

    move-result-object v1

    :goto_5
    const-string v5, "classPrefix"

    invoke-virtual {v0, v5, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    .line 474
    invoke-static {p0}, Ll/ᩴۨ᩻;->ۡ(Ll/۬ۜܽ;)I

    move-result v1

    if-ne v1, v4, :cond_7

    const-string v1, "class"

    goto :goto_6

    :cond_7
    if-ne v1, v2, :cond_17

    const-string v1, "member"

    :goto_6
    const-string v5, "dexStringResultMode"

    invoke-virtual {v0, v5, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    .line 475
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v5, "scopeIndex"

    .line 476
    invoke-static {p0}, Ll/ᩴۨ᩻;->ܺ(Ll/۬ۜܽ;)I

    move-result v6

    invoke-virtual {v1, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v5, "entryIndex"

    .line 477
    invoke-static {p0}, Ll/ᩴۨ᩻;->ܺ(Ll/۬ۜܽ;)I

    move-result v6

    invoke-virtual {v1, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v5, "classIndex"

    .line 478
    invoke-static {p0}, Ll/ᩴۨ᩻;->ܺ(Ll/۬ۜܽ;)I

    move-result v6

    invoke-virtual {v1, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 479
    invoke-static {p0}, Ll/ᩴۨ᩻;->ܺ(Ll/۬ۜܽ;)I

    move-result v5

    sub-int/2addr v5, v4

    const-string v6, "memberIndex"

    invoke-virtual {v1, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v5, "classCharOffset"

    .line 480
    invoke-static {p0}, Ll/ᩴۨ᩻;->ܺ(Ll/۬ۜܽ;)I

    move-result v6

    invoke-virtual {v1, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 481
    invoke-virtual {p0}, Ll/۬ۜܽ;->available()J

    move-result-wide v5

    const-string v10, "native_strings"

    const-string v11, "target"

    const-wide/16 v12, 0x0

    cmp-long v14, v5, v12

    if-lez v14, :cond_13

    .line 482
    invoke-static {p0}, Ll/ᩴۨ᩻;->ۡ(Ll/۬ۜܽ;)I

    move-result v5

    if-ne v5, v4, :cond_8

    const-string v9, "overview"

    goto :goto_7

    :cond_8
    if-ne v5, v2, :cond_9

    const-string v9, "files"

    goto :goto_7

    :cond_9
    const/4 v2, 0x3

    if-ne v5, v2, :cond_a

    const-string v9, "resource_table_names"

    goto :goto_7

    :cond_a
    if-ne v5, v7, :cond_b

    const-string v9, "resource_table_values"

    goto :goto_7

    :cond_b
    const/4 v2, 0x5

    if-ne v5, v2, :cond_c

    const-string v9, "resource_table_file_paths"

    goto :goto_7

    :cond_c
    const/4 v2, 0x6

    if-ne v5, v2, :cond_d

    const-string v9, "dex_names"

    goto :goto_7

    :cond_d
    const/4 v2, 0x7

    if-ne v5, v2, :cond_e

    const-string v9, "dex_strings"

    goto :goto_7

    :cond_e
    if-ne v5, v8, :cond_f

    const-string v9, "dex_string_members"

    goto :goto_7

    :cond_f
    const/16 v2, 0x9

    if-ne v5, v2, :cond_10

    goto :goto_7

    :cond_10
    const/16 v2, 0xa

    if-ne v5, v2, :cond_11

    const-string v9, "native_symbols"

    goto :goto_7

    :cond_11
    const/16 v2, 0xb

    if-ne v5, v2, :cond_12

    move-object v9, v10

    :goto_7
    invoke-virtual {v0, v11, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    goto :goto_8

    .line 1465
    :cond_12
    invoke-static {v3}, Ll/ᩴۨ᩻;->֫(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    .line 1342
    throw p0

    .line 484
    :cond_13
    :goto_8
    invoke-virtual {p0}, Ll/۬ۜܽ;->available()J

    move-result-wide v4

    cmp-long v2, v4, v12

    if-lez v2, :cond_16

    .line 485
    invoke-virtual {v0, v11, v3}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v10, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_15

    const-string v2, "nativeStringTotalCount"

    .line 488
    invoke-static {p0}, Ll/ᩴۨ᩻;->ܺ(Ll/۬ۜܽ;)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 489
    invoke-static {p0}, Ll/ᩴۨ᩻;->ۧ(Ll/۬ۜܽ;)Z

    move-result v3

    if-eqz v3, :cond_14

    invoke-static {p0}, Ll/ᩴۨ᩻;->ۖ(Ll/۬ۜܽ;)J

    move-result-wide v3

    goto :goto_9

    :cond_14
    const-wide/16 v3, -0x1

    :goto_9
    const-string p0, "nativeStringScanOffset"

    invoke-virtual {v2, p0, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    goto :goto_a

    .line 1465
    :cond_15
    invoke-static {v3}, Ll/ᩴۨ᩻;->֫(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    .line 486
    throw p0

    .line 491
    :cond_16
    :goto_a
    new-instance p0, Ll/ۖۨ᩻;

    invoke-direct {p0, v0, v1}, Ll/ۖۨ᩻;-><init>(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)V

    return-object p0

    .line 1465
    :cond_17
    invoke-static {v3}, Ll/ᩴۨ᩻;->֫(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    .line 1282
    throw p0

    .line 1465
    :cond_18
    invoke-static {v3}, Ll/ᩴۨ᩻;->֫(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    .line 1258
    throw p0

    .line 1465
    :cond_19
    invoke-static {v3}, Ll/ᩴۨ᩻;->֫(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    .line 949
    throw p0

    .line 1465
    :cond_1a
    invoke-static {v3}, Ll/ᩴۨ᩻;->֫(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    .line 949
    throw p0

    .line 1465
    :cond_1b
    invoke-static {v3}, Ll/ᩴۨ᩻;->֫(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    .line 1029
    throw p0

    .line 1465
    :cond_1c
    invoke-static {v3}, Ll/ᩴۨ᩻;->֫(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    .line 1230
    throw p0

    .line 1465
    :cond_1d
    invoke-static {v3}, Ll/ᩴۨ᩻;->֫(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    .line 1206
    throw p0
.end method

.method public static ᩻(Ll/۬ۜܽ;)Ll/ۖۨ᩻;
    .locals 7

    .line 382
    invoke-static {p0}, Ll/ᩴۨ᩻;->ۡ(Ll/۬ۜܽ;)I

    move-result v0

    .line 383
    invoke-static {p0, v0}, Ll/ᩴۨ᩻;->֫(Ll/۬ۜܽ;I)Ljava/lang/String;

    move-result-object v1

    .line 384
    invoke-static {p0}, Ll/ᩴۨ᩻;->ۡ(Ll/۬ۜܽ;)I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-ne v2, v5, :cond_0

    const-string v6, "text"

    goto :goto_0

    :cond_0
    if-ne v2, v4, :cond_5

    const-string v6, "hex"

    :goto_0
    if-ne v2, v4, :cond_2

    if-ne v0, v5, :cond_1

    goto :goto_1

    .line 1465
    :cond_1
    invoke-static {v3}, Ll/ᩴۨ᩻;->֫(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    .line 387
    throw p0

    :cond_2
    :goto_1
    const-string v3, "target"

    const-string v5, "format"

    .line 0
    invoke-static {v3, v1, v5, v6}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 392
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    if-ne v2, v4, :cond_3

    const-string v0, "hexOffset"

    .line 394
    invoke-static {p0}, Ll/ᩴۨ᩻;->ܺ(Ll/۬ۜܽ;)I

    move-result p0

    invoke-virtual {v3, v0, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    goto :goto_2

    :cond_3
    const/4 v2, 0x6

    if-ne v0, v2, :cond_4

    const-string v0, "variant"

    .line 396
    invoke-static {p0}, Ll/ᩴۨ᩻;->ۢ(Ll/۬ۜܽ;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "maxValueChars"

    .line 397
    invoke-static {p0}, Ll/ᩴۨ᩻;->ܺ(Ll/۬ۜܽ;)I

    move-result v4

    invoke-virtual {v0, v2, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "maxValueXmlChars"

    .line 398
    invoke-static {p0}, Ll/ᩴۨ᩻;->ܺ(Ll/۬ۜܽ;)I

    move-result v4

    invoke-virtual {v0, v2, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "maxItemsPerValue"

    .line 399
    invoke-static {p0}, Ll/ᩴۨ᩻;->ܺ(Ll/۬ۜܽ;)I

    move-result v4

    invoke-virtual {v0, v2, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "resolveDepth"

    .line 400
    invoke-static {p0}, Ll/ᩴۨ᩻;->ܺ(Ll/۬ۜܽ;)I

    move-result v4

    invoke-virtual {v0, v2, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    const-string v0, "valueOffset"

    .line 401
    invoke-static {p0}, Ll/ᩴۨ᩻;->ܺ(Ll/۬ۜܽ;)I

    move-result p0

    invoke-virtual {v3, v0, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    goto :goto_2

    :cond_4
    const-string v0, "maxChars"

    .line 403
    invoke-static {p0}, Ll/ᩴۨ᩻;->ܺ(Ll/۬ۜܽ;)I

    move-result v2

    invoke-virtual {v1, v0, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    const-string v0, "lineOffset"

    .line 404
    invoke-static {p0}, Ll/ᩴۨ᩻;->ܺ(Ll/۬ۜܽ;)I

    move-result v2

    invoke-virtual {v3, v0, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "lineCharOffset"

    .line 405
    invoke-static {p0}, Ll/ᩴۨ᩻;->ܺ(Ll/۬ۜܽ;)I

    move-result p0

    invoke-virtual {v0, v2, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    .line 407
    :goto_2
    new-instance p0, Ll/ۖۨ᩻;

    invoke-direct {p0, v1, v3}, Ll/ۖۨ᩻;-><init>(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)V

    return-object p0

    .line 1465
    :cond_5
    invoke-static {v3}, Ll/ᩴۨ᩻;->֫(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    .line 800
    throw p0
.end method
