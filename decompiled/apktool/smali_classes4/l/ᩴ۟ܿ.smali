.class public final Ll/ᩴ۟ܿ;
.super Ljava/lang/Object;
.source "J9R5"


# instance fields
.field public final ֫:Z

.field public ۧ:Landroid/view/animation/Interpolator;

.field public ܽ:I

.field public final ܿ:Ll/ۖ۟ܿ;

.field public final ᩳ:Ll/ۖ۟ܿ;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 73
    new-instance v0, Ll/ۘ۟ܿ;

    .line 937
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 73
    iput-object v0, p0, Ll/ᩴ۟ܿ;->ۧ:Landroid/view/animation/Interpolator;

    const/4 v0, 0x1

    .line 77
    iput-boolean v0, p0, Ll/ᩴ۟ܿ;->֫:Z

    .line 78
    new-instance v0, Ll/ۖ۟ܿ;

    invoke-direct {v0, p1}, Ll/ۖ۟ܿ;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Ll/ᩴ۟ܿ;->ᩳ:Ll/ۖ۟ܿ;

    .line 79
    new-instance v0, Ll/ۖ۟ܿ;

    invoke-direct {v0, p1}, Ll/ۖ۟ܿ;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Ll/ᩴ۟ܿ;->ܿ:Ll/ۖ۟ܿ;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 492
    iget-object v0, p0, Ll/ᩴ۟ܿ;->ᩳ:Ll/ۖ۟ܿ;

    invoke-virtual {v0}, Ll/ۖ۟ܿ;->ۧ()V

    .line 493
    iget-object v0, p0, Ll/ᩴ۟ܿ;->ܿ:Ll/ۖ۟ܿ;

    invoke-virtual {v0}, Ll/ۖ۟ܿ;->ۧ()V

    return-void
.end method

.method public final ֫(JJ)V
    .locals 3

    const/4 v0, 0x0

    .line 354
    iput v0, p0, Ll/ᩴ۟ܿ;->ܽ:I

    .line 355
    iget-object v0, p0, Ll/ᩴ۟ܿ;->ᩳ:Ll/ۖ۟ܿ;

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2, v1, v2}, Ll/ۖ۟ܿ;->֫(JJ)V

    .line 356
    iget-object v0, p0, Ll/ᩴ۟ܿ;->ܿ:Ll/ۖ۟ܿ;

    invoke-virtual {v0, p1, p2, p3, p4}, Ll/ۖ۟ܿ;->֫(JJ)V

    return-void
.end method

.method public final ֫(JJJJ)V
    .locals 22

    move-object/from16 v0, p0

    .line 415
    iget-boolean v1, v0, Ll/ᩴ۟ܿ;->֫:Z

    const-wide/16 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual/range {p0 .. p0}, Ll/ᩴ۟ܿ;->ᩳ()Z

    move-result v1

    if-nez v1, :cond_0

    .line 416
    iget-object v1, v0, Ll/ᩴ۟ܿ;->ᩳ:Ll/ۖ۟ܿ;

    invoke-static {v1}, Ll/ۖ۟ܿ;->֫(Ll/ۖ۟ܿ;)F

    move-result v1

    .line 417
    iget-object v4, v0, Ll/ᩴ۟ܿ;->ܿ:Ll/ۖ۟ܿ;

    invoke-static {v4}, Ll/ۖ۟ܿ;->֫(Ll/ۖ۟ܿ;)F

    move-result v4

    long-to-float v5, v2

    .line 418
    invoke-static {v5}, Ljava/lang/Math;->signum(F)F

    move-result v6

    invoke-static {v1}, Ljava/lang/Math;->signum(F)F

    move-result v7

    cmpl-float v6, v6, v7

    if-nez v6, :cond_0

    move-wide/from16 v6, p3

    long-to-float v8, v6

    .line 419
    invoke-static {v8}, Ljava/lang/Math;->signum(F)F

    move-result v9

    invoke-static {v4}, Ljava/lang/Math;->signum(F)F

    move-result v10

    cmpl-float v9, v9, v10

    if-nez v9, :cond_1

    add-float/2addr v5, v1

    float-to-long v2, v5

    add-float/2addr v8, v4

    float-to-long v4, v8

    move-wide v14, v2

    move-wide v9, v4

    goto :goto_0

    :cond_0
    move-wide/from16 v6, p3

    :cond_1
    move-wide v14, v2

    move-wide v9, v6

    :goto_0
    const/4 v1, 0x1

    .line 425
    iput v1, v0, Ll/ᩴ۟ܿ;->ܽ:I

    .line 426
    iget-object v11, v0, Ll/ᩴ۟ܿ;->ᩳ:Ll/ۖ۟ܿ;

    const-wide/16 v12, 0x0

    const-wide/16 v16, 0x0

    const-wide/16 v18, 0x0

    const-wide/16 v20, 0x0

    invoke-virtual/range {v11 .. v21}, Ll/ۖ۟ܿ;->֫(JJJJJ)V

    .line 427
    iget-object v6, v0, Ll/ᩴ۟ܿ;->ܿ:Ll/ۖ۟ܿ;

    const-wide/16 v11, 0x0

    move-wide/from16 v7, p1

    move-wide/from16 v13, p5

    move-wide/from16 v15, p7

    invoke-virtual/range {v6 .. v16}, Ll/ۖ۟ܿ;->֫(JJJJJ)V

    return-void
