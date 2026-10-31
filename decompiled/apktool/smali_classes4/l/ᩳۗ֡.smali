.class public final Ll/ᩳۗ֡;
.super Ljava/lang/Object;
.source "G5CT"


# direct methods
.method public static ֫(Ljava/io/InputStream;I)[B
    .locals 4

    .line 127
    new-array v0, p1, [B

    const/4 v1, 0x0

    :goto_0
    if-lez p1, :cond_1

    .line 131
    invoke-virtual {p0, v0, v1, p1}, Ljava/io/InputStream;->read([BII)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_0

    add-int/2addr v1, v2

    sub-int/2addr p1, v2

    goto :goto_0

    .line 133
    :cond_0
    new-instance p0, Ljava/lang/RuntimeException;

    const-string p1, "unexpected EOF"

    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    return-object v0
.end method
