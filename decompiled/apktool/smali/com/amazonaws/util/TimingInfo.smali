.class public Lcom/amazonaws/util/TimingInfo;
.super Ljava/lang/Object;
.source "TimingInfo.java"


# instance fields
.field public ֫:Ljava/lang/Long;

.field public final ۧ:J


# direct methods
.method public constructor <init>(JLjava/lang/Long;)V
    .locals 0

    .line 156
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 158
    iput-wide p1, p0, Lcom/amazonaws/util/TimingInfo;->ۧ:J

    .line 159
    iput-object p3, p0, Lcom/amazonaws/util/TimingInfo;->֫:Ljava/lang/Long;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 5

    .line 249
    invoke-virtual {p0}, Lcom/amazonaws/util/TimingInfo;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/amazonaws/util/TimingInfo;->֫:Ljava/lang/Long;

    .line 250
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    .line 261
    sget-object v2, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    iget-wide v3, p0, Lcom/amazonaws/util/TimingInfo;->ۧ:J

    sub-long/2addr v0, v3

    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/TimeUnit;->toMicros(J)J

    move-result-wide v0

    long-to-double v0, v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double/2addr v0, v2

    .line 250
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    goto :goto_1

    .line 242
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    .line 292
    :goto_1
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ֫()V
    .locals 2

    .line 311
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/amazonaws/util/TimingInfo;->֫:Ljava/lang/Long;

    return-void
.end method

.method public ֫(JLjava/lang/String;)V
    .locals 0

    return-void
.end method

.method public ֫(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public ֫(Ljava/lang/String;Lcom/amazonaws/util/TimingInfo;)V
    .locals 0

    return-void
.end method

.method public final ۧ()J
    .locals 2

    .line 226
    iget-object v0, p0, Lcom/amazonaws/util/TimingInfo;->֫:Ljava/lang/Long;

    if-nez v0, :cond_0

    const-wide/16 v0, -0x1

    return-wide v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ܽ()J
    .locals 2

    .line 191
    iget-wide v0, p0, Lcom/amazonaws/util/TimingInfo;->ۧ:J

    return-wide v0
.end method

.method public final ᩳ()Z
    .locals 1

    .line 280
    iget-object v0, p0, Lcom/amazonaws/util/TimingInfo;->֫:Ljava/lang/Long;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
