.class public Lcom/amazonaws/services/s3/model/S3Object;
.super Ljava/lang/Object;
.source "S3Object.java"

# interfaces
.implements Ljava/io/Closeable;
.implements Ljava/io/Serializable;
.implements Lcom/amazonaws/services/s3/internal/S3RequesterChargedResult;


# instance fields
.field public transient ۙ:Lcom/amazonaws/services/s3/model/S3ObjectInputStream;

.field public ᩶:Lcom/amazonaws/services/s3/model/ObjectMetadata;

.field public ᩸:Ljava/lang/String;

.field public ᩹:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 38
    iput-object v0, p0, Lcom/amazonaws/services/s3/model/S3Object;->᩹:Ljava/lang/String;

    .line 41
    iput-object v0, p0, Lcom/amazonaws/services/s3/model/S3Object;->᩸:Ljava/lang/String;

    .line 44
    new-instance v0, Lcom/amazonaws/services/s3/model/ObjectMetadata;

    invoke-direct {v0}, Lcom/amazonaws/services/s3/model/ObjectMetadata;-><init>()V

    iput-object v0, p0, Lcom/amazonaws/services/s3/model/S3Object;->᩶:Lcom/amazonaws/services/s3/model/ObjectMetadata;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 105
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/S3Object;->ۙ:Lcom/amazonaws/services/s3/model/S3ObjectInputStream;

    if-eqz v0, :cond_0

    .line 222
    invoke-virtual {v0}, Lcom/amazonaws/internal/SdkFilterInputStream;->close()V

    :cond_0
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 208
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "S3Object [key="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 163
    iget-object v1, p0, Lcom/amazonaws/services/s3/model/S3Object;->᩹:Ljava/lang/String;

    .line 208
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",bucket="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/amazonaws/services/s3/model/S3Object;->᩸:Ljava/lang/String;

    if-nez v1, :cond_0

    const-string v1, "<Unknown>"

    :cond_0
    const-string v2, "]"

    .line 0
    invoke-static {v0, v1, v2}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Lcom/amazonaws/services/s3/model/S3ObjectInputStream;
    .locals 1

    .line 105
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/S3Object;->ۙ:Lcom/amazonaws/services/s3/model/S3ObjectInputStream;

    return-object v0
.end method

.method public final ֫(Lcom/amazonaws/services/s3/model/S3ObjectInputStream;)V
    .locals 0

    .line 117
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/S3Object;->ۙ:Lcom/amazonaws/services/s3/model/S3ObjectInputStream;

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 0

    .line 152
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/S3Object;->᩸:Ljava/lang/String;

    return-void
.end method

.method public final ֫(Z)V
    .locals 0

    return-void
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 0

    .line 175
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/S3Object;->᩹:Ljava/lang/String;

    return-void
.end method

.method public final ܽ()Lcom/amazonaws/services/s3/model/ObjectMetadata;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/S3Object;->᩶:Lcom/amazonaws/services/s3/model/ObjectMetadata;

    return-object v0
.end method
