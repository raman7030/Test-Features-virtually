.class public Lcom/amazonaws/metrics/MetricFilterInputStream;
.super Lcom/amazonaws/internal/SdkFilterInputStream;
.source "MetricFilterInputStream.java"


# instance fields
.field public final ᩸:Lcom/amazonaws/metrics/ByteThroughputHelper;


# direct methods
.method public constructor <init>(Lcom/amazonaws/metrics/ThroughputMetricType;Ljava/io/InputStream;)V
    .locals 0

    .line 29
    invoke-direct {p0, p2}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    .line 40
    new-instance p2, Lcom/amazonaws/metrics/ByteThroughputHelper;

    .line 30
    invoke-direct {p2, p1}, Lcom/amazonaws/metrics/ByteThroughputProvider;-><init>(Lcom/amazonaws/metrics/ThroughputMetricType;)V

    .line 40
    iput-object p2, p0, Lcom/amazonaws/metrics/MetricFilterInputStream;->᩸:Lcom/amazonaws/metrics/ByteThroughputHelper;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 56
    iget-object v0, p0, Lcom/amazonaws/metrics/MetricFilterInputStream;->᩸:Lcom/amazonaws/metrics/ByteThroughputHelper;

    .line 41
    invoke-virtual {v0}, Lcom/amazonaws/metrics/ByteThroughputProvider;->֫()I

    move-result v1

    if-lez v1, :cond_0

    .line 42
    invoke-static {}, Lcom/amazonaws/metrics/AwsSdkMetrics;->᩸()Lcom/amazonaws/metrics/ServiceMetricCollector;

    move-result-object v1

    .line 43
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    invoke-virtual {v0}, Lcom/amazonaws/metrics/ByteThroughputProvider;->ܽ()V

    .line 57
    :cond_0
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 58
    invoke-virtual {p0}, Lcom/amazonaws/internal/SdkFilterInputStream;->ᩳ()V

    return-void
.end method

.method public final read([BII)I
    .locals 6

    .line 45
    invoke-virtual {p0}, Lcom/amazonaws/internal/SdkFilterInputStream;->ᩳ()V

    .line 46
    iget-object v0, p0, Lcom/amazonaws/metrics/MetricFilterInputStream;->᩸:Lcom/amazonaws/metrics/ByteThroughputHelper;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    sget-object v1, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0}, Lcom/amazonaws/metrics/ByteThroughputProvider;->ۧ()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    move-result-wide v1

    const-wide/16 v3, 0xa

    cmp-long v5, v1, v3

    if-lez v5, :cond_0

    .line 41
    invoke-virtual {v0}, Lcom/amazonaws/metrics/ByteThroughputProvider;->֫()I

    move-result v1

    if-lez v1, :cond_0

    .line 42
    invoke-static {}, Lcom/amazonaws/metrics/AwsSdkMetrics;->᩸()Lcom/amazonaws/metrics/ServiceMetricCollector;

    move-result-object v1

    .line 43
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    invoke-virtual {v0}, Lcom/amazonaws/metrics/ByteThroughputProvider;->ܽ()V

    .line 37
    :cond_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    .line 47
    iget-object v2, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v2, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result p1

    if-lez p1, :cond_1

    .line 49
    iget-object p2, p0, Lcom/amazonaws/metrics/MetricFilterInputStream;->᩸:Lcom/amazonaws/metrics/ByteThroughputHelper;

    invoke-virtual {p2, p1, v0, v1}, Lcom/amazonaws/metrics/ByteThroughputHelper;->֫(IJ)V

    :cond_1
    return p1
.end method

.method public final ֫()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
