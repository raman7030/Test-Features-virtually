.class public final Ll/֨۬ۧ;
.super Ljava/lang/Object;
.source "Y6A7"


# instance fields
.field public ֫:Z

.field public ۧ:I

.field public ܳ:I

.field public ܽ:I

.field public ܿ:Landroid/view/animation/Interpolator;

.field public ᩳ:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 13034
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 12999
    iput v0, p0, Ll/֨۬ۧ;->ܳ:I

    const/4 v0, 0x0

    .line 13003
    iput-boolean v0, p0, Ll/֨۬ۧ;->֫:Z

    .line 13035
    iput v0, p0, Ll/֨۬ۧ;->ܽ:I

    .line 13036
    iput v0, p0, Ll/֨۬ۧ;->ᩳ:I

    const/high16 v0, -0x80000000

    .line 13037
    iput v0, p0, Ll/֨۬ۧ;->ۧ:I

    const/4 v0, 0x0

    .line 13038
    iput-object v0, p0, Ll/֨۬ۧ;->ܿ:Landroid/view/animation/Interpolator;

    return-void
.end method


# virtual methods
.method public final ֫(I)V
    .locals 0

    .line 13057
    iput p1, p0, Ll/֨۬ۧ;->ܳ:I

    return-void
.end method

.method public final ֫(IILandroid/view/animation/Interpolator;I)V
    .locals 0

    .line 13154
    iput p1, p0, Ll/֨۬ۧ;->ܽ:I

    .line 13155
    iput p2, p0, Ll/֨۬ۧ;->ᩳ:I

    .line 13156
    iput p4, p0, Ll/֨۬ۧ;->ۧ:I

    .line 13157
    iput-object p3, p0, Ll/֨۬ۧ;->ܿ:Landroid/view/animation/Interpolator;

    const/4 p1, 0x1

    .line 13158
    iput-boolean p1, p0, Ll/֨۬ۧ;->֫:Z

    return-void
.end method

.method public final ֫(Ll/۬۬ۧ;)V
    .locals 5

    .line 13065
    iget v0, p0, Ll/֨۬ۧ;->ܳ:I

    const/4 v1, 0x0

    if-ltz v0, :cond_0

    const/4 v2, -0x1

    .line 13067
    iput v2, p0, Ll/֨۬ۧ;->ܳ:I

    .line 13068
    invoke-virtual {p1, v0}, Ll/۬۬ۧ;->jumpToPositionForSmoothScroller(I)V

    .line 13069
    iput-boolean v1, p0, Ll/֨۬ۧ;->֫:Z

    return-void

    .line 13072
    :cond_0
    iget-boolean v0, p0, Ll/֨۬ۧ;->֫:Z

    if-eqz v0, :cond_4

    .line 13089
    iget-object v0, p0, Ll/֨۬ۧ;->ܿ:Landroid/view/animation/Interpolator;

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    iget v3, p0, Ll/֨۬ۧ;->ۧ:I

    if-lt v3, v2, :cond_1

    goto :goto_0

    .line 13090
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "If you provide an interpolator, you must set a positive duration"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 13092
    :cond_2
    :goto_0
    iget v3, p0, Ll/֨۬ۧ;->ۧ:I

    if-lt v3, v2, :cond_3

    .line 13074
    iget-object p1, p1, Ll/۬۬ۧ;->mViewFlinger:Ll/ۙ۬ۧ;

    iget v2, p0, Ll/֨۬ۧ;->ܽ:I

    iget v4, p0, Ll/֨۬ۧ;->ᩳ:I

    invoke-virtual {p1, v2, v4, v0, v3}, Ll/ۙ۬ۧ;->֫(IILandroid/view/animation/Interpolator;I)V

    .line 13082
    iput-boolean v1, p0, Ll/֨۬ۧ;->֫:Z

    return-void

    .line 13093
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Scroll duration must be a positive number"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    return-void
.end method

.method public final ֫()Z
    .locals 1

    .line 13061
    iget v0, p0, Ll/֨۬ۧ;->ܳ:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
