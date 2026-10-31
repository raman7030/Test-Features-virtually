.class public Lcom/amazonaws/util/AWSRequestMetricsFullSupport;
.super Lcom/amazonaws/util/AWSRequestMetrics;
.source "AWSRequestMetricsFullSupport.java"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field public static final ᩳ:Lcom/amazonaws/logging/Log;


# instance fields
.field public final ۧ:Ljava/util/HashMap;

.field public final ܽ:Ljava/util/HashMap;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "com.amazonaws.latency"

    .line 50
    invoke-static {v0}, Lcom/amazonaws/logging/LogFactory;->֫(Ljava/lang/String;)Lcom/amazonaws/logging/Log;

    move-result-object v0

    sput-object v0, Lcom/amazonaws/util/AWSRequestMetricsFullSupport;->ᩳ:Lcom/amazonaws/logging/Log;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 83
    new-instance v0, Lcom/amazonaws/util/TimingInfoFullSupport;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 84
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Lcom/amazonaws/util/TimingInfoFullSupport;-><init>(J)V

    .line 61
    invoke-direct {p0, v0}, Lcom/amazonaws/util/AWSRequestMetrics;-><init>(Lcom/amazonaws/util/TimingInfo;)V

    .line 45
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/amazonaws/util/AWSRequestMetricsFullSupport;->ܽ:Ljava/util/HashMap;

    .line 48
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/amazonaws/util/AWSRequestMetricsFullSupport;->ۧ:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final ֫(Lcom/amazonaws/util/AWSRequestMetrics$Field;)V
    .locals 5

    .line 116
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    .line 100
    iget-object v0, p0, Lcom/amazonaws/util/AWSRequestMetricsFullSupport;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/amazonaws/util/TimingInfo;

    if-nez v0, :cond_0

    .line 103
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lcom/amazonaws/logging/LogFactory;->֫(Ljava/lang/Class;)Lcom/amazonaws/logging/Log;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Trying to end an event which was never started: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/amazonaws/logging/Log;->ᩳ(Ljava/lang/String;)V

    return-void

    .line 106
    :cond_0
    invoke-virtual {v0}, Lcom/amazonaws/util/TimingInfo;->֫()V

    .line 110
    invoke-virtual {v0}, Lcom/amazonaws/util/TimingInfo;->ܽ()J

    move-result-wide v1

    .line 111
    invoke-virtual {v0}, Lcom/amazonaws/util/TimingInfo;->ۧ()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    .line 133
    new-instance v3, Lcom/amazonaws/util/TimingInfoUnmodifiable;

    .line 32
    invoke-direct {v3, v1, v2, v0}, Lcom/amazonaws/util/TimingInfo;-><init>(JLjava/lang/Long;)V

    .line 107
    iget-object v0, p0, Lcom/amazonaws/util/AWSRequestMetrics;->֫:Lcom/amazonaws/util/TimingInfo;

    invoke-virtual {v0, p1, v3}, Lcom/amazonaws/util/TimingInfo;->֫(Ljava/lang/String;Lcom/amazonaws/util/TimingInfo;)V

    return-void
.end method

.method public final ֫(Lcom/amazonaws/util/AWSRequestMetrics$Field;J)V
    .locals 1

    .line 146
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    .line 141
    iget-object v0, p0, Lcom/amazonaws/util/AWSRequestMetrics;->֫:Lcom/amazonaws/util/TimingInfo;

    invoke-virtual {v0, p2, p3, p1}, Lcom/amazonaws/util/TimingInfo;->֫(JLjava/lang/String;)V

    return-void
.end method

.method public final ֫(Lcom/amazonaws/util/AWSRequestMetrics$Field;Ljava/io/Serializable;)V
    .locals 2

    .line 172
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    .line 161
    iget-object v0, p0, Lcom/amazonaws/util/AWSRequestMetricsFullSupport;->ܽ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-nez v1, :cond_0

    .line 163
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 164
    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    :cond_0
    invoke-interface {v1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ۧ(Lcom/amazonaws/util/AWSRequestMetrics$Field;)V
    .locals 1

    .line 136
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    .line 131
    iget-object v0, p0, Lcom/amazonaws/util/AWSRequestMetrics;->֫:Lcom/amazonaws/util/TimingInfo;

    invoke-virtual {v0, p1}, Lcom/amazonaws/util/TimingInfo;->֫(Ljava/lang/String;)V

    return-void
.end method

.method public final ܽ(Lcom/amazonaws/util/AWSRequestMetrics$Field;)V
    .locals 3

    .line 88
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    .line 83
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    .line 95
    new-instance v2, Lcom/amazonaws/util/TimingInfoFullSupport;

    invoke-direct {v2, v0, v1}, Lcom/amazonaws/util/TimingInfoFullSupport;-><init>(J)V

    .line 83
    iget-object v0, p0, Lcom/amazonaws/util/AWSRequestMetricsFullSupport;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v0, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
