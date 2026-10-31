.class public Lcom/amazonaws/util/AWSRequestMetrics;
.super Ljava/lang/Object;
.source "AWSRequestMetrics.java"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field public final ֫:Lcom/amazonaws/util/TimingInfo;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 141
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 73
    new-instance v0, Lcom/amazonaws/util/TimingInfo;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/amazonaws/util/TimingInfo;-><init>(JLjava/lang/Long;)V

    .line 142
    iput-object v0, p0, Lcom/amazonaws/util/AWSRequestMetrics;->֫:Lcom/amazonaws/util/TimingInfo;

    return-void
.end method

.method public constructor <init>(Lcom/amazonaws/util/TimingInfo;)V
    .locals 0

    .line 145
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 146
    iput-object p1, p0, Lcom/amazonaws/util/AWSRequestMetrics;->֫:Lcom/amazonaws/util/TimingInfo;

    return-void
.end method


# virtual methods
.method public final ֫()Lcom/amazonaws/util/TimingInfo;
    .locals 1

    .line 150
    iget-object v0, p0, Lcom/amazonaws/util/AWSRequestMetrics;->֫:Lcom/amazonaws/util/TimingInfo;

    return-object v0
.end method

.method public ֫(Lcom/amazonaws/util/AWSRequestMetrics$Field;)V
    .locals 0

    return-void
.end method

.method public ֫(Lcom/amazonaws/util/AWSRequestMetrics$Field;J)V
    .locals 0

    return-void
.end method

.method public ֫(Lcom/amazonaws/util/AWSRequestMetrics$Field;Ljava/io/Serializable;)V
    .locals 0

    return-void
.end method

.method public ۧ(Lcom/amazonaws/util/AWSRequestMetrics$Field;)V
    .locals 0

    return-void
.end method

.method public ܽ(Lcom/amazonaws/util/AWSRequestMetrics$Field;)V
    .locals 0

    return-void
.end method
