.class public Ll/ܳ᩶᩻;
.super Ll/᩹ܶۢ;
.source "J1YX"


# static fields
.field public static final synthetic ۚ֫:I


# instance fields
.field public ֡֫:Ll/ᩳܰۡ;

.field public ۘ֫:Ljava/util/ArrayList;

.field public ᩴ֫:J

.field public ᩵֫:Ll/᩸᩶᩻;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 408
    invoke-direct {p0}, Ll/᩹ܶۢ;-><init>()V

    .line 412
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܳ᩶᩻;->ۘ֫:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final ֫(Lbin/mt/plus/Main;Ll/ܽۢܳ;Ll/ܽۢܳ;Ll/ܿ۠ۢ;)V
    .locals 0

    .line 542
    invoke-virtual {p4}, Ll/ܿ۠ۢ;->ᩳ()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p2}, Ll/ۘ۠ۢ;->ۧ(Ll/ܽۢܳ;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 543
    invoke-virtual {p2}, Ll/ܽۢܳ;->ܳ()V

    .line 544
    iget-object p1, p0, Ll/ܳ᩶᩻;->ۘ֫:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ll/ܽۢܳ;->֫(Ljava/util/Collection;)V

    .line 545
    invoke-virtual {p2}, Ll/ܽۢܳ;->ۖ֫()V

    :cond_0
    return-void
.end method

.method public final ۘ֫()Ljava/lang/CharSequence;
    .locals 2

    const-string v0, "zipPath"

    .line 421
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->֨(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f1205f9

    .line 651
    invoke-static {v1}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v1

    .line 421
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f120a2d

    .line 655
    invoke-static {v1, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۠()Ll/ۨܺ᩷;
    .locals 1

    .line 416
    sget-object v0, Ll/᩻ܶۢ;->ۘ:Ll/ۨܺ᩷;

    return-object v0
.end method

.method public final ۢ()Ll/ܿ۠ۢ;
    .locals 17

    move-object/from16 v0, p0

    const-string v1, "zipPath"

    .line 433
    invoke-virtual {v0, v1}, Ll/ۘ۠ۢ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "data"

    .line 434
    invoke-virtual {v0, v2}, Ll/ۘ۠ۢ;->᩷(Ljava/lang/String;)[B

    move-result-object v2

    invoke-static {v2}, Ll/۬ۜܽ;->ۧ([B)Ll/۬ۜܽ;

    move-result-object v2

    .line 435
    invoke-virtual {v2}, Ll/۬ۜܽ;->᩹()Ljava/lang/String;

    move-result-object v3

    .line 436
    invoke-virtual {v2}, Ll/۬ۜܽ;->readInt()I

    move-result v4

    .line 437
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5, v4}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_0
    const/4 v8, 0x1

    if-ge v7, v4, :cond_2

    .line 439
    invoke-virtual {v2}, Ll/۬ۜܽ;->᩹()Ljava/lang/String;

    move-result-object v9

    .line 440
    invoke-virtual {v2}, Ll/۬ۜܽ;->᩹()Ljava/lang/String;

    move-result-object v10

    .line 441
    invoke-virtual {v2}, Ll/۬ۜܽ;->readByte()B

    move-result v11

    .line 442
    new-instance v12, Ll/ᩳ᩶᩻;

    invoke-virtual {v3, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v3, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    and-int/lit8 v13, v11, 0x1

    if-eqz v13, :cond_0

    const/4 v13, 0x1

    goto :goto_1

    :cond_0
    const/4 v13, 0x0

    :goto_1
    and-int/lit8 v11, v11, 0x2

    if-eqz v11, :cond_1

    goto :goto_2

    :cond_1
    const/4 v8, 0x0

    :goto_2
    invoke-direct {v12, v9, v10, v13, v8}, Ll/ᩳ᩶᩻;-><init>(Ljava/lang/String;Ljava/lang/String;ZZ)V

    invoke-virtual {v5, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 449
    :cond_2
    invoke-virtual {v2}, Ll/۬ۜܽ;->readInt()I

    move-result v3

    .line 450
    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4, v3}, Ljava/util/HashSet;-><init>(I)V

    const/4 v7, 0x0

    :goto_3
    if-ge v7, v3, :cond_3

    .line 452
    invoke-virtual {v2}, Ll/۬ۜܽ;->᩹()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    .line 454
    :cond_3
    invoke-virtual/range {p0 .. p0}, Ll/ۘ۠ۢ;->ۛ()Ll/ۨۧᩳ;

    move-result-object v2

    const-string v3, "keepApkSigBlock"

    .line 455
    invoke-virtual {v0, v3}, Ll/ۘ۠ۢ;->ܽ(Ljava/lang/String;)Z

    move-result v3

    new-array v7, v6, [Ljava/lang/String;

    .line 456
    invoke-static {v1, v7}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    .line 458
    new-instance v7, Ll/ᩳܰۡ;

    invoke-direct {v7, v1}, Ll/ᩳܰۡ;-><init>(Ll/ܶ᩵ܿ;)V

    iput-object v7, v0, Ll/ܳ᩶᩻;->֡֫:Ll/ᩳܰۡ;

    if-eqz v2, :cond_4

    const/4 v7, 0x1

    goto :goto_4

    :cond_4
    const/4 v7, 0x0

    .line 459
    :goto_4
    invoke-static {v1, v7}, Ll/᩹᩶᩻;->֫(Ll/ܶ᩵ܿ;Z)Ll/᩸᩶᩻;

    move-result-object v7

    iput-object v7, v0, Ll/ܳ᩶᩻;->᩵֫:Ll/᩸᩶᩻;

    .line 460
    invoke-virtual {v7}, Ll/᩸᩶᩻;->ۧ()Ll/ۡܰۡ;

    move-result-object v7

    if-nez v2, :cond_5

    if-eqz v3, :cond_5

    .line 461
    iget-object v3, v0, Ll/ܳ᩶᩻;->֡֫:Ll/ᩳܰۡ;

    invoke-virtual {v3}, Ll/ᩳܰۡ;->ܶ()Z

    move-result v3

    if-eqz v3, :cond_5

    .line 462
    iget-object v3, v0, Ll/ܳ᩶᩻;->֡֫:Ll/ᩳܰۡ;

    invoke-virtual {v7, v3}, Ll/ۡܰۡ;->֫(Ll/ᩳܰۡ;)V

    .line 464
    :cond_5
    iget-object v3, v0, Ll/ܳ᩶᩻;->֡֫:Ll/ᩳܰۡ;

    invoke-virtual {v3}, Ll/ᩳܰۡ;->᩸()Z

    move-result v3

    if-eqz v3, :cond_6

    .line 465
    invoke-virtual {v7}, Ll/ۡܰۡ;->ᩳ()V

    .line 467
    :cond_6
    iget-object v3, v0, Ll/ܳ᩶᩻;->֡֫:Ll/ᩳܰۡ;

    invoke-virtual {v3}, Ll/ᩳܰۡ;->᩶ۧ()Ljava/util/Collection;

    move-result-object v3

    .line 469
    invoke-static {v3}, Ll/᩹᩶᩻;->֫(Ljava/util/Collection;)J

    move-result-wide v9

    .line 470
    new-instance v11, Ll/ܿ᩶᩻;

    invoke-direct {v11, v0, v9, v10}, Ll/ܿ᩶᩻;-><init>(Ll/ܳ᩶᩻;J)V

    .line 484
    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v9

    const/4 v10, 0x0

    :goto_5
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_c

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/ۗ᩺ۡ;

    .line 485
    invoke-virtual/range {p0 .. p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v13

    if-eqz v13, :cond_7

    .line 486
    invoke-static {}, Ll/ܿ۠ۢ;->ܿ()Ll/ܿ۠ۢ;

    move-result-object v1

    return-object v1

    .line 489
    :cond_7
    invoke-virtual {v12}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v4, v13}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_8

    goto :goto_5

    .line 493
    :cond_8
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :cond_9
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_a

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ll/ᩳ᩶᩻;

    .line 494
    invoke-virtual {v14, v12}, Ll/ᩳ᩶᩻;->֫(Ll/ۗ᩺ۡ;)Z

    move-result v14

    if-eqz v14, :cond_9

    :cond_a
    add-int/lit8 v10, v10, 0x1

    .line 500
    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const v14, 0x7f120ac0

    invoke-static {v14}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v14, "("

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v14, "/"

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v14

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v14, ")"

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v0, v13}, Ll/ۘ۠ۢ;->ܶ(Ljava/lang/String;)V

    .line 501
    invoke-virtual {v12}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v0, v13}, Ll/ۘ۠ۢ;->֫(Ljava/lang/CharSequence;)V

    .line 502
    invoke-virtual {v12}, Ll/ۗ᩺ۡ;->isDirectory()Z

    move-result v13

    if-eqz v13, :cond_b

    .line 503
    invoke-virtual {v7, v12}, Ll/ۡܰۡ;->֫(Ll/ۗ᩺ۡ;)V

    goto :goto_5

    .line 505
    :cond_b
    iget-object v13, v0, Ll/ܳ᩶᩻;->֡֫:Ll/ᩳܰۡ;

    invoke-static {v12, v13, v7, v11}, Ll/᩹᩶᩻;->֫(Ll/ۗ᩺ۡ;Ll/ᩳܰۡ;Ll/ۡܰۡ;Ll/۠᩶᩻;)V

    .line 506
    iget-wide v13, v0, Ll/ܳ᩶᩻;->ᩴ֫:J

    invoke-virtual {v12}, Ll/ۗ᩺ۡ;->ܳ()J

    move-result-wide v15

    add-long/2addr v13, v15

    iput-wide v13, v0, Ll/ܳ᩶᩻;->ᩴ֫:J

    goto/16 :goto_5

    :cond_c
    const/16 v3, 0x64

    .line 510
    invoke-virtual {v0, v3}, Ll/᩹ܶۢ;->ܺ(I)V

    .line 511
    invoke-virtual {v0, v3}, Ll/ۘ۠ۢ;->ۢ(I)V

    .line 513
    invoke-virtual {v7}, Ll/ۡܰۡ;->close()V

    if-eqz v2, :cond_d

    .line 516
    iget-object v3, v0, Ll/ܳ᩶᩻;->᩵֫:Ll/᩸᩶᩻;

    invoke-static {v3, v2, v0}, Ll/ۤۗܳ;->֫(Ll/᩸᩶᩻;Ll/ۨۧᩳ;Ll/ۘ۠ۢ;)V

    .line 518
    :cond_d
    invoke-virtual/range {p0 .. p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v2

    if-eqz v2, :cond_e

    .line 519
    invoke-static {}, Ll/ܿ۠ۢ;->ܿ()Ll/ܿ۠ۢ;

    move-result-object v1

    return-object v1

    .line 521
    :cond_e
    invoke-static {v1}, Ll/ᩴܶۡ;->ۧ(Ll/ܶ᩵ܿ;)V

    .line 522
    new-instance v2, Ll/ܿ᩵ܿ;

    invoke-direct {v2}, Ll/ܿ᩵ܿ;-><init>()V

    .line 523
    invoke-virtual {v2, v1}, Ll/ܿ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)V

    .line 525
    iget-object v3, v0, Ll/ܳ᩶᩻;->᩵֫:Ll/᩸᩶᩻;

    new-instance v4, Ll/ܽۛᩳ;

    invoke-direct {v4, v8, v0, v1}, Ll/ܽۛᩳ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object v7, v0, Ll/ܳ᩶᩻;->֡֫:Ll/ᩳܰۡ;

    new-array v8, v8, [Ljava/lang/AutoCloseable;

    aput-object v7, v8, v6

    invoke-virtual {v3, v1, v4, v8}, Ll/᩸᩶᩻;->֫(Ll/ܶ᩵ܿ;Ljava/lang/Runnable;[Ljava/lang/AutoCloseable;)V

    .line 529
    invoke-virtual {v2, v1}, Ll/ܿ᩵ܿ;->ᩳ(Ll/ܶ᩵ܿ;)V

    .line 531
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_f
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_10

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩳ᩶᩻;

    .line 532
    invoke-virtual {v2}, Ll/ᩳ᩶᩻;->֫()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_f

    .line 534
    iget-object v3, v0, Ll/ܳ᩶᩻;->ۘ֫:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    .line 537
    :cond_10
    invoke-static {}, Ll/ܿ۠ۢ;->ܳ()Ll/ܿ۠ۢ;

    move-result-object v1

    return-object v1
.end method

.method public final ۧ(Ll/ܿ۠ۢ;)V
    .locals 0

    .line 551
    invoke-virtual {p1}, Ll/ܿ۠ۢ;->ᩳ()Z

    move-result p1

    if-nez p1, :cond_0

    .line 552
    iget-object p1, p0, Ll/ܳ᩶᩻;->᩵֫:Ll/᩸᩶᩻;

    if-eqz p1, :cond_0

    .line 553
    invoke-virtual {p1}, Ll/᩸᩶᩻;->ۧ()Ll/ۡܰۡ;

    move-result-object p1

    invoke-static {p1}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 554
    iget-object p1, p0, Ll/ܳ᩶᩻;->᩵֫:Ll/᩸᩶᩻;

    invoke-virtual {p1}, Ll/᩸᩶᩻;->֫()Ll/ܶ᩵ܿ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->۬()Z

    .line 557
    :cond_0
    iget-object p1, p0, Ll/ܳ᩶᩻;->֡֫:Ll/ᩳܰۡ;

    invoke-static {p1}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 558
    invoke-static {}, Ll/ܶ᩹᩷;->ۧ()V

    return-void
.end method

.method public final ᩷()V
    .locals 1

    const v0, 0x7f120797

    .line 426
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ۡ(I)V

    const-string v0, "..."

    .line 427
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->֫(Ljava/lang/CharSequence;)V

    return-void
.end method
