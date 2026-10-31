.class public final Ll/ܽܿۜ;
.super Ljava/lang/Object;
.source "B7AT"


# instance fields
.field public final ֫:Z

.field public final ۧ:Z

.field public final ܽ:Ljava/lang/String;

.field public final ܿ:Ljava/lang/String;

.field public final ᩳ:Ll/ۨۘܽ;


# direct methods
.method public constructor <init>(Ll/ۨۘܽ;Ljava/lang/String;ZLjava/lang/String;Z)V
    .locals 0

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput-object p1, p0, Ll/ܽܿۜ;->ᩳ:Ll/ۨۘܽ;

    .line 50
    iput-object p2, p0, Ll/ܽܿۜ;->ܿ:Ljava/lang/String;

    .line 51
    iput-boolean p3, p0, Ll/ܽܿۜ;->֫:Z

    .line 52
    iput-object p4, p0, Ll/ܽܿۜ;->ܽ:Ljava/lang/String;

    .line 53
    iput-boolean p5, p0, Ll/ܽܿۜ;->ۧ:Z

    return-void
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ll/ܽܿۜ;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v3, p1

    move-object/from16 v5, p2

    const-string v1, "literal"

    .line 70
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const-string v4, "regex"

    if-nez v2, :cond_1

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    .line 71
    :cond_0
    invoke-static/range {p1 .. p1}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    filled-new-array {v1, v4}, [Ljava/lang/String;

    move-result-object v2

    .line 72
    invoke-static {v2}, Lbin/mt/json/JSON;->array([Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v2

    .line 73
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "queryType"

    invoke-virtual {v3, v4, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "Invalid queryType"

    .line 71
    invoke-static {v3, v4, v0, v2, v1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_1
    :goto_0
    const-string v2, "contains"

    .line 75
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3

    const-string v6, "exact"

    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    goto :goto_1

    .line 76
    :cond_2
    invoke-static/range {p2 .. p2}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    filled-new-array {v2, v6}, [Ljava/lang/String;

    move-result-object v1

    .line 77
    invoke-static {v1}, Lbin/mt/json/JSON;->array([Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v1

    .line 78
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "matchMode"

    invoke-virtual {v3, v4, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Invalid matchMode"

    .line 76
    invoke-static {v3, v4, v0, v1, v2}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 80
    :cond_3
    :goto_1
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x8

    goto :goto_2

    :cond_4
    const/16 v2, 0x10

    :goto_2
    if-nez p3, :cond_5

    or-int/lit8 v2, v2, 0x42

    .line 98
    :cond_5
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    const/4 v1, 0x0

    .line 199
    :goto_3
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v1, v4, :cond_1f

    .line 200
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-static {v4}, Ll/ܽܿۜ;->֫(C)Z

    move-result v4

    if-eqz v4, :cond_6

    goto/16 :goto_a

    :cond_6
    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_7
    const/4 v1, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    .line 118
    :goto_4
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    move-result v15

    if-ge v1, v15, :cond_1f

    .line 119
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v15

    const/16 v3, 0x5c

    if-eqz v4, :cond_b

    if-ne v15, v3, :cond_8

    add-int/lit8 v3, v1, 0x1

    move/from16 v16, v4

    .line 121
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v3, v4, :cond_9

    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    move/from16 v17, v3

    const/16 v3, 0x45

    if-ne v4, v3, :cond_9

    const/4 v1, 0x0

    move/from16 v1, v17

    const/4 v4, 0x0

    goto/16 :goto_c

    :cond_8
    move/from16 v16, v4

    .line 124
    :cond_9
    invoke-static {v15}, Ll/ܽܿۜ;->֫(C)Z

    move-result v3

    if-eqz v3, :cond_a

    if-nez v9, :cond_a

    goto/16 :goto_a

    .line 126
    :cond_a
    invoke-static {v15}, Ll/ܽܿۜ;->֫(C)Z

    move-result v3

    if-eqz v3, :cond_1e

    if-nez v10, :cond_1e

    goto/16 :goto_8

    :cond_b
    move/from16 v16, v4

    if-eqz v6, :cond_10

    if-eqz v7, :cond_c

    const/4 v8, 0x0

    .line 135
    :cond_c
    invoke-static {v15}, Ll/ܽܿۜ;->֫(C)Z

    move-result v3

    if-eqz v3, :cond_d

    if-nez v7, :cond_d

    goto/16 :goto_a

    .line 137
    :cond_d
    invoke-static {v15}, Ll/ܽܿۜ;->֫(C)Z

    move-result v3

    if-eqz v3, :cond_e

    if-nez v11, :cond_e

    const/4 v14, 0x1

    :cond_e
    const/16 v3, 0x51

    if-ne v15, v3, :cond_f

    const/4 v4, 0x1

    move v9, v7

    move v10, v11

    goto :goto_5

    :cond_f
    move/from16 v4, v16

    :goto_5
    const/4 v3, 0x0

    const/4 v6, 0x0

    goto/16 :goto_c

    :cond_10
    if-ne v15, v3, :cond_11

    const/4 v3, 0x1

    move/from16 v4, v16

    const/4 v6, 0x1

    goto/16 :goto_c

    :cond_11
    if-eqz v7, :cond_17

    if-eqz v8, :cond_12

    const/16 v4, 0x5e

    if-ne v15, v4, :cond_12

    const/4 v3, 0x0

    const/4 v11, 0x1

    :goto_6
    const/4 v8, 0x0

    goto :goto_7

    :cond_12
    const/16 v4, 0x5d

    if-ne v15, v4, :cond_14

    if-nez v11, :cond_13

    if-nez v12, :cond_13

    if-nez v13, :cond_13

    if-eqz v14, :cond_13

    goto/16 :goto_a

    :cond_13
    const/4 v7, 0x0

    goto :goto_7

    :cond_14
    const/16 v4, 0x26

    if-ne v15, v4, :cond_15

    add-int/lit8 v8, v1, 0x1

    .line 162
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v8, v3, :cond_15

    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-ne v3, v4, :cond_15

    const/4 v3, 0x0

    const/4 v12, 0x1

    goto :goto_6

    :cond_15
    const/16 v3, 0x5b

    if-ne v15, v3, :cond_16

    const/4 v3, 0x0

    const/4 v13, 0x1

    goto :goto_6

    :cond_16
    const/4 v3, 0x0

    goto :goto_6

    :goto_7
    if-nez v11, :cond_1e

    .line 171
    invoke-static {v15}, Ll/ܽܿۜ;->֫(C)Z

    move-result v3

    if-eqz v3, :cond_1e

    :goto_8
    const/4 v3, 0x1

    move/from16 v4, v16

    const/4 v14, 0x1

    goto/16 :goto_c

    :cond_17
    const/16 v3, 0x5b

    if-ne v15, v3, :cond_18

    const/4 v3, 0x1

    const/4 v4, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move/from16 v4, v16

    const/4 v7, 0x1

    const/4 v8, 0x1

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    goto :goto_c

    :cond_18
    const/16 v3, 0x28

    if-ne v15, v3, :cond_1d

    add-int/lit8 v3, v1, 0x1

    .line 218
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v3, v4, :cond_1e

    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x3f

    if-eq v3, v4, :cond_19

    goto :goto_b

    :cond_19
    add-int/lit8 v3, v1, 0x2

    .line 221
    :goto_9
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v3, v4, :cond_1e

    .line 222
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v15, 0x29

    if-eq v4, v15, :cond_1e

    const/16 v15, 0x3a

    if-ne v4, v15, :cond_1a

    goto :goto_b

    :cond_1a
    const/16 v15, 0x78

    if-ne v4, v15, :cond_1b

    goto :goto_d

    :cond_1b
    const/16 v15, 0x2d

    if-eq v4, v15, :cond_1c

    const/16 v15, 0x69

    if-eq v4, v15, :cond_1c

    const/16 v15, 0x6d

    if-eq v4, v15, :cond_1c

    const/16 v15, 0x73

    if-eq v4, v15, :cond_1c

    const/16 v15, 0x64

    if-eq v4, v15, :cond_1c

    const/16 v15, 0x75

    if-eq v4, v15, :cond_1c

    const/16 v15, 0x63

    if-eq v4, v15, :cond_1c

    const/16 v15, 0x55

    if-eq v4, v15, :cond_1c

    goto :goto_b

    :cond_1c
    add-int/lit8 v3, v3, 0x1

    goto :goto_9

    :cond_1d
    const/16 v3, 0x2f

    if-ne v15, v3, :cond_1e

    :goto_a
    const/4 v1, 0x1

    const/4 v6, 0x1

    goto :goto_e

    :cond_1e
    :goto_b
    move/from16 v4, v16

    :goto_c
    add-int/lit8 v1, v1, 0x1

    move-object/from16 v3, p1

    goto/16 :goto_4

    :cond_1f
    :goto_d
    const/4 v1, 0x0

    const/4 v6, 0x0

    .line 86
    :goto_e
    :try_start_0
    new-instance v7, Ll/ܽܿۜ;

    invoke-static {v2, v0}, Ll/ۨۘܽ;->֫(ILjava/lang/String;)Ll/ۨۘܽ;

    move-result-object v2

    move-object v1, v7

    move-object/from16 v3, p1

    move/from16 v4, p3

    move-object/from16 v5, p2

    invoke-direct/range {v1 .. v6}, Ll/ܽܿۜ;-><init>(Ll/ۨۘܽ;Ljava/lang/String;ZLjava/lang/String;Z)V
    :try_end_0
    .catch Ll/۬ۘܽ; {:try_start_0 .. :try_end_0} :catch_0

    return-object v7

    .line 89
    :catch_0
    invoke-static/range {p0 .. p0}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    .line 90
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v1

    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "AndroidManifest"

    const-string v4, "query"

    invoke-virtual {v2, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Invalid query"

    .line 89
    invoke-static {v3, v4, v0, v1, v2}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
.end method

.method public static ֫(C)Z
    .locals 1

    const/16 v0, 0x2e

    if-eq p0, v0, :cond_1

    const/16 v0, 0x2f

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

.method public static ֫(Ll/ۗۛ᩻;)Z
    .locals 1

    .line 260
    iget-object p0, p0, Ll/ۗۛ᩻;->᩸:Ljava/lang/String;

    const-string v0, "REGEX_TIMEOUT"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "REGEX_RESOURCE_LIMIT"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

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


# virtual methods
.method public final ֫()Ll/ۧܿۜ;
    .locals 3

    .line 241
    new-instance v0, Ll/ۧܿۜ;

    iget-object v1, p0, Ll/ܽܿۜ;->ᩳ:Ll/ۨۘܽ;

    const-string v2, ""

    invoke-virtual {v1, v2}, Ll/ۨۘܽ;->matcher(Ljava/lang/CharSequence;)Ll/۫ۘܽ;

    move-result-object v1

    const/16 v2, 0x1f4

    invoke-virtual {v1, v2}, Ll/۫ۘܽ;->setTimeoutMillis(I)V

    invoke-direct {v0, p0, v1}, Ll/ۧܿۜ;-><init>(Ll/ܽܿۜ;Ll/۫ۘܽ;)V

    return-object v0
.end method
