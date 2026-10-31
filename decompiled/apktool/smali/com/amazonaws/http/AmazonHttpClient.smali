.class public Lcom/amazonaws/http/AmazonHttpClient;
.super Ljava/lang/Object;
.source "AmazonHttpClient.java"


# static fields
.field public static final ܿ:Lcom/amazonaws/logging/Log;

.field public static final ᩳ:Lcom/amazonaws/logging/Log;


# instance fields
.field public final ֫:Lcom/amazonaws/ClientConfiguration;

.field public final ۧ:Lcom/amazonaws/http/UrlHttpClient;

.field public final ܽ:Lcom/amazonaws/http/HttpRequestFactory;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "com.amazonaws.request"

    .line 82
    invoke-static {v0}, Lcom/amazonaws/logging/LogFactory;->֫(Ljava/lang/String;)Lcom/amazonaws/logging/Log;

    move-result-object v0

    sput-object v0, Lcom/amazonaws/http/AmazonHttpClient;->ᩳ:Lcom/amazonaws/logging/Log;

    .line 88
    const-class v0, Lcom/amazonaws/http/AmazonHttpClient;

    invoke-static {v0}, Lcom/amazonaws/logging/LogFactory;->֫(Ljava/lang/Class;)Lcom/amazonaws/logging/Log;

    move-result-object v0

    sput-object v0, Lcom/amazonaws/http/AmazonHttpClient;->ܿ:Lcom/amazonaws/logging/Log;

    return-void
.end method

.method public constructor <init>(Lcom/amazonaws/ClientConfiguration;Lcom/amazonaws/http/UrlHttpClient;)V
    .locals 1

    .line 144
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 105
    new-instance v0, Lcom/amazonaws/http/HttpRequestFactory;

    invoke-direct {v0}, Lcom/amazonaws/http/HttpRequestFactory;-><init>()V

    iput-object v0, p0, Lcom/amazonaws/http/AmazonHttpClient;->ܽ:Lcom/amazonaws/http/HttpRequestFactory;

    .line 145
    iput-object p1, p0, Lcom/amazonaws/http/AmazonHttpClient;->֫:Lcom/amazonaws/ClientConfiguration;

    .line 146
    iput-object p2, p0, Lcom/amazonaws/http/AmazonHttpClient;->ۧ:Lcom/amazonaws/http/UrlHttpClient;

    return-void
.end method

