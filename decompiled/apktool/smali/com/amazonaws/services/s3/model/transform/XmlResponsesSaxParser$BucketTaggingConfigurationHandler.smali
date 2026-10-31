.class public Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketTaggingConfigurationHandler;
.super Lcom/amazonaws/services/s3/model/transform/AbstractHandler;
.source "XmlResponsesSaxParser.java"


# instance fields
.field public ۗ:Ljava/util/HashMap;

.field public ۙ:Ljava/lang/String;

.field public ۬:Ljava/lang/String;

.field public final ᩶:Lcom/amazonaws/services/s3/model/BucketTaggingConfiguration;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 2294
    invoke-direct {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;-><init>()V

    .line 2296
    new-instance v0, Lcom/amazonaws/services/s3/model/BucketTaggingConfiguration;

    invoke-direct {v0}, Lcom/amazonaws/services/s3/model/BucketTaggingConfiguration;-><init>()V

    iput-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketTaggingConfigurationHandler;->᩶:Lcom/amazonaws/services/s3/model/BucketTaggingConfiguration;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;Lorg/xml/sax/Attributes;)V
    .locals 0

    const-string p2, "Tagging"

    .line 2314
    filled-new-array {p2}, [Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    const-string p2, "TagSet"

    .line 2315
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2316
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketTaggingConfigurationHandler;->ۗ:Ljava/util/HashMap;

    :cond_0
    return-void
.end method

.method public final ܳ(Ljava/lang/String;)V
    .locals 5

    const-string v0, "Tagging"

    .line 2323
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x0

    const-string v3, "TagSet"

    if-eqz v1, :cond_0

    .line 2324
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 2325
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketTaggingConfigurationHandler;->᩶:Lcom/amazonaws/services/s3/model/BucketTaggingConfiguration;

    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/BucketTaggingConfiguration;->֫()Ljava/util/ArrayList;

    move-result-object p1

    new-instance v0, Lcom/amazonaws/services/s3/model/TagSet;

    iget-object v1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketTaggingConfigurationHandler;->ۗ:Ljava/util/HashMap;

    invoke-direct {v0, v1}, Lcom/amazonaws/services/s3/model/TagSet;-><init>(Ljava/util/HashMap;)V

    .line 2326
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2327
    iput-object v2, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketTaggingConfigurationHandler;->ۗ:Ljava/util/HashMap;

    return-void

    .line 2331
    :cond_0
    filled-new-array {v0, v3}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v1

    const-string v4, "Tag"

    if-eqz v1, :cond_2

    .line 2332
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 2333
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketTaggingConfigurationHandler;->ۙ:Ljava/lang/String;

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketTaggingConfigurationHandler;->۬:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 2334
    iget-object v1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketTaggingConfigurationHandler;->ۗ:Ljava/util/HashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2336
    :cond_1
    iput-object v2, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketTaggingConfigurationHandler;->ۙ:Ljava/lang/String;

    .line 2337
    iput-object v2, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketTaggingConfigurationHandler;->۬:Ljava/lang/String;

    return-void

    .line 2341
    :cond_2
    filled-new-array {v0, v3, v4}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "Key"

    .line 2342
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 2343
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketTaggingConfigurationHandler;->ۙ:Ljava/lang/String;

    return-void

    :cond_3
    const-string v0, "Value"

    .line 2344
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 2345
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketTaggingConfigurationHandler;->۬:Ljava/lang/String;

    :cond_4
    return-void
.end method
