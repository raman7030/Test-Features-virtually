.class public final Ll/ܺۖ֨;
.super Ll/ᩴۖ֨;
.source "P3JQ"


# virtual methods
.method public final ֫(Ll/۬ܺ֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 72
    check-cast p2, Ll/۬ܺ֨;

    if-eq p1, p2, :cond_0

    .line 77
    invoke-super {p0, p1, p2}, Ll/ᩴۖ֨;->֫(Ll/۬ܺ֨;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۘۖ֨;

    return-object p1

    .line 75
    :cond_0
    new-instance p1, Ll/ۖۖ֨;

    new-instance v0, Ll/ۘۖ֨;

    invoke-virtual {p0}, Ll/ᩴۖ֨;->֫()Ll/ۘۖ֨;

    move-result-object v1

    invoke-direct {v0, v1, p2}, Ll/ۘۖ֨;-><init>(Ll/ۘۖ֨;Ll/۬ܺ֨;)V

    .line 67
    invoke-direct {p1}, Ljava/lang/Error;-><init>()V

    .line 68
    iput-object v0, p1, Ll/ۖۖ֨;->᩸:Ll/ۘۖ֨;

    .line 75
    throw p1
.end method
