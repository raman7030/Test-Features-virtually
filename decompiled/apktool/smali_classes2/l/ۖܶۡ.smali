.class public final synthetic Ll/ۖܶۡ;
.super Ljava/lang/Object;
.source "316P"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic ֫:Ll/ܶ᩵ܿ;


# direct methods
.method public synthetic constructor <init>(Ll/ܶ᩵ܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۖܶۡ;->֫:Ll/ܶ᩵ܿ;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 14

    const-string v0, "AndroidManifest.xml"

    const-string v1, "resources.arsc"

    .line 256
    sget-object v2, Ll/ܽ֡ܿ;->֫:Ll/ܶ᩵ܿ;

    const-string v3, ".apk"

    invoke-virtual {v2, v3}, Ll/ܶ᩵ܿ;->᩻(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v2

    .line 257
    iget-object v3, p0, Ll/ۖܶۡ;->֫:Ll/ܶ᩵ܿ;

    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v4

    const-wide/32 v6, 0x100000

    const/4 v8, 0x0

    cmp-long v9, v4, v6

    if-gtz v9, :cond_0

    .line 516
    :try_start_0
    invoke-virtual {v3, v2, v8, v8}, Ll/ܶ᩵ܿ;->֫(Ll/ܶ᩵ܿ;Ll/ܿ᩵ܿ;Ll/ۚ᩸ܿ;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    return-object v2

    .line 278
    :cond_0
    :try_start_1
    new-instance v4, Ll/ᩳܰۡ;

    invoke-direct {v4, v3}, Ll/ᩳܰۡ;-><init>(Ll/ܶ᩵ܿ;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 279
    :try_start_2
    new-instance v3, Ll/ۡܰۡ;

    invoke-direct {v3, v2}, Ll/ۡܰۡ;-><init>(Ll/ܶ᩵ܿ;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 280
    :try_start_3
    invoke-virtual {v3}, Ll/ۡܰۡ;->ᩳ()V

    .line 281
    invoke-virtual {v4, v1}, Ll/ᩳܰۡ;->᩷(Ljava/lang/String;)Ll/ۗ᩺ۡ;

    move-result-object v5

    .line 282
    invoke-virtual {v4, v0}, Ll/ᩳܰۡ;->᩷(Ljava/lang/String;)Ll/ۗ᩺ۡ;

    .line 283
    new-instance v6, Ljava/util/HashSet;

    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    .line 284
    new-instance v7, Ll/᩺᩻ܽ;

    .line 1757
    invoke-virtual {v4, v5, v8}, Ll/ᩳܰۡ;->֫(Ll/ۗ᩺ۡ;Ll/᩵ۛۡ;)[B

    move-result-object v5

    .line 284
    invoke-direct {v7, v5}, Ll/᩺᩻ܽ;-><init>([B)V

    .line 285
    invoke-virtual {v7}, Ll/ۡᩳܽ;->᩺()Ljava/lang/Iterable;

    move-result-object v5

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_7

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ᩳۜܽ;

    .line 286
    invoke-virtual {v7}, Ll/۠ᩳܽ;->ۖۧ()Ljava/lang/Iterable;

    move-result-object v7

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_2
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/᩻ۜܽ;

    .line 288
    invoke-virtual {v9}, Ll/ۤᩳܽ;->getTypeName()Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_3

    invoke-virtual {v10}, Ljava/lang/String;->hashCode()I

    move-result v11

    sparse-switch v11, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v11, "integer"

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_2

    goto :goto_1

    :sswitch_1
    const-string v11, "style"

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_2

    goto :goto_1

    :sswitch_2
    const-string v11, "bool"

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_2

    goto :goto_1

    :sswitch_3
    const-string v11, "attr"

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_3

    goto :goto_0

    :sswitch_4
    const-string v11, "id"

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_2

    goto :goto_1

    :sswitch_5
    const-string v11, "plurals"

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_2

    goto :goto_1

    :sswitch_6
    const-string v11, "string"

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_2

    .line 299
    :cond_3
    :goto_1
    invoke-virtual {v9}, Ll/ۤᩳܽ;->ۢ()Ljava/lang/Iterable;

    move-result-object v9

    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_4
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ۛ᩻ܽ;

    .line 300
    invoke-virtual {v10}, Ll/ۜᩳܽ;->ᩳ()Ljava/lang/Iterable;

    move-result-object v10

    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_5
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_4

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/ۨ᩻ܽ;

    .line 301
    invoke-virtual {v11}, Ll/᩷ᩳܽ;->values()Ljava/lang/Iterable;

    move-result-object v11

    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :catch_0
    :cond_6
    :goto_2
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_5

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/ۜۜܽ;

    .line 302
    invoke-virtual {v12}, Ll/ۛᩳܽ;->ᩳ֫()Z

    move-result v13
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-eqz v13, :cond_6

    .line 304
    :try_start_4
    invoke-virtual {v12}, Ll/ۛᩳܽ;->ܿۧ()Ll/ۗ᩻ܽ;

    move-result-object v12

    invoke-interface {v12}, Ll/ۗ᩻ܽ;->getValue()Ljava/lang/String;

    move-result-object v12

    const-string v13, "getValue(...)"

    invoke-static {v12, v13}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6, v12}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_2

    .line 314
    :cond_7
    :try_start_5
    invoke-virtual {v6, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 315
    invoke-virtual {v6, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 316
    invoke-virtual {v4}, Ll/ᩳܰۡ;->᩶ۧ()Ljava/util/Collection;

    move-result-object v0

    const-string v1, "getEntries(...)"

    invoke-static {v0, v1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 371
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 372
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_8
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v7, v5

    check-cast v7, Ll/ۗ᩺ۡ;

    .line 316
    invoke-virtual {v7}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_8

    .line 372
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 374
    :cond_9
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۗ᩺ۡ;

    .line 317
    invoke-virtual {v3, v1, v4}, Ll/ۡܰۡ;->֫(Ll/ۗ᩺ۡ;Ll/ᩳܰۡ;)V

    goto :goto_4

    .line 318
    :cond_a
    sget-object v0, Ll/۠۠᩵;->֫:Ll/۠۠᩵;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 47
    :try_start_6
    invoke-virtual {v3}, Ll/ۡܰۡ;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :try_start_7
    invoke-virtual {v4}, Ll/ᩳܰۡ;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    goto :goto_5

    :catchall_0
    move-exception v0

    .line 279
    :try_start_8
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    :catchall_1
    move-exception v1

    :try_start_9
    invoke-static {v3, v0}, Ll/۟᩸᩵;->֫(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    :catchall_2
    move-exception v0

    .line 278
    :try_start_a
    throw v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    :catchall_3
    move-exception v1

    :try_start_b
    invoke-static {v4, v0}, Ll/۟᩸᩵;->֫(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    :catch_1
    :catchall_4
    move-object v2, v8

    :goto_5
    return-object v2

    nop

    :sswitch_data_0
    .sparse-switch
        -0x352a9fef -> :sswitch_6
        -0x1c54a691 -> :sswitch_5
        0xd1b -> :sswitch_4
        0x2dd9f1 -> :sswitch_3
        0x2e3aea -> :sswitch_2
        0x68b1db1 -> :sswitch_1
        0x74b5813e -> :sswitch_0
    .end sparse-switch
.end method
