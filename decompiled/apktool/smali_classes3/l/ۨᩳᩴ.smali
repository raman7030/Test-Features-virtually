.class public final synthetic Ll/ۨᩳᩴ;
.super Ljava/lang/Object;
.source "JAPJ"


# direct methods
.method public static ֫(Ll/᩺ᩳᩴ;Ljava/util/function/DoublePredicate;)Ll/᩺ᩳᩴ;
    .locals 1

    .line 92
    instance-of v0, p1, Ll/᩺ᩳᩴ;

    if-eqz v0, :cond_0

    check-cast p1, Ll/᩺ᩳᩴ;

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ll/۫ᩳᩴ;

    invoke-direct {v0, p1}, Ll/۫ᩳᩴ;-><init>(Ljava/util/function/DoublePredicate;)V

    move-object p1, v0

    :goto_0
    invoke-interface {p0, p1}, Ll/᩺ᩳᩴ;->ۧ(Ll/᩺ᩳᩴ;)Ll/ۤᩳᩴ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/᩺ᩳᩴ;D)Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 53
    invoke-static {p1, p2}, Ll/ۖ᩺ۘ;->֫(D)F

    move-result p1

    invoke-interface {p0, p1}, Ll/᩺ᩳᩴ;->ܽ(F)Z

    move-result p0

    return p0
.end method

.method public static ֫(Ll/᩺ᩳᩴ;Ljava/lang/Float;)Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 64
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-interface {p0, p1}, Ll/᩺ᩳᩴ;->ܽ(F)Z

    move-result p0

    return p0
.end method

.method public static ۧ(Ll/᩺ᩳᩴ;Ljava/util/function/DoublePredicate;)Ll/᩺ᩳᩴ;
    .locals 1

    .line 137
    instance-of v0, p1, Ll/᩺ᩳᩴ;

    if-eqz v0, :cond_0

    check-cast p1, Ll/᩺ᩳᩴ;

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ll/۫ᩳᩴ;

    invoke-direct {v0, p1}, Ll/۫ᩳᩴ;-><init>(Ljava/util/function/DoublePredicate;)V

    move-object p1, v0

    :goto_0
    invoke-interface {p0, p1}, Ll/᩺ᩳᩴ;->֫(Ll/᩺ᩳᩴ;)Ll/ۛᩳᩴ;

    move-result-object p0

    return-object p0
.end method
