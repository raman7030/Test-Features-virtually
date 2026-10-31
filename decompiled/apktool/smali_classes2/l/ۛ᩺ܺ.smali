.class public final Ll/ۛ᩺ܺ;
.super Ljava/lang/Object;
.source "365A"


# direct methods
.method public static ֫(J)I
    .locals 2

    const/16 v0, 0x20

    ushr-long v0, p0, v0

    xor-long/2addr p0, v0

    long-to-int p1, p0

    return p1
.end method

.method public static varargs ֫([[J)[J
    .locals 7

    .line 256
    array-length v0, p0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v0, :cond_0

    aget-object v5, p0, v4

    .line 257
    array-length v5, v5

    int-to-long v5, v5

    add-long/2addr v1, v5

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    long-to-int v0, v1

    int-to-long v4, v0

    cmp-long v6, v1, v4

    if-nez v6, :cond_1

    const/4 v4, 0x1

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    :goto_1
    const-string v5, "the total number of elements (%s) in the arrays must fit in an int"

    .line 269
    invoke-static {v1, v2, v5, v4}, Ll/ۘܶܺ;->֫(JLjava/lang/String;Z)V

    .line 259
    new-array v0, v0, [J

    .line 261
    array-length v1, p0

    const/4 v2, 0x0

    const/4 v4, 0x0

    :goto_2
    if-ge v2, v1, :cond_2

    aget-object v5, p0, v2

    .line 262
    array-length v6, v5

    invoke-static {v5, v3, v0, v4, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 263
    array-length v5, v5

    add-int/2addr v4, v5

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_2
    return-object v0
.end method
