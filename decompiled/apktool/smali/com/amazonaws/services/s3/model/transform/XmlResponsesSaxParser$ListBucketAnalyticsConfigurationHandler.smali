.class public Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketAnalyticsConfigurationHandler;
.super Lcom/amazonaws/services/s3/model/transform/AbstractHandler;
.source "XmlResponsesSaxParser.java"


# instance fields
.field public ۗ:Lcom/amazonaws/services/s3/model/analytics/AnalyticsFilter;

.field public ۙ:Lcom/amazonaws/services/s3/model/analytics/AnalyticsConfiguration;

.field public ۛ:Lcom/amazonaws/services/s3/model/analytics/AnalyticsS3BucketDestination;

.field public final ۤ:Lcom/amazonaws/services/s3/model/ListBucketAnalyticsConfigurationsResult;

.field public ۨ:Lcom/amazonaws/services/s3/model/analytics/StorageClassAnalysis;

.field public ۫:Lcom/amazonaws/services/s3/model/analytics/AnalyticsExportDestination;

.field public ۬:Lcom/amazonaws/services/s3/model/analytics/StorageClassAnalysisDataExport;

.field public ᩶:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 3251
    invoke-direct {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;-><init>()V

    .line 3252
    new-instance v0, Lcom/amazonaws/services/s3/model/ListBucketAnalyticsConfigurationsResult;

    invoke-direct {v0}, Lcom/amazonaws/services/s3/model/ListBucketAnalyticsConfigurationsResult;-><init>()V

    iput-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketAnalyticsConfigurationHandler;->ۤ:Lcom/amazonaws/services/s3/model/ListBucketAnalyticsConfigurationsResult;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;Lorg/xml/sax/Attributes;)V
    .locals 5

    const-string p2, "ListBucketAnalyticsConfigurationsResult"

    .line 3273
    filled-new-array {p2}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v0

    const-string v1, "AnalyticsConfiguration"

    if-eqz v0, :cond_0

    .line 3274
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 3275
    new-instance p1, Lcom/amazonaws/services/s3/model/analytics/AnalyticsConfiguration;

    invoke-direct {p1}, Lcom/amazonaws/services/s3/model/analytics/AnalyticsConfiguration;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketAnalyticsConfigurationHandler;->ۙ:Lcom/amazonaws/services/s3/model/analytics/AnalyticsConfiguration;

    return-void

    .line 3277
    :cond_0
    filled-new-array {p2, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v0

    const-string v2, "Filter"

    const-string v3, "StorageClassAnalysis"

    if-eqz v0, :cond_2

    .line 3278
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 3279
    new-instance p1, Lcom/amazonaws/services/s3/model/analytics/AnalyticsFilter;

    invoke-direct {p1}, Lcom/amazonaws/services/s3/model/analytics/AnalyticsFilter;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketAnalyticsConfigurationHandler;->ۗ:Lcom/amazonaws/services/s3/model/analytics/AnalyticsFilter;

    return-void

    .line 3280
    :cond_1
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 3281
    new-instance p1, Lcom/amazonaws/services/s3/model/analytics/StorageClassAnalysis;

    invoke-direct {p1}, Lcom/amazonaws/services/s3/model/analytics/StorageClassAnalysis;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketAnalyticsConfigurationHandler;->ۨ:Lcom/amazonaws/services/s3/model/analytics/StorageClassAnalysis;

    return-void

    .line 3283
    :cond_2
    filled-new-array {p2, v1, v2}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string p2, "And"

    .line 3285
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 3286
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketAnalyticsConfigurationHandler;->᩶:Ljava/util/ArrayList;

    return-void

    .line 3288
    :cond_3
    filled-new-array {p2, v1, v3}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v0

    const-string v2, "DataExport"

    if-eqz v0, :cond_4

    .line 3290
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 3291
    new-instance p1, Lcom/amazonaws/services/s3/model/analytics/StorageClassAnalysisDataExport;

    invoke-direct {p1}, Lcom/amazonaws/services/s3/model/analytics/StorageClassAnalysisDataExport;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketAnalyticsConfigurationHandler;->۬:Lcom/amazonaws/services/s3/model/analytics/StorageClassAnalysisDataExport;

    return-void

    .line 3293
    :cond_4
    filled-new-array {p2, v1, v3, v2}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v0

    const-string v4, "Destination"

    if-eqz v0, :cond_5

    .line 3295
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 3296
    new-instance p1, Lcom/amazonaws/services/s3/model/analytics/AnalyticsExportDestination;

    invoke-direct {p1}, Lcom/amazonaws/services/s3/model/analytics/AnalyticsExportDestination;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketAnalyticsConfigurationHandler;->۫:Lcom/amazonaws/services/s3/model/analytics/AnalyticsExportDestination;

    return-void

    .line 3298
    :cond_5
    filled-new-array {p2, v1, v3, v2, v4}, [Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_6

    const-string p2, "S3BucketDestination"

    .line 3300
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 3301
    new-instance p1, Lcom/amazonaws/services/s3/model/analytics/AnalyticsS3BucketDestination;

    invoke-direct {p1}, Lcom/amazonaws/services/s3/model/analytics/AnalyticsS3BucketDestination;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketAnalyticsConfigurationHandler;->ۛ:Lcom/amazonaws/services/s3/model/analytics/AnalyticsS3BucketDestination;

    :cond_6
    return-void
.end method

.method public final ܳ(Ljava/lang/String;)V
    .locals 10

    const-string v0, "ListBucketAnalyticsConfigurationsResult"

    .line 3308
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x0

    const-string v3, "AnalyticsConfiguration"

    if-eqz v1, :cond_4

    .line 3309
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    iget-object v1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketAnalyticsConfigurationHandler;->ۤ:Lcom/amazonaws/services/s3/model/ListBucketAnalyticsConfigurationsResult;

    if-eqz v0, :cond_1

    .line 3310
    invoke-virtual {v1}, Lcom/amazonaws/services/s3/model/ListBucketAnalyticsConfigurationsResult;->֫()Ljava/util/List;

    move-result-object p1

    if-nez p1, :cond_0

    .line 3311
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v1, p1}, Lcom/amazonaws/services/s3/model/ListBucketAnalyticsConfigurationsResult;->֫(Ljava/util/ArrayList;)V

    .line 3314
    :cond_0
    invoke-virtual {v1}, Lcom/amazonaws/services/s3/model/ListBucketAnalyticsConfigurationsResult;->֫()Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketAnalyticsConfigurationHandler;->ۙ:Lcom/amazonaws/services/s3/model/analytics/AnalyticsConfiguration;

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3315
    iput-object v2, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketAnalyticsConfigurationHandler;->ۙ:Lcom/amazonaws/services/s3/model/analytics/AnalyticsConfiguration;

    return-void

    :cond_1
    const-string v0, "IsTruncated"

    .line 3316
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string p1, "true"

    .line 3317
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_2
    const-string v0, "ContinuationToken"

    .line 3318
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 3319
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_3
    const-string v0, "NextContinuationToken"

    .line 3320
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_18

    .line 3321
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 3323
    :cond_4
    filled-new-array {v0, v3}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v1

    const-string v4, "StorageClassAnalysis"

    const-string v5, "Filter"

    if-eqz v1, :cond_7

    const-string v0, "Id"

    .line 3324
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 3325
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketAnalyticsConfigurationHandler;->ۙ:Lcom/amazonaws/services/s3/model/analytics/AnalyticsConfiguration;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 3326
    :cond_5
    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 3327
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketAnalyticsConfigurationHandler;->ۙ:Lcom/amazonaws/services/s3/model/analytics/AnalyticsConfiguration;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 3328
    :cond_6
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_18

    .line 3329
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketAnalyticsConfigurationHandler;->ۙ:Lcom/amazonaws/services/s3/model/analytics/AnalyticsConfiguration;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 3331
    :cond_7
    filled-new-array {v0, v3, v5}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v1

    const-string v6, "And"

    const-string v7, "Prefix"

    const-string v8, "Tag"

    if-eqz v1, :cond_a

    .line 3333
    invoke-virtual {p1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 3334
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketAnalyticsConfigurationHandler;->ۗ:Lcom/amazonaws/services/s3/model/analytics/AnalyticsFilter;

    new-instance v0, Lcom/amazonaws/services/s3/model/analytics/AnalyticsPrefixPredicate;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    .line 29
    invoke-direct {v0}, Lcom/amazonaws/services/s3/model/analytics/AnalyticsFilterPredicate;-><init>()V

    .line 3334
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 3335
    :cond_8
    invoke-virtual {p1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 3336
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketAnalyticsConfigurationHandler;->ۗ:Lcom/amazonaws/services/s3/model/analytics/AnalyticsFilter;

    new-instance v0, Lcom/amazonaws/services/s3/model/analytics/AnalyticsTagPredicate;

    .line 31
    invoke-direct {v0}, Lcom/amazonaws/services/s3/model/analytics/AnalyticsFilterPredicate;-><init>()V

    .line 3336
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 3340
    :cond_9
    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_18

    .line 3341
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketAnalyticsConfigurationHandler;->ۗ:Lcom/amazonaws/services/s3/model/analytics/AnalyticsFilter;

    new-instance v0, Lcom/amazonaws/services/s3/model/analytics/AnalyticsAndOperator;

    iget-object v1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketAnalyticsConfigurationHandler;->᩶:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Lcom/amazonaws/services/s3/model/analytics/AnalyticsAndOperator;-><init>(Ljava/util/ArrayList;)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3342
    iput-object v2, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketAnalyticsConfigurationHandler;->᩶:Ljava/util/ArrayList;

    return-void

    .line 3344
    :cond_a
    filled-new-array {v0, v3, v5, v8}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v1

    const-string v2, "Value"

    const-string v9, "Key"

    if-eqz v1, :cond_c

    .line 3346
    invoke-virtual {p1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 3347
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    return-void

    .line 3348
    :cond_b
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_18

    .line 3349
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    return-void

    .line 3351
    :cond_c
    filled-new-array {v0, v3, v5, v6}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_e

    .line 3353
    invoke-virtual {p1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 3354
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketAnalyticsConfigurationHandler;->᩶:Ljava/util/ArrayList;

    new-instance v0, Lcom/amazonaws/services/s3/model/analytics/AnalyticsPrefixPredicate;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    .line 29
    invoke-direct {v0}, Lcom/amazonaws/services/s3/model/analytics/AnalyticsFilterPredicate;-><init>()V

    .line 3354
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 3355
    :cond_d
    invoke-virtual {p1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_18

    .line 3356
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketAnalyticsConfigurationHandler;->᩶:Ljava/util/ArrayList;

    new-instance v0, Lcom/amazonaws/services/s3/model/analytics/AnalyticsTagPredicate;

    .line 31
    invoke-direct {v0}, Lcom/amazonaws/services/s3/model/analytics/AnalyticsFilterPredicate;-><init>()V

    .line 3356
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 3361
    :cond_e
    filled-new-array {v0, v3, v5, v6, v8}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_10

    .line 3363
    invoke-virtual {p1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 3364
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    return-void

    .line 3365
    :cond_f
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_18

    .line 3366
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    return-void

    .line 3368
    :cond_10
    filled-new-array {v0, v3, v4}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v1

    const-string v2, "DataExport"

    if-eqz v1, :cond_11

    .line 3370
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_18

    .line 3371
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketAnalyticsConfigurationHandler;->ۨ:Lcom/amazonaws/services/s3/model/analytics/StorageClassAnalysis;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 3373
    :cond_11
    filled-new-array {v0, v3, v4, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v1

    const-string v5, "Destination"

    if-eqz v1, :cond_13

    const-string v0, "OutputSchemaVersion"

    .line 3375
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_12

    .line 3376
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketAnalyticsConfigurationHandler;->۬:Lcom/amazonaws/services/s3/model/analytics/StorageClassAnalysisDataExport;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 3377
    :cond_12
    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_18

    .line 3378
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketAnalyticsConfigurationHandler;->۬:Lcom/amazonaws/services/s3/model/analytics/StorageClassAnalysisDataExport;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 3380
    :cond_13
    filled-new-array {v0, v3, v4, v2, v5}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_14

    const-string v0, "S3BucketDestination"

    .line 3382
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_18

    .line 3383
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketAnalyticsConfigurationHandler;->۫:Lcom/amazonaws/services/s3/model/analytics/AnalyticsExportDestination;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_14
    const-string v4, "Destination"

    const-string v5, "S3BucketDestination"

    const-string v0, "ListBucketAnalyticsConfigurationsResult"

    const-string v1, "AnalyticsConfiguration"

    const-string v2, "StorageClassAnalysis"

    const-string v3, "DataExport"

    .line 3385
    filled-new-array/range {v0 .. v5}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_18

    const-string v0, "Format"

    .line 3387
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_15

    .line 3388
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketAnalyticsConfigurationHandler;->ۛ:Lcom/amazonaws/services/s3/model/analytics/AnalyticsS3BucketDestination;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_15
    const-string v0, "BucketAccountId"

    .line 3389
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_16

    .line 3390
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketAnalyticsConfigurationHandler;->ۛ:Lcom/amazonaws/services/s3/model/analytics/AnalyticsS3BucketDestination;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_16
    const-string v0, "Bucket"

    .line 3391
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_17

    .line 3392
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketAnalyticsConfigurationHandler;->ۛ:Lcom/amazonaws/services/s3/model/analytics/AnalyticsS3BucketDestination;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 3393
    :cond_17
    invoke-virtual {p1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_18

    .line 3394
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketAnalyticsConfigurationHandler;->ۛ:Lcom/amazonaws/services/s3/model/analytics/AnalyticsS3BucketDestination;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_18
    return-void
.end method
