.class public abstract Ll/ܳᩴ֫;
.super Ljava/lang/Object;
.source "B8IO"

# interfaces
.implements Ll/֨᩵֫;


# instance fields
.field public final ֫:Ll/᩶᩵֫;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    new-instance v0, Ll/᩶᩵֫;

    invoke-direct {v0}, Ll/᩶᩵֫;-><init>()V

    iput-object v0, p0, Ll/ܳᩴ֫;->֫:Ll/᩶᩵֫;

    return-void
.end method

.method private ܽ(I)V
    .locals 3

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    const/4 p1, 0x0

    const/4 v2, -0x1

    .line 400
    invoke-virtual {p0, v0, v1, v2, p1}, Ll/ܳᩴ֫;->֫(JIZ)V

    return-void
.end method


# virtual methods
.method public final isPlaying()Z
    .locals 2

    .line 123
    invoke-interface {p0}, Ll/֨᩵֫;->ᩳ()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    .line 124
    invoke-interface {p0}, Ll/֨᩵֫;->᩶()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 125
    invoke-interface {p0}, Ll/֨᩵֫;->֡()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final pause()V
    .locals 1

    const/4 v0, 0x0

    .line 118
    invoke-interface {p0, v0}, Ll/֨᩵֫;->֫(Z)V

    return-void
.end method

.method public final seekTo(J)V
    .locals 2

    .line 409
    invoke-interface {p0}, Ll/֨᩵֫;->۟()I

    move-result v0

    const/4 v1, 0x0

    .line 408
    invoke-virtual {p0, p1, p2, v0, v1}, Ll/ܳᩴ֫;->֫(JIZ)V

    return-void
.end method

.method public abstract ֫(JIZ)V
.end method

.method public final ֫(Ll/ۧ᩵֫;)V
    .locals 0

    .line 40
    invoke-static {p1}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object p1

    .line 55
    invoke-interface {p0, p1}, Ll/֨᩵֫;->֫(Ljava/util/List;)V

    return-void
.end method

.method public final ۜ֫()Z
    .locals 7

    .line 283
    invoke-interface {p0}, Ll/֨᩵֫;->ۚ()Ll/ۙ᩵֫;

    move-result-object v0

    .line 284
    invoke-virtual {v0}, Ll/ۙ᩵֫;->ܽ()Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, -0x1

    if-eqz v1, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    .line 287
    :cond_0
    invoke-interface {p0}, Ll/֨᩵֫;->۟()I

    move-result v1

    .line 395
    invoke-interface {p0}, Ll/֨᩵֫;->ۜ()I

    move-result v5

    if-ne v5, v3, :cond_1

    const/4 v5, 0x0

    .line 287
    :cond_1
    invoke-interface {p0}, Ll/֨᩵֫;->֫֫()Z

    move-result v6

    .line 286
    invoke-virtual {v0, v1, v5, v6}, Ll/ۙ᩵֫;->ۧ(IIZ)I

    move-result v0

    :goto_0
    if-eq v0, v4, :cond_2

    return v3

    :cond_2
    return v2
.end method

.method public final ۡ()V
    .locals 4

    .line 131
    invoke-interface {p0}, Ll/֨᩵֫;->۟()I

    move-result v0

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v3, 0x0

    .line 423
    invoke-virtual {p0, v1, v2, v0, v3}, Ll/ܳᩴ֫;->֫(JIZ)V

    return-void
.end method

