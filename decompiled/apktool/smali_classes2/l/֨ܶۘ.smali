.class public final Ll/֨ܶۘ;
.super Ljava/lang/Object;
.source "51RR"

# interfaces
.implements Ll/ۚܶۘ;


# instance fields
.field public ֫:I

.field public ۧ:I

.field public final ܽ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x3a98

    .line 36
    iput v0, p0, Ll/֨ܶۘ;->֫:I

    const/16 v0, 0x7530

    .line 37
    iput v0, p0, Ll/֨ܶۘ;->ۧ:I

    .line 42
    iput-object p1, p0, Ll/֨ܶۘ;->ܽ:Ljava/lang/String;

    return-void
.end method

.method public static ֫(Ljava/io/Closeable;)V
    .locals 0

    if-eqz p0, :cond_0

    .line 313
    :try_start_0
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_0
    return-void
.end method

.method private ֫(Ljava/net/HttpURLConnection;)V
    .locals 2

    const-string v0, "User-Agent"

    .line 105
    iget-object v1, p0, Ll/֨ܶۘ;->ܽ:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    iget v0, p0, Ll/֨ܶۘ;->֫:I

    invoke-virtual {p1, v0}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 107
    iget v0, p0, Ll/֨ܶۘ;->ۧ:I

    invoke-virtual {p1, v0}, Ljava/net/URLConnection;->setReadTimeout(I)V

    const-string v0, "Accept-Language"

    const-string v1, "zh-CN"

    .line 108
    invoke-virtual {p1, v0, v1}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "Connection"

    const-string v1, "Keep-Alive"

    .line 109
    invoke-virtual {p1, v0, v1}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "Charset"

    const-string v1, "UTF-8"

    .line 110
    invoke-virtual {p1, v0, v1}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static ۧ(Ljava/net/HttpURLConnection;)V
    .locals 0

    if-nez p0, :cond_0

    return-void

    .line 324
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method


