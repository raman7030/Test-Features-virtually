.class public final synthetic Ll/ۚᩳᩴ;
.super Ljava/lang/Object;
.source "5C37"


# direct methods
.method public static ֫(Ll/֨ᩳᩴ;Ljava/util/function/Consumer;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 94
    instance-of v0, p1, Ll/ۘᩳᩴ;

    if-eqz v0, :cond_0

    check-cast p1, Ll/ۘᩳᩴ;

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ll/ᩴᩳᩴ;

    invoke-direct {v0, p1}, Ll/ᩴᩳᩴ;-><init>(Ljava/util/function/Consumer;)V

    move-object p1, v0

    :goto_0
    invoke-interface {p0, p1}, Ll/֨ᩳᩴ;->ܽ(Ll/ۘᩳᩴ;)V

    return-void
.end method
