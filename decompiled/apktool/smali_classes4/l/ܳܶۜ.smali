.class public final synthetic Ll/ܳܶۜ;
.super Ljava/lang/Object;
.source "X8B6"

# interfaces
.implements Ll/ܶ۠֫;
.implements Ll/ܶۖ;


# instance fields
.field public final synthetic ᩸:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ܳܶۜ;->᩸:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ܳܶۜ;->᩸:Ljava/lang/Object;

    check-cast v0, Ll/ܺܶۜ;

    invoke-virtual {v0, p1}, Ll/ܺܶۜ;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public ֫()Ll/᩸۠֫;
    .locals 2

    .line 2
    iget-object v0, p0, Ll/ܳܶۜ;->᩸:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/ܽۚۜ;

    .line 707
    new-instance v1, Ll/ۗ֡ۜ;

    invoke-direct {v1, v0}, Ll/ۗ֡ۜ;-><init>(Ll/ܽۚۜ;)V

    return-object v1
.end method
