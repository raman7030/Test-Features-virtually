.class public abstract Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;
.super Lcom/amazonaws/AmazonWebServiceRequest;
.source "AbstractPutObjectRequest.java"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public ۗ:Ljava/io/File;

.field public ۙ:Lcom/amazonaws/services/s3/model/CannedAccessControlList;

.field public ۛ:Ljava/lang/String;

.field public ۤ:Lcom/amazonaws/services/s3/model/ObjectMetadata;

.field public ۨ:Lcom/amazonaws/services/s3/model/SSEAwsKeyManagementParams;

.field public ۫:Ljava/lang/String;

.field public transient ۬:Ljava/io/InputStream;

.field public ܰ:Lcom/amazonaws/services/s3/model/ObjectTagging;

.field public ᩶:Ljava/lang/String;

.field public ᩺:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 114
    invoke-direct {p0}, Lcom/amazonaws/AmazonWebServiceRequest;-><init>()V

    .line 115
    iput-object p2, p0, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->᩶:Ljava/lang/String;

    .line 116
    iput-object p3, p0, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->۫:Ljava/lang/String;

    .line 117
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->ۗ:Ljava/io/File;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;Lcom/amazonaws/services/s3/model/ObjectMetadata;)V
    .locals 0

    .line 159
    invoke-direct {p0}, Lcom/amazonaws/AmazonWebServiceRequest;-><init>()V

    .line 160
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->᩶:Ljava/lang/String;

    .line 161
    iput-object p2, p0, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->۫:Ljava/lang/String;

    .line 162
    iput-object p3, p0, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->۬:Ljava/io/InputStream;

    .line 163
    iput-object p4, p0, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->ۤ:Lcom/amazonaws/services/s3/model/ObjectMetadata;

    return-void
.end method


# virtual methods
.method public bridge synthetic clone()Lcom/amazonaws/AmazonWebServiceRequest;
    .locals 1

    .line 27
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->clone()Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;
    .locals 1

    .line 827
    invoke-super {p0}, Lcom/amazonaws/AmazonWebServiceRequest;->clone()Lcom/amazonaws/AmazonWebServiceRequest;

    move-result-object v0

    check-cast v0, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 27
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->clone()Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;

    move-result-object v0

    return-object v0
.end method

.method public ֫(Ljava/io/InputStream;)Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;
    .locals 0

    .line 606
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->۬:Ljava/io/InputStream;

    return-object p0
.end method

.method public final ֫(Lcom/amazonaws/services/s3/model/CannedAccessControlList;)V
    .locals 0

    .line 516
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->ۙ:Lcom/amazonaws/services/s3/model/CannedAccessControlList;

    return-void
.end method

.method public final ֫(Lcom/amazonaws/services/s3/model/ObjectMetadata;)V
    .locals 0

    .line 462
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->ۤ:Lcom/amazonaws/services/s3/model/ObjectMetadata;

    return-void
.end method

.method public final ֫(Lcom/amazonaws/services/s3/model/ObjectTagging;)V
    .locals 0

    .line 719
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->ܰ:Lcom/amazonaws/services/s3/model/ObjectTagging;

    return-void
.end method

.method public final ֫(Lcom/amazonaws/services/s3/model/SSEAwsKeyManagementParams;)V
    .locals 0

    .line 808
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->ۨ:Lcom/amazonaws/services/s3/model/SSEAwsKeyManagementParams;

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 0

    .line 641
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->ۛ:Ljava/lang/String;

    return-void
.end method

.method public final ۖ()Lcom/amazonaws/services/s3/model/ObjectTagging;
    .locals 1

    .line 710
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->ܰ:Lcom/amazonaws/services/s3/model/ObjectTagging;

    return-object v0
.end method

.method public final ۜ()Ljava/lang/String;
    .locals 1

    .line 227
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->۫:Ljava/lang/String;

    return-object v0
.end method

.method public final ۡ()Lcom/amazonaws/services/s3/model/SSEAwsKeyManagementParams;
    .locals 1

    .line 796
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->ۨ:Lcom/amazonaws/services/s3/model/SSEAwsKeyManagementParams;

    return-object v0
.end method

.method public final ۢ()Ljava/lang/String;
    .locals 1

    .line 648
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->ۛ:Ljava/lang/String;

    return-object v0
.end method

