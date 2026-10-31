.class public Lcom/amazonaws/services/s3/model/MultipartUploadListing;
.super Ljava/lang/Object;
.source "MultipartUploadListing.java"


# instance fields
.field public ֫:Ljava/util/ArrayList;

.field public ۧ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 96
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/amazonaws/services/s3/model/MultipartUploadListing;->֫:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/util/ArrayList;
    .locals 1

    .line 336
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/MultipartUploadListing;->֫:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final ۧ()Ljava/util/List;
    .locals 1

    .line 289
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/MultipartUploadListing;->ۧ:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 290
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/amazonaws/services/s3/model/MultipartUploadListing;->ۧ:Ljava/util/ArrayList;

    .line 291
    :cond_0
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/MultipartUploadListing;->ۧ:Ljava/util/ArrayList;

    return-object v0
.end method