.method public static ֫(Lcom/amazonaws/AmazonWebServiceRequest;Lcom/amazonaws/AmazonClientException;ILcom/amazonaws/retry/RetryPolicy;)J
    .locals 2

    add-int/lit8 p2, p2, -0x2

    .line 766
    invoke-virtual {p3}, Lcom/amazonaws/retry/RetryPolicy;->֫()Lcom/amazonaws/retry/RetryPolicy$BackoffStrategy;

    move-result-object p0

    invoke-interface {p0, p2}, Lcom/amazonaws/retry/RetryPolicy$BackoffStrategy;->֫(I)J

    move-result-wide p0

    .line 769
    sget-object p3, Lcom/amazonaws/http/AmazonHttpClient;->ܿ:Lcom/amazonaws/logging/Log;

    invoke-interface {p3}, Lcom/amazonaws/logging/Log;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 770
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Retriable error detected, will retry in "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, "ms, attempt number: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p3, p2}, Lcom/amazonaws/logging/Log;->ۧ(Ljava/lang/String;)V

    .line 775
    :cond_0
    :try_start_0
    invoke-static {p0, p1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide p0

    :catch_0
    move-exception p0

    .line 778
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    .line 779
    new-instance p1, Lcom/amazonaws/AmazonClientException;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    .line 50
    invoke-direct {p1, p2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 779
    throw p1
.end method

.method public static ֫(Lcom/amazonaws/http/HttpResponse;Lcom/amazonaws/AmazonServiceException;)J
    .locals 4

    .line 807
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    .line 810
    invoke-virtual {p0}, Lcom/amazonaws/http/HttpResponse;->ۧ()Ljava/util/Map;

    move-result-object p0

    const-string v1, "Date"

    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz p0, :cond_1

    .line 814
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v2
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    :try_start_1
    const-string p1, "EEE, dd MMM yyyy HH:mm:ss z"

    .line 149
    invoke-static {p1, p0}, Lcom/amazonaws/util/DateUtils;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Date;

    move-result-object p0
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_3

    .line 816
    :cond_1
    :goto_0
    :try_start_2
    invoke-virtual {p1}, Lcom/amazonaws/AmazonServiceException;->getMessage()Ljava/lang/String;

    move-result-object p0

    const-string p1, "("

    .line 795
    invoke-virtual {p0, p1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result p1

    const-string v2, " + 15"

    .line 797
    invoke-virtual {p0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 798
    invoke-virtual {p0, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v2

    goto :goto_1

    :cond_2
    const-string v2, " - 15"

    .line 800
    invoke-virtual {p0, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v2

    :goto_1
    add-int/lit8 p1, p1, 0x1

    .line 802
    invoke-virtual {p0, p1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1

    :try_start_3
    const-string p1, "yyyyMMdd\'T\'HHmmss\'Z\'"

    .line 170
    invoke-static {p1, p0}, Lcom/amazonaws/util/DateUtils;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Date;

    move-result-object p0
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_0

    .line 829
    :goto_2
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {p0}, Ljava/util/Date;->getTime()J

    move-result-wide p0

    sub-long/2addr v0, p0

    const-wide/16 p0, 0x3e8

    .line 830
    div-long/2addr v0, p0

    return-wide v0

    :goto_3
    move-object v1, p0

    goto :goto_4

    :catch_1
    move-exception p0

    move-object p1, p0

    .line 823
    :goto_4
    new-instance p0, Ljava/lang/StringBuilder;

    const-string v0, "Unable to parse clock skew offset from response: "

    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    sget-object v0, Lcom/amazonaws/http/AmazonHttpClient;->ܿ:Lcom/amazonaws/logging/Log;

    invoke-interface {v0, p0, p1}, Lcom/amazonaws/logging/Log;->ܽ(Ljava/lang/String;Ljava/lang/Exception;)V

    const-wide/16 p0, 0x0

    return-wide p0
.end method

.method public static ֫(Lcom/amazonaws/DefaultRequest;Lcom/amazonaws/http/HttpResponseHandler;Lcom/amazonaws/http/HttpResponse;)Lcom/amazonaws/AmazonServiceException;
    .locals 4

    const-string v0, "Received error response: "

    .line 707
    invoke-virtual {p2}, Lcom/amazonaws/http/HttpResponse;->ᩳ()I

    move-result v1

    .line 711
    :try_start_0
    invoke-interface {p1, p2}, Lcom/amazonaws/http/HttpResponseHandler;->֫(Lcom/amazonaws/http/HttpResponse;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/amazonaws/AmazonServiceException;

    .line 712
    sget-object v2, Lcom/amazonaws/http/AmazonHttpClient;->ᩳ:Lcom/amazonaws/logging/Log;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Lcom/amazonaws/logging/Log;->ۧ(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const/16 v0, 0x19d

    if-ne v1, v0, :cond_0

    .line 717
    new-instance p1, Lcom/amazonaws/AmazonServiceException;

    const-string p2, "Request entity too large"

    invoke-direct {p1, p2}, Lcom/amazonaws/AmazonServiceException;-><init>(Ljava/lang/String;)V

    .line 718
    invoke-virtual {p0}, Lcom/amazonaws/DefaultRequest;->ۜ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/amazonaws/AmazonServiceException;->ᩳ(Ljava/lang/String;)V

    .line 719
    invoke-virtual {p1, v0}, Lcom/amazonaws/AmazonServiceException;->֫(I)V

    .line 720
    sget-object v0, Lcom/amazonaws/AmazonServiceException$ErrorType;->᩹:Lcom/amazonaws/AmazonServiceException$ErrorType;

    .line 721
    invoke-virtual {p1, p2}, Lcom/amazonaws/AmazonServiceException;->֫(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/16 v0, 0x1f7

    if-ne v1, v0, :cond_1

    const-string v2, "Service Unavailable"

    .line 723
    invoke-virtual {p2}, Lcom/amazonaws/http/HttpResponse;->ܿ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 724
    new-instance p1, Lcom/amazonaws/AmazonServiceException;

    const-string p2, "Service unavailable"

    invoke-direct {p1, p2}, Lcom/amazonaws/AmazonServiceException;-><init>(Ljava/lang/String;)V

    .line 725
    invoke-virtual {p0}, Lcom/amazonaws/DefaultRequest;->ۜ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/amazonaws/AmazonServiceException;->ᩳ(Ljava/lang/String;)V

    .line 726
    invoke-virtual {p1, v0}, Lcom/amazonaws/AmazonServiceException;->֫(I)V

    .line 727
    sget-object v0, Lcom/amazonaws/AmazonServiceException$ErrorType;->᩹:Lcom/amazonaws/AmazonServiceException$ErrorType;

    .line 728
    invoke-virtual {p1, p2}, Lcom/amazonaws/AmazonServiceException;->֫(Ljava/lang/String;)V

    .line 740
    :goto_0
    invoke-virtual {p1, v1}, Lcom/amazonaws/AmazonServiceException;->֫(I)V

    .line 741
    invoke-virtual {p0}, Lcom/amazonaws/DefaultRequest;->ۜ()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/amazonaws/AmazonServiceException;->ᩳ(Ljava/lang/String;)V

    .line 742
    invoke-virtual {p1}, Ljava/lang/Throwable;->fillInStackTrace()Ljava/lang/Throwable;

    return-object p1

    .line 729
    :cond_1
    instance-of p0, p1, Ljava/io/IOException;

    if-eqz p0, :cond_2

    .line 730
    check-cast p1, Ljava/io/IOException;

    throw p1

    .line 732
    :cond_2
    new-instance p0, Ljava/lang/StringBuilder;

    const-string v0, "Unable to unmarshall error response ("

    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "). Response Code: "

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", Response Text: "

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 734
    invoke-virtual {p2}, Lcom/amazonaws/http/HttpResponse;->ܿ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", Response Headers: "

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 735
    invoke-virtual {p2}, Lcom/amazonaws/http/HttpResponse;->ۧ()Ljava/util/Map;

    move-result-object p2

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 736
    new-instance p2, Lcom/amazonaws/AmazonClientException;

    .line 50
    invoke-direct {p2, p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 736
    throw p2
.end method

.method public static ֫(Lcom/amazonaws/http/HttpResponseHandler;Lcom/amazonaws/http/HttpResponse;Lcom/amazonaws/services/s3/internal/S3ExecutionContext;)Ljava/lang/Object;
    .locals 4

    const-string v0, ", Response Text: "

    const-string v1, "Received successful response: "

    const-string v2, "Unable to unmarshall response metadata. Response Code: "

    .line 657
    :try_start_0
    invoke-virtual {p2}, Lcom/amazonaws/http/ExecutionContext;->֫()Lcom/amazonaws/util/AWSRequestMetrics;

    move-result-object p2

    .line 659
    sget-object v3, Lcom/amazonaws/util/AWSRequestMetrics$Field;->ܽ֫:Lcom/amazonaws/util/AWSRequestMetrics$Field;

    invoke-virtual {p2, v3}, Lcom/amazonaws/util/AWSRequestMetrics;->ܽ(Lcom/amazonaws/util/AWSRequestMetrics$Field;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 661
    :try_start_1
    invoke-interface {p0, p1}, Lcom/amazonaws/http/HttpResponseHandler;->֫(Lcom/amazonaws/http/HttpResponse;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/amazonaws/AmazonWebServiceResponse;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 663
    :try_start_2
    invoke-virtual {p2, v3}, Lcom/amazonaws/util/AWSRequestMetrics;->֫(Lcom/amazonaws/util/AWSRequestMetrics$Field;)V

    if-eqz p0, :cond_1

    .line 673
    sget-object v2, Lcom/amazonaws/http/AmazonHttpClient;->ᩳ:Lcom/amazonaws/logging/Log;

    invoke-interface {v2}, Lcom/amazonaws/logging/Log;->֫()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 674
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/amazonaws/http/HttpResponse;->ᩳ()I

    move-result v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", AWS Request ID: "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 675
    invoke-virtual {p0}, Lcom/amazonaws/AmazonWebServiceResponse;->֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 674
    invoke-interface {v2, v1}, Lcom/amazonaws/logging/Log;->ۧ(Ljava/lang/String;)V

    .line 677
    :cond_0
    sget-object v1, Lcom/amazonaws/util/AWSRequestMetrics$Field;->᩶:Lcom/amazonaws/util/AWSRequestMetrics$Field;

    invoke-virtual {p0}, Lcom/amazonaws/AmazonWebServiceResponse;->֫()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v1, v2}, Lcom/amazonaws/util/AWSRequestMetrics;->֫(Lcom/amazonaws/util/AWSRequestMetrics$Field;Ljava/io/Serializable;)V

    .line 679
    invoke-virtual {p0}, Lcom/amazonaws/AmazonWebServiceResponse;->ۧ()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 667
    :cond_1
    new-instance p0, Ljava/lang/RuntimeException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 669
    invoke-virtual {p1}, Lcom/amazonaws/http/HttpResponse;->ᩳ()I

    move-result v1

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 670
    invoke-virtual {p1}, Lcom/amazonaws/http/HttpResponse;->ܿ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    :catchall_0
    move-exception p0

    .line 663
    sget-object v1, Lcom/amazonaws/util/AWSRequestMetrics$Field;->ܽ֫:Lcom/amazonaws/util/AWSRequestMetrics$Field;

    invoke-virtual {p2, v1}, Lcom/amazonaws/util/AWSRequestMetrics;->֫(Lcom/amazonaws/util/AWSRequestMetrics$Field;)V

    .line 664
    throw p0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    move-exception p0

    .line 685
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v1, "Unable to unmarshall response ("

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "). Response Code: "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 687
    invoke-virtual {p1}, Lcom/amazonaws/http/HttpResponse;->ᩳ()I

    move-result v1

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/amazonaws/http/HttpResponse;->ܿ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 688
    new-instance p2, Lcom/amazonaws/AmazonClientException;

    .line 50
    invoke-direct {p2, p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 688
    throw p2

    :catch_1
    move-exception p0

    .line 683
    throw p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 560
    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    .line 563
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Lcom/amazonaws/DefaultRequest;Ljava/lang/Exception;)V
    .locals 1

    .line 514
    invoke-virtual {p0}, Lcom/amazonaws/DefaultRequest;->֫()Ljava/io/InputStream;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 517
    :cond_0
    invoke-virtual {p0}, Lcom/amazonaws/DefaultRequest;->֫()Ljava/io/InputStream;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/InputStream;->markSupported()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 522
    :try_start_0
    invoke-virtual {p0}, Lcom/amazonaws/DefaultRequest;->֫()Ljava/io/InputStream;

    move-result-object p0

    invoke-virtual {p0}, Ljava/io/InputStream;->reset()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 526
    :catch_0
    new-instance p0, Lcom/amazonaws/AmazonClientException;

    const-string v0, "Encountered an exception and couldn\'t reset the stream to retry"

    .line 50
    invoke-direct {p0, v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 526
    throw p0

    .line 518
    :cond_1
    new-instance p0, Lcom/amazonaws/AmazonClientException;

    const-string v0, "Encountered an exception and stream is not resettable"

    .line 50
    invoke-direct {p0, v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 518
    throw p0
.end method

.method private ֫(Lcom/amazonaws/AmazonWebServiceRequest;Ljava/io/InputStream;Lcom/amazonaws/AmazonClientException;ILcom/amazonaws/retry/RetryPolicy;)Z
    .locals 1

    add-int/lit8 p4, p4, -0x1

    .line 594
    iget-object p1, p0, Lcom/amazonaws/http/AmazonHttpClient;->֫:Lcom/amazonaws/ClientConfiguration;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 601
    invoke-virtual {p5}, Lcom/amazonaws/retry/RetryPolicy;->ۧ()I

    move-result p1

    const/4 v0, 0x0

    if-lt p4, p1, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_2

    .line 610
    invoke-virtual {p2}, Ljava/io/InputStream;->markSupported()Z

    move-result p1

    if-nez p1, :cond_2

    .line 611
    sget-object p1, Lcom/amazonaws/http/AmazonHttpClient;->ܿ:Lcom/amazonaws/logging/Log;

    invoke-interface {p1}, Lcom/amazonaws/logging/Log;->֫()Z

    move-result p2

    if-eqz p2, :cond_1

    const-string p2, "Content not repeatable"

    .line 612
    invoke-interface {p1, p2}, Lcom/amazonaws/logging/Log;->ۧ(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return v0

    .line 619
    :cond_2
    invoke-virtual {p5}, Lcom/amazonaws/retry/RetryPolicy;->ܽ()Lcom/amazonaws/retry/RetryPolicy$RetryCondition;

    move-result-object p1

    invoke-interface {p1, p3, p4}, Lcom/amazonaws/retry/RetryPolicy$RetryCondition;->֫(Lcom/amazonaws/AmazonClientException;I)Z

    move-result p1

    return p1
.end method

.method public static ֫(Lcom/amazonaws/http/HttpResponse;)Z
    .locals 2

    .line 625
    invoke-virtual {p0}, Lcom/amazonaws/http/HttpResponse;->ᩳ()I

    move-result v0

    .line 626
    invoke-virtual {p0}, Lcom/amazonaws/http/HttpResponse;->ۧ()Ljava/util/Map;

    move-result-object p0

    const-string v1, "Location"

    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    const/16 v1, 0x133

    if-ne v0, v1, :cond_0

    if-eqz p0, :cond_0

    .line 628
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final finalize()V
    .locals 1

    .line 574
    iget-object v0, p0, Lcom/amazonaws/http/AmazonHttpClient;->ۧ:Lcom/amazonaws/http/UrlHttpClient;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 836
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    return-void
.end method

.method public final ֫(Lcom/amazonaws/DefaultRequest;Lcom/amazonaws/http/HttpResponseHandler;Lcom/amazonaws/http/HttpResponseHandler;Lcom/amazonaws/services/s3/internal/S3ExecutionContext;)Lcom/amazonaws/Response;
    .locals 5

    .line 259
    invoke-virtual {p4}, Lcom/amazonaws/http/ExecutionContext;->ܽ()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    .line 261
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    goto :goto_1

    .line 265
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/amazonaws/handlers/RequestHandler2;

    .line 268
    instance-of v3, v2, Lcom/amazonaws/handlers/CredentialsRequestHandler;

    if-eqz v3, :cond_1

    .line 269
    move-object v3, v2

    check-cast v3, Lcom/amazonaws/handlers/CredentialsRequestHandler;

    .line 270
    invoke-virtual {p4}, Lcom/amazonaws/http/ExecutionContext;->ۧ()Lcom/amazonaws/auth/AWSCredentials;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/amazonaws/handlers/CredentialsRequestHandler;->֫(Lcom/amazonaws/auth/AWSCredentials;)V

    .line 272
    :cond_1
    invoke-virtual {v2, p1}, Lcom/amazonaws/handlers/RequestHandler2;->֫(Lcom/amazonaws/DefaultRequest;)V

    goto :goto_0

    .line 226
    :cond_2
    :goto_1
    invoke-virtual {p4}, Lcom/amazonaws/http/ExecutionContext;->֫()Lcom/amazonaws/util/AWSRequestMetrics;

    move-result-object v1

    .line 229
    :try_start_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/amazonaws/http/AmazonHttpClient;->ۧ(Lcom/amazonaws/DefaultRequest;Lcom/amazonaws/http/HttpResponseHandler;Lcom/amazonaws/http/HttpResponseHandler;Lcom/amazonaws/services/s3/internal/S3ExecutionContext;)Lcom/amazonaws/Response;

    move-result-object p2

    .line 231
    invoke-virtual {v1}, Lcom/amazonaws/util/AWSRequestMetrics;->֫()Lcom/amazonaws/util/TimingInfo;

    move-result-object p3

    invoke-virtual {p3}, Lcom/amazonaws/util/TimingInfo;->֫()V

    .line 251
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_2
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_3

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lcom/amazonaws/handlers/RequestHandler2;

    .line 252
    invoke-virtual {p4, p1, p2}, Lcom/amazonaws/handlers/RequestHandler2;->֫(Lcom/amazonaws/DefaultRequest;Lcom/amazonaws/Response;)V
    :try_end_0
    .catch Lcom/amazonaws/AmazonClientException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :cond_3
    return-object p2

    :catch_0
    move-exception p2

    .line 242
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_3
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_4

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lcom/amazonaws/handlers/RequestHandler2;

    .line 243
    invoke-virtual {p4, p1, p2}, Lcom/amazonaws/handlers/RequestHandler2;->֫(Lcom/amazonaws/DefaultRequest;Lcom/amazonaws/AmazonClientException;)V

    goto :goto_3

    .line 236
    :cond_4
    throw p2
.end method

.method public final ۧ(Lcom/amazonaws/DefaultRequest;Lcom/amazonaws/http/HttpResponseHandler;Lcom/amazonaws/http/HttpResponseHandler;Lcom/amazonaws/services/s3/internal/S3ExecutionContext;)Lcom/amazonaws/Response;
    .locals 28

    move-object/from16 v7, p0

    move-object/from16 v8, p1

    .line 296
    invoke-virtual/range {p4 .. p4}, Lcom/amazonaws/http/ExecutionContext;->֫()Lcom/amazonaws/util/AWSRequestMetrics;

    move-result-object v9

    .line 301
    sget-object v0, Lcom/amazonaws/util/AWSRequestMetrics$Field;->᩻֫:Lcom/amazonaws/util/AWSRequestMetrics$Field;

    invoke-virtual/range {p1 .. p1}, Lcom/amazonaws/DefaultRequest;->ۜ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v0, v1}, Lcom/amazonaws/util/AWSRequestMetrics;->֫(Lcom/amazonaws/util/AWSRequestMetrics$Field;Ljava/io/Serializable;)V

    .line 302
    sget-object v0, Lcom/amazonaws/util/AWSRequestMetrics$Field;->ܳ֫:Lcom/amazonaws/util/AWSRequestMetrics$Field;

    invoke-virtual/range {p1 .. p1}, Lcom/amazonaws/DefaultRequest;->ۧ()Ljava/net/URI;

    move-result-object v1

    invoke-virtual {v9, v0, v1}, Lcom/amazonaws/util/AWSRequestMetrics;->֫(Lcom/amazonaws/util/AWSRequestMetrics$Field;Ljava/io/Serializable;)V

    .line 536
    sget-object v0, Lcom/amazonaws/ClientConfiguration;->᩷:Ljava/lang/String;

    .line 538
    invoke-virtual/range {p1 .. p1}, Lcom/amazonaws/DefaultRequest;->ܿ()Lcom/amazonaws/AmazonWebServiceRequest;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 540
    invoke-virtual {v1}, Lcom/amazonaws/AmazonWebServiceRequest;->ܽ()Lcom/amazonaws/RequestClientOptions;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 542
    sget-object v2, Lcom/amazonaws/RequestClientOptions$Marker;->᩹:Lcom/amazonaws/RequestClientOptions$Marker;

    invoke-virtual {v1, v2}, Lcom/amazonaws/RequestClientOptions;->֫(Lcom/amazonaws/RequestClientOptions$Marker;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 544
    invoke-static {v0, v1}, Lcom/amazonaws/http/AmazonHttpClient;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    .line 549
    :goto_0
    iget-object v10, v7, Lcom/amazonaws/http/AmazonHttpClient;->֫:Lcom/amazonaws/ClientConfiguration;

    invoke-virtual {v10}, Lcom/amazonaws/ClientConfiguration;->ܳ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 550
    invoke-virtual {v10}, Lcom/amazonaws/ClientConfiguration;->ܳ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/amazonaws/http/AmazonHttpClient;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 553
    :cond_1
    invoke-virtual {v10}, Lcom/amazonaws/ClientConfiguration;->᩻()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v10}, Lcom/amazonaws/ClientConfiguration;->᩻()Ljava/lang/String;

    move-result-object v1

    :cond_2
    const-string v0, "User-Agent"

    .line 552
    invoke-virtual {v8, v0, v1}, Lcom/amazonaws/DefaultRequest;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 307
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "aws-sdk-invocation-id"

    invoke-virtual {v8, v1, v0}, Lcom/amazonaws/DefaultRequest;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 315
    new-instance v11, Ljava/util/LinkedHashMap;

    .line 316
    invoke-virtual/range {p1 .. p1}, Lcom/amazonaws/DefaultRequest;->ܳ()Ljava/util/LinkedHashMap;

    move-result-object v0

    invoke-direct {v11, v0}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 317
    new-instance v12, Ljava/util/HashMap;

    invoke-virtual/range {p1 .. p1}, Lcom/amazonaws/DefaultRequest;->ܽ()Ljava/util/HashMap;

    move-result-object v0

    invoke-direct {v12, v0}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 319
    invoke-virtual/range {p1 .. p1}, Lcom/amazonaws/DefaultRequest;->֫()Ljava/io/InputStream;

    move-result-object v13

    if-eqz v13, :cond_3

    .line 320
    invoke-virtual {v13}, Ljava/io/InputStream;->markSupported()Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v0, -0x1

    .line 321
    invoke-virtual {v13, v0}, Ljava/io/InputStream;->mark(I)V

    .line 324
    :cond_3
    invoke-virtual/range {p4 .. p4}, Lcom/amazonaws/http/ExecutionContext;->ۧ()Lcom/amazonaws/auth/AWSCredentials;

    move-result-object v14

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v26, v15

    move-object v15, v6

    move-object/from16 v6, v26

    :goto_1
    move-object/from16 v17, v6

    add-int/lit8 v6, v0, 0x1

    move-wide/from16 v18, v1

    .line 331
    sget-object v1, Lcom/amazonaws/util/AWSRequestMetrics$Field;->۟:Lcom/amazonaws/util/AWSRequestMetrics$Field;

    move/from16 v20, v3

    int-to-long v2, v6

    invoke-virtual {v9, v1, v2, v3}, Lcom/amazonaws/util/AWSRequestMetrics;->֫(Lcom/amazonaws/util/AWSRequestMetrics$Field;J)V

    const/4 v1, 0x1

    if-le v6, v1, :cond_4

    .line 333
    invoke-virtual {v8, v11}, Lcom/amazonaws/DefaultRequest;->֫(Ljava/util/LinkedHashMap;)V

    .line 334
    invoke-virtual {v8, v12}, Lcom/amazonaws/DefaultRequest;->֫(Ljava/util/HashMap;)V

    .line 335
    invoke-virtual {v8, v13}, Lcom/amazonaws/DefaultRequest;->֫(Ljava/io/InputStream;)V

    :cond_4
    if-eqz v15, :cond_5

    .line 337
    invoke-virtual/range {p1 .. p1}, Lcom/amazonaws/DefaultRequest;->ۧ()Ljava/net/URI;

    move-result-object v2

    if-nez v2, :cond_5

    .line 338
    invoke-virtual/range {p1 .. p1}, Lcom/amazonaws/DefaultRequest;->᩻()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_5

    .line 339
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 340
    invoke-virtual {v15}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "://"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/net/URI;->getAuthority()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 339
    invoke-static {v2}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v2

    invoke-virtual {v8, v2}, Lcom/amazonaws/DefaultRequest;->֫(Ljava/net/URI;)V

    .line 341
    invoke-virtual {v15}, Ljava/net/URI;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v8, v2}, Lcom/amazonaws/DefaultRequest;->֫(Ljava/lang/String;)V

    :cond_5
    const-string v3, "Cannot close the response content."

    .line 345
    sget-object v2, Lcom/amazonaws/http/AmazonHttpClient;->ܿ:Lcom/amazonaws/logging/Log;

    if-le v6, v1, :cond_6

    .line 346
    :try_start_0
    sget-object v1, Lcom/amazonaws/util/AWSRequestMetrics$Field;->ܿ֫:Lcom/amazonaws/util/AWSRequestMetrics$Field;

    invoke-virtual {v9, v1}, Lcom/amazonaws/util/AWSRequestMetrics;->ܽ(Lcom/amazonaws/util/AWSRequestMetrics$Field;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    move-object/from16 v21, v11

    .line 348
    :try_start_1
    invoke-virtual/range {p1 .. p1}, Lcom/amazonaws/DefaultRequest;->ܿ()Lcom/amazonaws/AmazonWebServiceRequest;

    move-result-object v11
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object/from16 v22, v12

    .line 351
    :try_start_2
    invoke-virtual {v10}, Lcom/amazonaws/ClientConfiguration;->ܽ()Lcom/amazonaws/retry/RetryPolicy;

    move-result-object v12

    .line 348
    invoke-static {v11, v4, v6, v12}, Lcom/amazonaws/http/AmazonHttpClient;->֫(Lcom/amazonaws/AmazonWebServiceRequest;Lcom/amazonaws/AmazonClientException;ILcom/amazonaws/retry/RetryPolicy;)J

    move-result-wide v11
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 353
    :try_start_3
    invoke-virtual {v9, v1}, Lcom/amazonaws/util/AWSRequestMetrics;->֫(Lcom/amazonaws/util/AWSRequestMetrics$Field;)V

    .line 355
    invoke-virtual/range {p1 .. p1}, Lcom/amazonaws/DefaultRequest;->֫()Ljava/io/InputStream;

    move-result-object v1

    if-eqz v1, :cond_7

    .line 356
    invoke-virtual {v1}, Ljava/io/InputStream;->markSupported()Z

    move-result v4

    if-eqz v4, :cond_7

    .line 357
    invoke-virtual {v1}, Ljava/io/InputStream;->reset()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/lang/Error; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_4

    :catch_0
    move-exception v0

    move/from16 v25, v6

    move-wide/from16 v26, v11

    move-object v11, v2

    move-object v12, v3

    move-wide/from16 v1, v26

    goto/16 :goto_24

    :catchall_0
    move-exception v0

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object/from16 v22, v12

    .line 353
    :goto_2
    :try_start_4
    sget-object v1, Lcom/amazonaws/util/AWSRequestMetrics$Field;->ܿ֫:Lcom/amazonaws/util/AWSRequestMetrics$Field;

    invoke-virtual {v9, v1}, Lcom/amazonaws/util/AWSRequestMetrics;->֫(Lcom/amazonaws/util/AWSRequestMetrics$Field;)V

    .line 354
    throw v0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/lang/Error; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catch_1
    move-exception v0

    goto :goto_3

    :catchall_2
    move-exception v0

    goto/16 :goto_6

    :catch_2
    move-exception v0

    move-object v11, v2

    move-object v12, v3

    goto/16 :goto_1d

    :catch_3
    move-exception v0

    move-object v11, v2

    move-object v12, v3

    goto/16 :goto_20

    :catch_4
    move-exception v0

    move-object/from16 v21, v11

    move-object/from16 v22, v12

    :goto_3
    move-object v11, v2

    move-object v12, v3

    move/from16 v25, v6

    move-wide/from16 v1, v18

    goto/16 :goto_24

    :cond_6
    move-object/from16 v21, v11

    move-object/from16 v22, v12

    move-wide/from16 v11, v18

    :cond_7
    :goto_4
    :try_start_5
    const-string v1, "aws-sdk-retry"

    .line 360
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "/"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v1, v0}, Lcom/amazonaws/DefaultRequest;->֫(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_23
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_3
    .catch Ljava/lang/Error; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_d

    if-nez v5, :cond_8

    .line 365
    :try_start_6
    invoke-virtual/range {p4 .. p4}, Lcom/amazonaws/services/s3/internal/S3ExecutionContext;->ᩳ()Lcom/amazonaws/auth/Signer;

    move-result-object v5
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_3
    .catch Ljava/lang/Error; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :cond_8
    if-eqz v5, :cond_9

    if-eqz v14, :cond_9

    .line 368
    :try_start_7
    sget-object v0, Lcom/amazonaws/util/AWSRequestMetrics$Field;->ۧ֫:Lcom/amazonaws/util/AWSRequestMetrics$Field;

    invoke-virtual {v9, v0}, Lcom/amazonaws/util/AWSRequestMetrics;->ܽ(Lcom/amazonaws/util/AWSRequestMetrics$Field;)V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_22
    .catch Ljava/lang/RuntimeException; {:try_start_7 .. :try_end_7} :catch_3
    .catch Ljava/lang/Error; {:try_start_7 .. :try_end_7} :catch_2
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 370
    :try_start_8
    invoke-interface {v5, v8, v14}, Lcom/amazonaws/auth/Signer;->sign(Lcom/amazonaws/Request;Lcom/amazonaws/auth/AWSCredentials;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 372
    :try_start_9
    invoke-virtual {v9, v0}, Lcom/amazonaws/util/AWSRequestMetrics;->֫(Lcom/amazonaws/util/AWSRequestMetrics$Field;)V

    goto :goto_5

    :catchall_3
    move-exception v0

    move-object v1, v0

    sget-object v0, Lcom/amazonaws/util/AWSRequestMetrics$Field;->ۧ֫:Lcom/amazonaws/util/AWSRequestMetrics$Field;

    invoke-virtual {v9, v0}, Lcom/amazonaws/util/AWSRequestMetrics;->֫(Lcom/amazonaws/util/AWSRequestMetrics$Field;)V

    .line 373
    throw v1
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_22
    .catch Ljava/lang/RuntimeException; {:try_start_9 .. :try_end_9} :catch_3
    .catch Ljava/lang/Error; {:try_start_9 .. :try_end_9} :catch_2
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 376
    :cond_9
    :goto_5
    :try_start_a
    sget-object v0, Lcom/amazonaws/http/AmazonHttpClient;->ᩳ:Lcom/amazonaws/logging/Log;

    invoke-interface {v0}, Lcom/amazonaws/logging/Log;->֫()Z

    move-result v1
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_22
    .catch Ljava/lang/RuntimeException; {:try_start_a .. :try_end_a} :catch_3
    .catch Ljava/lang/Error; {:try_start_a .. :try_end_a} :catch_2
    .catchall {:try_start_a .. :try_end_a} :catchall_d

    if-eqz v1, :cond_a

    .line 377
    :try_start_b
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Sending Request: "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {p1 .. p1}, Lcom/amazonaws/DefaultRequest;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/amazonaws/logging/Log;->ۧ(Ljava/lang/String;)V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_22
    .catch Ljava/lang/RuntimeException; {:try_start_b .. :try_end_b} :catch_3
    .catch Ljava/lang/Error; {:try_start_b .. :try_end_b} :catch_2
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    goto :goto_9

    :goto_6
    move-object v11, v2

    move-object v12, v3

    :goto_7
    move-object/from16 v6, v17

    :goto_8
    move/from16 v3, v20

    goto/16 :goto_29

    .line 380
    :cond_a
    :goto_9
    :try_start_c
    iget-object v0, v7, Lcom/amazonaws/http/AmazonHttpClient;->ܽ:Lcom/amazonaws/http/HttpRequestFactory;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v8, v10}, Lcom/amazonaws/http/HttpRequestFactory;->֫(Lcom/amazonaws/DefaultRequest;Lcom/amazonaws/ClientConfiguration;)Lcom/amazonaws/http/HttpRequest;

    move-result-object v4
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_22
    .catch Ljava/lang/RuntimeException; {:try_start_c .. :try_end_c} :catch_3
    .catch Ljava/lang/Error; {:try_start_c .. :try_end_c} :catch_2
    .catchall {:try_start_c .. :try_end_c} :catchall_d

    .line 384
    :try_start_d
    sget-object v0, Lcom/amazonaws/util/AWSRequestMetrics$Field;->᩺:Lcom/amazonaws/util/AWSRequestMetrics$Field;

    invoke-virtual {v9, v0}, Lcom/amazonaws/util/AWSRequestMetrics;->ܽ(Lcom/amazonaws/util/AWSRequestMetrics$Field;)V
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_21
    .catch Ljava/lang/RuntimeException; {:try_start_d .. :try_end_d} :catch_3
    .catch Ljava/lang/Error; {:try_start_d .. :try_end_d} :catch_2
    .catchall {:try_start_d .. :try_end_d} :catchall_d

    .line 386
    :try_start_e
    iget-object v1, v7, Lcom/amazonaws/http/AmazonHttpClient;->ۧ:Lcom/amazonaws/http/UrlHttpClient;

    invoke-virtual {v1, v4}, Lcom/amazonaws/http/UrlHttpClient;->֫(Lcom/amazonaws/http/HttpRequest;)Lcom/amazonaws/http/HttpResponse;

    move-result-object v1
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_b

    .line 388
    :try_start_f
    invoke-virtual {v9, v0}, Lcom/amazonaws/util/AWSRequestMetrics;->֫(Lcom/amazonaws/util/AWSRequestMetrics$Field;)V

    .line 632
    invoke-virtual {v1}, Lcom/amazonaws/http/HttpResponse;->ᩳ()I

    move-result v0
    :try_end_f
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_1d
    .catch Ljava/lang/RuntimeException; {:try_start_f .. :try_end_f} :catch_1c
    .catch Ljava/lang/Error; {:try_start_f .. :try_end_f} :catch_1b
    .catchall {:try_start_f .. :try_end_f} :catchall_a

    move-object/from16 v18, v5

    const/16 v5, 0xc8

    if-lt v0, v5, :cond_c

    const/16 v5, 0x12c

    if-ge v0, v5, :cond_c

    .line 392
    :try_start_10
    sget-object v0, Lcom/amazonaws/util/AWSRequestMetrics$Field;->ۜ֫:Lcom/amazonaws/util/AWSRequestMetrics$Field;

    invoke-virtual {v1}, Lcom/amazonaws/http/HttpResponse;->ᩳ()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v9, v0, v5}, Lcom/amazonaws/util/AWSRequestMetrics;->֫(Lcom/amazonaws/util/AWSRequestMetrics$Field;Ljava/io/Serializable;)V

    .line 397
    invoke-interface/range {p2 .. p2}, Lcom/amazonaws/http/HttpResponseHandler;->֫()Z

    move-result v5
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_b
    .catch Ljava/lang/RuntimeException; {:try_start_10 .. :try_end_10} :catch_a
    .catch Ljava/lang/Error; {:try_start_10 .. :try_end_10} :catch_9
    .catchall {:try_start_10 .. :try_end_10} :catchall_5

    move-object/from16 v7, p2

    move-wide/from16 v23, v11

    move-object/from16 v11, p4

    .line 398
    :try_start_11
    invoke-static {v7, v1, v11}, Lcom/amazonaws/http/AmazonHttpClient;->֫(Lcom/amazonaws/http/HttpResponseHandler;Lcom/amazonaws/http/HttpResponse;Lcom/amazonaws/services/s3/internal/S3ExecutionContext;)Ljava/lang/Object;

    move-result-object v0

    .line 401
    new-instance v12, Lcom/amazonaws/Response;

    invoke-direct {v12, v0}, Lcom/amazonaws/Response;-><init>(Ljava/lang/Object;)V
    :try_end_11
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_8
    .catch Ljava/lang/RuntimeException; {:try_start_11 .. :try_end_11} :catch_7
    .catch Ljava/lang/Error; {:try_start_11 .. :try_end_11} :catch_6
    .catchall {:try_start_11 .. :try_end_11} :catchall_4

    if-nez v5, :cond_b

    .line 482
    :try_start_12
    invoke-virtual {v1}, Lcom/amazonaws/http/HttpResponse;->ܽ()Ljava/io/InputStream;

    move-result-object v0

    if-eqz v0, :cond_b

    .line 483
    invoke-virtual {v1}, Lcom/amazonaws/http/HttpResponse;->ܽ()Ljava/io/InputStream;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_12
    .catch Ljava/io/IOException; {:try_start_12 .. :try_end_12} :catch_5

    goto :goto_a

    :catch_5
    move-exception v0

    .line 486
    invoke-interface {v2, v3, v0}, Lcom/amazonaws/logging/Log;->ܽ(Ljava/lang/String;Ljava/lang/Exception;)V

    :cond_b
    :goto_a
    return-object v12

    :catchall_4
    move-exception v0

    move-object v6, v1

    move-object v11, v2

    move-object v12, v3

    goto/16 :goto_23

    :catch_6
    move-exception v0

    move-object v11, v2

    move-object v12, v3

    move v3, v5

    goto/16 :goto_1f

    :catch_7
    move-exception v0

    move-object v11, v2

    move-object v12, v3

    move v3, v5

    goto/16 :goto_22

    :catch_8
    move-exception v0

    move-object v11, v2

    move-object v12, v3

    move-object/from16 v16, v4

    move v3, v5

    move/from16 v25, v6

    move-object/from16 v5, v18

    goto/16 :goto_f

    :catchall_5
    move-exception v0

    goto/16 :goto_b

    :catch_9
    move-exception v0

    goto/16 :goto_c

    :catch_a
    move-exception v0

    goto/16 :goto_d

    :catch_b
    move-exception v0

    move-object/from16 v7, p2

    move-wide/from16 v23, v11

    move-object/from16 v11, p4

    goto/16 :goto_e

    :cond_c
    move-object/from16 v7, p2

    move-wide/from16 v23, v11

    move-object/from16 v11, p4

    .line 402
    :try_start_13
    invoke-static {v1}, Lcom/amazonaws/http/AmazonHttpClient;->֫(Lcom/amazonaws/http/HttpResponse;)Z

    move-result v0
    :try_end_13
    .catch Ljava/io/IOException; {:try_start_13 .. :try_end_13} :catch_1a
    .catch Ljava/lang/RuntimeException; {:try_start_13 .. :try_end_13} :catch_1c
    .catch Ljava/lang/Error; {:try_start_13 .. :try_end_13} :catch_1b
    .catchall {:try_start_13 .. :try_end_13} :catchall_a

    if-eqz v0, :cond_d

    .line 409
    :try_start_14
    invoke-virtual {v1}, Lcom/amazonaws/http/HttpResponse;->ۧ()Ljava/util/Map;

    move-result-object v0

    const-string v5, "Location"

    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 410
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "Redirecting to: "

    invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v2, v5}, Lcom/amazonaws/logging/Log;->ۧ(Ljava/lang/String;)V

    .line 412
    invoke-static {v0}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v15

    const/4 v5, 0x0

    .line 413
    invoke-virtual {v8, v5}, Lcom/amazonaws/DefaultRequest;->֫(Ljava/net/URI;)V

    .line 414
    invoke-virtual {v8, v5}, Lcom/amazonaws/DefaultRequest;->֫(Ljava/lang/String;)V

    .line 415
    sget-object v5, Lcom/amazonaws/util/AWSRequestMetrics$Field;->ۜ֫:Lcom/amazonaws/util/AWSRequestMetrics$Field;

    invoke-virtual {v1}, Lcom/amazonaws/http/HttpResponse;->ᩳ()I

    move-result v12

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v9, v5, v12}, Lcom/amazonaws/util/AWSRequestMetrics;->֫(Lcom/amazonaws/util/AWSRequestMetrics$Field;Ljava/io/Serializable;)V

    .line 416
    sget-object v5, Lcom/amazonaws/util/AWSRequestMetrics$Field;->ܰ:Lcom/amazonaws/util/AWSRequestMetrics$Field;

    invoke-virtual {v9, v5, v0}, Lcom/amazonaws/util/AWSRequestMetrics;->֫(Lcom/amazonaws/util/AWSRequestMetrics$Field;Ljava/io/Serializable;)V

    .line 417
    sget-object v0, Lcom/amazonaws/util/AWSRequestMetrics$Field;->᩶:Lcom/amazonaws/util/AWSRequestMetrics$Field;

    const/4 v5, 0x0

    invoke-virtual {v9, v0, v5}, Lcom/amazonaws/util/AWSRequestMetrics;->֫(Lcom/amazonaws/util/AWSRequestMetrics$Field;Ljava/io/Serializable;)V
    :try_end_14
    .catch Ljava/io/IOException; {:try_start_14 .. :try_end_14} :catch_c
    .catch Ljava/lang/RuntimeException; {:try_start_14 .. :try_end_14} :catch_a
    .catch Ljava/lang/Error; {:try_start_14 .. :try_end_14} :catch_9
    .catchall {:try_start_14 .. :try_end_14} :catchall_5

    const/4 v0, 0x0

    move-object v7, v1

    move-object v11, v2

    move-object v12, v3

    move-object/from16 v19, v4

    move/from16 v25, v6

    move/from16 v3, v20

    move-object v1, v0

    goto/16 :goto_10

    :goto_b
    move-object v6, v1

    move-object v11, v2

    move-object v12, v3

    goto/16 :goto_8

    :goto_c
    move-object v6, v1

    move-object v11, v2

    move-object v12, v3

    goto/16 :goto_1e

    :goto_d
    move-object v6, v1

    move-object v11, v2

    move-object v12, v3

    goto/16 :goto_21

    :catch_c
    move-exception v0

    :goto_e
    move-object v11, v2

    move-object v12, v3

    move-object/from16 v16, v4

    move/from16 v25, v6

    move-object/from16 v5, v18

    move/from16 v3, v20

    :goto_f
    move-object v6, v1

    goto/16 :goto_25

    .line 419
    :cond_d
    :try_start_15
    invoke-interface/range {p3 .. p3}, Lcom/amazonaws/http/HttpResponseHandler;->֫()Z

    move-result v12
    :try_end_15
    .catch Ljava/io/IOException; {:try_start_15 .. :try_end_15} :catch_1a
    .catch Ljava/lang/RuntimeException; {:try_start_15 .. :try_end_15} :catch_1c
    .catch Ljava/lang/Error; {:try_start_15 .. :try_end_15} :catch_1b
    .catchall {:try_start_15 .. :try_end_15} :catchall_a

    move-object/from16 v5, p3

    .line 420
    :try_start_16
    invoke-static {v8, v5, v1}, Lcom/amazonaws/http/AmazonHttpClient;->֫(Lcom/amazonaws/DefaultRequest;Lcom/amazonaws/http/HttpResponseHandler;Lcom/amazonaws/http/HttpResponse;)Lcom/amazonaws/AmazonServiceException;

    move-result-object v0
    :try_end_16
    .catch Ljava/io/IOException; {:try_start_16 .. :try_end_16} :catch_19
    .catch Ljava/lang/RuntimeException; {:try_start_16 .. :try_end_16} :catch_18
    .catch Ljava/lang/Error; {:try_start_16 .. :try_end_16} :catch_17
    .catchall {:try_start_16 .. :try_end_16} :catchall_9

    move-object/from16 v16, v1

    .line 422
    :try_start_17
    sget-object v1, Lcom/amazonaws/util/AWSRequestMetrics$Field;->᩶:Lcom/amazonaws/util/AWSRequestMetrics$Field;
    :try_end_17
    .catch Ljava/io/IOException; {:try_start_17 .. :try_end_17} :catch_16
    .catch Ljava/lang/RuntimeException; {:try_start_17 .. :try_end_17} :catch_15
    .catch Ljava/lang/Error; {:try_start_17 .. :try_end_17} :catch_14
    .catchall {:try_start_17 .. :try_end_17} :catchall_8

    move-object/from16 v19, v2

    :try_start_18
    invoke-virtual {v0}, Lcom/amazonaws/AmazonServiceException;->ܽ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v9, v1, v2}, Lcom/amazonaws/util/AWSRequestMetrics;->֫(Lcom/amazonaws/util/AWSRequestMetrics$Field;Ljava/io/Serializable;)V

    .line 423
    sget-object v1, Lcom/amazonaws/util/AWSRequestMetrics$Field;->᩹:Lcom/amazonaws/util/AWSRequestMetrics$Field;

    invoke-virtual {v0}, Lcom/amazonaws/AmazonServiceException;->֫()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v9, v1, v2}, Lcom/amazonaws/util/AWSRequestMetrics;->֫(Lcom/amazonaws/util/AWSRequestMetrics$Field;Ljava/io/Serializable;)V

    .line 424
    sget-object v1, Lcom/amazonaws/util/AWSRequestMetrics$Field;->ۜ֫:Lcom/amazonaws/util/AWSRequestMetrics$Field;

    invoke-virtual {v0}, Lcom/amazonaws/AmazonServiceException;->ᩳ()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v9, v1, v2}, Lcom/amazonaws/util/AWSRequestMetrics;->֫(Lcom/amazonaws/util/AWSRequestMetrics$Field;Ljava/io/Serializable;)V

    .line 426
    invoke-virtual/range {p1 .. p1}, Lcom/amazonaws/DefaultRequest;->ܿ()Lcom/amazonaws/AmazonWebServiceRequest;

    move-result-object v2

    .line 427
    invoke-virtual {v4}, Lcom/amazonaws/http/HttpRequest;->֫()Ljava/io/InputStream;

    move-result-object v17

    .line 430
    invoke-virtual {v10}, Lcom/amazonaws/ClientConfiguration;->ܽ()Lcom/amazonaws/retry/RetryPolicy;

    move-result-object v20
    :try_end_18
    .catch Ljava/io/IOException; {:try_start_18 .. :try_end_18} :catch_13
    .catch Ljava/lang/RuntimeException; {:try_start_18 .. :try_end_18} :catch_12
    .catch Ljava/lang/Error; {:try_start_18 .. :try_end_18} :catch_11
    .catchall {:try_start_18 .. :try_end_18} :catchall_7

    move-object/from16 v7, v16

    move-object/from16 v1, p0

    move-object/from16 v11, v19

    move/from16 v16, v12

    move-object v12, v3

    move-object/from16 v3, v17

    move-object/from16 v19, v4

    move-object v4, v0

    move v5, v6

    move/from16 v25, v6

    move-object/from16 v6, v20

    .line 426
    :try_start_19
    invoke-direct/range {v1 .. v6}, Lcom/amazonaws/http/AmazonHttpClient;->֫(Lcom/amazonaws/AmazonWebServiceRequest;Ljava/io/InputStream;Lcom/amazonaws/AmazonClientException;ILcom/amazonaws/retry/RetryPolicy;)Z

    move-result v1

    if-eqz v1, :cond_10

    .line 441
    invoke-static {v0}, Lcom/amazonaws/retry/RetryUtils;->֫(Lcom/amazonaws/AmazonServiceException;)Z

    move-result v1

    if-eqz v1, :cond_e

    .line 442
    invoke-static {v7, v0}, Lcom/amazonaws/http/AmazonHttpClient;->֫(Lcom/amazonaws/http/HttpResponse;Lcom/amazonaws/AmazonServiceException;)J

    move-result-wide v1

    .line 443
    invoke-static {v1, v2}, Lcom/amazonaws/SDKGlobalConfiguration;->֫(J)V

    .line 445
    :cond_e
    invoke-static {v8, v0}, Lcom/amazonaws/http/AmazonHttpClient;->֫(Lcom/amazonaws/DefaultRequest;Ljava/lang/Exception;)V
    :try_end_19
    .catch Ljava/io/IOException; {:try_start_19 .. :try_end_19} :catch_10
    .catch Ljava/lang/RuntimeException; {:try_start_19 .. :try_end_19} :catch_f
    .catch Ljava/lang/Error; {:try_start_19 .. :try_end_19} :catch_e
    .catchall {:try_start_19 .. :try_end_19} :catchall_6

    move-object v1, v0

    move/from16 v3, v16

    :goto_10
    if-nez v3, :cond_f

    .line 482
    :try_start_1a
    invoke-virtual {v7}, Lcom/amazonaws/http/HttpResponse;->ܽ()Ljava/io/InputStream;

    move-result-object v0

    if-eqz v0, :cond_f

    .line 483
    invoke-virtual {v7}, Lcom/amazonaws/http/HttpResponse;->ܽ()Ljava/io/InputStream;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_1a
    .catch Ljava/io/IOException; {:try_start_1a .. :try_end_1a} :catch_d

    goto :goto_11

    :catch_d
    move-exception v0

    .line 486
    invoke-interface {v11, v12, v0}, Lcom/amazonaws/logging/Log;->ܽ(Ljava/lang/String;Ljava/lang/Exception;)V

    :cond_f
    :goto_11
    move-object v4, v1

    move-object v6, v7

    move-object/from16 v5, v18

    move-object/from16 v16, v19

    goto/16 :goto_28

    .line 431
    :cond_10
    :try_start_1b
    throw v0
    :try_end_1b
    .catch Ljava/io/IOException; {:try_start_1b .. :try_end_1b} :catch_10
    .catch Ljava/lang/RuntimeException; {:try_start_1b .. :try_end_1b} :catch_f
    .catch Ljava/lang/Error; {:try_start_1b .. :try_end_1b} :catch_e
    .catchall {:try_start_1b .. :try_end_1b} :catchall_6

    :catchall_6
    move-exception v0

    goto/16 :goto_16

    :catch_e
    move-exception v0

    goto/16 :goto_17

    :catch_f
    move-exception v0

    goto/16 :goto_18

    :catch_10
    move-exception v0

    goto/16 :goto_26

    :catchall_7
    move-exception v0

    move-object/from16 v7, v16

    move-object/from16 v11, v19

    :goto_12
    move/from16 v16, v12

    move-object v12, v3

    goto :goto_16

    :catch_11
    move-exception v0

    move-object/from16 v7, v16

    move-object/from16 v11, v19

    :goto_13
    move/from16 v16, v12

    move-object v12, v3

    goto :goto_17

    :catch_12
    move-exception v0

    move-object/from16 v7, v16

    move-object/from16 v11, v19

    :goto_14
    move/from16 v16, v12

    move-object v12, v3

    goto :goto_18

    :catch_13
    move-exception v0

    move/from16 v25, v6

    move-object/from16 v7, v16

    move-object/from16 v11, v19

    move-object/from16 v19, v4

    :goto_15
    move/from16 v16, v12

    move-object v12, v3

    goto/16 :goto_26

    :catchall_8
    move-exception v0

    move-object v11, v2

    move-object/from16 v7, v16

    goto :goto_12

    :catch_14
    move-exception v0

    move-object v11, v2

    move-object/from16 v7, v16

    goto :goto_13

    :catch_15
    move-exception v0

    move-object v11, v2

    move-object/from16 v7, v16

    goto :goto_14

    :catch_16
    move-exception v0

    move-object v11, v2

    move-object/from16 v19, v4

    move/from16 v25, v6

    move-object/from16 v7, v16

    goto :goto_15

    :catchall_9
    move-exception v0

    move-object v7, v1

    move-object v11, v2

    goto :goto_12

    :goto_16
    move-object v1, v0

    move-object v6, v7

    move/from16 v5, v16

    goto/16 :goto_2a

    :catch_17
    move-exception v0

    move-object v7, v1

    move-object v11, v2

    goto :goto_13

    :goto_17
    move-object v1, v7

    move/from16 v3, v16

    goto/16 :goto_1f

    :catch_18
    move-exception v0

    move-object v7, v1

    move-object v11, v2

    goto :goto_14

    :goto_18
    move-object v1, v7

    move/from16 v3, v16

    goto/16 :goto_22

    :catch_19
    move-exception v0

    move-object v7, v1

    move-object v11, v2

    move-object/from16 v19, v4

    move/from16 v25, v6

    goto :goto_15

    :catch_1a
    move-exception v0

    move-object v7, v1

    move-object v11, v2

    move-object v12, v3

    move-object/from16 v19, v4

    move/from16 v25, v6

    goto :goto_19

    :catchall_a
    move-exception v0

    move-object v7, v1

    move-object v11, v2

    move-object v12, v3

    move-object v6, v7

    goto/16 :goto_8

    :catch_1b
    move-exception v0

    move-object v7, v1

    move-object v11, v2

    move-object v12, v3

    move-object v6, v7

    goto/16 :goto_1e

    :catch_1c
    move-exception v0

    move-object v7, v1

    move-object v11, v2

    move-object v12, v3

    move-object v6, v7

    goto/16 :goto_21

    :catch_1d
    move-exception v0

    move-object v7, v1

    move-object/from16 v19, v4

    move-object/from16 v18, v5

    move/from16 v25, v6

    move-wide/from16 v23, v11

    move-object v11, v2

    move-object v12, v3

    :goto_19
    move-object v6, v7

    goto :goto_1b

    :catchall_b
    move-exception v0

    move-object/from16 v19, v4

    move-object/from16 v18, v5

    move/from16 v25, v6

    move-wide/from16 v23, v11

    move-object v11, v2

    move-object v12, v3

    .line 388
    :try_start_1c
    sget-object v1, Lcom/amazonaws/util/AWSRequestMetrics$Field;->᩺:Lcom/amazonaws/util/AWSRequestMetrics$Field;

    invoke-virtual {v9, v1}, Lcom/amazonaws/util/AWSRequestMetrics;->֫(Lcom/amazonaws/util/AWSRequestMetrics$Field;)V

    .line 389
    throw v0
    :try_end_1c
    .catch Ljava/io/IOException; {:try_start_1c .. :try_end_1c} :catch_20
    .catch Ljava/lang/RuntimeException; {:try_start_1c .. :try_end_1c} :catch_1f
    .catch Ljava/lang/Error; {:try_start_1c .. :try_end_1c} :catch_1e
    .catchall {:try_start_1c .. :try_end_1c} :catchall_c

    :catchall_c
    move-exception v0

    goto/16 :goto_7

    :catch_1e
    move-exception v0

    goto :goto_1d

    :catch_1f
    move-exception v0

    goto :goto_20

    :catch_20
    move-exception v0

    goto :goto_1a

    :catch_21
    move-exception v0

    move-object/from16 v19, v4

    move-object/from16 v18, v5

    move/from16 v25, v6

    move-wide/from16 v23, v11

    move-object v11, v2

    move-object v12, v3

    :goto_1a
    move-object/from16 v6, v17

    :goto_1b
    move-object v7, v6

    move/from16 v16, v20

    goto :goto_26

    :catch_22
    move-exception v0

    move-object/from16 v18, v5

    move/from16 v25, v6

    move-wide/from16 v23, v11

    move-object v11, v2

    move-object v12, v3

    move-object/from16 v6, v17

    move-object/from16 v5, v18

    :goto_1c
    move/from16 v3, v20

    goto :goto_25

    :catchall_d
    move-exception v0

    goto/16 :goto_6

    :goto_1d
    move-object/from16 v6, v17

    :goto_1e
    move-object v1, v6

    move/from16 v3, v20

    .line 497
    :goto_1f
    :try_start_1d
    sget-object v2, Lcom/amazonaws/util/AWSRequestMetrics$Field;->۫:Lcom/amazonaws/util/AWSRequestMetrics$Field;

    invoke-virtual {v9, v2}, Lcom/amazonaws/util/AWSRequestMetrics;->ۧ(Lcom/amazonaws/util/AWSRequestMetrics$Field;)V

    .line 498
    invoke-virtual {v9, v2, v0}, Lcom/amazonaws/util/AWSRequestMetrics;->֫(Lcom/amazonaws/util/AWSRequestMetrics$Field;Ljava/io/Serializable;)V

    .line 471
    throw v0

    :goto_20
    move-object/from16 v6, v17

    :goto_21
    move-object v1, v6

    move/from16 v3, v20

    .line 497
    :goto_22
    sget-object v2, Lcom/amazonaws/util/AWSRequestMetrics$Field;->۫:Lcom/amazonaws/util/AWSRequestMetrics$Field;

    invoke-virtual {v9, v2}, Lcom/amazonaws/util/AWSRequestMetrics;->ۧ(Lcom/amazonaws/util/AWSRequestMetrics$Field;)V

    .line 498
    invoke-virtual {v9, v2, v0}, Lcom/amazonaws/util/AWSRequestMetrics;->֫(Lcom/amazonaws/util/AWSRequestMetrics$Field;Ljava/io/Serializable;)V

    .line 469
    throw v0
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_e

    :catchall_e
    move-exception v0

    move v5, v3

    move-object v6, v1

    :goto_23
    move-object v1, v0

    goto/16 :goto_2a

    :catch_23
    move-exception v0

    move/from16 v25, v6

    move-wide/from16 v23, v11

    move-object v11, v2

    move-object v12, v3

    move-wide/from16 v1, v23

    :goto_24
    move-wide/from16 v23, v1

    move-object/from16 v6, v17

    goto :goto_1c

    :goto_25
    move-object/from16 v18, v5

    move-object v7, v6

    move-object/from16 v19, v16

    move/from16 v16, v3

    .line 448
    :goto_26
    :try_start_1e
    invoke-interface {v11}, Lcom/amazonaws/logging/Log;->֫()Z

    move-result v1
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_f

    const-string v2, "Unable to execute HTTP request: "

    if-eqz v1, :cond_11

    .line 449
    :try_start_1f
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v11, v1, v0}, Lcom/amazonaws/logging/Log;->֫(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 451
    :cond_11
    sget-object v1, Lcom/amazonaws/util/AWSRequestMetrics$Field;->۫:Lcom/amazonaws/util/AWSRequestMetrics$Field;

    invoke-virtual {v9, v1}, Lcom/amazonaws/util/AWSRequestMetrics;->ۧ(Lcom/amazonaws/util/AWSRequestMetrics$Field;)V

    .line 452
    invoke-virtual {v9, v1, v0}, Lcom/amazonaws/util/AWSRequestMetrics;->֫(Lcom/amazonaws/util/AWSRequestMetrics$Field;Ljava/io/Serializable;)V

    .line 453
    sget-object v1, Lcom/amazonaws/util/AWSRequestMetrics$Field;->᩶:Lcom/amazonaws/util/AWSRequestMetrics$Field;

    const/4 v3, 0x0

    invoke-virtual {v9, v1, v3}, Lcom/amazonaws/util/AWSRequestMetrics;->֫(Lcom/amazonaws/util/AWSRequestMetrics$Field;Ljava/io/Serializable;)V

    .line 455
    new-instance v6, Lcom/amazonaws/AmazonClientException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 456
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 50
    invoke-direct {v6, v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 457
    invoke-virtual/range {p1 .. p1}, Lcom/amazonaws/DefaultRequest;->ܿ()Lcom/amazonaws/AmazonWebServiceRequest;

    move-result-object v2

    .line 458
    invoke-virtual/range {v19 .. v19}, Lcom/amazonaws/http/HttpRequest;->֫()Ljava/io/InputStream;

    move-result-object v3

    .line 461
    invoke-virtual {v10}, Lcom/amazonaws/ClientConfiguration;->ܽ()Lcom/amazonaws/retry/RetryPolicy;

    move-result-object v17

    move-object/from16 v1, p0

    move-object v4, v6

    move/from16 v5, v25

    move-object/from16 v20, v6

    move-object/from16 v6, v17

    .line 457
    invoke-direct/range {v1 .. v6}, Lcom/amazonaws/http/AmazonHttpClient;->֫(Lcom/amazonaws/AmazonWebServiceRequest;Ljava/io/InputStream;Lcom/amazonaws/AmazonClientException;ILcom/amazonaws/retry/RetryPolicy;)Z

    move-result v1

    if-eqz v1, :cond_13

    .line 467
    invoke-static {v8, v0}, Lcom/amazonaws/http/AmazonHttpClient;->֫(Lcom/amazonaws/DefaultRequest;Ljava/lang/Exception;)V
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_f

    if-nez v16, :cond_12

    if-eqz v7, :cond_12

    .line 482
    :try_start_20
    invoke-virtual {v7}, Lcom/amazonaws/http/HttpResponse;->ܽ()Ljava/io/InputStream;

    move-result-object v0

    if-eqz v0, :cond_12

    .line 483
    invoke-virtual {v7}, Lcom/amazonaws/http/HttpResponse;->ܽ()Ljava/io/InputStream;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_20
    .catch Ljava/io/IOException; {:try_start_20 .. :try_end_20} :catch_24

    goto :goto_27

    :catch_24
    move-exception v0

    .line 486
    invoke-interface {v11, v12, v0}, Lcom/amazonaws/logging/Log;->ܽ(Ljava/lang/String;Ljava/lang/Exception;)V

    :cond_12
    :goto_27
    move-object v6, v7

    move/from16 v3, v16

    move-object/from16 v5, v18

    move-object/from16 v16, v19

    move-object/from16 v4, v20

    :goto_28
    move-wide/from16 v1, v23

    move-object/from16 v7, p0

    move-object/from16 v11, v21

    move-object/from16 v12, v22

    move/from16 v0, v25

    goto/16 :goto_1

    .line 462
    :cond_13
    :try_start_21
    throw v20
    :try_end_21
    .catchall {:try_start_21 .. :try_end_21} :catchall_f

    :catchall_f
    move-exception v0

    move-object v6, v7

    move/from16 v3, v16

    :goto_29
    move-object v1, v0

    move v5, v3

    :goto_2a
    if-nez v5, :cond_14

    if-eqz v6, :cond_14

    .line 482
    :try_start_22
    invoke-virtual {v6}, Lcom/amazonaws/http/HttpResponse;->ܽ()Ljava/io/InputStream;

    move-result-object v0

    if-eqz v0, :cond_14

    .line 483
    invoke-virtual {v6}, Lcom/amazonaws/http/HttpResponse;->ܽ()Ljava/io/InputStream;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_22
    .catch Ljava/io/IOException; {:try_start_22 .. :try_end_22} :catch_25

    goto :goto_2b

    :catch_25
    move-exception v0

    .line 486
    invoke-interface {v11, v12, v0}, Lcom/amazonaws/logging/Log;->ܽ(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 489
    :cond_14
    :goto_2b
    throw v1
.end method