.method public final ۡ֫()Z
    .locals 5

    .line 382
    invoke-interface {p0}, Ll/֨᩵֫;->ۚ()Ll/ۙ᩵֫;

    move-result-object v0

    .line 383
    invoke-virtual {v0}, Ll/ۙ᩵֫;->ܽ()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {p0}, Ll/֨᩵֫;->۟()I

    move-result v1

    iget-object v2, p0, Ll/ܳᩴ֫;->֫:Ll/᩶᩵֫;

    const-wide/16 v3, 0x0

    .line 1097
    invoke-virtual {v0, v1, v2, v3, v4}, Ll/ۙ᩵֫;->֫(ILl/᩶᩵֫;J)Ll/᩶᩵֫;

    move-result-object v0

    .line 383
    iget-boolean v0, v0, Ll/᩶᩵֫;->᩻:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۢ֫()Z
    .locals 5

    .line 353
    invoke-interface {p0}, Ll/֨᩵֫;->ۚ()Ll/ۙ᩵֫;

    move-result-object v0

    .line 354
    invoke-virtual {v0}, Ll/ۙ᩵֫;->ܽ()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {p0}, Ll/֨᩵֫;->۟()I

    move-result v1

    iget-object v2, p0, Ll/ܳᩴ֫;->֫:Ll/᩶᩵֫;

    const-wide/16 v3, 0x0

    .line 1097
    invoke-virtual {v0, v1, v2, v3, v4}, Ll/ۙ᩵֫;->֫(ILl/᩶᩵֫;J)Ll/᩶᩵֫;

    move-result-object v0

    .line 354
    invoke-virtual {v0}, Ll/᩶᩵֫;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۧ(I)Z
    .locals 1

    .line 98
    invoke-interface {p0}, Ll/֨᩵֫;->᩹()Ll/ᩴ᩵֫;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ᩴ᩵֫;->֫(I)Z

    move-result p1

    return p1
.end method

.method public final ۬()J
    .locals 5

    .line 388
    invoke-interface {p0}, Ll/֨᩵֫;->ۚ()Ll/ۙ᩵֫;

    move-result-object v0

    .line 389
    invoke-virtual {v0}, Ll/ۙ᩵֫;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_0

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    return-wide v0

    .line 391
    :cond_0
    invoke-interface {p0}, Ll/֨᩵֫;->۟()I

    move-result v1

    iget-object v2, p0, Ll/ܳᩴ֫;->֫:Ll/᩶᩵֫;

    const-wide/16 v3, 0x0

    .line 1097
    invoke-virtual {v0, v1, v2, v3, v4}, Ll/ۙ᩵֫;->֫(ILl/᩶᩵֫;J)Ll/᩶᩵֫;

    move-result-object v0

    .line 335
    iget-wide v0, v0, Ll/᩶᩵֫;->ۧ:J

    invoke-static {v0, v1}, Ll/ۘ֨֫;->ۧ(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public final ܳ()Ll/ۧ᩵֫;
    .locals 5

    .line 293
    invoke-interface {p0}, Ll/֨᩵֫;->ۚ()Ll/ۙ᩵֫;

    move-result-object v0

    .line 294
    invoke-virtual {v0}, Ll/ۙ᩵֫;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 296
    :cond_0
    invoke-interface {p0}, Ll/֨᩵֫;->۟()I

    move-result v1

    iget-object v2, p0, Ll/ܳᩴ֫;->֫:Ll/᩶᩵֫;

    const-wide/16 v3, 0x0

    .line 1097
    invoke-virtual {v0, v1, v2, v3, v4}, Ll/ۙ᩵֫;->֫(ILl/᩶᩵֫;J)Ll/᩶᩵֫;

    move-result-object v0

    .line 296
    iget-object v0, v0, Ll/᩶᩵֫;->ۡ:Ll/ۧ᩵֫;

    return-object v0
.end method

.method public final ܶ()V
    .locals 10

    .line 192
    invoke-interface {p0}, Ll/֨᩵֫;->ۚ()Ll/ۙ᩵֫;

    move-result-object v0

    .line 193
    invoke-virtual {v0}, Ll/ۙ᩵֫;->ܽ()Z

    move-result v0

    const/16 v1, 0x9

    if-nez v0, :cond_7

    invoke-interface {p0}, Ll/֨᩵֫;->᩷()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 197
    :cond_0
    invoke-virtual {p0}, Ll/ܳᩴ֫;->᩻֫()Z

    move-result v0

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v4, 0x0

    if-eqz v0, :cond_5

    .line 265
    invoke-interface {p0}, Ll/֨᩵֫;->ۚ()Ll/ۙ᩵֫;

    move-result-object v0

    .line 266
    invoke-virtual {v0}, Ll/ۙ᩵֫;->ܽ()Z

    move-result v5

    const/4 v6, 0x1

    const/4 v7, -0x1

    if-eqz v5, :cond_1

    const/4 v0, -0x1

    goto :goto_0

    .line 269
    :cond_1
    invoke-interface {p0}, Ll/֨᩵֫;->۟()I

    move-result v5

    .line 395
    invoke-interface {p0}, Ll/֨᩵֫;->ۜ()I

    move-result v8

    if-ne v8, v6, :cond_2

    const/4 v8, 0x0

    .line 269
    :cond_2
    invoke-interface {p0}, Ll/֨᩵֫;->֫֫()Z

    move-result v9

    .line 268
    invoke-virtual {v0, v5, v8, v9}, Ll/ۙ᩵֫;->֫(IIZ)I

    move-result v0

    :goto_0
    if-ne v0, v7, :cond_3

    .line 433
    invoke-direct {p0, v1}, Ll/ܳᩴ֫;->ܽ(I)V

    return-void

    .line 436
    :cond_3
    invoke-interface {p0}, Ll/֨᩵֫;->۟()I

    move-result v1

    if-ne v0, v1, :cond_4

    .line 458
    invoke-interface {p0}, Ll/֨᩵֫;->۟()I

    move-result v0

    .line 457
    invoke-virtual {p0, v2, v3, v0, v6}, Ll/ܳᩴ֫;->֫(JIZ)V

    return-void

    .line 423
    :cond_4
    invoke-virtual {p0, v2, v3, v0, v4}, Ll/ܳᩴ֫;->֫(JIZ)V

    return-void

    .line 199
    :cond_5
    invoke-virtual {p0}, Ll/ܳᩴ֫;->ۢ֫()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p0}, Ll/ܳᩴ֫;->᩷֫()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 200
    invoke-interface {p0}, Ll/֨᩵֫;->۟()I

    move-result v0

    .line 423
    invoke-virtual {p0, v2, v3, v0, v4}, Ll/ܳᩴ֫;->֫(JIZ)V

    return-void

    .line 202
    :cond_6
    invoke-direct {p0, v1}, Ll/ܳᩴ֫;->ܽ(I)V

    return-void

    .line 194
    :cond_7
    :goto_1
    invoke-direct {p0, v1}, Ll/ܳᩴ֫;->ܽ(I)V

    return-void
