.class public Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$DeleteObjectsHandler;
.super Lcom/amazonaws/services/s3/model/transform/AbstractHandler;
.source "XmlResponsesSaxParser.java"


# instance fields
.field public final ۗ:Lcom/amazonaws/services/s3/internal/DeleteObjectsResponse;

.field public ۙ:Lcom/amazonaws/services/s3/model/MultiObjectDeleteException$DeleteError;

.field public ᩶:Lcom/amazonaws/services/s3/model/DeleteObjectsResult$DeletedObject;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 2443
    invoke-direct {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;-><init>()V

    .line 2445
    new-instance v0, Lcom/amazonaws/services/s3/internal/DeleteObjectsResponse;

    invoke-direct {v0}, Lcom/amazonaws/services/s3/internal/DeleteObjectsResponse;-><init>()V

    iput-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$DeleteObjectsHandler;->ۗ:Lcom/amazonaws/services/s3/internal/DeleteObjectsResponse;

    const/4 v0, 0x0

    .line 2448
    iput-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$DeleteObjectsHandler;->᩶:Lcom/amazonaws/services/s3/model/DeleteObjectsResult$DeletedObject;

    .line 2449
    iput-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$DeleteObjectsHandler;->ۙ:Lcom/amazonaws/services/s3/model/MultiObjectDeleteException$DeleteError;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;Lorg/xml/sax/Attributes;)V
    .locals 0

    const-string p2, "DeleteResult"

    .line 2462
    filled-new-array {p2}, [Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_1

    const-string p2, "Deleted"

    .line 2463
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 2464
    new-instance p1, Lcom/amazonaws/services/s3/model/DeleteObjectsResult$DeletedObject;

    invoke-direct {p1}, Lcom/amazonaws/services/s3/model/DeleteObjectsResult$DeletedObject;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$DeleteObjectsHandler;->᩶:Lcom/amazonaws/services/s3/model/DeleteObjectsResult$DeletedObject;

    return-void

    :cond_0
    const-string p2, "Error"

    .line 2465
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 2466
    new-instance p1, Lcom/amazonaws/services/s3/model/MultiObjectDeleteException$DeleteError;

    invoke-direct {p1}, Lcom/amazonaws/services/s3/model/MultiObjectDeleteException$DeleteError;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$DeleteObjectsHandler;->ۙ:Lcom/amazonaws/services/s3/model/MultiObjectDeleteException$DeleteError;

    :cond_1
    return-void
.end method

.method public final ܳ(Ljava/lang/String;)V
    .locals 5

    const-string v0, "DeleteResult"

    .line 2473
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v1

    const-string v2, "Error"

    const-string v3, "Deleted"

    if-eqz v1, :cond_1

    .line 2474
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    iget-object v3, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$DeleteObjectsHandler;->ۗ:Lcom/amazonaws/services/s3/internal/DeleteObjectsResponse;

    if-eqz v0, :cond_0

    .line 2475
    invoke-virtual {v3}, Lcom/amazonaws/services/s3/internal/DeleteObjectsResponse;->֫()Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$DeleteObjectsHandler;->᩶:Lcom/amazonaws/services/s3/model/DeleteObjectsResult$DeletedObject;

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2476
    iput-object v1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$DeleteObjectsHandler;->᩶:Lcom/amazonaws/services/s3/model/DeleteObjectsResult$DeletedObject;

    return-void

    .line 2477
    :cond_0
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    .line 2478
    invoke-virtual {v3}, Lcom/amazonaws/services/s3/internal/DeleteObjectsResponse;->ۧ()Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$DeleteObjectsHandler;->ۙ:Lcom/amazonaws/services/s3/model/MultiObjectDeleteException$DeleteError;

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2479
    iput-object v1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$DeleteObjectsHandler;->ۙ:Lcom/amazonaws/services/s3/model/MultiObjectDeleteException$DeleteError;

    return-void

    .line 2483
    :cond_1
    filled-new-array {v0, v3}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v1

    const-string v3, "VersionId"

    const-string v4, "Key"

    if-eqz v1, :cond_5

    .line 2484
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2485
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$DeleteObjectsHandler;->᩶:Lcom/amazonaws/services/s3/model/DeleteObjectsResult$DeletedObject;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 2487
    :cond_2
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 2488
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$DeleteObjectsHandler;->᩶:Lcom/amazonaws/services/s3/model/DeleteObjectsResult$DeletedObject;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_3
    const-string v0, "DeleteMarker"

    .line 2490
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 2491
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$DeleteObjectsHandler;->᩶:Lcom/amazonaws/services/s3/model/DeleteObjectsResult$DeletedObject;

    .line 2492
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object v0

    const-string v1, "true"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2491
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_4
    const-string v0, "DeleteMarkerVersionId"

    .line 2494
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    .line 2495
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$DeleteObjectsHandler;->᩶:Lcom/amazonaws/services/s3/model/DeleteObjectsResult$DeletedObject;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 2499
    :cond_5
    filled-new-array {v0, v2}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 2500
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 2501
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$DeleteObjectsHandler;->ۙ:Lcom/amazonaws/services/s3/model/MultiObjectDeleteException$DeleteError;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/amazonaws/services/s3/model/MultiObjectDeleteException$DeleteError;->֫(Ljava/lang/String;)V

    return-void

    .line 2503
    :cond_6
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 2504
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$DeleteObjectsHandler;->ۙ:Lcom/amazonaws/services/s3/model/MultiObjectDeleteException$DeleteError;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_7
    const-string v0, "Code"

    .line 2506
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 2507
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$DeleteObjectsHandler;->ۙ:Lcom/amazonaws/services/s3/model/MultiObjectDeleteException$DeleteError;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_8
    const-string v0, "Message"

    .line 2509
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    .line 2510
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$DeleteObjectsHandler;->ۙ:Lcom/amazonaws/services/s3/model/MultiObjectDeleteException$DeleteError;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_9
    return-void
.end method

.method public final ܽ()Lcom/amazonaws/services/s3/internal/DeleteObjectsResponse;
    .locals 1

    .line 2452
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$DeleteObjectsHandler;->ۗ:Lcom/amazonaws/services/s3/internal/DeleteObjectsResponse;

    return-object v0
.end method
