.class public Lorg/bouncycastle/asn1/LocaleUtil;
.super Ljava/lang/Object;


# static fields
.field public static EN_Locale:Ljava/util/Locale;

.field public static final localeCache:Ljava/util/Map;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lorg/bouncycastle/asn1/LocaleUtil;->localeCache:Ljava/util/Map;

    invoke-static {}, Lorg/bouncycastle/asn1/LocaleUtil;->forEN()Ljava/util/Locale;

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/asn1/LocaleUtil;->EN_Locale:Ljava/util/Locale;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static epochAdjust(Ljava/util/Date;)Ljava/util/Date;
    .locals 7

    .line 0
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    if-nez v1, :cond_0

    return-object p0

    :cond_0
    sget-object v2, Lorg/bouncycastle/asn1/LocaleUtil;->localeCache:Ljava/util/Map;

    move-object v0, v2

    monitor-enter v0

    :try_start_0
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    if-nez v3, :cond_1

    new-instance v3, Ljava/text/SimpleDateFormat;

    const-string v4, "yyyyMMddHHmmssz"

    invoke-direct {v3, v4}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    const-string v4, "19700101000000GMT+00:00"

    invoke-virtual {v3, v4}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v3, v4}, Lorg/bouncycastle/asn1/LocaleUtil;->longValueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-interface {v2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    const-wide/16 v4, 0x0

    cmp-long v6, v1, v4

    if-eqz v6, :cond_2

    new-instance v1, Ljava/util/Date;

    invoke-virtual {p0}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    sub-long/2addr v4, v2

    invoke-direct {v1, v4, v5}, Ljava/util/Date;-><init>(J)V

    monitor-exit v0

    return-object v1

    :cond_2
    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static forEN()Ljava/util/Locale;
    .locals 4

    .line 0
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    const-string v1, "en"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-static {}, Ljava/util/Locale;->getAvailableLocales()[Ljava/util/Locale;

    move-result-object v0

    const/4 v2, 0x0

    :goto_0
    array-length v3, v0

    if-eq v2, v3, :cond_2

    aget-object v3, v0, v2

    invoke-virtual {v3}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    aget-object v0, v0, v2

    return-object v0

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    return-object v0
.end method

.method public static longValueOf(J)Ljava/lang/Long;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Lorg/bouncycastle/util/Longs;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    return-object p0
.end method
