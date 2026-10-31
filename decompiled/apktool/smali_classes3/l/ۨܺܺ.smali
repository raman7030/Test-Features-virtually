.class public final Ll/ۨܺܺ;
.super Ljava/lang/Object;
.source "EAEE"


# direct methods
.method public static ֫(B)B
    .locals 0

    and-int/lit16 p0, p0, 0xff

    ushr-int/lit8 p0, p0, 0x4

    int-to-byte p0, p0

    return p0
.end method

.method public static ֫(I[B)I
    .locals 3

    add-int/lit8 v0, p0, 0x1

    .line 164
    aget-byte v1, p1, p0

    and-int/lit16 v1, v1, 0xff

    add-int/lit8 v2, p0, 0x2

    aget-byte v0, p1, v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x8

    or-int/2addr v0, v1

    add-int/lit8 p0, p0, 0x3

    aget-byte v1, p1, v2

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    aget-byte p0, p1, p0

    shl-int/lit8 p0, p0, 0x18

    or-int/2addr p0, v0

    return p0
.end method

.method public static ֫(Ll/ᩳ֨֫;II)J
    .locals 7

    .line 81
    invoke-virtual {p0, p1}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 82
    invoke-virtual {p0}, Ll/ᩳ֨֫;->֫()I

    move-result p1

    const/4 v0, 0x5

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    if-ge p1, v0, :cond_0

    return-wide v1

    .line 87
    :cond_0
    invoke-virtual {p0}, Ll/ᩳ֨֫;->᩻()I

    move-result p1

    const/high16 v0, 0x800000

    and-int/2addr v0, p1

    if-eqz v0, :cond_1

    return-wide v1

    :cond_1
    const v0, 0x1fff00

    and-int/2addr v0, p1

    shr-int/lit8 v0, v0, 0x8

    if-eq v0, p2, :cond_2

    return-wide v1

    :cond_2
    and-int/lit8 p1, p1, 0x20

    if-eqz p1, :cond_3

    .line 101
    invoke-virtual {p0}, Ll/ᩳ֨֫;->֨()I

    move-result p1

    const/4 p2, 0x7

    if-lt p1, p2, :cond_3

    .line 102
    invoke-virtual {p0}, Ll/ᩳ֨֫;->֫()I

    move-result p1

    if-lt p1, p2, :cond_3

    .line 103
    invoke-virtual {p0}, Ll/ᩳ֨֫;->֨()I

    move-result p1

    const/16 v0, 0x10

    and-int/2addr p1, v0

    if-ne p1, v0, :cond_3

    const/4 p1, 0x6

    new-array v0, p1, [B

    const/4 v1, 0x0

    .line 107
    invoke-virtual {p0, v1, p1, v0}, Ll/ᩳ֨֫;->֫(II[B)V

    .line 120
    aget-byte p0, v0, v1

    int-to-long p0, p0

    const-wide/16 v1, 0xff

    and-long/2addr p0, v1

    const/16 v3, 0x19

    shl-long/2addr p0, v3

    const/4 v3, 0x1

    aget-byte v4, v0, v3

    int-to-long v4, v4

    and-long/2addr v4, v1

    const/16 v6, 0x11

    shl-long/2addr v4, v6

    or-long/2addr p0, v4

    const/4 v4, 0x2

    aget-byte v4, v0, v4

    int-to-long v4, v4

    and-long/2addr v4, v1

    const/16 v6, 0x9

    shl-long/2addr v4, v6

    or-long/2addr p0, v4

    const/4 v4, 0x3

    aget-byte v4, v0, v4

    int-to-long v4, v4

    and-long/2addr v4, v1

    shl-long v3, v4, v3

    or-long/2addr p0, v3

    const/4 v3, 0x4

    aget-byte v0, v0, v3

    int-to-long v3, v0

    and-long v0, v3, v1

    shr-long/2addr v0, p2

    or-long/2addr p0, v0

    return-wide p0

    :cond_3
    return-wide v1
.end method

.method public static ֫()Lbin/mt/json/JSONObject;
    .locals 4

    .line 188
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "integer"

    const-string v2, "Range start byte offset."

    .line 117
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "byteOffset"

    .line 189
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Exclusive range end byte offset."

    .line 117
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "endByteOffset"

    .line 190
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "A rejected half-open byte range."

    .line 188
    invoke-static {v0, v1}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public static ֫(Ll/ۗۛ᩻;)Lbin/mt/json/JSONObject;
    .locals 6

    .line 120
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    iget-object v1, p0, Ll/ۗۛ᩻;->᩶:Lbin/mt/json/JSONObject;

    const-string v2, "entryName"

    .line 0
    invoke-static {v1, v2, v0, v2}, Ll/ܽ᩷ᩳ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "reason"

    invoke-static {v1, v2, v0, v2}, Ll/ܽ᩷ᩳ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "byteOffset"

    .line 123
    invoke-virtual {v1, v2}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v3

    invoke-static {v3}, Ll/ۨܺܺ;->֫(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONValue;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "endByteOffset"

    .line 124
    invoke-virtual {v1, v2}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v3

    invoke-static {v3}, Ll/ۨܺܺ;->֫(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONValue;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "entrySize"

    .line 125
    invoke-virtual {v1, v2}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v3

    invoke-static {v3}, Ll/ۨܺܺ;->֫(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONValue;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "expectedHex"

    .line 0
    invoke-static {v1, v2, v0, v2}, Ll/ܽ᩷ᩳ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "actualHex"

    invoke-static {v1, v2, v0, v2}, Ll/ܽ᩷ᩳ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "firstRange"

    .line 128
    invoke-virtual {v1, v2}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    invoke-static {v3}, Ll/ۨܺܺ;->֫(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONValue;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "secondRange"

    .line 129
    invoke-virtual {v1, v2}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-static {v1}, Ll/ۨܺܺ;->֫(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONValue;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 54
    iget-object v1, p0, Ll/ۗۛ᩻;->ۗ:Lbin/mt/json/JSONArray;

    .line 107
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v2

    .line 108
    invoke-virtual {v1}, Lbin/mt/json/JSONArray;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lbin/mt/json/JSONValue;

    .line 109
    invoke-virtual {v3}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "tool"

    const/4 v5, 0x0

    .line 110
    invoke-virtual {v3, v4, v5}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "mt_apk_read_bytes"

    .line 111
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    const-string v5, "mt_apk_workspace_open"

    .line 112
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 113
    :cond_1
    new-instance v4, Lbin/mt/json/JSONObject;

    invoke-direct {v4, v3}, Lbin/mt/json/JSONObject;-><init>(Lbin/mt/json/JSONObject;)V

    invoke-virtual {v2, v4}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto :goto_0

    .line 54
    :cond_2
    invoke-static {p0, v0, v2}, Ll/᩶ۛ᩻;->֫(Ll/ۗۛ᩻;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/۫ۜۜ;)Lbin/mt/json/JSONObject;
    .locals 24

    move-object/from16 v0, p0

    .line 39
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    iget-object v2, v0, Ll/۫ۜۜ;->ܳ:Ljava/lang/String;

    const-string v3, "workspaceId"

    .line 40
    invoke-virtual {v1, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    iget-object v4, v0, Ll/۫ۜۜ;->ۧ:Ljava/lang/String;

    const-string v5, "editSessionId"

    .line 41
    invoke-virtual {v1, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    iget-object v7, v0, Ll/۫ۜۜ;->ܽ:Ljava/lang/String;

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-string v6, "zip_entry"

    const/4 v8, 0x0

    const/4 v9, 0x0

    .line 42
    invoke-static/range {v6 .. v11}, Ll/۬ܳۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "locator"

    invoke-virtual {v1, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    iget-wide v8, v0, Ll/۫ۜۜ;->ᩳ:J

    const-string v6, "entrySize"

    .line 44
    invoke-virtual {v1, v6, v8, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v1

    iget v6, v0, Ll/۫ۜۜ;->֫:I

    const-string v10, "bytesPatched"

    .line 45
    invoke-virtual {v1, v10, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 59
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v6

    .line 60
    iget-object v11, v0, Ll/۫ۜۜ;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_0
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    const-string v14, "byteOffset"

    if-eqz v13, :cond_0

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ll/۬ۜۜ;

    .line 61
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v15

    move-object/from16 v16, v12

    iget v12, v13, Ll/۬ۜۜ;->ܽ:I

    .line 62
    invoke-virtual {v15, v14, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v12

    iget v14, v13, Ll/۬ۜۜ;->ᩳ:I

    .line 63
    invoke-virtual {v12, v10, v14}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v12

    iget-object v14, v13, Ll/۬ۜۜ;->ۧ:[B

    .line 64
    invoke-static {v14}, Ll/ۨܺܺ;->֫([B)Ljava/lang/String;

    move-result-object v14

    const-string v15, "beforeHex"

    invoke-virtual {v12, v15, v14}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v12

    iget-object v13, v13, Ll/۬ۜۜ;->֫:[B

    .line 65
    invoke-static {v13}, Ll/ۨܺܺ;->֫([B)Ljava/lang/String;

    move-result-object v13

    const-string v14, "afterHex"

    invoke-virtual {v12, v14, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v12

    .line 61
    invoke-virtual {v6, v12}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-object/from16 v12, v16

    goto :goto_0

    :cond_0
    const-string v10, "patches"

    .line 46
    invoke-virtual {v1, v10, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 71
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v6

    .line 72
    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v10

    if-eqz v10, :cond_1

    move-object v0, v1

    move-object v1, v6

    goto/16 :goto_5

    :cond_1
    const/4 v10, 0x0

    .line 75
    invoke-virtual {v11, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/۬ۜۜ;

    .line 76
    iget v12, v10, Ll/۬ۜۜ;->ܽ:I

    iget v10, v10, Ll/۬ۜۜ;->ᩳ:I

    int-to-long v12, v12

    move-object/from16 v16, v14

    int-to-long v14, v10

    add-long v17, v12, v14

    .line 78
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v10

    move-object v11, v7

    move-wide/from16 v22, v17

    move-object/from16 v17, v6

    move-wide/from16 v6, v22

    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v18

    if-eqz v18, :cond_2

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v18

    move-object/from16 v19, v10

    move-object/from16 v10, v18

    check-cast v10, Ll/۬ۜۜ;

    move-object/from16 v18, v1

    .line 79
    iget v1, v10, Ll/۬ۜۜ;->ܽ:I

    int-to-long v0, v1

    invoke-static {v12, v13, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v12

    .line 80
    iget v0, v10, Ll/۬ۜۜ;->ܽ:I

    int-to-long v0, v0

    iget v10, v10, Ll/۬ۜۜ;->ᩳ:I

    move-wide/from16 v20, v12

    int-to-long v12, v10

    add-long/2addr v0, v12

    invoke-static {v6, v7, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v6

    move-object/from16 v0, p0

    move-object/from16 v1, v18

    move-object/from16 v10, v19

    move-wide/from16 v12, v20

    goto :goto_1

    :cond_2
    move-object/from16 v18, v1

    sub-long/2addr v6, v12

    sub-long/2addr v8, v12

    const-wide/16 v0, 0x0

    .line 83
    invoke-static {v0, v1, v8, v9}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v8

    const-wide/16 v0, 0x1000

    cmp-long v10, v6, v0

    if-gtz v10, :cond_3

    goto :goto_2

    .line 84
    :cond_3
    invoke-static {v0, v1, v8, v9}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v6

    .line 85
    :goto_2
    invoke-static {v6, v7, v14, v15}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    .line 86
    invoke-static {v0, v1, v8, v9}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    const-wide/16 v6, 0x0

    cmp-long v8, v0, v6

    if-lez v8, :cond_5

    const-wide/32 v6, 0x7fffffff

    cmp-long v8, v0, v6

    if-lez v8, :cond_4

    goto :goto_3

    .line 93
    :cond_4
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v6

    .line 94
    invoke-virtual {v6, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 95
    invoke-virtual {v2, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    move-object/from16 v3, p0

    iget-object v4, v3, Ll/۫ۜۜ;->ܽ:Ljava/lang/String;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-string v3, "zip_entry"

    const/4 v5, 0x0

    const/4 v6, 0x0

    .line 96
    invoke-static/range {v3 .. v8}, Ll/۬ܳۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v11, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    long-to-int v3, v12

    move-object/from16 v4, v16

    .line 98
    invoke-virtual {v2, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "maxBytes"

    long-to-int v1, v0

    .line 99
    invoke-virtual {v2, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "mt_apk_read_bytes"

    const-string v2, "inspect"

    const-string v3, "Read back the window starting at the first patched offset. For sparse patches outside this window, call mt_apk_read_bytes again using data.patches[].byteOffset."

    .line 90
    invoke-static {v0, v1, v2, v3}, Ll/ۤۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto :goto_4

    :cond_5
    :goto_3
    move-object/from16 v1, v17

    :goto_4
    move-object/from16 v0, v18

    .line 47
    :goto_5
    invoke-static {v0, v1}, Ll/᩶ۛ᩻;->֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public static ֫(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONValue;
    .locals 3

    if-nez p0, :cond_0

    .line 138
    sget-object p0, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    return-object p0

    .line 140
    :cond_0
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "byteOffset"

    .line 141
    invoke-virtual {p0, v1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v2

    invoke-static {v2}, Ll/ۨܺܺ;->֫(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONValue;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "endByteOffset"

    .line 142
    invoke-virtual {p0, v1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    invoke-static {p0}, Ll/ۨܺܺ;->֫(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONValue;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONValue;
    .locals 1

    if-eqz p0, :cond_1

    .line 133
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isNull()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isNumber()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-object p0

    :cond_1
    :goto_0
    sget-object p0, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    return-object p0
.end method

.method public static ֫([B)Ljava/lang/String;
    .locals 7

    .line 146
    new-instance v0, Ljava/lang/StringBuilder;

    array-length v1, p0

    mul-int/lit8 v1, v1, 0x2

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 147
    array-length v1, p0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    aget-byte v4, p0, v3

    .line 148
    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    and-int/lit16 v4, v4, 0xff

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    aput-object v4, v6, v2

    const-string v4, "%02X"

    invoke-static {v5, v4, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 150
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/۟ܺܺ;)Ll/֨ܺܺ;
    .locals 3

    .line 39
    invoke-virtual {p0}, Ll/۟ܺܺ;->ܿ()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 59
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "no zero for type: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 60
    invoke-virtual {p0}, Ll/۟ܺܺ;->֫()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 57
    :pswitch_0
    sget-object p0, Ll/᩵ܺܺ;->᩸:Ll/᩵ܺܺ;

    return-object p0

    .line 55
    :pswitch_1
    sget-object p0, Ll/ۗܺܺ;->᩹:Ll/ۗܺܺ;

    return-object p0

    .line 53
    :pswitch_2
    sget-object p0, Ll/۠ܺܺ;->᩹:Ll/۠ܺܺ;

    return-object p0

    .line 51
    :pswitch_3
    sget-object p0, Ll/ۖܺܺ;->᩹:Ll/ۖܺܺ;

    return-object p0

    .line 49
    :pswitch_4
    sget-object p0, Ll/ܺܺܺ;->᩹:Ll/ܺܺܺ;

    return-object p0

    .line 47
    :pswitch_5
    sget-object p0, Ll/᩷ܺܺ;->᩹:Ll/᩷ܺܺ;

    return-object p0

    .line 45
    :pswitch_6
    sget-object p0, Ll/ۜܺܺ;->᩹:Ll/ۜܺܺ;

    return-object p0

    .line 43
    :pswitch_7
    sget-object p0, Ll/ܿܺܺ;->᩹:Ll/ܿܺܺ;

    return-object p0

    .line 41
    :pswitch_8
    sget-object p0, Ll/ᩳܺܺ;->᩹:Ll/ᩳܺܺ;

    return-object p0

    :pswitch_data_0
    .packed-switch 0x1
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

.method public static ֫(Landroid/os/Bundle;Landroid/os/Bundle;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    const-string v2, "android.media.browse.extra.PAGE_SIZE"

    const-string v3, "android.media.browse.extra.PAGE"

    const/4 v4, -0x1

    if-nez p0, :cond_2

    .line 34
    invoke-virtual {p1, v3, v4}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result p0

    if-ne p0, v4, :cond_1

    .line 35
    invoke-virtual {p1, v2, v4}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result p0

    if-ne p0, v4, :cond_1

    return v0

    :cond_1
    return v1

    :cond_2
    if-nez p1, :cond_4

    .line 37
    invoke-virtual {p0, v3, v4}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result p1

    if-ne p1, v4, :cond_3

    .line 38
    invoke-virtual {p0, v2, v4}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result p0

    if-ne p0, v4, :cond_3

    return v0

    :cond_3
    return v1

    .line 40
    :cond_4
    invoke-virtual {p0, v3, v4}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v5

    .line 41
    invoke-virtual {p1, v3, v4}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v3

    if-ne v5, v3, :cond_5

    .line 42
    invoke-virtual {p0, v2, v4}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result p0

    .line 43
    invoke-virtual {p1, v2, v4}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result p1

    if-ne p0, p1, :cond_5

    return v0

    :cond_5
    return v1
.end method

.method public static ۧ()Lbin/mt/json/JSONObject;
    .locals 10

    .line 154
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "string"

    const-string v2, "Workspace id used for this patch."

    .line 103
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "workspaceId"

    .line 155
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Edit session id that was modified."

    .line 103
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "editSessionId"

    .line 156
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Patched zip_entry locator."

    .line 103
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "locator"

    .line 157
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "integer"

    const-string v3, "Entry size after patch; equal-length replacement keeps it unchanged."

    .line 110
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "entrySize"

    .line 158
    invoke-virtual {v0, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "Total requested byte count covered by all patch ranges, including no-op replacements."

    .line 110
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "bytesPatched"

    .line 159
    invoke-virtual {v0, v5, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "description"

    const-string v6, "Applied patch ranges sorted by byteOffset. Hex strings are uppercase without spaces and can be reused as expectedHex."

    const-string v7, "type"

    const-string v8, "array"

    .line 0
    invoke-static {v7, v8, v3, v6}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 167
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "0-based patched byte offset."

    .line 110
    invoke-static {v2, v7}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v8, "byteOffset"

    .line 168
    invoke-virtual {v6, v8, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "Patched byte count for this range."

    .line 110
    invoke-static {v2, v7}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    .line 169
    invoke-virtual {v6, v5, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "Original bytes before patch, uppercase hex without spaces."

    .line 96
    invoke-static {v1, v6}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "beforeHex"

    .line 170
    invoke-virtual {v5, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "afterHex"

    const-string v7, "Replacement bytes after patch, uppercase hex without spaces."

    const-string v9, "One applied patch range."

    .line 0
    invoke-static {v5, v1, v7, v6, v9}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "items"

    .line 167
    invoke-virtual {v3, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "patches"

    .line 160
    invoke-virtual {v0, v5, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "Successful patch_bytes data."

    .line 154
    invoke-static {v0, v3}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 175
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "Rejected ZIP entry name, or null."

    .line 103
    invoke-static {v1, v5}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "entryName"

    .line 176
    invoke-virtual {v3, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "Unsupported-entry reason token such as resources_arsc, dex_entry, axml_entry, directory, or not_raw_zip_entry, or null for non-unsupported errors. not_raw_zip_entry means the current entry view is not raw ZIP bytes."

    .line 103
    invoke-static {v1, v5}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "reason"

    .line 177
    invoke-virtual {v3, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "Rejected byte offset, or null."

    .line 117
    invoke-static {v2, v5}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    .line 178
    invoke-virtual {v3, v8, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "Exclusive rejected end offset, or null."

    .line 117
    invoke-static {v2, v5}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "endByteOffset"

    .line 179
    invoke-virtual {v3, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "Entry size for range errors, or null."

    .line 117
    invoke-static {v2, v5}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 180
    invoke-virtual {v3, v4, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Expected uppercase hex for a mismatch, or null."

    .line 103
    invoke-static {v1, v3}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "expectedHex"

    .line 181
    invoke-virtual {v2, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Actual uppercase hex read at byteOffset for a mismatch, or null."

    .line 103
    invoke-static {v1, v3}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "actualHex"

    .line 182
    invoke-virtual {v2, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 183
    invoke-static {}, Ll/ۨܺܺ;->֫()Lbin/mt/json/JSONObject;

    move-result-object v2

    invoke-static {v2}, Ll/֫ۛ᩻;->ܽ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "firstRange"

    invoke-virtual {v1, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 184
    invoke-static {}, Ll/ۨܺܺ;->֫()Lbin/mt/json/JSONObject;

    move-result-object v2

    invoke-static {v2}, Ll/֫ۛ᩻;->ܽ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "secondRange"

    invoke-virtual {v1, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "patch_bytes diagnostics."

    .line 175
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 32
    invoke-static {v1}, Ll/֫ۛ᩻;->ۧ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "inspect"

    .line 197
    invoke-static {}, Ll/ۧᩳܽ;->ۜ()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "mt_apk_read_bytes"

    .line 196
    invoke-static {v3, v4, v2}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 199
    invoke-static {}, Ll/ۧᩳܽ;->ۜ()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "retry"

    .line 198
    invoke-static {v3, v4, v5}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "mt_apk_workspace_open"

    .line 201
    invoke-static {}, Ll/ۧᩳܽ;->ܳ()Lbin/mt/json/JSONObject;

    move-result-object v6

    .line 200
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

    const-string v2, "Successful patch_bytes returns a read_bytes verification action starting at the first patched offset; mismatch errors may also return read_bytes for the actual window. A corrupt workspace whose source APK remains accessible may return mt_apk_workspace_open to recreate it."

    .line 194
    invoke-static {v2, v5}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Result for mt_apk_patch_bytes. data describes the patched byte ranges in one ZIP entry and nextActions contains a mt_apk_read_bytes read-back action for the window starting at the first patched offset. A corrupt workspace whose source APK remains accessible may return an mt_apk_workspace_open retry action."

    .line 30
    invoke-static {v3, v0, v1, v2}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public static ۧ(I[B)S
    .locals 1

    add-int/lit8 v0, p0, 0x1

    .line 106
    aget-byte p0, p1, p0

    and-int/lit16 p0, p0, 0xff

    aget-byte p1, p1, v0

    shl-int/lit8 p1, p1, 0x8

    or-int/2addr p0, p1

    int-to-short p0, p0

    return p0
.end method

.method public static ܽ(I[B)I
    .locals 1

    add-int/lit8 v0, p0, 0x1

    .line 134
    aget-byte p0, p1, p0

    and-int/lit16 p0, p0, 0xff

    aget-byte p1, p1, v0

    and-int/lit16 p1, p1, 0xff

    shl-int/lit8 p1, p1, 0x8

    or-int/2addr p0, p1

    return p0
.end method
