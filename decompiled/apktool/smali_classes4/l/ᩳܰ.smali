.class public Ll/ᩳܰ;
.super Ljava/lang/Object;
.source "R9NW"


# instance fields
.field public final ֫:J

.field public ۧ:F

.field public final ܽ:Landroid/view/animation/Interpolator;

.field public final ᩳ:I


# direct methods
.method public constructor <init>(ILandroid/view/animation/Interpolator;J)V
    .locals 0

    .line 542
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 543
    iput p1, p0, Ll/ᩳܰ;->ᩳ:I

    .line 544
    iput-object p2, p0, Ll/ᩳܰ;->ܽ:Landroid/view/animation/Interpolator;

    .line 545
    iput-wide p3, p0, Ll/ᩳܰ;->֫:J

    return-void
.end method


# virtual methods
.method public ֫()J
    .locals 2

    .line 569
    iget-wide v0, p0, Ll/ᩳܰ;->֫:J

    return-wide v0
.end method

.method public ֫(F)V
    .locals 0

    .line 577
    iput p1, p0, Ll/ᩳܰ;->ۧ:F

    return-void
.end method

.method public ۧ()F
    .locals 2

    .line 557
    iget-object v0, p0, Ll/ᩳܰ;->ܽ:Landroid/view/animation/Interpolator;

    if-eqz v0, :cond_0

    .line 558
    iget v1, p0, Ll/ᩳܰ;->ۧ:F

    invoke-interface {v0, v1}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    move-result v0

    return v0

    .line 560
    :cond_0
    iget v0, p0, Ll/ᩳܰ;->ۧ:F

    return v0
.end method

.method public ܽ()I
    .locals 1

    .line 549
    iget v0, p0, Ll/ᩳܰ;->ᩳ:I

    return v0
.end method
