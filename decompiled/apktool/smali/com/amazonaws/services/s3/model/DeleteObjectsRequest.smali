.class public Lcom/amazonaws/services/s3/model/DeleteObjectsRequest;
.super Lcom/amazonaws/AmazonWebServiceRequest;
.source "DeleteObjectsRequest.java"


# instance fields
.field public ۗ:Z

.field public final ۙ:Ljava/util/ArrayList;

.field public ᩶:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 75
    invoke-direct {p0}, Lcom/amazonaws/AmazonWebServiceRequest;-><init>()V

    .line 60
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/amazonaws/services/s3/model/DeleteObjectsRequest;->ۙ:Ljava/util/ArrayList;

    .line 98
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/DeleteObjectsRequest;->᩶:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/util/List;)V
    .locals 1

    .line 219
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/DeleteObjectsRequest;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 220
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public final ۜ()V
    .locals 1

    const/4 v0, 0x1

    .line 190
    iput-boolean v0, p0, Lcom/amazonaws/services/s3/model/DeleteObjectsRequest;->ۗ:Z

    return-void
.end method

.method public final ܳ()Z
    .locals 1

    .line 198
    iget-boolean v0, p0, Lcom/amazonaws/services/s3/model/DeleteObjectsRequest;->ۗ:Z

    return v0
.end method

.method public final ܿ()Ljava/util/ArrayList;
    .locals 1

    .line 239
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/DeleteObjectsRequest;->ۙ:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    .line 87
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/DeleteObjectsRequest;->᩶:Ljava/lang/String;

    return-object v0
.end method
