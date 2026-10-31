.class public Lcom/amazonaws/services/s3/model/AbortMultipartUploadRequest;
.super Lcom/amazonaws/AmazonWebServiceRequest;
.source "AbortMultipartUploadRequest.java"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public ۗ:Ljava/lang/String;

.field public ۙ:Ljava/lang/String;

.field public ᩶:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 56
    invoke-direct {p0}, Lcom/amazonaws/AmazonWebServiceRequest;-><init>()V

    .line 57
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/AbortMultipartUploadRequest;->᩶:Ljava/lang/String;

    .line 58
    iput-object p2, p0, Lcom/amazonaws/services/s3/model/AbortMultipartUploadRequest;->ۙ:Ljava/lang/String;

    .line 59
    iput-object p3, p0, Lcom/amazonaws/services/s3/model/AbortMultipartUploadRequest;->ۗ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ܳ()Ljava/lang/String;
    .locals 1

    .line 127
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/AbortMultipartUploadRequest;->ۗ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܿ()Ljava/lang/String;
    .locals 1

    .line 96
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/AbortMultipartUploadRequest;->ۙ:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    .line 66
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/AbortMultipartUploadRequest;->᩶:Ljava/lang/String;

    return-object v0
.end method
