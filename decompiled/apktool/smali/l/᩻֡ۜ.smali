.class public final Ll/᩻֡ۜ;
.super Ljava/lang/Object;
.source "O6L0"


# direct methods
.method public static ֫(Ll/ᩳۖۜ;Ll/۬ۖۜ;)Ljava/util/List;
    .locals 7

    .line 28
    new-instance v0, Ll/֡᩵ۜ;

    invoke-direct {v0, p0}, Ll/֡᩵ۜ;-><init>(Ll/ᩳۖۜ;)V

    .line 29
    new-instance v1, Ll/ܰ᩵ۜ;

    invoke-direct {v1, p0, p1}, Ll/ܰ᩵ۜ;-><init>(Ll/ᩳۖۜ;Ll/۬ۖۜ;)V

    .line 30
    new-instance v2, Ll/ۧ֡ۜ;

    .line 17
    invoke-direct {v2, v0}, Ll/ܿ֡ۜ;-><init>(Ll/֡᩵ۜ;)V

    .line 30
    new-instance v3, Ll/ᩳ֡ۜ;

    .line 17
    invoke-direct {v3, v0}, Ll/ܿ֡ۜ;-><init>(Ll/֡᩵ۜ;)V

    .line 30
    new-instance v4, Ll/ܽ֡ۜ;

    .line 17
    invoke-direct {v4, v0}, Ll/ܿ֡ۜ;-><init>(Ll/֡᩵ۜ;)V

    .line 30
    new-instance v5, Ll/ܳ֡ۜ;

    .line 15
    invoke-direct {v5, v0}, Ll/ܿ֡ۜ;-><init>(Ll/֡᩵ۜ;)V

    .line 30
    new-instance v0, Ll/֫֡ۜ;

    new-instance v6, Ll/ۢ᩵ۜ;

    invoke-direct {v6, p0, p1}, Ll/ۢ᩵ۜ;-><init>(Ll/ᩳۖۜ;Ll/۬ۖۜ;)V

    invoke-direct {v0, v6}, Ll/֫֡ۜ;-><init>(Ll/ۢ᩵ۜ;)V

    new-instance p0, Ll/۟᩵ۜ;

    invoke-direct {p0, v1}, Ll/۟᩵ۜ;-><init>(Ll/ܰ᩵ۜ;)V

    new-instance p1, Ll/ۜ֡ۜ;

    invoke-direct {p1, v1}, Ll/ۜ֡ۜ;-><init>(Ll/ܰ᩵ۜ;)V

    const/4 v1, 0x7

    new-array v1, v1, [Ll/ۙۛ᩻;

    const/4 v6, 0x0

    aput-object v2, v1, v6

    const/4 v2, 0x1

    aput-object v3, v1, v2

    const/4 v2, 0x2

    aput-object v4, v1, v2

    const/4 v2, 0x3

    aput-object v5, v1, v2

    const/4 v2, 0x4

    aput-object v0, v1, v2

    const/4 v0, 0x5

    aput-object p0, v1, v0

    const/4 p0, 0x6

    aput-object p1, v1, p0

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method
