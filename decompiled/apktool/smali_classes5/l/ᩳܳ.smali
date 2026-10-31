.class public final Ll/ᩳܳ;
.super Ljava/lang/Object;
.source "422Y"

# interfaces
.implements Ll/ۙ᩻;


# instance fields
.field public ֫:Ll/ۛ᩻;

.field public final synthetic ۧ:Ll/ۚܳ;


# direct methods
.method public constructor <init>(Ll/ۚܳ;Ll/ۛ᩻;)V
    .locals 0

    .line 2989
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩳܳ;->ۧ:Ll/ۚܳ;

    .line 2990
    iput-object p2, p0, Ll/ᩳܳ;->֫:Ll/ۛ᩻;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۗ᩻;)V
    .locals 2

    .line 3011
    iget-object v0, p0, Ll/ᩳܳ;->֫:Ll/ۛ᩻;

    invoke-virtual {v0, p1}, Ll/ۛ᩻;->֫(Ll/ۗ᩻;)V

    .line 3012
    iget-object p1, p0, Ll/ᩳܳ;->ۧ:Ll/ۚܳ;

    iget-object v0, p1, Ll/ۚܳ;->֫֫:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_0

    .line 3013
    iget-object v0, p1, Ll/ۚܳ;->ۖۧ:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    iget-object v1, p1, Ll/ۚܳ;->ᩳۧ:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 3016
    :cond_0
    iget-object v0, p1, Ll/ۚܳ;->ۧ֫:Ll/᩹᩷;

    if-eqz v0, :cond_2

    .line 1452
    iget-object v0, p1, Ll/ۚܳ;->۠֫:Ll/ܶ᩺;

    if-eqz v0, :cond_1

    .line 1453
    invoke-virtual {v0}, Ll/ܶ᩺;->֫()V

    .line 3018
    :cond_1
    iget-object v0, p1, Ll/ۚܳ;->ۧ֫:Ll/᩹᩷;

    invoke-static {v0}, Ll/ܿ᩺;->֫(Landroid/view/View;)Ll/ܶ᩺;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll/ܶ᩺;->֫(F)V

    iput-object v0, p1, Ll/ۚܳ;->۠֫:Ll/ܶ᩺;

    .line 3019
    new-instance v1, Ll/ܽܳ;

    invoke-direct {v1, p0}, Ll/ܽܳ;-><init>(Ll/ᩳܳ;)V

    invoke-virtual {v0, v1}, Ll/ܶ᩺;->֫(Ll/᩸᩺;)V

    .line 3035
    :cond_2
    iget-object v0, p1, Ll/ۚܳ;->ܿ֫:Ljava/lang/Object;

    if-eqz v0, :cond_3

    .line 3036
    iget-object v1, p1, Ll/ۚܳ;->۟:Ll/ۗ᩻;

    invoke-interface {v0, v1}, Ll/۠ܿ;->onSupportActionModeFinished(Ll/ۗ᩻;)V

    :cond_3
    const/4 v0, 0x0

    .line 3038
    iput-object v0, p1, Ll/ۚܳ;->۟:Ll/ۗ᩻;

    .line 3039
    iget-object v0, p1, Ll/ۚܳ;->ܳۧ:Landroid/view/ViewGroup;

    invoke-static {v0}, Ll/ܿ᩺;->᩵(Landroid/view/View;)V

    .line 3042
    invoke-virtual {p1}, Ll/ۚܳ;->ۙ()V

    return-void
.end method

.method public final ֫(Ll/ۗ᩻;Landroid/view/Menu;)Z
    .locals 1

    .line 3000
    iget-object v0, p0, Ll/ᩳܳ;->ۧ:Ll/ۚܳ;

    iget-object v0, v0, Ll/ۚܳ;->ܳۧ:Landroid/view/ViewGroup;

    invoke-static {v0}, Ll/ܿ᩺;->᩵(Landroid/view/View;)V

    .line 3001
    iget-object v0, p0, Ll/ᩳܳ;->֫:Ll/ۛ᩻;

    invoke-virtual {v0, p1, p2}, Ll/ۛ᩻;->֫(Ll/ۗ᩻;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public final ֫(Ll/ۗ᩻;Landroid/view/MenuItem;)Z
    .locals 1

    .line 3006
    iget-object v0, p0, Ll/ᩳܳ;->֫:Ll/ۛ᩻;

    invoke-virtual {v0, p1, p2}, Ll/ۛ᩻;->֫(Ll/ۗ᩻;Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public final ۧ(Ll/ۗ᩻;Landroid/view/Menu;)Z
    .locals 1

    .line 2995
    iget-object v0, p0, Ll/ᩳܳ;->֫:Ll/ۛ᩻;

    invoke-virtual {v0, p1, p2}, Ll/ۛ᩻;->ۧ(Ll/ۗ᩻;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method
