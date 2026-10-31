.class public final Ll/ܰۙۘ;
.super Ljava/lang/Object;
.source "88X7"

# interfaces
.implements Ll/֫ۙۘ;


# virtual methods
.method public final ֫(Ll/ᩴ᩶ۘ;Ll/ܰ᩶ۘ;)Ljava/lang/Object;
    .locals 2

    .line 16
    new-instance v0, Ll/᩷ۗۘ;

    .line 17
    invoke-virtual {p1}, Ll/ᩴ᩶ۘ;->᩻()Ll/۬ۙۘ;

    move-result-object p1

    sget-object v1, Ll/ۙۙۘ;->ܽ:Ll/ۨ᩶ۘ;

    .line 18
    invoke-virtual {v1, p2}, Ll/ۨ᩶ۘ;->ܽ(Ll/ܰ᩶ۘ;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-direct {v0, p1, p2}, Ll/᩷ۗۘ;-><init>(Ll/۬ۙۘ;I)V

    return-object v0
.end method
