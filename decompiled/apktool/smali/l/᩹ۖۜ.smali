.class public final Ll/᩹ۖۜ;
.super Ljava/io/OutputStream;
.source "D6X3"


# instance fields
.field public final ᩸:Ljava/io/OutputStream;


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;)V
    .locals 0

    .line 2083
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    .line 2084
    iput-object p1, p0, Ll/᩹ۖۜ;->᩸:Ljava/io/OutputStream;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 2117
    :try_start_0
    iget-object v0, p0, Ll/᩹ۖۜ;->᩸:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 2119
    invoke-static {v0}, Ll/۬ۖۜ;->ۧ(Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0
.end method

.method public final flush()V
    .locals 1

    .line 2108
    :try_start_0
    iget-object v0, p0, Ll/᩹ۖۜ;->᩸:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 2110
    invoke-static {v0}, Ll/۬ۖۜ;->ۧ(Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0
.end method

.method public final write(I)V
    .locals 1

    .line 2090
    :try_start_0
    iget-object v0, p0, Ll/᩹ۖۜ;->᩸:Ljava/io/OutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 2092
    invoke-static {p1}, Ll/۬ۖۜ;->ۧ(Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1
.end method

.method public final write([BII)V
    .locals 1

    .line 2099
    :try_start_0
    iget-object v0, p0, Ll/᩹ۖۜ;->᩸:Ljava/io/OutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 2101
    invoke-static {p1}, Ll/۬ۖۜ;->ۧ(Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1
.end method
