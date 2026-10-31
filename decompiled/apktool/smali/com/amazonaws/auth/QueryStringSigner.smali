.class public Lcom/amazonaws/auth/QueryStringSigner;
.super Lcom/amazonaws/auth/AbstractAWSSigner;
.source "QueryStringSigner.java"

# interfaces
.implements Lcom/amazonaws/auth/Signer;


# instance fields
.field public overriddenDate:Ljava/util/Date;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 33
    invoke-direct {p0}, Lcom/amazonaws/auth/AbstractAWSSigner;-><init>()V

    return-void
.end method

.method private calculateStringToSignV1(Ljava/util/Map;)Ljava/lang/String;
    .locals 3

    .line 99
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 100
    new-instance v1, Ljava/util/TreeMap;

    sget-object v2, Ljava/lang/String;->CASE_INSENSITIVE_ORDER:Ljava/util/Comparator;

    invoke-direct {v1, v2}, Ljava/util/TreeMap;-><init>(Ljava/util/Comparator;)V

    .line 102
    invoke-virtual {v1, p1}, Ljava/util/TreeMap;->putAll(Ljava/util/Map;)V

    .line 104
    invoke-virtual {v1}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 105
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 109
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private calculateStringToSignV2(Lcom/amazonaws/Request;)Ljava/lang/String;
    .locals 4

    .line 120
    check-cast p1, Lcom/amazonaws/DefaultRequest;

    invoke-virtual {p1}, Lcom/amazonaws/DefaultRequest;->ۧ()Ljava/net/URI;

    move-result-object v0

    .line 121
    invoke-virtual {p1}, Lcom/amazonaws/DefaultRequest;->ܳ()Ljava/util/LinkedHashMap;

    move-result-object v1

    .line 123
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "POST\n"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 125
    invoke-virtual {p0, v0}, Lcom/amazonaws/auth/AbstractAWSSigner;->getCanonicalizedEndpoint(Ljava/net/URI;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    invoke-direct {p0, p1}, Lcom/amazonaws/auth/QueryStringSigner;->getCanonicalizedResourcePath(Lcom/amazonaws/Request;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    invoke-virtual {p0, v1}, Lcom/amazonaws/auth/AbstractAWSSigner;->getCanonicalizedQueryString(Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private getCanonicalizedResourcePath(Lcom/amazonaws/Request;)Ljava/lang/String;
    .locals 3

    .line 134
    check-cast p1, Lcom/amazonaws/DefaultRequest;

    invoke-virtual {p1}, Lcom/amazonaws/DefaultRequest;->ۧ()Ljava/net/URI;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/URI;->getPath()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    if-eqz v0, :cond_0

    .line 135
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/amazonaws/DefaultRequest;->ۧ()Ljava/net/URI;

    move-result-object v1

    invoke-virtual {v1}, Ljava/net/URI;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 138
    :cond_0
    invoke-virtual {p1}, Lcom/amazonaws/DefaultRequest;->᩻()Ljava/lang/String;

    move-result-object v0

    const-string v2, "/"

    if-eqz v0, :cond_2

    .line 139
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    .line 140
    invoke-virtual {v1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 141
    invoke-virtual {p1}, Lcom/amazonaws/DefaultRequest;->᩻()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 142
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 0
    :cond_1
    invoke-static {v1}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 145
    invoke-virtual {p1}, Lcom/amazonaws/DefaultRequest;->᩻()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 146
    :cond_2
    invoke-virtual {v1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_3

    .line 147
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 150
    :cond_3
    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_4

    .line 151
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :cond_4
    const-string p1, "//"

    .line 154
    invoke-virtual {v1, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_5

    const/4 p1, 0x1

    .line 155
    invoke-virtual {v1, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_5
    return-object v1
.end method

.method private getFormattedTimestamp(J)Ljava/lang/String;
    .locals 2

    .line 165
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyy-MM-dd\'T\'HH:mm:ss.SSS\'Z\'"

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    const-string v1, "UTC"

    .line 167
    invoke-static {v1}, Ll/ۗ۬ᩴ;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 169
    iget-object v1, p0, Lcom/amazonaws/auth/QueryStringSigner;->overriddenDate:Ljava/util/Date;

    if-eqz v1, :cond_0

    .line 170
    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 172
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/amazonaws/auth/AbstractAWSSigner;->getSignatureDate(J)Ljava/util/Date;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public addSessionCredentials(Lcom/amazonaws/Request;Lcom/amazonaws/auth/AWSSessionCredentials;)V
    .locals 1

    .line 183
    invoke-interface {p2}, Lcom/amazonaws/auth/AWSSessionCredentials;->ۧ()Ljava/lang/String;

    move-result-object p2

    check-cast p1, Lcom/amazonaws/DefaultRequest;

    const-string v0, "SecurityToken"

    invoke-virtual {p1, v0, p2}, Lcom/amazonaws/DefaultRequest;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public overrideDate(Ljava/util/Date;)V
    .locals 0

    .line 178
    iput-object p1, p0, Lcom/amazonaws/auth/QueryStringSigner;->overriddenDate:Ljava/util/Date;

    return-void
.end method

.method public sign(Lcom/amazonaws/Request;Lcom/amazonaws/auth/AWSCredentials;)V
    .locals 2

    .line 47
    sget-object v0, Lcom/amazonaws/auth/SignatureVersion;->ۙ:Lcom/amazonaws/auth/SignatureVersion;

    sget-object v1, Lcom/amazonaws/auth/SigningAlgorithm;->᩶:Lcom/amazonaws/auth/SigningAlgorithm;

    invoke-virtual {p0, p1, v0, v1, p2}, Lcom/amazonaws/auth/QueryStringSigner;->sign(Lcom/amazonaws/Request;Lcom/amazonaws/auth/SignatureVersion;Lcom/amazonaws/auth/SigningAlgorithm;Lcom/amazonaws/auth/AWSCredentials;)V

    return-void
.end method

.method public sign(Lcom/amazonaws/Request;Lcom/amazonaws/auth/SignatureVersion;Lcom/amazonaws/auth/SigningAlgorithm;Lcom/amazonaws/auth/AWSCredentials;)V
    .locals 3

    .line 66
    invoke-virtual {p0, p4}, Lcom/amazonaws/auth/AbstractAWSSigner;->sanitizeCredentials(Lcom/amazonaws/auth/AWSCredentials;)Lcom/amazonaws/auth/AWSCredentials;

    move-result-object p4

    .line 67
    invoke-interface {p4}, Lcom/amazonaws/auth/AWSCredentials;->֫()Ljava/lang/String;

    move-result-object v0

    check-cast p1, Lcom/amazonaws/DefaultRequest;

    const-string v1, "AWSAccessKeyId"

    invoke-virtual {p1, v1, v0}, Lcom/amazonaws/DefaultRequest;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "SignatureVersion"

    .line 68
    invoke-virtual {p2}, Lcom/amazonaws/auth/SignatureVersion;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/amazonaws/DefaultRequest;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    invoke-virtual {p0, p1}, Lcom/amazonaws/auth/AbstractAWSSigner;->getTimeOffset(Lcom/amazonaws/Request;)J

    move-result-wide v0

    const-string v2, "Timestamp"

    .line 71
    invoke-direct {p0, v0, v1}, Lcom/amazonaws/auth/QueryStringSigner;->getFormattedTimestamp(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v2, v0}, Lcom/amazonaws/DefaultRequest;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    instance-of v0, p4, Lcom/amazonaws/auth/AWSSessionCredentials;

    if-eqz v0, :cond_0

    .line 74
    move-object v0, p4

    check-cast v0, Lcom/amazonaws/auth/AWSSessionCredentials;

    invoke-virtual {p0, p1, v0}, Lcom/amazonaws/auth/QueryStringSigner;->addSessionCredentials(Lcom/amazonaws/Request;Lcom/amazonaws/auth/AWSSessionCredentials;)V

    .line 78
    :cond_0
    sget-object v0, Lcom/amazonaws/auth/SignatureVersion;->᩶:Lcom/amazonaws/auth/SignatureVersion;

    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 79
    invoke-virtual {p1}, Lcom/amazonaws/DefaultRequest;->ܳ()Ljava/util/LinkedHashMap;

    move-result-object p2

    invoke-direct {p0, p2}, Lcom/amazonaws/auth/QueryStringSigner;->calculateStringToSignV1(Ljava/util/Map;)Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    .line 80
    :cond_1
    sget-object v0, Lcom/amazonaws/auth/SignatureVersion;->ۙ:Lcom/amazonaws/auth/SignatureVersion;

    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    const-string p2, "SignatureMethod"

    .line 81
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lcom/amazonaws/DefaultRequest;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    invoke-direct {p0, p1}, Lcom/amazonaws/auth/QueryStringSigner;->calculateStringToSignV2(Lcom/amazonaws/Request;)Ljava/lang/String;

    move-result-object p2

    .line 88
    :goto_0
    invoke-interface {p4}, Lcom/amazonaws/auth/AWSCredentials;->ܽ()Ljava/lang/String;

    move-result-object p4

    .line 87
    invoke-virtual {p0, p2, p4, p3}, Lcom/amazonaws/auth/AbstractAWSSigner;->signAndBase64Encode(Ljava/lang/String;Ljava/lang/String;Lcom/amazonaws/auth/SigningAlgorithm;)Ljava/lang/String;

    move-result-object p2

    const-string p3, "Signature"

    .line 89
    invoke-virtual {p1, p3, p2}, Lcom/amazonaws/DefaultRequest;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 84
    :cond_2
    new-instance p1, Lcom/amazonaws/AmazonClientException;

    const-string p2, "Invalid Signature Version specified"

    .line 59
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 84
    throw p1
.end method