.end method

.method public final ܺ()V
    .locals 12

    .line 161
    invoke-interface {p0}, Ll/֨᩵֫;->ۚ()Ll/ۙ᩵֫;

    move-result-object v0

    .line 162
    invoke-virtual {v0}, Ll/ۙ᩵֫;->ܽ()Z

    move-result v0

    const/4 v1, 0x7

    if-nez v0, :cond_c

    invoke-interface {p0}, Ll/֨᩵֫;->᩷()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_2

    .line 166
    :cond_0
    invoke-virtual {p0}, Ll/ܳᩴ֫;->ۜ֫()Z

    move-result v0

    .line 167
    invoke-virtual {p0}, Ll/ܳᩴ֫;->ۢ֫()Z

    move-result v2

    const/4 v3, -0x1

    const/4 v4, 0x1

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v7, 0x0

    if-eqz v2, :cond_6

    invoke-virtual {p0}, Ll/ܳᩴ֫;->ۡ֫()Z

    move-result v2

    if-nez v2, :cond_6

    if-eqz v0, :cond_5

    .line 283
    invoke-interface {p0}, Ll/֨᩵֫;->ۚ()Ll/ۙ᩵֫;

    move-result-object v0

    .line 284
    invoke-virtual {v0}, Ll/ۙ᩵֫;->ܽ()Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v0, -0x1

    goto :goto_0

    .line 287
    :cond_1
    invoke-interface {p0}, Ll/֨᩵֫;->۟()I

    move-result v2

    .line 395
    invoke-interface {p0}, Ll/֨᩵֫;->ۜ()I

    move-result v8

    if-ne v8, v4, :cond_2

    const/4 v8, 0x0

    .line 287
    :cond_2
    invoke-interface {p0}, Ll/֨᩵֫;->֫֫()Z

    move-result v9

    .line 286
    invoke-virtual {v0, v2, v8, v9}, Ll/ۙ᩵֫;->ۧ(IIZ)I

    move-result v0

    :goto_0
    if-ne v0, v3, :cond_3

    .line 446
    invoke-direct {p0, v1}, Ll/ܳᩴ֫;->ܽ(I)V

    return-void

    .line 449
    :cond_3
    invoke-interface {p0}, Ll/֨᩵֫;->۟()I

    move-result v1

    if-ne v0, v1, :cond_4

    .line 458
    invoke-interface {p0}, Ll/֨᩵֫;->۟()I

    move-result v0

    .line 457
    invoke-virtual {p0, v5, v6, v0, v4}, Ll/ܳᩴ֫;->֫(JIZ)V

    return-void

    .line 423
    :cond_4
    invoke-virtual {p0, v5, v6, v0, v7}, Ll/ܳᩴ֫;->֫(JIZ)V

    return-void

    .line 171
    :cond_5
    invoke-direct {p0, v1}, Ll/ܳᩴ֫;->ܽ(I)V

    return-void

    :cond_6
    if-eqz v0, :cond_b

    .line 173
    invoke-interface {p0}, Ll/֨᩵֫;->getCurrentPosition()J

    move-result-wide v8

    invoke-interface {p0}, Ll/֨᩵֫;->ۙ()J

    move-result-wide v10

    cmp-long v0, v8, v10

    if-gtz v0, :cond_b

    .line 283
    invoke-interface {p0}, Ll/֨᩵֫;->ۚ()Ll/ۙ᩵֫;

    move-result-object v0

    .line 284
    invoke-virtual {v0}, Ll/ۙ᩵֫;->ܽ()Z

    move-result v2

    if-eqz v2, :cond_7

    const/4 v0, -0x1

    goto :goto_1

    .line 287
    :cond_7
    invoke-interface {p0}, Ll/֨᩵֫;->۟()I

    move-result v2

    .line 395
    invoke-interface {p0}, Ll/֨᩵֫;->ۜ()I

    move-result v8

    if-ne v8, v4, :cond_8

    const/4 v8, 0x0

    .line 287
    :cond_8
    invoke-interface {p0}, Ll/֨᩵֫;->֫֫()Z

    move-result v9

    .line 286
    invoke-virtual {v0, v2, v8, v9}, Ll/ۙ᩵֫;->ۧ(IIZ)I

    move-result v0

    :goto_1
    if-ne v0, v3, :cond_9

    .line 446
    invoke-direct {p0, v1}, Ll/ܳᩴ֫;->ܽ(I)V

    return-void

    .line 449
    :cond_9
    invoke-interface {p0}, Ll/֨᩵֫;->۟()I

    move-result v1

    if-ne v0, v1, :cond_a

    .line 458
    invoke-interface {p0}, Ll/֨᩵֫;->۟()I

    move-result v0

    .line 457
    invoke-virtual {p0, v5, v6, v0, v4}, Ll/ܳᩴ֫;->֫(JIZ)V

    return-void

    .line 423
    :cond_a
    invoke-virtual {p0, v5, v6, v0, v7}, Ll/ܳᩴ֫;->֫(JIZ)V

    return-void

    :cond_b
    const-wide/16 v0, 0x0

    .line 409
    invoke-interface {p0}, Ll/֨᩵֫;->۟()I

    move-result v2

    .line 408
    invoke-virtual {p0, v0, v1, v2, v7}, Ll/ܳᩴ֫;->֫(JIZ)V

    return-void

    .line 163
    :cond_c
    :goto_2
    invoke-direct {p0, v1}, Ll/ܳᩴ֫;->ܽ(I)V

    return-void
