.class public Lcom/amazonaws/auth/AWS4Signer;
.super Lcom/amazonaws/auth/AbstractAWSSigner;
.source "AWS4Signer.java"

# interfaces
.implements Lcom/amazonaws/auth/ServiceAwareSigner;
.implements Lcom/amazonaws/auth/RegionAwareSigner;


# static fields
.field public static final ALGORITHM:Ljava/lang/String; = "AWS4-HMAC-SHA256"

.field public static final DATE_PATTERN:Ljava/lang/String; = "yyyyMMdd"

.field public static final MAX_EXPIRATION_TIME_IN_SECONDS:J = 0x93a80L

.field public static final MILLISEC:J = 0x3e8L

.field public static final TERMINATOR:Ljava/lang/String; = "aws4_request"

.field public static final TIME_PATTERN:Ljava/lang/String; = "yyyyMMdd\'T\'HHmmss\'Z\'"

.field public static final log:Lcom/amazonaws/logging/Log;


# instance fields
.field public doubleUrlEncode:Z

.field public overriddenDate:Ljava/util/Date;

.field public regionName:Ljava/lang/String;

.field public serviceName:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 92
    const-class v0, Lcom/amazonaws/auth/AWS4Signer;

    invoke-static {v0}, Lcom/amazonaws/logging/LogFactory;->֫(Ljava/lang/Class;)Lcom/amazonaws/logging/Log;

    move-result-object v0

    sput-object v0, Lcom/amazonaws/auth/AWS4Signer;->log:Lcom/amazonaws/logging/Log;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    .line 79
    invoke-direct {p0, v0}, Lcom/amazonaws/auth/AWS4Signer;-><init>(Z)V

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    .line 88
    invoke-direct {p0}, Lcom/amazonaws/auth/AbstractAWSSigner;-><init>()V

    .line 89
    iput-boolean p1, p0, Lcom/amazonaws/auth/AWS4Signer;->doubleUrlEncode:Z

    return-void
.end method


