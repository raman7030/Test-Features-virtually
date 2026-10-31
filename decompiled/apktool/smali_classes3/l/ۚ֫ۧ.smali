.class public final Ll/ۚ֫ۧ;
.super Ll/᩺ܽۧ;
.source "U8SG"


# instance fields
.field public ֫֫:Ll/֡֫ۧ;

.field public final ۜ֫:Z

.field public final ۟:Z

.field public final ۢ֫:Ll/᩶᩵֫;

.field public ۧ֫:Ll/᩵֫ۧ;

.field public final ܰ:Z

.field public ܳ֫:J

.field public final ܽ֫:Z

.field public final ܿ֫:Ljava/util/ArrayList;

.field public final ᩳ֫:J

.field public final ᩷֫:J

.field public ᩻֫:J


# direct methods
.method public constructor <init>(Ll/ᩴ֫ۧ;)V
    .locals 2

    .line 331
    invoke-static {p1}, Ll/ᩴ֫ۧ;->ܿ(Ll/ᩴ֫ۧ;)Ll/ۘۧۧ;

    move-result-object v0

    invoke-direct {p0, v0}, Ll/᩺ܽۧ;-><init>(Ll/ۘۧۧ;)V

    .line 332
    invoke-static {p1}, Ll/ᩴ֫ۧ;->᩻(Ll/ᩴ֫ۧ;)J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۚ֫ۧ;->᩷֫:J

    .line 333
    invoke-static {p1}, Ll/ᩴ֫ۧ;->ᩳ(Ll/ᩴ֫ۧ;)J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۚ֫ۧ;->ᩳ֫:J

    .line 334
    invoke-static {p1}, Ll/ᩴ֫ۧ;->ܽ(Ll/ᩴ֫ۧ;)Z

    move-result v0

    iput-boolean v0, p0, Ll/ۚ֫ۧ;->ܽ֫:Z

    .line 335
    invoke-static {p1}, Ll/ᩴ֫ۧ;->֫(Ll/ᩴ֫ۧ;)Z

    move-result v0

    iput-boolean v0, p0, Ll/ۚ֫ۧ;->ܰ:Z

    .line 336
    invoke-static {p1}, Ll/ᩴ֫ۧ;->ܳ(Ll/ᩴ֫ۧ;)Z

    move-result v0

    iput-boolean v0, p0, Ll/ۚ֫ۧ;->ۜ֫:Z

    .line 337
    invoke-static {p1}, Ll/ᩴ֫ۧ;->ۧ(Ll/ᩴ֫ۧ;)Z

    move-result p1

    iput-boolean p1, p0, Ll/ۚ֫ۧ;->۟:Z

    .line 338
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/ۚ֫ۧ;->ܿ֫:Ljava/util/ArrayList;

    .line 339
    new-instance p1, Ll/᩶᩵֫;

    invoke-direct {p1}, Ll/᩶᩵֫;-><init>()V

    iput-object p1, p0, Ll/ۚ֫ۧ;->ۢ֫:Ll/᩶᩵֫;

    return-void
.end method