.end method

.method public final ܽ֫()V
    .locals 7

    .line 146
    invoke-interface {p0}, Ll/֨᩵֫;->᩺()J

    move-result-wide v0

    .line 413
    invoke-interface {p0}, Ll/֨᩵֫;->getCurrentPosition()J

    move-result-wide v2

    add-long/2addr v2, v0

    .line 414
    invoke-interface {p0}, Ll/֨᩵֫;->getDuration()J

    move-result-wide v0

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v6, v0, v4

    if-eqz v6, :cond_0

    .line 416
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    :cond_0
    const-wide/16 v0, 0x0

    .line 418
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    .line 409
    invoke-interface {p0}, Ll/֨᩵֫;->۟()I

    move-result v2

    const/4 v3, 0x0

    .line 408
    invoke-virtual {p0, v0, v1, v2, v3}, Ll/ܳᩴ֫;->֫(JIZ)V

    return-void
.end method

.method public final ܿ()V
    .locals 1

    const/4 v0, 0x1

    .line 113
    invoke-interface {p0, v0}, Ll/֨᩵֫;->֫(Z)V

    return-void
.end method

.method public final ᩳ֫()V
    .locals 7

    .line 141
    invoke-interface {p0}, Ll/֨᩵֫;->ܳ֫()J

    move-result-wide v0

    neg-long v0, v0

    .line 413
    invoke-interface {p0}, Ll/֨᩵֫;->getCurrentPosition()J

    move-result-wide v2

    add-long/2addr v2, v0

    .line 414
    invoke-interface {p0}, Ll/֨᩵֫;->getDuration()J

    move-result-wide v0

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v6, v0, v4

    if-eqz v6, :cond_0

    .line 416
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    :cond_0
    const-wide/16 v0, 0x0

    .line 418
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    .line 409
    invoke-interface {p0}, Ll/֨᩵֫;->۟()I

    move-result v2

    const/4 v3, 0x0

    .line 408
    invoke-virtual {p0, v0, v1, v2, v3}, Ll/ܳᩴ֫;->֫(JIZ)V

    return-void
