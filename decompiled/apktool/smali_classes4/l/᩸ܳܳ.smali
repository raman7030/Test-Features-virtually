.class public final Ll/᩸ܳܳ;
.super Ljava/lang/Object;
.source "27BS"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩶:Ll/ۙܳܳ;

.field public ᩸:Ljava/io/IOException;

.field public ᩹:Z


# direct methods
.method public constructor <init>(Ll/ۙܳܳ;)V
    .locals 0

    .line 2234
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩸ܳܳ;->᩶:Ll/ۙܳܳ;

    const/4 p1, 0x0

    .line 2232
    iput-boolean p1, p0, Ll/᩸ܳܳ;->᩹:Z

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩸ܳܳ;)Ljava/io/IOException;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩸ܳܳ;->᩸:Ljava/io/IOException;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/᩸ܳܳ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/᩸ܳܳ;->᩹:Z

    return p0
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 2242
    iget-object v0, p0, Ll/᩸ܳܳ;->᩶:Ll/ۙܳܳ;

    :try_start_0
    invoke-static {v0}, Ll/ۙܳܳ;->ۧ(Ll/ۙܳܳ;)Ljava/net/ServerSocket;

    move-result-object v1

    new-instance v2, Ljava/net/InetSocketAddress;

    invoke-static {v0}, Ll/ۙܳܳ;->֫(Ll/ۙܳܳ;)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/net/InetSocketAddress;-><init>(I)V

    invoke-virtual {v1, v2}, Ljava/net/ServerSocket;->bind(Ljava/net/SocketAddress;)V

    const/4 v1, 0x1

    .line 2243
    iput-boolean v1, p0, Ll/᩸ܳܳ;->᩹:Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2250
    :cond_0
    :try_start_1
    invoke-static {v0}, Ll/ۙܳܳ;->ۧ(Ll/ۙܳܳ;)Ljava/net/ServerSocket;

    move-result-object v1

    invoke-virtual {v1}, Ljava/net/ServerSocket;->accept()Ljava/net/Socket;

    move-result-object v1

    const/16 v2, 0x1388

    .line 2252
    invoke-virtual {v1, v2}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 2254
    invoke-virtual {v1}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    move-result-object v2

    .line 2255
    iget-object v3, v0, Ll/ۙܳܳ;->֫:Ll/᩻ܳܳ;

    .line 2488
    new-instance v4, Ll/ܽܳܳ;

    invoke-direct {v4, v0, v2, v1}, Ll/ܽܳܳ;-><init>(Ll/ۙܳܳ;Ljava/io/InputStream;Ljava/net/Socket;)V

    .line 2255
    invoke-virtual {v3, v4}, Ll/᩻ܳܳ;->ۧ(Ll/ܽܳܳ;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 2257
    :try_start_2
    invoke-static {}, Ll/ۙܳܳ;->ۢ()Ljava/util/logging/Logger;

    move-result-object v2

    sget-object v3, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    const-string v4, "Communication with the client broken"

    invoke-virtual {v2, v3, v4, v1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 2259
    :goto_0
    invoke-static {v0}, Ll/ۙܳܳ;->ۧ(Ll/ۙܳܳ;)Ljava/net/ServerSocket;

    move-result-object v1

    invoke-virtual {v1}, Ljava/net/ServerSocket;->isClosed()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_2

    :catch_1
    move-exception v1

    .line 2245
    iput-object v1, p0, Ll/᩸ܳܳ;->᩸:Ljava/io/IOException;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_1
    return-void

    .line 2262
    :goto_2
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "NanoHTTPD listener thread failed: port="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ll/ۙܳܳ;->֫(Ll/ۙܳܳ;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ", listeningPort="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2263
    invoke-virtual {v0}, Ll/ۙܳܳ;->֫()I

    move-result v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 2262
    invoke-static {v0, v1}, Ll/᩶ۘܽ;->ۧ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 2264
    instance-of v0, v1, Ljava/lang/Error;

    if-nez v0, :cond_2

    .line 2267
    instance-of v0, v1, Ljava/lang/RuntimeException;

    if-eqz v0, :cond_1

    .line 2268
    check-cast v1, Ljava/lang/RuntimeException;

    throw v1

    .line 2270
    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 2265
    :cond_2
    check-cast v1, Ljava/lang/Error;

    throw v1
.end method
