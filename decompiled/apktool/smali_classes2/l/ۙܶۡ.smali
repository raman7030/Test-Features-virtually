.class public final Ll/ۙܶۡ;
.super Ljava/lang/Object;
.source "E9SU"


# static fields
.field public static final ֫:Ll/ܶ᩵ܿ;

.field public static final ۧ:Ll/ۧۤᩴ;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    .line 20
    sget-object v0, Ll/ܽ֡ܿ;->ܿ:Ll/ܶ᩵ܿ;

    const-string v1, "osmd"

    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    sput-object v0, Ll/ۙܶۡ;->֫:Ll/ܶ᩵ܿ;

    .line 21
    new-instance v1, Ll/ۧۤᩴ;

    invoke-direct {v1}, Ll/ۧۤᩴ;-><init>()V

    sput-object v1, Ll/ۙܶۡ;->ۧ:Ll/ۧۤᩴ;

    .line 25
    :try_start_0
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->᩵ۧ()Ll/۬ۜܽ;

    move-result-object v0

    .line 26
    iget-object v1, v0, Ll/۬ۜܽ;->᩸:[B

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 27
    :goto_0
    array-length v4, v1

    if-ge v3, v4, :cond_0

    .line 28
    aget-byte v4, v1, v3

    mul-int v5, v3, v3

    xor-int/2addr v4, v5

    int-to-byte v4, v4

    aput-byte v4, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 30
    :cond_0
    :goto_1
    invoke-virtual {v0}, Ll/۬ۜܽ;->available()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmp-long v1, v3, v5

    if-lez v1, :cond_1

    const v1, 0xa1b5

    .line 31
    invoke-static {v0, v1}, Ll/᩹ۜܽ;->֫(Ll/۬ۜܽ;I)V

    .line 32
    invoke-virtual {v0}, Ll/۬ۜܽ;->ܶ()Ljava/lang/String;

    move-result-object v1

    .line 33
    new-instance v3, Ll/᩶ܶۡ;

    invoke-direct {v3, v2}, Ll/᩶ܶۡ;-><init>(I)V

    .line 34
    invoke-virtual {v0}, Ll/۬ۜܽ;->ܶ()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v3, Ll/᩶ܶۡ;->֫:Ljava/lang/String;

    .line 35
    invoke-virtual {v0}, Ll/۬ۜܽ;->ܶ()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v3, Ll/᩶ܶۡ;->ۧ:Ljava/lang/String;

    .line 36
    sget-object v4, Ll/ۙܶۡ;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {v4, v1, v3}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_1
    return-void

    .line 39
    :catch_0
    sget-object v0, Ll/ۙܶۡ;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {v0}, Ll/ۧۤᩴ;->clear()V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫(Landroid/content/pm/PackageInfo;)Ljava/lang/String;
    .locals 4

    .line 68
    iget-object v0, p0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 69
    sget-object v1, Ll/ۙܶۡ;->ۧ:Ll/ۧۤᩴ;

    new-instance v2, Ll/᩸ܶۡ;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-static {v1, v0, v2}, Ll/ᩳۤᩴ;->computeIfAbsent(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ll/᩶ܶۡ;

    .line 80
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v2, p0, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    invoke-static {v2, v3}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ":"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/Locale;->hashCode()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 71
    iget-object v0, v1, Ll/᩶ܶۡ;->֫:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 72
    iget-object p0, v1, Ll/᩶ܶۡ;->ۧ:Ljava/lang/String;

    invoke-static {p0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0

    :cond_0
    move-object v0, v1

    .line 0
    monitor-enter v0

    .line 88
    :try_start_0
    iget-object v3, v1, Ll/᩶ܶۡ;->֫:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 89
    iget-object p0, p0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-static {}, Ll/ۙ᩸᩷;->ۘ()Landroid/content/pm/PackageManager;

    move-result-object v3

    invoke-virtual {p0, v3}, Landroid/content/pm/PackageItemInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v1, Ll/᩶ܶۡ;->ۧ:Ljava/lang/String;

    .line 90
    iput-object v2, v1, Ll/᩶ܶۡ;->֫:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 92
    :cond_1
    monitor-exit v0

    .line 75
    new-instance p0, Ll/᩹ܶۡ;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ll/᩹ܶۡ;-><init>(I)V

    const-class v0, Ll/ۙܶۡ;

    const-wide/16 v2, 0x3e8

    invoke-static {p0, v0, v2, v3}, Ll/֫ۨۡ;->֫(Ljava/lang/Runnable;Ljava/lang/Object;J)V

    .line 76
    iget-object p0, v1, Ll/᩶ܶۡ;->ۧ:Ljava/lang/String;

    return-object p0

    :catchall_0
    move-exception p0

    .line 92
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static ֫()V
    .locals 7

    .line 0
    const-class v0, Ll/ۙܶۡ;

    monitor-enter v0

    .line 44
    :try_start_0
    new-instance v1, Ll/ۤۜܽ;

    invoke-direct {v1}, Ll/ۤۜܽ;-><init>()V

    .line 45
    sget-object v2, Ll/ۙܶۡ;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {v2}, Ll/ۧۤᩴ;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 46
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 47
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩶ܶۡ;

    .line 48
    iget-object v5, v3, Ll/᩶ܶۡ;->֫:Ljava/lang/String;

    if-eqz v5, :cond_0

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    iget-object v6, v3, Ll/᩶ܶۡ;->֫:Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    add-int/2addr v5, v6

    iget-object v6, v3, Ll/᩶ܶۡ;->ۧ:Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    add-int/2addr v5, v6

    const/16 v6, 0x3e8

    if-ge v5, v6, :cond_0

    const v5, 0xa1b5

    .line 49
    invoke-virtual {v1, v5}, Ll/ۤۜܽ;->ۡ(I)V

    .line 50
    invoke-virtual {v1, v4}, Ll/ۤۜܽ;->ᩳ(Ljava/lang/String;)V

    .line 51
    iget-object v4, v3, Ll/᩶ܶۡ;->֫:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ll/ۤۜܽ;->ᩳ(Ljava/lang/String;)V

    .line 52
    iget-object v3, v3, Ll/᩶ܶۡ;->ۧ:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ll/ۤۜܽ;->ᩳ(Ljava/lang/String;)V

    goto :goto_0

    .line 55
    :cond_1
    invoke-virtual {v1}, Ll/ۤۜܽ;->ܽ()[B

    move-result-object v2

    .line 56
    invoke-virtual {v1}, Ll/ۤۜܽ;->size()I

    move-result v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v1, :cond_2

    .line 58
    aget-byte v5, v2, v4

    mul-int v6, v4, v4

    xor-int/2addr v5, v6

    int-to-byte v5, v5

    aput-byte v5, v2, v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 61
    :cond_2
    :try_start_1
    sget-object v4, Ll/ۙܶۡ;->֫:Ll/ܶ᩵ܿ;

    invoke-virtual {v4, v2, v3, v1}, Ll/ܶ᩵ܿ;->֫([BII)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 65
    :catch_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method
