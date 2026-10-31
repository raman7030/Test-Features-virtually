.class public Lcom/amazonaws/services/s3/AmazonS3Client;
.super Lcom/amazonaws/AmazonWebServiceClient;
.source "AmazonS3Client.java"

# interfaces
.implements Lcom/amazonaws/services/s3/AmazonS3;


# static fields
.field public static final ᩴ:Ljava/util/Map;

.field public static ᩵:Lcom/amazonaws/logging/Log;


# instance fields
.field public ۖ:I

.field public final ۘ:Lcom/amazonaws/services/s3/internal/S3XmlResponseHandler;

.field public final ۜ:Lcom/amazonaws/auth/AWSCredentialsProvider;

.field public final ۡ:Lcom/amazonaws/services/s3/internal/CompleteMultipartUploadRetryCondition;

.field public volatile ۢ:Ljava/lang/String;

.field public final ܺ:Lcom/amazonaws/services/s3/internal/S3ErrorResponseHandler;

.field public ᩷:Lcom/amazonaws/services/s3/S3ClientOptions;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 171
    const-class v0, Lcom/amazonaws/services/s3/AmazonS3Client;

    invoke-static {v0}, Lcom/amazonaws/logging/LogFactory;->֫(Ljava/lang/Class;)Lcom/amazonaws/logging/Log;

    move-result-object v0

    sput-object v0, Lcom/amazonaws/services/s3/AmazonS3Client;->᩵:Lcom/amazonaws/logging/Log;

    .line 175
    invoke-static {}, Lcom/amazonaws/services/s3/metrics/S3ServiceMetric;->֫()[Lcom/amazonaws/services/s3/metrics/S3ServiceMetric;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/amazonaws/metrics/AwsSdkMetrics;->֫(Ljava/util/Collection;)Z

    const-string v0, "AWSS3V4SignerType"

    .line 178
    const-class v1, Lcom/amazonaws/services/s3/internal/AWSS3V4Signer;

    invoke-static {v1, v0}, Lcom/amazonaws/auth/SignerFactory;->֫(Ljava/lang/Class;Ljava/lang/String;)V

    .line 189
    new-instance v0, Lcom/amazonaws/services/s3/model/transform/BucketConfigurationXmlFactory;

    invoke-direct {v0}, Lcom/amazonaws/services/s3/model/transform/BucketConfigurationXmlFactory;-><init>()V

    .line 195
    new-instance v0, Lcom/amazonaws/services/s3/model/transform/RequestPaymentConfigurationXmlFactory;

    invoke-direct {v0}, Lcom/amazonaws/services/s3/model/transform/RequestPaymentConfigurationXmlFactory;-><init>()V

    .line 218
    new-instance v0, Lcom/amazonaws/services/s3/AmazonS3Client$1;

    const v1, 0x3f8ccccd    # 1.1f

    const/4 v2, 0x1

    const/16 v3, 0x12c

    .line 219
    invoke-direct {v0, v3, v1, v2}, Ljava/util/LinkedHashMap;-><init>(IFZ)V

    .line 218
    invoke-static {v0}, Ll/᩶۬ᩴ;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lcom/amazonaws/services/s3/AmazonS3Client;->ᩴ:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>()V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 276
    new-instance v0, Lcom/amazonaws/auth/DefaultAWSCredentialsProviderChain;

    invoke-direct {v0}, Lcom/amazonaws/auth/DefaultAWSCredentialsProviderChain;-><init>()V

    .line 333
    new-instance v1, Lcom/amazonaws/ClientConfiguration;

    invoke-direct {v1}, Lcom/amazonaws/ClientConfiguration;-><init>()V

    invoke-direct {p0, v0, v1}, Lcom/amazonaws/services/s3/AmazonS3Client;-><init>(Lcom/amazonaws/auth/AWSCredentialsProvider;Lcom/amazonaws/ClientConfiguration;)V

    return-void
.end method

.method public constructor <init>(Lcom/amazonaws/auth/AWSCredentialsProvider;Lcom/amazonaws/ClientConfiguration;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 355
    new-instance v0, Lcom/amazonaws/http/UrlHttpClient;

    invoke-direct {v0, p2}, Lcom/amazonaws/http/UrlHttpClient;-><init>(Lcom/amazonaws/ClientConfiguration;)V

    .line 401
    invoke-direct {p0, p2, v0}, Lcom/amazonaws/AmazonWebServiceClient;-><init>(Lcom/amazonaws/ClientConfiguration;Lcom/amazonaws/http/UrlHttpClient;)V

    .line 182
    new-instance p2, Lcom/amazonaws/services/s3/internal/S3ErrorResponseHandler;

    invoke-direct {p2}, Lcom/amazonaws/services/s3/internal/S3ErrorResponseHandler;-><init>()V

    iput-object p2, p0, Lcom/amazonaws/services/s3/AmazonS3Client;->ܺ:Lcom/amazonaws/services/s3/internal/S3ErrorResponseHandler;

    .line 185
    new-instance p2, Lcom/amazonaws/services/s3/internal/S3XmlResponseHandler;

    const/4 v0, 0x0

    invoke-direct {p2, v0}, Lcom/amazonaws/services/s3/internal/S3XmlResponseHandler;-><init>(Lcom/amazonaws/transform/Unmarshaller;)V

    iput-object p2, p0, Lcom/amazonaws/services/s3/AmazonS3Client;->ۘ:Lcom/amazonaws/services/s3/internal/S3XmlResponseHandler;

    .line 198
    new-instance p2, Lcom/amazonaws/services/s3/S3ClientOptions;

    invoke-direct {p2}, Lcom/amazonaws/services/s3/S3ClientOptions;-><init>()V

    iput-object p2, p0, Lcom/amazonaws/services/s3/AmazonS3Client;->᩷:Lcom/amazonaws/services/s3/S3ClientOptions;

    const/16 p2, 0x400

    .line 214
    iput p2, p0, Lcom/amazonaws/services/s3/AmazonS3Client;->ۖ:I

    .line 232
    new-instance p2, Lcom/amazonaws/services/s3/internal/CompleteMultipartUploadRetryCondition;

    invoke-direct {p2}, Lcom/amazonaws/services/s3/internal/CompleteMultipartUploadRetryCondition;-><init>()V

    iput-object p2, p0, Lcom/amazonaws/services/s3/AmazonS3Client;->ۡ:Lcom/amazonaws/services/s3/internal/CompleteMultipartUploadRetryCondition;

    .line 402
    iput-object p1, p0, Lcom/amazonaws/services/s3/AmazonS3Client;->ۜ:Lcom/amazonaws/auth/AWSCredentialsProvider;

    const-string p1, "s3.amazonaws.com"

    .line 599
    invoke-virtual {p0, p1}, Lcom/amazonaws/services/s3/AmazonS3Client;->֫(Ljava/lang/String;)V

    .line 602
    new-instance p1, Lcom/amazonaws/handlers/HandlerChainFactory;

    invoke-direct {p1}, Lcom/amazonaws/handlers/HandlerChainFactory;-><init>()V

    .line 603
    iget-object p2, p0, Lcom/amazonaws/AmazonWebServiceClient;->ᩳ:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1}, Lcom/amazonaws/handlers/HandlerChainFactory;->ۧ()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->addAll(Ljava/util/Collection;)Z

    .line 605
    invoke-virtual {p1}, Lcom/amazonaws/handlers/HandlerChainFactory;->֫()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method private ֫(Lcom/amazonaws/DefaultRequest;Lcom/amazonaws/services/s3/internal/AbstractS3ResponseHandler;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    .locals 6

    const-string v0, "Content-Type"

    const-string v1, "The bucket is in this region: "

    .line 4795
    invoke-virtual {p1}, Lcom/amazonaws/DefaultRequest;->ܿ()Lcom/amazonaws/AmazonWebServiceRequest;

    move-result-object v2

    .line 4788
    invoke-virtual {p0, v2}, Lcom/amazonaws/AmazonWebServiceClient;->֫(Lcom/amazonaws/AmazonWebServiceRequest;)V

    const-string v2, "com.amazonaws.sdk.enableRuntimeProfiling"

    .line 594
    invoke-static {v2}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 4789
    :goto_0
    new-instance v4, Lcom/amazonaws/services/s3/internal/S3ExecutionContext;

    iget-object v5, p0, Lcom/amazonaws/AmazonWebServiceClient;->ᩳ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 40
    invoke-direct {v4, v5, v2}, Lcom/amazonaws/http/ExecutionContext;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;Z)V

    .line 4797
    invoke-virtual {v4}, Lcom/amazonaws/http/ExecutionContext;->֫()Lcom/amazonaws/util/AWSRequestMetrics;

    move-result-object v2

    .line 4799
    invoke-virtual {p1, v2}, Lcom/amazonaws/DefaultRequest;->֫(Lcom/amazonaws/util/AWSRequestMetrics;)V

    .line 4806
    sget-object v5, Lcom/amazonaws/util/AWSRequestMetrics$Field;->ۗ:Lcom/amazonaws/util/AWSRequestMetrics$Field;

    invoke-virtual {v2, v5}, Lcom/amazonaws/util/AWSRequestMetrics;->ܽ(Lcom/amazonaws/util/AWSRequestMetrics$Field;)V

    .line 4816
    :try_start_0
    invoke-virtual {p1}, Lcom/amazonaws/DefaultRequest;->ܽ()Ljava/util/HashMap;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    const-string v5, "application/octet-stream"

    .line 4817
    invoke-virtual {p1, v0, v5}, Lcom/amazonaws/DefaultRequest;->֫(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    if-eqz p3, :cond_3

    .line 4173
    invoke-virtual {p1}, Lcom/amazonaws/DefaultRequest;->ۧ()Ljava/net/URI;

    move-result-object v0

    .line 4193
    invoke-virtual {v0}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object v0

    const-string v5, "s3.amazonaws.com"

    invoke-virtual {v0, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 4187
    iget-object v0, p0, Lcom/amazonaws/services/s3/AmazonS3Client;->ۢ:Ljava/lang/String;

    if-nez v0, :cond_2

    const/4 v3, 0x1

    :cond_2
    if-eqz v3, :cond_3

    .line 4826
    invoke-direct {p0, p3}, Lcom/amazonaws/services/s3/AmazonS3Client;->ۧ(Ljava/lang/String;)V

    .line 4829
    :cond_3
    iget-object v0, p0, Lcom/amazonaws/services/s3/AmazonS3Client;->ۜ:Lcom/amazonaws/auth/AWSCredentialsProvider;

    invoke-interface {v0}, Lcom/amazonaws/auth/AWSCredentialsProvider;->֫()Lcom/amazonaws/auth/AWSCredentials;

    move-result-object v0

    .line 4833
    invoke-virtual {p0, p1, p3, p4}, Lcom/amazonaws/services/s3/AmazonS3Client;->֫(Lcom/amazonaws/DefaultRequest;Ljava/lang/String;Ljava/lang/String;)Lcom/amazonaws/auth/Signer;

    move-result-object p4

    invoke-virtual {v4, p4}, Lcom/amazonaws/services/s3/internal/S3ExecutionContext;->֫(Lcom/amazonaws/auth/Signer;)V

    .line 4834
    invoke-virtual {v4, v0}, Lcom/amazonaws/http/ExecutionContext;->֫(Lcom/amazonaws/auth/AWSCredentials;)V

    .line 4835
    iget-object p4, p0, Lcom/amazonaws/AmazonWebServiceClient;->֫:Lcom/amazonaws/http/AmazonHttpClient;

    iget-object v0, p0, Lcom/amazonaws/services/s3/AmazonS3Client;->ܺ:Lcom/amazonaws/services/s3/internal/S3ErrorResponseHandler;

    invoke-virtual {p4, p1, p2, v0, v4}, Lcom/amazonaws/http/AmazonHttpClient;->֫(Lcom/amazonaws/DefaultRequest;Lcom/amazonaws/http/HttpResponseHandler;Lcom/amazonaws/http/HttpResponseHandler;Lcom/amazonaws/services/s3/internal/S3ExecutionContext;)Lcom/amazonaws/Response;

    move-result-object p2

    .line 4837
    invoke-virtual {p2}, Lcom/amazonaws/Response;->֫()Ljava/lang/Object;

    move-result-object p2
    :try_end_0
    .catch Lcom/amazonaws/services/s3/model/AmazonS3Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4857
    invoke-virtual {p0, v2, p1}, Lcom/amazonaws/AmazonWebServiceClient;->֫(Lcom/amazonaws/util/AWSRequestMetrics;Lcom/amazonaws/DefaultRequest;)V

    return-object p2

    :catchall_0
    move-exception p2

    goto :goto_1

    :catch_0
    move-exception p2

    .line 4847
    :try_start_1
    invoke-virtual {p2}, Lcom/amazonaws/AmazonServiceException;->ᩳ()I

    move-result p4

    const/16 v0, 0x12d

    if-ne p4, v0, :cond_4

    .line 4848
    invoke-virtual {p2}, Lcom/amazonaws/services/s3/model/AmazonS3Exception;->ܿ()Ljava/util/Map;

    move-result-object p4

    if-eqz p4, :cond_4

    .line 4849
    invoke-virtual {p2}, Lcom/amazonaws/services/s3/model/AmazonS3Exception;->ܿ()Ljava/util/Map;

    move-result-object p4

    const-string v0, "x-amz-bucket-region"

    check-cast p4, Ljava/util/HashMap;

    invoke-virtual {p4, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/String;

    .line 4850
    sget-object v0, Lcom/amazonaws/services/s3/AmazonS3Client;->ᩴ:Ljava/util/Map;

    invoke-interface {v0, p3, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4851
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, ". Please use this region to retry the request"

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/amazonaws/AmazonServiceException;->ۧ(Ljava/lang/String;)V

    .line 4855
    :cond_4
    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 4857
    :goto_1
    invoke-virtual {p0, v2, p1}, Lcom/amazonaws/AmazonWebServiceClient;->֫(Lcom/amazonaws/util/AWSRequestMetrics;Lcom/amazonaws/DefaultRequest;)V

    .line 4858
    throw p2
.end method

.method public static ֫(Lcom/amazonaws/services/s3/model/ObjectTagging;)Ljava/lang/String;
    .locals 3

    if-eqz p0, :cond_2

    .line 5408
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 5410
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/ObjectTagging;->֫()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    .line 5411
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 5412
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/amazonaws/services/s3/model/Tag;

    .line 5413
    invoke-virtual {v1}, Lcom/amazonaws/services/s3/model/Tag;->֫()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/amazonaws/services/s3/internal/S3HttpUtils;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x3d

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 5414
    invoke-virtual {v1}, Lcom/amazonaws/services/s3/model/Tag;->ۧ()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/amazonaws/services/s3/internal/S3HttpUtils;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 5415
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "&"

    .line 5416
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 5420
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ֫(Lcom/amazonaws/DefaultRequest;Lcom/amazonaws/services/s3/model/ObjectMetadata;)V
    .locals 4

    .line 4299
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/ObjectMetadata;->ۢ()Ljava/util/Map;

    move-result-object v0

    const-string v1, "x-amz-server-side-encryption-aws-kms-key-id"

    .line 4301
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_1

    sget-object v1, Lcom/amazonaws/services/s3/model/ObjectMetadata;->۬:Ljava/lang/String;

    const-string v2, "x-amz-server-side-encryption"

    .line 4303
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 4302
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 4304
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "If you specify a KMS key id for server side encryption, you must also set the SSEAlgorithm to ObjectMetadata.KMS_SERVER_SIDE_ENCRYPTION"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 4309
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 4310
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v2, v1}, Lcom/amazonaws/DefaultRequest;->֫(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 4314
    :cond_2
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/ObjectMetadata;->ۜ()Ljava/util/Date;

    move-result-object v0

    if-eqz v0, :cond_3

    const-string v1, "EEE, dd MMM yyyy HH:mm:ss z"

    .line 159
    invoke-static {v1, v0}, Lcom/amazonaws/util/DateUtils;->֫(Ljava/lang/String;Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Expires"

    .line 4316
    invoke-virtual {p0, v1, v0}, Lcom/amazonaws/DefaultRequest;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 4319
    :cond_3
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/ObjectMetadata;->᩵()Ljava/util/Map;

    move-result-object p1

    if-eqz p1, :cond_7

    .line 4321
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_4
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 4322
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 4323
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v1, :cond_5

    .line 4325
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    :cond_5
    if-eqz v0, :cond_6

    .line 4328
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    :cond_6
    const-string v2, "x-amz-tagging"

    .line 4330
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    .line 4331
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "x-amz-meta-"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1, v0}, Lcom/amazonaws/DefaultRequest;->֫(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_7
    return-void
.end method

.method public static ֫(Lcom/amazonaws/DefaultRequest;Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 3

    if-eqz p2, :cond_2

    .line 4634
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 4635
    sget v0, Lcom/amazonaws/services/s3/internal/ServiceUtils;->֫:I

    .line 239
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    const-string v0, ""

    const/4 v1, 0x1

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v1, :cond_0

    const-string v1, ", "

    .line 0
    invoke-static {v0, v1}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_0
    invoke-static {v0, v2}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    goto :goto_0

    .line 4635
    :cond_1
    invoke-virtual {p0, p1, v0}, Lcom/amazonaws/DefaultRequest;->֫(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public static ֫(Lcom/amazonaws/event/ProgressListenerCallbackExecutor;I)V
    .locals 3

    if-nez p0, :cond_0

    return-void

    .line 3941
    :cond_0
    new-instance v0, Lcom/amazonaws/event/ProgressEvent;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2}, Lcom/amazonaws/event/ProgressEvent;-><init>(J)V

    .line 3942
    invoke-virtual {v0, p1}, Lcom/amazonaws/event/ProgressEvent;->֫(I)V

    .line 3943
    invoke-virtual {p0, v0}, Lcom/amazonaws/event/ProgressListenerCallbackExecutor;->֫(Lcom/amazonaws/event/ProgressEvent;)V

    return-void
.end method

.method private ۧ(Ljava/lang/String;)V
    .locals 9

    .line 5573
    sget-object v0, Lcom/amazonaws/services/s3/AmazonS3Client;->ᩴ:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 5574
    sget-object v2, Lcom/amazonaws/services/s3/AmazonS3Client;->᩵:Lcom/amazonaws/logging/Log;

    if-nez v1, :cond_3

    .line 5575
    invoke-interface {v2}, Lcom/amazonaws/logging/Log;->֫()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 5576
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Bucket region cache doesn\'t have an entry for "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ". Trying to get bucket region from Amazon S3."

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1}, Lcom/amazonaws/logging/Log;->ۧ(Ljava/lang/String;)V

    :cond_0
    const/4 v1, 0x0

    .line 5601
    :try_start_0
    new-instance v6, Lcom/amazonaws/services/s3/model/HeadBucketRequest;

    .line 36
    invoke-direct {v6}, Lcom/amazonaws/AmazonWebServiceRequest;-><init>()V

    .line 5601
    sget-object v7, Lcom/amazonaws/http/HttpMethodName;->ۙ:Lcom/amazonaws/http/HttpMethodName;

    new-instance v8, Ljava/net/URI;

    const-string v3, "https://s3-us-west-1.amazonaws.com"

    invoke-direct {v8, v3}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    const/4 v5, 0x0

    move-object v3, p0

    move-object v4, p1

    invoke-virtual/range {v3 .. v8}, Lcom/amazonaws/services/s3/AmazonS3Client;->֫(Ljava/lang/String;Ljava/lang/String;Lcom/amazonaws/AmazonWebServiceRequest;Lcom/amazonaws/http/HttpMethodName;Ljava/net/URI;)Lcom/amazonaws/DefaultRequest;

    move-result-object v3

    .line 5604
    new-instance v4, Lcom/amazonaws/services/s3/model/transform/HeadBucketResultHandler;

    invoke-direct {v4}, Lcom/amazonaws/services/s3/model/transform/HeadBucketResultHandler;-><init>()V

    invoke-direct {p0, v3, v4, p1, v1}, Lcom/amazonaws/services/s3/AmazonS3Client;->֫(Lcom/amazonaws/DefaultRequest;Lcom/amazonaws/services/s3/internal/AbstractS3ResponseHandler;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/amazonaws/services/s3/model/HeadBucketResult;

    .line 5606
    invoke-virtual {v3}, Lcom/amazonaws/services/s3/model/HeadBucketResult;->֫()Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catch Lcom/amazonaws/services/s3/model/AmazonS3Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_1

    :catch_0
    move-exception v3

    goto :goto_0

    :catch_1
    const-string v3, "Error while creating URI"

    .line 5613
    invoke-interface {v2, v3}, Lcom/amazonaws/logging/Log;->ᩳ(Ljava/lang/String;)V

    goto :goto_1

    .line 5608
    :goto_0
    invoke-virtual {v3}, Lcom/amazonaws/services/s3/model/AmazonS3Exception;->ܿ()Ljava/util/Map;

    move-result-object v4

    if-eqz v4, :cond_1

    .line 5609
    invoke-virtual {v3}, Lcom/amazonaws/services/s3/model/AmazonS3Exception;->ܿ()Ljava/util/Map;

    move-result-object v1

    const-string v3, "x-amz-bucket-region"

    check-cast v1, Ljava/util/HashMap;

    invoke-virtual {v1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    :cond_1
    :goto_1
    if-nez v1, :cond_2

    .line 5616
    invoke-interface {v2}, Lcom/amazonaws/logging/Log;->֫()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 5617
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Not able to derive region of the "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " from the HEAD Bucket requests."

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Lcom/amazonaws/logging/Log;->ۧ(Ljava/lang/String;)V

    :cond_2
    if-eqz v1, :cond_3

    .line 5581
    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5584
    :cond_3
    invoke-interface {v2}, Lcom/amazonaws/logging/Log;->֫()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 5585
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "Region for "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " is "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v2, p1}, Lcom/amazonaws/logging/Log;->ۧ(Ljava/lang/String;)V

    :cond_4
    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;Ljava/lang/String;Lcom/amazonaws/AmazonWebServiceRequest;Lcom/amazonaws/http/HttpMethodName;Ljava/net/URI;)Lcom/amazonaws/DefaultRequest;
    .locals 1

    .line 4752
    new-instance v0, Lcom/amazonaws/DefaultRequest;

    invoke-direct {v0, p3}, Lcom/amazonaws/DefaultRequest;-><init>(Lcom/amazonaws/AmazonWebServiceRequest;)V

    .line 4757
    iget-object p3, p0, Lcom/amazonaws/services/s3/AmazonS3Client;->᩷:Lcom/amazonaws/services/s3/S3ClientOptions;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4774
    invoke-virtual {v0, p4}, Lcom/amazonaws/DefaultRequest;->֫(Lcom/amazonaws/http/HttpMethodName;)V

    .line 4775
    invoke-virtual {p0, v0, p1, p2, p5}, Lcom/amazonaws/services/s3/AmazonS3Client;->֫(Lcom/amazonaws/DefaultRequest;Ljava/lang/String;Ljava/lang/String;Ljava/net/URI;)V

    return-object v0
.end method

.method public final ֫(Lcom/amazonaws/DefaultRequest;Ljava/lang/String;Ljava/lang/String;)Lcom/amazonaws/auth/Signer;
    .locals 6

    .line 4087
    iget-object v0, p0, Lcom/amazonaws/services/s3/AmazonS3Client;->᩷:Lcom/amazonaws/services/s3/S3ClientOptions;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4089
    invoke-virtual {p1}, Lcom/amazonaws/DefaultRequest;->ۧ()Ljava/net/URI;

    move-result-object v0

    .line 4093
    invoke-virtual {p0, v0}, Lcom/amazonaws/AmazonWebServiceClient;->֫(Ljava/net/URI;)Lcom/amazonaws/auth/Signer;

    move-result-object v0

    .line 4158
    iget-object v1, p0, Lcom/amazonaws/AmazonWebServiceClient;->ۧ:Lcom/amazonaws/ClientConfiguration;

    .line 4159
    invoke-virtual {v1}, Lcom/amazonaws/ClientConfiguration;->ᩳ()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    goto/16 :goto_2

    .line 4096
    :cond_0
    instance-of v1, v0, Lcom/amazonaws/services/s3/internal/AWSS3V4Signer;

    if-eqz v1, :cond_4

    .line 4173
    invoke-virtual {p1}, Lcom/amazonaws/DefaultRequest;->ۧ()Ljava/net/URI;

    move-result-object v1

    .line 4193
    invoke-virtual {v1}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object v1

    const-string v2, "s3.amazonaws.com"

    invoke-virtual {v1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 4187
    iget-object v1, p0, Lcom/amazonaws/services/s3/AmazonS3Client;->ۢ:Ljava/lang/String;

    if-nez v1, :cond_4

    .line 4098
    iget-object v1, p0, Lcom/amazonaws/services/s3/AmazonS3Client;->ۢ:Ljava/lang/String;

    if-nez v1, :cond_1

    sget-object v1, Lcom/amazonaws/services/s3/AmazonS3Client;->ᩴ:Ljava/util/Map;

    .line 4099
    invoke-interface {v1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/amazonaws/services/s3/AmazonS3Client;->ۢ:Ljava/lang/String;

    :goto_0
    if-eqz v1, :cond_4

    .line 4107
    invoke-static {v1}, Lcom/amazonaws/regions/RegionUtils;->֫(Ljava/lang/String;)Lcom/amazonaws/regions/Region;

    move-result-object v2

    invoke-virtual {v2}, Lcom/amazonaws/regions/Region;->ᩳ()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/amazonaws/AmazonWebServiceClient;->ۧ:Lcom/amazonaws/ClientConfiguration;

    .line 48
    invoke-virtual {v3}, Lcom/amazonaws/ClientConfiguration;->ۧ()Lcom/amazonaws/Protocol;

    move-result-object v3

    if-eqz v2, :cond_3

    const-string v4, "://"

    .line 69
    invoke-virtual {v2, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_2

    .line 70
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Lcom/amazonaws/Protocol;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 74
    :cond_2
    :try_start_0
    new-instance v3, Ljava/net/URI;

    invoke-direct {v3, v2}, Ljava/net/URI;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4104
    invoke-virtual {p0, p1, p2, p3, v3}, Lcom/amazonaws/services/s3/AmazonS3Client;->֫(Lcom/amazonaws/DefaultRequest;Ljava/lang/String;Ljava/lang/String;Ljava/net/URI;)V

    .line 4110
    check-cast v0, Lcom/amazonaws/services/s3/internal/AWSS3V4Signer;

    .line 4150
    invoke-virtual {p0}, Lcom/amazonaws/AmazonWebServiceClient;->֫()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/amazonaws/auth/AWS4Signer;->setServiceName(Ljava/lang/String;)V

    .line 4151
    invoke-virtual {v0, v1}, Lcom/amazonaws/auth/AWS4Signer;->setRegionName(Ljava/lang/String;)V

    return-object v0

    :catch_0
    move-exception p1

    .line 76
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    .line 61
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "endpoint cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 4119
    :cond_4
    iget-object v1, p0, Lcom/amazonaws/services/s3/AmazonS3Client;->ۢ:Ljava/lang/String;

    if-nez v1, :cond_5

    sget-object v1, Lcom/amazonaws/services/s3/AmazonS3Client;->ᩴ:Ljava/util/Map;

    .line 4120
    invoke-interface {v1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    goto :goto_1

    :cond_5
    iget-object v1, p0, Lcom/amazonaws/services/s3/AmazonS3Client;->ۢ:Ljava/lang/String;

    :goto_1
    if-eqz v1, :cond_6

    .line 4123
    new-instance p1, Lcom/amazonaws/services/s3/internal/AWSS3V4Signer;

    invoke-direct {p1}, Lcom/amazonaws/services/s3/internal/AWSS3V4Signer;-><init>()V

    .line 4150
    invoke-virtual {p0}, Lcom/amazonaws/AmazonWebServiceClient;->֫()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/amazonaws/auth/AWS4Signer;->setServiceName(Ljava/lang/String;)V

    .line 4151
    invoke-virtual {p1, v1}, Lcom/amazonaws/auth/AWS4Signer;->setRegionName(Ljava/lang/String;)V

    return-object p1

    .line 4129
    :cond_6
    :goto_2
    instance-of v1, v0, Lcom/amazonaws/services/s3/internal/S3Signer;

    if-eqz v1, :cond_9

    .line 4200
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, ""

    if-eqz p2, :cond_7

    invoke-virtual {p2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    goto :goto_3

    :cond_7
    move-object p2, v2

    :goto_3
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p3, :cond_8

    goto :goto_4

    :cond_8
    move-object p3, v2

    :goto_4
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 4203
    new-instance p3, Lcom/amazonaws/services/s3/internal/S3Signer;

    invoke-virtual {p1}, Lcom/amazonaws/DefaultRequest;->ᩳ()Lcom/amazonaws/http/HttpMethodName;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1, p2}, Lcom/amazonaws/services/s3/internal/S3Signer;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object p3

    :cond_9
    return-object v0
.end method

.method public final ֫(Lcom/amazonaws/services/s3/model/CompleteMultipartUploadRequest;)Lcom/amazonaws/services/s3/model/CompleteMultipartUploadResult;
    .locals 13

    .line 3498
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/CompleteMultipartUploadRequest;->ᩳ()Ljava/lang/String;

    move-result-object v6

    .line 3499
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/CompleteMultipartUploadRequest;->ܿ()Ljava/lang/String;

    move-result-object v7

    .line 3500
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/CompleteMultipartUploadRequest;->ۜ()Ljava/lang/String;

    move-result-object v8

    const-string v0, "The bucket name parameter must be specified when completing a multipart upload"

    .line 3501
    invoke-static {v6, v0}, Lcom/amazonaws/util/ValidationUtils;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "The key parameter must be specified when completing a multipart upload"

    .line 3503
    invoke-static {v7, v0}, Lcom/amazonaws/util/ValidationUtils;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "The upload ID parameter must be specified when completing a multipart upload"

    .line 3505
    invoke-static {v8, v0}, Lcom/amazonaws/util/ValidationUtils;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3507
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/CompleteMultipartUploadRequest;->ܳ()Ljava/util/List;

    move-result-object v0

    const-string v1, "The part ETags parameter must be specified when completing a multipart upload"

    invoke-static {v0, v1}, Lcom/amazonaws/util/ValidationUtils;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v9, 0x0

    const/4 v0, 0x0

    const/4 v10, 0x0

    .line 3513
    :goto_0
    sget-object v4, Lcom/amazonaws/http/HttpMethodName;->۬:Lcom/amazonaws/http/HttpMethodName;

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, v6

    move-object v2, v7

    move-object v3, p1

    .line 4747
    invoke-virtual/range {v0 .. v5}, Lcom/amazonaws/services/s3/AmazonS3Client;->֫(Ljava/lang/String;Ljava/lang/String;Lcom/amazonaws/AmazonWebServiceRequest;Lcom/amazonaws/http/HttpMethodName;Ljava/net/URI;)Lcom/amazonaws/DefaultRequest;

    move-result-object v0

    const-string v1, "uploadId"

    .line 3514
    invoke-virtual {v0, v1, v8}, Lcom/amazonaws/DefaultRequest;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    .line 3518
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/CompleteMultipartUploadRequest;->ܳ()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lcom/amazonaws/services/s3/model/transform/RequestXmlFactory;->֫(Ljava/util/List;)[B

    move-result-object v1

    const-string v2, "Content-Type"

    const-string v3, "application/xml"

    .line 3519
    invoke-virtual {v0, v2, v3}, Lcom/amazonaws/DefaultRequest;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 3520
    array-length v2, v1

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "Content-Length"

    invoke-virtual {v0, v3, v2}, Lcom/amazonaws/DefaultRequest;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 3522
    new-instance v2, Ljava/io/ByteArrayInputStream;

    invoke-direct {v2, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-virtual {v0, v2}, Lcom/amazonaws/DefaultRequest;->֫(Ljava/io/InputStream;)V

    .line 3526
    new-instance v1, Lcom/amazonaws/services/s3/internal/ResponseHeaderHandlerChain;

    new-instance v2, Lcom/amazonaws/services/s3/model/transform/Unmarshallers$CompleteMultipartUploadResultUnmarshaller;

    invoke-direct {v2}, Lcom/amazonaws/services/s3/model/transform/Unmarshallers$CompleteMultipartUploadResultUnmarshaller;-><init>()V

    new-instance v3, Lcom/amazonaws/services/s3/internal/ServerSideEncryptionHeaderHandler;

    invoke-direct {v3}, Lcom/amazonaws/services/s3/internal/ServerSideEncryptionHeaderHandler;-><init>()V

    new-instance v4, Lcom/amazonaws/services/s3/internal/ObjectExpirationHeaderHandler;

    invoke-direct {v4}, Lcom/amazonaws/services/s3/internal/ObjectExpirationHeaderHandler;-><init>()V

    new-instance v5, Lcom/amazonaws/services/s3/internal/S3VersionHeaderHandler;

    invoke-direct {v5}, Lcom/amazonaws/services/s3/internal/S3VersionHeaderHandler;-><init>()V

    new-instance v11, Lcom/amazonaws/services/s3/internal/S3RequesterChargedHeaderHandler;

    invoke-direct {v11}, Lcom/amazonaws/services/s3/internal/S3RequesterChargedHeaderHandler;-><init>()V

    const/4 v12, 0x4

    new-array v12, v12, [Lcom/amazonaws/services/s3/internal/HeaderHandler;

    aput-object v3, v12, v9

    const/4 v3, 0x1

    aput-object v4, v12, v3

    const/4 v3, 0x2

    aput-object v5, v12, v3

    const/4 v3, 0x3

    aput-object v11, v12, v3

    invoke-direct {v1, v2, v12}, Lcom/amazonaws/services/s3/internal/ResponseHeaderHandlerChain;-><init>(Lcom/amazonaws/transform/Unmarshaller;[Lcom/amazonaws/services/s3/internal/HeaderHandler;)V

    .line 3534
    invoke-direct {p0, v0, v1, v6, v7}, Lcom/amazonaws/services/s3/AmazonS3Client;->֫(Lcom/amazonaws/DefaultRequest;Lcom/amazonaws/services/s3/internal/AbstractS3ResponseHandler;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$CompleteMultipartUploadHandler;

    .line 3535
    invoke-virtual {v0}, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$CompleteMultipartUploadHandler;->ۜ()Lcom/amazonaws/services/s3/model/CompleteMultipartUploadResult;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 3536
    invoke-virtual {v0}, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$CompleteMultipartUploadHandler;->ۜ()Lcom/amazonaws/services/s3/model/CompleteMultipartUploadResult;

    move-result-object p1

    return-object p1

    .line 3539
    :cond_0
    invoke-virtual {v0}, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$CompleteMultipartUploadHandler;->᩻()Lcom/amazonaws/services/s3/model/AmazonS3Exception;

    move-result-object v1

    add-int/lit8 v2, v10, 0x1

    .line 3548
    iget-object v3, p0, Lcom/amazonaws/AmazonWebServiceClient;->ۧ:Lcom/amazonaws/ClientConfiguration;

    invoke-virtual {v3}, Lcom/amazonaws/ClientConfiguration;->ܽ()Lcom/amazonaws/retry/RetryPolicy;

    move-result-object v3

    if-eqz v3, :cond_3

    .line 3550
    invoke-virtual {v3}, Lcom/amazonaws/retry/RetryPolicy;->ܽ()Lcom/amazonaws/retry/RetryPolicy$RetryCondition;

    move-result-object v4

    if-nez v4, :cond_1

    goto :goto_1

    .line 3554
    :cond_1
    sget-object v4, Lcom/amazonaws/retry/PredefinedRetryPolicies;->ᩳ:Lcom/amazonaws/retry/RetryPolicy;

    if-ne v3, v4, :cond_2

    goto :goto_1

    .line 3558
    :cond_2
    iget-object v3, p0, Lcom/amazonaws/services/s3/AmazonS3Client;->ۡ:Lcom/amazonaws/services/s3/internal/CompleteMultipartUploadRetryCondition;

    .line 3559
    invoke-virtual {v3, v1, v10}, Lcom/amazonaws/services/s3/internal/CompleteMultipartUploadRetryCondition;->֫(Lcom/amazonaws/AmazonClientException;I)Z

    move-result v1

    goto :goto_2

    :cond_3
    :goto_1
    const/4 v1, 0x0

    :goto_2
    if-eqz v1, :cond_4

    move v10, v2

    goto/16 :goto_0

    .line 3541
    :cond_4
    invoke-virtual {v0}, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$CompleteMultipartUploadHandler;->᩻()Lcom/amazonaws/services/s3/model/AmazonS3Exception;

    move-result-object p1

    throw p1
.end method

.method public final ֫(Lcom/amazonaws/services/s3/model/InitiateMultipartUploadRequest;)Lcom/amazonaws/services/s3/model/InitiateMultipartUploadResult;
    .locals 8

    .line 3574
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/InitiateMultipartUploadRequest;->ᩳ()Ljava/lang/String;

    move-result-object v0

    const-string v1, "The bucket name parameter must be specified when initiating a multipart upload"

    invoke-static {v0, v1}, Lcom/amazonaws/util/ValidationUtils;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3576
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/InitiateMultipartUploadRequest;->ܳ()Ljava/lang/String;

    move-result-object v0

    const-string v1, "The key parameter must be specified when initiating a multipart upload"

    invoke-static {v0, v1}, Lcom/amazonaws/util/ValidationUtils;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3580
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/InitiateMultipartUploadRequest;->ᩳ()Ljava/lang/String;

    move-result-object v3

    .line 3581
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/InitiateMultipartUploadRequest;->ܳ()Ljava/lang/String;

    move-result-object v4

    sget-object v6, Lcom/amazonaws/http/HttpMethodName;->۬:Lcom/amazonaws/http/HttpMethodName;

    const/4 v7, 0x0

    move-object v2, p0

    move-object v5, p1

    .line 4747
    invoke-virtual/range {v2 .. v7}, Lcom/amazonaws/services/s3/AmazonS3Client;->֫(Ljava/lang/String;Ljava/lang/String;Lcom/amazonaws/AmazonWebServiceRequest;Lcom/amazonaws/http/HttpMethodName;Ljava/net/URI;)Lcom/amazonaws/DefaultRequest;

    move-result-object v0

    const-string v1, "uploads"

    const/4 v2, 0x0

    .line 3583
    invoke-virtual {v0, v1, v2}, Lcom/amazonaws/DefaultRequest;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    .line 3597
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/InitiateMultipartUploadRequest;->ܿ()Lcom/amazonaws/services/s3/model/CannedAccessControlList;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 3598
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/InitiateMultipartUploadRequest;->ܿ()Lcom/amazonaws/services/s3/model/CannedAccessControlList;

    move-result-object v1

    .line 3599
    invoke-virtual {v1}, Lcom/amazonaws/services/s3/model/CannedAccessControlList;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "x-amz-acl"

    .line 3598
    invoke-virtual {v0, v2, v1}, Lcom/amazonaws/DefaultRequest;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 3602
    :cond_0
    iget-object v1, p1, Lcom/amazonaws/services/s3/model/InitiateMultipartUploadRequest;->۬:Lcom/amazonaws/services/s3/model/ObjectMetadata;

    if-eqz v1, :cond_1

    .line 3603
    invoke-static {v0, v1}, Lcom/amazonaws/services/s3/AmazonS3Client;->֫(Lcom/amazonaws/DefaultRequest;Lcom/amazonaws/services/s3/model/ObjectMetadata;)V

    .line 3606
    :cond_1
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/InitiateMultipartUploadRequest;->᩷()Lcom/amazonaws/services/s3/model/ObjectTagging;

    move-result-object v1

    invoke-static {v1}, Lcom/amazonaws/services/s3/AmazonS3Client;->֫(Lcom/amazonaws/services/s3/model/ObjectTagging;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    const-string v2, "x-amz-tagging"

    .line 4565
    invoke-virtual {v0, v2, v1}, Lcom/amazonaws/DefaultRequest;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 3615
    :cond_2
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/InitiateMultipartUploadRequest;->ۜ()Lcom/amazonaws/services/s3/model/SSEAwsKeyManagementParams;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 59
    sget-object v2, Lcom/amazonaws/services/s3/model/SSEAlgorithm;->ۙ:Lcom/amazonaws/services/s3/model/SSEAlgorithm;

    invoke-virtual {v2}, Lcom/amazonaws/services/s3/model/SSEAlgorithm;->getAlgorithm()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_3

    const-string v3, "x-amz-server-side-encryption"

    .line 4565
    invoke-virtual {v0, v3, v2}, Lcom/amazonaws/DefaultRequest;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 4534
    :cond_3
    invoke-virtual {v1}, Lcom/amazonaws/services/s3/model/SSEAwsKeyManagementParams;->֫()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_4

    const-string v2, "x-amz-server-side-encryption-aws-kms-key-id"

    .line 4565
    invoke-virtual {v0, v2, v1}, Lcom/amazonaws/DefaultRequest;->֫(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    const-string v1, "Content-Length"

    const/4 v2, 0x0

    .line 4973
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Lcom/amazonaws/DefaultRequest;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 3624
    new-instance v1, Ljava/io/ByteArrayInputStream;

    new-array v3, v2, [B

    invoke-direct {v1, v3}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-virtual {v0, v1}, Lcom/amazonaws/DefaultRequest;->֫(Ljava/io/InputStream;)V

    .line 3628
    new-instance v1, Lcom/amazonaws/services/s3/internal/ResponseHeaderHandlerChain;

    new-instance v3, Lcom/amazonaws/services/s3/model/transform/Unmarshallers$InitiateMultipartUploadResultUnmarshaller;

    invoke-direct {v3}, Lcom/amazonaws/services/s3/model/transform/Unmarshallers$InitiateMultipartUploadResultUnmarshaller;-><init>()V

    new-instance v4, Lcom/amazonaws/services/s3/internal/ServerSideEncryptionHeaderHandler;

    invoke-direct {v4}, Lcom/amazonaws/services/s3/internal/ServerSideEncryptionHeaderHandler;-><init>()V

    const/4 v5, 0x1

    new-array v5, v5, [Lcom/amazonaws/services/s3/internal/HeaderHandler;

    aput-object v4, v5, v2

    invoke-direct {v1, v3, v5}, Lcom/amazonaws/services/s3/internal/ResponseHeaderHandlerChain;-><init>(Lcom/amazonaws/transform/Unmarshaller;[Lcom/amazonaws/services/s3/internal/HeaderHandler;)V

    .line 3634
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/InitiateMultipartUploadRequest;->ᩳ()Ljava/lang/String;

    move-result-object v2

    .line 3635
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/InitiateMultipartUploadRequest;->ܳ()Ljava/lang/String;

    move-result-object p1

    .line 3633
    invoke-direct {p0, v0, v1, v2, p1}, Lcom/amazonaws/services/s3/AmazonS3Client;->֫(Lcom/amazonaws/DefaultRequest;Lcom/amazonaws/services/s3/internal/AbstractS3ResponseHandler;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/amazonaws/services/s3/model/InitiateMultipartUploadResult;

    return-object p1
.end method

.method public final ֫(Lcom/amazonaws/services/s3/model/ListObjectsRequest;)Lcom/amazonaws/services/s3/model/ObjectListing;
    .locals 8

    .line 842
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/ListObjectsRequest;->ᩳ()Ljava/lang/String;

    move-result-object v0

    const-string v1, "The bucket name parameter must be specified when listing objects in a bucket"

    invoke-static {v0, v1}, Lcom/amazonaws/util/ValidationUtils;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "url"

    const/4 v1, 0x0

    .line 852
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    .line 856
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/ListObjectsRequest;->ᩳ()Ljava/lang/String;

    move-result-object v3

    sget-object v6, Lcom/amazonaws/http/HttpMethodName;->᩶:Lcom/amazonaws/http/HttpMethodName;

    const/4 v7, 0x0

    const/4 v4, 0x0

    move-object v2, p0

    move-object v5, p1

    .line 4747
    invoke-virtual/range {v2 .. v7}, Lcom/amazonaws/services/s3/AmazonS3Client;->֫(Ljava/lang/String;Ljava/lang/String;Lcom/amazonaws/AmazonWebServiceRequest;Lcom/amazonaws/http/HttpMethodName;Ljava/net/URI;)Lcom/amazonaws/DefaultRequest;

    move-result-object v2

    .line 858
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/ListObjectsRequest;->᩷()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    const-string v4, "prefix"

    .line 4601
    invoke-virtual {v2, v4, v3}, Lcom/amazonaws/DefaultRequest;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    .line 859
    :cond_0
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/ListObjectsRequest;->ܿ()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_1

    const-string v4, "delimiter"

    .line 4601
    invoke-virtual {v2, v4, v3}, Lcom/amazonaws/DefaultRequest;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    .line 860
    :cond_1
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/ListObjectsRequest;->ܳ()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_2

    const-string v4, "marker"

    .line 4601
    invoke-virtual {v2, v4, v3}, Lcom/amazonaws/DefaultRequest;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    .line 865
    :cond_2
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/ListObjectsRequest;->ۜ()Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_3

    .line 866
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/ListObjectsRequest;->ۜ()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-ltz v3, :cond_3

    .line 867
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/ListObjectsRequest;->ۜ()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "max-keys"

    invoke-virtual {v2, v4, v3}, Lcom/amazonaws/DefaultRequest;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    .line 869
    :cond_3
    new-instance v3, Lcom/amazonaws/services/s3/model/transform/Unmarshallers$ListObjectsUnmarshaller;

    invoke-direct {v3, v0}, Lcom/amazonaws/services/s3/model/transform/Unmarshallers$ListObjectsUnmarshaller;-><init>(Z)V

    .line 870
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/ListObjectsRequest;->ᩳ()Ljava/lang/String;

    move-result-object p1

    .line 4783
    new-instance v0, Lcom/amazonaws/services/s3/internal/S3XmlResponseHandler;

    invoke-direct {v0, v3}, Lcom/amazonaws/services/s3/internal/S3XmlResponseHandler;-><init>(Lcom/amazonaws/transform/Unmarshaller;)V

    invoke-direct {p0, v2, v0, p1, v1}, Lcom/amazonaws/services/s3/AmazonS3Client;->֫(Lcom/amazonaws/DefaultRequest;Lcom/amazonaws/services/s3/internal/AbstractS3ResponseHandler;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    .line 869
    check-cast p1, Lcom/amazonaws/services/s3/model/ObjectListing;

    return-object p1
.end method

.method public final ֫(Lcom/amazonaws/services/s3/model/PutObjectRequest;)Lcom/amazonaws/services/s3/model/PutObjectResult;
    .locals 17

    move-object/from16 v7, p0

    const-string v8, "Unable to cleanly close input stream: "

    .line 1755
    invoke-virtual/range {p1 .. p1}, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->ᩳ()Ljava/lang/String;

    move-result-object v0

    .line 1756
    invoke-virtual/range {p1 .. p1}, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->ۜ()Ljava/lang/String;

    move-result-object v9

    .line 1757
    invoke-virtual/range {p1 .. p1}, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->᩷()Lcom/amazonaws/services/s3/model/ObjectMetadata;

    move-result-object v1

    .line 1758
    invoke-virtual/range {p1 .. p1}, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->ܳ()Ljava/io/InputStream;

    move-result-object v2

    .line 1765
    invoke-virtual/range {p1 .. p1}, Lcom/amazonaws/AmazonWebServiceRequest;->֫()Lcom/amazonaws/event/ProgressListener;

    move-result-object v3

    if-nez v3, :cond_0

    .line 1767
    sget v3, Lcom/amazonaws/event/ProgressListenerCallbackExecutor;->ۧ:I

    const/4 v3, 0x0

    move-object v10, v3

    goto :goto_0

    .line 107
    :cond_0
    new-instance v4, Lcom/amazonaws/event/ProgressListenerCallbackExecutor;

    invoke-direct {v4, v3}, Lcom/amazonaws/event/ProgressListenerCallbackExecutor;-><init>(Lcom/amazonaws/event/ProgressListener;)V

    move-object v10, v4

    :goto_0
    if-nez v1, :cond_1

    .line 1770
    new-instance v1, Lcom/amazonaws/services/s3/model/ObjectMetadata;

    invoke-direct {v1}, Lcom/amazonaws/services/s3/model/ObjectMetadata;-><init>()V

    :cond_1
    move-object v11, v1

    const-string v1, "The bucket name parameter must be specified when uploading an object"

    .line 1773
    invoke-static {v0, v1}, Lcom/amazonaws/util/ValidationUtils;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "The key parameter must be specified when uploading an object"

    .line 1775
    invoke-static {v9, v1}, Lcom/amazonaws/util/ValidationUtils;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1778
    invoke-static/range {p1 .. p1}, Lcom/amazonaws/services/s3/internal/ServiceUtils;->֫(Lcom/amazonaws/AmazonWebServiceRequest;)Z

    move-result v1

    .line 1782
    invoke-virtual/range {p1 .. p1}, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->ܶۧ()Ljava/io/File;

    move-result-object v3

    const/4 v12, 0x0

    if-eqz v3, :cond_5

    .line 1783
    invoke-virtual/range {p1 .. p1}, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->ܶۧ()Ljava/io/File;

    move-result-object v2

    .line 1785
    invoke-virtual {v2}, Ljava/io/File;->length()J

    move-result-wide v3

    invoke-virtual {v11, v3, v4}, Lcom/amazonaws/services/s3/model/ObjectMetadata;->֫(J)V

    .line 1787
    invoke-virtual {v11}, Lcom/amazonaws/services/s3/model/ObjectMetadata;->ܽ()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_2

    const/4 v3, 0x1

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    .line 1790
    :goto_1
    invoke-virtual {v11}, Lcom/amazonaws/services/s3/model/ObjectMetadata;->ᩳ()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_3

    .line 1791
    invoke-static {}, Lcom/amazonaws/services/s3/util/Mimetypes;->֫()Lcom/amazonaws/services/s3/util/Mimetypes;

    move-result-object v4

    invoke-virtual {v4, v2}, Lcom/amazonaws/services/s3/util/Mimetypes;->֫(Ljava/io/File;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v11, v4}, Lcom/amazonaws/services/s3/model/ObjectMetadata;->᩷(Ljava/lang/String;)V

    :cond_3
    if-eqz v3, :cond_4

    if-nez v1, :cond_4

    .line 108
    :try_start_0
    new-instance v1, Ljava/io/FileInputStream;

    invoke-direct {v1, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-static {v1}, Lcom/amazonaws/util/Md5Utils;->֫(Ljava/io/InputStream;)[B

    move-result-object v1

    .line 116
    invoke-static {v1}, Lcom/amazonaws/util/Base64;->ܽ([B)Ljava/lang/String;

    move-result-object v1

    .line 1797
    invoke-virtual {v11, v1}, Lcom/amazonaws/services/s3/model/ObjectMetadata;->ۜ(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    .line 1799
    new-instance v1, Lcom/amazonaws/AmazonClientException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unable to calculate MD5 hash: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {v0, v2}, Ll/᩵ۡ᩷;->֫(Ljava/lang/Exception;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v2

    .line 50
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1800
    throw v1

    .line 1805
    :cond_4
    :goto_2
    :try_start_1
    new-instance v1, Lcom/amazonaws/services/s3/internal/RepeatableFileInputStream;

    invoke-direct {v1, v2}, Lcom/amazonaws/services/s3/internal/RepeatableFileInputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    move-object v13, v1

    goto :goto_3

    :catch_1
    move-exception v0

    .line 1807
    new-instance v1, Lcom/amazonaws/AmazonClientException;

    const-string v2, "Unable to find file to upload"

    .line 50
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1807
    throw v1

    :cond_5
    move-object v13, v2

    .line 1811
    :goto_3
    sget-object v5, Lcom/amazonaws/http/HttpMethodName;->۫:Lcom/amazonaws/http/HttpMethodName;

    const/4 v6, 0x0

    move-object/from16 v1, p0

    move-object v2, v0

    move-object v3, v9

    move-object/from16 v4, p1

    .line 4747
    invoke-virtual/range {v1 .. v6}, Lcom/amazonaws/services/s3/AmazonS3Client;->֫(Ljava/lang/String;Ljava/lang/String;Lcom/amazonaws/AmazonWebServiceRequest;Lcom/amazonaws/http/HttpMethodName;Ljava/net/URI;)Lcom/amazonaws/DefaultRequest;

    move-result-object v1

    .line 1816
    invoke-virtual/range {p1 .. p1}, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->ܿ()Lcom/amazonaws/services/s3/model/CannedAccessControlList;

    move-result-object v2

    if-eqz v2, :cond_6

    .line 1817
    invoke-virtual/range {p1 .. p1}, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->ܿ()Lcom/amazonaws/services/s3/model/CannedAccessControlList;

    move-result-object v2

    invoke-virtual {v2}, Lcom/amazonaws/services/s3/model/CannedAccessControlList;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "x-amz-acl"

    invoke-virtual {v1, v3, v2}, Lcom/amazonaws/DefaultRequest;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 1820
    :cond_6
    invoke-virtual/range {p1 .. p1}, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->ܺ()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_7

    const-string v2, "x-amz-storage-class"

    .line 1821
    invoke-virtual/range {p1 .. p1}, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->ܺ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/amazonaws/DefaultRequest;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 1824
    :cond_7
    invoke-virtual/range {p1 .. p1}, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->ۢ()Ljava/lang/String;

    move-result-object v2

    const-string v3, "Content-Length"

    if-eqz v2, :cond_8

    const-string v2, "x-amz-website-redirect-location"

    .line 1825
    invoke-virtual/range {p1 .. p1}, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->ۢ()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v2, v4}, Lcom/amazonaws/DefaultRequest;->֫(Ljava/lang/String;Ljava/lang/String;)V

    if-nez v13, :cond_8

    .line 4973
    invoke-static {v12}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Lcom/amazonaws/DefaultRequest;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 1828
    new-instance v13, Ljava/io/ByteArrayInputStream;

    new-array v2, v12, [B

    invoke-direct {v13, v2}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 1832
    :cond_8
    invoke-virtual/range {p1 .. p1}, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->ۖ()Lcom/amazonaws/services/s3/model/ObjectTagging;

    move-result-object v2

    invoke-static {v2}, Lcom/amazonaws/services/s3/AmazonS3Client;->֫(Lcom/amazonaws/services/s3/model/ObjectTagging;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_9

    const-string v4, "x-amz-tagging"

    .line 4565
    invoke-virtual {v1, v4, v2}, Lcom/amazonaws/DefaultRequest;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 1834
    :cond_9
    invoke-virtual/range {p1 .. p1}, Lcom/amazonaws/services/s3/model/PutObjectRequest;->ۘ()Z

    move-result v2

    if-eqz v2, :cond_a

    const-string v2, "x-amz-request-payer"

    const-string v4, "requester"

    .line 5450
    invoke-virtual {v1, v2, v4}, Lcom/amazonaws/DefaultRequest;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 1840
    :cond_a
    invoke-virtual {v11}, Lcom/amazonaws/services/s3/model/ObjectMetadata;->ۡ()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    const-wide/16 v4, 0x0

    .line 1841
    sget-object v6, Lcom/amazonaws/services/s3/AmazonS3Client;->᩵:Lcom/amazonaws/logging/Log;

    if-nez v2, :cond_f

    .line 1849
    invoke-virtual {v13}, Ljava/io/InputStream;->markSupported()Z

    move-result v2

    const/4 v14, -0x1

    if-nez v2, :cond_d

    const-string v2, "No content length specified for stream data.  Stream contents will be buffered in memory and could result in out of memory errors."

    .line 1850
    invoke-interface {v6, v2}, Lcom/amazonaws/logging/Log;->ᩳ(Ljava/lang/String;)V

    const/high16 v2, 0x40000

    new-array v4, v2, [B

    const/4 v5, 0x0

    :goto_4
    if-lez v2, :cond_b

    .line 4992
    :try_start_2
    invoke-virtual {v13, v4, v5, v2}, Ljava/io/InputStream;->read([BII)I

    move-result v15

    if-eq v15, v14, :cond_b

    add-int/2addr v5, v15

    sub-int/2addr v2, v15

    goto :goto_4

    .line 4996
    :cond_b
    invoke-virtual {v13}, Ljava/io/InputStream;->read()I

    move-result v2

    if-ne v2, v14, :cond_c

    .line 4999
    invoke-virtual {v13}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    .line 5003
    new-instance v13, Ljava/io/ByteArrayInputStream;

    invoke-direct {v13, v4, v12, v5}, Ljava/io/ByteArrayInputStream;-><init>([BII)V

    .line 1854
    invoke-virtual {v13}, Ljava/io/ByteArrayInputStream;->available()I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Lcom/amazonaws/DefaultRequest;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 1855
    invoke-virtual {v1}, Lcom/amazonaws/DefaultRequest;->ۢ()V

    goto :goto_6

    .line 4997
    :cond_c
    :try_start_3
    new-instance v0, Lcom/amazonaws/AmazonClientException;

    const-string v1, "Input stream exceeds 256k buffer."

    .line 59
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 4997
    throw v0
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    :catch_2
    move-exception v0

    .line 5001
    new-instance v1, Lcom/amazonaws/AmazonClientException;

    const-string v2, "Failed to read from inputstream"

    .line 50
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 5001
    throw v1

    :cond_d
    const/16 v2, 0x2000

    new-array v2, v2, [B

    .line 1952
    invoke-virtual {v13, v14}, Ljava/io/InputStream;->mark(I)V

    .line 1954
    :goto_5
    :try_start_4
    invoke-virtual {v13, v2}, Ljava/io/InputStream;->read([B)I

    move-result v12

    if-eq v12, v14, :cond_e

    int-to-long v14, v12

    add-long/2addr v4, v14

    const/4 v14, -0x1

    goto :goto_5

    .line 1957
    :cond_e
    invoke-virtual {v13}, Ljava/io/InputStream;->reset()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 1859
    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Lcom/amazonaws/DefaultRequest;->֫(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_6

    :catch_3
    move-exception v0

    .line 1959
    new-instance v1, Lcom/amazonaws/AmazonClientException;

    const-string v2, "Could not calculate content length."

    .line 50
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1959
    throw v1

    .line 1862
    :cond_f
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v14

    cmp-long v16, v14, v4

    if-ltz v16, :cond_10

    .line 1871
    new-instance v4, Lcom/amazonaws/util/LengthCheckInputStream;

    invoke-direct {v4, v13, v14, v15, v12}, Lcom/amazonaws/util/LengthCheckInputStream;-><init>(Ljava/io/InputStream;JZ)V

    .line 1876
    invoke-virtual {v2}, Ljava/lang/Long;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Lcom/amazonaws/DefaultRequest;->֫(Ljava/lang/String;Ljava/lang/String;)V

    move-object v13, v4

    :cond_10
    :goto_6
    if-eqz v10, :cond_11

    .line 1881
    new-instance v2, Lcom/amazonaws/event/ProgressReportingInputStream;

    invoke-direct {v2, v13, v10}, Lcom/amazonaws/event/ProgressReportingInputStream;-><init>(Ljava/io/InputStream;Lcom/amazonaws/event/ProgressListenerCallbackExecutor;)V

    .line 1882
    iget v3, v7, Lcom/amazonaws/services/s3/AmazonS3Client;->ۖ:I

    invoke-virtual {v2, v3}, Lcom/amazonaws/event/ProgressReportingInputStream;->֫(I)V

    const/4 v3, 0x2

    .line 1883
    invoke-static {v10, v3}, Lcom/amazonaws/services/s3/AmazonS3Client;->֫(Lcom/amazonaws/event/ProgressListenerCallbackExecutor;I)V

    move-object v13, v2

    .line 1886
    :cond_11
    invoke-virtual {v11}, Lcom/amazonaws/services/s3/model/ObjectMetadata;->ᩳ()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_12

    const-string v2, "application/octet-stream"

    .line 1891
    invoke-virtual {v11, v2}, Lcom/amazonaws/services/s3/model/ObjectMetadata;->᩷(Ljava/lang/String;)V

    .line 1894
    :cond_12
    invoke-static {v1, v11}, Lcom/amazonaws/services/s3/AmazonS3Client;->֫(Lcom/amazonaws/DefaultRequest;Lcom/amazonaws/services/s3/model/ObjectMetadata;)V

    .line 1895
    invoke-virtual/range {p1 .. p1}, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->ۡ()Lcom/amazonaws/services/s3/model/SSEAwsKeyManagementParams;

    move-result-object v2

    if-eqz v2, :cond_14

    .line 59
    sget-object v3, Lcom/amazonaws/services/s3/model/SSEAlgorithm;->ۙ:Lcom/amazonaws/services/s3/model/SSEAlgorithm;

    invoke-virtual {v3}, Lcom/amazonaws/services/s3/model/SSEAlgorithm;->getAlgorithm()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_13

    const-string v4, "x-amz-server-side-encryption"

    .line 4565
    invoke-virtual {v1, v4, v3}, Lcom/amazonaws/DefaultRequest;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 4534
    :cond_13
    invoke-virtual {v2}, Lcom/amazonaws/services/s3/model/SSEAwsKeyManagementParams;->֫()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_14

    const-string v3, "x-amz-server-side-encryption-aws-kms-key-id"

    .line 4565
    invoke-virtual {v1, v3, v2}, Lcom/amazonaws/DefaultRequest;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 1897
    :cond_14
    invoke-virtual {v1, v13}, Lcom/amazonaws/DefaultRequest;->֫(Ljava/io/InputStream;)V

    .line 1912
    :try_start_5
    new-instance v2, Lcom/amazonaws/services/s3/internal/S3MetadataResponseHandler;

    invoke-direct {v2}, Lcom/amazonaws/services/s3/internal/S3MetadataResponseHandler;-><init>()V

    invoke-direct {v7, v1, v2, v0, v9}, Lcom/amazonaws/services/s3/AmazonS3Client;->֫(Lcom/amazonaws/DefaultRequest;Lcom/amazonaws/services/s3/internal/AbstractS3ResponseHandler;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/amazonaws/services/s3/model/ObjectMetadata;
    :try_end_5
    .catch Lcom/amazonaws/AmazonClientException; {:try_start_5 .. :try_end_5} :catch_6
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 1918
    :try_start_6
    invoke-virtual {v13}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catch Lcom/amazonaws/AbortedException; {:try_start_6 .. :try_end_6} :catch_5
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_4

    goto :goto_7

    :catch_4
    move-exception v0

    move-object v2, v0

    .line 1921
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v6, v0, v2}, Lcom/amazonaws/logging/Log;->֫(Ljava/lang/String;Ljava/lang/Exception;)V

    :catch_5
    :goto_7
    const/4 v0, 0x4

    .line 1925
    invoke-static {v10, v0}, Lcom/amazonaws/services/s3/AmazonS3Client;->֫(Lcom/amazonaws/event/ProgressListenerCallbackExecutor;I)V

    .line 1927
    new-instance v0, Lcom/amazonaws/services/s3/model/PutObjectResult;

    invoke-direct {v0}, Lcom/amazonaws/services/s3/model/PutObjectResult;-><init>()V

    .line 1928
    invoke-virtual {v1}, Lcom/amazonaws/services/s3/model/ObjectMetadata;->֡()Ljava/lang/String;

    .line 1929
    invoke-virtual {v1}, Lcom/amazonaws/services/s3/model/ObjectMetadata;->ܺ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/amazonaws/services/s3/internal/SSEResultBase;->ᩳ(Ljava/lang/String;)V

    .line 1930
    invoke-virtual {v1}, Lcom/amazonaws/services/s3/model/ObjectMetadata;->ۖ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/amazonaws/services/s3/internal/SSEResultBase;->ۧ(Ljava/lang/String;)V

    .line 1931
    invoke-virtual {v1}, Lcom/amazonaws/services/s3/model/ObjectMetadata;->ۘ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/amazonaws/services/s3/internal/SSEResultBase;->ܿ(Ljava/lang/String;)V

    .line 1932
    invoke-virtual {v1}, Lcom/amazonaws/services/s3/model/ObjectMetadata;->ܳ()Ljava/util/Date;

    .line 1934
    invoke-virtual {v1}, Lcom/amazonaws/services/s3/model/ObjectMetadata;->ܿ()Ljava/lang/String;

    .line 1936
    invoke-virtual {v1}, Lcom/amazonaws/services/s3/model/ObjectMetadata;->ۚ()Z

    .line 1937
    invoke-virtual {v1}, Lcom/amazonaws/services/s3/model/ObjectMetadata;->ܽ()Ljava/lang/String;

    return-object v0

    :catchall_0
    move-exception v0

    move-object v1, v0

    goto :goto_8

    :catch_6
    move-exception v0

    const/16 v1, 0x8

    .line 1914
    :try_start_7
    invoke-static {v10, v1}, Lcom/amazonaws/services/s3/AmazonS3Client;->֫(Lcom/amazonaws/event/ProgressListenerCallbackExecutor;I)V

    .line 1915
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 1918
    :goto_8
    :try_start_8
    invoke-virtual {v13}, Ljava/io/InputStream;->close()V
    :try_end_8
    .catch Lcom/amazonaws/AbortedException; {:try_start_8 .. :try_end_8} :catch_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_7

    goto :goto_9

    :catch_7
    move-exception v0

    move-object v2, v0

    .line 1921
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v6, v0, v2}, Lcom/amazonaws/logging/Log;->֫(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 1923
    :catch_8
    :goto_9
    throw v1
.end method

.method public final ֫(Lcom/amazonaws/services/s3/model/GetObjectRequest;)Lcom/amazonaws/services/s3/model/S3Object;
    .locals 9

    .line 1532
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/GetObjectRequest;->ᩳ()Ljava/lang/String;

    move-result-object v0

    const-string v1, "The bucket name parameter must be specified when requesting an object"

    invoke-static {v0, v1}, Lcom/amazonaws/util/ValidationUtils;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1534
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/GetObjectRequest;->ܿ()Ljava/lang/String;

    move-result-object v0

    const-string v1, "The key parameter must be specified when requesting an object"

    invoke-static {v0, v1}, Lcom/amazonaws/util/ValidationUtils;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1537
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/GetObjectRequest;->ᩳ()Ljava/lang/String;

    move-result-object v3

    .line 1538
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/GetObjectRequest;->ܿ()Ljava/lang/String;

    move-result-object v4

    sget-object v6, Lcom/amazonaws/http/HttpMethodName;->᩶:Lcom/amazonaws/http/HttpMethodName;

    const/4 v7, 0x0

    move-object v2, p0

    move-object v5, p1

    .line 4747
    invoke-virtual/range {v2 .. v7}, Lcom/amazonaws/services/s3/AmazonS3Client;->֫(Ljava/lang/String;Ljava/lang/String;Lcom/amazonaws/AmazonWebServiceRequest;Lcom/amazonaws/http/HttpMethodName;Ljava/net/URI;)Lcom/amazonaws/DefaultRequest;

    move-result-object v0

    .line 1540
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/GetObjectRequest;->ۢ()Ljava/lang/String;

    .line 1545
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/GetObjectRequest;->᩷()[J

    move-result-object v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    .line 1547
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "bytes="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v4, 0x0

    aget-wide v4, v1, v4

    invoke-static {v4, v5}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "-"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 1548
    aget-wide v4, v1, v2

    const-wide/16 v6, 0x0

    cmp-long v8, v4, v6

    if-ltz v8, :cond_0

    .line 0
    invoke-static {v3}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 1554
    aget-wide v4, v1, v2

    invoke-static {v4, v5}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    :cond_0
    const-string v1, "Range"

    .line 1556
    invoke-virtual {v0, v1, v3}, Lcom/amazonaws/DefaultRequest;->֫(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    const-string v1, "If-Match"

    .line 1568
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/GetObjectRequest;->ܳ()Ljava/util/ArrayList;

    move-result-object v3

    .line 1567
    invoke-static {v0, v1, v3}, Lcom/amazonaws/services/s3/AmazonS3Client;->֫(Lcom/amazonaws/DefaultRequest;Ljava/lang/String;Ljava/util/ArrayList;)V

    const-string v1, "If-None-Match"

    .line 1570
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/GetObjectRequest;->ۜ()Ljava/util/ArrayList;

    move-result-object v3

    .line 1569
    invoke-static {v0, v1, v3}, Lcom/amazonaws/services/s3/AmazonS3Client;->֫(Lcom/amazonaws/DefaultRequest;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 1580
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/GetObjectRequest;->֫()Lcom/amazonaws/event/ProgressListener;

    move-result-object v1

    const/4 v3, 0x0

    if-nez v1, :cond_2

    .line 1582
    sget v1, Lcom/amazonaws/event/ProgressListenerCallbackExecutor;->ۧ:I

    move-object v4, v3

    goto :goto_0

    .line 107
    :cond_2
    new-instance v4, Lcom/amazonaws/event/ProgressListenerCallbackExecutor;

    invoke-direct {v4, v1}, Lcom/amazonaws/event/ProgressListenerCallbackExecutor;-><init>(Lcom/amazonaws/event/ProgressListener;)V

    .line 1585
    :goto_0
    :try_start_0
    new-instance v1, Lcom/amazonaws/services/s3/internal/S3ObjectResponseHandler;

    invoke-direct {v1}, Lcom/amazonaws/services/s3/internal/S3ObjectResponseHandler;-><init>()V

    .line 1586
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/GetObjectRequest;->ᩳ()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/GetObjectRequest;->ܿ()Ljava/lang/String;

    move-result-object v6

    .line 1585
    invoke-direct {p0, v0, v1, v5, v6}, Lcom/amazonaws/services/s3/AmazonS3Client;->֫(Lcom/amazonaws/DefaultRequest;Lcom/amazonaws/services/s3/internal/AbstractS3ResponseHandler;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/amazonaws/services/s3/model/S3Object;

    .line 1593
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/GetObjectRequest;->ᩳ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/amazonaws/services/s3/model/S3Object;->֫(Ljava/lang/String;)V

    .line 1594
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/GetObjectRequest;->ܿ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/amazonaws/services/s3/model/S3Object;->ۧ(Ljava/lang/String;)V

    .line 1596
    invoke-virtual {v0}, Lcom/amazonaws/services/s3/model/S3Object;->֫()Lcom/amazonaws/services/s3/model/S3ObjectInputStream;

    move-result-object p1

    .line 1601
    new-instance v1, Lcom/amazonaws/util/ServiceClientHolderInputStream;

    invoke-direct {v1, p1}, Lcom/amazonaws/util/ServiceClientHolderInputStream;-><init>(Lcom/amazonaws/services/s3/model/S3ObjectInputStream;)V

    if-eqz v4, :cond_3

    .line 1608
    new-instance p1, Lcom/amazonaws/event/ProgressReportingInputStream;

    invoke-direct {p1, v1, v4}, Lcom/amazonaws/event/ProgressReportingInputStream;-><init>(Ljava/io/InputStream;Lcom/amazonaws/event/ProgressListenerCallbackExecutor;)V

    .line 1610
    invoke-virtual {p1}, Lcom/amazonaws/event/ProgressReportingInputStream;->ܳ()V

    .line 1611
    iget v1, p0, Lcom/amazonaws/services/s3/AmazonS3Client;->ۖ:I

    invoke-virtual {p1, v1}, Lcom/amazonaws/event/ProgressReportingInputStream;->֫(I)V

    const/4 v1, 0x2

    .line 1613
    invoke-static {v4, v1}, Lcom/amazonaws/services/s3/AmazonS3Client;->֫(Lcom/amazonaws/event/ProgressListenerCallbackExecutor;I)V

    move-object v1, p1

    .line 1619
    :cond_3
    new-instance p1, Lcom/amazonaws/util/LengthCheckInputStream;

    .line 1620
    invoke-virtual {v0}, Lcom/amazonaws/services/s3/model/S3Object;->ܽ()Lcom/amazonaws/services/s3/model/ObjectMetadata;

    move-result-object v5

    invoke-virtual {v5}, Lcom/amazonaws/services/s3/model/ObjectMetadata;->֫()J

    move-result-wide v5

    invoke-direct {p1, v1, v5, v6, v2}, Lcom/amazonaws/util/LengthCheckInputStream;-><init>(Ljava/io/InputStream;JZ)V

    .line 1626
    new-instance v1, Lcom/amazonaws/services/s3/model/S3ObjectInputStream;

    invoke-direct {v1, p1}, Lcom/amazonaws/services/s3/model/S3ObjectInputStream;-><init>(Ljava/io/InputStream;)V

    invoke-virtual {v0, v1}, Lcom/amazonaws/services/s3/model/S3Object;->֫(Lcom/amazonaws/services/s3/model/S3ObjectInputStream;)V
    :try_end_0
    .catch Lcom/amazonaws/services/s3/model/AmazonS3Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    .line 1637
    invoke-virtual {p1}, Lcom/amazonaws/AmazonServiceException;->ᩳ()I

    move-result v0

    const/16 v1, 0x19c

    if-eq v0, v1, :cond_5

    invoke-virtual {p1}, Lcom/amazonaws/AmazonServiceException;->ᩳ()I

    move-result v0

    const/16 v1, 0x130

    if-ne v0, v1, :cond_4

    goto :goto_1

    :cond_4
    const/16 v0, 0x8

    .line 1643
    invoke-static {v4, v0}, Lcom/amazonaws/services/s3/AmazonS3Client;->֫(Lcom/amazonaws/event/ProgressListenerCallbackExecutor;I)V

    .line 1645
    throw p1

    :cond_5
    :goto_1
    const/16 p1, 0x10

    .line 1638
    invoke-static {v4, p1}, Lcom/amazonaws/services/s3/AmazonS3Client;->֫(Lcom/amazonaws/event/ProgressListenerCallbackExecutor;I)V

    return-object v3
.end method

.method public final ֫(Lcom/amazonaws/services/s3/model/UploadPartRequest;)Lcom/amazonaws/services/s3/model/UploadPartResult;
    .locals 13

    .line 3736
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/UploadPartRequest;->ᩳ()Ljava/lang/String;

    move-result-object v6

    .line 3737
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/UploadPartRequest;->᩷()Ljava/lang/String;

    move-result-object v7

    .line 3738
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/UploadPartRequest;->ܺ()Ljava/lang/String;

    move-result-object v8

    .line 3739
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/UploadPartRequest;->ۢ()I

    move-result v9

    .line 3740
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/UploadPartRequest;->ۡ()J

    move-result-wide v10

    const-string v0, "The bucket name parameter must be specified when uploading a part"

    .line 3742
    invoke-static {v6, v0}, Lcom/amazonaws/util/ValidationUtils;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "The key parameter must be specified when uploading a part"

    .line 3744
    invoke-static {v7, v0}, Lcom/amazonaws/util/ValidationUtils;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "The upload ID parameter must be specified when uploading a part"

    .line 3746
    invoke-static {v8, v0}, Lcom/amazonaws/util/ValidationUtils;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3753
    sget-object v4, Lcom/amazonaws/http/HttpMethodName;->۫:Lcom/amazonaws/http/HttpMethodName;

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, v6

    move-object v2, v7

    move-object v3, p1

    .line 4747
    invoke-virtual/range {v0 .. v5}, Lcom/amazonaws/services/s3/AmazonS3Client;->֫(Ljava/lang/String;Ljava/lang/String;Lcom/amazonaws/AmazonWebServiceRequest;Lcom/amazonaws/http/HttpMethodName;Ljava/net/URI;)Lcom/amazonaws/DefaultRequest;

    move-result-object v12

    const-string v0, "uploadId"

    .line 3755
    invoke-virtual {v12, v0, v8}, Lcom/amazonaws/DefaultRequest;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "partNumber"

    .line 3756
    invoke-static {v9}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v12, v0, v1}, Lcom/amazonaws/DefaultRequest;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "Content-Length"

    .line 3762
    invoke-static {v10, v11}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v12, v0, v1}, Lcom/amazonaws/DefaultRequest;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 3773
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/UploadPartRequest;->ۜ()Ljava/io/InputStream;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3774
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/UploadPartRequest;->ۜ()Ljava/io/InputStream;

    move-result-object v0

    goto :goto_0

    .line 3775
    :cond_0
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/UploadPartRequest;->ܶۧ()Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_7

    .line 3777
    :try_start_0
    new-instance v8, Lcom/amazonaws/services/s3/internal/InputSubstream;

    new-instance v1, Lcom/amazonaws/services/s3/internal/RepeatableFileInputStream;

    .line 3778
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/UploadPartRequest;->ܶۧ()Ljava/io/File;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/amazonaws/services/s3/internal/RepeatableFileInputStream;-><init>(Ljava/io/File;)V

    .line 3779
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/UploadPartRequest;->ܿ()J

    move-result-wide v2

    move-object v0, v8

    move-wide v4, v10

    invoke-direct/range {v0 .. v5}, Lcom/amazonaws/services/s3/internal/InputSubstream;-><init>(Lcom/amazonaws/services/s3/internal/RepeatableFileInputStream;JJ)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_4

    move-object v0, v8

    .line 3792
    :goto_0
    invoke-static {p1}, Lcom/amazonaws/services/s3/internal/ServiceUtils;->֫(Lcom/amazonaws/AmazonWebServiceRequest;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 3793
    invoke-virtual {v0}, Ljava/io/InputStream;->markSupported()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 75
    :try_start_1
    invoke-static {v0}, Lcom/amazonaws/util/Md5Utils;->֫(Ljava/io/InputStream;)[B

    move-result-object v1

    invoke-static {v1}, Lcom/amazonaws/util/Base64;->ܽ([B)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Content-MD5"

    if-eqz v1, :cond_1

    .line 4565
    invoke-virtual {v12, v2, v1}, Lcom/amazonaws/DefaultRequest;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 3797
    :cond_1
    invoke-virtual {v0}, Ljava/io/InputStream;->reset()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 3799
    new-instance v0, Lcom/amazonaws/AmazonClientException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unable to calculate MD5 hash: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {p1, v1}, Ll/᩵ۡ᩷;->֫(Ljava/lang/Exception;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v1

    .line 50
    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 3800
    throw v0

    .line 3809
    :cond_2
    :goto_1
    invoke-virtual {p1}, Lcom/amazonaws/AmazonWebServiceRequest;->֫()Lcom/amazonaws/event/ProgressListener;

    move-result-object p1

    if-nez p1, :cond_3

    .line 3811
    sget p1, Lcom/amazonaws/event/ProgressListenerCallbackExecutor;->ۧ:I

    const/4 p1, 0x0

    goto :goto_2

    .line 107
    :cond_3
    new-instance v1, Lcom/amazonaws/event/ProgressListenerCallbackExecutor;

    invoke-direct {v1, p1}, Lcom/amazonaws/event/ProgressListenerCallbackExecutor;-><init>(Lcom/amazonaws/event/ProgressListener;)V

    move-object p1, v1

    :goto_2
    if-eqz p1, :cond_4

    .line 3814
    new-instance v1, Lcom/amazonaws/event/ProgressReportingInputStream;

    invoke-direct {v1, v0, p1}, Lcom/amazonaws/event/ProgressReportingInputStream;-><init>(Ljava/io/InputStream;Lcom/amazonaws/event/ProgressListenerCallbackExecutor;)V

    .line 3815
    iget v0, p0, Lcom/amazonaws/services/s3/AmazonS3Client;->ۖ:I

    invoke-virtual {v1, v0}, Lcom/amazonaws/event/ProgressReportingInputStream;->֫(I)V

    const/16 v0, 0x400

    .line 3816
    invoke-static {p1, v0}, Lcom/amazonaws/services/s3/AmazonS3Client;->֫(Lcom/amazonaws/event/ProgressListenerCallbackExecutor;I)V

    move-object v0, v1

    .line 3820
    :cond_4
    :try_start_2
    invoke-virtual {v12, v0}, Lcom/amazonaws/DefaultRequest;->֫(Ljava/io/InputStream;)V

    .line 3821
    new-instance v1, Lcom/amazonaws/services/s3/internal/S3MetadataResponseHandler;

    invoke-direct {v1}, Lcom/amazonaws/services/s3/internal/S3MetadataResponseHandler;-><init>()V

    invoke-direct {p0, v12, v1, v6, v7}, Lcom/amazonaws/services/s3/AmazonS3Client;->֫(Lcom/amazonaws/DefaultRequest;Lcom/amazonaws/services/s3/internal/AbstractS3ResponseHandler;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/amazonaws/services/s3/model/ObjectMetadata;

    const/16 v2, 0x800

    .line 3824
    invoke-static {p1, v2}, Lcom/amazonaws/services/s3/AmazonS3Client;->֫(Lcom/amazonaws/event/ProgressListenerCallbackExecutor;I)V

    .line 3827
    new-instance v2, Lcom/amazonaws/services/s3/model/UploadPartResult;

    invoke-direct {v2}, Lcom/amazonaws/services/s3/model/UploadPartResult;-><init>()V

    .line 3828
    invoke-virtual {v1}, Lcom/amazonaws/services/s3/model/ObjectMetadata;->ܿ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/amazonaws/services/s3/model/UploadPartResult;->ܳ(Ljava/lang/String;)V

    .line 3829
    invoke-virtual {v2, v9}, Lcom/amazonaws/services/s3/model/UploadPartResult;->֫(I)V

    .line 3830
    invoke-virtual {v1}, Lcom/amazonaws/services/s3/model/ObjectMetadata;->ܺ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/amazonaws/services/s3/internal/SSEResultBase;->ᩳ(Ljava/lang/String;)V

    .line 3831
    invoke-virtual {v1}, Lcom/amazonaws/services/s3/model/ObjectMetadata;->ۖ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/amazonaws/services/s3/internal/SSEResultBase;->ۧ(Ljava/lang/String;)V

    .line 3832
    invoke-virtual {v1}, Lcom/amazonaws/services/s3/model/ObjectMetadata;->ۘ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/amazonaws/services/s3/internal/SSEResultBase;->ܿ(Ljava/lang/String;)V

    .line 3833
    invoke-virtual {v1}, Lcom/amazonaws/services/s3/model/ObjectMetadata;->ۚ()Z
    :try_end_2
    .catch Lcom/amazonaws/AmazonClientException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v0, :cond_5

    .line 3849
    :try_start_3
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    :catch_1
    :cond_5
    return-object v2

    :catchall_0
    move-exception p1

    goto :goto_3

    :catch_2
    move-exception v1

    const/16 v2, 0x1000

    .line 3836
    :try_start_4
    invoke-static {p1, v2}, Lcom/amazonaws/services/s3/AmazonS3Client;->֫(Lcom/amazonaws/event/ProgressListenerCallbackExecutor;I)V

    .line 3845
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_3
    if-eqz v0, :cond_6

    .line 3849
    :try_start_5
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    .line 3853
    :catch_3
    :cond_6
    throw p1

    :catch_4
    move-exception p1

    .line 3781
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The specified file doesn\'t exist"

    invoke-direct {v0, v1, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    .line 3784
    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "A File or InputStream must be specified when uploading part"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ֫(Lcom/amazonaws/DefaultRequest;Ljava/lang/String;Ljava/lang/String;Ljava/net/URI;)V
    .locals 6

    if-nez p4, :cond_0

    .line 5659
    iget-object p4, p0, Lcom/amazonaws/AmazonWebServiceClient;->ܽ:Ljava/net/URI;

    .line 5675
    :cond_0
    iget-object v0, p0, Lcom/amazonaws/services/s3/AmazonS3Client;->᩷:Lcom/amazonaws/services/s3/S3ClientOptions;

    invoke-virtual {v0}, Lcom/amazonaws/services/s3/S3ClientOptions;->֫()Z

    move-result v0

    const-string v1, "/"

    if-nez v0, :cond_6

    invoke-static {p2}, Lcom/amazonaws/services/s3/internal/BucketNameUtils;->֫(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 5676
    invoke-virtual {p4}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    const-string v2, "\\."

    .line 5701
    invoke-virtual {v0, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 5702
    array-length v2, v0

    const/4 v3, 0x4

    if-eq v2, v3, :cond_2

    goto :goto_1

    .line 5705
    :cond_2
    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_6

    aget-object v4, v0, v3

    .line 5707
    :try_start_0
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    if-ltz v4, :cond_4

    const/16 v5, 0xff

    if-le v4, v5, :cond_3

    goto :goto_1

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 5661
    :catch_0
    :cond_4
    :goto_1
    sget-object v0, Lcom/amazonaws/services/s3/AmazonS3Client;->᩵:Lcom/amazonaws/logging/Log;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Using virtual style addressing. Endpoint = "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Lcom/amazonaws/logging/Log;->ۧ(Ljava/lang/String;)V

    .line 4281
    :try_start_1
    new-instance v0, Ljava/net/URI;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p4}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "://"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4282
    invoke-virtual {p4}, Ljava/net/URI;->getAuthority()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-direct {v0, p4}, Ljava/net/URI;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/net/URISyntaxException; {:try_start_1 .. :try_end_1} :catch_1

    .line 5662
    invoke-virtual {p1, v0}, Lcom/amazonaws/DefaultRequest;->֫(Ljava/net/URI;)V

    if-eqz p3, :cond_5

    .line 5687
    invoke-virtual {p3, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_5

    .line 5688
    invoke-virtual {v1, p3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    goto :goto_2

    :cond_5
    move-object p2, p3

    .line 5663
    :goto_2
    invoke-virtual {p1, p2}, Lcom/amazonaws/DefaultRequest;->֫(Ljava/lang/String;)V

    goto :goto_4

    :catch_1
    move-exception p1

    .line 4284
    new-instance p3, Ljava/lang/IllegalArgumentException;

    const-string p4, "Invalid bucket name: "

    .line 0
    invoke-static {p4, p2}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 4284
    invoke-direct {p3, p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p3

    .line 5665
    :cond_6
    sget-object v0, Lcom/amazonaws/services/s3/AmazonS3Client;->᩵:Lcom/amazonaws/logging/Log;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Using path style addressing. Endpoint = "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Lcom/amazonaws/logging/Log;->ۧ(Ljava/lang/String;)V

    .line 5666
    invoke-virtual {p1, p4}, Lcom/amazonaws/DefaultRequest;->֫(Ljava/net/URI;)V

    if-eqz p2, :cond_8

    .line 0
    invoke-static {p2, v1}, Ll/۟֫ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    if-eqz p3, :cond_7

    move-object p4, p3

    goto :goto_3

    :cond_7
    const-string p4, ""

    .line 5694
    :goto_3
    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 5668
    invoke-virtual {p1, p2}, Lcom/amazonaws/DefaultRequest;->֫(Ljava/lang/String;)V

    .line 5671
    :cond_8
    :goto_4
    sget-object p2, Lcom/amazonaws/services/s3/AmazonS3Client;->᩵:Lcom/amazonaws/logging/Log;

    new-instance p4, Ljava/lang/StringBuilder;

    const-string v0, "Key: "

    invoke-direct {p4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "; Request: "

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/amazonaws/logging/Log;->ۧ(Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(Lcom/amazonaws/services/s3/model/AbortMultipartUploadRequest;)V
    .locals 8

    .line 3467
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/AbortMultipartUploadRequest;->ᩳ()Ljava/lang/String;

    move-result-object v0

    const-string v1, "The bucket name parameter must be specified when aborting a multipart upload"

    invoke-static {v0, v1}, Lcom/amazonaws/util/ValidationUtils;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3469
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/AbortMultipartUploadRequest;->ܿ()Ljava/lang/String;

    move-result-object v0

    const-string v1, "The key parameter must be specified when aborting a multipart upload"

    invoke-static {v0, v1}, Lcom/amazonaws/util/ValidationUtils;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3471
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/AbortMultipartUploadRequest;->ܳ()Ljava/lang/String;

    move-result-object v0

    const-string v1, "The upload ID parameter must be specified when aborting a multipart upload"

    invoke-static {v0, v1}, Lcom/amazonaws/util/ValidationUtils;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3474
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/AbortMultipartUploadRequest;->ᩳ()Ljava/lang/String;

    move-result-object v0

    .line 3475
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/AbortMultipartUploadRequest;->ܿ()Ljava/lang/String;

    move-result-object v1

    .line 3477
    sget-object v6, Lcom/amazonaws/http/HttpMethodName;->᩹:Lcom/amazonaws/http/HttpMethodName;

    const/4 v7, 0x0

    move-object v2, p0

    move-object v3, v0

    move-object v4, v1

    move-object v5, p1

    .line 4747
    invoke-virtual/range {v2 .. v7}, Lcom/amazonaws/services/s3/AmazonS3Client;->֫(Ljava/lang/String;Ljava/lang/String;Lcom/amazonaws/AmazonWebServiceRequest;Lcom/amazonaws/http/HttpMethodName;Ljava/net/URI;)Lcom/amazonaws/DefaultRequest;

    move-result-object v2

    const-string v3, "uploadId"

    .line 3479
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/AbortMultipartUploadRequest;->ܳ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, v3, p1}, Lcom/amazonaws/DefaultRequest;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    .line 3482
    iget-object p1, p0, Lcom/amazonaws/services/s3/AmazonS3Client;->ۘ:Lcom/amazonaws/services/s3/internal/S3XmlResponseHandler;

    invoke-direct {p0, v2, p1, v0, v1}, Lcom/amazonaws/services/s3/AmazonS3Client;->֫(Lcom/amazonaws/DefaultRequest;Lcom/amazonaws/services/s3/internal/AbstractS3ResponseHandler;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    return-void
.end method

.method public final ֫(Lcom/amazonaws/services/s3/model/CopyObjectRequest;)V
    .locals 10

    .line 2018
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/CopyObjectRequest;->᩷()Ljava/lang/String;

    move-result-object v0

    const-string v1, "The source bucket name must be specified when copying an object"

    invoke-static {v0, v1}, Lcom/amazonaws/util/ValidationUtils;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2020
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/CopyObjectRequest;->ۢ()Ljava/lang/String;

    move-result-object v0

    const-string v1, "The source object key must be specified when copying an object"

    invoke-static {v0, v1}, Lcom/amazonaws/util/ValidationUtils;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2022
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/CopyObjectRequest;->ᩳ()Ljava/lang/String;

    move-result-object v0

    const-string v1, "The destination bucket name must be specified when copying an object"

    invoke-static {v0, v1}, Lcom/amazonaws/util/ValidationUtils;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2024
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/CopyObjectRequest;->ܿ()Ljava/lang/String;

    move-result-object v0

    const-string v1, "The destination object key must be specified when copying an object"

    invoke-static {v0, v1}, Lcom/amazonaws/util/ValidationUtils;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2027
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/CopyObjectRequest;->ܿ()Ljava/lang/String;

    move-result-object v0

    .line 2028
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/CopyObjectRequest;->ᩳ()Ljava/lang/String;

    move-result-object v1

    .line 2030
    sget-object v6, Lcom/amazonaws/http/HttpMethodName;->۫:Lcom/amazonaws/http/HttpMethodName;

    const/4 v7, 0x0

    move-object v2, p0

    move-object v3, v1

    move-object v4, v0

    move-object v5, p1

    .line 4747
    invoke-virtual/range {v2 .. v7}, Lcom/amazonaws/services/s3/AmazonS3Client;->֫(Ljava/lang/String;Ljava/lang/String;Lcom/amazonaws/AmazonWebServiceRequest;Lcom/amazonaws/http/HttpMethodName;Ljava/net/URI;)Lcom/amazonaws/DefaultRequest;

    move-result-object v2

    .line 4380
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "/"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/CopyObjectRequest;->᩷()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4381
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/CopyObjectRequest;->ۢ()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "x-amz-copy-source"

    .line 4386
    invoke-virtual {v2, v4, v3}, Lcom/amazonaws/DefaultRequest;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "x-amz-copy-source-if-match"

    .line 4394
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/CopyObjectRequest;->ܳ()Ljava/util/ArrayList;

    move-result-object v4

    .line 4393
    invoke-static {v2, v3, v4}, Lcom/amazonaws/services/s3/AmazonS3Client;->֫(Lcom/amazonaws/DefaultRequest;Ljava/lang/String;Ljava/util/ArrayList;)V

    const-string v3, "x-amz-copy-source-if-none-match"

    .line 4396
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/CopyObjectRequest;->ۜ()Ljava/util/ArrayList;

    move-result-object p1

    .line 4395
    invoke-static {v2, v3, p1}, Lcom/amazonaws/services/s3/AmazonS3Client;->֫(Lcom/amazonaws/DefaultRequest;Ljava/lang/String;Ljava/util/ArrayList;)V

    const/4 p1, 0x0

    .line 4973
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    const-string v4, "Content-Length"

    invoke-virtual {v2, v4, v3}, Lcom/amazonaws/DefaultRequest;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 2048
    :try_start_0
    new-instance v3, Lcom/amazonaws/services/s3/internal/ResponseHeaderHandlerChain;

    new-instance v4, Lcom/amazonaws/services/s3/model/transform/Unmarshallers$CopyObjectUnmarshaller;

    invoke-direct {v4}, Lcom/amazonaws/services/s3/model/transform/Unmarshallers$CopyObjectUnmarshaller;-><init>()V

    new-instance v5, Lcom/amazonaws/services/s3/internal/ServerSideEncryptionHeaderHandler;

    invoke-direct {v5}, Lcom/amazonaws/services/s3/internal/ServerSideEncryptionHeaderHandler;-><init>()V

    new-instance v6, Lcom/amazonaws/services/s3/internal/S3VersionHeaderHandler;

    invoke-direct {v6}, Lcom/amazonaws/services/s3/internal/S3VersionHeaderHandler;-><init>()V

    new-instance v7, Lcom/amazonaws/services/s3/internal/ObjectExpirationHeaderHandler;

    invoke-direct {v7}, Lcom/amazonaws/services/s3/internal/ObjectExpirationHeaderHandler;-><init>()V

    new-instance v8, Lcom/amazonaws/services/s3/internal/S3RequesterChargedHeaderHandler;

    invoke-direct {v8}, Lcom/amazonaws/services/s3/internal/S3RequesterChargedHeaderHandler;-><init>()V

    const/4 v9, 0x4

    new-array v9, v9, [Lcom/amazonaws/services/s3/internal/HeaderHandler;

    aput-object v5, v9, p1

    const/4 p1, 0x1

    aput-object v6, v9, p1

    const/4 p1, 0x2

    aput-object v7, v9, p1

    const/4 p1, 0x3

    aput-object v8, v9, p1

    invoke-direct {v3, v4, v9}, Lcom/amazonaws/services/s3/internal/ResponseHeaderHandlerChain;-><init>(Lcom/amazonaws/transform/Unmarshaller;[Lcom/amazonaws/services/s3/internal/HeaderHandler;)V

    .line 2056
    invoke-direct {p0, v2, v3, v1, v0}, Lcom/amazonaws/services/s3/AmazonS3Client;->֫(Lcom/amazonaws/DefaultRequest;Lcom/amazonaws/services/s3/internal/AbstractS3ResponseHandler;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$CopyObjectResultHandler;
    :try_end_0
    .catch Lcom/amazonaws/services/s3/model/AmazonS3Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 2082
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$CopyObjectResultHandler;->ۜ()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    .line 2101
    new-instance v0, Lcom/amazonaws/services/s3/model/CopyObjectResult;

    invoke-direct {v0}, Lcom/amazonaws/services/s3/model/CopyObjectResult;-><init>()V

    .line 2102
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$CopyObjectResultHandler;->᩻()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/amazonaws/services/s3/model/CopyObjectResult;->ܳ(Ljava/lang/String;)V

    .line 2103
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$CopyObjectResultHandler;->ۘ()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/amazonaws/services/s3/model/CopyObjectResult;->ۧ(Ljava/util/Date;)V

    .line 2104
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$CopyObjectResultHandler;->ᩴ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/amazonaws/services/s3/model/CopyObjectResult;->֫(Ljava/lang/String;)V

    .line 2105
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/transform/AbstractSSEHandler;->ܽ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/amazonaws/services/s3/internal/SSEResultBase;->ᩳ(Ljava/lang/String;)V

    .line 2106
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/transform/AbstractSSEHandler;->ᩳ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/amazonaws/services/s3/internal/SSEResultBase;->ۧ(Ljava/lang/String;)V

    .line 2107
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/transform/AbstractSSEHandler;->ܿ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/amazonaws/services/s3/internal/SSEResultBase;->ܿ(Ljava/lang/String;)V

    .line 2108
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$CopyObjectResultHandler;->ܺ()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/amazonaws/services/s3/model/CopyObjectResult;->֫(Ljava/util/Date;)V

    .line 2109
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$CopyObjectResultHandler;->ۖ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/amazonaws/services/s3/model/CopyObjectResult;->ܽ(Ljava/lang/String;)V

    .line 2110
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$CopyObjectResultHandler;->᩵()Z

    move-result p1

    invoke-virtual {v0, p1}, Lcom/amazonaws/services/s3/model/CopyObjectResult;->֫(Z)V

    return-void

    .line 2083
    :cond_0
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$CopyObjectResultHandler;->ۜ()Ljava/lang/String;

    move-result-object v0

    .line 2084
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$CopyObjectResultHandler;->ۢ()Ljava/lang/String;

    move-result-object v1

    .line 2085
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$CopyObjectResultHandler;->ۡ()Ljava/lang/String;

    move-result-object v3

    .line 2086
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$CopyObjectResultHandler;->᩷()Ljava/lang/String;

    move-result-object p1

    .line 2088
    new-instance v4, Lcom/amazonaws/services/s3/model/AmazonS3Exception;

    .line 62
    invoke-direct {v4, v1}, Lcom/amazonaws/AmazonServiceException;-><init>(Ljava/lang/String;)V

    .line 2089
    invoke-virtual {v4, v0}, Lcom/amazonaws/AmazonServiceException;->֫(Ljava/lang/String;)V

    .line 2090
    sget-object v0, Lcom/amazonaws/AmazonServiceException$ErrorType;->᩹:Lcom/amazonaws/AmazonServiceException$ErrorType;

    .line 2091
    invoke-virtual {v4, v3}, Lcom/amazonaws/AmazonServiceException;->ܽ(Ljava/lang/String;)V

    .line 2092
    invoke-virtual {v4, p1}, Lcom/amazonaws/services/s3/model/AmazonS3Exception;->ܿ(Ljava/lang/String;)V

    .line 2093
    invoke-virtual {v2}, Lcom/amazonaws/DefaultRequest;->ۜ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v4, p1}, Lcom/amazonaws/AmazonServiceException;->ᩳ(Ljava/lang/String;)V

    const/16 p1, 0xc8

    .line 2094
    invoke-virtual {v4, p1}, Lcom/amazonaws/AmazonServiceException;->֫(I)V

    .line 2096
    throw v4

    :catch_0
    move-exception p1

    .line 2065
    invoke-virtual {p1}, Lcom/amazonaws/AmazonServiceException;->ᩳ()I

    move-result v0

    const/16 v1, 0x19c

    if-ne v0, v1, :cond_1

    return-void

    .line 2069
    :cond_1
    throw p1
.end method

.method public final ֫(Lcom/amazonaws/services/s3/model/DeleteObjectRequest;)V
    .locals 8

    .line 2262
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/DeleteObjectRequest;->ᩳ()Ljava/lang/String;

    move-result-object v0

    const-string v1, "The bucket name must be specified when deleting an object"

    invoke-static {v0, v1}, Lcom/amazonaws/util/ValidationUtils;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2264
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/DeleteObjectRequest;->ܿ()Ljava/lang/String;

    move-result-object v0

    const-string v1, "The key must be specified when deleting an object"

    invoke-static {v0, v1}, Lcom/amazonaws/util/ValidationUtils;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2267
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/DeleteObjectRequest;->ᩳ()Ljava/lang/String;

    move-result-object v3

    .line 2268
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/DeleteObjectRequest;->ܿ()Ljava/lang/String;

    move-result-object v4

    sget-object v6, Lcom/amazonaws/http/HttpMethodName;->᩹:Lcom/amazonaws/http/HttpMethodName;

    const/4 v7, 0x0

    move-object v2, p0

    move-object v5, p1

    .line 4747
    invoke-virtual/range {v2 .. v7}, Lcom/amazonaws/services/s3/AmazonS3Client;->֫(Ljava/lang/String;Ljava/lang/String;Lcom/amazonaws/AmazonWebServiceRequest;Lcom/amazonaws/http/HttpMethodName;Ljava/net/URI;)Lcom/amazonaws/DefaultRequest;

    move-result-object v0

    .line 2269
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/DeleteObjectRequest;->ᩳ()Ljava/lang/String;

    move-result-object v1

    .line 2270
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/DeleteObjectRequest;->ܿ()Ljava/lang/String;

    move-result-object p1

    .line 2269
    iget-object v2, p0, Lcom/amazonaws/services/s3/AmazonS3Client;->ۘ:Lcom/amazonaws/services/s3/internal/S3XmlResponseHandler;

    invoke-direct {p0, v0, v2, v1, p1}, Lcom/amazonaws/services/s3/AmazonS3Client;->֫(Lcom/amazonaws/DefaultRequest;Lcom/amazonaws/services/s3/internal/AbstractS3ResponseHandler;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    return-void
.end method

.method public final ֫(Lcom/amazonaws/services/s3/model/DeleteObjectsRequest;)V
    .locals 7

    .line 2281
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/DeleteObjectsRequest;->ᩳ()Ljava/lang/String;

    move-result-object v1

    sget-object v4, Lcom/amazonaws/http/HttpMethodName;->۬:Lcom/amazonaws/http/HttpMethodName;

    const/4 v5, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    move-object v3, p1

    .line 4747
    invoke-virtual/range {v0 .. v5}, Lcom/amazonaws/services/s3/AmazonS3Client;->֫(Ljava/lang/String;Ljava/lang/String;Lcom/amazonaws/AmazonWebServiceRequest;Lcom/amazonaws/http/HttpMethodName;Ljava/net/URI;)Lcom/amazonaws/DefaultRequest;

    move-result-object v0

    const-string v1, "delete"

    .line 2283
    invoke-virtual {v0, v1, v2}, Lcom/amazonaws/DefaultRequest;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    .line 2291
    new-instance v1, Lcom/amazonaws/services/s3/model/transform/MultiObjectDeleteXmlFactory;

    invoke-direct {v1}, Lcom/amazonaws/services/s3/model/transform/MultiObjectDeleteXmlFactory;-><init>()V

    .line 37
    new-instance v1, Lcom/amazonaws/services/s3/internal/XmlWriter;

    invoke-direct {v1}, Lcom/amazonaws/services/s3/internal/XmlWriter;-><init>()V

    const-string v3, "Delete"

    .line 38
    invoke-virtual {v1, v3}, Lcom/amazonaws/services/s3/internal/XmlWriter;->֫(Ljava/lang/String;)V

    .line 39
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/DeleteObjectsRequest;->ܳ()Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v3, "Quiet"

    .line 40
    invoke-virtual {v1, v3}, Lcom/amazonaws/services/s3/internal/XmlWriter;->֫(Ljava/lang/String;)V

    const-string v3, "true"

    invoke-virtual {v1, v3}, Lcom/amazonaws/services/s3/internal/XmlWriter;->ۧ(Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/amazonaws/services/s3/internal/XmlWriter;->֫()V

    .line 43
    :cond_0
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/DeleteObjectsRequest;->ܿ()Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/amazonaws/services/s3/model/DeleteObjectsRequest$KeyVersion;

    const-string v5, "Object"

    .line 53
    invoke-virtual {v1, v5}, Lcom/amazonaws/services/s3/internal/XmlWriter;->֫(Ljava/lang/String;)V

    const-string v5, "Key"

    .line 54
    invoke-virtual {v1, v5}, Lcom/amazonaws/services/s3/internal/XmlWriter;->֫(Ljava/lang/String;)V

    invoke-virtual {v4}, Lcom/amazonaws/services/s3/model/DeleteObjectsRequest$KeyVersion;->֫()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/amazonaws/services/s3/internal/XmlWriter;->ۧ(Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/amazonaws/services/s3/internal/XmlWriter;->֫()V

    .line 58
    invoke-virtual {v1}, Lcom/amazonaws/services/s3/internal/XmlWriter;->֫()V

    goto :goto_0

    .line 47
    :cond_1
    invoke-virtual {v1}, Lcom/amazonaws/services/s3/internal/XmlWriter;->֫()V

    .line 49
    invoke-virtual {v1}, Lcom/amazonaws/services/s3/internal/XmlWriter;->ۧ()[B

    move-result-object v1

    .line 2293
    array-length v3, v1

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    const-string v4, "Content-Length"

    invoke-virtual {v0, v4, v3}, Lcom/amazonaws/DefaultRequest;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "Content-Type"

    const-string v4, "application/xml"

    .line 2294
    invoke-virtual {v0, v3, v4}, Lcom/amazonaws/DefaultRequest;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 2295
    new-instance v3, Ljava/io/ByteArrayInputStream;

    invoke-direct {v3, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-virtual {v0, v3}, Lcom/amazonaws/DefaultRequest;->֫(Ljava/io/InputStream;)V

    :try_start_0
    const-string v3, "MD5"

    .line 86
    invoke-static {v3}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v3

    .line 87
    invoke-virtual {v3, v1}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v1
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 83
    :try_start_1
    invoke-static {v1}, Lcom/amazonaws/util/Base64;->ܽ([B)Ljava/lang/String;

    move-result-object v1

    const-string v3, "Content-MD5"

    .line 2299
    invoke-virtual {v0, v3, v1}, Lcom/amazonaws/DefaultRequest;->֫(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 2306
    new-instance v1, Lcom/amazonaws/services/s3/internal/ResponseHeaderHandlerChain;

    new-instance v3, Lcom/amazonaws/services/s3/model/transform/Unmarshallers$DeleteObjectsResultUnmarshaller;

    invoke-direct {v3}, Lcom/amazonaws/services/s3/model/transform/Unmarshallers$DeleteObjectsResultUnmarshaller;-><init>()V

    new-instance v4, Lcom/amazonaws/services/s3/internal/S3RequesterChargedHeaderHandler;

    invoke-direct {v4}, Lcom/amazonaws/services/s3/internal/S3RequesterChargedHeaderHandler;-><init>()V

    const/4 v5, 0x1

    new-array v5, v5, [Lcom/amazonaws/services/s3/internal/HeaderHandler;

    const/4 v6, 0x0

    aput-object v4, v5, v6

    invoke-direct {v1, v3, v5}, Lcom/amazonaws/services/s3/internal/ResponseHeaderHandlerChain;-><init>(Lcom/amazonaws/transform/Unmarshaller;[Lcom/amazonaws/services/s3/internal/HeaderHandler;)V

    .line 2310
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/DeleteObjectsRequest;->ᩳ()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, v0, v1, p1, v2}, Lcom/amazonaws/services/s3/AmazonS3Client;->֫(Lcom/amazonaws/DefaultRequest;Lcom/amazonaws/services/s3/internal/AbstractS3ResponseHandler;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/amazonaws/services/s3/internal/DeleteObjectsResponse;

    .line 2315
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/internal/DeleteObjectsResponse;->ۧ()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2329
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/internal/DeleteObjectsResponse;->֫()Ljava/util/List;

    move-result-object p1

    .line 34
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 47
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-void

    .line 2316
    :cond_2
    invoke-virtual {v1}, Lcom/amazonaws/services/s3/internal/S3XmlResponseHandler;->ۧ()Ljava/util/Map;

    move-result-object v0

    .line 2318
    new-instance v1, Lcom/amazonaws/services/s3/model/MultiObjectDeleteException;

    .line 2319
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/internal/DeleteObjectsResponse;->ۧ()Ljava/util/List;

    move-result-object v2

    .line 2320
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/internal/DeleteObjectsResponse;->֫()Ljava/util/List;

    move-result-object p1

    invoke-direct {v1, v2, p1}, Lcom/amazonaws/services/s3/model/MultiObjectDeleteException;-><init>(Ljava/util/List;Ljava/util/List;)V

    const/16 p1, 0xc8

    .line 2322
    invoke-virtual {v1, p1}, Lcom/amazonaws/AmazonServiceException;->֫(I)V

    const-string p1, "x-amz-request-id"

    .line 2323
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v1, p1}, Lcom/amazonaws/AmazonServiceException;->ܽ(Ljava/lang/String;)V

    const-string p1, "x-amz-id-2"

    .line 2324
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v1, p1}, Lcom/amazonaws/services/s3/model/AmazonS3Exception;->ܿ(Ljava/lang/String;)V

    const-string p1, "X-Amz-Cf-Id"

    .line 2325
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 2327
    throw v1

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    .line 90
    :try_start_2
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 2301
    :goto_1
    new-instance v0, Lcom/amazonaws/AmazonClientException;

    const-string v1, "Couldn\'t compute md5 sum"

    .line 50
    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 2301
    throw v0
.end method

.method public ֫(Ljava/lang/String;)V
    .locals 1

    const-string v0, "s3-accelerate.amazonaws.com"

    .line 658
    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 662
    invoke-super {p0, p1}, Lcom/amazonaws/AmazonWebServiceClient;->֫(Ljava/lang/String;)V

    const-string v0, "s3.amazonaws.com"

    .line 667
    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 668
    iget-object p1, p0, Lcom/amazonaws/AmazonWebServiceClient;->ܽ:Ljava/net/URI;

    invoke-virtual {p1}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object p1

    const-string v0, "s3"

    invoke-static {p1, v0}, Lcom/amazonaws/util/AwsHostNameUtils;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/amazonaws/services/s3/AmazonS3Client;->ۢ:Ljava/lang/String;

    :cond_0
    return-void

    .line 659
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "To enable accelerate mode, please use AmazonS3Client.setS3ClientOptions(S3ClientOptions.builder().setAccelerateModeEnabled(true).build());"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 6

    .line 1378
    :try_start_0
    new-instance v3, Lcom/amazonaws/services/s3/model/GetObjectMetadataRequest;

    invoke-direct {v3, p1, p2}, Lcom/amazonaws/services/s3/model/GetObjectMetadataRequest;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1393
    invoke-virtual {v3}, Lcom/amazonaws/services/s3/model/GetObjectMetadataRequest;->ᩳ()Ljava/lang/String;

    move-result-object p1

    .line 1394
    invoke-virtual {v3}, Lcom/amazonaws/services/s3/model/GetObjectMetadataRequest;->ܿ()Ljava/lang/String;

    move-result-object p2

    const-string v0, "The bucket name parameter must be specified when requesting an object\'s metadata"

    .line 1397
    invoke-static {p1, v0}, Lcom/amazonaws/util/ValidationUtils;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "The key parameter must be specified when requesting an object\'s metadata"

    .line 1399
    invoke-static {p2, v0}, Lcom/amazonaws/util/ValidationUtils;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1402
    sget-object v4, Lcom/amazonaws/http/HttpMethodName;->ۙ:Lcom/amazonaws/http/HttpMethodName;

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    .line 4747
    invoke-virtual/range {v0 .. v5}, Lcom/amazonaws/services/s3/AmazonS3Client;->֫(Ljava/lang/String;Ljava/lang/String;Lcom/amazonaws/AmazonWebServiceRequest;Lcom/amazonaws/http/HttpMethodName;Ljava/net/URI;)Lcom/amazonaws/DefaultRequest;

    move-result-object v0

    .line 1413
    new-instance v1, Lcom/amazonaws/services/s3/internal/S3MetadataResponseHandler;

    invoke-direct {v1}, Lcom/amazonaws/services/s3/internal/S3MetadataResponseHandler;-><init>()V

    invoke-direct {p0, v0, v1, p1, p2}, Lcom/amazonaws/services/s3/AmazonS3Client;->֫(Lcom/amazonaws/DefaultRequest;Lcom/amazonaws/services/s3/internal/AbstractS3ResponseHandler;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/amazonaws/services/s3/model/ObjectMetadata;
    :try_end_0
    .catch Lcom/amazonaws/services/s3/model/AmazonS3Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    return p1

    :catch_0
    move-exception p1

    .line 1460
    invoke-virtual {p1}, Lcom/amazonaws/AmazonServiceException;->ᩳ()I

    move-result p2

    const/16 v0, 0x194

    if-ne p2, v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 1463
    :cond_0
    throw p1
.end method
