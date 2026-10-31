.class public final Ll/ᩴۛۖ;
.super Ljava/lang/Object;
.source "B9E8"

# interfaces
.implements Ll/ۢ۟ۖ;


# virtual methods
.method public final read([B)Ll/ۚܰۖ;
    .locals 0

    .line 26
    new-instance p1, Ll/ۖۛۖ;

    invoke-direct {p1}, Ll/ۖۛۖ;-><init>()V

    throw p1
.end method

.method public final ֫([B)Z
    .locals 4

    .line 31
    array-length v0, p1

    const/4 v1, 0x4

    const/4 v2, 0x0

    if-lt v0, v1, :cond_0

    aget-byte v0, p1, v2

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    aget-byte v1, p1, v0

    const/16 v3, 0x53

    if-ne v1, v3, :cond_0

    const/4 v1, 0x2

    aget-byte v1, p1, v1

    const/16 v3, 0x4d

    if-ne v1, v3, :cond_0

    const/4 v1, 0x3

    aget-byte p1, p1, v1

    const/16 v1, 0x42

    if-ne p1, v1, :cond_0

    return v0

    :cond_0
    return v2
.end method
