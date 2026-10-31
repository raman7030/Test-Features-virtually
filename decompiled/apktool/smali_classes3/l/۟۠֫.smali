.class public final Ll/۟۠֫;
.super Ll/ۖ۠֫;
.source "C8NR"

# interfaces
.implements Ll/᩷ܶ֫;


# instance fields
.field public final ۖ:Ll/ܰ۠֫;

.field public final ۘ:Ll/ۜܶ֫;

.field public ۜ:Ljava/net/HttpURLConnection;

.field public ۡ:Ljava/io/InputStream;

.field public final ۢ:Ll/ۜܶ֫;

.field public ܳ:J

.field public final ܺ:I

.field public ܿ:J

.field public ᩴ:I

.field public ᩵:Z

.field public ᩷:Ll/ۗ۠֫;

.field public final ᩻:I


# direct methods
.method public constructor <init>(IILl/ۜܶ֫;Ll/ܰܶۜ;)V
    .locals 1

    const/4 v0, 0x1

    .line 296
    invoke-direct {p0, v0}, Ll/ۖ۠֫;-><init>(Z)V

    .line 298
    iput p1, p0, Ll/۟۠֫;->᩻:I

    .line 299
    iput p2, p0, Ll/۟۠֫;->ܺ:I

    .line 307
    iput-object p3, p0, Ll/۟۠֫;->ۢ:Ll/ۜܶ֫;

    .line 309
    new-instance p1, Ll/ۜܶ֫;

    invoke-direct {p1}, Ll/ۜܶ֫;-><init>()V

    iput-object p1, p0, Ll/۟۠֫;->ۘ:Ll/ۜܶ֫;

    .line 311
    iput-object p4, p0, Ll/۟۠֫;->ۖ:Ll/ܰ۠֫;

    return-void
.end method

