.class public final Ll/۬ۛܳ;
.super Ll/֫ۜܳ;
.source "K8EP"


# virtual methods
.method public final ܽ(Ll/ۖۢܳ;)V
    .locals 2

    const-string v0, "compress"

    .line 15
    invoke-virtual {p1, v0}, Ll/ۖۢܳ;->֫(Ljava/lang/String;)V

    .line 16
    new-instance v0, Ll/ۤۛܳ;

    invoke-virtual {p1}, Ll/ۖۢܳ;->ܿ()Ll/ܽۢܳ;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/ۤۛܳ;-><init>(Ll/ܽۢܳ;)V

    invoke-virtual {p1}, Ll/ۖۢܳ;->ۡ()Ll/ᩳۜܳ;

    move-result-object p1

    check-cast p1, Ll/۫ۛܳ;

    invoke-virtual {v0, p1}, Ll/ۤۛܳ;->֫(Ll/۫ۛܳ;)V

    return-void
.end method
