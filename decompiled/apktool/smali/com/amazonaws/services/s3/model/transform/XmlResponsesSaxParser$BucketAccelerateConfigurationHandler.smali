.class public Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketAccelerateConfigurationHandler;
.super Lcom/amazonaws/services/s3/model/transform/AbstractHandler;
.source "XmlResponsesSaxParser.java"


# instance fields
.field public final ᩶:Lcom/amazonaws/services/s3/model/BucketAccelerateConfiguration;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1679
    invoke-direct {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;-><init>()V

    .line 1681
    new-instance v0, Lcom/amazonaws/services/s3/model/BucketAccelerateConfiguration;

    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1681
    iput-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketAccelerateConfigurationHandler;->᩶:Lcom/amazonaws/services/s3/model/BucketAccelerateConfiguration;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;Lorg/xml/sax/Attributes;)V
    .locals 0

    return-void
.end method

.method public final ܳ(Ljava/lang/String;)V
    .locals 1

    const-string v0, "AccelerateConfiguration"

    .line 1699
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Status"

    .line 1700
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 1701
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketAccelerateConfigurationHandler;->᩶:Lcom/amazonaws/services/s3/model/BucketAccelerateConfiguration;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_0
    return-void
.end method