.method private ֫(Ljava/net/URL;I[BJJZZLjava/util/Map;)Ljava/net/HttpURLConnection;
    .locals 5

    .line 685
    invoke-virtual {p1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;

    .line 639
    iget v1, p0, Ll/۟۠֫;->᩻:I

    invoke-virtual {v0, v1}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 640
    iget v1, p0, Ll/۟۠֫;->ܺ:I

    invoke-virtual {v0, v1}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 643
    iget-object v1, p0, Ll/۟۠֫;->ۖ:Ll/ܰ۠֫;

    if-nez v1, :cond_0

    .line 644
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    goto :goto_0

    :cond_0
    new-instance v2, Ljava/util/TreeMap;

    sget-object v3, Ljava/lang/String;->CASE_INSENSITIVE_ORDER:Ljava/util/Comparator;

    invoke-direct {v2, v3}, Ljava/util/TreeMap;-><init>(Ljava/util/Comparator;)V

    .line 645
    :goto_0
    iget-object v3, p0, Ll/۟۠֫;->ۢ:Ll/ۜܶ֫;

    if-eqz v3, :cond_1

    .line 646
    invoke-virtual {v3}, Ll/ۜܶ֫;->֫()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 648
    :cond_1
    iget-object v3, p0, Ll/۟۠֫;->ۘ:Ll/ۜܶ֫;

    invoke-virtual {v3}, Ll/ۜܶ֫;->֫()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 649
    invoke-interface {v2, p10}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    if-eqz v1, :cond_2

    .line 651
    check-cast v1, Ll/ܰܶۜ;

    invoke-virtual {v1, p1, v2}, Ll/ܰܶۜ;->֫(Ljava/net/URL;Ljava/util/AbstractMap;)Ljava/util/Map;

    move-result-object v2

    .line 654
    :cond_2
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p10

    if-eqz p10, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p10

    check-cast p10, Ljava/util/Map$Entry;

    .line 655
    invoke-interface {p10}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {p10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p10

    check-cast p10, Ljava/lang/String;

    invoke-virtual {v0, v1, p10}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 658
    :cond_3
    sget p1, Ll/ۢܶ֫;->֫:I

    const-wide/16 v1, 0x0

    const-wide/16 v3, -0x1

    cmp-long p1, p4, v1

    if-nez p1, :cond_4

    cmp-long p1, p6, v3

    if-nez p1, :cond_4

    const/4 p1, 0x0

    goto :goto_2

    :cond_4
    const-string p1, "bytes="

    const-string p10, "-"

    .line 0
    invoke-static {p1, p10, p4, p5}, Ll/۬֫ۢ;->֫(Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/StringBuilder;

    move-result-object p1

    cmp-long p10, p6, v3

    if-eqz p10, :cond_5

    add-long/2addr p4, p6

    const-wide/16 p6, 0x1

    sub-long/2addr p4, p6

    .line 66
    invoke-virtual {p1, p4, p5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 68
    :cond_5
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_2
    if-eqz p1, :cond_6

    const-string p4, "Range"

    .line 660
    invoke-virtual {v0, p4, p1}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    :cond_6
    if-eqz p8, :cond_7

    const-string p1, "gzip"

    goto :goto_3

    :cond_7
    const-string p1, "identity"

    :goto_3
    const-string p4, "Accept-Encoding"

    .line 665
    invoke-virtual {v0, p4, p1}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 666
    invoke-virtual {v0, p9}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    const/4 p1, 0x1

    if-eqz p3, :cond_8

    const/4 p4, 0x1

    goto :goto_4

    :cond_8
    const/4 p4, 0x0

    .line 667
    :goto_4
    invoke-virtual {v0, p4}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 668
    sget p4, Ll/ۗ۠֫;->ۢ:I

    if-eq p2, p1, :cond_b

    const/4 p1, 0x2

    if-eq p2, p1, :cond_a

    const/4 p1, 0x3

    if-ne p2, p1, :cond_9

    const-string p1, "HEAD"

    goto :goto_5

    .line 327
    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_a
    const-string p1, "POST"

    goto :goto_5

    :cond_b
    const-string p1, "GET"

    .line 668
    :goto_5
    invoke-virtual {v0, p1}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    if-eqz p3, :cond_c

    .line 671
    array-length p1, p3

    invoke-virtual {v0, p1}, Ljava/net/HttpURLConnection;->setFixedLengthStreamingMode(I)V

    .line 672
    invoke-virtual {v0}, Ljava/net/URLConnection;->connect()V

    .line 673
    invoke-virtual {v0}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object p1

    .line 674
    invoke-virtual {p1, p3}, Ljava/io/OutputStream;->write([B)V

    .line 675
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V

    return-object v0

    .line 677
    :cond_c
    invoke-virtual {v0}, Ljava/net/URLConnection;->connect()V

    return-object v0
.end method

.method private ֫(Ljava/net/URL;Ljava/lang/String;)Ljava/net/URL;
    .locals 4

    const/16 v0, 0x7d1

    if-eqz p2, :cond_3

    .line 709
    :try_start_0
    new-instance v1, Ljava/net/URL;

    invoke-direct {v1, p1, p2}, Ljava/net/URL;-><init>(Ljava/net/URL;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 719
    invoke-virtual {v1}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object p2

    const-string v2, "https"

    .line 720
    invoke-virtual {v2, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "http"

    invoke-virtual {v2, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    .line 721
    :cond_0
    new-instance p1, Ll/ܿܶ֫;

    const-string v1, "Unsupported protocol redirect: "

    .line 0
    invoke-static {v1, p2}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 721
    invoke-direct {p1, p2, v0}, Ll/ܿܶ֫;-><init>(Ljava/lang/String;I)V

    throw p1

    .line 727
    :cond_1
    :goto_0
    invoke-virtual {p1}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    return-object v1

    .line 729
    :cond_2
    new-instance v1, Ll/ܿܶ֫;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Disallowed cross-protocol redirect ("

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 731
    invoke-virtual {p1}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " to "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Ll/ܿܶ֫;-><init>(Ljava/lang/String;I)V

    throw v1

    :catch_0
    move-exception p1

    .line 711
    new-instance p2, Ll/ܿܶ֫;

    const/4 v1, 0x1

    invoke-direct {p2, p1, v0, v1}, Ll/ܿܶ֫;-><init>(Ljava/io/IOException;II)V

    throw p2

    .line 700
    :cond_3
    new-instance p1, Ll/ܿܶ֫;

    const-string p2, "Null location redirect"

    invoke-direct {p1, p2, v0}, Ll/ܿܶ֫;-><init>(Ljava/lang/String;I)V

    throw p1
.end method

.method private ֫(J)V
    .locals 7

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    const/16 v2, 0x1000

    new-array v3, v2, [B

    :goto_0
    cmp-long v4, p1, v0

    if-lez v4, :cond_3

    int-to-long v4, v2

    .line 767
    invoke-static {p1, p2, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    long-to-int v5, v4

    .line 768
    iget-object v4, p0, Ll/۟۠֫;->ۡ:Ljava/io/InputStream;

    sget-object v6, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    const/4 v6, 0x0

    invoke-virtual {v4, v3, v6, v5}, Ljava/io/InputStream;->read([BII)I

    move-result v4

    .line 769
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v5

    if-nez v5, :cond_2

    const/4 v5, -0x1

    if-eq v4, v5, :cond_1

    int-to-long v5, v4

    sub-long/2addr p1, v5

    .line 783
    invoke-virtual {p0, v4}, Ll/ۖ۠֫;->ᩳ(I)V

    goto :goto_0

    .line 777
    :cond_1
    new-instance p1, Ll/ܿܶ֫;

    invoke-direct {p1}, Ll/ܿܶ֫;-><init>()V

    throw p1

    .line 770
    :cond_2
    new-instance p1, Ll/ܿܶ֫;

    new-instance p2, Ljava/io/InterruptedIOException;

    invoke-direct {p2}, Ljava/io/InterruptedIOException;-><init>()V

    const/16 v0, 0x7d0

    const/4 v1, 0x1

    invoke-direct {p1, p2, v0, v1}, Ll/ܿܶ֫;-><init>(Ljava/io/IOException;II)V

    throw p1

    :cond_3
    :goto_1
    return-void
.end method

.method private ᩳ(Ll/ۗ۠֫;)Ljava/net/HttpURLConnection;
    .locals 24

    move-object/from16 v11, p0

    move-object/from16 v12, p1

    .line 541
    new-instance v1, Ljava/net/URL;

    iget-object v0, v12, Ll/ۗ۠֫;->ۜ:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 542
    iget v2, v12, Ll/ۗ۠֫;->ܽ:I

    .line 543
    iget-object v3, v12, Ll/ۗ۠֫;->ۧ:[B

    .line 544
    iget-wide v13, v12, Ll/ۗ۠֫;->᩻:J

    .line 545
    iget-wide v9, v12, Ll/ۗ۠֫;->ܳ:J

    .line 496
    iget v0, v12, Ll/ۗ۠֫;->֫:I

    const/4 v4, 0x1

    and-int/2addr v0, v4

    const/4 v5, 0x0

    if-ne v0, v4, :cond_0

    const/4 v0, 0x1

    const/4 v15, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    const/4 v15, 0x0

    .line 548
    :goto_0
    iget-object v0, v11, Ll/۟۠֫;->ۖ:Ll/ܰ۠֫;

    if-nez v0, :cond_1

    const/16 v16, 0x1

    .line 554
    iget-object v12, v12, Ll/ۗ۠֫;->ᩳ:Ljava/util/Map;

    move-object/from16 v0, p0

    move-wide v4, v13

    move-wide v6, v9

    move v8, v15

    move/from16 v9, v16

    move-object v10, v12

    invoke-direct/range {v0 .. v10}, Ll/۟۠֫;->֫(Ljava/net/URL;I[BJJZZLjava/util/Map;)Ljava/net/HttpURLConnection;

    move-result-object v0

    return-object v0

    :cond_1
    move-object v8, v1

    move v6, v2

    move-object/from16 v16, v3

    const/4 v7, 0x1

    :goto_1
    add-int/lit8 v4, v5, 0x1

    const/16 v0, 0x14

    if-gt v5, v0, :cond_7

    const/16 v17, 0x0

    .line 568
    iget-object v5, v12, Ll/ۗ۠֫;->ᩳ:Ljava/util/Map;

    move-object/from16 v0, p0

    move-object v1, v8

    move v2, v6

    move-object/from16 v3, v16

    move v12, v4

    move-object/from16 v18, v5

    move-wide v4, v13

    move-wide/from16 v19, v13

    move v13, v6

    move v14, v7

    move-wide v6, v9

    move/from16 v21, v12

    move-object v12, v8

    move v8, v15

    move-wide/from16 v22, v9

    move/from16 v9, v17

    move-object/from16 v10, v18

    .line 569
    invoke-direct/range {v0 .. v10}, Ll/۟۠֫;->֫(Ljava/net/URL;I[BJJZZLjava/util/Map;)Ljava/net/HttpURLConnection;

    move-result-object v0

    .line 578
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v1

    const-string v2, "Location"

    .line 579
    invoke-virtual {v0, v2}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x12e

    if-eq v13, v14, :cond_2

    const/4 v4, 0x3

    if-ne v13, v4, :cond_3

    :cond_2
    const/16 v4, 0x12c

    if-eq v1, v4, :cond_6

    const/16 v4, 0x12d

    if-eq v1, v4, :cond_6

    if-eq v1, v3, :cond_6

    const/16 v4, 0x12f

    if-eq v1, v4, :cond_6

    const/16 v4, 0x133

    if-eq v1, v4, :cond_6

    const/16 v4, 0x134

    if-ne v1, v4, :cond_3

    goto :goto_2

    :cond_3
    const/4 v4, 0x2

    if-ne v13, v4, :cond_5

    const/16 v4, 0x12c

    if-eq v1, v4, :cond_4

    const/16 v4, 0x12d

    if-eq v1, v4, :cond_4

    if-eq v1, v3, :cond_4

    const/16 v3, 0x12f

    if-ne v1, v3, :cond_5

    .line 594
    :cond_4
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 602
    invoke-direct {v11, v12, v2}, Ll/۟۠֫;->֫(Ljava/net/URL;Ljava/lang/String;)Ljava/net/URL;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    move-object v8, v0

    move-object/from16 v16, v1

    const/4 v6, 0x1

    goto :goto_3

    :cond_5
    return-object v0

    .line 587
    :cond_6
    :goto_2
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 588
    invoke-direct {v11, v12, v2}, Ll/۟۠֫;->֫(Ljava/net/URL;Ljava/lang/String;)Ljava/net/URL;

    move-result-object v0

    move-object v8, v0

    move v6, v13

    :goto_3
    const/4 v7, 0x1

    move-object/from16 v12, p1

    move-wide/from16 v13, v19

    move/from16 v5, v21

    move-wide/from16 v9, v22

    goto/16 :goto_1

    :cond_7
    move/from16 v21, v4

    .line 609
    new-instance v0, Ll/ܿܶ֫;

    new-instance v1, Ljava/net/NoRouteToHostException;

    const-string v2, "Too many redirects: "

    move/from16 v5, v21

    .line 0
    invoke-static {v5, v2}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 609
    invoke-direct {v1, v2}, Ljava/net/NoRouteToHostException;-><init>(Ljava/lang/String;)V

    const/16 v2, 0x7d1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Ll/ܿܶ֫;-><init>(Ljava/io/IOException;II)V

    throw v0
.end method

.method private ᩻()V
    .locals 2

    .line 825
    iget-object v0, p0, Ll/۟۠֫;->ۜ:Ljava/net/HttpURLConnection;

    if-eqz v0, :cond_0

    .line 827
    :try_start_0
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "Unexpected error while disconnecting"

    .line 829
    invoke-static {v1, v0}, Ll/᩶ۚ֫;->ۧ(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 515
    :try_start_0
    iget-object v2, p0, Ll/۟۠֫;->ۡ:Ljava/io/InputStream;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_0

    .line 518
    :try_start_1
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v2

    .line 520
    :try_start_2
    new-instance v3, Ll/ܿܶ֫;

    .line 522
    sget-object v4, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    const/16 v4, 0x7d0

    const/4 v5, 0x3

    invoke-direct {v3, v2, v4, v5}, Ll/ܿܶ֫;-><init>(Ljava/io/IOException;II)V

    throw v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 528
    :cond_0
    :goto_0
    iput-object v1, p0, Ll/۟۠֫;->ۡ:Ljava/io/InputStream;

    .line 529
    invoke-direct {p0}, Ll/۟۠֫;->᩻()V

    .line 530
    iget-boolean v2, p0, Ll/۟۠֫;->᩵:Z

    if-eqz v2, :cond_1

    .line 531
    iput-boolean v0, p0, Ll/۟۠֫;->᩵:Z

    .line 532
    invoke-virtual {p0}, Ll/ۖ۠֫;->ܳ()V

    .line 534
    :cond_1
    iput-object v1, p0, Ll/۟۠֫;->ۜ:Ljava/net/HttpURLConnection;

    .line 535
    iput-object v1, p0, Ll/۟۠֫;->᩷:Ll/ۗ۠֫;

    return-void

    :catchall_0
    move-exception v2

    .line 528
    iput-object v1, p0, Ll/۟۠֫;->ۡ:Ljava/io/InputStream;

    .line 529
    invoke-direct {p0}, Ll/۟۠֫;->᩻()V

    .line 530
    iget-boolean v3, p0, Ll/۟۠֫;->᩵:Z

    if-eqz v3, :cond_2

    .line 531
    iput-boolean v0, p0, Ll/۟۠֫;->᩵:Z

    .line 532
    invoke-virtual {p0}, Ll/ۖ۠֫;->ܳ()V

    .line 534
    :cond_2
    iput-object v1, p0, Ll/۟۠֫;->ۜ:Ljava/net/HttpURLConnection;

    .line 535
    iput-object v1, p0, Ll/۟۠֫;->᩷:Ll/ۗ۠֫;

    .line 536
    throw v2
.end method

.method public final read([BII)I
    .locals 6

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return p1

    .line 805
    :cond_0
    :try_start_0
    iget-wide v0, p0, Ll/۟۠֫;->ܳ:J

    const-wide/16 v2, -0x1

    const/4 v4, -0x1

    cmp-long v5, v0, v2

    if-eqz v5, :cond_2

    .line 806
    iget-wide v2, p0, Ll/۟۠֫;->ܿ:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v5, v0, v2

    if-nez v5, :cond_1

    goto :goto_0

    :cond_1
    int-to-long v2, p3

    .line 810
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int p3, v0

    .line 813
    :cond_2
    iget-object v0, p0, Ll/۟۠֫;->ۡ:Ljava/io/InputStream;

    sget-object v1, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result p1

    if-ne p1, v4, :cond_3

    :goto_0
    return v4

    .line 818
    :cond_3
    iget-wide p2, p0, Ll/۟۠֫;->ܿ:J

    int-to-long v0, p1

    add-long/2addr p2, v0

    iput-wide p2, p0, Ll/۟۠֫;->ܿ:J

    .line 819
    invoke-virtual {p0, p1}, Ll/ۖ۠֫;->ᩳ(I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    .line 507
    sget-object p2, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    const/4 p2, 0x2

    .line 506
    invoke-static {p1, p2}, Ll/ܿܶ֫;->֫(Ljava/io/IOException;I)Ll/ܿܶ֫;

    move-result-object p1

    throw p1
.end method

.method public final ֫(Ll/ۗ۠֫;)J
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    .line 375
    iput-object v0, v1, Ll/۟۠֫;->᩷:Ll/ۗ۠֫;

    const-wide/16 v2, 0x0

    .line 376
    iput-wide v2, v1, Ll/۟۠֫;->ܿ:J

    .line 377
    iput-wide v2, v1, Ll/۟۠֫;->ܳ:J

    .line 378
    invoke-virtual/range {p0 .. p1}, Ll/ۖ۠֫;->ۧ(Ll/ۗ۠֫;)V

    const/4 v4, 0x1

    .line 383
    :try_start_0
    invoke-direct/range {p0 .. p1}, Ll/۟۠֫;->ᩳ(Ll/ۗ۠֫;)Ljava/net/HttpURLConnection;

    move-result-object v5

    iget-wide v6, v0, Ll/ۗ۠֫;->᩻:J

    iget-wide v8, v0, Ll/ۗ۠֫;->ܳ:J

    iput-object v5, v1, Ll/۟۠֫;->ۜ:Ljava/net/HttpURLConnection;

    .line 385
    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v10

    iput v10, v1, Ll/۟۠֫;->ᩴ:I

    .line 386
    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->getResponseMessage()Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3

    .line 394
    iget v10, v1, Ll/۟۠֫;->ᩴ:I

    const-string v11, "Content-Range"

    const/16 v12, 0xc8

    const-wide/16 v13, -0x1

    if-lt v10, v12, :cond_7

    const/16 v15, 0x12b

    if-le v10, v15, :cond_0

    goto/16 :goto_1

    .line 434
    :cond_0
    invoke-virtual {v5}, Ljava/net/URLConnection;->getContentType()Ljava/lang/String;

    .line 443
    iget v10, v1, Ll/۟۠֫;->ᩴ:I

    if-ne v10, v12, :cond_1

    cmp-long v10, v6, v2

    if-eqz v10, :cond_1

    move-wide v2, v6

    :cond_1
    const-string v6, "Content-Encoding"

    .line 835
    invoke-virtual {v5, v6}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "gzip"

    .line 836
    invoke-virtual {v7, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_4

    cmp-long v7, v8, v13

    if-eqz v7, :cond_2

    .line 449
    iput-wide v8, v1, Ll/۟۠֫;->ܳ:J

    goto :goto_0

    :cond_2
    const-string v7, "Content-Length"

    .line 453
    invoke-virtual {v5, v7}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 454
    invoke-virtual {v5, v11}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 452
    invoke-static {v7, v8}, Ll/ۢܶ֫;->֫(Ljava/lang/String;Ljava/lang/String;)J

    move-result-wide v7

    cmp-long v9, v7, v13

    if-eqz v9, :cond_3

    sub-long v13, v7, v2

    .line 456
    :cond_3
    iput-wide v13, v1, Ll/۟۠֫;->ܳ:J

    goto :goto_0

    .line 462
    :cond_4
    iput-wide v8, v1, Ll/۟۠֫;->ܳ:J

    :goto_0
    const/16 v7, 0x7d0

    .line 466
    :try_start_1
    invoke-virtual {v5}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v5

    iput-object v5, v1, Ll/۟۠֫;->ۡ:Ljava/io/InputStream;

    if-eqz v6, :cond_5

    .line 468
    new-instance v5, Ljava/util/zip/GZIPInputStream;

    iget-object v6, v1, Ll/۟۠֫;->ۡ:Ljava/io/InputStream;

    invoke-direct {v5, v6}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    iput-object v5, v1, Ll/۟۠֫;->ۡ:Ljava/io/InputStream;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 479
    :cond_5
    iput-boolean v4, v1, Ll/۟۠֫;->᩵:Z

    .line 480
    invoke-virtual/range {p0 .. p1}, Ll/ۖ۠֫;->ܽ(Ll/ۗ۠֫;)V

    .line 483
    :try_start_2
    invoke-direct {v1, v2, v3}, Ll/۟۠֫;->֫(J)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 497
    iget-wide v2, v1, Ll/۟۠֫;->ܳ:J

    return-wide v2

    :catch_0
    move-exception v0

    move-object v2, v0

    .line 485
    invoke-direct/range {p0 .. p0}, Ll/۟۠֫;->᩻()V

    .line 487
    instance-of v0, v2, Ll/ܿܶ֫;

    if-eqz v0, :cond_6

    .line 488
    move-object v0, v2

    check-cast v0, Ll/ܿܶ֫;

    throw v0

    .line 490
    :cond_6
    new-instance v0, Ll/ܿܶ֫;

    invoke-direct {v0, v2, v7, v4}, Ll/ܿܶ֫;-><init>(Ljava/io/IOException;II)V

    throw v0

    :catch_1
    move-exception v0

    .line 471
    invoke-direct/range {p0 .. p0}, Ll/۟۠֫;->᩻()V

    .line 472
    new-instance v2, Ll/ܿܶ֫;

    invoke-direct {v2, v0, v7, v4}, Ll/ܿܶ֫;-><init>(Ljava/io/IOException;II)V

    throw v2

    .line 395
    :cond_7
    :goto_1
    invoke-virtual {v5}, Ljava/net/URLConnection;->getHeaderFields()Ljava/util/Map;

    move-result-object v12

    .line 396
    iget v10, v1, Ll/۟۠֫;->ᩴ:I

    const/16 v15, 0x1a0

    if-ne v10, v15, :cond_9

    .line 398
    invoke-virtual {v5, v11}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ll/ۢܶ֫;->֫(Ljava/lang/String;)J

    move-result-wide v10

    cmp-long v16, v6, v10

    if-nez v16, :cond_9

    .line 400
    iput-boolean v4, v1, Ll/۟۠֫;->᩵:Z

    .line 401
    invoke-virtual/range {p0 .. p1}, Ll/ۖ۠֫;->ܽ(Ll/ۗ۠֫;)V

    cmp-long v0, v8, v13

    if-eqz v0, :cond_8

    return-wide v8

    :cond_8
    return-wide v2

    .line 406
    :cond_9
    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    move-result-object v0

    if-eqz v0, :cond_a

    .line 410
    :try_start_3
    invoke-static {v0}, Ll/ᩳ᩺ܺ;->֫(Ljava/io/InputStream;)[B

    move-result-object v0

    goto :goto_2

    :cond_a
    sget-object v0, Ll/ۘ֨֫;->ܿ:[B
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_2

    .line 412
    :catch_2
    sget-object v0, Ll/ۘ֨֫;->ܿ:[B

    .line 414
    :goto_2
    invoke-virtual {v5}, Ljava/net/URLConnection;->getURL()Ljava/net/URL;

    move-result-object v2

    invoke-virtual {v2}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v13

    .line 417
    iget v2, v1, Ll/۟۠֫;->ᩴ:I

    if-ne v2, v15, :cond_b

    .line 418
    new-instance v2, Ll/᩹۠֫;

    const/16 v3, 0x7d8

    invoke-direct {v2, v3}, Ll/᩹۠֫;-><init>(I)V

    goto :goto_3

    :cond_b
    const/4 v2, 0x0

    :goto_3
    move-object v10, v2

    .line 421
    new-instance v2, Ll/᩻ܶ֫;

    iget v9, v1, Ll/۟۠֫;->ᩴ:I

    move-object v8, v2

    move-object v11, v12

    move-object v12, v0

    invoke-direct/range {v8 .. v13}, Ll/᩻ܶ֫;-><init>(ILl/᩹۠֫;Ljava/util/Map;[BLandroid/net/Uri;)V

    .line 429
    invoke-direct/range {p0 .. p0}, Ll/۟۠֫;->᩻()V

    .line 430
    throw v2

    :catch_3
    move-exception v0

    .line 388
    invoke-direct/range {p0 .. p0}, Ll/۟۠֫;->᩻()V

    .line 389
    invoke-static {v0, v4}, Ll/ܿܶ֫;->֫(Ljava/io/IOException;I)Ll/ܿܶ֫;

    move-result-object v0

    throw v0
.end method

.method public final ֫()Ljava/util/Map;
    .locals 2

    .line 336
    iget-object v0, p0, Ll/۟۠֫;->ۜ:Ljava/net/HttpURLConnection;

    if-nez v0, :cond_0

    .line 337
    invoke-static {}, Ll/ۢ۬ܺ;->of()Ll/ۢ۬ܺ;

    move-result-object v0

    return-object v0

    .line 347
    :cond_0
    new-instance v1, Ll/᩺۠֫;

    invoke-virtual {v0}, Ljava/net/URLConnection;->getHeaderFields()Ljava/util/Map;

    move-result-object v0

    invoke-direct {v1, v0}, Ll/᩺۠֫;-><init>(Ljava/util/Map;)V

    return-object v1
.end method

.method public final ܿ()Landroid/net/Uri;
    .locals 1

    .line 318
    iget-object v0, p0, Ll/۟۠֫;->ۜ:Ljava/net/HttpURLConnection;

    if-eqz v0, :cond_0

    .line 319
    invoke-virtual {v0}, Ljava/net/URLConnection;->getURL()Ljava/net/URL;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    return-object v0

    .line 320
    :cond_0
    iget-object v0, p0, Ll/۟۠֫;->᩷:Ll/ۗ۠֫;

    if-eqz v0, :cond_1

    .line 321
    iget-object v0, v0, Ll/ۗ۠֫;->ۜ:Landroid/net/Uri;

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 330
    iget-object v0, p0, Ll/۟۠֫;->ۜ:Ljava/net/HttpURLConnection;

    if-eqz v0, :cond_1

    iget v0, p0, Ll/۟۠֫;->ᩴ:I

    if-gtz v0, :cond_0

    goto :goto_0

    :cond_0
    return v0

    :cond_1
    :goto_0
    const/4 v0, -0x1

    return v0
.end method
