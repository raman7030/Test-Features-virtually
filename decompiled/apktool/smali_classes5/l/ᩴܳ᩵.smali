.class public final Ll/ᩴܳ᩵;
.super Ll/۫۟ᩴ;
.source "N673"


# instance fields
.field public final synthetic s:J

.field public final synthetic t:J


# direct methods
.method public constructor <init>(Ll/᩵֫᩵;IJJ)V
    .locals 0

    .line 340
    iput-wide p3, p0, Ll/ᩴܳ᩵;->s:J

    iput-wide p5, p0, Ll/ᩴܳ᩵;->t:J

    .line 91
    invoke-direct {p0, p1, p2}, Ll/۫᩺ᩴ;-><init>(Ll/۫᩺ᩴ;I)V

    return-void
.end method


# virtual methods
.method public final n0(Ll/ۡ᩺ᩴ;Ll/ܶ۫ᩴ;Ljava/util/function/IntFunction;)Ll/ۚ۟ᩴ;
    .locals 11

    .line 376
    invoke-virtual {p1, p2}, Ll/ۡ᩺ᩴ;->R(Ll/ܶ۫ᩴ;)J

    move-result-wide v0

    const/4 v2, 0x1

    const-wide/16 v3, 0x0

    cmp-long v5, v0, v3

    if-lez v5, :cond_1

    const/16 v5, 0x4000

    .line 377
    invoke-interface {p2, v5}, Ll/ܶ۫ᩴ;->hasCharacteristics(I)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 383
    move-object p3, p1

    check-cast p3, Ll/۫᩺ᩴ;

    .line 461
    :goto_0
    iget v0, p3, Ll/۫᩺ᩴ;->l:I

    if-lez v0, :cond_0

    .line 462
    iget-object p3, p3, Ll/۫᩺ᩴ;->i:Ll/۫᩺ᩴ;

    goto :goto_0

    .line 464
    :cond_0
    invoke-virtual {p3}, Ll/۫᩺ᩴ;->m0()Ll/ۡ֫᩵;

    move-result-object v3

    .line 383
    iget-wide v5, p0, Ll/ᩴܳ᩵;->s:J

    iget-wide v7, p0, Ll/ᩴܳ᩵;->t:J

    move-object v4, p2

    invoke-static/range {v3 .. v8}, Ll/᩹ܰᩴ;->b(Ll/ۡ֫᩵;Ll/ܶ۫ᩴ;JJ)Ll/ܶ۫ᩴ;

    move-result-object p2

    .line 384
    invoke-static {p1, p2, v2}, Ll/ۡ᩺ᩴ;->K(Ll/ۡ᩺ᩴ;Ll/ܶ۫ᩴ;Z)Ll/ۛܰᩴ;

    move-result-object p1

    return-object p1

    .line 385
    :cond_1
    sget-object v5, Ll/۟۟ᩴ;->ORDERED:Ll/۟۟ᩴ;

    move-object v6, p1

    check-cast v6, Ll/۫᩺ᩴ;

    .line 509
    iget v6, v6, Ll/۫᩺ᩴ;->m:I

    .line 385
    invoke-virtual {v5, v6}, Ll/۟۟ᩴ;->s(I)Z

    move-result v5

    if-nez v5, :cond_4

    .line 387
    invoke-virtual {p1, p2}, Ll/ۡ᩺ᩴ;->h0(Ll/ܶ۫ᩴ;)Ll/ܶ۫ᩴ;

    move-result-object p1

    move-object v6, p1

    check-cast v6, Ll/֡۫ᩴ;

    iget-wide p1, p0, Ll/ᩴܳ᩵;->s:J

    iget-wide v7, p0, Ll/ᩴܳ᩵;->t:J

    cmp-long p3, p1, v0

    if-gtz p3, :cond_3

    cmp-long p3, v7, v3

    sub-long/2addr v0, p1

    if-ltz p3, :cond_2

    .line 346
    invoke-static {v7, v8, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    :cond_2
    move-wide v9, v0

    move-wide v7, v3

    goto :goto_1

    :cond_3
    move-wide v9, v7

    move-wide v7, p1

    .line 349
    :goto_1
    new-instance p1, Ll/ۖ۟ᩴ;

    move-object v5, p1

    .line 1077
    invoke-direct/range {v5 .. v10}, Ll/᩹֫᩵;-><init>(Ll/ܶ۫ᩴ;JJ)V

    .line 393
    invoke-static {p0, p1, v2}, Ll/ۡ᩺ᩴ;->K(Ll/ۡ᩺ᩴ;Ll/ܶ۫ᩴ;Z)Ll/ۛܰᩴ;

    move-result-object p1

    return-object p1

    .line 396
    :cond_4
    new-instance v9, Ll/ܺܰᩴ;

    iget-wide v5, p0, Ll/ᩴܳ᩵;->s:J

    iget-wide v7, p0, Ll/ᩴܳ᩵;->t:J

    move-object v0, v9

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v8}, Ll/ܺܰᩴ;-><init>(Ll/۫᩺ᩴ;Ll/ۡ᩺ᩴ;Ll/ܶ۫ᩴ;Ljava/util/function/IntFunction;JJ)V

    .line 397
    invoke-virtual {v9}, Ljava/util/concurrent/CountedCompleter;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۚ۟ᩴ;

    return-object p1
