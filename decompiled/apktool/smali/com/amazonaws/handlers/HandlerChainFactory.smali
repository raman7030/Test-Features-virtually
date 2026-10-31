.class public Lcom/amazonaws/handlers/HandlerChainFactory;
.super Ljava/lang/Object;
.source "HandlerChainFactory.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private ֫(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 5

    .line 64
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    .line 68
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/Class;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object p2

    if-nez p2, :cond_0

    return-object v0

    .line 72
    :cond_0
    new-instance v2, Ljava/io/BufferedReader;

    new-instance v3, Ljava/io/InputStreamReader;

    sget-object v4, Lcom/amazonaws/util/StringUtils;->֫:Ljava/nio/charset/Charset;

    invoke-direct {v3, p2, v4}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    invoke-direct {v2, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 74
    :goto_0
    :try_start_1
    invoke-virtual {v2}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object p2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez p2, :cond_1

    .line 110
    :try_start_2
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    return-object v0

    .line 77
    :cond_1
    :try_start_3
    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p2

    const-string v1, ""

    .line 78
    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_0

    .line 82
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Class;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    const/4 v4, 0x1

    aput-object v1, v3, v4

    .line 80
    invoke-static {p2, v3}, Lcom/amazonaws/util/ClassLoaderHelper;->ᩳ(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v1

    .line 83
    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    .line 84
    invoke-virtual {p1, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 85
    const-class p2, Lcom/amazonaws/handlers/RequestHandler2;

    if-ne p1, p2, :cond_3

    .line 86
    check-cast v1, Lcom/amazonaws/handlers/RequestHandler2;

    .line 87
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 88
    :cond_3
    const-class p2, Lcom/amazonaws/handlers/RequestHandler;

    if-ne p1, p2, :cond_4

    .line 89
    check-cast v1, Lcom/amazonaws/handlers/RequestHandler;

    .line 74
    new-instance p2, Lcom/amazonaws/handlers/RequestHandler2Adaptor;

    invoke-direct {p2, v1}, Lcom/amazonaws/handlers/RequestHandler2Adaptor;-><init>(Lcom/amazonaws/handlers/RequestHandler;)V

    .line 90
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 92
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    .line 95
    :cond_5
    new-instance v0, Lcom/amazonaws/AmazonClientException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unable to instantiate request handler chain for client.  Listed request handler (\'"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "\') does not implement the "

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " API."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 59
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 95
    throw v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    move-exception p1

    goto :goto_3

    :catch_1
    move-exception p1

    move-object v1, v2

    goto :goto_1

    :catchall_1
    move-exception p1

    goto :goto_2

    :catch_2
    move-exception p1

    .line 104
    :goto_1
    :try_start_4
    new-instance p2, Lcom/amazonaws/AmazonClientException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to instantiate request handler chain for client: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 50
    invoke-direct {p2, v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 106
    throw p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_2
    move-object v2, v1

    :goto_3
    if-eqz v2, :cond_6

    .line 110
    :try_start_5
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    .line 114
    :catch_3
    :cond_6
    throw p1
.end method


# virtual methods
.method public final ֫()Ljava/util/ArrayList;
    .locals 2

    const-string v0, "/com/amazonaws/services/s3/request.handler2s"

    .line 58
    const-class v1, Lcom/amazonaws/handlers/RequestHandler2;

    invoke-direct {p0, v1, v0}, Lcom/amazonaws/handlers/HandlerChainFactory;->֫(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ()Ljava/util/ArrayList;
    .locals 2

    const-string v0, "/com/amazonaws/services/s3/request.handlers"

    .line 45
    const-class v1, Lcom/amazonaws/handlers/RequestHandler;

    invoke-direct {p0, v1, v0}, Lcom/amazonaws/handlers/HandlerChainFactory;->֫(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method