.method public ۧ(Lcom/amazonaws/services/s3/model/CannedAccessControlList;)Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;
    .locals 0

    .line 516
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->ۙ:Lcom/amazonaws/services/s3/model/CannedAccessControlList;

    return-object p0
.end method

.method public ۧ(Lcom/amazonaws/services/s3/model/ObjectMetadata;)Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;
    .locals 0

    .line 462
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->ۤ:Lcom/amazonaws/services/s3/model/ObjectMetadata;

    return-object p0
.end method

.method public final ۧ(Lcom/amazonaws/services/s3/model/PutObjectRequest;)Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;
    .locals 2

    .line 832
    invoke-virtual {p0, p1}, Lcom/amazonaws/AmazonWebServiceRequest;->֫(Lcom/amazonaws/services/s3/model/PutObjectRequest;)V

    .line 441
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->ۤ:Lcom/amazonaws/services/s3/model/ObjectMetadata;

    .line 503
    iget-object v1, p0, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->ۙ:Lcom/amazonaws/services/s3/model/CannedAccessControlList;

    .line 835
    invoke-virtual {p1, v1}, Lcom/amazonaws/services/s3/model/PutObjectRequest;->ۧ(Lcom/amazonaws/services/s3/model/CannedAccessControlList;)Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;

    .line 588
    iget-object v1, p0, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->۬:Ljava/io/InputStream;

    .line 836
    invoke-virtual {p1, v1}, Lcom/amazonaws/services/s3/model/PutObjectRequest;->֫(Ljava/io/InputStream;)Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 837
    :cond_0
    invoke-virtual {v0}, Lcom/amazonaws/services/s3/model/ObjectMetadata;->clone()Lcom/amazonaws/services/s3/model/ObjectMetadata;

    move-result-object v0

    :goto_0
    invoke-virtual {p1, v0}, Lcom/amazonaws/services/s3/model/PutObjectRequest;->ۧ(Lcom/amazonaws/services/s3/model/ObjectMetadata;)Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;

    .line 648
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->ۛ:Ljava/lang/String;

    .line 838
    invoke-virtual {p1, v0}, Lcom/amazonaws/services/s3/model/PutObjectRequest;->ܽ(Ljava/lang/String;)Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;

    .line 275
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->᩺:Ljava/lang/String;

    .line 839
    invoke-virtual {p1, v0}, Lcom/amazonaws/services/s3/model/PutObjectRequest;->ᩳ(Ljava/lang/String;)Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;

    .line 796
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->ۨ:Lcom/amazonaws/services/s3/model/SSEAwsKeyManagementParams;

    .line 840
    invoke-virtual {p1, v0}, Lcom/amazonaws/services/s3/model/PutObjectRequest;->ۧ(Lcom/amazonaws/services/s3/model/SSEAwsKeyManagementParams;)Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;

    return-object p1
.end method

.method public ۧ(Lcom/amazonaws/services/s3/model/SSEAwsKeyManagementParams;)Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;
    .locals 0

    .line 808
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->ۨ:Lcom/amazonaws/services/s3/model/SSEAwsKeyManagementParams;

    return-object p0
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 0

    .line 294
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->᩺:Ljava/lang/String;

    return-void
.end method

.method public final ܳ()Ljava/io/InputStream;
    .locals 1

    .line 588
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->۬:Ljava/io/InputStream;

    return-object v0
.end method

.method public final ܶۧ()Ljava/io/File;
    .locals 1

    .line 380
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->ۗ:Ljava/io/File;

    return-object v0
.end method

.method public final ܺ()Ljava/lang/String;
    .locals 1

    .line 275
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->᩺:Ljava/lang/String;

    return-object v0
.end method

.method public ܽ(Ljava/lang/String;)Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;
    .locals 0

    .line 660
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->ۛ:Ljava/lang/String;

    return-object p0
.end method

.method public final ܿ()Lcom/amazonaws/services/s3/model/CannedAccessControlList;
    .locals 1

    .line 503
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->ۙ:Lcom/amazonaws/services/s3/model/CannedAccessControlList;

    return-object v0
.end method

.method public ᩳ(Ljava/lang/String;)Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;
    .locals 0

    .line 294
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->᩺:Ljava/lang/String;

    return-object p0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    .line 177
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->᩶:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩷()Lcom/amazonaws/services/s3/model/ObjectMetadata;
    .locals 1

    .line 441
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->ۤ:Lcom/amazonaws/services/s3/model/ObjectMetadata;

    return-object v0
.end method
