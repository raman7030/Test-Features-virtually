.class public Lcom/amazonaws/services/s3/model/ObjectMetadata;
.super Ljava/lang/Object;
.source "ObjectMetadata.java"

# interfaces
.implements Lcom/amazonaws/services/s3/internal/ServerSideEncryptionResult;
.implements Lcom/amazonaws/services/s3/internal/S3RequesterChargedResult;
.implements Lcom/amazonaws/services/s3/internal/ObjectExpirationResult;
.implements Lcom/amazonaws/services/s3/internal/ObjectRestoreResult;
.implements Ljava/lang/Cloneable;
.implements Ljava/io/Serializable;


# static fields
.field public static final ۬:Ljava/lang/String;


# instance fields
.field public ۗ:Ljava/util/Map;

.field public ۙ:Ljava/util/Date;

.field public ᩶:Ljava/util/TreeMap;

.field public ᩸:Ljava/util/Date;

.field public ᩹:Ljava/util/Date;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 61
    sget-object v0, Lcom/amazonaws/services/s3/model/SSEAlgorithm;->᩶:Lcom/amazonaws/services/s3/model/SSEAlgorithm;

    .line 62
    invoke-virtual {v0}, Lcom/amazonaws/services/s3/model/SSEAlgorithm;->getAlgorithm()Ljava/lang/String;

    .line 64
    sget-object v0, Lcom/amazonaws/services/s3/model/SSEAlgorithm;->ۙ:Lcom/amazonaws/services/s3/model/SSEAlgorithm;

    invoke-virtual {v0}, Lcom/amazonaws/services/s3/model/SSEAlgorithm;->getAlgorithm()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/amazonaws/services/s3/model/ObjectMetadata;->۬:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 97
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    new-instance v0, Ljava/util/TreeMap;

    sget-object v1, Ljava/lang/String;->CASE_INSENSITIVE_ORDER:Ljava/util/Comparator;

    invoke-direct {v0, v1}, Ljava/util/TreeMap;-><init>(Ljava/util/Comparator;)V

    iput-object v0, p0, Lcom/amazonaws/services/s3/model/ObjectMetadata;->ۗ:Ljava/util/Map;

    .line 59
    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0, v1}, Ljava/util/TreeMap;-><init>(Ljava/util/Comparator;)V

    iput-object v0, p0, Lcom/amazonaws/services/s3/model/ObjectMetadata;->᩶:Ljava/util/TreeMap;

    return-void
.end method


