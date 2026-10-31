.class public final Ll/᩸ۢۘ;
.super Ljava/lang/Object;
.source "S7ZM"


# static fields
.field public static ۜ:Ljava/net/InetAddress;

.field public static ᩷:Ljava/util/Vector;


# instance fields
.field public ֫:Ljava/net/InetAddress;

.field public ۧ:Ljava/lang/String;

.field public ܳ:Ljava/net/ServerSocket;

.field public ܽ:I

.field public ܿ:Ll/۟ۢۘ;

.field public ᩳ:I

.field public ᩻:Ll/ܶۢۘ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 38
    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    sput-object v0, Ll/᩸ۢۘ;->᩷:Ljava/util/Vector;

    const/4 v0, 0x0

    .line 39
    sput-object v0, Ll/᩸ۢۘ;->ۜ:Ljava/net/InetAddress;

    :try_start_0
    const-string v0, "0.0.0.0"

    .line 48
    invoke-static {v0}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object v0

    sput-object v0, Ll/᩸ۢۘ;->ۜ:Ljava/net/InetAddress;
    :try_end_0
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public static ֫(Ll/۟ۢۘ;Ljava/lang/String;ILjava/lang/String;I)Ll/᩸ۢۘ;
    .locals 8

    if-eqz p1, :cond_2

    .line 128
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "*"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "localhost"

    .line 130
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string p1, "127.0.0.1"

    goto :goto_1

    :cond_1
    :goto_0
    const-string p1, "0.0.0.0"

    .line 108
    :cond_2
    :goto_1
    :try_start_0
    invoke-static {p1}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object v1
    :try_end_0
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_1

    .line 112
    sget-object v0, Ll/᩸ۢۘ;->᩷:Ljava/util/Vector;

    monitor-enter v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 113
    :goto_2
    :try_start_1
    sget-object v4, Ll/᩸ۢۘ;->᩷:Ljava/util/Vector;

    invoke-virtual {v4}, Ljava/util/Vector;->size()I

    move-result v5

    if-ge v3, v5, :cond_6

    .line 114
    invoke-virtual {v4, v3}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩸ۢۘ;

    .line 115
    iget-object v6, v5, Ll/᩸ۢۘ;->ܿ:Ll/۟ۢۘ;

    if-ne v6, p0, :cond_5

    iget v6, v5, Ll/᩸ۢۘ;->ܽ:I

    if-ne v6, p2, :cond_5

    .line 116
    sget-object v6, Ll/᩸ۢۘ;->ۜ:Ljava/net/InetAddress;

    if-eqz v6, :cond_3

    iget-object v7, v5, Ll/᩸ۢۘ;->֫:Ljava/net/InetAddress;

    .line 117
    invoke-virtual {v7, v6}, Ljava/net/InetAddress;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_4

    :cond_3
    iget-object v6, v5, Ll/᩸ۢۘ;->֫:Ljava/net/InetAddress;

    .line 118
    invoke-virtual {v6, v1}, Ljava/net/InetAddress;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    .line 119
    :cond_4
    monitor-exit v0

    goto :goto_3

    :cond_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 122
    :cond_6
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v5, 0x0

    :goto_3
    if-nez v5, :cond_8

    .line 143
    new-instance v0, Ll/᩸ۢۘ;

    .line 178
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 179
    iput-object p0, v0, Ll/᩸ۢۘ;->ܿ:Ll/۟ۢۘ;

    .line 180
    iput p2, v0, Ll/᩸ۢۘ;->ܽ:I

    .line 181
    iput-object p3, v0, Ll/᩸ۢۘ;->ۧ:Ljava/lang/String;

    .line 182
    iput p4, v0, Ll/᩸ۢۘ;->ᩳ:I

    .line 74
    :try_start_2
    invoke-static {p1}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object p0

    iput-object p0, v0, Ll/᩸ۢۘ;->֫:Ljava/net/InetAddress;

    .line 75
    new-instance p0, Ljava/net/ServerSocket;

    iget-object p3, v0, Ll/᩸ۢۘ;->֫:Ljava/net/InetAddress;

    invoke-direct {p0, p2, v2, p3}, Ljava/net/ServerSocket;-><init>(IILjava/net/InetAddress;)V

    .line 76
    iput-object p0, v0, Ll/᩸ۢۘ;->ܳ:Ljava/net/ServerSocket;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    if-nez p2, :cond_7

    .line 82
    invoke-virtual {p0}, Ljava/net/ServerSocket;->getLocalPort()I

    move-result p0

    const/4 p1, -0x1

    if-eq p0, p1, :cond_7

    .line 84
    iput p0, v0, Ll/᩸ۢۘ;->ܽ:I

    .line 144
    :cond_7
    invoke-virtual {v4, v0}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    return-object v0

    :catch_0
    move-exception p0

    .line 78
    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "PortForwardingL: local port "

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ":"

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " cannot be bound."

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 79
    new-instance p2, Ll/۫᩷ۘ;

    .line 43
    invoke-direct {p2, p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 79
    throw p2

    .line 140
    :cond_8
    new-instance p0, Ll/۫᩷ۘ;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "PortForwardingL: local port "

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ":"

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " is already registered."

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 39
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 140
    throw p0

    :catchall_0
    move-exception p0

    .line 123
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p0

    :catch_1
    move-exception p0

    .line 110
    new-instance p2, Ll/۫᩷ۘ;

    const-string p3, "PortForwardingL: invalid address "

    const-string p4, " specified."

    .line 0
    invoke-static {p3, p1, p4}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 43
    invoke-direct {p2, p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 110
    throw p2
.end method

.method public static ֫(Ll/۟ۢۘ;)V
    .locals 8

    .line 160
    sget-object v1, Ll/᩸ۢۘ;->᩷:Ljava/util/Vector;

    move-object v0, v1

    monitor-enter v0

    .line 161
    :try_start_0
    invoke-virtual {v1}, Ljava/util/Vector;->size()I

    move-result v1

    new-array v1, v1, [Ll/᩸ۢۘ;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 163
    :goto_0
    sget-object v5, Ll/᩸ۢۘ;->᩷:Ljava/util/Vector;

    invoke-virtual {v5}, Ljava/util/Vector;->size()I

    move-result v6

    if-ge v3, v6, :cond_2

    .line 164
    invoke-virtual {v5, v3}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩸ۢۘ;

    .line 165
    iget-object v6, v5, Ll/᩸ۢۘ;->ܿ:Ll/۟ۢۘ;

    if-ne v6, p0, :cond_1

    const/4 v6, 0x0

    .line 260
    iput-object v6, v5, Ll/᩸ۢۘ;->᩻:Ll/ܶۢۘ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 262
    :try_start_1
    iget-object v7, v5, Ll/᩸ۢۘ;->ܳ:Ljava/net/ServerSocket;

    if-eqz v7, :cond_0

    .line 263
    invoke-virtual {v7}, Ljava/net/ServerSocket;->close()V

    .line 264
    :cond_0
    iput-object v6, v5, Ll/᩸ۢۘ;->ܳ:Ljava/net/ServerSocket;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catch_0
    add-int/lit8 v6, v4, 0x1

    .line 167
    :try_start_2
    aput-object v5, v1, v4

    move v4, v6

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    if-ge v2, v4, :cond_3

    .line 171
    aget-object p0, v1, v2

    .line 172
    sget-object v3, Ll/᩸ۢۘ;->᩷:Ljava/util/Vector;

    invoke-virtual {v3, p0}, Ljava/util/Vector;->removeElement(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 174
    :cond_3
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p0
.end method
