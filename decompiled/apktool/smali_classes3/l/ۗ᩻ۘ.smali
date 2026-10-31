.class public final Ll/ۗ᩻ۘ;
.super Ll/᩵᩻ۘ;
.source "F7ZZ"


# static fields
.field public static ᩹:Ljava/util/Vector;


# instance fields
.field public ۠:Ll/᩹᩻ۘ;

.field public ܶ:Ll/ܺ᩷ۘ;

.field public ᩸:Ljava/net/Socket;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 35
    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    sput-object v0, Ll/ۗ᩻ۘ;->᩹:Ljava/util/Vector;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 48
    invoke-direct {p0}, Ll/᩵᩻ۘ;-><init>()V

    const/4 v0, 0x0

    .line 43
    iput-object v0, p0, Ll/ۗ᩻ۘ;->᩸:Ljava/net/Socket;

    .line 44
    iput-object v0, p0, Ll/ۗ᩻ۘ;->ܶ:Ll/ܺ᩷ۘ;

    .line 45
    iput-object v0, p0, Ll/ۗ᩻ۘ;->۠:Ll/᩹᩻ۘ;

    const/high16 v0, 0x20000

    .line 49
    iput v0, p0, Ll/᩵᩻ۘ;->᩷:I

    .line 50
    iput v0, p0, Ll/᩵᩻ۘ;->ۜ:I

    const/16 v0, 0x4000

    .line 51
    iput v0, p0, Ll/᩵᩻ۘ;->᩻:I

    .line 52
    new-instance v0, Ll/᩵᩷ۘ;

    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 52
    iput-object v0, p0, Ll/᩵᩻ۘ;->ܳ:Ll/᩵᩷ۘ;

    const/4 v0, 0x1

    .line 53
    iput-boolean v0, p0, Ll/᩵᩻ۘ;->ܽ:Z

    return-void
.end method

