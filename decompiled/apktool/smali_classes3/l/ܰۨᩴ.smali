.class public final synthetic Ll/ܰۨᩴ;
.super Ljava/lang/Object;
.source "N673"


# direct methods
.method public static of(I)Ll/ۧ᩺ᩴ;
    .locals 1

    .line 870
    new-instance v0, Ll/ۢܽ᩵;

    .line 291
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 437
    iput p0, v0, Ll/ۢܽ᩵;->b:I

    const/4 p0, -0x2

    .line 438
    iput p0, v0, Ll/ܰۧ᩵;->a:I

    .line 870
    invoke-static {v0}, Ll/ܳ᩺ᩴ;->a(Ll/ᩴ۫ᩴ;)Ll/ۢܳ᩵;

    move-result-object p0

    return-object p0
.end method

.method public static range(II)Ll/ۧ᩺ᩴ;
    .locals 1

    if-lt p0, p1, :cond_0

    .line 860
    sget-object p0, Ll/᩹۫ᩴ;->b:Ll/ۧۛᩴ;

    invoke-static {p0}, Ll/ܳ᩺ᩴ;->a(Ll/ᩴ۫ᩴ;)Ll/ۢܳ᩵;

    move-result-object p0

    return-object p0

    .line 1045
    :cond_0
    new-instance v0, Ll/ܶܽ᩵;

    .line 65
    invoke-direct {v0, p0, p1}, Ll/ܶܽ᩵;-><init>(II)V

    .line 1045
    invoke-static {v0}, Ll/ܳ᩺ᩴ;->a(Ll/ᩴ۫ᩴ;)Ll/ۢܳ᩵;

    move-result-object p0

    return-object p0
.end method
