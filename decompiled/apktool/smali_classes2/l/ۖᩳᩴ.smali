.class public final synthetic Ll/ۖᩳᩴ;
.super Ljava/lang/Object;
.source "8ATV"


# direct methods
.method public static ֫(Ll/ۘᩳᩴ;Ljava/util/function/DoubleConsumer;)Ll/ۘᩳᩴ;
    .locals 1

    .line 94
    instance-of v0, p1, Ll/ۘᩳᩴ;

    if-eqz v0, :cond_0

    check-cast p1, Ll/ۘᩳᩴ;

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ll/ۡᩳᩴ;

    invoke-direct {v0, p1}, Ll/ۡᩳᩴ;-><init>(Ljava/util/function/DoubleConsumer;)V

    move-object p1, v0

    :goto_0
    invoke-interface {p0, p1}, Ll/ۘᩳᩴ;->֫(Ll/ۘᩳᩴ;)Ll/ܺᩳᩴ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ۘᩳᩴ;D)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 52
    invoke-static {p1, p2}, Ll/ۖ᩺ۘ;->֫(D)F

    move-result p1

    invoke-interface {p0, p1}, Ll/ۘᩳᩴ;->֫(F)V

    return-void
.end method

.method public static ֫(Ll/ۘᩳᩴ;Ljava/lang/Float;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 63
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-interface {p0, p1}, Ll/ۘᩳᩴ;->֫(F)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۘᩳᩴ;Ljava/lang/Object;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 35
    check-cast p1, Ljava/lang/Float;

    invoke-interface {p0, p1}, Ll/ۘᩳᩴ;->֫(Ljava/lang/Float;)V

    return-void
.end method
