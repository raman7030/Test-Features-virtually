.class public final Ll/᩻֫֡;
.super Ll/֡ۧ֡;
.source "14DT"


# instance fields
.field public ۖ:Ljava/net/Socket;

.field public ۘ:Ll/ۛܽ֡;

.field public ۜ:Z

.field public final ۡ:Ll/ۚ۟᩵;

.field public ۢ:Ljava/net/Socket;

.field public ۧ:I

.field public ܳ:Ll/᩹ۧ֡;

.field public ܺ:Ll/ۤܽ֡;

.field public final ܽ:Ljava/util/ArrayList;

.field public ܿ:Ll/۬ܰ᩵;

.field public final ᩳ:Ll/ۡܰ᩵;

.field public ᩴ:I

.field public ᩷:Ll/ܳ۟᩵;

.field public ᩻:J


# direct methods
.method public constructor <init>(Ll/ۡܰ᩵;Ll/ۚ۟᩵;)V
    .locals 2

    .line 1000
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 111
    iput v0, p0, Ll/᩻֫֡;->ۧ:I

    .line 114
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/᩻֫֡;->ܽ:Ljava/util/ArrayList;

    const-wide v0, 0x7fffffffffffffffL

    .line 117
    iput-wide v0, p0, Ll/᩻֫֡;->᩻:J

    .line 120
    iput-object p1, p0, Ll/᩻֫֡;->ᩳ:Ll/ۡܰ᩵;

    .line 121
    iput-object p2, p0, Ll/᩻֫֡;->ۡ:Ll/ۚ۟᩵;

    return-void
.end method

.method private ֫(I)V
    .locals 5

    .line 293
    iget-object v0, p0, Ll/᩻֫֡;->ۖ:Ljava/net/Socket;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 294
    new-instance v0, Ll/ۘۧ֡;

    invoke-direct {v0}, Ll/ۘۧ֡;-><init>()V

    iget-object v1, p0, Ll/᩻֫֡;->ۖ:Ljava/net/Socket;

    iget-object v2, p0, Ll/᩻֫֡;->ۡ:Ll/ۚ۟᩵;

    .line 295
    invoke-virtual {v2}, Ll/ۚ۟᩵;->֫()Ll/ۙ᩺᩵;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۙ᩺᩵;->ۡ()Ll/ۨܰ᩵;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۨܰ᩵;->ܳ()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Ll/᩻֫֡;->ۘ:Ll/ۛܽ֡;

    iget-object v4, p0, Ll/᩻֫֡;->ܺ:Ll/ۤܽ֡;

    invoke-virtual {v0, v1, v2, v3, v4}, Ll/ۘۧ֡;->֫(Ljava/net/Socket;Ljava/lang/String;Ll/ۛܽ֡;Ll/ۤܽ֡;)V

    .line 296
    invoke-virtual {v0, p0}, Ll/ۘۧ֡;->֫(Ll/᩻֫֡;)V

    .line 297
    invoke-virtual {v0, p1}, Ll/ۘۧ֡;->֫(I)V

    .line 298
    invoke-virtual {v0}, Ll/ۘۧ֡;->֫()Ll/᩹ۧ֡;

    move-result-object p1

    iput-object p1, p0, Ll/᩻֫֡;->ܳ:Ll/᩹ۧ֡;

    .line 299
    invoke-virtual {p1}, Ll/᩹ۧ֡;->ᩳ()V

    return-void
.end method

