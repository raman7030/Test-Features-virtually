.class public Lcom/amazonaws/services/s3/model/CopyObjectResult;
.super Lcom/amazonaws/services/s3/internal/SSEResultBase;
.source "CopyObjectResult.java"

# interfaces
.implements Lcom/amazonaws/services/s3/internal/ObjectExpirationResult;
.implements Lcom/amazonaws/services/s3/internal/S3RequesterChargedResult;
.implements Lcom/amazonaws/services/s3/internal/S3VersionResult;
.implements Ljava/io/Serializable;


# instance fields
.field public ۗ:Ljava/util/Date;

.field public ۙ:Ljava/lang/String;

.field public ۛ:Ljava/lang/String;

.field public ۤ:Ljava/util/Date;

.field public ۫:Z

.field public ۬:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 39
    invoke-direct {p0}, Lcom/amazonaws/services/s3/internal/SSEResultBase;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)V
    .locals 0

    .line 131
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/CopyObjectResult;->ۛ:Ljava/lang/String;

    return-void
.end method

.method public final ֫(Ljava/util/Date;)V
    .locals 0

    .line 150
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/CopyObjectResult;->ۗ:Ljava/util/Date;

    return-void
.end method

.method public final ֫(Z)V
    .locals 0

    .line 180
    iput-boolean p1, p0, Lcom/amazonaws/services/s3/model/CopyObjectResult;->۫:Z

    return-void
.end method

.method public final ۜ()Ljava/lang/String;
    .locals 1

    .line 120
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/CopyObjectResult;->ۛ:Ljava/lang/String;

    return-object v0
.end method

.method public final ۧ(Ljava/util/Date;)V
    .locals 0

    .line 107
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/CopyObjectResult;->ۤ:Ljava/util/Date;

    return-void
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    .line 159
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/CopyObjectResult;->۬:Ljava/lang/String;

    return-object v0
.end method

.method public final ܳ(Ljava/lang/String;)V
    .locals 0

    .line 86
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/CopyObjectResult;->ۙ:Ljava/lang/String;

    return-void
.end method

.method public final ܽ(Ljava/lang/String;)V
    .locals 0

    .line 170
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/CopyObjectResult;->۬:Ljava/lang/String;

    return-void
.end method

.method public final ܿ()Ljava/util/Date;
    .locals 1

    .line 140
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/CopyObjectResult;->ۗ:Ljava/util/Date;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/CopyObjectResult;->ۙ:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩷()Z
    .locals 1

    .line 175
    iget-boolean v0, p0, Lcom/amazonaws/services/s3/model/CopyObjectResult;->۫:Z

    return v0
.end method

.method public final ᩻()Ljava/util/Date;
    .locals 1

    .line 96
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/CopyObjectResult;->ۤ:Ljava/util/Date;

    return-object v0
.end method
