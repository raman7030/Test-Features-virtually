.class public final Ll/᩸ۚᩳ;
.super Ll/᩶ۧ֫;
.source "75NJ"


# instance fields
.field public final synthetic ᩸:Ll/ܽ֨ᩳ;


# direct methods
.method public constructor <init>(Ll/ܽ֨ᩳ;)V
    .locals 0

    .line 174
    iput-object p1, p0, Ll/᩸ۚᩳ;->᩸:Ll/ܽ֨ᩳ;

    invoke-direct {p0}, Ll/᩶ۧ֫;-><init>()V

    return-void
.end method


# virtual methods
.method public final onDrawerClosed(Landroid/view/View;)V
    .locals 2

    .line 186
    iget-object p1, p0, Ll/᩸ۚᩳ;->᩸:Ll/ܽ֨ᩳ;

    invoke-static {p1}, Ll/ܽ֨ᩳ;->ۢ(Ll/ܽ֨ᩳ;)Ll/ܽۢۡ;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll/ܽۢۡ;->֫(Z)V

    .line 187
    invoke-static {p1}, Ll/ܽ֨ᩳ;->ۜ(Ll/ܽ֨ᩳ;)Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 188
    invoke-static {p1}, Ll/ܽ֨ᩳ;->ۜ(Ll/ܽ֨ᩳ;)Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    move-result-object p1

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public final onDrawerOpened(Landroid/view/View;)V
    .locals 2

    .line 178
    iget-object p1, p0, Ll/᩸ۚᩳ;->᩸:Ll/ܽ֨ᩳ;

    invoke-static {p1}, Ll/ܽ֨ᩳ;->᩷(Ll/ܽ֨ᩳ;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 179
    invoke-static {p1}, Ll/ܽ֨ᩳ;->ۜ(Ll/ܽ֨ᩳ;)Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setVisibility(I)V

    .line 180
    invoke-static {p1}, Ll/ܽ֨ᩳ;->ۜ(Ll/ܽ֨ᩳ;)Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    move-result-object p1

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    :cond_0
    return-void
.end method

.method public final onDrawerSlide(Landroid/view/View;F)V
    .locals 2

    .line 194
    iget-object p1, p0, Ll/᩸ۚᩳ;->᩸:Ll/ܽ֨ᩳ;

    invoke-static {p1}, Ll/ܽ֨ᩳ;->᩷(Ll/ܽ֨ᩳ;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    cmpl-float v0, p2, v0

    if-nez v0, :cond_0

    .line 196
    invoke-static {p1}, Ll/ܽ֨ᩳ;->ۜ(Ll/ܽ֨ᩳ;)Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/View;->getVisibility()I

    move-result p2

    if-nez p2, :cond_2

    .line 197
    invoke-static {p1}, Ll/ܽ֨ᩳ;->ۜ(Ll/ܽ֨ᩳ;)Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    move-result-object p1

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setVisibility(I)V

    return-void

    .line 200
    :cond_0
    invoke-static {p1}, Ll/ܽ֨ᩳ;->ۜ(Ll/ܽ֨ᩳ;)Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_1

    .line 201
    invoke-static {p1}, Ll/ܽ֨ᩳ;->ۜ(Ll/ܽ֨ᩳ;)Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setVisibility(I)V

    .line 203
    :cond_1
    invoke-static {p1}, Ll/ܽ֨ᩳ;->ۜ(Ll/ܽ֨ᩳ;)Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/view/View;->setAlpha(F)V

    :cond_2
    return-void
.end method

.method public final onDrawerStateChanged(I)V
    .locals 1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 211
    :cond_0
    iget-object p1, p0, Ll/᩸ۚᩳ;->᩸:Ll/ܽ֨ᩳ;

    invoke-static {p1}, Ll/ܽ֨ᩳ;->ܳ(Ll/ܽ֨ᩳ;)Ll/۬ۧ֫;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object p1

    instance-of v0, p1, Ll/۫ۨᩳ;

    if-eqz v0, :cond_1

    check-cast p1, Ll/۫ۨᩳ;

    .line 212
    invoke-virtual {p1}, Ll/۫ۨᩳ;->ۛ()V

    .line 213
    invoke-virtual {p1}, Ll/۫ۨᩳ;->۫()V

    :cond_1
    return-void
.end method
