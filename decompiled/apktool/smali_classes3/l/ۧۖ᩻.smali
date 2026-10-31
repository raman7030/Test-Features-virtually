.class public final Ll/ۧۖ᩻;
.super Ljava/lang/Object;
.source "D80C"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۧ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p1, p0, Ll/ۧۖ᩻;->֫:Ljava/lang/String;

    .line 39
    iput-object p2, p0, Ll/ۧۖ᩻;->ۧ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/util/ArrayList;
    .locals 8

    const-string v0, "Request failed: "

    .line 44
    new-instance v1, Ljava/text/SimpleDateFormat;

    const-string v2, "EEE, dd MMM yyyy HH:mm:ss z"

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v1, v2, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    const-string v2, "GMT"

    .line 45
    invoke-static {v2}, Ll/ۗ۬ᩴ;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 46
    new-instance v2, Ljava/util/Date;

    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    invoke-virtual {v1, v2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "GET\n\n\n"

    const-string v3, "\n/"

    .line 0
    invoke-static {v2, v1, v3}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "HmacSHA1"

    .line 94
    invoke-static {v3}, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;)Ljavax/crypto/Mac;

    move-result-object v4

    .line 95
    new-instance v5, Ljavax/crypto/spec/SecretKeySpec;

    sget-object v6, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    iget-object v7, p0, Ll/ۧۖ᩻;->ۧ:Ljava/lang/String;

    invoke-virtual {v7, v6}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v7

    invoke-direct {v5, v7, v3}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    invoke-virtual {v4, v5}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V

    .line 96
    invoke-virtual {v2, v6}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v2

    invoke-virtual {v4, v2}, Ljavax/crypto/Mac;->doFinal([B)[B

    move-result-object v2

    .line 97
    invoke-static {}, Ll/᩵۬ᩴ;->getEncoder()Ll/ᩴ۬ᩴ;

    move-result-object v3

    invoke-virtual {v3, v2}, Ll/ᩴ۬ᩴ;->encodeToString([B)Ljava/lang/String;

    move-result-object v2

    .line 98
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "OBS "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Ll/ۧۖ᩻;->֫:Ljava/lang/String;

    const-string v5, ":"

    .line 0
    invoke-static {v3, v4, v5, v2}, Ll/᩺᩵ܿ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 48
    new-instance v3, Ll/ۢ۟᩵;

    invoke-direct {v3}, Ll/ۢ۟᩵;-><init>()V

    const-string v4, "https://obs.cn-north-4.myhuaweicloud.com/"

    .line 49
    invoke-virtual {v3, v4}, Ll/ۢ۟᩵;->ۧ(Ljava/lang/String;)V

    .line 50
    invoke-virtual {v3}, Ll/ۢ۟᩵;->ۧ()V

    const-string v4, "Date"

    .line 51
    invoke-virtual {v3, v4, v1}, Ll/ۢ۟᩵;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "Authorization"

    .line 52
    invoke-virtual {v3, v1, v2}, Ll/ۢ۟᩵;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    invoke-virtual {v3}, Ll/ۢ۟᩵;->֫()Ll/ۡ۟᩵;

    move-result-object v1

    .line 54
    invoke-static {}, Ll/ۙ᩸᩷;->ۡ()Ll/ܿ۟᩵;

    move-result-object v2

    invoke-virtual {v2, v1}, Ll/ܿ۟᩵;->֫(Ll/ۡ۟᩵;)Ll/ܽܰ᩵;

    move-result-object v1

    invoke-interface {v1}, Ll/ܽܰ᩵;->execute()Ll/ᩴ۟᩵;

    move-result-object v1

    .line 55
    :try_start_0
    invoke-virtual {v1}, Ll/ᩴ۟᩵;->ۜ()Z

    move-result v2

    if-nez v2, :cond_2

    .line 56
    invoke-virtual {v1}, Ll/ᩴ۟᩵;->ᩳ()I

    move-result v2

    const/16 v3, 0x191

    if-eq v2, v3, :cond_1

    invoke-virtual {v1}, Ll/ᩴ۟᩵;->ᩳ()I

    move-result v2

    const/16 v3, 0x193

    if-ne v2, v3, :cond_0

    goto :goto_0

    .line 59
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

    .line 57
    :cond_1
    :goto_0
    new-instance v0, Ll/᩵ۤۡ;

    const v2, 0x7f120703

    invoke-direct {v0, v2}, Ll/᩵ۤۡ;-><init>(I)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    :cond_2
    :try_start_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 63
    invoke-static {}, Ljavax/xml/parsers/DocumentBuilderFactory;->newInstance()Ljavax/xml/parsers/DocumentBuilderFactory;

    move-result-object v2

    .line 64
    invoke-virtual {v2}, Ljavax/xml/parsers/DocumentBuilderFactory;->newDocumentBuilder()Ljavax/xml/parsers/DocumentBuilder;

    move-result-object v2

    .line 66
    invoke-virtual {v1}, Ll/ᩴ۟᩵;->֫()Ll/֡۟᩵;

    move-result-object v3

    invoke-virtual {v3}, Ll/֡۟᩵;->֫()Ljava/io/InputStream;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljavax/xml/parsers/DocumentBuilder;->parse(Ljava/io/InputStream;)Lorg/w3c/dom/Document;

    move-result-object v2

    const-string v3, "Bucket"

    .line 67
    invoke-interface {v2, v3}, Lorg/w3c/dom/Document;->getElementsByTagName(Ljava/lang/String;)Lorg/w3c/dom/NodeList;

    move-result-object v2

    const/4 v3, 0x0

    .line 68
    :goto_1
    invoke-interface {v2}, Lorg/w3c/dom/NodeList;->getLength()I

    move-result v4

    if-ge v3, v4, :cond_4

    .line 69
    invoke-interface {v2, v3}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    move-result-object v4

    .line 70
    invoke-interface {v4}, Lorg/w3c/dom/Node;->getNodeType()S

    move-result v5

    const/4 v6, 0x1

    if-ne v5, v6, :cond_3

    .line 71
    check-cast v4, Lorg/w3c/dom/Element;

    const-string v5, "Name"

    .line 72
    invoke-static {v5, v4}, Ll/᩺ܺ᩻;->֫(Ljava/lang/String;Lorg/w3c/dom/Element;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "Location"

    .line 73
    invoke-static {v6, v4}, Ll/᩺ܺ᩻;->֫(Ljava/lang/String;Lorg/w3c/dom/Element;)Ljava/lang/String;

    move-result-object v4

    .line 74
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "obs."

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, ".myhuaweicloud.com"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 75
    new-instance v7, Ll/ۛܺ᩻;

    invoke-direct {v7, v5, v4, v6}, Ll/ۛܺ᩻;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 82
    :cond_4
    invoke-virtual {v1}, Ll/ᩴ۟᩵;->close()V

    return-object v0

    :catch_0
    move-exception v0

    .line 80
    :try_start_2
    new-instance v2, Ljava/lang/RuntimeException;

    const-string v3, "Failed to parse ListBuckets response"

    invoke-direct {v2, v3, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception v0

    .line 54
    :try_start_3
    invoke-virtual {v1}, Ll/ᩴ۟᩵;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v1

    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v0
.end method
