.class public final Ll/ۖۙ۠;
.super Ljava/lang/Object;
.source "T5PO"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final ۗ:F

.field public final ۙ:F

.field public final synthetic ۬:Ll/ᩴۙ۠;

.field public final ᩶:J

.field public final ᩸:F

.field public final ᩹:F


# direct methods
.method public constructor <init>(Ll/ᩴۙ۠;FFFF)V
    .locals 0

    .line 1058
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۖۙ۠;->۬:Ll/ᩴۙ۠;

    .line 1059
    iput p4, p0, Ll/ۖۙ۠;->᩸:F

    .line 1060
    iput p5, p0, Ll/ۖۙ۠;->᩹:F

    .line 1061
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p4

    iput-wide p4, p0, Ll/ۖۙ۠;->᩶:J

    .line 1062
    iput p2, p0, Ll/ۖۙ۠;->ۗ:F

    .line 1063
    iput p3, p0, Ll/ۖۙ۠;->ۙ:F

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1068
    iget-object v0, p0, Ll/ۖۙ۠;->۬:Ll/ᩴۙ۠;

    invoke-virtual {v0}, Ll/ᩴۙ۠;->ᩳ()Landroid/widget/ImageView;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 1086
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Ll/ۖۙ۠;->᩶:J

    sub-long/2addr v2, v4

    long-to-float v2, v2

    const/high16 v3, 0x3f800000    # 1.0f

    mul-float v2, v2, v3

    const/16 v4, 0x12c

    int-to-float v4, v4

    div-float/2addr v2, v4

    .line 1087
    invoke-static {v3, v2}, Ljava/lang/Math;->min(FF)F

    move-result v2

    .line 1088
    sget-object v4, Ll/ᩴۙ۠;->ۡ֫:Landroid/view/animation/AccelerateDecelerateInterpolator;

    invoke-virtual {v4, v2}, Landroid/view/animation/AccelerateDecelerateInterpolator;->getInterpolation(F)F

    move-result v2

    .line 1074
    iget v4, p0, Ll/ۖۙ۠;->ۗ:F

    iget v5, p0, Ll/ۖۙ۠;->ۙ:F

    invoke-static {v5, v4, v2, v4}, Ll/᩶᩵ᩳ;->֫(FFFF)F

    move-result v4

    .line 1075
    invoke-virtual {v0}, Ll/ᩴۙ۠;->᩻()F

    move-result v5

    div-float/2addr v4, v5

    .line 1077
    iget v5, p0, Ll/ۖۙ۠;->᩸:F

    iget v6, p0, Ll/ۖۙ۠;->᩹:F

    invoke-virtual {v0, v4, v5, v6}, Ll/ᩴۙ۠;->֫(FFF)V

    cmpg-float v0, v2, v3

    if-gez v0, :cond_1

    .line 38
    invoke-virtual {v1, p0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    :cond_1
    :goto_0
    return-void
.end method
