.class public final synthetic Ll/֫᩹ܳ;
.super Ljava/lang/Object;
.source "164Z"

# interfaces
.implements Ll/۬ۤ;


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    .line 2
    check-cast p1, Lbin/mt/plus/Main;

    .line 125
    invoke-virtual {p1}, Lbin/mt/plus/Main;->ۨ()V

    .line 126
    invoke-virtual {p1}, Lbin/mt/plus/Main;->ܿ֫()Ll/ۢۘܳ;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 128
    invoke-virtual {p1}, Ll/ۢۘܳ;->ۜ()Ll/ܽۢܳ;

    move-result-object p1

    new-instance v0, Ll/۬᩵ᩳ;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Ll/۬᩵ᩳ;-><init>(I)V

    invoke-virtual {p1, v0}, Ll/ܽۢܳ;->֫(Ll/ᩳ᩷ܳ;)V

    :cond_0
    return-void
.end method
