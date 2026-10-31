.class public final Ll/ۡᩴ;
.super Ljava/lang/Object;
.source "H56R"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final ᩸:Ll/᩻ۜ;

.field public final synthetic ᩹:Ll/ۖᩴ;


# direct methods
.method public constructor <init>(Ll/ۖᩴ;)V
    .locals 2

    .line 181
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۡᩴ;->᩹:Ll/ۖᩴ;

    .line 182
    new-instance v0, Ll/᩻ۜ;

    iget-object v1, p1, Ll/ۖᩴ;->ۘ:Ll/ۢᩴ;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object p1, p1, Ll/ۖᩴ;->ܺ:Ljava/lang/CharSequence;

    invoke-direct {v0, v1, p1}, Ll/᩻ۜ;-><init>(Landroid/content/Context;Ljava/lang/CharSequence;)V

    iput-object v0, p0, Ll/ۡᩴ;->᩸:Ll/᩻ۜ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 186
    iget-object p1, p0, Ll/ۡᩴ;->᩹:Ll/ۖᩴ;

    iget-object v0, p1, Ll/ۖᩴ;->ᩴ:Landroid/view/Window$Callback;

    if-eqz v0, :cond_0

    iget-boolean p1, p1, Ll/ۖᩴ;->᩷:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 187
    iget-object v1, p0, Ll/ۡᩴ;->᩸:Ll/᩻ۜ;

    invoke-interface {v0, p1, v1}, Landroid/view/Window$Callback;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    :cond_0
    return-void
.end method
