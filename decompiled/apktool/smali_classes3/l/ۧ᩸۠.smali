.class public final Ll/ۧ᩸۠;
.super Ljava/lang/Object;
.source "O3Z6"


# direct methods
.method public static ֫([CIZ)Ll/ܰܶ۠;
    .locals 7

    if-eqz p2, :cond_0

    .line 79
    new-instance p2, Ll/֫᩸۠;

    invoke-direct {p2, p1}, Ll/֫᩸۠;-><init>(I)V

    goto :goto_0

    :cond_0
    new-instance p2, Ll/۟ܶ۠;

    invoke-direct {p2}, Ll/۟ܶ۠;-><init>()V

    .line 156
    :goto_0
    new-array v0, p1, [I

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_1
    if-ge v2, p1, :cond_6

    add-int/lit8 v4, v3, 0x1

    .line 158
    aput v2, v0, v3

    .line 160
    :cond_1
    aget-char v3, p0, v2

    const/16 v5, 0xa

    const/16 v6, 0xd

    if-eq v3, v6, :cond_4

    if-ne v3, v5, :cond_2

    goto :goto_2

    :cond_2
    const/16 v5, 0x9

    if-ne v3, v5, :cond_3

    .line 169
    invoke-virtual {p2, v2}, Ll/۟ܶ۠;->ܽ(I)V

    :cond_3
    add-int/lit8 v2, v2, 0x1

    if-lt v2, p1, :cond_1

    goto :goto_3

    :cond_4
    :goto_2
    if-ne v3, v6, :cond_5

    add-int/lit8 v3, v2, 0x1

    if-ge v3, p1, :cond_5

    .line 162
    aget-char v3, p0, v3

    if-ne v3, v5, :cond_5

    add-int/lit8 v2, v2, 0x2

    goto :goto_3

    :cond_5
    add-int/lit8 v2, v2, 0x1

    :goto_3
    move v3, v4

    goto :goto_1

    .line 172
    :cond_6
    new-array p0, v3, [I

    iput-object p0, p2, Ll/۟ܶ۠;->ܽ:[I

    .line 173
    invoke-static {v0, v1, p0, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object p2
.end method
