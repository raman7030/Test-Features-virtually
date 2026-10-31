.class public final enum Lcom/amazonaws/metrics/AwsSdkMetrics;
.super Ljava/lang/Enum;
.source "AwsSdkMetrics.java"


# static fields
.field public static volatile ֡֫:Z = false

.field public static final ֫֫:Ljava/lang/String; = "getQueuePollTimeoutMilli"

.field public static volatile ۖ֫:Ljava/lang/Integer; = null

.field public static final ۗ:Ljava/lang/String; = "com.amazonaws.metrics.internal.cloudwatch.DefaultMetricCollectorFactory"

.field public static volatile ۘ֫:Z = false

.field public static final ۙ:Z

.field public static final ۛ:Ljava/lang/String; = "includePerHostMetrics"

.field public static volatile ۜ֫:Ljava/lang/String; = null

.field public static final ۟:Ljava/lang/String; = "metricQueueSize"

.field public static volatile ۡ֫:Lcom/amazonaws/metrics/MetricCollector; = null

.field public static volatile ۢ֫:Z = false

.field public static final ۤ:Ljava/lang/String; = "hostMetricName"

.field public static final ۧ֫:I = 0x3e8

.field public static final ۨ:Ljava/lang/String; = "jvmMetricName"

.field public static final ۫:Ljava/lang/String; = "excludeMachineMetrics"

.field public static final ۬:Ljava/lang/String; = "AWSSDK/Java"

.field public static final ܰ:Ljava/lang/String; = "metricNameSpace"

.field public static volatile ܳ֫:Lcom/amazonaws/auth/AWSCredentialsProvider; = null

.field public static volatile ܺ֫:Ljava/lang/String; = "AWSSDK/Java"

.field public static final ܽ֫:Lcom/amazonaws/metrics/AwsSdkMetrics$MetricRegistry;

.field public static volatile ܿ֫:Ljava/lang/String; = null

.field public static final ᩳ֫:Ljava/lang/String; = "useSingleMetricNamespace"

.field public static volatile ᩴ֫:Ljava/lang/Long; = null

.field public static volatile ᩵֫:Lcom/amazonaws/regions/Regions; = null

.field public static final ᩶:Ljava/lang/String; = "cloudwatchRegion"

.field public static volatile ᩷֫:Ljava/lang/String; = null

