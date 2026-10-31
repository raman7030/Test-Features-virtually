.class public abstract Ll/ۛۧ᩵;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ll/ܳᩳ᩵;


# instance fields
.field public final a:Ll/֡ᩳ᩵;


# direct methods
.method public constructor <init>(Ll/֡ᩳ᩵;)V
    .locals 0

    .line 311
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 312
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֡ᩳ᩵;

    iput-object p1, p0, Ll/ۛۧ᩵;->a:Ll/֡ᩳ᩵;

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

.method public c(J)V
    .locals 1

    .line 317
    iget-object v0, p0, Ll/ۛۧ᩵;->a:Ll/֡ᩳ᩵;

    invoke-interface {v0, p1, p2}, Ll/֡ᩳ᩵;->c(J)V

    return-void
.end method

.method public end()V
    .locals 1

    .line 322
    iget-object v0, p0, Ll/ۛۧ᩵;->a:Ll/֡ᩳ᩵;

    invoke-interface {v0}, Ll/֡ᩳ᩵;->end()V

    return-void
.end method

.method public f()Z
    .locals 1

    .line 327
    iget-object v0, p0, Ll/ۛۧ᩵;->a:Ll/֡ᩳ᩵;

    invoke-interface {v0}, Ll/֡ᩳ᩵;->f()Z

    move-result v0

    return v0
.end method

.method public final synthetic l(Ljava/lang/Long;)V
    .locals 0

    invoke-static {p0, p1}, Ll/ۡ᩺ᩴ;->r(Ll/ܳᩳ᩵;Ljava/lang/Long;)V

    return-void
.end method
