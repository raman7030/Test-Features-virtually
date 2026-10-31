.class public final Ll/ۤۡۚ;
.super Ljava/lang/Object;
.source "151T"

# interfaces
.implements Ll/ᩴܶܺ;


# virtual methods
.method public final apply(Ljava/lang/Object;)Z
    .locals 0

    .line 56
    check-cast p1, Ll/ۘ֫ۚ;

    .line 59
    invoke-interface {p1}, Ll/ۘ֫ۚ;->ۚ֫()Ll/ۤܽۚ;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 60
    invoke-static {p1}, Ll/ۛ᩻ۚ;->֫(Ll/ۤܽۚ;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
