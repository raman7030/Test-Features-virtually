.class public final synthetic Ll/᩹֨ܳ;
.super Ljava/lang/Object;
.source "E4GI"

# interfaces
.implements Landroid/view/View$OnClickListener;


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 183
    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-class v2, Ll/ۗܺܳ;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 184
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method
