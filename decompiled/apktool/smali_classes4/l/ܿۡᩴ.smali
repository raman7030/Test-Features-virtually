.class public final synthetic Ll/ܿۡᩴ;
.super Ljava/lang/Object;
.source "V1PV"


# direct methods
.method public static ֫(Ll/֨ۢᩴ;Ljava/util/function/Consumer;)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 157
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    instance-of v0, p1, Ljava/util/function/IntConsumer;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/util/function/IntConsumer;

    goto :goto_0

    :cond_0
    new-instance v0, Ll/ۗܳۡ;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1}, Ll/ۗܳۡ;-><init>(ILjava/lang/Object;)V

    move-object p1, v0

    :goto_0
    invoke-interface {p0, p1}, Ll/ܳۡᩴ;->forEach(Ljava/util/function/IntConsumer;)V

    return-void
.end method
