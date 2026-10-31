.class public final Ll/ۗܰ;
.super Ll/۬ܰ;
.source "XAMH"


# instance fields
.field public final ֫:Landroid/view/WindowInsetsController;

.field public final ۧ:Ll/ۖۨ;

.field public ܽ:Landroid/view/Window;


# direct methods
.method public constructor <init>(Landroid/view/Window;Ll/ۖۨ;)V
    .locals 1

    .line 629
    invoke-virtual {p1}, Landroid/view/Window;->getInsetsController()Landroid/view/WindowInsetsController;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Ll/ۗܰ;-><init>(Landroid/view/WindowInsetsController;Ll/ۖۨ;)V

    .line 630
    iput-object p1, p0, Ll/ۗܰ;->ܽ:Landroid/view/Window;

    return-void
.end method

.method public constructor <init>(Landroid/view/WindowInsetsController;Ll/ۖۨ;)V
    .locals 1

    .line 388
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 619
    new-instance v0, Ll/ۗ᩵;

    invoke-direct {v0}, Ll/ۗ᩵;-><init>()V

    .line 636
    iput-object p1, p0, Ll/ۗܰ;->֫:Landroid/view/WindowInsetsController;

    .line 638
    iput-object p2, p0, Ll/ۗܰ;->ۧ:Ll/ۖۨ;

    return-void
.end method


# virtual methods
.method public final ֫(I)V
    .locals 1

    and-int/lit8 v0, p1, 0x8

    if-eqz v0, :cond_0

    .line 652
    iget-object v0, p0, Ll/ۗܰ;->ۧ:Ll/ۖۨ;

    invoke-virtual {v0}, Ll/ۖۨ;->֫()V

    .line 654
    :cond_0
    iget-object v0, p0, Ll/ۗܰ;->֫:Landroid/view/WindowInsetsController;

    and-int/lit8 p1, p1, -0x9

    invoke-interface {v0, p1}, Landroid/view/WindowInsetsController;->hide(I)V

    return-void
.end method

.method public final ֫(Z)V
    .locals 2

    .line 706
    iget-object v0, p0, Ll/ۗܰ;->ܽ:Landroid/view/Window;

    const/16 v1, 0x10

    if-eqz p1, :cond_1

    if-eqz v0, :cond_0

    .line 827
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    .line 829
    invoke-virtual {p1}, Landroid/view/View;->getSystemUiVisibility()I

    move-result v0

    or-int/2addr v0, v1

    .line 828
    invoke-virtual {p1, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 711
    :cond_0
    iget-object p1, p0, Ll/ۗܰ;->֫:Landroid/view/WindowInsetsController;

    invoke-interface {p1, v1, v1}, Landroid/view/WindowInsetsController;->setSystemBarsAppearance(II)V

    return-void

    :cond_1
    if-eqz v0, :cond_2

    .line 820
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    .line 822
    invoke-virtual {p1}, Landroid/view/View;->getSystemUiVisibility()I

    move-result v0

    and-int/lit8 v0, v0, -0x11

    .line 821
    invoke-virtual {p1, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 719
    :cond_2
    iget-object p1, p0, Ll/ۗܰ;->֫:Landroid/view/WindowInsetsController;

    const/4 v0, 0x0

    invoke-interface {p1, v0, v1}, Landroid/view/WindowInsetsController;->setSystemBarsAppearance(II)V

    return-void
.end method

.method public final ֫()Z
    .locals 2

    .line 665
    iget-object v0, p0, Ll/ۗܰ;->֫:Landroid/view/WindowInsetsController;

    const/4 v1, 0x0

    invoke-interface {v0, v1, v1}, Landroid/view/WindowInsetsController;->setSystemBarsAppearance(II)V

    .line 666
    iget-object v0, p0, Ll/ۗܰ;->֫:Landroid/view/WindowInsetsController;

    invoke-interface {v0}, Landroid/view/WindowInsetsController;->getSystemBarsAppearance()I

    move-result v0

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    return v1
.end method

.method public final ۧ(I)V
    .locals 1

    .line 772
    iget-object v0, p0, Ll/ۗܰ;->֫:Landroid/view/WindowInsetsController;

    invoke-interface {v0, p1}, Landroid/view/WindowInsetsController;->setSystemBarsBehavior(I)V

    return-void
.end method

.method public final ۧ(Z)V
    .locals 2

    .line 672
    iget-object v0, p0, Ll/ۗܰ;->ܽ:Landroid/view/Window;

    const/16 v1, 0x8

    if-eqz p1, :cond_1

    if-eqz v0, :cond_0

    .line 827
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    .line 829
    invoke-virtual {p1}, Landroid/view/View;->getSystemUiVisibility()I

    move-result v0

    or-int/lit16 v0, v0, 0x2000

    .line 828
    invoke-virtual {p1, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 677
    :cond_0
    iget-object p1, p0, Ll/ۗܰ;->֫:Landroid/view/WindowInsetsController;

    invoke-interface {p1, v1, v1}, Landroid/view/WindowInsetsController;->setSystemBarsAppearance(II)V

    return-void

    :cond_1
    if-eqz v0, :cond_2

    .line 820
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    .line 822
    invoke-virtual {p1}, Landroid/view/View;->getSystemUiVisibility()I

    move-result v0

    and-int/lit16 v0, v0, -0x2001

    .line 821
    invoke-virtual {p1, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 685
    :cond_2
    iget-object p1, p0, Ll/ۗܰ;->֫:Landroid/view/WindowInsetsController;

    const/4 v0, 0x0

    invoke-interface {p1, v0, v1}, Landroid/view/WindowInsetsController;->setSystemBarsAppearance(II)V

    return-void
.end method

.method public final ܽ(I)V
    .locals 1

    and-int/lit8 v0, p1, 0x8

    if-eqz v0, :cond_0

    .line 644
    iget-object v0, p0, Ll/ۗܰ;->ۧ:Ll/ۖۨ;

    invoke-virtual {v0}, Ll/ۖۨ;->ۧ()V

    .line 646
    :cond_0
    iget-object v0, p0, Ll/ۗܰ;->֫:Landroid/view/WindowInsetsController;

    and-int/lit8 p1, p1, -0x9

    invoke-interface {v0, p1}, Landroid/view/WindowInsetsController;->show(I)V

    return-void
.end method
