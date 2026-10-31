.class public final Ll/ܽۖ᩻;
.super Ljava/lang/Object;
.source "Z83J"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۧ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p1, p0, Ll/ܽۖ᩻;->֫:Ljava/lang/String;

    .line 40
    iput-object p2, p0, Ll/ܽۖ᩻;->ۧ:Ljava/lang/String;

    return-void
.end method

.method public static ֫(Ljava/io/InputStream;)Ljava/util/ArrayList;
    .locals 7

    .line 80
    :try_start_0
    invoke-static {}, Ljavax/xml/parsers/DocumentBuilderFactory;->newInstance()Ljavax/xml/parsers/DocumentBuilderFactory;

    move-result-object v0

    .line 81
    invoke-virtual {v0}, Ljavax/xml/parsers/DocumentBuilderFactory;->newDocumentBuilder()Ljavax/xml/parsers/DocumentBuilder;

    move-result-object v0

    .line 82
    invoke-virtual {v0, p0}, Ljavax/xml/parsers/DocumentBuilder;->parse(Ljava/io/InputStream;)Lorg/w3c/dom/Document;

    move-result-object p0

    const-string v0, "Bucket"

    .line 84
    invoke-interface {p0, v0}, Lorg/w3c/dom/Document;->getElementsByTagName(Ljava/lang/String;)Lorg/w3c/dom/NodeList;

    move-result-object p0

    .line 85
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 86
    :goto_0
    invoke-interface {p0}, Lorg/w3c/dom/NodeList;->getLength()I

    move-result v3

    if-ge v2, v3, :cond_0

    .line 87
    invoke-interface {p0, v2}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    move-result-object v3

    check-cast v3, Lorg/w3c/dom/Element;

    const-string v4, "Name"

    .line 88
    invoke-interface {v3, v4}, Lorg/w3c/dom/Element;->getElementsByTagName(Ljava/lang/String;)Lorg/w3c/dom/NodeList;

    move-result-object v4

    invoke-interface {v4, v1}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    move-result-object v4

    invoke-interface {v4}, Lorg/w3c/dom/Node;->getTextContent()Ljava/lang/String;

    move-result-object v4

    const-string v5, "Location"

    .line 89
    invoke-interface {v3, v5}, Lorg/w3c/dom/Element;->getElementsByTagName(Ljava/lang/String;)Lorg/w3c/dom/NodeList;

    move-result-object v5

    invoke-interface {v5, v1}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    move-result-object v5

    invoke-interface {v5}, Lorg/w3c/dom/Node;->getTextContent()Ljava/lang/String;

    move-result-object v5

    const-string v6, "ExtranetEndpoint"

    .line 90
    invoke-interface {v3, v6}, Lorg/w3c/dom/Element;->getElementsByTagName(Ljava/lang/String;)Lorg/w3c/dom/NodeList;

    move-result-object v3

    invoke-interface {v3, v1}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    move-result-object v3

    invoke-interface {v3}, Lorg/w3c/dom/Node;->getTextContent()Ljava/lang/String;

    move-result-object v3

    .line 91
    new-instance v6, Ll/ۛܺ᩻;

    invoke-direct {v6, v4, v5, v3}, Ll/ۛܺ᩻;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v0

    :catch_0
    move-exception p0

    .line 95
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Failed to parse ListBuckets response"

    invoke-direct {v0, v1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method


# virtual methods
.method public final ֫()Ljava/util/ArrayList;
    .locals 7

    const-string v0, "Request failed: "

    .line 141
    new-instance v1, Ljava/text/SimpleDateFormat;

    const-string v2, "EEE, dd MMM yyyy HH:mm:ss \'GMT\'"

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v1, v2, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    const-string v2, "GMT"

    .line 142
    invoke-static {v2}, Ll/ۗ۬ᩴ;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 143
    new-instance v2, Ljava/util/Date;

    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    invoke-virtual {v1, v2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    .line 52
    iget-object v2, p0, Ll/ܽۖ᩻;->ۧ:Ljava/lang/String;

    const-string v3, "GET\n\n\n"

    const-string v4, "\n/"

    .line 0
    invoke-static {v3, v1, v4}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "HmacSHA1"

    .line 127
    :try_start_0
    new-instance v5, Ljavax/crypto/spec/SecretKeySpec;

    sget-object v6, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v2, v6}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v2

    invoke-direct {v5, v2, v4}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 128
    invoke-static {v4}, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;)Ljavax/crypto/Mac;

    move-result-object v2

    .line 129
    invoke-virtual {v2, v5}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V

    .line 130
    invoke-virtual {v3, v6}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v3

    invoke-virtual {v2, v3}, Ljavax/crypto/Mac;->doFinal([B)[B

    move-result-object v2

    .line 131
    invoke-static {}, Ll/᩵۬ᩴ;->getEncoder()Ll/ᩴ۬ᩴ;

    move-result-object v3

    invoke-virtual {v3, v2}, Ll/ᩴ۬ᩴ;->encodeToString([B)Ljava/lang/String;

    move-result-object v2
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_0

    .line 56
    new-instance v3, Ll/ۢ۟᩵;

    invoke-direct {v3}, Ll/ۢ۟᩵;-><init>()V

    const-string v4, "https://oss-cn-hangzhou.aliyuncs.com"

    .line 57
    invoke-virtual {v3, v4}, Ll/ۢ۟᩵;->ۧ(Ljava/lang/String;)V

    const/4 v4, 0x0

    const-string v5, "GET"

    .line 58
    invoke-virtual {v3, v5, v4}, Ll/ۢ۟᩵;->֫(Ljava/lang/String;Ll/ۖ۟᩵;)V

    const-string v4, "Date"

    .line 59
    invoke-virtual {v3, v4, v1}, Ll/ۢ۟᩵;->֫(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "OSS "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Ll/ܽۖ᩻;->֫:Ljava/lang/String;

    const-string v5, ":"

    .line 0
    invoke-static {v1, v4, v5, v2}, Ll/᩺᩵ܿ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Authorization"

    .line 60
    invoke-virtual {v3, v2, v1}, Ll/ۢ۟᩵;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    invoke-virtual {v3}, Ll/ۢ۟᩵;->֫()Ll/ۡ۟᩵;

    move-result-object v1

    .line 64
    invoke-static {}, Ll/ۙ᩸᩷;->ۡ()Ll/ܿ۟᩵;

    move-result-object v2

    invoke-virtual {v2, v1}, Ll/ܿ۟᩵;->֫(Ll/ۡ۟᩵;)Ll/ܽܰ᩵;

    move-result-object v1

    invoke-interface {v1}, Ll/ܽܰ᩵;->execute()Ll/ᩴ۟᩵;

    move-result-object v1

    .line 65
    :try_start_1
    invoke-virtual {v1}, Ll/ᩴ۟᩵;->ۜ()Z

    move-result v2

    if-nez v2, :cond_2

    .line 66
    invoke-virtual {v1}, Ll/ᩴ۟᩵;->ᩳ()I

    move-result v2

    const/16 v3, 0x191

    if-eq v2, v3, :cond_1

    invoke-virtual {v1}, Ll/ᩴ۟᩵;->ᩳ()I

    move-result v2

    const/16 v3, 0x193

    if-ne v2, v3, :cond_0

    goto :goto_0

    .line 69
    :cond_0
    new-instance v2, Ljava/io/IOException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ll/ᩴ۟᩵;->ᩳ()I

    move-result v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ll/ᩴ۟᩵;->ۖ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 67
    :cond_1
    :goto_0
    new-instance v0, Ll/᩵ۤۡ;

    const v2, 0x7f120703

    invoke-direct {v0, v2}, Ll/᩵ۤۡ;-><init>(I)V

    throw v0

    .line 71
    :cond_2
    invoke-virtual {v1}, Ll/ᩴ۟᩵;->֫()Ll/֡۟᩵;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Ll/֡۟᩵;->֫()Ljava/io/InputStream;

    move-result-object v0

    invoke-static {v0}, Ll/ܽۖ᩻;->֫(Ljava/io/InputStream;)Ljava/util/ArrayList;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 72
    invoke-virtual {v1}, Ll/ᩴ۟᩵;->close()V

    return-object v0

    :catchall_0
    move-exception v0

    .line 64
    :try_start_2
    invoke-virtual {v1}, Ll/ᩴ۟᩵;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v1

    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v0

    :catch_0
    move-exception v0

    goto :goto_2

    :catch_1
    move-exception v0

    .line 133
    :goto_2
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Failed to generate HMAC signature"

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method
