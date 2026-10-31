.class public final Ll/᩺᩻ۚ;
.super Ljava/lang/Object;
.source "J57K"

# interfaces
.implements Ll/ᩴܶܺ;


# virtual methods
.method public final apply(Ljava/lang/Object;)Z
    .locals 1

    .line 50
    check-cast p1, Ll/ۘ֫ۚ;

    if-eqz p1, :cond_0

    .line 61
    sget-object v0, Ll/ܺۗ֡;->ܳ֫:Ll/ܺۗ֡;

    invoke-interface {p1}, Ll/ۘ֫ۚ;->ܽ()I

    move-result p1

    invoke-virtual {v0, p1}, Ll/ܺۗ֡;->֫(I)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
