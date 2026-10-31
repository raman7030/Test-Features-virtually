.class public abstract Ll/᩵᩷᩵;
.super Ll/᩹᩷᩵;
.source "C9Z9"


# static fields
.field public static ᩴ:Ll/֫᩻֨;


# instance fields
.field public ۘ:Ljava/net/InetAddress;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 294
    const-class v0, Ll/᩵᩷᩵;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/String;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/᩵᩷᩵;->ᩴ:Ll/֫᩻֨;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ll/ۨۢ᩵;Ll/ۛۢ᩵;ZILjava/net/InetAddress;)V
    .locals 0

    .line 299
    invoke-direct/range {p0 .. p5}, Ll/᩹᩷᩵;-><init>(Ljava/lang/String;Ll/ۨۢ᩵;Ll/ۛۢ᩵;ZI)V

    .line 300
    iput-object p6, p0, Ll/᩵᩷᩵;->ۘ:Ljava/net/InetAddress;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ll/ۨۢ᩵;Ll/ۛۢ᩵;ZI[B)V
    .locals 0

    .line 304
    invoke-direct/range {p0 .. p5}, Ll/᩹᩷᩵;-><init>(Ljava/lang/String;Ll/ۨۢ᩵;Ll/ۛۢ᩵;ZI)V

    .line 306
    :try_start_0
    invoke-static {p6}, Ljava/net/InetAddress;->getByAddress([B)Ljava/net/InetAddress;

    move-result-object p1

    iput-object p1, p0, Ll/᩵᩷᩵;->ۘ:Ljava/net/InetAddress;
    :try_end_0
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 308
    sget-object p2, Ll/᩵᩷᩵;->ᩴ:Ll/֫᩻֨;

    const-string p3, "Address() exception "

    invoke-interface {p2, p3, p1}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۡۢ᩵;)Ll/ܶۢ᩵;
    .locals 4

    const/4 v0, 0x0

    .line 442
    invoke-virtual {p0, v0}, Ll/᩵᩷᩵;->֫(Z)Ll/᩶ۢ᩵;

    move-result-object v0

    .line 443
    invoke-virtual {v0, p1}, Ll/᩶ۢ᩵;->֫(Ll/ۡۢ᩵;)V

    .line 444
    new-instance v1, Ll/ܶۢ᩵;

    invoke-virtual {v0}, Ll/᩶ۢ᩵;->֨()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Ll/᩶ۢ᩵;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, p1, v2, v3, v0}, Ll/ܶۢ᩵;-><init>(Ll/ۡۢ᩵;Ljava/lang/String;Ljava/lang/String;Ll/ۤۜ᩵;)V

    return-object v1
.end method

