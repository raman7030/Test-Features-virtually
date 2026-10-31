.class public Lcom/amazonaws/services/s3/model/S3ObjectSummary;
.super Ljava/lang/Object;
.source "S3ObjectSummary.java"


# instance fields
.field public ֫:Ljava/lang/String;

.field public ۧ:Ljava/lang/String;

.field public ܳ:J

.field public ܽ:Ljava/lang/String;

.field public ܿ:Lcom/amazonaws/services/s3/model/Owner;

.field public ᩳ:Ljava/util/Date;

.field public ᩻:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 205
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "S3ObjectSummary{bucketName=\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/amazonaws/services/s3/model/S3ObjectSummary;->֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\', key=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/amazonaws/services/s3/model/S3ObjectSummary;->ܽ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\', eTag=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/amazonaws/services/s3/model/S3ObjectSummary;->ۧ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\', size="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/amazonaws/services/s3/model/S3ObjectSummary;->ܳ:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", lastModified="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/amazonaws/services/s3/model/S3ObjectSummary;->ᩳ:Ljava/util/Date;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", storageClass=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/amazonaws/services/s3/model/S3ObjectSummary;->᩻:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\', owner="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/amazonaws/services/s3/model/S3ObjectSummary;->ܿ:Lcom/amazonaws/services/s3/model/Owner;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 80
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/S3ObjectSummary;->ܽ:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫(J)V
    .locals 0

    .line 134
    iput-wide p1, p0, Lcom/amazonaws/services/s3/model/S3ObjectSummary;->ܳ:J

    return-void
.end method

.method public final ֫(Lcom/amazonaws/services/s3/model/Owner;)V
    .locals 0

    .line 180
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/S3ObjectSummary;->ܿ:Lcom/amazonaws/services/s3/model/Owner;

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 0

    .line 70
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/S3ObjectSummary;->֫:Ljava/lang/String;

    return-void
.end method

.method public final ֫(Ljava/util/Date;)V
    .locals 0

    .line 157
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/S3ObjectSummary;->ᩳ:Ljava/util/Date;

    return-void
.end method

.method public final ۧ()Ljava/util/Date;
    .locals 1

    .line 146
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/S3ObjectSummary;->ᩳ:Ljava/util/Date;

    return-object v0
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 0

    .line 114
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/S3ObjectSummary;->ۧ:Ljava/lang/String;

    return-void
.end method

.method public final ܽ()J
    .locals 2

    .line 124
    iget-wide v0, p0, Lcom/amazonaws/services/s3/model/S3ObjectSummary;->ܳ:J

    return-wide v0
.end method

.method public final ܽ(Ljava/lang/String;)V
    .locals 0

    .line 90
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/S3ObjectSummary;->ܽ:Ljava/lang/String;

    return-void
.end method

.method public final ᩳ(Ljava/lang/String;)V
    .locals 0

    .line 200
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/S3ObjectSummary;->᩻:Ljava/lang/String;

    return-void
.end method
