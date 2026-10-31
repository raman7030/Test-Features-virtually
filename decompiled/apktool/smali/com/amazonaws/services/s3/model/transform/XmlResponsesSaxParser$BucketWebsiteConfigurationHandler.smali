.class public Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketWebsiteConfigurationHandler;
.super Lcom/amazonaws/services/s3/model/transform/AbstractHandler;
.source "XmlResponsesSaxParser.java"


# instance fields
.field public ۗ:Lcom/amazonaws/services/s3/model/RedirectRule;

.field public ۙ:Lcom/amazonaws/services/s3/model/RoutingRuleCondition;

.field public ۬:Lcom/amazonaws/services/s3/model/RoutingRule;

.field public final ᩶:Lcom/amazonaws/services/s3/model/BucketWebsiteConfiguration;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1531
    invoke-direct {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;-><init>()V

    .line 1533
    new-instance v0, Lcom/amazonaws/services/s3/model/BucketWebsiteConfiguration;

    invoke-direct {v0}, Lcom/amazonaws/services/s3/model/BucketWebsiteConfiguration;-><init>()V

    iput-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketWebsiteConfigurationHandler;->᩶:Lcom/amazonaws/services/s3/model/BucketWebsiteConfiguration;

    const/4 v0, 0x0

    .line 1536
    iput-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketWebsiteConfigurationHandler;->ۙ:Lcom/amazonaws/services/s3/model/RoutingRuleCondition;

    .line 1537
    iput-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketWebsiteConfigurationHandler;->ۗ:Lcom/amazonaws/services/s3/model/RedirectRule;

    .line 1538
    iput-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketWebsiteConfigurationHandler;->۬:Lcom/amazonaws/services/s3/model/RoutingRule;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;Lorg/xml/sax/Attributes;)V
    .locals 3

    const-string p2, "WebsiteConfiguration"

    .line 1551
    filled-new-array {p2}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p2, "RedirectAllRequestsTo"

    .line 1552
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 1553
    new-instance p1, Lcom/amazonaws/services/s3/model/RedirectRule;

    invoke-direct {p1}, Lcom/amazonaws/services/s3/model/RedirectRule;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketWebsiteConfigurationHandler;->ۗ:Lcom/amazonaws/services/s3/model/RedirectRule;

    return-void

    :cond_0
    const-string v0, "RoutingRules"

    .line 1557
    filled-new-array {p2, v0}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v1

    const-string v2, "RoutingRule"

    if-eqz v1, :cond_1

    .line 1558
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 1559
    new-instance p1, Lcom/amazonaws/services/s3/model/RoutingRule;

    invoke-direct {p1}, Lcom/amazonaws/services/s3/model/RoutingRule;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketWebsiteConfigurationHandler;->۬:Lcom/amazonaws/services/s3/model/RoutingRule;

    return-void

    .line 1563
    :cond_1
    filled-new-array {p2, v0, v2}, [Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_3

    const-string p2, "Condition"

    .line 1564
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 1565
    new-instance p1, Lcom/amazonaws/services/s3/model/RoutingRuleCondition;

    invoke-direct {p1}, Lcom/amazonaws/services/s3/model/RoutingRuleCondition;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketWebsiteConfigurationHandler;->ۙ:Lcom/amazonaws/services/s3/model/RoutingRuleCondition;

    return-void

    :cond_2
    const-string p2, "Redirect"

    .line 1566
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 1567
    new-instance p1, Lcom/amazonaws/services/s3/model/RedirectRule;

    invoke-direct {p1}, Lcom/amazonaws/services/s3/model/RedirectRule;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketWebsiteConfigurationHandler;->ۗ:Lcom/amazonaws/services/s3/model/RedirectRule;

    :cond_3
    return-void
.end method

.method public final ܳ(Ljava/lang/String;)V
    .locals 8

    const-string v0, "WebsiteConfiguration"

    .line 1574
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v1

    const-string v2, "RedirectAllRequestsTo"

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketWebsiteConfigurationHandler;->᩶:Lcom/amazonaws/services/s3/model/BucketWebsiteConfiguration;

    if-eqz v1, :cond_0

    .line 1575
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_d

    .line 1576
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1577
    iput-object v3, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketWebsiteConfigurationHandler;->ۗ:Lcom/amazonaws/services/s3/model/RedirectRule;

    return-void

    :cond_0
    const-string v1, "IndexDocument"

    .line 1581
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v0, "Suffix"

    .line 1582
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_d

    .line 1583
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_1
    const-string v1, "ErrorDocument"

    .line 1587
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v0, "Key"

    .line 1588
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_d

    .line 1589
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_2
    const-string v1, "RoutingRules"

    .line 1593
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0, v5}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v5

    const-string v6, "RoutingRule"

    if-eqz v5, :cond_3

    .line 1594
    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_d

    .line 1595
    invoke-virtual {v4}, Lcom/amazonaws/services/s3/model/BucketWebsiteConfiguration;->֫()Ljava/util/LinkedList;

    move-result-object p1

    iget-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketWebsiteConfigurationHandler;->۬:Lcom/amazonaws/services/s3/model/RoutingRule;

    invoke-virtual {p1, v0}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 1596
    iput-object v3, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketWebsiteConfigurationHandler;->۬:Lcom/amazonaws/services/s3/model/RoutingRule;

    return-void

    .line 1600
    :cond_3
    filled-new-array {v0, v1, v6}, [Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v4}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v4

    const-string v5, "Redirect"

    const-string v7, "Condition"

    if-eqz v4, :cond_5

    .line 1601
    invoke-virtual {p1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1602
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketWebsiteConfigurationHandler;->۬:Lcom/amazonaws/services/s3/model/RoutingRule;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1603
    iput-object v3, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketWebsiteConfigurationHandler;->ۙ:Lcom/amazonaws/services/s3/model/RoutingRuleCondition;

    return-void

    .line 1604
    :cond_4
    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_d

    .line 1605
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketWebsiteConfigurationHandler;->۬:Lcom/amazonaws/services/s3/model/RoutingRule;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1606
    iput-object v3, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketWebsiteConfigurationHandler;->ۗ:Lcom/amazonaws/services/s3/model/RedirectRule;

    return-void

    .line 1610
    :cond_5
    filled-new-array {v0, v1, v6, v7}, [Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v3}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_7

    const-string v0, "KeyPrefixEquals"

    .line 1611
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 1612
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketWebsiteConfigurationHandler;->ۙ:Lcom/amazonaws/services/s3/model/RoutingRuleCondition;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_6
    const-string v0, "HttpErrorCodeReturnedEquals"

    .line 1613
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_d

    .line 1614
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketWebsiteConfigurationHandler;->ۙ:Lcom/amazonaws/services/s3/model/RoutingRuleCondition;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 1618
    :cond_7
    filled-new-array {v0, v2}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_8

    filled-new-array {v0, v1, v6, v5}, [Ljava/lang/String;

    move-result-object v0

    .line 1619
    invoke-virtual {p0, v0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_d

    :cond_8
    const-string v0, "Protocol"

    .line 1621
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 1622
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketWebsiteConfigurationHandler;->ۗ:Lcom/amazonaws/services/s3/model/RedirectRule;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_9
    const-string v0, "HostName"

    .line 1624
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 1625
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketWebsiteConfigurationHandler;->ۗ:Lcom/amazonaws/services/s3/model/RedirectRule;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_a
    const-string v0, "ReplaceKeyPrefixWith"

    .line 1627
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 1628
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketWebsiteConfigurationHandler;->ۗ:Lcom/amazonaws/services/s3/model/RedirectRule;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_b
    const-string v0, "ReplaceKeyWith"

    .line 1630
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 1631
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketWebsiteConfigurationHandler;->ۗ:Lcom/amazonaws/services/s3/model/RedirectRule;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_c
    const-string v0, "HttpRedirectCode"

    .line 1633
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_d

    .line 1634
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketWebsiteConfigurationHandler;->ۗ:Lcom/amazonaws/services/s3/model/RedirectRule;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_d
    return-void
.end method
