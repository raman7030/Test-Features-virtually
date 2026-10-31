.class public final Ll/᩺ᩴۢ;
.super Ljava/lang/Object;
.source "V7AU"


# static fields
.field public static final ֡:Ljava/util/regex/Pattern;

.field public static final ֨:Ljava/util/regex/Pattern;

.field public static final ۙ:J

.field public static final ۚ:J

.field public static final ۠:J

.field public static final ܶ:J

.field public static final ᩴ:Ljava/util/regex/Pattern;

.field public static final ᩵:Ljava/util/regex/Pattern;

.field public static final ᩶:J

.field public static final ᩸:J

.field public static final ᩹:J


# instance fields
.field public final ֫:Ljava/util/HashMap;

.field public final ۖ:Ljava/security/SecureRandom;

.field public final ۘ:Ljava/util/HashMap;

.field public final ۜ:Ll/۬֡ۢ;

.field public ۡ:Ljava/util/concurrent/ScheduledFuture;

.field public final ۢ:Ljava/util/HashMap;

.field public final ۧ:Ljava/util/HashMap;

.field public final ܳ:Ljava/util/HashMap;

.field public ܺ:Ljava/util/concurrent/ScheduledExecutorService;

.field public final ܽ:Ljava/lang/String;

.field public final ܿ:Ljava/lang/Object;

.field public final ᩳ:Ll/᩻ᩴۢ;

.field public ᩷:J

.field public ᩻:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    const-string v0, "Android\\s+([0-9]+(?:\\.[0-9]+)*)"

    const/4 v1, 0x2

    .line 57
    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺ᩴۢ;->᩵:Ljava/util/regex/Pattern;

    const-string v0, "Android\\s+[0-9]+(?:\\.[0-9]+)*;\\s*([^)]*)"

    .line 58
    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺ᩴۢ;->ᩴ:Ljava/util/regex/Pattern;

    const-string v0, "(?:CPU(?: iPhone)? OS)\\s+([0-9_]+)"

    .line 59
    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺ᩴۢ;->֨:Ljava/util/regex/Pattern;

    const-string v0, "\"([^\"]+)\"\\s*;\\s*v=\"?([^\"]*)\"?"

    .line 60
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺ᩴۢ;->֡:Ljava/util/regex/Pattern;

    .line 61
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v1

    sput-wide v1, Ll/᩺ᩴۢ;->᩸:J

    .line 62
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x1e

    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v4

    sput-wide v4, Ll/᩺ᩴۢ;->ܶ:J

    .line 63
    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v1

    sput-wide v1, Ll/᩺ᩴۢ;->ۙ:J

    .line 64
    sget-object v1, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x2

    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v4

    sput-wide v4, Ll/᩺ᩴۢ;->᩶:J

    const-wide/16 v4, 0x5

    .line 65
    invoke-virtual {v0, v4, v5}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v4

    sput-wide v4, Ll/᩺ᩴۢ;->᩹:J

    mul-long v4, v4, v2

    .line 66
    sput-wide v4, Ll/᩺ᩴۢ;->۠:J

    const-wide/16 v1, 0xa

    .line 67
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Ll/᩺ᩴۢ;->ۚ:J

    return-void
.end method

