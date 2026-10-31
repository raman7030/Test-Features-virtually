.class public Lcom/amazonaws/metrics/AwsSdkMetrics$MetricRegistry;
.super Ljava/lang/Object;
.source "AwsSdkMetrics.java"


# instance fields
.field public final ֫:Ljava/util/HashSet;

.field public volatile ۧ:Ljava/util/Set;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 758
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 755
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/amazonaws/metrics/AwsSdkMetrics$MetricRegistry;->֫:Ljava/util/HashSet;

    .line 759
    sget-object v1, Lcom/amazonaws/util/AWSRequestMetrics$Field;->ۗ:Lcom/amazonaws/util/AWSRequestMetrics$Field;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 760
    sget-object v1, Lcom/amazonaws/util/AWSRequestMetrics$Field;->۫:Lcom/amazonaws/util/AWSRequestMetrics$Field;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 761
    sget-object v1, Lcom/amazonaws/util/AWSRequestMetrics$Field;->ۛ:Lcom/amazonaws/util/AWSRequestMetrics$Field;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 762
    sget-object v1, Lcom/amazonaws/util/AWSRequestMetrics$Field;->᩺:Lcom/amazonaws/util/AWSRequestMetrics$Field;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 763
    sget-object v1, Lcom/amazonaws/util/AWSRequestMetrics$Field;->۟:Lcom/amazonaws/util/AWSRequestMetrics$Field;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 766
    sget-object v1, Lcom/amazonaws/util/AWSRequestMetrics$Field;->ᩳ֫:Lcom/amazonaws/util/AWSRequestMetrics$Field;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 767
    sget-object v1, Lcom/amazonaws/util/AWSRequestMetrics$Field;->ۨ:Lcom/amazonaws/util/AWSRequestMetrics$Field;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 768
    sget-object v1, Lcom/amazonaws/util/AWSRequestMetrics$Field;->ۤ:Lcom/amazonaws/util/AWSRequestMetrics$Field;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 769
    sget-object v1, Lcom/amazonaws/util/AWSServiceMetrics;->᩶:Lcom/amazonaws/util/AWSServiceMetrics;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 770
    invoke-direct {p0}, Lcom/amazonaws/metrics/AwsSdkMetrics$MetricRegistry;->ۧ()V

    return-void
.end method

.method private ۧ()V
    .locals 2

    .line 774
    new-instance v0, Ljava/util/HashSet;

    iget-object v1, p0, Lcom/amazonaws/metrics/AwsSdkMetrics$MetricRegistry;->֫:Ljava/util/HashSet;

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/amazonaws/metrics/AwsSdkMetrics$MetricRegistry;->ۧ:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/util/Set;
    .locals 1

    .line 820
    iget-object v0, p0, Lcom/amazonaws/metrics/AwsSdkMetrics$MetricRegistry;->ۧ:Ljava/util/Set;

    return-object v0
.end method

.method public final ֫(Lcom/amazonaws/metrics/MetricType;)Z
    .locals 2

    .line 778
    iget-object v0, p0, Lcom/amazonaws/metrics/AwsSdkMetrics$MetricRegistry;->֫:Ljava/util/HashSet;

    monitor-enter v0

    .line 779
    :try_start_0
    iget-object v1, p0, Lcom/amazonaws/metrics/AwsSdkMetrics$MetricRegistry;->֫:Ljava/util/HashSet;

    invoke-virtual {v1, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 781
    invoke-direct {p0}, Lcom/amazonaws/metrics/AwsSdkMetrics$MetricRegistry;->ۧ()V

    .line 782
    :cond_0
    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 783
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ֫(Ljava/util/Collection;)Z
    .locals 2

    .line 787
    iget-object v0, p0, Lcom/amazonaws/metrics/AwsSdkMetrics$MetricRegistry;->֫:Ljava/util/HashSet;

    monitor-enter v0

    .line 788
    :try_start_0
    iget-object v1, p0, Lcom/amazonaws/metrics/AwsSdkMetrics$MetricRegistry;->֫:Ljava/util/HashSet;

    invoke-interface {v1, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 790
    invoke-direct {p0}, Lcom/amazonaws/metrics/AwsSdkMetrics$MetricRegistry;->ۧ()V

    .line 791
    :cond_0
    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 792
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ۧ(Ljava/util/Collection;)V
    .locals 2

    .line 796
    iget-object v0, p0, Lcom/amazonaws/metrics/AwsSdkMetrics$MetricRegistry;->֫:Ljava/util/HashSet;

    monitor-enter v0

    if-eqz p1, :cond_0

    .line 797
    :try_start_0
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v1

    if-nez v1, :cond_2

    .line 798
    :cond_0
    iget-object v1, p0, Lcom/amazonaws/metrics/AwsSdkMetrics$MetricRegistry;->֫:Ljava/util/HashSet;

    invoke-virtual {v1}, Ljava/util/HashSet;->size()I

    move-result v1

    if-nez v1, :cond_1

    .line 799
    monitor-exit v0

    return-void

    :cond_1
    if-nez p1, :cond_2

    .line 801
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 803
    :cond_2
    iget-object v1, p0, Lcom/amazonaws/metrics/AwsSdkMetrics$MetricRegistry;->֫:Ljava/util/HashSet;

    invoke-virtual {v1}, Ljava/util/HashSet;->clear()V

    .line 804
    invoke-virtual {p0, p1}, Lcom/amazonaws/metrics/AwsSdkMetrics$MetricRegistry;->֫(Ljava/util/Collection;)Z

    move-result p1

    if-nez p1, :cond_3

    .line 805
    invoke-direct {p0}, Lcom/amazonaws/metrics/AwsSdkMetrics$MetricRegistry;->ۧ()V

    .line 807
    :cond_3
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ۧ(Lcom/amazonaws/metrics/MetricType;)Z
    .locals 2

    .line 811
    iget-object v0, p0, Lcom/amazonaws/metrics/AwsSdkMetrics$MetricRegistry;->֫:Ljava/util/HashSet;

    monitor-enter v0

    .line 812
    :try_start_0
    iget-object v1, p0, Lcom/amazonaws/metrics/AwsSdkMetrics$MetricRegistry;->֫:Ljava/util/HashSet;

    invoke-virtual {v1, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 814
    invoke-direct {p0}, Lcom/amazonaws/metrics/AwsSdkMetrics$MetricRegistry;->ۧ()V

    .line 815
    :cond_0
    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 816
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
