.class public Lcom/amazonaws/http/UrlHttpClient;
.super Ljava/lang/Object;
.source "UrlHttpClient.java"


# static fields
.field public static final ۧ:Lcom/amazonaws/logging/Log;


# instance fields
.field public final ֫:Lcom/amazonaws/ClientConfiguration;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 53
    const-class v0, Lcom/amazonaws/http/UrlHttpClient;

    invoke-static {v0}, Lcom/amazonaws/logging/LogFactory;->֫(Ljava/lang/Class;)Lcom/amazonaws/logging/Log;

    move-result-object v0

    sput-object v0, Lcom/amazonaws/http/UrlHttpClient;->ۧ:Lcom/amazonaws/logging/Log;

    return-void
.end method

.method public constructor <init>(Lcom/amazonaws/ClientConfiguration;)V
    .locals 0

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 72
    iput-object p1, p0, Lcom/amazonaws/http/UrlHttpClient;->֫:Lcom/amazonaws/ClientConfiguration;

    .line 75
    sget p1, Lcom/amazonaws/http/TLS12SocketFactory;->֫:I

    return-void
.end method


# virtual methods
.method public final ֫(Lcom/amazonaws/http/HttpRequest;)Lcom/amazonaws/http/HttpResponse;
    .locals 7

    .line 80
    invoke-virtual {p1}, Lcom/amazonaws/http/HttpRequest;->ܿ()Ljava/net/URI;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/URI;->toURL()Ljava/net/URL;

    move-result-object v0

    .line 81
    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;

    .line 270
    iget-object v1, p0, Lcom/amazonaws/http/UrlHttpClient;->֫:Lcom/amazonaws/ClientConfiguration;

    invoke-virtual {v1}, Lcom/amazonaws/ClientConfiguration;->֫()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 271
    invoke-virtual {v1}, Lcom/amazonaws/ClientConfiguration;->ܿ()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/net/URLConnection;->setReadTimeout(I)V

    const/4 v1, 0x0

    .line 273
    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    .line 274
    invoke-virtual {v0, v1}, Ljava/net/URLConnection;->setUseCaches(Z)V

    .line 276
    invoke-virtual {p1}, Lcom/amazonaws/http/HttpRequest;->ܳ()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 277
    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setChunkedStreamingMode(I)V

    .line 281
    :cond_0
    instance-of v2, v0, Ljavax/net/ssl/HttpsURLConnection;

    if-eqz v2, :cond_1

    .line 282
    move-object v2, v0

    check-cast v2, Ljavax/net/ssl/HttpsURLConnection;

    .line 208
    :cond_1
    invoke-virtual {p1}, Lcom/amazonaws/http/HttpRequest;->ܽ()Ljava/util/Map;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual {p1}, Lcom/amazonaws/http/HttpRequest;->ܽ()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_4

    .line 212
    invoke-virtual {p1}, Lcom/amazonaws/http/HttpRequest;->ܽ()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 213
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    const-string v5, "Content-Length"

    .line 215
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    const-string v5, "Host"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    goto :goto_0

    :cond_3
    const-string v5, "Expect"

    .line 229
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 232
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v0, v4, v3}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 236
    :cond_4
    invoke-virtual {p1}, Lcom/amazonaws/http/HttpRequest;->ᩳ()Ljava/lang/String;

    move-result-object v2

    .line 237
    invoke-virtual {v0, v2}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 167
    invoke-virtual {p1}, Lcom/amazonaws/http/HttpRequest;->֫()Ljava/io/InputStream;

    move-result-object v2

    if-eqz v2, :cond_7

    invoke-virtual {p1}, Lcom/amazonaws/http/HttpRequest;->ۧ()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-ltz v6, :cond_7

    const/4 v2, 0x1

    .line 168
    invoke-virtual {v0, v2}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 171
    invoke-virtual {p1}, Lcom/amazonaws/http/HttpRequest;->ܳ()Z

    move-result v2

    if-nez v2, :cond_5

    .line 172
    invoke-virtual {p1}, Lcom/amazonaws/http/HttpRequest;->ۧ()J

    move-result-wide v2

    long-to-int v3, v2

    invoke-virtual {v0, v3}, Ljava/net/HttpURLConnection;->setFixedLengthStreamingMode(I)V

    .line 174
    :cond_5
    invoke-virtual {v0}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v2

    .line 183
    invoke-virtual {p1}, Lcom/amazonaws/http/HttpRequest;->֫()Ljava/io/InputStream;

    move-result-object v3

    const/16 v4, 0x2000

    new-array v4, v4, [B

    .line 256
    :goto_1
    invoke-virtual {v3, v4}, Ljava/io/InputStream;->read([B)I

    move-result v5

    const/4 v6, -0x1

    if-eq v5, v6, :cond_6

    .line 264
    invoke-virtual {v2, v4, v1, v5}, Ljava/io/OutputStream;->write([BII)V

    goto :goto_1

    .line 188
    :cond_6
    invoke-virtual {v2}, Ljava/io/OutputStream;->flush()V

    .line 189
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V

    .line 104
    :cond_7
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseMessage()Ljava/lang/String;

    move-result-object v2

    .line 105
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v3

    .line 106
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    move-result-object v4

    if-nez v4, :cond_8

    const-string v5, "HEAD"

    .line 109
    invoke-virtual {p1}, Lcom/amazonaws/http/HttpRequest;->ᩳ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v5, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    .line 111
    :try_start_0
    invoke-virtual {v0}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v4
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 112
    :catch_0
    :cond_8
    new-instance p1, Lcom/amazonaws/http/HttpResponse$Builder;

    invoke-direct {p1}, Lcom/amazonaws/http/HttpResponse$Builder;-><init>()V

    .line 120
    invoke-virtual {p1, v3}, Lcom/amazonaws/http/HttpResponse$Builder;->֫(I)V

    .line 121
    invoke-virtual {p1, v2}, Lcom/amazonaws/http/HttpResponse$Builder;->֫(Ljava/lang/String;)V

    .line 122
    invoke-virtual {p1, v4}, Lcom/amazonaws/http/HttpResponse$Builder;->֫(Ljava/io/InputStream;)V

    .line 123
    invoke-virtual {v0}, Ljava/net/URLConnection;->getHeaderFields()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 125
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_9

    goto :goto_2

    .line 130
    :cond_9
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p1, v3, v2}, Lcom/amazonaws/http/HttpResponse$Builder;->֫(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 133
    :cond_a
    invoke-virtual {p1}, Lcom/amazonaws/http/HttpResponse$Builder;->֫()Lcom/amazonaws/http/HttpResponse;

    move-result-object p1

    return-object p1
.end method
