.class public final Ll/ۜ۫ۖ;
.super Ll/ۘ۬ۖ;
.source "Y9J1"


# virtual methods
.method public final ֫(Ll/ۨ۬ۖ;[B)Ll/ۚ۬ۖ;
    .locals 2

    .line 58
    array-length p1, p2

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-ne p1, v1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    array-length v1, p2

    if-eqz p1, :cond_2

    .line 59
    new-instance p1, Ll/ۢ۫ۖ;

    aget-byte v1, p2, v0

    if-eqz v1, :cond_1

    const/4 v0, 0x1

    :cond_1
    invoke-direct {p1, p2, v0}, Ll/ۢ۫ۖ;-><init>([BZ)V

    return-object p1

    .line 26
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Value of ASN1Boolean should have length 1, but was "

    .line 0
    invoke-static {v1, p2}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 26
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
