.class public final Ll/ۛۡۚ;
.super Ljava/lang/Object;
.source "151T"

# interfaces
.implements Ll/ܽܶܺ;


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 63
    check-cast p1, Ll/ۘ֫ۚ;

    .line 66
    invoke-interface {p1}, Ll/ۘ֫ۚ;->ۚ֫()Ll/ۤܽۚ;

    move-result-object v0

    if-nez v0, :cond_0

    .line 68
    invoke-interface {p1}, Ll/ᩴܽۚ;->getType()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/᩻ܿۚ;->֫(Ljava/lang/String;)Ll/ܿܿۚ;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0
.end method
