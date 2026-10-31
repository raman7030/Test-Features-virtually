.class public final Ll/ۛܺۡ;
.super Ljava/lang/Object;
.source "K582"


# static fields
.field public static final ֫:Landroid/view/animation/Interpolator;


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    .line 56
    new-instance v7, Landroid/graphics/Path;

    invoke-direct {v7}, Landroid/graphics/Path;-><init>()V

    const/4 v0, 0x0

    .line 57
    invoke-virtual {v7, v0, v0}, Landroid/graphics/Path;->moveTo(FF)V

    const v1, 0x3ebba5e3    # 0.3665f

    .line 58
    invoke-virtual {v7, v1, v0}, Landroid/graphics/Path;->lineTo(FF)V

    const v5, 0x3f2ee979

    const/high16 v6, 0x3f000000    # 0.5f

    const v1, 0x3ef1eef4

    const v2, 0x3d7fa189

    const v3, 0x3f1d8be9

    const/high16 v4, 0x3f000000    # 0.5f

    move-object v0, v7

    .line 59
    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    const/high16 v5, 0x3f800000    # 1.0f

    const/high16 v6, 0x3f800000    # 1.0f

    const v1, 0x3f413756

    const/high16 v2, 0x3f000000    # 0.5f

    const v3, 0x3f41dbae

    const v4, 0x3f5083bc

    .line 61
    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 66
    invoke-static {v7}, Ll/۠۟;->֫(Landroid/graphics/Path;)Landroid/view/animation/Interpolator;

    move-result-object v0

    sput-object v0, Ll/ۛܺۡ;->֫:Landroid/view/animation/Interpolator;

    return-void
.end method
