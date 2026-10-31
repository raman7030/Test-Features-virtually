.class public final Ll/ۘܽ᩵;
.super Ll/ۖᩳ᩵;
.source "N673"

# interfaces
.implements Ll/ۤܽ᩵;


# instance fields
.field public final synthetic c:Ll/᩶ᩳ᩵;

.field public final synthetic d:Ljava/util/function/IntPredicate;


# direct methods
.method public constructor <init>(Ll/᩶ᩳ᩵;Ljava/util/function/IntPredicate;)V
    .locals 0

    .line 113
    iput-object p1, p0, Ll/ۘܽ᩵;->c:Ll/᩶ᩳ᩵;

    iput-object p2, p0, Ll/ۘܽ᩵;->d:Ljava/util/function/IntPredicate;

    .line 114
    invoke-direct {p0, p1}, Ll/ۖᩳ᩵;-><init>(Ll/᩶ᩳ᩵;)V

    return-void
.end method


# virtual methods
.method public final accept(I)V
    .locals 2

    .line 119
    iget-boolean v0, p0, Ll/ۖᩳ᩵;->a:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ۘܽ᩵;->d:Ljava/util/function/IntPredicate;

    invoke-interface {v0, p1}, Ljava/util/function/IntPredicate;->test(I)Z

    move-result p1

    .line 0
    iget-object v0, p0, Ll/ۘܽ᩵;->c:Ll/᩶ᩳ᩵;

    iget-boolean v1, v0, Ll/᩶ᩳ᩵;->a:Z

    if-ne p1, v1, :cond_0

    const/4 p1, 0x1

    .line 120
    iput-boolean p1, p0, Ll/ۖᩳ᩵;->a:Z

    .line 0
    iget-boolean p1, v0, Ll/᩶ᩳ᩵;->b:Z

    .line 121
    iput-boolean p1, p0, Ll/ۖᩳ᩵;->b:Z

    :cond_0
    return-void
.end method

.method public final bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Ll/ۡ᩺ᩴ;->q(Ll/ۤܽ᩵;Ljava/lang/Object;)V

    return-void
.end method

.method public final synthetic andThen(Ljava/util/function/IntConsumer;)Ljava/util/function/IntConsumer;
    .locals 0

    invoke-static {p0, p1}, Ll/ۢۛᩴ;->$default$andThen(Ljava/util/function/IntConsumer;Ljava/util/function/IntConsumer;)Ljava/util/function/IntConsumer;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic d(Ljava/lang/Integer;)V
    .locals 0

    invoke-static {p0, p1}, Ll/ۡ᩺ᩴ;->p(Ll/ۤܽ᩵;Ljava/lang/Integer;)V

    return-void
.end method
