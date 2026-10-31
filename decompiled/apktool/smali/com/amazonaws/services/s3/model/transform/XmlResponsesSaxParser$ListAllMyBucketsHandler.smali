.class public Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListAllMyBucketsHandler;
.super Lcom/amazonaws/services/s3/model/transform/AbstractHandler;
.source "XmlResponsesSaxParser.java"


# instance fields
.field public ۗ:Lcom/amazonaws/services/s3/model/Bucket;

.field public ۙ:Lcom/amazonaws/services/s3/model/Owner;

.field public final ᩶:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 966
    invoke-direct {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;-><init>()V

    .line 968
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListAllMyBucketsHandler;->᩶:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 969
    iput-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListAllMyBucketsHandler;->ۙ:Lcom/amazonaws/services/s3/model/Owner;

    .line 971
    iput-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListAllMyBucketsHandler;->ۗ:Lcom/amazonaws/services/s3/model/Bucket;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;Lorg/xml/sax/Attributes;)V
    .locals 1

    const-string p2, "ListAllMyBucketsResult"

    .line 994
    filled-new-array {p2}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p2, "Owner"

    .line 995
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 996
    new-instance p1, Lcom/amazonaws/services/s3/model/Owner;

    invoke-direct {p1}, Lcom/amazonaws/services/s3/model/Owner;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListAllMyBucketsHandler;->ۙ:Lcom/amazonaws/services/s3/model/Owner;

    return-void

    :cond_0
    const-string v0, "Buckets"

    .line 998
    filled-new-array {p2, v0}, [Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_1

    const-string p2, "Bucket"

    .line 999
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 1000
    new-instance p1, Lcom/amazonaws/services/s3/model/Bucket;

    invoke-direct {p1}, Lcom/amazonaws/services/s3/model/Bucket;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListAllMyBucketsHandler;->ۗ:Lcom/amazonaws/services/s3/model/Bucket;

    .line 1001
    iget-object p2, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListAllMyBucketsHandler;->ۙ:Lcom/amazonaws/services/s3/model/Owner;

    invoke-virtual {p1, p2}, Lcom/amazonaws/services/s3/model/Bucket;->֫(Lcom/amazonaws/services/s3/model/Owner;)V

    :cond_1
    return-void
.end method

.method public final ܳ(Ljava/lang/String;)V
    .locals 4

    const-string v0, "Owner"

    const-string v1, "ListAllMyBucketsResult"

    .line 1008
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "ID"

    .line 1009
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1010
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListAllMyBucketsHandler;->ۙ:Lcom/amazonaws/services/s3/model/Owner;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/amazonaws/services/s3/model/Owner;->ۧ(Ljava/lang/String;)V

    return-void

    :cond_0
    const-string v0, "DisplayName"

    .line 1012
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 1013
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListAllMyBucketsHandler;->ۙ:Lcom/amazonaws/services/s3/model/Owner;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/amazonaws/services/s3/model/Owner;->֫(Ljava/lang/String;)V

    return-void

    :cond_1
    const-string v0, "Buckets"

    .line 1017
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v2

    const-string v3, "Bucket"

    if-eqz v2, :cond_2

    .line 1018
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 1019
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListAllMyBucketsHandler;->᩶:Ljava/util/ArrayList;

    iget-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListAllMyBucketsHandler;->ۗ:Lcom/amazonaws/services/s3/model/Bucket;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x0

    .line 1020
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListAllMyBucketsHandler;->ۗ:Lcom/amazonaws/services/s3/model/Bucket;

    return-void

    .line 1024
    :cond_2
    filled-new-array {v1, v0, v3}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "Name"

    .line 1025
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1026
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListAllMyBucketsHandler;->ۗ:Lcom/amazonaws/services/s3/model/Bucket;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/amazonaws/services/s3/model/Bucket;->֫(Ljava/lang/String;)V

    return-void

    :cond_3
    const-string v0, "CreationDate"

    .line 1028
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 1029
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/amazonaws/util/DateUtils;->ۧ(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p1

    .line 1030
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListAllMyBucketsHandler;->ۗ:Lcom/amazonaws/services/s3/model/Bucket;

    invoke-virtual {v0, p1}, Lcom/amazonaws/services/s3/model/Bucket;->֫(Ljava/util/Date;)V

    :cond_4
    return-void
.end method
