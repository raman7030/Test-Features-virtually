.class public final Ll/۫ۜᩳ;
.super Ljava/lang/Object;
.source "O6WV"


# static fields
.field public static volatile ֫:[B


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫(Ljava/io/DataInputStream;)Ljava/lang/String;
    .locals 2

    .line 164
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readInt()I

    move-result v0

    if-ltz v0, :cond_0

    const/high16 v1, 0x100000

    if-gt v0, v1, :cond_0

    .line 168
    new-array v0, v0, [B

    .line 169
    invoke-virtual {p0, v0}, Ljava/io/DataInputStream;->readFully([B)V

    .line 170
    new-instance p0, Ljava/lang/String;

    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {p0, v0, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    return-object p0

    .line 166
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Invalid smali record name length"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ljava/io/OutputStream;I)V
    .locals 1

    ushr-int/lit8 v0, p1, 0x18

    and-int/lit16 v0, v0, 0xff

    .line 193
    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V

    ushr-int/lit8 v0, p1, 0x10

    and-int/lit16 v0, v0, 0xff

    .line 194
    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V

    ushr-int/lit8 v0, p1, 0x8

    and-int/lit16 v0, v0, 0xff

    .line 195
    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V

    and-int/lit16 p1, p1, 0xff

    .line 196
    invoke-virtual {p0, p1}, Ljava/io/OutputStream;->write(I)V

    return-void
.end method

.method public static ֫(Ll/ܶ᩵ܿ;)Z
    .locals 9

    const-string v0, "format.json.tmp"

    .line 55
    invoke-virtual {p0, v0}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    const-string v1, "format.json"

    .line 56
    invoke-virtual {p0, v1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p0

    .line 57
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 61
    :cond_0
    :try_start_0
    new-instance v0, Lbin/mt/json/JSONObject;

    new-instance v2, Ljava/lang/String;

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۘۧ()[B

    move-result-object p0

    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v2, p0, v3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-direct {v0, v2}, Lbin/mt/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p0, "version"

    const/4 v2, -0x1

    .line 62
    invoke-virtual {v0, p0, v2}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result p0

    const/4 v2, 0x1

    if-ne p0, v2, :cond_1

    const-string p0, "zstd"

    const-string v3, "codec"

    const/4 v4, 0x0

    .line 63
    invoke-virtual {v0, v3, v4}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    const-string p0, "checksum"

    .line 64
    invoke-virtual {v0, p0, v1}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result p0

    if-eqz p0, :cond_1

    const-string p0, "contentSize"

    .line 65
    invoke-virtual {v0, p0, v1}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result p0

    if-eqz p0, :cond_1

    const-string p0, "dictionaryId"

    const-wide/16 v5, -0x1

    .line 66
    invoke-virtual {v0, p0, v5, v6}, Lbin/mt/json/JSONObject;->getLong(Ljava/lang/String;J)J

    move-result-wide v5

    const-wide/32 v7, 0x69b50f19

    cmp-long p0, v5, v7

    if-nez p0, :cond_1

    const-string p0, "38ad0b3d930d8640ff96107546386f4e11da0ffba3e8bf7b641bd3c99ff02351"

    const-string v3, "dictionarySha256"

    .line 67
    invoke-virtual {v0, v3, v4}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p0, :cond_1

    return v2

    :catch_0
    :cond_1
    :goto_0
    return v1
.end method

.method public static bridge synthetic ֫()[B
    .locals 1

    .line 0
    invoke-static {}, Ll/۫ۜᩳ;->ۧ()[B

    move-result-object v0

    return-object v0
.end method

.method public static ۧ(Ljava/io/OutputStream;I)V
    .locals 1

    ushr-int/lit8 v0, p1, 0x8

    and-int/lit16 v0, v0, 0xff

    .line 203
    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V

    and-int/lit16 p1, p1, 0xff

    .line 204
    invoke-virtual {p0, p1}, Ljava/io/OutputStream;->write(I)V

    return-void
.end method

.method public static ۧ(Ll/ܶ᩵ܿ;)V
    .locals 5

    .line 78
    invoke-static {}, Ll/۫ۜᩳ;->ۧ()[B

    .line 79
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۛ()V

    const-string v0, "format.json.tmp"

    .line 80
    invoke-virtual {p0, v0}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    const-string v1, "format.json"

    .line 81
    invoke-virtual {p0, v1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p0

    .line 82
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۬()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 83
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Unable to delete stale smali cache format temp file"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 85
    :cond_1
    :goto_0
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "version"

    const/4 v3, 0x1

    .line 86
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "codec"

    const-string v4, "zstd"

    .line 87
    invoke-virtual {v1, v2, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "checksum"

    .line 88
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "contentSize"

    .line 89
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "dictionaryId"

    const-wide/32 v3, 0x69b50f19

    .line 90
    invoke-virtual {v1, v2, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "dictionarySha256"

    const-string v3, "38ad0b3d930d8640ff96107546386f4e11da0ffba3e8bf7b641bd3c99ff02351"

    .line 91
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 92
    invoke-virtual {v1}, Lbin/mt/json/JSONValue;->toString()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    .line 93
    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->֫([B)V

    .line 94
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->۬()Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    .line 95
    :cond_2
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Unable to replace smali cache format file"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 97
    :cond_3
    :goto_1
    invoke-virtual {v0, p0}, Ll/ܶ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    move-result p0

    if-eqz p0, :cond_4

    return-void

    .line 98
    :cond_4
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Unable to publish smali cache format file"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۧ()[B
    .locals 7

    .line 106
    sget-object v0, Ll/۫ۜᩳ;->֫:[B

    if-eqz v0, :cond_0

    return-object v0

    .line 110
    :cond_0
    const-class v0, Ll/۫ۜᩳ;

    monitor-enter v0

    .line 111
    :try_start_0
    sget-object v1, Ll/۫ۜᩳ;->֫:[B

    if-eqz v1, :cond_1

    .line 113
    monitor-exit v0

    return-object v1

    :cond_1
    const v1, 0x8000

    new-array v2, v1, [B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 118
    :try_start_1
    invoke-static {}, Ll/ۙ᩸᩷;->ۧ()Landroid/content/res/AssetManager;

    move-result-object v3

    const-string v4, "9"

    invoke-virtual {v3, v4}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v3
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_5

    sub-int v5, v1, v4

    .line 125
    :try_start_2
    invoke-virtual {v3, v2, v4, v5}, Ljava/io/InputStream;->read([BII)I

    move-result v5

    if-ltz v5, :cond_4

    if-nez v5, :cond_3

    .line 130
    invoke-virtual {v3}, Ljava/io/InputStream;->read()I

    move-result v5

    if-ltz v5, :cond_2

    add-int/lit8 v6, v4, 0x1

    int-to-byte v5, v5

    .line 134
    aput-byte v5, v2, v4

    move v4, v6

    goto :goto_0

    .line 132
    :cond_2
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Smali cache dictionary is truncated"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    add-int/2addr v4, v5

    goto :goto_0

    .line 127
    :cond_4
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Smali cache dictionary is truncated"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 139
    :cond_5
    invoke-virtual {v3}, Ljava/io/InputStream;->read()I

    move-result v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const/4 v4, -0x1

    if-ne v1, v4, :cond_7

    .line 142
    :try_start_3
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V

    .line 143
    invoke-static {}, Ll/ܳۤۡ;->ܽ()Ljava/security/MessageDigest;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v1

    invoke-static {v1}, Ll/ܳۤۡ;->ۧ([B)Ljava/lang/String;

    move-result-object v1

    const-string v3, "38ad0b3d930d8640ff96107546386f4e11da0ffba3e8bf7b641bd3c99ff02351"

    .line 144
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 145
    invoke-static {v2}, Lcom/github/luben/zstd/Zstd;->getDictIdFromDict([B)J

    move-result-wide v3

    const-wide/32 v5, 0x69b50f19

    cmp-long v1, v3, v5

    if-nez v1, :cond_6

    .line 148
    sput-object v2, Ll/۫ۜᩳ;->֫:[B

    .line 149
    monitor-exit v0

    return-object v2

    .line 146
    :cond_6
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Smali cache dictionary identity is invalid"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 140
    :cond_7
    :try_start_4
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Smali cache dictionary length is invalid"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :catchall_0
    move-exception v1

    if-eqz v3, :cond_8

    .line 122
    :try_start_5
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v2

    :try_start_6
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_8
    :goto_1
    throw v1

    :catch_0
    move-exception v1

    .line 120
    new-instance v2, Ljava/io/IOException;

    const-string v3, "Unable to open smali cache dictionary"

    invoke-direct {v2, v3, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :catchall_2
    move-exception v1

    .line 150
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    throw v1
.end method
