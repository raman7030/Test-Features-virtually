.class public Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$CompleteMultipartUploadHandler;
.super Lcom/amazonaws/services/s3/model/transform/AbstractSSEHandler;
.source "XmlResponsesSaxParser.java"

# interfaces
.implements Lcom/amazonaws/services/s3/internal/ObjectExpirationResult;
.implements Lcom/amazonaws/services/s3/internal/S3VersionResult;
.implements Lcom/amazonaws/services/s3/internal/S3RequesterChargedResult;


# instance fields
.field public ۗ:Ljava/lang/String;

.field public ۙ:Ljava/lang/String;

.field public ۫:Lcom/amazonaws/services/s3/model/CompleteMultipartUploadResult;

.field public ۬:Ljava/lang/String;

.field public ᩶:Lcom/amazonaws/services/s3/model/AmazonS3Exception;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1726
    invoke-direct {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractSSEHandler;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)V
    .locals 0

    .line 1780
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$CompleteMultipartUploadHandler;->۫:Lcom/amazonaws/services/s3/model/CompleteMultipartUploadResult;

    if-eqz p1, :cond_0

    .line 1781
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_0
    return-void
.end method

.method public final ֫(Ljava/lang/String;Lorg/xml/sax/Attributes;)V
    .locals 0

    .line 1823
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫()Z

    move-result p2

    if-eqz p2, :cond_0

    const-string p2, "CompleteMultipartUploadResult"

    .line 1824
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 1825
    new-instance p1, Lcom/amazonaws/services/s3/model/CompleteMultipartUploadResult;

    invoke-direct {p1}, Lcom/amazonaws/services/s3/model/CompleteMultipartUploadResult;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$CompleteMultipartUploadHandler;->۫:Lcom/amazonaws/services/s3/model/CompleteMultipartUploadResult;

    :cond_0
    return-void
.end method

.method public final ֫(Ljava/util/Date;)V
    .locals 0

    .line 1755
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$CompleteMultipartUploadHandler;->۫:Lcom/amazonaws/services/s3/model/CompleteMultipartUploadResult;

    if-eqz p1, :cond_0

    .line 1756
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_0
    return-void
.end method

.method public final ֫(Z)V
    .locals 0

    .line 1803
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$CompleteMultipartUploadHandler;->۫:Lcom/amazonaws/services/s3/model/CompleteMultipartUploadResult;

    if-eqz p1, :cond_0

    .line 1804
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_0
    return-void
.end method

.method public final ۜ()Lcom/amazonaws/services/s3/model/CompleteMultipartUploadResult;
    .locals 1

    .line 1809
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$CompleteMultipartUploadHandler;->۫:Lcom/amazonaws/services/s3/model/CompleteMultipartUploadResult;

    return-object v0
.end method

.method public final ܳ()Lcom/amazonaws/services/s3/internal/ServerSideEncryptionResult;
    .locals 1

    .line 1739
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$CompleteMultipartUploadHandler;->۫:Lcom/amazonaws/services/s3/model/CompleteMultipartUploadResult;

    return-object v0
.end method

.method public final ܳ(Ljava/lang/String;)V
    .locals 2

    .line 1832
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫()Z

    move-result v0

    const-string v1, "Error"

    if-eqz v0, :cond_0

    .line 1833
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    .line 1834
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$CompleteMultipartUploadHandler;->᩶:Lcom/amazonaws/services/s3/model/AmazonS3Exception;

    if-eqz p1, :cond_8

    .line 1835
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$CompleteMultipartUploadHandler;->ۙ:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/amazonaws/AmazonServiceException;->֫(Ljava/lang/String;)V

    .line 1836
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$CompleteMultipartUploadHandler;->᩶:Lcom/amazonaws/services/s3/model/AmazonS3Exception;

    iget-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$CompleteMultipartUploadHandler;->۬:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/amazonaws/AmazonServiceException;->ܽ(Ljava/lang/String;)V

    .line 1837
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$CompleteMultipartUploadHandler;->᩶:Lcom/amazonaws/services/s3/model/AmazonS3Exception;

    iget-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$CompleteMultipartUploadHandler;->ۗ:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/amazonaws/services/s3/model/AmazonS3Exception;->ܿ(Ljava/lang/String;)V

    return-void

    :cond_0
    const-string v0, "CompleteMultipartUploadResult"

    .line 1842
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "Location"

    .line 1843
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1844
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$CompleteMultipartUploadHandler;->۫:Lcom/amazonaws/services/s3/model/CompleteMultipartUploadResult;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_1
    const-string v0, "Bucket"

    .line 1845
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1846
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$CompleteMultipartUploadHandler;->۫:Lcom/amazonaws/services/s3/model/CompleteMultipartUploadResult;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_2
    const-string v0, "Key"

    .line 1847
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1848
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$CompleteMultipartUploadHandler;->۫:Lcom/amazonaws/services/s3/model/CompleteMultipartUploadResult;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_3
    const-string v0, "ETag"

    .line 1849
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    .line 1850
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$CompleteMultipartUploadHandler;->۫:Lcom/amazonaws/services/s3/model/CompleteMultipartUploadResult;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/amazonaws/services/s3/internal/ServiceUtils;->֫(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 1854
    :cond_4
    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    const-string v0, "Code"

    .line 1855
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1856
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$CompleteMultipartUploadHandler;->ۙ:Ljava/lang/String;

    return-void

    :cond_5
    const-string v0, "Message"

    .line 1857
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 1858
    new-instance p1, Lcom/amazonaws/services/s3/model/AmazonS3Exception;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object v0

    .line 62
    invoke-direct {p1, v0}, Lcom/amazonaws/AmazonServiceException;-><init>(Ljava/lang/String;)V

    .line 1858
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$CompleteMultipartUploadHandler;->᩶:Lcom/amazonaws/services/s3/model/AmazonS3Exception;

    return-void

    :cond_6
    const-string v0, "RequestId"

    .line 1859
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 1860
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$CompleteMultipartUploadHandler;->۬:Ljava/lang/String;

    return-void

    :cond_7
    const-string v0, "HostId"

    .line 1861
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    .line 1862
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$CompleteMultipartUploadHandler;->ۗ:Ljava/lang/String;

    :cond_8
    return-void
.end method

.method public final ܽ(Ljava/lang/String;)V
    .locals 0

    .line 1773
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$CompleteMultipartUploadHandler;->۫:Lcom/amazonaws/services/s3/model/CompleteMultipartUploadResult;

    if-eqz p1, :cond_0

    .line 1774
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_0
    return-void
.end method

.method public final ᩻()Lcom/amazonaws/services/s3/model/AmazonS3Exception;
    .locals 1

    .line 1813
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$CompleteMultipartUploadHandler;->᩶:Lcom/amazonaws/services/s3/model/AmazonS3Exception;

    return-object v0
.end method
