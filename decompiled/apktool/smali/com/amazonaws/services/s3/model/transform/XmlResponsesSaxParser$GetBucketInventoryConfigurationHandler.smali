.class public Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$GetBucketInventoryConfigurationHandler;
.super Lcom/amazonaws/services/s3/model/transform/AbstractHandler;
.source "XmlResponsesSaxParser.java"


# instance fields
.field public ۗ:Lcom/amazonaws/services/s3/model/inventory/InventoryDestination;

.field public ۙ:Lcom/amazonaws/services/s3/model/inventory/InventoryFilter;

.field public ۤ:Lcom/amazonaws/services/s3/model/inventory/InventoryS3BucketDestination;

.field public ۫:Ljava/util/ArrayList;

.field public ۬:Lcom/amazonaws/services/s3/model/inventory/InventorySchedule;

.field public final ᩶:Lcom/amazonaws/services/s3/model/inventory/InventoryConfiguration;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 3437
    invoke-direct {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;-><init>()V

    .line 3438
    new-instance v0, Lcom/amazonaws/services/s3/model/GetBucketInventoryConfigurationResult;

    invoke-direct {v0}, Lcom/amazonaws/services/s3/model/GetBucketInventoryConfigurationResult;-><init>()V

    .line 3439
    new-instance v0, Lcom/amazonaws/services/s3/model/inventory/InventoryConfiguration;

    invoke-direct {v0}, Lcom/amazonaws/services/s3/model/inventory/InventoryConfiguration;-><init>()V

    iput-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$GetBucketInventoryConfigurationHandler;->᩶:Lcom/amazonaws/services/s3/model/inventory/InventoryConfiguration;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;Lorg/xml/sax/Attributes;)V
    .locals 2

    const-string p2, "InventoryConfiguration"

    .line 3456
    filled-new-array {p2}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v0

    const-string v1, "Destination"

    if-eqz v0, :cond_3

    .line 3457
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 3458
    new-instance p1, Lcom/amazonaws/services/s3/model/inventory/InventoryDestination;

    invoke-direct {p1}, Lcom/amazonaws/services/s3/model/inventory/InventoryDestination;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$GetBucketInventoryConfigurationHandler;->ۗ:Lcom/amazonaws/services/s3/model/inventory/InventoryDestination;

    return-void

    :cond_0
    const-string p2, "Filter"

    .line 3459
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 3460
    new-instance p1, Lcom/amazonaws/services/s3/model/inventory/InventoryFilter;

    invoke-direct {p1}, Lcom/amazonaws/services/s3/model/inventory/InventoryFilter;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$GetBucketInventoryConfigurationHandler;->ۙ:Lcom/amazonaws/services/s3/model/inventory/InventoryFilter;

    return-void

    :cond_1
    const-string p2, "Schedule"

    .line 3461
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 3462
    new-instance p1, Lcom/amazonaws/services/s3/model/inventory/InventorySchedule;

    invoke-direct {p1}, Lcom/amazonaws/services/s3/model/inventory/InventorySchedule;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$GetBucketInventoryConfigurationHandler;->۬:Lcom/amazonaws/services/s3/model/inventory/InventorySchedule;

    return-void

    :cond_2
    const-string p2, "OptionalFields"

    .line 3463
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 3464
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$GetBucketInventoryConfigurationHandler;->۫:Ljava/util/ArrayList;

    return-void

    .line 3466
    :cond_3
    filled-new-array {p2, v1}, [Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_4

    const-string p2, "S3BucketDestination"

    .line 3467
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 3468
    new-instance p1, Lcom/amazonaws/services/s3/model/inventory/InventoryS3BucketDestination;

    invoke-direct {p1}, Lcom/amazonaws/services/s3/model/inventory/InventoryS3BucketDestination;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$GetBucketInventoryConfigurationHandler;->ۤ:Lcom/amazonaws/services/s3/model/inventory/InventoryS3BucketDestination;

    :cond_4
    return-void
.end method

.method public final ܳ(Ljava/lang/String;)V
    .locals 8

    const-string v0, "InventoryConfiguration"

    .line 3475
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v1

    const-string v2, "OptionalFields"

    const-string v3, "Schedule"

    const-string v4, "Filter"

    const-string v5, "Destination"

    const/4 v6, 0x0

    if-eqz v1, :cond_6

    const-string v0, "Id"

    .line 3476
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    iget-object v1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$GetBucketInventoryConfigurationHandler;->᩶:Lcom/amazonaws/services/s3/model/inventory/InventoryConfiguration;

    if-eqz v0, :cond_0

    .line 3477
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 3478
    :cond_0
    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3479
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3480
    iput-object v6, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$GetBucketInventoryConfigurationHandler;->ۗ:Lcom/amazonaws/services/s3/model/inventory/InventoryDestination;

    return-void

    :cond_1
    const-string v0, "IsEnabled"

    .line 3481
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string p1, "true"

    .line 3482
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 3483
    :cond_2
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 3484
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3485
    iput-object v6, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$GetBucketInventoryConfigurationHandler;->ۙ:Lcom/amazonaws/services/s3/model/inventory/InventoryFilter;

    return-void

    :cond_3
    const-string v0, "IncludedObjectVersions"

    .line 3486
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 3487
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 3488
    :cond_4
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 3489
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3490
    iput-object v6, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$GetBucketInventoryConfigurationHandler;->۬:Lcom/amazonaws/services/s3/model/inventory/InventorySchedule;

    return-void

    .line 3491
    :cond_5
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_e

    .line 3492
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3493
    iput-object v6, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$GetBucketInventoryConfigurationHandler;->۫:Ljava/util/ArrayList;

    return-void

    .line 3495
    :cond_6
    filled-new-array {v0, v5}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v1

    const-string v7, "S3BucketDestination"

    if-eqz v1, :cond_7

    .line 3496
    invoke-virtual {p1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_e

    .line 3497
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$GetBucketInventoryConfigurationHandler;->ۗ:Lcom/amazonaws/services/s3/model/inventory/InventoryDestination;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3498
    iput-object v6, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$GetBucketInventoryConfigurationHandler;->ۤ:Lcom/amazonaws/services/s3/model/inventory/InventoryS3BucketDestination;

    return-void

    .line 3500
    :cond_7
    filled-new-array {v0, v5, v7}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v1

    const-string v5, "Prefix"

    if-eqz v1, :cond_b

    const-string v0, "AccountId"

    .line 3501
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 3502
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$GetBucketInventoryConfigurationHandler;->ۤ:Lcom/amazonaws/services/s3/model/inventory/InventoryS3BucketDestination;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_8
    const-string v0, "Bucket"

    .line 3503
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 3504
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$GetBucketInventoryConfigurationHandler;->ۤ:Lcom/amazonaws/services/s3/model/inventory/InventoryS3BucketDestination;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_9
    const-string v0, "Format"

    .line 3505
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 3506
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$GetBucketInventoryConfigurationHandler;->ۤ:Lcom/amazonaws/services/s3/model/inventory/InventoryS3BucketDestination;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 3507
    :cond_a
    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_e

    .line 3508
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$GetBucketInventoryConfigurationHandler;->ۤ:Lcom/amazonaws/services/s3/model/inventory/InventoryS3BucketDestination;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 3510
    :cond_b
    filled-new-array {v0, v4}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_c

    .line 3511
    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_e

    .line 3512
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$GetBucketInventoryConfigurationHandler;->ۙ:Lcom/amazonaws/services/s3/model/inventory/InventoryFilter;

    new-instance v0, Lcom/amazonaws/services/s3/model/inventory/InventoryPrefixPredicate;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    .line 29
    invoke-direct {v0}, Lcom/amazonaws/services/s3/model/inventory/InventoryFilterPredicate;-><init>()V

    .line 3512
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 3514
    :cond_c
    filled-new-array {v0, v3}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_d

    const-string v0, "Frequency"

    .line 3515
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_e

    .line 3516
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$GetBucketInventoryConfigurationHandler;->۬:Lcom/amazonaws/services/s3/model/inventory/InventorySchedule;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 3518
    :cond_d
    filled-new-array {v0, v2}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_e

    const-string v0, "Field"

    .line 3519
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_e

    .line 3520
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$GetBucketInventoryConfigurationHandler;->۫:Ljava/util/ArrayList;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_e
    return-void
.end method
