.class public final Ll/ܽۧ᩵;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ljava/util/function/IntFunction;
.implements Ljava/util/function/LongFunction;


# instance fields
.field public a:Ljava/util/function/IntFunction;


# virtual methods
.method public apply(I)Ljava/lang/Object;
    .locals 2

    .line 108
    iget-object v0, p0, Ll/ܽۧ᩵;->a:Ljava/util/function/IntFunction;

    invoke-interface {v0, p1}, Ljava/util/function/IntFunction;->apply(I)Ljava/lang/Object;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 98
    :cond_0
    instance-of v1, p1, Ll/ۧ᩺ᩴ;

    if-eqz v1, :cond_1

    .line 99
    check-cast p1, Ll/ۧ᩺ᩴ;

    invoke-static {p1}, Ll/֫᩺ᩴ;->convert(Ll/ۧ᩺ᩴ;)Ljava/util/stream/IntStream;

    move-result-object p1

    return-object p1

    .line 101
    :cond_1
    instance-of v1, p1, Ljava/util/stream/IntStream;

    if-eqz v1, :cond_2

    .line 102
    check-cast p1, Ljava/util/stream/IntStream;

    invoke-static {p1}, Ll/۟ۨᩴ;->convert(Ljava/util/stream/IntStream;)Ll/ۧ᩺ᩴ;

    move-result-object p1

    return-object p1

    :cond_2
    const-string v1, "java.util.stream.IntStream"

    .line 104
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1, v1}, Ll/ܽۛᩴ;->a(Ljava/lang/Object;Ljava/lang/String;)V

    throw v0
.end method

.method public apply(J)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ll/ܽۧ᩵;->a:Ljava/util/function/IntFunction;

    .line 2207
    invoke-static {p1, p2, v0}, Ll/ۡ᩺ᩴ;->G(JLjava/util/function/IntFunction;)Ll/ۡܳ᩵;

    move-result-object p1

    return-object p1
.end method
