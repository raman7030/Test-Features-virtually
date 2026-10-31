.class public final Ll/ᩴۙܿ;
.super Landroid/view/animation/Animation;
.source "L9CC"


# instance fields
.field public final synthetic ۗ:I

.field public final synthetic ۙ:I

.field public final synthetic ᩶:F

.field public final synthetic ᩸:Ll/ۗۙܿ;

.field public final synthetic ᩹:F


# direct methods
.method public constructor <init>(Ll/ۗۙܿ;IIFF)V
    .locals 0

    .line 719
    iput-object p1, p0, Ll/ᩴۙܿ;->᩸:Ll/ۗۙܿ;

    iput p2, p0, Ll/ᩴۙܿ;->ۗ:I

    iput p3, p0, Ll/ᩴۙܿ;->ۙ:I

    iput p4, p0, Ll/ᩴۙܿ;->᩹:F

    iput p5, p0, Ll/ᩴۙܿ;->᩶:F

    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    return-void
.end method


# virtual methods
.method public final applyTransformation(FLandroid/view/animation/Transformation;)V
    .locals 4

    .line 722
    iget p2, p0, Ll/ᩴۙܿ;->ۗ:I

    iget v0, p0, Ll/ᩴۙܿ;->ۙ:I

    sub-int v1, p2, v0

    int-to-float v1, v1

    mul-float p1, p1, v1

    float-to-int p1, p1

    .line 723
    iget-object v1, p0, Ll/ᩴۙܿ;->᩸:Ll/ۗۙܿ;

    invoke-static {v1}, Ll/ۗۙܿ;->֫(Ll/ۗۙܿ;)Landroid/view/ViewGroup;

    move-result-object v2

    add-int/2addr p1, v0

    invoke-static {v2, p1}, Ll/ۗۙܿ;->ۧ(Landroid/view/ViewGroup;I)V

    .line 724
    invoke-static {v1}, Ll/ۗۙܿ;->ۘ(Ll/ۗۙܿ;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 725
    invoke-static {v1}, Ll/ۗۙܿ;->֫(Ll/ۗۙܿ;)Landroid/view/ViewGroup;

    move-result-object p1

    iget p2, p0, Ll/ᩴۙܿ;->᩹:F

    invoke-virtual {p1, p2}, Landroid/view/View;->setX(F)V

    .line 728
    invoke-static {v1}, Ll/ۗۙܿ;->ܽ(Ll/ۗۙܿ;)Landroid/view/ViewGroup;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/view/View;->setX(F)V

    .line 729
    invoke-static {v1}, Ll/ۗۙܿ;->ۢ(Ll/ۗۙܿ;)Ll/᩶ۙܿ;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/view/View;->setX(F)V

    return-void

    .line 731
    :cond_0
    invoke-static {v1}, Ll/ۗۙܿ;->֫(Ll/ۗۙܿ;)Landroid/view/ViewGroup;

    move-result-object p1

    invoke-static {v1}, Ll/ۗۙܿ;->֫(Ll/ۗۙܿ;)Landroid/view/ViewGroup;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    iget v3, p0, Ll/ᩴۙܿ;->᩶:F

    sub-float/2addr v3, v2

    invoke-virtual {p1, v3}, Landroid/view/View;->setX(F)V

    .line 735
    invoke-static {v1}, Ll/ۗۙܿ;->ܽ(Ll/ۗۙܿ;)Landroid/view/ViewGroup;

    move-result-object p1

    invoke-static {v1}, Ll/ۗۙܿ;->֫(Ll/ۗۙܿ;)Landroid/view/ViewGroup;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v2

    sub-int/2addr v2, v0

    int-to-float v0, v2

    invoke-virtual {p1, v0}, Landroid/view/View;->setX(F)V

    .line 736
    invoke-static {v1}, Ll/ۗۙܿ;->ۢ(Ll/ۗۙܿ;)Ll/᩶ۙܿ;

    move-result-object p1

    invoke-static {v1}, Ll/ۗۙܿ;->֫(Ll/ۗۙܿ;)Landroid/view/ViewGroup;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    sub-int/2addr v0, p2

    int-to-float p2, v0

    invoke-virtual {p1, p2}, Landroid/view/View;->setX(F)V

    return-void
.end method
