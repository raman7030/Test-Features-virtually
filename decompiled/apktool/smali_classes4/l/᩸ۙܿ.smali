.class public final Ll/᩸ۙܿ;
.super Ljava/lang/Object;
.source "L9CC"

# interfaces
.implements Landroid/view/animation/Interpolator;


# static fields
.field public static final ֫:F


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const/16 v0, 0x64

    int-to-double v0, v0

    const/high16 v2, -0x40800000    # -1.0f

    float-to-double v2, v2

    .line 1504
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    sub-double/2addr v2, v0

    double-to-float v0, v2

    const/high16 v1, 0x3f800000    # 1.0f

    div-float/2addr v1, v0

    .line 1501
    sput v1, Ll/᩸ۙܿ;->֫:F

    return-void
.end method


# virtual methods
.method public final getInterpolation(F)F
    .locals 5

    const/high16 v0, 0x3f800000    # 1.0f

    sub-float p1, v0, p1

    const/16 v1, 0x64

    int-to-double v1, v1

    neg-float p1, p1

    float-to-double v3, p1

    .line 1504
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v1

    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    sub-double/2addr v3, v1

    double-to-float p1, v3

    .line 1509
    sget v1, Ll/᩸ۙܿ;->֫:F

    mul-float p1, p1, v1

    sub-float/2addr v0, p1

    return v0
.end method
