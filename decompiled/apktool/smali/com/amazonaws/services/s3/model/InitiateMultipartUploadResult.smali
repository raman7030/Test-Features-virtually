.class public Lcom/amazonaws/services/s3/model/InitiateMultipartUploadResult;
.super Lcom/amazonaws/services/s3/internal/SSEResultBase;
.source "InitiateMultipartUploadResult.java"


# instance fields
.field public ۙ:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 29
    invoke-direct {p0}, Lcom/amazonaws/services/s3/internal/SSEResultBase;-><init>()V

    return-void
.end method


# virtual methods
.method public final ܳ(Ljava/lang/String;)V
    .locals 0

    .line 107
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/InitiateMultipartUploadResult;->ۙ:Ljava/lang/String;

    return-void
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    .line 98
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/InitiateMultipartUploadResult;->ۙ:Ljava/lang/String;

    return-object v0
.end method
