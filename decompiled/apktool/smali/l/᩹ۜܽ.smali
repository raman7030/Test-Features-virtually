.class public final synthetic Ll/᩹ۜܽ;
.super Ljava/lang/Object;
.source "861N"


# direct methods
.method public static ֫(Ll/۬ۜܽ;I)V
    .locals 3

    .line 88
    invoke-virtual {p0}, Ll/۬ۜܽ;->ۛۧ()I

    move-result p0

    if-ne p0, p1, :cond_0

    return-void

    .line 90
    :cond_0
    new-instance v0, Ljava/io/IOException;

    .line 92
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 p1, 0x1

    aput-object p0, v1, p1

    const-string p0, "Expected: 0x%04x, got: 0x%04x"

    .line 91
    invoke-static {p0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ֫(Ll/᩶ۜܽ;I)V
    .locals 3

    .line 73
    invoke-interface {p0}, Ll/᩶ۜܽ;->readInt()I

    move-result p0

    if-ne p0, p1, :cond_0

    return-void

    .line 75
    :cond_0
    new-instance v0, Ljava/io/IOException;

    .line 76
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 p1, 0x1

    aput-object p0, v1, p1

    const-string p0, "Expected: 0x%08x, got: 0x%08x"

    .line 75
    invoke-static {p0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
