.class public Lcom/amazonaws/services/s3/model/GetObjectRequest;
.super Lcom/amazonaws/AmazonWebServiceRequest;
.source "GetObjectRequest.java"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public ۗ:Ljava/util/ArrayList;

.field public ۙ:Ljava/util/ArrayList;

.field public ۫:Lcom/amazonaws/services/s3/model/S3ObjectIdBuilder;

.field public ۬:[J

.field public ᩶:Lcom/amazonaws/event/ProgressListener;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 149
    invoke-direct {p0}, Lcom/amazonaws/AmazonWebServiceRequest;-><init>()V

    .line 60
    new-instance v0, Lcom/amazonaws/services/s3/model/S3ObjectIdBuilder;

    invoke-direct {v0}, Lcom/amazonaws/services/s3/model/S3ObjectIdBuilder;-><init>()V

    iput-object v0, p0, Lcom/amazonaws/services/s3/model/GetObjectRequest;->۫:Lcom/amazonaws/services/s3/model/S3ObjectIdBuilder;

    .line 69
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/amazonaws/services/s3/model/GetObjectRequest;->ۙ:Ljava/util/ArrayList;

    .line 76
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/amazonaws/services/s3/model/GetObjectRequest;->ۗ:Ljava/util/ArrayList;

    .line 206
    invoke-virtual {v0, p1}, Lcom/amazonaws/services/s3/model/S3ObjectIdBuilder;->֫(Ljava/lang/String;)V

    .line 250
    invoke-virtual {v0, p2}, Lcom/amazonaws/services/s3/model/S3ObjectIdBuilder;->ۧ(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final ֫()Lcom/amazonaws/event/ProgressListener;
    .locals 1

    .line 855
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/GetObjectRequest;->᩶:Lcom/amazonaws/event/ProgressListener;

    return-object v0
.end method

.method public final ֫(JJ)V
    .locals 2

    const/4 v0, 0x2

    new-array v0, v0, [J

    const/4 v1, 0x0

    aput-wide p1, v0, v1

    const/4 p1, 0x1

    aput-wide p3, v0, p1

    .line 413
    iput-object v0, p0, Lcom/amazonaws/services/s3/model/GetObjectRequest;->۬:[J

    return-void
.end method

.method public final ֫(Lcom/amazonaws/event/ProgressListener;)V
    .locals 0

    .line 844
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/GetObjectRequest;->᩶:Lcom/amazonaws/event/ProgressListener;

    return-void
.end method

.method public final ۜ()Ljava/util/ArrayList;
    .locals 1

    .line 581
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/GetObjectRequest;->ۗ:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final ۢ()Ljava/lang/String;
    .locals 1

    .line 297
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/GetObjectRequest;->۫:Lcom/amazonaws/services/s3/model/S3ObjectIdBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    return-object v0
.end method

.method public final ܳ()Ljava/util/ArrayList;
    .locals 1

    .line 519
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/GetObjectRequest;->ۙ:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final ܿ()Ljava/lang/String;
    .locals 1

    .line 237
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/GetObjectRequest;->۫:Lcom/amazonaws/services/s3/model/S3ObjectIdBuilder;

    invoke-virtual {v0}, Lcom/amazonaws/services/s3/model/S3ObjectIdBuilder;->ۧ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    .line 193
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/GetObjectRequest;->۫:Lcom/amazonaws/services/s3/model/S3ObjectIdBuilder;

    invoke-virtual {v0}, Lcom/amazonaws/services/s3/model/S3ObjectIdBuilder;->֫()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩷()[J
    .locals 1

    .line 386
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/GetObjectRequest;->۬:[J

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, [J->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [J

    return-object v0
.end method
