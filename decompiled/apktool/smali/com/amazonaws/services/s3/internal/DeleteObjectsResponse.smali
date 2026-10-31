.class public Lcom/amazonaws/services/s3/internal/DeleteObjectsResponse;
.super Ljava/lang/Object;
.source "DeleteObjectsResponse.java"

# interfaces
.implements Lcom/amazonaws/services/s3/internal/S3RequesterChargedResult;


# instance fields
.field public ᩸:Ljava/util/ArrayList;

.field public ᩹:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 51
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    iput-object v0, p0, Lcom/amazonaws/services/s3/internal/DeleteObjectsResponse;->᩸:Ljava/util/ArrayList;

    .line 61
    iput-object v1, p0, Lcom/amazonaws/services/s3/internal/DeleteObjectsResponse;->᩹:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/util/List;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/amazonaws/services/s3/internal/DeleteObjectsResponse;->᩸:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final ֫(Z)V
    .locals 0

    return-void
.end method

.method public final ۧ()Ljava/util/List;
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/amazonaws/services/s3/internal/DeleteObjectsResponse;->᩹:Ljava/util/ArrayList;

    return-object v0
.end method
