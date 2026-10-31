.class public Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketLifecycleConfigurationHandler;
.super Lcom/amazonaws/services/s3/model/transform/AbstractHandler;
.source "XmlResponsesSaxParser.java"


# instance fields
.field public final ۗ:Lcom/amazonaws/services/s3/model/BucketLifecycleConfiguration;

.field public ۙ:Ljava/util/ArrayList;

.field public ۛ:Lcom/amazonaws/services/s3/model/BucketLifecycleConfiguration$Transition;

.field public ۤ:Lcom/amazonaws/services/s3/model/BucketLifecycleConfiguration$Rule;

.field public ۫:Lcom/amazonaws/services/s3/model/BucketLifecycleConfiguration$NoncurrentVersionTransition;

.field public ۬:Lcom/amazonaws/services/s3/model/lifecycle/LifecycleFilter;

.field public ᩶:Lcom/amazonaws/services/s3/model/AbortIncompleteMultipartUpload;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 2588
    invoke-direct {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;-><init>()V

    .line 2590
    new-instance v0, Lcom/amazonaws/services/s3/model/BucketLifecycleConfiguration;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {v0, v1}, Lcom/amazonaws/services/s3/model/BucketLifecycleConfiguration;-><init>(Ljava/util/ArrayList;)V

    iput-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketLifecycleConfigurationHandler;->ۗ:Lcom/amazonaws/services/s3/model/BucketLifecycleConfiguration;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;Lorg/xml/sax/Attributes;)V
    .locals 3

    const-string p2, "LifecycleConfiguration"

    .line 2613
    filled-new-array {p2}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v0

    const-string v1, "Rule"

    if-eqz v0, :cond_0

    .line 2614
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 2615
    new-instance p1, Lcom/amazonaws/services/s3/model/BucketLifecycleConfiguration$Rule;

    invoke-direct {p1}, Lcom/amazonaws/services/s3/model/BucketLifecycleConfiguration$Rule;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketLifecycleConfigurationHandler;->ۤ:Lcom/amazonaws/services/s3/model/BucketLifecycleConfiguration$Rule;

    return-void

    .line 2617
    :cond_0
    filled-new-array {p2, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v0

    const-string v2, "Filter"

    if-eqz v0, :cond_4

    const-string p2, "Transition"

    .line 2618
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 2619
    new-instance p1, Lcom/amazonaws/services/s3/model/BucketLifecycleConfiguration$Transition;

    invoke-direct {p1}, Lcom/amazonaws/services/s3/model/BucketLifecycleConfiguration$Transition;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketLifecycleConfigurationHandler;->ۛ:Lcom/amazonaws/services/s3/model/BucketLifecycleConfiguration$Transition;

    return-void

    :cond_1
    const-string p2, "NoncurrentVersionTransition"

    .line 2620
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 2621
    new-instance p1, Lcom/amazonaws/services/s3/model/BucketLifecycleConfiguration$NoncurrentVersionTransition;

    invoke-direct {p1}, Lcom/amazonaws/services/s3/model/BucketLifecycleConfiguration$NoncurrentVersionTransition;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketLifecycleConfigurationHandler;->۫:Lcom/amazonaws/services/s3/model/BucketLifecycleConfiguration$NoncurrentVersionTransition;

    return-void

    :cond_2
    const-string p2, "AbortIncompleteMultipartUpload"

    .line 2622
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    .line 2623
    new-instance p1, Lcom/amazonaws/services/s3/model/AbortIncompleteMultipartUpload;

    invoke-direct {p1}, Lcom/amazonaws/services/s3/model/AbortIncompleteMultipartUpload;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketLifecycleConfigurationHandler;->᩶:Lcom/amazonaws/services/s3/model/AbortIncompleteMultipartUpload;

    return-void

    .line 2624
    :cond_3
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 2625
    new-instance p1, Lcom/amazonaws/services/s3/model/lifecycle/LifecycleFilter;

    invoke-direct {p1}, Lcom/amazonaws/services/s3/model/lifecycle/LifecycleFilter;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketLifecycleConfigurationHandler;->۬:Lcom/amazonaws/services/s3/model/lifecycle/LifecycleFilter;

    return-void

    .line 2627
    :cond_4
    filled-new-array {p2, v1, v2}, [Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_5

    const-string p2, "And"

    .line 2628
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 2629
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketLifecycleConfigurationHandler;->ۙ:Ljava/util/ArrayList;

    :cond_5
    return-void
.end method

.method public final ܳ(Ljava/lang/String;)V
    .locals 11

    const-string v0, "LifecycleConfiguration"

    .line 2636
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x0

    const-string v3, "Rule"

    if-eqz v1, :cond_0

    .line 2637
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1a

    .line 2638
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketLifecycleConfigurationHandler;->ۗ:Lcom/amazonaws/services/s3/model/BucketLifecycleConfiguration;

    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/BucketLifecycleConfiguration;->֫()Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketLifecycleConfigurationHandler;->ۤ:Lcom/amazonaws/services/s3/model/BucketLifecycleConfiguration$Rule;

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2639
    iput-object v2, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketLifecycleConfigurationHandler;->ۤ:Lcom/amazonaws/services/s3/model/BucketLifecycleConfiguration$Rule;

    return-void

    .line 2643
    :cond_0
    filled-new-array {v0, v3}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v1

    const-string v4, "AbortIncompleteMultipartUpload"

    const-string v5, "NoncurrentVersionTransition"

    const-string v6, "Transition"

    const-string v7, "Prefix"

    const-string v8, "Filter"

    if-eqz v1, :cond_7

    const-string v0, "ID"

    .line 2644
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2645
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketLifecycleConfigurationHandler;->ۤ:Lcom/amazonaws/services/s3/model/BucketLifecycleConfiguration$Rule;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 2647
    :cond_1
    invoke-virtual {p1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2648
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketLifecycleConfigurationHandler;->ۤ:Lcom/amazonaws/services/s3/model/BucketLifecycleConfiguration$Rule;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_2
    const-string v0, "Status"

    .line 2650
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 2651
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketLifecycleConfigurationHandler;->ۤ:Lcom/amazonaws/services/s3/model/BucketLifecycleConfiguration$Rule;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 2653
    :cond_3
    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 2654
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketLifecycleConfigurationHandler;->ۤ:Lcom/amazonaws/services/s3/model/BucketLifecycleConfiguration$Rule;

    iget-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketLifecycleConfigurationHandler;->ۛ:Lcom/amazonaws/services/s3/model/BucketLifecycleConfiguration$Transition;

    invoke-virtual {p1, v0}, Lcom/amazonaws/services/s3/model/BucketLifecycleConfiguration$Rule;->֫(Lcom/amazonaws/services/s3/model/BucketLifecycleConfiguration$Transition;)V

    .line 2655
    iput-object v2, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketLifecycleConfigurationHandler;->ۛ:Lcom/amazonaws/services/s3/model/BucketLifecycleConfiguration$Transition;

    return-void

    .line 2657
    :cond_4
    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 2658
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketLifecycleConfigurationHandler;->ۤ:Lcom/amazonaws/services/s3/model/BucketLifecycleConfiguration$Rule;

    iget-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketLifecycleConfigurationHandler;->۫:Lcom/amazonaws/services/s3/model/BucketLifecycleConfiguration$NoncurrentVersionTransition;

    invoke-virtual {p1, v0}, Lcom/amazonaws/services/s3/model/BucketLifecycleConfiguration$Rule;->֫(Lcom/amazonaws/services/s3/model/BucketLifecycleConfiguration$NoncurrentVersionTransition;)V

    .line 2660
    iput-object v2, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketLifecycleConfigurationHandler;->۫:Lcom/amazonaws/services/s3/model/BucketLifecycleConfiguration$NoncurrentVersionTransition;

    return-void

    .line 2661
    :cond_5
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 2662
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketLifecycleConfigurationHandler;->ۤ:Lcom/amazonaws/services/s3/model/BucketLifecycleConfiguration$Rule;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2663
    iput-object v2, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketLifecycleConfigurationHandler;->᩶:Lcom/amazonaws/services/s3/model/AbortIncompleteMultipartUpload;

    return-void

    .line 2664
    :cond_6
    invoke-virtual {p1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1a

    .line 2665
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketLifecycleConfigurationHandler;->ۤ:Lcom/amazonaws/services/s3/model/BucketLifecycleConfiguration$Rule;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2666
    iput-object v2, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketLifecycleConfigurationHandler;->۬:Lcom/amazonaws/services/s3/model/lifecycle/LifecycleFilter;

    return-void

    :cond_7
    const-string v1, "Expiration"

    .line 2670
    filled-new-array {v0, v3, v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v1

    const-string v9, "Days"

    const-string v10, "Date"

    if-eqz v1, :cond_a

    .line 2671
    invoke-virtual {p1, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 2672
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketLifecycleConfigurationHandler;->ۤ:Lcom/amazonaws/services/s3/model/BucketLifecycleConfiguration$Rule;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object v0

    sget v1, Lcom/amazonaws/services/s3/internal/ServiceUtils;->֫:I

    .line 79
    invoke-static {v0}, Lcom/amazonaws/util/DateUtils;->ۧ(Ljava/lang/String;)Ljava/util/Date;

    .line 2672
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 2673
    :cond_8
    invoke-virtual {p1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 2674
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketLifecycleConfigurationHandler;->ۤ:Lcom/amazonaws/services/s3/model/BucketLifecycleConfiguration$Rule;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_9
    const-string v0, "ExpiredObjectDeleteMarker"

    .line 2675
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1a

    const-string p1, "true"

    .line 2676
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1a

    .line 2677
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketLifecycleConfigurationHandler;->ۤ:Lcom/amazonaws/services/s3/model/BucketLifecycleConfiguration$Rule;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 2682
    :cond_a
    filled-new-array {v0, v3, v6}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v1

    const-string v6, "StorageClass"

    if-eqz v1, :cond_d

    .line 2683
    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 2684
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketLifecycleConfigurationHandler;->ۛ:Lcom/amazonaws/services/s3/model/BucketLifecycleConfiguration$Transition;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 2685
    :cond_b
    invoke-virtual {p1, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 2686
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketLifecycleConfigurationHandler;->ۛ:Lcom/amazonaws/services/s3/model/BucketLifecycleConfiguration$Transition;

    .line 2687
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object v0

    sget v1, Lcom/amazonaws/services/s3/internal/ServiceUtils;->֫:I

    .line 79
    invoke-static {v0}, Lcom/amazonaws/util/DateUtils;->ۧ(Ljava/lang/String;)Ljava/util/Date;

    .line 2686
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 2689
    :cond_c
    invoke-virtual {p1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1a

    .line 2690
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketLifecycleConfigurationHandler;->ۛ:Lcom/amazonaws/services/s3/model/BucketLifecycleConfiguration$Transition;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_d
    const-string v1, "NoncurrentVersionExpiration"

    .line 2694
    filled-new-array {v0, v3, v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v1

    const-string v9, "NoncurrentDays"

    if-eqz v1, :cond_e

    .line 2695
    invoke-virtual {p1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1a

    .line 2696
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketLifecycleConfigurationHandler;->ۤ:Lcom/amazonaws/services/s3/model/BucketLifecycleConfiguration$Rule;

    .line 2697
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 2696
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 2701
    :cond_e
    filled-new-array {v0, v3, v5}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_10

    .line 2702
    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 2703
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketLifecycleConfigurationHandler;->۫:Lcom/amazonaws/services/s3/model/BucketLifecycleConfiguration$NoncurrentVersionTransition;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 2704
    :cond_f
    invoke-virtual {p1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1a

    .line 2705
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketLifecycleConfigurationHandler;->۫:Lcom/amazonaws/services/s3/model/BucketLifecycleConfiguration$NoncurrentVersionTransition;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 2709
    :cond_10
    filled-new-array {v0, v3, v4}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_11

    const-string v0, "DaysAfterInitiation"

    .line 2710
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1a

    .line 2711
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketLifecycleConfigurationHandler;->᩶:Lcom/amazonaws/services/s3/model/AbortIncompleteMultipartUpload;

    .line 2712
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/amazonaws/services/s3/model/AbortIncompleteMultipartUpload;->֫(I)V

    return-void

    .line 2716
    :cond_11
    filled-new-array {v0, v3, v8}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v1

    const-string v4, "And"

    const-string v5, "Tag"

    if-eqz v1, :cond_14

    .line 2717
    invoke-virtual {p1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_12

    .line 2718
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketLifecycleConfigurationHandler;->۬:Lcom/amazonaws/services/s3/model/lifecycle/LifecycleFilter;

    new-instance v0, Lcom/amazonaws/services/s3/model/lifecycle/LifecyclePrefixPredicate;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    .line 30
    invoke-direct {v0}, Lcom/amazonaws/services/s3/model/lifecycle/LifecycleFilterPredicate;-><init>()V

    .line 2718
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 2719
    :cond_12
    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_13

    .line 2720
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketLifecycleConfigurationHandler;->۬:Lcom/amazonaws/services/s3/model/lifecycle/LifecycleFilter;

    new-instance v0, Lcom/amazonaws/services/s3/model/lifecycle/LifecycleTagPredicate;

    .line 32
    invoke-direct {v0}, Lcom/amazonaws/services/s3/model/lifecycle/LifecycleFilterPredicate;-><init>()V

    .line 2720
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 2724
    :cond_13
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1a

    .line 2725
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketLifecycleConfigurationHandler;->۬:Lcom/amazonaws/services/s3/model/lifecycle/LifecycleFilter;

    new-instance v0, Lcom/amazonaws/services/s3/model/lifecycle/LifecycleAndOperator;

    iget-object v1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketLifecycleConfigurationHandler;->ۙ:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Lcom/amazonaws/services/s3/model/lifecycle/LifecycleAndOperator;-><init>(Ljava/util/ArrayList;)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2726
    iput-object v2, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketLifecycleConfigurationHandler;->ۙ:Ljava/util/ArrayList;

    return-void

    .line 2730
    :cond_14
    filled-new-array {v0, v3, v8, v5}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v1

    const-string v2, "Value"

    const-string v6, "Key"

    if-eqz v1, :cond_16

    .line 2731
    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_15

    .line 2732
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    return-void

    .line 2733
    :cond_15
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1a

    .line 2734
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    return-void

    .line 2738
    :cond_16
    filled-new-array {v0, v3, v8, v4}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_18

    .line 2739
    invoke-virtual {p1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_17

    .line 2740
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketLifecycleConfigurationHandler;->ۙ:Ljava/util/ArrayList;

    new-instance v0, Lcom/amazonaws/services/s3/model/lifecycle/LifecyclePrefixPredicate;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    .line 30
    invoke-direct {v0}, Lcom/amazonaws/services/s3/model/lifecycle/LifecycleFilterPredicate;-><init>()V

    .line 2740
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 2741
    :cond_17
    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1a

    .line 2742
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketLifecycleConfigurationHandler;->ۙ:Ljava/util/ArrayList;

    new-instance v0, Lcom/amazonaws/services/s3/model/lifecycle/LifecycleTagPredicate;

    .line 32
    invoke-direct {v0}, Lcom/amazonaws/services/s3/model/lifecycle/LifecycleFilterPredicate;-><init>()V

    .line 2742
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 2749
    :cond_18
    filled-new-array {v0, v3, v8, v4, v5}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1a

    .line 2750
    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_19

    .line 2751
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    return-void

    .line 2752
    :cond_19
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1a

    .line 2753
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    :cond_1a
    return-void
.end method
