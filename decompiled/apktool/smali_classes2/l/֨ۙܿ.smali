.class public final Ll/֨ۙܿ;
.super Landroid/view/animation/Animation;
.source "L9CC"


# instance fields
.field public final synthetic ۙ:I

.field public final synthetic ᩶:I

.field public final synthetic ᩸:Ll/ۗۙܿ;

.field public final synthetic ᩹:F


# direct methods
.method public constructor <init>(Ll/ۗۙܿ;IIF)V
    .locals 0

    .line 817
    iput-object p1, p0, Ll/֨ۙܿ;->᩸:Ll/ۗۙܿ;

    iput p2, p0, Ll/֨ۙܿ;->ۙ:I

    iput p3, p0, Ll/֨ۙܿ;->᩶:I

    iput p4, p0, Ll/֨ۙܿ;->᩹:F

    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    return-void
.end method


# virtual methods
.method public final applyTransformation(FLandroid/view/animation/Transformation;)V
    .locals 2

    .line 820
    iget p2, p0, Ll/֨ۙܿ;->ۙ:I

    iget v0, p0, Ll/֨ۙܿ;->᩶:I

    sub-int/2addr p2, v0

    int-to-float p2, p2

    mul-float p1, p1, p2

    float-to-int p1, p1

    .line 821
    iget-object p2, p0, Ll/֨ۙܿ;->᩸:Ll/ۗۙܿ;

    invoke-static {p2}, Ll/ۗۙܿ;->֫(Ll/ۗۙܿ;)Landroid/view/ViewGroup;

    move-result-object v1

    add-int/2addr v0, p1

    invoke-static {v1, v0}, Ll/ۗۙܿ;->֫(Landroid/view/ViewGroup;I)V

    .line 822
    invoke-static {p2}, Ll/ۗۙܿ;->᩻(Ll/ۗۙܿ;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 823
    invoke-static {p2}, Ll/ۗۙܿ;->֫(Ll/ۗۙܿ;)Landroid/view/ViewGroup;

    move-result-object p1

    invoke-static {p2}, Ll/ۗۙܿ;->֫(Ll/ۗۙܿ;)Landroid/view/ViewGroup;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, Ll/֨ۙܿ;->᩹:F

    sub-float/2addr v1, v0

    invoke-virtual {p1, v1}, Landroid/view/View;->setY(F)V

    .line 824
    invoke-static {p2}, Ll/ۗۙܿ;->᩵(Ll/ۗۙܿ;)V

    :cond_0
    return-void
.end method
