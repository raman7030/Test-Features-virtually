.class public Ll/ۡܰ;
.super Ll/ۖܰ;
.source "M4Z7"


# instance fields
.field public final ܽ:Landroid/view/WindowInsets$Builder;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1812
    invoke-direct {p0}, Ll/ۖܰ;-><init>()V

    .line 1813
    invoke-static {}, Ll/᩷ܰ;->֫()Landroid/view/WindowInsets$Builder;

    move-result-object v0

    iput-object v0, p0, Ll/ۡܰ;->ܽ:Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method public constructor <init>(Ll/᩸ܰ;)V
    .locals 0

    .line 1817
    invoke-direct {p0, p1}, Ll/ۖܰ;-><init>(Ll/᩸ܰ;)V

    .line 1818
    invoke-virtual {p1}, Ll/᩸ܰ;->ۘ()Landroid/view/WindowInsets;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 1820
    invoke-static {p1}, Ll/ۢܰ;->֫(Landroid/view/WindowInsets;)Landroid/view/WindowInsets$Builder;

    move-result-object p1

    goto :goto_0

    .line 1821
    :cond_0
    invoke-static {}, Ll/᩷ܰ;->֫()Landroid/view/WindowInsets$Builder;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Ll/ۡܰ;->ܽ:Landroid/view/WindowInsets$Builder;

    return-void
.end method


# virtual methods
.method public ֫(Ll/ۧ۬;)V
    .locals 1

    .line 1836
    iget-object v0, p0, Ll/ۡܰ;->ܽ:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, Ll/ۧ۬;->֫()Landroid/graphics/Insets;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/WindowInsets$Builder;->setMandatorySystemGestureInsets(Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method public ۧ()Ll/᩸ܰ;
    .locals 2

    .line 1857
    invoke-virtual {p0}, Ll/ۖܰ;->֫()V

    .line 1858
    iget-object v0, p0, Ll/ۡܰ;->ܽ:Landroid/view/WindowInsets$Builder;

    .line 1859
    invoke-virtual {v0}, Landroid/view/WindowInsets$Builder;->build()Landroid/view/WindowInsets;

    move-result-object v0

    const/4 v1, 0x0

    .line 148
    invoke-static {v1, v0}, Ll/᩸ܰ;->֫(Landroid/view/View;Landroid/view/WindowInsets;)Ll/᩸ܰ;

    move-result-object v0

    .line 1860
    iget-object v1, p0, Ll/ۖܰ;->ۧ:[Ll/ۧ۬;

    invoke-virtual {v0, v1}, Ll/᩸ܰ;->֫([Ll/ۧ۬;)V

    return-object v0
.end method

.method public ۧ(Ll/ۧ۬;)V
    .locals 1

    .line 1846
    iget-object v0, p0, Ll/ۡܰ;->ܽ:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, Ll/ۧ۬;->֫()Landroid/graphics/Insets;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/WindowInsets$Builder;->setStableInsets(Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method public ܽ(Ll/ۧ۬;)V
    .locals 1

    .line 1831
    iget-object v0, p0, Ll/ۡܰ;->ܽ:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, Ll/ۧ۬;->֫()Landroid/graphics/Insets;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/WindowInsets$Builder;->setSystemGestureInsets(Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method public ܿ(Ll/ۧ۬;)V
    .locals 1

    .line 1841
    iget-object v0, p0, Ll/ۡܰ;->ܽ:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, Ll/ۧ۬;->֫()Landroid/graphics/Insets;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/WindowInsets$Builder;->setTappableElementInsets(Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method public ᩳ(Ll/ۧ۬;)V
    .locals 1

    .line 1826
    iget-object v0, p0, Ll/ۡܰ;->ܽ:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, Ll/ۧ۬;->֫()Landroid/graphics/Insets;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/WindowInsets$Builder;->setSystemWindowInsets(Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method
