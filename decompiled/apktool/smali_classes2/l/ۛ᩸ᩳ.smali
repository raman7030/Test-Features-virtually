.class public final Ll/ۛ᩸ᩳ;
.super Ljava/lang/Object;
.source "O6UW"


# direct methods
.method public static ֫(I)I
    .locals 5

    const/4 v0, 0x4

    if-gt p0, v0, :cond_0

    const/16 p0, 0x8

    return p0

    :cond_0
    int-to-long v0, p0

    const-wide/16 v2, 0x2

    mul-long v0, v0, v2

    long-to-int p0, v0

    int-to-long v2, p0

    cmp-long v4, v0, v2

    if-nez v4, :cond_1

    return p0

    .line 0
    :cond_1
    new-instance p0, Ljava/lang/ArithmeticException;

    invoke-direct {p0}, Ljava/lang/ArithmeticException;-><init>()V

    throw p0
.end method
