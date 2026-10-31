.class public final synthetic Ll/ܳ᩸ܳ;
.super Ljava/lang/Object;
.source "BAG5"

# interfaces
.implements Ll/ܶۖ;


# instance fields
.field public final synthetic ᩸:Ll/᩻᩸ܳ;


# direct methods
.method public synthetic constructor <init>(Ll/᩻᩸ܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܳ᩸ܳ;->᩸:Ll/᩻᩸ܳ;

    return-void
.end method


# virtual methods
.method public final onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 3

    .line 2
    iget-object v0, p0, Ll/ܳ᩸ܳ;->᩸:Ll/᩻᩸ܳ;

    .line 47
    iget-object v0, v0, Ll/ۨ۠ܳ;->᩸:Lbin/mt/plus/Main;

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v1

    const v2, 0x7f1202d2

    if-ne v1, v2, :cond_0

    .line 48
    invoke-static {v0}, Ll/ܿܶܳ;->֫(Ll/ۗܺ᩷;)V

    const/4 p1, 0x1

    return p1

    .line 51
    :cond_0
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    invoke-static {v0, p1}, Ll/᩻᩸ܳ;->֫(Ll/ۗܺ᩷;I)Z

    move-result p1

    return p1
.end method