# virtual methods
.method public final a(JJ)V
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-lez v2, :cond_1

    cmp-long v2, p3, v0

    if-gtz v2, :cond_0

    goto :goto_0

    :cond_0
    long-to-int p2, p1

    .line 50
    iput p2, p0, Ll/֨ܶۘ;->֫:I

    long-to-int p1, p3

    .line 51
    iput p1, p0, Ll/֨ܶۘ;->ۧ:I

    :cond_1
    :goto_0
    return-void
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;)Ll/ۙܶۘ;
    .locals 11

    const-string v0, "DefaultHttpServiceImpl"

    const-string v1, "get. "

    .line 56
    invoke-static {v0, v1}, Ll/ۡ᩸ۘ;->ᩳ(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, -0x1

    if-nez v0, :cond_2

    const-string v0, "?"

    .line 58
    invoke-virtual {p2, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v3

    if-ne v3, v2, :cond_0

    .line 0
    invoke-static {p1, v0}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 61
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    sub-int/2addr v0, v1

    if-eq v3, v0, :cond_1

    const-string v0, "&"

    .line 62
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 0
    :cond_1
    :goto_0
    invoke-static {p1, p2}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 66
    :cond_2
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v7

    const-string p2, "\u8bf7\u6c42\u5931\u8d25 code:"

    const/4 v0, 0x0

    .line 121
    :try_start_0
    new-instance v3, Ljava/net/URL;

    invoke-direct {v3, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 122
    invoke-virtual {v3}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object p1

    check-cast p1, Ljava/net/HttpURLConnection;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    :try_start_1
    const-string v3, "GET"

    .line 123
    invoke-virtual {p1, v3}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 124
    invoke-direct {p0, p1}, Ll/֨ܶۘ;->֫(Ljava/net/HttpURLConnection;)V

    .line 125
    invoke-virtual {p1, v1}, Ljava/net/URLConnection;->setDoInput(Z)V

    const/4 v1, 0x0

    .line 126
    invoke-virtual {p1, v1}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 127
    invoke-virtual {p1, v1}, Ljava/net/URLConnection;->setUseCaches(Z)V

    .line 128
    invoke-virtual {p1}, Ljava/net/URLConnection;->connect()V

    .line 129
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v3

    const/16 v4, 0xc8

    if-ne v3, v4, :cond_4

    .line 130
    invoke-virtual {p1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 131
    :try_start_2
    new-instance v10, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v10}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    const/16 v0, 0x400

    :try_start_3
    new-array v0, v0, [B

    .line 134
    :goto_1
    invoke-virtual {p2, v0}, Ljava/io/InputStream;->read([B)I

    move-result v3

    if-eq v3, v2, :cond_3

    .line 135
    invoke-virtual {v10, v0, v1, v3}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_1

    .line 137
    :cond_3
    invoke-virtual {v10}, Ljava/io/ByteArrayOutputStream;->toString()Ljava/lang/String;

    move-result-object v5

    .line 138
    new-instance v0, Ll/۠ܶۘ;

    invoke-virtual {p1}, Ljava/net/URLConnection;->getContentLength()I

    move-result v6

    .line 139
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v8

    const-string v9, ""

    move-object v3, v0

    move-object v4, p1

    invoke-direct/range {v3 .. v9}, Ll/۠ܶۘ;-><init>(Ljava/net/HttpURLConnection;Ljava/lang/String;IIILjava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 149
    invoke-static {v10}, Ll/֨ܶۘ;->֫(Ljava/io/Closeable;)V

    .line 150
    invoke-static {p2}, Ll/֨ܶۘ;->֫(Ljava/io/Closeable;)V

    .line 151
    invoke-static {p1}, Ll/֨ܶۘ;->ۧ(Ljava/net/HttpURLConnection;)V

    return-object v0

    :catchall_0
    move-exception v0

    move-object v1, v0

    move-object v0, v10

    goto :goto_3

    :catchall_1
    move-exception v1

    goto :goto_3

    .line 141
    :cond_4
    :try_start_4
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getResponseMessage()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_5

    .line 143
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result p2

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    move-object v9, p2

    goto :goto_2

    :cond_5
    move-object v9, v1

    .line 145
    :goto_2
    new-instance p2, Ll/۠ܶۘ;

    const-string v5, ""

    invoke-virtual {p1}, Ljava/net/URLConnection;->getContentLength()I

    move-result v6

    .line 146
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v8

    move-object v3, p2

    move-object v4, p1

    invoke-direct/range {v3 .. v9}, Ll/۠ܶۘ;-><init>(Ljava/net/HttpURLConnection;Ljava/lang/String;IIILjava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 151
    invoke-static {p1}, Ll/֨ܶۘ;->ۧ(Ljava/net/HttpURLConnection;)V

    return-object p2

    :catchall_2
    move-exception p2

    move-object v1, p2

    move-object p2, v0

    goto :goto_3

    :catchall_3
    move-exception p1

    move-object v1, p1

    move-object p1, v0

    move-object p2, p1

    .line 149
    :goto_3
    invoke-static {v0}, Ll/֨ܶۘ;->֫(Ljava/io/Closeable;)V

    .line 150
    invoke-static {p2}, Ll/֨ܶۘ;->֫(Ljava/io/Closeable;)V

    .line 151
    invoke-static {p1}, Ll/֨ܶۘ;->ۧ(Ljava/net/HttpURLConnection;)V

    .line 152
    throw v1
.end method

.method public final ֫(Ljava/lang/String;Ljava/util/HashMap;Ljava/util/HashMap;)Ll/ۙܶۘ;
    .locals 17

    .line 92
    invoke-virtual/range {p3 .. p3}, Ljava/util/HashMap;->size()I

    move-result v0

    if-gtz v0, :cond_0

    .line 93
    invoke-virtual/range {p0 .. p2}, Ll/֨ܶۘ;->֫(Ljava/lang/String;Ljava/util/Map;)Ll/ۙܶۘ;

    move-result-object v0

    return-object v0

    .line 95
    :cond_0
    invoke-virtual/range {p3 .. p3}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 96
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    const-string v2, ""

    const-string v3, "UTF-8"

    const-string v4, "multipart/form-data;boundary="

    const-string v5, "\u6587\u4ef6\u4e0a\u4f20"

    const-string v6, "DefaultHttpServiceImpl"

    .line 211
    invoke-static {v6, v5}, Ll/ۡ᩸ۘ;->ᩳ(Ljava/lang/String;Ljava/lang/String;)V

    .line 212
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v5

    invoke-virtual {v5}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v5

    .line 224
    :try_start_0
    new-instance v7, Ljava/net/URL;

    move-object/from16 v8, p1

    invoke-direct {v7, v8}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 225
    invoke-virtual {v7}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v7

    check-cast v7, Ljava/net/HttpURLConnection;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_8

    const/4 v8, 0x1

    .line 226
    :try_start_1
    invoke-virtual {v7, v8}, Ljava/net/URLConnection;->setDoInput(Z)V

    .line 227
    invoke-virtual {v7, v8}, Ljava/net/URLConnection;->setDoOutput(Z)V

    const-string v8, "POST"

    .line 228
    invoke-virtual {v7, v8}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    const/4 v8, 0x0

    .line 229
    invoke-virtual {v7, v8}, Ljava/net/URLConnection;->setUseCaches(Z)V

    .line 230
    invoke-virtual {v7, v8}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    const-string v8, "Content-Type"

    .line 231
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v7, v8, v4}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v4, p0

    .line 233
    invoke-direct {v4, v7}, Ll/֨ܶۘ;->֫(Ljava/net/HttpURLConnection;)V

    .line 235
    invoke-virtual {v7}, Ljava/net/URLConnection;->connect()V

    .line 237
    new-instance v15, Ljava/io/DataOutputStream;

    invoke-virtual {v7}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v8

    invoke-direct {v15, v8}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_7

    .line 242
    :try_start_2
    invoke-virtual/range {p2 .. p2}, Ljava/util/HashMap;->size()I

    move-result v8
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_6

    const-string v9, "\""

    const-string v10, "Content-Disposition: form-data; name=\""

    const-string v11, "--"

    const-string v12, "\r\n"

    if-lez v8, :cond_1

    .line 243
    :try_start_3
    invoke-virtual/range {p2 .. p2}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v8

    .line 244
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v13
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-eqz v13, :cond_1

    .line 245
    :try_start_4
    new-instance v14, Ljava/lang/StringBuffer;

    invoke-direct {v14}, Ljava/lang/StringBuffer;-><init>()V

    .line 246
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v13, v16

    check-cast v13, Ljava/lang/String;

    invoke-static {v13, v3}, Ll/۬֨ᩴ;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    move-object/from16 v4, p2

    .line 247
    invoke-virtual {v4, v13}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v4, v16

    check-cast v4, Ljava/lang/String;

    invoke-static {v4, v3}, Ll/۬֨ᩴ;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 248
    invoke-virtual {v14, v11}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v14, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v14, v12}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 249
    invoke-virtual {v14, v10}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 250
    invoke-virtual {v14, v13}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v14, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v14, v12}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 251
    invoke-virtual {v14, v12}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 252
    invoke-virtual {v14, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v14, v12}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 253
    invoke-virtual {v14}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v4

    .line 254
    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v13, "="

    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v13, "##"

    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-static {v6, v13}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    .line 255
    invoke-virtual {v4}, Ljava/lang/String;->getBytes()[B

    move-result-object v4

    invoke-virtual {v15, v4}, Ljava/io/OutputStream;->write([B)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-object/from16 v4, p0

    goto :goto_0

    :catchall_0
    move-exception v0

    const/4 v13, 0x0

    goto/16 :goto_3

    :catchall_1
    move-exception v0

    const/4 v1, 0x0

    goto/16 :goto_6

    :cond_1
    const/4 v13, 0x0

    if-eqz v0, :cond_2

    .line 260
    :try_start_5
    array-length v3, v0

    if-lez v3, :cond_2

    .line 261
    new-instance v3, Ljava/lang/StringBuffer;

    invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V

    .line 262
    invoke-virtual {v3, v11}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 263
    invoke-virtual {v3, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 264
    invoke-virtual {v3, v12}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 266
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, "\"; filename=\""

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 269
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Content-Type: application/octet-stream; charset=UTF-8"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 271
    invoke-virtual {v3, v12}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 272
    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-virtual {v15, v1}, Ljava/io/OutputStream;->write([B)V

    .line 274
    array-length v1, v0

    const/4 v3, 0x0

    invoke-virtual {v15, v0, v3, v1}, Ljava/io/DataOutputStream;->write([BII)V

    .line 275
    invoke-virtual {v12}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-virtual {v15, v0}, Ljava/io/OutputStream;->write([B)V

    .line 276
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 277
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    .line 278
    invoke-virtual {v15, v0}, Ljava/io/OutputStream;->write([B)V

    .line 279
    array-length v0, v0

    .line 280
    invoke-virtual {v15}, Ljava/io/DataOutputStream;->flush()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    move v12, v0

    goto :goto_1

    :catchall_2
    move-exception v0

    goto :goto_3

    :cond_2
    const/4 v0, 0x0

    const/4 v12, 0x0

    .line 282
    :goto_1
    :try_start_6
    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v0

    .line 283
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v6, v1}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    const/16 v1, 0xc8

    if-ne v0, v1, :cond_4

    .line 285
    :try_start_7
    invoke-virtual {v7}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 286
    :try_start_8
    new-instance v2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    const/16 v0, 0x400

    :try_start_9
    new-array v0, v0, [B

    .line 289
    :goto_2
    invoke-virtual {v1, v0}, Ljava/io/InputStream;->read([B)I

    move-result v3

    const/4 v4, -0x1

    if-eq v3, v4, :cond_3

    const/4 v4, 0x0

    .line 290
    invoke-virtual {v2, v0, v4, v3}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_2

    .line 292
    :cond_3
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    move-object v10, v0

    goto :goto_4

    :catchall_3
    move-exception v0

    goto :goto_7

    :goto_3
    move-object v1, v13

    goto :goto_6

    .line 296
    :cond_4
    :try_start_a
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    move-object v10, v0

    move-object v1, v13

    move-object v2, v1

    .line 298
    :goto_4
    :try_start_b
    new-instance v0, Ll/۠ܶۘ;

    invoke-virtual {v7}, Ljava/net/URLConnection;->getContentLength()I

    move-result v11

    .line 299
    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v13

    const-string v14, ""

    move-object v8, v0

    move-object v9, v7

    invoke-direct/range {v8 .. v14}, Ll/۠ܶۘ;-><init>(Ljava/net/HttpURLConnection;Ljava/lang/String;IIILjava/lang/String;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 302
    invoke-static {v15}, Ll/֨ܶۘ;->֫(Ljava/io/Closeable;)V

    .line 303
    invoke-static {v1}, Ll/֨ܶۘ;->֫(Ljava/io/Closeable;)V

    .line 304
    invoke-static {v2}, Ll/֨ܶۘ;->֫(Ljava/io/Closeable;)V

    .line 305
    invoke-static {v7}, Ll/֨ܶۘ;->ۧ(Ljava/net/HttpURLConnection;)V

    return-object v0

    :catchall_4
    move-exception v0

    move-object v13, v2

    goto :goto_7

    :catchall_5
    move-exception v0

    goto :goto_5

    :catchall_6
    move-exception v0

    const/4 v13, 0x0

    :goto_5
    move-object v1, v13

    goto :goto_7

    :catchall_7
    move-exception v0

    const/4 v15, 0x0

    move-object v1, v15

    :goto_6
    move-object v13, v1

    goto :goto_7

    :catchall_8
    move-exception v0

    const/4 v7, 0x0

    move-object v1, v7

    move-object v13, v1

    move-object v15, v13

    .line 302
    :goto_7
    invoke-static {v15}, Ll/֨ܶۘ;->֫(Ljava/io/Closeable;)V

    .line 303
    invoke-static {v1}, Ll/֨ܶۘ;->֫(Ljava/io/Closeable;)V

    .line 304
    invoke-static {v13}, Ll/֨ܶۘ;->֫(Ljava/io/Closeable;)V

    .line 305
    invoke-static {v7}, Ll/֨ܶۘ;->ۧ(Ljava/net/HttpURLConnection;)V

    .line 306
    throw v0

    :cond_5
    const/4 v0, 0x0

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;Ljava/util/Map;)Ll/ۙܶۘ;
    .locals 13

    const-string v0, "DefaultHttpServiceImpl"

    const-string v1, "post. "

    .line 72
    invoke-static {v0, v1}, Ll/ۡ᩸ۘ;->ᩳ(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 75
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    const/4 v1, 0x1

    const/4 v2, 0x1

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    const-string v5, "UTF-8"

    if-eqz v3, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    goto :goto_1

    :cond_0
    const/16 v4, 0x26

    .line 79
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 81
    :goto_1
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-static {v4, v5}, Ll/۬֨ᩴ;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v4, 0x3d

    .line 82
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 83
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3, v5}, Ll/۬֨ᩴ;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 85
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 86
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v10

    const-string v0, "Unknown fail: "

    const/4 v2, 0x0

    .line 161
    :try_start_0
    new-instance v3, Ljava/net/URL;

    invoke-direct {v3, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 162
    invoke-virtual {v3}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object p1

    check-cast p1, Ljava/net/HttpURLConnection;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    :try_start_1
    const-string v3, "POST"

    .line 163
    invoke-virtual {p1, v3}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 164
    invoke-direct {p0, p1}, Ll/֨ܶۘ;->֫(Ljava/net/HttpURLConnection;)V

    .line 165
    invoke-virtual {p1, v1}, Ljava/net/URLConnection;->setDoInput(Z)V

    .line 166
    invoke-virtual {p1, v1}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 167
    invoke-virtual {p1, v4}, Ljava/net/URLConnection;->setUseCaches(Z)V

    const-string v1, "Content-Type"

    const-string v3, "application/x-www-form-urlencoded"

    .line 168
    invoke-virtual {p1, v1, v3}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 170
    new-instance v1, Ljava/io/OutputStreamWriter;

    invoke-virtual {p1}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v3

    invoke-direct {v1, v3, v5}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 172
    invoke-virtual {v1, p2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 173
    invoke-virtual {v1}, Ljava/io/OutputStreamWriter;->flush()V

    .line 174
    invoke-virtual {p1}, Ljava/net/URLConnection;->connect()V

    .line 176
    invoke-virtual {p1}, Ljava/net/URLConnection;->getContentLength()I

    move-result v9

    .line 177
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result p2

    const/16 v1, 0xc8

    if-ne p2, v1, :cond_3

    .line 179
    invoke-virtual {p1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 180
    :try_start_2
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    const/16 v1, 0x400

    :try_start_3
    new-array v1, v1, [B

    .line 183
    :goto_2
    invoke-virtual {p2, v1}, Ljava/io/InputStream;->read([B)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_2

    .line 184
    invoke-virtual {v0, v1, v4, v2}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_2

    .line 186
    :cond_2
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toString()Ljava/lang/String;

    move-result-object v8

    .line 188
    new-instance v1, Ll/۠ܶۘ;

    .line 189
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v11

    const-string v12, ""

    move-object v6, v1

    move-object v7, p1

    invoke-direct/range {v6 .. v12}, Ll/۠ܶۘ;-><init>(Ljava/net/HttpURLConnection;Ljava/lang/String;IIILjava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 199
    invoke-static {v0}, Ll/֨ܶۘ;->֫(Ljava/io/Closeable;)V

    .line 200
    invoke-static {p2}, Ll/֨ܶۘ;->֫(Ljava/io/Closeable;)V

    .line 201
    invoke-static {p1}, Ll/֨ܶۘ;->ۧ(Ljava/net/HttpURLConnection;)V

    return-object v1

    :catchall_0
    move-exception v1

    move-object v2, v0

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object v1, v0

    goto :goto_3

    .line 191
    :cond_3
    :try_start_4
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getResponseMessage()Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_4

    .line 193
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    :cond_4
    move-object v12, p2

    .line 195
    new-instance p2, Ll/۠ܶۘ;

    const-string v8, ""

    .line 196
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v11

    const/4 v9, 0x0

    move-object v6, p2

    move-object v7, p1

    invoke-direct/range {v6 .. v12}, Ll/۠ܶۘ;-><init>(Ljava/net/HttpURLConnection;Ljava/lang/String;IIILjava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 201
    invoke-static {p1}, Ll/֨ܶۘ;->ۧ(Ljava/net/HttpURLConnection;)V

    return-object p2

    :catchall_2
    move-exception p2

    move-object v1, p2

    move-object p2, v2

    goto :goto_3

    :catchall_3
    move-exception p1

    move-object v1, p1

    move-object p1, v2

    move-object p2, p1

    .line 199
    :goto_3
    invoke-static {v2}, Ll/֨ܶۘ;->֫(Ljava/io/Closeable;)V

    .line 200
    invoke-static {p2}, Ll/֨ܶۘ;->֫(Ljava/io/Closeable;)V

    .line 201
    invoke-static {p1}, Ll/֨ܶۘ;->ۧ(Ljava/net/HttpURLConnection;)V

    .line 202
    throw v1
.end method
