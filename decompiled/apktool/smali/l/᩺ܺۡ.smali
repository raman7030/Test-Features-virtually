.class public final Ll/᩺ܺۡ;
.super Ljava/lang/Object;
.source "K582"


# static fields
.field public static final ֫:Landroid/view/animation/Interpolator;


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    .line 110
    new-instance v7, Landroid/graphics/Path;

    invoke-direct {v7}, Landroid/graphics/Path;-><init>()V

    const/4 v0, 0x0

    .line 111
    invoke-virtual {v7, v0, v0}, Landroid/graphics/Path;->moveTo(FF)V

    const v5, 0x3eaaaaab

    const v6, 0x3eb2d26b

    const v1, 0x3d8bf745

    const v2, 0x3ca33b27

    const v3, 0x3e44d0f2

    const v4, 0x3e225c0e

    move-object v0, v7

    .line 112
    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    const v5, 0x3f2aaaab

    const v6, 0x3f2ecbf5

    const v1, 0x3ec4a953

    const v2, 0x3ed45dee

    const v3, 0x3f0ca946

    const v4, 0x3f2e6da1

    .line 114
    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    const/high16 v5, 0x3f800000    # 1.0f

    const/high16 v6, 0x3f800000    # 1.0f

    const v1, 0x3f40a97e

    const v2, 0x3f2e8a32

    const v3, 0x3f3cbcad

    const v4, 0x3f60ff57

    .line 116
    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 121
    invoke-static {v7}, Ll/۠۟;->֫(Landroid/graphics/Path;)Landroid/view/animation/Interpolator;

    move-result-object v0

    sput-object v0, Ll/᩺ܺۡ;->֫:Landroid/view/animation/Interpolator;

    return-void
.end method
