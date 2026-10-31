.class public Lcom/amazonaws/services/s3/model/Bucket;
.super Ljava/lang/Object;
.source "Bucket.java"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J = -0x77ffb7cc751194fcL


# instance fields
.field public ᩶:Lcom/amazonaws/services/s3/model/Owner;

.field public ᩸:Ljava/util/Date;

.field public ᩹:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 63
    iput-object v0, p0, Lcom/amazonaws/services/s3/model/Bucket;->᩹:Ljava/lang/String;

    .line 66
    iput-object v0, p0, Lcom/amazonaws/services/s3/model/Bucket;->᩶:Lcom/amazonaws/services/s3/model/Owner;

    .line 69
    iput-object v0, p0, Lcom/amazonaws/services/s3/model/Bucket;->᩸:Ljava/util/Date;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 95
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "S3Bucket [name="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 151
    iget-object v1, p0, Lcom/amazonaws/services/s3/model/Bucket;->᩹:Ljava/lang/String;

    .line 95
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", creationDate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    iget-object v1, p0, Lcom/amazonaws/services/s3/model/Bucket;->᩸:Ljava/util/Date;

    .line 96
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", owner="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    iget-object v1, p0, Lcom/amazonaws/services/s3/model/Bucket;->᩶:Lcom/amazonaws/services/s3/model/Owner;

    .line 97
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Lcom/amazonaws/services/s3/model/Owner;)V
    .locals 0

    .line 120
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/Bucket;->᩶:Lcom/amazonaws/services/s3/model/Owner;

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 0

    .line 161
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/Bucket;->᩹:Ljava/lang/String;

    return-void
.end method

.method public final ֫(Ljava/util/Date;)V
    .locals 0

    .line 141
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/Bucket;->᩸:Ljava/util/Date;

    return-void
.end method
