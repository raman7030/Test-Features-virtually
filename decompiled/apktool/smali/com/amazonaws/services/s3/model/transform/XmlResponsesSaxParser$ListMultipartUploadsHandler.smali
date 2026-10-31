.class public Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListMultipartUploadsHandler;
.super Lcom/amazonaws/services/s3/model/transform/AbstractHandler;
.source "XmlResponsesSaxParser.java"


# instance fields
.field public final ۗ:Lcom/amazonaws/services/s3/model/MultipartUploadListing;

.field public ۙ:Lcom/amazonaws/services/s3/model/Owner;

.field public ᩶:Lcom/amazonaws/services/s3/model/MultipartUpload;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1968
    invoke-direct {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;-><init>()V

    .line 1970
    new-instance v0, Lcom/amazonaws/services/s3/model/MultipartUploadListing;

    invoke-direct {v0}, Lcom/amazonaws/services/s3/model/MultipartUploadListing;-><init>()V

    iput-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListMultipartUploadsHandler;->ۗ:Lcom/amazonaws/services/s3/model/MultipartUploadListing;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;Lorg/xml/sax/Attributes;)V
    .locals 2

    const-string p2, "ListMultipartUploadsResult"

    .line 1987
    filled-new-array {p2}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v0

    const-string v1, "Upload"

    if-eqz v0, :cond_0

    .line 1988
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 1989
    new-instance p1, Lcom/amazonaws/services/s3/model/MultipartUpload;

    invoke-direct {p1}, Lcom/amazonaws/services/s3/model/MultipartUpload;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListMultipartUploadsHandler;->᩶:Lcom/amazonaws/services/s3/model/MultipartUpload;

    return-void

    .line 1991
    :cond_0
    filled-new-array {p2, v1}, [Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_2

    const-string p2, "Owner"

    .line 1992
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    const-string p2, "Initiator"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 1993
    :cond_1
    new-instance p1, Lcom/amazonaws/services/s3/model/Owner;

    invoke-direct {p1}, Lcom/amazonaws/services/s3/model/Owner;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListMultipartUploadsHandler;->ۙ:Lcom/amazonaws/services/s3/model/Owner;

    :cond_2
    return-void
.end method

.method public final ܳ(Ljava/lang/String;)V
    .locals 6

    const-string v0, "ListMultipartUploadsResult"

    .line 2000
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v1

    const-string v2, "Prefix"

    const/4 v3, 0x0

    const-string v4, "Upload"

    iget-object v5, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListMultipartUploadsHandler;->ۗ:Lcom/amazonaws/services/s3/model/MultipartUploadListing;

    if-eqz v1, :cond_a

    const-string v0, "Bucket"

    .line 2001
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2002
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_0
    const-string v0, "KeyMarker"

    .line 2003
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2004
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    sget p1, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser;->ۧ:I

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_1
    const-string v0, "Delimiter"

    .line 2005
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2006
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    sget p1, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser;->ۧ:I

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 2007
    :cond_2
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 2008
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    sget p1, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser;->ۧ:I

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_3
    const-string v0, "UploadIdMarker"

    .line 2009
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 2010
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    sget p1, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser;->ۧ:I

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_4
    const-string v0, "NextKeyMarker"

    .line 2011
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 2012
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    sget p1, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser;->ۧ:I

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_5
    const-string v0, "NextUploadIdMarker"

    .line 2013
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 2014
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    sget p1, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser;->ۧ:I

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_6
    const-string v0, "MaxUploads"

    .line 2015
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 2016
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_7
    const-string v0, "EncodingType"

    .line 2017
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 2018
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    sget p1, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser;->ۧ:I

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_8
    const-string v0, "IsTruncated"

    .line 2019
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 2020
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 2021
    :cond_9
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_14

    .line 2022
    invoke-virtual {v5}, Lcom/amazonaws/services/s3/model/MultipartUploadListing;->ۧ()Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListMultipartUploadsHandler;->᩶:Lcom/amazonaws/services/s3/model/MultipartUpload;

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2023
    iput-object v3, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListMultipartUploadsHandler;->᩶:Lcom/amazonaws/services/s3/model/MultipartUpload;

    return-void

    :cond_a
    const-string v1, "CommonPrefixes"

    .line 2027
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_b

    .line 2028
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_14

    .line 2029
    invoke-virtual {v5}, Lcom/amazonaws/services/s3/model/MultipartUploadListing;->֫()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 2033
    :cond_b
    filled-new-array {v0, v4}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v1

    const-string v2, "Initiator"

    const-string v5, "Owner"

    if-eqz v1, :cond_11

    const-string v0, "Key"

    .line 2034
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 2035
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListMultipartUploadsHandler;->᩶:Lcom/amazonaws/services/s3/model/MultipartUpload;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_c
    const-string v0, "UploadId"

    .line 2036
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 2037
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListMultipartUploadsHandler;->᩶:Lcom/amazonaws/services/s3/model/MultipartUpload;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 2038
    :cond_d
    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 2039
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListMultipartUploadsHandler;->᩶:Lcom/amazonaws/services/s3/model/MultipartUpload;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2040
    iput-object v3, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListMultipartUploadsHandler;->ۙ:Lcom/amazonaws/services/s3/model/Owner;

    return-void

    .line 2041
    :cond_e
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 2042
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListMultipartUploadsHandler;->᩶:Lcom/amazonaws/services/s3/model/MultipartUpload;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2043
    iput-object v3, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListMultipartUploadsHandler;->ۙ:Lcom/amazonaws/services/s3/model/Owner;

    return-void

    :cond_f
    const-string v0, "StorageClass"

    .line 2044
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 2045
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListMultipartUploadsHandler;->᩶:Lcom/amazonaws/services/s3/model/MultipartUpload;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_10
    const-string v0, "Initiated"

    .line 2046
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_14

    .line 2047
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListMultipartUploadsHandler;->᩶:Lcom/amazonaws/services/s3/model/MultipartUpload;

    .line 2048
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object v0

    sget v1, Lcom/amazonaws/services/s3/internal/ServiceUtils;->֫:I

    .line 79
    invoke-static {v0}, Lcom/amazonaws/util/DateUtils;->ۧ(Ljava/lang/String;)Ljava/util/Date;

    .line 2047
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 2052
    :cond_11
    filled-new-array {v0, v4, v5}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_12

    filled-new-array {v0, v4, v2}, [Ljava/lang/String;

    move-result-object v0

    .line 2053
    invoke-virtual {p0, v0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_14

    :cond_12
    const-string v0, "ID"

    .line 2055
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_13

    .line 2056
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListMultipartUploadsHandler;->ۙ:Lcom/amazonaws/services/s3/model/Owner;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/amazonaws/services/s3/model/Owner;->ۧ(Ljava/lang/String;)V

    return-void

    :cond_13
    const-string v0, "DisplayName"

    .line 2057
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_14

    .line 2058
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListMultipartUploadsHandler;->ۙ:Lcom/amazonaws/services/s3/model/Owner;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/amazonaws/services/s3/model/Owner;->֫(Ljava/lang/String;)V

    :cond_14
    return-void
.end method
