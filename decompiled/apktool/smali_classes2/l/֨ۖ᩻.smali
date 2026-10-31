.class public final Ll/֨ۖ᩻;
.super Ljava/lang/Object;
.source "J7U0"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۧ:Ljava/lang/String;

.field public final ܽ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ".r2.cloudflarestorage.com"

    .line 41
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/֨ۖ᩻;->ۧ:Ljava/lang/String;

    .line 42
    iput-object p2, p0, Ll/֨ۖ᩻;->֫:Ljava/lang/String;

    .line 43
    iput-object p3, p0, Ll/֨ۖ᩻;->ܽ:Ljava/lang/String;

    return-void
.end method

.method public static ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    :try_start_0
    const-string v0, "SHA-256"

    .line 162
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0

    .line 163
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object p0

    .line 164
    invoke-static {p0}, Ll/֨ۖ᩻;->֫([B)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 166
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static ֫([B)Ljava/lang/String;
    .locals 6

    .line 171
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 172
    array-length v1, p0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    aget-byte v4, p0, v3

    .line 173
    invoke-static {v4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v4

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    aput-object v4, v5, v2

    const-string v4, "%02x"

    invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 175
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;[B)[B
    .locals 3

    const-string v0, "HmacSHA256"

    .line 155
    invoke-static {v0}, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;)Ljavax/crypto/Mac;

    move-result-object v1

    .line 156
    new-instance v2, Ljavax/crypto/spec/SecretKeySpec;

    invoke-direct {v2, p1, v0}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    invoke-virtual {v1, v2}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V

    .line 157
    sget-object p1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p0, p1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    invoke-virtual {v1, p0}, Ljavax/crypto/Mac;->doFinal([B)[B

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final ֫()Ljava/util/ArrayList;
    .locals 13

    .line 47
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "https://"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    iget-object v1, p0, Ll/֨ۖ᩻;->ۧ:Ljava/lang/String;

    const-string v2, "/"

    invoke-static {v0, v1, v2}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 53
    new-instance v3, Ljava/text/SimpleDateFormat;

    const-string v4, "yyyyMMdd\'T\'HHmmss\'Z\'"

    invoke-direct {v3, v4}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    const-string v4, "UTC"

    .line 54
    invoke-static {v4}, Ll/ۗ۬ᩴ;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 55
    new-instance v4, Ljava/util/Date;

    invoke-direct {v4}, Ljava/util/Date;-><init>()V

    invoke-virtual {v3, v4}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x8

    const/4 v5, 0x0

    .line 56
    invoke-virtual {v3, v5, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    const-string v6, ""

    .line 59
    invoke-static {v6}, Ll/֨ۖ᩻;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 62
    new-instance v7, Ljava/util/TreeMap;

    invoke-direct {v7}, Ljava/util/TreeMap;-><init>()V

    const-string v8, "host"

    .line 63
    invoke-virtual {v7, v8, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v8, "x-amz-content-sha256"

    .line 64
    invoke-virtual {v7, v8, v6}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v8, "x-amz-date"

    .line 65
    invoke-virtual {v7, v8, v3}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 134
    invoke-virtual {v7}, Ljava/util/TreeMap;->keySet()Ljava/util/Set;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    const-string v11, "\n"

    if-eqz v10, :cond_0

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    .line 136
    invoke-virtual {v10}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v8, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v12, ":"

    invoke-virtual {v8, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v10}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-virtual {v10}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 138
    :cond_0
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 68
    invoke-virtual {v7}, Ljava/util/TreeMap;->keySet()Ljava/util/Set;

    move-result-object v7

    .line 0
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_1

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/CharSequence;

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_1

    const-string v10, ";"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const-string v9, "GET\n/\n\n"

    invoke-static {v9, v8, v11, v7, v11}, Ll/ۗ᩵֫;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    .line 70
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    const-string v9, "/auto/s3/aws4_request"

    .line 0
    invoke-static {v4, v9}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-string v10, "AWS4-HMAC-SHA256\n"

    invoke-static {v10, v3, v11, v9, v11}, Ll/ۗ᩵֫;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    .line 82
    invoke-static {v8}, Ll/֨ۖ᩻;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 85
    iget-object v10, p0, Ll/֨ۖ᩻;->ܽ:Ljava/lang/String;

    const-string v11, "AWS4"

    .line 143
    :try_start_0
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    sget-object v11, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v10, v11}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v10

    invoke-static {v4, v10}, Ll/֨ۖ᩻;->֫(Ljava/lang/String;[B)[B

    move-result-object v4

    const-string v10, "auto"

    .line 144
    invoke-static {v10, v4}, Ll/֨ۖ᩻;->֫(Ljava/lang/String;[B)[B

    move-result-object v4

    const-string v10, "s3"

    .line 145
    invoke-static {v10, v4}, Ll/֨ۖ᩻;->֫(Ljava/lang/String;[B)[B

    move-result-object v4

    const-string v10, "aws4_request"

    .line 146
    invoke-static {v10, v4}, Ll/֨ۖ᩻;->֫(Ljava/lang/String;[B)[B

    move-result-object v4

    .line 147
    invoke-static {v8, v4}, Ll/֨ۖ᩻;->֫(Ljava/lang/String;[B)[B

    move-result-object v4

    .line 148
    invoke-static {v4}, Ll/֨ۖ᩻;->֫([B)Ljava/lang/String;

    move-result-object v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 88
    new-instance v8, Ljava/lang/StringBuilder;

    const-string v10, "AWS4-HMAC-SHA256 Credential="

    invoke-direct {v8, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v10, p0, Ll/֨ۖ᩻;->֫:Ljava/lang/String;

    const-string v11, ", SignedHeaders="

    .line 0
    invoke-static {v8, v10, v2, v9, v11}, Lorg/bouncycastle/asn1/ASN1BMPString$$ExternalSyntheticOutline0;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, ", Signature="

    invoke-static {v8, v7, v2, v4}, Ll/᩺᩵ܿ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 94
    new-instance v4, Ll/ۢ۟᩵;

    invoke-direct {v4}, Ll/ۢ۟᩵;-><init>()V

    .line 95
    invoke-virtual {v4, v0}, Ll/ۢ۟᩵;->ۧ(Ljava/lang/String;)V

    const-string v0, "Host"

    .line 96
    invoke-virtual {v4, v0, v1}, Ll/ۢ۟᩵;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "X-Amz-Content-Sha256"

    .line 97
    invoke-virtual {v4, v0, v6}, Ll/ۢ۟᩵;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "X-Amz-Date"

    .line 98
    invoke-virtual {v4, v0, v3}, Ll/ۢ۟᩵;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "Authorization"

    .line 99
    invoke-virtual {v4, v0, v2}, Ll/ۢ۟᩵;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    invoke-virtual {v4}, Ll/ۢ۟᩵;->֫()Ll/ۡ۟᩵;

    move-result-object v0

    .line 103
    invoke-static {}, Ll/ۙ᩸᩷;->ۡ()Ll/ܿ۟᩵;

    move-result-object v2

    invoke-virtual {v2, v0}, Ll/ܿ۟᩵;->֫(Ll/ۡ۟᩵;)Ll/ܽܰ᩵;

    move-result-object v0

    invoke-interface {v0}, Ll/ܽܰ᩵;->execute()Ll/ᩴ۟᩵;

    move-result-object v0

    .line 104
    :try_start_1
    invoke-virtual {v0}, Ll/ᩴ۟᩵;->ۜ()Z

    move-result v2

    if-nez v2, :cond_4

    .line 105
    invoke-virtual {v0}, Ll/ᩴ۟᩵;->ᩳ()I

    move-result v1

    const/16 v2, 0x191

    if-eq v1, v2, :cond_3

    invoke-virtual {v0}, Ll/ᩴ۟᩵;->ᩳ()I

    move-result v1

    const/16 v2, 0x193

    if-ne v1, v2, :cond_2

    goto :goto_2

    .line 108
    :cond_2
    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Request failed: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ll/ᩴ۟᩵;->ᩳ()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ll/ᩴ۟᩵;->ۖ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 106
    :cond_3
    :goto_2
    new-instance v1, Ll/᩵ۤۡ;

    const v2, 0x7f120703

    invoke-direct {v1, v2}, Ll/᩵ۤۡ;-><init>(I)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 111
    :cond_4
    :try_start_2
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 112
    invoke-static {}, Ljavax/xml/parsers/DocumentBuilderFactory;->newInstance()Ljavax/xml/parsers/DocumentBuilderFactory;

    move-result-object v3

    .line 113
    invoke-virtual {v3}, Ljavax/xml/parsers/DocumentBuilderFactory;->newDocumentBuilder()Ljavax/xml/parsers/DocumentBuilder;

    move-result-object v3

    .line 115
    invoke-virtual {v0}, Ll/ᩴ۟᩵;->֫()Ll/֡۟᩵;

    move-result-object v4

    invoke-virtual {v4}, Ll/֡۟᩵;->֫()Ljava/io/InputStream;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljavax/xml/parsers/DocumentBuilder;->parse(Ljava/io/InputStream;)Lorg/w3c/dom/Document;

    move-result-object v3

    const-string v4, "Bucket"

    .line 116
    invoke-interface {v3, v4}, Lorg/w3c/dom/Document;->getElementsByTagName(Ljava/lang/String;)Lorg/w3c/dom/NodeList;

    move-result-object v3

    .line 117
    :goto_3
    invoke-interface {v3}, Lorg/w3c/dom/NodeList;->getLength()I

    move-result v4

    if-ge v5, v4, :cond_6

    .line 118
    invoke-interface {v3, v5}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    move-result-object v4

    .line 119
    invoke-interface {v4}, Lorg/w3c/dom/Node;->getNodeType()S

    move-result v6

    const/4 v7, 0x1

    if-ne v6, v7, :cond_5

    .line 120
    check-cast v4, Lorg/w3c/dom/Element;

    const-string v6, "Name"

    .line 121
    invoke-static {v6, v4}, Ll/᩺ܺ᩻;->֫(Ljava/lang/String;Lorg/w3c/dom/Element;)Ljava/lang/String;

    move-result-object v4

    .line 122
    new-instance v6, Ll/ۛܺ᩻;

    const/4 v7, 0x0

    invoke-direct {v6, v4, v7, v1}, Ll/ۛܺ᩻;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_5
    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    .line 129
    :cond_6
    invoke-virtual {v0}, Ll/ᩴ۟᩵;->close()V

    return-object v2

    :catch_0
    move-exception v1

    .line 127
    :try_start_3
    new-instance v2, Ljava/lang/RuntimeException;

    const-string v3, "Failed to parse ListBuckets response"

    invoke-direct {v2, v3, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    move-exception v1

    .line 103
    :try_start_4
    invoke-virtual {v0}, Ll/ᩴ۟᩵;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw v1

    :catch_1
    move-exception v0

    .line 150
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Failed to generate HMAC signature"

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method
