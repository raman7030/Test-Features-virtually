.class public final Ll/ۢ᩶۠;
.super Ljava/lang/Object;
.source "17L3"


# static fields
.field public static final ֫:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x4

    new-array v0, v0, [B

    .line 42
    fill-array-data v0, :array_0

    sput-object v0, Ll/ۢ᩶۠;->֫:[B

    return-void

    nop

    :array_0
    .array-data 1
        0x4at
        0x4dt
        0x1t
        0x0t
    .end array-data
.end method

.method public static ֫(Ll/᩷۠ᩴ;)V
    .locals 7

    const-string v0, "Invalid JMOD file: "

    const-string v1, "Unsupported jmod version: "

    const/4 v2, 0x0

    new-array v3, v2, [Ll/᩻۠ᩴ;

    .line 48
    invoke-static {p0, v3}, Ll/ܿ۠ᩴ;->newInputStream(Ll/᩷۠ᩴ;[Ll/᩻۠ᩴ;)Ljava/io/InputStream;

    move-result-object v3

    const/4 v4, 0x4

    :try_start_0
    new-array v5, v4, [B

    .line 2064
    invoke-static {v3, v5, v4}, Ll/᩹ۢ֡;->ۧ(Ljava/io/InputStream;[BI)V

    .line 54
    aget-byte v4, v5, v2

    sget-object v6, Ll/ۢ᩶۠;->֫:[B

    aget-byte v2, v6, v2

    if-ne v4, v2, :cond_3

    const/4 v2, 0x1

    aget-byte v4, v5, v2

    aget-byte v6, v6, v2

    if-ne v4, v6, :cond_3

    const/4 v0, 0x2

    .line 58
    aget-byte v4, v5, v0

    const/4 v6, 0x3

    if-gt v4, v2, :cond_2

    if-ne v4, v2, :cond_0

    aget-byte v2, v5, v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-gtz v2, :cond_2

    :cond_0
    if-eqz v3, :cond_1

    .line 63
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V

    :cond_1
    return-void

    .line 60
    :cond_2
    :try_start_1
    new-instance v2, Ljava/io/IOException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    aget-byte v0, v5, v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "."

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-byte v0, v5, v6

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " in "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    invoke-interface {p0}, Ll/᩷۠ᩴ;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v2, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 56
    :cond_3
    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p0}, Ll/᩷۠ᩴ;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p0

    if-eqz v3, :cond_4

    .line 48
    :try_start_2
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_4
    :goto_0
    throw p0
.end method
