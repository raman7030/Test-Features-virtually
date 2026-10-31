.class public final Ll/ܰܺۡ;
.super Ljava/lang/Object;
.source "K582"


# static fields
.field public static final ֫:Landroid/view/animation/Interpolator;


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    .line 82
    new-instance v7, Landroid/graphics/Path;

    invoke-direct {v7}, Landroid/graphics/Path;-><init>()V

    const/4 v0, 0x0

    .line 83
    invoke-virtual {v7, v0, v0}, Landroid/graphics/Path;->moveTo(FF)V

    const/high16 v5, 0x3e800000    # 0.25f

    const v6, 0x3e5fcc7e

    const v1, 0x3d19999a    # 0.0375f

    const/4 v2, 0x0

    const v3, 0x3e03dadf

    const v4, 0x3db75fc0

    move-object v0, v7

    .line 84
    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    const v5, 0x3ef77777

    const v6, 0x3efaca7f

    const v1, 0x3ea512f7

    const v2, 0x3e975a46

    const v3, 0x3edf92c6

    const v4, 0x3ed5ce8b

    .line 86
    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    const/high16 v5, 0x3f800000    # 1.0f

    const/high16 v6, 0x3f800000    # 1.0f

    const v1, 0x3f30a3d7    # 0.69f

    const v2, 0x3f4f4a01    # 0.80972296f

    const v3, 0x3f4b17e5

    const v4, 0x3f733442

    .line 88
    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 93
    invoke-static {v7}, Ll/۠۟;->֫(Landroid/graphics/Path;)Landroid/view/animation/Interpolator;

    move-result-object v0

    sput-object v0, Ll/ܰܺۡ;->֫:Landroid/view/animation/Interpolator;

    return-void
.end method
