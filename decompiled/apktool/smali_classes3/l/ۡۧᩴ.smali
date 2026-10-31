.class public final synthetic Ll/ۡۧᩴ;
.super Ljava/lang/Object;
.source "C6L"


# direct methods
.method public static ֫(Ll/ܶۧᩴ;)Ljava/lang/Character;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 46
    invoke-interface {p0}, Ll/ܺۧᩴ;->֡ۧ()C

    move-result p0

    invoke-static {p0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ܺۧᩴ;Ljava/util/function/Consumer;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 94
    instance-of v0, p1, Ll/᩻ۧᩴ;

    if-eqz v0, :cond_0

    check-cast p1, Ll/᩻ۧᩴ;

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ll/ۜۧᩴ;

    invoke-direct {v0, p1}, Ll/ۜۧᩴ;-><init>(Ljava/util/function/Consumer;)V

    move-object p1, v0

    :goto_0
    invoke-interface {p0, p1}, Ll/ܺۧᩴ;->ۧ(Ll/᩻ۧᩴ;)V

    return-void
.end method

.method public static ֫(Ll/ܺۧᩴ;Ll/᩻ۧᩴ;)V
    .locals 1

    .line 62
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 64
    invoke-interface {p0}, Ll/ܺۧᩴ;->֡ۧ()C

    move-result v0

    invoke-interface {p1, v0}, Ll/᩻ۧᩴ;->ܽ(C)V

    goto :goto_0

    :cond_0
    return-void
.end method
