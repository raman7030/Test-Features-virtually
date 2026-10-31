.class public final Ll/᩵ۙܿ;
.super Landroid/view/animation/Animation;
.source "L9CC"


# instance fields
.field public final synthetic ۙ:I

.field public final synthetic ᩶:F

.field public final synthetic ᩸:Ll/ۗۙܿ;

.field public final synthetic ᩹:I


# direct methods
.method public constructor <init>(Ll/ۗۙܿ;IIF)V
    .locals 0

    .line 740
    iput-object p1, p0, Ll/᩵ۙܿ;->᩸:Ll/ۗۙܿ;

    iput p2, p0, Ll/᩵ۙܿ;->ۙ:I

    iput p3, p0, Ll/᩵ۙܿ;->᩹:I

    iput p4, p0, Ll/᩵ۙܿ;->᩶:F

    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    return-void
.end method


# virtual methods
.method public final applyTransformation(FLandroid/view/animation/Transformation;)V
    .locals 2

    .line 743
    iget p2, p0, Ll/᩵ۙܿ;->ۙ:I

    iget v0, p0, Ll/᩵ۙܿ;->᩹:I

    sub-int/2addr p2, v0

    int-to-float p2, p2

    mul-float p1, p1, p2

    float-to-int p1, p1

    .line 744
    iget-object p2, p0, Ll/᩵ۙܿ;->᩸:Ll/ۗۙܿ;

    invoke-static {p2}, Ll/ۗۙܿ;->֫(Ll/ۗۙܿ;)Landroid/view/ViewGroup;

    move-result-object v1

    add-int/2addr p1, v0

    invoke-static {v1, p1}, Ll/ۗۙܿ;->֫(Landroid/view/ViewGroup;I)V

    .line 745
    invoke-static {p2}, Ll/ۗۙܿ;->᩻(Ll/ۗۙܿ;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 746
    invoke-static {p2}, Ll/ۗۙܿ;->֫(Ll/ۗۙܿ;)Landroid/view/ViewGroup;

    move-result-object p1

    invoke-static {p2}, Ll/ۗۙܿ;->֫(Ll/ۗۙܿ;)Landroid/view/ViewGroup;

    move-result-object v1

    .line 747
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    sub-int/2addr v1, v0

    int-to-float v0, v1

    iget v1, p0, Ll/᩵ۙܿ;->᩶:F

    sub-float/2addr v1, v0

    .line 746
    invoke-virtual {p1, v1}, Landroid/view/View;->setY(F)V

    .line 748
    invoke-static {p2}, Ll/ۗۙܿ;->᩵(Ll/ۗۙܿ;)V

    :cond_0
    return-void
.end method
