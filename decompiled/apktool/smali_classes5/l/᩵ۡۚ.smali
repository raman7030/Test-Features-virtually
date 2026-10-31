.class public final Ll/᩵ۡۚ;
.super Ll/᩸ۜۚ;
.source "C5XG"


# instance fields
.field public ۖ֫:Z

.field public ۘ֫:Z

.field public ۡ֫:Z

.field public ۢ֫:Z

.field public ܺ֫:Z

.field public ᩴ֫:Z

.field public ᩵֫:Z


# direct methods
.method public constructor <init>(Ll/۠ۗ֡;)V
    .locals 0

    .line 157
    invoke-direct {p0, p1}, Ll/᩸ۜۚ;-><init>(Ll/۠ۗ֡;)V

    const/4 p1, 0x0

    .line 147
    iput-boolean p1, p0, Ll/᩵ۡۚ;->ۢ֫:Z

    return-void
.end method

.method private ۧ(Ll/ۡ֫ۚ;)Ll/֡᩷ۚ;
    .locals 24

    move-object/from16 v10, p0

    const-string v11, "Ljava/lang/RuntimeException;"

    .line 438
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 439
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 440
    iget-boolean v0, v10, Ll/᩵ۡۚ;->ۢ֫:Z

    if-eqz v0, :cond_9

    .line 443
    :try_start_0
    invoke-interface/range {p1 .. p1}, Ll/ۡ֫ۚ;->getFields()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۘ֫ۚ;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    .line 445
    :try_start_1
    invoke-interface {v1}, Ll/ᩴܽۚ;->ܳ()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1}, Ll/ᩴܽۚ;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1}, Ll/ᩴܽۚ;->getType()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1}, Ll/ۘ֫ۚ;->ܽ()I

    move-result v5

    .line 446
    invoke-interface {v1}, Ll/ۘ֫ۚ;->ۚ֫()Ll/ۤܽۚ;

    move-result-object v6

    invoke-interface {v1}, Ll/ۘ֫ۚ;->getAnnotations()Ljava/util/Set;

    move-result-object v7

    invoke-interface {v1}, Ll/ۘ֫ۚ;->᩵()Ljava/util/Set;

    move-result-object v8

    move-object/from16 v1, p0

    .line 445
    invoke-virtual/range {v1 .. v8}, Ll/᩵ۡۚ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILl/ۤܽۚ;Ljava/util/Set;Ljava/util/Set;)Ll/ܺۢۚ;

    move-result-object v1

    .line 447
    invoke-virtual {v12, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    .line 449
    :catch_0
    :try_start_2
    sget-object v1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    invoke-interface/range {p1 .. p1}, Ll/᩸ܽۚ;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0

    .line 454
    :catch_1
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    invoke-interface/range {p1 .. p1}, Ll/᩸ܽۚ;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 459
    :cond_0
    :try_start_3
    invoke-interface/range {p1 .. p1}, Ll/ۡ֫ۚ;->getMethods()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :catch_2
    :goto_1
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ll/ᩴ֫ۚ;
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_4

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    .line 465
    :try_start_4
    invoke-interface {v1}, Ll/ᩴ֫ۚ;->᩷ۧ()Ll/᩵֫ۚ;

    move-result-object v0

    invoke-virtual {v10, v0}, Ll/᩵ۡۚ;->֫(Ll/᩵֫ۚ;)Ll/᩵֫ۚ;

    move-result-object v5

    .line 466
    invoke-static {v5}, Ll/֡ܰ᩵;->֫(Ll/᩵֫ۚ;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_5

    :cond_1
    if-nez v5, :cond_2

    goto :goto_2

    .line 23
    :cond_2
    sget-object v0, Ll/ܿۜۚ;->֫:Ll/ᩴܶܺ;

    .line 72
    sget-object v0, Ll/ܺۗ֡;->ܳ֫:Ll/ܺۗ֡;

    invoke-interface {v1}, Ll/ᩴ֫ۚ;->ܽ()I

    move-result v6

    invoke-virtual {v0, v6}, Ll/ܺۗ֡;->֫(I)Z

    move-result v0

    .line 90
    invoke-interface {v1}, Ll/ۚܽۚ;->ۘ()Ljava/util/List;

    move-result-object v6

    invoke-static {v6, v0}, Ll/ܿۜۚ;->֫(Ljava/util/List;Z)I

    move-result v0

    .line 24
    move-object v6, v5

    check-cast v6, Ll/᩷ۡۚ;

    .line 620
    iget v6, v6, Ll/᩷ۡۚ;->ܽ:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-gt v0, v6, :cond_7

    :goto_2
    if-nez v5, :cond_3

    goto :goto_3

    .line 63
    :cond_3
    :try_start_5
    move-object v0, v5

    check-cast v0, Ll/᩷ۡۚ;

    .line 632
    iget-object v0, v0, Ll/᩷ۡۚ;->ᩳ:Ljava/util/ArrayList;

    .line 63
    invoke-static {v0}, Ll/ᩳܺۚ;->֫(Ljava/util/List;)Ljava/util/ArrayList;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :goto_3
    if-nez v5, :cond_4

    goto :goto_4

    .line 74
    :cond_4
    :try_start_6
    move-object v0, v5

    check-cast v0, Ll/᩷ۡۚ;

    .line 626
    iget-object v0, v0, Ll/᩷ۡۚ;->ۧ:Ljava/util/ArrayList;

    .line 74
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩺֫ۚ;

    .line 75
    invoke-interface {v6}, Ll/᩺֫ۚ;->ۢ()Ll/֨ۗ֡;

    move-result-object v6

    iget v6, v6, Ll/֨ۗ֡;->᩶:I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    and-int/2addr v6, v2

    if-eqz v6, :cond_5

    goto :goto_5

    :cond_6
    :goto_4
    const/4 v4, 0x0

    goto :goto_5

    :catch_3
    nop

    goto :goto_5

    :catchall_0
    move-exception v0

    .line 481
    :try_start_7
    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    :cond_7
    :goto_5
    if-eqz v4, :cond_8

    .line 487
    sget-object v0, Ll/ܿۜۚ;->֫:Ll/ᩴܶܺ;

    .line 72
    sget-object v0, Ll/ܺۗ֡;->ܳ֫:Ll/ܺۗ֡;

    invoke-interface {v1}, Ll/ᩴ֫ۚ;->ܽ()I

    move-result v4

    invoke-virtual {v0, v4}, Ll/ܺۗ֡;->֫(I)Z

    move-result v0

    .line 90
    invoke-interface {v1}, Ll/ۚܽۚ;->ۘ()Ljava/util/List;

    move-result-object v4

    invoke-static {v4, v0}, Ll/ܿۜۚ;->֫(Ljava/util/List;Z)I

    move-result v0

    .line 488
    new-instance v4, Ll/֨۫֡;

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-direct {v4, v0}, Ll/֨۫֡;-><init>(I)V

    .line 280
    iget-object v0, v10, Ll/᩸ۜۚ;->᩻֫:Ll/ܳۡۚ;

    invoke-virtual {v0, v11}, Ll/ܳۡۚ;->֫(Ljava/lang/String;)Ll/᩻ۡۚ;

    move-result-object v0

    .line 490
    new-instance v2, Ll/۬ᩳۚ;

    const-string v5, "<init>"

    .line 493
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object v6

    invoke-direct {v2, v11, v5, v6}, Ll/۬ᩳۚ;-><init>(Ljava/lang/String;Ljava/lang/String;Ll/ܳ۬ܺ;)V

    .line 298
    iget-object v5, v10, Ll/᩸ۜۚ;->ۙ:Ll/ۗۢۚ;

    invoke-virtual {v5, v2}, Ll/ۗۢۚ;->ᩳ(Ll/ۚܽۚ;)Ll/۫ۢۚ;

    move-result-object v23

    .line 496
    new-instance v2, Ll/ۧۤ֡;

    sget-object v5, Ll/֨ۗ֡;->ܺܳ:Ll/֨ۗ֡;

    invoke-direct {v2, v5, v3, v0}, Ll/ۧۤ֡;-><init>(Ll/֨ۗ֡;ILl/۠ܽۚ;)V

    invoke-virtual {v4, v2}, Ll/֨۫֡;->֫(Ll/۟۬֡;)V

    .line 497
    new-instance v0, Ll/֨ۤ֡;

    sget-object v16, Ll/֨ۗ֡;->ۡᩳ:Ll/֨ۗ֡;

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v17, 0x1

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object v15, v0

    invoke-direct/range {v15 .. v23}, Ll/֨ۤ֡;-><init>(Ll/֨ۗ֡;IIIIIILl/۠ܽۚ;)V

    invoke-virtual {v4, v0}, Ll/֨۫֡;->֫(Ll/۟۬֡;)V

    .line 498
    new-instance v0, Ll/᩺۫֡;

    sget-object v2, Ll/֨ۗ֡;->۠ۜ:Ll/֨ۗ֡;

    invoke-direct {v0, v3, v2}, Ll/᩺۫֡;-><init>(ILl/֨ۗ֡;)V

    invoke-virtual {v4, v0}, Ll/֨۫֡;->֫(Ll/۟۬֡;)V

    move-object v9, v4

    goto :goto_6

    :cond_8
    move-object v9, v5

    .line 501
    :goto_6
    invoke-interface {v1}, Ll/ۚܽۚ;->ܳ()Ljava/lang/String;

    move-result-object v2

    .line 502
    invoke-interface {v1}, Ll/ۚܽۚ;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1}, Ll/ᩴ֫ۚ;->getParameters()Ljava/util/List;

    move-result-object v4

    invoke-interface {v1}, Ll/ۚܽۚ;->ᩳ()Ljava/lang/String;

    move-result-object v5

    .line 503
    invoke-interface {v1}, Ll/ᩴ֫ۚ;->ܽ()I

    move-result v6

    invoke-interface {v1}, Ll/ᩴ֫ۚ;->getAnnotations()Ljava/util/Set;

    move-result-object v7

    invoke-interface {v1}, Ll/ᩴ֫ۚ;->᩵()Ljava/util/Set;

    move-result-object v8

    move-object/from16 v1, p0

    .line 501
    invoke-virtual/range {v1 .. v9}, Ll/᩵ۡۚ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ILjava/util/Set;Ljava/util/Set;Ll/᩵֫ۚ;)Ll/֨ۢۚ;

    move-result-object v0

    .line 504
    invoke-virtual {v13, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_7
    .catch Ljava/lang/RuntimeException; {:try_start_7 .. :try_end_7} :catch_2

    goto/16 :goto_1

    .line 512
    :catch_4
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    invoke-interface/range {p1 .. p1}, Ll/᩸ܽۚ;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto/16 :goto_9

    .line 517
    :cond_9
    invoke-interface/range {p1 .. p1}, Ll/ۡ֫ۚ;->getFields()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۘ֫ۚ;

    .line 518
    invoke-interface {v1}, Ll/ᩴܽۚ;->ܳ()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1}, Ll/ᩴܽۚ;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1}, Ll/ᩴܽۚ;->getType()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1}, Ll/ۘ֫ۚ;->ܽ()I

    move-result v5

    .line 519
    invoke-interface {v1}, Ll/ۘ֫ۚ;->ۚ֫()Ll/ۤܽۚ;

    move-result-object v6

    invoke-interface {v1}, Ll/ۘ֫ۚ;->getAnnotations()Ljava/util/Set;

    move-result-object v7

    invoke-interface {v1}, Ll/ۘ֫ۚ;->᩵()Ljava/util/Set;

    move-result-object v8

    move-object/from16 v1, p0

    .line 518
    invoke-virtual/range {v1 .. v8}, Ll/᩵ۡۚ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILl/ۤܽۚ;Ljava/util/Set;Ljava/util/Set;)Ll/ܺۢۚ;

    move-result-object v1

    .line 520
    invoke-virtual {v12, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7

    .line 523
    :cond_a
    invoke-interface/range {p1 .. p1}, Ll/ۡ֫ۚ;->getMethods()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩴ֫ۚ;

    .line 524
    invoke-interface {v1}, Ll/ۚܽۚ;->ܳ()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1}, Ll/ۚܽۚ;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1}, Ll/ᩴ֫ۚ;->getParameters()Ljava/util/List;

    move-result-object v4

    invoke-interface {v1}, Ll/ۚܽۚ;->ᩳ()Ljava/lang/String;

    move-result-object v5

    .line 525
    invoke-interface {v1}, Ll/ᩴ֫ۚ;->ܽ()I

    move-result v6

    invoke-interface {v1}, Ll/ᩴ֫ۚ;->getAnnotations()Ljava/util/Set;

    move-result-object v7

    invoke-interface {v1}, Ll/ᩴ֫ۚ;->᩵()Ljava/util/Set;

    move-result-object v8

    invoke-interface {v1}, Ll/ᩴ֫ۚ;->᩷ۧ()Ll/᩵֫ۚ;

    move-result-object v1

    invoke-virtual {v10, v1}, Ll/᩵ۡۚ;->֫(Ll/᩵֫ۚ;)Ll/᩵֫ۚ;

    move-result-object v9

    move-object/from16 v1, p0

    .line 524
    invoke-virtual/range {v1 .. v9}, Ll/᩵ۡۚ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ILjava/util/Set;Ljava/util/Set;Ll/᩵֫ۚ;)Ll/֨ۢۚ;

    move-result-object v1

    .line 526
    invoke-virtual {v13, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    .line 529
    :cond_b
    :goto_9
    invoke-interface/range {p1 .. p1}, Ll/᩸ܽۚ;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-interface/range {p1 .. p1}, Ll/ۡ֫ۚ;->ܽ()I

    move-result v3

    .line 530
    invoke-interface/range {p1 .. p1}, Ll/ۡ֫ۚ;->ۜܽ()Ljava/lang/String;

    move-result-object v4

    invoke-interface/range {p1 .. p1}, Ll/ۡ֫ۚ;->ܳ֫()Ljava/util/List;

    move-result-object v5

    invoke-interface/range {p1 .. p1}, Ll/ۡ֫ۚ;->ۜ()Ljava/lang/String;

    move-result-object v6

    .line 531
    invoke-interface/range {p1 .. p1}, Ll/ۡ֫ۚ;->getAnnotations()Ljava/util/Set;

    move-result-object v7

    move-object/from16 v1, p0

    move-object v8, v12

    move-object v9, v13

    .line 529
    invoke-virtual/range {v1 .. v9}, Ll/᩵ۡۚ;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Set;Ljava/util/ArrayList;Ljava/util/Collection;)Ll/֡᩷ۚ;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Set;Ljava/util/ArrayList;Ljava/util/Collection;)Ll/֡᩷ۚ;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    move-object/from16 v3, p7

    .line 215
    iget-boolean v4, v0, Ll/᩵ۡۚ;->᩵֫:Z

    const/4 v5, 0x0

    if-eqz v4, :cond_0

    move-object v4, v5

    goto :goto_0

    :cond_0
    move-object/from16 v4, p5

    :goto_0
    if-nez v2, :cond_1

    .line 219
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object v2

    goto :goto_2

    .line 228
    :cond_1
    new-instance v6, Ljava/util/HashSet;

    invoke-direct {v6, v2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 222
    invoke-interface/range {p4 .. p4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    .line 223
    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_3

    .line 224
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    .line 225
    invoke-virtual {v6, v8}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_2

    .line 226
    invoke-interface {v7}, Ljava/util/Iterator;->remove()V

    goto :goto_1

    .line 228
    :cond_2
    invoke-virtual {v6, v8}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    :goto_2
    if-eqz v3, :cond_5

    .line 237
    sget-object v6, Ll/ܰ᩻ۚ;->ۧ:Ll/ᩴܶܺ;

    invoke-static {v3, v6}, Ll/ۡ۫ܺ;->ۧ(Ljava/lang/Iterable;Ll/ᩴܶܺ;)Ljava/lang/Iterable;

    move-result-object v6

    invoke-static {v6}, Ll/᩻۫ܺ;->֫(Ljava/lang/Iterable;)Ll/᩻۫ܺ;

    move-result-object v6

    .line 238
    sget-object v7, Ll/ܰ᩻ۚ;->֫:Ll/ᩴܶܺ;

    invoke-static {v3, v7}, Ll/ۡ۫ܺ;->ۧ(Ljava/lang/Iterable;Ll/ᩴܶܺ;)Ljava/lang/Iterable;

    move-result-object v3

    invoke-static {v3}, Ll/᩻۫ܺ;->֫(Ljava/lang/Iterable;)Ll/᩻۫ܺ;

    move-result-object v3

    .line 239
    invoke-static {v6}, Ll/ܰۡۚ;->֫(Ll/᩻۫ܺ;)Ll/᩶ܽۚ;

    move-result-object v7

    if-eqz v7, :cond_4

    .line 241
    iget-object v8, v0, Ll/᩸ۜۚ;->᩵:Ll/ۗ᩷ۚ;

    check-cast v7, Ll/۠۬֡;

    invoke-virtual {v8, v7}, Ll/ۗ᩷ۚ;->֫(Ll/۠۬֡;)Ll/۫᩷ۚ;

    move-result-object v7

    move-object/from16 v16, v3

    move-object v15, v6

    move-object/from16 v18, v7

    goto :goto_3

    :cond_4
    move-object/from16 v16, v3

    move-object/from16 v18, v5

    move-object v15, v6

    goto :goto_3

    :cond_5
    move-object v15, v5

    move-object/from16 v16, v15

    move-object/from16 v18, v16

    .line 245
    :goto_3
    new-instance v3, Ll/֡᩷ۚ;

    iget-object v6, v0, Ll/᩸ۜۚ;->᩻֫:Ll/ܳۡۚ;

    move-object/from16 v7, p1

    invoke-virtual {v6, v7}, Ll/ܳۡۚ;->֫(Ljava/lang/String;)Ll/᩻ۡۚ;

    move-result-object v9

    if-nez v1, :cond_6

    .line 247
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object v11, v5

    goto :goto_4

    .line 72
    :cond_6
    invoke-virtual {v6, v1}, Ll/ܳۡۚ;->֫(Ljava/lang/String;)Ll/᩻ۡۚ;

    move-result-object v1

    move-object v11, v1

    .line 247
    :goto_4
    iget-object v1, v0, Ll/᩸ۜۚ;->ܿ֫:Ll/֫᩷ۚ;

    check-cast v1, Ll/ᩳۡۚ;

    .line 248
    invoke-virtual {v1, v2}, Ll/ᩳۡۚ;->֫(Ljava/util/List;)Ll/֫ۡۚ;

    move-result-object v12

    iget-object v1, v0, Ll/᩸ۜۚ;->ᩳ֫:Ll/۟ۜۚ;

    check-cast v1, Ll/ܰۢۚ;

    if-nez v4, :cond_7

    .line 249
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_5

    .line 66
    :cond_7
    invoke-virtual {v1, v4}, Ll/ܰۢۚ;->֫(Ljava/lang/String;)Ll/۟ۢۚ;

    move-result-object v5

    :goto_5
    move-object v13, v5

    .line 249
    iget-object v1, v0, Ll/᩸ۜۚ;->ܿ:Ll/ۜۜۚ;

    check-cast v1, Ll/ۡ᩷ۚ;

    move-object/from16 v2, p6

    .line 250
    invoke-virtual {v1, v2}, Ll/ۡ᩷ۚ;->֫(Ljava/util/Set;)Ll/ۜ᩷ۚ;

    move-result-object v14

    move-object v8, v3

    move/from16 v10, p2

    move-object/from16 v17, p8

    invoke-direct/range {v8 .. v18}, Ll/֡᩷ۚ;-><init>(Ll/᩻ۡۚ;ILl/᩻ۡۚ;Ll/֫ۡۚ;Ll/۟ۢۚ;Ll/ۜ᩷ۚ;Ll/᩻۫ܺ;Ll/᩻۫ܺ;Ljava/lang/Iterable;Ll/۫᩷ۚ;)V

    .line 245
    iget-object v1, v0, Ll/᩸ۜۚ;->ܺ:Ll/᩶᩷ۚ;

    invoke-virtual {v1, v3}, Ll/᩶᩷ۚ;->֫(Ll/֡᩷ۚ;)V

    return-object v3
.end method

.method public final ֫(Ll/ۡ֫ۚ;)Ll/֡᩷ۚ;
    .locals 3

    .line 428
    :try_start_0
    invoke-direct {p0, p1}, Ll/᩵ۡۚ;->ۧ(Ll/ۡ֫ۚ;)Ll/֡᩷ۚ;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    move-exception v0

    .line 430
    invoke-interface {p1}, Ll/᩸ܽۚ;->getType()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x1

    .line 0
    invoke-static {v1, v1, p1}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 432
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "An error occurred with the class: "

    .line 0
    invoke-static {v2, p1}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 432
    invoke-direct {v1, p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ILjava/util/Set;Ljava/util/Set;Ll/᩵֫ۚ;)Ll/֨ۢۚ;
    .locals 10

    move-object v0, p0

    if-nez p3, :cond_0

    .line 196
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, p3

    .line 198
    :goto_0
    new-instance v9, Ll/֨ۢۚ;

    iget-object v2, v0, Ll/᩸ۜۚ;->ۙ:Ll/ۗۢۚ;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    new-instance v3, Ll/ۙۢۚ;

    move-object v4, p1

    move-object v5, p2

    move-object v6, p4

    invoke-direct {v3, p1, p2, p4, v1}, Ll/ۙۢۚ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    invoke-virtual {v2, v3}, Ll/ۗۢۚ;->ᩳ(Ll/ۚܽۚ;)Ll/۫ۢۚ;

    move-result-object v3

    if-nez v1, :cond_1

    .line 336
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object v1

    goto :goto_1

    .line 338
    :cond_1
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    new-instance v2, Ll/ۜۡۚ;

    invoke-direct {v2, p0}, Ll/ۜۡۚ;-><init>(Ll/᩵ۡۚ;)V

    invoke-static {v1, v2}, Ll/ۙ۫ܺ;->֫(Ljava/util/Iterator;Ll/ܽܶܺ;)Ljava/util/Iterator;

    move-result-object v1

    invoke-static {v1}, Ll/ܳ۬ܺ;->֫(Ljava/util/Iterator;)Ll/ܳ۬ܺ;

    move-result-object v1

    :goto_1
    move-object v4, v1

    .line 199
    iget-object v1, v0, Ll/᩸ۜۚ;->ܿ:Ll/ۜۜۚ;

    check-cast v1, Ll/ۡ᩷ۚ;

    move-object/from16 v2, p6

    .line 201
    invoke-virtual {v1, v2}, Ll/ۡ᩷ۚ;->֫(Ljava/util/Set;)Ll/ۜ᩷ۚ;

    move-result-object v6

    move-object v2, v9

    move v5, p5

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    invoke-direct/range {v2 .. v8}, Ll/֨ۢۚ;-><init>(Ll/۫ۢۚ;Ljava/util/List;ILl/ۜ᩷ۚ;Ljava/util/Set;Ll/᩵֫ۚ;)V

    return-object v9
.end method

.method public final ֫(Ljava/lang/String;)Ll/۟ۢۚ;
    .locals 0

    if-eqz p1, :cond_0

    .line 273
    invoke-virtual {p0, p1}, Ll/᩵ۡۚ;->ۧ(Ljava/lang/String;)Ll/۟ۢۚ;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫(Ll/۠ܽۚ;)Ll/ۨۢۚ;
    .locals 1

    .line 308
    instance-of v0, p1, Ll/ܶܽۚ;

    if-eqz v0, :cond_0

    .line 309
    check-cast p1, Ll/ܶܽۚ;

    invoke-interface {p1}, Ll/ܶܽۚ;->getString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/᩵ۡۚ;->ۧ(Ljava/lang/String;)Ll/۟ۢۚ;

    move-result-object p1

    return-object p1

    .line 311
    :cond_0
    instance-of v0, p1, Ll/᩸ܽۚ;

    if-eqz v0, :cond_1

    .line 312
    check-cast p1, Ll/᩸ܽۚ;

    invoke-interface {p1}, Ll/᩸ܽۚ;->getType()Ljava/lang/String;

    move-result-object p1

    .line 280
    iget-object v0, p0, Ll/᩸ۜۚ;->᩻֫:Ll/ܳۡۚ;

    invoke-virtual {v0, p1}, Ll/ܳۡۚ;->֫(Ljava/lang/String;)Ll/᩻ۡۚ;

    move-result-object p1

    return-object p1

    .line 314
    :cond_1
    instance-of v0, p1, Ll/ۚܽۚ;

    if-eqz v0, :cond_2

    .line 315
    check-cast p1, Ll/ۚܽۚ;

    .line 298
    iget-object v0, p0, Ll/᩸ۜۚ;->ۙ:Ll/ۗۢۚ;

    invoke-virtual {v0, p1}, Ll/ۗۢۚ;->ᩳ(Ll/ۚܽۚ;)Ll/۫ۢۚ;

    move-result-object p1

    return-object p1

    .line 317
    :cond_2
    instance-of v0, p1, Ll/ᩴܽۚ;

    if-eqz v0, :cond_3

    .line 318
    check-cast p1, Ll/ᩴܽۚ;

    .line 293
    iget-object v0, p0, Ll/᩸ۜۚ;->ۚ:Ll/ۘۢۚ;

    invoke-virtual {v0, p1}, Ll/ۘۢۚ;->ᩳ(Ll/ᩴܽۚ;)Ll/ᩴۢۚ;

    move-result-object p1

    return-object p1

    .line 320
    :cond_3
    instance-of v0, p1, Ll/֡ܽۚ;

    if-eqz v0, :cond_4

    .line 321
    check-cast p1, Ll/֡ܽۚ;

    .line 303
    iget-object v0, p0, Ll/᩸ۜۚ;->۟:Ll/ۛۢۚ;

    invoke-virtual {v0, p1}, Ll/ۛۢۚ;->ᩳ(Ll/֡ܽۚ;)Ll/۬ۢۚ;

    move-result-object p1

    return-object p1

    .line 323
    :cond_4
    instance-of v0, p1, Ll/ۘܽۚ;

    if-eqz v0, :cond_5

    .line 324
    check-cast p1, Ll/ۘܽۚ;

    .line 258
    iget-object v0, p0, Ll/᩸ۜۚ;->ۜ:Ll/ۖ᩷ۚ;

    invoke-virtual {v0, p1}, Ll/ۖ᩷ۚ;->ۧ(Ll/ۘܽۚ;)Ll/ۘ᩷ۚ;

    move-result-object p1

    return-object p1

    .line 326
    :cond_5
    instance-of v0, p1, Ll/᩵ܽۚ;

    if-eqz v0, :cond_6

    .line 327
    check-cast p1, Ll/᩵ܽۚ;

    .line 262
    iget-object v0, p0, Ll/᩸ۜۚ;->᩹:Ll/ܶۢۚ;

    invoke-virtual {v0, p1}, Ll/ܶۢۚ;->ܽ(Ll/᩵ܽۚ;)Ll/᩸ۢۚ;

    move-result-object p1

    return-object p1

    .line 329
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Could not determine type of reference"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/ۤܽۚ;)Ll/ܰ᩷ۚ;
    .locals 3

    .line 727
    invoke-interface {p1}, Ll/ۤܽۚ;->ۖ()I

    move-result v0

    if-eqz v0, :cond_7

    const/4 v1, 0x6

    if-eq v0, v1, :cond_6

    const/4 v1, 0x2

    if-eq v0, v1, :cond_5

    const/4 v1, 0x3

    if-eq v0, v1, :cond_4

    const/4 v1, 0x4

    if-eq v0, v1, :cond_3

    const/16 v1, 0x10

    if-eq v0, v1, :cond_2

    const/16 v1, 0x11

    if-eq v0, v1, :cond_1

    iget-object v1, p0, Ll/᩸ۜۚ;->ۚ:Ll/ۘۢۚ;

    iget-object v2, p0, Ll/᩸ۜۚ;->᩻֫:Ll/ܳۡۚ;

    packed-switch v0, :pswitch_data_0

    .line 766
    new-instance v0, Ll/ܶ᩵ۚ;

    invoke-interface {p1}, Ll/ۤܽۚ;->ۖ()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 p1, 0x0

    const-string v2, "Unexpected encoded value type: %d"

    .line 46
    invoke-direct {v0, p1, v2, v1}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 766
    throw v0

    .line 733
    :pswitch_0
    check-cast p1, Ll/ۙܽۚ;

    invoke-interface {p1}, Ll/ۙܽۚ;->getValue()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 734
    sget-object p1, Ll/ۤ᩷ۚ;->᩶:Ll/ۤ᩷ۚ;

    return-object p1

    :cond_0
    sget-object p1, Ll/ۤ᩷ۚ;->᩹:Ll/ۤ᩷ۚ;

    return-object p1

    .line 754
    :pswitch_1
    sget-object p1, Ll/ۜۢۚ;->᩸:Ll/ۜۢۚ;

    return-object p1

    .line 729
    :pswitch_2
    check-cast p1, Ll/᩹ܽۚ;

    .line 772
    new-instance v0, Ll/۬᩷ۚ;

    .line 773
    invoke-interface {p1}, Ll/᩹ܽۚ;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ll/ܳۡۚ;->֫(Ljava/lang/String;)Ll/᩻ۡۚ;

    move-result-object v1

    .line 774
    invoke-interface {p1}, Ll/᩹ܽۚ;->getElements()Ljava/util/Set;

    move-result-object p1

    .line 701
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    new-instance v2, Ll/ܺۡۚ;

    invoke-direct {v2, p0}, Ll/ܺۡۚ;-><init>(Ll/᩵ۡۚ;)V

    invoke-static {p1, v2}, Ll/ۙ۫ܺ;->֫(Ljava/util/Iterator;Ll/ܽܶܺ;)Ljava/util/Iterator;

    move-result-object p1

    .line 700
    invoke-static {p1}, Ll/ۛ۬ܺ;->֫(Ljava/util/Iterator;)Ll/ۛ۬ܺ;

    move-result-object p1

    .line 774
    invoke-direct {v0, v1, p1}, Ll/۬᩷ۚ;-><init>(Ll/᩻ۡۚ;Ll/ۛ۬ܺ;)V

    return-object v0

    .line 731
    :pswitch_3
    check-cast p1, Ll/᩶ܽۚ;

    .line 779
    new-instance v0, Ll/۫᩷ۚ;

    .line 781
    invoke-interface {p1}, Ll/᩶ܽۚ;->getValue()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    new-instance v1, Ll/ۖۡۚ;

    invoke-direct {v1, p0}, Ll/ۖۡۚ;-><init>(Ll/᩵ۡۚ;)V

    invoke-static {p1, v1}, Ll/ۙ۫ܺ;->֫(Ljava/util/Iterator;Ll/ܽܶܺ;)Ljava/util/Iterator;

    move-result-object p1

    .line 780
    invoke-static {p1}, Ll/ܳ۬ܺ;->֫(Ljava/util/Iterator;)Ll/ܳ۬ܺ;

    move-result-object p1

    invoke-direct {v0, p1}, Ll/۫᩷ۚ;-><init>(Ljava/util/List;)V

    return-object v0

    .line 742
    :pswitch_4
    check-cast p1, Ll/ۛܽۚ;

    .line 793
    new-instance v0, Ll/۟᩷ۚ;

    invoke-interface {p1}, Ll/ۛܽۚ;->getValue()Ll/ᩴܽۚ;

    move-result-object p1

    invoke-virtual {v1, p1}, Ll/ۘۢۚ;->ᩳ(Ll/ᩴܽۚ;)Ll/ᩴۢۚ;

    move-result-object p1

    invoke-direct {v0, p1}, Ll/۟᩷ۚ;-><init>(Ll/ᩴۢۚ;)V

    return-object v0

    .line 752
    :pswitch_5
    check-cast p1, Ll/֫ᩳۚ;

    .line 803
    new-instance v0, Ll/ܿۢۚ;

    iget-object v1, p0, Ll/᩸ۜۚ;->ۙ:Ll/ۗۢۚ;

    invoke-interface {p1}, Ll/֫ᩳۚ;->getValue()Ll/ۚܽۚ;

    move-result-object p1

    invoke-virtual {v1, p1}, Ll/ۗۢۚ;->ᩳ(Ll/ۚܽۚ;)Ll/۫ۢۚ;

    move-result-object p1

    invoke-direct {v0, p1}, Ll/ܿۢۚ;-><init>(Ll/۫ۢۚ;)V

    return-object v0

    .line 744
    :pswitch_6
    check-cast p1, Ll/ۨܽۚ;

    .line 798
    new-instance v0, Ll/֫ۢۚ;

    invoke-interface {p1}, Ll/ۨܽۚ;->getValue()Ll/ᩴܽۚ;

    move-result-object p1

    invoke-virtual {v1, p1}, Ll/ۘۢۚ;->ᩳ(Ll/ᩴܽۚ;)Ll/ᩴۢۚ;

    move-result-object p1

    invoke-direct {v0, p1}, Ll/֫ۢۚ;-><init>(Ll/ᩴۢۚ;)V

    return-object v0

    .line 760
    :pswitch_7
    check-cast p1, Ll/ܳᩳۚ;

    .line 813
    new-instance v0, Ll/ۡۢۚ;

    invoke-interface {p1}, Ll/ܳᩳۚ;->getValue()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ll/ܳۡۚ;->֫(Ljava/lang/String;)Ll/᩻ۡۚ;

    move-result-object p1

    invoke-direct {v0, p1}, Ll/ۡۢۚ;-><init>(Ll/᩻ۡۚ;)V

    return-object v0

    .line 758
    :pswitch_8
    check-cast p1, Ll/ܿᩳۚ;

    .line 808
    new-instance v0, Ll/ۢۢۚ;

    iget-object v1, p0, Ll/᩸ۜۚ;->ᩳ֫:Ll/۟ۜۚ;

    check-cast v1, Ll/ܰۢۚ;

    invoke-interface {p1}, Ll/ܿᩳۚ;->getValue()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ll/ܰۢۚ;->֫(Ljava/lang/String;)Ll/۟ۢۚ;

    move-result-object p1

    invoke-direct {v0, p1}, Ll/ۢۢۚ;-><init>(Ll/۟ۢۚ;)V

    return-object v0

    .line 764
    :pswitch_9
    check-cast p1, Ll/ۧᩳۚ;

    .line 825
    new-instance v0, Ll/ܳۢۚ;

    iget-object v1, p0, Ll/᩸ۜۚ;->᩹:Ll/ܶۢۚ;

    invoke-interface {p1}, Ll/ۧᩳۚ;->getValue()Ll/᩵ܽۚ;

    move-result-object p1

    invoke-virtual {v1, p1}, Ll/ܶۢۚ;->ܽ(Ll/᩵ܽۚ;)Ll/᩸ۢۚ;

    move-result-object p1

    invoke-direct {v0, p1}, Ll/ܳۢۚ;-><init>(Ll/᩸ۢۚ;)V

    return-object v0

    .line 762
    :pswitch_a
    check-cast p1, Ll/ܽᩳۚ;

    .line 819
    new-instance v0, Ll/᩻ۢۚ;

    iget-object v1, p0, Ll/᩸ۜۚ;->۟:Ll/ۛۢۚ;

    invoke-interface {p1}, Ll/ܽᩳۚ;->getValue()Ll/֡ܽۚ;

    move-result-object p1

    invoke-virtual {v1, p1}, Ll/ۛۢۚ;->ᩳ(Ll/֡ܽۚ;)Ll/۬ۢۚ;

    move-result-object p1

    invoke-direct {v0, p1}, Ll/᩻ۢۚ;-><init>(Ll/۬ۢۚ;)V

    return-object v0

    .line 740
    :cond_1
    new-instance v0, Ll/᩺᩷ۚ;

    check-cast p1, Ll/۫ܽۚ;

    invoke-interface {p1}, Ll/۫ܽۚ;->getValue()D

    move-result-wide v1

    .line 168
    invoke-direct {v0, v1, v2}, Ll/ᩳܿۚ;-><init>(D)V

    return-object v0

    .line 746
    :cond_2
    new-instance v0, Ll/ۧۢۚ;

    check-cast p1, Ll/᩺ܽۚ;

    invoke-interface {p1}, Ll/᩺ܽۚ;->getValue()F

    move-result p1

    .line 207
    invoke-direct {v0, p1}, Ll/ۢܿۚ;-><init>(F)V

    return-object v0

    .line 748
    :cond_3
    new-instance v0, Ll/ܽۢۚ;

    check-cast p1, Ll/ܰܽۚ;

    invoke-interface {p1}, Ll/ܰܽۚ;->getValue()I

    move-result p1

    .line 214
    invoke-direct {v0, p1}, Ll/ۡܿۚ;-><init>(I)V

    return-object v0

    .line 738
    :cond_4
    new-instance v0, Ll/ۨ᩷ۚ;

    check-cast p1, Ll/۬ܽۚ;

    invoke-interface {p1}, Ll/۬ܽۚ;->getValue()C

    move-result p1

    .line 161
    invoke-direct {v0, p1}, Ll/ܽܿۚ;-><init>(C)V

    return-object v0

    .line 756
    :cond_5
    new-instance v0, Ll/᩷ۢۚ;

    check-cast p1, Ll/ᩳᩳۚ;

    invoke-interface {p1}, Ll/ᩳᩳۚ;->getValue()S

    move-result p1

    .line 251
    invoke-direct {v0, p1}, Ll/֡ܿۚ;-><init>(S)V

    return-object v0

    .line 750
    :cond_6
    new-instance v0, Ll/ᩳۢۚ;

    check-cast p1, Ll/۟ܽۚ;

    invoke-interface {p1}, Ll/۟ܽۚ;->getValue()J

    move-result-wide v1

    .line 221
    invoke-direct {v0, v1, v2}, Ll/ܺܿۚ;-><init>(J)V

    return-object v0

    .line 736
    :cond_7
    new-instance v0, Ll/ۛ᩷ۚ;

    check-cast p1, Ll/ۗܽۚ;

    invoke-interface {p1}, Ll/ۗܽۚ;->getValue()B

    move-result p1

    .line 154
    invoke-direct {v0, p1}, Ll/ۧܿۚ;-><init>(B)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x15
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

.method public final ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILl/ۤܽۚ;Ljava/util/Set;Ljava/util/Set;)Ll/ܺۢۚ;
    .locals 7

    .line 179
    new-instance v6, Ll/ܺۢۚ;

    iget-object v0, p0, Ll/᩸ۜۚ;->ۚ:Ll/ۘۢۚ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    new-instance v1, Ll/᩶ᩳۚ;

    invoke-direct {v1, p1, p2, p3}, Ll/᩶ᩳۚ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    invoke-virtual {v0, v1}, Ll/ۘۢۚ;->ᩳ(Ll/ᩴܽۚ;)Ll/ᩴۢۚ;

    move-result-object v1

    if-nez p5, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 722
    :cond_0
    invoke-virtual {p0, p5}, Ll/᩵ۡۚ;->֫(Ll/ۤܽۚ;)Ll/ܰ᩷ۚ;

    move-result-object p1

    :goto_0
    move-object v3, p1

    .line 181
    iget-object p1, p0, Ll/᩸ۜۚ;->ܿ:Ll/ۜۜۚ;

    check-cast p1, Ll/ۡ᩷ۚ;

    .line 182
    invoke-virtual {p1, p6}, Ll/ۡ᩷ۚ;->֫(Ljava/util/Set;)Ll/ۜ᩷ۚ;

    move-result-object v4

    move-object v0, v6

    move v2, p4

    move-object v5, p7

    invoke-direct/range {v0 .. v5}, Ll/ܺۢۚ;-><init>(Ll/ᩴۢۚ;ILl/ܰ᩷ۚ;Ll/ۜ᩷ۚ;Ljava/util/Set;)V

    return-object v6
.end method

.method public final ֫()Ll/ᩴۡۚ;
    .locals 1

    .line 168
    new-instance v0, Ll/ᩴۡۚ;

    invoke-direct {v0, p0}, Ll/ᩴۡۚ;-><init>(Ll/᩵ۡۚ;)V

    return-object v0
.end method

.method public final ֫(Ll/᩵֫ۚ;)Ll/᩵֫ۚ;
    .locals 13

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 539
    :cond_0
    invoke-interface {p1}, Ll/᩵֫ۚ;->᩻()I

    move-result v1

    .line 540
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 542
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 543
    iget-boolean v4, p0, Ll/᩵ۡۚ;->ۢ֫:Z

    .line 544
    invoke-interface {p1}, Ll/᩵֫ۚ;->᩷()Ljava/lang/Iterable;

    move-result-object v5

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_1
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩺֫ۚ;

    .line 545
    instance-of v7, v6, Ll/֨֫ۚ;

    if-eqz v7, :cond_2

    .line 546
    move-object v7, v6

    check-cast v7, Ll/֨֫ۚ;

    invoke-interface {v7, p0}, Ll/֨֫ۚ;->֫(Ll/᩵ۡۚ;)V

    :cond_2
    if-eqz v4, :cond_3

    .line 548
    move-object v7, v6

    check-cast v7, Ll/ۢܰ֡;

    .line 158
    iget-object v8, v7, Ll/ۢܰ֡;->᩶:Ll/֨ۗ֡;

    .line 549
    iget v9, v8, Ll/֨ۗ֡;->᩶:I

    and-int/lit8 v9, v9, 0x2

    if-eqz v9, :cond_3

    .line 550
    sget-object v9, Ll/ۘۡۚ;->֫:[I

    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    aget v8, v9, v8

    packed-switch v8, :pswitch_data_0

    goto :goto_1

    .line 585
    :pswitch_0
    sget-object v8, Ll/֨ۗ֡;->ᩳ᩻:Ll/֨ۗ֡;

    iput-object v8, v7, Ll/ۢܰ֡;->᩶:Ll/֨ۗ֡;

    goto :goto_1

    .line 582
    :pswitch_1
    sget-object v8, Ll/֨ۗ֡;->ᩳ᩻:Ll/֨ۗ֡;

    iput-object v8, v7, Ll/ۢܰ֡;->᩶:Ll/֨ۗ֡;

    goto :goto_1

    .line 579
    :pswitch_2
    sget-object v8, Ll/֨ۗ֡;->ۡᩳ:Ll/֨ۗ֡;

    iput-object v8, v7, Ll/ۢܰ֡;->᩶:Ll/֨ۗ֡;

    goto :goto_1

    .line 576
    :pswitch_3
    sget-object v8, Ll/֨ۗ֡;->᩷ۜ:Ll/֨ۗ֡;

    iput-object v8, v7, Ll/ۢܰ֡;->᩶:Ll/֨ۗ֡;

    goto :goto_1

    .line 573
    :pswitch_4
    sget-object v8, Ll/֨ۗ֡;->ܶ᩻:Ll/֨ۗ֡;

    iput-object v8, v7, Ll/ۢܰ֡;->᩶:Ll/֨ۗ֡;

    goto :goto_1

    .line 570
    :pswitch_5
    sget-object v8, Ll/֨ۗ֡;->᩷ܿ:Ll/֨ۗ֡;

    iput-object v8, v7, Ll/ۢܰ֡;->᩶:Ll/֨ۗ֡;

    goto :goto_1

    .line 567
    :pswitch_6
    sget-object v8, Ll/֨ۗ֡;->ܰܽ:Ll/֨ۗ֡;

    iput-object v8, v7, Ll/ۢܰ֡;->᩶:Ll/֨ۗ֡;

    goto :goto_1

    .line 564
    :pswitch_7
    sget-object v8, Ll/֨ۗ֡;->ۗܽ:Ll/֨ۗ֡;

    iput-object v8, v7, Ll/ۢܰ֡;->᩶:Ll/֨ۗ֡;

    goto :goto_1

    .line 561
    :pswitch_8
    sget-object v8, Ll/֨ۗ֡;->֫ۜ:Ll/֨ۗ֡;

    iput-object v8, v7, Ll/ۢܰ֡;->᩶:Ll/֨ۗ֡;

    goto :goto_1

    .line 558
    :pswitch_9
    sget-object v8, Ll/֨ۗ֡;->ۖ᩻:Ll/֨ۗ֡;

    iput-object v8, v7, Ll/ۢܰ֡;->᩶:Ll/֨ۗ֡;

    goto :goto_1

    .line 555
    :pswitch_a
    sget-object v8, Ll/֨ۗ֡;->ۤᩳ:Ll/֨ۗ֡;

    iput-object v8, v7, Ll/ۢܰ֡;->᩶:Ll/֨ۗ֡;

    goto :goto_1

    .line 552
    :pswitch_b
    sget-object v8, Ll/֨ۗ֡;->֨ܽ:Ll/֨ۗ֡;

    iput-object v8, v7, Ll/ۢܰ֡;->᩶:Ll/֨ۗ֡;

    :cond_3
    :goto_1
    if-eqz v6, :cond_1

    .line 591
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 593
    :cond_4
    invoke-interface {p1}, Ll/᩵֫ۚ;->ۜ()Ljava/util/List;

    move-result-object v4

    .line 594
    new-instance v5, Ljava/util/ArrayList;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 595
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۚ֫ۚ;

    .line 646
    invoke-interface {v6}, Ll/ۚ֫ۚ;->֫()I

    move-result v7

    .line 647
    invoke-interface {v6}, Ll/ۚ֫ۚ;->ܽ()I

    move-result v8

    .line 649
    invoke-interface {v6}, Ll/ۚ֫ۚ;->ۧ()Ljava/util/List;

    move-result-object v6

    .line 650
    new-instance v9, Ljava/util/ArrayList;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v10

    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 651
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_6

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ۖ֫ۚ;

    .line 673
    invoke-interface {v10}, Ll/ۖ֫ۚ;->ܽۧ()Ljava/lang/String;

    move-result-object v11

    if-nez v11, :cond_5

    move-object v11, v0

    goto :goto_4

    .line 280
    :cond_5
    iget-object v12, p0, Ll/᩸ۜۚ;->᩻֫:Ll/ܳۡۚ;

    invoke-virtual {v12, v11}, Ll/ܳۡۚ;->֫(Ljava/lang/String;)Ll/᩻ۡۚ;

    move-result-object v11

    .line 675
    :goto_4
    invoke-interface {v10}, Ll/ۖ֫ۚ;->۟()I

    move-result v10

    .line 676
    new-instance v12, Ll/ۡۡۚ;

    invoke-direct {v12, v11, v10}, Ll/ۡۡۚ;-><init>(Ll/᩻ۡۚ;I)V

    .line 652
    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 653
    :cond_6
    new-instance v6, Ll/ۢۡۚ;

    invoke-direct {v6, v9, v7, v8}, Ll/ۢۡۚ;-><init>(Ljava/util/ArrayList;II)V

    .line 596
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 598
    :cond_7
    invoke-interface {p1}, Ll/᩵֫ۚ;->ۢ()Ljava/lang/Iterable;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_8
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۠֫ۚ;

    .line 599
    invoke-interface {v0}, Ll/۠֫ۚ;->ܽ()I

    move-result v4

    .line 600
    iget-boolean v6, p0, Ll/᩵ۡۚ;->᩵֫:Z

    if-eqz v6, :cond_9

    const/16 v6, 0x9

    if-ne v4, v6, :cond_9

    goto :goto_5

    .line 603
    :cond_9
    iget-boolean v6, p0, Ll/᩵ۡۚ;->ܺ֫:Z

    if-eqz v6, :cond_a

    const/16 v6, 0xa

    if-ne v4, v6, :cond_a

    goto :goto_5

    .line 606
    :cond_a
    iget-boolean v6, p0, Ll/᩵ۡۚ;->ᩴ֫:Z

    if-eqz v6, :cond_b

    const/4 v6, 0x7

    if-eq v4, v6, :cond_8

    const/16 v6, 0x8

    if-ne v4, v6, :cond_b

    goto :goto_5

    .line 609
    :cond_b
    iget-boolean v6, p0, Ll/᩵ۡۚ;->ۖ֫:Z

    if-eqz v6, :cond_c

    const/4 v6, 0x3

    if-eq v4, v6, :cond_8

    const/4 v6, 0x6

    if-eq v4, v6, :cond_8

    const/4 v6, 0x5

    if-ne v4, v6, :cond_c

    goto :goto_5

    .line 612
    :cond_c
    instance-of v4, v0, Ll/֨֫ۚ;

    if-eqz v4, :cond_d

    .line 613
    move-object v4, v0

    check-cast v4, Ll/֨֫ۚ;

    invoke-interface {v4, p0}, Ll/֨֫ۚ;->֫(Ll/᩵ۡۚ;)V

    .line 614
    :cond_d
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 617
    :cond_e
    new-instance p1, Ll/᩷ۡۚ;

    invoke-direct {p1, v1, v2, v5, v3}, Ll/᩷ۡۚ;-><init>(ILjava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
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

.method public final ֫(Ll/֨ۜۚ;Ljava/lang/Object;)V
    .locals 2

    .line 135
    check-cast p2, Ll/ܰ᩷ۚ;

    .line 359
    invoke-interface {p2}, Ll/ۤܽۚ;->ۖ()I

    move-result v0

    if-eqz v0, :cond_6

    const/4 v1, 0x6

    if-eq v0, v1, :cond_5

    const/4 v1, 0x2

    if-eq v0, v1, :cond_4

    const/4 v1, 0x3

    if-eq v0, v1, :cond_3

    const/4 v1, 0x4

    if-eq v0, v1, :cond_2

    const/16 v1, 0x10

    if-eq v0, v1, :cond_1

    const/16 v1, 0x11

    if-eq v0, v1, :cond_0

    packed-switch v0, :pswitch_data_0

    .line 417
    new-instance p1, Ll/ܶ᩵ۚ;

    invoke-interface {p2}, Ll/ۤܽۚ;->ۖ()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p2, v0, v1

    const/4 p2, 0x0

    const-string v1, "Unrecognized value type: %d"

    .line 46
    invoke-direct {p1, p2, v1, v0}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 417
    throw p1

    .line 369
    :pswitch_0
    check-cast p2, Ll/ۙܽۚ;

    invoke-interface {p2}, Ll/ۙܽۚ;->getValue()Z

    move-result p2

    invoke-virtual {p1, p2}, Ll/᩹ۜۚ;->֫(Z)V

    return-void

    .line 399
    :pswitch_1
    invoke-virtual {p1}, Ll/᩹ۜۚ;->֫()V

    return-void

    .line 361
    :pswitch_2
    check-cast p2, Ll/۬᩷ۚ;

    .line 362
    iget-object v0, p2, Ll/۬᩷ۚ;->᩹:Ll/᩻ۡۚ;

    iget-object p2, p2, Ll/۬᩷ۚ;->᩸:Ljava/util/Set;

    invoke-virtual {p1, v0, p2}, Ll/᩹ۜۚ;->֫(Ll/᩻ۡۚ;Ljava/util/Set;)V

    return-void

    .line 365
    :pswitch_3
    check-cast p2, Ll/۫᩷ۚ;

    .line 366
    iget-object p2, p2, Ll/۫᩷ۚ;->᩸:Ljava/util/List;

    invoke-virtual {p1, p2}, Ll/᩹ۜۚ;->֫(Ljava/util/List;)V

    return-void

    .line 381
    :pswitch_4
    check-cast p2, Ll/۟᩷ۚ;

    .line 184
    iget-object p2, p2, Ll/۟᩷ۚ;->᩸:Ll/ᩴۢۚ;

    .line 381
    invoke-virtual {p1, p2}, Ll/᩹ۜۚ;->֫(Ll/ᩴۢۚ;)V

    return-void

    .line 396
    :pswitch_5
    check-cast p2, Ll/ܿۢۚ;

    iget-object p2, p2, Ll/ܿۢۚ;->᩸:Ll/۫ۢۚ;

    invoke-virtual {p1, p2}, Ll/᩹ۜۚ;->֫(Ll/۫ۢۚ;)V

    return-void

    .line 384
    :pswitch_6
    check-cast p2, Ll/֫ۢۚ;

    iget-object p2, p2, Ll/֫ۢۚ;->᩸:Ll/ᩴۢۚ;

    invoke-virtual {p1, p2}, Ll/᩹ۜۚ;->ۧ(Ll/ᩴۢۚ;)V

    return-void

    .line 408
    :pswitch_7
    check-cast p2, Ll/ۡۢۚ;

    iget-object p2, p2, Ll/ۡۢۚ;->᩸:Ll/᩻ۡۚ;

    invoke-virtual {p1, p2}, Ll/᩹ۜۚ;->֫(Ll/᩻ۡۚ;)V

    return-void

    .line 405
    :pswitch_8
    check-cast p2, Ll/ۢۢۚ;

    iget-object p2, p2, Ll/ۢۢۚ;->᩸:Ll/۟ۢۚ;

    invoke-virtual {p1, p2}, Ll/᩹ۜۚ;->֫(Ll/۟ۢۚ;)V

    return-void

    .line 414
    :pswitch_9
    check-cast p2, Ll/ܳۢۚ;

    iget-object p2, p2, Ll/ܳۢۚ;->᩸:Ll/᩸ۢۚ;

    invoke-virtual {p1, p2}, Ll/᩹ۜۚ;->֫(Ll/᩸ۢۚ;)V

    return-void

    .line 411
    :pswitch_a
    check-cast p2, Ll/᩻ۢۚ;

    iget-object p2, p2, Ll/᩻ۢۚ;->᩸:Ll/۬ۢۚ;

    invoke-virtual {p1, p2}, Ll/᩹ۜۚ;->֫(Ll/۬ۢۚ;)V

    return-void

    .line 378
    :cond_0
    check-cast p2, Ll/۫ܽۚ;

    invoke-interface {p2}, Ll/۫ܽۚ;->getValue()D

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Ll/᩹ۜۚ;->֫(D)V

    return-void

    .line 387
    :cond_1
    check-cast p2, Ll/᩺ܽۚ;

    invoke-interface {p2}, Ll/᩺ܽۚ;->getValue()F

    move-result p2

    invoke-virtual {p1, p2}, Ll/᩹ۜۚ;->֫(F)V

    return-void

    .line 390
    :cond_2
    check-cast p2, Ll/ܰܽۚ;

    invoke-interface {p2}, Ll/ܰܽۚ;->getValue()I

    move-result p2

    invoke-virtual {p1, p2}, Ll/᩹ۜۚ;->֫(I)V

    return-void

    .line 375
    :cond_3
    check-cast p2, Ll/۬ܽۚ;

    invoke-interface {p2}, Ll/۬ܽۚ;->getValue()C

    move-result p2

    invoke-virtual {p1, p2}, Ll/᩹ۜۚ;->֫(C)V

    return-void

    .line 402
    :cond_4
    check-cast p2, Ll/ᩳᩳۚ;

    invoke-interface {p2}, Ll/ᩳᩳۚ;->getValue()S

    move-result p2

    invoke-virtual {p1, p2}, Ll/᩹ۜۚ;->ۧ(I)V

    return-void

    .line 393
    :cond_5
    check-cast p2, Ll/۟ܽۚ;

    invoke-interface {p2}, Ll/۟ܽۚ;->getValue()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Ll/᩹ۜۚ;->֫(J)V

    return-void

    .line 372
    :cond_6
    check-cast p2, Ll/ۗܽۚ;

    invoke-interface {p2}, Ll/ۗܽۚ;->getValue()B

    move-result p2

    invoke-virtual {p1, p2}, Ll/᩹ۜۚ;->֫(B)V

    return-void

    :pswitch_data_0
    .packed-switch 0x15
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

.method public final ֫(Z)V
    .locals 0

    .line 422
    iput-boolean p1, p0, Ll/᩵ۡۚ;->ۢ֫:Z

    return-void
.end method

.method public final ۧ(Ljava/lang/String;)Ll/۟ۢۚ;
    .locals 1

    .line 267
    iget-object v0, p0, Ll/᩸ۜۚ;->ᩳ֫:Ll/۟ۜۚ;

    check-cast v0, Ll/ܰۢۚ;

    invoke-virtual {v0, p1}, Ll/ܰۢۚ;->֫(Ljava/lang/String;)Ll/۟ۢۚ;

    move-result-object p1

    return-object p1
.end method

.method public final ܽ()Z
    .locals 1

    .line 162
    iget-boolean v0, p0, Ll/᩵ۡۚ;->ۡ֫:Z

    if-nez v0, :cond_0

    invoke-super {p0}, Ll/᩸ۜۚ;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
