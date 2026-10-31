.class public final Ll/ܶܰᩴ;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ll/ᩳܿ᩵;
.implements Ll/ۚܽ᩵;


# instance fields
.field public a:D

.field public final synthetic b:D

.field public final synthetic c:Ljava/util/function/DoubleBinaryOperator;


# direct methods
.method public constructor <init>(DLjava/util/function/DoubleBinaryOperator;)V
    .locals 0

    .line 634
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Ll/ܶܰᩴ;->b:D

    iput-object p3, p0, Ll/ܶܰᩴ;->c:Ljava/util/function/DoubleBinaryOperator;

    return-void
.end method


# virtual methods
.method public final accept(D)V
    .locals 3

    .line 645
    iget-object v0, p0, Ll/ܶܰᩴ;->c:Ljava/util/function/DoubleBinaryOperator;

    iget-wide v1, p0, Ll/ܶܰᩴ;->a:D

    invoke-interface {v0, v1, v2, p1, p2}, Ljava/util/function/DoubleBinaryOperator;->applyAsDouble(DD)D

    move-result-wide p1

    iput-wide p1, p0, Ll/ܶܰᩴ;->a:D

    return-void
.end method

.method public final synthetic accept(I)V
    .locals 0

    invoke-static {}, Ll/ۡ᩺ᩴ;->t()V

    const/4 p1, 0x0

    throw p1
.end method

.method public final synthetic accept(J)V
    .locals 0

    invoke-static {}, Ll/ۡ᩺ᩴ;->u()V

    const/4 p1, 0x0

    throw p1
.end method

.method public final bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Ll/ۡ᩺ᩴ;->o(Ll/ۚܽ᩵;Ljava/lang/Object;)V

    return-void
.end method

.method public final synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    invoke-static {p0, p1}, Ll/᩻ۛᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic andThen(Ljava/util/function/DoubleConsumer;)Ljava/util/function/DoubleConsumer;
    .locals 0

    invoke-static {p0, p1}, Ll/ܺ᩶ᩴ;->a(Ljava/util/function/DoubleConsumer;Ljava/util/function/DoubleConsumer;)Ll/۠ۛᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final c(J)V
    .locals 0

    .line 640
    iget-wide p1, p0, Ll/ܶܰᩴ;->b:D

    iput-wide p1, p0, Ll/ܶܰᩴ;->a:D

    return-void
.end method

.method public final synthetic end()V
    .locals 0

    return-void
.end method

.method public final synthetic f()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final get()Ljava/lang/Object;
    .locals 2

    .line 650
    iget-wide v0, p0, Ll/ܶܰᩴ;->a:D

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    return-object v0
.end method

.method public final i(Ll/ᩳܿ᩵;)V
    .locals 2

    .line 634
    check-cast p1, Ll/ܶܰᩴ;

    .line 655
    iget-wide v0, p1, Ll/ܶܰᩴ;->a:D

    invoke-virtual {p0, v0, v1}, Ll/ܶܰᩴ;->accept(D)V

    return-void
.end method

.method public final synthetic n(Ljava/lang/Double;)V
    .locals 0

    invoke-static {p0, p1}, Ll/ۡ᩺ᩴ;->n(Ll/ۚܽ᩵;Ljava/lang/Double;)V

    return-void
.end method