.method public static ֫(Ll/۟ۢۘ;Ljava/lang/String;I)Ll/᩹᩻ۘ;
    .locals 5

    .line 155
    sget-object v0, Ll/ۗ᩻ۘ;->᩹:Ljava/util/Vector;

    monitor-enter v0

    const/4 v1, 0x0

    .line 156
    :goto_0
    :try_start_0
    sget-object v2, Ll/ۗ᩻ۘ;->᩹:Ljava/util/Vector;

    invoke-virtual {v2}, Ljava/util/Vector;->size()I

    move-result v3

    const/4 v4, 0x0

    if-ge v1, v3, :cond_3

    .line 157
    invoke-virtual {v2, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩹᩻ۘ;

    .line 158
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz p0, :cond_0

    goto :goto_1

    :cond_0
    if-eqz p2, :cond_1

    if-eqz p2, :cond_1

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    if-nez p1, :cond_2

    .line 166
    monitor-exit v0

    return-object v2

    .line 164
    :cond_2
    throw v4

    .line 168
    :cond_3
    monitor-exit v0

    return-object v4

    :catchall_0
    move-exception p0

    .line 169
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static ֫(Ll/۟ۢۘ;)V
    .locals 6

    .line 295
    sget-object v1, Ll/ۗ᩻ۘ;->᩹:Ljava/util/Vector;

    move-object v0, v1

    monitor-enter v0

    .line 296
    :try_start_0
    invoke-virtual {v1}, Ljava/util/Vector;->size()I

    move-result v1

    new-array v1, v1, [I

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 297
    :goto_0
    sget-object v4, Ll/ۗ᩻ۘ;->᩹:Ljava/util/Vector;

    invoke-virtual {v4}, Ljava/util/Vector;->size()I

    move-result v5

    if-ge v3, v5, :cond_0

    .line 298
    invoke-virtual {v4, v3}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩹᩻ۘ;

    .line 299
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 303
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    if-gez v2, :cond_1

    .line 305
    aget v0, v1, v2

    invoke-static {p0, v0}, Ll/ۗ᩻ۘ;->֫(Ll/۟ۢۘ;I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return-void

    :catchall_0
    move-exception p0

    .line 303
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static ֫(Ll/۟ۢۘ;I)V
    .locals 5

    .line 256
    sget-object v1, Ll/ۗ᩻ۘ;->᩹:Ljava/util/Vector;

    move-object v0, v1

    monitor-enter v0

    :try_start_0
    const-string v2, "localhost"

    .line 257
    invoke-static {p0, v2, p1}, Ll/ۗ᩻ۘ;->֫(Ll/۟ۢۘ;Ljava/lang/String;I)Ll/᩹᩻ۘ;

    move-result-object v2

    if-nez v2, :cond_0

    const/4 v2, 0x0

    .line 259
    invoke-static {p0, v2, p1}, Ll/ۗ᩻ۘ;->֫(Ll/۟ۢۘ;Ljava/lang/String;I)Ll/᩹᩻ۘ;

    move-result-object v2

    :cond_0
    if-nez v2, :cond_1

    .line 261
    monitor-exit v0

    return-void

    .line 262
    :cond_1
    invoke-virtual {v1, v2}, Ljava/util/Vector;->removeElement(Ljava/lang/Object;)Z

    const-string v1, "0.0.0.0"

    .line 269
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 271
    new-instance v0, Ll/ܺ᩻ۘ;

    const/16 v2, 0xc8

    invoke-direct {v0, v2}, Ll/ܺ᩻ۘ;-><init>(I)V

    .line 272
    new-instance v2, Ll/۠ۢۘ;

    invoke-direct {v2, v0}, Ll/۠ۢۘ;-><init>(Ll/ܺ᩻ۘ;)V

    .line 280
    :try_start_1
    invoke-virtual {v2}, Ll/۠ۢۘ;->֫()V

    const/16 v3, 0x50

    .line 281
    invoke-virtual {v0, v3}, Ll/ܺ᩻ۘ;->֫(B)V

    const-string v3, "cancel-tcpip-forward"

    .line 282
    sget-object v4, Ll/᩵ۡۘ;->ܽ:[B

    .line 397
    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 393
    invoke-virtual {v3, v4}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v3

    .line 282
    invoke-virtual {v0, v3}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    const/4 v3, 0x0

    .line 283
    invoke-virtual {v0, v3}, Ll/ܺ᩻ۘ;->֫(B)V

    .line 397
    invoke-static {v1, v4}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object v1

    .line 284
    invoke-virtual {v0, v1}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 285
    invoke-virtual {v0, p1}, Ll/ܺ᩻ۘ;->ۧ(I)V

    .line 286
    invoke-virtual {p0, v2}, Ll/۟ۢۘ;->ۧ(Ll/۠ۢۘ;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    return-void

    :catchall_0
    move-exception p0

    .line 269
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p0
.end method


# virtual methods
.method public final ֫(Ll/ܺ᩻ۘ;)V
    .locals 7

    .line 121
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v0

    invoke-virtual {p0, v0}, Ll/᩵᩻ۘ;->ۧ(I)V

    .line 122
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->ۢ()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Ll/᩵᩻ۘ;->ۧ(J)V

    .line 123
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v0

    .line 431
    iput v0, p0, Ll/᩵᩻ۘ;->ۘ:I

    .line 124
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object v0

    .line 125
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v1

    .line 126
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->᩷()[B

    .line 127
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->ܽ()I

    const/4 p1, 0x0

    .line 137
    :try_start_0
    invoke-virtual {p0}, Ll/᩵᩻ۘ;->᩻()Ll/۟ۢۘ;

    move-result-object v2
    :try_end_0
    .catch Ll/۫᩷ۘ; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object v2, p1

    .line 142
    :goto_0
    sget-object v3, Ll/᩵ۡۘ;->ܽ:[B

    .line 409
    array-length v3, v0

    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 405
    new-instance v5, Ljava/lang/String;

    const/4 v6, 0x0

    invoke-direct {v5, v0, v6, v3, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 142
    invoke-static {v2, v5, v1}, Ll/ۗ᩻ۘ;->֫(Ll/۟ۢۘ;Ljava/lang/String;I)Ll/᩹᩻ۘ;

    move-result-object v0

    iput-object v0, p0, Ll/ۗ᩻ۘ;->۠:Ll/᩹᩻ۘ;

    if-nez v0, :cond_0

    .line 144
    invoke-static {v2, p1, v1}, Ll/ۗ᩻ۘ;->֫(Ll/۟ۢۘ;Ljava/lang/String;I)Ll/᩹᩻ۘ;

    move-result-object p1

    iput-object p1, p0, Ll/ۗ᩻ۘ;->۠:Ll/᩹᩻ۘ;

    .line 146
    :cond_0
    iget-object p1, p0, Ll/ۗ᩻ۘ;->۠:Ll/᩹᩻ۘ;

    if-nez p1, :cond_1

    .line 3560
    iget-object p1, v2, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {p1}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object p1

    .line 147
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_1
    return-void
.end method

.method public final ۡ()V
    .locals 8

    const/4 v0, 0x1

    .line 59
    :try_start_0
    iget-object v1, p0, Ll/ۗ᩻ۘ;->۠:Ll/᩹᩻ۘ;

    instance-of v2, v1, Ll/᩶᩻ۘ;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    .line 62
    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-class v2, Ll/ܺ᩷ۘ;

    invoke-virtual {v1, v2}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v1

    .line 63
    invoke-virtual {v1, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܺ᩷ۘ;

    iput-object v1, p0, Ll/ۗ᩻ۘ;->ܶ:Ll/ܺ᩷ۘ;

    .line 65
    new-instance v1, Ljava/io/PipedOutputStream;

    invoke-direct {v1}, Ljava/io/PipedOutputStream;-><init>()V

    .line 66
    iget-object v2, p0, Ll/᩵᩻ۘ;->ܳ:Ll/᩵᩷ۘ;

    new-instance v3, Ll/ۘ᩻ۘ;

    const v4, 0x8000

    .line 609
    invoke-direct {v3, v1, v4}, Ll/ۖ᩻ۘ;-><init>(Ljava/io/PipedOutputStream;I)V

    .line 610
    iput-object v1, v3, Ll/ۘ᩻ۘ;->᩶:Ljava/io/PipedOutputStream;

    .line 62
    iput-object v3, v2, Ll/᩵᩷ۘ;->֫:Ljava/io/InputStream;

    .line 68
    iget-object v1, p0, Ll/ۗ᩻ۘ;->ܶ:Ll/ܺ᩷ۘ;

    invoke-virtual {p0}, Ll/᩵᩻ۘ;->ܳ()Ljava/io/InputStream;

    invoke-interface {v1}, Ll/ܺ᩷ۘ;->ܶ()V

    .line 69
    iget-object v1, p0, Ll/ۗ᩻ۘ;->ܶ:Ll/ܺ᩷ۘ;

    invoke-interface {v1}, Ll/ܺ᩷ۘ;->֡()V

    .line 70
    invoke-virtual {p0}, Ll/᩵᩻ۘ;->᩻()Ll/۟ۢۘ;

    move-result-object v1

    invoke-virtual {v1}, Ll/۟ۢۘ;->᩻()Ll/ۛۢۘ;

    move-result-object v1

    iget-object v2, p0, Ll/ۗ᩻ۘ;->ܶ:Ll/ܺ᩷ۘ;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Ljava/lang/Thread;

    invoke-direct {v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    goto :goto_0

    .line 72
    :cond_0
    check-cast v1, Ll/ۙ᩻ۘ;

    .line 74
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    const/16 v2, 0x2710

    invoke-static {v1, v2, v3}, Ll/᩵ۡۘ;->֫(IILjava/lang/String;)Ljava/net/Socket;

    move-result-object v1

    .line 75
    iput-object v1, p0, Ll/ۗ᩻ۘ;->᩸:Ljava/net/Socket;

    .line 76
    invoke-virtual {v1, v0}, Ljava/net/Socket;->setTcpNoDelay(Z)V

    .line 77
    iget-object v1, p0, Ll/᩵᩻ۘ;->ܳ:Ll/᩵᩷ۘ;

    iget-object v2, p0, Ll/ۗ᩻ۘ;->᩸:Ljava/net/Socket;

    invoke-virtual {v2}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    move-result-object v2

    .line 62
    iput-object v2, v1, Ll/᩵᩷ۘ;->֫:Ljava/io/InputStream;

    .line 78
    iget-object v1, p0, Ll/᩵᩻ۘ;->ܳ:Ll/᩵᩷ۘ;

    iget-object v2, p0, Ll/ۗ᩻ۘ;->᩸:Ljava/net/Socket;

    invoke-virtual {v2}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v2

    .line 44
    iput-object v2, v1, Ll/᩵᩷ۘ;->ۧ:Ljava/io/OutputStream;

    .line 80
    :goto_0
    invoke-virtual {p0}, Ll/᩵᩻ۘ;->ۖ()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 88
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iput-object v0, p0, Ll/᩵᩻ۘ;->֡:Ljava/lang/Thread;

    .line 89
    new-instance v1, Ll/ܺ᩻ۘ;

    iget v0, p0, Ll/᩵᩻ۘ;->ۘ:I

    invoke-direct {v1, v0}, Ll/ܺ᩻ۘ;-><init>(I)V

    .line 90
    new-instance v2, Ll/۠ۢۘ;

    invoke-direct {v2, v1}, Ll/۠ۢۘ;-><init>(Ll/ܺ᩻ۘ;)V

    .line 93
    :try_start_1
    invoke-virtual {p0}, Ll/᩵᩻ۘ;->᩻()Ll/۟ۢۘ;

    move-result-object v3

    .line 94
    :goto_1
    iget-object v0, p0, Ll/᩵᩻ۘ;->֡:Ljava/lang/Thread;

    if-eqz v0, :cond_3

    iget-object v0, p0, Ll/᩵᩻ۘ;->ܳ:Ll/᩵᩷ۘ;

    if-eqz v0, :cond_3

    iget-object v0, v0, Ll/᩵᩷ۘ;->֫:Ljava/io/InputStream;

    if-eqz v0, :cond_3

    .line 95
    iget-object v4, v1, Ll/ܺ᩻ۘ;->֫:[B

    array-length v5, v4

    const/16 v6, 0xe

    sub-int/2addr v5, v6

    invoke-virtual {v3}, Ll/۟ۢۘ;->ܽ()I

    move-result v7

    sub-int/2addr v5, v7

    invoke-virtual {v0, v4, v6, v5}, Ljava/io/InputStream;->read([BII)I

    move-result v4

    if-gtz v4, :cond_1

    .line 97
    invoke-virtual {p0}, Ll/᩵᩻ۘ;->ܽ()V

    goto :goto_2

    .line 100
    :cond_1
    invoke-virtual {v2}, Ll/۠ۢۘ;->֫()V

    const/16 v0, 0x5e

    .line 101
    invoke-virtual {v1, v0}, Ll/ܺ᩻ۘ;->֫(B)V

    .line 102
    iget v0, p0, Ll/᩵᩻ۘ;->ܺ:I

    invoke-virtual {v1, v0}, Ll/ܺ᩻ۘ;->ۧ(I)V

    .line 103
    invoke-virtual {v1, v4}, Ll/ܺ᩻ۘ;->ۧ(I)V

    .line 104
    invoke-virtual {v1, v4}, Ll/ܺ᩻ۘ;->ܽ(I)V

    move-object v0, p0

    .line 105
    monitor-enter v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 106
    :try_start_2
    iget-boolean v5, p0, Ll/᩵᩻ۘ;->֫:Z

    if-eqz v5, :cond_2

    .line 107
    monitor-exit v0

    goto :goto_2

    .line 108
    :cond_2
    invoke-virtual {v3, v2, p0, v4}, Ll/۟ۢۘ;->֫(Ll/۠ۢۘ;Ll/᩵᩻ۘ;I)V

    .line 109
    monitor-exit v0

    goto :goto_1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    throw v1
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 116
    :catch_0
    :cond_3
    :goto_2
    invoke-virtual {p0}, Ll/᩵᩻ۘ;->ۧ()V

    return-void

    .line 82
    :catch_1
    invoke-virtual {p0}, Ll/᩵᩻ۘ;->ۘ()V

    .line 83
    iput-boolean v0, p0, Ll/᩵᩻ۘ;->֫:Z

    .line 84
    invoke-virtual {p0}, Ll/᩵᩻ۘ;->ۧ()V

    return-void
.end method
