.class public final Ll/᩶֡ۢ;
.super Ljava/lang/Object;
.source "27BV"


# instance fields
.field public final ֫:Ljava/util/concurrent/atomic/AtomicLong;

.field public final ۧ:Ll/ۧۤᩴ;

.field public final ܽ:Ll/ۗ֡ۢ;


# direct methods
.method public constructor <init>(Ll/ۗ֡ۢ;)V
    .locals 3

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    new-instance v0, Ll/ۧۤᩴ;

    invoke-direct {v0}, Ll/ۧۤᩴ;-><init>()V

    iput-object v0, p0, Ll/᩶֡ۢ;->ۧ:Ll/ۧۤᩴ;

    .line 35
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v1, 0x1

    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object v0, p0, Ll/᩶֡ۢ;->֫:Ljava/util/concurrent/atomic/AtomicLong;

    .line 41
    iput-object p1, p0, Ll/᩶֡ۢ;->ܽ:Ll/ۗ֡ۢ;

    return-void
.end method

.method public static ֫(Ll/ۢۧ᩻;)Ljava/util/LinkedHashMap;
    .locals 3

    .line 348
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 349
    invoke-virtual {p0}, Ll/ܺۘܳ;->isDirectory()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "single-folder"

    goto :goto_0

    :cond_0
    const-string v1, "single-file"

    :goto_0
    const-string v2, "mode"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "name"

    .line 350
    invoke-virtual {p0}, Ll/ܺۘܳ;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "parent"

    .line 351
    invoke-virtual {p0}, Ll/ܺۘܳ;->getParent()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 352
    invoke-virtual {p0}, Ll/ܺۘܳ;->۬()Z

    move-result v1

    if-eqz v1, :cond_1

    const p0, 0x7f12051a

    .line 353
    invoke-static {p0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p0

    goto :goto_2

    .line 354
    :cond_1
    invoke-virtual {p0}, Ll/ܺۘܳ;->isDirectory()Z

    move-result p0

    if-eqz p0, :cond_2

    const p0, 0x7f1203fb

    goto :goto_1

    :cond_2
    const p0, 0x7f120393

    :goto_1
    invoke-static {p0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p0

    :goto_2
    const-string v1, "typeLabel"

    .line 352
    invoke-interface {v0, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public static bridge synthetic ֫(Ll/᩶֡ۢ;)Ll/ۧۤᩴ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩶֡ۢ;->ۧ:Ll/ۧۤᩴ;

    return-object p0
.end method

.method public static ֫(Ljava/util/LinkedHashMap;Ll/ۢۧ᩻;)V
    .locals 3

    .line 362
    invoke-virtual {p1}, Ll/ܺۘܳ;->getTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll/ܿۤۡ;->ۧ(J)Ljava/lang/String;

    move-result-object v0

    const-string v1, "timeLabel"

    invoke-interface {p0, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 373
    invoke-virtual {p1}, Ll/ۢۧ᩻;->ܶۧ()Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 375
    invoke-virtual {p1}, Ll/ܺۘܳ;->isDirectory()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Ll/ۢۧ᩻;->ܿ()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_2

    .line 377
    :cond_0
    invoke-virtual {p1}, Ll/ۢۧ᩻;->֨ۧ()Ll/ܽۜܳ;

    move-result-object v1

    invoke-static {v1}, Ll/ۢۧ᩻;->ۧ(Ll/ܽۜܳ;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 378
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۫֫()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_2

    .line 383
    :cond_1
    :try_start_0
    instance-of v1, v0, Ll/ۨᩴܿ;

    if-eqz v1, :cond_2

    check-cast v0, Ll/ۨᩴܿ;

    .line 384
    invoke-virtual {v0}, Ll/ۨᩴܿ;->᩶ۧ()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 386
    :cond_2
    invoke-virtual {p1}, Ll/ܺۘܳ;->getPath()Ljava/lang/String;

    move-result-object v0

    .line 388
    :goto_0
    invoke-static {v0}, Ll/᩶᩶ܿ;->֫(Ljava/lang/String;)Ll/ܿ᩹ܿ;

    move-result-object v0

    .line 389
    new-instance v1, Ll/ܽۜܳ;

    invoke-direct {v1, v0}, Ll/ܽۜܳ;-><init>(Ll/ܿ᩹ܿ;)V

    invoke-virtual {p1, v1}, Ll/ۢۧ᩻;->֫(Ll/ܽۜܳ;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    nop

    goto :goto_2

    .line 398
    :cond_3
    :goto_1
    invoke-virtual {p1}, Ll/ۢۧ᩻;->֨ۧ()Ll/ܽۜܳ;

    move-result-object v0

    .line 399
    invoke-virtual {v0}, Ll/ܽۜܳ;->ܿ()Landroid/text/SpannableString;

    move-result-object v1

    invoke-virtual {v1}, Landroid/text/SpannableString;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "permissionsLabel"

    invoke-interface {p0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 400
    invoke-virtual {v0}, Ll/ܽۜܳ;->ۜ()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_4

    const-string v1, "ownerLabel"

    .line 401
    invoke-virtual {v0}, Ll/ܽۜܳ;->ۜ()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 403
    :cond_4
    invoke-virtual {v0}, Ll/ܽۜܳ;->֫()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_5

    const-string v1, "groupLabel"

    .line 404
    invoke-virtual {v0}, Ll/ܽۜܳ;->֫()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 364
    :cond_5
    :goto_2
    invoke-virtual {p1}, Ll/ܺۘܳ;->۬()Z

    move-result v0

    if-eqz v0, :cond_6

    const-string v0, "linkPath"

    .line 365
    invoke-virtual {p1}, Ll/ܺۘܳ;->ۧ֫()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    return-void
.end method

.method public static ۧ(Ll/ܺܳܳ;)Ll/۠֡ۢ;
    .locals 2

    .line 159
    invoke-static {p0}, Ll/ۜ֡ۢ;->֫(Ll/ܺܳܳ;)Lbin/mt/json/JSONObject;

    move-result-object p0

    .line 160
    new-instance v0, Ll/۠֡ۢ;

    .line 411
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 161
    invoke-static {p0}, Ll/ۜ֡ۢ;->֫(Lbin/mt/json/JSONObject;)Ljava/util/ArrayList;

    move-result-object v1

    iput-object v1, v0, Ll/۠֡ۢ;->ۧ:Ljava/util/ArrayList;

    const-string v1, "basePath"

    .line 162
    invoke-static {p0, v1}, Ll/ۜ֡ۢ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Ll/۠֡ۢ;->֫:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public final ֫(Ll/ܺܳܳ;)Ll/۠ܳܳ;
    .locals 14

    .line 282
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    .line 283
    iget-object v2, p0, Ll/᩶֡ۢ;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {v2}, Ll/ۧۤᩴ;->entrySet()Ljava/util/Set;

    move-result-object v3

    new-instance v4, Ll/֡֡ۢ;

    invoke-direct {v4, v0, v1}, Ll/֡֡ۢ;-><init>(J)V

    invoke-static {v3, v4}, Ll/ۚ۬ᩴ;->removeIf(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    .line 49
    invoke-virtual {p1}, Ll/ܺܳܳ;->ܳ()Ll/ۘܳܳ;

    move-result-object v0

    .line 50
    sget-object v1, Ll/ۘܳܳ;->ܰ:Ll/ۘܳܳ;

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v3, 0x1

    const v4, 0x7f120827

    const/4 v5, 0x0

    iget-object v6, p0, Ll/᩶֡ۢ;->ܽ:Ll/ۗ֡ۢ;

    if-eqz v1, :cond_e

    const-wide/16 v0, 0x0

    .line 319
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    .line 321
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 75
    :try_start_0
    invoke-static {p1}, Ll/᩶֡ۢ;->ۧ(Ll/ܺܳܳ;)Ll/۠֡ۢ;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ll/ܶܳܳ; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ll/᩻֡ۢ; {:try_start_0 .. :try_end_0} :catch_0

    .line 79
    iget-object v7, p1, Ll/۠֡ۢ;->ۧ:Ljava/util/ArrayList;

    if-eqz v7, :cond_d

    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_0

    goto/16 :goto_8

    .line 82
    :cond_0
    iget-object v7, p1, Ll/۠֡ۢ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-le v7, v3, :cond_1

    iget-object v7, p1, Ll/۠֡ۢ;->֫:Ljava/lang/String;

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_1

    .line 83
    sget-object p1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    new-array v0, v3, [Ljava/lang/Object;

    const-string v1, "basePath"

    aput-object v1, v0, v5

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    invoke-static {v4, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    .line 86
    :cond_1
    new-instance v4, Ljava/util/ArrayList;

    iget-object v7, p1, Ll/۠֡ۢ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v7

    invoke-direct {v4, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 87
    iget-object v7, p1, Ll/۠֡ۢ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_5

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    .line 290
    sget-object v9, Ll/ۖۧ᩻;->᩹:Ll/ۖۧ᩻;

    invoke-virtual {v9, v8}, Ll/ۖۧ᩻;->֫(Ljava/lang/String;)Ll/ᩳۜܳ;

    move-result-object v8

    .line 291
    check-cast v8, Ll/ۢۧ᩻;

    if-eqz v8, :cond_2

    goto :goto_1

    :cond_2
    const/4 v8, 0x0

    :goto_1
    if-eqz v8, :cond_4

    .line 66
    invoke-virtual {v8}, Ll/ܺۘܳ;->۬()Z

    move-result v9

    if-nez v9, :cond_3

    invoke-virtual {v8}, Ll/ۢۧ᩻;->ܶۧ()Ll/ܶ᩵ܿ;

    move-result-object v9

    invoke-virtual {v9}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v9

    if-nez v9, :cond_3

    goto :goto_2

    .line 92
    :cond_3
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 90
    :cond_4
    :goto_2
    sget-object p1, Ll/֨ܳܳ;->ᩳ֫:Ll/֨ܳܳ;

    new-array v0, v5, [Ljava/lang/Object;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v1, 0x7f120822

    .line 62
    invoke-static {v1, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    .line 96
    :cond_5
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v7

    const-string v8, "sizeBytes"

    if-ne v7, v3, :cond_7

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۢۧ᩻;

    invoke-virtual {v7}, Ll/ܺۘܳ;->ۙ֫()Z

    move-result v7

    if-eqz v7, :cond_7

    .line 97
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۢۧ᩻;

    .line 170
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    const-string v1, "done"

    .line 171
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 301
    invoke-static {p1}, Ll/᩶֡ۢ;->֫(Ll/ۢۧ᩻;)Ljava/util/LinkedHashMap;

    move-result-object v1

    .line 302
    invoke-virtual {p1}, Ll/ܺۘܳ;->getSize()J

    move-result-wide v2

    .line 303
    invoke-virtual {p1}, Ll/ܺۘܳ;->ܳۧ()J

    move-result-wide v4

    const-wide/16 v9, -0x1

    cmp-long v7, v4, v9

    if-eqz v7, :cond_6

    cmp-long v7, v4, v2

    if-eqz v7, :cond_6

    const-string v7, "logicalSizeBytes"

    .line 305
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v1, v7, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "actualSizeBytes"

    .line 306
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    .line 308
    :cond_6
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v1, v8, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 310
    :goto_3
    invoke-static {v1, p1}, Ll/᩶֡ۢ;->֫(Ljava/util/LinkedHashMap;Ll/ۢۧ᩻;)V

    const-string p1, "property"

    .line 172
    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, Ll/ۗ֡ۢ;->֫(Ljava/util/Map;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    .line 275
    :cond_7
    new-instance v7, Ljava/lang/StringBuilder;

    const-string v9, "fp-"

    invoke-direct {v7, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v9, p0, Ll/᩶֡ۢ;->֫:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v9}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    move-result-wide v9

    invoke-virtual {v7, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 101
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v9

    const-string v10, "folderCount"

    const-string v11, "fileCount"

    if-ne v9, v3, :cond_8

    .line 102
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۢۧ᩻;

    .line 318
    invoke-static {p1}, Ll/᩶֡ۢ;->֫(Ll/ۢۧ᩻;)Ljava/util/LinkedHashMap;

    move-result-object v3

    .line 319
    invoke-interface {v3, v8, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 320
    invoke-static {v3, p1}, Ll/᩶֡ۢ;->֫(Ljava/util/LinkedHashMap;Ll/ۢۧ᩻;)V

    .line 321
    invoke-interface {v3, v11, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 322
    invoke-interface {v3, v10, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    new-instance v0, Ll/ۚ֡ۢ;

    invoke-direct {v0, p0, v7, v3, p1}, Ll/ۚ֡ۢ;-><init>(Ll/᩶֡ۢ;Ljava/lang/String;Ljava/util/LinkedHashMap;Ll/ۢۧ᩻;)V

    goto :goto_7

    .line 103
    :cond_8
    iget-object p1, p1, Ll/۠֡ۢ;->֫:Ljava/lang/String;

    .line 145
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9

    const-string v12, "/"

    if-nez v9, :cond_b

    invoke-virtual {v12, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    goto :goto_5

    .line 148
    :cond_9
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v9

    :goto_4
    if-le v9, v3, :cond_a

    add-int/lit8 v12, v9, -0x1

    .line 149
    invoke-virtual {p1, v12}, Ljava/lang/String;->charAt(I)C

    move-result v12

    const/16 v13, 0x2f

    if-ne v12, v13, :cond_a

    add-int/lit8 v9, v9, -0x1

    goto :goto_4

    .line 152
    :cond_a
    invoke-virtual {p1, v5, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v12

    .line 330
    :cond_b
    :goto_5
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    const-string v3, "mode"

    const-string v5, "multi"

    .line 331
    invoke-interface {p1, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 332
    new-instance v3, Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 333
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_c

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ۢۧ᩻;

    .line 334
    invoke-virtual {v9}, Ll/ܺۘܳ;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_c
    const-string v5, "names"

    .line 336
    invoke-interface {p1, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "parent"

    .line 337
    invoke-interface {p1, v3, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 338
    invoke-interface {p1, v8, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 339
    invoke-interface {p1, v11, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 340
    invoke-interface {p1, v10, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 220
    new-instance v0, Ll/֨֡ۢ;

    invoke-direct {v0, p0, v7, p1, v4}, Ll/֨֡ۢ;-><init>(Ll/᩶֡ۢ;Ljava/lang/String;Ljava/util/LinkedHashMap;Ljava/util/ArrayList;)V

    .line 104
    :goto_7
    invoke-virtual {v0}, Ll/᩹֡ۢ;->֫()Ljava/util/LinkedHashMap;

    move-result-object p1

    .line 105
    invoke-virtual {v2, v7, v0}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 442
    sget-object v1, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Ll/ܶ֡ۢ;

    invoke-direct {v2, v0}, Ll/ܶ֡ۢ;-><init>(Ll/᩹֡ۢ;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 107
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Ll/ۗ֡ۢ;->֫(Ljava/util/Map;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    .line 80
    :cond_d
    :goto_8
    sget-object p1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    new-array v0, v3, [Ljava/lang/Object;

    const-string v1, "paths"

    aput-object v1, v0, v5

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    invoke-static {v4, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    .line 77
    :catch_0
    sget-object p1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    new-array v0, v5, [Ljava/lang/Object;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v1, 0x7f12082b

    .line 62
    invoke-static {v1, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    .line 53
    :cond_e
    sget-object v1, Ll/ۘܳܳ;->ۗ:Ll/ۘܳܳ;

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    const v7, 0x7f12082f

    const-string v8, "taskId"

    if-eqz v1, :cond_11

    .line 114
    invoke-static {p1, v8}, Ll/ܿۚۢ;->ۧ(Ll/ۖܳܳ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 115
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 116
    sget-object p1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    new-array v0, v3, [Ljava/lang/Object;

    aput-object v8, v0, v5

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    invoke-static {v4, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    .line 118
    :cond_f
    invoke-virtual {v2, p1}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩹֡ۢ;

    if-nez p1, :cond_10

    .line 120
    sget-object p1, Ll/֨ܳܳ;->ᩳ֫:Ll/֨ܳܳ;

    new-array v0, v5, [Ljava/lang/Object;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    invoke-static {v7, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    .line 122
    :cond_10
    invoke-virtual {p1}, Ll/᩹֡ۢ;->֫()Ljava/util/LinkedHashMap;

    move-result-object p1

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Ll/ۗ֡ۢ;->֫(Ljava/util/Map;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    .line 56
    :cond_11
    sget-object v1, Ll/ۘܳܳ;->ۙ:Ll/ۘܳܳ;

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_14

    .line 129
    invoke-static {p1, v8}, Ll/ܿۚۢ;->ۧ(Ll/ۖܳܳ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 130
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_12

    .line 131
    sget-object p1, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    new-array v0, v3, [Ljava/lang/Object;

    aput-object v8, v0, v5

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    invoke-static {v4, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    .line 133
    :cond_12
    invoke-virtual {v2, p1}, Ll/ۧۤᩴ;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩹֡ۢ;

    if-nez p1, :cond_13

    .line 135
    sget-object p1, Ll/֨ܳܳ;->ᩳ֫:Ll/֨ܳܳ;

    new-array v0, v5, [Ljava/lang/Object;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    invoke-static {v7, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    .line 137
    :cond_13
    invoke-virtual {p1}, Ll/᩹֡ۢ;->ۧ()V

    .line 138
    sget-object p1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Ll/ۗ֡ۢ;->֫(Ljava/util/Map;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1

    .line 59
    :cond_14
    sget-object p1, Ll/֨ܳܳ;->֫֫:Ll/֨ܳܳ;

    new-array v0, v5, [Ljava/lang/Object;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v1, 0x7f120824

    .line 62
    invoke-static {v1, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object p1

    return-object p1
.end method
