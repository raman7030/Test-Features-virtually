.class public Lcom/amazonaws/services/s3/model/InitiateMultipartUploadRequest;
.super Lcom/amazonaws/AmazonWebServiceRequest;
.source "InitiateMultipartUploadRequest.java"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public ۗ:Ljava/lang/String;

.field public ۙ:Lcom/amazonaws/services/s3/model/CannedAccessControlList;

.field public ۤ:Lcom/amazonaws/services/s3/model/ObjectTagging;

.field public ۫:Lcom/amazonaws/services/s3/model/SSEAwsKeyManagementParams;

.field public ۬:Lcom/amazonaws/services/s3/model/ObjectMetadata;

.field public ᩶:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 114
    invoke-direct {p0}, Lcom/amazonaws/AmazonWebServiceRequest;-><init>()V

    .line 115
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/InitiateMultipartUploadRequest;->᩶:Ljava/lang/String;

    .line 116
    iput-object p2, p0, Lcom/amazonaws/services/s3/model/InitiateMultipartUploadRequest;->ۗ:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/amazonaws/services/s3/model/ObjectMetadata;)V
    .locals 0

    .line 134
    invoke-direct {p0}, Lcom/amazonaws/AmazonWebServiceRequest;-><init>()V

    .line 135
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/InitiateMultipartUploadRequest;->᩶:Ljava/lang/String;

    .line 136
    iput-object p2, p0, Lcom/amazonaws/services/s3/model/InitiateMultipartUploadRequest;->ۗ:Ljava/lang/String;

    .line 137
    iput-object p3, p0, Lcom/amazonaws/services/s3/model/InitiateMultipartUploadRequest;->۬:Lcom/amazonaws/services/s3/model/ObjectMetadata;

    return-void
.end method


# virtual methods
.method public final ֫(Lcom/amazonaws/services/s3/model/CannedAccessControlList;)V
    .locals 0

    .line 258
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/InitiateMultipartUploadRequest;->ۙ:Lcom/amazonaws/services/s3/model/CannedAccessControlList;

    return-void
.end method

.method public final ֫(Lcom/amazonaws/services/s3/model/ObjectTagging;)V
    .locals 0

    .line 565
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/InitiateMultipartUploadRequest;->ۤ:Lcom/amazonaws/services/s3/model/ObjectTagging;

    return-void
.end method

.method public final ֫(Lcom/amazonaws/services/s3/model/SSEAwsKeyManagementParams;)V
    .locals 0

    .line 470
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/InitiateMultipartUploadRequest;->۫:Lcom/amazonaws/services/s3/model/SSEAwsKeyManagementParams;

    return-void
.end method

.method public final ۜ()Lcom/amazonaws/services/s3/model/SSEAwsKeyManagementParams;
    .locals 1

    .line 458
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/InitiateMultipartUploadRequest;->۫:Lcom/amazonaws/services/s3/model/SSEAwsKeyManagementParams;

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    .line 189
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/InitiateMultipartUploadRequest;->ۗ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܿ()Lcom/amazonaws/services/s3/model/CannedAccessControlList;
    .locals 1

    .line 229
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/InitiateMultipartUploadRequest;->ۙ:Lcom/amazonaws/services/s3/model/CannedAccessControlList;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    .line 149
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/InitiateMultipartUploadRequest;->᩶:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩷()Lcom/amazonaws/services/s3/model/ObjectTagging;
    .locals 1

    .line 556
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/InitiateMultipartUploadRequest;->ۤ:Lcom/amazonaws/services/s3/model/ObjectTagging;

    return-object v0
.end method
