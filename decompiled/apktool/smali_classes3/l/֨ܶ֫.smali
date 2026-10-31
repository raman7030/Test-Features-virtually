.class public final Ll/֨ܶ֫;
.super Ll/ۖ۠֫;
.source "18M5"


# instance fields
.field public ۖ:Landroid/net/Uri;

.field public final ۜ:Ljava/net/DatagramPacket;

.field public ۡ:Ljava/net/DatagramSocket;

.field public ۢ:I

.field public ܳ:Ljava/net/MulticastSocket;

.field public final ܺ:I

.field public ܿ:Ljava/net/InetAddress;

.field public final ᩷:[B

.field public ᩻:Z


# direct methods
.method public constructor <init>()V
    .locals 4

    const/4 v0, 0x1

    .line 94
    invoke-direct {p0, v0}, Ll/ۖ۠֫;-><init>(Z)V

    const/16 v0, 0x1f40

    .line 95
    iput v0, p0, Ll/֨ܶ֫;->ܺ:I

    const/16 v0, 0x7d0

    new-array v1, v0, [B

    .line 96
    iput-object v1, p0, Ll/֨ܶ֫;->᩷:[B

    .line 97
    new-instance v2, Ljava/net/DatagramPacket;

    const/4 v3, 0x0

    invoke-direct {v2, v1, v3, v0}, Ljava/net/DatagramPacket;-><init>([BII)V

    iput-object v2, p0, Ll/֨ܶ֫;->ۜ:Ljava/net/DatagramPacket;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 3

    const/4 v0, 0x0

    .line 165
    iput-object v0, p0, Ll/֨ܶ֫;->ۖ:Landroid/net/Uri;

    .line 166
    iget-object v1, p0, Ll/֨ܶ֫;->ܳ:Ljava/net/MulticastSocket;

    if-eqz v1, :cond_0

    .line 168
    :try_start_0
    iget-object v2, p0, Ll/֨ܶ֫;->ܿ:Ljava/net/InetAddress;

    .line 155
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    invoke-virtual {v1, v2}, Ljava/net/MulticastSocket;->leaveGroup(Ljava/net/InetAddress;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 172
    :catch_0
    iput-object v0, p0, Ll/֨ܶ֫;->ܳ:Ljava/net/MulticastSocket;

    .line 174
    :cond_0
    iget-object v1, p0, Ll/֨ܶ֫;->ۡ:Ljava/net/DatagramSocket;

    if-eqz v1, :cond_1

    .line 175
    invoke-virtual {v1}, Ljava/net/DatagramSocket;->close()V

    .line 176
    iput-object v0, p0, Ll/֨ܶ֫;->ۡ:Ljava/net/DatagramSocket;

    .line 178
    :cond_1
    iput-object v0, p0, Ll/֨ܶ֫;->ܿ:Ljava/net/InetAddress;

    const/4 v0, 0x0

    .line 179
    iput v0, p0, Ll/֨ܶ֫;->ۢ:I

    .line 180
    iget-boolean v1, p0, Ll/֨ܶ֫;->᩻:Z

    if-eqz v1, :cond_2

    .line 181
    iput-boolean v0, p0, Ll/֨ܶ֫;->᩻:Z

    .line 182
    invoke-virtual {p0}, Ll/ۖ۠֫;->ܳ()V

    :cond_2
    return-void
.end method

.method public final read([BII)I
    .locals 2

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return p1

    .line 135
    :cond_0
    iget v0, p0, Ll/֨ܶ֫;->ۢ:I

    iget-object v1, p0, Ll/֨ܶ֫;->ۜ:Ljava/net/DatagramPacket;

    if-nez v0, :cond_1

    .line 138
    :try_start_0
    iget-object v0, p0, Ll/֨ܶ֫;->ۡ:Ljava/net/DatagramSocket;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    invoke-virtual {v0, v1}, Ljava/net/DatagramSocket;->receive(Ljava/net/DatagramPacket;)V
    :try_end_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 146
    invoke-virtual {v1}, Ljava/net/DatagramPacket;->getLength()I

    move-result v0

    iput v0, p0, Ll/֨ܶ֫;->ۢ:I

    .line 147
    invoke-virtual {p0, v0}, Ll/ۖ۠֫;->ᩳ(I)V

    goto :goto_0

    :catch_0
    move-exception p1

    .line 143
    new-instance p2, Ll/ۚܶ֫;

    const/16 p3, 0x7d1

    .line 49
    invoke-direct {p2, p3, p1}, Ll/᩹۠֫;-><init>(ILjava/lang/Exception;)V

    .line 143
    throw p2

    :catch_1
    move-exception p1

    .line 140
    new-instance p2, Ll/ۚܶ֫;

    const/16 p3, 0x7d2

    .line 49
    invoke-direct {p2, p3, p1}, Ll/᩹۠֫;-><init>(ILjava/lang/Exception;)V

    .line 140
    throw p2

    .line 150
    :cond_1
    :goto_0
    invoke-virtual {v1}, Ljava/net/DatagramPacket;->getLength()I

    move-result v0

    iget v1, p0, Ll/֨ܶ֫;->ۢ:I

    sub-int/2addr v0, v1

    .line 151
    invoke-static {v1, p3}, Ljava/lang/Math;->min(II)I

    move-result p3

    .line 152
    iget-object v1, p0, Ll/֨ܶ֫;->᩷:[B

    invoke-static {v1, v0, p1, p2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 153
    iget p1, p0, Ll/֨ܶ֫;->ۢ:I

    sub-int/2addr p1, p3

    iput p1, p0, Ll/֨ܶ֫;->ۢ:I

    return p3
.end method

.method public final ֫(Ll/ۗ۠֫;)J
    .locals 3

    .line 102
    iget-object v0, p1, Ll/ۗ۠֫;->ۜ:Landroid/net/Uri;

    iput-object v0, p0, Ll/֨ܶ֫;->ۖ:Landroid/net/Uri;

    .line 103
    invoke-virtual {v0}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v0

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    iget-object v1, p0, Ll/֨ܶ֫;->ۖ:Landroid/net/Uri;

    invoke-virtual {v1}, Landroid/net/Uri;->getPort()I

    move-result v1

    .line 105
    invoke-virtual {p0, p1}, Ll/ۖ۠֫;->ۧ(Ll/ۗ۠֫;)V

    .line 107
    :try_start_0
    invoke-static {v0}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object v0

    iput-object v0, p0, Ll/֨ܶ֫;->ܿ:Ljava/net/InetAddress;

    .line 108
    new-instance v0, Ljava/net/InetSocketAddress;

    iget-object v2, p0, Ll/֨ܶ֫;->ܿ:Ljava/net/InetAddress;

    invoke-direct {v0, v2, v1}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    .line 109
    iget-object v1, p0, Ll/֨ܶ֫;->ܿ:Ljava/net/InetAddress;

    invoke-virtual {v1}, Ljava/net/InetAddress;->isMulticastAddress()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 110
    new-instance v1, Ljava/net/MulticastSocket;

    invoke-direct {v1, v0}, Ljava/net/MulticastSocket;-><init>(Ljava/net/SocketAddress;)V

    iput-object v1, p0, Ll/֨ܶ֫;->ܳ:Ljava/net/MulticastSocket;

    .line 111
    iget-object v0, p0, Ll/֨ܶ֫;->ܿ:Ljava/net/InetAddress;

    invoke-virtual {v1, v0}, Ljava/net/MulticastSocket;->joinGroup(Ljava/net/InetAddress;)V

    .line 112
    iget-object v0, p0, Ll/֨ܶ֫;->ܳ:Ljava/net/MulticastSocket;

    iput-object v0, p0, Ll/֨ܶ֫;->ۡ:Ljava/net/DatagramSocket;

    goto :goto_0

    .line 114
    :cond_0
    new-instance v1, Ljava/net/DatagramSocket;

    invoke-direct {v1, v0}, Ljava/net/DatagramSocket;-><init>(Ljava/net/SocketAddress;)V

    iput-object v1, p0, Ll/֨ܶ֫;->ۡ:Ljava/net/DatagramSocket;

    .line 116
    :goto_0
    iget-object v0, p0, Ll/֨ܶ֫;->ۡ:Ljava/net/DatagramSocket;

    iget v1, p0, Ll/֨ܶ֫;->ܺ:I

    invoke-virtual {v0, v1}, Ljava/net/DatagramSocket;->setSoTimeout(I)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    .line 124
    iput-boolean v0, p0, Ll/֨ܶ֫;->᩻:Z

    .line 125
    invoke-virtual {p0, p1}, Ll/ۖ۠֫;->ܽ(Ll/ۗ۠֫;)V

    const-wide/16 v0, -0x1

    return-wide v0

    :catch_0
    move-exception p1

    .line 120
    new-instance v0, Ll/ۚܶ֫;

    const/16 v1, 0x7d1

    .line 49
    invoke-direct {v0, v1, p1}, Ll/᩹۠֫;-><init>(ILjava/lang/Exception;)V

    .line 120
    throw v0

    :catch_1
    move-exception p1

    .line 118
    new-instance v0, Ll/ۚܶ֫;

    const/16 v1, 0x7d6

    .line 49
    invoke-direct {v0, v1, p1}, Ll/᩹۠֫;-><init>(ILjava/lang/Exception;)V

    .line 118
    throw v0
.end method

.method public final ܿ()Landroid/net/Uri;
    .locals 1

    .line 160
    iget-object v0, p0, Ll/֨ܶ֫;->ۖ:Landroid/net/Uri;

    return-object v0
.end method
