.class public final Ll/᩷ܿܺ;
.super Ljava/lang/Object;
.source "V40L"


# direct methods
.method public static ֫(I)Ljava/lang/String;
    .locals 2

    if-lez p0, :cond_1

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    const-string p0, "classes.dex"

    return-object p0

    :cond_0
    const-string v0, "classes"

    const-string v1, ".dex"

    .line 0
    invoke-static {p0, v0, v1}, Ll/ᩳ᩷ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 175
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0
.end method

.method public static ֫(Ll/ᩳܰۡ;)Ljava/util/ArrayList;
    .locals 6

    .line 32
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 33
    invoke-virtual {p0}, Ll/ᩳܰۡ;->᩶ۧ()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۗ᩺ۡ;

    .line 34
    invoke-virtual {v2}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v3

    const-string v4, ".class"

    .line 35
    invoke-virtual {v3, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    const-string v4, "module-info.class"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 36
    new-instance v3, Ll/ܿܿܺ;

    invoke-virtual {v2}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ll/ۘᩴܳ;

    invoke-direct {v5, p0, v2}, Ll/ۘᩴܳ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-direct {v3, v4, v5}, Ll/ܿܿܺ;-><init>(Ljava/lang/String;Ll/ۘᩴܳ;)V

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public static ֫(Ll/ᩳܰۡ;Ll/ܶ᩵ܿ;Ll/ܶ᩵ܿ;Ll/ۡۛۡ;)Ll/ܶ᩵ܿ;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    .line 112
    new-instance v3, Ll/ܿ֫ۚ;

    invoke-direct {v3}, Ll/ܿ֫ۚ;-><init>()V

    .line 113
    new-instance v4, Ll/ᩳ֫ۚ;

    invoke-direct {v4}, Ll/ᩳ֫ۚ;-><init>()V

    const/4 v5, 0x0

    .line 1790
    invoke-virtual {v0, v5}, Ll/ᩳܰۡ;->֫(Z)Ljava/util/List;

    move-result-object v5

    .line 118
    new-instance v6, Ll/᩵ۛۡ;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v7

    int-to-long v7, v7

    invoke-direct {v6, v7, v8}, Ll/᩵ۛۡ;-><init>(J)V

    move-object/from16 v7, p3

    invoke-virtual {v6, v7}, Ll/᩵ۛۡ;->֫(Ll/ۖۛۡ;)V

    .line 119
    new-instance v8, Ll/᩸ۡۚ;

    invoke-direct {v8}, Ll/᩸ۡۚ;-><init>()V

    .line 121
    :try_start_0
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    :goto_0
    :try_start_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    const/4 v15, 0x1

    if-eqz v14, :cond_9

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ll/ۗ᩺ۡ;

    .line 122
    invoke-interface/range {p3 .. p3}, Ll/ܿۖ᩷;->᩻()Z

    move-result v16
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v16, :cond_2

    if-eqz v9, :cond_0

    move-object v1, v2

    :cond_0
    if-eqz v11, :cond_1

    .line 167
    invoke-virtual {v11}, Ll/ۡܰۡ;->close()V

    :cond_1
    return-object v1

    .line 41
    :cond_2
    :try_start_2
    invoke-virtual {v6, v15}, Ll/᩵ۛۡ;->֫(I)Z

    const/4 v15, 0x0

    .line 1757
    invoke-virtual {v0, v14, v15}, Ll/ᩳܰۡ;->֫(Ll/ۗ᩺ۡ;Ll/᩵ۛۡ;)[B

    move-result-object v14

    .line 127
    invoke-static {v14}, Ll/۬ۛ֡;->֫([B)Ll/۬ۛ֡;

    move-result-object v14

    if-nez v10, :cond_3

    .line 129
    invoke-virtual {v14}, Ll/۬ۛ֡;->֫()Ll/۠ۗ֡;

    move-result-object v10

    .line 130
    new-instance v13, Ll/᩵ۡۚ;

    invoke-direct {v13, v10}, Ll/᩵ۡۚ;-><init>(Ll/۠ۗ֡;)V

    move-object/from16 v18, v13

    move-object v13, v10

    move-object/from16 v10, v18

    .line 132
    :cond_3
    invoke-virtual {v14}, Ll/۬ۛ֡;->ۧ()Ljava/util/Set;

    move-result-object v14

    check-cast v14, Ll/ᩴ۟֡;

    invoke-virtual {v14}, Ll/ᩴ۟֡;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_1
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_8

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ll/۠ۛ֡;

    .line 133
    invoke-interface/range {p3 .. p3}, Ll/ܿۖ᩷;->᩻()Z

    move-result v16

    if-eqz v16, :cond_4

    goto :goto_2

    .line 136
    :cond_4
    new-instance v0, Ll/ܽ֫ۚ;

    invoke-direct {v0, v15, v3}, Ll/ܽ֫ۚ;-><init>(Ll/۠ۛ֡;Ll/ܿ֫ۚ;)V

    .line 137
    invoke-virtual {v4, v0}, Ll/ᩳ֫ۚ;->ۧ(Ll/ܽ֫ۚ;)V

    move-object/from16 v16, v3

    .line 138
    invoke-virtual {v4}, Ll/ᩳ֫ۚ;->ܳ()I

    move-result v3

    move-object/from16 v17, v5

    const v5, 0xfde8

    if-gt v3, v5, :cond_5

    invoke-virtual {v4}, Ll/ᩳ֫ۚ;->ܽ()I

    move-result v3

    if-le v3, v5, :cond_7

    :cond_5
    if-nez v9, :cond_6

    .line 141
    new-instance v3, Ll/ۡܰۡ;

    invoke-direct {v3, v2}, Ll/ۡܰۡ;-><init>(Ll/ܶ᩵ܿ;)V

    const/4 v9, 0x1

    move-object v11, v3

    .line 143
    :cond_6
    invoke-virtual {v10, v8}, Ll/᩸ۜۚ;->֫(Ll/ۚۡۚ;)V

    add-int/lit8 v12, v12, 0x1

    .line 144
    invoke-static {v12}, Ll/᩷ܿܺ;->֫(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v11, v3}, Ll/ۡܰۡ;->֫(Ljava/lang/String;)V

    .line 145
    invoke-virtual {v8}, Ll/᩸ۡۚ;->֫()[B

    move-result-object v3

    invoke-virtual {v8}, Ll/᩸ۡۚ;->ᩳ()I

    move-result v4

    const/4 v5, 0x0

    invoke-virtual {v11, v3, v5, v4}, Ll/ۡܰۡ;->write([BII)V

    .line 146
    invoke-virtual {v8}, Ll/᩸ۡۚ;->ܳ()V

    .line 148
    new-instance v4, Ll/ᩳ֫ۚ;

    invoke-direct {v4}, Ll/ᩳ֫ۚ;-><init>()V

    .line 149
    invoke-virtual {v4, v0}, Ll/ᩳ֫ۚ;->ۧ(Ll/ܽ֫ۚ;)V

    .line 150
    new-instance v10, Ll/᩵ۡۚ;

    invoke-direct {v10, v13}, Ll/᩵ۡۚ;-><init>(Ll/۠ۗ֡;)V

    .line 152
    :cond_7
    invoke-virtual {v10, v15}, Ll/᩵ۡۚ;->֫(Ll/ۡ֫ۚ;)Ll/֡᩷ۚ;

    move-object/from16 v0, p0

    move-object/from16 v3, v16

    move-object/from16 v5, v17

    goto :goto_1

    :cond_8
    :goto_2
    move-object/from16 v16, v3

    move-object/from16 v17, v5

    move-object/from16 v0, p0

    move-object/from16 v3, v16

    move-object/from16 v5, v17

    goto/16 :goto_0

    :cond_9
    if-eqz v9, :cond_a

    .line 156
    invoke-virtual {v10, v8}, Ll/᩸ۜۚ;->֫(Ll/ۚۡۚ;)V

    add-int/lit8 v12, v12, 0x1

    .line 157
    invoke-static {v12}, Ll/᩷ܿܺ;->֫(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Ll/ۡܰۡ;->֫(Ljava/lang/String;)V

    .line 158
    invoke-virtual {v8}, Ll/᩸ۡۚ;->֫()[B

    move-result-object v0

    invoke-virtual {v8}, Ll/᩸ۡۚ;->ᩳ()I

    move-result v3

    const/4 v4, 0x0

    invoke-virtual {v11, v0, v4, v3}, Ll/ۡܰۡ;->write([BII)V

    goto :goto_3

    :cond_a
    if-nez v10, :cond_b

    .line 161
    new-instance v10, Ll/᩵ۡۚ;

    const/16 v0, 0xf

    .line 129
    invoke-static {v0}, Ll/۠ۗ֡;->ۧ(I)Ll/۠ۗ֡;

    move-result-object v0

    .line 161
    invoke-direct {v10, v0}, Ll/᩵ۡۚ;-><init>(Ll/۠ۗ֡;)V

    .line 163
    :cond_b
    invoke-virtual {v10, v1}, Ll/᩸ۜۚ;->֫(Ll/ܶ᩵ܿ;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_3
    if-eqz v11, :cond_c

    .line 167
    invoke-virtual {v11}, Ll/ۡܰۡ;->close()V

    :cond_c
    if-eqz v9, :cond_d

    return-object v2

    :cond_d
    return-object v1

    :catchall_0
    move-exception v0

    goto :goto_4

    :catchall_1
    move-exception v0

    const/4 v11, 0x0

    :goto_4
    if-eqz v11, :cond_e

    invoke-virtual {v11}, Ll/ۡܰۡ;->close()V

    .line 169
    :cond_e
    throw v0
.end method

.method public static ֫(Ljava/util/ArrayList;ILl/ۙ᩸ۢ;Ll/ۡۛۡ;)V
    .locals 10

    .line 48
    new-instance v6, Ll/᩵ۛۡ;

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    int-to-long v0, v0

    invoke-direct {v6, v0, v1}, Ll/᩵ۛۡ;-><init>(J)V

    invoke-virtual {v6, p3}, Ll/᩵ۛۡ;->֫(Ll/ۖۛۡ;)V

    .line 49
    new-instance v2, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 50
    new-instance v8, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v8}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 51
    new-instance v9, Ll/ۜܿܺ;

    move-object v0, v9

    move-object v1, p0

    move-object v3, v8

    move-object v4, p3

    move v5, p1

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Ll/ۜܿܺ;-><init>(Ljava/util/ArrayList;Ljava/util/concurrent/atomic/AtomicInteger;Ljava/util/concurrent/atomic/AtomicReference;Ll/ۡۛۡ;ILl/᩵ۛۡ;Ll/ۙ᩸ۢ;)V

    .line 81
    sget p0, Ll/ܿ᩸ۡ;->֫:I

    .line 82
    new-array p1, p0, [Ljava/lang/Thread;

    const/4 p2, 0x0

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p0, :cond_0

    .line 84
    new-instance v1, Ljava/lang/Thread;

    invoke-direct {v1, v9}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 88
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 89
    aput-object v1, p1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    :goto_1
    if-ge p2, p0, :cond_1

    .line 91
    aget-object v0, p1, p2

    .line 92
    invoke-virtual {v0}, Ljava/lang/Thread;->join()V

    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    .line 94
    :cond_1
    invoke-interface {p3}, Ll/ܿۖ᩷;->᩻()Z

    move-result p0

    if-eqz p0, :cond_2

    goto :goto_2

    .line 97
    :cond_2
    invoke-virtual {v8}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p0

    if-nez p0, :cond_3

    :goto_2
    return-void

    .line 98
    :cond_3
    invoke-virtual {v8}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Exception;

    throw p0
.end method
