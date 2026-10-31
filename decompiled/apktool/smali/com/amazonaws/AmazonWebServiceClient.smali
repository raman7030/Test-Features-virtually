.class public abstract Lcom/amazonaws/AmazonWebServiceClient;
.super Ljava/lang/Object;
.source "AmazonWebServiceClient.java"


# static fields
.field public static final ᩻:Lcom/amazonaws/logging/Log;


# instance fields
.field public ֫:Lcom/amazonaws/http/AmazonHttpClient;

.field public ۧ:Lcom/amazonaws/ClientConfiguration;

.field public volatile ܳ:Lcom/amazonaws/auth/Signer;

.field public volatile ܽ:Ljava/net/URI;

.field public volatile ܿ:Ljava/lang/String;

.field public final ᩳ:Ljava/util/concurrent/CopyOnWriteArrayList;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 65
    const-class v0, Lcom/amazonaws/AmazonWebServiceClient;

    .line 66
    invoke-static {v0}, Lcom/amazonaws/logging/LogFactory;->֫(Ljava/lang/Class;)Lcom/amazonaws/logging/Log;

    move-result-object v0

    sput-object v0, Lcom/amazonaws/AmazonWebServiceClient;->᩻:Lcom/amazonaws/logging/Log;

    return-void
.end method

.method public constructor <init>(Lcom/amazonaws/ClientConfiguration;Lcom/amazonaws/http/UrlHttpClient;)V
    .locals 1

    .line 148
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 149
    iput-object p1, p0, Lcom/amazonaws/AmazonWebServiceClient;->ۧ:Lcom/amazonaws/ClientConfiguration;

    .line 150
    new-instance v0, Lcom/amazonaws/http/AmazonHttpClient;

    invoke-direct {v0, p1, p2}, Lcom/amazonaws/http/AmazonHttpClient;-><init>(Lcom/amazonaws/ClientConfiguration;Lcom/amazonaws/http/UrlHttpClient;)V

    iput-object v0, p0, Lcom/amazonaws/AmazonWebServiceClient;->֫:Lcom/amazonaws/http/AmazonHttpClient;

    .line 151
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/AmazonWebServiceClient;->ᩳ:Ljava/util/concurrent/CopyOnWriteArrayList;

    return-void
.end method

