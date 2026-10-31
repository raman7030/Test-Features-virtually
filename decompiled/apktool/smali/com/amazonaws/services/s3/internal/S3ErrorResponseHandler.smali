.class public Lcom/amazonaws/services/s3/internal/S3ErrorResponseHandler;
.super Ljava/lang/Object;
.source "S3ErrorResponseHandler.java"

# interfaces
.implements Lcom/amazonaws/http/HttpResponseHandler;


# static fields
.field public static final ֫:Lcom/amazonaws/logging/Log;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 48
    const-class v0, Lcom/amazonaws/services/s3/internal/S3ErrorResponseHandler;

    invoke-static {v0}, Lcom/amazonaws/logging/LogFactory;->֫(Ljava/lang/Class;)Lcom/amazonaws/logging/Log;

    move-result-object v0

    sput-object v0, Lcom/amazonaws/services/s3/internal/S3ErrorResponseHandler;->֫:Lcom/amazonaws/logging/Log;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫(Ljava/lang/String;Lcom/amazonaws/http/HttpResponse;)Lcom/amazonaws/services/s3/model/AmazonS3Exception;
    .locals 3

    .line 100
    new-instance v0, Lcom/amazonaws/services/s3/model/AmazonS3Exception;

    .line 62
    invoke-direct {v0, p0}, Lcom/amazonaws/AmazonServiceException;-><init>(Ljava/lang/String;)V

    .line 101
    invoke-virtual {p1}, Lcom/amazonaws/http/HttpResponse;->ᩳ()I

    move-result p0

    .line 102
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/amazonaws/http/HttpResponse;->ܿ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/amazonaws/AmazonServiceException;->֫(Ljava/lang/String;)V

    .line 103
    invoke-virtual {v0, p0}, Lcom/amazonaws/AmazonServiceException;->֫(I)V

    .line 126
    sget-object p0, Lcom/amazonaws/AmazonServiceException$ErrorType;->᩹:Lcom/amazonaws/AmazonServiceException$ErrorType;

    .line 105
    invoke-virtual {p1}, Lcom/amazonaws/http/HttpResponse;->ۧ()Ljava/util/Map;

    move-result-object p0

    const-string p1, "x-amz-request-id"

    .line 106
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v0, p1}, Lcom/amazonaws/AmazonServiceException;->ܽ(Ljava/lang/String;)V

    const-string p1, "x-amz-id-2"

    .line 107
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v0, p1}, Lcom/amazonaws/services/s3/model/AmazonS3Exception;->ܿ(Ljava/lang/String;)V

    const-string p1, "X-Amz-Cf-Id"

    .line 108
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 109
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    const-string v1, "x-amz-bucket-region"

    .line 111
    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    .line 110
    invoke-virtual {p1, v1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    invoke-virtual {v0, p1}, Lcom/amazonaws/services/s3/model/AmazonS3Exception;->֫(Ljava/util/HashMap;)V

    return-object v0
.end method


# virtual methods
.method public final ֫(Lcom/amazonaws/http/HttpResponse;)Ljava/lang/Object;
    .locals 7

    .line 58
    sget-object v0, Lcom/amazonaws/services/s3/internal/S3ErrorResponseHandler;->֫:Lcom/amazonaws/logging/Log;

    invoke-virtual {p1}, Lcom/amazonaws/http/HttpResponse;->֫()Ljava/io/InputStream;

    move-result-object v1

    if-nez v1, :cond_0

    .line 60
    invoke-virtual {p1}, Lcom/amazonaws/http/HttpResponse;->ܿ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/amazonaws/services/s3/internal/S3ErrorResponseHandler;->֫(Ljava/lang/String;Lcom/amazonaws/http/HttpResponse;)Lcom/amazonaws/services/s3/model/AmazonS3Exception;

    move-result-object p1

    return-object p1

    .line 65
    :cond_0
    :try_start_0
    invoke-static {v1}, Lcom/amazonaws/util/IOUtils;->ۧ(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 73
    :try_start_1
    invoke-static {v1}, Lcom/amazonaws/util/XpathUtils;->֫(Ljava/lang/String;)Lorg/w3c/dom/Document;

    move-result-object v2

    const-string v3, "Error/Message"

    .line 74
    invoke-static {v3, v2}, Lcom/amazonaws/util/XpathUtils;->֫(Ljava/lang/String;Lorg/w3c/dom/Document;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "Error/Code"

    .line 75
    invoke-static {v4, v2}, Lcom/amazonaws/util/XpathUtils;->֫(Ljava/lang/String;Lorg/w3c/dom/Document;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "Error/RequestId"

    .line 76
    invoke-static {v5, v2}, Lcom/amazonaws/util/XpathUtils;->֫(Ljava/lang/String;Lorg/w3c/dom/Document;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "Error/HostId"

    .line 77
    invoke-static {v6, v2}, Lcom/amazonaws/util/XpathUtils;->֫(Ljava/lang/String;Lorg/w3c/dom/Document;)Ljava/lang/String;

    move-result-object v2

    .line 78
    new-instance v6, Lcom/amazonaws/services/s3/model/AmazonS3Exception;

    .line 62
    invoke-direct {v6, v3}, Lcom/amazonaws/AmazonServiceException;-><init>(Ljava/lang/String;)V

    .line 79
    invoke-virtual {p1}, Lcom/amazonaws/http/HttpResponse;->ᩳ()I

    move-result v3

    .line 80
    invoke-virtual {v6, v3}, Lcom/amazonaws/AmazonServiceException;->֫(I)V

    .line 126
    sget-object v3, Lcom/amazonaws/AmazonServiceException$ErrorType;->᩹:Lcom/amazonaws/AmazonServiceException$ErrorType;

    .line 82
    invoke-virtual {v6, v4}, Lcom/amazonaws/AmazonServiceException;->֫(Ljava/lang/String;)V

    .line 83
    invoke-virtual {v6, v5}, Lcom/amazonaws/AmazonServiceException;->ܽ(Ljava/lang/String;)V

    .line 84
    invoke-virtual {v6, v2}, Lcom/amazonaws/services/s3/model/AmazonS3Exception;->ܿ(Ljava/lang/String;)V

    .line 85
    invoke-virtual {p1}, Lcom/amazonaws/http/HttpResponse;->ۧ()Ljava/util/Map;

    move-result-object v2

    const-string v3, "X-Amz-Cf-Id"

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object v6

    :catch_0
    move-exception v2

    .line 88
    invoke-interface {v0}, Lcom/amazonaws/logging/Log;->֫()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 89
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Failed in parsing the response as XML: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3, v2}, Lcom/amazonaws/logging/Log;->֫(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 91
    :cond_1
    invoke-static {v1, p1}, Lcom/amazonaws/services/s3/internal/S3ErrorResponseHandler;->֫(Ljava/lang/String;Lcom/amazonaws/http/HttpResponse;)Lcom/amazonaws/services/s3/model/AmazonS3Exception;

    move-result-object p1

    goto :goto_0

    :catch_1
    move-exception v1

    .line 67
    invoke-interface {v0}, Lcom/amazonaws/logging/Log;->֫()Z

    move-result v2

    if-eqz v2, :cond_2

    const-string v2, "Failed in reading the error response"

    .line 68
    invoke-interface {v0, v2, v1}, Lcom/amazonaws/logging/Log;->֫(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 70
    :cond_2
    invoke-virtual {p1}, Lcom/amazonaws/http/HttpResponse;->ܿ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/amazonaws/services/s3/internal/S3ErrorResponseHandler;->֫(Ljava/lang/String;Lcom/amazonaws/http/HttpResponse;)Lcom/amazonaws/services/s3/model/AmazonS3Exception;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final ֫()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
