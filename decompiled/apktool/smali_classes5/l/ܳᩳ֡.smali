.class public final Ll/ܳᩳ֡;
.super Ll/ۙܽ֡;
.source "J4DP"


# instance fields
.field public final synthetic ۡ:Ljava/net/Socket;


# direct methods
.method public constructor <init>(Ljava/net/Socket;)V
    .locals 0

    .line 230
    iput-object p1, p0, Ll/ܳᩳ֡;->ۡ:Ljava/net/Socket;

    invoke-direct {p0}, Ll/ۙܽ֡;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2

    .line 232
    new-instance v0, Ljava/net/SocketTimeoutException;

    const-string v1, "timeout"

    invoke-direct {v0, v1}, Ljava/net/SocketTimeoutException;-><init>(Ljava/lang/String;)V

    if-eqz p1, :cond_0

    .line 234
    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    :cond_0
    return-object v0
.end method

.method public final ᩷()V
    .locals 6

    const-string v0, "Failed to close timed out socket "

    .line 241
    iget-object v1, p0, Ll/ܳᩳ֡;->ۡ:Ljava/net/Socket;

    :try_start_0
    invoke-virtual {v1}, Ljava/net/Socket;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v2

    .line 262
    invoke-virtual {v2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 263
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    const-string v4, "getsockname failed"

    invoke-virtual {v3, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 248
    sget-object v3, Ll/᩻ᩳ֡;->ۧ:Ljava/util/logging/Logger;

    sget-object v4, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v4, v0, v2}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 250
    :cond_0
    throw v2

    :catch_1
    move-exception v2

    .line 243
    sget-object v3, Ll/᩻ᩳ֡;->ۧ:Ljava/util/logging/Logger;

    sget-object v4, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v4, v0, v2}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
