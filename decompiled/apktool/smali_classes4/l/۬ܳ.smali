.class public final Ll/۬ܳ;
.super Ljava/lang/Object;
.source "A5FO"

# interfaces
.implements Ll/᩻ᩴ;


# instance fields
.field public final synthetic ᩸:Ll/ۨܳ;


# direct methods
.method public constructor <init>(Ll/ۨܳ;)V
    .locals 0

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۬ܳ;->᩸:Ll/ۨܳ;

    return-void
.end method


# virtual methods
.method public final onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 2

    .line 66
    iget-object v0, p0, Ll/۬ܳ;->᩸:Ll/ۨܳ;

    iget-object v0, v0, Ll/ۨܳ;->ۜ:Landroid/view/Window$Callback;

    const/4 v1, 0x0

    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method
