.class public final Ll/᩹ܿۜ;
.super Ljava/lang/Object;
.source "Y6M7"


# direct methods
.method public static ֫(C)I
    .locals 2

    const/16 v0, 0x30

    if-lt p0, v0, :cond_0

    const/16 v1, 0x39

    if-gt p0, v1, :cond_0

    sub-int/2addr p0, v0

    return p0

    :cond_0
    const/16 v0, 0x61

    if-lt p0, v0, :cond_1

    const/16 v0, 0x66

    if-gt p0, v0, :cond_1

    add-int/lit8 p0, p0, -0x57

    return p0

    :cond_1
    const/16 v0, 0x41

    if-lt p0, v0, :cond_2

    const/16 v0, 0x46

    if-gt p0, v0, :cond_2

    add-int/lit8 p0, p0, -0x37

    return p0

    :cond_2
    const/4 p0, -0x1

    return p0
.end method

.method public static ֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONArray;
    .locals 0

    .line 126
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 127
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isArray()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->asArray()Lbin/mt/json/JSONArray;

    move-result-object p1

    invoke-virtual {p1}, Lbin/mt/json/JSONArray;->size()I

    move-result p1

    if-eqz p1, :cond_0

    .line 130
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->asArray()Lbin/mt/json/JSONArray;

    move-result-object p0

    return-object p0

    :cond_0
    const-string p1, "Expected a non-empty array"

    .line 128
    invoke-static {p0, p1, p2}, Ll/᩹ܿۜ;->֫(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method public static ֫(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 2

    .line 152
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p1, p2, p0, v0, v1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Lbin/mt/json/JSONObject;)Ll/ܶ᩻ۜ;
    .locals 37

    move-object/from16 v0, p0

    const-string v1, ".valueXml"

    const-string v2, ".variant"

    const-string v3, "valueXml"

    const-string v4, ".values"

    const-string v5, "resource:"

    const-string v6, ".packageId"

    const-string v7, "packageId"

    const-string v8, ".kind"

    const-string v9, "]"

    const-string v10, ".locator"

    const-string v11, "locator"

    const-string v12, "kind"

    const-string v13, "variant"

    const-string v14, "adds"

    const-string v15, "editSessionId"

    move-object/from16 v16, v1

    const-string v1, "workspaceId"

    const/16 v17, 0x0

    const/16 v18, -0x1

    move-object/from16 v19, v2

    :try_start_0
    const-string v2, ""

    move-object/from16 v20, v3

    .line 26
    filled-new-array {v1, v15, v14}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v2, v3}, Ll/᩹ܿۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;[Ljava/lang/String;)V

    .line 27
    invoke-static {v0, v1, v1}, Ll/᩹ܿۜ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2
    :try_end_0
    .catch Ll/ۗۛ᩻; {:try_start_0 .. :try_end_0} :catch_15

    .line 28
    :try_start_1
    invoke-static {v0, v15, v15}, Ll/᩹ܿۜ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3
    :try_end_1
    .catch Ll/ۗۛ᩻; {:try_start_1 .. :try_end_1} :catch_14

    .line 29
    :try_start_2
    invoke-static {v0, v14, v14}, Ll/᩹ܿۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v0
    :try_end_2
    .catch Ll/ۗۛ᩻; {:try_start_2 .. :try_end_2} :catch_13

    move-object/from16 v21, v15

    .line 30
    :try_start_3
    invoke-virtual {v0}, Lbin/mt/json/JSONArray;->size()I

    move-result v15
    :try_end_3
    .catch Ll/ۗۛ᩻; {:try_start_3 .. :try_end_3} :catch_12

    move-object/from16 v22, v1

    const/16 v1, 0xc8

    if-gt v15, v1, :cond_c

    .line 33
    :try_start_4
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
    :try_end_4
    .catch Ll/ۗۛ᩻; {:try_start_4 .. :try_end_4} :catch_10

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v18, -0x1

    const/16 v23, -0x1

    move-object/from16 v26, v2

    move-object/from16 v24, v17

    move-object/from16 v25, v24

    .line 35
    :goto_0
    :try_start_5
    invoke-virtual {v0}, Lbin/mt/json/JSONArray;->size()I

    move-result v2
    :try_end_5
    .catch Ll/ۗۛ᩻; {:try_start_5 .. :try_end_5} :catch_f

    if-ge v15, v2, :cond_b

    .line 40
    :try_start_6
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_6
    .catch Ll/ۗۛ᩻; {:try_start_6 .. :try_end_6} :catch_c

    move-object/from16 v27, v3

    :try_start_7
    const-string v3, "adds["

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 41
    invoke-virtual {v0, v15}, Lbin/mt/json/JSONArray;->get(I)Lbin/mt/json/JSONValue;

    move-result-object v3
    :try_end_7
    .catch Ll/ۗۛ᩻; {:try_start_7 .. :try_end_7} :catch_b

    move-object/from16 p0, v0

    const-string v0, "Expected an object"

    if-eqz v3, :cond_a

    .line 119
    :try_start_8
    invoke-virtual {v3}, Lbin/mt/json/JSONValue;->isObject()Z

    move-result v18

    if-eqz v18, :cond_a

    .line 122
    invoke-virtual {v3}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object v3
    :try_end_8
    .catch Ll/ۗۛ᩻; {:try_start_8 .. :try_end_8} :catch_b

    move/from16 v28, v15

    .line 42
    :try_start_9
    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v15, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v15

    invoke-static {v3, v12, v15}, Ll/᩹ܿۜ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    move-object/from16 v29, v8

    const-string v8, "resource"

    .line 44
    invoke-virtual {v8, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8
    :try_end_9
    .catch Ll/ۗۛ᩻; {:try_start_9 .. :try_end_9} :catch_9

    move-object/from16 v30, v1

    const-string v1, "values"

    if-eqz v8, :cond_2

    .line 45
    :try_start_a
    filled-new-array {v12, v7, v1}, [Ljava/lang/String;

    move-result-object v8

    invoke-static {v3, v2, v8}, Ll/᩹ܿۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;[Ljava/lang/String;)V

    .line 46
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v3, v7, v8}, Ll/᩹ܿۜ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    move-object/from16 v31, v7

    .line 47
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    move-object/from16 v32, v6

    .line 101
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v6

    move-object/from16 v18, v0

    const/4 v0, 0x4

    if-ne v6, v0, :cond_1

    const-string v0, "0x"

    invoke-virtual {v8, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x2

    .line 102
    invoke-virtual {v8, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Ll/᩹ܿۜ;->֫(C)I

    move-result v0

    const/4 v6, 0x3

    .line 103
    invoke-virtual {v8, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    invoke-static {v6}, Ll/᩹ܿۜ;->֫(C)I

    move-result v6

    if-ltz v0, :cond_1

    if-ltz v6, :cond_1

    if-nez v0, :cond_0

    if-eqz v6, :cond_1

    :cond_0
    mul-int/lit8 v0, v0, 0x10

    add-int/2addr v0, v6

    move-object/from16 v6, v17

    goto :goto_1

    :cond_1
    const-string v0, "packageId must be 0x followed by two hex digits in 0x01..0xff"

    .line 108
    invoke-static {v8}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v1

    invoke-static {v1, v0, v7}, Ll/᩹ܿۜ;->֫(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_2
    move-object/from16 v18, v0

    move-object/from16 v32, v6

    move-object/from16 v31, v7

    .line 48
    invoke-virtual {v13, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 49
    filled-new-array {v12, v11, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v2, v0}, Ll/᩹ܿۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;[Ljava/lang/String;)V

    .line 50
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v11, v0}, Ll/᩹ܿۜ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 51
    invoke-virtual {v0, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_8

    const/16 v6, 0x9

    .line 54
    invoke-virtual {v0, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v0, v6}, Ll/ۡᩳۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_a
    .catch Ll/ۗۛ᩻; {:try_start_a .. :try_end_a} :catch_9

    const/4 v6, -0x1

    move-object v6, v0

    const/4 v0, -0x1

    .line 59
    :goto_1
    :try_start_b
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v3, v1, v7}, Ll/᩹ܿۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v1

    .line 60
    invoke-virtual {v1}, Lbin/mt/json/JSONArray;->size()I

    move-result v3

    rsub-int v7, v14, 0xc8

    if-gt v3, v7, :cond_7

    .line 64
    invoke-virtual {v1}, Lbin/mt/json/JSONArray;->size()I

    move-result v3

    add-int/2addr v14, v3

    .line 65
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V
    :try_end_b
    .catch Ll/ۗۛ᩻; {:try_start_b .. :try_end_b} :catch_8

    const/4 v7, 0x0

    const/4 v8, -0x1

    move-object/from16 v25, v17

    const/16 v23, -0x1

    .line 66
    :goto_2
    :try_start_c
    invoke-virtual {v1}, Lbin/mt/json/JSONArray;->size()I

    move-result v8
    :try_end_c
    .catch Ll/ۗۛ᩻; {:try_start_c .. :try_end_c} :catch_6

    if-ge v7, v8, :cond_6

    .line 69
    :try_start_d
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v33, v12

    const-string v12, ".values["

    invoke-virtual {v8, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 70
    invoke-virtual {v1, v7}, Lbin/mt/json/JSONArray;->get(I)Lbin/mt/json/JSONValue;

    move-result-object v12

    if-eqz v12, :cond_5

    .line 119
    invoke-virtual {v12}, Lbin/mt/json/JSONValue;->isObject()Z

    move-result v23

    if-eqz v23, :cond_5

    .line 122
    invoke-virtual {v12}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object v12

    move-object/from16 v34, v9

    move-object/from16 v9, v20

    move/from16 v20, v14

    .line 71
    filled-new-array {v13, v9}, [Ljava/lang/String;

    move-result-object v14

    invoke-static {v12, v8, v14}, Ll/᩹ܿۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;[Ljava/lang/String;)V

    .line 72
    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_d
    .catch Ll/ۗۛ᩻; {:try_start_d .. :try_end_d} :catch_3

    move-object/from16 v35, v11

    move-object/from16 v11, v19

    :try_start_e
    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-static {v12, v13, v14}, Ll/᩹ܿۜ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14
    :try_end_e
    .catch Ll/ۗۛ᩻; {:try_start_e .. :try_end_e} :catch_2

    move-object/from16 v19, v13

    :try_start_f
    const-string v13, "*"

    .line 73
    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_4

    .line 77
    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_f
    .catch Ll/ۗۛ᩻; {:try_start_f .. :try_end_f} :catch_1

    move-object/from16 v36, v5

    move-object/from16 v5, v16

    :try_start_10
    invoke-virtual {v13, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v9, v13}, Ll/᩹ܿۜ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 78
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v13

    move-object/from16 v16, v9

    const/high16 v9, 0x100000

    if-gt v13, v9, :cond_3

    .line 82
    new-instance v8, Ll/۠᩻ۜ;

    invoke-direct {v8, v14, v12}, Ll/۠᩻ۜ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v8, v7, 0x1

    move/from16 v23, v7

    move v7, v8

    move-object/from16 v25, v14

    move-object/from16 v13, v19

    move/from16 v14, v20

    move-object/from16 v12, v33

    move-object/from16 v9, v34

    move-object/from16 v19, v11

    move-object/from16 v20, v16

    move-object/from16 v11, v35

    move-object/from16 v16, v5

    move-object/from16 v5, v36

    goto/16 :goto_2

    :cond_3
    const-string v0, "valueXml exceeds 1048576 UTF-16 code units"

    .line 79
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 80
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {v2}, Lbin/mt/json/JSON;->value(I)Lbin/mt/json/JSONValue;

    move-result-object v2

    .line 79
    invoke-static {v2, v0, v1}, Ll/᩹ܿۜ;->֫(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_4
    move-object/from16 v36, v5

    const-string v0, "variant must be concrete, not *"

    .line 74
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 75
    invoke-static {v14}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v2

    .line 74
    invoke-static {v2, v0, v1}, Ll/᩹ܿۜ;->֫(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
    :try_end_10
    .catch Ll/ۗۛ᩻; {:try_start_10 .. :try_end_10} :catch_0

    :catch_0
    move-exception v0

    goto :goto_3

    :catch_1
    move-exception v0

    move-object/from16 v36, v5

    :goto_3
    move/from16 v23, v7

    move-object/from16 v17, v14

    goto/16 :goto_7

    :catch_2
    move-exception v0

    move-object/from16 v36, v5

    goto :goto_4

    :catch_3
    move-exception v0

    move-object/from16 v36, v5

    move-object/from16 v35, v11

    :goto_4
    move-object/from16 v19, v13

    goto :goto_5

    :cond_5
    move-object/from16 v36, v5

    move-object/from16 v35, v11

    move-object/from16 v19, v13

    move-object/from16 v0, v18

    .line 120
    :try_start_11
    invoke-static {v12, v0, v8}, Ll/᩹ܿۜ;->֫(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
    :try_end_11
    .catch Ll/ۗۛ᩻; {:try_start_11 .. :try_end_11} :catch_4

    :catch_4
    move-exception v0

    :goto_5
    move/from16 v23, v7

    goto :goto_7

    :cond_6
    move-object/from16 v36, v5

    move-object/from16 v34, v9

    move-object/from16 v35, v11

    move-object/from16 v33, v12

    move-object/from16 v5, v16

    move-object/from16 v11, v19

    move-object/from16 v16, v20

    move-object/from16 v19, v13

    move/from16 v20, v14

    .line 84
    :try_start_12
    new-instance v1, Ll/֨᩻ۜ;

    invoke-direct {v1, v0, v15, v6, v3}, Ll/֨᩻ۜ;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V

    move-object/from16 v0, v30

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_12
    .catch Ll/ۗۛ᩻; {:try_start_12 .. :try_end_12} :catch_5

    add-int/lit8 v15, v28, 0x1

    move-object v1, v0

    move-object/from16 v24, v6

    move-object/from16 v13, v19

    move/from16 v14, v20

    move-object/from16 v3, v27

    move/from16 v18, v28

    move-object/from16 v8, v29

    move-object/from16 v7, v31

    move-object/from16 v6, v32

    move-object/from16 v12, v33

    move-object/from16 v9, v34

    move-object/from16 v0, p0

    move-object/from16 v19, v11

    move-object/from16 v20, v16

    move-object/from16 v11, v35

    move-object/from16 v16, v5

    move-object/from16 v5, v36

    goto/16 :goto_0

    :catch_5
    move-exception v0

    goto :goto_6

    :catch_6
    move-exception v0

    move-object/from16 v36, v5

    move-object/from16 v35, v11

    move-object/from16 v19, v13

    :goto_6
    move-object/from16 v17, v25

    :goto_7
    move-object/from16 v1, v17

    move-object/from16 v2, v26

    move-object/from16 v3, v27

    move/from16 v15, v28

    goto/16 :goto_10

    :cond_7
    move-object/from16 v36, v5

    move-object/from16 v35, v11

    move-object/from16 v19, v13

    :try_start_13
    const-string v0, "The total number of values must not exceed 200"

    .line 61
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 62
    invoke-virtual {v1}, Lbin/mt/json/JSONArray;->size()I

    move-result v1

    invoke-static {v1}, Lbin/mt/json/JSON;->value(I)Lbin/mt/json/JSONValue;

    move-result-object v1

    .line 61
    invoke-static {v1, v0, v2}, Ll/᩹ܿۜ;->֫(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
    :try_end_13
    .catch Ll/ۗۛ᩻; {:try_start_13 .. :try_end_13} :catch_7

    :catch_7
    move-exception v0

    goto/16 :goto_a

    :catch_8
    move-exception v0

    move-object/from16 v36, v5

    move-object/from16 v35, v11

    move-object/from16 v19, v13

    goto/16 :goto_a

    :cond_8
    move-object/from16 v36, v5

    move-object/from16 v35, v11

    move-object/from16 v19, v13

    :try_start_14
    const-string v1, "Expected a resource locator"

    .line 52
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    invoke-static {v0, v1, v2}, Ll/᩹ܿۜ;->֫(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_9
    move-object/from16 v36, v5

    move-object/from16 v35, v11

    move-object/from16 v19, v13

    const-string v0, "kind must be resource or variant"

    .line 57
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v2, v29

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v15}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v2

    invoke-static {v2, v0, v1}, Ll/᩹ܿۜ;->֫(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :catch_9
    move-exception v0

    move-object/from16 v36, v5

    move-object/from16 v35, v11

    move-object/from16 v19, v13

    goto :goto_9

    :cond_a
    move-object/from16 v36, v5

    move-object/from16 v35, v11

    move-object/from16 v19, v13

    move/from16 v28, v15

    .line 120
    invoke-static {v3, v0, v2}, Ll/᩹ܿۜ;->֫(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
    :try_end_14
    .catch Ll/ۗۛ᩻; {:try_start_14 .. :try_end_14} :catch_a

    :catch_a
    move-exception v0

    goto :goto_9

    :catch_b
    move-exception v0

    goto :goto_8

    :catch_c
    move-exception v0

    move-object/from16 v27, v3

    :goto_8
    move-object/from16 v36, v5

    move-object/from16 v35, v11

    move-object/from16 v19, v13

    move/from16 v28, v15

    :goto_9
    move-object/from16 v6, v17

    :goto_a
    move-object/from16 v24, v6

    move-object/from16 v2, v26

    move-object/from16 v3, v27

    move/from16 v18, v28

    goto/16 :goto_f

    :cond_b
    move-object v0, v1

    move-object/from16 v27, v3

    move-object/from16 v36, v5

    move-object/from16 v35, v11

    move-object/from16 v19, v13

    .line 87
    :try_start_15
    new-instance v1, Ll/ܶ᩻ۜ;
    :try_end_15
    .catch Ll/ۗۛ᩻; {:try_start_15 .. :try_end_15} :catch_e

    move-object/from16 v2, v26

    move-object/from16 v3, v27

    :try_start_16
    invoke-direct {v1, v2, v3, v0}, Ll/ܶ᩻ۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V
    :try_end_16
    .catch Ll/ۗۛ᩻; {:try_start_16 .. :try_end_16} :catch_d

    return-object v1

    :catch_d
    move-exception v0

    goto :goto_b

    :catch_e
    move-exception v0

    move-object/from16 v2, v26

    move-object/from16 v3, v27

    goto :goto_b

    :catch_f
    move-exception v0

    move-object/from16 v36, v5

    move-object/from16 v35, v11

    move-object/from16 v19, v13

    move-object/from16 v2, v26

    :goto_b
    move/from16 v15, v18

    move-object/from16 v6, v24

    move-object/from16 v1, v25

    goto/16 :goto_10

    :catch_10
    move-exception v0

    :goto_c
    move-object/from16 v36, v5

    move-object/from16 v35, v11

    move-object/from16 v19, v13

    goto :goto_d

    :cond_c
    move-object/from16 p0, v0

    move-object/from16 v36, v5

    move-object/from16 v35, v11

    move-object/from16 v19, v13

    :try_start_17
    const-string v0, "adds must contain at most 200 items"

    .line 31
    invoke-virtual/range {p0 .. p0}, Lbin/mt/json/JSONArray;->size()I

    move-result v1

    invoke-static {v1}, Lbin/mt/json/JSON;->value(I)Lbin/mt/json/JSONValue;

    move-result-object v1

    invoke-static {v1, v0, v14}, Ll/᩹ܿۜ;->֫(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
    :try_end_17
    .catch Ll/ۗۛ᩻; {:try_start_17 .. :try_end_17} :catch_11

    :catch_11
    move-exception v0

    goto :goto_d

    :catch_12
    move-exception v0

    move-object/from16 v22, v1

    goto :goto_c

    :catch_13
    move-exception v0

    move-object/from16 v22, v1

    move-object/from16 v36, v5

    move-object/from16 v35, v11

    move-object/from16 v19, v13

    move-object/from16 v21, v15

    :goto_d
    move-object/from16 v24, v17

    goto :goto_f

    :catch_14
    move-exception v0

    move-object/from16 v22, v1

    move-object/from16 v36, v5

    move-object/from16 v35, v11

    move-object/from16 v19, v13

    move-object/from16 v21, v15

    goto :goto_e

    :catch_15
    move-exception v0

    move-object/from16 v22, v1

    move-object/from16 v36, v5

    move-object/from16 v35, v11

    move-object/from16 v19, v13

    move-object/from16 v21, v15

    move-object/from16 v2, v17

    :goto_e
    move-object/from16 v3, v17

    move-object/from16 v24, v3

    :goto_f
    const/16 v23, -0x1

    move-object/from16 v1, v17

    move/from16 v15, v18

    move-object/from16 v6, v24

    .line 90
    :goto_10
    iget-object v4, v0, Ll/ۗۛ᩻;->᩶:Lbin/mt/json/JSONObject;

    move-object/from16 v5, v22

    invoke-virtual {v4, v5, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    move-object/from16 v4, v21

    .line 91
    invoke-virtual {v2, v4, v3}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    if-gez v15, :cond_d

    .line 92
    sget-object v3, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_11

    :cond_d
    invoke-static {v15}, Lbin/mt/json/JSON;->value(I)Lbin/mt/json/JSONValue;

    move-result-object v3

    :goto_11
    const-string v4, "failedAddIndex"

    invoke-virtual {v2, v4, v3}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    if-gez v23, :cond_e

    .line 93
    sget-object v3, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_12

    :cond_e
    invoke-static/range {v23 .. v23}, Lbin/mt/json/JSON;->value(I)Lbin/mt/json/JSONValue;

    move-result-object v3

    :goto_12
    const-string v4, "failedValueIndex"

    invoke-virtual {v2, v4, v3}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    if-nez v6, :cond_f

    .line 94
    sget-object v3, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_13

    :cond_f
    move-object/from16 v3, v36

    invoke-virtual {v3, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v3

    :goto_13
    move-object/from16 v4, v35

    invoke-virtual {v2, v4, v3}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    move-object/from16 v3, v19

    .line 95
    invoke-virtual {v2, v3, v1}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    .line 96
    throw v0
.end method

.method public static varargs ֫(Lbin/mt/json/JSONObject;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 3

    .line 142
    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    .line 143
    invoke-virtual {p0}, Lbin/mt/json/JSONObject;->names()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 144
    invoke-interface {p2, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 146
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_1

    move-object p1, v1

    goto :goto_0

    :cond_1
    const-string p2, "."

    .line 0
    invoke-static {p1, p2, v1}, Ll/᩺۠ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 146
    :goto_0
    invoke-virtual {p0, v1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    const-string p2, "Invalid mt_apk_resource_add argument"

    .line 145
    invoke-static {p0, p2, p1}, Ll/᩹ܿۜ;->֫(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    :cond_2
    return-void
.end method

.method public static ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 134
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 135
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isString()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    .line 138
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const-string p1, "Expected a non-empty string"

    .line 136
    invoke-static {p0, p1, p2}, Ll/᩹ܿۜ;->֫(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method
