.class public Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketMetricsConfigurationsHandler;
.super Lcom/amazonaws/services/s3/model/transform/AbstractHandler;
.source "XmlResponsesSaxParser.java"


# instance fields
.field public ۗ:Lcom/amazonaws/services/s3/model/metrics/MetricsFilter;

.field public ۙ:Lcom/amazonaws/services/s3/model/metrics/MetricsConfiguration;

.field public final ۬:Lcom/amazonaws/services/s3/model/ListBucketMetricsConfigurationsResult;

.field public ᩶:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 2982
    invoke-direct {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;-><init>()V

    .line 2983
    new-instance v0, Lcom/amazonaws/services/s3/model/ListBucketMetricsConfigurationsResult;

    invoke-direct {v0}, Lcom/amazonaws/services/s3/model/ListBucketMetricsConfigurationsResult;-><init>()V

    iput-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketMetricsConfigurationsHandler;->۬:Lcom/amazonaws/services/s3/model/ListBucketMetricsConfigurationsResult;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;Lorg/xml/sax/Attributes;)V
    .locals 3

    const-string p2, "ListMetricsConfigurationsResult"

    .line 3000
    filled-new-array {p2}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v0

    const-string v1, "MetricsConfiguration"

    if-eqz v0, :cond_0

    .line 3001
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 3002
    new-instance p1, Lcom/amazonaws/services/s3/model/metrics/MetricsConfiguration;

    invoke-direct {p1}, Lcom/amazonaws/services/s3/model/metrics/MetricsConfiguration;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketMetricsConfigurationsHandler;->ۙ:Lcom/amazonaws/services/s3/model/metrics/MetricsConfiguration;

    return-void

    .line 3004
    :cond_0
    filled-new-array {p2, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v0

    const-string v2, "Filter"

    if-eqz v0, :cond_1

    .line 3005
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 3006
    new-instance p1, Lcom/amazonaws/services/s3/model/metrics/MetricsFilter;

    invoke-direct {p1}, Lcom/amazonaws/services/s3/model/metrics/MetricsFilter;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketMetricsConfigurationsHandler;->ۗ:Lcom/amazonaws/services/s3/model/metrics/MetricsFilter;

    return-void

    .line 3008
    :cond_1
    filled-new-array {p2, v1, v2}, [Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_2

    const-string p2, "And"

    .line 3009
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 3010
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketMetricsConfigurationsHandler;->᩶:Ljava/util/ArrayList;

    :cond_2
    return-void
.end method

.method public final ܳ(Ljava/lang/String;)V
    .locals 9

    const-string v0, "ListMetricsConfigurationsResult"

    .line 3017
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v1

    const-string v2, "MetricsConfiguration"

    const/4 v3, 0x0

    if-eqz v1, :cond_4

    .line 3018
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    iget-object v1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketMetricsConfigurationsHandler;->۬:Lcom/amazonaws/services/s3/model/ListBucketMetricsConfigurationsResult;

    if-eqz v0, :cond_1

    .line 3019
    invoke-virtual {v1}, Lcom/amazonaws/services/s3/model/ListBucketMetricsConfigurationsResult;->֫()Ljava/util/List;

    move-result-object p1

    if-nez p1, :cond_0

    .line 3020
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v1, p1}, Lcom/amazonaws/services/s3/model/ListBucketMetricsConfigurationsResult;->֫(Ljava/util/ArrayList;)V

    .line 3022
    :cond_0
    invoke-virtual {v1}, Lcom/amazonaws/services/s3/model/ListBucketMetricsConfigurationsResult;->֫()Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketMetricsConfigurationsHandler;->ۙ:Lcom/amazonaws/services/s3/model/metrics/MetricsConfiguration;

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3023
    iput-object v3, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketMetricsConfigurationsHandler;->ۙ:Lcom/amazonaws/services/s3/model/metrics/MetricsConfiguration;

    return-void

    :cond_1
    const-string v0, "IsTruncated"

    .line 3024
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string p1, "true"

    .line 3025
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_2
    const-string v0, "ContinuationToken"

    .line 3026
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 3027
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_3
    const-string v0, "NextContinuationToken"

    .line 3028
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_f

    .line 3029
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 3031
    :cond_4
    filled-new-array {v0, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v1

    const-string v4, "Filter"

    if-eqz v1, :cond_6

    const-string v0, "Id"

    .line 3032
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 3033
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketMetricsConfigurationsHandler;->ۙ:Lcom/amazonaws/services/s3/model/metrics/MetricsConfiguration;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 3034
    :cond_5
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_f

    .line 3035
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketMetricsConfigurationsHandler;->ۙ:Lcom/amazonaws/services/s3/model/metrics/MetricsConfiguration;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3036
    iput-object v3, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketMetricsConfigurationsHandler;->ۗ:Lcom/amazonaws/services/s3/model/metrics/MetricsFilter;

    return-void

    .line 3038
    :cond_6
    filled-new-array {v0, v2, v4}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v1

    const-string v5, "Prefix"

    const-string v6, "And"

    const-string v7, "Tag"

    if-eqz v1, :cond_9

    .line 3039
    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 3040
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketMetricsConfigurationsHandler;->ۗ:Lcom/amazonaws/services/s3/model/metrics/MetricsFilter;

    new-instance v0, Lcom/amazonaws/services/s3/model/metrics/MetricsPrefixPredicate;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    .line 29
    invoke-direct {v0}, Lcom/amazonaws/services/s3/model/metrics/MetricsFilterPredicate;-><init>()V

    .line 3040
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 3041
    :cond_7
    invoke-virtual {p1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 3042
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketMetricsConfigurationsHandler;->ۗ:Lcom/amazonaws/services/s3/model/metrics/MetricsFilter;

    new-instance v0, Lcom/amazonaws/services/s3/model/metrics/MetricsTagPredicate;

    .line 31
    invoke-direct {v0}, Lcom/amazonaws/services/s3/model/metrics/MetricsFilterPredicate;-><init>()V

    .line 3042
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 3046
    :cond_8
    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_f

    .line 3047
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketMetricsConfigurationsHandler;->ۗ:Lcom/amazonaws/services/s3/model/metrics/MetricsFilter;

    new-instance v0, Lcom/amazonaws/services/s3/model/metrics/MetricsAndOperator;

    iget-object v1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketMetricsConfigurationsHandler;->᩶:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Lcom/amazonaws/services/s3/model/metrics/MetricsAndOperator;-><init>(Ljava/util/ArrayList;)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3048
    iput-object v3, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketMetricsConfigurationsHandler;->᩶:Ljava/util/ArrayList;

    return-void

    .line 3050
    :cond_9
    filled-new-array {v0, v2, v4, v7}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v1

    const-string v3, "Value"

    const-string v8, "Key"

    if-eqz v1, :cond_b

    .line 3052
    invoke-virtual {p1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 3053
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    return-void

    .line 3054
    :cond_a
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_f

    .line 3055
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    return-void

    .line 3057
    :cond_b
    filled-new-array {v0, v2, v4, v6}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_d

    .line 3059
    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 3060
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketMetricsConfigurationsHandler;->᩶:Ljava/util/ArrayList;

    new-instance v0, Lcom/amazonaws/services/s3/model/metrics/MetricsPrefixPredicate;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    .line 29
    invoke-direct {v0}, Lcom/amazonaws/services/s3/model/metrics/MetricsFilterPredicate;-><init>()V

    .line 3060
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 3061
    :cond_c
    invoke-virtual {p1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_f

    .line 3062
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketMetricsConfigurationsHandler;->᩶:Ljava/util/ArrayList;

    new-instance v0, Lcom/amazonaws/services/s3/model/metrics/MetricsTagPredicate;

    .line 31
    invoke-direct {v0}, Lcom/amazonaws/services/s3/model/metrics/MetricsFilterPredicate;-><init>()V

    .line 3063
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 3067
    :cond_d
    filled-new-array {v0, v2, v4, v6, v7}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 3069
    invoke-virtual {p1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 3070
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    return-void

    .line 3071
    :cond_e
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_f

    .line 3072
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    :cond_f
    return-void
.end method
