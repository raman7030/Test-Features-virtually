.class public final Ll/ۙ᩶ܿ;
.super Ljava/lang/Object;
.source "B7G8"


# direct methods
.method public static ֫(Ljava/lang/String;[B)V
    .locals 3

    .line 31
    array-length v0, p1

    add-int/lit8 v0, v0, 0x1

    const/16 v1, 0x1001

    if-gt v0, v1, :cond_2

    .line 49
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-byte v2, p1, v1

    if-eqz v2, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 35
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string v0, " contains NUL"

    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    return-void

    .line 32
    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string v0, " too long"

    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
