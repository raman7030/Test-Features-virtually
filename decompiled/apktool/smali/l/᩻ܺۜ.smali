.class public final Ll/᩻ܺۜ;
.super Ljava/lang/Object;
.source "L6Y6"


# static fields
.field public static final ܳ:Ll/ۛ᩶ᩴ;

.field public static final ܿ:J


# instance fields
.field public ֫:I

.field public final ۧ:Ljava/util/LinkedHashMap;

.field public final ܽ:Ll/ۨۗᩳ;

.field public final ᩳ:Ll/ᩳۖۜ;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const-string v0, "yyyy-MM-dd\'T\'HH:mm:ssXXX"

    .line 25
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 26
    invoke-static {v0, v1}, Ll/ۛ᩶ᩴ;->ofPattern(Ljava/lang/String;Ljava/util/Locale;)Ll/ۛ᩶ᩴ;

    move-result-object v0

    sput-object v0, Ll/᩻ܺۜ;->ܳ:Ll/ۛ᩶ᩴ;

    .line 30
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1e

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    sput-wide v0, Ll/᩻ܺۜ;->ܿ:J

    return-void
.end method

.method public constructor <init>(Ll/ᩳۖۜ;)V
    .locals 5

    .line 38
    new-instance v0, Ll/ۨۗᩳ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    new-instance v1, Ljava/util/LinkedHashMap;

    const/high16 v2, 0x3f400000    # 0.75f

    const/4 v3, 0x1

    const/16 v4, 0x10

    invoke-direct {v1, v4, v2, v3}, Ljava/util/LinkedHashMap;-><init>(IFZ)V

    iput-object v1, p0, Ll/᩻ܺۜ;->ۧ:Ljava/util/LinkedHashMap;

    .line 43
    iput-object p1, p0, Ll/᩻ܺۜ;->ᩳ:Ll/ᩳۖۜ;

    .line 44
    iput-object v0, p0, Ll/᩻ܺۜ;->ܽ:Ll/ۨۗᩳ;

    return-void
.end method

