.class public abstract Lcom/amazonaws/services/s3/internal/AbstractS3ResponseHandler;
.super Ljava/lang/Object;
.source "AbstractS3ResponseHandler.java"

# interfaces
.implements Lcom/amazonaws/http/HttpResponseHandler;


# static fields
.field public static final ֫:Ljava/util/HashSet;

.field public static final ۧ:Lcom/amazonaws/logging/Log;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 48
    const-class v0, Lcom/amazonaws/services/s3/internal/S3MetadataResponseHandler;

    invoke-static {v0}, Lcom/amazonaws/logging/LogFactory;->֫(Ljava/lang/Class;)Lcom/amazonaws/logging/Log;

    move-result-object v0

    sput-object v0, Lcom/amazonaws/services/s3/internal/AbstractS3ResponseHandler;->ۧ:Lcom/amazonaws/logging/Log;

    .line 54
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    sput-object v0, Lcom/amazonaws/services/s3/internal/AbstractS3ResponseHandler;->֫:Ljava/util/HashSet;

    const-string v1, "Date"

    .line 55
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v1, "Server"

    .line 56
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v1, "x-amz-request-id"

    .line 57
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v1, "x-amz-id-2"

    .line 58
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v1, "X-Amz-Cf-Id"

    .line 59
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v1, "Connection"

    .line 60
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫(Lcom/amazonaws/http/HttpResponse;Lcom/amazonaws/services/s3/model/ObjectMetadata;)V
    .locals 7

    .line 110
    invoke-virtual {p0}, Lcom/amazonaws/http/HttpResponse;->ۧ()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 111
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v3, "x-amz-meta-"

    .line 112
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0xb

    .line 113
    invoke-virtual {v2, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    .line 114
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p1, v2, v1}, Lcom/amazonaws/services/s3/model/ObjectMetadata;->֫(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 115
    :cond_0
    sget-object v3, Lcom/amazonaws/services/s3/internal/AbstractS3ResponseHandler;->֫:Ljava/util/HashSet;

    invoke-virtual {v3, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v3

    sget-object v4, Lcom/amazonaws/services/s3/internal/AbstractS3ResponseHandler;->ۧ:Lcom/amazonaws/logging/Log;

    if-eqz v3, :cond_1

    const-string v1, " is ignored."

    .line 116
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v1}, Lcom/amazonaws/logging/Log;->ۧ(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const-string v3, "Last-Modified"

    .line 117
    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    const-string v5, "EEE, dd MMM yyyy HH:mm:ss z"

    if-eqz v3, :cond_2

    .line 119
    :try_start_0
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    sget v6, Lcom/amazonaws/services/s3/internal/ServiceUtils;->֫:I

    .line 149
    invoke-static {v5, v3}, Lcom/amazonaws/util/DateUtils;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Date;

    move-result-object v3

    .line 119
    invoke-virtual {p1, v3, v2}, Lcom/amazonaws/services/s3/model/ObjectMetadata;->֫(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    .line 121
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v5, "Unable to parse last modified date: "

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v1, v2}, Lcom/amazonaws/logging/Log;->ܽ(Ljava/lang/String;Ljava/lang/Exception;)V

    goto :goto_0

    :cond_2
    const-string v3, "Content-Length"

    .line 123
    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 125
    :try_start_1
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {p1, v3, v2}, Lcom/amazonaws/services/s3/model/ObjectMetadata;->֫(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    goto/16 :goto_0

    :catch_1
    move-exception v2

    .line 127
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v5, "Unable to parse content length: "

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v1, v2}, Lcom/amazonaws/logging/Log;->ܽ(Ljava/lang/String;Ljava/lang/Exception;)V

    goto/16 :goto_0

    :cond_3
    const-string v3, "ETag"

    .line 129
    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 130
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Lcom/amazonaws/services/s3/internal/ServiceUtils;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, v2}, Lcom/amazonaws/services/s3/model/ObjectMetadata;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_4
    const-string v3, "Expires"

    .line 131
    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 133
    :try_start_2
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 149
    invoke-static {v5, v2}, Lcom/amazonaws/util/DateUtils;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Date;

    move-result-object v2

    .line 133
    invoke-virtual {p1, v2}, Lcom/amazonaws/services/s3/model/ObjectMetadata;->ܽ(Ljava/util/Date;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto/16 :goto_0

    :catch_2
    move-exception v2

    .line 135
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v5, "Unable to parse http expiration date: "

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v1, v2}, Lcom/amazonaws/logging/Log;->ܽ(Ljava/lang/String;Ljava/lang/Exception;)V

    goto/16 :goto_0

    :cond_5
    const-string v3, "x-amz-expiration"

    .line 137
    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 138
    new-instance v1, Lcom/amazonaws/services/s3/internal/ObjectExpirationHeaderHandler;

    invoke-direct {v1}, Lcom/amazonaws/services/s3/internal/ObjectExpirationHeaderHandler;-><init>()V

    invoke-static {p1, p0}, Lcom/amazonaws/services/s3/internal/ObjectExpirationHeaderHandler;->֫(Lcom/amazonaws/services/s3/internal/ObjectExpirationResult;Lcom/amazonaws/http/HttpResponse;)V

    goto/16 :goto_0

    :cond_6
    const-string v3, "x-amz-restore"

    .line 139
    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_7

    .line 140
    new-instance v1, Lcom/amazonaws/services/s3/internal/ObjectRestoreHeaderHandler;

    invoke-direct {v1}, Lcom/amazonaws/services/s3/internal/ObjectRestoreHeaderHandler;-><init>()V

    invoke-static {p1, p0}, Lcom/amazonaws/services/s3/internal/ObjectRestoreHeaderHandler;->֫(Lcom/amazonaws/services/s3/internal/ObjectRestoreResult;Lcom/amazonaws/http/HttpResponse;)V

    goto/16 :goto_0

    :cond_7
    const-string v3, "x-amz-request-charged"

    .line 141
    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_9

    .line 142
    new-instance v1, Lcom/amazonaws/services/s3/internal/S3RequesterChargedHeaderHandler;

    invoke-direct {v1}, Lcom/amazonaws/services/s3/internal/S3RequesterChargedHeaderHandler;-><init>()V

    .line 38
    invoke-virtual {p0}, Lcom/amazonaws/http/HttpResponse;->ۧ()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_8

    const/4 v1, 0x1

    goto :goto_1

    :cond_8
    const/4 v1, 0x0

    .line 37
    :goto_1
    invoke-virtual {p1, v1}, Lcom/amazonaws/services/s3/model/ObjectMetadata;->֫(Z)V

    goto/16 :goto_0

    :cond_9
    const-string v3, "x-amz-mp-parts-count"

    .line 144
    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_a

    .line 146
    :try_start_3
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v1, v2}, Lcom/amazonaws/services/s3/model/ObjectMetadata;->֫(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_3

    goto/16 :goto_0

    :catch_3
    move-exception p0

    .line 148
    new-instance p1, Lcom/amazonaws/AmazonClientException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unable to parse part count. Header x-amz-mp-parts-count has corrupted data"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 150
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 50
    invoke-direct {p1, v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 150
    throw p1

    .line 154
    :cond_a
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p1, v1, v2}, Lcom/amazonaws/services/s3/model/ObjectMetadata;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_b
    return-void
.end method

.method public static ۧ(Lcom/amazonaws/http/HttpResponse;)Lcom/amazonaws/AmazonWebServiceResponse;
    .locals 5

    .line 86
    new-instance v0, Lcom/amazonaws/AmazonWebServiceResponse;

    invoke-direct {v0}, Lcom/amazonaws/AmazonWebServiceResponse;-><init>()V

    .line 87
    invoke-virtual {p0}, Lcom/amazonaws/http/HttpResponse;->ۧ()Ljava/util/Map;

    move-result-object v1

    const-string v2, "x-amz-request-id"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 88
    invoke-virtual {p0}, Lcom/amazonaws/http/HttpResponse;->ۧ()Ljava/util/Map;

    move-result-object v2

    const-string v3, "x-amz-id-2"

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 89
    invoke-virtual {p0}, Lcom/amazonaws/http/HttpResponse;->ۧ()Ljava/util/Map;

    move-result-object p0

    const-string v3, "X-Amz-Cf-Id"

    invoke-interface {p0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    .line 91
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    const-string v4, "AWS_REQUEST_ID"

    .line 92
    invoke-virtual {v3, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "HOST_ID"

    .line 93
    invoke-virtual {v3, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "CLOUD_FRONT_ID"

    .line 94
    invoke-virtual {v3, v1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    new-instance p0, Lcom/amazonaws/services/s3/S3ResponseMetadata;

    .line 43
    invoke-direct {p0, v3}, Lcom/amazonaws/ResponseMetadata;-><init>(Ljava/util/HashMap;)V

    .line 95
    invoke-virtual {v0, p0}, Lcom/amazonaws/AmazonWebServiceResponse;->֫(Lcom/amazonaws/services/s3/S3ResponseMetadata;)V

    return-object v0
.end method


# virtual methods
.method public ֫()Z
    .locals 1

    .line 0
    instance-of v0, p0, Lcom/amazonaws/services/s3/internal/S3ObjectResponseHandler;

    return v0
.end method
