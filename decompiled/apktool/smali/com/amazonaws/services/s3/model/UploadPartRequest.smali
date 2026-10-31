.class public Lcom/amazonaws/services/s3/model/UploadPartRequest;
.super Lcom/amazonaws/AmazonWebServiceRequest;
.source "UploadPartRequest.java"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J = 0x1L


# instance fields
.field public ۗ:J

.field public ۙ:Ljava/io/File;

.field public ۛ:I

.field public ۤ:Ljava/lang/String;

.field public ۨ:J

.field public transient ۫:Ljava/io/InputStream;

.field public ۬:I

.field public ᩶:Ljava/lang/String;

.field public ᩺:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 39
    invoke-direct {p0}, Lcom/amazonaws/AmazonWebServiceRequest;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(I)V
    .locals 0

    .line 146
    iput p1, p0, Lcom/amazonaws/services/s3/model/UploadPartRequest;->۬:I

    return-void
.end method

.method public final ֫(J)V
    .locals 0

    .line 497
    iput-wide p1, p0, Lcom/amazonaws/services/s3/model/UploadPartRequest;->ۗ:J

    return-void
.end method

.method public final ֫(Ljava/io/File;)V
    .locals 0

    .line 454
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/UploadPartRequest;->ۙ:Ljava/io/File;

    return-void
.end method

.method public final ֫(Ljava/io/InputStream;)V
    .locals 0

    .line 181
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/UploadPartRequest;->۫:Ljava/io/InputStream;

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 0

    .line 242
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/UploadPartRequest;->᩶:Ljava/lang/String;

    return-void
.end method

.method public final ۜ()Ljava/io/InputStream;
    .locals 1

    .line 191
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/UploadPartRequest;->۫:Ljava/io/InputStream;

    return-object v0
.end method

.method public final ۡ()J
    .locals 2

    .line 362
    iget-wide v0, p0, Lcom/amazonaws/services/s3/model/UploadPartRequest;->ۨ:J

    return-wide v0
.end method

.method public final ۢ()I
    .locals 1

    .line 322
    iget v0, p0, Lcom/amazonaws/services/s3/model/UploadPartRequest;->ۛ:I

    return v0
.end method

.method public final ۧ(J)V
    .locals 0

    .line 383
    iput-wide p1, p0, Lcom/amazonaws/services/s3/model/UploadPartRequest;->ۨ:J

    return-void
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 0

    .line 272
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/UploadPartRequest;->ۤ:Ljava/lang/String;

    return-void
.end method

.method public final ܳ()I
    .locals 1

    .line 138
    iget v0, p0, Lcom/amazonaws/services/s3/model/UploadPartRequest;->۬:I

    return v0
.end method

.method public final ܶۧ()Ljava/io/File;
    .locals 1

    .line 442
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/UploadPartRequest;->ۙ:Ljava/io/File;

    return-object v0
.end method

.method public final ܺ()Ljava/lang/String;
    .locals 1

    .line 284
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/UploadPartRequest;->᩺:Ljava/lang/String;

    return-object v0
.end method

.method public final ܽ(I)V
    .locals 0

    .line 352
    iput p1, p0, Lcom/amazonaws/services/s3/model/UploadPartRequest;->ۛ:I

    return-void
.end method

.method public final ܽ(Ljava/lang/String;)V
    .locals 0

    .line 308
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/UploadPartRequest;->᩺:Ljava/lang/String;

    return-void
.end method

.method public final ܿ()J
    .locals 2

    .line 484
    iget-wide v0, p0, Lcom/amazonaws/services/s3/model/UploadPartRequest;->ۗ:J

    return-wide v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    .line 216
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/UploadPartRequest;->᩶:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩷()Ljava/lang/String;
    .locals 1

    .line 252
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/UploadPartRequest;->ۤ:Ljava/lang/String;

    return-object v0
.end method
