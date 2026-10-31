.class public Lcom/amazonaws/services/s3/model/MultiObjectDeleteException;
.super Lcom/amazonaws/services/s3/model/AmazonS3Exception;
.source "MultiObjectDeleteException.java"


# static fields
.field public static final serialVersionUID:J = -0x1bd0659b6702d912L


# instance fields
.field public final ۤ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/util/List;)V
    .locals 2

    const-string v0, "One or more objects could not be deleted"

    .line 62
    invoke-direct {p0, v0}, Lcom/amazonaws/AmazonServiceException;-><init>(Ljava/lang/String;)V

    .line 33
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/amazonaws/services/s3/model/MultiObjectDeleteException;->ۤ:Ljava/util/ArrayList;

    .line 34
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 39
    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 40
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-void
.end method


# virtual methods
.method public final ܳ()Ljava/util/ArrayList;
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/MultiObjectDeleteException;->ۤ:Ljava/util/ArrayList;

    return-object v0
.end method