.method public static bridge synthetic ֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩻ܺۜ;->ܽ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 10

    .line 175
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 176
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܽܺۜ;

    .line 177
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 178
    iget-object v3, v1, Ll/ܽܺۜ;->ۧ:Ll/۫᩵ܿ;

    .line 179
    invoke-virtual {v3}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v4

    .line 217
    sget-object v5, Ll/ۛۡۜ;->֫:[I

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v4, v5, v4

    const/4 v5, 0x1

    if-eq v4, v5, :cond_4

    const/4 v5, 0x2

    if-eq v4, v5, :cond_3

    const/4 v5, 0x3

    if-eq v4, v5, :cond_2

    const/4 v5, 0x4

    if-eq v4, v5, :cond_1

    const/4 p0, 0x5

    if-eq v4, p0, :cond_0

    new-instance p0, Ljava/lang/IncompatibleClassChangeError;

    invoke-direct {p0}, Ljava/lang/IncompatibleClassChangeError;-><init>()V

    throw p0

    .line 222
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Missing node cannot be listed"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    const-string v4, "o"

    goto :goto_1

    :cond_2
    const-string v4, "l"

    goto :goto_1

    :cond_3
    const-string v4, "d"

    goto :goto_1

    :cond_4
    const-string v4, "f"

    .line 179
    :goto_1
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v4, 0x20

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 180
    invoke-virtual {v3}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v5

    sget-object v6, Ll/ۗ᩵ܿ;->۬:Ll/ۗ᩵ܿ;

    const-wide/16 v7, 0x0

    if-ne v5, v6, :cond_5

    invoke-virtual {v3}, Ll/۫᩵ܿ;->ܽ()J

    move-result-wide v5

    cmp-long v9, v5, v7

    if-ltz v9, :cond_5

    .line 181
    invoke-virtual {v3}, Ll/۫᩵ܿ;->ܽ()J

    move-result-wide v5

    invoke-virtual {v2, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_5
    const/16 v5, 0x2d

    .line 183
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 185
    :goto_2
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 186
    invoke-virtual {v3}, Ll/۫᩵ܿ;->ۧ()J

    move-result-wide v5

    cmp-long v3, v5, v7

    if-gtz v3, :cond_6

    const/4 v3, 0x0

    goto :goto_3

    .line 199
    :cond_6
    invoke-static {v5, v6}, Ll/ۘ᩹ᩴ;->ofEpochMilli(J)Ll/ۘ᩹ᩴ;

    move-result-object v3

    .line 200
    invoke-static {}, Ll/ۚ᩹ᩴ;->systemDefault()Ll/ۚ᩹ᩴ;

    move-result-object v5

    invoke-virtual {v3, v5}, Ll/ۘ᩹ᩴ;->atZone(Ll/ۚ᩹ᩴ;)Ll/֨᩹ᩴ;

    move-result-object v3

    .line 199
    sget-object v5, Ll/᩻ܺۜ;->ܳ:Ll/ۛ᩶ᩴ;

    invoke-virtual {v5, v3}, Ll/ۛ᩶ᩴ;->format(Ll/ۖۗᩴ;)Ljava/lang/String;

    move-result-object v3

    :goto_3
    if-nez v3, :cond_7

    const-string v3, "-"

    .line 187
    :cond_7
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, v1, Ll/ܽܺۜ;->֫:Ljava/lang/String;

    .line 189
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_8
    return-object v0
.end method

.method public static ֫(Ll/᩻ܺۜ;Ll/֫ܺۜ;)Ljava/util/List;
    .locals 5

    move-object v0, p0

    .line 0
    monitor-enter v0

    .line 491
    :try_start_0
    iget-object v1, p0, Ll/᩻ܺۜ;->ܽ:Ll/ۨۗᩳ;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    .line 492
    iget-object v3, p0, Ll/᩻ܺۜ;->ۧ:Ljava/util/LinkedHashMap;

    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v3

    new-instance v4, Ll/ۤۡۜ;

    invoke-direct {v4, p0, v1, v2}, Ll/ۤۡۜ;-><init>(Ll/᩻ܺۜ;J)V

    invoke-static {v3, v4}, Ll/ۚ۬ᩴ;->removeIf(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    .line 499
    iget-object p0, p0, Ll/᩻ܺۜ;->ۧ:Ljava/util/LinkedHashMap;

    invoke-virtual {p0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۨۡۜ;

    if-nez p0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    .line 500
    :cond_0
    iget-object p0, p0, Ll/ۨۡۜ;->֫:Ljava/util/ArrayList;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static bridge synthetic ֫(Ll/᩻ܺۜ;)Ll/ᩳۖۜ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩻ܺۜ;->ᩳ:Ll/ᩳۖۜ;

    return-object p0
.end method

.method public static ֫(Ll/᩻ܺۜ;Ll/֫ܺۜ;Ljava/util/ArrayList;)V
    .locals 6

    move-object v0, p0

    .line 0
    monitor-enter v0

    .line 505
    :try_start_0
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 v2, 0x4e20

    if-le v1, v2, :cond_0

    .line 506
    monitor-exit v0

    return-void

    .line 508
    :cond_0
    :try_start_1
    iget-object v1, p0, Ll/᩻ܺۜ;->ۧ:Ljava/util/LinkedHashMap;

    new-instance v3, Ll/ۨۡۜ;

    iget-object v4, p0, Ll/᩻ܺۜ;->ܽ:Ll/ۨۗᩳ;

    .line 509
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v4

    invoke-direct {v3, p2, v4, v5}, Ll/ۨۡۜ;-><init>(Ljava/util/ArrayList;J)V

    .line 508
    invoke-virtual {v1, p1, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۨۡۜ;

    .line 510
    iget v1, p0, Ll/᩻ܺۜ;->֫:I

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-nez p1, :cond_1

    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    iget-object p1, p1, Ll/ۨۡۜ;->֫:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    :goto_0
    sub-int/2addr p2, p1

    add-int/2addr p2, v1

    iput p2, p0, Ll/᩻ܺۜ;->֫:I

    .line 511
    :goto_1
    iget-object p1, p0, Ll/᩻ܺۜ;->ۧ:Ljava/util/LinkedHashMap;

    invoke-virtual {p1}, Ljava/util/AbstractMap;->size()I

    move-result p1

    const/16 p2, 0x40

    if-gt p1, p2, :cond_3

    iget p1, p0, Ll/᩻ܺۜ;->֫:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-le p1, v2, :cond_2

    goto :goto_2

    .line 516
    :cond_2
    monitor-exit v0

    return-void

    .line 512
    :cond_3
    :goto_2
    :try_start_2
    iget-object p1, p0, Ll/᩻ܺۜ;->ۧ:Ljava/util/LinkedHashMap;

    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 513
    iget p2, p0, Ll/᩻ܺۜ;->֫:I

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۨۡۜ;

    iget-object v1, v1, Ll/ۨۡۜ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    sub-int/2addr p2, v1

    iput p2, p0, Ll/᩻ܺۜ;->֫:I

    .line 514
    invoke-interface {p1}, Ljava/util/Iterator;->remove()V

    goto :goto_1

    :catchall_0
    move-exception p0

    .line 515
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p0
.end method

.method public static synthetic ֫(Ll/᩻ܺۜ;JLl/ۨۡۜ;)Z
    .locals 3

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 493
    iget-wide v0, p3, Ll/ۨۡۜ;->ۧ:J

    sub-long/2addr p1, v0

    sget-wide v0, Ll/᩻ܺۜ;->ܿ:J

    cmp-long v2, p1, v0

    if-gez v2, :cond_0

    const/4 p0, 0x0

    return p0

    .line 496
    :cond_0
    iget p1, p0, Ll/᩻ܺۜ;->֫:I

    iget-object p2, p3, Ll/ۨۡۜ;->֫:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    sub-int/2addr p1, p2

    iput p1, p0, Ll/᩻ܺۜ;->֫:I

    const/4 p0, 0x1

    return p0
.end method

.method public static ۧ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    :try_start_0
    const-string v0, "backendPath"

    .line 535
    invoke-static {p1, v0}, Ll/۫ۡۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ll/ۗۛ᩻; {:try_start_0 .. :try_end_0} :catch_0

    .line 539
    invoke-static {p0, p1}, Ll/᩻ܺۜ;->ܽ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    return-object p1

    .line 537
    :catch_0
    invoke-static {p0}, Ll/᩻ܺۜ;->ۧ(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method public static ۧ(Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 4

    const-string v0, "operation"

    const-string v1, "list"

    const-string v2, "path"

    .line 0
    invoke-static {v2, p0, v0, v1}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v0, "backendReason"

    const-string v1, "invalid_child_path"

    .line 561
    invoke-virtual {p0, v0, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v0, "FILE_STORAGE_ERROR"

    const-string v1, "The file backend returned an invalid direct child path."

    const-string v2, "warning"

    const/4 v3, 0x0

    .line 557
    invoke-static {v0, v1, v2, v3, p0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ܽ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "/"

    .line 545
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 0
    :cond_0
    invoke-static {p0, v0}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 546
    :goto_0
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 549
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    .line 550
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    const/16 v0, 0x2f

    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    if-gez v0, :cond_1

    const-string v0, "."

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, ".."

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    return-object p1

    .line 551
    :cond_1
    invoke-static {p0}, Ll/᩻ܺۜ;->ۧ(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    .line 547
    :cond_2
    invoke-static {p0}, Ll/᩻ܺۜ;->ۧ(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)Ll/ܳܺۜ;
    .locals 18

    move-object/from16 v1, p0

    .line 139
    iget-object v0, v1, Ll/᩻ܺۜ;->ᩳ:Ll/ᩳۖۜ;

    invoke-virtual {v0}, Ll/ᩳۖۜ;->֫()Ll/۟ۢۜ;

    move-result-object v2

    const-string v3, "path"

    move-object/from16 v4, p1

    .line 140
    invoke-static {v4, v2, v3}, Ll/ᩳۖۜ;->֫(Ljava/lang/String;Ll/۟ۢۜ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iget-object v4, v2, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    .line 141
    invoke-virtual {v0, v5}, Ll/ᩳۖۜ;->֫(Ljava/lang/String;)Ll/ۤۖۜ;

    move-result-object v11

    .line 142
    :try_start_0
    invoke-virtual {v0, v5}, Ll/ᩳۖۜ;->ᩳ(Ljava/lang/String;)Ll/۫᩵ܿ;

    move-result-object v6

    .line 143
    invoke-virtual {v6}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v7

    sget-object v8, Ll/ۗ᩵ܿ;->ۙ:Ll/ۗ᩵ܿ;

    if-eq v7, v8, :cond_a

    .line 146
    invoke-virtual {v6}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v7

    sget-object v8, Ll/ۗ᩵ܿ;->۬:Ll/ۗ᩵ܿ;

    const-wide/16 v9, 0x0

    const/4 v12, 0x0

    if-ne v7, v8, :cond_1

    .line 147
    invoke-virtual {v6}, Ll/۫᩵ܿ;->ܽ()J

    move-result-wide v13

    cmp-long v7, v13, v9

    if-ltz v7, :cond_1

    .line 148
    invoke-virtual {v6}, Ll/۫᩵ܿ;->ܽ()J

    move-result-wide v13

    const-wide v15, 0x1fffffffffffffL

    cmp-long v7, v13, v15

    if-gtz v7, :cond_0

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    goto :goto_0

    :cond_0
    const-string v0, "FILE_STORAGE_ERROR"

    const-string v2, "The file size exceeds the supported JSON integer range."

    const-string v3, "warning"

    const-string v6, "path"

    const-string v7, "policyRevision"

    invoke-static {v6, v5, v7, v4}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "operation"

    const-string v6, "stat"

    .line 213
    invoke-virtual {v4, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "backendReason"

    const-string v6, "size_out_of_range"

    invoke-virtual {v4, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const/4 v5, 0x0

    .line 209
    invoke-static {v0, v2, v3, v5, v4}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_1
    move-object v7, v12

    .line 150
    :goto_0
    invoke-virtual {v6}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v13
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v13, v8, :cond_3

    .line 152
    :try_start_1
    invoke-virtual {v6}, Ll/۫᩵ܿ;->֫()Ll/ܶ᩵ܿ;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1325
    invoke-static {}, Ll/ܳۤۡ;->ۧ()Ljava/security/MessageDigest;

    move-result-object v14

    .line 1316
    invoke-virtual {v13}, Ll/ܶ᩵ܿ;->ۢۧ()Ljava/io/InputStream;

    move-result-object v13

    invoke-static {v14, v13}, Ll/ܳۤۡ;->֫(Ljava/security/MessageDigest;Ljava/io/InputStream;)V

    .line 1317
    invoke-virtual {v14}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v13

    invoke-static {v13}, Ll/ܳۤۡ;->ۧ([B)Ljava/lang/String;

    move-result-object v13

    const/16 v14, 0x10

    const/4 v15, 0x0

    .line 152
    invoke-virtual {v13, v15, v14}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v13
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 156
    :try_start_2
    invoke-virtual {v0, v5}, Ll/ᩳۖۜ;->ᩳ(Ljava/lang/String;)Ll/۫᩵ܿ;

    move-result-object v0

    .line 169
    invoke-virtual {v0}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v14

    if-ne v14, v8, :cond_2

    .line 170
    invoke-virtual {v6}, Ll/۫᩵ܿ;->ܽ()J

    move-result-wide v14

    invoke-virtual {v0}, Ll/۫᩵ܿ;->ܽ()J

    move-result-wide v16

    cmp-long v0, v14, v16

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    const-string v0, "FILE_CHANGED_DURING_READ"

    const-string v2, "The file changed while its content version was being calculated."

    const-string v6, "warning"

    .line 240
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v7

    invoke-virtual {v7, v3, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "policyRevision"

    invoke-virtual {v3, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "operation"

    const-string v5, "stat_hash"

    .line 241
    invoke-virtual {v3, v4, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 237
    invoke-static {v0, v2, v6, v12, v3}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 158
    throw v0

    :catch_0
    move-exception v0

    .line 154
    invoke-static {v5, v0}, Ll/ᩳۖۜ;->֫(Ljava/lang/String;Ljava/io/IOException;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_3
    move-object v13, v12

    .line 161
    :goto_1
    invoke-virtual {v6}, Ll/۫᩵ܿ;->ۧ()J

    move-result-wide v3

    cmp-long v0, v3, v9

    if-gtz v0, :cond_4

    move-object v8, v12

    goto :goto_2

    .line 199
    :cond_4
    sget-object v0, Ll/᩻ܺۜ;->ܳ:Ll/ۛ᩶ᩴ;

    invoke-static {v3, v4}, Ll/ۘ᩹ᩴ;->ofEpochMilli(J)Ll/ۘ᩹ᩴ;

    move-result-object v3

    .line 200
    invoke-static {}, Ll/ۚ᩹ᩴ;->systemDefault()Ll/ۚ᩹ᩴ;

    move-result-object v4

    invoke-virtual {v3, v4}, Ll/ۘ᩹ᩴ;->atZone(Ll/ۚ᩹ᩴ;)Ll/֨᩹ᩴ;

    move-result-object v3

    .line 199
    invoke-virtual {v0, v3}, Ll/ۛ᩶ᩴ;->format(Ll/ۖۗᩴ;)Ljava/lang/String;

    move-result-object v0

    move-object v8, v0

    .line 162
    :goto_2
    new-instance v0, Ll/ܳܺۜ;

    invoke-virtual {v6}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v3

    .line 227
    sget-object v4, Ll/ۛۡۜ;->֫:[I

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v3, v4, v3

    const/4 v4, 0x1

    if-eq v3, v4, :cond_9

    const/4 v4, 0x2

    if-eq v3, v4, :cond_8

    const/4 v4, 0x3

    if-eq v3, v4, :cond_7

    const/4 v4, 0x4

    if-eq v3, v4, :cond_6

    const/4 v0, 0x5

    if-eq v3, v0, :cond_5

    new-instance v0, Ljava/lang/IncompatibleClassChangeError;

    invoke-direct {v0}, Ljava/lang/IncompatibleClassChangeError;-><init>()V

    throw v0

    .line 232
    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "Missing node has no stat type"

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    const-string v3, "other"

    goto :goto_3

    :cond_7
    const-string v3, "link"

    goto :goto_3

    :cond_8
    const-string v3, "directory"

    goto :goto_3

    :cond_9
    const-string v3, "file"

    :goto_3
    move-object v6, v3

    .line 163
    invoke-virtual {v2, v5}, Ll/۟ۢۜ;->֫(Ljava/lang/String;)Ll/᩺ۢۜ;

    move-result-object v2

    iget-object v2, v2, Ll/᩺ۢۜ;->֫:Ll/ۛۢۜ;

    invoke-virtual {v2}, Ll/ۛۢۜ;->ܿ()Ljava/lang/String;

    move-result-object v9

    move-object v4, v0

    move-object v10, v13

    invoke-direct/range {v4 .. v10}, Ll/ܳܺۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 164
    invoke-virtual {v11}, Ll/ۤۖۜ;->close()V

    return-object v0

    .line 144
    :cond_a
    :try_start_3
    invoke-static {v5}, Ll/ᩳۖۜ;->ܿ(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    move-exception v0

    move-object v2, v0

    .line 141
    :try_start_4
    invoke-virtual {v11}, Ll/ۤۖۜ;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception v0

    move-object v3, v0

    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw v2
.end method

.method public final ֫(Ljava/lang/String;ILjava/lang/String;Z)Ll/ᩳܺۜ;
    .locals 15

    move/from16 v0, p2

    move-object v8, p0

    .line 52
    iget-object v7, v8, Ll/᩻ܺۜ;->ᩳ:Ll/ᩳۖۜ;

    invoke-virtual {v7}, Ll/ᩳۖۜ;->֫()Ll/۟ۢۜ;

    move-result-object v9

    const-string v1, "path"

    const/4 v10, 0x1

    move-object/from16 v2, p1

    .line 53
    invoke-static {v9, v2, v1, v10}, Ll/۫ۡۜ;->֫(Ll/۟ۢۜ;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v11

    .line 55
    iget-object v5, v9, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    const-string v6, ""

    move-object/from16 v1, p3

    move-object v2, v11

    move/from16 v3, p4

    move/from16 v4, p2

    .line 60
    invoke-static/range {v1 .. v6}, Ll/ۢۡۜ;->֫(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;)Ll/᩷ۡۜ;

    move-result-object v12

    .line 57
    invoke-virtual {v9, v11}, Ll/۟ۢۜ;->ܽ(Ljava/lang/String;)V

    .line 58
    invoke-virtual {v7, v11}, Ll/ᩳۖۜ;->֫(Ljava/lang/String;)Ll/ۤۖۜ;

    move-result-object v13

    .line 59
    :try_start_0
    invoke-virtual {v7, v11}, Ll/ᩳۖۜ;->ᩳ(Ljava/lang/String;)Ll/۫᩵ܿ;

    move-result-object v1

    .line 60
    invoke-virtual {v1}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v2

    sget-object v3, Ll/ۗ᩵ܿ;->ۙ:Ll/ۗ᩵ܿ;

    if-eq v2, v3, :cond_3

    .line 63
    invoke-virtual {v1}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v2

    sget-object v3, Ll/ۗ᩵ܿ;->᩹:Ll/ۗ᩵ܿ;

    if-ne v2, v3, :cond_2

    .line 67
    new-instance v14, Ll/۟ۡۜ;

    invoke-virtual {v1}, Ll/۫᩵ܿ;->֫()Ll/ܶ᩵ܿ;

    move-result-object v3

    move-object v1, v14

    move-object v2, p0

    move-object v4, v11

    move/from16 v5, p4

    move-object v6, v9

    move-object v7, v12

    invoke-direct/range {v1 .. v7}, Ll/۟ۡۜ;-><init>(Ll/᩻ܺۜ;Ll/ܶ᩵ܿ;Ljava/lang/String;ZLl/۟ۢۜ;Ll/᩷ۡۜ;)V

    .line 70
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 71
    :goto_0
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v1, v0, :cond_0

    invoke-static {v14}, Ll/۟ۡۜ;->֫(Ll/۟ۡۜ;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 72
    invoke-static {v14}, Ll/۟ۡۜ;->ܽ(Ll/۟ۡۜ;)Ll/ܽܺۜ;

    move-result-object v1

    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 74
    :cond_0
    invoke-static {v14}, Ll/۟ۡۜ;->֫(Ll/۟ۡۜ;)Z

    move-result v14

    if-eqz v14, :cond_1

    .line 76
    iget-object v4, v9, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    new-instance v5, Ll/᩷ۡۜ;

    .line 78
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v1

    sub-int/2addr v1, v10

    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܽܺۜ;

    iget-object v1, v1, Ll/ܽܺۜ;->֫:Ljava/lang/String;

    iget-object v2, v12, Ll/᩷ۡۜ;->ۧ:Ljava/lang/String;

    invoke-direct {v5, v1, v2}, Ll/᩷ۡۜ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const-string v6, ""

    move-object v1, v11

    move/from16 v2, p4

    move/from16 v3, p2

    .line 33
    invoke-static/range {v1 .. v6}, Ll/ۢۡۜ;->֫(Ljava/lang/String;ZILjava/lang/String;Ll/᩷ۡۜ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_1
    const-string v1, ""

    :goto_1
    move-object v5, v1

    .line 80
    new-instance v9, Ll/ᩳܺۜ;

    invoke-static {v7}, Ll/᩻ܺۜ;->֫(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-object v1, v9

    move-object v2, v11

    move v4, v14

    move/from16 v6, p4

    move/from16 v7, p2

    invoke-direct/range {v1 .. v7}, Ll/ᩳܺۜ;-><init>(Ljava/lang/String;Ljava/util/ArrayList;ZLjava/lang/String;ZI)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    invoke-virtual {v13}, Ll/ۤۖۜ;->close()V

    return-object v9

    :cond_2
    :try_start_1
    const-string v0, "FILE_NOT_DIRECTORY"

    const-string v2, "The requested path is not a directory."

    .line 65
    invoke-virtual {v1}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v1

    .line 64
    invoke-static {v0, v2, v11, v1}, Ll/ᩳۖۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ۗ᩵ܿ;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 61
    :cond_3
    invoke-static {v11}, Ll/ᩳۖۜ;->ܿ(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    move-object v1, v0

    .line 58
    :try_start_2
    invoke-virtual {v13}, Ll/ۤۖۜ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v1
.end method

.method public final ֫(Ljava/lang/String;ZLjava/lang/String;ILjava/lang/String;Ll/᩷ܺۜ;)Ll/ᩳܺۜ;
    .locals 21

    move-object/from16 v10, p0

    .line 88
    iget-object v0, v10, Ll/᩻ܺۜ;->ᩳ:Ll/ᩳۖۜ;

    invoke-virtual {v0}, Ll/ᩳۖۜ;->֫()Ll/۟ۢۜ;

    move-result-object v11

    const-string v1, "path"

    const/4 v12, 0x0

    move-object/from16 v2, p1

    .line 89
    invoke-static {v11, v2, v1, v12}, Ll/۫ۡۜ;->֫(Ll/۟ۢۜ;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v13

    .line 90
    iget-object v6, v11, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    move-object/from16 v2, p3

    move-object v3, v13

    move/from16 v4, p2

    move/from16 v5, p4

    move-object/from16 v7, p5

    invoke-static/range {v2 .. v7}, Ll/ۢۡۜ;->֫(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;)Ll/᩷ۡۜ;

    move-result-object v14

    .line 92
    invoke-virtual {v11, v13}, Ll/۟ۢۜ;->ܽ(Ljava/lang/String;)V

    .line 93
    invoke-virtual {v0, v13}, Ll/ᩳۖۜ;->֫(Ljava/lang/String;)Ll/ۤۖۜ;

    move-result-object v15

    .line 94
    :try_start_0
    invoke-virtual {v0, v13}, Ll/ᩳۖۜ;->ᩳ(Ljava/lang/String;)Ll/۫᩵ܿ;

    move-result-object v0

    .line 95
    invoke-virtual {v0}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v1

    sget-object v2, Ll/ۗ᩵ܿ;->ۙ:Ll/ۗ᩵ܿ;

    if-eq v1, v2, :cond_5

    .line 98
    invoke-virtual {v0}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v1

    sget-object v2, Ll/ۗ᩵ܿ;->᩹:Ll/ۗ᩵ܿ;

    if-ne v1, v2, :cond_4

    .line 102
    new-instance v16, Ll/۟ۡۜ;

    invoke-virtual {v0}, Ll/۫᩵ܿ;->֫()Ll/ܶ᩵ܿ;

    move-result-object v3

    const/4 v9, 0x0

    move-object/from16 v1, v16

    move-object/from16 v2, p0

    move-object v4, v13

    move/from16 v5, p2

    move-object v6, v11

    move-object v7, v14

    move-object/from16 v8, p6

    invoke-direct/range {v1 .. v9}, Ll/۟ۡۜ;-><init>(Ll/᩻ܺۜ;Ll/ܶ᩵ܿ;Ljava/lang/String;ZLl/۟ۢۜ;Ll/᩷ۡۜ;Ll/᩷ܺۜ;I)V

    .line 104
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 105
    iget-object v1, v14, Ll/᩷ۡۜ;->֫:Ljava/lang/String;

    .line 107
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    .line 108
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    move/from16 v8, p4

    if-ge v4, v8, :cond_2

    const/16 v4, 0x7d0

    if-ge v12, v4, :cond_2

    invoke-static/range {v16 .. v16}, Ll/۟ۡۜ;->֫(Ll/۟ۡۜ;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 109
    invoke-static {}, Ll/ۖܺۜ;->֫()V

    .line 110
    invoke-static/range {v16 .. v16}, Ll/۟ۡۜ;->ܽ(Ll/۟ۡۜ;)Ll/ܽܺۜ;

    move-result-object v1

    .line 111
    iget-object v4, v1, Ll/ܽܺۜ;->֫:Ljava/lang/String;

    add-int/lit8 v12, v12, 0x1

    .line 113
    iget-object v5, v1, Ll/ܽܺۜ;->ۧ:Ll/۫᩵ܿ;

    move-object/from16 v6, p6

    invoke-virtual {v6, v5}, Ll/᩷ܺۜ;->֫(Ll/۫᩵ܿ;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 114
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 117
    :cond_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v17

    sub-long v17, v17, v2

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    move-wide/from16 v19, v2

    const-wide/16 v2, 0x2

    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v1

    cmp-long v3, v17, v1

    move-object v1, v4

    if-ltz v3, :cond_1

    goto :goto_1

    :cond_1
    move-wide/from16 v2, v19

    goto :goto_0

    .line 121
    :cond_2
    :goto_1
    invoke-static/range {v16 .. v16}, Ll/۟ۡۜ;->ۧ(Ll/۟ۡۜ;)Z

    move-result v9

    if-eqz v9, :cond_3

    .line 122
    iget-object v5, v11, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    new-instance v6, Ll/᩷ۡۜ;

    iget-object v2, v14, Ll/᩷ۡۜ;->ۧ:Ljava/lang/String;

    invoke-direct {v6, v1, v2}, Ll/᩷ۡۜ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object v2, v13

    move/from16 v3, p2

    move/from16 v4, p4

    move-object/from16 v7, p5

    invoke-static/range {v2 .. v7}, Ll/ۢۡۜ;->֫(Ljava/lang/String;ZILjava/lang/String;Ll/᩷ۡۜ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    :cond_3
    const-string v1, ""

    :goto_2
    move-object v6, v1

    .line 125
    new-instance v1, Ll/ᩳܺۜ;

    invoke-static {v0}, Ll/᩻ܺۜ;->֫(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-object v2, v1

    move-object v3, v13

    move v5, v9

    move/from16 v7, p2

    move/from16 v8, p4

    invoke-direct/range {v2 .. v8}, Ll/ᩳܺۜ;-><init>(Ljava/lang/String;Ljava/util/ArrayList;ZLjava/lang/String;ZI)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 127
    invoke-virtual {v15}, Ll/ۤۖۜ;->close()V

    return-object v1

    :cond_4
    :try_start_1
    const-string v1, "FILE_NOT_DIRECTORY"

    const-string v2, "The requested path is not a directory."

    .line 100
    invoke-virtual {v0}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v0

    .line 99
    invoke-static {v1, v2, v13, v0}, Ll/ᩳۖۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ۗ᩵ܿ;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 96
    :cond_5
    invoke-static {v13}, Ll/ᩳۖۜ;->ܿ(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    move-object v1, v0

    .line 93
    :try_start_2
    invoke-virtual {v15}, Ll/ۤۖۜ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw v1
.end method
