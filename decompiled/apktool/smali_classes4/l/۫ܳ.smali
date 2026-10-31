.class public final Ll/۫ܳ;
.super Ljava/lang/Object;
.source "A5FO"

# interfaces
.implements Ll/ܿ᩷;


# instance fields
.field public ᩸:Z

.field public final synthetic ᩹:Ll/ۨܳ;


# direct methods
.method public constructor <init>(Ll/ۨܳ;)V
    .locals 0

    .line 556
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۫ܳ;->᩹:Ll/ۨܳ;

    return-void
.end method


# virtual methods
.method public final onCloseMenu(Ll/ۗۜ;Z)V
    .locals 1

    .line 567
    iget-boolean p2, p0, Ll/۫ܳ;->᩸:Z

    if-eqz p2, :cond_0

    return-void

    :cond_0
    const/4 p2, 0x1

    .line 571
    iput-boolean p2, p0, Ll/۫ܳ;->᩸:Z

    .line 572
    iget-object p2, p0, Ll/۫ܳ;->᩹:Ll/ۨܳ;

    iget-object v0, p2, Ll/ۨܳ;->֫:Ll/ۖᩴ;

    invoke-virtual {v0}, Ll/ۖᩴ;->ۜ()V

    .line 573
    iget-object p2, p2, Ll/ۨܳ;->ۜ:Landroid/view/Window$Callback;

    const/16 v0, 0x6c

    invoke-interface {p2, v0, p1}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    const/4 p1, 0x0

    .line 574
    iput-boolean p1, p0, Ll/۫ܳ;->᩸:Z

    return-void
.end method

.method public final ֫(Ll/ۗۜ;)Z
    .locals 2

    .line 561
    iget-object v0, p0, Ll/۫ܳ;->᩹:Ll/ۨܳ;

    iget-object v0, v0, Ll/ۨܳ;->ۜ:Landroid/view/Window$Callback;

    const/16 v1, 0x6c

    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    const/4 p1, 0x1

    return p1
.end method
