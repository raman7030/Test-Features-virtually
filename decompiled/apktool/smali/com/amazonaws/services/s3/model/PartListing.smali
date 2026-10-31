.class public Lcom/amazonaws/services/s3/model/PartListing;
.super Ljava/lang/Object;
.source "PartListing.java"

# interfaces
.implements Lcom/amazonaws/services/s3/internal/S3RequesterChargedResult;


# instance fields
.field public ᩸:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/util/List;
    .locals 1

    .line 352
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/PartListing;->᩸:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 353
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/amazonaws/services/s3/model/PartListing;->᩸:Ljava/util/ArrayList;

    .line 355
    :cond_0
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/PartListing;->᩸:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final ֫(Z)V
    .locals 0

    return-void
.end method
