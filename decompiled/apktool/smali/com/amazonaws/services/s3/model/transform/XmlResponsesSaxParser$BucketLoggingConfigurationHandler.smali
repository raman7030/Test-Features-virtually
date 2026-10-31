.class public Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketLoggingConfigurationHandler;
.super Lcom/amazonaws/services/s3/model/transform/AbstractHandler;
.source "XmlResponsesSaxParser.java"


# instance fields
.field public final ᩶:Lcom/amazonaws/services/s3/model/BucketLoggingConfiguration;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1143
    invoke-direct {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;-><init>()V

    .line 1145
    new-instance v0, Lcom/amazonaws/services/s3/model/BucketLoggingConfiguration;

    invoke-direct {v0}, Lcom/amazonaws/services/s3/model/BucketLoggingConfiguration;-><init>()V

    iput-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketLoggingConfigurationHandler;->᩶:Lcom/amazonaws/services/s3/model/BucketLoggingConfiguration;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;Lorg/xml/sax/Attributes;)V
    .locals 0

    return-void
.end method

.method public final ܳ(Ljava/lang/String;)V
    .locals 2

    const-string v0, "BucketLoggingStatus"

    const-string v1, "LoggingEnabled"

    .line 1166
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "TargetBucket"

    .line 1167
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    iget-object v1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketLoggingConfigurationHandler;->᩶:Lcom/amazonaws/services/s3/model/BucketLoggingConfiguration;

    if-eqz v0, :cond_0

    .line 1169
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/amazonaws/services/s3/model/BucketLoggingConfiguration;->֫(Ljava/lang/String;)V

    return-void

    :cond_0
    const-string v0, "TargetPrefix"

    .line 1171
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 1173
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/amazonaws/services/s3/model/BucketLoggingConfiguration;->ۧ(Ljava/lang/String;)V

    :cond_1
    return-void
.end method
