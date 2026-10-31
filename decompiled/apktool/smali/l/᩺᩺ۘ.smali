.class public final synthetic Ll/᩺᩺ۘ;
.super Ljava/lang/Object;
.source "RAPC"


# direct methods
.method public static ֫(Ll/ܰ᩺ۘ;Ljava/util/function/IntPredicate;)Ll/ܰ᩺ۘ;
    .locals 1

    .line 92
    instance-of v0, p1, Ll/ܰ᩺ۘ;

    if-eqz v0, :cond_0

    check-cast p1, Ll/ܰ᩺ۘ;

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ll/ۤ᩺ۘ;

    invoke-direct {v0, p1}, Ll/ۤ᩺ۘ;-><init>(Ljava/util/function/IntPredicate;)V

    move-object p1, v0

    :goto_0
    invoke-interface {p0, p1}, Ll/ܰ᩺ۘ;->֫(Ll/ܰ᩺ۘ;)Ll/ۨ᩺ۘ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ܰ᩺ۘ;I)Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 53
    invoke-static {p1}, Ll/ۖ᩺ۘ;->֫(I)B

    move-result p1

    invoke-interface {p0, p1}, Ll/ܰ᩺ۘ;->ۧ(B)Z

    move-result p0

    return p0
.end method

.method public static ֫(Ll/ܰ᩺ۘ;Ljava/lang/Byte;)Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 64
    invoke-virtual {p1}, Ljava/lang/Byte;->byteValue()B

    move-result p1

    invoke-interface {p0, p1}, Ll/ܰ᩺ۘ;->ۧ(B)Z

    move-result p0

    return p0
.end method

.method public static ۧ(Ll/ܰ᩺ۘ;Ljava/util/function/IntPredicate;)Ll/ܰ᩺ۘ;
    .locals 1

    .line 137
    instance-of v0, p1, Ll/ܰ᩺ۘ;

    if-eqz v0, :cond_0

    check-cast p1, Ll/ܰ᩺ۘ;

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ll/ۤ᩺ۘ;

    invoke-direct {v0, p1}, Ll/ۤ᩺ۘ;-><init>(Ljava/util/function/IntPredicate;)V

    move-object p1, v0

    :goto_0
    invoke-interface {p0, p1}, Ll/ܰ᩺ۘ;->ۧ(Ll/ܰ᩺ۘ;)Ll/ۛ᩺ۘ;

    move-result-object p0

    return-object p0
.end method
