.class public final Ll/ܳۙܿ;
.super Landroid/view/animation/Animation;
.source "L9CC"


# instance fields
.field public final synthetic ۙ:I

.field public final synthetic ᩶:F

.field public final synthetic ᩸:Ll/ۗۙܿ;

.field public final synthetic ᩹:F


# direct methods
.method public constructor <init>(Ll/ۗۙܿ;FFI)V
    .locals 0

    .line 832
    iput-object p1, p0, Ll/ܳۙܿ;->᩸:Ll/ۗۙܿ;

    iput p2, p0, Ll/ܳۙܿ;->᩹:F

    iput p3, p0, Ll/ܳۙܿ;->᩶:F

    iput p4, p0, Ll/ܳۙܿ;->ۙ:I

    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    return-void
.end method


# virtual methods
.method public final applyTransformation(FLandroid/view/animation/Transformation;)V
    .locals 2

    .line 835
    iget p2, p0, Ll/ܳۙܿ;->᩹:F

    iget v0, p0, Ll/ܳۙܿ;->᩶:F

    invoke-static {v0, p2, p1, p2}, Ll/᩶᩵ᩳ;->֫(FFFF)F

    move-result p1

    .line 838
    iget-object p2, p0, Ll/ܳۙܿ;->᩸:Ll/ۗۙܿ;

    invoke-static {p2}, Ll/ۗۙܿ;->ۘ(Ll/ۗۙܿ;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-static {p2}, Ll/ۗۙܿ;->֫(Ll/ۗۙܿ;)Landroid/view/ViewGroup;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    iget v1, p0, Ll/ܳۙܿ;->ۙ:I

    sub-int/2addr v0, v1

    int-to-float v0, v0

    :goto_0
    add-float/2addr p1, v0

    .line 840
    invoke-static {p2}, Ll/ۗۙܿ;->ۜ(Ll/ۗۙܿ;)Landroid/widget/ImageButton;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroid/view/View;->setX(F)V

    return-void
.end method
