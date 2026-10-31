.class public final Ll/ܽܳܳ;
.super Ljava/lang/Object;
.source "27BS"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩶:Ll/ۙܳܳ;

.field public final ᩸:Ljava/net/Socket;

.field public final ᩹:Ljava/io/InputStream;


# direct methods
.method public constructor <init>(Ll/ۙܳܳ;Ljava/io/InputStream;Ljava/net/Socket;)V
    .locals 0

    .line 171
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܽܳܳ;->᩶:Ll/ۙܳܳ;

    .line 172
    iput-object p2, p0, Ll/ܽܳܳ;->᩹:Ljava/io/InputStream;

    .line 173
    iput-object p3, p0, Ll/ܽܳܳ;->᩸:Ljava/net/Socket;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 183
    iget-object v0, p0, Ll/ܽܳܳ;->᩹:Ljava/io/InputStream;

    iget-object v7, p0, Ll/ܽܳܳ;->᩶:Ll/ۙܳܳ;

    iget-object v8, p0, Ll/ܽܳܳ;->᩸:Ljava/net/Socket;

    const/4 v1, 0x0

    .line 185
    :try_start_0
    invoke-virtual {v8}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v9
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 186
    :try_start_1
    invoke-static {v7}, Ll/ۙܳܳ;->ܽ(Ll/ۙܳܳ;)Ll/᩶ܳܳ;

    .line 466
    new-instance v3, Ll/ۢܳܳ;

    invoke-direct {v3}, Ll/ۢܳܳ;-><init>()V

    .line 187
    new-instance v10, Ll/ܺܳܳ;

    iget-object v4, p0, Ll/ܽܳܳ;->᩹:Ljava/io/InputStream;

    invoke-virtual {v8}, Ljava/net/Socket;->getInetAddress()Ljava/net/InetAddress;

    move-result-object v6

    move-object v1, v10

    move-object v2, v7

    move-object v5, v9

    invoke-direct/range {v1 .. v6}, Ll/ܺܳܳ;-><init>(Ll/ۙܳܳ;Ll/ۢܳܳ;Ljava/io/InputStream;Ljava/io/OutputStream;Ljava/net/InetAddress;)V

    .line 188
    :goto_0
    invoke-virtual {v8}, Ljava/net/Socket;->isClosed()Z

    move-result v1

    if-nez v1, :cond_1

    .line 189
    invoke-virtual {v10}, Ll/ܺܳܳ;->֫()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_2

    :catch_0
    move-exception v1

    goto :goto_1

    :catchall_1
    move-exception v2

    move-object v9, v1

    move-object v1, v2

    goto :goto_2

    :catch_1
    move-exception v2

    move-object v9, v1

    move-object v1, v2

    .line 199
    :goto_1
    :try_start_2
    nop

    instance-of v2, v1, Ljava/net/SocketException;

    if-eqz v2, :cond_0

    const-string v2, "NanoHttpd Shutdown"

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    :cond_0
    instance-of v2, v1, Ljava/net/SocketTimeoutException;

    if-nez v2, :cond_1

    .line 200
    invoke-static {}, Ll/ۙܳܳ;->ۢ()Ljava/util/logging/Logger;

    move-result-object v2

    sget-object v3, Ljava/util/logging/Level;->SEVERE:Ljava/util/logging/Level;

    const-string v4, "Communication with the client broken, or an bug in the handler code"

    invoke-virtual {v2, v3, v4, v1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 203
    :cond_1
    invoke-static {v9}, Ll/ۙܳܳ;->֫(Ljava/lang/Object;)V

    .line 204
    invoke-static {v0}, Ll/ۙܳܳ;->֫(Ljava/lang/Object;)V

    .line 205
    invoke-static {v8}, Ll/ۙܳܳ;->֫(Ljava/lang/Object;)V

    .line 206
    iget-object v0, v7, Ll/ۙܳܳ;->֫:Ll/᩻ܳܳ;

    invoke-virtual {v0, p0}, Ll/᩻ܳܳ;->֫(Ll/ܽܳܳ;)V

    return-void

    .line 203
    :goto_2
    invoke-static {v9}, Ll/ۙܳܳ;->֫(Ljava/lang/Object;)V

    .line 204
    invoke-static {v0}, Ll/ۙܳܳ;->֫(Ljava/lang/Object;)V

    .line 205
    invoke-static {v8}, Ll/ۙܳܳ;->֫(Ljava/lang/Object;)V

    .line 206
    iget-object v0, v7, Ll/ۙܳܳ;->֫:Ll/᩻ܳܳ;

    invoke-virtual {v0, p0}, Ll/᩻ܳܳ;->֫(Ll/ܽܳܳ;)V

    .line 207
    throw v1
.end method

.method public final ֫()V
    .locals 1

    .line 177
    iget-object v0, p0, Ll/ܽܳܳ;->᩹:Ljava/io/InputStream;

    invoke-static {v0}, Ll/ۙܳܳ;->֫(Ljava/lang/Object;)V

    .line 178
    iget-object v0, p0, Ll/ܽܳܳ;->᩸:Ljava/net/Socket;

    invoke-static {v0}, Ll/ۙܳܳ;->֫(Ljava/lang/Object;)V

    return-void
.end method