.end method

.method public final ᩷֫()Z
    .locals 5

    .line 338
    invoke-interface {p0}, Ll/֨᩵֫;->ۚ()Ll/ۙ᩵֫;

    move-result-object v0

    .line 339
    invoke-virtual {v0}, Ll/ۙ᩵֫;->ܽ()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {p0}, Ll/֨᩵֫;->۟()I

    move-result v1

    iget-object v2, p0, Ll/ܳᩴ֫;->֫:Ll/᩶᩵֫;

    const-wide/16 v3, 0x0

    .line 1097
    invoke-virtual {v0, v1, v2, v3, v4}, Ll/ۙ᩵֫;->֫(ILl/᩶᩵֫;J)Ll/᩶᩵֫;

    move-result-object v0

    .line 339
    iget-boolean v0, v0, Ll/᩶᩵֫;->ܿ:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩻֫()Z
    .locals 7

    .line 265
    invoke-interface {p0}, Ll/֨᩵֫;->ۚ()Ll/ۙ᩵֫;

    move-result-object v0

    .line 266
    invoke-virtual {v0}, Ll/ۙ᩵֫;->ܽ()Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, -0x1

    if-eqz v1, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    .line 269
    :cond_0
    invoke-interface {p0}, Ll/֨᩵֫;->۟()I

    move-result v1

    .line 395
    invoke-interface {p0}, Ll/֨᩵֫;->ۜ()I

    move-result v5

    if-ne v5, v3, :cond_1

    const/4 v5, 0x0

    .line 269
    :cond_1
    invoke-interface {p0}, Ll/֨᩵֫;->֫֫()Z

    move-result v6

    .line 268
    invoke-virtual {v0, v1, v5, v6}, Ll/ۙ᩵֫;->֫(IIZ)I

    move-result v0

    :goto_0
    if-eq v0, v4, :cond_2

    return v3

    :cond_2
    return v2
.end method
