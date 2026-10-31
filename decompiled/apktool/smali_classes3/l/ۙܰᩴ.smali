.class public final Ll/ۙܰᩴ;
.super Ll/᩶۟ᩴ;
.source "N673"

# interfaces
.implements Ll/۠ۨᩴ;
.implements Ljava/util/function/DoubleConsumer;


# instance fields
.field public f:D


# virtual methods
.method public final accept(D)V
    .locals 0

    .line 1221
    iput-wide p1, p0, Ll/ۙܰᩴ;->f:D

    return-void
.end method

.method public final synthetic andThen(Ljava/util/function/DoubleConsumer;)Ljava/util/function/DoubleConsumer;
    .locals 0

    invoke-static {p0, p1}, Ll/ܺ᩶ᩴ;->a(Ljava/util/function/DoubleConsumer;Ljava/util/function/DoubleConsumer;)Ll/۠ۛᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ll/ܶ۫ᩴ;)Ll/ܶ۫ᩴ;
    .locals 1

    .line 1205
    check-cast p1, Ll/۠ۨᩴ;

    .line 1236
    new-instance v0, Ll/ۙܰᩴ;

    .line 1081
    invoke-direct {v0, p1, p0}, Ll/᩹֫᩵;-><init>(Ll/ܶ۫ᩴ;Ll/᩹֫᩵;)V

    return-object v0
.end method

.method public final synthetic forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 0

    invoke-static {p0, p1}, Ll/ܺ᩶ᩴ;->b(Ll/۠ۨᩴ;Ljava/util/function/Consumer;)V

    return-void
.end method

.method public final g(Ljava/lang/Object;)V
    .locals 2

    .line 1205
    check-cast p1, Ljava/util/function/DoubleConsumer;

    .line 1226
    iget-wide v0, p0, Ll/ۙܰᩴ;->f:D

    invoke-interface {p1, v0, v1}, Ljava/util/function/DoubleConsumer;->accept(D)V

    return-void
.end method

.method public final j(I)Ll/᩺ۧ᩵;
    .locals 1

    .line 1231
    new-instance v0, Ll/ܰ֫᩵;

    invoke-direct {v0, p1}, Ll/ܰ֫᩵;-><init>(I)V

    return-object v0
.end method

.method public final synthetic tryAdvance(Ljava/util/function/Consumer;)Z
    .locals 0

    invoke-static {p0, p1}, Ll/ܺ᩶ᩴ;->g(Ll/۠ۨᩴ;Ljava/util/function/Consumer;)Z

    move-result p1

    return p1
.end method
