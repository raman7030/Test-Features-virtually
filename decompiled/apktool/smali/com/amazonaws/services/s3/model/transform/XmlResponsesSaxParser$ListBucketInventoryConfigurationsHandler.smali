.class public Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketInventoryConfigurationsHandler;
.super Lcom/amazonaws/services/s3/model/transform/AbstractHandler;
.source "XmlResponsesSaxParser.java"


# instance fields
.field public ۗ:Lcom/amazonaws/services/s3/model/inventory/InventoryFilter;

.field public ۙ:Lcom/amazonaws/services/s3/model/inventory/InventoryDestination;

.field public final ۛ:Lcom/amazonaws/services/s3/model/ListBucketInventoryConfigurationsResult;

.field public ۤ:Lcom/amazonaws/services/s3/model/inventory/InventorySchedule;

.field public ۫:Lcom/amazonaws/services/s3/model/inventory/InventoryS3BucketDestination;

.field public ۬:Ljava/util/ArrayList;

.field public ᩶:Lcom/amazonaws/services/s3/model/inventory/InventoryConfiguration;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 3546
    invoke-direct {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;-><init>()V

    .line 3547
    new-instance v0, Lcom/amazonaws/services/s3/model/ListBucketInventoryConfigurationsResult;

    invoke-direct {v0}, Lcom/amazonaws/services/s3/model/ListBucketInventoryConfigurationsResult;-><init>()V

    iput-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketInventoryConfigurationsHandler;->ۛ:Lcom/amazonaws/services/s3/model/ListBucketInventoryConfigurationsResult;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;Lorg/xml/sax/Attributes;)V
    .locals 3

    const-string p2, "ListInventoryConfigurationsResult"

    .line 3565
    filled-new-array {p2}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v0

    const-string v1, "InventoryConfiguration"

    if-eqz v0, :cond_0

    .line 3566
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 3567
    new-instance p1, Lcom/amazonaws/services/s3/model/inventory/InventoryConfiguration;

    invoke-direct {p1}, Lcom/amazonaws/services/s3/model/inventory/InventoryConfiguration;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketInventoryConfigurationsHandler;->᩶:Lcom/amazonaws/services/s3/model/inventory/InventoryConfiguration;

    return-void

    .line 3569
    :cond_0
    filled-new-array {p2, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v0

    const-string v2, "Destination"

    if-eqz v0, :cond_4

    .line 3570
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 3571
    new-instance p1, Lcom/amazonaws/services/s3/model/inventory/InventoryDestination;

    invoke-direct {p1}, Lcom/amazonaws/services/s3/model/inventory/InventoryDestination;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketInventoryConfigurationsHandler;->ۙ:Lcom/amazonaws/services/s3/model/inventory/InventoryDestination;

    return-void

    :cond_1
    const-string p2, "Filter"

    .line 3572
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 3573
    new-instance p1, Lcom/amazonaws/services/s3/model/inventory/InventoryFilter;

    invoke-direct {p1}, Lcom/amazonaws/services/s3/model/inventory/InventoryFilter;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketInventoryConfigurationsHandler;->ۗ:Lcom/amazonaws/services/s3/model/inventory/InventoryFilter;

    return-void

    :cond_2
    const-string p2, "Schedule"

    .line 3574
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    .line 3575
    new-instance p1, Lcom/amazonaws/services/s3/model/inventory/InventorySchedule;

    invoke-direct {p1}, Lcom/amazonaws/services/s3/model/inventory/InventorySchedule;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketInventoryConfigurationsHandler;->ۤ:Lcom/amazonaws/services/s3/model/inventory/InventorySchedule;

    return-void

    :cond_3
    const-string p2, "OptionalFields"

    .line 3576
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 3577
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketInventoryConfigurationsHandler;->۬:Ljava/util/ArrayList;

    return-void

    .line 3579
    :cond_4
    filled-new-array {p2, v1, v2}, [Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_5

    const-string p2, "S3BucketDestination"

    .line 3581
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 3582
    new-instance p1, Lcom/amazonaws/services/s3/model/inventory/InventoryS3BucketDestination;

    invoke-direct {p1}, Lcom/amazonaws/services/s3/model/inventory/InventoryS3BucketDestination;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketInventoryConfigurationsHandler;->۫:Lcom/amazonaws/services/s3/model/inventory/InventoryS3BucketDestination;

    :cond_5
    return-void
.end method

.method public final ܳ(Ljava/lang/String;)V
    .locals 9

    const-string v0, "ListInventoryConfigurationsResult"

    .line 3589
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v1

    const-string v2, "true"

    const/4 v3, 0x0

    const-string v4, "InventoryConfiguration"

    if-eqz v1, :cond_4

    .line 3590
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    iget-object v1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketInventoryConfigurationsHandler;->ۛ:Lcom/amazonaws/services/s3/model/ListBucketInventoryConfigurationsResult;

    if-eqz v0, :cond_1

    .line 3591
    invoke-virtual {v1}, Lcom/amazonaws/services/s3/model/ListBucketInventoryConfigurationsResult;->֫()Ljava/util/List;

    move-result-object p1

    if-nez p1, :cond_0

    .line 3592
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v1, p1}, Lcom/amazonaws/services/s3/model/ListBucketInventoryConfigurationsResult;->֫(Ljava/util/ArrayList;)V

    .line 3595
    :cond_0
    invoke-virtual {v1}, Lcom/amazonaws/services/s3/model/ListBucketInventoryConfigurationsResult;->֫()Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketInventoryConfigurationsHandler;->᩶:Lcom/amazonaws/services/s3/model/inventory/InventoryConfiguration;

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3596
    iput-object v3, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketInventoryConfigurationsHandler;->᩶:Lcom/amazonaws/services/s3/model/inventory/InventoryConfiguration;

    return-void

    :cond_1
    const-string v0, "IsTruncated"

    .line 3597
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 3598
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_2
    const-string v0, "ContinuationToken"

    .line 3599
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 3600
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_3
    const-string v0, "NextContinuationToken"

    .line 3601
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_13

    .line 3602
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 3604
    :cond_4
    filled-new-array {v0, v4}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v1

    const-string v5, "OptionalFields"

    const-string v6, "Schedule"

    const-string v7, "Filter"

    const-string v8, "Destination"

    if-eqz v1, :cond_b

    const-string v0, "Id"

    .line 3605
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 3606
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketInventoryConfigurationsHandler;->᩶:Lcom/amazonaws/services/s3/model/inventory/InventoryConfiguration;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 3607
    :cond_5
    invoke-virtual {p1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 3608
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketInventoryConfigurationsHandler;->᩶:Lcom/amazonaws/services/s3/model/inventory/InventoryConfiguration;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3609
    iput-object v3, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketInventoryConfigurationsHandler;->ۙ:Lcom/amazonaws/services/s3/model/inventory/InventoryDestination;

    return-void

    :cond_6
    const-string v0, "IsEnabled"

    .line 3610
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 3611
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketInventoryConfigurationsHandler;->᩶:Lcom/amazonaws/services/s3/model/inventory/InventoryConfiguration;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 3612
    :cond_7
    invoke-virtual {p1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 3613
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketInventoryConfigurationsHandler;->᩶:Lcom/amazonaws/services/s3/model/inventory/InventoryConfiguration;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3614
    iput-object v3, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketInventoryConfigurationsHandler;->ۗ:Lcom/amazonaws/services/s3/model/inventory/InventoryFilter;

    return-void

    :cond_8
    const-string v0, "IncludedObjectVersions"

    .line 3615
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 3616
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketInventoryConfigurationsHandler;->᩶:Lcom/amazonaws/services/s3/model/inventory/InventoryConfiguration;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 3617
    :cond_9
    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 3618
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketInventoryConfigurationsHandler;->᩶:Lcom/amazonaws/services/s3/model/inventory/InventoryConfiguration;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3619
    iput-object v3, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketInventoryConfigurationsHandler;->ۤ:Lcom/amazonaws/services/s3/model/inventory/InventorySchedule;

    return-void

    .line 3620
    :cond_a
    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_13

    .line 3621
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketInventoryConfigurationsHandler;->᩶:Lcom/amazonaws/services/s3/model/inventory/InventoryConfiguration;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3622
    iput-object v3, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketInventoryConfigurationsHandler;->۬:Ljava/util/ArrayList;

    return-void

    .line 3624
    :cond_b
    filled-new-array {v0, v4, v8}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v1

    const-string v2, "S3BucketDestination"

    if-eqz v1, :cond_c

    .line 3626
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_13

    .line 3627
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketInventoryConfigurationsHandler;->ۙ:Lcom/amazonaws/services/s3/model/inventory/InventoryDestination;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3628
    iput-object v3, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketInventoryConfigurationsHandler;->۫:Lcom/amazonaws/services/s3/model/inventory/InventoryS3BucketDestination;

    return-void

    .line 3630
    :cond_c
    filled-new-array {v0, v4, v8, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v1

    const-string v2, "Prefix"

    if-eqz v1, :cond_10

    const-string v0, "AccountId"

    .line 3632
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 3633
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketInventoryConfigurationsHandler;->۫:Lcom/amazonaws/services/s3/model/inventory/InventoryS3BucketDestination;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_d
    const-string v0, "Bucket"

    .line 3634
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 3635
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketInventoryConfigurationsHandler;->۫:Lcom/amazonaws/services/s3/model/inventory/InventoryS3BucketDestination;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_e
    const-string v0, "Format"

    .line 3636
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 3637
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketInventoryConfigurationsHandler;->۫:Lcom/amazonaws/services/s3/model/inventory/InventoryS3BucketDestination;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 3638
    :cond_f
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_13

    .line 3639
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketInventoryConfigurationsHandler;->۫:Lcom/amazonaws/services/s3/model/inventory/InventoryS3BucketDestination;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 3641
    :cond_10
    filled-new-array {v0, v4, v7}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_11

    .line 3643
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_13

    .line 3644
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketInventoryConfigurationsHandler;->ۗ:Lcom/amazonaws/services/s3/model/inventory/InventoryFilter;

    new-instance v0, Lcom/amazonaws/services/s3/model/inventory/InventoryPrefixPredicate;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    .line 29
    invoke-direct {v0}, Lcom/amazonaws/services/s3/model/inventory/InventoryFilterPredicate;-><init>()V

    .line 3644
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 3646
    :cond_11
    filled-new-array {v0, v4, v6}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_12

    const-string v0, "Frequency"

    .line 3648
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_13

    .line 3649
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketInventoryConfigurationsHandler;->ۤ:Lcom/amazonaws/services/s3/model/inventory/InventorySchedule;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 3651
    :cond_12
    filled-new-array {v0, v4, v5}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_13

    const-string v0, "Field"

    .line 3653
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_13

    .line 3654
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketInventoryConfigurationsHandler;->۬:Ljava/util/ArrayList;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_13
    return-void
.end method
