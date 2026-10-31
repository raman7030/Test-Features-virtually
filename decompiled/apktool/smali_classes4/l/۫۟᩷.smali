.class public final synthetic Ll/۫۟᩷;
.super Ljava/lang/Object;
.source "O1JS"

# interfaces
.implements Ll/ܶۖ;


# instance fields
.field public final synthetic ᩸:Ll/ۤ۟᩷;


# direct methods
.method public synthetic constructor <init>(Ll/ۤ۟᩷;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۫۟᩷;->᩸:Ll/ۤ۟᩷;

    return-void
.end method


# virtual methods
.method public final onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 3

    .line 436
    iget-object v0, p0, Ll/۫۟᩷;->᩸:Ll/ۤ۟᩷;

    iget-object v0, v0, Ll/ۤ۟᩷;->ܺ֫:Ll/ۛ۟᩷;

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    const v1, 0x7f1201a1

    const/4 v2, 0x1

    if-ne p1, v1, :cond_0

    .line 438
    invoke-static {v0}, Ll/ۛ۟᩷;->ۧ(Ll/ۛ۟᩷;)Ll/ۤ۟᩷;

    move-result-object p1

    invoke-virtual {p1}, Ll/ܰܳۡ;->ܽ()V

    return v2

    :cond_0
    const v1, 0x7f12034e

    if-ne p1, v1, :cond_1

    .line 440
    invoke-static {v0}, Ll/ۛ۟᩷;->ۧ(Ll/ۛ۟᩷;)Ll/ۤ۟᩷;

    move-result-object p1

    invoke-virtual {p1, v2}, Ll/ܰܳۡ;->֫(Z)V

    return v2

    :cond_1
    const v1, 0x7f120350

    if-ne p1, v1, :cond_2

    .line 442
    invoke-static {v0}, Ll/ۛ۟᩷;->ۧ(Ll/ۛ۟᩷;)Ll/ۤ۟᩷;

    move-result-object p1

    invoke-virtual {p1}, Ll/ܰܳۡ;->ܽ()V

    .line 443
    invoke-static {v0}, Ll/ۛ۟᩷;->ۧ(Ll/ۛ۟᩷;)Ll/ۤ۟᩷;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ll/ܰܳۡ;->֫(Z)V

    :cond_2
    return v2
.end method