.method public ֫(Z)Ll/᩶ۢ᩵;
    .locals 8

    .line 431
    new-instance v7, Ll/᩶ۢ᩵;

    .line 168
    iget-object v0, p0, Ll/ܰۜ᩵;->ᩳ:Ljava/util/HashMap;

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, v7

    move v5, p1

    .line 431
    invoke-direct/range {v0 .. v6}, Ll/᩶ۢ᩵;-><init>(Ljava/util/Map;IIIZ[B)V

    return-object v7
.end method

.method public final ֫(Ljava/io/DataOutputStream;)V
    .locals 3

    .line 354
    invoke-super {p0, p1}, Ll/ܰۜ᩵;->֫(Ljava/io/DataOutputStream;)V

    .line 346
    iget-object v0, p0, Ll/᩵᩷᩵;->ۘ:Ljava/net/InetAddress;

    .line 355
    invoke-virtual {v0}, Ljava/net/InetAddress;->getAddress()[B

    move-result-object v0

    const/4 v1, 0x0

    .line 356
    :goto_0
    array-length v2, v0

    if-ge v1, v2, :cond_0

    .line 357
    aget-byte v2, v0, v1

    invoke-virtual {p1, v2}, Ljava/io/DataOutputStream;->writeByte(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫(Ljava/lang/StringBuilder;)V
    .locals 1

    .line 453
    invoke-super {p0, p1}, Ll/᩹᩷᩵;->֫(Ljava/lang/StringBuilder;)V

    const-string v0, " address: \'"

    .line 454
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 455
    iget-object v0, p0, Ll/᩵᩷᩵;->ۘ:Ljava/net/InetAddress;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, "null"

    :goto_0
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x27

    .line 456
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final ۧ(Ll/ۡۢ᩵;)Z
    .locals 5

    .line 366
    invoke-virtual {p1}, Ll/ۡۢ᩵;->ۙ()Ll/۟᩷᩵;

    move-result-object v0

    invoke-virtual {v0, p0}, Ll/۟᩷᩵;->֫(Ll/᩵᩷᩵;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 367
    invoke-virtual {p1}, Ll/ۡۢ᩵;->ۙ()Ll/۟᩷᩵;

    move-result-object v0

    invoke-virtual {p0}, Ll/ܰۜ᩵;->ᩳ()Ll/ۨۢ᩵;

    move-result-object v2

    invoke-virtual {p0}, Ll/ܰۜ᩵;->᩷()Z

    move-result v3

    sget v4, Ll/۬ۢ᩵;->ۧ:I

    invoke-virtual {v0, v2, v3, v4}, Ll/۟᩷᩵;->֫(Ll/ۨۢ᩵;ZI)Ll/᩵᩷᩵;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 369
    invoke-virtual {p0, v0}, Ll/ܰۜ᩵;->֫(Ll/᩹᩷᩵;)I

    move-result v0

    .line 371
    sget-object v2, Ll/᩵᩷᩵;->ᩴ:Ll/֫᩻֨;

    if-nez v0, :cond_0

    const-string p1, "handleQuery() Ignoring an identical address query"

    .line 376
    invoke-interface {v2, p1}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    return v1

    :cond_0
    const-string v1, "handleQuery() Conflicting query detected."

    .line 380
    invoke-interface {v2, v1}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 382
    invoke-virtual {p1}, Ll/ۡۢ᩵;->ܿ֫()Z

    move-result v1

    if-eqz v1, :cond_1

    if-lez v0, :cond_1

    .line 384
    invoke-virtual {p1}, Ll/ۡۢ᩵;->ۙ()Ll/۟᩷᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/۟᩷᩵;->ܽ()V

    .line 385
    invoke-virtual {p1}, Ll/ۡۢ᩵;->ܶ()Ll/᩺ۜ᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۧۤᩴ;->clear()V

    .line 386
    invoke-virtual {p1}, Ll/ۡۢ᩵;->۬()Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    check-cast v0, Ll/ۧۤᩴ;

    invoke-virtual {v0}, Ll/ۧۤᩴ;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۤۜ᩵;

    .line 387
    check-cast v1, Ll/᩶ۢ᩵;

    .line 388
    invoke-virtual {v1}, Ll/᩶ۢ᩵;->֫֫()V

    goto :goto_0

    .line 391
    :cond_1
    invoke-virtual {p1}, Ll/ۡۢ᩵;->᩻֫()V

    const/4 p1, 0x1

    return p1

    :cond_2
    return v1
.end method

.method public final ܽ(Ll/ۡۢ᩵;)Z
    .locals 2

    .line 403
    invoke-virtual {p1}, Ll/ۡۢ᩵;->ۙ()Ll/۟᩷᩵;

    move-result-object v0

    invoke-virtual {v0, p0}, Ll/۟᩷᩵;->֫(Ll/᩵᩷᩵;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 404
    sget-object v0, Ll/᩵᩷᩵;->ᩴ:Ll/֫᩻֨;

    const-string v1, "handleResponse() Denial detected"

    invoke-interface {v0, v1}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 406
    invoke-virtual {p1}, Ll/ۡۢ᩵;->ܿ֫()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 407
    invoke-virtual {p1}, Ll/ۡۢ᩵;->ۙ()Ll/۟᩷᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/۟᩷᩵;->ܽ()V

    .line 408
    invoke-virtual {p1}, Ll/ۡۢ᩵;->ܶ()Ll/᩺ۜ᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۧۤᩴ;->clear()V

    .line 409
    invoke-virtual {p1}, Ll/ۡۢ᩵;->۬()Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    check-cast v0, Ll/ۧۤᩴ;

    invoke-virtual {v0}, Ll/ۧۤᩴ;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۤۜ᩵;

    .line 410
    check-cast v1, Ll/᩶ۢ᩵;

    .line 411
    invoke-virtual {v1}, Ll/᩶ۢ᩵;->֫֫()V

    goto :goto_0

    .line 414
    :cond_0
    invoke-virtual {p1}, Ll/ۡۢ᩵;->᩻֫()V

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final ܽ(Ll/᩹᩷᩵;)Z
    .locals 3

    const/4 v0, 0x0

    .line 326
    :try_start_0
    instance-of v1, p1, Ll/᩵᩷᩵;

    if-nez v1, :cond_0

    goto :goto_0

    .line 329
    :cond_0
    check-cast p1, Ll/᩵᩷᩵;

    iget-object p1, p1, Ll/᩵᩷᩵;->ۘ:Ljava/net/InetAddress;

    .line 346
    iget-object v1, p0, Ll/᩵᩷᩵;->ۘ:Ljava/net/InetAddress;

    if-nez v1, :cond_1

    if-eqz p1, :cond_1

    :goto_0
    return v0

    .line 333
    :cond_1
    invoke-virtual {v1, p1}, Ljava/net/InetAddress;->equals(Ljava/lang/Object;)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    .line 335
    sget-object v1, Ll/᩵᩷᩵;->ᩴ:Ll/֫᩻֨;

    const-string v2, "Failed to compare addresses of DNSRecords"

    invoke-interface {v1, v2, p1}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;Ljava/lang/Exception;)V

    return v0
.end method

.method public final ᩴ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
