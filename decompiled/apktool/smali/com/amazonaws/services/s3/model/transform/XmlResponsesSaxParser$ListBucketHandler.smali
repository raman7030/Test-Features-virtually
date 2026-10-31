.class public Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketHandler;
.super Lcom/amazonaws/services/s3/model/transform/AbstractHandler;
.source "XmlResponsesSaxParser.java"


# instance fields
.field public final ۗ:Lcom/amazonaws/services/s3/model/ObjectListing;

.field public ۙ:Lcom/amazonaws/services/s3/model/Owner;

.field public final ۬:Z

.field public ᩶:Lcom/amazonaws/services/s3/model/S3ObjectSummary;


# direct methods
.method public constructor <init>(Z)V
    .locals 1

    .line 642
    invoke-direct {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;-><init>()V

    .line 635
    new-instance v0, Lcom/amazonaws/services/s3/model/ObjectListing;

    invoke-direct {v0}, Lcom/amazonaws/services/s3/model/ObjectListing;-><init>()V

    iput-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketHandler;->ۗ:Lcom/amazonaws/services/s3/model/ObjectListing;

    const/4 v0, 0x0

    .line 638
    iput-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketHandler;->᩶:Lcom/amazonaws/services/s3/model/S3ObjectSummary;

    .line 639
    iput-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketHandler;->ۙ:Lcom/amazonaws/services/s3/model/Owner;

    .line 643
    iput-boolean p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketHandler;->۬:Z

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;Lorg/xml/sax/Attributes;)V
    .locals 2

    const-string p2, "ListBucketResult"

    .line 657
    filled-new-array {p2}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v0

    const-string v1, "Contents"

    if-eqz v0, :cond_0

    .line 658
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 659
    new-instance p1, Lcom/amazonaws/services/s3/model/S3ObjectSummary;

    invoke-direct {p1}, Lcom/amazonaws/services/s3/model/S3ObjectSummary;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketHandler;->᩶:Lcom/amazonaws/services/s3/model/S3ObjectSummary;

    .line 660
    iget-object p2, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketHandler;->ۗ:Lcom/amazonaws/services/s3/model/ObjectListing;

    invoke-virtual {p2}, Lcom/amazonaws/services/s3/model/ObjectListing;->֫()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/amazonaws/services/s3/model/S3ObjectSummary;->֫(Ljava/lang/String;)V

    return-void

    .line 664
    :cond_0
    filled-new-array {p2, v1}, [Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_1

    const-string p2, "Owner"

    .line 665
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 666
    new-instance p1, Lcom/amazonaws/services/s3/model/Owner;

    invoke-direct {p1}, Lcom/amazonaws/services/s3/model/Owner;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketHandler;->ۙ:Lcom/amazonaws/services/s3/model/Owner;

    :cond_1
    return-void
.end method

.method public final ܳ(Ljava/lang/String;)V
    .locals 8

    .line 673
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫()Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-string v3, "ListBucketResult"

    iget-object v4, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketHandler;->ۗ:Lcom/amazonaws/services/s3/model/ObjectListing;

    if-eqz v0, :cond_2

    .line 674
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_16

    .line 681
    invoke-virtual {v4}, Lcom/amazonaws/services/s3/model/ObjectListing;->ܿ()Z

    move-result p1

    if-eqz p1, :cond_16

    .line 682
    invoke-virtual {v4}, Lcom/amazonaws/services/s3/model/ObjectListing;->ܽ()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_16

    .line 685
    invoke-virtual {v4}, Lcom/amazonaws/services/s3/model/ObjectListing;->ᩳ()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    .line 686
    invoke-virtual {v4}, Lcom/amazonaws/services/s3/model/ObjectListing;->ᩳ()Ljava/util/ArrayList;

    move-result-object p1

    .line 687
    invoke-virtual {v4}, Lcom/amazonaws/services/s3/model/ObjectListing;->ᩳ()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    sub-int/2addr v0, v1

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/amazonaws/services/s3/model/S3ObjectSummary;

    .line 688
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/S3ObjectSummary;->֫()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 690
    :cond_0
    invoke-virtual {v4}, Lcom/amazonaws/services/s3/model/ObjectListing;->ۧ()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1

    .line 691
    invoke-virtual {v4}, Lcom/amazonaws/services/s3/model/ObjectListing;->ۧ()Ljava/util/ArrayList;

    move-result-object p1

    .line 692
    invoke-virtual {v4}, Lcom/amazonaws/services/s3/model/ObjectListing;->ۧ()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    sub-int/2addr v0, v1

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Ljava/lang/String;

    goto :goto_0

    .line 694
    :cond_1
    invoke-static {}, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser;->֫()Lcom/amazonaws/logging/Log;

    move-result-object p1

    const-string v0, "S3 response indicates truncated results, but contains no object summaries or common prefixes."

    invoke-interface {p1, v0}, Lcom/amazonaws/logging/Log;->֫(Ljava/lang/String;)V

    .line 699
    :goto_0
    invoke-virtual {v4, v2}, Lcom/amazonaws/services/s3/model/ObjectListing;->ۧ(Ljava/lang/String;)V

    return-void

    .line 704
    :cond_2
    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v0

    const-string v5, "Prefix"

    const-string v6, "Contents"

    iget-boolean v7, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketHandler;->۬:Z

    if-eqz v0, :cond_d

    const-string v0, "Name"

    .line 705
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 706
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v4, p1}, Lcom/amazonaws/services/s3/model/ObjectListing;->֫(Ljava/lang/String;)V

    .line 707
    invoke-static {}, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser;->֫()Lcom/amazonaws/logging/Log;

    move-result-object p1

    invoke-interface {p1}, Lcom/amazonaws/logging/Log;->֫()Z

    move-result p1

    if-eqz p1, :cond_16

    .line 708
    invoke-static {}, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser;->֫()Lcom/amazonaws/logging/Log;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Examining listing for bucket: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 709
    invoke-virtual {v4}, Lcom/amazonaws/services/s3/model/ObjectListing;->֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 708
    invoke-interface {p1, v0}, Lcom/amazonaws/logging/Log;->ۧ(Ljava/lang/String;)V

    return-void

    .line 712
    :cond_3
    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 713
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v7}, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser;->֫(Ljava/lang/String;Z)Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_4
    const-string v0, "Marker"

    .line 716
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 717
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v7}, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser;->֫(Ljava/lang/String;Z)Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_5
    const-string v0, "NextMarker"

    .line 720
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 722
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v7}, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser;->֫(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v4, p1}, Lcom/amazonaws/services/s3/model/ObjectListing;->ۧ(Ljava/lang/String;)V

    return-void

    :cond_6
    const-string v0, "MaxKeys"

    .line 724
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 725
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser;->ۧ(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_7
    const-string v0, "Delimiter"

    .line 727
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 728
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v7}, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser;->֫(Ljava/lang/String;Z)Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_8
    const-string v0, "EncodingType"

    .line 731
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 733
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    sget p1, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser;->ۧ:I

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_9
    const-string v0, "IsTruncated"

    .line 735
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 737
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/amazonaws/util/StringUtils;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "false"

    .line 739
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a

    const/4 p1, 0x0

    .line 740
    invoke-virtual {v4, p1}, Lcom/amazonaws/services/s3/model/ObjectListing;->֫(Z)V

    return-void

    :cond_a
    const-string v0, "true"

    .line 741
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 742
    invoke-virtual {v4, v1}, Lcom/amazonaws/services/s3/model/ObjectListing;->֫(Z)V

    return-void

    .line 744
    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Invalid value for IsTruncated field: "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 749
    :cond_c
    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_16

    .line 750
    invoke-virtual {v4}, Lcom/amazonaws/services/s3/model/ObjectListing;->ᩳ()Ljava/util/ArrayList;

    move-result-object p1

    iget-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketHandler;->᩶:Lcom/amazonaws/services/s3/model/S3ObjectSummary;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 751
    iput-object v2, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketHandler;->᩶:Lcom/amazonaws/services/s3/model/S3ObjectSummary;

    return-void

    .line 755
    :cond_d
    filled-new-array {v3, v6}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v0

    const-string v1, "Owner"

    if-eqz v0, :cond_13

    const-string v0, "Key"

    .line 756
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 757
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object p1

    .line 758
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketHandler;->᩶:Lcom/amazonaws/services/s3/model/S3ObjectSummary;

    invoke-static {p1, v7}, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser;->֫(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/amazonaws/services/s3/model/S3ObjectSummary;->ܽ(Ljava/lang/String;)V

    return-void

    :cond_e
    const-string v0, "LastModified"

    .line 760
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 761
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketHandler;->᩶:Lcom/amazonaws/services/s3/model/S3ObjectSummary;

    .line 762
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object v0

    sget v1, Lcom/amazonaws/services/s3/internal/ServiceUtils;->֫:I

    .line 79
    invoke-static {v0}, Lcom/amazonaws/util/DateUtils;->ۧ(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    .line 761
    invoke-virtual {p1, v0}, Lcom/amazonaws/services/s3/model/S3ObjectSummary;->֫(Ljava/util/Date;)V

    return-void

    :cond_f
    const-string v0, "ETag"

    .line 764
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 765
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketHandler;->᩶:Lcom/amazonaws/services/s3/model/S3ObjectSummary;

    .line 766
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/amazonaws/services/s3/internal/ServiceUtils;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 765
    invoke-virtual {p1, v0}, Lcom/amazonaws/services/s3/model/S3ObjectSummary;->ۧ(Ljava/lang/String;)V

    return-void

    :cond_10
    const-string v0, "Size"

    .line 768
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_11

    .line 769
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketHandler;->᩶:Lcom/amazonaws/services/s3/model/S3ObjectSummary;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser;->ܽ(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/amazonaws/services/s3/model/S3ObjectSummary;->֫(J)V

    return-void

    :cond_11
    const-string v0, "StorageClass"

    .line 771
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_12

    .line 772
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketHandler;->᩶:Lcom/amazonaws/services/s3/model/S3ObjectSummary;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/amazonaws/services/s3/model/S3ObjectSummary;->ᩳ(Ljava/lang/String;)V

    return-void

    .line 774
    :cond_12
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_16

    .line 775
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketHandler;->᩶:Lcom/amazonaws/services/s3/model/S3ObjectSummary;

    iget-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketHandler;->ۙ:Lcom/amazonaws/services/s3/model/Owner;

    invoke-virtual {p1, v0}, Lcom/amazonaws/services/s3/model/S3ObjectSummary;->֫(Lcom/amazonaws/services/s3/model/Owner;)V

    .line 776
    iput-object v2, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketHandler;->ۙ:Lcom/amazonaws/services/s3/model/Owner;

    return-void

    .line 780
    :cond_13
    filled-new-array {v3, v6, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_15

    const-string v0, "ID"

    .line 781
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_14

    .line 782
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketHandler;->ۙ:Lcom/amazonaws/services/s3/model/Owner;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/amazonaws/services/s3/model/Owner;->ۧ(Ljava/lang/String;)V

    return-void

    :cond_14
    const-string v0, "DisplayName"

    .line 784
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_16

    .line 785
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketHandler;->ۙ:Lcom/amazonaws/services/s3/model/Owner;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/amazonaws/services/s3/model/Owner;->֫(Ljava/lang/String;)V

    return-void

    :cond_15
    const-string v0, "CommonPrefixes"

    .line 789
    filled-new-array {v3, v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_16

    .line 790
    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_16

    .line 791
    invoke-virtual {v4}, Lcom/amazonaws/services/s3/model/ObjectListing;->ۧ()Ljava/util/ArrayList;

    move-result-object p1

    .line 792
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v7}, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser;->֫(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_16
    return-void
.end method

.method public final ܽ()Lcom/amazonaws/services/s3/model/ObjectListing;
    .locals 1

    .line 647
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListBucketHandler;->ۗ:Lcom/amazonaws/services/s3/model/ObjectListing;

    return-object v0
.end method
