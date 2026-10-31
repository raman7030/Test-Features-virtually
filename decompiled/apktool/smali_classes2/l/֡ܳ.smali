.class public final Ll/֡ܳ;
.super Ljava/lang/Object;
.source "422Y"

# interfaces
.implements Ll/ܿ᩷;


# instance fields
.field public final synthetic ᩸:Ll/ۚܳ;


# direct methods
.method public constructor <init>(Ll/ۚܳ;)V
    .locals 0

    .line 3047
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֡ܳ;->᩸:Ll/ۚܳ;

    return-void
.end method


# virtual methods
.method public final onCloseMenu(Ll/ۗۜ;Z)V
    .locals 4

    .line 3052
    invoke-virtual {p1}, Ll/ۗۜ;->getRootMenu()Ll/ۗۜ;

    move-result-object v0

    const/4 v1, 0x1

    if-eq v0, p1, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_1

    move-object p1, v0

    .line 3054
    :cond_1
    iget-object v3, p0, Ll/֡ܳ;->᩸:Ll/ۚܳ;

    invoke-virtual {v3, p1}, Ll/ۚܳ;->ۧ(Ll/ۗۜ;)Ll/᩵ܳ;

    move-result-object p1

    if-eqz p1, :cond_3

    if-eqz v2, :cond_2

    .line 3057
    iget p2, p1, Ll/᩵ܳ;->ᩳ:I

    invoke-virtual {v3, p2, p1, v0}, Ll/ۚܳ;->֫(ILl/᩵ܳ;Ll/ۗۜ;)V

    .line 3058
    invoke-virtual {v3, p1, v1}, Ll/ۚܳ;->֫(Ll/᩵ܳ;Z)V

    return-void

    .line 3062
    :cond_2
    invoke-virtual {v3, p1, p2}, Ll/ۚܳ;->֫(Ll/᩵ܳ;Z)V

    :cond_3
    return-void
.end method

.method public final ֫(Ll/ۗۜ;)Z
    .locals 2

    .line 3070
    invoke-virtual {p1}, Ll/ۗۜ;->getRootMenu()Ll/ۗۜ;

    move-result-object v0

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Ll/֡ܳ;->᩸:Ll/ۚܳ;

    iget-boolean v1, v0, Ll/ۚܳ;->᩶֫:Z

    if-eqz v1, :cond_0

    .line 577
    iget-object v1, v0, Ll/ۚܳ;->ۖۧ:Landroid/view/Window;

    invoke-virtual {v1}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 3072
    iget-boolean v0, v0, Ll/ۚܳ;->᩵֫:Z

    if-nez v0, :cond_0

    const/16 v0, 0x6c

    .line 3073
    invoke-interface {v1, v0, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    :cond_0
    const/4 p1, 0x1

    return p1
.end method
