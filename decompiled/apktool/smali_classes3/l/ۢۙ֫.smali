.class public final Ll/ۢۙ֫;
.super Ljava/lang/Object;
.source "M8TF"

# interfaces
.implements Ll/᩹᩻ۧ;
.implements Ll/᩷ۜۧ;
.implements Ll/ۛۗ֫;


# instance fields
.field public ۙ:Ll/᩹᩻ۧ;

.field public ᩶:Ll/᩹᩻ۧ;

.field public ᩸:Ll/᩷ۜۧ;

.field public ᩹:Ll/᩷ۜۧ;


# virtual methods
.method public final ֫(ILjava/lang/Object;)V
    .locals 1

    const/4 v0, 0x7

    if-eq p1, v0, :cond_3

    const/16 v0, 0x8

    if-eq p1, v0, :cond_2

    const/16 v0, 0x2710

    if-eq p1, v0, :cond_0

    return-void

    .line 3369
    :cond_0
    check-cast p2, Ll/᩶ۜۧ;

    if-nez p2, :cond_1

    const/4 p1, 0x0

    .line 3371
    iput-object p1, p0, Ll/ۢۙ֫;->᩶:Ll/᩹᩻ۧ;

    .line 3372
    iput-object p1, p0, Ll/ۢۙ֫;->᩹:Ll/᩷ۜۧ;

    return-void

    .line 3374
    :cond_1
    invoke-virtual {p2}, Ll/᩶ۜۧ;->ۧ()Ll/᩹᩻ۧ;

    move-result-object p1

    iput-object p1, p0, Ll/ۢۙ֫;->᩶:Ll/᩹᩻ۧ;

    .line 3375
    invoke-virtual {p2}, Ll/᩶ۜۧ;->֫()Ll/᩷ۜۧ;

    move-result-object p1

    iput-object p1, p0, Ll/ۢۙ֫;->᩹:Ll/᩷ۜۧ;

    return-void

    .line 3366
    :cond_2
    check-cast p2, Ll/᩷ۜۧ;

    iput-object p2, p0, Ll/ۢۙ֫;->᩸:Ll/᩷ۜۧ;

    return-void

    .line 3363
    :cond_3
    check-cast p2, Ll/᩹᩻ۧ;

    iput-object p2, p0, Ll/ۢۙ֫;->ۙ:Ll/᩹᩻ۧ;

    return-void
.end method

.method public final ֫(JJLl/۠ᩴ֫;Landroid/media/MediaFormat;)V
    .locals 8

    .line 3400
    iget-object v0, p0, Ll/ۢۙ֫;->᩶:Ll/᩹᩻ۧ;

    if-eqz v0, :cond_0

    move-wide v1, p1

    move-wide v3, p3

    move-object v5, p5

    move-object v6, p6

    .line 3401
    invoke-interface/range {v0 .. v6}, Ll/᩹᩻ۧ;->֫(JJLl/۠ᩴ֫;Landroid/media/MediaFormat;)V

    .line 3404
    :cond_0
    iget-object v1, p0, Ll/ۢۙ֫;->ۙ:Ll/᩹᩻ۧ;

    if-eqz v1, :cond_1

    move-wide v2, p1

    move-wide v4, p3

    move-object v6, p5

    move-object v7, p6

    .line 3405
    invoke-interface/range {v1 .. v7}, Ll/᩹᩻ۧ;->֫(JJLl/۠ᩴ֫;Landroid/media/MediaFormat;)V

    :cond_1
    return-void
.end method

.method public final ֫(J[F)V
    .locals 1

    .line 3414
    iget-object v0, p0, Ll/ۢۙ֫;->᩹:Ll/᩷ۜۧ;

    if-eqz v0, :cond_0

    .line 3415
    invoke-interface {v0, p1, p2, p3}, Ll/᩷ۜۧ;->֫(J[F)V

    .line 3417
    :cond_0
    iget-object v0, p0, Ll/ۢۙ֫;->᩸:Ll/᩷ۜۧ;

    if-eqz v0, :cond_1

    .line 3418
    invoke-interface {v0, p1, p2, p3}, Ll/᩷ۜۧ;->֫(J[F)V

    :cond_1
    return-void
.end method

.method public final ܽ()V
    .locals 1

    .line 3424
    iget-object v0, p0, Ll/ۢۙ֫;->᩹:Ll/᩷ۜۧ;

    if-eqz v0, :cond_0

    .line 3425
    invoke-interface {v0}, Ll/᩷ۜۧ;->ܽ()V

    .line 3427
    :cond_0
    iget-object v0, p0, Ll/ۢۙ֫;->᩸:Ll/᩷ۜۧ;

    if-eqz v0, :cond_1

    .line 3428
    invoke-interface {v0}, Ll/᩷ۜۧ;->ܽ()V

    :cond_1
    return-void
.end method
