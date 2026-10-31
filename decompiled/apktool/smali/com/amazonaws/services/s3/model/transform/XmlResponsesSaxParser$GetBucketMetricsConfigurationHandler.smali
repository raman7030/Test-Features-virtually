.class public Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$GetBucketMetricsConfigurationHandler;
.super Lcom/amazonaws/services/s3/model/transform/AbstractHandler;
.source "XmlResponsesSaxParser.java"


# instance fields
.field public ۗ:Lcom/amazonaws/services/s3/model/metrics/MetricsFilter;

.field public final ۙ:Lcom/amazonaws/services/s3/model/metrics/MetricsConfiguration;

.field public ᩶:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 2890
    invoke-direct {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;-><init>()V

    .line 2891
    new-instance v0, Lcom/amazonaws/services/s3/model/metrics/MetricsConfiguration;

    invoke-direct {v0}, Lcom/amazonaws/services/s3/model/metrics/MetricsConfiguration;-><init>()V

    iput-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$GetBucketMetricsConfigurationHandler;->ۙ:Lcom/amazonaws/services/s3/model/metrics/MetricsConfiguration;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;Lorg/xml/sax/Attributes;)V
    .locals 2

    const-string p2, "MetricsConfiguration"

    .line 2908
    filled-new-array {p2}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v0

    const-string v1, "Filter"

    if-eqz v0, :cond_0

    .line 2909
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 2910
    new-instance p1, Lcom/amazonaws/services/s3/model/metrics/MetricsFilter;

    invoke-direct {p1}, Lcom/amazonaws/services/s3/model/metrics/MetricsFilter;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$GetBucketMetricsConfigurationHandler;->ۗ:Lcom/amazonaws/services/s3/model/metrics/MetricsFilter;

    return-void

    .line 2912
    :cond_0
    filled-new-array {p2, v1}, [Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_1

    const-string p2, "And"

    .line 2913
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 2914
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$GetBucketMetricsConfigurationHandler;->᩶:Ljava/util/ArrayList;

    :cond_1
    return-void
.end method

.method public final ܳ(Ljava/lang/String;)V
    .locals 8

    const-string v0, "MetricsConfiguration"

    .line 2921
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v1

    const-string v2, "Filter"

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    const-string v0, "Id"

    .line 2922
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    iget-object v1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$GetBucketMetricsConfigurationHandler;->ۙ:Lcom/amazonaws/services/s3/model/metrics/MetricsConfiguration;

    if-eqz v0, :cond_0

    .line 2923
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 2924
    :cond_0
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_a

    .line 2925
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2926
    iput-object v3, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$GetBucketMetricsConfigurationHandler;->ۗ:Lcom/amazonaws/services/s3/model/metrics/MetricsFilter;

    return-void

    .line 2928
    :cond_1
    filled-new-array {v0, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v1

    const-string v4, "Prefix"

    const-string v5, "And"

    const-string v6, "Tag"

    if-eqz v1, :cond_4

    .line 2929
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2930
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$GetBucketMetricsConfigurationHandler;->ۗ:Lcom/amazonaws/services/s3/model/metrics/MetricsFilter;

    new-instance v0, Lcom/amazonaws/services/s3/model/metrics/MetricsPrefixPredicate;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    .line 29
    invoke-direct {v0}, Lcom/amazonaws/services/s3/model/metrics/MetricsFilterPredicate;-><init>()V

    .line 2930
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 2931
    :cond_2
    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 2932
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$GetBucketMetricsConfigurationHandler;->ۗ:Lcom/amazonaws/services/s3/model/metrics/MetricsFilter;

    new-instance v0, Lcom/amazonaws/services/s3/model/metrics/MetricsTagPredicate;

    .line 31
    invoke-direct {v0}, Lcom/amazonaws/services/s3/model/metrics/MetricsFilterPredicate;-><init>()V

    .line 2932
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 2936
    :cond_3
    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_a

    .line 2937
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$GetBucketMetricsConfigurationHandler;->ۗ:Lcom/amazonaws/services/s3/model/metrics/MetricsFilter;

    new-instance v0, Lcom/amazonaws/services/s3/model/metrics/MetricsAndOperator;

    iget-object v1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$GetBucketMetricsConfigurationHandler;->᩶:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Lcom/amazonaws/services/s3/model/metrics/MetricsAndOperator;-><init>(Ljava/util/ArrayList;)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2938
    iput-object v3, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$GetBucketMetricsConfigurationHandler;->᩶:Ljava/util/ArrayList;

    return-void

    .line 2940
    :cond_4
    filled-new-array {v0, v2, v6}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v1

    const-string v3, "Value"

    const-string v7, "Key"

    if-eqz v1, :cond_6

    .line 2941
    invoke-virtual {p1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 2942
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    return-void

    .line 2943
    :cond_5
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_a

    .line 2944
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    return-void

    .line 2946
    :cond_6
    filled-new-array {v0, v2, v5}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 2947
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 2948
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$GetBucketMetricsConfigurationHandler;->᩶:Ljava/util/ArrayList;

    new-instance v0, Lcom/amazonaws/services/s3/model/metrics/MetricsPrefixPredicate;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    .line 29
    invoke-direct {v0}, Lcom/amazonaws/services/s3/model/metrics/MetricsFilterPredicate;-><init>()V

    .line 2948
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 2949
    :cond_7
    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_a

    .line 2950
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$GetBucketMetricsConfigurationHandler;->᩶:Ljava/util/ArrayList;

    new-instance v0, Lcom/amazonaws/services/s3/model/metrics/MetricsTagPredicate;

    .line 31
    invoke-direct {v0}, Lcom/amazonaws/services/s3/model/metrics/MetricsFilterPredicate;-><init>()V

    .line 2950
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 2955
    :cond_8
    filled-new-array {v0, v2, v5, v6}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 2956
    invoke-virtual {p1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 2957
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    return-void

    .line 2958
    :cond_9
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_a

    .line 2959
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    :cond_a
    return-void
.end method
