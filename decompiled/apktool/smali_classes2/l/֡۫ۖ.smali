.class public final Ll/֡۫ۖ;
.super Ll/ۘ۬ۖ;
.source "T9HK"


# virtual methods
.method public final ֫(Ll/ۨ۬ۖ;[B)Ll/ۚ۬ۖ;
    .locals 0

    .line 52
    array-length p1, p2

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    .line 53
    new-instance p1, Ll/֨۫ۖ;

    invoke-direct {p1}, Ll/֨۫ۖ;-><init>()V

    return-object p1

    .line 26
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "ASN.1 NULL can not have a value"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