.end method

.method public final ۧ()Z
    .locals 9

    .line 278
    invoke-virtual {p0}, Ll/ᩴ۟ܿ;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 282
    :cond_0
    iget v0, p0, Ll/ᩴ۟ܿ;->ܽ:I

    const/4 v1, 0x1

    iget-object v2, p0, Ll/ᩴ۟ܿ;->ܿ:Ll/ۖ۟ܿ;

    iget-object v3, p0, Ll/ᩴ۟ܿ;->ᩳ:Ll/ۖ۟ܿ;

    if-eqz v0, :cond_4

    if-eq v0, v1, :cond_1

    goto :goto_0

    .line 300
    :cond_1
    invoke-static {v3}, Ll/ۖ۟ܿ;->ᩳ(Ll/ۖ۟ܿ;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 301
    invoke-virtual {v3}, Ll/ۖ۟ܿ;->ܽ()Z

    move-result v0

    if-nez v0, :cond_2

    .line 302
    invoke-virtual {v3}, Ll/ۖ۟ܿ;->֫()Z

    move-result v0

    if-nez v0, :cond_2

    .line 303
    invoke-virtual {v3}, Ll/ۖ۟ܿ;->ۧ()V

    .line 308
    :cond_2
    invoke-static {v2}, Ll/ۖ۟ܿ;->ᩳ(Ll/ۖ۟ܿ;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 309
    invoke-virtual {v2}, Ll/ۖ۟ܿ;->ܽ()Z

    move-result v0

    if-nez v0, :cond_3

    .line 310
    invoke-virtual {v2}, Ll/ۖ۟ܿ;->֫()Z

    move-result v0

    if-nez v0, :cond_3

    .line 311
    invoke-virtual {v2}, Ll/ۖ۟ܿ;->ۧ()V

    :cond_3
    :goto_0
    return v1

    .line 284
    :cond_4
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v4

    .line 287
    invoke-static {v3}, Ll/ۖ۟ܿ;->ܿ(Ll/ۖ۟ܿ;)J

    move-result-wide v6

    sub-long/2addr v4, v6

    .line 289
    invoke-static {v3}, Ll/ۖ۟ܿ;->ܽ(Ll/ۖ۟ܿ;)I

    move-result v0

    int-to-long v6, v0

    cmp-long v8, v4, v6

    if-gez v8, :cond_5

    long-to-float v4, v4

    int-to-float v0, v0

    div-float/2addr v4, v0

    .line 291
    iget-object v0, p0, Ll/ᩴ۟ܿ;->ۧ:Landroid/view/animation/Interpolator;

    check-cast v0, Ll/ۘ۟ܿ;

    invoke-virtual {v0, v4}, Ll/ۘ۟ܿ;->getInterpolation(F)F

    move-result v0

    .line 292
    invoke-virtual {v3, v0}, Ll/ۖ۟ܿ;->֫(F)V

    .line 293
    invoke-virtual {v2, v0}, Ll/ۖ۟ܿ;->֫(F)V

    return v1

    .line 295
    :cond_5
    invoke-virtual {p0}, Ll/ᩴ۟ܿ;->֫()V

    return v1
.end method

.method public final ܽ()J
    .locals 2

    .line 177
    iget-object v0, p0, Ll/ᩴ۟ܿ;->ܿ:Ll/ۖ۟ܿ;

    invoke-static {v0}, Ll/ۖ۟ܿ;->ۧ(Ll/ۖ۟ܿ;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final ᩳ()Z
    .locals 1

    .line 147
    iget-object v0, p0, Ll/ᩴ۟ܿ;->ᩳ:Ll/ۖ۟ܿ;

    invoke-static {v0}, Ll/ۖ۟ܿ;->ᩳ(Ll/ۖ۟ܿ;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ᩴ۟ܿ;->ܿ:Ll/ۖ۟ܿ;

    invoke-static {v0}, Ll/ۖ۟ܿ;->ᩳ(Ll/ۖ۟ܿ;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
