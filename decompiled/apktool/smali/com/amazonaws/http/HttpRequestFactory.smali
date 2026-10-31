.class public Lcom/amazonaws/http/HttpRequestFactory;
.super Ljava/lang/Object;
.source "HttpRequestFactory.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫(Lcom/amazonaws/DefaultRequest;Lcom/amazonaws/ClientConfiguration;)Lcom/amazonaws/http/HttpRequest;
    .locals 7

    .line 50
    invoke-virtual {p0}, Lcom/amazonaws/DefaultRequest;->ۧ()Ljava/net/URI;

    move-result-object v0

    .line 62
    invoke-virtual {v0}, Ljava/net/URI;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/amazonaws/DefaultRequest;->᩻()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/amazonaws/util/HttpUtils;->֫(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    .line 64
    invoke-static {p0}, Lcom/amazonaws/util/HttpUtils;->֫(Lcom/amazonaws/Request;)Ljava/lang/String;

    move-result-object v1

    .line 65
    invoke-virtual {p0}, Lcom/amazonaws/DefaultRequest;->ᩳ()Lcom/amazonaws/http/HttpMethodName;

    move-result-object v3

    .line 72
    invoke-virtual {p0}, Lcom/amazonaws/DefaultRequest;->֫()Ljava/io/InputStream;

    move-result-object v4

    if-eqz v4, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 73
    :goto_0
    sget-object v5, Lcom/amazonaws/http/HttpMethodName;->۬:Lcom/amazonaws/http/HttpMethodName;

    if-ne v3, v5, :cond_2

    if-eqz v4, :cond_1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :cond_2
    :goto_1
    if-eqz v1, :cond_3

    if-eqz v2, :cond_3

    const-string v2, "?"

    .line 0
    invoke-static {v0, v2, v1}, Ll/᩺۠ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 81
    :cond_3
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 135
    invoke-virtual {p0}, Lcom/amazonaws/DefaultRequest;->ۧ()Ljava/net/URI;

    move-result-object v4

    .line 136
    invoke-virtual {v4}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object v5

    .line 137
    invoke-static {v4}, Lcom/amazonaws/util/HttpUtils;->֫(Ljava/net/URI;)Z

    move-result v6

    if-eqz v6, :cond_4

    const-string v6, ":"

    .line 0
    invoke-static {v5, v6}, Ll/۟֫ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    .line 138
    invoke-virtual {v4}, Ljava/net/URI;->getPort()I

    move-result v4

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    :cond_4
    const-string v4, "Host"

    .line 140
    invoke-virtual {v2, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    invoke-virtual {p0}, Lcom/amazonaws/DefaultRequest;->ܽ()Ljava/util/HashMap;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    .line 144
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v2, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_5
    const-string v4, "Content-Type"

    .line 148
    invoke-virtual {v2, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_6

    invoke-virtual {v2, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_7

    .line 149
    :cond_6
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "application/x-www-form-urlencoded; charset="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v6, "UTF-8"

    .line 151
    invoke-static {v6}, Lcom/amazonaws/util/StringUtils;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 149
    invoke-virtual {v2, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    :cond_7
    invoke-virtual {p0}, Lcom/amazonaws/DefaultRequest;->֫()Ljava/io/InputStream;

    move-result-object v4

    .line 89
    sget-object v5, Lcom/amazonaws/http/HttpMethodName;->ۗ:Lcom/amazonaws/http/HttpMethodName;

    if-ne v3, v5, :cond_8

    .line 90
    sget-object v3, Lcom/amazonaws/http/HttpMethodName;->۬:Lcom/amazonaws/http/HttpMethodName;

    const-string v6, "X-HTTP-Method-Override"

    .line 91
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    :cond_8
    sget-object v5, Lcom/amazonaws/http/HttpMethodName;->۬:Lcom/amazonaws/http/HttpMethodName;

    if-ne v3, v5, :cond_9

    .line 101
    invoke-virtual {p0}, Lcom/amazonaws/DefaultRequest;->֫()Ljava/io/InputStream;

    move-result-object v5

    if-nez v5, :cond_9

    if-eqz v1, :cond_9

    .line 102
    sget-object v4, Lcom/amazonaws/util/StringUtils;->֫:Ljava/nio/charset/Charset;

    invoke-virtual {v1, v4}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    .line 103
    new-instance v4, Ljava/io/ByteArrayInputStream;

    invoke-direct {v4, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 104
    array-length v1, v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v5, "Content-Length"

    invoke-virtual {v2, v5, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    :cond_9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p1, "Accept-Encoding"

    const-string v1, "identity"

    .line 114
    invoke-virtual {v2, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    new-instance p1, Lcom/amazonaws/http/HttpRequest;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v0

    invoke-direct {p1, v1, v0, v2, v4}, Lcom/amazonaws/http/HttpRequest;-><init>(Ljava/lang/String;Ljava/net/URI;Ljava/util/HashMap;Ljava/io/InputStream;)V

    .line 119
    invoke-virtual {p0}, Lcom/amazonaws/DefaultRequest;->᩷()Z

    move-result p0

    invoke-virtual {p1, p0}, Lcom/amazonaws/http/HttpRequest;->֫(Z)V

    return-object p1
.end method
