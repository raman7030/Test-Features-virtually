.class public Lcom/amazonaws/services/s3/model/CompleteMultipartUploadRequest;
.super Lcom/amazonaws/AmazonWebServiceRequest;
.source "CompleteMultipartUploadRequest.java"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public ۗ:Ljava/util/ArrayList;

.field public ۙ:Ljava/lang/String;

.field public ۬:Ljava/lang/String;

.field public ᩶:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 1

    .line 74
    invoke-direct {p0}, Lcom/amazonaws/AmazonWebServiceRequest;-><init>()V

    .line 54
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 75
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/CompleteMultipartUploadRequest;->᩶:Ljava/lang/String;

    .line 76
    iput-object p2, p0, Lcom/amazonaws/services/s3/model/CompleteMultipartUploadRequest;->ۙ:Ljava/lang/String;

    .line 77
    iput-object p3, p0, Lcom/amazonaws/services/s3/model/CompleteMultipartUploadRequest;->۬:Ljava/lang/String;

    .line 78
    iput-object p4, p0, Lcom/amazonaws/services/s3/model/CompleteMultipartUploadRequest;->ۗ:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final ۜ()Ljava/lang/String;
    .locals 1

    .line 155
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/CompleteMultipartUploadRequest;->۬:Ljava/lang/String;

    return-object v0
.end method

.method public final ܳ()Ljava/util/List;
    .locals 1

    .line 188
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/CompleteMultipartUploadRequest;->ۗ:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final ܿ()Ljava/lang/String;
    .locals 1

    .line 122
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/CompleteMultipartUploadRequest;->ۙ:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/CompleteMultipartUploadRequest;->᩶:Ljava/lang/String;

    return-object v0
.end method
