.class public Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketReplicationConfigurationHandler;
.super Lcom/amazonaws/services/s3/model/transform/AbstractHandler;
.source "XmlResponsesSaxParser.java"


# instance fields
.field public ۗ:Ljava/lang/String;

.field public ۙ:Lcom/amazonaws/services/s3/model/ReplicationRule;

.field public ۬:Lcom/amazonaws/services/s3/model/ReplicationDestinationConfig;

.field public final ᩶:Lcom/amazonaws/services/s3/model/BucketReplicationConfiguration;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 2223
    invoke-direct {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;-><init>()V

    .line 2226
    new-instance v0, Lcom/amazonaws/services/s3/model/BucketReplicationConfiguration;

    invoke-direct {v0}, Lcom/amazonaws/services/s3/model/BucketReplicationConfiguration;-><init>()V

    iput-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketReplicationConfigurationHandler;->᩶:Lcom/amazonaws/services/s3/model/BucketReplicationConfiguration;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;Lorg/xml/sax/Attributes;)V
    .locals 2

    const-string p2, "ReplicationConfiguration"

    .line 2248
    filled-new-array {p2}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v0

    const-string v1, "Rule"

    if-eqz v0, :cond_0

    .line 2249
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 2250
    new-instance p1, Lcom/amazonaws/services/s3/model/ReplicationRule;

    invoke-direct {p1}, Lcom/amazonaws/services/s3/model/ReplicationRule;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketReplicationConfigurationHandler;->ۙ:Lcom/amazonaws/services/s3/model/ReplicationRule;

    return-void

    .line 2252
    :cond_0
    filled-new-array {p2, v1}, [Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_1

    const-string p2, "Destination"

    .line 2253
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 2254
    new-instance p1, Lcom/amazonaws/services/s3/model/ReplicationDestinationConfig;

    invoke-direct {p1}, Lcom/amazonaws/services/s3/model/ReplicationDestinationConfig;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketReplicationConfigurationHandler;->۬:Lcom/amazonaws/services/s3/model/ReplicationDestinationConfig;

    :cond_1
    return-void
.end method

.method public final ܳ(Ljava/lang/String;)V
    .locals 4

    const-string v0, "ReplicationConfiguration"

    .line 2261
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v1

    const-string v2, "Rule"

    if-eqz v1, :cond_1

    .line 2262
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    iget-object v1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketReplicationConfigurationHandler;->᩶:Lcom/amazonaws/services/s3/model/BucketReplicationConfiguration;

    if-eqz v0, :cond_0

    .line 2263
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketReplicationConfigurationHandler;->ۗ:Ljava/lang/String;

    iget-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketReplicationConfigurationHandler;->ۙ:Lcom/amazonaws/services/s3/model/ReplicationRule;

    invoke-virtual {v1, p1, v0}, Lcom/amazonaws/services/s3/model/BucketReplicationConfiguration;->֫(Ljava/lang/String;Lcom/amazonaws/services/s3/model/ReplicationRule;)V

    const/4 p1, 0x0

    .line 2265
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketReplicationConfigurationHandler;->ۙ:Lcom/amazonaws/services/s3/model/ReplicationRule;

    .line 2266
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketReplicationConfigurationHandler;->ۗ:Ljava/lang/String;

    .line 2267
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketReplicationConfigurationHandler;->۬:Lcom/amazonaws/services/s3/model/ReplicationDestinationConfig;

    return-void

    :cond_0
    const-string v0, "Role"

    .line 2268
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_a

    .line 2269
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 2271
    :cond_1
    filled-new-array {v0, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v1

    const-string v3, "Destination"

    if-eqz v1, :cond_7

    const-string v0, "ID"

    .line 2272
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2273
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketReplicationConfigurationHandler;->ۗ:Ljava/lang/String;

    return-void

    :cond_2
    const-string v0, "Prefix"

    .line 2274
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 2275
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketReplicationConfigurationHandler;->ۙ:Lcom/amazonaws/services/s3/model/ReplicationRule;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz v0, :cond_3

    goto :goto_0

    .line 54
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Prefix cannot be null for a replication rule"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    const-string v0, "Status"

    .line 2277
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 2278
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketReplicationConfigurationHandler;->ۙ:Lcom/amazonaws/services/s3/model/ReplicationRule;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 2280
    :cond_5
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_a

    .line 2281
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketReplicationConfigurationHandler;->ۙ:Lcom/amazonaws/services/s3/model/ReplicationRule;

    iget-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketReplicationConfigurationHandler;->۬:Lcom/amazonaws/services/s3/model/ReplicationDestinationConfig;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz v0, :cond_6

    goto :goto_0

    .line 138
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Destination cannot be null in the replication rule"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 2284
    :cond_7
    filled-new-array {v0, v2, v3}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a

    const-string v0, "Bucket"

    .line 2285
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 2286
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketReplicationConfigurationHandler;->۬:Lcom/amazonaws/services/s3/model/ReplicationDestinationConfig;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz v0, :cond_8

    goto :goto_0

    .line 49
    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Bucket name cannot be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    const-string v0, "StorageClass"

    .line 2287
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_a

    .line 2288
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$BucketReplicationConfigurationHandler;->۬:Lcom/amazonaws/services/s3/model/ReplicationDestinationConfig;

    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_a
    :goto_0
    return-void
.end method
