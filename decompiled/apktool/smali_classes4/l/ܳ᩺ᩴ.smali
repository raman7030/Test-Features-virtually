.class public final Ll/ܳ᩺ᩴ;
.super Ljava/lang/Object;
.source "N673"


# direct methods
.method public static a(Ll/ᩴ۫ᩴ;)Ll/ۢܳ᩵;
    .locals 3

    .line 138
    new-instance v0, Ll/ۢܳ᩵;

    .line 139
    invoke-static {p0}, Ll/۟۟ᩴ;->n(Ll/ܶ۫ᩴ;)I

    move-result v1

    const/4 v2, 0x0

    .line 80
    invoke-direct {v0, p0, v1, v2}, Ll/۫᩺ᩴ;-><init>(Ll/ܶ۫ᩴ;IZ)V

    return-object v0
.end method

.method public static stream(Ll/ܶ۫ᩴ;Z)Ll/ܿ᩺ᩴ;
    .locals 2

    .line 68
    invoke-static {p0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    new-instance v0, Ll/᩺۟ᩴ;

    .line 70
    invoke-static {p0}, Ll/۟۟ᩴ;->n(Ll/ܶ۫ᩴ;)I

    move-result v1

    .line 84
    invoke-direct {v0, p0, v1, p1}, Ll/۫᩺ᩴ;-><init>(Ll/ܶ۫ᩴ;IZ)V

    return-object v0
.end method
