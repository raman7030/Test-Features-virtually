.class public final Ll/᩸֫֡;
.super Ljava/lang/Object;
.source "K4CY"

# interfaces
.implements Ll/᩺ܰ᩵;


# instance fields
.field public ֫:Ljava/lang/Object;

.field public volatile ۧ:Z

.field public final ܽ:Ll/ܿ۟᩵;

.field public volatile ᩳ:Ll/ܺ֫֡;


# direct methods
.method public constructor <init>(Ll/ܿ۟᩵;)V
    .locals 0

    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 75
    iput-object p1, p0, Ll/᩸֫֡;->ܽ:Ll/ܿ۟᩵;

    return-void
.end method

.method private ֫(Ll/ۨܰ᩵;)Ll/ۙ᩺᩵;
    .locals 16

    .line 203
    invoke-virtual/range {p1 .. p1}, Ll/ۨܰ᩵;->᩻()Z

    move-result v0

    move-object/from16 v1, p0

    iget-object v2, v1, Ll/᩸֫֡;->ܽ:Ll/ܿ۟᩵;

    if-eqz v0, :cond_0

    .line 204
    invoke-virtual {v2}, Ll/ܿ۟᩵;->ܶ()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    .line 205
    invoke-virtual {v2}, Ll/ܿ۟᩵;->ܺ()Ljavax/net/ssl/HostnameVerifier;

    move-result-object v3

    .line 206
    invoke-virtual {v2}, Ll/ܿ۟᩵;->ܽ()Ll/᩻ܰ᩵;

    move-result-object v4

    move-object v8, v0

    move-object v9, v3

    move-object v10, v4

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    move-object v8, v0

    move-object v9, v8

    move-object v10, v9

    .line 209
    :goto_0
    new-instance v0, Ll/ۙ᩺᩵;

    invoke-virtual/range {p1 .. p1}, Ll/ۨܰ᩵;->ܳ()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Ll/ۨܰ᩵;->ۢ()I

    move-result v5

    invoke-virtual {v2}, Ll/ܿ۟᩵;->᩷()Ll/۠ܰ᩵;

    move-result-object v6

    invoke-virtual {v2}, Ll/ܿ۟᩵;->۠()Ljavax/net/SocketFactory;

    move-result-object v7

    .line 210
    invoke-virtual {v2}, Ll/ܿ۟᩵;->᩵()Ll/۬᩺᩵;

    move-result-object v11

    .line 211
    invoke-virtual {v2}, Ll/ܿ۟᩵;->ۘ()Ljava/util/List;

    move-result-object v13

    invoke-virtual {v2}, Ll/ܿ۟᩵;->ܳ()Ljava/util/List;

    move-result-object v14

    invoke-virtual {v2}, Ll/ܿ۟᩵;->֡()Ljava/net/ProxySelector;

    move-result-object v15

    const/4 v12, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v15}, Ll/ۙ᩺᩵;-><init>(Ljava/lang/String;ILl/۠ܰ᩵;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Ll/᩻ܰ᩵;Ll/۬᩺᩵;Ljava/net/Proxy;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;)V

    return-object v0
.end method

