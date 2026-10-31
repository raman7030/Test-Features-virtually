.class public final Ll/ۧ֡ۘ;
.super Ll/ܽ֡ۘ;
.source "21VS"


# instance fields
.field public ۙ:F


# direct methods
.method public constructor <init>(FF)V
    .locals 0

    .line 326
    invoke-direct {p0}, Ll/ܽ֡ۘ;-><init>()V

    .line 327
    iput p1, p0, Ll/ܽ֡ۘ;->᩸:F

    .line 328
    iput p2, p0, Ll/ۧ֡ۘ;->ۙ:F

    const/4 p1, 0x1

    .line 330
    iput-boolean p1, p0, Ll/ܽ֡ۘ;->᩹:Z

    return-void
.end method


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 3

    .line 355
    new-instance v0, Ll/ۧ֡ۘ;

    .line 191
    iget v1, p0, Ll/ܽ֡ۘ;->᩸:F

    .line 355
    iget v2, p0, Ll/ۧ֡ۘ;->ۙ:F

    invoke-direct {v0, v1, v2}, Ll/ۧ֡ۘ;-><init>(FF)V

    .line 356
    invoke-virtual {p0}, Ll/ܽ֡ۘ;->֫()Landroid/view/animation/Interpolator;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ܽ֡ۘ;->֫(Landroid/view/animation/Interpolator;)V

    return-object v0
.end method

.method public final clone()Ll/ܽ֡ۘ;
    .locals 3

    .line 355
    new-instance v0, Ll/ۧ֡ۘ;

    .line 191
    iget v1, p0, Ll/ܽ֡ۘ;->᩸:F

    .line 355
    iget v2, p0, Ll/ۧ֡ۘ;->ۙ:F

    invoke-direct {v0, v1, v2}, Ll/ۧ֡ۘ;-><init>(FF)V

    .line 356
    invoke-virtual {p0}, Ll/ܽ֡ۘ;->֫()Landroid/view/animation/Interpolator;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ܽ֡ۘ;->֫(Landroid/view/animation/Interpolator;)V

    return-object v0
.end method

.method public final ֫(Ljava/lang/Object;)V
    .locals 2

    if-eqz p1, :cond_0

    .line 347
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Ljava/lang/Float;

    if-ne v0, v1, :cond_0

    .line 348
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iput p1, p0, Ll/ۧ֡ۘ;->ۙ:F

    const/4 p1, 0x1

    .line 349
    iput-boolean p1, p0, Ll/ܽ֡ۘ;->᩹:Z

    :cond_0
    return-void
.end method

.method public final ܽ()Ljava/lang/Float;
    .locals 1

    .line 343
    iget v0, p0, Ll/ۧ֡ۘ;->ۙ:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method
