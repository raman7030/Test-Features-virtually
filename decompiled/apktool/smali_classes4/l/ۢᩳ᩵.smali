.class public abstract Ll/ۢᩳ᩵;
.super Ll/ۨܿ᩵;
.source "N673"

# interfaces
.implements Ljava/util/function/IntConsumer;
.implements Ll/ᩴ۫ᩴ;


# instance fields
.field public final e:Ljava/util/function/IntPredicate;

.field public f:I


# direct methods
.method public constructor <init>(Ll/ᩴ۫ᩴ;Ljava/util/function/IntPredicate;)V
    .locals 0

    .line 828
    invoke-direct {p0, p1}, Ll/ۨܿ᩵;-><init>(Ll/ܶ۫ᩴ;)V

    .line 829
    iput-object p2, p0, Ll/ۢᩳ᩵;->e:Ljava/util/function/IntPredicate;

    return-void
.end method

.method public constructor <init>(Ll/ᩴ۫ᩴ;Ll/ۢᩳ᩵;)V
    .locals 0

    .line 833
    invoke-direct {p0, p1, p2}, Ll/ۨܿ᩵;-><init>(Ll/ܶ۫ᩴ;Ll/ۨܿ᩵;)V

    .line 834
    iget-object p1, p2, Ll/ۢᩳ᩵;->e:Ljava/util/function/IntPredicate;

    iput-object p1, p0, Ll/ۢᩳ᩵;->e:Ljava/util/function/IntPredicate;

    return-void
.end method


# virtual methods
.method public final accept(I)V
    .locals 1

    .line 839
    iget v0, p0, Ll/ۨܿ᩵;->d:I

    add-int/lit8 v0, v0, 0x1

    and-int/lit8 v0, v0, 0x3f

    iput v0, p0, Ll/ۨܿ᩵;->d:I

    .line 840
    iput p1, p0, Ll/ۢᩳ᩵;->f:I

    return-void
.end method

.method public final synthetic andThen(Ljava/util/function/IntConsumer;)Ljava/util/function/IntConsumer;
    .locals 0

    invoke-static {p0, p1}, Ll/ۢۛᩴ;->$default$andThen(Ljava/util/function/IntConsumer;Ljava/util/function/IntConsumer;)Ljava/util/function/IntConsumer;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic forEachRemaining(Ljava/lang/Object;)V
    .locals 0

    .line 650
    check-cast p1, Ljava/util/function/IntConsumer;

    invoke-virtual {p0, p1}, Ll/ۢᩳ᩵;->forEachRemaining(Ljava/util/function/IntConsumer;)V

    return-void
.end method

.method public final synthetic forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 0

    invoke-static {p0, p1}, Ll/ۘ۫ᩴ;->a(Ll/ᩴ۫ᩴ;Ljava/util/function/Consumer;)V

    return-void
.end method

.method public final synthetic forEachRemaining(Ljava/util/function/IntConsumer;)V
    .locals 0

    invoke-static {p0, p1}, Ll/ۘ۫ᩴ;->$default$forEachRemaining(Ll/ᩴ۫ᩴ;Ljava/util/function/IntConsumer;)V

    return-void
.end method

.method public bridge synthetic tryAdvance(Ljava/lang/Object;)Z
    .locals 0

    .line 885
    check-cast p1, Ljava/util/function/IntConsumer;

    invoke-interface {p0, p1}, Ll/ᩴ۫ᩴ;->tryAdvance(Ljava/util/function/IntConsumer;)Z

    move-result p1

    return p1
.end method

.method public final synthetic tryAdvance(Ljava/util/function/Consumer;)Z
    .locals 0

    invoke-static {p0, p1}, Ll/ۘ۫ᩴ;->b(Ll/ᩴ۫ᩴ;Ljava/util/function/Consumer;)Z

    move-result p1

    return p1
.end method
