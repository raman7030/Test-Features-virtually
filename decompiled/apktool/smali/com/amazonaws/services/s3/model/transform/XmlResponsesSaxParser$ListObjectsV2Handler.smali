.class public Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListObjectsV2Handler;
.super Lcom/amazonaws/services/s3/model/transform/AbstractHandler;
.source "XmlResponsesSaxParser.java"


# instance fields
.field public ۙ:Lcom/amazonaws/services/s3/model/Owner;

.field public ᩶:Lcom/amazonaws/services/s3/model/S3ObjectSummary;


# virtual methods
.method public final ֫(Ljava/lang/String;Lorg/xml/sax/Attributes;)V
    .locals 2

    const-string p2, "ListBucketResult"

    .line 824
    filled-new-array {p2}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v0

    const-string v1, "Contents"

    if-eqz v0, :cond_1

    .line 825
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 826
    :cond_0
    new-instance p1, Lcom/amazonaws/services/s3/model/S3ObjectSummary;

    invoke-direct {p1}, Lcom/amazonaws/services/s3/model/S3ObjectSummary;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListObjectsV2Handler;->᩶:Lcom/amazonaws/services/s3/model/S3ObjectSummary;

    const/4 p1, 0x0

    .line 827
    throw p1

    .line 831
    :cond_1
    filled-new-array {p2, v1}, [Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_2

    const-string p2, "Owner"

    .line 832
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 833
    new-instance p1, Lcom/amazonaws/services/s3/model/Owner;

    invoke-direct {p1}, Lcom/amazonaws/services/s3/model/Owner;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListObjectsV2Handler;->ۙ:Lcom/amazonaws/services/s3/model/Owner;

    :cond_2
    :goto_0
    return-void
.end method

.method public final ܳ(Ljava/lang/String;)V
    .locals 6

    .line 840
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫()Z

    move-result v0

    const-string v1, "ListBucketResult"

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    .line 841
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto/16 :goto_0

    .line 848
    :cond_0
    throw v2

    .line 867
    :cond_1
    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v0

    const-string v3, "Prefix"

    const-string v4, "Contents"

    if-eqz v0, :cond_f

    const-string v0, "Name"

    .line 868
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    .line 875
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    const-string v0, "MaxKeys"

    .line 879
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    const-string v0, "NextContinuationToken"

    .line 882
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    const-string v0, "ContinuationToken"

    .line 885
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    const-string v0, "StartAfter"

    .line 888
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    const-string v0, "KeyCount"

    .line 891
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    const-string v0, "Delimiter"

    .line 894
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    const-string v0, "EncodingType"

    .line 898
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    const-string v0, "IsTruncated"

    .line 900
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 901
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/amazonaws/util/StringUtils;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "false"

    .line 903
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "true"

    .line 905
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 906
    throw v2

    .line 908
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Invalid value for IsTruncated field: "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 904
    :cond_3
    throw v2

    .line 913
    :cond_4
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto/16 :goto_0

    .line 914
    :cond_5
    throw v2

    .line 899
    :cond_6
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    sget p1, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser;->ۧ:I

    throw v2

    .line 895
    :cond_7
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    sget p1, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser;->ۧ:I

    throw v2

    .line 892
    :cond_8
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser;->ۧ(Ljava/lang/String;)V

    throw v2

    .line 889
    :cond_9
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    sget p1, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser;->ۧ:I

    throw v2

    .line 886
    :cond_a
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    throw v2

    .line 883
    :cond_b
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    throw v2

    .line 880
    :cond_c
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser;->ۧ(Ljava/lang/String;)V

    throw v2

    .line 876
    :cond_d
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    sget p1, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser;->ۧ:I

    throw v2

    .line 869
    :cond_e
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    throw v2

    .line 919
    :cond_f
    filled-new-array {v1, v4}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v0

    const-string v5, "Owner"

    if-eqz v0, :cond_15

    const-string v0, "Key"

    .line 920
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 921
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object p1

    .line 922
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListObjectsV2Handler;->᩶:Lcom/amazonaws/services/s3/model/S3ObjectSummary;

    sget v1, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser;->ۧ:I

    invoke-virtual {v0, p1}, Lcom/amazonaws/services/s3/model/S3ObjectSummary;->ܽ(Ljava/lang/String;)V

    return-void

    :cond_10
    const-string v0, "LastModified"

    .line 923
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_11

    .line 924
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListObjectsV2Handler;->᩶:Lcom/amazonaws/services/s3/model/S3ObjectSummary;

    .line 925
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object v0

    sget v1, Lcom/amazonaws/services/s3/internal/ServiceUtils;->֫:I

    .line 79
    invoke-static {v0}, Lcom/amazonaws/util/DateUtils;->ۧ(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    .line 924
    invoke-virtual {p1, v0}, Lcom/amazonaws/services/s3/model/S3ObjectSummary;->֫(Ljava/util/Date;)V

    return-void

    :cond_11
    const-string v0, "ETag"

    .line 927
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_12

    .line 928
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListObjectsV2Handler;->᩶:Lcom/amazonaws/services/s3/model/S3ObjectSummary;

    .line 929
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/amazonaws/services/s3/internal/ServiceUtils;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 928
    invoke-virtual {p1, v0}, Lcom/amazonaws/services/s3/model/S3ObjectSummary;->ۧ(Ljava/lang/String;)V

    return-void

    :cond_12
    const-string v0, "Size"

    .line 931
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_13

    .line 932
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListObjectsV2Handler;->᩶:Lcom/amazonaws/services/s3/model/S3ObjectSummary;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser;->ܽ(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/amazonaws/services/s3/model/S3ObjectSummary;->֫(J)V

    return-void

    :cond_13
    const-string v0, "StorageClass"

    .line 934
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_14

    .line 935
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListObjectsV2Handler;->᩶:Lcom/amazonaws/services/s3/model/S3ObjectSummary;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/amazonaws/services/s3/model/S3ObjectSummary;->ᩳ(Ljava/lang/String;)V

    return-void

    .line 937
    :cond_14
    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_19

    .line 938
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListObjectsV2Handler;->᩶:Lcom/amazonaws/services/s3/model/S3ObjectSummary;

    iget-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListObjectsV2Handler;->ۙ:Lcom/amazonaws/services/s3/model/Owner;

    invoke-virtual {p1, v0}, Lcom/amazonaws/services/s3/model/S3ObjectSummary;->֫(Lcom/amazonaws/services/s3/model/Owner;)V

    .line 939
    iput-object v2, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListObjectsV2Handler;->ۙ:Lcom/amazonaws/services/s3/model/Owner;

    return-void

    .line 943
    :cond_15
    filled-new-array {v1, v4, v5}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_17

    const-string v0, "ID"

    .line 944
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_16

    .line 945
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListObjectsV2Handler;->ۙ:Lcom/amazonaws/services/s3/model/Owner;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/amazonaws/services/s3/model/Owner;->ۧ(Ljava/lang/String;)V

    return-void

    :cond_16
    const-string v0, "DisplayName"

    .line 947
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_19

    .line 948
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListObjectsV2Handler;->ۙ:Lcom/amazonaws/services/s3/model/Owner;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/amazonaws/services/s3/model/Owner;->֫(Ljava/lang/String;)V

    return-void

    :cond_17
    const-string v0, "CommonPrefixes"

    .line 952
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_19

    .line 953
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_18

    goto :goto_0

    .line 954
    :cond_18
    throw v2

    :cond_19
    :goto_0
    return-void
.end method
