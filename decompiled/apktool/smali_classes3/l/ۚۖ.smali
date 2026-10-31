.class public final Ll/ۚۖ;
.super Ljava/lang/Object;
.source "95GJ"

# interfaces
.implements Ll/᩶ۜ;


# instance fields
.field public final synthetic ᩸:Ll/᩸ۖ;


# direct methods
.method public constructor <init>(Ll/᩸ۖ;)V
    .locals 0

    .line 109
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۚۖ;->᩸:Ll/᩸ۖ;

    return-void
.end method


# virtual methods
.method public final onMenuItemSelected(Ll/ۗۜ;Landroid/view/MenuItem;)Z
    .locals 0

    .line 112
    iget-object p1, p0, Ll/ۚۖ;->᩸:Ll/᩸ۖ;

    iget-object p1, p1, Ll/᩸ۖ;->ܽ:Ll/ܶۖ;

    if-eqz p1, :cond_0

    .line 113
    invoke-interface {p1, p2}, Ll/ܶۖ;->onMenuItemClick(Landroid/view/MenuItem;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final onMenuModeChange(Ll/ۗۜ;)V
    .locals 0

    return-void
.end method
