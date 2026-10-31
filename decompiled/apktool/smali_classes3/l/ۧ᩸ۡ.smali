.class public final Ll/ۧ᩸ۡ;
.super Ljava/lang/Object;
.source "C57W"


# static fields
.field public static ֫:F

.field public static ۧ:Z

.field public static final ܽ:Landroid/graphics/Point;

.field public static final ܿ:Landroid/graphics/Point;

.field public static ᩳ:F


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 14
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    sput-object v0, Ll/ۧ᩸ۡ;->ܿ:Landroid/graphics/Point;

    .line 15
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    sput-object v0, Ll/ۧ᩸ۡ;->ܽ:Landroid/graphics/Point;

    const/4 v0, 0x0

    .line 16
    sput-boolean v0, Ll/ۧ᩸ۡ;->ۧ:Z

    .line 23
    invoke-static {}, Ll/ۙ᩸᩷;->᩵()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 24
    iget v1, v0, Landroid/util/DisplayMetrics;->density:F

    sput v1, Ll/ۧ᩸ۡ;->ᩳ:F

    .line 25
    iget v0, v0, Landroid/util/DisplayMetrics;->scaledDensity:F

    sput v0, Ll/ۧ᩸ۡ;->֫:F

    return-void
.end method

.method public static ֫(F)I
    .locals 1

    .line 43
    sget v0, Ll/ۧ᩸ۡ;->ᩳ:F

    mul-float p0, p0, v0

    const/high16 v0, 0x3f000000    # 0.5f

    add-float/2addr p0, v0

    float-to-int p0, p0

    return p0
.end method

.method public static ۧ(F)I
    .locals 1

    .line 47
    sget v0, Ll/ۧ᩸ۡ;->֫:F

    div-float/2addr p0, v0

    const/high16 v0, 0x3f000000    # 0.5f

    add-float/2addr p0, v0

    float-to-int p0, p0

    return p0
.end method

.method public static ܽ(F)I
    .locals 1

    .line 51
    sget v0, Ll/ۧ᩸ۡ;->֫:F

    mul-float p0, p0, v0

    const/high16 v0, 0x3f000000    # 0.5f

    add-float/2addr p0, v0

    float-to-int p0, p0

    return p0
.end method
