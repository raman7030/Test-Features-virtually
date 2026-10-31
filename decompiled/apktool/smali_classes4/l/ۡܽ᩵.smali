.class public abstract Ll/ۡܽ᩵;
.super Ll/ۨܿ᩵;
.source "N673"

# interfaces
.implements Ljava/util/function/DoubleConsumer;
.implements Ll/۠ۨᩴ;


# instance fields
.field public final e:Ljava/util/function/DoublePredicate;

.field public f:D


# direct methods
.method public constructor <init>(Ll/۠ۨᩴ;Ljava/util/function/DoublePredicate;)V
    .locals 0

    .line 1038
    invoke-direct {p0, p1}, Ll/ۨܿ᩵;-><init>(Ll/ܶ۫ᩴ;)V

    .line 1039
    iput-object p2, p0, Ll/ۡܽ᩵;->e:Ljava/util/function/DoublePredicate;

    return-void
.end method

.method public constructor <init>(Ll/۠ۨᩴ;Ll/ۡܽ᩵;)V
    .locals 0

    .line 1043
    invoke-direct {p0, p1, p2}, Ll/ۨܿ᩵;-><init>(Ll/ܶ۫ᩴ;Ll/ۨܿ᩵;)V

    .line 1044
    iget-object p1, p2, Ll/ۡܽ᩵;->e:Ljava/util/function/DoublePredicate;

    iput-object p1, p0, Ll/ۡܽ᩵;->e:Ljava/util/function/DoublePredicate;

    return-void
.end method


# virtual methods
.method public final accept(D)V
    .locals 1

    .line 1049
    iget v0, p0, Ll/ۨܿ᩵;->d:I

    add-int/lit8 v0, v0, 0x1

    and-int/lit8 v0, v0, 0x3f

    iput v0, p0, Ll/ۨܿ᩵;->d:I

    .line 1050
    iput-wide p1, p0, Ll/ۡܽ᩵;->f:D

    return-void
.end method

.method public final synthetic andThen(Ljava/util/function/DoubleConsumer;)Ljava/util/function/DoubleConsumer;
    .locals 0

    invoke-static {p0, p1}, Ll/ܺ᩶ᩴ;->a(Ljava/util/function/DoubleConsumer;Ljava/util/function/DoubleConsumer;)Ll/۠ۛᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic forEachRemaining(Ljava/lang/Object;)V
    .locals 0

    .line 778
    check-cast p1, Ljava/util/function/DoubleConsumer;

    invoke-virtual {p0, p1}, Ll/ۡܽ᩵;->forEachRemaining(Ljava/util/function/DoubleConsumer;)V

    return-void
.end method

.method public final synthetic forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 0

    invoke-static {p0, p1}, Ll/ܺ᩶ᩴ;->b(Ll/۠ۨᩴ;Ljava/util/function/Consumer;)V

    return-void
.end method

.method public final forEachRemaining(Ljava/util/function/DoubleConsumer;)V
    .locals 1

    .line 788
    :cond_0
    invoke-interface {p0, p1}, Ll/۠ۨᩴ;->tryAdvance(Ljava/util/function/DoubleConsumer;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void
.end method

.method public bridge synthetic tryAdvance(Ljava/lang/Object;)Z
    .locals 0

    .line 1095
    check-cast p1, Ljava/util/function/DoubleConsumer;

    invoke-interface {p0, p1}, Ll/۠ۨᩴ;->tryAdvance(Ljava/util/function/DoubleConsumer;)Z

    move-result p1

    return p1
.end method

.method public final synthetic tryAdvance(Ljava/util/function/Consumer;)Z
    .locals 0

    invoke-static {p0, p1}, Ll/ܺ᩶ᩴ;->g(Ll/۠ۨᩴ;Ljava/util/function/Consumer;)Z

    move-result p1

    return p1
.end method
