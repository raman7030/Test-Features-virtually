.class public Lcom/amazonaws/services/s3/model/S3ObjectInputStream;
.super Lcom/amazonaws/internal/SdkFilterInputStream;
.source "S3ObjectInputStream.java"


# direct methods
.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 2

    .line 49
    invoke-static {}, Lcom/amazonaws/metrics/AwsSdkMetrics;->ۙ()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 53
    :cond_0
    instance-of v0, p1, Lcom/amazonaws/internal/MetricAware;

    if-eqz v0, :cond_1

    .line 54
    move-object v0, p1

    check-cast v0, Lcom/amazonaws/internal/MetricAware;

    .line 57
    invoke-interface {v0}, Lcom/amazonaws/internal/MetricAware;->֫()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    :goto_0
    if-eqz v0, :cond_2

    .line 39
    new-instance v0, Lcom/amazonaws/metrics/MetricFilterInputStream;

    sget-object v1, Lcom/amazonaws/services/s3/metrics/S3ServiceMetric;->᩹:Lcom/amazonaws/services/s3/metrics/S3ServiceMetric$1;

    invoke-direct {v0, v1, p1}, Lcom/amazonaws/metrics/MetricFilterInputStream;-><init>(Lcom/amazonaws/metrics/ThroughputMetricType;Ljava/io/InputStream;)V

    move-object p1, v0

    .line 29
    :cond_2
    invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    return-void
.end method


# virtual methods
.method public final available()I
    .locals 1

    .line 97
    invoke-super {p0}, Lcom/amazonaws/internal/SdkFilterInputStream;->available()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method public final read([B)I
    .locals 2

    const/4 v0, 0x0

    .line 118
    array-length v1, p1

    .line 126
    invoke-super {p0, p1, v0, v1}, Lcom/amazonaws/internal/SdkFilterInputStream;->read([BII)I

    move-result p1

    return p1
.end method

.method public final ܽ()V
    .locals 3

    .line 78
    :try_start_0
    invoke-virtual {p0}, Lcom/amazonaws/internal/SdkFilterInputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 81
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v1}, Lcom/amazonaws/logging/LogFactory;->֫(Ljava/lang/Class;)Lcom/amazonaws/logging/Log;

    move-result-object v1

    const-string v2, "FYI"

    invoke-interface {v1, v2, v0}, Lcom/amazonaws/logging/Log;->֫(Ljava/lang/String;Ljava/lang/Exception;)V

    return-void
.end method
