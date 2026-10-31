.class public final Ll/᩶ܶ;
.super Landroid/view/ViewOutlineProvider;
.source "B1CI"


# instance fields
.field public final synthetic ֫:Ll/۬ܶ;


# direct methods
.method public constructor <init>(Ll/۬ܶ;)V
    .locals 0

    .line 488
    iput-object p1, p0, Ll/᩶ܶ;->֫:Ll/۬ܶ;

    invoke-direct {p0}, Landroid/view/ViewOutlineProvider;-><init>()V

    return-void
.end method


# virtual methods
.method public final getOutline(Landroid/view/View;Landroid/graphics/Outline;)V
    .locals 6

    .line 491
    iget-object p1, p0, Ll/᩶ܶ;->֫:Ll/۬ܶ;

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v3

    .line 492
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v4

    .line 493
    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v0

    int-to-float v0, v0

    invoke-static {p1}, Ll/۬ܶ;->֫(Ll/۬ܶ;)F

    move-result p1

    mul-float v0, v0, p1

    const/high16 p1, 0x40000000    # 2.0f

    div-float v5, v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p2

    .line 494
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Outline;->setRoundRect(IIIIF)V

    return-void
.end method
