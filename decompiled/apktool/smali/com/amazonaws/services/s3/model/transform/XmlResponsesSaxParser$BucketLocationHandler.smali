.class public Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketLocationHandler;
.super Lcom/amazonaws/services/s3/model/transform/AbstractHandler;
.source "XmlResponsesSaxParser.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1184
    invoke-direct {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;Lorg/xml/sax/Attributes;)V
    .locals 0

    return-void
.end method

.method public final ܳ(Ljava/lang/String;)V
    .locals 1

    .line 1206
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "LocationConstraint"

    .line 1207
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 1208
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object p1

    .line 1209
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_0
    return-void
.end method
