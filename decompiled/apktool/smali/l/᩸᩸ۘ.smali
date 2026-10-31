.class public final Ll/᩸᩸ۘ;
.super Ljava/lang/Object;
.source "51RR"


# direct methods
.method public static ֫(Ljava/io/IOException;)I
    .locals 1

    .line 337
    instance-of v0, p0, Ljava/io/CharConversionException;

    if-eqz v0, :cond_0

    const/16 p0, -0x14

    return p0

    .line 339
    :cond_0
    instance-of v0, p0, Ljava/nio/charset/MalformedInputException;

    if-eqz v0, :cond_1

    const/16 p0, -0x15

    return p0

    .line 341
    :cond_1
    instance-of v0, p0, Ljava/nio/charset/UnmappableCharacterException;

    if-eqz v0, :cond_2

    const/16 p0, -0x16

    return p0

    .line 343
    :cond_2
    instance-of v0, p0, Ljava/nio/channels/ClosedChannelException;

    if-eqz v0, :cond_3

    const/16 p0, -0x18

    return p0

    .line 345
    :cond_3
    instance-of v0, p0, Ljava/io/EOFException;

    if-eqz v0, :cond_4

    const/16 p0, -0x1a

    return p0

    .line 347
    :cond_4
    instance-of v0, p0, Ljava/nio/channels/FileLockInterruptionException;

    if-eqz v0, :cond_5

    const/16 p0, -0x1b

    return p0

    .line 349
    :cond_5
    instance-of v0, p0, Ljava/io/FileNotFoundException;

    if-eqz v0, :cond_6

    const/16 p0, -0x1c

    return p0

    .line 351
    :cond_6
    instance-of v0, p0, Ljava/net/HttpRetryException;

    if-eqz v0, :cond_7

    const/16 p0, -0x1d

    return p0

    .line 353
    :cond_7
    instance-of v0, p0, Ljava/net/SocketTimeoutException;

    if-eqz v0, :cond_8

    const/4 p0, -0x8

    return p0

    .line 355
    :cond_8
    instance-of v0, p0, Ljava/util/InvalidPropertiesFormatException;

    if-eqz v0, :cond_9

    const/16 p0, -0x1e

    return p0

    .line 357
    :cond_9
    instance-of v0, p0, Ljava/net/MalformedURLException;

    if-eqz v0, :cond_a

    const/4 p0, -0x3

    return p0

    .line 359
    :cond_a
    instance-of v0, p0, Ljava/io/InvalidClassException;

    if-eqz v0, :cond_b

    const/16 p0, -0x21

    return p0

    .line 361
    :cond_b
    instance-of v0, p0, Ljava/io/InvalidObjectException;

    if-eqz v0, :cond_c

    const/16 p0, -0x22

    return p0

    .line 363
    :cond_c
    instance-of v0, p0, Ljava/io/NotActiveException;

    if-eqz v0, :cond_d

    const/16 p0, -0x23

    return p0

    .line 365
    :cond_d
    instance-of v0, p0, Ljava/io/NotSerializableException;

    if-eqz v0, :cond_e

    const/16 p0, -0x24

    return p0

    .line 367
    :cond_e
    instance-of v0, p0, Ljava/io/OptionalDataException;

    if-eqz v0, :cond_f

    const/16 p0, -0x25

    return p0

    .line 369
    :cond_f
    instance-of v0, p0, Ljava/io/StreamCorruptedException;

    if-eqz v0, :cond_10

    const/16 p0, -0x26

    return p0

    .line 371
    :cond_10
    instance-of v0, p0, Ljava/io/WriteAbortedException;

    if-eqz v0, :cond_11

    const/16 p0, -0x27

    return p0

    .line 373
    :cond_11
    instance-of v0, p0, Ljava/net/ProtocolException;

    if-eqz v0, :cond_12

    const/16 p0, -0x28

    return p0

    .line 375
    :cond_12
    instance-of v0, p0, Ljavax/net/ssl/SSLHandshakeException;

    if-eqz v0, :cond_13

    const/16 p0, -0x29

    return p0

    .line 377
    :cond_13
    instance-of v0, p0, Ljavax/net/ssl/SSLKeyException;

    if-eqz v0, :cond_14

    const/16 p0, -0x2a

    return p0

    .line 379
    :cond_14
    instance-of v0, p0, Ljavax/net/ssl/SSLPeerUnverifiedException;

    if-eqz v0, :cond_15

    const/16 p0, -0x2b

    return p0

    .line 381
    :cond_15
    instance-of v0, p0, Ljavax/net/ssl/SSLProtocolException;

    if-eqz v0, :cond_16

    const/16 p0, -0x2c

    return p0

    .line 383
    :cond_16
    instance-of v0, p0, Ljava/net/BindException;

    if-eqz v0, :cond_17

    const/16 p0, -0x2d

    return p0

    .line 385
    :cond_17
    instance-of v0, p0, Ljava/net/ConnectException;

    if-eqz v0, :cond_18

    const/16 p0, -0x2e

    return p0

    .line 387
    :cond_18
    instance-of v0, p0, Ljava/net/NoRouteToHostException;

    if-eqz v0, :cond_19

    const/16 p0, -0x2f

    return p0

    .line 389
    :cond_19
    instance-of v0, p0, Ljava/net/PortUnreachableException;

    if-eqz v0, :cond_1a

    const/16 p0, -0x30

    return p0

    .line 391
    :cond_1a
    instance-of v0, p0, Ljava/io/SyncFailedException;

    if-eqz v0, :cond_1b

    const/16 p0, -0x31

    return p0

    .line 393
    :cond_1b
    instance-of v0, p0, Ljava/io/UTFDataFormatException;

    if-eqz v0, :cond_1c

    const/16 p0, -0x32

    return p0

    .line 395
    :cond_1c
    instance-of v0, p0, Ljava/net/UnknownHostException;

    if-eqz v0, :cond_1d

    const/16 p0, -0x33

    return p0

    .line 397
    :cond_1d
    instance-of v0, p0, Ljava/net/UnknownServiceException;

    if-eqz v0, :cond_1e

    const/16 p0, -0x34

    return p0

    .line 399
    :cond_1e
    instance-of v0, p0, Ljava/io/UnsupportedEncodingException;

    if-eqz v0, :cond_1f

    const/16 p0, -0x35

    return p0

    .line 401
    :cond_1f
    instance-of p0, p0, Ljava/util/zip/ZipException;

    if-eqz p0, :cond_20

    const/16 p0, -0x36

    return p0

    :cond_20
    const/4 p0, -0x2

    return p0
