.class public Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$GetObjectTaggingHandler;
.super Lcom/amazonaws/services/s3/model/transform/AbstractHandler;
.source "XmlResponsesSaxParser.java"


# instance fields
.field public ۗ:Ljava/util/ArrayList;

.field public ۙ:Ljava/lang/String;

.field public ᩶:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2371
    invoke-direct {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;Lorg/xml/sax/Attributes;)V
    .locals 0

    const-string p2, "Tagging"

    .line 2383
    filled-new-array {p2}, [Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    const-string p2, "TagSet"

    .line 2384
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2385
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$GetObjectTaggingHandler;->ۗ:Ljava/util/ArrayList;

    :cond_0
    return-void
.end method

.method public final ܳ(Ljava/lang/String;)V
    .locals 5

    const-string v0, "Tagging"

    .line 2392
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x0

    const-string v3, "TagSet"

    if-eqz v1, :cond_0

    .line 2393
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 2395
    iput-object v2, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$GetObjectTaggingHandler;->ۗ:Ljava/util/ArrayList;

    .line 2398
    :cond_0
    filled-new-array {v0, v3}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v1

    const-string v4, "Tag"

    if-eqz v1, :cond_1

    .line 2399
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 2400
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$GetObjectTaggingHandler;->ۗ:Ljava/util/ArrayList;

    new-instance v0, Lcom/amazonaws/services/s3/model/Tag;

    iget-object v1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$GetObjectTaggingHandler;->᩶:Ljava/lang/String;

    iget-object v3, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$GetObjectTaggingHandler;->ۙ:Ljava/lang/String;

    invoke-direct {v0, v1, v3}, Lcom/amazonaws/services/s3/model/Tag;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2401
    iput-object v2, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$GetObjectTaggingHandler;->᩶:Ljava/lang/String;

    .line 2402
    iput-object v2, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$GetObjectTaggingHandler;->ۙ:Ljava/lang/String;

    return-void

    .line 2404
    :cond_1
    filled-new-array {v0, v3, v4}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "Key"

    .line 2405
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2406
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$GetObjectTaggingHandler;->᩶:Ljava/lang/String;

    return-void

    :cond_2
    const-string v0, "Value"

    .line 2407
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 2408
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$GetObjectTaggingHandler;->ۙ:Ljava/lang/String;

    :cond_3
    return-void
.end method
