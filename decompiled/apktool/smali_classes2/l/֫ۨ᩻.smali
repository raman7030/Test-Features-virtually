.class public final Ll/֫ۨ᩻;
.super Ljava/lang/Object;
.source "P776"


# direct methods
.method public static ֫(Ll/ܶ᩵ܿ;Ll/۟ۢۜ;Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 11

    .line 122
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 123
    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    .line 124
    new-instance v2, Ll/ۨۛ᩻;

    const-string v3, ""

    invoke-direct {v2, p0, v3}, Ll/ۨۛ᩻;-><init>(Ll/ܶ᩵ܿ;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 125
    :cond_0
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_5

    .line 126
    invoke-virtual {v1}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۨۛ᩻;

    .line 127
    iget-object v2, p0, Ll/ۨۛ᩻;->֫:Ll/ܶ᩵ܿ;

    iget-object p0, p0, Ll/ۨۛ᩻;->ۧ:Ljava/lang/String;

    const/4 v3, 0x1

    .line 413
    invoke-virtual {v2, v3}, Ll/ܶ᩵ܿ;->ۧ(Z)Ljava/util/List;

    move-result-object v2

    .line 128
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Ll/ܶ᩵ܿ;

    .line 130
    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ll/۟ۢۜ;->֫(Ljava/lang/String;)Ll/᩺ۢۜ;

    move-result-object v3

    iget-object v3, v3, Ll/᩺ۢۜ;->֫:Ll/ۛۢۜ;

    invoke-virtual {v3}, Ll/ۛۢۜ;->֫()Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_0

    .line 133
    :cond_2
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_3

    .line 134
    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :cond_3
    const-string v3, "/"

    .line 0
    invoke-static {p0, v3}, Ll/۟֫ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 135
    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    :goto_1
    move-object v6, v3

    .line 136
    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v3

    if-eqz v3, :cond_4

    .line 192
    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->᩸֫()Z

    move-result v3

    if-nez v3, :cond_1

    .line 138
    new-instance v3, Ll/ۨۛ᩻;

    invoke-direct {v3, v5, v6}, Ll/ۨۛ᩻;-><init>(Ll/ܶ᩵ܿ;Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/util/LinkedList;->addLast(Ljava/lang/Object;)V

    goto :goto_0

    .line 140
    :cond_4
    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->۠֫()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 192
    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->᩸֫()Z

    move-result v3

    if-nez v3, :cond_1

    .line 140
    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v3

    .line 185
    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v3, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    const-string v4, ".apk"

    invoke-virtual {v3, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 141
    invoke-virtual {v6, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 142
    new-instance v3, Ll/᩺ۛ᩻;

    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v7

    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->ۛ֫()J

    move-result-wide v9

    move-object v4, v3

    invoke-direct/range {v4 .. v10}, Ll/᩺ۛ᩻;-><init>(Ll/ܶ᩵ܿ;Ljava/lang/String;JJ)V

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_5
    return-object v0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 4

    if-nez p0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    .line 243
    :cond_0
    invoke-static {p0}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    :goto_0
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 244
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, ""

    const-string v3, "prefix"

    invoke-virtual {v1, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 242
    invoke-static {p1, v3, p0, v0, v1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;IIZ)Ll/۟ۛ᩻;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v5, p1

    if-eqz v0, :cond_18

    .line 96
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    const-string v0, ""

    :cond_0
    move-object v1, v0

    goto/16 :goto_6

    .line 99
    :cond_1
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v4, 0x2f

    if-eq v1, v4, :cond_17

    const/16 v1, 0x5c

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    if-gez v1, :cond_17

    invoke-virtual {v0, v3}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    if-gez v1, :cond_17

    const/16 v1, 0x3a

    .line 251
    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    if-gtz v1, :cond_2

    goto :goto_3

    :cond_2
    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_17

    .line 256
    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v6

    const/16 v7, 0x7a

    const/16 v8, 0x61

    const/16 v9, 0x5a

    const/16 v10, 0x41

    if-nez v4, :cond_4

    if-lt v6, v10, :cond_3

    if-le v6, v9, :cond_5

    :cond_3
    if-lt v6, v8, :cond_9

    if-gt v6, v7, :cond_9

    goto :goto_1

    :cond_4
    if-lt v6, v10, :cond_6

    if-le v6, v9, :cond_5

    goto :goto_2

    :cond_5
    :goto_1
    move/from16 v8, p2

    goto/16 :goto_e

    :cond_6
    :goto_2
    if-lt v6, v8, :cond_7

    if-le v6, v7, :cond_5

    :cond_7
    const/16 v7, 0x30

    if-lt v6, v7, :cond_8

    const/16 v7, 0x39

    if-le v6, v7, :cond_5

    :cond_8
    const/16 v7, 0x2b

    if-eq v6, v7, :cond_5

    const/16 v7, 0x2d

    if-eq v6, v7, :cond_5

    const/16 v7, 0x2e

    if-ne v6, v7, :cond_9

    goto :goto_1

    :cond_9
    :goto_3
    const-string v1, "/"

    const/4 v4, -0x1

    .line 103
    invoke-virtual {v0, v1, v4}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    .line 104
    :goto_4
    array-length v6, v1

    if-ge v4, v6, :cond_0

    .line 105
    aget-object v6, v1, v4

    .line 106
    array-length v7, v1

    sub-int/2addr v7, v2

    if-ne v4, v7, :cond_a

    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_a

    goto :goto_5

    .line 110
    :cond_a
    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_b

    const-string v7, "."

    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_b

    const-string v7, ".."

    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_b

    :goto_5
    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    :cond_b
    const-string v1, "prefix must not contain empty, dot, or parent segments"

    .line 111
    invoke-static {v0, v1}, Ll/֫ۨ᩻;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 43
    :goto_6
    invoke-static {}, Ll/᩹ۤ᩻;->֫()Ll/᩸ۤ᩻;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩸ۤ᩻;->֫()Ll/۟ۢۜ;

    move-result-object v0

    .line 44
    iget-object v2, v0, Ll/۟ۢۜ;->ۧ:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ll/۟ۢۜ;->ܽ(Ljava/lang/String;)V

    const/4 v4, 0x0

    if-eqz p3, :cond_d

    .line 45
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_d

    .line 154
    invoke-static {}, Ll/ۧۨ᩻;->֫()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_c

    goto :goto_7

    :cond_c
    :try_start_0
    const-string v7, "path"

    .line 159
    invoke-static {v6, v7}, Ll/۫ۡۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6
    :try_end_0
    .catch Ll/ۗۛ᩻; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_8

    :catch_0
    :cond_d
    :goto_7
    move-object v6, v4

    :goto_8
    if-nez v6, :cond_e

    .line 48
    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    goto :goto_9

    .line 49
    :cond_e
    filled-new-array {v2, v6}, [Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    :goto_9
    new-array v8, v3, [Ljava/lang/String;

    .line 50
    invoke-static {v2, v8}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v2

    .line 52
    invoke-static {}, Ll/᩹ۤ᩻;->ۧ()Ll/ۛۖۜ;

    move-result-object v8

    invoke-virtual {v8, v7}, Ll/ۛۖۜ;->֫(Ljava/util/List;)Ll/ۤۖۜ;

    move-result-object v7

    .line 53
    :try_start_1
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v9, "warning"

    if-eqz v8, :cond_16

    .line 57
    :try_start_2
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v8

    if-eqz v8, :cond_15

    .line 61
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->ᩴ()Z

    move-result v8

    if-eqz v8, :cond_14

    .line 66
    invoke-static {v2, v0, v1}, Ll/֫ۨ᩻;->֫(Ll/ܶ᩵ܿ;Ll/۟ۢۜ;Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    .line 67
    new-instance v2, Ll/ۛۛ᩻;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-static {v2}, Ll/۠۬ᩴ;->comparing(Ljava/util/function/Function;)Ljava/util/Comparator;

    move-result-object v2

    invoke-static {v0, v2}, Ll/ۛ۬ᩴ;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 68
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    move/from16 v8, p2

    invoke-static {v8, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 69
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8, v5}, Ljava/util/ArrayList;-><init>(I)V

    if-eqz p3, :cond_12

    if-nez v2, :cond_12

    .line 72
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_12

    if-nez v6, :cond_f

    goto :goto_a

    :cond_f
    new-array v9, v3, [Ljava/lang/String;

    .line 174
    invoke-static {v6, v9}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v11

    .line 175
    invoke-virtual {v11}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v6

    if-eqz v6, :cond_11

    invoke-virtual {v11}, Ll/ܶ᩵ܿ;->۠֫()Z

    move-result v6

    if-nez v6, :cond_10

    goto :goto_a

    .line 178
    :cond_10
    new-instance v4, Ll/᩺ۛ᩻;

    const-string v12, "mt://current-apk"

    invoke-virtual {v11}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v13

    invoke-virtual {v11}, Ll/ܶ᩵ܿ;->ۛ֫()J

    move-result-wide v15

    move-object v10, v4

    invoke-direct/range {v10 .. v16}, Ll/᩺ۛ᩻;-><init>(Ll/ܶ᩵ܿ;Ljava/lang/String;JJ)V

    invoke-static {v4}, Ll/֫ۨ᩻;->֫(Ll/᩺ۛ᩻;)Ll/ܰۛ᩻;

    move-result-object v4

    :cond_11
    :goto_a
    if-eqz v4, :cond_12

    .line 75
    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v5, -0x1

    const/4 v4, 0x1

    goto :goto_b

    :cond_12
    move v3, v5

    const/4 v4, 0x0

    :goto_b
    add-int/2addr v3, v2

    .line 80
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v6

    invoke-static {v3, v6}, Ljava/lang/Math;->min(II)I

    move-result v6

    :goto_c
    if-ge v2, v6, :cond_13

    .line 82
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩺ۛ᩻;

    invoke-static {v3}, Ll/֫ۨ᩻;->֫(Ll/᩺ۛ᩻;)Ll/ܰۛ᩻;

    move-result-object v3

    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_c

    .line 84
    :cond_13
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/2addr v4, v2

    .line 85
    new-instance v9, Ll/۟ۛ᩻;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    move-object v0, v9

    move-object v2, v8

    move/from16 v5, p1

    invoke-direct/range {v0 .. v6}, Ll/۟ۛ᩻;-><init>(Ljava/lang/String;Ljava/util/ArrayList;IIII)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 86
    invoke-virtual {v7}, Ll/ۤۖۜ;->close()V

    return-object v9

    :cond_14
    :try_start_3
    const-string v0, "AVAILABLE_APK_DIRECTORY_UNREADABLE"

    const-string v1, "Available APK directory is not readable."

    .line 62
    invoke-static {v4, v0, v1, v9}, Ll/ۗۛ᩻;->֫(Lbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_15
    const-string v0, "AVAILABLE_APK_DIRECTORY_NOT_DIRECTORY"

    const-string v1, "Available APK path is not a directory."

    .line 58
    invoke-static {v0, v1}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_16
    const-string v0, "AVAILABLE_APK_DIRECTORY_NOT_FOUND"

    const-string v1, "Available APK directory does not exist."

    .line 54
    invoke-static {v4, v0, v1, v9}, Ll/ۗۛ᩻;->֫(Lbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    move-exception v0

    move-object v1, v0

    .line 51
    :try_start_4
    invoke-virtual {v7}, Ll/ۤۖۜ;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_d

    :catchall_1
    move-exception v0

    move-object v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_d
    throw v1

    :goto_e
    add-int/lit8 v4, v4, 0x1

    const/4 v2, 0x1

    goto/16 :goto_0

    :cond_17
    const-string v1, "prefix must be a relative path prefix"

    .line 101
    invoke-static {v0, v1}, Ll/֫ۨ᩻;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_18
    const-string v1, "prefix must be a string"

    .line 94
    invoke-static {v0, v1}, Ll/֫ۨ᩻;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
.end method

.method public static ֫(Ll/᩺ۛ᩻;)Ll/ܰۛ᩻;
    .locals 15

    const/4 v0, 0x0

    .line 200
    :try_start_0
    new-instance v1, Ll/ᩳܰۡ;

    iget-object v2, p0, Ll/᩺ۛ᩻;->֫:Ll/ܶ᩵ܿ;

    invoke-direct {v1, v2}, Ll/ᩳܰۡ;-><init>(Ll/ܶ᩵ܿ;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 201
    :try_start_1
    invoke-static {v1}, Ll/ۗۨ᩻;->֫(Ll/ᩳܰۡ;)Ll/᩶ۨ᩻;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 202
    :try_start_2
    invoke-virtual {v1}, Ll/ᩳܰۡ;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_2

    :catchall_0
    move-exception v2

    .line 200
    :try_start_3
    invoke-virtual {v1}, Ll/ᩳܰۡ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v1

    :try_start_4
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v2
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception v1

    .line 235
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_0

    const-string v1, "Failed to parse APK manifest."

    goto :goto_1

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    .line 40
    :goto_1
    new-instance v2, Ll/᩶ۨ᩻;

    invoke-direct {v2}, Ll/᩶ۨ᩻;-><init>()V

    .line 41
    iput-boolean v0, v2, Ll/᩶ۨ᩻;->ܽ:Z

    .line 42
    iput-object v1, v2, Ll/᩶ۨ᩻;->ᩳ:Ljava/lang/String;

    .line 205
    :goto_2
    iget-object v1, v2, Ll/᩶ۨ᩻;->֫:Ljava/lang/String;

    if-eqz v1, :cond_1

    :goto_3
    move-object v9, v1

    goto :goto_4

    :cond_1
    iget-object v1, v2, Ll/᩶ۨ᩻;->ۧ:Ljava/lang/String;

    goto :goto_3

    .line 206
    :goto_4
    new-instance v1, Ll/ܰۛ᩻;

    iget-object v4, p0, Ll/᩺ۛ᩻;->ܽ:Ljava/lang/String;

    iget-wide v5, p0, Ll/᩺ۛ᩻;->ᩳ:J

    iget-wide v7, p0, Ll/᩺ۛ᩻;->ۧ:J

    iget-object v10, v2, Ll/᩶ۨ᩻;->᩻:Ljava/lang/String;

    iget-object v11, v2, Ll/᩶ۨ᩻;->ۢ:Ljava/lang/String;

    iget-object p0, v2, Ll/᩶ۨ᩻;->᩷:Ljava/lang/String;

    const/4 v3, 0x0

    if-eqz p0, :cond_5

    .line 215
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v12

    if-eqz v12, :cond_2

    goto :goto_6

    .line 218
    :cond_2
    :goto_5
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v12

    if-ge v0, v12, :cond_4

    .line 219
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v12

    const/16 v13, 0x30

    if-lt v12, v13, :cond_5

    const/16 v13, 0x39

    if-le v12, v13, :cond_3

    goto :goto_6

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_5

    .line 225
    :cond_4
    :try_start_5
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v12

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0
    :try_end_5
    .catch Ljava/lang/NumberFormatException; {:try_start_5 .. :try_end_5} :catch_1

    move-object v12, p0

    goto :goto_7

    :catch_1
    :cond_5
    :goto_6
    move-object v12, v3

    .line 207
    :goto_7
    iget-boolean v13, v2, Ll/᩶ۨ᩻;->ܽ:Z

    iget-object v14, v2, Ll/᩶ۨ᩻;->ᩳ:Ljava/lang/String;

    move-object v3, v1

    invoke-direct/range {v3 .. v14}, Ll/ܰۛ᩻;-><init>(Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;ZLjava/lang/String;)V

    return-object v1
.end method