.method private ܽ(Ll/ۙ᩵֫;)V
    .locals 16

    move-object/from16 v1, p0

    const/4 v0, 0x0

    .line 395
    iget-object v2, v1, Ll/ۚ֫ۧ;->ۢ֫:Ll/᩶᩵֫;

    move-object/from16 v4, p1

    invoke-virtual {v4, v0, v2}, Ll/ۙ᩵֫;->֫(ILl/᩶᩵֫;)V

    .line 356
    iget-wide v5, v2, Ll/᩶᩵֫;->ܺ:J

    .line 397
    iget-object v0, v1, Ll/ۚ֫ۧ;->ۧ֫:Ll/᩵֫ۧ;

    iget-wide v7, v1, Ll/ۚ֫ۧ;->ᩳ֫:J

    const-wide/high16 v9, -0x8000000000000000L

    iget-object v11, v1, Ll/ۚ֫ۧ;->ܿ֫:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    iget-boolean v0, v1, Ll/ۚ֫ۧ;->ܰ:Z

    if-eqz v0, :cond_0

    goto :goto_1

    .line 416
    :cond_0
    iget-wide v2, v1, Ll/ۚ֫ۧ;->᩻֫:J

    sub-long/2addr v2, v5

    cmp-long v0, v7, v9

    if-nez v0, :cond_1

    goto :goto_0

    .line 420
    :cond_1
    iget-wide v7, v1, Ll/ۚ֫ۧ;->ܳ֫:J

    sub-long v9, v7, v5

    :goto_0
    move-wide v5, v2

    move-wide v7, v9

    goto :goto_5

    .line 400
    :cond_2
    :goto_1
    iget-boolean v0, v1, Ll/ۚ֫ۧ;->ۜ֫:Z

    iget-wide v12, v1, Ll/ۚ֫ۧ;->᩷֫:J

    if-eqz v0, :cond_3

    .line 330
    iget-wide v2, v2, Ll/᩶᩵֫;->֫:J

    add-long/2addr v12, v2

    add-long/2addr v2, v7

    goto :goto_2

    :cond_3
    move-wide v2, v7

    :goto_2
    add-long v14, v5, v12

    .line 405
    iput-wide v14, v1, Ll/ۚ֫ۧ;->᩻֫:J

    cmp-long v0, v7, v9

    if-nez v0, :cond_4

    goto :goto_3

    :cond_4
    add-long v9, v5, v2

    .line 409
    :goto_3
    iput-wide v9, v1, Ll/ۚ֫ۧ;->ܳ֫:J

    .line 410
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v5, 0x0

    :goto_4
    if-ge v5, v0, :cond_5

    .line 412
    invoke-virtual {v11, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۘ֫ۧ;

    iget-wide v7, v1, Ll/ۚ֫ۧ;->᩻֫:J

    iget-wide v9, v1, Ll/ۚ֫ۧ;->ܳ֫:J

    .line 87
    iput-wide v7, v6, Ll/ۘ֫ۧ;->۫:J

    .line 88
    iput-wide v9, v6, Ll/ۘ֫ۧ;->᩶:J

    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    :cond_5
    move-wide v7, v2

    move-wide v5, v12

    .line 423
    :goto_5
    :try_start_0
    new-instance v0, Ll/᩵֫ۧ;

    iget-boolean v9, v1, Ll/ۚ֫ۧ;->۟:Z

    move-object v3, v0

    move-object/from16 v4, p1

    invoke-direct/range {v3 .. v9}, Ll/᩵֫ۧ;-><init>(Ll/ۙ᩵֫;JJZ)V

    iput-object v0, v1, Ll/ۚ֫ۧ;->ۧ֫:Ll/᩵֫ۧ;
    :try_end_0
    .catch Ll/֡֫ۧ; {:try_start_0 .. :try_end_0} :catch_0

    .line 434
    invoke-virtual {v1, v0}, Ll/ۢ֫ۧ;->֫(Ll/ۙ᩵֫;)V

    return-void

    :catch_0
    move-exception v0

    .line 426
    iput-object v0, v1, Ll/ۚ֫ۧ;->֫֫:Ll/֡֫ۧ;

    const/4 v0, 0x0

    .line 429
    :goto_6
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_6

    .line 430
    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۘ֫ۧ;

    iget-object v3, v1, Ll/ۚ֫ۧ;->֫֫:Ll/֡֫ۧ;

    invoke-virtual {v2, v3}, Ll/ۘ֫ۧ;->֫(Ll/֡֫ۧ;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_6

    :cond_6
    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܺۧۧ;Ll/᩸ܿۧ;J)Ll/ۢۧۧ;
    .locals 8

    .line 358
    new-instance v7, Ll/ۘ֫ۧ;

    iget-object v0, p0, Ll/᩺ܽۧ;->᩺:Ll/ۘۧۧ;

    .line 360
    invoke-interface {v0, p1, p2, p3, p4}, Ll/ۘۧۧ;->֫(Ll/ܺۧۧ;Ll/᩸ܿۧ;J)Ll/ۢۧۧ;

    move-result-object v1

    iget-wide v3, p0, Ll/ۚ֫ۧ;->᩻֫:J

    iget-wide v5, p0, Ll/ۚ֫ۧ;->ܳ֫:J

    iget-boolean v2, p0, Ll/ۚ֫ۧ;->ܽ֫:Z

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Ll/ۘ֫ۧ;-><init>(Ll/ۢۧۧ;ZJJ)V

    .line 364
    iget-object p1, p0, Ll/ۚ֫ۧ;->ܿ֫:Ljava/util/ArrayList;

    invoke-virtual {p1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v7
.end method

.method public final ֫(Ll/ۢۧۧ;)V
    .locals 2

    .line 370
    iget-object v0, p0, Ll/ۚ֫ۧ;->ܿ֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result v1

    invoke-static {v1}, Ll/᩺֡֫;->ۧ(Z)V

    .line 371
    check-cast p1, Ll/ۘ֫ۧ;

    iget-object p1, p1, Ll/ۘ֫ۧ;->ۙ:Ll/ۢۧۧ;

    iget-object v1, p0, Ll/᩺ܽۧ;->᩺:Ll/ۘۧۧ;

    invoke-interface {v1, p1}, Ll/ۘۧۧ;->֫(Ll/ۢۧۧ;)V

    .line 372
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-boolean p1, p0, Ll/ۚ֫ۧ;->ܰ:Z

    if-nez p1, :cond_0

    .line 373
    iget-object p1, p0, Ll/ۚ֫ۧ;->ۧ֫:Ll/᩵֫ۧ;

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 373
    iget-object p1, p1, Ll/ܰ֫ۧ;->ۧ:Ll/ۙ᩵֫;

    invoke-direct {p0, p1}, Ll/ۚ֫ۧ;->ܽ(Ll/ۙ᩵֫;)V

    :cond_0
    return-void
.end method

.method public final ۧ()V
    .locals 1

    .line 350
    iget-object v0, p0, Ll/ۚ֫ۧ;->֫֫:Ll/֡֫ۧ;

    if-nez v0, :cond_0

    .line 353
    invoke-super {p0}, Ll/᩸֫ۧ;->ۧ()V

    return-void

    .line 351
    :cond_0
    throw v0
.end method

.method public final ۧ(Ll/ۙ᩵֫;)V
    .locals 1

    .line 386
    iget-object v0, p0, Ll/ۚ֫ۧ;->֫֫:Ll/֡֫ۧ;

    if-eqz v0, :cond_0

    return-void

    .line 389
    :cond_0
    invoke-direct {p0, p1}, Ll/ۚ֫ۧ;->ܽ(Ll/ۙ᩵֫;)V

    return-void
.end method

.method public final ᩷()V
    .locals 1

    .line 379
    invoke-super {p0}, Ll/᩸֫ۧ;->᩷()V

    const/4 v0, 0x0

    .line 380
    iput-object v0, p0, Ll/ۚ֫ۧ;->֫֫:Ll/֡֫ۧ;

    .line 381
    iput-object v0, p0, Ll/ۚ֫ۧ;->ۧ֫:Ll/᩵֫ۧ;

    return-void
.end method