.method private ֫(Ljava/net/URI;Z)Lcom/amazonaws/auth/Signer;
    .locals 2

    if-eqz p1, :cond_2

    .line 372
    invoke-virtual {p0}, Lcom/amazonaws/AmazonWebServiceClient;->֫()Ljava/lang/String;

    move-result-object v0

    .line 373
    invoke-virtual {p1}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v0}, Lcom/amazonaws/util/AwsHostNameUtils;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 400
    iget-object v1, p0, Lcom/amazonaws/AmazonWebServiceClient;->ۧ:Lcom/amazonaws/ClientConfiguration;

    invoke-virtual {v1}, Lcom/amazonaws/ClientConfiguration;->ᩳ()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    .line 402
    invoke-static {v0, p1}, Lcom/amazonaws/auth/SignerFactory;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lcom/amazonaws/auth/Signer;

    move-result-object v0

    goto :goto_0

    .line 403
    :cond_0
    invoke-static {v1, v0}, Lcom/amazonaws/auth/SignerFactory;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lcom/amazonaws/auth/Signer;

    move-result-object v0

    :goto_0
    move-object v1, v0

    .line 404
    nop

    instance-of v0, v1, Lcom/amazonaws/auth/RegionAwareSigner;

    if-eqz v0, :cond_1

    .line 406
    move-object v0, v1

    check-cast v0, Lcom/amazonaws/auth/RegionAwareSigner;

    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    .line 413
    invoke-interface {v0, p1}, Lcom/amazonaws/auth/RegionAwareSigner;->setRegionName(Ljava/lang/String;)V

    :cond_1
    move-object v0, p0

    .line 417
    monitor-enter v0

    .line 71
    :try_start_0
    invoke-static {p1}, Lcom/amazonaws/regions/RegionUtils;->֫(Ljava/lang/String;)Lcom/amazonaws/regions/Region;

    .line 419
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    .line 369
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Endpoint is not set. Use setEndpoint to set an endpoint before performing any request."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private ۧ()Ljava/lang/String;
    .locals 4

    .line 802
    const-class v0, Lcom/amazonaws/AmazonWebServiceClient;

    invoke-static {v0, p0}, Lcom/amazonaws/util/Classes;->֫(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Class;

    move-result-object v0

    .line 804
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    .line 805
    invoke-static {v0}, Lcom/amazonaws/ServiceNameFactory;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    return-object v1

    :cond_0
    const-string v1, "JavaClient"

    .line 810
    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_2

    const-string v1, "Client"

    .line 812
    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    if-eq v1, v2, :cond_1

    goto :goto_0

    .line 814
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Unrecognized suffix for the AWS http client class name "

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    :goto_0
    const-string v3, "Amazon"

    .line 819
    invoke-virtual {v0, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v3

    if-ne v3, v2, :cond_4

    const-string v3, "AWS"

    .line 822
    invoke-virtual {v0, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v3

    if-eq v3, v2, :cond_3

    const/4 v2, 0x3

    goto :goto_1

    .line 824
    :cond_3
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Unrecognized prefix for the AWS http client class name "

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_4
    const/4 v2, 0x6

    :goto_1
    if-ge v3, v1, :cond_5

    add-int/2addr v3, v2

    .line 836
    invoke-virtual {v0, v3, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 837
    invoke-static {v0}, Lcom/amazonaws/util/StringUtils;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 833
    :cond_5
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Unrecognized AWS http client class name "

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public final ֫(Ljava/net/URI;)Lcom/amazonaws/auth/Signer;
    .locals 1

    const/4 v0, 0x1

    .line 346
    invoke-direct {p0, p1, v0}, Lcom/amazonaws/AmazonWebServiceClient;->֫(Ljava/net/URI;Z)Lcom/amazonaws/auth/Signer;

    move-result-object p1

    return-object p1
.end method

.method public final ֫()Ljava/lang/String;
    .locals 2

    .line 771
    iget-object v0, p0, Lcom/amazonaws/AmazonWebServiceClient;->ܿ:Ljava/lang/String;

    if-nez v0, :cond_1

    move-object v0, p0

    .line 772
    monitor-enter v0

    .line 773
    :try_start_0
    iget-object v1, p0, Lcom/amazonaws/AmazonWebServiceClient;->ܿ:Ljava/lang/String;

    if-nez v1, :cond_0

    .line 774
    invoke-direct {p0}, Lcom/amazonaws/AmazonWebServiceClient;->ۧ()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/amazonaws/AmazonWebServiceClient;->ܿ:Ljava/lang/String;

    .line 775
    iget-object v1, p0, Lcom/amazonaws/AmazonWebServiceClient;->ܿ:Ljava/lang/String;

    monitor-exit v0

    return-object v1

    .line 777
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 779
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/amazonaws/AmazonWebServiceClient;->ܿ:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫(Lcom/amazonaws/AmazonWebServiceRequest;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 605
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 686
    iget-object p1, p0, Lcom/amazonaws/AmazonWebServiceClient;->֫:Lcom/amazonaws/http/AmazonHttpClient;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 687
    invoke-static {}, Lcom/amazonaws/metrics/AwsSdkMetrics;->ܶ()Lcom/amazonaws/metrics/RequestMetricCollector;

    return-void
.end method

.method public final ֫(Lcom/amazonaws/util/AWSRequestMetrics;Lcom/amazonaws/DefaultRequest;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 737
    sget-object v0, Lcom/amazonaws/util/AWSRequestMetrics$Field;->ۗ:Lcom/amazonaws/util/AWSRequestMetrics$Field;

    invoke-virtual {p1, v0}, Lcom/amazonaws/util/AWSRequestMetrics;->֫(Lcom/amazonaws/util/AWSRequestMetrics$Field;)V

    .line 738
    invoke-virtual {p1}, Lcom/amazonaws/util/AWSRequestMetrics;->֫()Lcom/amazonaws/util/TimingInfo;

    move-result-object p1

    invoke-virtual {p1}, Lcom/amazonaws/util/TimingInfo;->֫()V

    .line 698
    invoke-virtual {p2}, Lcom/amazonaws/DefaultRequest;->ܿ()Lcom/amazonaws/AmazonWebServiceRequest;

    move-result-object p1

    .line 699
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 675
    iget-object p1, p0, Lcom/amazonaws/AmazonWebServiceClient;->֫:Lcom/amazonaws/http/AmazonHttpClient;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 704
    invoke-static {}, Lcom/amazonaws/metrics/AwsSdkMetrics;->ܶ()Lcom/amazonaws/metrics/RequestMetricCollector;

    move-result-object p1

    .line 740
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public ֫(Ljava/lang/String;)V
    .locals 3

    const-string v0, "://"

    .line 256
    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 257
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/amazonaws/AmazonWebServiceClient;->ۧ:Lcom/amazonaws/ClientConfiguration;

    invoke-virtual {v2}, Lcom/amazonaws/ClientConfiguration;->ۧ()Lcom/amazonaws/Protocol;

    move-result-object v2

    invoke-virtual {v2}, Lcom/amazonaws/Protocol;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 261
    :cond_0
    :try_start_0
    new-instance v1, Ljava/net/URI;

    invoke-direct {v1, p1}, Ljava/net/URI;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x0

    .line 218
    invoke-direct {p0, v1, p1}, Lcom/amazonaws/AmazonWebServiceClient;->֫(Ljava/net/URI;Z)Lcom/amazonaws/auth/Signer;

    move-result-object p1

    move-object v0, p0

    .line 219
    monitor-enter v0

    .line 220
    :try_start_1
    iput-object v1, p0, Lcom/amazonaws/AmazonWebServiceClient;->ܽ:Ljava/net/URI;

    .line 221
    iput-object p1, p0, Lcom/amazonaws/AmazonWebServiceClient;->ܳ:Lcom/amazonaws/auth/Signer;

    .line 222
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :catch_0
    move-exception p1

    .line 263
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method