.end method

.method public final o0(Ll/۫᩺ᩴ;Ll/ܶ۫ᩴ;)Ll/ܶ۫ᩴ;
    .locals 16

    move-object/from16 v9, p0

    .line 355
    invoke-virtual/range {p1 .. p2}, Ll/۫᩺ᩴ;->R(Ll/ܶ۫ᩴ;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    const/16 v4, 0x4000

    move-object/from16 v5, p2

    .line 356
    invoke-interface {v5, v4}, Ll/ܶ۫ᩴ;->hasCharacteristics(I)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 357
    new-instance v0, Ll/ᩴ᩺ᩴ;

    .line 358
    invoke-virtual/range {p1 .. p2}, Ll/۫᩺ᩴ;->h0(Ll/ܶ۫ᩴ;)Ll/ܶ۫ᩴ;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Ll/֡۫ᩴ;

    iget-wide v12, v9, Ll/ᩴܳ᩵;->s:J

    iget-wide v1, v9, Ll/ᩴܳ᩵;->t:J

    .line 0
    invoke-static {v12, v13, v1, v2}, Ll/᩹ܰᩴ;->c(JJ)J

    move-result-wide v14

    move-object v10, v0

    .line 847
    invoke-direct/range {v10 .. v15}, Ll/ۗ᩺ᩴ;-><init>(Ll/֨۫ᩴ;JJ)V

    return-object v0

    :cond_0
    move-object/from16 v5, p2

    .line 361
    :cond_1
    sget-object v4, Ll/۟۟ᩴ;->ORDERED:Ll/۟۟ᩴ;

    move-object/from16 v6, p1

    .line 509
    iget v7, v6, Ll/۫᩺ᩴ;->m:I

    .line 361
    invoke-virtual {v4, v7}, Ll/۟۟ᩴ;->s(I)Z

    move-result v4

    if-nez v4, :cond_4

    .line 363
    invoke-virtual/range {p1 .. p2}, Ll/۫᩺ᩴ;->h0(Ll/ܶ۫ᩴ;)Ll/ܶ۫ᩴ;

    move-result-object v4

    move-object v11, v4

    check-cast v11, Ll/֡۫ᩴ;

    iget-wide v4, v9, Ll/ᩴܳ᩵;->s:J

    iget-wide v6, v9, Ll/ᩴܳ᩵;->t:J

    cmp-long v8, v4, v0

    if-gtz v8, :cond_3

    cmp-long v8, v6, v2

    sub-long/2addr v0, v4

    if-ltz v8, :cond_2

    .line 346
    invoke-static {v6, v7, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    :cond_2
    move-wide v14, v0

    move-wide v12, v2

    goto :goto_0

    :cond_3
    move-wide v12, v4

    move-wide v14, v6

    .line 349
    :goto_0
    new-instance v0, Ll/ۖ۟ᩴ;

    move-object v10, v0

    .line 1077
    invoke-direct/range {v10 .. v15}, Ll/᩹֫᩵;-><init>(Ll/ܶ۫ᩴ;JJ)V

    return-object v0

    .line 367
    :cond_4
    new-instance v10, Ll/ܺܰᩴ;

    new-instance v4, Ll/᩻ܰᩴ;

    const/16 v0, 0x15

    .line 0
    invoke-direct {v4, v0}, Ll/᩻ܰᩴ;-><init>(I)V

    .line 367
    iget-wide v7, v9, Ll/ᩴܳ᩵;->s:J

    iget-wide v11, v9, Ll/ᩴܳ᩵;->t:J

    move-object v0, v10

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-wide v5, v7

    move-wide v7, v11

    invoke-direct/range {v0 .. v8}, Ll/ܺܰᩴ;-><init>(Ll/۫᩺ᩴ;Ll/ۡ᩺ᩴ;Ll/ܶ۫ᩴ;Ljava/util/function/IntFunction;JJ)V

    .line 368
    invoke-virtual {v10}, Ljava/util/concurrent/CountedCompleter;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۚ۟ᩴ;

    invoke-interface {v0}, Ll/ۚ۟ᩴ;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final q0(ILl/֡ᩳ᩵;)Ll/֡ᩳ᩵;
    .locals 0

    .line 403
    new-instance p1, Ll/ᩳܳ᩵;

    invoke-direct {p1, p0, p2}, Ll/ᩳܳ᩵;-><init>(Ll/ᩴܳ᩵;Ll/֡ᩳ᩵;)V

    return-object p1
.end method