# virtual methods
.method public addHostHeader(Lcom/amazonaws/Request;)V
    .locals 2

    .line 337
    check-cast p1, Lcom/amazonaws/DefaultRequest;

    invoke-virtual {p1}, Lcom/amazonaws/DefaultRequest;->ۧ()Ljava/net/URI;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object v0

    .line 338
    invoke-virtual {p1}, Lcom/amazonaws/DefaultRequest;->ۧ()Ljava/net/URI;

    move-result-object v1

    invoke-static {v1}, Lcom/amazonaws/util/HttpUtils;->֫(Ljava/net/URI;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, ":"

    .line 0
    invoke-static {v0, v1}, Ll/۟֫ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 339
    invoke-virtual {p1}, Lcom/amazonaws/DefaultRequest;->ۧ()Ljava/net/URI;

    move-result-object v1

    invoke-virtual {v1}, Ljava/net/URI;->getPort()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_0
    const-string v1, "Host"

    .line 341
    invoke-virtual {p1, v1, v0}, Lcom/amazonaws/DefaultRequest;->֫(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public addSessionCredentials(Lcom/amazonaws/Request;Lcom/amazonaws/auth/AWSSessionCredentials;)V
    .locals 1

    .line 180
    invoke-interface {p2}, Lcom/amazonaws/auth/AWSSessionCredentials;->ۧ()Ljava/lang/String;

    move-result-object p2

    check-cast p1, Lcom/amazonaws/DefaultRequest;

    const-string v0, "x-amz-security-token"

    invoke-virtual {p1, v0, p2}, Lcom/amazonaws/DefaultRequest;->֫(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public calculateContentHash(Lcom/amazonaws/Request;)Ljava/lang/String;
    .locals 2

    .line 360
    invoke-virtual {p0, p1}, Lcom/amazonaws/auth/AbstractAWSSigner;->getBinaryRequestPayloadStream(Lcom/amazonaws/Request;)Ljava/io/InputStream;

    move-result-object p1

    const/4 v0, -0x1

    .line 361
    invoke-virtual {p1, v0}, Ljava/io/InputStream;->mark(I)V

    .line 362
    invoke-virtual {p0, p1}, Lcom/amazonaws/auth/AbstractAWSSigner;->hash(Ljava/io/InputStream;)[B

    move-result-object v0

    invoke-static {v0}, Lcom/amazonaws/util/BinaryUtils;->֫([B)Ljava/lang/String;

    move-result-object v0

    .line 364
    :try_start_0
    invoke-virtual {p1}, Ljava/io/InputStream;->reset()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    .line 366
    new-instance v0, Lcom/amazonaws/AmazonClientException;

    const-string v1, "Unable to reset stream after calculating AWS4 signature"

    .line 50
    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 366
    throw v0
.end method

.method public calculateContentHashPresign(Lcom/amazonaws/Request;)Ljava/lang/String;
    .locals 0

    .line 489
    invoke-virtual {p0, p1}, Lcom/amazonaws/auth/AWS4Signer;->calculateContentHash(Lcom/amazonaws/Request;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final computeSignature(Lcom/amazonaws/Request;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/amazonaws/auth/AWSCredentials;)Lcom/amazonaws/auth/AWS4Signer$HeaderSigningResult;
    .locals 4

    .line 296
    check-cast p1, Lcom/amazonaws/DefaultRequest;

    invoke-virtual {p1}, Lcom/amazonaws/DefaultRequest;->ۧ()Ljava/net/URI;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/amazonaws/auth/AWS4Signer;->extractRegionName(Ljava/net/URI;)Ljava/lang/String;

    move-result-object v0

    .line 297
    invoke-virtual {p1}, Lcom/amazonaws/DefaultRequest;->ۧ()Ljava/net/URI;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/amazonaws/auth/AWS4Signer;->extractServiceName(Ljava/net/URI;)Ljava/lang/String;

    move-result-object v1

    .line 298
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "/"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "/aws4_request"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 301
    invoke-virtual {p0, p1, p5}, Lcom/amazonaws/auth/AWS4Signer;->getCanonicalRequest(Lcom/amazonaws/Request;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 300
    invoke-virtual {p0, p4, p3, v2, p1}, Lcom/amazonaws/auth/AWS4Signer;->getStringToSign(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 305
    new-instance p4, Ljava/lang/StringBuilder;

    const-string p5, "AWS4"

    invoke-direct {p4, p5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p6}, Lcom/amazonaws/auth/AWSCredentials;->ܽ()Ljava/lang/String;

    move-result-object p5

    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    sget-object p5, Lcom/amazonaws/util/StringUtils;->֫:Ljava/nio/charset/Charset;

    .line 306
    invoke-virtual {p4, p5}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p4

    .line 307
    sget-object p6, Lcom/amazonaws/auth/SigningAlgorithm;->᩶:Lcom/amazonaws/auth/SigningAlgorithm;

    invoke-virtual {p0, p2, p4, p6}, Lcom/amazonaws/auth/AbstractAWSSigner;->sign(Ljava/lang/String;[BLcom/amazonaws/auth/SigningAlgorithm;)[B

    move-result-object p2

    .line 308
    invoke-virtual {p0, v0, p2, p6}, Lcom/amazonaws/auth/AbstractAWSSigner;->sign(Ljava/lang/String;[BLcom/amazonaws/auth/SigningAlgorithm;)[B

    move-result-object p2

    .line 309
    invoke-virtual {p0, v1, p2, p6}, Lcom/amazonaws/auth/AbstractAWSSigner;->sign(Ljava/lang/String;[BLcom/amazonaws/auth/SigningAlgorithm;)[B

    move-result-object p2

    const-string p4, "aws4_request"

    .line 310
    invoke-virtual {p0, p4, p2, p6}, Lcom/amazonaws/auth/AbstractAWSSigner;->sign(Ljava/lang/String;[BLcom/amazonaws/auth/SigningAlgorithm;)[B

    move-result-object p2

    .line 312
    invoke-virtual {p1, p5}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    invoke-virtual {p0, p1, p2, p6}, Lcom/amazonaws/auth/AbstractAWSSigner;->sign([B[BLcom/amazonaws/auth/SigningAlgorithm;)[B

    move-result-object p1

    .line 314
    new-instance p4, Lcom/amazonaws/auth/AWS4Signer$HeaderSigningResult;

    invoke-direct {p4, p3, v2, p2, p1}, Lcom/amazonaws/auth/AWS4Signer$HeaderSigningResult;-><init>(Ljava/lang/String;Ljava/lang/String;[B[B)V

    return-object p4
.end method

.method public extractRegionName(Ljava/net/URI;)Ljava/lang/String;
    .locals 1

    .line 184
    iget-object v0, p0, Lcom/amazonaws/auth/AWS4Signer;->regionName:Ljava/lang/String;

    if-eqz v0, :cond_0

    return-object v0

    .line 188
    :cond_0
    invoke-virtual {p1}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/amazonaws/auth/AWS4Signer;->serviceName:Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/amazonaws/util/AwsHostNameUtils;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public extractServiceName(Ljava/net/URI;)Ljava/lang/String;
    .locals 1

    .line 193
    iget-object v0, p0, Lcom/amazonaws/auth/AWS4Signer;->serviceName:Ljava/lang/String;

    if-eqz v0, :cond_0

    return-object v0

    .line 202
    :cond_0
    invoke-static {p1}, Lcom/amazonaws/util/AwsHostNameUtils;->֫(Ljava/net/URI;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getCanonicalRequest(Lcom/amazonaws/Request;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 254
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 258
    move-object v0, p1

    check-cast v0, Lcom/amazonaws/DefaultRequest;

    invoke-virtual {v0}, Lcom/amazonaws/DefaultRequest;->ۧ()Ljava/net/URI;

    move-result-object v1

    invoke-virtual {v1}, Ljava/net/URI;->getPath()Ljava/lang/String;

    move-result-object v1

    .line 259
    invoke-virtual {v0}, Lcom/amazonaws/DefaultRequest;->᩻()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    .line 223
    invoke-static {v1, v2, v3}, Lcom/amazonaws/util/HttpUtils;->֫(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v1

    .line 262
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 263
    invoke-virtual {v0}, Lcom/amazonaws/DefaultRequest;->ᩳ()Lcom/amazonaws/http/HttpMethodName;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v3, p0, Lcom/amazonaws/auth/AWS4Signer;->doubleUrlEncode:Z

    .line 268
    invoke-virtual {p0, v1, v3}, Lcom/amazonaws/auth/AbstractAWSSigner;->getCanonicalizedResourcePath(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 269
    invoke-virtual {p0, p1}, Lcom/amazonaws/auth/AbstractAWSSigner;->getCanonicalizedQueryString(Lcom/amazonaws/Request;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 270
    invoke-virtual {p0, p1}, Lcom/amazonaws/auth/AWS4Signer;->getCanonicalizedHeaderString(Lcom/amazonaws/Request;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 271
    invoke-virtual {p0, p1}, Lcom/amazonaws/auth/AWS4Signer;->getSignedHeadersString(Lcom/amazonaws/Request;)Ljava/lang/String;

    move-result-object p1

    .line 0
    invoke-static {v2, p1, v0, p2}, Ll/᩺᩵ܿ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 273
    sget-object p2, Lcom/amazonaws/auth/AWS4Signer;->log:Lcom/amazonaws/logging/Log;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AWS4 Canonical Request: \'\""

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Lcom/amazonaws/logging/Log;->ۧ(Ljava/lang/String;)V

    return-object p1
.end method

.method public getCanonicalizedHeaderString(Lcom/amazonaws/Request;)Ljava/lang/String;
    .locals 7

    .line 211
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 212
    check-cast p1, Lcom/amazonaws/DefaultRequest;

    invoke-virtual {p1}, Lcom/amazonaws/DefaultRequest;->ܽ()Ljava/util/HashMap;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 213
    sget-object v1, Ljava/lang/String;->CASE_INSENSITIVE_ORDER:Ljava/util/Comparator;

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 215
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 216
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 217
    invoke-virtual {p0, v2}, Lcom/amazonaws/auth/AWS4Signer;->needsSign(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 218
    invoke-static {v2}, Lcom/amazonaws/util/StringUtils;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "\\s+"

    const-string v5, " "

    invoke-virtual {v3, v4, v5}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 219
    invoke-virtual {p1}, Lcom/amazonaws/DefaultRequest;->ܽ()Ljava/util/HashMap;

    move-result-object v6

    invoke-virtual {v6, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 221
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ":"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v2, :cond_1

    .line 223
    invoke-virtual {v2, v4, v5}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    const-string v2, "\n"

    .line 226
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 230
    :cond_2
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final getDateFromRequest(Lcom/amazonaws/Request;)J
    .locals 2

    .line 326
    invoke-virtual {p0, p1}, Lcom/amazonaws/auth/AbstractAWSSigner;->getTimeOffset(Lcom/amazonaws/Request;)J

    move-result-wide v0

    .line 327
    invoke-virtual {p0, v0, v1}, Lcom/amazonaws/auth/AbstractAWSSigner;->getSignatureDate(J)Ljava/util/Date;

    move-result-object p1

    .line 328
    iget-object v0, p0, Lcom/amazonaws/auth/AWS4Signer;->overriddenDate:Ljava/util/Date;

    if-eqz v0, :cond_0

    move-object p1, v0

    .line 331
    :cond_0
    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    return-wide v0
.end method

.method public final getDateStamp(J)Ljava/lang/String;
    .locals 1

    .line 322
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0, p1, p2}, Ljava/util/Date;-><init>(J)V

    const-string p1, "yyyyMMdd"

    invoke-static {p1, v0}, Lcom/amazonaws/util/DateUtils;->֫(Ljava/lang/String;Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getScope(Lcom/amazonaws/Request;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 346
    check-cast p1, Lcom/amazonaws/DefaultRequest;

    invoke-virtual {p1}, Lcom/amazonaws/DefaultRequest;->ۧ()Ljava/net/URI;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/amazonaws/auth/AWS4Signer;->extractRegionName(Ljava/net/URI;)Ljava/lang/String;

    move-result-object v0

    .line 347
    invoke-virtual {p1}, Lcom/amazonaws/DefaultRequest;->ۧ()Ljava/net/URI;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/amazonaws/auth/AWS4Signer;->extractServiceName(Ljava/net/URI;)Ljava/lang/String;

    move-result-object p1

    .line 348
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "/"

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "/aws4_request"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getSignedHeadersString(Lcom/amazonaws/Request;)Ljava/lang/String;
    .locals 3

    .line 234
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 235
    check-cast p1, Lcom/amazonaws/DefaultRequest;

    invoke-virtual {p1}, Lcom/amazonaws/DefaultRequest;->ܽ()Ljava/util/HashMap;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 236
    sget-object p1, Ljava/lang/String;->CASE_INSENSITIVE_ORDER:Ljava/util/Comparator;

    invoke-static {v0, p1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 238
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 239
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 240
    invoke-virtual {p0, v1}, Lcom/amazonaws/auth/AWS4Signer;->needsSign(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 241
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    if-lez v2, :cond_1

    const-string v2, ";"

    .line 242
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 244
    :cond_1
    invoke-static {v1}, Lcom/amazonaws/util/StringUtils;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 248
    :cond_2
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getStringToSign(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 279
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\n"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 283
    invoke-virtual {p0, p4}, Lcom/amazonaws/auth/AbstractAWSSigner;->hash(Ljava/lang/String;)[B

    move-result-object p1

    invoke-static {p1}, Lcom/amazonaws/util/BinaryUtils;->֫([B)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 284
    sget-object p2, Lcom/amazonaws/auth/AWS4Signer;->log:Lcom/amazonaws/logging/Log;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "AWS4 String to Sign: \'\""

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, "\""

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-interface {p2, p3}, Lcom/amazonaws/logging/Log;->ۧ(Ljava/lang/String;)V

    return-object p1
.end method

.method public final getTimeStamp(J)Ljava/lang/String;
    .locals 1

    .line 318
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0, p1, p2}, Ljava/util/Date;-><init>(J)V

    const-string p1, "yyyyMMdd\'T\'HHmmss\'Z\'"

    invoke-static {p1, v0}, Lcom/amazonaws/util/DateUtils;->֫(Ljava/lang/String;Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public needsSign(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "date"

    .line 500
    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "Content-MD5"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "host"

    .line 501
    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "x-amz"

    .line 502
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "X-Amz"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public overrideDate(Ljava/util/Date;)V
    .locals 0

    .line 207
    iput-object p1, p0, Lcom/amazonaws/auth/AWS4Signer;->overriddenDate:Ljava/util/Date;

    return-void
.end method

.method public presignRequest(Lcom/amazonaws/Request;Lcom/amazonaws/auth/AWSCredentials;Ljava/util/Date;)V
    .locals 12

    const-wide/32 v0, 0x93a80

    if-eqz p3, :cond_0

    .line 429
    invoke-virtual {p3}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    .line 430
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long/2addr v2, v4

    const-wide/16 v4, 0x3e8

    div-long/2addr v2, v4

    goto :goto_0

    :cond_0
    move-wide v2, v0

    :goto_0
    cmp-long v4, v2, v0

    if-gtz v4, :cond_2

    .line 441
    invoke-virtual {p0, p1}, Lcom/amazonaws/auth/AWS4Signer;->addHostHeader(Lcom/amazonaws/Request;)V

    .line 443
    invoke-virtual {p0, p2}, Lcom/amazonaws/auth/AbstractAWSSigner;->sanitizeCredentials(Lcom/amazonaws/auth/AWSCredentials;)Lcom/amazonaws/auth/AWSCredentials;

    move-result-object v11

    .line 445
    instance-of p2, v11, Lcom/amazonaws/auth/AWSSessionCredentials;

    if-eqz p2, :cond_1

    .line 449
    move-object p2, v11

    check-cast p2, Lcom/amazonaws/auth/AWSSessionCredentials;

    .line 451
    invoke-interface {p2}, Lcom/amazonaws/auth/AWSSessionCredentials;->ۧ()Ljava/lang/String;

    move-result-object p2

    .line 449
    move-object p3, p1

    check-cast p3, Lcom/amazonaws/DefaultRequest;

    const-string v0, "X-Amz-Security-Token"

    invoke-virtual {p3, v0, p2}, Lcom/amazonaws/DefaultRequest;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    .line 454
    :cond_1
    invoke-virtual {p0, p1}, Lcom/amazonaws/auth/AWS4Signer;->getDateFromRequest(Lcom/amazonaws/Request;)J

    move-result-wide p2

    .line 455
    invoke-virtual {p0, p2, p3}, Lcom/amazonaws/auth/AWS4Signer;->getDateStamp(J)Ljava/lang/String;

    move-result-object v7

    .line 457
    invoke-virtual {p0, p1, v7}, Lcom/amazonaws/auth/AWS4Signer;->getScope(Lcom/amazonaws/Request;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 459
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v11}, Lcom/amazonaws/auth/AWSCredentials;->֫()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "/"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 463
    invoke-virtual {p0, p2, p3}, Lcom/amazonaws/auth/AWS4Signer;->getTimeStamp(J)Ljava/lang/String;

    move-result-object v8

    .line 464
    check-cast p1, Lcom/amazonaws/DefaultRequest;

    const-string p2, "X-Amz-Algorithm"

    const-string p3, "AWS4-HMAC-SHA256"

    invoke-virtual {p1, p2, p3}, Lcom/amazonaws/DefaultRequest;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    const-string p2, "X-Amz-Date"

    .line 465
    invoke-virtual {p1, p2, v8}, Lcom/amazonaws/DefaultRequest;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    const-string p2, "X-Amz-SignedHeaders"

    .line 467
    invoke-virtual {p0, p1}, Lcom/amazonaws/auth/AWS4Signer;->getSignedHeadersString(Lcom/amazonaws/Request;)Ljava/lang/String;

    move-result-object p3

    .line 466
    invoke-virtual {p1, p2, p3}, Lcom/amazonaws/DefaultRequest;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    const-string p2, "X-Amz-Expires"

    .line 469
    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p3

    .line 468
    invoke-virtual {p1, p2, p3}, Lcom/amazonaws/DefaultRequest;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    const-string p2, "X-Amz-Credential"

    .line 470
    invoke-virtual {p1, p2, v0}, Lcom/amazonaws/DefaultRequest;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    .line 472
    invoke-virtual {p0, p1}, Lcom/amazonaws/auth/AWS4Signer;->calculateContentHashPresign(Lcom/amazonaws/Request;)Ljava/lang/String;

    move-result-object v10

    const-string v9, "AWS4-HMAC-SHA256"

    move-object v5, p0

    move-object v6, p1

    .line 474
    invoke-virtual/range {v5 .. v11}, Lcom/amazonaws/auth/AWS4Signer;->computeSignature(Lcom/amazonaws/Request;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/amazonaws/auth/AWSCredentials;)Lcom/amazonaws/auth/AWS4Signer$HeaderSigningResult;

    move-result-object p2

    .line 478
    invoke-virtual {p2}, Lcom/amazonaws/auth/AWS4Signer$HeaderSigningResult;->ᩳ()[B

    move-result-object p2

    invoke-static {p2}, Lcom/amazonaws/util/BinaryUtils;->֫([B)Ljava/lang/String;

    move-result-object p2

    const-string p3, "X-Amz-Signature"

    .line 477
    invoke-virtual {p1, p3, p2}, Lcom/amazonaws/DefaultRequest;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 434
    :cond_2
    new-instance p1, Lcom/amazonaws/AmazonClientException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Requests that are pre-signed by SigV4 algorithm are valid for at most 7 days. The expiration date set on the current request ["

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 437
    invoke-virtual {p3}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/amazonaws/auth/AWS4Signer;->getTimeStamp(J)Ljava/lang/String;

    move-result-object p3

    const-string v0, "] has exceeded this limit."

    .line 0
    invoke-static {p2, p3, v0}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 59
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 437
    throw p1
.end method

.method public processRequestPayload(Lcom/amazonaws/Request;Lcom/amazonaws/auth/AWS4Signer$HeaderSigningResult;)V
    .locals 0

    return-void
.end method

.method public setRegionName(Ljava/lang/String;)V
    .locals 0

    .line 175
    iput-object p1, p0, Lcom/amazonaws/auth/AWS4Signer;->regionName:Ljava/lang/String;

    return-void
.end method

.method public setServiceName(Ljava/lang/String;)V
    .locals 0

    .line 161
    iput-object p1, p0, Lcom/amazonaws/auth/AWS4Signer;->serviceName:Ljava/lang/String;

    return-void
.end method

.method public sign(Lcom/amazonaws/Request;Lcom/amazonaws/auth/AWSCredentials;)V
    .locals 7

    .line 101
    invoke-virtual {p0, p2}, Lcom/amazonaws/auth/AbstractAWSSigner;->sanitizeCredentials(Lcom/amazonaws/auth/AWSCredentials;)Lcom/amazonaws/auth/AWSCredentials;

    move-result-object v6

    .line 102
    instance-of p2, v6, Lcom/amazonaws/auth/AWSSessionCredentials;

    if-eqz p2, :cond_0

    .line 103
    move-object p2, v6

    check-cast p2, Lcom/amazonaws/auth/AWSSessionCredentials;

    invoke-virtual {p0, p1, p2}, Lcom/amazonaws/auth/AWS4Signer;->addSessionCredentials(Lcom/amazonaws/Request;Lcom/amazonaws/auth/AWSSessionCredentials;)V

    .line 106
    :cond_0
    invoke-virtual {p0, p1}, Lcom/amazonaws/auth/AWS4Signer;->addHostHeader(Lcom/amazonaws/Request;)V

    .line 108
    invoke-virtual {p0, p1}, Lcom/amazonaws/auth/AWS4Signer;->getDateFromRequest(Lcom/amazonaws/Request;)J

    move-result-wide v0

    .line 110
    invoke-virtual {p0, v0, v1}, Lcom/amazonaws/auth/AWS4Signer;->getDateStamp(J)Ljava/lang/String;

    move-result-object v2

    .line 111
    invoke-virtual {p0, p1, v2}, Lcom/amazonaws/auth/AWS4Signer;->getScope(Lcom/amazonaws/Request;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 113
    invoke-virtual {p0, p1}, Lcom/amazonaws/auth/AWS4Signer;->calculateContentHash(Lcom/amazonaws/Request;)Ljava/lang/String;

    move-result-object v5

    .line 115
    invoke-virtual {p0, v0, v1}, Lcom/amazonaws/auth/AWS4Signer;->getTimeStamp(J)Ljava/lang/String;

    move-result-object v3

    .line 116
    check-cast p1, Lcom/amazonaws/DefaultRequest;

    const-string v0, "X-Amz-Date"

    invoke-virtual {p1, v0, v3}, Lcom/amazonaws/DefaultRequest;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    invoke-virtual {p1}, Lcom/amazonaws/DefaultRequest;->ܽ()Ljava/util/HashMap;

    move-result-object v0

    const-string v1, "x-amz-content-sha256"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 119
    invoke-virtual {p1}, Lcom/amazonaws/DefaultRequest;->ܽ()Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v4, "required"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 120
    invoke-virtual {p1, v1, v5}, Lcom/amazonaws/DefaultRequest;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v6}, Lcom/amazonaws/auth/AWSCredentials;->֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v4, "AWS4-HMAC-SHA256"

    move-object v0, p0

    move-object v1, p1

    .line 125
    invoke-virtual/range {v0 .. v6}, Lcom/amazonaws/auth/AWS4Signer;->computeSignature(Lcom/amazonaws/Request;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/amazonaws/auth/AWSCredentials;)Lcom/amazonaws/auth/AWS4Signer$HeaderSigningResult;

    move-result-object v0

    const-string v1, "Credential="

    .line 0
    invoke-static {v1, p2}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 135
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "SignedHeaders="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 136
    invoke-virtual {p0, p1}, Lcom/amazonaws/auth/AWS4Signer;->getSignedHeadersString(Lcom/amazonaws/Request;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 137
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Signature="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 138
    invoke-virtual {v0}, Lcom/amazonaws/auth/AWS4Signer$HeaderSigningResult;->ᩳ()[B

    move-result-object v3

    invoke-static {v3}, Lcom/amazonaws/util/BinaryUtils;->֫([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "AWS4-HMAC-SHA256 "

    const-string v4, ", "

    .line 0
    invoke-static {v3, p2, v4, v1, v4}, Ll/ۗ᩵֫;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    .line 140
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v1, "Authorization"

    .line 145
    invoke-virtual {p1, v1, p2}, Lcom/amazonaws/DefaultRequest;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 147
    invoke-virtual {p0, p1, v0}, Lcom/amazonaws/auth/AWS4Signer;->processRequestPayload(Lcom/amazonaws/Request;Lcom/amazonaws/auth/AWS4Signer$HeaderSigningResult;)V

    return-void
.end method
