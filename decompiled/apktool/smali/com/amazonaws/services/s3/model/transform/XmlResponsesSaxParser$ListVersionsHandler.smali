.class public Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListVersionsHandler;
.super Lcom/amazonaws/services/s3/model/transform/AbstractHandler;
.source "XmlResponsesSaxParser.java"


# instance fields
.field public ᩶:Lcom/amazonaws/services/s3/model/Owner;


# virtual methods
.method public final ֫(Ljava/lang/String;Lorg/xml/sax/Attributes;)V
    .locals 3

    const-string p2, "ListVersionsResult"

    .line 1403
    filled-new-array {p2}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v0

    const-string v1, "DeleteMarker"

    const-string v2, "Version"

    if-eqz v0, :cond_2

    .line 1404
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    const/4 v0, 0x0

    if-nez p2, :cond_1

    .line 1409
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 1410
    :cond_0
    new-instance p1, Lcom/amazonaws/services/s3/model/S3VersionSummary;

    invoke-direct {p1}, Lcom/amazonaws/services/s3/model/S3VersionSummary;-><init>()V

    .line 1412
    throw v0

    .line 1405
    :cond_1
    new-instance p1, Lcom/amazonaws/services/s3/model/S3VersionSummary;

    invoke-direct {p1}, Lcom/amazonaws/services/s3/model/S3VersionSummary;-><init>()V

    .line 1407
    throw v0

    .line 1417
    :cond_2
    filled-new-array {p2, v2}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    filled-new-array {p2, v1}, [Ljava/lang/String;

    move-result-object p2

    .line 1418
    invoke-virtual {p0, p2}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_4

    :cond_3
    const-string p2, "Owner"

    .line 1419
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 1420
    new-instance p1, Lcom/amazonaws/services/s3/model/Owner;

    invoke-direct {p1}, Lcom/amazonaws/services/s3/model/Owner;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListVersionsHandler;->᩶:Lcom/amazonaws/services/s3/model/Owner;

    :cond_4
    :goto_0
    return-void
.end method

.method public final ܳ(Ljava/lang/String;)V
    .locals 7

    const-string v0, "ListVersionsResult"

    .line 1431
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v1

    const-string v2, "true"

    const-string v3, "Prefix"

    const-string v4, "DeleteMarker"

    const-string v5, "Version"

    const/4 v6, 0x0

    if-eqz v1, :cond_b

    const-string v0, "Name"

    .line 1432
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    .line 1435
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    const-string v0, "KeyMarker"

    .line 1439
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    const-string v0, "VersionIdMarker"

    .line 1443
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    const-string v0, "MaxKeys"

    .line 1447
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    const-string v0, "Delimiter"

    .line 1450
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, "EncodingType"

    .line 1454
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "NextKeyMarker"

    .line 1457
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "NextVersionIdMarker"

    .line 1461
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "IsTruncated"

    .line 1464
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1467
    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1468
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto/16 :goto_1

    .line 1470
    :cond_0
    throw v6

    .line 1465
    :cond_1
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    throw v6

    .line 1462
    :cond_2
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    throw v6

    .line 1459
    :cond_3
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    sget p1, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser;->ۧ:I

    .line 1458
    throw v6

    .line 1455
    :cond_4
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    sget p1, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser;->ۧ:I

    throw v6

    .line 1451
    :cond_5
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    sget p1, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser;->ۧ:I

    throw v6

    .line 1448
    :cond_6
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    throw v6

    .line 1445
    :cond_7
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    .line 1444
    sget p1, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser;->ۧ:I

    throw v6

    .line 1440
    :cond_8
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    sget p1, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser;->ۧ:I

    throw v6

    .line 1436
    :cond_9
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    sget p1, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser;->ۧ:I

    throw v6

    .line 1433
    :cond_a
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    throw v6

    :cond_b
    const-string v1, "CommonPrefixes"

    .line 1477
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_d

    .line 1478
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    goto/16 :goto_1

    .line 1479
    :cond_c
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    sget p1, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser;->ۧ:I

    .line 1480
    throw v6

    .line 1485
    :cond_d
    filled-new-array {v0, v5}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v1

    const-string v3, "Owner"

    if-nez v1, :cond_11

    filled-new-array {v0, v4}, [Ljava/lang/String;

    move-result-object v1

    .line 1486
    invoke-virtual {p0, v1}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_e

    goto :goto_0

    .line 1519
    :cond_e
    filled-new-array {v0, v5, v3}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_f

    filled-new-array {v0, v4, v3}, [Ljava/lang/String;

    move-result-object v0

    .line 1520
    invoke-virtual {p0, v0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_19

    :cond_f
    const-string v0, "ID"

    .line 1522
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 1523
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListVersionsHandler;->᩶:Lcom/amazonaws/services/s3/model/Owner;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/amazonaws/services/s3/model/Owner;->ۧ(Ljava/lang/String;)V

    return-void

    :cond_10
    const-string v0, "DisplayName"

    .line 1524
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_19

    .line 1525
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListVersionsHandler;->᩶:Lcom/amazonaws/services/s3/model/Owner;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/amazonaws/services/s3/model/Owner;->֫(Ljava/lang/String;)V

    return-void

    :cond_11
    :goto_0
    const-string v0, "Key"

    .line 1488
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_12

    .line 1489
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    .line 1491
    sget p1, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser;->ۧ:I

    return-void

    :cond_12
    const-string v0, "VersionId"

    .line 1493
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_13

    .line 1494
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    return-void

    :cond_13
    const-string v0, "IsLatest"

    .line 1496
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_14

    .line 1497
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    return-void

    :cond_14
    const-string v0, "LastModified"

    .line 1499
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_15

    .line 1501
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object p1

    sget v0, Lcom/amazonaws/services/s3/internal/ServiceUtils;->֫:I

    .line 79
    invoke-static {p1}, Lcom/amazonaws/util/DateUtils;->ۧ(Ljava/lang/String;)Ljava/util/Date;

    return-void

    :cond_15
    const-string v0, "ETag"

    .line 1503
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_16

    .line 1505
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/amazonaws/services/s3/internal/ServiceUtils;->֫(Ljava/lang/String;)Ljava/lang/String;

    return-void

    :cond_16
    const-string v0, "Size"

    .line 1507
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_17

    .line 1508
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    return-void

    .line 1510
    :cond_17
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_18

    .line 1512
    iput-object v6, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$ListVersionsHandler;->᩶:Lcom/amazonaws/services/s3/model/Owner;

    return-void

    :cond_18
    const-string v0, "StorageClass"

    .line 1514
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_19

    .line 1515
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    :cond_19
    :goto_1
    return-void
.end method
