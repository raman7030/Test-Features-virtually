.class public Lcom/amazonaws/services/s3/model/BucketLoggingConfiguration;
.super Ljava/lang/Object;
.source "BucketLoggingConfiguration.java"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public ᩸:Ljava/lang/String;

.field public ᩹:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 51
    iput-object v0, p0, Lcom/amazonaws/services/s3/model/BucketLoggingConfiguration;->᩸:Ljava/lang/String;

    .line 52
    iput-object v0, p0, Lcom/amazonaws/services/s3/model/BucketLoggingConfiguration;->᩹:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 136
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "LoggingConfiguration enabled="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 88
    iget-object v1, p0, Lcom/amazonaws/services/s3/model/BucketLoggingConfiguration;->᩸:Ljava/lang/String;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/amazonaws/services/s3/model/BucketLoggingConfiguration;->᩹:Ljava/lang/String;

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 136
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 88
    iget-object v1, p0, Lcom/amazonaws/services/s3/model/BucketLoggingConfiguration;->᩸:Ljava/lang/String;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/amazonaws/services/s3/model/BucketLoggingConfiguration;->᩹:Ljava/lang/String;

    if-eqz v1, :cond_1

    const-string v1, ", destinationBucketName="

    .line 0
    invoke-static {v0, v1}, Ll/۟֫ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 121
    iget-object v1, p0, Lcom/amazonaws/services/s3/model/BucketLoggingConfiguration;->᩸:Ljava/lang/String;

    .line 138
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", logFilePrefix="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    iget-object v1, p0, Lcom/amazonaws/services/s3/model/BucketLoggingConfiguration;->᩹:Ljava/lang/String;

    .line 139
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 0

    .line 131
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/BucketLoggingConfiguration;->᩸:Ljava/lang/String;

    return-void
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 0

    if-nez p1, :cond_0

    const-string p1, ""

    .line 112
    :cond_0
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/BucketLoggingConfiguration;->᩹:Ljava/lang/String;

    return-void
.end method
