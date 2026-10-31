.class public final Ll/֫ۗۘ;
.super Ljava/lang/Object;
.source "O91I"

# interfaces
.implements Ll/֫ۙۘ;


# virtual methods
.method public final ֫(Ll/ᩴ᩶ۘ;Ll/ܰ᩶ۘ;)Ljava/lang/Object;
    .locals 2

    .line 24
    sget-object v0, Ll/᩹ۙۘ;->᩹:Ll/᩹ۙۘ;

    sget-object v1, Ll/ۙۙۘ;->ܿ:Ll/ۨ᩶ۘ;

    invoke-virtual {v1, p2}, Ll/ۨ᩶ۘ;->ܽ(Ll/ܰ᩶ۘ;)Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 25
    new-instance v0, Ll/ܿۗۘ;

    .line 26
    invoke-virtual {p1}, Ll/ᩴ᩶ۘ;->᩻()Ll/۬ۙۘ;

    move-result-object p1

    sget-object v1, Ll/ۙۙۘ;->֫:Ll/ۨ᩶ۘ;

    .line 27
    invoke-virtual {v1, p2}, Ll/ۨ᩶ۘ;->ܽ(Ll/ܰ᩶ۘ;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-direct {v0, p1, p2}, Ll/ܿۗۘ;-><init>(Ll/۬ۙۘ;I)V

    return-object v0

    .line 30
    :cond_0
    sget-object v0, Ll/ۙۙۘ;->ܳ:Ll/ۨ᩶ۘ;

    invoke-virtual {v0, p2}, Ll/ۨ᩶ۘ;->ܽ(Ll/ܰ᩶ۘ;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 31
    sget-object v1, Ll/ۙۙۘ;->᩻:Ll/ۨ᩶ۘ;

    invoke-virtual {v1, p2}, Ll/ۨ᩶ۘ;->ܽ(Ll/ܰ᩶ۘ;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/᩶ۙۘ;

    .line 32
    new-instance v1, Ll/ۖۗۘ;

    .line 33
    invoke-virtual {p1}, Ll/ᩴ᩶ۘ;->᩻()Ll/۬ۙۘ;

    move-result-object p1

    invoke-direct {v1, p1, v0, p2}, Ll/ۖۗۘ;-><init>(Ll/۬ۙۘ;Ljava/lang/String;Ll/᩶ۙۘ;)V

    return-object v1
.end method
