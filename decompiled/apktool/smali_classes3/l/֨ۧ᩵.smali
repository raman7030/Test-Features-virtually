.class public abstract Ll/֨ۧ᩵;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ll/ۤܽ᩵;


# instance fields
.field public final a:Ll/֡ᩳ᩵;


# direct methods
.method public constructor <init>(Ll/֡ᩳ᩵;)V
    .locals 0

    .line 279
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 280
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֡ᩳ᩵;

    iput-object p1, p0, Ll/֨ۧ᩵;->a:Ll/֡ᩳ᩵;

    return-void
.end method


# virtual methods
.method public final synthetic accept(D)V
    .locals 0

    invoke-static {}, Ll/ۡ᩺ᩴ;->m()V

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

    invoke-static {p0, p1}, Ll/ۡ᩺ᩴ;->q(Ll/ۤܽ᩵;Ljava/lang/Object;)V

    return-void
.end method

.method public final synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    invoke-static {p0, p1}, Ll/᩻ۛᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic andThen(Ljava/util/function/IntConsumer;)Ljava/util/function/IntConsumer;
    .locals 0

    invoke-static {p0, p1}, Ll/ۢۛᩴ;->$default$andThen(Ljava/util/function/IntConsumer;Ljava/util/function/IntConsumer;)Ljava/util/function/IntConsumer;

    move-result-object p1

    return-object p1
.end method

.method public c(J)V
    .locals 1

    .line 285
    iget-object v0, p0, Ll/֨ۧ᩵;->a:Ll/֡ᩳ᩵;

    invoke-interface {v0, p1, p2}, Ll/֡ᩳ᩵;->c(J)V

    return-void
.end method

.method public final synthetic d(Ljava/lang/Integer;)V
    .locals 0

    invoke-static {p0, p1}, Ll/ۡ᩺ᩴ;->p(Ll/ۤܽ᩵;Ljava/lang/Integer;)V

    return-void
.end method

.method public end()V
    .locals 1

    .line 290
    iget-object v0, p0, Ll/֨ۧ᩵;->a:Ll/֡ᩳ᩵;

    invoke-interface {v0}, Ll/֡ᩳ᩵;->end()V

    return-void
.end method

.method public f()Z
    .locals 1

    .line 295
    iget-object v0, p0, Ll/֨ۧ᩵;->a:Ll/֡ᩳ᩵;

    invoke-interface {v0}, Ll/֡ᩳ᩵;->f()Z

    move-result v0

    return v0
.end method
