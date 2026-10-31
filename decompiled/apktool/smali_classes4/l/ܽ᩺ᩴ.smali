.class public final synthetic Ll/ܽ᩺ᩴ;
.super Ljava/lang/Object;
.source "N673"


# direct methods
.method public static empty()Ll/ܿ᩺ᩴ;
    .locals 2

    .line 1183
    sget-object v0, Ll/᩹۫ᩴ;->a:Ll/۟ۛᩴ;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ll/ܳ᩺ᩴ;->stream(Ll/ܶ۫ᩴ;Z)Ll/ܿ᩺ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public static of(Ljava/lang/Object;)Ll/ܿ᩺ᩴ;
    .locals 1

    .line 1194
    new-instance v0, Ll/᩺ܽ᩵;

    .line 291
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 341
    iput-object p0, v0, Ll/᩺ܽ᩵;->b:Ljava/lang/Object;

    const/4 p0, -0x2

    .line 342
    iput p0, v0, Ll/ܰۧ᩵;->a:I

    const/4 p0, 0x0

    .line 1194
    invoke-static {v0, p0}, Ll/ܳ᩺ᩴ;->stream(Ll/ܶ۫ᩴ;Z)Ll/ܿ᩺ᩴ;

    move-result-object p0

    return-object p0
.end method

.method public static varargs of([Ljava/lang/Object;)Ll/ܿ᩺ᩴ;
    .locals 0

    .line 1222
    invoke-static {p0}, Ll/᩹۬ᩴ;->stream([Ljava/lang/Object;)Ll/ܿ᩺ᩴ;

    move-result-object p0

    return-object p0
.end method