.end method

.method public static ֫(Landroid/os/Bundle;)Ljava/util/HashMap;
    .locals 7

    .line 493
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 494
    invoke-virtual {p0}, Landroid/os/BaseBundle;->size()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_2

    .line 498
    :cond_0
    invoke-virtual {p0}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 499
    invoke-virtual {p0, v2}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    .line 500
    instance-of v4, v3, Ljava/lang/String;

    if-nez v4, :cond_1

    instance-of v4, v3, [Ljava/lang/String;

    if-nez v4, :cond_1

    .line 501
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "parseBundleToMap: the type "

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " is unsupported"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "openSDK_LOG.HttpUtils"

    invoke-static {v3, v2}, Ll/ۡ᩸ۘ;->ܿ(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 504
    :cond_1
    instance-of v4, v3, [Ljava/lang/String;

    if-eqz v4, :cond_4

    .line 505
    check-cast v3, [Ljava/lang/String;

    .line 506
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v5, 0x0

    .line 507
    :goto_1
    array-length v6, v3

    if-ge v5, v6, :cond_3

    if-eqz v5, :cond_2

    const-string v6, ","

    .line 509
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 511
    :cond_2
    aget-object v6, v3, v5

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 513
    :cond_3
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 515
    :cond_4
    check-cast v3, Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_5
    :goto_2
    return-object v0
.end method

.method public static ֫(Landroid/os/Bundle;Ljava/lang/String;)Ll/ۙܶۘ;
    .locals 6

    .line 413
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0, p0}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 431
    invoke-static {v0}, Ll/᩸᩸ۘ;->֫(Landroid/os/Bundle;)Ljava/util/HashMap;

    move-result-object p0

    .line 530
    new-instance v1, Ljava/util/HashMap;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    .line 531
    invoke-virtual {v0}, Landroid/os/BaseBundle;->size()I

    move-result v2

    if-nez v2, :cond_0

    goto :goto_1

    .line 535
    :cond_0
    invoke-virtual {v0}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 536
    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    .line 537
    instance-of v5, v4, [B

    if-nez v5, :cond_1

    goto :goto_0

    .line 540
    :cond_1
    check-cast v4, [B

    invoke-virtual {v1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 434
    :cond_2
    :goto_1
    invoke-virtual {v1}, Ljava/util/HashMap;->size()I

    move-result v0

    if-nez v0, :cond_3

    .line 435
    invoke-static {}, Ll/᩶ܶۘ;->֫()Ll/᩶ܶۘ;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Ll/᩶ܶۘ;->ۧ(Ljava/util/HashMap;Ljava/lang/String;)Ll/ۙܶۘ;

    move-result-object p0

    return-object p0

    .line 439
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "openUrl: has binary "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/util/HashMap;->size()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "openSDK_LOG.HttpUtils"

    invoke-static {v2, v0}, Ll/ۡ᩸ۘ;->ܿ(Ljava/lang/String;Ljava/lang/String;)V

    .line 440
    invoke-static {}, Ll/᩶ܶۘ;->֫()Ll/᩶ܶۘ;

    move-result-object v0

    invoke-virtual {v0, p1, p0, v1}, Ll/᩶ܶۘ;->֫(Ljava/lang/String;Ljava/util/HashMap;Ljava/util/HashMap;)Ll/ۙܶۘ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/᩸۠ۘ;Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 18

    move-object/from16 v0, p1

    const-string v1, "OpenApi request"

    const-string v2, "openSDK_LOG.HttpUtils"

    .line 152
    invoke-static {v2, v1}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    .line 155
    invoke-static/range {p1 .. p1}, Ll/ᩳ᩹ۘ;->֫(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_5

    const-string v1, "https://appsupport.qq.com/cgi-bin/qzapps/mapp_addapp.cgi"

    .line 162
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v3

    const-string v4, "http"

    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 166
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ll/ܰ᩸ۘ;->֫()Ll/ܰ᩸ۘ;

    move-result-object v4

    const-string v5, "https://openmobile.qq.com/"

    invoke-virtual {v4, v0, v5}, Ll/ܰ᩸ۘ;->֫(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 168
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ll/ܰ᩸ۘ;->֫()Ll/ܰ᩸ۘ;

    move-result-object v6

    invoke-virtual {v6, v0, v5}, Ll/ܰ᩸ۘ;->֫(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v3, v1

    .line 174
    :goto_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    .line 180
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v6, "101492915"

    invoke-static {v0, v6}, Ll/᩺᩸ۘ;->֫(Landroid/content/Context;Ljava/lang/String;)Ll/᩺᩸ۘ;

    move-result-object v0

    const-string v6, "Common_HttpRetryCount"

    invoke-virtual {v0, v6}, Ll/᩺᩸ۘ;->֫(Ljava/lang/String;)I

    move-result v0

    .line 182
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "config 1:Common_HttpRetryCount            config_value:"

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, "   appid:101492915     url:"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const-string v8, "OpenConfig_test"

    .line 182
    invoke-static {v8, v6}, Ll/ۡ᩸ۘ;->ᩳ(Ljava/lang/String;Ljava/lang/String;)V

    if-nez v0, :cond_1

    const/4 v0, 0x3

    const/4 v12, 0x3

    goto :goto_1

    :cond_1
    move v12, v0

    .line 186
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v6, "config 1:Common_HttpRetryCount            result_value:"

    invoke-direct {v0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 186
    invoke-static {v8, v0}, Ll/ۡ᩸ۘ;->ᩳ(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    move-wide v13, v4

    :goto_2
    add-int/lit8 v15, v0, 0x1

    move-object/from16 v11, p2

    .line 194
    :try_start_0
    invoke-static {v11, v3}, Ll/᩸᩸ۘ;->֫(Landroid/os/Bundle;Ljava/lang/String;)Ll/ۙܶۘ;

    move-result-object v0

    .line 196
    invoke-interface {v0}, Ll/ۙܶۘ;->d()I

    move-result v9

    .line 197
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "request statusCode "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v4, 0xc8

    if-ne v9, v4, :cond_2

    .line 206
    invoke-interface {v0}, Ll/ۙܶۘ;->a()Ljava/lang/String;

    move-result-object v4

    .line 207
    invoke-static {v4}, Ll/ᩳ᩹ۘ;->ᩳ(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v4
    :try_end_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    const-string v5, "ret"

    .line 210
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v4
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/net/MalformedURLException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2

    goto :goto_3

    :catch_0
    const/4 v4, -0x4

    .line 216
    :goto_3
    :try_start_2
    invoke-interface {v0}, Ll/ۙܶۘ;->c()I

    move-result v5

    int-to-long v5, v5

    .line 217
    invoke-interface {v0}, Ll/ۙܶۘ;->b()I

    move-result v0

    int-to-long v2, v0

    move-wide v9, v2

    move v11, v4

    move-wide v7, v5

    goto/16 :goto_4

    .line 202
    :cond_2
    invoke-static {}, Ll/ᩳ᩸ۘ;->ۧ()Ll/ᩳ᩸ۘ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide/16 v7, 0x0

    const-wide/16 v16, 0x0

    move-object v4, v1

    move-wide v5, v13

    move v0, v9

    move-wide/from16 v9, v16

    move v11, v0

    invoke-static/range {v4 .. v11}, Ll/ᩳ᩸ۘ;->֫(Ljava/lang/String;JJJI)V

    .line 203
    new-instance v4, Ll/۠᩸ۘ;

    const-string v5, "http status code error:"

    .line 0
    invoke-static {v0, v5}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 121
    invoke-direct {v4, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 203
    throw v4
    :try_end_2
    .catch Ljava/net/SocketTimeoutException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/net/MalformedURLException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    move-exception v0

    .line 256
    invoke-static {}, Ll/ᩳ᩸ۘ;->ۧ()Ll/ᩳ᩸ۘ;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, -0x4

    move-object v4, v1

    move-wide v5, v13

    invoke-static/range {v4 .. v11}, Ll/ᩳ᩸ۘ;->֫(Ljava/lang/String;JJJI)V

    .line 257
    throw v0

    :catch_2
    move-exception v0

    .line 246
    invoke-static {v0}, Ll/᩸᩸ۘ;->֫(Ljava/io/IOException;)I

    move-result v11

    .line 249
    invoke-static {}, Ll/ᩳ᩸ۘ;->ۧ()Ll/ᩳ᩸ۘ;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    move-object v4, v1

    move-wide v5, v13

    invoke-static/range {v4 .. v11}, Ll/ᩳ᩸ۘ;->֫(Ljava/lang/String;JJJI)V

    .line 250
    throw v0

    :catch_3
    move-exception v0

    .line 241
    invoke-static {}, Ll/ᩳ᩸ۘ;->ۧ()Ll/ᩳ᩸ۘ;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, -0x3

    move-object v4, v1

    move-wide v5, v13

    invoke-static/range {v4 .. v11}, Ll/ᩳ᩸ۘ;->֫(Ljava/lang/String;JJJI)V

    .line 242
    throw v0

    :catch_4
    move-exception v0

    const/4 v11, -0x8

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    if-ge v15, v12, :cond_4

    .line 228
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v13

    if-lt v15, v12, :cond_3

    :goto_4
    move-wide v5, v13

    .line 260
    invoke-static {}, Ll/ᩳ᩸ۘ;->ۧ()Ll/ᩳ᩸ۘ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object v4, v1

    invoke-static/range {v4 .. v11}, Ll/ᩳ᩸ۘ;->֫(Ljava/lang/String;JJJI)V

    return-void

    :cond_3
    move v0, v15

    goto/16 :goto_2

    .line 231
    :cond_4
    invoke-static {}, Ll/ᩳ᩸ۘ;->ۧ()Ll/ᩳ᩸ۘ;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object v4, v1

    move-wide v5, v13

    invoke-static/range {v4 .. v11}, Ll/ᩳ᩸ۘ;->֫(Ljava/lang/String;JJJI)V

    .line 232
    throw v0

    .line 157
    :cond_5
    new-instance v0, Ll/ܶ᩸ۘ;

    const-string v1, "network unavailable"

    .line 132
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 157
    throw v0
.end method

.method public static ۧ(Landroid/os/Bundle;)Ljava/lang/String;
    .locals 5

    .line 457
    invoke-static {p0}, Ll/᩸᩸ۘ;->֫(Landroid/os/Bundle;)Ljava/util/HashMap;

    move-result-object p0

    .line 468
    invoke-virtual {p0}, Ljava/util/HashMap;->size()I

    move-result v0

    if-nez v0, :cond_0

    const-string p0, ""

    return-object p0

    .line 471
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 473
    invoke-virtual {p0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-eqz v2, :cond_1

    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    const-string v4, "&"

    .line 477
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 479
    :goto_1
    invoke-static {v3}, Ll/۬֨ᩴ;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "="

    .line 480
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 481
    invoke-virtual {p0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Ll/۬֨ᩴ;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 483
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Ll/᩸۠ۘ;Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 2

    const-string v0, "openSDK_LOG.HttpUtils"

    const-string v1, "OpenApi requestAsync"

    .line 267
    invoke-static {v0, v1}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    .line 268
    new-instance v0, Ll/֨᩸ۘ;

    invoke-direct {v0, p0, p1, p2}, Ll/֨᩸ۘ;-><init>(Ll/᩸۠ۘ;Landroid/app/Activity;Landroid/os/Bundle;)V

    .line 65
    :try_start_0
    sget-object p0, Ll/ܽ᩹ۘ;->֫:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {p0, v0}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method
