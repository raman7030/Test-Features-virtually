.class public abstract Lcom/amazonaws/metrics/ByteThroughputProvider;
.super Ljava/lang/Object;
.source "ByteThroughputProvider.java"


# instance fields
.field public ֫:I

.field public ۧ:J

.field public final ܽ:Lcom/amazonaws/metrics/ThroughputMetricType;


# direct methods
.method public constructor <init>(Lcom/amazonaws/metrics/ThroughputMetricType;)V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/amazonaws/metrics/ByteThroughputProvider;->ܽ:Lcom/amazonaws/metrics/ThroughputMetricType;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 5

    .line 48
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 69
    iget v1, p0, Lcom/amazonaws/metrics/ByteThroughputProvider;->֫:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-wide v2, p0, Lcom/amazonaws/metrics/ByteThroughputProvider;->ۧ:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x4

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const/4 v0, 0x1

    iget-object v4, p0, Lcom/amazonaws/metrics/ByteThroughputProvider;->ܽ:Lcom/amazonaws/metrics/ThroughputMetricType;

    aput-object v4, v3, v0

    const/4 v0, 0x2

    aput-object v1, v3, v0

    const/4 v0, 0x3

    aput-object v2, v3, v0

    const-string v0, "providerId=%s, throughputType=%s, byteCount=%d, duration=%d"

    .line 67
    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()I
    .locals 1

    .line 35
    iget v0, p0, Lcom/amazonaws/metrics/ByteThroughputProvider;->֫:I

    return v0
.end method

.method public ֫(IJ)V
    .locals 4

    .line 56
    iget v0, p0, Lcom/amazonaws/metrics/ByteThroughputProvider;->֫:I

    add-int/2addr v0, p1

    iput v0, p0, Lcom/amazonaws/metrics/ByteThroughputProvider;->֫:I

    .line 57
    iget-wide v0, p0, Lcom/amazonaws/metrics/ByteThroughputProvider;->ۧ:J

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    sub-long/2addr v2, p2

    add-long/2addr v2, v0

    iput-wide v2, p0, Lcom/amazonaws/metrics/ByteThroughputProvider;->ۧ:J

    return-void
.end method

.method public final ۧ()J
    .locals 2

    .line 39
    iget-wide v0, p0, Lcom/amazonaws/metrics/ByteThroughputProvider;->ۧ:J

    return-wide v0
.end method

.method public final ܽ()V
    .locals 2

    const/4 v0, 0x0

    .line 61
    iput v0, p0, Lcom/amazonaws/metrics/ByteThroughputProvider;->֫:I

    const-wide/16 v0, 0x0

    .line 62
    iput-wide v0, p0, Lcom/amazonaws/metrics/ByteThroughputProvider;->ۧ:J

    return-void
.end method
