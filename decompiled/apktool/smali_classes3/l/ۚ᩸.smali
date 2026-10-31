.class public Ll/ۚ᩸;
.super Ll/۟ܶ;
.source "J1JQ"


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 44
    invoke-direct {p0, p1, p2}, Ll/۟ܶ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 48
    invoke-direct {p0, p1, p2, p3}, Ll/۟ܶ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public final onAttachedToWindow()V
    .locals 0

    .line 62
    invoke-super {p0}, Ll/۟ܶ;->onAttachedToWindow()V

    .line 63
    invoke-virtual {p0}, Ll/۟ܶ;->֫()V

    return-void
.end method

.method public final setElevation(F)V
    .locals 0

    .line 74
    invoke-super {p0, p1}, Landroid/view/View;->setElevation(F)V

    .line 75
    invoke-virtual {p0}, Ll/۟ܶ;->֫()V

    return-void
.end method

.method public final setVisibility(I)V
    .locals 0

    .line 68
    invoke-super {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 69
    invoke-virtual {p0}, Ll/۟ܶ;->֫()V

    return-void
.end method

.method public final ۧ()V
    .locals 3

    .line 84
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Ll/ܽ᩸;

    .line 85
    iget-object v1, v0, Ll/ܽ᩸;->ۛ֫:Ll/ܶ۠;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ll/ܶ۠;->᩵(I)V

    .line 86
    iget-object v0, v0, Ll/ܽ᩸;->ۛ֫:Ll/ܶ۠;

    invoke-virtual {v0, v2}, Ll/ܶ۠;->ۜ(I)V

    return-void
.end method
