.class public final Ll/۠۫ۡ;
.super Ljava/lang/Object;
.source "P9RB"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫(Ljava/lang/String;)[B
    .locals 4

    .line 34
    const-class v0, Ll/۠۫ۡ;

    invoke-virtual {v0, p0}, Ljava/lang/Class;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object p0

    const/4 v0, 0x4

    :try_start_0
    new-array v1, v0, [B

    .line 2064
    invoke-static {p0, v1, v0}, Ll/᩹ۢ֡;->ۧ(Ljava/io/InputStream;[BI)V

    const/4 v0, 0x0

    .line 16
    invoke-static {v0, v1}, Ll/ܺܰۡ;->֫(I[B)I

    move-result v1

    const v2, -0x479d9e05

    if-ne v1, v2, :cond_2

    .line 51
    invoke-static {p0, v0}, Ll/֡ۤۡ;->֫(Ljava/io/InputStream;I)[B

    move-result-object v1

    .line 21
    :goto_0
    array-length v2, v1

    if-ge v0, v2, :cond_0

    .line 23
    aget-byte v2, v1, v0

    array-length v3, v1

    div-int/lit8 v3, v3, 0x2

    xor-int/2addr v2, v3

    int-to-byte v2, v2

    aput-byte v2, v1, v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    if-eqz p0, :cond_1

    .line 26
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    :cond_1
    return-object v1

    .line 18
    :cond_2
    :try_start_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Bad magic"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    if-eqz p0, :cond_3

    .line 15
    :try_start_2
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p0

    invoke-virtual {v0, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_3
    :goto_1
    throw v0
.end method
