.class public final Ll/֫ܽ᩻;
.super Ll/ۤۜܳ;
.source "22BV"


# virtual methods
.method public final ֫(Ll/ܽۢܳ;)V
    .locals 3

    .line 994
    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p1}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v1

    const-class v2, Ll/ᩳۧ᩻;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 995
    invoke-virtual {p1}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object p1

    invoke-virtual {p1, v0}, Lbin/mt/plus/Main;->startActivity(Landroid/content/Intent;)V

    return-void
.end method
