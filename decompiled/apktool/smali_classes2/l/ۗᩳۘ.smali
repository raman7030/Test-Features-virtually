.class public final Ll/ۗᩳۘ;
.super Ljava/lang/Object;
.source "S4VX"


# direct methods
.method public static ֫(Ljava/lang/String;Ll/ۗۛ᩻;)Lbin/mt/json/JSONObject;
    .locals 7

    .line 22
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 23
    invoke-static {p0}, Ll/ۗᩳۘ;->֫(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1a

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 24
    iget-object v2, p1, Ll/ۗۛ᩻;->᩶:Lbin/mt/json/JSONObject;

    invoke-virtual {v2, v1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v2

    .line 25
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, -0x1

    sparse-switch v3, :sswitch_data_0

    goto/16 :goto_1

    :sswitch_0
    const-string v3, "createdDirectories"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    goto/16 :goto_1

    :cond_0
    const/16 v6, 0x13

    goto/16 :goto_1

    :sswitch_1
    const-string v3, "conflictingPatchIndex"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    goto/16 :goto_1

    :cond_1
    const/16 v6, 0x12

    goto/16 :goto_1

    :sswitch_2
    const-string v3, "finalColumn"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    goto/16 :goto_1

    :cond_2
    const/16 v6, 0x11

    goto/16 :goto_1

    :sswitch_3
    const-string v3, "actualReplacements"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    goto/16 :goto_1

    :cond_3
    const/16 v6, 0x10

    goto/16 :goto_1

    :sswitch_4
    const-string v3, "conflictingEditIndex"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    goto/16 :goto_1

    :cond_4
    const/16 v6, 0xf

    goto/16 :goto_1

    :sswitch_5
    const-string v3, "changed"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    goto/16 :goto_1

    :cond_5
    const/16 v6, 0xe

    goto/16 :goto_1

    :sswitch_6
    const-string v3, "failedPatchIndex"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    goto/16 :goto_1

    :cond_6
    const/16 v6, 0xd

    goto/16 :goto_1

    :sswitch_7
    const-string v3, "endByteOffset"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_7

    goto/16 :goto_1

    :cond_7
    const/16 v6, 0xc

    goto/16 :goto_1

    :sswitch_8
    const-string v3, "warnings"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_8

    goto/16 :goto_1

    :cond_8
    const/16 v6, 0xb

    goto/16 :goto_1

    :sswitch_9
    const-string v3, "byteOffset"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_9

    goto/16 :goto_1

    :cond_9
    const/16 v6, 0xa

    goto/16 :goto_1

    :sswitch_a
    const-string v3, "finalLine"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_a

    goto/16 :goto_1

    :cond_a
    const/16 v6, 0x9

    goto/16 :goto_1

    :sswitch_b
    const-string v3, "limit"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_b

    goto/16 :goto_1

    :cond_b
    const/16 v6, 0x8

    goto/16 :goto_1

    :sswitch_c
    const-string v3, "expectedReplacements"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_c

    goto :goto_1

    :cond_c
    const/4 v6, 0x7

    goto :goto_1

    :sswitch_d
    const-string v3, "stateKnown"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_d

    goto :goto_1

    :cond_d
    const/4 v6, 0x6

    goto :goto_1

    :sswitch_e
    const-string v3, "deletedFiles"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_e

    goto :goto_1

    :cond_e
    const/4 v6, 0x5

    goto :goto_1

    :sswitch_f
    const-string v3, "totalBytes"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_f

    goto :goto_1

    :cond_f
    const/4 v6, 0x4

    goto :goto_1

    :sswitch_10
    const-string v3, "deletedDirectories"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_10

    goto :goto_1

    :cond_10
    const/4 v6, 0x3

    goto :goto_1

    :sswitch_11
    const-string v3, "actual"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_11

    goto :goto_1

    :cond_11
    const/4 v6, 0x2

    goto :goto_1

    :sswitch_12
    const-string v3, "failedEditIndex"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_12

    goto :goto_1

    :cond_12
    const/4 v6, 0x1

    goto :goto_1

    :sswitch_13
    const-string v3, "safeToRetry"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_13

    goto :goto_1

    :cond_13
    const/4 v6, 0x0

    :goto_1
    packed-switch v6, :pswitch_data_0

    .line 33
    invoke-static {v2}, Ll/֨ۙ᩵;->֫(Lbin/mt/json/JSONValue;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    goto/16 :goto_0

    .line 166
    :pswitch_0
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v3

    if-eqz v2, :cond_16

    .line 167
    invoke-virtual {v2}, Lbin/mt/json/JSONValue;->isArray()Z

    move-result v4

    if-nez v4, :cond_14

    goto :goto_3

    .line 170
    :cond_14
    invoke-virtual {v2}, Lbin/mt/json/JSONValue;->asArray()Lbin/mt/json/JSONArray;

    move-result-object v2

    invoke-virtual {v2}, Lbin/mt/json/JSONArray;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_15
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_16

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lbin/mt/json/JSONValue;

    .line 171
    invoke-virtual {v4}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v5

    if-eqz v5, :cond_15

    .line 172
    invoke-virtual {v4}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    goto :goto_2

    .line 28
    :cond_16
    :goto_3
    invoke-virtual {v0, v1, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    goto/16 :goto_0

    :pswitch_1
    if-eqz v2, :cond_17

    .line 156
    invoke-virtual {v2}, Lbin/mt/json/JSONValue;->isBoolean()Z

    move-result v3

    if-eqz v3, :cond_17

    invoke-virtual {v2}, Lbin/mt/json/JSONValue;->asBoolean()Z

    move-result v4

    .line 27
    :cond_17
    invoke-virtual {v0, v1, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    goto/16 :goto_0

    :pswitch_2
    if-eqz v2, :cond_18

    .line 161
    invoke-virtual {v2}, Lbin/mt/json/JSONValue;->isNumber()Z

    move-result v3

    if-eqz v3, :cond_18

    goto :goto_4

    :cond_18
    sget-object v2, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    .line 32
    :goto_4
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    goto/16 :goto_0

    :pswitch_3
    if-eqz v2, :cond_19

    .line 156
    invoke-virtual {v2}, Lbin/mt/json/JSONValue;->isBoolean()Z

    move-result v3

    if-eqz v3, :cond_19

    invoke-virtual {v2}, Lbin/mt/json/JSONValue;->asBoolean()Z

    move-result v5

    .line 26
    :cond_19
    invoke-virtual {v0, v1, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    goto/16 :goto_0

    .line 36
    :cond_1a
    iget-object p0, p1, Ll/ۗۛ᩻;->ۗ:Lbin/mt/json/JSONArray;

    invoke-static {p1, v0, p0}, Ll/᩶ۛ᩻;->֫(Ll/ۗۛ᩻;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x60ac5760 -> :sswitch_13
        -0x58effed5 -> :sswitch_12
        -0x54d05672 -> :sswitch_11
        -0x50d35a0e -> :sswitch_10
        -0x2ba1a079 -> :sswitch_f
        -0x12d73e22 -> :sswitch_e
        -0xeacfece -> :sswitch_d
        -0x1e74487 -> :sswitch_c
        0x6234bbb -> :sswitch_b
        0x15293a8a -> :sswitch_a
        0x15efcbbb -> :sswitch_9
        0x1db04457 -> :sswitch_8
        0x1e1e1af6 -> :sswitch_7
        0x238f0d87 -> :sswitch_6
        0x2c0b62b4 -> :sswitch_5
        0x3e2e47f8 -> :sswitch_4
        0x4ead8d4f -> :sswitch_3
        0x60bd106c -> :sswitch_2
        0x7039a05a -> :sswitch_1
        0x70d04fc3 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method

.method public static ֫(Ljava/lang/Class;)Ljava/lang/Class;
    .locals 1

    .line 65
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-ne p0, v0, :cond_0

    const-class p0, Ljava/lang/Integer;

    return-object p0

    .line 66
    :cond_0
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    if-ne p0, v0, :cond_1

    const-class p0, Ljava/lang/Float;

    return-object p0

    .line 67
    :cond_1
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    if-ne p0, v0, :cond_2

    const-class p0, Ljava/lang/Byte;

    return-object p0

    .line 68
    :cond_2
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    if-ne p0, v0, :cond_3

    const-class p0, Ljava/lang/Double;

    return-object p0

    .line 69
    :cond_3
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-ne p0, v0, :cond_4

    const-class p0, Ljava/lang/Long;

    return-object p0

    .line 70
    :cond_4
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    if-ne p0, v0, :cond_5

    const-class p0, Ljava/lang/Character;

    return-object p0

    .line 71
    :cond_5
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-ne p0, v0, :cond_6

    const-class p0, Ljava/lang/Boolean;

    return-object p0

    .line 72
    :cond_6
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    if-ne p0, v0, :cond_7

    const-class p0, Ljava/lang/Short;

    return-object p0

    .line 73
    :cond_7
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    if-ne p0, v0, :cond_8

    const-class p0, Ljava/lang/Void;

    :cond_8
    return-object p0
.end method

.method public static ֫(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 25

    move-object/from16 v0, p0

    .line 51
    new-instance v1, Ljava/util/ArrayList;

    const/4 v2, 0x1

    new-array v3, v2, [Ljava/lang/Object;

    const/4 v4, 0x0

    const-string v5, "path"

    aput-object v5, v3, v4

    .line 0
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5, v2}, Ljava/util/ArrayList;-><init>(I)V

    aget-object v3, v3, v4

    invoke-static {v3}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v5}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    .line 51
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 52
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->hashCode()I

    move-result v3

    const/16 v5, 0x10

    const/16 v6, 0xb

    const/16 v7, 0xa

    const/4 v8, 0x7

    const/4 v9, 0x6

    const/16 v10, 0x8

    const/4 v11, 0x3

    const/4 v12, 0x2

    const/4 v13, 0x5

    const/16 v14, 0x9

    const/4 v15, 0x4

    const/16 v16, -0x1

    sparse-switch v3, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v3, "mt_file_delete"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    goto/16 :goto_0

    :cond_0
    const/16 v16, 0x11

    goto/16 :goto_0

    :sswitch_1
    const-string v3, "mt_file_search_text"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    goto/16 :goto_0

    :cond_1
    const/16 v16, 0x10

    goto/16 :goto_0

    :sswitch_2
    const-string v3, "mt_file_append_bytes"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    goto/16 :goto_0

    :cond_2
    const/16 v16, 0xf

    goto/16 :goto_0

    :sswitch_3
    const-string v3, "mt_file_read_bytes"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    goto/16 :goto_0

    :cond_3
    const/16 v16, 0xe

    goto/16 :goto_0

    :sswitch_4
    const-string v3, "mt_file_truncate_bytes"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    goto/16 :goto_0

    :cond_4
    const/16 v16, 0xd

    goto/16 :goto_0

    :sswitch_5
    const-string v3, "mt_file_append_text"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    goto/16 :goto_0

    :cond_5
    const/16 v16, 0xc

    goto/16 :goto_0

    :sswitch_6
    const-string v3, "mt_file_read_text"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    goto/16 :goto_0

    :cond_6
    const/16 v16, 0xb

    goto/16 :goto_0

    :sswitch_7
    const-string v3, "mt_file_stat"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_7

    goto/16 :goto_0

    :cond_7
    const/16 v16, 0xa

    goto/16 :goto_0

    :sswitch_8
    const-string v3, "mt_file_move"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_8

    goto/16 :goto_0

    :cond_8
    const/16 v16, 0x9

    goto/16 :goto_0

    :sswitch_9
    const-string v3, "mt_file_list"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_9

    goto/16 :goto_0

    :cond_9
    const/16 v16, 0x8

    goto/16 :goto_0

    :sswitch_a
    const-string v3, "mt_file_copy"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_a

    goto :goto_0

    :cond_a
    const/16 v16, 0x7

    goto :goto_0

    :sswitch_b
    const-string v3, "mt_file_replace_text"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_b

    goto :goto_0

    :cond_b
    const/16 v16, 0x6

    goto :goto_0

    :sswitch_c
    const-string v3, "mt_file_write_bytes"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_c

    goto :goto_0

    :cond_c
    const/16 v16, 0x5

    goto :goto_0

    :sswitch_d
    const-string v3, "mt_file_edit_text"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_d

    goto :goto_0

    :cond_d
    const/16 v16, 0x4

    goto :goto_0

    :sswitch_e
    const-string v3, "mt_file_patch_bytes"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_e

    goto :goto_0

    :cond_e
    const/16 v16, 0x3

    goto :goto_0

    :sswitch_f
    const-string v3, "mt_file_delete_directory"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_f

    goto :goto_0

    :cond_f
    const/16 v16, 0x2

    goto :goto_0

    :sswitch_10
    const-string v3, "mt_file_search"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_10

    goto :goto_0

    :cond_10
    const/16 v16, 0x1

    goto :goto_0

    :sswitch_11
    const-string v3, "mt_file_create_directory"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_11

    goto :goto_0

    :cond_11
    const/16 v16, 0x0

    :goto_0
    const-string v3, "actual"

    const-string v17, "limit"

    const-string v18, "targetPath"

    const-string v19, "actualTargetVersion"

    const-string v20, "expectedTargetVersion"

    const-string v21, "warnings"

    const-string v22, "stateKnown"

    const-string v23, "operationMode"

    const-string v24, "changed"

    packed-switch v16, :pswitch_data_0

    .line 83
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Unknown file tool: "

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    new-array v0, v15, [Ljava/lang/Object;

    aput-object v24, v0, v4

    aput-object v23, v0, v2

    aput-object v22, v0, v12

    aput-object v21, v0, v11

    .line 0
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v15}, Ljava/util/ArrayList;-><init>(I)V

    :goto_1
    if-ge v4, v15, :cond_13

    aget-object v5, v0, v4

    invoke-static {v5, v3, v5, v4, v2}, Ll/ۡܶ֫;->֫(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;II)I

    move-result v4

    goto :goto_1

    :pswitch_1
    new-array v0, v15, [Ljava/lang/Object;

    aput-object v20, v0, v4

    aput-object v19, v0, v2

    const-string v3, "byteOffset"

    aput-object v3, v0, v12

    const-string v3, "totalBytes"

    aput-object v3, v0, v11

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v15}, Ljava/util/ArrayList;-><init>(I)V

    :goto_2
    if-ge v4, v15, :cond_13

    aget-object v5, v0, v4

    invoke-static {v5, v3, v5, v4, v2}, Ll/ۡܶ֫;->֫(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;II)I

    move-result v4

    goto :goto_2

    :pswitch_2
    new-array v0, v10, [Ljava/lang/Object;

    aput-object v24, v0, v4

    aput-object v23, v0, v2

    aput-object v22, v0, v12

    aput-object v21, v0, v11

    aput-object v20, v0, v15

    aput-object v19, v0, v13

    aput-object v17, v0, v9

    aput-object v3, v0, v8

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v10}, Ljava/util/ArrayList;-><init>(I)V

    :goto_3
    if-ge v4, v10, :cond_13

    aget-object v5, v0, v4

    invoke-static {v5, v3, v5, v4, v2}, Ll/ۡܶ֫;->֫(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;II)I

    move-result v4

    goto :goto_3

    :pswitch_3
    new-array v0, v15, [Ljava/lang/Object;

    aput-object v20, v0, v4

    aput-object v19, v0, v2

    const-string v3, "finalLine"

    aput-object v3, v0, v12

    const-string v3, "finalColumn"

    aput-object v3, v0, v11

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v15}, Ljava/util/ArrayList;-><init>(I)V

    :goto_4
    if-ge v4, v15, :cond_13

    aget-object v5, v0, v4

    invoke-static {v5, v3, v5, v4, v2}, Ll/ۡܶ֫;->֫(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;II)I

    move-result v4

    goto :goto_4

    :pswitch_4
    new-array v0, v13, [Ljava/lang/Object;

    aput-object v18, v0, v4

    aput-object v24, v0, v2

    aput-object v23, v0, v12

    aput-object v22, v0, v11

    aput-object v21, v0, v15

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v13}, Ljava/util/ArrayList;-><init>(I)V

    :goto_5
    if-ge v4, v13, :cond_13

    aget-object v5, v0, v4

    invoke-static {v5, v3, v5, v4, v2}, Ll/ۡܶ֫;->֫(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;II)I

    move-result v4

    goto :goto_5

    :pswitch_5
    new-array v0, v13, [Ljava/lang/Object;

    aput-object v18, v0, v4

    aput-object v24, v0, v2

    aput-object v23, v0, v12

    aput-object v22, v0, v11

    aput-object v21, v0, v15

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v13}, Ljava/util/ArrayList;-><init>(I)V

    :goto_6
    if-ge v4, v13, :cond_13

    aget-object v5, v0, v4

    invoke-static {v5, v3, v5, v4, v2}, Ll/ۡܶ֫;->֫(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;II)I

    move-result v4

    goto :goto_6

    :pswitch_6
    new-array v0, v7, [Ljava/lang/Object;

    aput-object v24, v0, v4

    aput-object v23, v0, v2

    aput-object v22, v0, v12

    aput-object v21, v0, v11

    aput-object v20, v0, v15

    aput-object v19, v0, v13

    const-string v5, "expectedReplacements"

    aput-object v5, v0, v9

    const-string v5, "actualReplacements"

    aput-object v5, v0, v8

    aput-object v17, v0, v10

    aput-object v3, v0, v14

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v7}, Ljava/util/ArrayList;-><init>(I)V

    :goto_7
    if-ge v4, v7, :cond_13

    aget-object v5, v0, v4

    invoke-static {v5, v3, v5, v4, v2}, Ll/ۡܶ֫;->֫(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;II)I

    move-result v4

    goto :goto_7

    :pswitch_7
    new-array v0, v14, [Ljava/lang/Object;

    aput-object v18, v0, v4

    aput-object v24, v0, v2

    aput-object v23, v0, v12

    aput-object v22, v0, v11

    aput-object v21, v0, v15

    aput-object v20, v0, v13

    aput-object v19, v0, v9

    aput-object v17, v0, v8

    aput-object v3, v0, v10

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v14}, Ljava/util/ArrayList;-><init>(I)V

    :goto_8
    if-ge v4, v14, :cond_13

    aget-object v5, v0, v4

    invoke-static {v5, v3, v5, v4, v2}, Ll/ۡܶ֫;->֫(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;II)I

    move-result v4

    goto :goto_8

    :pswitch_8
    const-string v16, "limit"

    const-string v17, "actual"

    const-string v7, "targetPath"

    const-string v8, "changed"

    const-string v9, "operationMode"

    const-string v10, "stateKnown"

    const-string v11, "warnings"

    const-string v12, "expectedTargetVersion"

    const-string v13, "actualTargetVersion"

    const-string v14, "failedEditIndex"

    const-string v15, "conflictingEditIndex"

    .line 73
    filled-new-array/range {v7 .. v17}, [Ljava/lang/String;

    move-result-object v0

    .line 0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v6}, Ljava/util/ArrayList;-><init>(I)V

    :goto_9
    if-ge v4, v6, :cond_12

    aget-object v3, v0, v4

    invoke-static {v3}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_9

    :pswitch_9
    const-string v20, "expectedHex"

    const-string v21, "actualHex"

    const-string v6, "targetPath"

    const-string v7, "changed"

    const-string v8, "operationMode"

    const-string v9, "stateKnown"

    const-string v10, "warnings"

    const-string v11, "expectedTargetVersion"

    const-string v12, "actualTargetVersion"

    const-string v13, "failedPatchIndex"

    const-string v14, "conflictingPatchIndex"

    const-string v15, "byteOffset"

    const-string v16, "endByteOffset"

    const-string v17, "totalBytes"

    const-string v18, "limit"

    const-string v19, "actual"

    .line 79
    filled-new-array/range {v6 .. v21}, [Ljava/lang/String;

    move-result-object v0

    .line 0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    :goto_a
    if-ge v4, v5, :cond_12

    aget-object v3, v0, v4

    invoke-static {v3}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_a

    :cond_12
    invoke-static {v2}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    goto :goto_d

    :pswitch_a
    new-array v0, v14, [Ljava/lang/Object;

    aput-object v24, v0, v4

    aput-object v23, v0, v2

    aput-object v22, v0, v12

    aput-object v21, v0, v11

    const-string v3, "deletedFiles"

    aput-object v3, v0, v15

    const-string v3, "deletedDirectories"

    aput-object v3, v0, v13

    const-string v3, "failedPath"

    aput-object v3, v0, v9

    const-string v3, "failureStage"

    aput-object v3, v0, v8

    const-string v3, "safeToRetry"

    aput-object v3, v0, v10

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v14}, Ljava/util/ArrayList;-><init>(I)V

    :goto_b
    if-ge v4, v14, :cond_13

    aget-object v5, v0, v4

    invoke-static {v5, v3, v5, v4, v2}, Ll/ۡܶ֫;->֫(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;II)I

    move-result v4

    goto :goto_b

    :pswitch_b
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    goto :goto_d

    :pswitch_c
    new-array v0, v14, [Ljava/lang/Object;

    aput-object v24, v0, v4

    aput-object v23, v0, v2

    aput-object v22, v0, v12

    aput-object v21, v0, v11

    const-string v3, "createdDirectories"

    aput-object v3, v0, v15

    const-string v3, "deepestCreatedPath"

    aput-object v3, v0, v13

    const-string v3, "failedPath"

    aput-object v3, v0, v9

    const-string v3, "failureStage"

    aput-object v3, v0, v8

    const-string v3, "safeToRetry"

    aput-object v3, v0, v10

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v14}, Ljava/util/ArrayList;-><init>(I)V

    :goto_c
    if-ge v4, v14, :cond_13

    aget-object v5, v0, v4

    invoke-static {v5, v3, v5, v4, v2}, Ll/ۡܶ֫;->֫(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;II)I

    move-result v4

    goto :goto_c

    :cond_13
    invoke-static {v3}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    .line 52
    :goto_d
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-object v1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7e92354b -> :sswitch_11
        -0x6ce74ccd -> :sswitch_10
        -0x46081f5c -> :sswitch_f
        -0x3fc9a0f7 -> :sswitch_e
        -0x11d77729 -> :sswitch_d
        -0xc57b6a0 -> :sswitch_c
        0xeee9523 -> :sswitch_b
        0x1708e3c0 -> :sswitch_a
        0x170ce4e9 -> :sswitch_9
        0x170d701c -> :sswitch_8
        0x17103a9f -> :sswitch_7
        0x1b03f4cb -> :sswitch_6
        0x1b8f0087 -> :sswitch_5
        0x2de3dedd -> :sswitch_4
        0x4486048d -> :sswitch_3
        0x555c7051 -> :sswitch_2
        0x6bd752b9 -> :sswitch_1
        0x7984d336 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_b
        :pswitch_4
        :pswitch_b
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_b
        :pswitch_0
    .end packed-switch
.end method

.method public static ֫(I)Z
    .locals 1

    .line 11
    invoke-static {p0}, Ljava/lang/Character;->isWhitespace(I)Z

    move-result v0

    if-nez v0, :cond_1

    const v0, 0xfeff

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static ۧ(I)I
    .locals 1

    const/16 v0, 0x41

    if-lt p0, v0, :cond_0

    const/16 v0, 0x5a

    if-gt p0, v0, :cond_0

    add-int/lit8 p0, p0, 0x20

    return p0

    :cond_0
    const/16 v0, 0x61

    if-lt p0, v0, :cond_1

    const/16 v0, 0x7a

    if-gt p0, v0, :cond_1

    goto :goto_0

    :cond_1
    and-int/lit8 v0, p0, -0x80

    if-nez v0, :cond_2

    :goto_0
    return p0

    .line 20
    :cond_2
    invoke-static {p0}, Ljava/lang/Character;->toUpperCase(I)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Character;->toLowerCase(I)I

    move-result p0

    return p0
.end method

.method public static ۧ(Ljava/lang/String;)Lbin/mt/json/JSONObject;
    .locals 7

    .line 41
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 42
    invoke-static {p0}, Ll/ۗᩳۘ;->֫(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1e

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 89
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    const/4 v3, -0x1

    sparse-switch v2, :sswitch_data_0

    goto/16 :goto_1

    :sswitch_0
    const-string v2, "createdDirectories"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    goto/16 :goto_1

    :cond_0
    const/16 v3, 0x1d

    goto/16 :goto_1

    :sswitch_1
    const-string v2, "conflictingPatchIndex"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto/16 :goto_1

    :cond_1
    const/16 v3, 0x1c

    goto/16 :goto_1

    :sswitch_2
    const-string v2, "finalColumn"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto/16 :goto_1

    :cond_2
    const/16 v3, 0x1b

    goto/16 :goto_1

    :sswitch_3
    const-string v2, "expectedHex"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto/16 :goto_1

    :cond_3
    const/16 v3, 0x1a

    goto/16 :goto_1

    :sswitch_4
    const-string v2, "actualReplacements"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    goto/16 :goto_1

    :cond_4
    const/16 v3, 0x19

    goto/16 :goto_1

    :sswitch_5
    const-string v2, "conflictingEditIndex"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    goto/16 :goto_1

    :cond_5
    const/16 v3, 0x18

    goto/16 :goto_1

    :sswitch_6
    const-string v2, "changed"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    goto/16 :goto_1

    :cond_6
    const/16 v3, 0x17

    goto/16 :goto_1

    :sswitch_7
    const-string v2, "failedPatchIndex"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    goto/16 :goto_1

    :cond_7
    const/16 v3, 0x16

    goto/16 :goto_1

    :sswitch_8
    const-string v2, "failedPath"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    goto/16 :goto_1

    :cond_8
    const/16 v3, 0x15

    goto/16 :goto_1

    :sswitch_9
    const-string v2, "actualHex"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    goto/16 :goto_1

    :cond_9
    const/16 v3, 0x14

    goto/16 :goto_1

    :sswitch_a
    const-string v2, "endByteOffset"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    goto/16 :goto_1

    :cond_a
    const/16 v3, 0x13

    goto/16 :goto_1

    :sswitch_b
    const-string v2, "warnings"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    goto/16 :goto_1

    :cond_b
    const/16 v3, 0x12

    goto/16 :goto_1

    :sswitch_c
    const-string v2, "targetPath"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_c

    goto/16 :goto_1

    :cond_c
    const/16 v3, 0x11

    goto/16 :goto_1

    :sswitch_d
    const-string v2, "byteOffset"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_d

    goto/16 :goto_1

    :cond_d
    const/16 v3, 0x10

    goto/16 :goto_1

    :sswitch_e
    const-string v2, "finalLine"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_e

    goto/16 :goto_1

    :cond_e
    const/16 v3, 0xf

    goto/16 :goto_1

    :sswitch_f
    const-string v2, "limit"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_f

    goto/16 :goto_1

    :cond_f
    const/16 v3, 0xe

    goto/16 :goto_1

    :sswitch_10
    const-string v2, "operationMode"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_10

    goto/16 :goto_1

    :cond_10
    const/16 v3, 0xd

    goto/16 :goto_1

    :sswitch_11
    const-string v2, "path"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_11

    goto/16 :goto_1

    :cond_11
    const/16 v3, 0xc

    goto/16 :goto_1

    :sswitch_12
    const-string v2, "expectedReplacements"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_12

    goto/16 :goto_1

    :cond_12
    const/16 v3, 0xb

    goto/16 :goto_1

    :sswitch_13
    const-string v2, "expectedTargetVersion"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_13

    goto/16 :goto_1

    :cond_13
    const/16 v3, 0xa

    goto/16 :goto_1

    :sswitch_14
    const-string v2, "failureStage"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_14

    goto/16 :goto_1

    :cond_14
    const/16 v3, 0x9

    goto/16 :goto_1

    :sswitch_15
    const-string v2, "stateKnown"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_15

    goto/16 :goto_1

    :cond_15
    const/16 v3, 0x8

    goto/16 :goto_1

    :sswitch_16
    const-string v2, "deepestCreatedPath"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_16

    goto :goto_1

    :cond_16
    const/4 v3, 0x7

    goto :goto_1

    :sswitch_17
    const-string v2, "deletedFiles"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_17

    goto :goto_1

    :cond_17
    const/4 v3, 0x6

    goto :goto_1

    :sswitch_18
    const-string v2, "totalBytes"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_18

    goto :goto_1

    :cond_18
    const/4 v3, 0x5

    goto :goto_1

    :sswitch_19
    const-string v2, "actualTargetVersion"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_19

    goto :goto_1

    :cond_19
    const/4 v3, 0x4

    goto :goto_1

    :sswitch_1a
    const-string v2, "deletedDirectories"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1a

    goto :goto_1

    :cond_1a
    const/4 v3, 0x3

    goto :goto_1

    :sswitch_1b
    const-string v2, "actual"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1b

    goto :goto_1

    :cond_1b
    const/4 v3, 0x2

    goto :goto_1

    :sswitch_1c
    const-string v2, "failedEditIndex"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1c

    goto :goto_1

    :cond_1c
    const/4 v3, 0x1

    goto :goto_1

    :sswitch_1d
    const-string v2, "safeToRetry"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1d

    goto :goto_1

    :cond_1d
    const/4 v3, 0x0

    :goto_1
    const-string v2, "boolean"

    const-string v4, "string"

    const-string v5, "integer"

    packed-switch v3, :pswitch_data_0

    .line 150
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unknown diagnostic field: "

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :pswitch_0
    const-string v2, "Directory levels confirmed created before a failure, or null."

    goto/16 :goto_3

    :pswitch_1
    const-string v2, "Zero-based index in the input patches array of the conflicting byte patch, or null."

    goto/16 :goto_3

    :pswitch_2
    const-string v2, "Zero-based Unicode code-point column at end of file on finalLine. Reading at (finalLine, finalColumn) returns an empty page; null when unavailable."

    goto/16 :goto_3

    :pswitch_3
    const-string v2, "Expected patch bytes in uppercase hex, or null."

    goto/16 :goto_2

    :pswitch_4
    const-string v2, "Observed selected replacement count when the count check fails; otherwise null."

    goto/16 :goto_3

    :pswitch_5
    const-string v2, "Zero-based index in the input edits array of the conflicting text edit, or null."

    goto/16 :goto_3

    :pswitch_6
    const-string v3, "Whether the target may already have changed."

    goto/16 :goto_4

    :pswitch_7
    const-string v2, "Zero-based index in the input patches array of the rejected byte patch, or null."

    goto/16 :goto_3

    :pswitch_8
    const-string v2, "Exact path whose mutation failed, or null."

    goto :goto_2

    :pswitch_9
    const-string v2, "Current patch bytes in uppercase hex, or null."

    goto :goto_2

    :pswitch_a
    const-string v2, "Exclusive rejected byte end, or null."

    goto :goto_3

    :pswitch_b
    const-string v2, "array"

    const-string v3, "description"

    const-string v5, "type"

    const-string v6, "Non-fatal cleanup, metadata, or notification degradation."

    .line 0
    invoke-static {v5, v2, v3, v6}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "One warning message."

    .line 96
    invoke-static {v4, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "items"

    .line 183
    invoke-virtual {v2, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    goto :goto_5

    :pswitch_c
    const-string v2, "Normalized absolute second path for a two-path operation."

    goto :goto_2

    :pswitch_d
    const-string v2, "Rejected byte offset, or null."

    goto :goto_3

    :pswitch_e
    const-string v2, "Zero-based logical line at end of file for a text position error; null when unavailable."

    goto :goto_3

    :pswitch_f
    const-string v2, "Applicable content or item limit, or null."

    goto :goto_3

    :pswitch_10
    const-string v2, "atomic, best_effort, or non_atomic when a mutation guarantee was selected."

    goto :goto_2

    :pswitch_11
    const-string v2, "Normalized absolute path involved in the failure."

    goto :goto_2

    :pswitch_12
    const-string v2, "Requested selected replacement count when the count check fails; otherwise null."

    goto :goto_3

    :pswitch_13
    const-string v2, "Requested targetVersion for a version mismatch during reading or writing, or null."

    goto :goto_2

    :pswitch_14
    const-string v2, "Stable mutation stage that failed, or null."

    goto :goto_2

    :pswitch_15
    const-string v3, "Whether the target final state is known."

    goto :goto_4

    :pswitch_16
    const-string v2, "Deepest path confirmed created before a failure, or null."

    goto :goto_2

    :pswitch_17
    const-string v2, "Files or recognized links confirmed deleted before a failure, or null."

    goto :goto_3

    :pswitch_18
    const-string v2, "Current file size for a range failure, or null."

    goto :goto_3

    :pswitch_19
    const-string v2, "Current targetVersion for a version mismatch during reading or writing, or null."

    .line 103
    :goto_2
    invoke-static {v4, v2}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    goto :goto_5

    :pswitch_1a
    const-string v2, "Directories confirmed deleted before a failure, or null."

    goto :goto_3

    :pswitch_1b
    const-string v2, "Actual content or item count, or null."

    goto :goto_3

    :pswitch_1c
    const-string v2, "Zero-based index in the input edits array of the rejected text edit, or null."

    .line 117
    :goto_3
    invoke-static {v5, v2}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    goto :goto_5

    :pswitch_1d
    const-string v3, "Whether retrying the same requested mutation is safe."

    .line 124
    :goto_4
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 43
    :goto_5
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    goto/16 :goto_0

    :cond_1e
    const-string p0, "Local file failure context for this tool; unavailable values are null."

    .line 45
    invoke-static {v0, p0}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    invoke-static {p0}, Ll/֫ۛ᩻;->ۧ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0

    :sswitch_data_0
    .sparse-switch
        -0x60ac5760 -> :sswitch_1d
        -0x58effed5 -> :sswitch_1c
        -0x54d05672 -> :sswitch_1b
        -0x50d35a0e -> :sswitch_1a
        -0x45c774e7 -> :sswitch_19
        -0x2ba1a079 -> :sswitch_18
        -0x12d73e22 -> :sswitch_17
        -0x11645e4d -> :sswitch_16
        -0xeacfece -> :sswitch_15
        -0xc00f86c -> :sswitch_14
        -0x7ccddd1 -> :sswitch_13
        -0x1e74487 -> :sswitch_12
        0x346425 -> :sswitch_11
        0x57877aa -> :sswitch_10
        0x6234bbb -> :sswitch_f
        0x15293a8a -> :sswitch_e
        0x15efcbbb -> :sswitch_d
        0x1cff1956 -> :sswitch_c
        0x1db04457 -> :sswitch_b
        0x1e1e1af6 -> :sswitch_a
        0x1f855ead -> :sswitch_9
        0x21ae0602 -> :sswitch_8
        0x238f0d87 -> :sswitch_7
        0x2c0b62b4 -> :sswitch_6
        0x3e2e47f8 -> :sswitch_5
        0x4ead8d4f -> :sswitch_4
        0x5b27b943 -> :sswitch_3
        0x60bd106c -> :sswitch_2
        0x7039a05a -> :sswitch_1
        0x70d04fc3 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ܳ(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "GET"

    .line 36
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "HEAD"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ܽ(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "POST"

    .line 20
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "PATCH"

    .line 21
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "PUT"

    .line 22
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "DELETE"

    .line 23
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "MOVE"

    .line 24
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static ܿ(Ljava/lang/String;)[B
    .locals 3

    .line 69
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    new-array v0, v0, [B

    .line 70
    sget-object v1, Ll/۠ܰۖ;->֫:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    invoke-static {v1, v2, v0, v2, p0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0
.end method

.method public static ᩳ(Ljava/lang/String;)Z
    .locals 0

    if-eqz p0, :cond_0

    .line 81
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ᩻(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    const/16 v0, 0x2e

    .line 24
    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    if-gez v0, :cond_0

    goto :goto_2

    :cond_0
    if-nez v0, :cond_1

    const/4 v0, 0x2

    .line 33
    :cond_1
    invoke-static {v0, p0}, Ll/᩶ۛ᩻;->֫(ILjava/lang/String;)I

    move-result v1

    if-ltz v1, :cond_2

    move v2, v1

    goto :goto_0

    .line 34
    :cond_2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    :goto_0
    add-int/lit8 v3, v2, -0x1

    if-le v3, v0, :cond_4

    .line 36
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x30

    if-eq v4, v5, :cond_3

    goto :goto_1

    :cond_3
    move v2, v3

    goto :goto_0

    :cond_4
    move v2, v3

    :goto_1
    const/4 v0, 0x0

    if-gez v1, :cond_5

    .line 42
    invoke-virtual {p0, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_5
    if-ne v1, v2, :cond_6

    :goto_2
    return-object p0

    .line 46
    :cond_6
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
