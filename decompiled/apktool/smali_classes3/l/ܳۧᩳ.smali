.class public final Ll/ܳۧᩳ;
.super Ljava/lang/Object;
.source "VAHB"


# instance fields
.field public ֫:Ljava/lang/String;

.field public final ۧ:Ljava/util/LinkedHashMap;

.field public final ܽ:Z

.field public final ܿ:Ljava/lang/String;

.field public final ᩳ:Ljava/lang/StringBuilder;


# direct methods
.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 1

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Ll/ܳۧᩳ;->ۧ:Ljava/util/LinkedHashMap;

    const-string v0, "UTF-8"

    .line 31
    iput-object v0, p0, Ll/ܳۧᩳ;->֫:Ljava/lang/String;

    .line 34
    iput-object p1, p0, Ll/ܳۧᩳ;->ܿ:Ljava/lang/String;

    .line 35
    iput-boolean p2, p0, Ll/ܳۧᩳ;->ܽ:Z

    if-eqz p2, :cond_0

    .line 36
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Ll/ܳۧᩳ;->ᩳ:Ljava/lang/StringBuilder;

    const-string p1, "User-Agent"

    const-string p2, "Mozilla/5.0 (Linux; Android 6.0;)"

    .line 37
    invoke-virtual {p0, p1, p2}, Ll/ܳۧᩳ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/net/HttpURLConnection;
    .locals 5

    .line 65
    new-instance v0, Ljava/net/URL;

    iget-object v1, p0, Ll/ܳۧᩳ;->ܿ:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 66
    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;

    .line 67
    iget-boolean v1, p0, Ll/ܳۧᩳ;->ܽ:Z

    if-eqz v1, :cond_0

    const-string v2, "POST"

    goto :goto_0

    :cond_0
    const-string v2, "GET"

    :goto_0
    invoke-virtual {v0, v2}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    const/16 v2, 0x1770

    .line 68
    invoke-virtual {v0, v2}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    const/16 v2, 0x2710

    .line 69
    invoke-virtual {v0, v2}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 70
    invoke-virtual {v0, v1}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 71
    iget-object v2, p0, Ll/ܳۧᩳ;->ۧ:Ljava/util/LinkedHashMap;

    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 72
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v0, v4, v3}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    if-eqz v1, :cond_2

    .line 75
    invoke-virtual {v0}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v1

    .line 76
    iget-object v2, p0, Ll/ܳۧᩳ;->ᩳ:Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Ll/ܳۧᩳ;->֫:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/io/OutputStream;->write([B)V

    .line 77
    invoke-virtual {v1}, Ljava/io/OutputStream;->flush()V

    .line 78
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V

    :cond_2
    return-object v0
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 51
    iget-object v0, p0, Ll/ܳۧᩳ;->ᩳ:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "Content-Type"

    const-string v2, "application/x-www-form-urlencoded"

    .line 52
    iget-object v3, p0, Ll/ܳۧᩳ;->ۧ:Ljava/util/LinkedHashMap;

    invoke-interface {v3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    const/16 v1, 0x26

    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 57
    :goto_0
    :try_start_0
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x3d

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object p1, p0, Ll/ܳۧᩳ;->֫:Ljava/lang/String;

    invoke-static {p2, p1}, Ll/۬֨ᩴ;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 59
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 5

    .line 84
    invoke-virtual {p0}, Ll/ܳۧᩳ;->֫()Ljava/net/HttpURLConnection;

    move-result-object v0

    .line 85
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v1

    const/16 v2, 0xc8

    if-lt v1, v2, :cond_1

    const/16 v2, 0x12c

    if-ge v1, v2, :cond_1

    .line 87
    invoke-virtual {v0}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    .line 88
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const v2, 0x19000

    new-array v2, v2, [B

    .line 91
    :goto_0
    invoke-virtual {v0, v2}, Ljava/io/InputStream;->read([B)I

    move-result v3

    const/4 v4, -0x1

    if-eq v3, v4, :cond_0

    const/4 v4, 0x0

    .line 92
    invoke-virtual {v1, v2, v4, v3}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0

    .line 94
    :cond_0
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 95
    iget-object v0, p0, Ll/ܳۧᩳ;->֫:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 97
    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v2, "HTTP response code: "

    .line 0
    invoke-static {v1, v2}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 97
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۧ(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 46
    iget-object v0, p0, Ll/ܳۧᩳ;->ۧ:Ljava/util/LinkedHashMap;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
