.class public Lcom/amazonaws/services/s3/metrics/S3ServiceMetric;
.super Lcom/amazonaws/metrics/SimpleMetricType;
.source "S3ServiceMetric.java"

# interfaces
.implements Lcom/amazonaws/metrics/MetricType;


# static fields
.field public static final ᩶:[Lcom/amazonaws/services/s3/metrics/S3ServiceMetric;

.field public static final ᩹:Lcom/amazonaws/services/s3/metrics/S3ServiceMetric$1;


# instance fields
.field public final ᩸:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    .line 44
    new-instance v0, Lcom/amazonaws/services/s3/metrics/S3ServiceMetric$1;

    const-string v1, "S3"

    const-string v2, "DownloadThroughput"

    .line 38
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 30
    invoke-direct {v0, v2}, Lcom/amazonaws/services/s3/metrics/S3ServiceMetric;-><init>(Ljava/lang/String;)V

    .line 45
    sput-object v0, Lcom/amazonaws/services/s3/metrics/S3ServiceMetric;->᩹:Lcom/amazonaws/services/s3/metrics/S3ServiceMetric$1;

    .line 55
    new-instance v2, Lcom/amazonaws/services/s3/metrics/S3ServiceMetric;

    const-string v3, "DownloadByteCount"

    .line 38
    invoke-virtual {v1, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 56
    invoke-direct {v2, v3}, Lcom/amazonaws/services/s3/metrics/S3ServiceMetric;-><init>(Ljava/lang/String;)V

    .line 61
    new-instance v3, Lcom/amazonaws/services/s3/metrics/S3ServiceMetric$2;

    const-string v4, "UploadThroughput"

    .line 38
    invoke-virtual {v1, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 30
    invoke-direct {v3, v4}, Lcom/amazonaws/services/s3/metrics/S3ServiceMetric;-><init>(Ljava/lang/String;)V

    .line 72
    new-instance v4, Lcom/amazonaws/services/s3/metrics/S3ServiceMetric;

    const-string v5, "UploadByteCount"

    .line 38
    invoke-virtual {v1, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 73
    invoke-direct {v4, v1}, Lcom/amazonaws/services/s3/metrics/S3ServiceMetric;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x4

    new-array v1, v1, [Lcom/amazonaws/services/s3/metrics/S3ServiceMetric;

    const/4 v5, 0x0

    aput-object v0, v1, v5

    const/4 v0, 0x1

    aput-object v2, v1, v0

    const/4 v0, 0x2

    aput-object v3, v1, v0

    const/4 v0, 0x3

    aput-object v4, v1, v0

    .line 75
    sput-object v1, Lcom/amazonaws/services/s3/metrics/S3ServiceMetric;->᩶:[Lcom/amazonaws/services/s3/metrics/S3ServiceMetric;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 84
    invoke-direct {p0}, Lcom/amazonaws/metrics/SimpleMetricType;-><init>()V

    .line 85
    iput-object p1, p0, Lcom/amazonaws/services/s3/metrics/S3ServiceMetric;->᩸:Ljava/lang/String;

    return-void
.end method

.method public static ֫()[Lcom/amazonaws/services/s3/metrics/S3ServiceMetric;
    .locals 1

    .line 109
    sget-object v0, Lcom/amazonaws/services/s3/metrics/S3ServiceMetric;->᩶:[Lcom/amazonaws/services/s3/metrics/S3ServiceMetric;

    invoke-virtual {v0}, [Lcom/amazonaws/services/s3/metrics/S3ServiceMetric;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/amazonaws/services/s3/metrics/S3ServiceMetric;

    return-object v0
.end method


# virtual methods
.method public final name()Ljava/lang/String;
    .locals 1

    .line 90
    iget-object v0, p0, Lcom/amazonaws/services/s3/metrics/S3ServiceMetric;->᩸:Ljava/lang/String;

    return-object v0
.end method
