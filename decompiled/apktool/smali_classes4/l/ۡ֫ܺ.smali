.class public final Ll/ۡ֫ܺ;
.super Ll/֫֫ܺ;
.source "CAUR"


# virtual methods
.method public final ֫(Ll/ۨ۟ۡ;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    .line 22
    iget-object v3, v0, Ll/ۨ۟ۡ;->ۛ:Ll/۟۟ۡ;

    iget-object v4, v0, Ll/ۨ۟ۡ;->᩸:Ll/᩻֫ܺ;

    .line 24
    iget v5, v3, Ll/۟۟ۡ;->۠:I

    const/4 v6, 0x0

    const/16 v7, 0x8

    if-ne v5, v7, :cond_0

    .line 25
    invoke-virtual {v3}, Ll/۟۟ۡ;->ۢ()V

    return-object v6

    .line 29
    :cond_0
    iget v8, v0, Ll/ۨ۟ۡ;->ۨ:I

    const/4 v9, 0x2

    const-string v10, "syntax error"

    const/4 v11, 0x0

    if-ne v8, v9, :cond_1

    .line 30
    iput v11, v0, Ll/ۨ۟ۡ;->ۨ:I

    goto :goto_0

    :cond_1
    const/16 v8, 0xc

    if-ne v5, v8, :cond_1c

    .line 40
    :goto_0
    const-class v5, Ljava/lang/Throwable;

    if-eqz v2, :cond_2

    instance-of v8, v2, Ljava/lang/Class;

    if-eqz v8, :cond_2

    .line 41
    check-cast v2, Ljava/lang/Class;

    .line 42
    invoke-virtual {v5, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v8

    if-eqz v8, :cond_2

    goto :goto_1

    :cond_2
    move-object v2, v6

    :goto_1
    move-object v8, v6

    move-object v9, v8

    move-object v11, v9

    .line 53
    :cond_3
    :goto_2
    iget-object v12, v0, Ll/ۨ۟ۡ;->ܰ:Ll/ۢ֫ܺ;

    invoke-virtual {v3, v12}, Ll/۟۟ۡ;->֫(Ll/ۢ֫ܺ;)Ljava/lang/String;

    move-result-object v12

    const/16 v14, 0xd

    const/16 v15, 0x10

    if-nez v12, :cond_5

    .line 56
    iget v13, v3, Ll/۟۟ۡ;->۠:I

    if-ne v13, v14, :cond_4

    .line 57
    invoke-virtual {v3, v15}, Ll/۟۟ۡ;->ۧ(I)V

    goto/16 :goto_5

    :cond_4
    if-ne v13, v15, :cond_5

    goto :goto_2

    .line 65
    :cond_5
    invoke-virtual {v3}, Ll/۟۟ۡ;->ۡ()V

    const-string v13, "@type"

    .line 67
    invoke-virtual {v13, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    const/4 v14, 0x4

    if-eqz v13, :cond_7

    .line 68
    iget v2, v3, Ll/۟۟ۡ;->۠:I

    if-ne v2, v14, :cond_6

    .line 69
    invoke-virtual {v3}, Ll/۟۟ۡ;->۠()Ljava/lang/String;

    move-result-object v2

    .line 70
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2}, Ll/᩵ۧܺ;->ᩳ(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    .line 74
    invoke-virtual {v3, v15}, Ll/۟۟ۡ;->ۧ(I)V

    goto :goto_4

    .line 72
    :cond_6
    new-instance v0, Ll/ܶ۟ۡ;

    .line 25
    invoke-direct {v0, v10}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 72
    throw v0

    :cond_7
    const-string v13, "message"

    .line 75
    invoke-virtual {v13, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_a

    .line 76
    iget v9, v3, Ll/۟۟ۡ;->۠:I

    if-ne v9, v7, :cond_8

    const/4 v9, 0x0

    goto :goto_3

    :cond_8
    if-ne v9, v14, :cond_9

    .line 79
    invoke-virtual {v3}, Ll/۟۟ۡ;->۠()Ljava/lang/String;

    move-result-object v9

    .line 83
    :goto_3
    invoke-virtual {v3}, Ll/۟۟ۡ;->ۢ()V

    goto :goto_4

    .line 81
    :cond_9
    new-instance v0, Ll/ܶ۟ۡ;

    .line 25
    invoke-direct {v0, v10}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 81
    throw v0

    :cond_a
    const-string v13, "cause"

    .line 84
    invoke-virtual {v13, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_b

    const/4 v8, 0x0

    .line 85
    invoke-virtual {v1, v0, v8, v13}, Ll/ۡ֫ܺ;->֫(Ll/ۨ۟ۡ;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Throwable;

    goto :goto_4

    :cond_b
    const/4 v13, 0x0

    const-string v14, "stackTrace"

    .line 86
    invoke-virtual {v14, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_c

    .line 87
    const-class v11, [Ljava/lang/StackTraceElement;

    .line 673
    invoke-virtual {v0, v13, v11}, Ll/ۨ۟ۡ;->֫(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v11

    .line 87
    check-cast v11, [Ljava/lang/StackTraceElement;

    goto :goto_4

    :cond_c
    if-nez v6, :cond_d

    .line 90
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 1380
    :cond_d
    invoke-virtual {v0, v13}, Ll/ۨ۟ۡ;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    .line 92
    invoke-interface {v6, v12, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    :goto_4
    iget v12, v3, Ll/۟۟ۡ;->۠:I

    const/16 v13, 0xd

    if-ne v12, v13, :cond_3

    .line 96
    invoke-virtual {v3, v15}, Ll/۟۟ۡ;->ۧ(I)V

    :goto_5
    if-nez v2, :cond_e

    .line 103
    new-instance v0, Ljava/lang/Exception;

    invoke-direct {v0, v9, v8}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v3, 0x0

    goto/16 :goto_a

    .line 109
    :cond_e
    :try_start_0
    invoke-virtual {v2}, Ljava/lang/Class;->getConstructors()[Ljava/lang/reflect/Constructor;

    move-result-object v0

    array-length v3, v0

    const/4 v7, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    :goto_6
    if-ge v12, v3, :cond_12

    aget-object v14, v0, v12

    .line 110
    invoke-virtual {v14}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v15

    array-length v15, v15

    if-nez v15, :cond_f

    move-object/from16 p1, v0

    move/from16 p3, v3

    move-object v10, v14

    goto :goto_7

    .line 115
    :cond_f
    invoke-virtual {v14}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v15

    array-length v15, v15
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object/from16 p1, v0

    const-class v0, Ljava/lang/String;

    move/from16 p3, v3

    const/4 v3, 0x1

    if-ne v15, v3, :cond_10

    :try_start_1
    invoke-virtual {v14}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v3

    const/4 v15, 0x0

    aget-object v3, v3, v15

    if-ne v3, v0, :cond_10

    move-object v7, v14

    goto :goto_7

    .line 120
    :cond_10
    invoke-virtual {v14}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v3

    array-length v3, v3

    const/4 v15, 0x2

    if-ne v3, v15, :cond_11

    invoke-virtual {v14}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v3

    const/4 v15, 0x0

    aget-object v3, v3, v15

    if-ne v3, v0, :cond_11

    .line 121
    invoke-virtual {v14}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v0

    const/4 v3, 0x1

    aget-object v0, v0, v3

    if-ne v0, v5, :cond_11

    move-object v13, v14

    :cond_11
    :goto_7
    add-int/lit8 v12, v12, 0x1

    move-object/from16 v0, p1

    move/from16 v3, p3

    goto :goto_6

    :cond_12
    if-eqz v13, :cond_13

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v9, v0, v3

    const/4 v3, 0x1

    aput-object v8, v0, v3

    .line 128
    invoke-virtual {v13, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    goto :goto_8

    :cond_13
    if-eqz v7, :cond_14

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v9, v0, v3

    .line 130
    invoke-virtual {v7, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    :goto_8
    const/4 v3, 0x0

    goto :goto_9

    :cond_14
    if-eqz v10, :cond_15

    const/4 v0, 0x0

    .line 132
    invoke-virtual {v10, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Throwable;

    move-object/from16 v16, v3

    move-object v3, v0

    move-object/from16 v0, v16

    goto :goto_9

    :cond_15
    const/4 v0, 0x0

    move-object v3, v0

    :goto_9
    if-nez v0, :cond_16

    .line 136
    new-instance v0, Ljava/lang/Exception;

    invoke-direct {v0, v9, v8}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :cond_16
    :goto_a
    if-eqz v11, :cond_17

    .line 144
    invoke-virtual {v0, v11}, Ljava/lang/Throwable;->setStackTrace([Ljava/lang/StackTraceElement;)V

    :cond_17
    if-eqz v6, :cond_1b

    if-eqz v2, :cond_19

    .line 151
    iget-object v5, v1, Ll/֫֫ܺ;->ܽ:Ljava/lang/Class;

    if-ne v2, v5, :cond_18

    move-object v3, v1

    goto :goto_b

    .line 154
    :cond_18
    invoke-virtual {v4, v2}, Ll/᩻֫ܺ;->֫(Ljava/lang/reflect/Type;)Ll/᩵֫ܺ;

    move-result-object v2

    .line 155
    instance-of v4, v2, Ll/֫֫ܺ;

    if-eqz v4, :cond_19

    .line 156
    move-object v3, v2

    check-cast v3, Ll/֫֫ܺ;

    :cond_19
    :goto_b
    if-eqz v3, :cond_1b

    .line 162
    invoke-interface {v6}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1a
    :goto_c
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    .line 163
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 164
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    .line 166
    invoke-virtual {v3, v5}, Ll/֫֫ܺ;->֫(Ljava/lang/String;)Ll/ᩴ֫ܺ;

    move-result-object v5

    if-eqz v5, :cond_1a

    .line 168
    invoke-virtual {v5, v0, v4}, Ll/ᩴ֫ܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_c

    :cond_1b
    return-object v0

    :catch_0
    move-exception v0

    .line 139
    new-instance v2, Ll/ܶ۟ۡ;

    const-string v3, "create instance error"

    .line 29
    invoke-direct {v2, v3, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 139
    throw v2

    .line 33
    :cond_1c
    new-instance v0, Ll/ܶ۟ۡ;

    .line 25
    invoke-direct {v0, v10}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 33
    throw v0
.end method