.method public constructor <init>(Ll/۬֡ۢ;Ljava/lang/String;)V
    .locals 2

    .line 112
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 77
    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    iput-object v0, p0, Ll/᩺ᩴۢ;->ۖ:Ljava/security/SecureRandom;

    .line 83
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/᩺ᩴۢ;->ܿ:Ljava/lang/Object;

    .line 84
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Ll/᩺ᩴۢ;->ۘ:Ljava/util/HashMap;

    .line 85
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Ll/᩺ᩴۢ;->ܳ:Ljava/util/HashMap;

    .line 86
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Ll/᩺ᩴۢ;->ۢ:Ljava/util/HashMap;

    .line 87
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Ll/᩺ᩴۢ;->ۧ:Ljava/util/HashMap;

    .line 88
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Ll/᩺ᩴۢ;->֫:Ljava/util/HashMap;

    if-nez p2, :cond_0

    const-string p2, ""

    .line 114
    :cond_0
    iput-object p2, p0, Ll/᩺ᩴۢ;->ܽ:Ljava/lang/String;

    .line 115
    iput-object p1, p0, Ll/᩺ᩴۢ;->ۜ:Ll/۬֡ۢ;

    .line 116
    invoke-static {}, Ll/ۙ᩸᩷;->ܿ()Landroid/app/Application;

    move-result-object p1

    .line 117
    new-instance p2, Ll/᩻ᩴۢ;

    invoke-direct {p2, p1}, Ll/᩻ᩴۢ;-><init>(Landroid/app/Application;)V

    iput-object p2, p0, Ll/᩺ᩴۢ;->ᩳ:Ll/᩻ᩴۢ;

    .line 118
    monitor-enter v0

    .line 119
    :try_start_0
    invoke-direct {p0}, Ll/᩺ᩴۢ;->᩻()Z

    move-result p1

    if-nez p1, :cond_1

    .line 120
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    invoke-direct {p0, p1, p2}, Ll/᩺ᩴۢ;->ᩳ(J)V

    .line 121
    invoke-direct {p0}, Ll/᩺ᩴۢ;->ۜ()V

    .line 123
    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1742
    invoke-static {p1}, Ll/᩺ᩴۢ;->ܳ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 1743
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    const-string v0, " "

    .line 0
    invoke-static {p0, v0, p1}, Ll/᩺۠ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/util/List;)Ljava/lang/String;
    .locals 7

    const/4 v0, 0x0

    if-eqz p0, :cond_13

    .line 1274
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_5

    .line 1277
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const-string v3, "chromium"

    const-string v4, "brand"

    const-string v5, "not"

    if-eqz v2, :cond_d

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩹ᩴۢ;

    .line 1278
    iget-object v2, v2, Ll/᩹ᩴۢ;->֫:Ljava/lang/String;

    .line 1312
    invoke-static {v2}, Ll/᩺ᩴۢ;->ۜ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1313
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_2

    goto/16 :goto_0

    .line 1316
    :cond_2
    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v2, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    .line 1317
    invoke-virtual {v2, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-virtual {v2, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_a

    :cond_3
    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_4

    goto :goto_0

    :cond_4
    const-string v3, "samsung internet"

    .line 1320
    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_5

    const-string v2, "Samsung Internet"

    goto :goto_3

    :cond_5
    const-string v3, "microsoft edge"

    .line 1323
    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_c

    const-string v3, "edge"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    goto :goto_2

    :cond_6
    const-string v3, "google chrome"

    .line 1326
    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_b

    const-string v3, "chrome"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    goto :goto_1

    :cond_7
    const-string v3, "opera"

    .line 1329
    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_8

    const-string v2, "Opera"

    goto :goto_3

    :cond_8
    const-string v3, "firefox"

    .line 1332
    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_9

    const-string v2, "Firefox"

    goto :goto_3

    :cond_9
    const-string v3, "safari"

    .line 1335
    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_a

    const-string v2, "Safari"

    goto :goto_3

    :cond_a
    :goto_0
    move-object v2, v0

    goto :goto_3

    :cond_b
    :goto_1
    const-string v2, "Chrome"

    goto :goto_3

    :cond_c
    :goto_2
    const-string v2, "Edge"

    .line 1279
    :goto_3
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_1

    return-object v2

    .line 1283
    :cond_d
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_e
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_13

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩹ᩴۢ;

    .line 1284
    iget-object v1, v1, Ll/᩹ᩴۢ;->֫:Ljava/lang/String;

    .line 1346
    invoke-static {v1}, Ll/᩺ᩴۢ;->ۜ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1347
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_f

    goto :goto_4

    .line 1350
    :cond_f
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    .line 1351
    invoke-virtual {v2, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_10

    invoke-virtual {v2, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_11

    :cond_10
    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_12

    :cond_11
    :goto_4
    move-object v1, v0

    .line 1285
    :cond_12
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_e

    return-object v1

    :cond_13
    :goto_5
    return-object v0
.end method

.method public static ֫(Ljava/util/regex/Pattern;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1750
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 1753
    :cond_0
    invoke-virtual {p0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    .line 1754
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    :goto_0
    const-string p0, ""

    return-object p0
.end method

.method public static ֫(Ll/ܺܳܳ;Ll/۫ᩴۢ;)Ljava/lang/String;
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "user-agent"

    .line 1153
    invoke-static {v0, v2}, Ll/ܿۚۢ;->֫(Ll/ۖܳܳ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1154
    iget-object v3, v1, Ll/۫ᩴۢ;->֫:Ll/᩶ᩴۢ;

    const-string v4, "sec-ch-ua"

    .line 1155
    invoke-static {v0, v4}, Ll/ܿۚۢ;->֫(Ll/ۖܳܳ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-nez v3, :cond_0

    const/4 v5, 0x0

    goto :goto_0

    .line 1256
    :cond_0
    iget-object v5, v3, Ll/᩶ᩴۢ;->ۧ:Ljava/util/List;

    :goto_0
    invoke-static {v5}, Ll/᩺ᩴۢ;->֫(Ljava/util/List;)Ljava/lang/String;

    move-result-object v5

    .line 1257
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_2

    if-nez v3, :cond_1

    const/4 v5, 0x0

    goto :goto_1

    .line 1258
    :cond_1
    iget-object v5, v3, Ll/᩶ᩴۢ;->֫:Ljava/util/List;

    :goto_1
    invoke-static {v5}, Ll/᩺ᩴۢ;->֫(Ljava/util/List;)Ljava/lang/String;

    move-result-object v5

    .line 1260
    :cond_2
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    const/16 v7, 0x8

    const/4 v8, 0x2

    const/4 v9, 0x1

    if-eqz v6, :cond_5

    .line 1296
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 1297
    sget-object v4, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    goto :goto_3

    .line 1299
    :cond_3
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 1300
    sget-object v6, Ll/᩺ᩴۢ;->֡:Ljava/util/regex/Pattern;

    invoke-virtual {v6, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v4

    .line 1301
    :goto_2
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->find()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-ge v6, v7, :cond_4

    .line 1302
    new-instance v6, Ll/᩹ᩴۢ;

    invoke-virtual {v4, v9}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ll/᩺ᩴۢ;->ۜ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v4, v8}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Ll/᩺ᩴۢ;->ۜ(Ljava/lang/String;)Ljava/lang/String;

    invoke-direct {v6, v10}, Ll/᩹ᩴۢ;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    move-object v4, v5

    .line 1261
    :goto_3
    invoke-static {v4}, Ll/᩺ᩴۢ;->֫(Ljava/util/List;)Ljava/lang/String;

    move-result-object v5

    .line 1263
    :cond_5
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    const-string v6, "Version/"

    const-string v7, "Chrome/"

    const-string v10, "OPR/"

    const-string v11, "EdgA/"

    const-string v12, "SamsungBrowser/"

    if-eqz v4, :cond_11

    .line 1362
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_6

    goto :goto_4

    .line 1365
    :cond_6
    invoke-virtual {v2, v12}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_7

    const-string v5, "Samsung Internet"

    goto/16 :goto_9

    :cond_7
    const-string v4, "Edg/"

    .line 1368
    invoke-virtual {v2, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_10

    invoke-virtual {v2, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_10

    const-string v4, "EdgiOS/"

    invoke-virtual {v2, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_8

    goto :goto_8

    .line 1371
    :cond_8
    invoke-virtual {v2, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_f

    const-string v4, "Opera/"

    invoke-virtual {v2, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_9

    goto :goto_7

    :cond_9
    const-string v4, "FxiOS/"

    .line 1374
    invoke-virtual {v2, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_e

    const-string v4, "Firefox/"

    invoke-virtual {v2, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_a

    goto :goto_6

    :cond_a
    const-string v4, "CriOS/"

    .line 1377
    invoke-virtual {v2, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_d

    invoke-virtual {v2, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_b

    goto :goto_5

    :cond_b
    const-string v4, "Safari/"

    .line 1380
    invoke-virtual {v2, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_c

    invoke-virtual {v2, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_c

    const-string v5, "Safari"

    goto :goto_9

    :cond_c
    :goto_4
    const/4 v5, 0x0

    goto :goto_9

    :cond_d
    :goto_5
    const-string v5, "Chrome"

    goto :goto_9

    :cond_e
    :goto_6
    const-string v5, "Firefox"

    goto :goto_9

    :cond_f
    :goto_7
    const-string v5, "Opera"

    goto :goto_9

    :cond_10
    :goto_8
    const-string v5, "Edge"

    :cond_11
    :goto_9
    const-string v4, "sec-ch-ua-platform"

    .line 1156
    invoke-static {v0, v4}, Ll/ܿۚۢ;->֫(Ll/ۖܳܳ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-nez v3, :cond_12

    const/4 v13, 0x0

    goto :goto_a

    .line 1391
    :cond_12
    iget-object v13, v3, Ll/᩶ᩴۢ;->ܿ:Ljava/lang/String;

    .line 1761
    :goto_a
    invoke-static {v4}, Ll/᩺ᩴۢ;->ۜ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 1762
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v14

    if-lt v14, v8, :cond_13

    const-string v8, "\""

    invoke-virtual {v4, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_13

    invoke-virtual {v4, v8}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_13

    .line 0
    invoke-static {v9, v9, v4}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 1772
    :cond_13
    invoke-static {v13}, Ll/᩺ᩴۢ;->ۜ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 1773
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9

    if-eqz v9, :cond_14

    invoke-static {v4}, Ll/᩺ᩴۢ;->ۜ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    :cond_14
    if-nez v3, :cond_15

    const/4 v4, 0x0

    goto :goto_b

    .line 1392
    :cond_15
    iget-object v4, v3, Ll/᩶ᩴۢ;->ܳ:Ljava/lang/String;

    .line 1405
    :goto_b
    invoke-static {v8}, Ll/᩺ᩴۢ;->ۜ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 1406
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9

    const-string v14, "iOS"

    const-string v15, "ChromeOS"

    const-string v16, "Windows"

    const-string v13, "macOS"

    const-string v1, "Android"

    if-eqz v9, :cond_16

    const/4 v4, 0x0

    move-object/from16 v17, v5

    goto/16 :goto_10

    .line 1409
    :cond_16
    sget-object v9, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v8, v9}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v9

    move-object/from16 v17, v5

    const-string v5, "android"

    .line 1410
    invoke-virtual {v9, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_17

    .line 1411
    invoke-static {v4}, Ll/᩺ᩴۢ;->ܳ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Ll/᩺ᩴۢ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    goto/16 :goto_10

    :cond_17
    const-string v5, "ios"

    .line 1413
    invoke-virtual {v9, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_18

    .line 1414
    invoke-static {v4}, Ll/᩺ᩴۢ;->ܳ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v14, v4}, Ll/᩺ᩴۢ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    goto/16 :goto_10

    :cond_18
    const-string v5, "mac"

    .line 1416
    invoke-virtual {v9, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_19

    .line 1417
    invoke-static {v4}, Ll/᩺ᩴۢ;->ܳ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v13, v4}, Ll/᩺ᩴۢ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    goto :goto_10

    :cond_19
    const-string v5, "windows"

    .line 1419
    invoke-virtual {v9, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_1e

    .line 1780
    invoke-static {v4}, Ll/᩺ᩴۢ;->ۜ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    .line 1782
    :goto_c
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v8

    if-ge v5, v8, :cond_1a

    invoke-virtual {v4, v5}, Ljava/lang/String;->charAt(I)C

    move-result v8

    invoke-static {v8}, Ljava/lang/Character;->isDigit(C)Z

    move-result v8

    if-eqz v8, :cond_1a

    add-int/lit8 v5, v5, 0x1

    goto :goto_c

    :cond_1a
    if-nez v5, :cond_1b

    goto :goto_d

    :cond_1b
    const/4 v8, 0x0

    .line 1789
    :try_start_0
    invoke-virtual {v4, v8, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_e

    :catch_0
    :goto_d
    const/4 v4, -0x1

    :goto_e
    const/16 v5, 0xd

    if-lt v4, v5, :cond_1c

    const-string v4, "Windows 11"

    goto :goto_f

    :cond_1c
    if-lez v4, :cond_1d

    const-string v4, "Windows 10"

    goto :goto_f

    :cond_1d
    const/4 v4, 0x0

    .line 1421
    :goto_f
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_20

    move-object/from16 v4, v16

    goto :goto_10

    :cond_1e
    const-string v5, "chrome os"

    .line 1423
    invoke-virtual {v9, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_1f

    .line 1424
    invoke-static {v4}, Ll/᩺ᩴۢ;->ܳ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v15, v4}, Ll/᩺ᩴۢ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    goto :goto_10

    .line 1426
    :cond_1f
    invoke-static {v4}, Ll/᩺ᩴۢ;->ܳ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v8, v4}, Ll/᩺ᩴۢ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 1394
    :cond_20
    :goto_10
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    const-string v8, " Build/"

    const-string v9, "k"

    move-object/from16 v18, v4

    const-string v4, ";"

    move-object/from16 v19, v13

    sget-object v13, Ll/᩺ᩴۢ;->ᩴ:Ljava/util/regex/Pattern;

    move-object/from16 v20, v15

    const-string v15, "iPhone"

    move-object/from16 v21, v14

    const-string v14, "iPad"

    const-string v22, ""

    if-nez v5, :cond_21

    move-object/from16 v1, v18

    goto/16 :goto_1c

    .line 1434
    :cond_21
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_22

    goto/16 :goto_14

    .line 1437
    :cond_22
    invoke-virtual {v2, v15}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_2f

    invoke-virtual {v2, v14}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_23

    goto/16 :goto_16

    .line 1445
    :cond_23
    sget-object v5, Ll/᩺ᩴۢ;->᩵:Ljava/util/regex/Pattern;

    invoke-static {v5, v2}, Ll/᩺ᩴۢ;->֫(Ljava/util/regex/Pattern;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 1446
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_29

    .line 1447
    invoke-static {v5}, Ll/᩺ᩴۢ;->ܳ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "10"

    .line 1806
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_28

    .line 1815
    invoke-virtual {v2, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_24

    .line 1816
    invoke-virtual {v2, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_24

    .line 1817
    invoke-virtual {v2, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_24

    .line 1818
    invoke-virtual {v2, v12}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_28

    .line 1825
    :cond_24
    invoke-static {v13, v2}, Ll/᩺ᩴۢ;->֫(Ljava/util/regex/Pattern;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 1826
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_25

    goto :goto_12

    .line 1829
    :cond_25
    invoke-virtual {v6, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    .line 1830
    array-length v7, v6

    const/4 v10, 0x0

    :goto_11
    if-ge v10, v7, :cond_28

    aget-object v11, v6, v10

    .line 1560
    invoke-static {v11}, Ll/᩺ᩴۢ;->ۜ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 1561
    invoke-virtual {v11, v8}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v12

    move-object/from16 v16, v5

    if-ltz v12, :cond_26

    const/4 v5, 0x0

    .line 1563
    invoke-virtual {v11, v5, v12}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v11

    .line 1565
    :cond_26
    invoke-static {v11}, Ll/᩺ᩴۢ;->ۜ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 1831
    sget-object v11, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v5, v11}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v9, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_27

    move-object/from16 v5, v22

    goto :goto_13

    :cond_27
    add-int/lit8 v10, v10, 0x1

    move-object/from16 v5, v16

    goto :goto_11

    :cond_28
    :goto_12
    move-object/from16 v16, v5

    move-object/from16 v5, v16

    .line 1451
    :goto_13
    invoke-static {v1, v5}, Ll/᩺ᩴۢ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto/16 :goto_1c

    :cond_29
    const-string v1, "Mac OS X"

    .line 1453
    invoke-virtual {v2, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2e

    const-string v1, "Macintosh"

    invoke-virtual {v2, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2a

    goto :goto_15

    :cond_2a
    const-string v1, "Windows NT"

    .line 1457
    invoke-virtual {v2, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2b

    move-object/from16 v1, v16

    goto/16 :goto_1c

    :cond_2b
    const-string v1, "CrOS"

    .line 1461
    invoke-virtual {v2, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2c

    move-object/from16 v1, v20

    goto/16 :goto_1c

    :cond_2c
    const-string v1, "Linux"

    .line 1465
    invoke-virtual {v2, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_2d

    goto :goto_1c

    :cond_2d
    :goto_14
    const/4 v1, 0x0

    goto :goto_1c

    :cond_2e
    :goto_15
    move-object/from16 v1, v19

    goto :goto_1c

    .line 1438
    :cond_2f
    :goto_16
    invoke-virtual {v2, v14}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_30

    const-string v1, "iPadOS"

    goto :goto_17

    :cond_30
    move-object/from16 v1, v21

    .line 1439
    :goto_17
    sget-object v5, Ll/᩺ᩴۢ;->֨:Ljava/util/regex/Pattern;

    invoke-static {v5, v2}, Ll/᩺ᩴۢ;->֫(Ljava/util/regex/Pattern;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ll/᩺ᩴۢ;->ܳ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v7, "18.6"

    .line 1799
    invoke-virtual {v5, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_34

    .line 1842
    invoke-virtual {v2, v6}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v6

    if-gez v6, :cond_31

    goto :goto_19

    :cond_31
    const/16 v7, 0x8

    add-int/2addr v6, v7

    move v7, v6

    .line 1848
    :goto_18
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v10

    if-ge v7, v10, :cond_32

    invoke-virtual {v2, v7}, Ljava/lang/String;->charAt(I)C

    move-result v10

    invoke-static {v10}, Ljava/lang/Character;->isDigit(C)Z

    move-result v10

    if-eqz v10, :cond_32

    add-int/lit8 v7, v7, 0x1

    goto :goto_18

    :cond_32
    if-ne v7, v6, :cond_33

    goto :goto_19

    .line 1855
    :cond_33
    :try_start_1
    invoke-virtual {v2, v6, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1a

    :catch_1
    :goto_19
    const/4 v6, -0x1

    :goto_1a
    const/16 v7, 0x1a

    if-lt v6, v7, :cond_34

    const/4 v6, 0x1

    goto :goto_1b

    :cond_34
    const/4 v6, 0x0

    :goto_1b
    if-eqz v6, :cond_35

    move-object/from16 v5, v22

    .line 1443
    :cond_35
    invoke-static {v1, v5}, Ll/᩺ᩴۢ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :goto_1c
    const-string v5, "sec-ch-ua-mobile"

    .line 1157
    invoke-static {v0, v5}, Ll/ܿۚۢ;->֫(Ll/ۖܳܳ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v3, :cond_36

    .line 1519
    iget-object v5, v3, Ll/᩶ᩴۢ;->ܽ:Ljava/lang/Boolean;

    if-eqz v5, :cond_36

    goto :goto_1d

    .line 1522
    :cond_36
    invoke-static {v0}, Ll/᩺ᩴۢ;->ۜ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v5, "?1"

    .line 1523
    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_37

    .line 1524
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_1d

    :cond_37
    const-string v5, "?0"

    .line 1526
    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_38

    .line 1527
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_1d

    :cond_38
    const/4 v5, 0x0

    :goto_1d
    if-nez v3, :cond_39

    const/4 v0, 0x0

    goto :goto_1e

    .line 1492
    :cond_39
    iget-object v0, v3, Ll/᩶ᩴۢ;->ᩳ:Ljava/lang/String;

    :goto_1e
    invoke-static {v0}, Ll/᩺ᩴۢ;->ۜ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1493
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_3a

    move-object v15, v0

    goto/16 :goto_29

    .line 1496
    :cond_3a
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4e

    .line 1497
    invoke-virtual {v2, v14}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3b

    move-object v15, v14

    goto/16 :goto_29

    .line 1500
    :cond_3b
    invoke-virtual {v2, v15}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3c

    goto/16 :goto_29

    .line 1537
    :cond_3c
    invoke-static {v13, v2}, Ll/᩺ᩴۢ;->֫(Ljava/util/regex/Pattern;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1538
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_3d

    goto/16 :goto_27

    .line 1542
    :cond_3d
    invoke-virtual {v0, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 1543
    array-length v2, v0

    const/4 v3, 0x0

    move-object/from16 v4, v22

    :goto_1f
    if-ge v3, v2, :cond_4c

    aget-object v6, v0, v3

    .line 1560
    invoke-static {v6}, Ll/᩺ᩴۢ;->ۜ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 1561
    invoke-virtual {v7, v8}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v10

    if-ltz v10, :cond_3e

    const/4 v11, 0x0

    .line 1563
    invoke-virtual {v7, v11, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    .line 1565
    :cond_3e
    invoke-static {v7}, Ll/᩺ᩴۢ;->ۜ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 1572
    invoke-static {v7}, Ll/᩺ᩴۢ;->ۜ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 1573
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v11

    if-eqz v11, :cond_3f

    goto/16 :goto_25

    .line 1576
    :cond_3f
    sget-object v11, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v10, v11}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v10

    .line 1577
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_4b

    const-string v11, "wv"

    .line 1578
    invoke-virtual {v11, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_4b

    const-string v11, "tablet"

    .line 1579
    invoke-virtual {v11, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_4b

    const-string v11, "mobile"

    .line 1580
    invoke-virtual {v10, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v11

    if-nez v11, :cond_4b

    const-string v11, "linux"

    .line 1581
    invoke-virtual {v10, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v11

    if-nez v11, :cond_4b

    const-string v11, "rv:"

    .line 1590
    invoke-virtual {v10, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v11

    if-nez v11, :cond_4b

    const-string v11, "version/"

    .line 1591
    invoke-virtual {v10, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v11

    if-nez v11, :cond_4b

    const-string v11, "chrome/"

    .line 1592
    invoke-virtual {v10, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v11

    if-nez v11, :cond_4b

    const-string v11, "crios/"

    .line 1593
    invoke-virtual {v10, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v11

    if-nez v11, :cond_4b

    const-string v11, "firefox/"

    .line 1594
    invoke-virtual {v10, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v11

    if-nez v11, :cond_4b

    const-string v11, "fxios/"

    .line 1595
    invoke-virtual {v10, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v11

    if-nez v11, :cond_4b

    const-string v11, "gecko/"

    .line 1596
    invoke-virtual {v10, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v11

    if-nez v11, :cond_4b

    const-string v11, "safari/"

    .line 1597
    invoke-virtual {v10, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v11

    if-nez v11, :cond_4b

    const-string v11, "applewebkit/"

    .line 1598
    invoke-virtual {v10, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_40

    goto/16 :goto_25

    .line 1605
    :cond_40
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v11

    const/4 v12, 0x2

    if-lt v11, v12, :cond_43

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v11

    const/16 v12, 0xc

    if-le v11, v12, :cond_41

    goto :goto_20

    :cond_41
    const/16 v11, 0x5f

    const/16 v12, 0x2d

    .line 1608
    invoke-virtual {v10, v11, v12}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v10

    const-string v11, "-"

    .line 1609
    invoke-virtual {v10, v11}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v10

    .line 1610
    array-length v11, v10

    const/4 v12, 0x1

    if-lt v11, v12, :cond_43

    array-length v11, v10

    const/4 v13, 0x3

    if-le v11, v13, :cond_42

    goto :goto_20

    .line 1613
    :cond_42
    array-length v11, v10

    const/4 v14, 0x0

    if-ne v11, v12, :cond_45

    aget-object v11, v10, v14

    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v11

    if-le v11, v13, :cond_45

    :cond_43
    :goto_20
    move-object/from16 p0, v0

    :cond_44
    :goto_21
    move/from16 v16, v2

    goto :goto_24

    .line 1616
    :cond_45
    array-length v11, v10

    const/4 v12, 0x0

    :goto_22
    if-ge v12, v11, :cond_4b

    aget-object v13, v10, v12

    .line 1617
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v14

    move-object/from16 p0, v0

    const/4 v0, 0x2

    if-lt v14, v0, :cond_44

    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v14, 0x4

    if-le v0, v14, :cond_46

    goto :goto_21

    :cond_46
    const/4 v0, 0x0

    .line 1620
    :goto_23
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v14

    if-ge v0, v14, :cond_48

    .line 1621
    invoke-virtual {v13, v0}, Ljava/lang/String;->charAt(I)C

    move-result v14

    move/from16 v16, v2

    const/16 v2, 0x61

    if-lt v14, v2, :cond_49

    const/16 v2, 0x7a

    if-le v14, v2, :cond_47

    goto :goto_24

    :cond_47
    add-int/lit8 v0, v0, 0x1

    move/from16 v2, v16

    goto :goto_23

    :cond_48
    move/from16 v16, v2

    add-int/lit8 v12, v12, 0x1

    move-object/from16 v0, p0

    goto :goto_22

    .line 1548
    :cond_49
    :goto_24
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4a

    const-string v0, "Build/"

    invoke-virtual {v6, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4a

    move-object v4, v7

    goto :goto_28

    :cond_4a
    move-object v4, v7

    goto :goto_26

    :cond_4b
    :goto_25
    move-object/from16 p0, v0

    move/from16 v16, v2

    :goto_26
    add-int/lit8 v3, v3, 0x1

    move-object/from16 v0, p0

    move/from16 v2, v16

    goto/16 :goto_1f

    .line 1553
    :cond_4c
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4d

    :goto_27
    const/4 v4, 0x0

    .line 1504
    :cond_4d
    :goto_28
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4e

    move-object v15, v4

    goto :goto_29

    .line 1508
    :cond_4e
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v5}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4f

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4f

    move-object/from16 v0, v21

    invoke-virtual {v1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4f

    goto :goto_29

    :cond_4f
    const/4 v15, 0x0

    .line 1688
    :goto_29
    invoke-static/range {v17 .. v17}, Ll/᩺ᩴۢ;->ۜ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1689
    invoke-static {v1}, Ll/᩺ᩴۢ;->ۜ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1690
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_50

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_50

    const-string v2, " on "

    .line 0
    invoke-static {v0, v2, v1}, Ll/᩺۠ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_2a

    .line 1693
    :cond_50
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_51

    goto :goto_2a

    .line 1696
    :cond_51
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_52

    move-object/from16 v0, v22

    goto :goto_2a

    :cond_52
    move-object v0, v1

    .line 1634
    :goto_2a
    invoke-static {v15}, Ll/᩺ᩴۢ;->ۜ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 1635
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_53

    goto/16 :goto_2f

    .line 1650
    :cond_53
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v7, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "REDMI"

    .line 1651
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_5e

    const-string v2, "POCO"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_5e

    const-string v2, "XIAOMI"

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_54

    goto/16 :goto_2c

    :cond_54
    const-string v2, "RMX"

    .line 1654
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_55

    const-string v1, "realme"

    goto :goto_2d

    :cond_55
    const-string v2, "SM-"

    .line 1657
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_56

    const-string v1, "Samsung"

    goto :goto_2d

    :cond_56
    const-string v2, "PIXEL"

    .line 1660
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_57

    const-string v1, "Google"

    goto :goto_2d

    :cond_57
    const-string v2, "OPPO"

    .line 1663
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_58

    :goto_2b
    move-object v8, v2

    goto :goto_2e

    :cond_58
    const-string v2, "IQOO"

    .line 1666
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_59

    const-string v1, "iQOO"

    goto :goto_2d

    :cond_59
    const-string v2, "VIVO"

    .line 1669
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_5a

    const-string v1, "vivo"

    goto :goto_2d

    :cond_5a
    const-string v2, "HONOR"

    .line 1672
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_5b

    const-string v1, "Honor"

    goto :goto_2d

    :cond_5b
    const-string v2, "HUAWEI"

    .line 1675
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_5c

    const-string v1, "Huawei"

    goto :goto_2d

    :cond_5c
    const-string v2, "ONEPLUS"

    .line 1678
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_5d

    const-string v1, "OnePlus"

    goto :goto_2d

    :cond_5d
    const/4 v2, 0x0

    goto :goto_2b

    :cond_5e
    :goto_2c
    const-string v1, "Xiaomi"

    :goto_2d
    move-object v8, v1

    .line 1639
    :goto_2e
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_60

    const/4 v5, 0x0

    .line 1878
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v6

    const/4 v2, 0x1

    const/4 v3, 0x0

    move-object v1, v7

    move-object v4, v8

    invoke-virtual/range {v1 .. v6}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result v1

    if-eqz v1, :cond_5f

    goto :goto_30

    :cond_5f
    const-string v1, " "

    .line 0
    invoke-static {v8, v1, v7}, Ll/᩺۠ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v22

    :goto_2f
    move-object/from16 v7, v22

    .line 1161
    :cond_60
    :goto_30
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_61

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_61

    const-string v1, " \u00b7 "

    .line 0
    invoke-static {v7, v1, v0}, Ll/᩺۠ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1162
    invoke-static {v0}, Ll/᩺ᩴۢ;->ܿ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 1164
    :cond_61
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_62

    .line 1165
    invoke-static {v7}, Ll/᩺ᩴۢ;->ܿ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 1167
    :cond_62
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_63

    .line 1168
    invoke-static {v0}, Ll/᩺ᩴۢ;->ܿ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_63
    move-object/from16 v0, p1

    .line 1170
    iget-object v0, v0, Ll/۫ᩴۢ;->ܽ:Ljava/lang/String;

    invoke-static {v0}, Ll/᩺ᩴۢ;->ܿ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static ֫([B)Ljava/lang/String;
    .locals 1

    :try_start_0
    const-string v0, "SHA-256"

    .line 1912
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0

    .line 1913
    invoke-virtual {v0, p0}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object p0

    const/16 v0, 0xb

    .line 1920
    invoke-static {p0, v0}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 1915
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static ֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/util/List;
    .locals 6

    .line 1227
    :try_start_0
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    if-nez p0, :cond_0

    .line 1232
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p0

    .line 1234
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 1235
    invoke-virtual {p0}, Lbin/mt/json/JSONArray;->size()I

    move-result v0

    const/16 v1, 0x8

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    .line 1238
    :try_start_1
    invoke-virtual {p0, v1}, Lbin/mt/json/JSONArray;->getJSONObject(I)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "brand"

    .line 1239
    invoke-virtual {v2, v3}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ll/᩺ᩴۢ;->ۜ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 1240
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_1

    .line 1243
    :cond_1
    new-instance v4, Ll/᩹ᩴۢ;

    const-string v5, "version"

    invoke-virtual {v2, v5}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ll/᩺ᩴۢ;->ۜ(Ljava/lang/String;)Ljava/lang/String;

    invoke-direct {v4, v3}, Ll/᩹ᩴۢ;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-object p1

    .line 1229
    :catch_1
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p0
.end method

.method public static ֫(Lbin/mt/json/JSONObject;)Ll/ۛᩴۢ;
    .locals 11

    const-string v0, "kty"

    .line 826
    invoke-static {p0, v0}, Ll/᩺ᩴۢ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "crv"

    .line 827
    invoke-static {p0, v1}, Ll/᩺ᩴۢ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "x"

    .line 828
    invoke-static {p0, v2}, Ll/᩺ᩴۢ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "y"

    .line 829
    invoke-static {p0, v3}, Ll/᩺ᩴۢ;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string v3, "EC"

    .line 830
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const-string v4, "P-256"

    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const-string v4, "="

    invoke-virtual {v2, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_2

    invoke-virtual {p0, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_2

    const/16 v4, 0xb

    .line 1924
    invoke-static {v2, v4}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v5

    invoke-static {p0, v4}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v4

    .line 835
    array-length v6, v5

    const/16 v7, 0x20

    if-ne v6, v7, :cond_1

    array-length v6, v4

    if-ne v6, v7, :cond_1

    .line 838
    invoke-static {v3}, Ljava/security/AlgorithmParameters;->getInstance(Ljava/lang/String;)Ljava/security/AlgorithmParameters;

    move-result-object v6

    .line 839
    new-instance v7, Ljava/security/spec/ECGenParameterSpec;

    const-string v8, "secp256r1"

    invoke-direct {v7, v8}, Ljava/security/spec/ECGenParameterSpec;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v7}, Ljava/security/AlgorithmParameters;->init(Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 840
    const-class v7, Ljava/security/spec/ECParameterSpec;

    invoke-virtual {v6, v7}, Ljava/security/AlgorithmParameters;->getParameterSpec(Ljava/lang/Class;)Ljava/security/spec/AlgorithmParameterSpec;

    move-result-object v6

    check-cast v6, Ljava/security/spec/ECParameterSpec;

    .line 841
    new-instance v7, Ljava/security/spec/ECPublicKeySpec;

    new-instance v8, Ljava/security/spec/ECPoint;

    new-instance v9, Ljava/math/BigInteger;

    const/4 v10, 0x1

    invoke-direct {v9, v10, v5}, Ljava/math/BigInteger;-><init>(I[B)V

    new-instance v5, Ljava/math/BigInteger;

    invoke-direct {v5, v10, v4}, Ljava/math/BigInteger;-><init>(I[B)V

    invoke-direct {v8, v9, v5}, Ljava/security/spec/ECPoint;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-direct {v7, v8, v6}, Ljava/security/spec/ECPublicKeySpec;-><init>(Ljava/security/spec/ECPoint;Ljava/security/spec/ECParameterSpec;)V

    .line 845
    invoke-static {v3}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;

    move-result-object v3

    invoke-virtual {v3, v7}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    move-result-object v3

    .line 846
    instance-of v4, v3, Ljava/security/interfaces/ECPublicKey;

    if-eqz v4, :cond_0

    const-string v4, "\",\"kty\":\""

    const-string v5, "\",\"x\":\""

    const-string v6, "{\"crv\":\""

    .line 0
    invoke-static {v6, v1, v4, v0, v5}, Ll/ۗ᩵֫;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 862
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\",\"y\":\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\"}"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 850
    new-instance v0, Ll/ۛᩴۢ;

    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    invoke-static {v1}, Ll/᩺ᩴۢ;->֫([B)Ljava/lang/String;

    move-result-object v1

    check-cast v3, Ljava/security/interfaces/ECPublicKey;

    invoke-direct {v0, p0, v1, v3}, Ll/ۛᩴۢ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/security/interfaces/ECPublicKey;)V

    return-object v0

    .line 847
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "invalid key"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 836
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "invalid coordinate length"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 831
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "unsupported key"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private ֫(JLjava/lang/String;)Ll/ۤᩴۢ;
    .locals 3

    .line 1104
    iget-object v0, p0, Ll/᩺ᩴۢ;->ۢ:Ljava/util/HashMap;

    invoke-virtual {v0, p3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۬ᩴۢ;

    if-eqz v0, :cond_0

    .line 1105
    iget-wide v0, v0, Ll/۬ᩴۢ;->֫:J

    cmp-long v2, v0, p1

    if-lez v2, :cond_0

    .line 1106
    invoke-direct {p0, p1, p2, p3}, Ll/᩺ᩴۢ;->ᩳ(JLjava/lang/String;)V

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    const p2, 0x7f120812

    .line 1107
    invoke-static {p2, p1}, Ll/ۤᩴۢ;->֫(I[Ljava/lang/Object;)Ll/ۤᩴۢ;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private ֫(J)V
    .locals 3

    .line 1020
    invoke-direct {p0}, Ll/᩺ᩴۢ;->᩻()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 1023
    :cond_0
    iget-object v0, p0, Ll/᩺ᩴۢ;->᩻:Ljava/lang/String;

    if-eqz v0, :cond_2

    iget-wide v0, p0, Ll/᩺ᩴۢ;->᩷:J

    cmp-long v2, p1, v0

    if-ltz v2, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    return-void

    .line 1024
    :cond_2
    :goto_1
    invoke-direct {p0, p1, p2}, Ll/᩺ᩴۢ;->ᩳ(J)V

    .line 1025
    invoke-direct {p0}, Ll/᩺ᩴۢ;->ۜ()V

    return-void
.end method

.method private ֫(Ljava/lang/String;JLl/ܺܳܳ;Z)V
    .locals 4

    .line 922
    iget-object v0, p0, Ll/᩺ᩴۢ;->ۘ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܳᩴۢ;

    if-eqz v0, :cond_0

    if-eqz p5, :cond_0

    .line 945
    iput-wide p2, v0, Ll/ܳᩴۢ;->ᩳ:J

    .line 946
    invoke-static {p4}, Ll/᩺ᩴۢ;->᩻(Ll/ܺܳܳ;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Ll/ܳᩴۢ;->ܿ:Ljava/lang/String;

    .line 947
    invoke-static {p4}, Ll/᩺ᩴۢ;->ۜ(Ll/ܺܳܳ;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Ll/ܳᩴۢ;->ۜ:Ljava/lang/String;

    return-void

    .line 967
    :cond_0
    iget-object p5, p0, Ll/᩺ᩴۢ;->ᩳ:Ll/᩻ᩴۢ;

    invoke-virtual {p5}, Ll/᩻ᩴۢ;->֫()Ljava/util/ArrayList;

    move-result-object v0

    .line 929
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܳᩴۢ;

    .line 930
    iget-object v3, v2, Ll/ܳᩴۢ;->֫:Ljava/lang/String;

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 945
    iput-wide p2, v2, Ll/ܳᩴۢ;->ᩳ:J

    .line 946
    invoke-static {p4}, Ll/᩺ᩴۢ;->᩻(Ll/ܺܳܳ;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, v2, Ll/ܳᩴۢ;->ܿ:Ljava/lang/String;

    .line 947
    invoke-static {p4}, Ll/᩺ᩴۢ;->ۜ(Ll/ܺܳܳ;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, v2, Ll/ܳᩴۢ;->ۜ:Ljava/lang/String;

    .line 971
    invoke-virtual {p5, v0}, Ll/᩻ᩴۢ;->֫(Ljava/util/ArrayList;)V

    :cond_2
    return-void
.end method

.method private ֫(Ll/ۛᩴۢ;Ljava/lang/String;ZJLl/ܺܳܳ;)V
    .locals 8

    .line 867
    iget-object v0, p1, Ll/ۛᩴۢ;->ۧ:Ljava/lang/String;

    .line 967
    iget-object v1, p0, Ll/᩺ᩴۢ;->ᩳ:Ll/᩻ᩴۢ;

    invoke-virtual {v1}, Ll/᩻ᩴۢ;->֫()Ljava/util/ArrayList;

    move-result-object v2

    .line 869
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܳᩴۢ;

    .line 870
    iget-object v5, v4, Ll/ܳᩴۢ;->֫:Ljava/lang/String;

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    .line 875
    :goto_0
    new-instance v3, Ll/ۡᩴۢ;

    invoke-direct {v3, p1}, Ll/ۡᩴۢ;-><init>(Ll/ۛᩴۢ;)V

    invoke-static {v2, v3}, Ll/ۚ۬ᩴ;->removeIf(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    .line 876
    iget-object v3, p0, Ll/᩺ᩴۢ;->ۘ:Ljava/util/HashMap;

    invoke-virtual {v3, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    if-nez v4, :cond_2

    .line 878
    new-instance v5, Ll/ܳᩴۢ;

    invoke-direct {v5}, Ll/ܳᩴۢ;-><init>()V

    goto :goto_1

    :cond_2
    move-object v5, v4

    .line 879
    :goto_1
    iput-object v0, v5, Ll/ܳᩴۢ;->֫:Ljava/lang/String;

    .line 880
    iput-object p2, v5, Ll/ܳᩴۢ;->ۧ:Ljava/lang/String;

    .line 881
    iget-object p1, p1, Ll/ۛᩴۢ;->֫:Ljava/lang/String;

    iput-object p1, v5, Ll/ܳᩴۢ;->ܳ:Ljava/lang/String;

    if-eqz v4, :cond_3

    .line 882
    iget-wide p1, v4, Ll/ܳᩴۢ;->ܽ:J

    const-wide/16 v6, 0x0

    cmp-long v0, p1, v6

    if-gtz v0, :cond_4

    :cond_3
    move-wide p1, p4

    :cond_4
    iput-wide p1, v5, Ll/ܳᩴۢ;->ܽ:J

    .line 883
    iput-wide p4, v5, Ll/ܳᩴۢ;->ᩳ:J

    .line 884
    invoke-static {p6}, Ll/᩺ᩴۢ;->᩻(Ll/ܺܳܳ;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, v5, Ll/ܳᩴۢ;->ܿ:Ljava/lang/String;

    .line 885
    invoke-static {p6}, Ll/᩺ᩴۢ;->ۜ(Ll/ܺܳܳ;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, v5, Ll/ܳᩴۢ;->ۜ:Ljava/lang/String;

    xor-int/lit8 p1, p3, 0x1

    .line 886
    iput-boolean p1, v5, Ll/ܳᩴۢ;->᩻:Z

    if-eqz p3, :cond_6

    .line 888
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 898
    new-instance p1, Ll/ۚᩴۢ;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ll/۠۬ᩴ;->comparingLong(Ljava/util/function/ToLongFunction;)Ljava/util/Comparator;

    move-result-object p1

    invoke-static {v2, p1}, Ll/ۛ۬ᩴ;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 899
    :goto_2
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result p1

    const/16 p2, 0x20

    if-le p1, p2, :cond_5

    const/4 p1, 0x0

    .line 900
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_2

    .line 971
    :cond_5
    invoke-virtual {v1, v2}, Ll/᩻ᩴۢ;->֫(Ljava/util/ArrayList;)V

    return-void

    .line 892
    :cond_6
    iget-object p1, v5, Ll/ܳᩴۢ;->֫:Ljava/lang/String;

    invoke-virtual {v3, p1, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 971
    invoke-virtual {v1, v2}, Ll/᩻ᩴۢ;->֫(Ljava/util/ArrayList;)V

    return-void
.end method

.method public static synthetic ֫(Ll/᩺ᩴۢ;)V
    .locals 3

    .line 1073
    iget-object v0, p0, Ll/᩺ᩴۢ;->ܿ:Ljava/lang/Object;

    monitor-enter v0

    .line 1074
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-direct {p0, v1, v2}, Ll/᩺ᩴۢ;->ᩳ(J)V

    .line 1075
    invoke-direct {p0}, Ll/᩺ᩴۢ;->ۜ()V

    .line 1076
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static synthetic ֫(JLjava/util/Map$Entry;)Z
    .locals 2

    .line 990
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    sub-long/2addr p0, v0

    sget-wide v0, Ll/᩺ᩴۢ;->۠:J

    cmp-long p2, p0, v0

    if-lez p2, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ۜ(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    if-nez p0, :cond_0

    const-string p0, ""

    return-object p0

    .line 1706
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x80

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 1707
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, v0, :cond_5

    .line 1710
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v4

    .line 1711
    invoke-static {v4}, Ljava/lang/Character;->isISOControl(C)Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_1

    .line 1714
    :cond_1
    invoke-static {v4}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 1715
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v3

    if-lez v3, :cond_2

    const/4 v3, 0x1

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    goto :goto_1

    :cond_3
    if-eqz v3, :cond_4

    const/16 v3, 0x20

    .line 1719
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 v3, 0x0

    .line 1722
    :cond_4
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 1724
    :cond_5
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۜ(Ll/ܺܳܳ;)Ljava/lang/String;
    .locals 6

    const-string v0, "user-agent"

    .line 1121
    invoke-static {p0, v0}, Ll/ܿۚۢ;->֫(Ll/ۖܳܳ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    const-string p0, ""

    return-object p0

    .line 1125
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0x400

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v1, 0x0

    const/4 v3, 0x0

    .line 1126
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v3, v4, :cond_2

    .line 1127
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    .line 1128
    invoke-static {v4}, Ljava/lang/Character;->isISOControl(C)Z

    move-result v5

    if-nez v5, :cond_1

    .line 1129
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 1133
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    .line 1134
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-le v0, v2, :cond_3

    .line 1135
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    :cond_3
    return-object p0
.end method

.method private ۜ()V
    .locals 5

    .line 1061
    iget-object v0, p0, Ll/᩺ᩴۢ;->ܺ:Ljava/util/concurrent/ScheduledExecutorService;

    if-nez v0, :cond_0

    .line 1062
    new-instance v0, Ll/᩷ᩴۢ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    iput-object v0, p0, Ll/᩺ᩴۢ;->ܺ:Ljava/util/concurrent/ScheduledExecutorService;

    .line 1068
    :cond_0
    iget-object v0, p0, Ll/᩺ᩴۢ;->ۡ:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    .line 1069
    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 1071
    :cond_1
    iget-wide v0, p0, Ll/᩺ᩴۢ;->᩷:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x1

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    .line 1072
    iget-object v2, p0, Ll/᩺ᩴۢ;->ܺ:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v3, Ll/ۢᩴۢ;

    invoke-direct {v3, p0}, Ll/ۢᩴۢ;-><init>(Ll/᩺ᩴۢ;)V

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v2, v3, v0, v1, v4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    iput-object v0, p0, Ll/᩺ᩴۢ;->ۡ:Ljava/util/concurrent/ScheduledFuture;

    return-void
.end method

.method public static ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    .line 854
    :cond_0
    invoke-static {p0, p1}, Ll/ۜ֡ۢ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 855
    :goto_0
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    return-object p0

    .line 856
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "missing "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private ۧ(J)V
    .locals 4

    .line 986
    iget-object v0, p0, Ll/᩺ᩴۢ;->ܳ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 987
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 988
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    .line 990
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    new-instance v3, Ll/ۖᩴۢ;

    invoke-direct {v3, p1, p2}, Ll/ۖᩴۢ;-><init>(J)V

    invoke-static {v2, v3}, Ll/ۚ۬ᩴ;->removeIf(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    .line 991
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 992
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method private ۧ(JLjava/lang/String;)Z
    .locals 4

    .line 1033
    invoke-direct {p0}, Ll/᩺ᩴۢ;->᩻()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1034
    iget-object p1, p0, Ll/᩺ᩴۢ;->ܽ:Ljava/lang/String;

    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 1039
    :cond_0
    iget-object v0, p0, Ll/᩺ᩴۢ;->᩻:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-wide v1, p0, Ll/᩺ᩴۢ;->᩷:J

    cmp-long v3, p1, v1

    if-gez v3, :cond_1

    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public static ܳ()J
    .locals 2

    .line 498
    sget-wide v0, Ll/᩺ᩴۢ;->᩸:J

    return-wide v0
.end method

.method public static ܳ(Ll/ܺܳܳ;)J
    .locals 5

    .line 765
    invoke-static {p0}, Ll/ܿۚۢ;->ܽ(Ll/ܺܳܳ;)Z

    move-result v0

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 768
    :cond_0
    invoke-static {p0}, Ll/ܿۚۢ;->ۧ(Ll/ܺܳܳ;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_5

    const-string v0, "content-length"

    .line 771
    invoke-static {p0, v0}, Ll/ܿۚۢ;->֫(Ll/ۖܳܳ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 772
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-wide/16 v0, -0x1

    return-wide v0

    .line 775
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    .line 776
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const v2, 0x7f12081e

    if-nez v0, :cond_4

    const/4 v0, 0x0

    .line 779
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v0, v3, :cond_3

    .line 780
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x30

    if-lt v3, v4, :cond_2

    const/16 v4, 0x39

    if-gt v3, v4, :cond_2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 782
    :cond_2
    new-instance p0, Ll/ۨᩴۢ;

    sget-object v0, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {p0, v0, v2, v1}, Ll/ۨᩴۢ;-><init>(Ll/֨ܳܳ;I[Ljava/lang/Object;)V

    throw p0

    .line 786
    :cond_3
    :try_start_0
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide v0

    .line 788
    :catch_0
    new-instance p0, Ll/ۨᩴۢ;

    sget-object v0, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {p0, v0, v2, v1}, Ll/ۨᩴۢ;-><init>(Ll/֨ܳܳ;I[Ljava/lang/Object;)V

    throw p0

    .line 777
    :cond_4
    new-instance p0, Ll/ۨᩴۢ;

    sget-object v0, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {p0, v0, v2, v1}, Ll/ۨᩴۢ;-><init>(Ll/֨ܳܳ;I[Ljava/lang/Object;)V

    throw p0

    .line 769
    :cond_5
    new-instance p0, Ll/ۨᩴۢ;

    sget-object v0, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    const v2, 0x7f120830

    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {p0, v0, v2, v1}, Ll/ۨᩴۢ;-><init>(Ll/֨ܳܳ;I[Ljava/lang/Object;)V

    throw p0
.end method

.method public static ܳ(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1731
    invoke-static {p0}, Ll/᩺ᩴۢ;->ۜ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const/16 v0, 0x5f

    const/16 v1, 0x2e

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p0

    :goto_0
    const-string v0, ".0"

    .line 1732
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 1866
    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v2, v4, :cond_1

    .line 1867
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-ne v4, v1, :cond_0

    add-int/lit8 v3, v3, 0x1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    if-lez v3, :cond_2

    const/4 v2, 0x2

    .line 0
    invoke-static {v2, v0, p0}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_2
    return-object p0
.end method

.method private ܽ(J)V
    .locals 7

    .line 975
    iget-object v0, p0, Ll/᩺ᩴۢ;->ۘ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 976
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 977
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܳᩴۢ;

    .line 978
    iget-wide v2, v1, Ll/ܳᩴۢ;->ᩳ:J

    sub-long v2, p1, v2

    sget-wide v4, Ll/᩺ᩴۢ;->ۙ:J

    cmp-long v6, v2, v4

    if-gtz v6, :cond_1

    iget-wide v1, v1, Ll/ܳᩴۢ;->ܽ:J

    sub-long v1, p1, v1

    sget-wide v3, Ll/᩺ᩴۢ;->᩶:J

    cmp-long v5, v1, v3

    if-lez v5, :cond_0

    .line 980
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_2
    return-void
.end method

.method private ܽ(JLjava/lang/String;)V
    .locals 1

    .line 1081
    iget-object v0, p0, Ll/᩺ᩴۢ;->ܿ:Ljava/lang/Object;

    monitor-enter v0

    .line 1082
    :try_start_0
    invoke-direct {p0, p1, p2, p3}, Ll/᩺ᩴۢ;->ᩳ(JLjava/lang/String;)V

    .line 1083
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private ܽ(Ljava/lang/String;)V
    .locals 2

    .line 961
    iget-object v0, p0, Ll/᩺ᩴۢ;->ܳ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 962
    iget-object v0, p0, Ll/᩺ᩴۢ;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    new-instance v1, Ll/ۘᩴۢ;

    invoke-direct {v1, p1}, Ll/ۘᩴۢ;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1}, Ll/ۚ۬ᩴ;->removeIf(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    .line 963
    iget-object v0, p0, Ll/᩺ᩴۢ;->֫:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    new-instance v1, Ll/ᩴᩴۢ;

    invoke-direct {v1, p1}, Ll/ᩴᩴۢ;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1}, Ll/ۚ۬ᩴ;->removeIf(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    return-void
.end method

.method public static ܿ(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1882
    invoke-static {p0}, Ll/᩺ᩴۢ;->ۜ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 1883
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p0, "Unknown browser"

    return-object p0

    .line 1886
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x40

    if-le v0, v1, :cond_1

    const/4 v0, 0x0

    .line 1887
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    :cond_1
    return-object p0
.end method

.method private ᩳ(Ljava/lang/String;)Ll/ܳᩴۢ;
    .locals 3

    .line 967
    iget-object v0, p0, Ll/᩺ᩴۢ;->ᩳ:Ll/᩻ᩴۢ;

    invoke-virtual {v0}, Ll/᩻ᩴۢ;->֫()Ljava/util/ArrayList;

    move-result-object v0

    .line 912
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܳᩴۢ;

    .line 913
    iget-object v2, v1, Ll/ܳᩴۢ;->֫:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    .line 917
    :cond_1
    iget-object v0, p0, Ll/᩺ᩴۢ;->ۘ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܳᩴۢ;

    return-object p1
.end method

.method private ᩳ(J)V
    .locals 9

    .line 1050
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    iget-object v1, p0, Ll/᩺ᩴۢ;->ۖ:Ljava/security/SecureRandom;

    const v2, 0xf4240

    invoke-virtual {v1, v2}, Ljava/util/Random;->nextInt(I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const-string v1, "%06d"

    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    iput-object v6, p0, Ll/᩺ᩴۢ;->᩻:Ljava/lang/String;

    .line 1051
    sget-wide v0, Ll/᩺ᩴۢ;->᩸:J

    add-long v7, p1, v0

    iput-wide v7, p0, Ll/᩺ᩴۢ;->᩷:J

    .line 1052
    iget-object p1, p0, Ll/᩺ᩴۢ;->ۜ:Ll/۬֡ۢ;

    if-eqz p1, :cond_0

    .line 1053
    iget-object p2, p1, Ll/۬֡ۢ;->᩸:Ljava/lang/Object;

    move-object v5, p2

    check-cast v5, Ll/᩺֡ۢ;

    iget-object p1, p1, Ll/۬֡ۢ;->᩹:Ljava/lang/Object;

    check-cast p1, Ll/۟ۢۡ;

    .line 76
    iget-object p1, p1, Ll/۟ۢۡ;->᩹:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Ll/֫ۚۢ;

    sget p1, Ll/֫ۚۢ;->ۤ:I

    .line 273
    new-instance p1, Ll/۟֡ۢ;

    move-object v3, p1

    invoke-direct/range {v3 .. v8}, Ll/۟֡ۢ;-><init>(Ll/֫ۚۢ;Ll/᩺֡ۢ;Ljava/lang/String;J)V

    invoke-static {p1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method private ᩳ(JLjava/lang/String;)V
    .locals 8

    .line 1087
    iget-object v0, p0, Ll/᩺ᩴۢ;->ۢ:Ljava/util/HashMap;

    invoke-virtual {v0, p3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۬ᩴۢ;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 1088
    iget-wide v3, v1, Ll/۬ᩴۢ;->֫:J

    const-wide/16 v5, 0x0

    cmp-long v7, v3, v5

    if-lez v7, :cond_1

    cmp-long v5, p1, v3

    if-ltz v5, :cond_1

    .line 1090
    :cond_0
    new-instance v1, Ll/۬ᩴۢ;

    invoke-direct {v1, v2}, Ll/۬ᩴۢ;-><init>(I)V

    .line 1091
    invoke-virtual {v0, p3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1093
    :cond_1
    iget p3, v1, Ll/۬ᩴۢ;->ۧ:I

    add-int/lit8 p3, p3, 0x1

    iput p3, v1, Ll/۬ᩴۢ;->ۧ:I

    const/4 v0, 0x5

    if-lt p3, v0, :cond_2

    .line 1095
    sget-wide v3, Ll/᩺ᩴۢ;->ܶ:J

    add-long/2addr p1, v3

    iput-wide p1, v1, Ll/۬ᩴۢ;->֫:J

    .line 1096
    iput v2, v1, Ll/۬ᩴۢ;->ۧ:I

    :cond_2
    return-void
.end method

.method public static ᩷(Ll/ܺܳܳ;)Ljava/lang/String;
    .locals 9

    .line 697
    sget-object v0, Ll/ۘܳܳ;->ܰ:Ll/ۘܳܳ;

    invoke-virtual {p0}, Ll/ܺܳܳ;->ܳ()Ll/ۘܳܳ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    const-string v2, "path"

    const-string v3, "\n"

    if-eqz v1, :cond_0

    const-string v1, "/api/file-upload-content"

    invoke-virtual {p0}, Ll/ܺܳܳ;->ۡ()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v0, "taskId"

    .line 664
    invoke-static {p0, v0}, Ll/ܿۚۢ;->ۧ(Ll/ۖܳܳ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 665
    invoke-static {p0, v2}, Ll/ܿۚۢ;->ۧ(Ll/ۖܳܳ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "armToken"

    .line 666
    invoke-static {p0, v2}, Ll/ܿۚۢ;->ۧ(Ll/ۖܳܳ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 669
    :try_start_0
    invoke-static {p0}, Ll/ܿۚۢ;->ܳ(Ll/ܺܳܳ;)J

    move-result-wide v4
    :try_end_0
    .catch Ll/ۧۚۢ; {:try_start_0 .. :try_end_0} :catch_0

    .line 673
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 674
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 675
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 677
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "UPLOAD:v1:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    invoke-static {p0}, Ll/᩺ᩴۢ;->֫([B)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :catch_0
    move-exception p0

    .line 671
    new-instance v0, Ll/ۨᩴۢ;

    sget-object v1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    iget v2, p0, Ll/ۧۚۢ;->᩹:I

    iget-object p0, p0, Ll/ۧۚۢ;->᩸:[Ljava/lang/Object;

    invoke-direct {v0, v1, v2, p0}, Ll/ۨᩴۢ;-><init>(Ll/֨ܳܳ;I[Ljava/lang/Object;)V

    throw v0

    .line 738
    :cond_0
    sget-object v1, Ll/ۘܳܳ;->ۧ֫:Ll/ۘܳܳ;

    invoke-virtual {p0}, Ll/ܺܳܳ;->ܳ()Ll/ۘܳܳ;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    const v4, 0x7f12081f

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    if-eqz v1, :cond_6

    const-string v1, "/api/text-file"

    invoke-virtual {p0}, Ll/ܺܳܳ;->ۡ()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 702
    invoke-static {p0}, Ll/᩺ᩴۢ;->ܳ(Ll/ܺܳܳ;)J

    move-result-wide v0

    cmp-long v8, v0, v5

    if-ltz v8, :cond_5

    .line 708
    :try_start_1
    invoke-static {p0, v0, v1}, Ll/ܿۚۢ;->֫(Ll/ܺܳܳ;J)Ll/ᩳۚۢ;

    move-result-object v4
    :try_end_1
    .catch Ll/ܽۚۢ; {:try_start_1 .. :try_end_1} :catch_1

    .line 713
    invoke-static {p0, v2}, Ll/ܿۚۢ;->ۧ(Ll/ۖܳܳ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v5, "lineBreak"

    .line 714
    invoke-static {p0, v5}, Ll/ܿۚۢ;->ۧ(Ll/ۖܳܳ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "X-MT-Text-Parameters-Token"

    .line 715
    invoke-static {p0, v6}, Ll/ܿۚۢ;->֫(Ll/ۖܳܳ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "charsetIndex"

    .line 716
    invoke-static {p0, v7}, Ll/ܿۚۢ;->ۧ(Ll/ۖܳܳ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    iget-object v4, v4, Ll/ᩳۚۢ;->֫:[B

    const/16 v7, 0xb

    .line 1920
    invoke-static {v4, v7}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v4

    .line 725
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, ""

    if-nez v2, :cond_1

    move-object v2, v8

    :cond_1
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez v5, :cond_2

    move-object v5, v8

    .line 726
    :cond_2
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez v6, :cond_3

    move-object v6, v8

    .line 727
    :cond_3
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez p0, :cond_4

    move-object p0, v8

    .line 728
    :cond_4
    invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 0
    invoke-static {v7, v3, v4}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 720
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "TEXT_SAVE:v1:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    invoke-static {p0}, Ll/᩺ᩴۢ;->֫([B)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 710
    :catch_1
    new-instance p0, Ll/ۨᩴۢ;

    sget-object v0, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    const v1, 0x7f12082b

    new-array v2, v7, [Ljava/lang/Object;

    invoke-direct {p0, v0, v1, v2}, Ll/ۨᩴۢ;-><init>(Ll/֨ܳܳ;I[Ljava/lang/Object;)V

    throw p0

    .line 704
    :cond_5
    new-instance p0, Ll/ۨᩴۢ;

    sget-object v0, Ll/֨ܳܳ;->۟:Ll/֨ܳܳ;

    new-array v1, v7, [Ljava/lang/Object;

    invoke-direct {p0, v0, v4, v1}, Ll/ۨᩴۢ;-><init>(Ll/֨ܳܳ;I[Ljava/lang/Object;)V

    throw p0

    .line 682
    :cond_6
    invoke-static {p0}, Ll/᩺ᩴۢ;->ܳ(Ll/ܺܳܳ;)J

    move-result-wide v1

    cmp-long v3, v1, v5

    if-gez v3, :cond_9

    .line 745
    invoke-static {p0}, Ll/ܿۚۢ;->ۧ(Ll/ܺܳܳ;)Z

    move-result v5

    if-nez v5, :cond_8

    .line 748
    invoke-static {p0}, Ll/ܿۚۢ;->ܽ(Ll/ܺܳܳ;)Z

    move-result v5

    if-nez v5, :cond_7

    goto :goto_0

    .line 751
    :cond_7
    invoke-virtual {p0}, Ll/ܺܳܳ;->ܳ()Ll/ۘܳܳ;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 754
    invoke-virtual {p0}, Ll/ܺܳܳ;->ۡ()Ljava/lang/String;

    move-result-object v0

    const-string v5, "/api/file-rename"

    .line 755
    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_9

    const-string v5, "/api/file-upload-prepare"

    .line 756
    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_9

    const-string v5, "/api/file-upload-begin"

    .line 757
    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_9

    const-string v5, "/api/file-upload-complete"

    .line 758
    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    goto :goto_0

    .line 684
    :cond_8
    new-instance p0, Ll/ۨᩴۢ;

    sget-object v0, Ll/֨ܳܳ;->۟:Ll/֨ܳܳ;

    new-array v1, v7, [Ljava/lang/Object;

    invoke-direct {p0, v0, v4, v1}, Ll/ۨᩴۢ;-><init>(Ll/֨ܳܳ;I[Ljava/lang/Object;)V

    throw p0

    :cond_9
    :goto_0
    const-wide/32 v4, 0x800000

    cmp-long v0, v1, v4

    if-gtz v0, :cond_b

    if-lez v3, :cond_a

    .line 691
    invoke-static {p0}, Ll/ܿۚۢ;->ᩳ(Ll/ܺܳܳ;)Ljava/lang/String;

    move-result-object p0

    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    invoke-static {p0}, Ll/᩺ᩴۢ;->֫([B)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_a
    new-array p0, v7, [B

    .line 693
    invoke-static {p0}, Ll/᩺ᩴۢ;->֫([B)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 688
    :cond_b
    new-instance p0, Ll/ۨᩴۢ;

    sget-object v0, Ll/֨ܳܳ;->ۢ֫:Ll/֨ܳܳ;

    const v1, 0x7f12082c

    new-array v2, v7, [Ljava/lang/Object;

    invoke-direct {p0, v0, v1, v2}, Ll/ۨᩴۢ;-><init>(Ll/֨ܳܳ;I[Ljava/lang/Object;)V

    throw p0
.end method

.method public static ᩻(Ll/ܺܳܳ;)Ljava/lang/String;
    .locals 1

    .line 1113
    invoke-virtual {p0}, Ll/ܺܳܳ;->ۢ()Ljava/lang/String;

    move-result-object p0

    .line 1114
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p0, ""

    :cond_0
    return-object p0
.end method

.method public static ᩻(Ljava/lang/String;)Ll/۫ᩴۢ;
    .locals 5

    .line 391
    invoke-static {p0}, Ll/ۜ֡ۢ;->֫(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    .line 392
    new-instance v0, Ll/۫ᩴۢ;

    .line 2082
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-string v1, "code"

    .line 393
    invoke-static {p0, v1}, Ll/ۜ֡ۢ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ll/۫ᩴۢ;->ۧ:Ljava/lang/String;

    const-string v1, "deviceName"

    .line 394
    invoke-static {p0, v1}, Ll/ۜ֡ۢ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ll/۫ᩴۢ;->ܽ:Ljava/lang/String;

    const/4 v1, 0x0

    :try_start_0
    const-string v2, "clientHints"

    .line 1180
    invoke-virtual {p0, v2}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_4

    if-nez v2, :cond_0

    goto :goto_3

    .line 1187
    :cond_0
    new-instance v3, Ll/᩶ᩴۢ;

    .line 2093
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 2094
    sget-object v4, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v4, v3, Ll/᩶ᩴۢ;->֫:Ljava/util/List;

    .line 2095
    iput-object v4, v3, Ll/᩶ᩴۢ;->ۧ:Ljava/util/List;

    const-string v4, "platform"

    .line 1203
    :try_start_1
    invoke-virtual {v2, v4}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ll/᩺ᩴۢ;->ۜ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-object v4, v1

    .line 1188
    :goto_0
    iput-object v4, v3, Ll/᩶ᩴۢ;->ܿ:Ljava/lang/String;

    const-string v4, "platformVersion"

    .line 1203
    :try_start_2
    invoke-virtual {v2, v4}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ll/᩺ᩴۢ;->ۜ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_1

    :catch_1
    move-object v4, v1

    .line 1189
    :goto_1
    iput-object v4, v3, Ll/᩶ᩴۢ;->ܳ:Ljava/lang/String;

    const-string v4, "model"

    .line 1203
    :try_start_3
    invoke-virtual {v2, v4}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ll/᩺ᩴۢ;->ۜ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_2

    :catch_2
    move-object v4, v1

    .line 1190
    :goto_2
    iput-object v4, v3, Ll/᩶ᩴۢ;->ᩳ:Ljava/lang/String;

    const-string v4, "mobile"

    .line 1215
    :try_start_4
    invoke-virtual {v2, v4}, Lbin/mt/json/JSONObject;->getBooleanObject(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v1
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_3

    .line 1191
    :catch_3
    iput-object v1, v3, Ll/᩶ᩴۢ;->ܽ:Ljava/lang/Boolean;

    const-string v1, "brands"

    .line 1192
    invoke-static {v2, v1}, Ll/᩺ᩴۢ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    iput-object v1, v3, Ll/᩶ᩴۢ;->֫:Ljava/util/List;

    const-string v1, "fullVersionList"

    .line 1193
    invoke-static {v2, v1}, Ll/᩺ᩴۢ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    iput-object v1, v3, Ll/᩶ᩴۢ;->ۧ:Ljava/util/List;

    move-object v1, v3

    .line 395
    :catch_4
    :goto_3
    iput-object v1, v0, Ll/۫ᩴۢ;->֫:Ll/᩶ᩴۢ;

    const-string v1, "publicKey"

    .line 164
    :try_start_5
    invoke-virtual {p0, v1}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1
    :try_end_5
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_5

    .line 396
    iput-object v1, v0, Ll/۫ᩴۢ;->ᩳ:Lbin/mt/json/JSONObject;

    const-string v1, "trust"

    .line 397
    invoke-static {p0, v1}, Ll/ۜ֡ۢ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Z

    move-result p0

    iput-boolean p0, v0, Ll/۫ᩴۢ;->ܿ:Z

    return-object v0

    :catch_5
    move-exception p0

    .line 166
    invoke-static {p0}, Ll/ۜ֡ۢ;->֫(Ljava/lang/RuntimeException;)Ll/᩻֡ۢ;

    move-result-object p0

    throw p0
.end method

.method private ᩻()Z
    .locals 1

    .line 1046
    iget-object v0, p0, Ll/᩺ᩴۢ;->ܽ:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method


# virtual methods
.method public final ֫()Ljava/util/ArrayList;
    .locals 4

    .line 300
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    .line 301
    iget-object v0, p0, Ll/᩺ᩴۢ;->ܿ:Ljava/lang/Object;

    monitor-enter v0

    .line 302
    :try_start_0
    invoke-direct {p0, v1, v2}, Ll/᩺ᩴۢ;->ܽ(J)V

    .line 303
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 967
    iget-object v2, p0, Ll/᩺ᩴۢ;->ᩳ:Ll/᩻ᩴۢ;

    invoke-virtual {v2}, Ll/᩻ᩴۢ;->֫()Ljava/util/ArrayList;

    move-result-object v2

    .line 304
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܳᩴۢ;

    .line 305
    invoke-static {v3}, Ll/᩻ᩴۢ;->֫(Ll/ܳᩴۢ;)Ll/ܽᩴۢ;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 307
    :cond_0
    iget-object v2, p0, Ll/᩺ᩴۢ;->ۘ:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܳᩴۢ;

    .line 308
    invoke-static {v3}, Ll/᩻ᩴۢ;->֫(Ll/ܳᩴۢ;)Ll/ܽᩴۢ;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 310
    :cond_1
    invoke-static {v1}, Ll/᩻ᩴۢ;->ۧ(Ljava/util/ArrayList;)V

    .line 311
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 312
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ֫(Ll/ܶᩴۢ;)Ljava/util/LinkedHashMap;
    .locals 6

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 287
    :cond_0
    iget-object p1, p1, Ll/ܶᩴۢ;->ܽ:Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    .line 905
    iget-object v0, p0, Ll/᩺ᩴۢ;->ܿ:Ljava/lang/Object;

    monitor-enter v0

    .line 906
    :try_start_0
    invoke-direct {p0, v1, v2}, Ll/᩺ᩴۢ;->ܽ(J)V

    .line 907
    invoke-direct {p0, p1}, Ll/᩺ᩴۢ;->ᩳ(Ljava/lang/String;)Ll/ܳᩴۢ;

    move-result-object p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 288
    :goto_0
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    const-string v1, "authenticated"

    if-eqz p1, :cond_1

    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    .line 289
    :goto_1
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p1, :cond_2

    const-string v1, "device"

    .line 1893
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    const-string v3, "deviceId"

    .line 1894
    iget-object v4, p1, Ll/ܳᩴۢ;->֫:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "deviceName"

    .line 1895
    iget-object v4, p1, Ll/ܳᩴۢ;->ۧ:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "firstAccessAt"

    .line 1896
    iget-wide v4, p1, Ll/ܳᩴۢ;->ܽ:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "lastAccessAt"

    .line 1897
    iget-wide v4, p1, Ll/ܳᩴۢ;->ᩳ:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "lastIp"

    .line 1898
    iget-object v4, p1, Ll/ܳᩴۢ;->ܿ:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "userAgent"

    .line 1899
    iget-object v4, p1, Ll/ܳᩴۢ;->ۜ:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "temporary"

    .line 1900
    iget-boolean p1, p1, Ll/ܳᩴۢ;->᩻:Z

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v2, v3, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 291
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-object v0

    :catchall_0
    move-exception p1

    .line 908
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ֫(Ll/ܶᩴۢ;Ljava/lang/String;)Ljava/util/LinkedHashMap;
    .locals 6

    const/4 v1, 0x0

    .line 405
    :try_start_0
    invoke-static {p2}, Ll/ۜ֡ۢ;->֫(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p2

    .line 406
    new-instance v0, Ll/ۗᩴۢ;

    .line 2119
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-string v2, "path"

    .line 407
    invoke-static {p2, v2}, Ll/ۜ֡ۢ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Ll/ۗᩴۢ;->ۧ:Ljava/lang/String;

    const-string v2, "disposition"

    .line 408
    invoke-static {p2, v2}, Ll/ۜ֡ۢ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, v0, Ll/ۗᩴۢ;->֫:Ljava/lang/String;
    :try_end_0
    .catch Ll/᩻֡ۢ; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    .line 365
    iget-object p2, v0, Ll/ۗᩴۢ;->ۧ:Ljava/lang/String;

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_1

    const-string p2, "inline"

    iget-object v2, v0, Ll/ۗᩴۢ;->֫:Ljava/lang/String;

    .line 366
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    const-string p2, "attachment"

    iget-object v2, v0, Ll/ۗᩴۢ;->֫:Ljava/lang/String;

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_1

    .line 369
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const/16 p2, 0x20

    new-array p2, p2, [B

    .line 1906
    iget-object v3, p0, Ll/᩺ᩴۢ;->ۖ:Ljava/security/SecureRandom;

    invoke-virtual {v3, p2}, Ljava/security/SecureRandom;->nextBytes([B)V

    const/16 v3, 0xb

    .line 1920
    invoke-static {p2, v3}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object p2

    .line 371
    new-instance v3, Ll/ۙᩴۢ;

    const/4 v4, 0x0

    invoke-direct {v3, v4}, Ll/ۙᩴۢ;-><init>(I)V

    .line 373
    iget-object p1, p1, Ll/ܶᩴۢ;->ܽ:Ljava/lang/String;

    iput-object p1, v3, Ll/ۙᩴۢ;->֫:Ljava/lang/String;

    .line 374
    iget-object p1, v0, Ll/ۗᩴۢ;->ۧ:Ljava/lang/String;

    iput-object p1, v3, Ll/ۙᩴۢ;->ᩳ:Ljava/lang/String;

    .line 375
    iget-object p1, v0, Ll/ۗᩴۢ;->֫:Ljava/lang/String;

    iput-object p1, v3, Ll/ۙᩴۢ;->ۧ:Ljava/lang/String;

    .line 376
    sget-wide v4, Ll/᩺ᩴۢ;->ۚ:J

    add-long/2addr v4, v1

    iput-wide v4, v3, Ll/ۙᩴۢ;->ܽ:J

    .line 377
    iget-object p1, p0, Ll/᩺ᩴۢ;->ܿ:Ljava/lang/Object;

    move-object v0, p1

    monitor-enter v0

    .line 1012
    :try_start_1
    iget-object p1, p0, Ll/᩺ᩴۢ;->ۧ:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object p1

    new-instance v4, Ll/ܺᩴۢ;

    invoke-direct {v4, v1, v2}, Ll/ܺᩴۢ;-><init>(J)V

    invoke-static {p1, v4}, Ll/ۚ۬ᩴ;->removeIf(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    .line 379
    iget-object p1, p0, Ll/᩺ᩴۢ;->ۧ:Ljava/util/HashMap;

    invoke-virtual {p1, p2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 380
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 381
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    const-string v0, "ticket"

    .line 382
    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p2, "expiresAt"

    .line 383
    iget-wide v0, v3, Ll/ۙᩴۢ;->ܽ:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1

    :catchall_0
    move-exception p1

    .line 380
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    :cond_1
    :goto_1
    return-object v1
.end method

.method public final ֫(Ll/ܶᩴۢ;Ll/֨ᩴۢ;)Ljava/util/LinkedHashMap;
    .locals 5

    if-eqz p1, :cond_0

    .line 419
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const/16 v0, 0x20

    new-array v0, v0, [B

    .line 1906
    iget-object v3, p0, Ll/᩺ᩴۢ;->ۖ:Ljava/security/SecureRandom;

    invoke-virtual {v3, v0}, Ljava/security/SecureRandom;->nextBytes([B)V

    const/16 v3, 0xb

    .line 1920
    invoke-static {v0, v3}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v3

    .line 421
    new-instance v4, Ll/۠ᩴۢ;

    const/4 v0, 0x0

    invoke-direct {v4, v0}, Ll/۠ᩴۢ;-><init>(I)V

    .line 423
    iget-object p1, p1, Ll/ܶᩴۢ;->ܽ:Ljava/lang/String;

    iput-object p1, v4, Ll/۠ᩴۢ;->ۧ:Ljava/lang/String;

    .line 424
    iput-object p2, v4, Ll/۠ᩴۢ;->֫:Ll/֨ᩴۢ;

    .line 425
    sget-wide p1, Ll/᩺ᩴۢ;->ۚ:J

    add-long/2addr p1, v1

    iput-wide p1, v4, Ll/۠ᩴۢ;->ܽ:J

    .line 426
    iget-object p1, p0, Ll/᩺ᩴۢ;->ܿ:Ljava/lang/Object;

    move-object v0, p1

    monitor-enter v0

    .line 1016
    :try_start_0
    iget-object p1, p0, Ll/᩺ᩴۢ;->֫:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object p1

    new-instance p2, Ll/᩵ᩴۢ;

    invoke-direct {p2, v1, v2}, Ll/᩵ᩴۢ;-><init>(J)V

    invoke-static {p1, p2}, Ll/ۚ۬ᩴ;->removeIf(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    .line 428
    iget-object p1, p0, Ll/᩺ᩴۢ;->֫:Ljava/util/HashMap;

    invoke-virtual {p1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 429
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 430
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    const-string p2, "ticket"

    .line 431
    invoke-interface {p1, p2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p2, "expiresAt"

    .line 432
    iget-wide v0, v4, Ll/۠ᩴۢ;->ܽ:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1

    :catchall_0
    move-exception p1

    .line 429
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫(Ll/ܺܳܳ;Ljava/lang/String;)Ll/ۤᩴۢ;
    .locals 11

    .line 161
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    .line 162
    invoke-static {p1}, Ll/᩺ᩴۢ;->᩻(Ll/ܺܳܳ;)Ljava/lang/String;

    move-result-object v0

    .line 163
    iget-object v1, p0, Ll/᩺ᩴۢ;->ܿ:Ljava/lang/Object;

    monitor-enter v1

    .line 164
    :try_start_0
    invoke-direct {p0, v7, v8, v0}, Ll/᩺ᩴۢ;->֫(JLjava/lang/String;)Ll/ۤᩴۢ;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 166
    monitor-exit v1

    return-object v2

    :catchall_0
    move-exception p1

    goto/16 :goto_3

    .line 168
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const v1, 0x7f120813

    const/4 v2, 0x0

    .line 172
    :try_start_1
    invoke-static {p2}, Ll/᩺ᩴۢ;->᩻(Ljava/lang/String;)Ll/۫ᩴۢ;

    move-result-object p2
    :try_end_1
    .catch Ll/᩻֡ۢ; {:try_start_1 .. :try_end_1} :catch_1

    .line 177
    iget-object v3, p2, Ll/۫ᩴۢ;->ۧ:Ljava/lang/String;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_5

    iget-object v3, p2, Ll/۫ᩴۢ;->ᩳ:Lbin/mt/json/JSONObject;

    if-nez v3, :cond_1

    goto/16 :goto_2

    .line 182
    :cond_1
    iget-object v1, p0, Ll/᩺ᩴۢ;->ܿ:Ljava/lang/Object;

    monitor-enter v1

    .line 183
    :try_start_2
    invoke-direct {p0, v7, v8}, Ll/᩺ᩴۢ;->֫(J)V

    .line 184
    iget-object v3, p2, Ll/۫ᩴۢ;->ۧ:Ljava/lang/String;

    invoke-direct {p0, v7, v8, v3}, Ll/᩺ᩴۢ;->ۧ(JLjava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 185
    invoke-direct {p0, v7, v8, v0}, Ll/᩺ᩴۢ;->ᩳ(JLjava/lang/String;)V

    .line 186
    invoke-static {}, Ll/ۤᩴۢ;->֫()Ll/ۤᩴۢ;

    move-result-object p1

    monitor-exit v1

    return-object p1

    :catchall_1
    move-exception p1

    goto :goto_1

    .line 188
    :cond_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 192
    :try_start_3
    iget-object v1, p2, Ll/۫ᩴۢ;->ᩳ:Lbin/mt/json/JSONObject;

    invoke-static {v1}, Ll/᩺ᩴۢ;->֫(Lbin/mt/json/JSONObject;)Ll/ۛᩴۢ;

    move-result-object v9
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 198
    iget-object v10, p0, Ll/᩺ᩴۢ;->ܿ:Ljava/lang/Object;

    monitor-enter v10

    .line 200
    :try_start_4
    invoke-direct {p0, v7, v8}, Ll/᩺ᩴۢ;->֫(J)V

    .line 201
    iget-object v1, p2, Ll/۫ᩴۢ;->ۧ:Ljava/lang/String;

    invoke-direct {p0, v7, v8, v1}, Ll/᩺ᩴۢ;->ۧ(JLjava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 202
    invoke-direct {p0, v7, v8, v0}, Ll/᩺ᩴۢ;->ᩳ(JLjava/lang/String;)V

    .line 203
    invoke-static {}, Ll/ۤᩴۢ;->֫()Ll/ۤᩴۢ;

    move-result-object p1

    monitor-exit v10

    return-object p1

    :catchall_2
    move-exception p1

    goto :goto_0

    .line 205
    :cond_3
    iget-object v1, p0, Ll/᩺ᩴۢ;->ۢ:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 206
    invoke-static {p1, p2}, Ll/᩺ᩴۢ;->֫(Ll/ܺܳܳ;Ll/۫ᩴۢ;)Ljava/lang/String;

    move-result-object v2

    iget-boolean v3, p2, Ll/۫ᩴۢ;->ܿ:Z

    move-object v0, p0

    move-object v1, v9

    move-wide v4, v7

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Ll/᩺ᩴۢ;->֫(Ll/ۛᩴۢ;Ljava/lang/String;ZJLl/ܺܳܳ;)V

    .line 207
    invoke-direct {p0}, Ll/᩺ᩴۢ;->᩻()Z

    move-result p1

    if-nez p1, :cond_4

    .line 208
    invoke-direct {p0, v7, v8}, Ll/᩺ᩴۢ;->ᩳ(J)V

    .line 209
    invoke-direct {p0}, Ll/᩺ᩴۢ;->ۜ()V

    .line 211
    :cond_4
    iget-object p1, v9, Ll/ۛᩴۢ;->ۧ:Ljava/lang/String;

    invoke-static {p1}, Ll/ۤᩴۢ;->֫(Ljava/lang/String;)Ll/ۤᩴۢ;

    move-result-object p1

    monitor-exit v10

    return-object p1

    .line 212
    :goto_0
    monitor-exit v10
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    throw p1

    .line 194
    :catch_0
    invoke-direct {p0, v7, v8, v0}, Ll/᩺ᩴۢ;->ܽ(JLjava/lang/String;)V

    const p1, 0x7f120814

    new-array p2, v2, [Ljava/lang/Object;

    .line 195
    invoke-static {p1, p2}, Ll/ۤᩴۢ;->֫(I[Ljava/lang/Object;)Ll/ۤᩴۢ;

    move-result-object p1

    return-object p1

    .line 188
    :goto_1
    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw p1

    .line 178
    :cond_5
    :goto_2
    invoke-direct {p0, v7, v8, v0}, Ll/᩺ᩴۢ;->ܽ(JLjava/lang/String;)V

    new-array p1, v2, [Ljava/lang/Object;

    .line 179
    invoke-static {v1, p1}, Ll/ۤᩴۢ;->֫(I[Ljava/lang/Object;)Ll/ۤᩴۢ;

    move-result-object p1

    return-object p1

    .line 174
    :catch_1
    invoke-direct {p0, v7, v8, v0}, Ll/᩺ᩴۢ;->ܽ(JLjava/lang/String;)V

    new-array p1, v2, [Ljava/lang/Object;

    .line 175
    invoke-static {v1, p1}, Ll/ۤᩴۢ;->֫(I[Ljava/lang/Object;)Ll/ۤᩴۢ;

    move-result-object p1

    return-object p1

    .line 168
    :goto_3
    :try_start_6
    monitor-exit v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    throw p1
.end method

.method public final ֫(Ll/ܺܳܳ;)Ll/᩸ᩴۢ;
    .locals 14

    .line 514
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const-string v0, "X-MT-Auth-Device"

    .line 515
    invoke-static {p1, v0}, Ll/ܿۚۢ;->֫(Ll/ۖܳܳ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-string v0, "X-MT-Auth-Timestamp"

    .line 516
    invoke-static {p1, v0}, Ll/ܿۚۢ;->֫(Ll/ۖܳܳ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v0, "X-MT-Auth-Nonce"

    .line 517
    invoke-static {p1, v0}, Ll/ܿۚۢ;->֫(Ll/ۖܳܳ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v0, "X-MT-Auth-Content-SHA256"

    .line 518
    invoke-static {p1, v0}, Ll/ܿۚۢ;->֫(Ll/ۖܳܳ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v0, "X-MT-Auth-Signature"

    .line 519
    invoke-static {p1, v0}, Ll/ܿۚۢ;->֫(Ll/ۖܳܳ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 520
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v7, 0x0

    if-nez v0, :cond_f

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_f

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_f

    .line 521
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_f

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_6

    :cond_0
    const v8, 0x7f120810

    .line 526
    :try_start_0
    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v10
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_3

    sub-long v10, v1, v10

    .line 530
    invoke-static {v10, v11}, Ljava/lang/Math;->abs(J)J

    move-result-wide v10

    sget-wide v12, Ll/᩺ᩴۢ;->᩹:J

    cmp-long v0, v10, v12

    if-lez v0, :cond_1

    .line 531
    invoke-static {}, Ll/᩸ᩴۢ;->֫()Ll/᩸ᩴۢ;

    move-result-object p1

    return-object p1

    .line 535
    :cond_1
    iget-object v0, p0, Ll/᩺ᩴۢ;->ܿ:Ljava/lang/Object;

    monitor-enter v0

    .line 536
    :try_start_1
    invoke-direct {p0, v1, v2}, Ll/᩺ᩴۢ;->ܽ(J)V

    .line 537
    invoke-direct {p0, v1, v2}, Ll/᩺ᩴۢ;->ۧ(J)V

    .line 538
    invoke-direct {p0, v9}, Ll/᩺ᩴۢ;->ᩳ(Ljava/lang/String;)Ll/ܳᩴۢ;

    move-result-object v1

    const v2, 0x7f120817

    if-nez v1, :cond_2

    new-array p1, v7, [Ljava/lang/Object;

    .line 1994
    sget-object v1, Ll/֨ܳܳ;->۠֫:Ll/֨ܳܳ;

    invoke-static {v1, v2, p1}, Ll/᩸ᩴۢ;->֫(Ll/֨ܳܳ;I[Ljava/lang/Object;)Ll/᩸ᩴۢ;

    move-result-object p1

    .line 540
    monitor-exit v0

    return-object p1

    .line 998
    :cond_2
    iget-object v10, p0, Ll/᩺ᩴۢ;->ܳ:Ljava/util/HashMap;

    invoke-virtual {v10, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/Map;

    if-eqz v10, :cond_3

    .line 999
    invoke-interface {v10, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_3

    const/4 v10, 0x1

    goto :goto_0

    :cond_3
    const/4 v10, 0x0

    :goto_0
    const v11, 0x7f120815

    if-eqz v10, :cond_4

    new-array p1, v7, [Ljava/lang/Object;

    .line 1994
    sget-object v1, Ll/֨ܳܳ;->۠֫:Ll/֨ܳܳ;

    invoke-static {v1, v11, p1}, Ll/᩸ᩴۢ;->֫(Ll/֨ܳܳ;I[Ljava/lang/Object;)Ll/᩸ᩴۢ;

    move-result-object p1

    .line 543
    monitor-exit v0

    return-object p1

    .line 545
    :cond_4
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 793
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v10, "MT-REMOTE-AUTH-v1\n"

    invoke-direct {v0, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 794
    invoke-virtual {p1}, Ll/ܺܳܳ;->ܳ()Ll/ۘܳܳ;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, "\n"

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 802
    invoke-virtual {p1}, Ll/ܺܳܳ;->᩷()Ljava/lang/String;

    move-result-object v11

    .line 803
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v12

    if-eqz v12, :cond_5

    .line 804
    invoke-virtual {p1}, Ll/ܺܳܳ;->ۡ()Ljava/lang/String;

    move-result-object v11

    goto :goto_1

    .line 806
    :cond_5
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ll/ܺܳܳ;->ۡ()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v13, "?"

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    .line 0
    :goto_1
    invoke-static {v0, v11, v10, v3, v10}, Lorg/bouncycastle/asn1/ASN1BMPString$$ExternalSyntheticOutline0;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0, v4, v10, v5}, Ll/᩺᩵ܿ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :try_start_2
    const-string v3, "SHA256withECDSA"

    .line 811
    invoke-static {v3}, Ljava/security/Signature;->getInstance(Ljava/lang/String;)Ljava/security/Signature;

    move-result-object v3

    .line 821
    iget-object v1, v1, Ll/ܳᩴۢ;->ܳ:Ljava/lang/String;

    invoke-static {v1}, Ll/ۜ֡ۢ;->֫(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-static {v1}, Ll/᩺ᩴۢ;->֫(Lbin/mt/json/JSONObject;)Ll/ۛᩴۢ;

    move-result-object v1

    .line 822
    iget-object v1, v1, Ll/ۛᩴۢ;->ܽ:Ljava/security/interfaces/ECPublicKey;

    .line 812
    invoke-virtual {v3, v1}, Ljava/security/Signature;->initVerify(Ljava/security/PublicKey;)V

    .line 813
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/security/Signature;->update([B)V

    const/16 v0, 0xb

    .line 1924
    invoke-static {v6, v0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v0

    .line 814
    invoke-virtual {v3, v0}, Ljava/security/Signature;->verify([B)Z

    move-result v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_2

    :catch_0
    const/4 v0, 0x0

    :goto_2
    if-nez v0, :cond_6

    new-array p1, v7, [Ljava/lang/Object;

    .line 1994
    sget-object v0, Ll/֨ܳܳ;->۠֫:Ll/֨ܳܳ;

    invoke-static {v0, v8, p1}, Ll/᩸ᩴۢ;->֫(Ll/֨ܳܳ;I[Ljava/lang/Object;)Ll/᩸ᩴۢ;

    move-result-object p1

    goto/16 :goto_5

    .line 554
    :cond_6
    :try_start_3
    invoke-static {p1}, Ll/᩺ᩴۢ;->᩷(Ll/ܺܳܳ;)Ljava/lang/String;

    move-result-object v0
    :try_end_3
    .catch Ll/ۨᩴۢ; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 560
    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    new-array p1, v7, [Ljava/lang/Object;

    .line 1994
    sget-object v0, Ll/֨ܳܳ;->۠֫:Ll/֨ܳܳ;

    invoke-static {v0, v8, p1}, Ll/᩸ᩴۢ;->֫(Ll/֨ܳܳ;I[Ljava/lang/Object;)Ll/᩸ᩴۢ;

    move-result-object p1

    goto/16 :goto_5

    .line 564
    :cond_7
    iget-object v0, p0, Ll/᩺ᩴۢ;->ܿ:Ljava/lang/Object;

    monitor-enter v0

    .line 565
    :try_start_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    .line 566
    invoke-direct {p0, v5, v6}, Ll/᩺ᩴۢ;->ܽ(J)V

    .line 567
    invoke-direct {p0, v5, v6}, Ll/᩺ᩴۢ;->ۧ(J)V

    .line 568
    invoke-direct {p0, v9}, Ll/᩺ᩴۢ;->ᩳ(Ljava/lang/String;)Ll/ܳᩴۢ;

    move-result-object v1

    if-nez v1, :cond_8

    new-array p1, v7, [Ljava/lang/Object;

    .line 1994
    sget-object v1, Ll/֨ܳܳ;->۠֫:Ll/֨ܳܳ;

    invoke-static {v1, v2, p1}, Ll/᩸ᩴۢ;->֫(Ll/֨ܳܳ;I[Ljava/lang/Object;)Ll/᩸ᩴۢ;

    move-result-object p1

    .line 570
    monitor-exit v0

    goto/16 :goto_5

    .line 998
    :cond_8
    iget-object v1, p0, Ll/᩺ᩴۢ;->ܳ:Ljava/util/HashMap;

    invoke-virtual {v1, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    if-eqz v1, :cond_9

    .line 999
    invoke-interface {v1, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    const/4 v1, 0x1

    goto :goto_3

    :cond_9
    const/4 v1, 0x0

    :goto_3
    if-eqz v1, :cond_a

    new-array p1, v7, [Ljava/lang/Object;

    .line 1994
    sget-object v1, Ll/֨ܳܳ;->۠֫:Ll/֨ܳܳ;

    const v2, 0x7f120815

    invoke-static {v1, v2, p1}, Ll/᩸ᩴۢ;->֫(Ll/֨ܳܳ;I[Ljava/lang/Object;)Ll/᩸ᩴۢ;

    move-result-object p1

    .line 573
    monitor-exit v0

    goto/16 :goto_5

    .line 1003
    :cond_a
    iget-object v1, p0, Ll/᩺ᩴۢ;->ܳ:Ljava/util/HashMap;

    invoke-virtual {v1, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    if-nez v2, :cond_b

    .line 1005
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 1006
    invoke-virtual {v1, v9, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1008
    :cond_b
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v2, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1143
    sget-object v1, Ll/ۘܳܳ;->ۙ:Ll/ۘܳܳ;

    invoke-virtual {p1}, Ll/ܺܳܳ;->ܳ()Ll/ۘܳܳ;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    const-string v1, "/api/auth/devices"

    invoke-virtual {p1}, Ll/ܺܳܳ;->ۡ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    goto :goto_4

    :cond_c
    const-string v1, "deviceId"

    .line 1146
    invoke-static {p1, v1}, Ll/ܿۚۢ;->ۧ(Ll/ۖܳܳ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    :cond_d
    :goto_4
    if-nez v7, :cond_e

    const/4 v8, 0x1

    move-object v3, p0

    move-object v4, v9

    move-object v7, p1

    .line 578
    invoke-direct/range {v3 .. v8}, Ll/᩺ᩴۢ;->֫(Ljava/lang/String;JLl/ܺܳܳ;Z)V

    .line 580
    :cond_e
    new-instance p1, Ll/ܶᩴۢ;

    const/4 v1, 0x0

    .line 1944
    invoke-direct {p1, v9, v1, v1}, Ll/ܶᩴۢ;-><init>(Ljava/lang/String;Ljava/lang/String;Ll/֨ᩴۢ;)V

    .line 580
    invoke-static {p1}, Ll/᩸ᩴۢ;->֫(Ll/ܶᩴۢ;)Ll/᩸ᩴۢ;

    move-result-object p1

    monitor-exit v0

    goto :goto_5

    :catchall_0
    move-exception p1

    .line 581
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p1

    :catch_1
    new-array p1, v7, [Ljava/lang/Object;

    .line 1994
    sget-object v0, Ll/֨ܳܳ;->۠֫:Ll/֨ܳܳ;

    invoke-static {v0, v8, p1}, Ll/᩸ᩴۢ;->֫(Ll/֨ܳܳ;I[Ljava/lang/Object;)Ll/᩸ᩴۢ;

    move-result-object p1

    goto :goto_5

    :catch_2
    move-exception p1

    .line 556
    iget-object v0, p1, Ll/ۨᩴۢ;->᩶:Ll/֨ܳܳ;

    iget v1, p1, Ll/ۨᩴۢ;->᩹:I

    iget-object p1, p1, Ll/ۨᩴۢ;->᩸:[Ljava/lang/Object;

    invoke-static {v0, v1, p1}, Ll/᩸ᩴۢ;->֫(Ll/֨ܳܳ;I[Ljava/lang/Object;)Ll/᩸ᩴۢ;

    move-result-object p1

    goto :goto_5

    :catchall_1
    move-exception p1

    .line 545
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw p1

    :catch_3
    new-array p1, v7, [Ljava/lang/Object;

    .line 1994
    sget-object v0, Ll/֨ܳܳ;->۠֫:Ll/֨ܳܳ;

    invoke-static {v0, v8, p1}, Ll/᩸ᩴۢ;->֫(Ll/֨ܳܳ;I[Ljava/lang/Object;)Ll/᩸ᩴۢ;

    move-result-object p1

    :goto_5
    return-object p1

    :cond_f
    :goto_6
    new-array p1, v7, [Ljava/lang/Object;

    sget-object v0, Ll/֨ܳܳ;->۠֫:Ll/֨ܳܳ;

    const v1, 0x7f120816

    invoke-static {v0, v1, p1}, Ll/᩸ᩴۢ;->֫(Ll/֨ܳܳ;I[Ljava/lang/Object;)Ll/᩸ᩴۢ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ljava/lang/String;)Z
    .locals 5

    .line 340
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 343
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 344
    iget-object v0, p0, Ll/᩺ᩴۢ;->ܿ:Ljava/lang/Object;

    monitor-enter v0

    .line 345
    :try_start_0
    invoke-direct {p0, v2, v3}, Ll/᩺ᩴۢ;->ܽ(J)V

    .line 967
    iget-object v2, p0, Ll/᩺ᩴۢ;->ᩳ:Ll/᩻ᩴۢ;

    invoke-virtual {v2}, Ll/᩻ᩴۢ;->֫()Ljava/util/ArrayList;

    move-result-object v3

    .line 952
    new-instance v4, Ll/֡ᩴۢ;

    invoke-direct {v4, p1}, Ll/֡ᩴۢ;-><init>(Ljava/lang/String;)V

    invoke-static {v3, v4}, Ll/ۚ۬ᩴ;->removeIf(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 971
    invoke-virtual {v2, v3}, Ll/᩻ᩴۢ;->֫(Ljava/util/ArrayList;)V

    .line 347
    :cond_1
    iget-object v2, p0, Ll/᩺ᩴۢ;->ۘ:Ljava/util/HashMap;

    invoke-virtual {v2, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_2

    if-eqz v4, :cond_3

    :cond_2
    const/4 v1, 0x1

    :cond_3
    if-eqz v1, :cond_4

    .line 349
    invoke-direct {p0, p1}, Ll/᩺ᩴۢ;->ܽ(Ljava/lang/String;)V

    .line 351
    :cond_4
    monitor-exit v0

    return v1

    :catchall_0
    move-exception p1

    .line 352
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ۧ()Ljava/util/LinkedHashMap;
    .locals 10

    .line 144
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    .line 145
    iget-object v0, p0, Ll/᩺ᩴۢ;->ܿ:Ljava/lang/Object;

    monitor-enter v0

    .line 146
    :try_start_0
    invoke-direct {p0}, Ll/᩺ᩴۢ;->᩻()Z

    move-result v3

    if-nez v3, :cond_0

    .line 147
    invoke-direct {p0, v1, v2}, Ll/᩺ᩴۢ;->֫(J)V

    .line 149
    :cond_0
    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    const-string v4, "authRequired"

    .line 150
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v3, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "pairingAvailable"

    .line 151
    invoke-direct {p0}, Ll/᩺ᩴۢ;->᩻()Z

    move-result v5

    if-nez v5, :cond_2

    iget-object v5, p0, Ll/᩺ᩴۢ;->᩻:Ljava/lang/String;

    if-eqz v5, :cond_1

    iget-wide v5, p0, Ll/᩺ᩴۢ;->᩷:J

    cmp-long v7, v1, v5

    if-gez v7, :cond_1

    goto :goto_0

    :cond_1
    const/4 v5, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v5, 0x1

    :goto_1
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-interface {v3, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "pairingExpiresInMs"

    .line 152
    invoke-direct {p0}, Ll/᩺ᩴۢ;->᩻()Z

    move-result v5

    const-wide/16 v6, 0x0

    if-eqz v5, :cond_3

    goto :goto_2

    :cond_3
    iget-wide v8, p0, Ll/᩺ᩴۢ;->᩷:J

    sub-long/2addr v8, v1

    invoke-static {v8, v9, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v6

    :goto_2
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v3, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    monitor-exit v0

    return-object v3

    :catchall_0
    move-exception v1

    .line 154
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ۧ(Ll/ܺܳܳ;)Ll/᩸ᩴۢ;
    .locals 11

    const-string v0, "ticket"

    .line 267
    invoke-static {p1, v0}, Ll/ܿۚۢ;->ۧ(Ll/ۖܳܳ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 271
    sget-object v0, Ll/ۘܳܳ;->ۗ:Ll/ۘܳܳ;

    invoke-virtual {p1}, Ll/ܺܳܳ;->ܳ()Ll/ۘܳܳ;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x0

    if-nez v0, :cond_0

    .line 272
    sget-object p1, Ll/֨ܳܳ;->֫֫:Ll/֨ܳܳ;

    const v0, 0x7f120824

    new-array v1, v2, [Ljava/lang/Object;

    invoke-static {p1, v0, v1}, Ll/᩸ᩴۢ;->֫(Ll/֨ܳܳ;I[Ljava/lang/Object;)Ll/᩸ᩴۢ;

    move-result-object p1

    return-object p1

    .line 274
    :cond_0
    invoke-static {p1}, Ll/ܿۚۢ;->֫(Ll/ܺܳܳ;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 275
    sget-object p1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    const v0, 0x7f12082d

    new-array v1, v2, [Ljava/lang/Object;

    invoke-static {p1, v0, v1}, Ll/᩸ᩴۢ;->֫(Ll/֨ܳܳ;I[Ljava/lang/Object;)Ll/᩸ᩴۢ;

    move-result-object p1

    return-object p1

    .line 277
    :cond_1
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const v3, 0x7f12080b

    if-eqz v0, :cond_2

    new-array p1, v2, [Ljava/lang/Object;

    .line 1994
    sget-object v0, Ll/֨ܳܳ;->۠֫:Ll/֨ܳܳ;

    invoke-static {v0, v3, p1}, Ll/᩸ᩴۢ;->֫(Ll/֨ܳܳ;I[Ljava/lang/Object;)Ll/᩸ᩴۢ;

    move-result-object p1

    return-object p1

    :cond_2
    const v3, 0x7f12080b

    .line 612
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 613
    iget-object v0, p0, Ll/᩺ᩴۢ;->ܿ:Ljava/lang/Object;

    monitor-enter v0

    .line 615
    :try_start_0
    invoke-direct {p0, v6, v7}, Ll/᩺ᩴۢ;->ܽ(J)V

    .line 1016
    iget-object v4, p0, Ll/᩺ᩴۢ;->֫:Ljava/util/HashMap;

    invoke-virtual {v4}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v4

    new-instance v5, Ll/᩵ᩴۢ;

    invoke-direct {v5, v6, v7}, Ll/᩵ᩴۢ;-><init>(J)V

    invoke-static {v4, v5}, Ll/ۚ۬ᩴ;->removeIf(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    .line 617
    iget-object v4, p0, Ll/᩺ᩴۢ;->֫:Ljava/util/HashMap;

    invoke-virtual {v4, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v10, v4

    check-cast v10, Ll/۠ᩴۢ;

    if-nez v10, :cond_3

    new-array p1, v2, [Ljava/lang/Object;

    .line 1994
    sget-object v1, Ll/֨ܳܳ;->۠֫:Ll/֨ܳܳ;

    invoke-static {v1, v3, p1}, Ll/᩸ᩴۢ;->֫(Ll/֨ܳܳ;I[Ljava/lang/Object;)Ll/᩸ᩴۢ;

    move-result-object p1

    .line 619
    monitor-exit v0

    return-object p1

    .line 621
    :cond_3
    iget-wide v4, v10, Ll/۠ᩴۢ;->ܽ:J

    cmp-long v8, v4, v6

    if-gtz v8, :cond_4

    new-array p1, v2, [Ljava/lang/Object;

    .line 1994
    sget-object v1, Ll/֨ܳܳ;->۠֫:Ll/֨ܳܳ;

    invoke-static {v1, v3, p1}, Ll/᩸ᩴۢ;->֫(Ll/֨ܳܳ;I[Ljava/lang/Object;)Ll/᩸ᩴۢ;

    move-result-object p1

    .line 622
    monitor-exit v0

    return-object p1

    .line 624
    :cond_4
    iget-object v4, v10, Ll/۠ᩴۢ;->ۧ:Ljava/lang/String;

    invoke-direct {p0, v4}, Ll/᩺ᩴۢ;->ᩳ(Ljava/lang/String;)Ll/ܳᩴۢ;

    move-result-object v4

    if-nez v4, :cond_5

    new-array p1, v2, [Ljava/lang/Object;

    .line 1994
    sget-object v1, Ll/֨ܳܳ;->۠֫:Ll/֨ܳܳ;

    invoke-static {v1, v3, p1}, Ll/᩸ᩴۢ;->֫(Ll/֨ܳܳ;I[Ljava/lang/Object;)Ll/᩸ᩴۢ;

    move-result-object p1

    .line 626
    monitor-exit v0

    return-object p1

    .line 628
    :cond_5
    iget-boolean v2, v4, Ll/ܳᩴۢ;->᩻:Z

    if-nez v2, :cond_6

    .line 629
    iget-object v5, v10, Ll/۠ᩴۢ;->ۧ:Ljava/lang/String;

    const/4 v9, 0x0

    move-object v4, p0

    move-object v8, p1

    invoke-direct/range {v4 .. v9}, Ll/᩺ᩴۢ;->֫(Ljava/lang/String;JLl/ܺܳܳ;Z)V

    .line 631
    :cond_6
    new-instance p1, Ll/ܶᩴۢ;

    iget-object v2, v10, Ll/۠ᩴۢ;->ۧ:Ljava/lang/String;

    iget-object v3, v10, Ll/۠ᩴۢ;->֫:Ll/֨ᩴۢ;

    invoke-direct {p1, v2, v1, v3}, Ll/ܶᩴۢ;-><init>(Ljava/lang/String;Ljava/lang/String;Ll/֨ᩴۢ;)V

    invoke-static {p1}, Ll/᩸ᩴۢ;->֫(Ll/ܶᩴۢ;)Ll/᩸ᩴۢ;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    .line 632
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ۧ(Ljava/lang/String;)Z
    .locals 7

    .line 639
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 642
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 643
    iget-object v0, p0, Ll/᩺ᩴۢ;->ܿ:Ljava/lang/Object;

    monitor-enter v0

    .line 645
    :try_start_0
    invoke-direct {p0, v2, v3}, Ll/᩺ᩴۢ;->ܽ(J)V

    .line 1016
    iget-object v4, p0, Ll/᩺ᩴۢ;->֫:Ljava/util/HashMap;

    invoke-virtual {v4}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v4

    new-instance v5, Ll/᩵ᩴۢ;

    invoke-direct {v5, v2, v3}, Ll/᩵ᩴۢ;-><init>(J)V

    invoke-static {v4, v5}, Ll/ۚ۬ᩴ;->removeIf(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    .line 647
    iget-object v4, p0, Ll/᩺ᩴۢ;->֫:Ljava/util/HashMap;

    invoke-virtual {v4, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۠ᩴۢ;

    if-nez p1, :cond_1

    .line 649
    monitor-exit v0

    return v1

    .line 651
    :cond_1
    iget-wide v4, p1, Ll/۠ᩴۢ;->ܽ:J

    cmp-long v6, v4, v2

    if-gtz v6, :cond_2

    .line 652
    monitor-exit v0

    return v1

    .line 654
    :cond_2
    iget-object p1, p1, Ll/۠ᩴۢ;->ۧ:Ljava/lang/String;

    invoke-direct {p0, p1}, Ll/᩺ᩴۢ;->ᩳ(Ljava/lang/String;)Ll/ܳᩴۢ;

    move-result-object p1

    if-nez p1, :cond_3

    .line 655
    monitor-exit v0

    return v1

    :cond_3
    const/4 p1, 0x1

    .line 657
    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 658
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ۧ(Ll/ܶᩴۢ;Ljava/lang/String;)Z
    .locals 5

    .line 319
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 322
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 323
    iget-object v0, p0, Ll/᩺ᩴۢ;->ܿ:Ljava/lang/Object;

    monitor-enter v0

    .line 324
    :try_start_0
    invoke-direct {p0, v2, v3}, Ll/᩺ᩴۢ;->ܽ(J)V

    .line 967
    iget-object v2, p0, Ll/᩺ᩴۢ;->ᩳ:Ll/᩻ᩴۢ;

    invoke-virtual {v2}, Ll/᩻ᩴۢ;->֫()Ljava/util/ArrayList;

    move-result-object v3

    .line 952
    new-instance v4, Ll/֡ᩴۢ;

    invoke-direct {v4, p2}, Ll/֡ᩴۢ;-><init>(Ljava/lang/String;)V

    invoke-static {v3, v4}, Ll/ۚ۬ᩴ;->removeIf(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 971
    invoke-virtual {v2, v3}, Ll/᩻ᩴۢ;->֫(Ljava/util/ArrayList;)V

    :cond_1
    if-eqz p1, :cond_4

    .line 326
    iget-object p1, p1, Ll/ܶᩴۢ;->ܽ:Ljava/lang/String;

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 327
    iget-object p1, p0, Ll/᩺ᩴۢ;->ۘ:Ljava/util/HashMap;

    invoke-virtual {p1, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_2

    if-eqz v4, :cond_3

    :cond_2
    const/4 v1, 0x1

    :cond_3
    move v4, v1

    :cond_4
    if-eqz v4, :cond_5

    .line 330
    invoke-direct {p0, p2}, Ll/᩺ᩴۢ;->ܽ(Ljava/lang/String;)V

    .line 332
    :cond_5
    monitor-exit v0

    return v4

    :catchall_0
    move-exception p1

    .line 333
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 3

    .line 472
    iget-object v0, p0, Ll/᩺ᩴۢ;->ܿ:Ljava/lang/Object;

    monitor-enter v0

    .line 473
    :try_start_0
    invoke-direct {p0}, Ll/᩺ᩴۢ;->᩻()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    .line 474
    monitor-exit v0

    return-object v1

    .line 476
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-direct {p0, v1, v2}, Ll/᩺ᩴۢ;->֫(J)V

    .line 477
    iget-object v1, p0, Ll/᩺ᩴۢ;->᩻:Ljava/lang/String;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 478
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ܽ(Ll/ܺܳܳ;)Ll/᩸ᩴۢ;
    .locals 11

    const-string v0, "ticket"

    .line 249
    invoke-static {p1, v0}, Ll/ܿۚۢ;->ۧ(Ll/ۖܳܳ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 250
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_c

    .line 252
    sget-object v0, Ll/ۘܳܳ;->ۗ:Ll/ۘܳܳ;

    invoke-virtual {p1}, Ll/ܺܳܳ;->ܳ()Ll/ۘܳܳ;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x0

    if-nez v0, :cond_0

    sget-object v0, Ll/ۘܳܳ;->۬:Ll/ۘܳܳ;

    invoke-virtual {p1}, Ll/ܺܳܳ;->ܳ()Ll/ۘܳܳ;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 253
    sget-object p1, Ll/֨ܳܳ;->֫֫:Ll/֨ܳܳ;

    const v0, 0x7f120824

    new-array v1, v2, [Ljava/lang/Object;

    invoke-static {p1, v0, v1}, Ll/᩸ᩴۢ;->֫(Ll/֨ܳܳ;I[Ljava/lang/Object;)Ll/᩸ᩴۢ;

    move-result-object p1

    return-object p1

    .line 255
    :cond_0
    invoke-static {p1}, Ll/ܿۚۢ;->֫(Ll/ܺܳܳ;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 256
    sget-object p1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    const v0, 0x7f12082d

    new-array v1, v2, [Ljava/lang/Object;

    invoke-static {p1, v0, v1}, Ll/᩸ᩴۢ;->֫(Ll/֨ܳܳ;I[Ljava/lang/Object;)Ll/᩸ᩴۢ;

    move-result-object p1

    return-object p1

    .line 585
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    const-string v0, "path"

    .line 40
    invoke-static {p1, v0}, Ll/ܿۚۢ;->ۧ(Ll/ۖܳܳ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v0, "disposition"

    .line 587
    invoke-static {p1, v0}, Ll/ܿۚۢ;->ۧ(Ll/ۖܳܳ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 588
    iget-object v0, p0, Ll/᩺ᩴۢ;->ܿ:Ljava/lang/Object;

    monitor-enter v0

    .line 590
    :try_start_0
    invoke-direct {p0, v3, v4}, Ll/᩺ᩴۢ;->ܽ(J)V

    .line 1012
    iget-object v7, p0, Ll/᩺ᩴۢ;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v7}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v7

    new-instance v8, Ll/ܺᩴۢ;

    invoke-direct {v8, v3, v4}, Ll/ܺᩴۢ;-><init>(J)V

    invoke-static {v7, v8}, Ll/ۚ۬ᩴ;->removeIf(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    .line 592
    iget-object v7, p0, Ll/᩺ᩴۢ;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v7, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Ll/ۙᩴۢ;

    const v1, 0x7f12080d

    if-eqz v7, :cond_b

    .line 593
    iget-wide v8, v7, Ll/ۙᩴۢ;->ܽ:J

    cmp-long v10, v8, v3

    if-gtz v10, :cond_2

    goto :goto_3

    .line 596
    :cond_2
    iget-object v8, v7, Ll/ۙᩴۢ;->ᩳ:Ljava/lang/String;

    const/4 v9, 0x1

    if-nez v8, :cond_4

    if-nez v5, :cond_3

    const/4 v5, 0x1

    goto :goto_0

    :cond_3
    const/4 v5, 0x0

    goto :goto_0

    .line 1928
    :cond_4
    invoke-virtual {v8, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    :goto_0
    if-eqz v5, :cond_a

    .line 596
    iget-object v5, v7, Ll/ۙᩴۢ;->ۧ:Ljava/lang/String;

    if-nez v5, :cond_6

    if-nez v6, :cond_5

    goto :goto_1

    :cond_5
    const/4 v9, 0x0

    goto :goto_1

    .line 1928
    :cond_6
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    :goto_1
    if-nez v9, :cond_7

    goto :goto_2

    .line 599
    :cond_7
    iget-object v5, v7, Ll/ۙᩴۢ;->֫:Ljava/lang/String;

    invoke-direct {p0, v5}, Ll/᩺ᩴۢ;->ᩳ(Ljava/lang/String;)Ll/ܳᩴۢ;

    move-result-object v5

    if-nez v5, :cond_8

    new-array p1, v2, [Ljava/lang/Object;

    .line 1994
    sget-object v2, Ll/֨ܳܳ;->۠֫:Ll/֨ܳܳ;

    invoke-static {v2, v1, p1}, Ll/᩸ᩴۢ;->֫(Ll/֨ܳܳ;I[Ljava/lang/Object;)Ll/᩸ᩴۢ;

    move-result-object p1

    .line 601
    monitor-exit v0

    return-object p1

    .line 603
    :cond_8
    iget-boolean v1, v5, Ll/ܳᩴۢ;->᩻:Z

    if-nez v1, :cond_9

    .line 605
    iget-object v2, v7, Ll/ۙᩴۢ;->֫:Ljava/lang/String;

    const/4 v6, 0x0

    move-object v1, p0

    move-object v5, p1

    invoke-direct/range {v1 .. v6}, Ll/᩺ᩴۢ;->֫(Ljava/lang/String;JLl/ܺܳܳ;Z)V

    .line 607
    :cond_9
    new-instance p1, Ll/ܶᩴۢ;

    iget-object v1, v7, Ll/ۙᩴۢ;->֫:Ljava/lang/String;

    const/4 v2, 0x0

    .line 1944
    invoke-direct {p1, v1, v2, v2}, Ll/ܶᩴۢ;-><init>(Ljava/lang/String;Ljava/lang/String;Ll/֨ᩴۢ;)V

    .line 607
    invoke-static {p1}, Ll/᩸ᩴۢ;->֫(Ll/ܶᩴۢ;)Ll/᩸ᩴۢ;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :cond_a
    :goto_2
    new-array p1, v2, [Ljava/lang/Object;

    .line 1994
    sget-object v2, Ll/֨ܳܳ;->۠֫:Ll/֨ܳܳ;

    invoke-static {v2, v1, p1}, Ll/᩸ᩴۢ;->֫(Ll/֨ܳܳ;I[Ljava/lang/Object;)Ll/᩸ᩴۢ;

    move-result-object p1

    .line 597
    monitor-exit v0

    return-object p1

    :cond_b
    :goto_3
    new-array p1, v2, [Ljava/lang/Object;

    .line 1994
    sget-object v2, Ll/֨ܳܳ;->۠֫:Ll/֨ܳܳ;

    invoke-static {v2, v1, p1}, Ll/᩸ᩴۢ;->֫(Ll/֨ܳܳ;I[Ljava/lang/Object;)Ll/᩸ᩴۢ;

    move-result-object p1

    .line 594
    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    .line 608
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    .line 260
    :cond_c
    invoke-virtual {p0, p1}, Ll/᩺ᩴۢ;->֫(Ll/ܺܳܳ;)Ll/᩸ᩴۢ;

    move-result-object p1

    return-object p1
.end method

.method public final ܿ()V
    .locals 4

    .line 440
    iget-object v0, p0, Ll/᩺ᩴۢ;->ܿ:Ljava/lang/Object;

    monitor-enter v0

    .line 441
    :try_start_0
    iget-object v1, p0, Ll/᩺ᩴۢ;->ۡ:Ljava/util/concurrent/ScheduledFuture;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    const/4 v3, 0x0

    .line 442
    invoke-interface {v1, v3}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 443
    iput-object v2, p0, Ll/᩺ᩴۢ;->ۡ:Ljava/util/concurrent/ScheduledFuture;

    .line 445
    :cond_0
    iget-object v1, p0, Ll/᩺ᩴۢ;->ܺ:Ljava/util/concurrent/ScheduledExecutorService;

    if-eqz v1, :cond_1

    .line 446
    invoke-interface {v1}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 447
    iput-object v2, p0, Ll/᩺ᩴۢ;->ܺ:Ljava/util/concurrent/ScheduledExecutorService;

    .line 449
    :cond_1
    iget-object v1, p0, Ll/᩺ᩴۢ;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    .line 450
    iget-object v1, p0, Ll/᩺ᩴۢ;->֫:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    .line 451
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ܿ(Ll/ܺܳܳ;)V
    .locals 2

    .line 229
    invoke-static {p1}, Ll/᩺ᩴۢ;->᩻(Ll/ܺܳܳ;)Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-direct {p0, v0, v1, p1}, Ll/᩺ᩴۢ;->ܽ(JLjava/lang/String;)V

    return-void
.end method

.method public final ᩳ()J
    .locals 3

    .line 485
    iget-object v0, p0, Ll/᩺ᩴۢ;->ܿ:Ljava/lang/Object;

    monitor-enter v0

    .line 486
    :try_start_0
    invoke-direct {p0}, Ll/᩺ᩴۢ;->᩻()Z

    move-result v1

    if-eqz v1, :cond_0

    const-wide/16 v1, 0x0

    .line 487
    monitor-exit v0

    return-wide v1

    .line 489
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-direct {p0, v1, v2}, Ll/᩺ᩴۢ;->֫(J)V

    .line 490
    iget-wide v1, p0, Ll/᩺ᩴۢ;->᩷:J

    monitor-exit v0

    return-wide v1

    :catchall_0
    move-exception v1

    .line 491
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ᩳ(Ll/ܺܳܳ;)Ll/ۤᩴۢ;
    .locals 3

    .line 219
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    .line 220
    iget-object v0, p0, Ll/᩺ᩴۢ;->ܿ:Ljava/lang/Object;

    monitor-enter v0

    .line 221
    :try_start_0
    invoke-static {p1}, Ll/᩺ᩴۢ;->᩻(Ll/ܺܳܳ;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, v1, v2, p1}, Ll/᩺ᩴۢ;->֫(JLjava/lang/String;)Ll/ۤᩴۢ;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    .line 222
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