.field public static final synthetic ᩸:[Lcom/amazonaws/metrics/AwsSdkMetrics;

.field public static final ᩹:Ljava/lang/String; = "credentialFile"

.field public static final ᩺:Ljava/lang/String; = "com.amazonaws.management:type=AwsSdkMetrics"

.field public static ᩻֫:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 13

    .line 70
    const-class v0, Lcom/amazonaws/metrics/AwsSdkMetrics;

    const/4 v1, 0x0

    new-array v2, v1, [Lcom/amazonaws/metrics/AwsSdkMetrics;

    sput-object v2, Lcom/amazonaws/metrics/AwsSdkMetrics;->᩸:[Lcom/amazonaws/metrics/AwsSdkMetrics;

    const-string v2, "com.amazonaws.sdk.enableDefaultMetrics"

    .line 243
    invoke-static {v2}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 244
    :goto_0
    sput-boolean v4, Lcom/amazonaws/metrics/AwsSdkMetrics;->ۙ:Z

    if-eqz v4, :cond_f

    const-string v4, ","

    .line 246
    invoke-virtual {v2, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 250
    array-length v4, v2

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    :goto_1
    if-ge v5, v4, :cond_e

    aget-object v9, v2, v5

    .line 251
    invoke-virtual {v9}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v9

    if-nez v6, :cond_1

    const-string v10, "excludeMachineMetrics"

    .line 252
    invoke-virtual {v10, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    const/4 v6, 0x1

    goto/16 :goto_2

    :cond_1
    if-nez v7, :cond_2

    const-string v10, "includePerHostMetrics"

    .line 254
    invoke-virtual {v10, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_2

    const/4 v7, 0x1

    goto/16 :goto_2

    :cond_2
    if-nez v8, :cond_3

    const-string v10, "useSingleMetricNamespace"

    .line 256
    invoke-virtual {v10, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_3

    const/4 v8, 0x1

    goto/16 :goto_2

    :cond_3
    const-string v10, "="

    .line 259
    invoke-virtual {v9, v10}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v10

    .line 260
    array-length v11, v10

    const/4 v12, 0x2

    if-ne v11, v12, :cond_d

    .line 261
    aget-object v11, v10, v1

    invoke-virtual {v11}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v11

    .line 262
    aget-object v10, v10, v3

    invoke-virtual {v10}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v10

    :try_start_0
    const-string v12, "credentialFile"

    .line 264
    invoke-virtual {v12, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_4

    .line 265
    invoke-static {v10}, Lcom/amazonaws/metrics/AwsSdkMetrics;->ۧ(Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_4
    const-string v12, "cloudwatchRegion"

    .line 266
    invoke-virtual {v12, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_5

    .line 267
    invoke-static {v10}, Lcom/amazonaws/regions/Regions;->֫(Ljava/lang/String;)Lcom/amazonaws/regions/Regions;

    move-result-object v9

    sput-object v9, Lcom/amazonaws/metrics/AwsSdkMetrics;->᩵֫:Lcom/amazonaws/regions/Regions;

    goto/16 :goto_2

    :cond_5
    const-string v12, "metricQueueSize"

    .line 268
    invoke-virtual {v12, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_7

    .line 269
    new-instance v9, Ljava/lang/Integer;

    invoke-direct {v9, v10}, Ljava/lang/Integer;-><init>(Ljava/lang/String;)V

    .line 270
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v10

    if-lt v10, v3, :cond_6

    .line 273
    sput-object v9, Lcom/amazonaws/metrics/AwsSdkMetrics;->ۖ֫:Ljava/lang/Integer;

    goto :goto_2

    .line 271
    :cond_6
    new-instance v9, Ljava/lang/IllegalArgumentException;

    const-string v10, "metricQueueSize must be at least 1"

    invoke-direct {v9, v10}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v9

    :cond_7
    const-string v12, "getQueuePollTimeoutMilli"

    .line 274
    invoke-virtual {v12, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_9

    .line 275
    new-instance v9, Ljava/lang/Long;

    invoke-direct {v9, v10}, Ljava/lang/Long;-><init>(Ljava/lang/String;)V

    .line 276
    invoke-virtual {v9}, Ljava/lang/Long;->intValue()I

    move-result v10

    const/16 v11, 0x3e8

    if-lt v10, v11, :cond_8

    .line 279
    sput-object v9, Lcom/amazonaws/metrics/AwsSdkMetrics;->ᩴ֫:Ljava/lang/Long;

    goto :goto_2

    .line 277
    :cond_8
    new-instance v9, Ljava/lang/IllegalArgumentException;

    const-string v10, "getQueuePollTimeoutMilli must be at least 1000"

    invoke-direct {v9, v10}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v9

    :cond_9
    const-string v12, "metricNameSpace"

    .line 280
    invoke-virtual {v12, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_a

    .line 281
    sput-object v10, Lcom/amazonaws/metrics/AwsSdkMetrics;->ܺ֫:Ljava/lang/String;

    goto :goto_2

    :cond_a
    const-string v12, "jvmMetricName"

    .line 282
    invoke-virtual {v12, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_b

    .line 283
    sput-object v10, Lcom/amazonaws/metrics/AwsSdkMetrics;->᩷֫:Ljava/lang/String;

    goto :goto_2

    :cond_b
    const-string v12, "hostMetricName"

    .line 284
    invoke-virtual {v12, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_c

    .line 285
    sput-object v10, Lcom/amazonaws/metrics/AwsSdkMetrics;->ۜ֫:Ljava/lang/String;

    goto :goto_2

    .line 287
    :cond_c
    invoke-static {v0}, Lcom/amazonaws/logging/LogFactory;->֫(Ljava/lang/Class;)Lcom/amazonaws/logging/Log;

    move-result-object v10

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "Ignoring unrecognized parameter: "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v10, v9}, Lcom/amazonaws/logging/Log;->ۧ(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v9

    .line 291
    invoke-static {v0}, Lcom/amazonaws/logging/LogFactory;->֫(Ljava/lang/Class;)Lcom/amazonaws/logging/Log;

    move-result-object v10

    const-string v11, "Ignoring failure"

    invoke-interface {v10, v11, v9}, Lcom/amazonaws/logging/Log;->֫(Ljava/lang/String;Ljava/lang/Exception;)V

    :cond_d
    :goto_2
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_1

    .line 296
    :cond_e
    sput-boolean v6, Lcom/amazonaws/metrics/AwsSdkMetrics;->ۢ֫:Z

    .line 297
    sput-boolean v7, Lcom/amazonaws/metrics/AwsSdkMetrics;->ۘ֫:Z

    .line 298
    sput-boolean v8, Lcom/amazonaws/metrics/AwsSdkMetrics;->֡֫:Z

    .line 302
    :cond_f
    new-instance v0, Lcom/amazonaws/metrics/AwsSdkMetrics$MetricRegistry;

    invoke-direct {v0}, Lcom/amazonaws/metrics/AwsSdkMetrics$MetricRegistry;-><init>()V

    sput-object v0, Lcom/amazonaws/metrics/AwsSdkMetrics;->ܽ֫:Lcom/amazonaws/metrics/AwsSdkMetrics$MetricRegistry;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 71
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/amazonaws/metrics/AwsSdkMetrics;
    .locals 1

    .line 70
    const-class v0, Lcom/amazonaws/metrics/AwsSdkMetrics;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/amazonaws/metrics/AwsSdkMetrics;

    return-object p0
.end method

.method public static values()[Lcom/amazonaws/metrics/AwsSdkMetrics;
    .locals 1

    .line 70
    sget-object v0, Lcom/amazonaws/metrics/AwsSdkMetrics;->᩸:[Lcom/amazonaws/metrics/AwsSdkMetrics;

    invoke-virtual {v0}, [Lcom/amazonaws/metrics/AwsSdkMetrics;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/amazonaws/metrics/AwsSdkMetrics;

    return-object v0
.end method

.method public static ֡()Ljava/lang/Integer;
    .locals 1

    .line 660
    sget-object v0, Lcom/amazonaws/metrics/AwsSdkMetrics;->ۖ֫:Ljava/lang/Integer;

    return-object v0
.end method

.method public static ֨()Ljava/lang/Long;
    .locals 1

    .line 678
    sget-object v0, Lcom/amazonaws/metrics/AwsSdkMetrics;->ᩴ֫:Ljava/lang/Long;

    return-object v0
.end method

.method public static ֫()V
    .locals 1

    .line 509
    sget-object v0, Lcom/amazonaws/metrics/MetricCollector;->֫:Lcom/amazonaws/metrics/MetricCollector;

    invoke-static {v0}, Lcom/amazonaws/metrics/AwsSdkMetrics;->֫(Lcom/amazonaws/metrics/MetricCollector;)V

    return-void
.end method

.method public static declared-synchronized ֫(Lcom/amazonaws/auth/AWSCredentialsProvider;)V
    .locals 1

    .line 2
    const-class v0, Lcom/amazonaws/metrics/AwsSdkMetrics;

    .line 3
    monitor-enter v0

    .line 595
    :try_start_0
    sput-object p0, Lcom/amazonaws/metrics/AwsSdkMetrics;->ܳ֫:Lcom/amazonaws/auth/AWSCredentialsProvider;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 596
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static declared-synchronized ֫(Lcom/amazonaws/metrics/MetricCollector;)V
    .locals 1

    .line 2
    const-class v0, Lcom/amazonaws/metrics/AwsSdkMetrics;

    .line 3
    monitor-enter v0

    .line 383
    :try_start_0
    sput-object p0, Lcom/amazonaws/metrics/AwsSdkMetrics;->ۡ֫:Lcom/amazonaws/metrics/MetricCollector;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 387
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static ֫(Lcom/amazonaws/regions/Regions;)V
    .locals 0

    .line 612
    sput-object p0, Lcom/amazonaws/metrics/AwsSdkMetrics;->᩵֫:Lcom/amazonaws/regions/Regions;

    return-void
.end method

.method public static ֫(Ljava/lang/Integer;)V
    .locals 0

    .line 669
    sput-object p0, Lcom/amazonaws/metrics/AwsSdkMetrics;->ۖ֫:Ljava/lang/Integer;

    return-void
.end method

.method public static ֫(Ljava/lang/Long;)V
    .locals 0

    .line 687
    sput-object p0, Lcom/amazonaws/metrics/AwsSdkMetrics;->ᩴ֫:Ljava/lang/Long;

    return-void
.end method

.method public static ֫(Ljava/lang/String;)V
    .locals 0

    .line 630
    invoke-static {p0}, Lcom/amazonaws/metrics/AwsSdkMetrics;->ۧ(Ljava/lang/String;)V

    return-void
.end method

.method public static ֫(Z)V
    .locals 0

    .line 396
    sput-boolean p0, Lcom/amazonaws/metrics/AwsSdkMetrics;->ۢ֫:Z

    return-void
.end method

.method public static ֫(Lcom/amazonaws/metrics/MetricType;)Z
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    .line 520
    :cond_0
    sget-object v0, Lcom/amazonaws/metrics/AwsSdkMetrics;->ܽ֫:Lcom/amazonaws/metrics/AwsSdkMetrics$MetricRegistry;

    invoke-virtual {v0, p0}, Lcom/amazonaws/metrics/AwsSdkMetrics$MetricRegistry;->֫(Lcom/amazonaws/metrics/MetricType;)Z

    move-result p0

    return p0
.end method

.method public static ֫(Ljava/util/Collection;)Z
    .locals 1

    if-eqz p0, :cond_1

    .line 532
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/amazonaws/metrics/AwsSdkMetrics;->ܽ֫:Lcom/amazonaws/metrics/AwsSdkMetrics$MetricRegistry;

    .line 534
    invoke-virtual {v0, p0}, Lcom/amazonaws/metrics/AwsSdkMetrics$MetricRegistry;->֫(Ljava/util/Collection;)Z

    move-result p0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ۗ()Z
    .locals 2

    .line 467
    sget-boolean v0, Lcom/amazonaws/metrics/AwsSdkMetrics;->ۘ֫:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    .line 469
    :cond_0
    sget-object v0, Lcom/amazonaws/metrics/AwsSdkMetrics;->ۜ֫:Ljava/lang/String;

    if-nez v0, :cond_1

    const-string v0, ""

    goto :goto_0

    .line 470
    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 471
    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_2

    return v1

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public static ۙ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public static ۚ()Ljava/util/Set;
    .locals 1

    .line 562
    sget-object v0, Lcom/amazonaws/metrics/AwsSdkMetrics;->ܽ֫:Lcom/amazonaws/metrics/AwsSdkMetrics$MetricRegistry;

    invoke-virtual {v0}, Lcom/amazonaws/metrics/AwsSdkMetrics$MetricRegistry;->֫()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public static ۠()Lcom/amazonaws/regions/Regions;
    .locals 1

    .line 603
    sget-object v0, Lcom/amazonaws/metrics/AwsSdkMetrics;->᩵֫:Lcom/amazonaws/regions/Regions;

    return-object v0
.end method

.method public static ۡ()Ljava/lang/String;
    .locals 1

    .line 716
    sget-object v0, Lcom/amazonaws/metrics/AwsSdkMetrics;->᩷֫:Ljava/lang/String;

    return-object v0
.end method

.method public static ۢ()Lcom/amazonaws/metrics/MetricCollector;
    .locals 1

    .line 348
    sget-object v0, Lcom/amazonaws/metrics/AwsSdkMetrics;->ۡ֫:Lcom/amazonaws/metrics/MetricCollector;

    return-object v0
.end method

.method public static ۧ(Ljava/lang/String;)V
    .locals 3

    .line 638
    new-instance v1, Lcom/amazonaws/auth/PropertiesCredentials;

    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v0}, Lcom/amazonaws/auth/PropertiesCredentials;-><init>(Ljava/io/File;)V

    .line 640
    const-class v0, Lcom/amazonaws/metrics/AwsSdkMetrics;

    monitor-enter v0

    .line 641
    :try_start_0
    new-instance v2, Lcom/amazonaws/metrics/AwsSdkMetrics$1;

    invoke-direct {v2, v1}, Lcom/amazonaws/metrics/AwsSdkMetrics$1;-><init>(Lcom/amazonaws/auth/PropertiesCredentials;)V

    sput-object v2, Lcom/amazonaws/metrics/AwsSdkMetrics;->ܳ֫:Lcom/amazonaws/auth/AWSCredentialsProvider;

    .line 651
    sput-object p0, Lcom/amazonaws/metrics/AwsSdkMetrics;->ܿ֫:Ljava/lang/String;

    .line 652
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static ۧ(Ljava/util/Collection;)V
    .locals 1

    .line 544
    sget-object v0, Lcom/amazonaws/metrics/AwsSdkMetrics;->ܽ֫:Lcom/amazonaws/metrics/AwsSdkMetrics$MetricRegistry;

    invoke-virtual {v0, p0}, Lcom/amazonaws/metrics/AwsSdkMetrics$MetricRegistry;->ۧ(Ljava/util/Collection;)V

    return-void
.end method

.method public static ۧ(Z)V
    .locals 0

    .line 406
    sput-boolean p0, Lcom/amazonaws/metrics/AwsSdkMetrics;->ۘ֫:Z

    return-void
.end method

.method public static declared-synchronized ۧ()Z
    .locals 5

    .line 2
    const-class v0, Lcom/amazonaws/metrics/AwsSdkMetrics;

    .line 3
    monitor-enter v0

    .line 482
    :try_start_0
    sget-object v1, Lcom/amazonaws/metrics/AwsSdkMetrics;->ۡ֫:Lcom/amazonaws/metrics/MetricCollector;

    if-eqz v1, :cond_0

    sget-object v1, Lcom/amazonaws/metrics/AwsSdkMetrics;->ۡ֫:Lcom/amazonaws/metrics/MetricCollector;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 483
    :cond_0
    sget-boolean v1, Lcom/amazonaws/metrics/AwsSdkMetrics;->᩻֫:Z

    if-nez v1, :cond_2

    const/4 v1, 0x1

    .line 486
    sput-boolean v1, Lcom/amazonaws/metrics/AwsSdkMetrics;->᩻֫:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v2, 0x0

    :try_start_1
    const-string v3, "com.amazonaws.metrics.internal.cloudwatch.DefaultMetricCollectorFactory"

    .line 488
    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    .line 489
    invoke-virtual {v3}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/amazonaws/metrics/MetricCollector$Factory;

    .line 490
    invoke-interface {v3}, Lcom/amazonaws/metrics/MetricCollector$Factory;->getInstance()Lcom/amazonaws/metrics/MetricCollector;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 492
    invoke-static {v3}, Lcom/amazonaws/metrics/AwsSdkMetrics;->֫(Lcom/amazonaws/metrics/MetricCollector;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 499
    :try_start_2
    sput-boolean v2, Lcom/amazonaws/metrics/AwsSdkMetrics;->᩻֫:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 493
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    goto :goto_0

    :catch_0
    move-exception v1

    .line 496
    :try_start_3
    const-class v3, Lcom/amazonaws/metrics/AwsSdkMetrics;

    invoke-static {v3}, Lcom/amazonaws/logging/LogFactory;->֫(Ljava/lang/Class;)Lcom/amazonaws/logging/Log;

    move-result-object v3

    const-string v4, "Failed to enable the default metrics"

    .line 497
    invoke-interface {v3, v4, v1}, Lcom/amazonaws/logging/Log;->ܽ(Ljava/lang/String;Ljava/lang/Exception;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 499
    :cond_1
    :try_start_4
    sput-boolean v2, Lcom/amazonaws/metrics/AwsSdkMetrics;->᩻֫:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 502
    monitor-exit v0

    return v2

    .line 499
    :goto_0
    :try_start_5
    sput-boolean v2, Lcom/amazonaws/metrics/AwsSdkMetrics;->᩻֫:Z

    .line 500
    throw v1

    .line 484
    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Reentrancy is not allowed"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_1
    move-exception v1

    .line 500
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw v1
.end method

.method public static ۧ(Lcom/amazonaws/metrics/MetricType;)Z
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    .line 555
    :cond_0
    sget-object v0, Lcom/amazonaws/metrics/AwsSdkMetrics;->ܽ֫:Lcom/amazonaws/metrics/AwsSdkMetrics$MetricRegistry;

    invoke-virtual {v0, p0}, Lcom/amazonaws/metrics/AwsSdkMetrics$MetricRegistry;->ۧ(Lcom/amazonaws/metrics/MetricType;)Z

    move-result p0

    return p0
.end method

.method public static ۫()Z
    .locals 1

    .line 424
    sget-boolean v0, Lcom/amazonaws/metrics/AwsSdkMetrics;->֡֫:Z

    return v0
.end method

.method public static ۬()Z
    .locals 1

    .line 460
    sget-boolean v0, Lcom/amazonaws/metrics/AwsSdkMetrics;->ۘ֫:Z

    return v0
.end method

.method public static ܶ()Lcom/amazonaws/metrics/RequestMetricCollector;
    .locals 1

    .line 320
    sget-object v0, Lcom/amazonaws/metrics/AwsSdkMetrics;->ۡ֫:Lcom/amazonaws/metrics/MetricCollector;

    if-nez v0, :cond_0

    .line 321
    invoke-static {}, Lcom/amazonaws/metrics/AwsSdkMetrics;->᩹()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 322
    invoke-static {}, Lcom/amazonaws/metrics/AwsSdkMetrics;->ۧ()Z

    .line 325
    :cond_0
    sget-object v0, Lcom/amazonaws/metrics/AwsSdkMetrics;->ۡ֫:Lcom/amazonaws/metrics/MetricCollector;

    if-nez v0, :cond_1

    sget-object v0, Lcom/amazonaws/metrics/RequestMetricCollector;->֫:Lcom/amazonaws/metrics/RequestMetricCollector;

    return-object v0

    :cond_1
    sget-object v0, Lcom/amazonaws/metrics/AwsSdkMetrics;->ۡ֫:Lcom/amazonaws/metrics/MetricCollector;

    check-cast v0, Lcom/amazonaws/metrics/MetricCollector$1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    sget-object v0, Lcom/amazonaws/metrics/RequestMetricCollector;->֫:Lcom/amazonaws/metrics/RequestMetricCollector;

    return-object v0
.end method

.method public static ܺ()Lcom/amazonaws/metrics/MetricCollector;
    .locals 1

    .line 356
    sget-object v0, Lcom/amazonaws/metrics/AwsSdkMetrics;->ۡ֫:Lcom/amazonaws/metrics/MetricCollector;

    if-nez v0, :cond_0

    .line 357
    invoke-static {}, Lcom/amazonaws/metrics/AwsSdkMetrics;->᩹()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 358
    invoke-static {}, Lcom/amazonaws/metrics/AwsSdkMetrics;->ۧ()Z

    .line 361
    :cond_0
    sget-object v0, Lcom/amazonaws/metrics/AwsSdkMetrics;->ۡ֫:Lcom/amazonaws/metrics/MetricCollector;

    if-nez v0, :cond_1

    sget-object v0, Lcom/amazonaws/metrics/MetricCollector;->֫:Lcom/amazonaws/metrics/MetricCollector;

    return-object v0

    :cond_1
    sget-object v0, Lcom/amazonaws/metrics/AwsSdkMetrics;->ۡ֫:Lcom/amazonaws/metrics/MetricCollector;

    return-object v0
.end method

.method public static ܽ(Ljava/lang/String;)V
    .locals 0

    .line 747
    sput-object p0, Lcom/amazonaws/metrics/AwsSdkMetrics;->ۜ֫:Ljava/lang/String;

    return-void
.end method

.method public static ܽ(Z)V
    .locals 0

    .line 436
    sput-boolean p0, Lcom/amazonaws/metrics/AwsSdkMetrics;->֡֫:Z

    return-void
.end method

.method public static ܿ()Ljava/lang/String;
    .locals 1

    .line 619
    sget-object v0, Lcom/amazonaws/metrics/AwsSdkMetrics;->ܿ֫:Ljava/lang/String;

    return-object v0
.end method

.method public static ܿ(Ljava/lang/String;)V
    .locals 1

    if-eqz p0, :cond_0

    .line 706
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_0

    .line 708
    sput-object p0, Lcom/amazonaws/metrics/AwsSdkMetrics;->ܺ֫:Ljava/lang/String;

    return-void

    .line 707
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0
.end method

.method public static ᩳ(Ljava/lang/String;)V
    .locals 0

    .line 727
    sput-object p0, Lcom/amazonaws/metrics/AwsSdkMetrics;->᩷֫:Ljava/lang/String;

    return-void
.end method

.method public static ᩴ()Ljava/lang/String;
    .locals 1

    .line 694
    sget-object v0, Lcom/amazonaws/metrics/AwsSdkMetrics;->ܺ֫:Ljava/lang/String;

    return-object v0
.end method

.method public static ᩶()Z
    .locals 1

    .line 453
    sget-boolean v0, Lcom/amazonaws/metrics/AwsSdkMetrics;->ۢ֫:Z

    return v0
.end method

.method public static ᩷()Ljava/lang/String;
    .locals 1

    .line 736
    sget-object v0, Lcom/amazonaws/metrics/AwsSdkMetrics;->ۜ֫:Ljava/lang/String;

    return-object v0
.end method

.method public static ᩸()Lcom/amazonaws/metrics/ServiceMetricCollector;
    .locals 1

    .line 334
    sget-object v0, Lcom/amazonaws/metrics/AwsSdkMetrics;->ۡ֫:Lcom/amazonaws/metrics/MetricCollector;

    if-nez v0, :cond_0

    .line 335
    invoke-static {}, Lcom/amazonaws/metrics/AwsSdkMetrics;->᩹()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 336
    invoke-static {}, Lcom/amazonaws/metrics/AwsSdkMetrics;->ۧ()Z

    .line 339
    :cond_0
    sget-object v0, Lcom/amazonaws/metrics/AwsSdkMetrics;->ۡ֫:Lcom/amazonaws/metrics/MetricCollector;

    if-nez v0, :cond_1

    sget-object v0, Lcom/amazonaws/metrics/ServiceMetricCollector;->֫:Lcom/amazonaws/metrics/ServiceMetricCollector;

    return-object v0

    :cond_1
    sget-object v0, Lcom/amazonaws/metrics/AwsSdkMetrics;->ۡ֫:Lcom/amazonaws/metrics/MetricCollector;

    check-cast v0, Lcom/amazonaws/metrics/MetricCollector$1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    sget-object v0, Lcom/amazonaws/metrics/ServiceMetricCollector;->֫:Lcom/amazonaws/metrics/ServiceMetricCollector;

    return-object v0
.end method

.method public static ᩹()Z
    .locals 1

    .line 415
    sget-boolean v0, Lcom/amazonaws/metrics/AwsSdkMetrics;->ۙ:Z

    return v0
.end method

.method public static ᩻()Lcom/amazonaws/auth/AWSCredentialsProvider;
    .locals 4

    .line 574
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v0

    const/4 v1, 0x0

    .line 575
    :goto_0
    array-length v2, v0

    if-ge v1, v2, :cond_1

    .line 576
    aget-object v2, v0, v1

    invoke-virtual {v2}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "com.amazonaws.metrics.internal.cloudwatch.DefaultMetricCollectorFactory"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 577
    sget-object v0, Lcom/amazonaws/metrics/AwsSdkMetrics;->ܳ֫:Lcom/amazonaws/auth/AWSCredentialsProvider;

    return-object v0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 580
    :cond_1
    new-instance v0, Ljava/lang/SecurityException;

    invoke-direct {v0}, Ljava/lang/SecurityException;-><init>()V

    .line 581
    const-class v1, Lcom/amazonaws/metrics/AwsSdkMetrics;

    invoke-static {v1}, Lcom/amazonaws/logging/LogFactory;->֫(Ljava/lang/Class;)Lcom/amazonaws/logging/Log;

    move-result-object v1

    const-string v2, "Illegal attempt to access the credential provider"

    invoke-interface {v1, v2, v0}, Lcom/amazonaws/logging/Log;->ܽ(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 583
    throw v0
.end method
