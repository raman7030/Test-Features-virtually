.class public final Ll/۠ۢᩳ;
.super Ljava/lang/Object;
.source "81Y6"


# static fields
.field private static final ۡ۟ۨ:[S


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x91

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/۠ۢᩳ;->ۡ۟ۨ:[S

    return-void

    :array_0
    .array-data 2
        0x689s
        -0x229ds
        -0x2286s
        -0x228cs
        -0x22aes
        -0x22a7s
        -0x22b2s
        -0x22a7s
        -0x22e9s
        -0x22acs
        -0x22a7s
        -0x22aas
        -0x22a1s
        -0x22e9s
        -0x2295s
        -0x22b4s
        -0x22b6s
        -0x22afs
        -0x22aas
        -0x22a1s
        -0x22fds
        -0x228cs
        -0x22aes
        -0x22a7s
        -0x22b2s
        -0x22a7s
        -0x22e9s
        -0x22acs
        -0x22a7s
        -0x22aas
        -0x22a1s
        -0x22e9s
        -0x2295s
        -0x22b4s
        -0x22b6s
        -0x22afs
        -0x22aas
        -0x22a1s
        -0x22fds
        -0x228cs
        -0x22aes
        -0x22a7s
        -0x22b2s
        -0x22a7s
        -0x22e9s
        -0x22acs
        -0x22a7s
        -0x22aas
        -0x22a1s
        -0x22e9s
        -0x2295s
        -0x22b4s
        -0x22b6s
        -0x22afs
        -0x22aas
        -0x22a1s
        -0x22fds
        -0x228cs
        -0x22aes
        -0x22a7s
        -0x22b2s
        -0x22a7s
        -0x22e9s
        -0x22acs
        -0x22a7s
        -0x22aas
        -0x22a1s
        -0x22e9s
        -0x2295s
        -0x22b4s
        -0x22b6s
        -0x22afs
        -0x22aas
        -0x22a1s
        -0x22fds
        -0x229ds
        -0x2286s
        -0x229ds
        -0x2295s
        -0x228fs
        -0x228fs
        -0x228fs
        -0x228cs
        -0x22aes
        -0x22a7s
        -0x22b2s
        -0x22a7s
        -0x22e9s
        -0x22acs
        -0x22a7s
        -0x22aas
        -0x22a1s
        -0x22e9s
        -0x2289s
        -0x22a6s
        -0x22aes
        -0x22a3s
        -0x22a5s
        -0x22b4s
        -0x22fds
        -0x228cs
        -0x22aes
        -0x22a7s
        -0x22b2s
        -0x22a7s
        -0x22e9s
        -0x22acs
        -0x22a7s
        -0x22aas
        -0x22a1s
        -0x22e9s
        -0x2289s
        -0x22a6s
        -0x22aes
        -0x22a3s
        -0x22a5s
        -0x22b4s
        -0x22fds
        -0x228fs
        -0x228fs
        -0x228fs
        -0x22b4s
        -0x22a3s
        -0x22abs
        -0x22b8s
        -0x22eas
        -0x22a6s
        -0x22b3s
        -0x22afs
        -0x22acs
        -0x22a4s
        -0x22eas
        -0x22a4s
        -0x22a3s
        -0x22c0s
        -0x22a9s
        -0x22b3s
        -0x22b4s
        -0x22eas
        -0x22a7s
        -0x22b8s
        -0x22ads
        -0x22b3s
        -0x22afs
        -0x22a4s
    .end array-data
.end method

.method public static ֫(Ll/ܶ᩵ܿ;Ll/ۙۡᩳ;ZZLjava/util/List;Ll/۟ۤ;Ll/ۚۢᩳ;)Ljava/util/Set;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v7, p6

    sget-object v1, Ll/۠ۢᩳ;->ۡ۟ۨ:[S

    const/4 v2, 0x0

    aget-short v1, v1, v2

    mul-int/lit16 v2, v1, 0x5c9c

    add-int/lit16 v1, v1, 0x1727

    mul-int v1, v1, v1

    sub-int/2addr v1, v2

    if-ltz v1, :cond_0

    const v1, 0xdd38

    const v8, 0xdd38

    goto :goto_0

    :cond_0
    const/16 v1, 0x883

    const/16 v8, 0x883

    .line 48
    :goto_0
    new-instance v9, Ll/ܿۡᩳ;

    move-object v1, v9

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move/from16 v4, p2

    move/from16 v5, p3

    move-object/from16 v6, p6

    invoke-direct/range {v1 .. v6}, Ll/ܿۡᩳ;-><init>(Ll/ܶ᩵ܿ;Ll/ۙۡᩳ;ZZLl/ۚۢᩳ;)V

    .line 240
    iget-object v1, v9, Ll/ܿۡᩳ;->ۧ:Ll/ۧۤᩴ;

    const/4 v2, -0x1

    if-eqz p4, :cond_c

    invoke-static/range {p4 .. p4}, Ll/ۖ;->᩺ۚۧ(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_5

    .line 244
    :cond_1
    invoke-static/range {p4 .. p4}, Ll/֫ܽ;->֨ۚܿ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    invoke-static {v3}, Ll/֡ܶ;->ۛܿ᩻(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_c

    invoke-static {v3}, Ll/ۖۘ;->ᩴۛۚ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۚܽۚ;

    .line 245
    invoke-static {v4}, Ll/֡ܶ;->ۨۙ᩷(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const/16 v6, 0x2a

    invoke-static {v5, v6}, Ll/ۘᩴ;->᩹ۙᩴ(Ljava/lang/Object;I)I

    move-result v5

    if-ne v5, v2, :cond_3

    invoke-interface {v4}, Ll/ۚܽۚ;->ܳ()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v6}, Ll/ۘᩴ;->᩹ۙᩴ(Ljava/lang/Object;I)I

    move-result v4

    if-eq v4, v2, :cond_2

    .line 253
    :cond_3
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 254
    invoke-static/range {p4 .. p4}, Ll/֫ܽ;->֨ۚܿ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v4

    :cond_4
    :goto_1
    invoke-static {v4}, Ll/֫ۧ;->۫ܶܺ(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_d

    invoke-static {v4}, Ll/֨۫;->۬ۖܳ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۚܽۚ;

    .line 255
    invoke-static {v5}, Ll/֡ܶ;->ۨۙ᩷(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    .line 256
    invoke-interface {v5}, Ll/ۚܽۚ;->ܳ()Ljava/lang/String;

    move-result-object v11

    .line 257
    invoke-static {v10, v6}, Ll/ۘᩴ;->᩹ۙᩴ(Ljava/lang/Object;I)I

    move-result v12

    if-ne v12, v2, :cond_5

    invoke-static {v11, v6}, Ll/ۘᩴ;->᩹ۙᩴ(Ljava/lang/Object;I)I

    move-result v12

    if-ne v12, v2, :cond_5

    .line 258
    invoke-static {v3, v5}, Ll/۟;->ᩴۗᩳ(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_1

    .line 261
    :cond_5
    invoke-static {v10}, Ll/᩻ۡᩳ;->֫(Ljava/lang/String;)Ll/۫ۘܽ;

    move-result-object v10

    .line 262
    invoke-static {v11, v6}, Ll/ۘᩴ;->᩹ۙᩴ(Ljava/lang/Object;I)I

    move-result v12

    if-ne v12, v2, :cond_8

    .line 263
    invoke-virtual {v1, v11}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/֡᩷ۚ;

    if-nez v11, :cond_6

    goto :goto_1

    .line 267
    :cond_6
    invoke-virtual {v11}, Ll/֡᩷ۚ;->ۧܽ()Ll/᩻۫ܺ;

    move-result-object v11

    invoke-static {v11}, Ll/֡ۨ;->ۜܿ᩵(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v11

    :cond_7
    :goto_2
    invoke-static {v11}, Ll/֡ܶ;->ۛܿ᩻(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_4

    invoke-static {v11}, Ll/ۖۘ;->ᩴۛۚ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/֨ۢۚ;

    .line 268
    invoke-static {v5, v12}, Ll/᩻ۡᩳ;->֫(Ll/ۚܽۚ;Ll/ۚܽۚ;)Z

    move-result v13

    if-eqz v13, :cond_7

    .line 269
    invoke-static {v12}, Ll/֫ۧ;->᩺ۧܿ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v10, v13}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V

    invoke-virtual {v10}, Ll/۫ۘܽ;->matches()Z

    move-result v13

    if-eqz v13, :cond_7

    .line 270
    sget-object v13, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v13, v12}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 271
    invoke-static {v3, v12}, Ll/֫ܺ;->ܽۚ᩸(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_2

    .line 276
    :cond_8
    invoke-static {v11}, Ll/᩻ۡᩳ;->֫(Ljava/lang/String;)Ll/۫ۘܽ;

    move-result-object v11

    .line 277
    invoke-virtual {v1}, Ll/ۧۤᩴ;->values()Ljava/util/Collection;

    move-result-object v12

    invoke-static {v12}, Ll/᩺;->۬֫ۚ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v12

    :cond_9
    :goto_3
    invoke-static {v12}, Ll/֫ۧ;->۫ܶܺ(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_4

    invoke-static {v12}, Ll/֨۫;->۬ۖܳ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ll/֡᩷ۚ;

    .line 278
    invoke-static {v13}, Ll/֫֫;->֫ۜۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v11, v14}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V

    invoke-virtual {v11}, Ll/۫ۘܽ;->matches()Z

    move-result v14

    if-nez v14, :cond_a

    goto :goto_3

    .line 281
    :cond_a
    invoke-virtual {v13}, Ll/֡᩷ۚ;->ۧܽ()Ll/᩻۫ܺ;

    move-result-object v13

    invoke-static {v13}, Ll/֡ۨ;->ۜܿ᩵(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v13

    :cond_b
    :goto_4
    invoke-static {v13}, Ll/֡ܶ;->ۛܿ᩻(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_9

    invoke-static {v13}, Ll/ۖۘ;->ᩴۛۚ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ll/֨ۢۚ;

    .line 282
    invoke-static {v5, v14}, Ll/᩻ۡᩳ;->֫(Ll/ۚܽۚ;Ll/ۚܽۚ;)Z

    move-result v15

    if-eqz v15, :cond_b

    .line 283
    invoke-static {v14}, Ll/֫ۧ;->᩺ۧܿ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v10, v15}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V

    invoke-virtual {v10}, Ll/۫ۘܽ;->matches()Z

    move-result v15

    if-eqz v15, :cond_b

    .line 284
    sget-object v15, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v15, v14}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 285
    invoke-static {v3, v14}, Ll/֫ܺ;->ܽۚ᩸(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_4

    :cond_c
    :goto_5
    move-object/from16 v3, p4

    .line 51
    :cond_d
    invoke-static/range {p6 .. p6}, Ll/֡᩺;->ۛۜۚ(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_e

    .line 52
    iget-object v0, v9, Ll/ܿۡᩳ;->֫:Ljava/util/HashSet;

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    return-object v0

    :cond_e
    move-object/from16 v16, p6

    .line 55
    monitor-enter v16

    .line 56
    :try_start_0
    invoke-interface/range {p6 .. p6}, Ll/ۚۢᩳ;->۠֫()V

    .line 57
    monitor-exit v16
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_6
    const/4 v4, 0x1

    add-int/2addr v2, v4

    .line 65
    new-instance v5, Ll/֨ۢᩳ;

    invoke-direct {v5, v7}, Ll/֨ۢᩳ;-><init>(Ll/ۚۢᩳ;)V

    const/4 v6, 0x2

    if-eqz v3, :cond_10

    .line 67
    invoke-static {v3}, Ll/ۖ;->᩺ۚۧ(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_10

    .line 68
    invoke-static {v3}, Ll/֫᩺;->ۗ᩷᩻(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v6

    new-array v1, v1, [Ll/᩻ۡᩳ;

    const/4 v6, 0x0

    .line 69
    :goto_7
    invoke-static {v3}, Ll/֫᩺;->ۗ᩷᩻(Ljava/lang/Object;)I

    move-result v10

    if-ge v6, v10, :cond_f

    .line 70
    new-instance v10, Ll/ۜۡᩳ;

    invoke-static {v3, v6}, Ll/᩹;->᩵֫۟(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/ۚܽۚ;

    invoke-direct {v10, v9, v5, v11}, Ll/ۜۡᩳ;-><init>(Ll/ܿۡᩳ;Ll/ۚۢᩳ;Ll/ۚܽۚ;)V

    aput-object v10, v1, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_7

    .line 72
    :cond_f
    invoke-static {v3}, Ll/ۘ᩶;->ۜܺ᩵(Ljava/lang/Object;)I

    move-result v6

    new-instance v10, Ll/ۢۡᩳ;

    invoke-direct {v10, v9, v5}, Ll/ۢۡᩳ;-><init>(Ll/ܿۡᩳ;Ll/ۚۢᩳ;)V

    aput-object v10, v1, v6

    .line 73
    invoke-static {v3}, Ll/ۘ᩶;->ۜܺ᩵(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    new-instance v10, Ll/֨ۡᩳ;

    invoke-direct {v10, v9, v7}, Ll/֨ۡᩳ;-><init>(Ll/ܿۡᩳ;Ll/ۚۢᩳ;)V

    aput-object v10, v1, v6

    goto/16 :goto_8

    :cond_10
    const/16 v10, 0xa

    new-array v10, v10, [Ll/᩻ۡᩳ;

    .line 75
    new-instance v11, Ll/ܺۡᩳ;

    sget-object v12, Ll/۠ۢᩳ;->ۡ۟ۨ:[S

    const/4 v13, 0x1

    const/16 v14, 0x14

    invoke-static {v12, v13, v14, v8}, Ll/ۘᩴ;->ۤ֨ۢ([SIII)Ljava/lang/String;

    move-result-object v12

    .line 17
    invoke-direct {v11, v9, v5, v12, v4}, Ll/ᩳۡᩳ;-><init>(Ll/ܿۡᩳ;Ll/ۚۢᩳ;Ljava/lang/String;Z)V

    .line 75
    aput-object v11, v10, v1

    new-instance v11, Ll/᩵ۡᩳ;

    sget-object v12, Ll/۠ۢᩳ;->ۡ۟ۨ:[S

    const/16 v13, 0x15

    const/16 v14, 0x12

    invoke-static {v12, v13, v14, v8}, Ll/֫ܿ;->ܰ᩷ۤ([SIII)Ljava/lang/String;

    move-result-object v12

    .line 18
    invoke-direct {v11, v9, v5, v12, v4}, Ll/ᩳۡᩳ;-><init>(Ll/ܿۡᩳ;Ll/ۚۢᩳ;Ljava/lang/String;Z)V

    aput-object v11, v10, v4

    .line 75
    new-instance v11, Ll/֡ۡᩳ;

    sget-object v12, Ll/۠ۢᩳ;->ۡ۟ۨ:[S

    const/16 v13, 0x27

    const/16 v14, 0x24

    invoke-static {v12, v13, v14, v8}, Ll/֡ܶ;->ܽ᩻᩵([SIII)Ljava/lang/String;

    move-result-object v12

    .line 17
    invoke-direct {v11, v9, v5, v12, v4}, Ll/ᩳۡᩳ;-><init>(Ll/ܿۡᩳ;Ll/ۚۢᩳ;Ljava/lang/String;Z)V

    aput-object v11, v10, v6

    .line 75
    new-instance v6, Ll/ۡۡᩳ;

    sget-object v11, Ll/۠ۢᩳ;->ۡ۟ۨ:[S

    const/16 v12, 0x4b

    const/4 v13, 0x2

    invoke-static {v11, v12, v13, v8}, Ll/ۙۨ;->֡ᩳ᩵([SIII)Ljava/lang/String;

    move-result-object v11

    .line 17
    invoke-direct {v6, v9, v5, v11, v4}, Ll/ᩳۡᩳ;-><init>(Ll/ܿۡᩳ;Ll/ۚۢᩳ;Ljava/lang/String;Z)V

    const/4 v11, 0x3

    aput-object v6, v10, v11

    .line 75
    new-instance v6, Ll/ۖۡᩳ;

    const-string v11, ""

    .line 23
    invoke-direct {v6, v9, v5, v11, v1}, Ll/ᩳۡᩳ;-><init>(Ll/ܿۡᩳ;Ll/ۚۢᩳ;Ljava/lang/String;Z)V

    const/4 v11, 0x4

    aput-object v6, v10, v11

    .line 75
    new-instance v6, Ll/ᩴۡᩳ;

    sget-object v11, Ll/۠ۢᩳ;->ۡ۟ۨ:[S

    const/16 v12, 0x4d

    const/4 v13, 0x5

    invoke-static {v11, v12, v13, v8}, Ll/ۘ᩶;->᩻ۤܶ([SIII)Ljava/lang/String;

    move-result-object v11

    .line 14
    invoke-direct {v6, v9, v5, v11, v1}, Ll/ᩳۡᩳ;-><init>(Ll/ܿۡᩳ;Ll/ۚۢᩳ;Ljava/lang/String;Z)V

    const/4 v11, 0x5

    aput-object v6, v10, v11

    .line 75
    new-instance v6, Ll/ۚۡᩳ;

    sget-object v11, Ll/۠ۢᩳ;->ۡ۟ۨ:[S

    const/16 v12, 0x52

    const/16 v13, 0x24

    invoke-static {v11, v12, v13, v8}, Ll/ۘۨ;->ۖܿۤ([SIII)Ljava/lang/String;

    move-result-object v11

    .line 22
    invoke-direct {v6, v9, v5, v11, v1}, Ll/ᩳۡᩳ;-><init>(Ll/ܿۡᩳ;Ll/ۚۢᩳ;Ljava/lang/String;Z)V

    const/4 v11, 0x6

    aput-object v6, v10, v11

    .line 75
    new-instance v6, Ll/ۢۡᩳ;

    invoke-direct {v6, v9, v5}, Ll/ۢۡᩳ;-><init>(Ll/ܿۡᩳ;Ll/ۚۢᩳ;)V

    const/4 v11, 0x7

    aput-object v6, v10, v11

    new-instance v6, Ll/ۘۡᩳ;

    sget-object v11, Ll/۠ۢᩳ;->ۡ۟ۨ:[S

    const/16 v12, 0x76

    const/4 v13, 0x3

    invoke-static {v11, v12, v13, v8}, Ll/֡ۜ;->ۜ᩶ܶ([SIII)Ljava/lang/String;

    move-result-object v11

    .line 13
    invoke-direct {v6, v9, v5, v11, v1}, Ll/ᩳۡᩳ;-><init>(Ll/ܿۡᩳ;Ll/ۚۢᩳ;Ljava/lang/String;Z)V

    const/16 v1, 0x8

    aput-object v6, v10, v1

    .line 75
    new-instance v1, Ll/֨ۡᩳ;

    invoke-direct {v1, v9, v7}, Ll/֨ۡᩳ;-><init>(Ll/ܿۡᩳ;Ll/ۚۢᩳ;)V

    const/16 v6, 0x9

    aput-object v1, v10, v6

    move-object v1, v10

    :goto_8
    const/4 v6, 0x0

    if-ne v2, v4, :cond_13

    .line 93
    :try_start_1
    const-class v4, Ll/ۖ۠ۡ;

    invoke-virtual {v4}, Ljava/lang/Class;->getFields()[Ljava/lang/reflect/Field;

    move-result-object v4

    array-length v10, v4

    const/4 v11, 0x0

    :goto_9
    if-ge v11, v10, :cond_12

    aget-object v12, v4, v11

    .line 94
    invoke-virtual {v12}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v13

    const-class v14, Ljava/lang/Integer;

    if-ne v13, v14, :cond_11

    .line 96
    invoke-virtual {v12, v6}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-static {v4}, Ll/֡۬;->֫᩺۫(Ljava/lang/Object;)I

    move-result v4

    goto :goto_a

    :cond_11
    add-int/lit8 v11, v11, 0x1

    goto :goto_9

    :cond_12
    const/4 v4, 0x0

    .line 100
    :goto_a
    invoke-static {}, Ll/֡ۨ;->۫۠ܿ()Landroid/app/Application;

    move-result-object v10

    invoke-virtual {v10}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v10

    .line 102
    invoke-static {v10}, Ll/֫᩵;->ۡ۬ܳ(Ljava/lang/Object;)Ljava/lang/Class;

    move-result-object v11

    sget-object v12, Ll/۠ۢᩳ;->ۡ۟ۨ:[S

    const/16 v13, 0x8e

    const/4 v14, 0x3

    invoke-static {v12, v13, v14, v8}, Ll/֫ۡ;->֫ܿۨ([SIII)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v11

    invoke-virtual {v11, v10}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Integer;

    invoke-static {v10}, Ll/֡۬;->֫᩺۫(Ljava/lang/Object;)I

    move-result v10
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    xor-int/2addr v4, v10

    const v10, -0x720ed8d6

    xor-int/2addr v4, v10

    if-eqz v4, :cond_13

    const/4 v4, 0x0

    goto :goto_b

    :catchall_0
    :cond_13
    const/4 v4, 0x1

    .line 110
    :goto_b
    array-length v10, v1

    invoke-virtual {v5, v10}, Ll/֨ۢᩳ;->ۢ(I)V

    .line 112
    array-length v10, v1

    const/4 v11, 0x0

    const/4 v12, 0x0

    :goto_c
    if-ge v11, v10, :cond_16

    aget-object v13, v1, v11

    .line 113
    invoke-static/range {p6 .. p6}, Ll/ۖ;->ۙ֫ۢ(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_14

    goto :goto_d

    .line 114
    :cond_14
    invoke-virtual {v13}, Ll/᩻ۡᩳ;->֫()Ljava/lang/String;

    move-object/from16 v14, p5

    if-eqz v4, :cond_15

    .line 115
    invoke-virtual {v13, v14}, Ll/᩻ۡᩳ;->֫(Ll/۟ۤ;)Z

    move-result v13

    if-eqz v13, :cond_15

    const/4 v12, 0x1

    .line 117
    :cond_15
    array-length v13, v1

    const/16 v15, 0x64

    div-int/2addr v15, v13

    invoke-virtual {v5, v15}, Ll/֨ۢᩳ;->ܿ(I)V

    add-int/lit8 v11, v11, 0x1

    goto :goto_c

    :cond_16
    :goto_d
    move-object/from16 v14, p5

    if-eqz v12, :cond_18

    .line 119
    invoke-static/range {p6 .. p6}, Ll/ۖ;->ۙ֫ۢ(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_17

    goto :goto_e

    :cond_17
    const/4 v1, 0x0

    goto/16 :goto_6

    .line 125
    :cond_18
    :goto_e
    invoke-static/range {p6 .. p6}, Ll/ۖ;->ۙ֫ۢ(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_22

    iget-object v1, v9, Ll/ܿۡᩳ;->֫:Ljava/util/HashSet;

    invoke-virtual {v1}, Ljava/util/HashSet;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_22

    .line 126
    invoke-interface/range {p6 .. p6}, Ll/ۚۢᩳ;->ۗ()V

    .line 228
    iget-object v1, v9, Ll/ܿۡᩳ;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {v1}, Ll/ۧۤᩴ;->values()Ljava/util/Collection;

    move-result-object v1

    .line 127
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    sget-object v2, Ll/۠ۢᩳ;->ۡ۟ۨ:[S

    const/16 v3, 0x79

    const/16 v4, 0xe

    invoke-static {v2, v3, v4, v8}, Ll/ۗۚ;->ۙ۟ܺ([SIII)Ljava/lang/String;

    move-result-object v2

    .line 130
    invoke-static {v0, v2}, Ll/ۘۗ;->᩸֨᩸(Ljava/lang/Object;Ljava/lang/Object;)Ll/ܶ᩵ܿ;

    move-result-object v2

    .line 132
    :try_start_2
    new-instance v3, Ll/ۡܰۡ;

    sget-object v4, Ll/۠ۢᩳ;->ۡ۟ۨ:[S

    const/16 v5, 0x87

    const/4 v10, 0x7

    invoke-static {v4, v5, v10, v8}, Ll/֨ۡ;->ۤܿۢ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Ll/ۘۗ;->᩸֨᩸(Ljava/lang/Object;Ljava/lang/Object;)Ll/ܶ᩵ܿ;

    move-result-object v0

    invoke-direct {v3, v0}, Ll/ۡܰۡ;-><init>(Ll/ܶ᩵ܿ;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 133
    :try_start_3
    iget-object v0, v9, Ll/ܿۡᩳ;->ܿ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Ll/ۗ᩵;->ۧ֡֫(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v0

    const/4 v4, 0x0

    const/4 v5, -0x1

    :goto_f
    invoke-static {v0}, Ll/֡ܶ;->ۛܿ᩻(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_21

    invoke-static {v0}, Ll/ۖۘ;->ᩴۛۚ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/Map$Entry;

    .line 134
    invoke-static/range {p6 .. p6}, Ll/ۖ;->ۙ֫ۢ(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_19

    goto/16 :goto_12

    .line 136
    :cond_19
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    .line 137
    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/Set;

    .line 139
    invoke-static {v8}, Ll/ۗ᩵;->ۧ֡֫(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v11

    :cond_1a
    invoke-static {v11}, Ll/֫ۧ;->۫ܶܺ(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_20

    invoke-static {v11}, Ll/ۖۘ;->ᩴۛۚ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    .line 140
    iget-object v13, v9, Ll/ܿۡᩳ;->֫:Ljava/util/HashSet;

    invoke-static {v13, v12}, Ll/ۙۨ;->ۚܽ֡(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_1a

    .line 149
    new-instance v11, Ll/᩵ۡۚ;

    .line 236
    iget-object v12, v9, Ll/ܿۡᩳ;->ᩳ:Ll/᩵ۡۚ;

    iget-object v12, v12, Ll/᩸ۜۚ;->᩺:Ll/۠ۗ֡;

    .line 149
    invoke-direct {v11, v12}, Ll/᩵ۡۚ;-><init>(Ll/۠ۗ֡;)V

    .line 228
    iget-object v12, v9, Ll/ܿۡᩳ;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {v12}, Ll/ۧۤᩴ;->values()Ljava/util/Collection;

    move-result-object v12

    .line 150
    invoke-static {v12}, Ll/᩹;->ܶۗ᩷(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v12

    :goto_10
    invoke-static {v12}, Ll/֫ۧ;->۫ܶܺ(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_1e

    invoke-static {v12}, Ll/֨۫;->۬ۖܳ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ll/֡᩷ۚ;

    .line 151
    invoke-static/range {p6 .. p6}, Ll/ۖ;->ۙ֫ۢ(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_1b

    goto :goto_11

    .line 153
    :cond_1b
    invoke-static {v13}, Ll/֫֫;->֫ۜۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v14

    invoke-interface {v8, v14}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_1c

    goto :goto_10

    :cond_1c
    add-int/lit8 v4, v4, 0x1

    mul-int/lit8 v14, v4, 0x64

    .line 156
    div-int/2addr v14, v1

    if-eq v14, v5, :cond_1d

    .line 159
    invoke-interface {v7, v14}, Ll/ۚۢᩳ;->ۧ(I)V

    move v5, v14

    .line 161
    :cond_1d
    invoke-virtual {v11, v13}, Ll/᩵ۡۚ;->֫(Ll/ۡ֫ۚ;)Ll/֡᩷ۚ;

    goto :goto_10

    .line 163
    :cond_1e
    :goto_11
    invoke-static/range {p6 .. p6}, Ll/֡᩺;->ۛۜۚ(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1f

    goto :goto_12

    .line 165
    :cond_1f
    invoke-static {v2}, Ll/֫᩵;->ܳ᩺۟(Ljava/lang/Object;)Z

    .line 166
    invoke-virtual {v11, v2}, Ll/᩸ۜۚ;->֫(Ll/ܶ᩵ܿ;)V

    .line 167
    invoke-static {v3, v10}, Ll/֡۬;->ᩴۗۨ(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 168
    invoke-virtual {v3}, Ll/ۡܰۡ;->֫()Ljava/io/OutputStream;

    move-result-object v8

    .line 683
    invoke-virtual {v2, v8, v6}, Ll/ܶ᩵ܿ;->֫(Ljava/io/OutputStream;Ll/֨᩸ܿ;)V

    goto/16 :goto_f

    .line 146
    :cond_20
    invoke-interface {v8}, Ljava/util/Set;->size()I

    move-result v8
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    add-int/2addr v4, v8

    goto/16 :goto_f

    .line 170
    :cond_21
    :goto_12
    :try_start_4
    invoke-static {v3}, Ll/֫᩵;->ۘۤ۫(Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 171
    invoke-static {v2}, Ll/ۗ᩷;->ۨۖۜ(Ljava/lang/Object;)Z

    goto :goto_14

    :catchall_1
    move-exception v0

    move-object v1, v0

    .line 132
    :try_start_5
    invoke-static {v3}, Ll/֫᩵;->ۘۤ۫(Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_13

    :catchall_2
    move-exception v0

    move-object v3, v0

    :try_start_6
    invoke-static {v1, v3}, Ll/ۖ;->ۧܺ᩹(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_13
    throw v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    :catchall_3
    move-exception v0

    .line 171
    invoke-static {v2}, Ll/ۗ᩷;->ۨۖۜ(Ljava/lang/Object;)Z

    .line 172
    throw v0

    .line 174
    :cond_22
    :goto_14
    iget-object v0, v9, Ll/ܿۡᩳ;->֫:Ljava/util/HashSet;

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    return-object v0

    :catchall_4
    move-exception v0

    .line 57
    :try_start_7
    monitor-exit v16
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    throw v0
.end method
