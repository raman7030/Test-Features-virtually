.class public Lcom/amazonaws/services/s3/model/UploadPartResult;
.super Lcom/amazonaws/services/s3/internal/SSEResultBase;
.source "UploadPartResult.java"

# interfaces
.implements Lcom/amazonaws/services/s3/internal/S3RequesterChargedResult;


# instance fields
.field public ۗ:I

.field public ۙ:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Lcom/amazonaws/services/s3/internal/SSEResultBase;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(I)V
    .locals 0

    .line 54
    iput p1, p0, Lcom/amazonaws/services/s3/model/UploadPartResult;->ۗ:I

    return-void
.end method

.method public final ֫(Z)V
    .locals 0

    return-void
.end method

.method public final ܳ(Ljava/lang/String;)V
    .locals 0

    .line 73
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/UploadPartResult;->ۙ:Ljava/lang/String;

    return-void
.end method

.method public final ܿ()Lcom/amazonaws/services/s3/model/PartETag;
    .locals 3

    .line 85
    new-instance v0, Lcom/amazonaws/services/s3/model/PartETag;

    iget v1, p0, Lcom/amazonaws/services/s3/model/UploadPartResult;->ۗ:I

    iget-object v2, p0, Lcom/amazonaws/services/s3/model/UploadPartResult;->ۙ:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lcom/amazonaws/services/s3/model/PartETag;-><init>(ILjava/lang/String;)V

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/UploadPartResult;->ۙ:Ljava/lang/String;

    return-object v0
.end method
