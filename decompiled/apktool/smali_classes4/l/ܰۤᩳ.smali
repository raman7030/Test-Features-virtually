.class public final synthetic Ll/ܰۤᩳ;
.super Ljava/lang/Object;
.source "X68P"

# interfaces
.implements Ll/ܰ᩶ܿ;


# instance fields
.field public final synthetic ᩸:Ll/۫ۨᩳ;


# direct methods
.method public synthetic constructor <init>(Ll/۫ۨᩳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܰۤᩳ;->᩸:Ll/۫ۨᩳ;

    return-void
.end method


# virtual methods
.method public final onMenuItemClick(Landroid/view/MenuItem;)V
    .locals 2

    .line 2
    sget-object v0, Ll/۫ۨᩳ;->᩻ܿ:Landroid/text/method/TextKeyListener;

    .line 4
    iget-object v0, p0, Ll/ܰۤᩳ;->᩸:Ll/۫ۨᩳ;

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 406
    invoke-interface {p1}, Landroid/view/MenuItem;->getTitle()Ljava/lang/CharSequence;

    move-result-object p1

    instance-of v1, p1, Ll/ܺ᩻ܿ;

    if-eqz v1, :cond_0

    check-cast p1, Ll/ܺ᩻ܿ;

    .line 407
    invoke-virtual {p1}, Ll/ܺ᩻ܿ;->֫()Ll/ۖ᩻ܿ;

    move-result-object p1

    invoke-virtual {p1, v0}, Ll/ۖ᩻ܿ;->֫(Ll/۫ۨᩳ;)V

    :cond_0
    return-void
.end method