.method private ֫(Ll/ᩴ۟᩵;Ll/ۚ۟᩵;)Ll/ۡ۟᩵;
    .locals 9

    .line 284
    invoke-virtual {p1}, Ll/ᩴ۟᩵;->ᩳ()I

    move-result v0

    .line 286
    invoke-virtual {p1}, Ll/ᩴ۟᩵;->֡()Ll/ۡ۟᩵;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۡ۟᩵;->ܿ()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x133

    const-string v3, "GET"

    .line 287
    iget-object v4, p0, Ll/᩸֫֡;->ܽ:Ll/ܿ۟᩵;

    const/4 v5, 0x0

    if-eq v0, v2, :cond_e

    const/16 v2, 0x134

    if-eq v0, v2, :cond_e

    const/16 v2, 0x191

    if-eq v0, v2, :cond_d

    const-string v2, "\\d+"

    const-string v6, "Retry-After"

    const v7, 0x7fffffff

    const/16 v8, 0x1f7

    if-eq v0, v8, :cond_9

    const/16 v8, 0x197

    if-eq v0, v8, :cond_7

    const/16 p2, 0x198

    if-eq v0, p2, :cond_0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_2

    .line 354
    :cond_0
    invoke-virtual {v4}, Ll/ܿ۟᩵;->֨()Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_2

    .line 359
    :cond_1
    invoke-virtual {p1}, Ll/ᩴ۟᩵;->֡()Ll/ۡ۟᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۡ۟᩵;->֫()Ll/ۖ۟᩵;

    move-result-object v0

    instance-of v0, v0, Ll/᩶֫֡;

    if-eqz v0, :cond_2

    goto/16 :goto_2

    .line 363
    :cond_2
    invoke-virtual {p1}, Ll/ᩴ۟᩵;->ᩴ()Ll/ᩴ۟᩵;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 364
    invoke-virtual {p1}, Ll/ᩴ۟᩵;->ᩴ()Ll/ᩴ۟᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/ᩴ۟᩵;->ᩳ()I

    move-result v0

    if-ne v0, p2, :cond_3

    goto/16 :goto_2

    .line 395
    :cond_3
    invoke-virtual {p1, v6}, Ll/ᩴ۟᩵;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_4

    const/4 v7, 0x0

    goto :goto_0

    .line 403
    :cond_4
    invoke-virtual {p2, v2}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 404
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    :cond_5
    :goto_0
    if-lez v7, :cond_6

    goto/16 :goto_2

    .line 373
    :cond_6
    invoke-virtual {p1}, Ll/ᩴ۟᩵;->֡()Ll/ۡ۟᩵;

    move-result-object p1

    return-object p1

    .line 289
    :cond_7
    invoke-virtual {p2}, Ll/ۚ۟᩵;->ۧ()Ljava/net/Proxy;

    move-result-object p2

    .line 290
    invoke-virtual {p2}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object p2

    sget-object v0, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    if-ne p2, v0, :cond_8

    .line 293
    invoke-virtual {v4}, Ll/ܿ۟᩵;->᩵()Ll/۬᩺᩵;

    move-result-object p2

    invoke-interface {p2, p1}, Ll/۬᩺᩵;->֫(Ll/ᩴ۟᩵;)Ll/ۡ۟᩵;

    move-result-object p1

    return-object p1

    .line 291
    :cond_8
    new-instance p1, Ljava/net/ProtocolException;

    const-string p2, "Received HTTP_PROXY_AUTH (407) code while not using proxy"

    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 376
    :cond_9
    invoke-virtual {p1}, Ll/ᩴ۟᩵;->ᩴ()Ll/ᩴ۟᩵;

    move-result-object p2

    if-eqz p2, :cond_a

    .line 377
    invoke-virtual {p1}, Ll/ᩴ۟᩵;->ᩴ()Ll/ᩴ۟᩵;

    move-result-object p2

    invoke-virtual {p2}, Ll/ᩴ۟᩵;->ᩳ()I

    move-result p2

    if-ne p2, v8, :cond_a

    goto/16 :goto_2

    .line 395
    :cond_a
    invoke-virtual {p1, v6}, Ll/ᩴ۟᩵;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_b

    goto :goto_1

    .line 403
    :cond_b
    invoke-virtual {p2, v2}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 404
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    :cond_c
    :goto_1
    if-nez v7, :cond_13

    .line 384
    invoke-virtual {p1}, Ll/ᩴ۟᩵;->֡()Ll/ۡ۟᩵;

    move-result-object p1

    return-object p1

    .line 296
    :cond_d
    invoke-virtual {v4}, Ll/ܿ۟᩵;->֫()Ll/۬᩺᩵;

    move-result-object p2

    invoke-interface {p2, p1}, Ll/۬᩺᩵;->֫(Ll/ᩴ۟᩵;)Ll/ۡ۟᩵;

    move-result-object p1

    return-object p1

    .line 302
    :cond_e
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_f

    const-string p2, "HEAD"

    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_f

    goto :goto_2

    .line 311
    :cond_f
    :pswitch_0
    invoke-virtual {v4}, Ll/ܿ۟᩵;->ۢ()Z

    move-result p2

    if-nez p2, :cond_10

    goto :goto_2

    :cond_10
    const-string p2, "Location"

    .line 313
    invoke-virtual {p1, p2}, Ll/ᩴ۟᩵;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_11

    goto :goto_2

    .line 315
    :cond_11
    invoke-virtual {p1}, Ll/ᩴ۟᩵;->֡()Ll/ۡ۟᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۡ۟᩵;->᩻()Ll/ۨܰ᩵;

    move-result-object v0

    invoke-virtual {v0, p2}, Ll/ۨܰ᩵;->֫(Ljava/lang/String;)Ll/ۨܰ᩵;

    move-result-object p2

    if-nez p2, :cond_12

    goto :goto_2

    .line 321
    :cond_12
    invoke-virtual {p2}, Ll/ۨܰ᩵;->ۖ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ll/ᩴ۟᩵;->֡()Ll/ۡ۟᩵;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۡ۟᩵;->᩻()Ll/ۨܰ᩵;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۨܰ᩵;->ۖ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_14

    .line 322
    invoke-virtual {v4}, Ll/ܿ۟᩵;->ۡ()Z

    move-result v0

    if-nez v0, :cond_14

    :cond_13
    :goto_2
    return-object v5

    .line 325
    :cond_14
    invoke-virtual {p1}, Ll/ᩴ۟᩵;->֡()Ll/ۡ۟᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۡ۟᩵;->ܳ()Ll/ۢ۟᩵;

    move-result-object v0

    .line 326
    invoke-static {v1}, Ll/ۗᩳۘ;->ܳ(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_17

    const-string v2, "PROPFIND"

    .line 40
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    .line 45
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_15

    .line 329
    invoke-virtual {v0, v3, v5}, Ll/ۢ۟᩵;->֫(Ljava/lang/String;Ll/ۖ۟᩵;)V

    goto :goto_3

    :cond_15
    if-eqz v4, :cond_16

    .line 331
    invoke-virtual {p1}, Ll/ᩴ۟᩵;->֡()Ll/ۡ۟᩵;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۡ۟᩵;->֫()Ll/ۖ۟᩵;

    move-result-object v5

    .line 332
    :cond_16
    invoke-virtual {v0, v1, v5}, Ll/ۢ۟᩵;->֫(Ljava/lang/String;Ll/ۖ۟᩵;)V

    :goto_3
    if-nez v4, :cond_17

    const-string v1, "Transfer-Encoding"

    .line 335
    invoke-virtual {v0, v1}, Ll/ۢ۟᩵;->֫(Ljava/lang/String;)V

    const-string v1, "Content-Length"

    .line 336
    invoke-virtual {v0, v1}, Ll/ۢ۟᩵;->֫(Ljava/lang/String;)V

    const-string v1, "Content-Type"

    .line 337
    invoke-virtual {v0, v1}, Ll/ۢ۟᩵;->֫(Ljava/lang/String;)V

    .line 344
    :cond_17
    invoke-static {p1, p2}, Ll/᩸֫֡;->֫(Ll/ᩴ۟᩵;Ll/ۨܰ᩵;)Z

    move-result p1

    if-nez p1, :cond_18

    const-string p1, "Authorization"

    .line 345
    invoke-virtual {v0, p1}, Ll/ۢ۟᩵;->֫(Ljava/lang/String;)V

    .line 348
    :cond_18
    invoke-virtual {v0, p2}, Ll/ۢ۟᩵;->֫(Ll/ۨܰ᩵;)V

    invoke-virtual {v0}, Ll/ۢ۟᩵;->֫()Ll/ۡ۟᩵;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x12c
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private ֫(Ljava/io/IOException;Ll/ܺ֫֡;ZLl/ۡ۟᩵;)Z
    .locals 2

    .line 222
    invoke-virtual {p2, p1}, Ll/ܺ֫֡;->֫(Ljava/io/IOException;)V

    .line 225
    iget-object v0, p0, Ll/᩸֫֡;->ܽ:Ll/ܿ۟᩵;

    invoke-virtual {v0}, Ll/ܿ۟᩵;->֨()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    if-eqz p3, :cond_1

    .line 241
    invoke-virtual {p4}, Ll/ۡ۟᩵;->֫()Ll/ۖ۟᩵;

    move-result-object p4

    instance-of p4, p4, Ll/᩶֫֡;

    if-nez p4, :cond_6

    instance-of p4, p1, Ljava/io/FileNotFoundException;

    if-eqz p4, :cond_1

    return v1

    .line 247
    :cond_1
    instance-of p4, p1, Ljava/net/ProtocolException;

    if-eqz p4, :cond_2

    return v1

    .line 253
    :cond_2
    instance-of p4, p1, Ljava/io/InterruptedIOException;

    if-eqz p4, :cond_3

    .line 254
    instance-of p1, p1, Ljava/net/SocketTimeoutException;

    if-eqz p1, :cond_6

    if-nez p3, :cond_6

    goto :goto_0

    .line 259
    :cond_3
    instance-of p3, p1, Ljavax/net/ssl/SSLHandshakeException;

    if-eqz p3, :cond_4

    .line 262
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p3

    instance-of p3, p3, Ljava/security/cert/CertificateException;

    if-eqz p3, :cond_4

    goto :goto_1

    .line 266
    :cond_4
    instance-of p1, p1, Ljavax/net/ssl/SSLPeerUnverifiedException;

    if-eqz p1, :cond_5

    return v1

    .line 234
    :cond_5
    :goto_0
    invoke-virtual {p2}, Ll/ܺ֫֡;->ᩳ()Z

    move-result p1

    if-nez p1, :cond_7

    :cond_6
    :goto_1
    return v1

    :cond_7
    const/4 p1, 0x1

    return p1
.end method

.method public static ֫(Ll/ᩴ۟᩵;Ll/ۨܰ᩵;)Z
    .locals 2

    .line 415
    invoke-virtual {p0}, Ll/ᩴ۟᩵;->֡()Ll/ۡ۟᩵;

    move-result-object p0

    invoke-virtual {p0}, Ll/ۡ۟᩵;->᩻()Ll/ۨܰ᩵;

    move-result-object p0

    .line 416
    invoke-virtual {p0}, Ll/ۨܰ᩵;->ܳ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ll/ۨܰ᩵;->ܳ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 417
    invoke-virtual {p0}, Ll/ۨܰ᩵;->ۢ()I

    move-result v0

    invoke-virtual {p1}, Ll/ۨܰ᩵;->ۢ()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 418
    invoke-virtual {p0}, Ll/ۨܰ᩵;->ۖ()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1}, Ll/ۨܰ᩵;->ۖ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final ֫(Ll/۠֫֡;)Ll/ᩴ۟᩵;
    .locals 14

    .line 107
    invoke-virtual {p1}, Ll/۠֫֡;->᩻()Ll/ۡ۟᩵;

    move-result-object v0

    .line 109
    invoke-virtual {p1}, Ll/۠֫֡;->֫()Ll/ܽܰ᩵;

    move-result-object v7

    .line 110
    invoke-virtual {p1}, Ll/۠֫֡;->ᩳ()Ll/᩶ܰ᩵;

    move-result-object v8

    .line 112
    new-instance v9, Ll/ܺ֫֡;

    iget-object v1, p0, Ll/᩸֫֡;->ܽ:Ll/ܿ۟᩵;

    invoke-virtual {v1}, Ll/ܿ۟᩵;->ܿ()Ll/ۡܰ᩵;

    move-result-object v2

    .line 113
    invoke-virtual {v0}, Ll/ۡ۟᩵;->᩻()Ll/ۨܰ᩵;

    move-result-object v1

    invoke-direct {p0, v1}, Ll/᩸֫֡;->֫(Ll/ۨܰ᩵;)Ll/ۙ᩺᩵;

    move-result-object v3

    iget-object v6, p0, Ll/᩸֫֡;->֫:Ljava/lang/Object;

    move-object v1, v9

    move-object v4, v7

    move-object v5, v8

    invoke-direct/range {v1 .. v6}, Ll/ܺ֫֡;-><init>(Ll/ۡܰ᩵;Ll/ۙ᩺᩵;Ll/ܽܰ᩵;Ll/᩶ܰ᩵;Ljava/lang/Object;)V

    .line 114
    iput-object v9, p0, Ll/᩸֫֡;->ᩳ:Ll/ܺ֫֡;

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v1, 0x0

    move-object v2, v11

    .line 119
    :goto_0
    iget-boolean v3, p0, Ll/᩸֫֡;->ۧ:Z

    if-nez v3, :cond_8

    .line 127
    :try_start_0
    invoke-virtual {p1, v0, v9, v11, v11}, Ll/۠֫֡;->֫(Ll/ۡ۟᩵;Ll/ܺ֫֡;Ll/᩵֫֡;Ll/᩻֫֡;)Ll/ᩴ۟᩵;

    move-result-object v0
    :try_end_0
    .catch Ll/ۜ֫֡; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_0

    .line 152
    invoke-virtual {v0}, Ll/ᩴ۟᩵;->ۘ()Ll/ۘ۟᩵;

    move-result-object v0

    .line 153
    invoke-virtual {v2}, Ll/ᩴ۟᩵;->ۘ()Ll/ۘ۟᩵;

    move-result-object v2

    .line 154
    invoke-virtual {v2, v11}, Ll/ۘ۟᩵;->֫(Ll/֡۟᩵;)V

    .line 155
    invoke-virtual {v2}, Ll/ۘ۟᩵;->֫()Ll/ᩴ۟᩵;

    move-result-object v2

    .line 153
    invoke-virtual {v0, v2}, Ll/ۘ۟᩵;->ܽ(Ll/ᩴ۟᩵;)V

    .line 156
    invoke-virtual {v0}, Ll/ۘ۟᩵;->֫()Ll/ᩴ۟᩵;

    move-result-object v0

    .line 161
    :cond_0
    :try_start_1
    invoke-virtual {v9}, Ll/ܺ֫֡;->᩻()Ll/ۚ۟᩵;

    move-result-object v2

    invoke-direct {p0, v0, v2}, Ll/᩸֫֡;->֫(Ll/ᩴ۟᩵;Ll/ۚ۟᩵;)Ll/ۡ۟᩵;

    move-result-object v12
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    if-nez v12, :cond_1

    .line 168
    invoke-virtual {v9}, Ll/ܺ֫֡;->ܳ()V

    return-object v0

    .line 172
    :cond_1
    invoke-virtual {v0}, Ll/ᩴ۟᩵;->֫()Ll/֡۟᩵;

    move-result-object v2

    invoke-static {v2}, Ll/᩶۟᩵;->֫(Ljava/io/Closeable;)V

    add-int/lit8 v13, v1, 0x1

    const/16 v1, 0x14

    if-gt v13, v1, :cond_5

    .line 179
    invoke-virtual {v12}, Ll/ۡ۟᩵;->֫()Ll/ۖ۟᩵;

    move-result-object v1

    instance-of v1, v1, Ll/᩶֫֡;

    if-nez v1, :cond_4

    .line 184
    invoke-virtual {v12}, Ll/ۡ۟᩵;->᩻()Ll/ۨܰ᩵;

    move-result-object v1

    invoke-static {v0, v1}, Ll/᩸֫֡;->֫(Ll/ᩴ۟᩵;Ll/ۨܰ᩵;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 185
    invoke-virtual {v9}, Ll/ܺ֫֡;->ܳ()V

    .line 186
    new-instance v9, Ll/ܺ֫֡;

    iget-object v1, p0, Ll/᩸֫֡;->ܽ:Ll/ܿ۟᩵;

    invoke-virtual {v1}, Ll/ܿ۟᩵;->ܿ()Ll/ۡܰ᩵;

    move-result-object v2

    .line 187
    invoke-virtual {v12}, Ll/ۡ۟᩵;->᩻()Ll/ۨܰ᩵;

    move-result-object v1

    invoke-direct {p0, v1}, Ll/᩸֫֡;->֫(Ll/ۨܰ᩵;)Ll/ۙ᩺᩵;

    move-result-object v3

    iget-object v6, p0, Ll/᩸֫֡;->֫:Ljava/lang/Object;

    move-object v1, v9

    move-object v4, v7

    move-object v5, v8

    invoke-direct/range {v1 .. v6}, Ll/ܺ֫֡;-><init>(Ll/ۡܰ᩵;Ll/ۙ᩺᩵;Ll/ܽܰ᩵;Ll/᩶ܰ᩵;Ljava/lang/Object;)V

    .line 188
    iput-object v9, p0, Ll/᩸֫֡;->ᩳ:Ll/ܺ֫֡;

    goto :goto_1

    .line 189
    :cond_2
    invoke-virtual {v9}, Ll/ܺ֫֡;->ۧ()Ll/᩵֫֡;

    move-result-object v1

    if-nez v1, :cond_3

    :goto_1
    move-object v2, v0

    move-object v0, v12

    move v1, v13

    goto :goto_0

    .line 190
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Closing the body of "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " didn\'t close its backing stream. Bad interceptor?"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 180
    :cond_4
    invoke-virtual {v9}, Ll/ܺ֫֡;->ܳ()V

    .line 181
    new-instance p1, Ljava/net/HttpRetryException;

    const-string v1, "Cannot retry streamed HTTP body"

    invoke-virtual {v0}, Ll/ᩴ۟᩵;->ᩳ()I

    move-result v0

    invoke-direct {p1, v1, v0}, Ljava/net/HttpRetryException;-><init>(Ljava/lang/String;I)V

    throw p1

    .line 175
    :cond_5
    invoke-virtual {v9}, Ll/ܺ֫֡;->ܳ()V

    .line 176
    new-instance p1, Ljava/net/ProtocolException;

    const-string v0, "Too many follow-up requests: "

    .line 0
    invoke-static {v13, v0}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 176
    invoke-direct {p1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    :catch_0
    move-exception p1

    .line 163
    invoke-virtual {v9}, Ll/ܺ֫֡;->ܳ()V

    .line 164
    throw p1

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_1
    move-exception v3

    .line 138
    :try_start_2
    instance-of v4, v3, Ll/᩺֫֡;

    xor-int/lit8 v4, v4, 0x1

    .line 139
    invoke-direct {p0, v3, v9, v4, v0}, Ll/᩸֫֡;->֫(Ljava/io/IOException;Ll/ܺ֫֡;ZLl/ۡ۟᩵;)Z

    move-result v4

    if-eqz v4, :cond_6

    goto/16 :goto_0

    :cond_6
    throw v3

    :catch_2
    move-exception v3

    .line 131
    invoke-virtual {v3}, Ll/ۜ֫֡;->ۧ()Ljava/io/IOException;

    move-result-object v4

    invoke-direct {p0, v4, v9, v10, v0}, Ll/᩸֫֡;->֫(Ljava/io/IOException;Ll/ܺ֫֡;ZLl/ۡ۟᩵;)Z

    move-result v4

    if-eqz v4, :cond_7

    goto/16 :goto_0

    .line 132
    :cond_7
    invoke-virtual {v3}, Ll/ۜ֫֡;->֫()Ljava/io/IOException;

    move-result-object p1

    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 145
    :goto_2
    invoke-virtual {v9, v11}, Ll/ܺ֫֡;->֫(Ljava/io/IOException;)V

    .line 146
    invoke-virtual {v9}, Ll/ܺ֫֡;->ܳ()V

    throw p1

    .line 120
    :cond_8
    invoke-virtual {v9}, Ll/ܺ֫֡;->ܳ()V

    .line 121
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Canceled"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫()V
    .locals 1

    const/4 v0, 0x1

    .line 89
    iput-boolean v0, p0, Ll/᩸֫֡;->ۧ:Z

    .line 90
    iget-object v0, p0, Ll/᩸֫֡;->ᩳ:Ll/ܺ֫֡;

    if-eqz v0, :cond_0

    .line 91
    invoke-virtual {v0}, Ll/ܺ֫֡;->֫()V

    :cond_0
    return-void
.end method

.method public final ֫(Ljava/lang/Object;)V
    .locals 0

    .line 99
    iput-object p1, p0, Ll/᩸֫֡;->֫:Ljava/lang/Object;

    return-void
.end method

.method public final ۧ()Z
    .locals 1

    .line 95
    iget-boolean v0, p0, Ll/᩸֫֡;->ۧ:Z

    return v0
.end method
