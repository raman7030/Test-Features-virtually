.class public final synthetic Ll/ۨۤᩳ;
.super Ljava/lang/Object;
.source "X68P"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/ۘۨᩳ;


# direct methods
.method public synthetic constructor <init>(Ll/ۘۨᩳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۨۤᩳ;->᩸:Ll/ۘۨᩳ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 13

    .line 2
    iget-object v0, p0, Ll/ۨۤᩳ;->᩸:Ll/ۘۨᩳ;

    .line 3470
    iget-boolean v1, v0, Ll/ۘۨᩳ;->ۘ:Z

    if-nez v1, :cond_d

    iget-object v1, v0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    invoke-static {v1}, Ll/۫ۨᩳ;->ᩴ(Ll/۫ۨᩳ;)Ll/ۘۨᩳ;

    move-result-object v1

    if-eq v1, v0, :cond_0

    goto/16 :goto_2

    .line 3471
    :cond_0
    invoke-virtual {v0}, Ll/ۘۨᩳ;->֫()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    invoke-virtual {v0, v2, v2}, Ll/ۘۨᩳ;->֫(Ll/ۗۤᩳ;Ljava/lang/Throwable;)V

    goto/16 :goto_2

    .line 3472
    :cond_1
    iget-object v1, v0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    iget-boolean v3, v1, Ll/۫ۨᩳ;->ۜۧ:Z

    if-eqz v3, :cond_2

    goto/16 :goto_2

    .line 3474
    :cond_2
    iget-object v1, v1, Ll/۫ۨᩳ;->ܰۧ:Ll/ۗۤᩳ;

    invoke-virtual {v1}, Ll/ۗۤᩳ;->ۖ()Z

    move-result v1

    if-nez v1, :cond_c

    iget-object v1, v0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    invoke-static {v1}, Ll/۫ۨᩳ;->ۧ֫(Ll/۫ۨᩳ;)Z

    move-result v1

    if-nez v1, :cond_c

    iget-object v1, v0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    invoke-static {v1}, Ll/۫ۨᩳ;->ܽ֫(Ll/۫ۨᩳ;)Z

    move-result v1

    if-nez v1, :cond_c

    iget-object v1, v0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    invoke-static {v1}, Ll/۫ۨᩳ;->᩷(Ll/۫ۨᩳ;)Z

    move-result v1

    if-nez v1, :cond_c

    iget-object v1, v0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    invoke-static {v1}, Ll/۫ۨᩳ;->ᩳ֫(Ll/۫ۨᩳ;)Z

    move-result v1

    if-nez v1, :cond_c

    iget-object v1, v0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    invoke-static {v1}, Ll/۫ۨᩳ;->ۜ(Ll/۫ۨᩳ;)Ljava/lang/Runnable;

    move-result-object v1

    if-nez v1, :cond_c

    iget-object v1, v0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    invoke-static {v1}, Ll/۫ۨᩳ;->ܺ֫(Ll/۫ۨᩳ;)I

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, v0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    .line 3476
    invoke-virtual {v1}, Ll/۫ۨᩳ;->ۜ֫()I

    move-result v1

    if-gtz v1, :cond_3

    goto/16 :goto_1

    .line 3480
    :cond_3
    iget-object v1, v0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    iget-object v3, v1, Ll/۫ۨᩳ;->ܰۧ:Ll/ۗۤᩳ;

    iput-object v3, v0, Ll/ۘۨᩳ;->ۜ:Ll/ۗۤᩳ;

    .line 3481
    iget-boolean v3, v0, Ll/ۘۨᩳ;->᩵:Z

    const/4 v4, 0x1

    if-nez v3, :cond_4

    .line 3482
    invoke-virtual {v1}, Ll/۫ۨᩳ;->ܿ()V

    .line 3483
    iget-object v1, v0, Ll/ۘۨᩳ;->ۢ:Ll/۟᩺ᩳ;

    invoke-interface {v1, v4}, Ll/۟᩺ᩳ;->setReadOnly(Z)V

    .line 3484
    iput-boolean v4, v0, Ll/ۘۨᩳ;->᩵:Z

    .line 3485
    iget-object v1, v0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    invoke-static {v1}, Ll/۫ۨᩳ;->ۨ֫(Ll/۫ۨᩳ;)V

    .line 3488
    :cond_4
    :try_start_0
    iget-object v1, v0, Ll/ۘۨᩳ;->ۢ:Ll/۟᩺ᩳ;

    invoke-interface {v1}, Ll/᩶᩸ᩳ;->ۖ֫()Ll/۟᩸ᩳ;

    move-result-object v1

    iput-object v1, v0, Ll/ۘۨᩳ;->᩷:Ll/۟᩸ᩳ;

    .line 3489
    invoke-virtual {v1}, Ll/۟᩸ᩳ;->ܳ()I

    move-result v1

    iput v1, v0, Ll/ۘۨᩳ;->ܶ:I

    .line 3490
    iget-object v1, v0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    invoke-virtual {v1}, Ll/۫ۨᩳ;->۬֫()I

    move-result v1

    iput v1, v0, Ll/ۘۨᩳ;->ᩴ:I

    .line 3491
    iget-object v1, v0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    invoke-static {v1}, Ll/۫ۨᩳ;->ܺ֫(Ll/۫ۨᩳ;)I

    move-result v1

    iput v1, v0, Ll/ۘۨᩳ;->᩸:I

    .line 3492
    iget-object v1, v0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    invoke-virtual {v1}, Ll/۫ۨᩳ;->᩻ܽ()Ll/ᩴۨᩳ;

    move-result-object v1

    .line 3493
    iget-object v3, v0, Ll/ۘۨᩳ;->ܳ:Ll/ᩴۨᩳ;

    invoke-virtual {v3, v1}, Ll/ᩴۨᩳ;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    iget-object v3, v0, Ll/ۘۨᩳ;->֫:Ll/ۗۤᩳ;

    iget-object v3, v3, Ll/ۗۤᩳ;->ܳ:Ll/ᩴۨᩳ;

    invoke-virtual {v3, v1}, Ll/ᩴۨᩳ;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    :cond_5
    iput-object v2, v0, Ll/ۘۨᩳ;->ᩳ:Ll/ܶۘܿ;

    .line 3494
    :cond_6
    iput-object v1, v0, Ll/ۘۨᩳ;->ܳ:Ll/ᩴۨᩳ;

    .line 3495
    iput-object v2, v0, Ll/ۘۨᩳ;->᩻:Ll/ۗ۟ᩳ;

    .line 3496
    iget-object v1, v0, Ll/ۘۨᩳ;->ᩳ:Ll/ܶۘܿ;

    const/4 v3, 0x0

    if-eqz v1, :cond_9

    invoke-virtual {v1}, Ll/ܶۘܿ;->ܽ()Z

    move-result v1

    if-nez v1, :cond_9

    iget v1, v0, Ll/ۘۨᩳ;->ܿ:I

    iget v5, v0, Ll/ۘۨᩳ;->ܶ:I

    if-ne v1, v5, :cond_9

    iget-object v1, v0, Ll/ۘۨᩳ;->֫:Ll/ۗۤᩳ;

    iget-object v5, v1, Ll/ۗۤᩳ;->۫:Ll/۟᩺ᩳ;

    iget-object v6, v0, Ll/ۘۨᩳ;->ۢ:Ll/۟᩺ᩳ;

    if-ne v5, v6, :cond_9

    .line 3497
    invoke-virtual {v1}, Ll/ۗۤᩳ;->ۖ()Z

    move-result v1

    if-nez v1, :cond_9

    iget-object v1, v0, Ll/ۘۨᩳ;->֫:Ll/ۗۤᩳ;

    iget-boolean v1, v1, Ll/ۗۤᩳ;->ܳ֫:Z

    if-nez v1, :cond_9

    iget-object v1, v0, Ll/ۘۨᩳ;->֫:Ll/ۗۤᩳ;

    .line 3498
    invoke-virtual {v1}, Ll/ۗۤᩳ;->᩶()Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_9

    iget-object v1, v0, Ll/ۘۨᩳ;->֫:Ll/ۗۤᩳ;

    iget-object v1, v1, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_9

    iget-object v1, v0, Ll/ۘۨᩳ;->֫:Ll/ۗۤᩳ;

    iget-object v1, v1, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    .line 3499
    invoke-virtual {v1}, Ll/᩷۟ᩳ;->ᩳ()Ll/ۨܰᩳ;

    move-result-object v1

    iget v1, v1, Ll/ۨܰᩳ;->᩸:I

    iget-object v5, v0, Ll/ۘۨᩳ;->ᩳ:Ll/ܶۘܿ;

    invoke-virtual {v5}, Ll/ܶۘܿ;->ܿ()I

    move-result v5

    if-ne v1, v5, :cond_9

    .line 3500
    iget-object v1, v0, Ll/ۘۨᩳ;->֫:Ll/ۗۤᩳ;

    instance-of v5, v1, Ll/ۖܰᩳ;

    if-eqz v5, :cond_7

    check-cast v1, Ll/ۖܰᩳ;

    invoke-virtual {v1}, Ll/ۖܰᩳ;->ۛ()Z

    move-result v1

    if-eqz v1, :cond_7

    iget v1, v0, Ll/ۘۨᩳ;->᩸:I

    if-eqz v1, :cond_8

    .line 3501
    :cond_7
    iget-object v1, v0, Ll/ۘۨᩳ;->֫:Ll/ۗۤᩳ;

    instance-of v5, v1, Ll/ܿܽܿ;

    if-eqz v5, :cond_9

    check-cast v1, Ll/ܿܽܿ;

    invoke-virtual {v1}, Ll/ܿܽܿ;->ۛ()Z

    move-result v1

    if-eqz v1, :cond_9

    iget v1, v0, Ll/ۘۨᩳ;->᩸:I

    if-eqz v1, :cond_9

    .line 3502
    :cond_8
    iget-object v1, v0, Ll/ۘۨᩳ;->ᩳ:Ll/ܶۘܿ;

    invoke-virtual {v1, v3}, Ll/ܶۘܿ;->ܿ(I)I

    move-result v7

    iget-object v1, v0, Ll/ۘۨᩳ;->ᩳ:Ll/ܶۘܿ;

    invoke-virtual {v1}, Ll/ܶۘܿ;->ܳ()I

    move-result v1

    sub-int/2addr v1, v4

    .line 3503
    new-instance v12, Ll/ۗ۟ᩳ;

    iget-object v6, v0, Ll/ۘۨᩳ;->֫:Ll/ۗۤᩳ;

    iget-object v5, v0, Ll/ۘۨᩳ;->ᩳ:Ll/ܶۘܿ;

    invoke-virtual {v5, v1}, Ll/ܶۘܿ;->ᩳ(I)I

    move-result v5

    sub-int v8, v5, v7

    iget-object v5, v0, Ll/ۘۨᩳ;->ᩳ:Ll/ܶۘܿ;

    .line 3504
    invoke-virtual {v5, v1}, Ll/ܶۘܿ;->ۧ(I)I

    move-result v1

    iget-object v5, v0, Ll/ۘۨᩳ;->ᩳ:Ll/ܶۘܿ;

    invoke-virtual {v5, v3}, Ll/ܶۘܿ;->ܽ(I)I

    move-result v5

    sub-int v9, v1, v5

    iget v10, v0, Ll/ۘۨᩳ;->ܶ:I

    iget-object v1, v0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    invoke-virtual {v1}, Ll/۫ۨᩳ;->ۜ֫()I

    move-result v11

    move-object v5, v12

    invoke-direct/range {v5 .. v11}, Ll/ۗ۟ᩳ;-><init>(Ll/ۗۤᩳ;IIIII)V

    iput-object v12, v0, Ll/ۘۨᩳ;->᩻:Ll/ۗ۟ᩳ;

    .line 3506
    :cond_9
    iget-object v1, v0, Ll/ۘۨᩳ;->᩷:Ll/۟᩸ᩳ;

    invoke-virtual {v1}, Ll/۟᩸ᩳ;->length()I

    move-result v1

    new-array v3, v3, [Ll/۠ۘܿ;

    invoke-static {v1, v3}, Ll/ܶۘܿ;->֫(I[Ll/۠ۘܿ;)Ll/ܶۘܿ;

    move-result-object v1

    iput-object v1, v0, Ll/ۘۨᩳ;->ᩳ:Ll/ܶۘܿ;

    .line 3507
    iget v1, v0, Ll/ۘۨᩳ;->ܶ:I

    iput v1, v0, Ll/ۘۨᩳ;->ܿ:I

    .line 3508
    iput-boolean v4, v0, Ll/ۘۨᩳ;->ۘ:Z

    .line 3509
    iget-object v1, v0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    iget-object v1, v1, Ll/۫ۨᩳ;->ۤᩳ:Ll/ۜܺܿ;

    invoke-virtual {v1}, Ll/ۜܺܿ;->ۡ()Z

    move-result v1

    if-eqz v1, :cond_b

    .line 3510
    iget-object v1, v0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    iget-object v1, v1, Ll/۫ۨᩳ;->ۤᩳ:Ll/ۜܺܿ;

    iget-object v3, v0, Ll/ۘۨᩳ;->ۢ:Ll/۟᩺ᩳ;

    invoke-virtual {v1, v3}, Ll/ۜܺܿ;->᩻(Ll/᩶᩸ᩳ;)V

    .line 3511
    iget-object v1, v0, Ll/ۘۨᩳ;->᩻:Ll/ۗ۟ᩳ;

    if-nez v1, :cond_a

    iget-object v1, v0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    iget-object v1, v1, Ll/۫ۨᩳ;->ۤᩳ:Ll/ۜܺܿ;

    iget-object v3, v0, Ll/ۘۨᩳ;->ۢ:Ll/۟᩺ᩳ;

    invoke-virtual {v1, v3}, Ll/ۜܺܿ;->ܳ(Ll/᩶᩸ᩳ;)V

    goto :goto_0

    .line 3512
    :cond_a
    iget-object v3, v0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    iget-object v3, v3, Ll/۫ۨᩳ;->ۤᩳ:Ll/ۜܺܿ;

    iget-object v4, v0, Ll/ۘۨᩳ;->ۢ:Ll/۟᩺ᩳ;

    iget v5, v1, Ll/ۗ۟ᩳ;->ܽ:I

    iget v1, v1, Ll/ۗ۟ᩳ;->ۧ:I

    invoke-virtual {v3, v4, v5, v1}, Ll/ۜܺܿ;->ۧ(Ll/᩶᩸ᩳ;II)V

    .line 3514
    :cond_b
    :goto_0
    sget-object v1, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance v3, Ll/᩷ۨᩳ;

    invoke-direct {v3, v0}, Ll/᩷ۨᩳ;-><init>(Ll/ۘۨᩳ;)V

    invoke-interface {v1, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v1

    .line 3516
    invoke-virtual {v0, v2, v1}, Ll/ۘۨᩳ;->֫(Ll/ۗۤᩳ;Ljava/lang/Throwable;)V

    goto :goto_2

    .line 3477
    :cond_c
    :goto_1
    new-instance v1, Ll/ۨۤᩳ;

    invoke-direct {v1, v0}, Ll/ۨۤᩳ;-><init>(Ll/ۘۨᩳ;)V

    const-wide/16 v2, 0xa

    invoke-static {v1, v2, v3}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;J)V

    :cond_d
    :goto_2
    return-void
.end method
