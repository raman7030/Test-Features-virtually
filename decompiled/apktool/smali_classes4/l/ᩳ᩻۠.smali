.class public Ll/ᩳ᩻۠;
.super Ljava/lang/Object;
.source "643C"


# direct methods
.method public static ֫(II[B)[B
    .locals 4

    .line 149
    new-array v0, p1, [B

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_1

    add-int v2, p0, v1

    .line 151
    aget-byte v2, p2, v2

    const/16 v3, 0x2f

    if-ne v2, v3, :cond_0

    const/16 v2, 0x2e

    .line 152
    aput-byte v2, v0, v1

    goto :goto_1

    .line 153
    :cond_0
    aput-byte v2, v0, v1

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public static ֫(Ll/ۤܶ۠;)[B
    .locals 6

    .line 191
    invoke-virtual {p0}, Ll/ۤܶ۠;->֫()[B

    move-result-object v0

    invoke-virtual {p0}, Ll/ۤܶ۠;->ᩳ()I

    move-result v1

    invoke-virtual {p0}, Ll/ۤܶ۠;->ۧ()I

    move-result p0

    .line 175
    new-array v2, p0, [B

    const/4 v3, 0x0

    :goto_0
    if-ge v3, p0, :cond_1

    add-int v4, v1, v3

    .line 177
    aget-byte v4, v0, v4

    const/16 v5, 0x2e

    if-ne v4, v5, :cond_0

    const/16 v4, 0x2f

    .line 178
    aput-byte v4, v2, v3

    goto :goto_1

    .line 179
    :cond_0
    aput-byte v4, v2, v3

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return-object v2
.end method
