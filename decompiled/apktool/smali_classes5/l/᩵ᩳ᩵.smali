.class public final Ll/᩵ᩳ᩵;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ll/ᩳܿ᩵;
.implements Ll/ܳᩳ᩵;


# instance fields
.field public a:J

.field public final synthetic b:J

.field public final synthetic c:Ljava/util/function/LongBinaryOperator;


# direct methods
.method public constructor <init>(JLjava/util/function/LongBinaryOperator;)V
    .locals 0

    .line 460
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Ll/᩵ᩳ᩵;->b:J

    iput-object p3, p0, Ll/᩵ᩳ᩵;->c:Ljava/util/function/LongBinaryOperator;

    return-void
.end method


# virtual methods
.method public final synthetic accept(D)V
    .locals 0

    invoke-static {}, Ll/ۡ᩺ᩴ;->m()V

    const/4 p1, 0x0

    throw p1
.end method

.method public final synthetic accept(I)V
    .locals 0

    invoke-static {}, Ll/ۡ᩺ᩴ;->t()V

    const/4 p1, 0x0

    throw p1
.end method

.method public final accept(J)V
    .locals 3

    .line 471
    iget-object v0, p0, Ll/᩵ᩳ᩵;->c:Ljava/util/function/LongBinaryOperator;

    iget-wide v1, p0, Ll/᩵ᩳ᩵;->a:J

    invoke-interface {v0, v1, v2, p1, p2}, Ljava/util/function/LongBinaryOperator;->applyAsLong(JJ)J

    move-result-wide p1

    iput-wide p1, p0, Ll/᩵ᩳ᩵;->a:J

    return-void
.end method

.method public final bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Ll/ۡ᩺ᩴ;->s(Ll/ܳᩳ᩵;Ljava/lang/Object;)V

    return-void
.end method

.method public final synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    invoke-static {p0, p1}, Ll/᩻ۛᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic andThen(Ljava/util/function/LongConsumer;)Ljava/util/function/LongConsumer;
    .locals 0

    invoke-static {p0, p1}, Ll/ۖۛᩴ;->$default$andThen(Ljava/util/function/LongConsumer;Ljava/util/function/LongConsumer;)Ljava/util/function/LongConsumer;

    move-result-object p1

    return-object p1
.end method

.method public final c(J)V
    .locals 0

    .line 466
    iget-wide p1, p0, Ll/᩵ᩳ᩵;->b:J

    iput-wide p1, p0, Ll/᩵ᩳ᩵;->a:J

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

    .line 476
    iget-wide v0, p0, Ll/᩵ᩳ᩵;->a:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public final i(Ll/ᩳܿ᩵;)V
    .locals 2

    .line 460
    check-cast p1, Ll/᩵ᩳ᩵;

    .line 481
    iget-wide v0, p1, Ll/᩵ᩳ᩵;->a:J

    invoke-virtual {p0, v0, v1}, Ll/᩵ᩳ᩵;->accept(J)V

    return-void
.end method

.method public final synthetic l(Ljava/lang/Long;)V
    .locals 0

    invoke-static {p0, p1}, Ll/ۡ᩺ᩴ;->r(Ll/ܳᩳ᩵;Ljava/lang/Long;)V

    return-void
.end method
