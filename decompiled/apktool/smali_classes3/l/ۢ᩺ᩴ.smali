.class public abstract Ll/ۢ᩺ᩴ;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ll/ۚ۟ᩴ;


# virtual methods
.method public a(I)Ll/ۚ۟ᩴ;
    .locals 0

    .line 104
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public final count()J
    .locals 2

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final e(ILjava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public final g(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public synthetic j(JJLjava/util/function/IntFunction;)Ll/ۚ۟ᩴ;
    .locals 0

    invoke-static/range {p0 .. p5}, Ll/ۡ᩺ᩴ;->F(Ll/ۚ۟ᩴ;JJLjava/util/function/IntFunction;)Ll/ۚ۟ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final m(Ljava/util/function/IntFunction;)[Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    .line 570
    invoke-interface {p1, v0}, Ljava/util/function/IntFunction;->apply(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/Object;

    return-object p1
.end method

.method public final synthetic o()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
