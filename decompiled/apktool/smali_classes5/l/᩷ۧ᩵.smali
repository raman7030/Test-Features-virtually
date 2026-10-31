.class public final Ll/᩷ۧ᩵;
.super Ll/֨ܳ᩵;
.source "N673"


# virtual methods
.method public final n0(Ll/ۡ᩺ᩴ;Ll/ܶ۫ᩴ;Ljava/util/function/IntFunction;)Ll/ۚ۟ᩴ;
    .locals 2

    .line 273
    sget-object v0, Ll/۟۟ᩴ;->SORTED:Ll/۟۟ᩴ;

    move-object v1, p1

    check-cast v1, Ll/۫᩺ᩴ;

    .line 509
    iget v1, v1, Ll/۫᩺ᩴ;->m:I

    .line 273
    invoke-virtual {v0, v1}, Ll/۟۟ᩴ;->s(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 274
    invoke-virtual {p1, p2, v0, p3}, Ll/ۡ᩺ᩴ;->Q(Ll/ܶ۫ᩴ;ZLjava/util/function/IntFunction;)Ll/ۚ۟ᩴ;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 v0, 0x1

    .line 277
    invoke-virtual {p1, p2, v0, p3}, Ll/ۡ᩺ᩴ;->Q(Ll/ܶ۫ᩴ;ZLjava/util/function/IntFunction;)Ll/ۚ۟ᩴ;

    move-result-object p1

    check-cast p1, Ll/۠᩺ᩴ;

    .line 279
    invoke-interface {p1}, Ll/᩻۟ᩴ;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [D

    .line 282
    invoke-static {p1}, Ljava/util/Arrays;->sort([D)V

    .line 275
    new-instance p2, Ll/ۘᩳ᩵;

    invoke-direct {p2, p1}, Ll/ۘᩳ᩵;-><init>([D)V

    return-object p2
.end method

.method public final q0(ILl/֡ᩳ᩵;)Ll/֡ᩳ᩵;
    .locals 1

    .line 259
    invoke-static {p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 261
    sget-object v0, Ll/۟۟ᩴ;->SORTED:Ll/۟۟ᩴ;

    invoke-virtual {v0, p1}, Ll/۟۟ᩴ;->s(I)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p2

    .line 263
    :cond_0
    sget-object v0, Ll/۟۟ᩴ;->SIZED:Ll/۟۟ᩴ;

    invoke-virtual {v0, p1}, Ll/۟۟ᩴ;->s(I)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 264
    new-instance p1, Ll/ۛܽ᩵;

    .line 627
    invoke-direct {p1, p2}, Ll/ۜۧ᩵;-><init>(Ll/֡ᩳ᩵;)V

    return-object p1

    .line 266
    :cond_1
    new-instance p1, Ll/ۢ֫᩵;

    .line 627
    invoke-direct {p1, p2}, Ll/ۜۧ᩵;-><init>(Ll/֡ᩳ᩵;)V

    return-object p1
.end method
