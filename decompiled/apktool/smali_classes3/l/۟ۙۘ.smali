.class public final Ll/۟ۙۘ;
.super Ljava/lang/Object;
.source "X8WI"

# interfaces
.implements Ll/֫ۙۘ;


# virtual methods
.method public final ֫(Ll/ᩴ᩶ۘ;Ll/ܰ᩶ۘ;)Ljava/lang/Object;
    .locals 3

    .line 16
    new-instance v0, Ll/ۡۗۘ;

    .line 17
    invoke-virtual {p1}, Ll/ᩴ᩶ۘ;->᩻()Ll/۬ۙۘ;

    move-result-object v1

    sget-object v2, Ll/ۙۙۘ;->ᩳ:Ll/ۨ᩶ۘ;

    .line 18
    invoke-virtual {v2, p2}, Ll/ۨ᩶ۘ;->ܽ(Ll/ܰ᩶ۘ;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    .line 19
    invoke-virtual {p1}, Ll/ᩴ᩶ۘ;->ᩳ()Ll/᩷᩶ۘ;

    move-result-object p1

    invoke-direct {v0, v1, p2, p1}, Ll/ۡۗۘ;-><init>(Ll/۬ۙۘ;Ljava/lang/String;Ll/᩷᩶ۘ;)V

    return-object v0
.end method
