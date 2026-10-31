.class public final synthetic Ll/ۚۘᩴ;
.super Ljava/lang/Object;
.source "2AP3"


# direct methods
.method public static ֫(Ll/֨ۘᩴ;Ljava/util/function/Consumer;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 86
    instance-of v0, p1, Ljava/util/function/LongConsumer;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/util/function/LongConsumer;

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ll/ᩳۘᩴ;

    invoke-direct {v0, p1}, Ll/ᩳۘᩴ;-><init>(Ljava/util/function/Consumer;)V

    move-object p1, v0

    :goto_0
    invoke-interface {p0, p1}, Ll/֡۫ᩴ;->forEachRemaining(Ljava/util/function/LongConsumer;)V

    return-void
.end method

.method public static ۧ(Ll/֨ۘᩴ;Ljava/util/function/Consumer;)Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 41
    instance-of v0, p1, Ljava/util/function/LongConsumer;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/util/function/LongConsumer;

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ll/ᩳۘᩴ;

    invoke-direct {v0, p1}, Ll/ᩳۘᩴ;-><init>(Ljava/util/function/Consumer;)V

    move-object p1, v0

    :goto_0
    invoke-interface {p0, p1}, Ll/֡۫ᩴ;->tryAdvance(Ljava/util/function/LongConsumer;)Z

    move-result p0

    return p0
.end method
