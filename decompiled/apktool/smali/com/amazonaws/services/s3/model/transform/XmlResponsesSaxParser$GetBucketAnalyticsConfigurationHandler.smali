.class public Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$GetBucketAnalyticsConfigurationHandler;
.super Lcom/amazonaws/services/s3/model/transform/AbstractHandler;
.source "XmlResponsesSaxParser.java"


# instance fields
.field public ۗ:Lcom/amazonaws/services/s3/model/analytics/StorageClassAnalysisDataExport;

.field public final ۙ:Lcom/amazonaws/services/s3/model/analytics/AnalyticsConfiguration;

.field public ۛ:Lcom/amazonaws/services/s3/model/analytics/StorageClassAnalysis;

.field public ۤ:Lcom/amazonaws/services/s3/model/analytics/AnalyticsS3BucketDestination;

.field public ۫:Lcom/amazonaws/services/s3/model/analytics/AnalyticsFilter;

.field public ۬:Lcom/amazonaws/services/s3/model/analytics/AnalyticsExportDestination;

.field public ᩶:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 3113
    invoke-direct {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;-><init>()V

    .line 3114
    new-instance v0, Lcom/amazonaws/services/s3/model/analytics/AnalyticsConfiguration;

    invoke-direct {v0}, Lcom/amazonaws/services/s3/model/analytics/AnalyticsConfiguration;-><init>()V

    iput-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$GetBucketAnalyticsConfigurationHandler;->ۙ:Lcom/amazonaws/services/s3/model/analytics/AnalyticsConfiguration;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;Lorg/xml/sax/Attributes;)V
    .locals 4

    const-string p2, "AnalyticsConfiguration"

    .line 3135
    filled-new-array {p2}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v0

    const-string v1, "Filter"

    const-string v2, "StorageClassAnalysis"

    if-eqz v0, :cond_1

    .line 3136
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 3137
    new-instance p1, Lcom/amazonaws/services/s3/model/analytics/AnalyticsFilter;

    invoke-direct {p1}, Lcom/amazonaws/services/s3/model/analytics/AnalyticsFilter;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$GetBucketAnalyticsConfigurationHandler;->۫:Lcom/amazonaws/services/s3/model/analytics/AnalyticsFilter;

    return-void

    .line 3138
    :cond_0
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 3139
    new-instance p1, Lcom/amazonaws/services/s3/model/analytics/StorageClassAnalysis;

    invoke-direct {p1}, Lcom/amazonaws/services/s3/model/analytics/StorageClassAnalysis;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$GetBucketAnalyticsConfigurationHandler;->ۛ:Lcom/amazonaws/services/s3/model/analytics/StorageClassAnalysis;

    return-void

    .line 3141
    :cond_1
    filled-new-array {p2, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string p2, "And"

    .line 3142
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 3143
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$GetBucketAnalyticsConfigurationHandler;->᩶:Ljava/util/ArrayList;

    return-void

    .line 3145
    :cond_2
    filled-new-array {p2, v2}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v0

    const-string v1, "DataExport"

    if-eqz v0, :cond_3

    .line 3146
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 3147
    new-instance p1, Lcom/amazonaws/services/s3/model/analytics/StorageClassAnalysisDataExport;

    invoke-direct {p1}, Lcom/amazonaws/services/s3/model/analytics/StorageClassAnalysisDataExport;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$GetBucketAnalyticsConfigurationHandler;->ۗ:Lcom/amazonaws/services/s3/model/analytics/StorageClassAnalysisDataExport;

    return-void

    .line 3149
    :cond_3
    filled-new-array {p2, v2, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v0

    const-string v3, "Destination"

    if-eqz v0, :cond_4

    .line 3150
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 3151
    new-instance p1, Lcom/amazonaws/services/s3/model/analytics/AnalyticsExportDestination;

    invoke-direct {p1}, Lcom/amazonaws/services/s3/model/analytics/AnalyticsExportDestination;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$GetBucketAnalyticsConfigurationHandler;->۬:Lcom/amazonaws/services/s3/model/analytics/AnalyticsExportDestination;

    return-void

    .line 3153
    :cond_4
    filled-new-array {p2, v2, v1, v3}, [Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_5

    const-string p2, "S3BucketDestination"

    .line 3155
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 3156
    new-instance p1, Lcom/amazonaws/services/s3/model/analytics/AnalyticsS3BucketDestination;

    invoke-direct {p1}, Lcom/amazonaws/services/s3/model/analytics/AnalyticsS3BucketDestination;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$GetBucketAnalyticsConfigurationHandler;->ۤ:Lcom/amazonaws/services/s3/model/analytics/AnalyticsS3BucketDestination;

    :cond_5
    return-void
.end method

.method public final ܳ(Ljava/lang/String;)V
    .locals 9

    const-string v0, "AnalyticsConfiguration"

    .line 3163
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v1

    const-string v2, "StorageClassAnalysis"

    const-string v3, "Filter"

    if-eqz v1, :cond_2

    const-string v0, "Id"

    .line 3164
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    iget-object v1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$GetBucketAnalyticsConfigurationHandler;->ۙ:Lcom/amazonaws/services/s3/model/analytics/AnalyticsConfiguration;

    if-eqz v0, :cond_0

    .line 3165
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 3166
    :cond_0
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3167
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 3168
    :cond_1
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_13

    .line 3169
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 3171
    :cond_2
    filled-new-array {v0, v3}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v1

    const-string v4, "And"

    const-string v5, "Prefix"

    const-string v6, "Tag"

    if-eqz v1, :cond_5

    .line 3172
    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 3173
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$GetBucketAnalyticsConfigurationHandler;->۫:Lcom/amazonaws/services/s3/model/analytics/AnalyticsFilter;

    new-instance v0, Lcom/amazonaws/services/s3/model/analytics/AnalyticsPrefixPredicate;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    .line 29
    invoke-direct {v0}, Lcom/amazonaws/services/s3/model/analytics/AnalyticsFilterPredicate;-><init>()V

    .line 3173
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 3174
    :cond_3
    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 3175
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$GetBucketAnalyticsConfigurationHandler;->۫:Lcom/amazonaws/services/s3/model/analytics/AnalyticsFilter;

    new-instance v0, Lcom/amazonaws/services/s3/model/analytics/AnalyticsTagPredicate;

    .line 31
    invoke-direct {v0}, Lcom/amazonaws/services/s3/model/analytics/AnalyticsFilterPredicate;-><init>()V

    .line 3175
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 3179
    :cond_4
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_13

    .line 3180
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$GetBucketAnalyticsConfigurationHandler;->۫:Lcom/amazonaws/services/s3/model/analytics/AnalyticsFilter;

    new-instance v0, Lcom/amazonaws/services/s3/model/analytics/AnalyticsAndOperator;

    iget-object v1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$GetBucketAnalyticsConfigurationHandler;->᩶:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Lcom/amazonaws/services/s3/model/analytics/AnalyticsAndOperator;-><init>(Ljava/util/ArrayList;)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    .line 3181
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$GetBucketAnalyticsConfigurationHandler;->᩶:Ljava/util/ArrayList;

    return-void

    .line 3183
    :cond_5
    filled-new-array {v0, v3, v6}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v1

    const-string v7, "Value"

    const-string v8, "Key"

    if-eqz v1, :cond_7

    .line 3184
    invoke-virtual {p1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 3185
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    return-void

    .line 3186
    :cond_6
    invoke-virtual {p1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_13

    .line 3187
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    return-void

    .line 3189
    :cond_7
    filled-new-array {v0, v3, v4}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_9

    .line 3190
    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 3191
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$GetBucketAnalyticsConfigurationHandler;->᩶:Ljava/util/ArrayList;

    new-instance v0, Lcom/amazonaws/services/s3/model/analytics/AnalyticsPrefixPredicate;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    .line 29
    invoke-direct {v0}, Lcom/amazonaws/services/s3/model/analytics/AnalyticsFilterPredicate;-><init>()V

    .line 3191
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 3192
    :cond_8
    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_13

    .line 3193
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$GetBucketAnalyticsConfigurationHandler;->᩶:Ljava/util/ArrayList;

    new-instance v0, Lcom/amazonaws/services/s3/model/analytics/AnalyticsTagPredicate;

    .line 31
    invoke-direct {v0}, Lcom/amazonaws/services/s3/model/analytics/AnalyticsFilterPredicate;-><init>()V

    .line 3193
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 3198
    :cond_9
    filled-new-array {v0, v3, v4, v6}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_b

    .line 3199
    invoke-virtual {p1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 3200
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    return-void

    .line 3201
    :cond_a
    invoke-virtual {p1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_13

    .line 3202
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    return-void

    .line 3204
    :cond_b
    filled-new-array {v0, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v1

    const-string v3, "DataExport"

    if-eqz v1, :cond_c

    .line 3205
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_13

    .line 3206
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$GetBucketAnalyticsConfigurationHandler;->ۛ:Lcom/amazonaws/services/s3/model/analytics/StorageClassAnalysis;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 3208
    :cond_c
    filled-new-array {v0, v2, v3}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v1

    const-string v4, "Destination"

    if-eqz v1, :cond_e

    const-string v0, "OutputSchemaVersion"

    .line 3209
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 3210
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$GetBucketAnalyticsConfigurationHandler;->ۗ:Lcom/amazonaws/services/s3/model/analytics/StorageClassAnalysisDataExport;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 3211
    :cond_d
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_13

    .line 3212
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$GetBucketAnalyticsConfigurationHandler;->ۗ:Lcom/amazonaws/services/s3/model/analytics/StorageClassAnalysisDataExport;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 3214
    :cond_e
    filled-new-array {v0, v2, v3, v4}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v1

    const-string v6, "S3BucketDestination"

    if-eqz v1, :cond_f

    .line 3216
    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_13

    .line 3217
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$GetBucketAnalyticsConfigurationHandler;->۬:Lcom/amazonaws/services/s3/model/analytics/AnalyticsExportDestination;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 3219
    :cond_f
    filled-new-array {v0, v2, v3, v4, v6}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_13

    const-string v0, "Format"

    .line 3221
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 3222
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$GetBucketAnalyticsConfigurationHandler;->ۤ:Lcom/amazonaws/services/s3/model/analytics/AnalyticsS3BucketDestination;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_10
    const-string v0, "BucketAccountId"

    .line 3223
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_11

    .line 3224
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$GetBucketAnalyticsConfigurationHandler;->ۤ:Lcom/amazonaws/services/s3/model/analytics/AnalyticsS3BucketDestination;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_11
    const-string v0, "Bucket"

    .line 3225
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_12

    .line 3226
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$GetBucketAnalyticsConfigurationHandler;->ۤ:Lcom/amazonaws/services/s3/model/analytics/AnalyticsS3BucketDestination;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 3227
    :cond_12
    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_13

    .line 3228
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$GetBucketAnalyticsConfigurationHandler;->ۤ:Lcom/amazonaws/services/s3/model/analytics/AnalyticsS3BucketDestination;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_13
    return-void
.end method
