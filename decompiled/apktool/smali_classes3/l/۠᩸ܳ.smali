.class public final synthetic Ll/۠᩸ܳ;
.super Ljava/lang/Object;
.source "Y4ZV"

# interfaces
.implements Ll/ܶۖ;


# instance fields
.field public final synthetic ᩸:Ll/ۙ᩸ܳ;


# direct methods
.method public synthetic constructor <init>(Ll/ۙ᩸ܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۠᩸ܳ;->᩸:Ll/ۙ᩸ܳ;

    return-void
.end method


# virtual methods
.method public final onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 1

    .line 72
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    const v0, 0x7f1202d1

    if-ne p1, v0, :cond_0

    .line 73
    iget-object p1, p0, Ll/۠᩸ܳ;->᩸:Ll/ۙ᩸ܳ;

    iget-object p1, p1, Ll/ۨ۠ܳ;->᩸:Lbin/mt/plus/Main;

    invoke-virtual {p1}, Lbin/mt/plus/Main;->ܳ֫()V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