# virtual methods
.method public final clone()Lcom/amazonaws/services/s3/model/ObjectMetadata;
    .locals 5

    .line 867
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/ObjectMetadata;->᩶:Ljava/util/TreeMap;

    new-instance v1, Lcom/amazonaws/services/s3/model/ObjectMetadata;

    .line 99
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 53
    new-instance v2, Ljava/util/TreeMap;

    sget-object v3, Ljava/lang/String;->CASE_INSENSITIVE_ORDER:Ljava/util/Comparator;

    invoke-direct {v2, v3}, Ljava/util/TreeMap;-><init>(Ljava/util/Comparator;)V

    iput-object v2, v1, Lcom/amazonaws/services/s3/model/ObjectMetadata;->ۗ:Ljava/util/Map;

    .line 59
    new-instance v2, Ljava/util/TreeMap;

    invoke-direct {v2, v3}, Ljava/util/TreeMap;-><init>(Ljava/util/Comparator;)V

    iput-object v2, v1, Lcom/amazonaws/services/s3/model/ObjectMetadata;->᩶:Ljava/util/TreeMap;

    .line 100
    iget-object v2, p0, Lcom/amazonaws/services/s3/model/ObjectMetadata;->ۗ:Ljava/util/Map;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move-object v2, v3

    goto :goto_0

    :cond_0
    new-instance v2, Ljava/util/TreeMap;

    iget-object v4, p0, Lcom/amazonaws/services/s3/model/ObjectMetadata;->ۗ:Ljava/util/Map;

    invoke-direct {v2, v4}, Ljava/util/TreeMap;-><init>(Ljava/util/Map;)V

    :goto_0
    iput-object v2, v1, Lcom/amazonaws/services/s3/model/ObjectMetadata;->ۗ:Ljava/util/Map;

    if-nez v0, :cond_1

    goto :goto_1

    .line 104
    :cond_1
    new-instance v3, Ljava/util/TreeMap;

    invoke-direct {v3, v0}, Ljava/util/TreeMap;-><init>(Ljava/util/Map;)V

    :goto_1
    iput-object v3, v1, Lcom/amazonaws/services/s3/model/ObjectMetadata;->᩶:Ljava/util/TreeMap;

    .line 107
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/ObjectMetadata;->᩸:Ljava/util/Date;

    invoke-static {v0}, Lcom/amazonaws/util/DateUtils;->֫(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, v1, Lcom/amazonaws/services/s3/model/ObjectMetadata;->᩸:Ljava/util/Date;

    .line 109
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/ObjectMetadata;->᩹:Ljava/util/Date;

    invoke-static {v0}, Lcom/amazonaws/util/DateUtils;->֫(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, v1, Lcom/amazonaws/services/s3/model/ObjectMetadata;->᩹:Ljava/util/Date;

    .line 111
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/ObjectMetadata;->ۙ:Ljava/util/Date;

    invoke-static {v0}, Lcom/amazonaws/util/DateUtils;->֫(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, v1, Lcom/amazonaws/services/s3/model/ObjectMetadata;->ۙ:Ljava/util/Date;

    return-object v1
.end method

.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 39
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/ObjectMetadata;->clone()Lcom/amazonaws/services/s3/model/ObjectMetadata;

    move-result-object v0

    return-object v0
.end method

.method public final ֡()Ljava/lang/String;
    .locals 2

    .line 657
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/ObjectMetadata;->᩶:Ljava/util/TreeMap;

    const-string v1, "x-amz-version-id"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final ֫()J
    .locals 2

    .line 291
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/ObjectMetadata;->᩶:Ljava/util/TreeMap;

    const-string v1, "Content-Length"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 296
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ֫(J)V
    .locals 2

    .line 339
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/ObjectMetadata;->᩶:Ljava/util/TreeMap;

    const-string v1, "Content-Length"

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ֫(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1

    .line 189
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/ObjectMetadata;->᩶:Ljava/util/TreeMap;

    invoke-interface {v0, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 2

    .line 523
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/ObjectMetadata;->᩶:Ljava/util/TreeMap;

    const-string v1, "Cache-Control"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 220
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/ObjectMetadata;->ۗ:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ֫(Ljava/util/Date;)V
    .locals 0

    .line 751
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/ObjectMetadata;->᩸:Ljava/util/Date;

    return-void
.end method

.method public final ֫(Ljava/util/Map;)V
    .locals 0

    .line 178
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/ObjectMetadata;->ۗ:Ljava/util/Map;

    return-void
.end method

.method public final ֫(Z)V
    .locals 2

    if-eqz p1, :cond_0

    .line 887
    iget-object p1, p0, Lcom/amazonaws/services/s3/model/ObjectMetadata;->᩶:Ljava/util/TreeMap;

    const-string v0, "x-amz-request-charged"

    const-string v1, "requester"

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final ۖ()Ljava/lang/String;
    .locals 2

    .line 702
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/ObjectMetadata;->᩶:Ljava/util/TreeMap;

    const-string v1, "x-amz-server-side-encryption-customer-algorithm"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final ۘ()Ljava/lang/String;
    .locals 2

    .line 720
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/ObjectMetadata;->᩶:Ljava/util/TreeMap;

    const-string v1, "x-amz-server-side-encryption-customer-key-MD5"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final ۚ()Z
    .locals 2

    .line 881
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/ObjectMetadata;->᩶:Ljava/util/TreeMap;

    const-string v1, "x-amz-request-charged"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۜ()Ljava/util/Date;
    .locals 1

    .line 828
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/ObjectMetadata;->᩹:Ljava/util/Date;

    invoke-static {v0}, Lcom/amazonaws/util/DateUtils;->֫(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    return-object v0
.end method

.method public final ۜ(Ljava/lang/String;)V
    .locals 2

    .line 550
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/ObjectMetadata;->᩶:Ljava/util/TreeMap;

    const-string v1, "Content-MD5"

    if-nez p1, :cond_0

    .line 551
    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 553
    :cond_0
    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ۡ()Ljava/lang/Object;
    .locals 2

    const-string v0, "Content-Length"

    .line 240
    iget-object v1, p0, Lcom/amazonaws/services/s3/model/ObjectMetadata;->᩶:Ljava/util/TreeMap;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final ۢ()Ljava/util/Map;
    .locals 2

    .line 230
    new-instance v0, Ljava/util/TreeMap;

    sget-object v1, Ljava/lang/String;->CASE_INSENSITIVE_ORDER:Ljava/util/Comparator;

    invoke-direct {v0, v1}, Ljava/util/TreeMap;-><init>(Ljava/util/Comparator;)V

    .line 231
    iget-object v1, p0, Lcom/amazonaws/services/s3/model/ObjectMetadata;->᩶:Ljava/util/TreeMap;

    invoke-virtual {v0, v1}, Ljava/util/TreeMap;->putAll(Ljava/util/Map;)V

    .line 232
    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 2

    .line 712
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/ObjectMetadata;->᩶:Ljava/util/TreeMap;

    const-string v1, "x-amz-server-side-encryption-customer-algorithm"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ۧ(Ljava/util/Date;)V
    .locals 0

    .line 795
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/ObjectMetadata;->ۙ:Ljava/util/Date;

    return-void
.end method

.method public final ܳ()Ljava/util/Date;
    .locals 1

    .line 739
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/ObjectMetadata;->᩸:Ljava/util/Date;

    invoke-static {v0}, Lcom/amazonaws/util/DateUtils;->֫(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    return-object v0
.end method

.method public final ܳ(Ljava/lang/String;)V
    .locals 2

    .line 602
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/ObjectMetadata;->᩶:Ljava/util/TreeMap;

    const-string v1, "Content-Disposition"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ܺ()Ljava/lang/String;
    .locals 2

    .line 666
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/ObjectMetadata;->᩶:Ljava/util/TreeMap;

    const-string v1, "x-amz-server-side-encryption"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 2

    .line 582
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/ObjectMetadata;->᩶:Ljava/util/TreeMap;

    const-string v1, "Content-MD5"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final ܽ(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final ܽ(Ljava/util/Date;)V
    .locals 0

    .line 821
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/ObjectMetadata;->᩹:Ljava/util/Date;

    return-void
.end method

.method public final ܽ(Z)V
    .locals 0

    return-void
.end method

.method public final ܿ()Ljava/lang/String;
    .locals 2

    .line 646
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/ObjectMetadata;->᩶:Ljava/util/TreeMap;

    const-string v1, "ETag"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final ܿ(Ljava/lang/String;)V
    .locals 2

    .line 730
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/ObjectMetadata;->᩶:Ljava/util/TreeMap;

    const-string v1, "x-amz-server-side-encryption-customer-key-MD5"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 2

    .line 368
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/ObjectMetadata;->᩶:Ljava/util/TreeMap;

    const-string v1, "Content-Type"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final ᩳ(Ljava/lang/String;)V
    .locals 2

    .line 686
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/ObjectMetadata;->᩶:Ljava/util/TreeMap;

    const-string v1, "x-amz-server-side-encryption"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ᩵()Ljava/util/Map;
    .locals 1

    .line 144
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/ObjectMetadata;->ۗ:Ljava/util/Map;

    return-object v0
.end method

.method public final ᩷()J
    .locals 2

    .line 306
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/ObjectMetadata;->᩶:Ljava/util/TreeMap;

    const-string v1, "Content-Range"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_0

    const-string v1, "/"

    .line 308
    invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v1

    if-ltz v1, :cond_0

    add-int/lit8 v1, v1, 0x1

    .line 310
    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0

    .line 313
    :cond_0
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/ObjectMetadata;->֫()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ᩷(Ljava/lang/String;)V
    .locals 2

    .line 396
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/ObjectMetadata;->᩶:Ljava/util/TreeMap;

    const-string v1, "Content-Type"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ᩻(Ljava/lang/String;)V
    .locals 2

    .line 484
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/ObjectMetadata;->᩶:Ljava/util/TreeMap;

    const-string v1, "Content-Encoding"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
