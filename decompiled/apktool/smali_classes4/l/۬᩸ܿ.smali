.class public final Ll/۬᩸ܿ;
.super Ljava/lang/Object;
.source "D99I"

# interfaces
.implements Ll/ۙ᩸ܿ;


# instance fields
.field public final ᩸:Ljava/net/Socket;


# direct methods
.method public constructor <init>(Ljava/net/Socket;)V
    .locals 3

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Ll/۬᩸ܿ;->᩸:Ljava/net/Socket;

    const/4 v0, 0x1

    .line 15
    :try_start_0
    invoke-virtual {p1, v0}, Ljava/net/Socket;->setTcpNoDelay(Z)V
    :try_end_0
    .catch Ljava/net/SocketException; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    :catch_0
    :try_start_1
    invoke-virtual {p1}, Ljava/net/Socket;->getSendBufferSize()I

    move-result v0

    const/16 v1, 0x400

    const/high16 v2, 0x40000

    if-lt v0, v1, :cond_0

    if-le v0, v2, :cond_1

    .line 22
    :cond_0
    invoke-virtual {p1, v2}, Ljava/net/Socket;->setSendBufferSize(I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :cond_1
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 61
    iget-object v0, p0, Ll/۬᩸ܿ;->᩸:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->close()V

    return-void
.end method

.method public final getInputStream()Ljava/io/InputStream;
    .locals 1

    .line 31
    iget-object v0, p0, Ll/۬᩸ܿ;->᩸:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method public final getOutputStream()Ljava/io/OutputStream;
    .locals 1

    .line 36
    iget-object v0, p0, Ll/۬᩸ܿ;->᩸:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v0

    return-object v0
.end method

.method public final getSendBufferSize()I
    .locals 2

    .line 41
    iget-object v0, p0, Ll/۬᩸ܿ;->᩸:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->getSendBufferSize()I

    move-result v0

    const/high16 v1, 0x40000

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    return v0
.end method

.method public final ۠()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ۨۧ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ᩴ֫()I
    .locals 1

    .line 56
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
