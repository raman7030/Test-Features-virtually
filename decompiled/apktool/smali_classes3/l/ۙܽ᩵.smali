.class public final Ll/ۙܽ᩵;
.super Ll/ۖᩳ᩵;
.source "N673"

# interfaces
.implements Ll/ܳᩳ᩵;


# instance fields
.field public final synthetic c:Ll/᩶ᩳ᩵;

.field public final synthetic d:Ljava/util/function/LongPredicate;


# direct methods
.method public constructor <init>(Ll/᩶ᩳ᩵;Ljava/util/function/LongPredicate;)V
    .locals 0

    .line 143
    iput-object p1, p0, Ll/ۙܽ᩵;->c:Ll/᩶ᩳ᩵;

    iput-object p2, p0, Ll/ۙܽ᩵;->d:Ljava/util/function/LongPredicate;

    .line 144
    invoke-direct {p0, p1}, Ll/ۖᩳ᩵;-><init>(Ll/᩶ᩳ᩵;)V

    return-void
.end method


# virtual methods
.method public final accept(J)V
    .locals 1

    .line 149
    iget-boolean v0, p0, Ll/ۖᩳ᩵;->a:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ۙܽ᩵;->d:Ljava/util/function/LongPredicate;

    invoke-interface {v0, p1, p2}, Ljava/util/function/LongPredicate;->test(J)Z

    move-result p1

    .line 0
    iget-object p2, p0, Ll/ۙܽ᩵;->c:Ll/᩶ᩳ᩵;

    iget-boolean v0, p2, Ll/᩶ᩳ᩵;->a:Z

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    .line 150
    iput-boolean p1, p0, Ll/ۖᩳ᩵;->a:Z

    .line 0
    iget-boolean p1, p2, Ll/᩶ᩳ᩵;->b:Z

    .line 151
    iput-boolean p1, p0, Ll/ۖᩳ᩵;->b:Z

    :cond_0
    return-void
.end method

.method public final bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Ll/ۡ᩺ᩴ;->s(Ll/ܳᩳ᩵;Ljava/lang/Object;)V

    return-void
.end method

.method public final synthetic andThen(Ljava/util/function/LongConsumer;)Ljava/util/function/LongConsumer;
    .locals 0

    invoke-static {p0, p1}, Ll/ۖۛᩴ;->$default$andThen(Ljava/util/function/LongConsumer;Ljava/util/function/LongConsumer;)Ljava/util/function/LongConsumer;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic l(Ljava/lang/Long;)V
    .locals 0

    invoke-static {p0, p1}, Ll/ۡ᩺ᩴ;->r(Ll/ܳᩳ᩵;Ljava/lang/Long;)V

    return-void
.end method