.method private ֫(IIILl/᩶ܰ᩵;)V
    .locals 20

    move-object/from16 v0, p0

    move/from16 v1, p2

    .line 434
    new-instance v2, Ll/ۢ۟᩵;

    invoke-direct {v2}, Ll/ۢ۟᩵;-><init>()V

    .line 435
    iget-object v3, v0, Ll/᩻֫֡;->ۡ:Ll/ۚ۟᩵;

    invoke-virtual {v3}, Ll/ۚ۟᩵;->֫()Ll/ۙ᩺᩵;

    move-result-object v4

    invoke-virtual {v4}, Ll/ۙ᩺᩵;->ۡ()Ll/ۨܰ᩵;

    move-result-object v4

    invoke-virtual {v2, v4}, Ll/ۢ۟᩵;->֫(Ll/ۨܰ᩵;)V

    const-string v4, "CONNECT"

    const/4 v5, 0x0

    .line 436
    invoke-virtual {v2, v4, v5}, Ll/ۢ۟᩵;->֫(Ljava/lang/String;Ll/ۖ۟᩵;)V

    .line 437
    invoke-virtual {v3}, Ll/ۚ۟᩵;->֫()Ll/ۙ᩺᩵;

    move-result-object v4

    invoke-virtual {v4}, Ll/ۙ᩺᩵;->ۡ()Ll/ۨܰ᩵;

    move-result-object v4

    const/4 v6, 0x1

    invoke-static {v4, v6}, Ll/᩶۟᩵;->֫(Ll/ۨܰ᩵;Z)Ljava/lang/String;

    move-result-object v4

    const-string v7, "Host"

    invoke-virtual {v2, v7, v4}, Ll/ۢ۟᩵;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "Proxy-Connection"

    const-string v7, "Keep-Alive"

    .line 438
    invoke-virtual {v2, v4, v7}, Ll/ۢ۟᩵;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "User-Agent"

    const-string v7, "okhttp/3.12.13"

    .line 439
    invoke-virtual {v2, v4, v7}, Ll/ۢ۟᩵;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    .line 440
    invoke-virtual {v2}, Ll/ۢ۟᩵;->֫()Ll/ۡ۟᩵;

    move-result-object v2

    .line 442
    new-instance v4, Ll/ۘ۟᩵;

    invoke-direct {v4}, Ll/ۘ۟᩵;-><init>()V

    .line 443
    invoke-virtual {v4, v2}, Ll/ۘ۟᩵;->֫(Ll/ۡ۟᩵;)V

    sget-object v7, Ll/ܳ۟᩵;->ۗ:Ll/ܳ۟᩵;

    .line 444
    invoke-virtual {v4, v7}, Ll/ۘ۟᩵;->֫(Ll/ܳ۟᩵;)V

    const/16 v7, 0x197

    .line 445
    invoke-virtual {v4, v7}, Ll/ۘ۟᩵;->֫(I)V

    const-string v8, "Preemptive Authenticate"

    .line 446
    invoke-virtual {v4, v8}, Ll/ۘ۟᩵;->ۧ(Ljava/lang/String;)V

    sget-object v8, Ll/᩶۟᩵;->ܽ:Ll/֡۟᩵;

    .line 447
    invoke-virtual {v4, v8}, Ll/ۘ۟᩵;->֫(Ll/֡۟᩵;)V

    const-wide/16 v8, -0x1

    .line 448
    invoke-virtual {v4, v8, v9}, Ll/ۘ۟᩵;->ۧ(J)V

    .line 449
    invoke-virtual {v4, v8, v9}, Ll/ۘ۟᩵;->֫(J)V

    .line 450
    invoke-virtual {v4}, Ll/ۘ۟᩵;->ۧ()V

    .line 451
    invoke-virtual {v4}, Ll/ۘ۟᩵;->֫()Ll/ᩴ۟᩵;

    move-result-object v4

    .line 453
    invoke-virtual {v3}, Ll/ۚ۟᩵;->֫()Ll/ۙ᩺᩵;

    move-result-object v10

    invoke-virtual {v10}, Ll/ۙ᩺᩵;->᩻()Ll/۬᩺᩵;

    move-result-object v10

    .line 454
    invoke-interface {v10, v4}, Ll/۬᩺᩵;->֫(Ll/ᩴ۟᩵;)Ll/ۡ۟᩵;

    move-result-object v4

    if-eqz v4, :cond_0

    move-object v2, v4

    .line 217
    :cond_0
    invoke-virtual {v2}, Ll/ۡ۟᩵;->᩻()Ll/ۨܰ᩵;

    move-result-object v4

    const/4 v10, 0x0

    :goto_0
    const/16 v11, 0x15

    if-ge v10, v11, :cond_8

    move/from16 v11, p1

    move-object/from16 v12, p4

    .line 219
    invoke-direct {v0, v11, v1, v12}, Ll/᩻֫֡;->֫(IILl/᩶ܰ᩵;)V

    .line 377
    new-instance v13, Ljava/lang/StringBuilder;

    const-string v14, "CONNECT "

    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v4, v6}, Ll/᩶۟᩵;->֫(Ll/ۨܰ᩵;Z)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, " HTTP/1.1"

    invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 379
    :goto_1
    new-instance v13, Ll/ۨ֫֡;

    iget-object v14, v0, Ll/᩻֫֡;->ۘ:Ll/ۛܽ֡;

    iget-object v15, v0, Ll/᩻֫֡;->ܺ:Ll/ۤܽ֡;

    invoke-direct {v13, v5, v5, v14, v15}, Ll/ۨ֫֡;-><init>(Ll/ܿ۟᩵;Ll/ܺ֫֡;Ll/ۛܽ֡;Ll/ۤܽ֡;)V

    .line 380
    invoke-interface {v14}, Ll/֨ᩳ֡;->ۢ()Ll/ܶᩳ֡;

    move-result-object v14

    int-to-long v7, v1

    sget-object v9, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v14, v7, v8}, Ll/ܶᩳ֡;->ۧ(J)Ll/ܶᩳ֡;

    .line 381
    iget-object v7, v0, Ll/᩻֫֡;->ܺ:Ll/ۤܽ֡;

    invoke-interface {v7}, Ll/ۚᩳ֡;->ۢ()Ll/ܶᩳ֡;

    move-result-object v7

    move/from16 v8, p3

    move-object v14, v6

    int-to-long v5, v8

    invoke-virtual {v7, v5, v6}, Ll/ܶᩳ֡;->ۧ(J)Ll/ܶᩳ֡;

    .line 382
    invoke-virtual {v2}, Ll/ۡ۟᩵;->ܽ()Ll/ۤܰ᩵;

    move-result-object v5

    move-object v6, v14

    invoke-virtual {v13, v5, v6}, Ll/ۨ֫֡;->֫(Ll/ۤܰ᩵;Ljava/lang/String;)V

    .line 383
    invoke-virtual {v13}, Ll/ۨ֫֡;->֫()V

    const/4 v5, 0x0

    .line 384
    invoke-virtual {v13, v5}, Ll/ۨ֫֡;->֫(Z)Ll/ۘ۟᩵;

    move-result-object v5

    .line 385
    invoke-virtual {v5, v2}, Ll/ۘ۟᩵;->֫(Ll/ۡ۟᩵;)V

    .line 386
    invoke-virtual {v5}, Ll/ۘ۟᩵;->֫()Ll/ᩴ۟᩵;

    move-result-object v2

    .line 389
    invoke-static {v2}, Ll/֨֫֡;->֫(Ll/ᩴ۟᩵;)J

    move-result-wide v18

    const-wide/16 v16, -0x1

    cmp-long v5, v18, v16

    if-nez v5, :cond_1

    const-wide/16 v18, 0x0

    :cond_1
    move v5, v10

    move-wide/from16 v9, v18

    .line 393
    invoke-virtual {v13, v9, v10}, Ll/ۨ֫֡;->֫(J)Ll/֨ᩳ֡;

    move-result-object v9

    const v10, 0x7fffffff

    .line 394
    invoke-static {v9, v10}, Ll/᩶۟᩵;->֫(Ll/֨ᩳ֡;I)Z

    .line 395
    invoke-interface {v9}, Ljava/io/Closeable;->close()V

    .line 397
    invoke-virtual {v2}, Ll/ᩴ۟᩵;->ᩳ()I

    move-result v9

    const/16 v10, 0xc8

    if-eq v9, v10, :cond_5

    const/16 v10, 0x197

    if-ne v9, v10, :cond_4

    .line 409
    invoke-virtual {v3}, Ll/ۚ۟᩵;->֫()Ll/ۙ᩺᩵;

    move-result-object v9

    invoke-virtual {v9}, Ll/ۙ᩺᩵;->᩻()Ll/۬᩺᩵;

    move-result-object v9

    invoke-interface {v9, v2}, Ll/۬᩺᩵;->֫(Ll/ᩴ۟᩵;)Ll/ۡ۟᩵;

    move-result-object v9

    if-eqz v9, :cond_3

    const-string v13, "Connection"

    .line 412
    invoke-virtual {v2, v13}, Ll/ᩴ۟᩵;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v13, "close"

    invoke-virtual {v13, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    move-object v2, v9

    goto :goto_2

    :cond_2
    move v10, v5

    move-object v2, v9

    move-wide/from16 v8, v16

    const/4 v5, 0x0

    const/16 v7, 0x197

    goto/16 :goto_1

    .line 410
    :cond_3
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Failed to authenticate with proxy"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 418
    :cond_4
    new-instance v1, Ljava/io/IOException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Unexpected response code for CONNECT: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 419
    invoke-virtual {v2}, Ll/ᩴ۟᩵;->ᩳ()I

    move-result v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_5
    const/16 v10, 0x197

    .line 403
    iget-object v2, v0, Ll/᩻֫֡;->ۘ:Ll/ۛܽ֡;

    invoke-interface {v2}, Ll/ۛܽ֡;->᩷()Ll/۫ܽ֡;

    move-result-object v2

    invoke-virtual {v2}, Ll/۫ܽ֡;->ۢۧ()Z

    move-result v2

    if-eqz v2, :cond_7

    iget-object v2, v0, Ll/᩻֫֡;->ܺ:Ll/ۤܽ֡;

    invoke-interface {v2}, Ll/ۤܽ֡;->᩷()Ll/۫ܽ֡;

    move-result-object v2

    invoke-virtual {v2}, Ll/۫ܽ֡;->ۢۧ()Z

    move-result v2

    if-eqz v2, :cond_7

    const/4 v2, 0x0

    :goto_2
    if-nez v2, :cond_6

    goto :goto_3

    .line 226
    :cond_6
    iget-object v6, v0, Ll/᩻֫֡;->ۢ:Ljava/net/Socket;

    invoke-static {v6}, Ll/᩶۟᩵;->֫(Ljava/net/Socket;)V

    const/4 v6, 0x0

    .line 227
    iput-object v6, v0, Ll/᩻֫֡;->ۢ:Ljava/net/Socket;

    .line 228
    iput-object v6, v0, Ll/᩻֫֡;->ܺ:Ll/ۤܽ֡;

    .line 229
    iput-object v6, v0, Ll/᩻֫֡;->ۘ:Ll/ۛܽ֡;

    add-int/lit8 v5, v5, 0x1

    const/4 v7, 0x1

    move v10, v5

    move-object v5, v6

    move-wide/from16 v8, v16

    const/4 v6, 0x1

    const/16 v7, 0x197

    goto/16 :goto_0

    .line 404
    :cond_7
    new-instance v1, Ljava/io/IOException;

    const-string v2, "TLS tunnel buffered too many bytes!"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_8
    :goto_3
    return-void
.end method

.method private ֫(IILl/᩶ܰ᩵;)V
    .locals 5

    .line 237
    iget-object v0, p0, Ll/᩻֫֡;->ۡ:Ll/ۚ۟᩵;

    invoke-virtual {v0}, Ll/ۚ۟᩵;->ۧ()Ljava/net/Proxy;

    move-result-object v1

    .line 238
    invoke-virtual {v0}, Ll/ۚ۟᩵;->֫()Ll/ۙ᩺᩵;

    move-result-object v2

    .line 240
    invoke-virtual {v1}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v3

    sget-object v4, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-eq v3, v4, :cond_1

    invoke-virtual {v1}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v3

    sget-object v4, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    if-ne v3, v4, :cond_0

    goto :goto_0

    .line 242
    :cond_0
    new-instance v2, Ljava/net/Socket;

    invoke-direct {v2, v1}, Ljava/net/Socket;-><init>(Ljava/net/Proxy;)V

    goto :goto_1

    .line 241
    :cond_1
    :goto_0
    invoke-virtual {v2}, Ll/ۙ᩺᩵;->᩷()Ljavax/net/SocketFactory;

    move-result-object v1

    invoke-virtual {v1}, Ljavax/net/SocketFactory;->createSocket()Ljava/net/Socket;

    move-result-object v2

    .line 242
    :goto_1
    iput-object v2, p0, Ll/᩻֫֡;->ۢ:Ljava/net/Socket;

    .line 244
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    iget-object p3, p0, Ll/᩻֫֡;->ۢ:Ljava/net/Socket;

    invoke-virtual {p3, p2}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 247
    :try_start_0
    invoke-static {}, Ll/ᩴܽ֡;->ܽ()Ll/ᩴܽ֡;

    move-result-object p2

    iget-object p3, p0, Ll/᩻֫֡;->ۢ:Ljava/net/Socket;

    invoke-virtual {v0}, Ll/ۚ۟᩵;->ᩳ()Ljava/net/InetSocketAddress;

    move-result-object v1

    invoke-virtual {p2, p3, v1, p1}, Ll/ᩴܽ֡;->֫(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V
    :try_end_0
    .catch Ljava/net/ConnectException; {:try_start_0 .. :try_end_0} :catch_1

    .line 259
    :try_start_1
    iget-object p1, p0, Ll/᩻֫֡;->ۢ:Ljava/net/Socket;

    invoke-static {p1}, Ll/᩻ᩳ֡;->ۧ(Ljava/net/Socket;)Ll/֨ᩳ֡;

    move-result-object p1

    invoke-static {p1}, Ll/᩻ᩳ֡;->֫(Ll/֨ᩳ֡;)Ll/ۛܽ֡;

    move-result-object p1

    iput-object p1, p0, Ll/᩻֫֡;->ۘ:Ll/ۛܽ֡;

    .line 260
    iget-object p1, p0, Ll/᩻֫֡;->ۢ:Ljava/net/Socket;

    invoke-static {p1}, Ll/᩻ᩳ֡;->֫(Ljava/net/Socket;)Ll/ۚᩳ֡;

    move-result-object p1

    invoke-static {p1}, Ll/᩻ᩳ֡;->֫(Ll/ۚᩳ֡;)Ll/ۤܽ֡;

    move-result-object p1

    iput-object p1, p0, Ll/᩻֫֡;->ܺ:Ll/ۤܽ֡;
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string p2, "throw with null exception"

    .line 262
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    return-void

    .line 263
    :cond_2
    new-instance p2, Ljava/io/IOException;

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :catch_1
    move-exception p1

    .line 249
    new-instance p2, Ljava/net/ConnectException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v1, "Failed to connect to "

    invoke-direct {p3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ll/ۚ۟᩵;->ᩳ()Ljava/net/InetSocketAddress;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3}, Ljava/net/ConnectException;-><init>(Ljava/lang/String;)V

    .line 250
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 251
    throw p2
.end method

.method private ֫(Ll/ܳ֫֡;ILl/᩶ܰ᩵;)V
    .locals 6

    .line 270
    iget-object v0, p0, Ll/᩻֫֡;->ۡ:Ll/ۚ۟᩵;

    invoke-virtual {v0}, Ll/ۚ۟᩵;->֫()Ll/ۙ᩺᩵;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۙ᩺᩵;->ۢ()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v1

    if-nez v1, :cond_1

    .line 271
    invoke-virtual {v0}, Ll/ۚ۟᩵;->֫()Ll/ۙ᩺᩵;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۙ᩺᩵;->ܿ()Ljava/util/List;

    move-result-object p1

    sget-object p3, Ll/ܳ۟᩵;->᩶:Ll/ܳ۟᩵;

    invoke-interface {p1, p3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 272
    iget-object p1, p0, Ll/᩻֫֡;->ۢ:Ljava/net/Socket;

    iput-object p1, p0, Ll/᩻֫֡;->ۖ:Ljava/net/Socket;

    .line 273
    iput-object p3, p0, Ll/᩻֫֡;->᩷:Ll/ܳ۟᩵;

    .line 274
    invoke-direct {p0, p2}, Ll/᩻֫֡;->֫(I)V

    return-void

    .line 278
    :cond_0
    iget-object p1, p0, Ll/᩻֫֡;->ۢ:Ljava/net/Socket;

    iput-object p1, p0, Ll/᩻֫֡;->ۖ:Ljava/net/Socket;

    .line 279
    sget-object p1, Ll/ܳ۟᩵;->ۗ:Ll/ܳ۟᩵;

    iput-object p1, p0, Ll/᩻֫֡;->᩷:Ll/ܳ۟᩵;

    return-void

    .line 283
    :cond_1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 303
    invoke-virtual {v0}, Ll/ۚ۟᩵;->֫()Ll/ۙ᩺᩵;

    move-result-object p3

    .line 304
    invoke-virtual {p3}, Ll/ۙ᩺᩵;->ۢ()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    const/4 v1, 0x0

    .line 309
    :try_start_0
    iget-object v2, p0, Ll/᩻֫֡;->ۢ:Ljava/net/Socket;

    .line 310
    invoke-virtual {p3}, Ll/ۙ᩺᩵;->ۡ()Ll/ۨܰ᩵;

    move-result-object v3

    invoke-virtual {v3}, Ll/ۨܰ᩵;->ܳ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p3}, Ll/ۙ᩺᩵;->ۡ()Ll/ۨܰ᩵;

    move-result-object v4

    invoke-virtual {v4}, Ll/ۨܰ᩵;->ۢ()I

    move-result v4

    const/4 v5, 0x1

    .line 309
    invoke-virtual {v0, v2, v3, v4, v5}, Ljavax/net/ssl/SSLSocketFactory;->createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;

    move-result-object v0

    check-cast v0, Ljavax/net/ssl/SSLSocket;
    :try_end_0
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 313
    :try_start_1
    invoke-virtual {p1, v0}, Ll/ܳ֫֡;->֫(Ljavax/net/ssl/SSLSocket;)Ll/ۖܰ᩵;

    move-result-object p1

    .line 314
    invoke-virtual {p1}, Ll/ۖܰ᩵;->֫()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 315
    invoke-static {}, Ll/ᩴܽ֡;->ܽ()Ll/ᩴܽ֡;

    move-result-object v2

    .line 316
    invoke-virtual {p3}, Ll/ۙ᩺᩵;->ۡ()Ll/ۨܰ᩵;

    move-result-object v3

    invoke-virtual {v3}, Ll/ۨܰ᩵;->ܳ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p3}, Ll/ۙ᩺᩵;->ܿ()Ljava/util/List;

    move-result-object v4

    .line 315
    invoke-virtual {v2, v0, v3, v4}, Ll/ᩴܽ֡;->֫(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V

    .line 320
    :cond_2
    invoke-virtual {v0}, Ljavax/net/ssl/SSLSocket;->startHandshake()V

    .line 322
    invoke-virtual {v0}, Ljavax/net/ssl/SSLSocket;->getSession()Ljavax/net/ssl/SSLSession;

    move-result-object v2

    .line 323
    invoke-static {v2}, Ll/۬ܰ᩵;->֫(Ljavax/net/ssl/SSLSession;)Ll/۬ܰ᩵;

    move-result-object v3

    .line 326
    invoke-virtual {p3}, Ll/ۙ᩺᩵;->ᩳ()Ljavax/net/ssl/HostnameVerifier;

    move-result-object v4

    invoke-virtual {p3}, Ll/ۙ᩺᩵;->ۡ()Ll/ۨܰ᩵;

    move-result-object v5

    invoke-virtual {v5}, Ll/ۨܰ᩵;->ܳ()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5, v2}, Ljavax/net/ssl/HostnameVerifier;->verify(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z

    move-result v2

    if-nez v2, :cond_4

    .line 327
    invoke-virtual {v3}, Ll/۬ܰ᩵;->ܽ()Ljava/util/List;

    move-result-object p1

    .line 328
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p2
    :try_end_1
    .catch Ljava/lang/AssertionError; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v1, "Hostname "

    if-nez p2, :cond_3

    const/4 p2, 0x0

    .line 329
    :try_start_2
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/security/cert/X509Certificate;

    .line 330
    new-instance p2, Ljavax/net/ssl/SSLPeerUnverifiedException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 331
    invoke-virtual {p3}, Ll/ۙ᩺᩵;->ۡ()Ll/ۨܰ᩵;

    move-result-object p3

    invoke-virtual {p3}, Ll/ۨܰ᩵;->ܳ()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " not verified:\n    certificate: "

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 332
    invoke-static {p1}, Ll/᩻ܰ᩵;->֫(Ljava/security/cert/X509Certificate;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "\n    DN: "

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 333
    invoke-virtual {p1}, Ljava/security/cert/X509Certificate;->getSubjectDN()Ljava/security/Principal;

    move-result-object p3

    invoke-interface {p3}, Ljava/security/Principal;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "\n    subjectAltNames: "

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 334
    invoke-static {p1}, Ll/۠ܽ֡;->֫(Ljava/security/cert/X509Certificate;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 336
    :cond_3
    new-instance p1, Ljavax/net/ssl/SSLPeerUnverifiedException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 337
    invoke-virtual {p3}, Ll/ۙ᩺᩵;->ۡ()Ll/ۨܰ᩵;

    move-result-object p3

    invoke-virtual {p3}, Ll/ۨܰ᩵;->ܳ()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " not verified (no certificates)"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 342
    :cond_4
    invoke-virtual {p3}, Ll/ۙ᩺᩵;->֫()Ll/᩻ܰ᩵;

    move-result-object v2

    invoke-virtual {p3}, Ll/ۙ᩺᩵;->ۡ()Ll/ۨܰ᩵;

    move-result-object p3

    invoke-virtual {p3}, Ll/ۨܰ᩵;->ܳ()Ljava/lang/String;

    move-result-object p3

    .line 343
    invoke-virtual {v3}, Ll/۬ܰ᩵;->ܽ()Ljava/util/List;

    move-result-object v4

    .line 342
    invoke-virtual {v2, p3, v4}, Ll/᩻ܰ᩵;->֫(Ljava/lang/String;Ljava/util/List;)V

    .line 346
    invoke-virtual {p1}, Ll/ۖܰ᩵;->֫()Z

    move-result p1

    if-eqz p1, :cond_5

    .line 347
    invoke-static {}, Ll/ᩴܽ֡;->ܽ()Ll/ᩴܽ֡;

    move-result-object p1

    invoke-virtual {p1, v0}, Ll/ᩴܽ֡;->ۧ(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;

    move-result-object v1

    .line 349
    :cond_5
    iput-object v0, p0, Ll/᩻֫֡;->ۖ:Ljava/net/Socket;

    .line 350
    invoke-static {v0}, Ll/᩻ᩳ֡;->ۧ(Ljava/net/Socket;)Ll/֨ᩳ֡;

    move-result-object p1

    invoke-static {p1}, Ll/᩻ᩳ֡;->֫(Ll/֨ᩳ֡;)Ll/ۛܽ֡;

    move-result-object p1

    iput-object p1, p0, Ll/᩻֫֡;->ۘ:Ll/ۛܽ֡;

    .line 351
    iget-object p1, p0, Ll/᩻֫֡;->ۖ:Ljava/net/Socket;

    invoke-static {p1}, Ll/᩻ᩳ֡;->֫(Ljava/net/Socket;)Ll/ۚᩳ֡;

    move-result-object p1

    invoke-static {p1}, Ll/᩻ᩳ֡;->֫(Ll/ۚᩳ֡;)Ll/ۤܽ֡;

    move-result-object p1

    iput-object p1, p0, Ll/᩻֫֡;->ܺ:Ll/ۤܽ֡;

    .line 352
    iput-object v3, p0, Ll/᩻֫֡;->ܿ:Ll/۬ܰ᩵;

    if-eqz v1, :cond_6

    .line 354
    invoke-static {v1}, Ll/ܳ۟᩵;->֫(Ljava/lang/String;)Ll/ܳ۟᩵;

    move-result-object p1

    goto :goto_0

    .line 355
    :cond_6
    sget-object p1, Ll/ܳ۟᩵;->ۗ:Ll/ܳ۟᩵;

    :goto_0
    iput-object p1, p0, Ll/᩻֫֡;->᩷:Ll/ܳ۟᩵;
    :try_end_2
    .catch Ljava/lang/AssertionError; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 362
    invoke-static {}, Ll/ᩴܽ֡;->ܽ()Ll/ᩴܽ֡;

    move-result-object p1

    invoke-virtual {p1, v0}, Ll/ᩴܽ֡;->֫(Ljavax/net/ssl/SSLSocket;)V

    .line 287
    iget-object p1, p0, Ll/᩻֫֡;->᩷:Ll/ܳ۟᩵;

    sget-object p3, Ll/ܳ۟᩵;->۬:Ll/ܳ۟᩵;

    if-ne p1, p3, :cond_7

    .line 288
    invoke-direct {p0, p2}, Ll/᩻֫֡;->֫(I)V

    :cond_7
    return-void

    :catchall_0
    move-exception p1

    goto :goto_3

    :catch_0
    move-exception p1

    move-object v1, v0

    goto :goto_1

    :catchall_1
    move-exception p1

    goto :goto_2

    :catch_1
    move-exception p1

    .line 358
    :goto_1
    :try_start_3
    invoke-static {p1}, Ll/᩶۟᩵;->֫(Ljava/lang/AssertionError;)Z

    move-result p2

    if-eqz p2, :cond_8

    new-instance p2, Ljava/io/IOException;

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    .line 359
    :cond_8
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_2
    move-object v0, v1

    :goto_3
    if-eqz v0, :cond_9

    .line 362
    invoke-static {}, Ll/ᩴܽ֡;->ܽ()Ll/ᩴܽ֡;

    move-result-object p2

    invoke-virtual {p2, v0}, Ll/ᩴܽ֡;->֫(Ljavax/net/ssl/SSLSocket;)V

    .line 365
    :cond_9
    invoke-static {v0}, Ll/᩶۟᩵;->֫(Ljava/net/Socket;)V

    throw p1
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 615
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Connection{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 616
    iget-object v1, p0, Ll/᩻֫֡;->ۡ:Ll/ۚ۟᩵;

    invoke-virtual {v1}, Ll/ۚ۟᩵;->֫()Ll/ۙ᩺᩵;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۙ᩺᩵;->ۡ()Ll/ۨܰ᩵;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۨܰ᩵;->ܳ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ":"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ll/ۚ۟᩵;->֫()Ll/ۙ᩺᩵;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۙ᩺᩵;->ۡ()Ll/ۨܰ᩵;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۨܰ᩵;->ۢ()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", proxy="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 618
    invoke-virtual {v1}, Ll/ۚ۟᩵;->ۧ()Ljava/net/Proxy;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " hostAddress="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 620
    invoke-virtual {v1}, Ll/ۚ۟᩵;->ᩳ()Ljava/net/InetSocketAddress;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " cipherSuite="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 622
    iget-object v1, p0, Ll/᩻֫֡;->ܿ:Ll/۬ܰ᩵;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ll/۬ܰ᩵;->֫()Ll/᩷ܰ᩵;

    move-result-object v1

    goto :goto_0

    :cond_0
    const-string v1, "none"

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " protocol="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩻֫֡;->᩷:Ll/ܳ۟᩵;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ܿ۟᩵;Ll/۠֫֡;Ll/ܺ֫֡;)Ll/᩵֫֡;
    .locals 4

    .line 523
    iget-object v0, p0, Ll/᩻֫֡;->ܳ:Ll/᩹ۧ֡;

    if-eqz v0, :cond_0

    .line 524
    new-instance v0, Ll/ܳۧ֡;

    iget-object v1, p0, Ll/᩻֫֡;->ܳ:Ll/᩹ۧ֡;

    invoke-direct {v0, p1, p2, p3, v1}, Ll/ܳۧ֡;-><init>(Ll/ܿ۟᩵;Ll/۠֫֡;Ll/ܺ֫֡;Ll/᩹ۧ֡;)V

    return-object v0

    .line 526
    :cond_0
    iget-object v0, p0, Ll/᩻֫֡;->ۖ:Ljava/net/Socket;

    invoke-virtual {p2}, Ll/۠֫֡;->ܳ()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 527
    iget-object v0, p0, Ll/᩻֫֡;->ۘ:Ll/ۛܽ֡;

    invoke-interface {v0}, Ll/֨ᩳ֡;->ۢ()Ll/ܶᩳ֡;

    move-result-object v0

    invoke-virtual {p2}, Ll/۠֫֡;->ܳ()I

    move-result v1

    int-to-long v1, v1

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2}, Ll/ܶᩳ֡;->ۧ(J)Ll/ܶᩳ֡;

    .line 528
    iget-object v0, p0, Ll/᩻֫֡;->ܺ:Ll/ۤܽ֡;

    invoke-interface {v0}, Ll/ۚᩳ֡;->ۢ()Ll/ܶᩳ֡;

    move-result-object v0

    invoke-virtual {p2}, Ll/۠֫֡;->᩷()I

    move-result p2

    int-to-long v1, p2

    invoke-virtual {v0, v1, v2}, Ll/ܶᩳ֡;->ۧ(J)Ll/ܶᩳ֡;

    .line 529
    new-instance p2, Ll/ۨ֫֡;

    iget-object v0, p0, Ll/᩻֫֡;->ۘ:Ll/ۛܽ֡;

    iget-object v1, p0, Ll/᩻֫֡;->ܺ:Ll/ۤܽ֡;

    invoke-direct {p2, p1, p3, v0, v1}, Ll/ۨ֫֡;-><init>(Ll/ܿ۟᩵;Ll/ܺ֫֡;Ll/ۛܽ֡;Ll/ۤܽ֡;)V

    return-object p2
.end method

.method public final ֫()V
    .locals 1

    .line 547
    iget-object v0, p0, Ll/᩻֫֡;->ۢ:Ljava/net/Socket;

    invoke-static {v0}, Ll/᩶۟᩵;->֫(Ljava/net/Socket;)V

    return-void
.end method

.method public final ֫(IIIIZLl/᩶ܰ᩵;)V
    .locals 5

    .line 135
    iget-object v0, p0, Ll/᩻֫֡;->᩷:Ll/ܳ۟᩵;

    if-nez v0, :cond_b

    .line 138
    iget-object v0, p0, Ll/᩻֫֡;->ۡ:Ll/ۚ۟᩵;

    invoke-virtual {v0}, Ll/ۚ۟᩵;->֫()Ll/ۙ᩺᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۙ᩺᩵;->ۧ()Ljava/util/List;

    move-result-object v0

    .line 139
    new-instance v1, Ll/ܳ֫֡;

    invoke-direct {v1, v0}, Ll/ܳ֫֡;-><init>(Ljava/util/List;)V

    .line 141
    iget-object v2, p0, Ll/᩻֫֡;->ۡ:Ll/ۚ۟᩵;

    invoke-virtual {v2}, Ll/ۚ۟᩵;->֫()Ll/ۙ᩺᩵;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۙ᩺᩵;->ۢ()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v2

    if-nez v2, :cond_2

    .line 142
    sget-object v2, Ll/ۖܰ᩵;->ܿ:Ll/ۖܰ᩵;

    invoke-interface {v0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 146
    iget-object v0, p0, Ll/᩻֫֡;->ۡ:Ll/ۚ۟᩵;

    invoke-virtual {v0}, Ll/ۚ۟᩵;->֫()Ll/ۙ᩺᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۙ᩺᩵;->ۡ()Ll/ۨܰ᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۨܰ᩵;->ܳ()Ljava/lang/String;

    move-result-object v0

    .line 147
    invoke-static {}, Ll/ᩴܽ֡;->ܽ()Ll/ᩴܽ֡;

    move-result-object v2

    invoke-virtual {v2, v0}, Ll/ᩴܽ֡;->֫(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    .line 148
    :cond_0
    new-instance p1, Ll/ۜ֫֡;

    new-instance p2, Ljava/net/UnknownServiceException;

    const-string p3, "CLEARTEXT communication to "

    const-string p4, " not permitted by network security policy"

    .line 0
    invoke-static {p3, v0, p4}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    .line 148
    invoke-direct {p2, p3}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, p2}, Ll/ۜ֫֡;-><init>(Ljava/io/IOException;)V

    throw p1

    .line 143
    :cond_1
    new-instance p1, Ll/ۜ֫֡;

    new-instance p2, Ljava/net/UnknownServiceException;

    const-string p3, "CLEARTEXT communication not enabled for client"

    invoke-direct {p2, p3}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, p2}, Ll/ۜ֫֡;-><init>(Ljava/io/IOException;)V

    throw p1

    .line 152
    :cond_2
    iget-object v0, p0, Ll/᩻֫֡;->ۡ:Ll/ۚ۟᩵;

    invoke-virtual {v0}, Ll/ۚ۟᩵;->֫()Ll/ۙ᩺᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۙ᩺᩵;->ܿ()Ljava/util/List;

    move-result-object v0

    sget-object v2, Ll/ܳ۟᩵;->᩶:Ll/ܳ۟᩵;

    invoke-interface {v0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    :goto_0
    const/4 v0, 0x0

    move-object v2, v0

    .line 160
    :goto_1
    :try_start_0
    iget-object v3, p0, Ll/᩻֫֡;->ۡ:Ll/ۚ۟᩵;

    invoke-virtual {v3}, Ll/ۚ۟᩵;->ܽ()Z

    move-result v3

    if-eqz v3, :cond_3

    .line 161
    invoke-direct {p0, p1, p2, p3, p6}, Ll/᩻֫֡;->֫(IIILl/᩶ܰ᩵;)V

    .line 162
    iget-object v3, p0, Ll/᩻֫֡;->ۢ:Ljava/net/Socket;

    if-nez v3, :cond_4

    goto :goto_2

    .line 167
    :cond_3
    invoke-direct {p0, p1, p2, p6}, Ll/᩻֫֡;->֫(IILl/᩶ܰ᩵;)V

    .line 169
    :cond_4
    invoke-direct {p0, v1, p4, p6}, Ll/᩻֫֡;->֫(Ll/ܳ֫֡;ILl/᩶ܰ᩵;)V

    .line 170
    iget-object v3, p0, Ll/᩻֫֡;->ۡ:Ll/ۚ۟᩵;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, p0, Ll/᩻֫֡;->ۡ:Ll/ۚ۟᩵;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 197
    :goto_2
    iget-object p1, p0, Ll/᩻֫֡;->ۡ:Ll/ۚ۟᩵;

    invoke-virtual {p1}, Ll/ۚ۟᩵;->ܽ()Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Ll/᩻֫֡;->ۢ:Ljava/net/Socket;

    if-eqz p1, :cond_5

    goto :goto_3

    .line 198
    :cond_5
    new-instance p1, Ljava/net/ProtocolException;

    const-string p2, "Too many tunnel connections attempted: 21"

    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 200
    new-instance p2, Ll/ۜ֫֡;

    invoke-direct {p2, p1}, Ll/ۜ֫֡;-><init>(Ljava/io/IOException;)V

    throw p2

    .line 203
    :cond_6
    :goto_3
    iget-object p1, p0, Ll/᩻֫֡;->ܳ:Ll/᩹ۧ֡;

    if-eqz p1, :cond_7

    .line 204
    iget-object p1, p0, Ll/᩻֫֡;->ᩳ:Ll/ۡܰ᩵;

    move-object v0, p1

    monitor-enter v0

    .line 205
    :try_start_1
    iget-object p1, p0, Ll/᩻֫֡;->ܳ:Ll/᩹ۧ֡;

    invoke-virtual {p1}, Ll/᩹ۧ֡;->֫()I

    move-result p1

    iput p1, p0, Ll/᩻֫֡;->ۧ:I

    .line 206
    monitor-exit v0

    goto :goto_4

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_7
    :goto_4
    return-void

    :catch_0
    move-exception v3

    .line 173
    iget-object v4, p0, Ll/᩻֫֡;->ۖ:Ljava/net/Socket;

    invoke-static {v4}, Ll/᩶۟᩵;->֫(Ljava/net/Socket;)V

    .line 174
    iget-object v4, p0, Ll/᩻֫֡;->ۢ:Ljava/net/Socket;

    invoke-static {v4}, Ll/᩶۟᩵;->֫(Ljava/net/Socket;)V

    .line 175
    iput-object v0, p0, Ll/᩻֫֡;->ۖ:Ljava/net/Socket;

    .line 176
    iput-object v0, p0, Ll/᩻֫֡;->ۢ:Ljava/net/Socket;

    .line 177
    iput-object v0, p0, Ll/᩻֫֡;->ۘ:Ll/ۛܽ֡;

    .line 178
    iput-object v0, p0, Ll/᩻֫֡;->ܺ:Ll/ۤܽ֡;

    .line 179
    iput-object v0, p0, Ll/᩻֫֡;->ܿ:Ll/۬ܰ᩵;

    .line 180
    iput-object v0, p0, Ll/᩻֫֡;->᩷:Ll/ܳ۟᩵;

    .line 181
    iput-object v0, p0, Ll/᩻֫֡;->ܳ:Ll/᩹ۧ֡;

    .line 183
    iget-object v4, p0, Ll/᩻֫֡;->ۡ:Ll/ۚ۟᩵;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v4, p0, Ll/᩻֫֡;->ۡ:Ll/ۚ۟᩵;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-nez v2, :cond_8

    .line 186
    new-instance v2, Ll/ۜ֫֡;

    invoke-direct {v2, v3}, Ll/ۜ֫֡;-><init>(Ljava/io/IOException;)V

    goto :goto_5

    .line 188
    :cond_8
    invoke-virtual {v2, v3}, Ll/ۜ֫֡;->֫(Ljava/io/IOException;)V

    :goto_5
    if-eqz p5, :cond_9

    .line 191
    invoke-virtual {v1, v3}, Ll/ܳ֫֡;->֫(Ljava/io/IOException;)Z

    move-result v3

    if-eqz v3, :cond_9

    goto/16 :goto_1

    .line 192
    :cond_9
    throw v2

    .line 153
    :cond_a
    new-instance p1, Ll/ۜ֫֡;

    new-instance p2, Ljava/net/UnknownServiceException;

    const-string p3, "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"

    invoke-direct {p2, p3}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, p2}, Ll/ۜ֫֡;-><init>(Ljava/io/IOException;)V

    throw p1

    .line 135
    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "already connected"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/ۤۧ֡;)V
    .locals 1

    .line 588
    sget-object v0, Ll/ܰ֫֡;->۟:Ll/ܰ֫֡;

    invoke-virtual {p1, v0}, Ll/ۤۧ֡;->֫(Ll/ܰ֫֡;)V

    return-void
.end method

.method public final ֫(Ll/᩹ۧ֡;)V
    .locals 1

    .line 593
    iget-object v0, p0, Ll/᩻֫֡;->ᩳ:Ll/ۡܰ᩵;

    monitor-enter v0

    .line 594
    :try_start_0
    invoke-virtual {p1}, Ll/᩹ۧ֡;->֫()I

    move-result p1

    iput p1, p0, Ll/᩻֫֡;->ۧ:I

    .line 595
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ֫(Ll/ۙ᩺᩵;Ll/ۚ۟᩵;)Z
    .locals 4

    .line 467
    iget-object v0, p0, Ll/᩻֫֡;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget v1, p0, Ll/᩻֫֡;->ۧ:I

    if-ge v0, v1, :cond_a

    iget-boolean v0, p0, Ll/᩻֫֡;->ۜ:Z

    if-eqz v0, :cond_0

    goto/16 :goto_0

    .line 470
    :cond_0
    sget-object v0, Ll/۠۟᩵;->֫:Ll/۠۟᩵;

    iget-object v1, p0, Ll/᩻֫֡;->ۡ:Ll/ۚ۟᩵;

    invoke-virtual {v1}, Ll/ۚ۟᩵;->֫()Ll/ۙ᩺᩵;

    move-result-object v2

    invoke-virtual {v0, v2, p1}, Ll/۠۟᩵;->֫(Ll/ۙ᩺᩵;Ll/ۙ᩺᩵;)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_0

    .line 473
    :cond_1
    invoke-virtual {p1}, Ll/ۙ᩺᩵;->ۡ()Ll/ۨܰ᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۨܰ᩵;->ܳ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Ll/ۚ۟᩵;->֫()Ll/ۙ᩺᩵;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۙ᩺᩵;->ۡ()Ll/ۨܰ᩵;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۨܰ᩵;->ܳ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    return v2

    .line 483
    :cond_2
    iget-object v0, p0, Ll/᩻֫֡;->ܳ:Ll/᩹ۧ֡;

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    if-nez p2, :cond_4

    goto :goto_0

    .line 489
    :cond_4
    invoke-virtual {p2}, Ll/ۚ۟᩵;->ۧ()Ljava/net/Proxy;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    sget-object v3, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-eq v0, v3, :cond_5

    goto :goto_0

    .line 490
    :cond_5
    invoke-virtual {v1}, Ll/ۚ۟᩵;->ۧ()Ljava/net/Proxy;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    if-eq v0, v3, :cond_6

    goto :goto_0

    .line 491
    :cond_6
    invoke-virtual {v1}, Ll/ۚ۟᩵;->ᩳ()Ljava/net/InetSocketAddress;

    move-result-object v0

    invoke-virtual {p2}, Ll/ۚ۟᩵;->ᩳ()Ljava/net/InetSocketAddress;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/net/InetSocketAddress;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_0

    .line 494
    :cond_7
    invoke-virtual {p2}, Ll/ۚ۟᩵;->֫()Ll/ۙ᩺᩵;

    move-result-object p2

    invoke-virtual {p2}, Ll/ۙ᩺᩵;->ᩳ()Ljavax/net/ssl/HostnameVerifier;

    move-result-object p2

    sget-object v0, Ll/۠ܽ֡;->֫:Ll/۠ܽ֡;

    if-eq p2, v0, :cond_8

    goto :goto_0

    .line 495
    :cond_8
    invoke-virtual {p1}, Ll/ۙ᩺᩵;->ۡ()Ll/ۨܰ᩵;

    move-result-object p2

    invoke-virtual {p0, p2}, Ll/᩻֫֡;->֫(Ll/ۨܰ᩵;)Z

    move-result p2

    if-nez p2, :cond_9

    goto :goto_0

    .line 499
    :cond_9
    :try_start_0
    invoke-virtual {p1}, Ll/ۙ᩺᩵;->֫()Ll/᩻ܰ᩵;

    move-result-object p2

    invoke-virtual {p1}, Ll/ۙ᩺᩵;->ۡ()Ll/ۨܰ᩵;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۨܰ᩵;->ܳ()Ljava/lang/String;

    move-result-object p1

    .line 599
    iget-object v0, p0, Ll/᩻֫֡;->ܿ:Ll/۬ܰ᩵;

    .line 499
    invoke-virtual {v0}, Ll/۬ܰ᩵;->ܽ()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p2, p1, v0}, Ll/᩻ܰ᩵;->֫(Ljava/lang/String;Ljava/util/List;)V
    :try_end_0
    .catch Ljavax/net/ssl/SSLPeerUnverifiedException; {:try_start_0 .. :try_end_0} :catch_0

    return v2

    :catch_0
    :cond_a
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ֫(Ll/ۨܰ᩵;)Z
    .locals 4

    .line 508
    invoke-virtual {p1}, Ll/ۨܰ᩵;->ۢ()I

    move-result v0

    iget-object v1, p0, Ll/᩻֫֡;->ۡ:Ll/ۚ۟᩵;

    invoke-virtual {v1}, Ll/ۚ۟᩵;->֫()Ll/ۙ᩺᩵;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۙ᩺᩵;->ۡ()Ll/ۨܰ᩵;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۨܰ᩵;->ۢ()I

    move-result v2

    const/4 v3, 0x0

    if-eq v0, v2, :cond_0

    goto :goto_0

    .line 512
    :cond_0
    invoke-virtual {p1}, Ll/ۨܰ᩵;->ܳ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Ll/ۚ۟᩵;->֫()Ll/ۙ᩺᩵;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۙ᩺᩵;->ۡ()Ll/ۨܰ᩵;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۨܰ᩵;->ܳ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 514
    iget-object v0, p0, Ll/᩻֫֡;->ܿ:Ll/۬ܰ᩵;

    if-eqz v0, :cond_1

    .line 515
    invoke-virtual {p1}, Ll/ۨܰ᩵;->ܳ()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Ll/᩻֫֡;->ܿ:Ll/۬ܰ᩵;

    invoke-virtual {v0}, Ll/۬ܰ᩵;->ܽ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509Certificate;

    .line 514
    invoke-static {v0, p1}, Ll/۠ܽ֡;->֫(Ljava/security/cert/X509Certificate;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    return v3

    :cond_2
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final ֫(Z)Z
    .locals 4

    .line 556
    iget-object v0, p0, Ll/᩻֫֡;->ۖ:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->isClosed()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_4

    iget-object v0, p0, Ll/᩻֫֡;->ۖ:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->isInputShutdown()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Ll/᩻֫֡;->ۖ:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->isOutputShutdown()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 560
    :cond_0
    iget-object v0, p0, Ll/᩻֫֡;->ܳ:Ll/᩹ۧ֡;

    if-eqz v0, :cond_1

    .line 561
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ll/᩹ۧ֡;->ۧ(J)Z

    move-result p1

    return p1

    :cond_1
    const/4 v0, 0x1

    if-eqz p1, :cond_3

    .line 566
    :try_start_0
    iget-object p1, p0, Ll/᩻֫֡;->ۖ:Ljava/net/Socket;

    invoke-virtual {p1}, Ljava/net/Socket;->getSoTimeout()I

    move-result p1
    :try_end_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 568
    :try_start_1
    iget-object v2, p0, Ll/᩻֫֡;->ۖ:Ljava/net/Socket;

    invoke-virtual {v2, v0}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 569
    iget-object v2, p0, Ll/᩻֫֡;->ۘ:Ll/ۛܽ֡;

    invoke-interface {v2}, Ll/ۛܽ֡;->ۢۧ()Z

    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v2, :cond_2

    .line 574
    :try_start_2
    iget-object v2, p0, Ll/᩻֫֡;->ۖ:Ljava/net/Socket;

    invoke-virtual {v2, p1}, Ljava/net/Socket;->setSoTimeout(I)V

    return v1

    :cond_2
    iget-object v2, p0, Ll/᩻֫֡;->ۖ:Ljava/net/Socket;

    invoke-virtual {v2, p1}, Ljava/net/Socket;->setSoTimeout(I)V

    return v0

    :catchall_0
    move-exception v2

    iget-object v3, p0, Ll/᩻֫֡;->ۖ:Ljava/net/Socket;

    invoke-virtual {v3, p1}, Ljava/net/Socket;->setSoTimeout(I)V

    throw v2
    :try_end_2
    .catch Ljava/net/SocketTimeoutException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    :catch_0
    :cond_3
    return v0

    :catch_1
    :cond_4
    :goto_0
    return v1
.end method

.method public final ۧ()Ll/۬ܰ᩵;
    .locals 1

    .line 599
    iget-object v0, p0, Ll/᩻֫֡;->ܿ:Ll/۬ܰ᩵;

    return-object v0
.end method

.method public final ܽ()Z
    .locals 1

    .line 607
    iget-object v0, p0, Ll/᩻֫֡;->ܳ:Ll/᩹ۧ֡;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܿ()Ljava/net/Socket;
    .locals 1

    .line 551
    iget-object v0, p0, Ll/᩻֫֡;->ۖ:Ljava/net/Socket;

    return-object v0
.end method

.method public final ᩳ()Ll/ۚ۟᩵;
    .locals 1

    .line 542
    iget-object v0, p0, Ll/᩻֫֡;->ۡ:Ll/ۚ۟᩵;

    return-object v0
.end method
