.class public final Ll/ᩳ۟ۡ;
.super Ljava/lang/Object;
.source "0AR8"


# direct methods
.method public static ֫(IJ)I
    .locals 5

    long-to-int v0, p1

    int-to-long v1, v0

    const-string v3, "integer overflow"

    cmp-long v4, v1, p1

    if-nez v4, :cond_1

    add-int p1, p0, v0

    xor-int/2addr p0, p1

    xor-int p2, v0, p1

    and-int/2addr p0, p2

    if-ltz p0, :cond_0

    return p1

    .line 25
    :cond_0
    new-instance p0, Ljava/lang/ArithmeticException;

    invoke-direct {p0, v3}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 32
    :cond_1
    new-instance p0, Ljava/lang/ArithmeticException;

    invoke-direct {p0, v3}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
