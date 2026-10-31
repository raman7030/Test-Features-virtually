.class public final Ll/ۗܿ۠;
.super Ljava/lang/Object;
.source "X44P"

# interfaces
.implements Ll/ۙܿ۠;


# instance fields
.field public final ֫:Ll/᩷۠ᩴ;

.field public final synthetic ۧ:Ll/ۨܿ۠;


# direct methods
.method public constructor <init>(Ll/ۨܿ۠;Ll/᩷۠ᩴ;)V
    .locals 0

    .line 458
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۗܿ۠;->ۧ:Ll/ۨܿ۠;

    .line 459
    iput-object p2, p0, Ll/ۗܿ۠;->֫:Ll/᩷۠ᩴ;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 0

    return-void
.end method

.method public final ֫()Ljava/lang/Iterable;
    .locals 1

    .line 544
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/᩷۠ᩴ;Ll/ۛܳ۠;)Ll/ᩳ᩶۠;
    .locals 3

    .line 524
    :try_start_0
    invoke-virtual {p2, p1}, Ll/ۨܳ۠;->֫(Ll/᩷۠ᩴ;)Ll/᩷۠ᩴ;

    move-result-object p1

    const/4 p2, 0x0

    new-array v0, p2, [Ll/ܳ۠ᩴ;

    .line 525
    invoke-static {p1, v0}, Ll/ܿ۠ᩴ;->exists(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 526
    iget-object v0, p0, Ll/ۗܿ۠;->ۧ:Ll/ۨܿ۠;

    invoke-static {v0}, Ll/ۨܿ۠;->ۧ(Ll/ۨܿ۠;)Ll/ۖܿ۠;

    move-result-object v1

    .line 527
    invoke-virtual {v1, p1}, Ll/ۖܿ۠;->ۧ(Ll/᩷۠ᩴ;)Ll/᩷۠ᩴ;

    move-result-object v1

    .line 526
    sget v2, Ll/۫ܳ۠;->ᩳ:I

    .line 228
    new-instance v2, Ll/۬ܳ۠;

    invoke-direct {v2, v0, v1, p1, p2}, Ll/۬ܳ۠;-><init>(Ll/᩷ܿ۠;Ll/᩷۠ᩴ;Ll/᩷۠ᩴ;I)V
    :try_end_0
    .catch Ljava/nio/file/InvalidPathException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v2

    :catch_0
    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫(Ll/᩷۠ᩴ;Ll/ۤܳ۠;Ljava/util/Set;ZLl/ᩴܶ۠;)V
    .locals 15

    move-object v7, p0

    move-object/from16 v0, p2

    .line 474
    iget-object v8, v7, Ll/ۗܿ۠;->֫:Ll/᩷۠ᩴ;

    move-object/from16 v9, p1

    :try_start_0
    invoke-virtual {v0, v9}, Ll/ۨܳ۠;->֫(Ll/᩷۠ᩴ;)Ll/᩷۠ᩴ;

    move-result-object v1
    :try_end_0
    .catch Ljava/nio/file/InvalidPathException; {:try_start_0 .. :try_end_0} :catch_1

    const/4 v10, 0x0

    new-array v2, v10, [Ll/ܳ۠ᩴ;

    .line 479
    invoke-static {v1, v2}, Ll/ܿ۠ᩴ;->exists(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v2

    if-nez v2, :cond_0

    goto/16 :goto_4

    .line 483
    :cond_0
    iget-object v11, v7, Ll/ۗܿ۠;->ۧ:Ll/ۨܿ۠;

    invoke-static {v11, v1, v0}, Ll/ۨܿ۠;->֫(Ll/ۨܿ۠;Ll/᩷۠ᩴ;Ll/ۤܳ۠;)Z

    move-result v2

    if-nez v2, :cond_1

    goto/16 :goto_4

    .line 488
    :cond_1
    :try_start_1
    invoke-static {v1}, Ll/ܿ۠ᩴ;->list(Ll/᩷۠ᩴ;)Ll/ܿ᩺ᩴ;

    move-result-object v1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 489
    :try_start_2
    iget-object v2, v11, Ll/ۨܿ۠;->ܳ֫:Ll/ۛܿ۠;

    if-nez v2, :cond_2

    move-object v2, v1

    goto :goto_0

    :cond_2
    invoke-interface {v1, v2}, Ll/ܿ᩺ᩴ;->sorted(Ljava/util/Comparator;)Ll/ܿ᩺ᩴ;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ll/ܿ᩺ᩴ;->toList()Ljava/util/List;

    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v1, :cond_3

    .line 490
    :try_start_3
    invoke-interface {v1}, Ll/۫ۨᩴ;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    .line 494
    :cond_3
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_1
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩷۠ᩴ;

    .line 495
    invoke-interface {v1}, Ll/᩷۠ᩴ;->getFileName()Ll/᩷۠ᩴ;

    move-result-object v2

    invoke-interface {v2}, Ll/᩷۠ᩴ;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "/"

    .line 496
    invoke-virtual {v2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/4 v3, 0x1

    .line 0
    invoke-static {v3, v10, v2}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :cond_4
    new-array v3, v10, [Ll/ܳ۠ᩴ;

    .line 498
    invoke-static {v1, v3}, Ll/ܿ۠ᩴ;->isDirectory(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v1

    if-eqz v1, :cond_6

    if-eqz p4, :cond_5

    .line 499
    invoke-static {v2}, Ll/ۗ᩸۠;->֫(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 500
    new-instance v3, Ll/ۤܳ۠;

    .line 118
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, v0, Ll/ۨܳ۠;->᩸:Ljava/lang/String;

    .line 0
    invoke-static {v1, v4, v2}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 118
    invoke-direct {v3, v1}, Ll/ۤܳ۠;-><init>(Ljava/lang/String;)V

    move-object v1, p0

    move-object/from16 v2, p1

    move-object/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    .line 500
    invoke-virtual/range {v1 .. v6}, Ll/ۗܿ۠;->֫(Ll/᩷۠ᩴ;Ll/ۤܳ۠;Ljava/util/Set;ZLl/ᩴܶ۠;)V

    :cond_5
    move-object/from16 v13, p3

    goto :goto_2

    .line 672
    :cond_6
    invoke-static {v2}, Ll/᩷ܿ۠;->ۧ(Ljava/lang/String;)Ll/ܽ᩶۠;

    move-result-object v1

    move-object/from16 v13, p3

    .line 673
    invoke-interface {v13, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 509
    :try_start_4
    new-instance v5, Ll/ۛܳ۠;

    invoke-direct {v5, v0, v2}, Ll/ۛܳ۠;-><init>(Ll/ۤܳ۠;Ljava/lang/String;)V

    .line 511
    invoke-virtual {v5, v8}, Ll/ۨܳ۠;->֫(Ll/᩷۠ᩴ;)Ll/᩷۠ᩴ;

    move-result-object v3

    .line 510
    sget v1, Ll/۫ܳ۠;->ᩳ:I

    .line 102
    new-instance v14, Ll/ۙܳ۠;

    const/4 v6, 0x0

    move-object v1, v14

    move-object v2, v11

    move-object/from16 v4, p1

    invoke-direct/range {v1 .. v6}, Ll/ۙܳ۠;-><init>(Ll/᩷ܿ۠;Ll/᩷۠ᩴ;Ll/᩷۠ᩴ;Ll/ۛܳ۠;I)V

    move-object/from16 v1, p5

    .line 512
    invoke-virtual {v1, v14}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/nio/file/InvalidPathException; {:try_start_4 .. :try_end_4} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 514
    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "error accessing directory "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_7
    :goto_2
    move-object/from16 v1, p5

    goto/16 :goto_1

    :catchall_0
    move-exception v0

    move-object v2, v0

    if-eqz v1, :cond_8

    .line 488
    :try_start_5
    invoke-interface {v1}, Ll/۫ۨᩴ;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object v1, v0

    :try_start_6
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_8
    :goto_3
    throw v2
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1

    :catch_1
    :cond_9
    :goto_4
    return-void
.end method

.method public final ۧ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
