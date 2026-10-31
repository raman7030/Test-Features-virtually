.class public final Ll/ۨܺۡ;
.super Ljava/lang/Object;
.source "K582"


# static fields
.field public static final ֫:Landroid/view/animation/Interpolator;


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    .line 31
    new-instance v7, Landroid/graphics/Path;

    invoke-direct {v7}, Landroid/graphics/Path;-><init>()V

    const/4 v0, 0x0

    .line 32
    invoke-virtual {v7, v0, v0}, Landroid/graphics/Path;->moveTo(FF)V

    const v1, 0x3e4ccccd    # 0.2f

    .line 33
    invoke-virtual {v7, v1, v0}, Landroid/graphics/Path;->lineTo(FF)V

    const v5, 0x3f177777

    const v6, 0x3ed58be5

    const v1, 0x3ecaaaab

    const/4 v2, 0x0

    const v3, 0x3ef31ee5

    const v4, 0x3e53c2c1

    move-object v0, v7

    .line 34
    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    const/high16 v5, 0x3f800000    # 1.0f

    const/high16 v6, 0x3f800000    # 1.0f

    const v1, 0x3f3714cb

    const v2, 0x3f23ae62

    const v3, 0x3f50f5c3

    const v4, 0x3f797c90

    .line 36
    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 41
    invoke-static {v7}, Ll/۠۟;->֫(Landroid/graphics/Path;)Landroid/view/animation/Interpolator;

    move-result-object v0

    sput-object v0, Ll/ۨܺۡ;->֫:Landroid/view/animation/Interpolator;

    return-void
.end method
