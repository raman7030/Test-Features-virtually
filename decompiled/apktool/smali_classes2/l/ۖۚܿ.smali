.class public final Ll/ۖۚܿ;
.super Ll/۟ܶۡ;
.source "LAQJ"


# instance fields
.field public ۜ:Ll/ܳ֨ܿ;

.field public final synthetic ۡ:Ll/ܶ᩵ܿ;

.field public final synthetic ۢ:Ll/ۧ֨ܿ;

.field public ܳ:Ll/᩺ۚܿ;

.field public ᩷:Ll/᩺ۤܿ;

.field public ᩻:Ll/۬ۚۢ;


# direct methods
.method public constructor <init>(Ll/ۧ֨ܿ;Ll/ܶ᩵ܿ;)V
    .locals 0

    .line 503
    iput-object p1, p0, Ll/ۖۚܿ;->ۢ:Ll/ۧ֨ܿ;

    iput-object p2, p0, Ll/ۖۚܿ;->ۡ:Ll/ܶ᩵ܿ;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    .line 506
    new-instance p1, Ll/᩺ۚܿ;

    invoke-direct {p1}, Ll/᩺ۚܿ;-><init>()V

    iput-object p1, p0, Ll/ۖۚܿ;->ܳ:Ll/᩺ۚܿ;

    return-void
.end method

