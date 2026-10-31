.class public final Ll/֨ۢۜ;
.super Ljava/lang/Object;
.source "D6W2"


# instance fields
.field public final ֫:Ljava/io/File;


# direct methods
.method public constructor <init>(Ljava/io/File;)V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Ll/֨ۢۜ;->֫:Ljava/io/File;

    return-void
.end method

.method public static varargs ֫(Lbin/mt/json/JSONObject;[Ljava/lang/String;)V
    .locals 5

    .line 124
    invoke-virtual {p0}, Lbin/mt/json/JSONObject;->size()I

    move-result v0

    array-length v1, p1

    if-ne v0, v1, :cond_2

    new-instance v0, Ljava/util/HashSet;

    invoke-virtual {p0}, Lbin/mt/json/JSONObject;->names()Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 0
    new-instance p0, Ljava/util/HashSet;

    array-length v1, p1

    invoke-direct {p0, v1}, Ljava/util/HashSet;-><init>(I)V

    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, p1, v2

    invoke-static {v3}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "duplicate element: "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-static {p0}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p0

    .line 124
    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    return-void

    .line 125
    :cond_2
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Invalid MCP credential store fields"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final ֫()Ljava/util/ArrayList;
    .locals 19

    const-string v0, "credentials"

    const-string v1, "version"

    const-string v2, "1"

    .line 32
    :try_start_0
    new-instance v3, Ljava/io/FileInputStream;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    move-object/from16 v4, p0

    :try_start_1
    iget-object v5, v4, Ll/֨ۢۜ;->֫:Ljava/io/File;

    invoke-direct {v3, v5}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    const v5, 0x10001

    :try_start_2
    new-array v6, v5, [B

    const/4 v7, 0x0

    const/4 v8, 0x0

    :goto_0
    if-ge v8, v5, :cond_0

    sub-int v9, v5, v8

    .line 36
    invoke-virtual {v3, v6, v8, v9}, Ljava/io/FileInputStream;->read([BII)I

    move-result v9

    const/4 v10, -0x1

    if-eq v9, v10, :cond_0

    add-int/2addr v8, v9

    goto :goto_0

    :cond_0
    const/high16 v5, 0x10000

    if-gt v8, v5, :cond_e

    .line 42
    sget-object v5, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v5}, Ljava/nio/charset/Charset;->newDecoder()Ljava/nio/charset/CharsetDecoder;

    move-result-object v5

    sget-object v9, Ljava/nio/charset/CodingErrorAction;->REPORT:Ljava/nio/charset/CodingErrorAction;

    invoke-virtual {v5, v9}, Ljava/nio/charset/CharsetDecoder;->onMalformedInput(Ljava/nio/charset/CodingErrorAction;)Ljava/nio/charset/CharsetDecoder;

    move-result-object v5

    .line 43
    invoke-virtual {v5, v9}, Ljava/nio/charset/CharsetDecoder;->onUnmappableCharacter(Ljava/nio/charset/CodingErrorAction;)Ljava/nio/charset/CharsetDecoder;

    move-result-object v5

    invoke-static {v6, v7, v8}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/nio/charset/CharsetDecoder;->decode(Ljava/nio/ByteBuffer;)Ljava/nio/CharBuffer;

    move-result-object v5

    invoke-virtual {v5}, Ljava/nio/CharBuffer;->toString()Ljava/lang/String;

    move-result-object v5

    .line 44
    invoke-static {v5}, Lbin/mt/json/JSON;->parse(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v5

    invoke-virtual {v5}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object v5

    .line 45
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Ll/֨ۢۜ;->֫(Lbin/mt/json/JSONObject;[Ljava/lang/String;)V

    .line 46
    invoke-virtual {v5, v1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v1

    invoke-virtual {v1}, Lbin/mt/json/JSONValue;->toString()Ljava/lang/String;

    move-result-object v1

    .line 47
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2

    const-string v6, "2"

    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    goto :goto_1

    .line 48
    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Unsupported MCP credential store version"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 50
    :cond_2
    :goto_1
    invoke-virtual {v5, v0}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    invoke-virtual {v0}, Lbin/mt/json/JSONValue;->asArray()Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 51
    invoke-virtual {v0}, Lbin/mt/json/JSONArray;->size()I

    move-result v5

    const/16 v6, 0x20

    if-gt v5, v6, :cond_d

    .line 54
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 55
    new-instance v6, Ljava/util/HashSet;

    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    .line 56
    invoke-virtual {v0}, Lbin/mt/json/JSONArray;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lbin/mt/json/JSONValue;

    .line 57
    invoke-virtual {v7}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object v7

    .line 58
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    const-string v9, "credentialId"

    const-string v10, "clientName"

    const-string v11, "digest"

    const-string v12, "createdAt"

    const-string v13, "lastUsedAt"

    const-string v14, "lastIp"

    .line 59
    filled-new-array/range {v9 .. v14}, [Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Ll/֨ۢۜ;->֫(Lbin/mt/json/JSONObject;[Ljava/lang/String;)V

    goto :goto_3

    :cond_3
    const-string v9, "credentialId"

    const-string v10, "clientName"

    const-string v11, "digest"

    const-string v12, "token"

    const-string v13, "createdAt"

    const-string v14, "lastUsedAt"

    const-string v15, "lastIp"

    .line 61
    filled-new-array/range {v9 .. v15}, [Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Ll/֨ۢۜ;->֫(Lbin/mt/json/JSONObject;[Ljava/lang/String;)V

    :goto_3
    const-string v8, "credentialId"

    .line 63
    invoke-virtual {v7, v8}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v8

    invoke-virtual {v8}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v10

    const-string v8, "clientName"

    .line 64
    invoke-virtual {v7, v8}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v8

    invoke-virtual {v8}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v11

    const-string v8, "digest"

    .line 65
    invoke-virtual {v7, v8}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v8

    invoke-virtual {v8}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v12

    const-string v8, "lastIp"

    .line 66
    invoke-virtual {v7, v8}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v8

    invoke-virtual {v8}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v18

    const-string v8, "createdAt"

    .line 67
    invoke-virtual {v7, v8}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v8

    invoke-virtual {v8}, Lbin/mt/json/JSONValue;->asLong()J

    move-result-wide v14

    const-string v8, "lastUsedAt"

    .line 68
    invoke-virtual {v7, v8}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v8

    invoke-virtual {v8}, Lbin/mt/json/JSONValue;->asLong()J

    move-result-wide v16

    .line 69
    invoke-static {v11}, Ll/ۚۢۜ;->ܿ(Ljava/lang/String;)V

    const/16 v8, 0x10

    .line 70
    invoke-static {v8, v10}, Ll/ۚۢۜ;->֫(ILjava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_b

    invoke-virtual {v6, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_b

    .line 71
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v8

    const/16 v9, 0x40

    if-ne v8, v9, :cond_b

    const-wide/16 v8, 0x0

    cmp-long v13, v14, v8

    if-ltz v13, :cond_b

    cmp-long v13, v16, v8

    if-ltz v13, :cond_b

    invoke-virtual/range {v18 .. v18}, Ljava/lang/String;->length()I

    move-result v8

    const/16 v9, 0x80

    if-gt v8, v9, :cond_b

    const/4 v8, 0x0

    .line 74
    :goto_4
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v9

    if-ge v8, v9, :cond_7

    .line 75
    invoke-virtual {v12, v8}, Ljava/lang/String;->charAt(I)C

    move-result v9

    const/16 v13, 0x30

    if-lt v9, v13, :cond_4

    const/16 v13, 0x39

    if-le v9, v13, :cond_5

    :cond_4
    const/16 v13, 0x61

    if-lt v9, v13, :cond_6

    const/16 v13, 0x66

    if-gt v9, v13, :cond_6

    :cond_5
    add-int/lit8 v8, v8, 0x1

    goto :goto_4

    .line 77
    :cond_6
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid MCP credential digest"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 80
    :cond_7
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_8

    const-string v7, ""

    :goto_5
    move-object v13, v7

    goto :goto_6

    :cond_8
    const-string v8, "token"

    invoke-virtual {v7, v8}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v7

    invoke-virtual {v7}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v7

    goto :goto_5

    .line 81
    :goto_6
    invoke-virtual {v13}, Ljava/lang/String;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_a

    invoke-static {v13, v10, v12}, Ll/ۚۢۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_9

    goto :goto_7

    .line 82
    :cond_9
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid MCP credential token"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 84
    :cond_a
    :goto_7
    new-instance v7, Ll/ᩴۢۜ;

    move-object v9, v7

    invoke-direct/range {v9 .. v18}, Ll/ᩴۢۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;)V

    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_2

    .line 72
    :cond_b
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid MCP credential metadata"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 87
    :cond_c
    :try_start_3
    invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_1

    return-object v5

    .line 52
    :cond_d
    :try_start_4
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Too many MCP credentials"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 40
    :cond_e
    new-instance v0, Ljava/io/IOException;

    const-string v1, "MCP credential store is too large"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :catchall_0
    move-exception v0

    move-object v1, v0

    .line 32
    :try_start_5
    invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_8

    :catchall_1
    move-exception v0

    move-object v2, v0

    :try_start_6
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_8
    throw v1
    :try_end_6
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_1

    :catch_0
    move-object/from16 v4, p0

    .line 89
    :catch_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid MCP credential store"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫(Ljava/util/ArrayList;)V
    .locals 5

    .line 95
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 96
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩴۢۜ;

    .line 97
    invoke-virtual {v1}, Ll/ᩴۢۜ;->֫()Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-virtual {v0, v1}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto :goto_0

    .line 99
    :cond_0
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v1, "version"

    const/4 v2, 0x2

    invoke-virtual {p1, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v1, "credentials"

    invoke-virtual {p1, v1, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p1

    .line 100
    invoke-virtual {p1}, Lbin/mt/json/JSONValue;->toString()Ljava/lang/String;

    move-result-object p1

    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    .line 101
    iget-object v0, p0, Ll/֨ۢۜ;->֫:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v1

    .line 102
    array-length v2, p1

    const/high16 v3, 0x10000

    if-gt v2, v3, :cond_5

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    move-result v2

    if-eqz v2, :cond_5

    .line 105
    :cond_1
    new-instance v2, Ljava/io/File;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ".tmp"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v1, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 107
    :try_start_0
    new-instance v1, Ljava/io/FileOutputStream;

    invoke-direct {v1, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 108
    :try_start_1
    invoke-virtual {v1, p1}, Ljava/io/FileOutputStream;->write([B)V

    .line 109
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->getFD()Ljava/io/FileDescriptor;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/FileDescriptor;->sync()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 110
    :try_start_2
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V

    .line 111
    invoke-virtual {v2, v0}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-eqz p1, :cond_3

    .line 116
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 117
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    :cond_2
    return-void

    .line 112
    :cond_3
    :try_start_3
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Cannot publish MCP credential store"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catchall_0
    move-exception p1

    .line 107
    :try_start_4
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    :try_start_5
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :catchall_2
    move-exception p1

    .line 116
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 117
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 119
    :cond_4
    throw p1

    .line 103
    :cond_5
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Cannot prepare MCP credential store"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
