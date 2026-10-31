.class public final Ll/ۙۨۘ;
.super Ljava/lang/Object;
.source "D8YF"

# interfaces
.implements Ll/֫ۙۘ;


# virtual methods
.method public final ֫(Ll/ᩴ᩶ۘ;Ll/ܰ᩶ۘ;)Ljava/lang/Object;
    .locals 6

    .line 14
    new-instance v0, Ll/֡ۨۘ;

    .line 15
    invoke-virtual {p1}, Ll/ᩴ᩶ۘ;->᩻()Ll/۬ۙۘ;

    move-result-object v1

    new-instance v2, Ll/ܿۨۘ;

    sget-object v3, Ll/ܶۨۘ;->֫:Ll/ۨ᩶ۘ;

    .line 17
    invoke-virtual {v3, p2}, Ll/ۨ᩶ۘ;->ܽ(Ll/ܰ᩶ۘ;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 18
    invoke-virtual {p1}, Ll/ᩴ᩶ۘ;->֫()Ll/ܳۨۘ;

    move-result-object v4

    .line 19
    invoke-virtual {p1}, Ll/ᩴ᩶ۘ;->ܽ()Ll/ۖ᩹ۢ;

    move-result-object p1

    sget-object v5, Ll/ܶۨۘ;->ۧ:Ll/ۨ᩶ۘ;

    .line 20
    invoke-virtual {v5, p2}, Ll/ۨ᩶ۘ;->֫(Ll/ܰ᩶ۘ;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩹ۨۘ;

    invoke-direct {v2, v3, v4, p1, v5}, Ll/ܿۨۘ;-><init>(Ljava/lang/String;Ll/ܳۨۘ;Ll/ۖ᩹ۢ;Ll/᩹ۨۘ;)V

    sget-object p1, Ll/ܶۨۘ;->ܽ:Ll/ۨ᩶ۘ;

    .line 23
    invoke-virtual {p1, p2}, Ll/ۨ᩶ۘ;->ۧ(Ll/ܰ᩶ۘ;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-direct {v0, v1, v2, p1}, Ll/֡ۨۘ;-><init>(Ll/۬ۙۘ;Ll/ܿۨۘ;Z)V

    return-object v0
.end method