.method private ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 609
    iget-object v0, p0, Ll/ۖۚܿ;->᩻:Ll/۬ۚۢ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide/16 v1, 0x0

    .line 15
    invoke-virtual {v0, v1, v2, p1}, Ll/۬ۚۢ;->֫(JLjava/lang/String;)Ll/۫ۚۢ;

    move-result-object p1

    .line 609
    invoke-virtual {p1}, Ll/۫ۚۢ;->֫()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final ֫()V
    .locals 3

    .line 614
    iget-object v0, p0, Ll/ۖۚܿ;->᩷:Ll/᩺ۤܿ;

    invoke-virtual {v0}, Ll/᩺ۤܿ;->᩻()Z

    move-result v0

    if-nez v0, :cond_0

    .line 615
    iget-object v0, p0, Ll/ۖۚܿ;->ۢ:Ll/ۧ֨ܿ;

    invoke-static {v0}, Ll/ۧ֨ܿ;->֫(Ll/ۧ֨ܿ;)Ll/ۗܺ᩷;

    move-result-object v1

    invoke-virtual {v0}, Ll/ۧ֨ܿ;->getFileName()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Ll/ۖۚܿ;->ܳ:Ll/᩺ۚܿ;

    iget-object v2, v2, Ll/᩺ۚܿ;->ܿ:Ljava/lang/String;

    invoke-static {v1, v0, v2}, Ll/᩷֨ܿ;->֫(Ll/ۗܺ᩷;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 1

    .line 622
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    if-eqz v0, :cond_0

    return-void

    .line 625
    :cond_0
    iget-object v0, p0, Ll/ۖۚܿ;->ۢ:Ll/ۧ֨ܿ;

    invoke-virtual {v0, p1}, Ll/ۧ֨ܿ;->֫(Ljava/lang/Exception;)V

    return-void
.end method

.method public final ۧ()V
    .locals 3

    .line 511
    new-instance v0, Ll/᩺ۤܿ;

    iget-object v1, p0, Ll/ۖۚܿ;->ۢ:Ll/ۧ֨ܿ;

    invoke-static {v1}, Ll/ۧ֨ܿ;->֫(Ll/ۧ֨ܿ;)Ll/ۗܺ᩷;

    move-result-object v2

    invoke-direct {v0, v2}, Ll/᩺ۤܿ;-><init>(Ll/ۗܺ᩷;)V

    const v2, 0x7f120797

    .line 512
    invoke-virtual {v0, v2}, Ll/᩺ۤܿ;->ܽ(I)V

    .line 513
    invoke-virtual {v1}, Ll/ۧ֨ܿ;->getFileName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/᩺ۤܿ;->֫(Ljava/lang/CharSequence;)V

    new-instance v1, Ll/ۡۚܿ;

    invoke-direct {v1, p0}, Ll/ۡۚܿ;-><init>(Ll/ۖۚܿ;)V

    .line 514
    invoke-virtual {v0, v1}, Ll/᩺ۤܿ;->֫(Landroid/view/View$OnClickListener;)Ll/᩺ۤܿ;

    .line 515
    invoke-virtual {v0}, Ll/᩺ۤܿ;->ۡ()Ll/᩺ۤܿ;

    iput-object v0, p0, Ll/ۖۚܿ;->᩷:Ll/᩺ۤܿ;

    return-void
.end method

.method public final ܿ()V
    .locals 17

    move-object/from16 v1, p0

    const-string v0, " "

    const-string v2, "Success"

    .line 520
    iget-object v3, v1, Ll/ۖۚܿ;->ܳ:Ll/᩺ۚܿ;

    iget-object v4, v1, Ll/ۖۚܿ;->ۢ:Ll/ۧ֨ܿ;

    invoke-static {v4}, Ll/ۧ֨ܿ;->ۧ(Ll/ۧ֨ܿ;)Ll/ܶ᩵ܿ;

    move-result-object v5

    invoke-static {v4}, Ll/ۧ֨ܿ;->ܳ(Ll/ۧ֨ܿ;)Ljava/util/List;

    move-result-object v6

    invoke-static {v5, v6}, Ll/᩷֨ܿ;->֫(Ll/ܶ᩵ܿ;Ljava/util/List;)V

    .line 521
    new-instance v5, Ll/۬ۚۢ;

    const/4 v6, 0x0

    .line 18
    invoke-static {v6}, Ll/۬ۛۡ;->֫(Z)Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_0

    const-string v7, "su"

    .line 521
    :cond_0
    invoke-direct {v5, v7, v6}, Ll/۬ۚۢ;-><init>(Ljava/lang/String;Z)V

    iput-object v5, v1, Ll/ۖۚܿ;->᩻:Ll/۬ۚۢ;

    const-string v7, "0"

    .line 523
    invoke-static {v4}, Ll/ۧ֨ܿ;->ܽ(Ll/ۧ֨ܿ;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v5, v7, v8}, Ll/ۨ֡ܿ;->֫(Ll/ۤۚۢ;Ljava/lang/String;Ljava/lang/String;)V

    .line 524
    iget-object v5, v1, Ll/ۖۚܿ;->ۡ:Ll/ܶ᩵ܿ;

    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->ۛ()V

    .line 39
    sget v7, Ll/ܿ᩸ۡ;->֫:I

    invoke-static {v7}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v7

    const/4 v8, 0x1

    .line 526
    :try_start_0
    new-instance v9, Ll/ᩳܰۡ;

    invoke-static {v4}, Ll/ۧ֨ܿ;->ۧ(Ll/ۧ֨ܿ;)Ll/ܶ᩵ܿ;

    move-result-object v10

    invoke-direct {v9, v10}, Ll/ᩳܰۡ;-><init>(Ll/ܶ᩵ܿ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 527
    :try_start_1
    invoke-static {v4}, Ll/ۧ֨ܿ;->ܳ(Ll/ۧ֨ܿ;)Ljava/util/List;

    move-result-object v10

    invoke-virtual {v3, v9, v10}, Ll/᩺ۚܿ;->֫(Ll/ᩳܰۡ;Ljava/util/List;)V

    iget-object v10, v3, Ll/᩺ۚܿ;->ܽ:Ljava/util/ArrayList;

    iget-object v11, v3, Ll/᩺ۚܿ;->֫:Ljava/util/ArrayList;

    .line 528
    iget-object v12, v1, Ll/ۖۚܿ;->᩷:Ll/᩺ۤܿ;

    const v13, 0x7f1204bd

    invoke-virtual {v12, v13}, Ll/᩺ۤܿ;->ܽ(I)V

    .line 529
    new-instance v12, Ll/᩵ۛۡ;

    iget-wide v13, v3, Ll/᩺ۚܿ;->ۧ:J

    invoke-direct {v12, v13, v14}, Ll/᩵ۛۡ;-><init>(J)V

    new-instance v13, Ll/ܺۚܿ;

    invoke-direct {v13, v1}, Ll/ܺۚܿ;-><init>(Ll/ۖۚܿ;)V

    invoke-virtual {v12, v13}, Ll/᩵ۛۡ;->֫(Ll/ۖۛۡ;)V

    .line 535
    new-instance v13, Ll/ܳ֨ܿ;

    invoke-virtual {v9}, Ll/ᩳܰۡ;->ۙ()Ll/ܳܰۡ;

    move-result-object v14

    invoke-direct {v13, v14, v12}, Ll/ܳ֨ܿ;-><init>(Ll/ܳܰۡ;Ll/᩵ۛۡ;)V

    iput-object v13, v1, Ll/ۖۚܿ;->ۜ:Ll/ܳ֨ܿ;

    .line 536
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_0
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_1

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ll/ۗ᩺ۡ;

    .line 537
    invoke-virtual {v13}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14, v6}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v6

    .line 538
    new-instance v14, Ll/᩻֨ܿ;

    iget-object v15, v1, Ll/ۖۚܿ;->ۜ:Ll/ܳ֨ܿ;

    invoke-virtual {v5, v6}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v6

    invoke-direct {v14, v15, v13, v6, v8}, Ll/᩻֨ܿ;-><init>(Ll/ܳ֨ܿ;Ll/ۗ᩺ۡ;Ll/ܶ᩵ܿ;Z)V

    invoke-interface {v7, v14}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    const/4 v6, 0x0

    goto :goto_0

    .line 540
    :cond_1
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "pm install-create -r -d "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v4}, Ll/ۧ֨ܿ;->ܽ(Ll/ۧ֨ܿ;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ll/ۨ֡ܿ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v4}, Ll/ۖۚܿ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 541
    invoke-virtual {v4, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_c

    const-string v5, "\\[(\\d+)]"

    .line 544
    invoke-static {v5}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v5

    .line 545
    invoke-virtual {v5}, Ljava/util/regex/Matcher;->find()Z

    move-result v6

    if-eqz v6, :cond_b

    .line 549
    invoke-virtual {v5, v8}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v5, 0x0

    .line 551
    :goto_1
    :try_start_2
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-ge v5, v6, :cond_6

    .line 552
    iget-object v6, v1, Ll/ۖۚܿ;->ۜ:Ll/ܳ֨ܿ;

    iget-object v6, v6, Ll/ܳ֨ܿ;->ᩳ:Ljava/util/concurrent/ArrayBlockingQueue;

    sget-object v8, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v12, 0x1f4

    invoke-virtual {v6, v12, v13, v8}, Ljava/util/concurrent/ArrayBlockingQueue;->poll(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩻֨ܿ;

    if-eqz v6, :cond_4

    .line 553
    iget-object v6, v6, Ll/᩻֨ܿ;->᩶:Ll/ܶ᩵ܿ;

    .line 554
    invoke-virtual {v6}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ll/ۢ֨ۢ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 555
    invoke-virtual {v6}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v12

    .line 556
    invoke-virtual {v6}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v14

    .line 557
    iget-object v15, v3, Ll/᩺ۚܿ;->ܿ:Ljava/lang/String;

    if-nez v15, :cond_2

    .line 558
    invoke-static {v6}, Ll/ᩴܶۡ;->ܽ(Ll/ܶ᩵ܿ;)Ll/ۘܶۡ;

    move-result-object v15

    if-eqz v15, :cond_2

    .line 560
    invoke-virtual {v15}, Ll/ۘܶۡ;->ܳ()Ljava/lang/String;

    move-result-object v15

    iput-object v15, v3, Ll/᩺ۚܿ;->ܿ:Ljava/lang/String;

    .line 563
    :cond_2
    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v16, v11

    const-string v11, "cat "

    invoke-virtual {v15, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, " | pm install-write -S "

    invoke-virtual {v15, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v1, v8}, Ll/ۖۚܿ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 564
    invoke-virtual {v6}, Ll/ܶ᩵ܿ;->۬()Z

    .line 565
    invoke-virtual {v8, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_3

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    .line 566
    :cond_3
    new-instance v0, Ljava/lang/Exception;

    invoke-direct {v0, v8}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    move-object/from16 v16, v11

    .line 569
    iget-object v6, v1, Ll/ۖۚܿ;->ۜ:Ll/ܳ֨ܿ;

    iget-boolean v8, v6, Ll/ܳ֨ܿ;->ۧ:Z

    if-nez v8, :cond_5

    .line 572
    invoke-virtual {v6}, Ll/ܳ֨ܿ;->֫()V

    :goto_2
    move-object/from16 v11, v16

    goto/16 :goto_1

    .line 570
    :cond_5
    new-instance v0, Ljava/util/concurrent/CancellationException;

    invoke-direct {v0}, Ljava/util/concurrent/CancellationException;-><init>()V

    throw v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 579
    :cond_6
    :try_start_3
    iget-object v0, v1, Ll/ۖۚܿ;->ۜ:Ll/ܳ֨ܿ;

    invoke-virtual {v0}, Ll/ܳ֨ܿ;->֫()V

    .line 580
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "pm install-commit "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ll/ۖۚܿ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩷֨ܿ;->֫(Ljava/lang/String;)V

    .line 582
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_8

    .line 583
    iget-object v0, v1, Ll/ۖۚܿ;->᩷:Ll/᩺ۤܿ;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ll/᩺ۤܿ;->֫(Z)V

    .line 584
    iget-object v0, v1, Ll/ۖۚܿ;->ۜ:Ll/ܳ֨ܿ;

    new-instance v2, Ll/᩵ۛۡ;

    iget-wide v3, v3, Ll/᩺ۚܿ;->ᩳ:J

    invoke-direct {v2, v3, v4}, Ll/᩵ۛۡ;-><init>(J)V

    iget-object v3, v1, Ll/ۖۚܿ;->᩷:Ll/᩺ۤܿ;

    invoke-static {v3}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Ll/᩻ۡܳ;

    invoke-direct {v4, v3}, Ll/᩻ۡܳ;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v2, v4}, Ll/᩵ۛۡ;->֫(Ll/ۖۛۡ;)V

    iput-object v2, v0, Ll/ܳ֨ܿ;->ܽ:Ll/᩵ۛۡ;

    .line 585
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۗ᩺ۡ;

    .line 586
    invoke-virtual {v2}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v3, v4}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v3

    .line 587
    new-instance v5, Ll/᩻֨ܿ;

    iget-object v6, v1, Ll/ۖۚܿ;->ۜ:Ll/ܳ֨ܿ;

    sget-object v8, Ll/ܽ֡ܿ;->᩻:Ll/ܶ᩵ܿ;

    invoke-virtual {v8, v3}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v3

    invoke-direct {v5, v6, v2, v3, v4}, Ll/᩻֨ܿ;-><init>(Ll/ܳ֨ܿ;Ll/ۗ᩺ۡ;Ll/ܶ᩵ܿ;Z)V

    invoke-interface {v7, v5}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    goto :goto_3

    .line 589
    :cond_7
    invoke-static {v7}, Ll/֫ۨۡ;->֫(Ljava/util/concurrent/ExecutorService;)V

    .line 590
    iget-object v0, v1, Ll/ۖۚܿ;->ۜ:Ll/ܳ֨ܿ;

    invoke-virtual {v0}, Ll/ܳ֨ܿ;->֫()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 592
    :cond_8
    :try_start_4
    invoke-virtual {v9}, Ll/ᩳܰۡ;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 593
    invoke-interface {v7}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-nez v0, :cond_a

    .line 594
    iget-object v0, v1, Ll/ۖۚܿ;->ۜ:Ll/ܳ֨ܿ;

    if-eqz v0, :cond_9

    const/4 v2, 0x1

    .line 595
    iput-boolean v2, v0, Ll/ܳ֨ܿ;->ۧ:Z

    .line 597
    :cond_9
    invoke-interface {v7}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 599
    sget-object v0, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x1

    invoke-interface {v7, v2, v3, v0}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    :cond_a
    return-void

    :catch_0
    move-exception v0

    .line 576
    :try_start_5
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "pm install-abandon "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ll/ۖۚܿ;->֫(Ljava/lang/String;)Ljava/lang/String;

    .line 577
    throw v0

    .line 546
    :cond_b
    new-instance v0, Ljava/lang/Exception;

    invoke-direct {v0, v4}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    .line 542
    :cond_c
    new-instance v0, Ljava/lang/Exception;

    invoke-direct {v0, v4}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :catchall_0
    move-exception v0

    move-object v2, v0

    .line 526
    :try_start_6
    invoke-virtual {v9}, Ll/ᩳܰۡ;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception v0

    move-object v3, v0

    :try_start_7
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :catchall_2
    move-exception v0

    .line 593
    invoke-interface {v7}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v2

    if-nez v2, :cond_e

    .line 594
    iget-object v2, v1, Ll/ۖۚܿ;->ۜ:Ll/ܳ֨ܿ;

    if-eqz v2, :cond_d

    const/4 v3, 0x1

    .line 595
    iput-boolean v3, v2, Ll/ܳ֨ܿ;->ۧ:Z

    .line 597
    :cond_d
    invoke-interface {v7}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 599
    sget-object v2, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0x1

    invoke-interface {v7, v3, v4, v2}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    .line 601
    :cond_e
    throw v0
.end method

.method public final ᩳ()V
    .locals 1

    .line 630
    iget-object v0, p0, Ll/ۖۚܿ;->᩷:Ll/᩺ۤܿ;

    invoke-virtual {v0}, Ll/᩺ۤܿ;->ᩳ()V

    .line 631
    iget-object v0, p0, Ll/ۖۚܿ;->ۡ:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۬()Z

    .line 632
    iget-object v0, p0, Ll/ۖۚܿ;->᩻:Ll/۬ۚۢ;

    if-eqz v0, :cond_0

    .line 633
    invoke-virtual {v0}, Ll/۬ۚۢ;->close()V

    :cond_0
    return-void
.end method
