.class public final synthetic Ll/ۗ᩸ܳ;
.super Ljava/lang/Object;
.source "164Z"

# interfaces
.implements Ll/۬ۤ;


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    .line 2
    check-cast p1, Lbin/mt/plus/Main;

    .line 136
    new-instance v0, Landroid/content/Intent;

    const-class v1, Ll/᩺ܿ᩷;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 137
    invoke-virtual {p1, v0}, Lbin/mt/plus/Main;->startActivity(Landroid/content/Intent;)V

    return-void
.end method
