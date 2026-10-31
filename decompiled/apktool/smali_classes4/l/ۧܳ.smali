.class public final Ll/ۧܳ;
.super Ljava/lang/Object;
.source "422Y"

# interfaces
.implements Ll/ܿ᩷;


# instance fields
.field public final synthetic ᩸:Ll/ۚܳ;


# direct methods
.method public constructor <init>(Ll/ۚܳ;)V
    .locals 0

    .line 3081
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۧܳ;->᩸:Ll/ۚܳ;

    return-void
.end method


# virtual methods
.method public final onCloseMenu(Ll/ۗۜ;Z)V
    .locals 0

    .line 3095
    iget-object p2, p0, Ll/ۧܳ;->᩸:Ll/ۚܳ;

    invoke-virtual {p2, p1}, Ll/ۚܳ;->֫(Ll/ۗۜ;)V

    return-void
.end method

.method public final ֫(Ll/ۗۜ;)Z
    .locals 2

    .line 3086
    iget-object v0, p0, Ll/ۧܳ;->᩸:Ll/ۚܳ;

    .line 577
    iget-object v0, v0, Ll/ۚܳ;->ۖۧ:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    if-eqz v0, :cond_0

    const/16 v1, 0x6c

    .line 3088
    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    :cond_0
    const/4 p1, 0x1

    return p1
.end method
