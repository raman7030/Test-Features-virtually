.class public final Ll/ܳۨܿ;
.super Ljava/lang/Object;
.source "C4QU"


# static fields
.field public static ۜ:J = 0x0L

.field public static ۡ:Z = true

.field public static ۢ:Ljava/util/Set;

.field public static final ܳ:Ljava/util/concurrent/atomic/AtomicLong;

.field public static ᩷:Ll/ۨۛܿ;

.field public static ᩻:Ll/ۨۛܿ;


# instance fields
.field public final ֫:Ll/ۗܺ᩷;

.field public ۧ:Ljava/util/ArrayList;

.field public ܽ:Landroid/widget/BaseAdapter;

.field public final ܿ:Ll/۟ۛܿ;

.field public ᩳ:Ll/֡ۚۢ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 66
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Ll/ܳۨܿ;->ۢ:Ljava/util/Set;

    .line 1027
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    sput-object v0, Ll/ܳۨܿ;->ܳ:Ljava/util/concurrent/atomic/AtomicLong;

    return-void
.end method

.method public constructor <init>(Ll/ۗܺ᩷;)V
    .locals 1

    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 72
    new-instance v0, Ll/۟ۛܿ;

    .line 293
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 72
    iput-object v0, p0, Ll/ܳۨܿ;->ܿ:Ll/۟ۛܿ;

    .line 75
    iput-object p1, p0, Ll/ܳۨܿ;->֫:Ll/ۗܺ᩷;

    return-void
.end method

.method public static ֫(Ll/ۤۚۢ;ILjava/lang/String;JLl/֨ۛܿ;Ll/۫ۛܿ;)Ll/֫ۨܿ;
    .locals 9

    .line 1303
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "settings get --user "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " secure "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    move-object v1, p0

    move-wide v5, p3

    move-object v7, p5

    move-object v8, p6

    invoke-static/range {v1 .. v8}, Ll/ܳۨܿ;->֫(Ll/ۤۚۢ;Ljava/lang/String;IZJLl/֨ۛܿ;Ll/۫ۛܿ;)Ll/֫ۨܿ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ۤۚۢ;ILjava/lang/String;Ljava/lang/String;JLl/֨ۛܿ;Ll/۫ۛܿ;)Ll/֫ۨܿ;
    .locals 10

    .line 1315
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "settings put --user "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move v1, p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " secure "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object v1, p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1438
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "\'"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v3, "\'\\\'\'"

    move-object v4, p3

    invoke-virtual {p3, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 1315
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x1

    move-object v2, p0

    move-wide v6, p4

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    .line 1316
    invoke-static/range {v2 .. v9}, Ll/ܳۨܿ;->֫(Ll/ۤۚۢ;Ljava/lang/String;IZJLl/֨ۛܿ;Ll/۫ۛܿ;)Ll/֫ۨܿ;

    move-result-object v0

    return-object v0
.end method

.method public static ֫(Ll/ۤۚۢ;Ljava/lang/String;IZJLl/֨ۛܿ;Ll/۫ۛܿ;)Ll/֫ۨܿ;
    .locals 8

    const-string p6, "; } | while IFS= read -r mt_ar_line || [ -n \"$mt_ar_line\" ]; do print -r -- \"MT_AR_OUT:$mt_ar_line\"; done; print -r -- \'"

    const-string v1, "{ "

    const-string v2, "MT_AR_DONE:"

    move-object v0, p0

    .line 1331
    monitor-enter v0

    .line 1332
    :try_start_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v3

    sub-long/2addr p4, v3

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    cmp-long v6, p4, v3

    if-gtz v6, :cond_0

    .line 1050
    new-instance p0, Ll/֫ۨܿ;

    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-direct {p0, p1, v5}, Ll/֫ۨܿ;-><init>(Ljava/util/List;Z)V

    .line 1334
    monitor-exit v0

    return-object p0

    :cond_0
    const-wide/16 v3, 0x9c4

    .line 1336
    invoke-static {v3, v4, p4, p5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p4

    const/4 v3, 0x1

    if-eqz p3, :cond_1

    .line 1338
    iput-boolean v3, p7, Ll/۫ۛܿ;->֫:Z

    .line 1344
    :cond_1
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object p7, Ll/ܳۨܿ;->ܳ:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {p7}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    move-result-object p7

    invoke-virtual {p3, p7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    .line 1345
    new-instance p7, Ljava/lang/StringBuilder;

    invoke-direct {p7, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p7, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p7, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\'"

    invoke-virtual {p7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1351
    :try_start_1
    invoke-interface {p0, p4, p5, p1}, Ll/ۤۚۢ;->֫(JLjava/lang/String;)Ll/۫ۚۢ;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1357
    :try_start_2
    iget-object p4, p1, Ll/۫ۚۢ;->֫:Ljava/lang/String;

    const-string p5, "Read shell timeout."

    const-string p6, "\\n"

    const/4 p7, -0x1

    .line 1390
    invoke-virtual {p4, p6, p7}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object p4

    array-length p6, p4

    const/4 p7, 0x0

    :goto_0
    if-ge p7, p6, :cond_3

    aget-object v1, p4, p7

    .line 1391
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 p4, 0x1

    goto :goto_1

    :cond_2
    add-int/lit8 p7, p7, 0x1

    goto :goto_0

    :cond_3
    const/4 p4, 0x0

    .line 1358
    :goto_1
    invoke-interface {p0}, Ll/ۤۚۢ;->֫()Z

    move-result p5

    .line 1359
    new-instance p6, Ljava/util/ArrayList;

    invoke-direct {p6}, Ljava/util/ArrayList;-><init>()V

    .line 1360
    iget-object p7, p1, Ll/۫ۚۢ;->ۧ:[Ljava/lang/String;

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 1373
    :goto_2
    array-length v4, p7

    if-ge v1, v4, :cond_6

    .line 1374
    aget-object v4, p7, v1

    .line 1375
    invoke-virtual {p3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    add-int/lit8 v2, v2, 0x1

    .line 1377
    array-length v4, p7

    sub-int/2addr v4, v3

    if-eq v1, v4, :cond_5

    goto :goto_3

    :cond_4
    const-string v6, "MT_AR_OUT:"

    .line 1380
    invoke-virtual {v4, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_7

    const/16 v6, 0xa

    .line 1381
    invoke-virtual {v4, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_6
    if-ne v2, v3, :cond_7

    const/4 p3, 0x1

    goto :goto_4

    :cond_7
    :goto_3
    const/4 p3, 0x0

    :goto_4
    if-nez p4, :cond_8

    if-eqz p5, :cond_8

    if-nez p3, :cond_9

    .line 1361
    instance-of p4, p0, Ll/۬ۚۢ;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz p4, :cond_9

    .line 1400
    :cond_8
    :try_start_3
    invoke-interface {p0}, Ll/ۤۚۢ;->close()V
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 1364
    :catch_0
    :cond_9
    :try_start_4
    invoke-virtual {p1}, Ll/۫ۚۢ;->ۧ()Z

    move-result p0

    if-nez p0, :cond_b

    if-eqz p3, :cond_b

    invoke-virtual {p6}, Ljava/util/ArrayList;->size()I

    move-result p0

    if-eq p0, p2, :cond_a

    goto :goto_5

    .line 1367
    :cond_a
    new-instance p0, Ll/֫ۨܿ;

    invoke-direct {p0, p6, v3}, Ll/֫ۨܿ;-><init>(Ljava/util/List;Z)V

    monitor-exit v0

    return-object p0

    .line 1050
    :cond_b
    :goto_5
    new-instance p0, Ll/֫ۨܿ;

    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-direct {p0, p1, v5}, Ll/֫ۨܿ;-><init>(Ljava/util/List;Z)V

    .line 1365
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    return-object p0

    .line 1400
    :catch_1
    :try_start_5
    invoke-interface {p0}, Ll/ۤۚۢ;->close()V
    :try_end_5
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 1050
    :catch_2
    :try_start_6
    new-instance p0, Ll/֫ۨܿ;

    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-direct {p0, p1, v5}, Ll/֫ۨܿ;-><init>(Ljava/util/List;Z)V

    .line 1354
    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    .line 1368
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    throw p0
.end method

.method public static ֫(Ll/ۤۚۢ;IIJLl/֨ۛܿ;Ll/۫ۛܿ;)Ll/ۛۛܿ;
    .locals 11

    move-object/from16 v8, p6

    const/16 v0, 0x18

    move v1, p2

    if-lt v1, v0, :cond_0

    goto/16 :goto_0

    :cond_0
    const-string v2, "accessibility_enabled"

    move-object v0, p0

    move v1, p1

    move-wide v3, p3

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    .line 1215
    invoke-static/range {v0 .. v6}, Ll/ܳۨܿ;->֫(Ll/ۤۚۢ;ILjava/lang/String;JLl/֨ۛܿ;Ll/۫ۛܿ;)Ll/֫ۨܿ;

    move-result-object v0

    .line 1217
    iget-boolean v1, v0, Ll/֫ۨܿ;->ۧ:Z

    if-nez v1, :cond_2

    .line 1406
    iget-boolean v0, v8, Ll/۫ۛܿ;->֫:Z

    if-eqz v0, :cond_1

    .line 1407
    sget-object v0, Ll/ۛۛܿ;->۬:Ll/ۛۛܿ;

    return-object v0

    .line 1408
    :cond_1
    sget-object v0, Ll/ۛۛܿ;->᩶:Ll/ۛۛܿ;

    return-object v0

    .line 1220
    :cond_2
    iget-object v0, v0, Ll/֫ۨܿ;->֫:Ljava/util/List;

    const/4 v9, 0x0

    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    const-string v10, "1"

    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_0

    :cond_3
    const-string v2, "accessibility_enabled"

    const-string v3, "1"

    move-object v0, p0

    move v1, p1

    move-wide v4, p3

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    .line 1223
    invoke-static/range {v0 .. v7}, Ll/ܳۨܿ;->֫(Ll/ۤۚۢ;ILjava/lang/String;Ljava/lang/String;JLl/֨ۛܿ;Ll/۫ۛܿ;)Ll/֫ۨܿ;

    move-result-object v0

    .line 1225
    iget-boolean v0, v0, Ll/֫ۨܿ;->ۧ:Z

    if-nez v0, :cond_5

    .line 1406
    iget-boolean v0, v8, Ll/۫ۛܿ;->֫:Z

    if-eqz v0, :cond_4

    .line 1407
    sget-object v0, Ll/ۛۛܿ;->۬:Ll/ۛۛܿ;

    return-object v0

    .line 1408
    :cond_4
    sget-object v0, Ll/ۛۛܿ;->᩶:Ll/ۛۛܿ;

    return-object v0

    :cond_5
    const-string v2, "accessibility_enabled"

    move-object v0, p0

    move v1, p1

    move-wide v3, p3

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    .line 1228
    invoke-static/range {v0 .. v6}, Ll/ܳۨܿ;->֫(Ll/ۤۚۢ;ILjava/lang/String;JLl/֨ۛܿ;Ll/۫ۛܿ;)Ll/֫ۨܿ;

    move-result-object v0

    .line 1230
    iget-boolean v1, v0, Ll/֫ۨܿ;->ۧ:Z

    if-eqz v1, :cond_7

    iget-object v0, v0, Ll/֫ۨܿ;->֫:Ljava/util/List;

    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_1

    :cond_6
    :goto_0
    const/4 v0, 0x0

    return-object v0

    .line 1406
    :cond_7
    :goto_1
    iget-boolean v0, v8, Ll/۫ۛܿ;->֫:Z

    if-eqz v0, :cond_8

    .line 1407
    sget-object v0, Ll/ۛۛܿ;->۬:Ll/ۛۛܿ;

    return-object v0

    .line 1408
    :cond_8
    sget-object v0, Ll/ۛۛܿ;->᩶:Ll/ۛۛܿ;

    return-object v0
.end method

.method public static ֫(Ll/ۤۚۢ;ILjava/lang/String;JLl/ۚۛܿ;Ll/֨ۛܿ;Ll/۠ۛܿ;Ll/۫ۛܿ;)Ll/ۛۛܿ;
    .locals 9

    .line 1247
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    sub-long v0, p3, v0

    const-wide/16 v2, 0x9c4

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x0

    .line 1248
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    const-wide/16 v2, 0x1f40

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    move-wide v4, p3

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    .line 1249
    invoke-static/range {v2 .. v8}, Ll/ܳۨܿ;->֫(JJLl/ۚۛܿ;Ll/֨ۛܿ;Ll/۠ۛܿ;)Z

    const-string v4, "enabled_accessibility_services"

    move-object v2, p0

    move v3, p1

    move-wide v5, p3

    move-object/from16 v8, p8

    .line 1251
    invoke-static/range {v2 .. v8}, Ll/ܳۨܿ;->֫(Ll/ۤۚۢ;ILjava/lang/String;JLl/֨ۛܿ;Ll/۫ۛܿ;)Ll/֫ۨܿ;

    move-result-object v0

    .line 1253
    iget-boolean v1, v0, Ll/֫ۨܿ;->ۧ:Z

    if-nez v1, :cond_1

    move-object/from16 v1, p8

    .line 1406
    iget-boolean v0, v1, Ll/۫ۛܿ;->֫:Z

    if-eqz v0, :cond_0

    .line 1407
    sget-object v0, Ll/ۛۛܿ;->۬:Ll/ۛۛܿ;

    return-object v0

    .line 1408
    :cond_0
    sget-object v0, Ll/ۛۛܿ;->᩶:Ll/ۛۛܿ;

    return-object v0

    .line 1256
    :cond_1
    iget-object v0, v0, Ll/֫ۨܿ;->֫:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    move-object v1, p2

    invoke-static {v0, p2}, Ll/ܳۨܿ;->֫(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 1258
    sget-object v0, Ll/ۛۛܿ;->ۙ:Ll/ۛۛܿ;

    return-object v0

    .line 1261
    :cond_2
    invoke-static {}, Lbin/mt/function/ar/ActivityRecordService;->ܿ()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1262
    sget-object v0, Ll/ۛۛܿ;->ۗ:Ll/ۛۛܿ;

    return-object v0

    .line 1263
    :cond_3
    sget-object v0, Ll/ۛۛܿ;->᩹:Ll/ۛۛܿ;

    return-object v0
.end method

.method public static synthetic ֫(Ll/ۨۛܿ;)V
    .locals 0

    .line 431
    invoke-static {p0}, Ll/ܳۨܿ;->ۜ(Ll/ۨۛܿ;)V

    return-void
.end method

.method public static synthetic ֫(Ll/ۨۛܿ;Ll/֡ۚۢ;)V
    .locals 1

    .line 646
    sget-object v0, Ll/ۤۛܿ;->۬:Ll/ۤۛܿ;

    invoke-static {p0, p1, v0}, Ll/ܳۨܿ;->֫(Ll/ۨۛܿ;Ll/֡ۚۢ;Ll/ۤۛܿ;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 649
    :cond_0
    sget-object v0, Ll/ۤۛܿ;->ۗ:Ll/ۤۛܿ;

    iput-object v0, p0, Ll/ۨۛܿ;->ᩳ:Ll/ۤۛܿ;

    .line 650
    invoke-static {p0, p1}, Ll/ܳۨܿ;->ܳ(Ll/ۨۛܿ;Ll/֡ۚۢ;)V

    const/4 p1, 0x1

    .line 651
    invoke-static {p0, p1}, Ll/ܳۨܿ;->֫(Ll/ۨۛܿ;Z)V

    return-void
.end method

.method public static ֫(Ll/ۨۛܿ;Ll/֡ۚۢ;Landroid/widget/Button;Landroid/widget/Button;)V
    .locals 2

    .line 500
    sget-object v0, Ll/ۤۛܿ;->᩹:Ll/ۤۛܿ;

    invoke-static {p0, p1, v0}, Ll/ܳۨܿ;->֫(Ll/ۨۛܿ;Ll/֡ۚۢ;Ll/ۤۛܿ;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 503
    :cond_0
    sget-object v0, Ll/ۤۛܿ;->ۤ:Ll/ۤۛܿ;

    iput-object v0, p0, Ll/ۨۛܿ;->ᩳ:Ll/ۤۛܿ;

    const/4 v1, 0x1

    .line 504
    iput-boolean v1, p0, Ll/ۨۛܿ;->᩻:Z

    const/4 v1, 0x0

    .line 505
    invoke-virtual {p1, v1}, Ll/֡ۚۢ;->֫(Z)V

    .line 506
    invoke-virtual {p2, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 507
    invoke-virtual {p3, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 508
    invoke-static {p0, v0}, Ll/ܳۨܿ;->֫(Ll/ۨۛܿ;Ll/ۤۛܿ;)V

    .line 509
    sget-object p1, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance p2, Ll/᩶۫᩷;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 529
    :try_start_0
    new-instance p3, Ll/ܽۨܿ;

    invoke-direct {p3, p0, p2}, Ll/ܽۨܿ;-><init>(Ll/ۨۛܿ;Ll/᩶۫᩷;)V

    invoke-interface {p1, p3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 531
    :catch_0
    new-instance p1, Ll/֡ۛܿ;

    invoke-direct {p1, p0}, Ll/֡ۛܿ;-><init>(Ll/ۨۛܿ;)V

    invoke-static {p1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۨۛܿ;Ll/ۛۛܿ;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ܳۨܿ;->ۧ(Ll/ۨۛܿ;Ll/ۛۛܿ;)V

    return-void
.end method

.method public static ֫(Ll/ۨۛܿ;Ll/ۤۛܿ;)V
    .locals 5

    .line 804
    invoke-static {p0}, Ll/ܳۨܿ;->ܳ(Ll/ۨۛܿ;)V

    .line 805
    iget-object v0, p0, Ll/ۨۛܿ;->ܳ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܳۨܿ;

    if-eqz v0, :cond_1

    .line 806
    iget-object v0, v0, Ll/ܳۨܿ;->ܿ:Ll/۟ۛܿ;

    iget-object v1, v0, Ll/۟ۛܿ;->ᩳ:Ll/ۨۛܿ;

    if-eq v1, p0, :cond_0

    goto :goto_0

    .line 810
    :cond_0
    iget-wide v1, p0, Ll/ۨۛܿ;->ۧ:J

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    iput-wide v1, p0, Ll/ۨۛܿ;->ۧ:J

    .line 811
    iput-wide v1, v0, Ll/۟ۛܿ;->ۧ:J

    .line 812
    new-instance v0, Ll/᩶ۛܿ;

    invoke-direct {v0, p0, p1, v1, v2}, Ll/᩶ۛܿ;-><init>(Ll/ۨۛܿ;Ll/ۤۛܿ;J)V

    const-wide/16 p0, 0xc8

    invoke-static {v0, p0, p1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;J)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static synthetic ֫(Ll/ۨۛܿ;Ll/ۤۛܿ;J)V
    .locals 6

    .line 813
    iget-object v0, p0, Ll/ۨۛܿ;->ܳ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܳۨܿ;

    if-eqz v0, :cond_3

    const/4 v1, 0x0

    .line 815
    invoke-static {p0, v1}, Ll/ܳۨܿ;->ܽ(Ll/ۨۛܿ;Z)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Ll/ۨۛܿ;->ᩳ:Ll/ۤۛܿ;

    if-ne v2, p1, :cond_3

    iget-wide v2, p0, Ll/ۨۛܿ;->ۧ:J

    cmp-long v4, v2, p2

    if-eqz v4, :cond_0

    goto :goto_0

    .line 820
    :cond_0
    iget-object v2, v0, Ll/ܳۨܿ;->ܿ:Ll/۟ۛܿ;

    .line 821
    iget-object v3, v2, Ll/۟ۛܿ;->ᩳ:Ll/ۨۛܿ;

    if-ne v3, p0, :cond_3

    iget-wide v3, v2, Ll/۟ۛܿ;->ۧ:J

    cmp-long v5, v3, p2

    if-eqz v5, :cond_1

    goto :goto_0

    .line 826
    :cond_1
    :try_start_0
    new-instance v3, Ll/۬۬ܿ;

    iget-object v0, v0, Ll/ܳۨܿ;->֫:Ll/ۗܺ᩷;

    const v4, 0x7f120528

    invoke-direct {v3, v0, v4}, Ll/۬۬ܿ;-><init>(Ll/ۗܺ᩷;I)V

    .line 827
    invoke-virtual {v3}, Ll/۬۬ܿ;->ܳ()V

    .line 828
    invoke-static {p0, v1}, Ll/ܳۨܿ;->ܽ(Ll/ۨۛܿ;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll/ۨۛܿ;->ᩳ:Ll/ۤۛܿ;

    if-ne v0, p1, :cond_2

    iget-wide v0, p0, Ll/ۨۛܿ;->ۧ:J

    cmp-long p1, v0, p2

    if-nez p1, :cond_2

    iget-object p1, v2, Ll/۟ۛܿ;->ᩳ:Ll/ۨۛܿ;

    if-ne p1, p0, :cond_2

    iget-wide p0, v2, Ll/۟ۛܿ;->ۧ:J

    cmp-long v0, p0, p2

    if-nez v0, :cond_2

    .line 833
    iput-object v3, v2, Ll/۟ۛܿ;->֫:Ll/۬۬ܿ;

    return-void

    .line 835
    :cond_2
    invoke-virtual {v3}, Ll/۬۬ܿ;->֫()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_3
    :goto_0
    return-void
.end method

.method public static ֫(Ll/ۨۛܿ;Ll/ܰۛܿ;Ll/ۛۛܿ;)V
    .locals 7

    .line 932
    sget-object v0, Ll/ܳۨܿ;->᩻:Ll/ۨۛܿ;

    if-eq v0, p0, :cond_0

    goto :goto_0

    .line 935
    :cond_0
    sget-object v0, Ll/ۤۛܿ;->ۙ:Ll/ۤۛܿ;

    iput-object v0, p0, Ll/ۨۛܿ;->ᩳ:Ll/ۤۛܿ;

    iget-wide v0, p0, Ll/ۨۛܿ;->֫:J

    .line 936
    invoke-static {p0}, Ll/ܳۨܿ;->ܿ(Ll/ۨۛܿ;)V

    const/4 p0, 0x0

    .line 937
    sput-object p0, Ll/ܳۨܿ;->᩻:Ll/ۨۛܿ;

    const/4 v2, 0x0

    if-eqz p2, :cond_2

    .line 940
    sget-wide v3, Ll/ܳۨܿ;->ۜ:J

    cmp-long v5, v0, v3

    if-nez v5, :cond_2

    .line 595
    sget-object v3, Ll/ۛۛܿ;->۬:Ll/ۛۛܿ;

    if-eq p2, v3, :cond_1

    sget-object v3, Ll/ۛۛܿ;->ۙ:Ll/ۛۛܿ;

    if-eq p2, v3, :cond_1

    sget-object v3, Ll/ۛۛܿ;->᩹:Ll/ۛۛܿ;

    if-eq p2, v3, :cond_1

    sget-object v3, Ll/ۛۛܿ;->۫:Ll/ۛۛܿ;

    if-ne p2, v3, :cond_2

    .line 943
    :cond_1
    sput-boolean v2, Ll/ܳۨܿ;->ۡ:Z

    .line 946
    :cond_2
    sget-object v3, Ll/ܳۨܿ;->᩷:Ll/ۨۛܿ;

    .line 947
    sput-object p0, Ll/ܳۨܿ;->᩷:Ll/ۨۛܿ;

    if-nez v3, :cond_3

    goto :goto_0

    .line 948
    :cond_3
    iget-wide v4, v3, Ll/ۨۛܿ;->֫:J

    .line 951
    sget-object v6, Ll/ܰۛܿ;->᩹:Ll/ܰۛܿ;

    if-ne p1, v6, :cond_4

    cmp-long p1, v4, v0

    if-nez p1, :cond_4

    goto :goto_0

    .line 955
    :cond_4
    sget-wide v0, Ll/ܳۨܿ;->ۜ:J

    cmp-long p1, v4, v0

    if-nez p1, :cond_8

    invoke-static {v3}, Ll/ܳۨܿ;->᩻(Ll/ۨۛܿ;)Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_0

    .line 959
    :cond_5
    sput-object v3, Ll/ܳۨܿ;->᩻:Ll/ۨۛܿ;

    .line 960
    invoke-static {v3}, Ll/ܳۨܿ;->ᩳ(Ll/ۨۛܿ;)Z

    move-result p1

    if-nez p1, :cond_6

    .line 961
    sput-object p0, Ll/ܳۨܿ;->᩻:Ll/ۨۛܿ;

    return-void

    :cond_6
    if-eqz p2, :cond_7

    .line 966
    invoke-static {v3, v2}, Ll/ܳۨܿ;->֫(Ll/ۨۛܿ;Z)V

    return-void

    .line 969
    :cond_7
    invoke-static {v3, v2}, Ll/ܳۨܿ;->ۧ(Ll/ۨۛܿ;Z)V

    :cond_8
    :goto_0
    return-void
.end method

.method public static ֫(Ll/ۨۛܿ;Z)V
    .locals 5

    const/4 v0, 0x0

    .line 669
    invoke-static {p0, v0}, Ll/ܳۨܿ;->ܽ(Ll/ۨۛܿ;Z)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    .line 670
    sget-object p1, Ll/ܰۛܿ;->᩶:Ll/ܰۛܿ;

    .line 923
    :goto_0
    invoke-static {p0, p1, v2}, Ll/ܳۨܿ;->֫(Ll/ۨۛܿ;Ll/ܰۛܿ;Ll/ۛۛܿ;)V

    return-void

    :cond_0
    const/4 v1, 0x1

    if-eqz p1, :cond_1

    .line 673
    invoke-static {}, Lbin/mt/function/ar/ActivityRecordService;->ܿ()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 674
    invoke-static {v1}, Ll/ܳۨܿ;->֫(Z)V

    .line 675
    sget-object p1, Ll/ܰۛܿ;->᩹:Ll/ܰۛܿ;

    goto :goto_0

    .line 679
    :cond_1
    iget-object p1, p0, Ll/ۨۛܿ;->ܳ:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܳۨܿ;

    if-nez p1, :cond_2

    .line 681
    sget-object p1, Ll/ܰۛܿ;->᩶:Ll/ܰۛܿ;

    goto :goto_0

    .line 684
    :cond_2
    sget-object v3, Ll/ۤۛܿ;->ۗ:Ll/ۤۛܿ;

    iput-object v3, p0, Ll/ۨۛܿ;->ᩳ:Ll/ۤۛܿ;

    .line 686
    :try_start_0
    iget-object p1, p1, Ll/ܳۨܿ;->֫:Ll/ۗܺ᩷;

    new-instance v3, Landroid/content/Intent;

    const-string v4, "android.settings.ACCESSIBILITY_SETTINGS"

    invoke-direct {v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v3}, Ll/ۗܺ᩷;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    const p1, 0x7f120028

    .line 694
    :try_start_1
    invoke-static {p1}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p1

    new-array v1, v1, [Ljava/lang/Object;

    aput-object p1, v1, v0

    const p1, 0x7f120755

    .line 693
    invoke-static {p1, v1}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/᩸ۚۢ;->ۧ(Ljava/lang/CharSequence;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    .line 697
    :catch_0
    sget-object p1, Ll/ܰۛܿ;->᩹:Ll/ܰۛܿ;

    goto :goto_0

    .line 688
    :catch_1
    sget-object p1, Ll/ܰۛܿ;->᩶:Ll/ܰۛܿ;

    goto :goto_0
.end method

.method public static ֫(Ll/ܳۨܿ;)V
    .locals 3

    .line 355
    invoke-static {}, Lbin/mt/function/ar/ActivityRecordService;->ܿ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 356
    invoke-static {}, Lbin/mt/function/ar/ActivityRecordService;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 357
    invoke-static {}, Ll/ܳۨܿ;->ᩳ()V

    return-void

    :cond_0
    const/4 v1, 0x0

    if-nez v0, :cond_1

    .line 363
    invoke-static {v1}, Ll/ܳۨܿ;->֫(Z)V

    .line 372
    :cond_1
    new-instance v0, Ll/ۨۛܿ;

    invoke-direct {v0, p0}, Ll/ۨۛܿ;-><init>(Ll/ܳۨܿ;)V

    .line 373
    invoke-static {v0}, Ll/ܳۨܿ;->᩻(Ll/ۨۛܿ;)Z

    move-result p0

    if-nez p0, :cond_2

    goto :goto_0

    .line 376
    :cond_2
    sget-object p0, Ll/ܳۨܿ;->᩻:Ll/ۨۛܿ;

    const/4 v2, 0x0

    if-eqz p0, :cond_4

    .line 377
    sput-object v0, Ll/ܳۨܿ;->᩷:Ll/ۨۛܿ;

    .line 378
    iget-boolean v0, p0, Ll/ۨۛܿ;->᩻:Z

    if-nez v0, :cond_3

    .line 379
    invoke-static {p0, v1}, Ll/ܳۨܿ;->ܽ(Ll/ۨۛܿ;Z)Z

    move-result p0

    if-nez p0, :cond_3

    .line 380
    sget-object p0, Ll/ܳۨܿ;->᩻:Ll/ۨۛܿ;

    sget-object v0, Ll/ܰۛܿ;->᩶:Ll/ܰۛܿ;

    .line 923
    invoke-static {p0, v0, v2}, Ll/ܳۨܿ;->֫(Ll/ۨۛܿ;Ll/ܰۛܿ;Ll/ۛۛܿ;)V

    :cond_3
    :goto_0
    return-void

    .line 384
    :cond_4
    sput-object v0, Ll/ܳۨܿ;->᩻:Ll/ۨۛܿ;

    .line 385
    invoke-static {v0}, Ll/ܳۨܿ;->ᩳ(Ll/ۨۛܿ;)Z

    move-result p0

    if-nez p0, :cond_5

    .line 386
    sput-object v2, Ll/ܳۨܿ;->᩻:Ll/ۨۛܿ;

    return-void

    .line 389
    :cond_5
    invoke-static {v0, v1}, Ll/ܳۨܿ;->ۧ(Ll/ۨۛܿ;Z)V

    return-void
.end method

.method public static ֫(Ll/ܳۨܿ;Landroid/view/MenuItem;)V
    .locals 3

    .line 170
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    const v0, 0x7f120183

    const/4 v1, 0x0

    if-ne p1, v0, :cond_0

    .line 172
    sget-object p1, Lbin/mt/function/ar/ActivityRecordService;->ۨ:Ljava/util/LinkedList;

    move-object v0, p1

    monitor-enter v0

    .line 173
    :try_start_0
    invoke-virtual {p1}, Ljava/util/LinkedList;->clear()V

    .line 174
    invoke-static {}, Lbin/mt/function/ar/ActivityRecordService;->᩻()V

    .line 175
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 176
    sput-object v1, Lbin/mt/function/ar/ActivityRecordService;->ۛ:Ll/᩻ۨܿ;

    .line 177
    iget-object p1, p0, Ll/ܳۨܿ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 178
    iget-object p0, p0, Ll/ܳۨܿ;->ܽ:Landroid/widget/BaseAdapter;

    invoke-virtual {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void

    :catchall_0
    move-exception p0

    .line 175
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0

    :cond_0
    const v0, 0x7f1202b9

    if-ne p1, v0, :cond_1

    .line 180
    sget-object p0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string p1, "activity_record_floating_enable"

    const/4 v0, 0x0

    .line 0
    invoke-static {p0, p1, v0}, Ll/᩺۠ܽ;->֫(Ll/۫ۤۡ;Ljava/lang/String;Z)V

    .line 181
    invoke-static {}, Lbin/mt/function/ar/ActivityRecordService;->ۧ()V

    return-void

    :cond_1
    const v0, 0x7f1202f6

    if-ne p1, v0, :cond_3

    .line 183
    sget-object p1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v0, "activity_record_floating_enable"

    const/4 v2, 0x1

    .line 0
    invoke-static {p1, v0, v2}, Ll/᩺۠ܽ;->֫(Ll/۫ۤۡ;Ljava/lang/String;Z)V

    .line 184
    iget-object p1, p0, Ll/ܳۨܿ;->֫:Ll/ۗܺ᩷;

    invoke-static {p1}, Ll/ۢ֨ۢ;->֫(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 185
    invoke-static {}, Lbin/mt/function/ar/ActivityRecordService;->ܿ()Z

    move-result p0

    if-eqz p0, :cond_3

    invoke-static {}, Lbin/mt/function/ar/ActivityRecordService;->ܽ()Z

    move-result p0

    if-eqz p0, :cond_3

    .line 186
    invoke-static {}, Lbin/mt/function/ar/ActivityRecordService;->ܳ()V

    return-void

    .line 189
    :cond_2
    :try_start_2
    iget-object p1, p0, Ll/ܳۨܿ;->֫:Ll/ۗܺ᩷;

    .line 76
    invoke-static {p1, v1}, Ll/᩸ᩴܺ;->ܽ(Landroid/content/Context;Ll/ܶᩴܺ;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    return-void

    :catchall_1
    move-exception p1

    .line 191
    iget-object p0, p0, Ll/ܳۨܿ;->֫:Ll/ۗܺ᩷;

    .line 546
    invoke-virtual {p0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    :cond_3
    return-void
.end method

.method public static ֫(Ll/ܳۨܿ;Landroid/view/View;)V
    .locals 6

    .line 147
    new-instance v0, Ll/᩸ۖ;

    iget-object v1, p0, Ll/ܳۨܿ;->֫:Ll/ۗܺ᩷;

    const/4 v2, 0x0

    .line 68
    invoke-direct {v0, v1, p1, v2}, Ll/᩸ۖ;-><init>(Landroid/content/Context;Landroid/view/View;I)V

    .line 149
    invoke-virtual {v0}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object p1

    .line 241
    sget-object v3, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v4, "activity_record_floating_enable"

    const/4 v5, 0x1

    invoke-interface {v3, v4, v5}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    if-nez v3, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    .line 243
    :cond_0
    invoke-static {v1}, Ll/᩸ᩴܺ;->ۧ(Landroid/content/Context;)Z

    move-result v1

    :goto_0
    if-eqz v1, :cond_2

    .line 153
    invoke-static {}, Lbin/mt/function/ar/ActivityRecordService;->ܿ()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {}, Lbin/mt/function/ar/ActivityRecordService;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 154
    invoke-static {}, Lbin/mt/function/ar/ActivityRecordService;->ᩳ()Z

    move-result v1

    xor-int/2addr v5, v1

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    :cond_2
    :goto_1
    const v1, 0x7f120183

    .line 162
    invoke-interface {p1, v2, v1, v2, v1}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    if-eqz v5, :cond_3

    const v1, 0x7f1202f6

    .line 164
    invoke-interface {p1, v2, v1, v2, v1}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    goto :goto_2

    :cond_3
    const v1, 0x7f1202b9

    .line 166
    invoke-interface {p1, v2, v1, v2, v1}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    .line 169
    :goto_2
    new-instance p1, Ll/ܽ۫᩷;

    const/4 v1, 0x3

    invoke-direct {p1, v1, p0}, Ll/ܽ۫᩷;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, p1}, Ll/᩸ۖ;->֫(Ll/ܶۖ;)V

    .line 198
    invoke-virtual {v0}, Ll/᩸ۖ;->ܿ()V

    return-void
.end method

.method public static synthetic ֫(Ll/ܳۨܿ;Landroid/widget/Button;)V
    .locals 1

    .line 129
    invoke-static {p0}, Ll/ܳۨܿ;->᩻(Ll/ܳۨܿ;)V

    .line 130
    sget-object v0, Ll/ܳۨܿ;->ۢ:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 131
    iget-object p0, p0, Ll/ܳۨܿ;->֫:Ll/ۗܺ᩷;

    instance-of p1, p0, Ll/᩵᩶᩷;

    if-eqz p1, :cond_0

    .line 132
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :cond_0
    return-void
.end method

.method public static ֫(Z)V
    .locals 2

    .line 726
    invoke-static {p0}, Lbin/mt/function/ar/ActivityRecordService;->֫(Z)V

    if-eqz p0, :cond_0

    const p0, 0x7f1209e1

    goto :goto_0

    :cond_0
    const p0, 0x7f1209d2

    .line 728
    :goto_0
    sget-object v0, Ll/ܳۨܿ;->ۢ:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    if-eqz v1, :cond_1

    .line 730
    invoke-virtual {v1, p0}, Landroid/widget/TextView;->setText(I)V

    goto :goto_1

    :cond_2
    return-void
.end method

.method public static ֫(JJLl/ۚۛܿ;Ll/֨ۛܿ;Ll/۠ۛܿ;)Z
    .locals 4

    .line 1274
    invoke-static {}, Lbin/mt/function/ar/ActivityRecordService;->ܿ()Z

    move-result p4

    if-eqz p4, :cond_0

    goto :goto_0

    .line 1277
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p4

    const-wide/16 v0, 0x0

    .line 1278
    invoke-static {v0, v1, p0, p1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p0

    add-long/2addr p0, p4

    invoke-static {p2, p3, p0, p1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p0

    .line 1279
    :cond_1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p2

    cmp-long p4, p2, p0

    if-gez p4, :cond_4

    .line 1280
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p2

    const-wide/16 p4, 0xc8

    sub-long v2, p0, p2

    .line 1281
    invoke-static {p4, p5, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p4

    cmp-long p6, p4, v0

    if-gtz p6, :cond_2

    goto :goto_1

    .line 1286
    :cond_2
    invoke-static {p4, p5}, Landroid/os/SystemClock;->sleep(J)V

    .line 1287
    invoke-static {}, Lbin/mt/function/ar/ActivityRecordService;->ܿ()Z

    move-result p4

    if-eqz p4, :cond_3

    :goto_0
    const/4 p0, 0x1

    return p0

    .line 1290
    :cond_3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p4

    cmp-long p6, p4, p2

    if-gtz p6, :cond_1

    :cond_4
    :goto_1
    const/4 p0, 0x0

    return p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 5

    const/4 v0, 0x0

    if-eqz p0, :cond_3

    .line 1412
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "null"

    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    .line 1415
    :cond_0
    invoke-static {p1}, Landroid/content/ComponentName;->unflattenFromString(Ljava/lang/String;)Landroid/content/ComponentName;

    move-result-object p1

    if-nez p1, :cond_1

    return v0

    :cond_1
    const-string v1, ":"

    const/4 v2, -0x1

    .line 1419
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object p0

    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_3

    aget-object v3, p0, v2

    .line 1420
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_2

    .line 1421
    invoke-static {v3}, Landroid/content/ComponentName;->unflattenFromString(Ljava/lang/String;)Landroid/content/ComponentName;

    move-result-object v3

    .line 1422
    invoke-virtual {p1, v3}, Landroid/content/ComponentName;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 p0, 0x1

    return p0

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    return v0
.end method

.method public static ֫(Ll/ۨۛܿ;Ll/֡ۚۢ;Ll/ۤۛܿ;)Z
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 909
    iget-object v1, p0, Ll/ۨۛܿ;->ᩳ:Ll/ۤۛܿ;

    if-ne v1, p2, :cond_1

    const/4 p2, 0x1

    .line 911
    invoke-static {p0, p2}, Ll/ܳۨܿ;->ܽ(Ll/ۨۛܿ;Z)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 914
    :cond_0
    iget-object p0, p0, Ll/ۨۛܿ;->ܳ:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ܳۨܿ;

    if-eqz p0, :cond_1

    .line 915
    iget-object p0, p0, Ll/ܳۨܿ;->ܿ:Ll/۟ۛܿ;

    iget-object p0, p0, Ll/۟ۛܿ;->ܽ:Ll/֡ۚۢ;

    if-ne p0, p1, :cond_1

    return p2

    :cond_1
    :goto_0
    return v0
.end method

.method public static ۜ(Ll/ۨۛܿ;)V
    .locals 2

    .line 436
    sget-object v0, Ll/ܳۨܿ;->᩻:Ll/ۨۛܿ;

    if-eq v0, p0, :cond_0

    return-void

    .line 439
    :cond_0
    invoke-static {p0}, Ll/ܳۨܿ;->ܳ(Ll/ۨۛܿ;)V

    const/4 v0, 0x0

    .line 440
    iput-boolean v0, p0, Ll/ۨۛܿ;->᩻:Z

    .line 441
    invoke-static {p0, v0}, Ll/ܳۨܿ;->ܽ(Ll/ۨۛܿ;Z)Z

    move-result v0

    if-nez v0, :cond_1

    .line 442
    sget-object v0, Ll/ܰۛܿ;->᩶:Ll/ܰۛܿ;

    const/4 v1, 0x0

    .line 923
    invoke-static {p0, v0, v1}, Ll/ܳۨܿ;->֫(Ll/ۨۛܿ;Ll/ܰۛܿ;Ll/ۛۛܿ;)V

    return-void

    .line 446
    :cond_1
    sget-object v0, Ll/ۤۛܿ;->᩶:Ll/ۤۛܿ;

    iput-object v0, p0, Ll/ۨۛܿ;->ᩳ:Ll/ۤۛܿ;

    const/4 v0, 0x1

    .line 447
    invoke-static {p0, v0}, Ll/ܳۨܿ;->ۧ(Ll/ۨۛܿ;Z)V

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ܳۨܿ;)Ll/ۗܺ᩷;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܳۨܿ;->֫:Ll/ۗܺ᩷;

    return-object p0
.end method

.method public static ۧ()Ll/ۛۛܿ;
    .locals 21

    .line 510
    invoke-static {}, Ll/ۙ᩸᩷;->ܿ()Landroid/app/Application;

    move-result-object v0

    invoke-static {}, Ll/ۢ֨ۢ;->ܿ()Ll/ۤۚۢ;

    move-result-object v9

    .line 1058
    sget v10, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    const/4 v11, 0x0

    if-gt v10, v1, :cond_1

    const/4 v1, 0x1

    :try_start_0
    const-string v2, "user"

    .line 1062
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/os/UserManager;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    .line 1063
    :cond_0
    invoke-virtual {v2}, Landroid/os/UserManager;->getUserProfiles()Ljava/util/List;

    move-result-object v2

    :goto_0
    if-eqz v2, :cond_2

    .line 1064
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    if-eq v2, v1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    .line 1069
    :catch_0
    :cond_2
    :goto_1
    new-instance v2, Landroid/content/ComponentName;

    const-class v3, Lbin/mt/function/ar/ActivityRecordService;

    invoke-direct {v2, v0, v3}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v2}, Landroid/content/ComponentName;->flattenToString()Ljava/lang/String;

    move-result-object v0

    .line 1070
    invoke-static {}, Landroid/os/Process;->myUserHandle()Landroid/os/UserHandle;

    move-result-object v2

    invoke-virtual {v2}, Landroid/os/UserHandle;->hashCode()I

    move-result v12

    new-instance v13, Ll/ۚۛܿ;

    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    new-instance v14, Ll/֨ۛܿ;

    invoke-direct {v14}, Ljava/lang/Object;-><init>()V

    new-instance v15, Ll/۠ۛܿ;

    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    .line 1086
    new-instance v8, Ll/۫ۛܿ;

    .line 1032
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 1088
    :try_start_1
    invoke-static {}, Lbin/mt/function/ar/ActivityRecordService;->ܿ()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 1089
    sget-object v0, Ll/ۛۛܿ;->ۗ:Ll/ۛۛܿ;

    goto/16 :goto_f

    :cond_3
    if-eqz v9, :cond_1a

    .line 1091
    invoke-interface {v9}, Ll/ۤۚۢ;->֫()Z

    move-result v2

    if-nez v2, :cond_4

    goto/16 :goto_c

    .line 1094
    :cond_4
    invoke-interface {v9}, Ll/ۤۚۢ;->getUid()I

    move-result v2

    if-eqz v2, :cond_5

    const/16 v3, 0x7d0

    if-eq v2, v3, :cond_5

    .line 1096
    sget-object v0, Ll/ۛۛܿ;->᩶:Ll/ۛۛܿ;

    goto/16 :goto_f

    :cond_5
    if-eqz v1, :cond_6

    .line 1099
    sget-object v0, Ll/ۛۛܿ;->۫:Ll/ۛۛܿ;

    goto/16 :goto_f

    .line 1102
    :cond_6
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    const-wide/16 v3, 0x3a98

    add-long v17, v1, v3

    const/16 v1, 0x18

    if-lt v10, v1, :cond_a

    const-string v2, "am get-current-user"
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_4

    const/4 v3, 0x1

    const/4 v4, 0x0

    move-object v1, v9

    move-wide/from16 v5, v17

    move-object v7, v14

    move-object/from16 v19, v8

    .line 1105
    :try_start_2
    invoke-static/range {v1 .. v8}, Ll/ܳۨܿ;->֫(Ll/ۤۚۢ;Ljava/lang/String;IZJLl/֨ۛܿ;Ll/۫ۛܿ;)Ll/֫ۨܿ;

    move-result-object v1
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_3

    .line 1107
    :try_start_3
    iget-boolean v2, v1, Ll/֫ۨܿ;->ۧ:Z
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_2

    if-nez v2, :cond_8

    move-object/from16 v8, v19

    .line 1406
    :try_start_4
    iget-boolean v0, v8, Ll/۫ۛܿ;->֫:Z

    if-eqz v0, :cond_7

    .line 1407
    :goto_2
    sget-object v0, Ll/ۛۛܿ;->۬:Ll/ۛۛܿ;

    goto/16 :goto_f

    .line 1408
    :cond_7
    sget-object v0, Ll/ۛۛܿ;->᩶:Ll/ۛۛܿ;
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_4

    goto/16 :goto_f

    :cond_8
    move-object/from16 v8, v19

    .line 1111
    :try_start_5
    iget-object v1, v1, Ll/֫ۨܿ;->֫:Ljava/util/List;

    invoke-interface {v1, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1
    :try_end_5
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_1

    if-eq v1, v12, :cond_9

    .line 1116
    :try_start_6
    sget-object v0, Ll/ۛۛܿ;->۫:Ll/ۛۛܿ;

    goto/16 :goto_f

    :cond_9
    move v12, v1

    goto :goto_3

    .line 1406
    :catch_1
    iget-boolean v0, v8, Ll/۫ۛܿ;->֫:Z

    if-eqz v0, :cond_7

    goto :goto_2

    :catch_2
    move-object/from16 v11, v19

    goto/16 :goto_e

    :catch_3
    move-object/from16 v8, v19

    goto/16 :goto_d

    :cond_a
    :goto_3
    const-string v3, "enabled_accessibility_services"

    move-object v1, v9

    move v2, v12

    move-wide/from16 v4, v17

    move-object v6, v14

    move-object v7, v8

    .line 1120
    invoke-static/range {v1 .. v7}, Ll/ܳۨܿ;->֫(Ll/ۤۚۢ;ILjava/lang/String;JLl/֨ۛܿ;Ll/۫ۛܿ;)Ll/֫ۨܿ;

    move-result-object v1

    .line 1122
    iget-boolean v2, v1, Ll/֫ۨܿ;->ۧ:Z

    if-nez v2, :cond_b

    .line 1406
    iget-boolean v0, v8, Ll/۫ۛܿ;->֫:Z

    if-eqz v0, :cond_7

    goto :goto_2

    .line 1125
    :cond_b
    iget-object v1, v1, Ll/֫ۨܿ;->֫:Ljava/util/List;

    invoke-interface {v1, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 1126
    invoke-static {v1, v0}, Ll/ܳۨܿ;->֫(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1
    :try_end_6
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_4

    if-eqz v1, :cond_d

    const-wide/16 v2, 0x3e8

    move-wide/from16 v4, v17

    move-object v6, v13

    move-object v7, v14

    move-object v11, v8

    move-object v8, v15

    .line 1190
    :try_start_7
    invoke-static/range {v2 .. v8}, Ll/ܳۨܿ;->֫(JJLl/ۚۛܿ;Ll/֨ۛܿ;Ll/۠ۛܿ;)Z

    move-result v1

    if-nez v1, :cond_c

    move-object v1, v9

    move v2, v12

    move v3, v10

    move-wide/from16 v4, v17

    move-object v6, v14

    move-object v7, v11

    .line 1193
    invoke-static/range {v1 .. v7}, Ll/ܳۨܿ;->֫(Ll/ۤۚۢ;IIJLl/֨ۛܿ;Ll/۫ۛܿ;)Ll/ۛۛܿ;

    move-result-object v1

    if-eqz v1, :cond_c

    :goto_4
    move-object v0, v1

    goto/16 :goto_f

    :cond_c
    move-object v1, v9

    move v2, v12

    move-object v3, v0

    move-wide/from16 v4, v17

    move-object v6, v13

    move-object v7, v14

    move-object v8, v15

    move-object v9, v11

    .line 1199
    invoke-static/range {v1 .. v9}, Ll/ܳۨܿ;->֫(Ll/ۤۚۢ;ILjava/lang/String;JLl/ۚۛܿ;Ll/֨ۛܿ;Ll/۠ۛܿ;Ll/۫ۛܿ;)Ll/ۛۛܿ;

    move-result-object v0
    :try_end_7
    .catch Ljava/lang/RuntimeException; {:try_start_7 .. :try_end_7} :catch_5

    goto/16 :goto_f

    :cond_d
    move-object/from16 v16, v9

    .line 1133
    :try_start_8
    monitor-enter v16
    :try_end_8
    .catch Ljava/lang/RuntimeException; {:try_start_8 .. :try_end_8} :catch_4

    :try_start_9
    const-string v3, "enabled_accessibility_services"

    move-object v1, v9

    move v2, v12

    move-wide/from16 v4, v17

    move-object v6, v14

    move-object v7, v8

    .line 1134
    invoke-static/range {v1 .. v7}, Ll/ܳۨܿ;->֫(Ll/ۤۚۢ;ILjava/lang/String;JLl/֨ۛܿ;Ll/۫ۛܿ;)Ll/֫ۨܿ;

    move-result-object v1

    .line 1136
    iget-boolean v2, v1, Ll/֫ۨܿ;->ۧ:Z
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    if-nez v2, :cond_f

    .line 1406
    :try_start_a
    iget-boolean v0, v8, Ll/۫ۛܿ;->֫:Z

    if-eqz v0, :cond_e

    .line 1407
    sget-object v0, Ll/ۛۛܿ;->۬:Ll/ۛۛܿ;

    goto :goto_5

    .line 1408
    :cond_e
    sget-object v0, Ll/ۛۛܿ;->᩶:Ll/ۛۛܿ;

    .line 1137
    :goto_5
    monitor-exit v16
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    goto/16 :goto_f

    .line 1139
    :cond_f
    :try_start_b
    iget-object v1, v1, Ll/֫ۨܿ;->֫:Ljava/util/List;

    invoke-interface {v1, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 1140
    invoke-static {v1, v0}, Ll/ܳۨܿ;->֫(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v19
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    if-eqz v19, :cond_10

    goto/16 :goto_a

    :cond_10
    if-eqz v1, :cond_12

    .line 1431
    :try_start_c
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_12

    const-string v2, "null"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_11

    goto :goto_6

    .line 1434
    :cond_11
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x3a

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    move-object v4, v1

    goto :goto_7

    :cond_12
    :goto_6
    move-object v4, v0

    :goto_7
    :try_start_d
    const-string v3, "enabled_accessibility_services"
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    move-object v1, v9

    move v2, v12

    move-wide/from16 v5, v17

    move-object v7, v14

    move-object/from16 v20, v8

    .line 1145
    :try_start_e
    invoke-static/range {v1 .. v8}, Ll/ܳۨܿ;->֫(Ll/ۤۚۢ;ILjava/lang/String;Ljava/lang/String;JLl/֨ۛܿ;Ll/۫ۛܿ;)Ll/֫ۨܿ;

    move-result-object v1

    .line 1147
    iget-boolean v1, v1, Ll/֫ۨܿ;->ۧ:Z
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    if-nez v1, :cond_14

    move-object/from16 v8, v20

    .line 1406
    :try_start_f
    iget-boolean v0, v8, Ll/۫ۛܿ;->֫:Z

    if-eqz v0, :cond_13

    .line 1407
    sget-object v0, Ll/ۛۛܿ;->۬:Ll/ۛۛܿ;

    goto :goto_8

    .line 1408
    :cond_13
    sget-object v0, Ll/ۛۛܿ;->᩶:Ll/ۛۛܿ;

    .line 1148
    :goto_8
    monitor-exit v16
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_2

    goto/16 :goto_f

    :cond_14
    move-object/from16 v8, v20

    :try_start_10
    const-string v3, "enabled_accessibility_services"

    move-object v1, v9

    move v2, v12

    move-wide/from16 v4, v17

    move-object v6, v14

    move-object v7, v8

    .line 1150
    invoke-static/range {v1 .. v7}, Ll/ܳۨܿ;->֫(Ll/ۤۚۢ;ILjava/lang/String;JLl/֨ۛܿ;Ll/۫ۛܿ;)Ll/֫ۨܿ;

    move-result-object v1

    .line 1152
    iget-boolean v2, v1, Ll/֫ۨܿ;->ۧ:Z
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_1

    if-nez v2, :cond_16

    .line 1406
    :try_start_11
    iget-boolean v0, v8, Ll/۫ۛܿ;->֫:Z

    if-eqz v0, :cond_15

    .line 1407
    sget-object v0, Ll/ۛۛܿ;->۬:Ll/ۛۛܿ;

    goto :goto_9

    .line 1408
    :cond_15
    sget-object v0, Ll/ۛۛܿ;->᩶:Ll/ۛۛܿ;

    .line 1153
    :goto_9
    monitor-exit v16
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_2

    goto/16 :goto_f

    .line 1155
    :cond_16
    :try_start_12
    iget-object v1, v1, Ll/֫ۨܿ;->֫:Ljava/util/List;

    invoke-interface {v1, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1, v0}, Ll/ܳۨܿ;->֫(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_1

    if-nez v1, :cond_17

    .line 1156
    :try_start_13
    sget-object v0, Ll/ۛۛܿ;->ۙ:Ll/ۛۛܿ;

    monitor-exit v16
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_2

    goto/16 :goto_f

    .line 1160
    :cond_17
    :goto_a
    :try_start_14
    monitor-exit v16
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_1

    if-eqz v19, :cond_18

    const-wide/16 v2, 0x3e8

    move-wide/from16 v4, v17

    move-object v6, v13

    move-object v7, v14

    move-object v11, v8

    move-object v8, v15

    .line 1190
    :try_start_15
    invoke-static/range {v2 .. v8}, Ll/ܳۨܿ;->֫(JJLl/ۚۛܿ;Ll/֨ۛܿ;Ll/۠ۛܿ;)Z

    move-result v1

    if-nez v1, :cond_c

    move-object v1, v9

    move v2, v12

    move v3, v10

    move-wide/from16 v4, v17

    move-object v6, v14

    move-object v7, v11

    .line 1193
    invoke-static/range {v1 .. v7}, Ll/ܳۨܿ;->֫(Ll/ۤۚۢ;IIJLl/֨ۛܿ;Ll/۫ۛܿ;)Ll/ۛۛܿ;

    move-result-object v1

    if-eqz v1, :cond_c

    goto/16 :goto_4

    :cond_18
    move-object v11, v8

    move-object v1, v9

    move v2, v12

    move v3, v10

    move-wide/from16 v4, v17

    move-object v6, v14

    move-object v7, v11

    .line 1166
    invoke-static/range {v1 .. v7}, Ll/ܳۨܿ;->֫(Ll/ۤۚۢ;IIJLl/֨ۛܿ;Ll/۫ۛܿ;)Ll/ۛۛܿ;

    move-result-object v1

    if-eqz v1, :cond_19

    goto/16 :goto_4

    :cond_19
    move-object v1, v9

    move v2, v12

    move-object v3, v0

    move-wide/from16 v4, v17

    move-object v6, v13

    move-object v7, v14

    move-object v8, v15

    move-object v9, v11

    .line 1171
    invoke-static/range {v1 .. v9}, Ll/ܳۨܿ;->֫(Ll/ۤۚۢ;ILjava/lang/String;JLl/ۚۛܿ;Ll/֨ۛܿ;Ll/۠ۛܿ;Ll/۫ۛܿ;)Ll/ۛۛܿ;

    move-result-object v0
    :try_end_15
    .catch Ljava/lang/RuntimeException; {:try_start_15 .. :try_end_15} :catch_5

    goto :goto_f

    :catchall_0
    move-exception v0

    move-object/from16 v11, v20

    move-object v8, v11

    goto :goto_b

    :catchall_1
    move-exception v0

    move-object v11, v8

    .line 1160
    :goto_b
    :try_start_16
    monitor-exit v16
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_2

    :try_start_17
    throw v0
    :try_end_17
    .catch Ljava/lang/RuntimeException; {:try_start_17 .. :try_end_17} :catch_6

    :catchall_2
    move-exception v0

    goto :goto_b

    :cond_1a
    :goto_c
    move-object v11, v8

    .line 1092
    :try_start_18
    sget-object v0, Ll/ۛۛܿ;->᩶:Ll/ۛۛܿ;
    :try_end_18
    .catch Ljava/lang/RuntimeException; {:try_start_18 .. :try_end_18} :catch_5

    goto :goto_f

    :catch_4
    :goto_d
    move-object v11, v8

    :catch_5
    :goto_e
    move-object v8, v11

    .line 1406
    :catch_6
    iget-boolean v0, v8, Ll/۫ۛܿ;->֫:Z

    if-eqz v0, :cond_1b

    .line 1407
    sget-object v0, Ll/ۛۛܿ;->۬:Ll/ۛۛܿ;

    goto :goto_f

    .line 1408
    :cond_1b
    sget-object v0, Ll/ۛۛܿ;->᩶:Ll/ۛۛܿ;

    :goto_f
    return-object v0
.end method

.method public static synthetic ۧ(Ll/ۨۛܿ;)V
    .locals 1

    .line 531
    sget-object v0, Ll/ۛۛܿ;->᩶:Ll/ۛۛܿ;

    invoke-static {p0, v0}, Ll/ܳۨܿ;->ۧ(Ll/ۨۛܿ;Ll/ۛۛܿ;)V

    return-void
.end method

.method public static synthetic ۧ(Ll/ۨۛܿ;Ll/֡ۚۢ;)V
    .locals 0

    .line 497
    invoke-static {p0, p1}, Ll/ܳۨܿ;->᩻(Ll/ۨۛܿ;Ll/֡ۚۢ;)V

    return-void
.end method

.method public static ۧ(Ll/ۨۛܿ;Ll/ۛۛܿ;)V
    .locals 9

    .line 541
    sget-object v0, Ll/ܳۨܿ;->᩻:Ll/ۨۛܿ;

    if-eq v0, p0, :cond_0

    return-void

    :cond_0
    if-nez p1, :cond_1

    .line 545
    sget-object p1, Ll/ۛۛܿ;->᩶:Ll/ۛۛܿ;

    .line 547
    :cond_1
    sget-object v0, Ll/ۛۛܿ;->ۗ:Ll/ۛۛܿ;

    if-ne p1, v0, :cond_2

    .line 548
    invoke-static {}, Lbin/mt/function/ar/ActivityRecordService;->ܿ()Z

    move-result v1

    if-nez v1, :cond_2

    .line 549
    sget-object p1, Ll/ۛۛܿ;->۬:Ll/ۛۛܿ;

    .line 792
    :cond_2
    iget-object v1, p0, Ll/ۨۛܿ;->ܳ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܳۨܿ;

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    .line 793
    iget-object v1, v1, Ll/ܳۨܿ;->ܿ:Ll/۟ۛܿ;

    iget-object v3, v1, Ll/۟ۛܿ;->ᩳ:Ll/ۨۛܿ;

    if-eq v3, p0, :cond_3

    goto :goto_0

    .line 796
    :cond_3
    iget-object v1, v1, Ll/۟ۛܿ;->ܽ:Ll/֡ۚۢ;

    goto :goto_1

    :cond_4
    :goto_0
    move-object v1, v2

    .line 552
    :goto_1
    sget-object v3, Ll/ۤۛܿ;->ۤ:Ll/ۤۛܿ;

    .line 551
    invoke-static {p0, v1, v3}, Ll/ܳۨܿ;->֫(Ll/ۨۛܿ;Ll/֡ۚۢ;Ll/ۤۛܿ;)Z

    move-result v1

    .line 553
    invoke-static {p0}, Ll/ܳۨܿ;->ܳ(Ll/ۨۛܿ;)V

    const/4 v3, 0x0

    .line 554
    iput-boolean v3, p0, Ll/ۨۛܿ;->᩻:Z

    const/4 v4, 0x1

    if-nez v1, :cond_7

    .line 556
    invoke-static {p0}, Ll/ܳۨܿ;->ܿ(Ll/ۨۛܿ;)V

    if-ne p1, v0, :cond_5

    .line 557
    iget-wide v5, p0, Ll/ۨۛܿ;->֫:J

    sget-wide v7, Ll/ܳۨܿ;->ۜ:J

    cmp-long v1, v5, v7

    if-nez v1, :cond_5

    .line 561
    :try_start_0
    invoke-static {v4}, Ll/ܳۨܿ;->֫(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 563
    sget-object p1, Ll/ܰۛܿ;->᩹:Ll/ܰۛܿ;

    .line 923
    invoke-static {p0, p1, v2}, Ll/ܳۨܿ;->֫(Ll/ۨۛܿ;Ll/ܰۛܿ;Ll/ۛۛܿ;)V

    return-void

    :catchall_0
    move-exception p1

    .line 563
    sget-object v0, Ll/ܰۛܿ;->᩹:Ll/ܰۛܿ;

    .line 923
    invoke-static {p0, v0, v2}, Ll/ܳۨܿ;->֫(Ll/ۨۛܿ;Ll/ܰۛܿ;Ll/ۛۛܿ;)V

    .line 564
    throw p1

    .line 568
    :cond_5
    sget-object v1, Ll/ܰۛܿ;->᩶:Ll/ܰۛܿ;

    if-ne p1, v0, :cond_6

    move-object p1, v2

    :cond_6
    invoke-static {p0, v1, p1}, Ll/ܳۨܿ;->֫(Ll/ۨۛܿ;Ll/ܰۛܿ;Ll/ۛۛܿ;)V

    return-void

    .line 792
    :cond_7
    iget-object v1, p0, Ll/ۨۛܿ;->ܳ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܳۨܿ;

    if-eqz v1, :cond_9

    .line 793
    iget-object v1, v1, Ll/ܳۨܿ;->ܿ:Ll/۟ۛܿ;

    iget-object v5, v1, Ll/۟ۛܿ;->ᩳ:Ll/ۨۛܿ;

    if-eq v5, p0, :cond_8

    goto :goto_2

    .line 796
    :cond_8
    iget-object v1, v1, Ll/۟ۛܿ;->ܽ:Ll/֡ۚۢ;

    goto :goto_3

    :cond_9
    :goto_2
    move-object v1, v2

    :goto_3
    if-ne p1, v0, :cond_a

    .line 575
    sget-object p1, Ll/ۤۛܿ;->ۙ:Ll/ۤۛܿ;

    iput-object p1, p0, Ll/ۨۛܿ;->ᩳ:Ll/ۤۛܿ;

    .line 576
    invoke-static {p0, v1}, Ll/ܳۨܿ;->ܳ(Ll/ۨۛܿ;Ll/֡ۚۢ;)V

    .line 578
    :try_start_1
    invoke-static {v4}, Ll/ܳۨܿ;->֫(Z)V

    const p1, 0x7f120022

    .line 579
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 581
    sget-object p1, Ll/ܰۛܿ;->᩹:Ll/ܰۛܿ;

    .line 923
    invoke-static {p0, p1, v2}, Ll/ܳۨܿ;->֫(Ll/ۨۛܿ;Ll/ܰۛܿ;Ll/ۛۛܿ;)V

    return-void

    :catchall_1
    move-exception p1

    .line 581
    sget-object v0, Ll/ܰۛܿ;->᩹:Ll/ܰۛܿ;

    .line 923
    invoke-static {p0, v0, v2}, Ll/ܳۨܿ;->֫(Ll/ۨۛܿ;Ll/ܰۛܿ;Ll/ۛۛܿ;)V

    .line 582
    throw p1

    .line 595
    :cond_a
    sget-object v0, Ll/ۛۛܿ;->۬:Ll/ۛۛܿ;

    if-eq p1, v0, :cond_b

    sget-object v0, Ll/ۛۛܿ;->ۙ:Ll/ۛۛܿ;

    if-eq p1, v0, :cond_b

    sget-object v0, Ll/ۛۛܿ;->᩹:Ll/ۛۛܿ;

    if-eq p1, v0, :cond_b

    sget-object v0, Ll/ۛۛܿ;->۫:Ll/ۛۛܿ;

    if-ne p1, v0, :cond_c

    .line 587
    :cond_b
    sput-boolean v3, Ll/ܳۨܿ;->ۡ:Z

    .line 589
    :cond_c
    sget-object p1, Ll/ۤۛܿ;->ۗ:Ll/ۤۛܿ;

    iput-object p1, p0, Ll/ۨۛܿ;->ᩳ:Ll/ۤۛܿ;

    .line 590
    invoke-static {p0, v1}, Ll/ܳۨܿ;->ܳ(Ll/ۨۛܿ;Ll/֡ۚۢ;)V

    .line 591
    invoke-static {p0, v3}, Ll/ܳۨܿ;->֫(Ll/ۨۛܿ;Z)V

    return-void
.end method

.method public static ۧ(Ll/ۨۛܿ;Z)V
    .locals 12

    const/4 v0, 0x0

    .line 396
    invoke-static {p0, v0}, Ll/ܳۨܿ;->ܽ(Ll/ۨۛܿ;Z)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    .line 397
    sget-object p1, Ll/ܰۛܿ;->᩶:Ll/ܰۛܿ;

    .line 923
    invoke-static {p0, p1, v2}, Ll/ܳۨܿ;->֫(Ll/ۨۛܿ;Ll/ܰۛܿ;Ll/ۛۛܿ;)V

    return-void

    .line 400
    :cond_0
    invoke-static {}, Lbin/mt/function/ar/ActivityRecordService;->ܿ()Z

    move-result v1

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    .line 401
    invoke-static {v3}, Ll/ܳۨܿ;->֫(Z)V

    .line 402
    sget-object p1, Ll/ܰۛܿ;->᩹:Ll/ܰۛܿ;

    .line 923
    invoke-static {p0, p1, v2}, Ll/ܳۨܿ;->֫(Ll/ۨۛܿ;Ll/ܰۛܿ;Ll/ۛۛܿ;)V

    return-void

    .line 406
    :cond_1
    sget-boolean v1, Ll/ܳۨܿ;->ۡ:Z

    if-eqz v1, :cond_2

    if-nez p1, :cond_2

    invoke-static {}, Ll/ۢ֨ۢ;->᩻()Z

    move-result p1

    if-nez p1, :cond_2

    .line 407
    sget-object p1, Ll/ۤۛܿ;->۫:Ll/ۤۛܿ;

    iput-object p1, p0, Ll/ۨۛܿ;->ᩳ:Ll/ۤۛܿ;

    .line 408
    iput-boolean v3, p0, Ll/ۨۛܿ;->᩻:Z

    .line 409
    invoke-static {p0, p1}, Ll/ܳۨܿ;->֫(Ll/ۨۛܿ;Ll/ۤۛܿ;)V

    .line 410
    sget-object p1, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance v0, Ll/᩶۫᩷;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 429
    :try_start_0
    new-instance v1, Ll/ܿۨܿ;

    invoke-direct {v1, p0, v0}, Ll/ܿۨܿ;-><init>(Ll/ۨۛܿ;Ll/᩶۫᩷;)V

    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 431
    :catch_0
    new-instance p1, Ll/᩹ۛܿ;

    invoke-direct {p1, p0}, Ll/᩹ۛܿ;-><init>(Ll/ۨۛܿ;)V

    invoke-static {p1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    return-void

    .line 414
    :cond_2
    sget-object p1, Ll/ۤۛܿ;->᩶:Ll/ۤۛܿ;

    iput-object p1, p0, Ll/ۨۛܿ;->ᩳ:Ll/ۤۛܿ;

    iget-object p1, p0, Ll/ۨۛܿ;->ܳ:Ljava/lang/ref/WeakReference;

    .line 415
    sget-boolean v1, Ll/ܳۨܿ;->ۡ:Z

    const v4, 0x7f120020

    if-eqz v1, :cond_9

    invoke-static {}, Ll/ۢ֨ۢ;->ۜ()Z

    move-result v1

    if-eqz v1, :cond_9

    const-string v1, "\n\n"

    .line 454
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܳۨܿ;

    if-eqz p1, :cond_8

    .line 455
    iget-object v5, p1, Ll/ܳۨܿ;->֫:Ll/ۗܺ᩷;

    invoke-static {p0, v0}, Ll/ܳۨܿ;->ܽ(Ll/ۨۛܿ;Z)Z

    move-result v6

    if-nez v6, :cond_3

    goto/16 :goto_2

    .line 460
    :cond_3
    sget-object v6, Ll/ۤۛܿ;->᩹:Ll/ۤۛܿ;

    iput-object v6, p0, Ll/ۨۛܿ;->ᩳ:Ll/ۤۛܿ;

    const v6, 0x7f0d006e

    .line 465
    :try_start_1
    invoke-virtual {v5, v6}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v6

    const v7, 0x7f0a05be

    .line 466
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    .line 467
    new-instance v8, Landroid/text/SpannableString;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const v10, 0x7f120023

    .line 468
    invoke-static {v10}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 470
    invoke-static {v4}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v8, v4}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 471
    invoke-static {v8, v1}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    move-result v4

    :goto_0
    const/4 v9, -0x1

    if-eq v4, v9, :cond_4

    .line 473
    new-instance v9, Landroid/text/style/RelativeSizeSpan;

    const/high16 v10, 0x3f000000    # 0.5f

    invoke-direct {v9, v10}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    add-int/lit8 v10, v4, 0x2

    const/16 v11, 0x21

    invoke-virtual {v8, v9, v4, v10, v11}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 475
    invoke-static {v8, v1, v10}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    move-result v4

    goto :goto_0

    .line 477
    :cond_4
    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v1, 0x7f0a00a4

    .line 478
    invoke-virtual {v6, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    const v4, 0x7f0a00a5

    .line 479
    invoke-virtual {v6, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/Button;

    .line 480
    invoke-static {v4}, Ll/ܰ᩸᩷;->֫(Landroid/widget/TextView;)V

    .line 481
    invoke-virtual {v5}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v5

    invoke-virtual {v5, v6}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    invoke-virtual {v5}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object v5
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    .line 486
    invoke-virtual {v5}, Ll/֡ۚۢ;->ۜ()Z

    move-result v6

    if-nez v6, :cond_5

    .line 487
    invoke-static {p0, v3}, Ll/ܳۨܿ;->֫(Ll/ۨۛܿ;Z)V

    goto/16 :goto_5

    .line 490
    :cond_5
    iget-object p1, p1, Ll/ܳۨܿ;->ܿ:Ll/۟ۛܿ;

    .line 491
    iget-object v3, p1, Ll/۟ۛܿ;->ᩳ:Ll/ۨۛܿ;

    if-ne v3, p0, :cond_7

    invoke-static {p0, v0}, Ll/ܳۨܿ;->ܽ(Ll/ۨۛܿ;Z)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_1

    .line 496
    :cond_6
    iput-object v5, p1, Ll/۟ۛܿ;->ܽ:Ll/֡ۚۢ;

    .line 497
    new-instance p1, Ll/ۙۛܿ;

    invoke-direct {p1, p0, v5}, Ll/ۙۛܿ;-><init>(Ll/ۨۛܿ;Ll/֡ۚۢ;)V

    invoke-virtual {v5, p1}, Ll/֡ۚۢ;->֫(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 499
    new-instance p1, Ll/ۗۛܿ;

    invoke-direct {p1, p0, v5, v1, v4}, Ll/ۗۛܿ;-><init>(Ll/ۨۛܿ;Ll/֡ۚۢ;Landroid/widget/Button;Landroid/widget/Button;)V

    invoke-virtual {v1, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 512
    new-instance p1, Ll/ۖۛܿ;

    invoke-direct {p1, p0, v5}, Ll/ۖۛܿ;-><init>(Ll/ۨۛܿ;Ll/֡ۚۢ;)V

    invoke-virtual {v4, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_5

    .line 492
    :cond_7
    :goto_1
    invoke-virtual {v5}, Ll/֡ۚۢ;->dismiss()V

    .line 493
    sget-object p1, Ll/ܰۛܿ;->᩶:Ll/ܰۛܿ;

    goto :goto_3

    .line 483
    :catch_1
    invoke-static {p0, v3}, Ll/ܳۨܿ;->֫(Ll/ۨۛܿ;Z)V

    goto/16 :goto_5

    .line 456
    :cond_8
    :goto_2
    sget-object p1, Ll/ܰۛܿ;->᩶:Ll/ܰۛܿ;

    goto :goto_3

    .line 605
    :cond_9
    invoke-static {p0, v0}, Ll/ܳۨܿ;->ܽ(Ll/ۨۛܿ;Z)Z

    move-result v1

    if-nez v1, :cond_a

    .line 606
    sget-object p1, Ll/ܰۛܿ;->᩶:Ll/ܰۛܿ;

    .line 923
    :goto_3
    invoke-static {p0, p1, v2}, Ll/ܳۨܿ;->֫(Ll/ۨۛܿ;Ll/ܰۛܿ;Ll/ۛۛܿ;)V

    goto/16 :goto_5

    :cond_a
    const-string v1, "forbid_tip_ar_manual"

    .line 610
    sget-object v5, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v5, v1, v3}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-nez v1, :cond_b

    .line 611
    invoke-static {p0, v3}, Ll/ܳۨܿ;->֫(Ll/ۨۛܿ;Z)V

    goto/16 :goto_5

    .line 615
    :cond_b
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܳۨܿ;

    if-nez p1, :cond_c

    .line 617
    sget-object p1, Ll/ܰۛܿ;->᩶:Ll/ܰۛܿ;

    goto :goto_3

    .line 620
    :cond_c
    sget-object v1, Ll/ۤۛܿ;->۬:Ll/ۤۛܿ;

    iput-object v1, p0, Ll/ۨۛܿ;->ᩳ:Ll/ۤۛܿ;

    .line 623
    :try_start_2
    iget-object v1, p1, Ll/ܳۨܿ;->֫:Ll/ۗܺ᩷;

    invoke-virtual {v1}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v1

    const v5, 0x7f120a76

    .line 624
    invoke-virtual {v1, v5}, Ll/᩵ۚۢ;->ۧ(I)V

    .line 625
    invoke-virtual {v1, v4}, Ll/᩵ۚۢ;->֫(I)V

    const v4, 0x7f12070a

    .line 626
    invoke-virtual {v1, v4, v2}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const v4, 0x7f120a78

    .line 627
    invoke-virtual {v1, v4, v2}, Ll/᩵ۚۢ;->ܽ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 628
    invoke-virtual {v1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object v1
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_2

    .line 633
    invoke-virtual {v1}, Ll/֡ۚۢ;->ۜ()Z

    move-result v4

    if-nez v4, :cond_d

    .line 634
    invoke-static {p0, v3}, Ll/ܳۨܿ;->֫(Ll/ۨۛܿ;Z)V

    goto :goto_5

    .line 637
    :cond_d
    iget-object p1, p1, Ll/ܳۨܿ;->ܿ:Ll/۟ۛܿ;

    .line 638
    iget-object v3, p1, Ll/۟ۛܿ;->ᩳ:Ll/ۨۛܿ;

    if-ne v3, p0, :cond_f

    invoke-static {p0, v0}, Ll/ܳۨܿ;->ܽ(Ll/ۨۛܿ;Z)Z

    move-result v0

    if-nez v0, :cond_e

    goto :goto_4

    .line 643
    :cond_e
    iput-object v1, p1, Ll/۟ۛܿ;->ܽ:Ll/֡ۚۢ;

    .line 644
    new-instance p1, Ll/ۘۛܿ;

    invoke-direct {p1, p0, v1}, Ll/ۘۛܿ;-><init>(Ll/ۨۛܿ;Ll/֡ۚۢ;)V

    invoke-virtual {v1, p1}, Ll/֡ۚۢ;->֫(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 645
    invoke-virtual {v1}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object p1

    new-instance v0, Ll/ᩴۛܿ;

    invoke-direct {v0, p0, v1}, Ll/ᩴۛܿ;-><init>(Ll/ۨۛܿ;Ll/֡ۚۢ;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 653
    invoke-virtual {v1}, Ll/֡ۚۢ;->ᩳ()Landroid/widget/Button;

    move-result-object p1

    new-instance v0, Ll/᩵ۛܿ;

    invoke-direct {v0, p0, v1}, Ll/᩵ۛܿ;-><init>(Ll/ۨۛܿ;Ll/֡ۚۢ;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_5

    .line 639
    :cond_f
    :goto_4
    invoke-virtual {v1}, Ll/֡ۚۢ;->dismiss()V

    .line 640
    sget-object p1, Ll/ܰۛܿ;->᩶:Ll/ܰۛܿ;

    goto/16 :goto_3

    .line 630
    :catch_2
    invoke-static {p0, v3}, Ll/ܳۨܿ;->֫(Ll/ۨۛܿ;Z)V

    :goto_5
    return-void
.end method

.method public static ܳ(Ll/ۨۛܿ;)V
    .locals 4

    .line 843
    iget-wide v0, p0, Ll/ۨۛܿ;->ۧ:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/ۨۛܿ;->ۧ:J

    .line 844
    iget-object v2, p0, Ll/ۨۛܿ;->ܳ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܳۨܿ;

    if-nez v2, :cond_0

    goto :goto_0

    .line 848
    :cond_0
    iget-object v2, v2, Ll/ܳۨܿ;->ܿ:Ll/۟ۛܿ;

    .line 849
    iget-object v3, v2, Ll/۟ۛܿ;->ᩳ:Ll/ۨۛܿ;

    if-eq v3, p0, :cond_1

    goto :goto_0

    .line 852
    :cond_1
    iput-wide v0, v2, Ll/۟ۛܿ;->ۧ:J

    .line 853
    iget-object p0, v2, Ll/۟ۛܿ;->֫:Ll/۬۬ܿ;

    const/4 v0, 0x0

    .line 854
    iput-object v0, v2, Ll/۟ۛܿ;->֫:Ll/۬۬ܿ;

    if-eqz p0, :cond_2

    .line 856
    invoke-virtual {p0}, Ll/۬۬ܿ;->֫()V

    :cond_2
    :goto_0
    return-void
.end method

.method public static ܳ(Ll/ۨۛܿ;Ll/֡ۚۢ;)V
    .locals 2

    if-nez p1, :cond_0

    goto :goto_0

    .line 779
    :cond_0
    iget-object v0, p0, Ll/ۨۛܿ;->ܳ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܳۨܿ;

    if-eqz v0, :cond_1

    .line 781
    iget-object v0, v0, Ll/ܳۨܿ;->ܿ:Ll/۟ۛܿ;

    .line 782
    iget-object v1, v0, Ll/۟ۛܿ;->ᩳ:Ll/ۨۛܿ;

    if-ne v1, p0, :cond_1

    iget-object p0, v0, Ll/۟ۛܿ;->ܽ:Ll/֡ۚۢ;

    if-ne p0, p1, :cond_1

    const/4 p0, 0x0

    .line 783
    iput-object p0, v0, Ll/۟ۛܿ;->ܽ:Ll/֡ۚۢ;

    .line 786
    :cond_1
    invoke-virtual {p1}, Ll/֡ۚۢ;->ۜ()Z

    move-result p0

    if-eqz p0, :cond_2

    .line 787
    invoke-virtual {p1}, Ll/֡ۚۢ;->dismiss()V

    :cond_2
    :goto_0
    return-void
.end method

.method public static bridge synthetic ܳ(Ll/ܳۨܿ;)V
    .locals 0

    .line 0
    invoke-static {p0}, Ll/ܳۨܿ;->᩻(Ll/ܳۨܿ;)V

    return-void
.end method

.method public static bridge synthetic ܽ()J
    .locals 2

    .line 0
    sget-wide v0, Ll/ܳۨܿ;->ۜ:J

    return-wide v0
.end method

.method public static bridge synthetic ܽ(Ll/ܳۨܿ;)Ljava/util/List;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܳۨܿ;->ۧ:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/ۨۛܿ;)V
    .locals 0

    .line 0
    invoke-static {p0}, Ll/ܳۨܿ;->ۜ(Ll/ۨۛܿ;)V

    return-void
.end method

.method public static synthetic ܽ(Ll/ۨۛܿ;Ll/֡ۚۢ;)V
    .locals 0

    .line 644
    invoke-static {p0, p1}, Ll/ܳۨܿ;->᩻(Ll/ۨۛܿ;Ll/֡ۚۢ;)V

    return-void
.end method

.method public static ܽ(Ll/ۨۛܿ;Z)Z
    .locals 5

    .line 891
    sget-object v0, Ll/ܳۨܿ;->᩻:Ll/ۨۛܿ;

    if-ne v0, p0, :cond_3

    iget-wide v0, p0, Ll/ۨۛܿ;->֫:J

    sget-wide v2, Ll/ܳۨܿ;->ۜ:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_3

    iget-boolean v0, p0, Ll/ۨۛܿ;->ܿ:Z

    if-nez v0, :cond_3

    .line 894
    invoke-static {p0}, Ll/ܳۨܿ;->᩻(Ll/ۨۛܿ;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 897
    :cond_0
    iget-object v0, p0, Ll/ۨۛܿ;->ܳ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܳۨܿ;

    if-eqz v0, :cond_3

    .line 898
    iget-object v0, v0, Ll/ܳۨܿ;->ܿ:Ll/۟ۛܿ;

    iget-object v1, v0, Ll/۟ۛܿ;->ᩳ:Ll/ۨۛܿ;

    if-eq v1, p0, :cond_1

    goto :goto_0

    :cond_1
    if-eqz p1, :cond_2

    .line 901
    iget-object p0, v0, Ll/۟ۛܿ;->ܽ:Ll/֡ۚۢ;

    if-eqz p0, :cond_3

    .line 903
    invoke-virtual {p0}, Ll/֡ۚۢ;->ۜ()Z

    move-result p0

    if-eqz p0, :cond_3

    :cond_2
    const/4 p0, 0x1

    return p0

    :cond_3
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method public static bridge synthetic ܿ(Ll/ܳۨܿ;)Ll/֡ۚۢ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܳۨܿ;->ᩳ:Ll/֡ۚۢ;

    return-object p0
.end method

.method public static ܿ(Ll/ۨۛܿ;)V
    .locals 2

    .line 756
    iget-object v0, p0, Ll/ۨۛܿ;->ܳ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܳۨܿ;

    if-nez v0, :cond_0

    goto :goto_0

    .line 760
    :cond_0
    iget-object v0, v0, Ll/ܳۨܿ;->ܿ:Ll/۟ۛܿ;

    .line 761
    iget-object v1, v0, Ll/۟ۛܿ;->ᩳ:Ll/ۨۛܿ;

    if-eq v1, p0, :cond_1

    goto :goto_0

    .line 764
    :cond_1
    sget-object v1, Ll/ۤۛܿ;->ۙ:Ll/ۤۛܿ;

    iput-object v1, p0, Ll/ۨۛܿ;->ᩳ:Ll/ۤۛܿ;

    .line 765
    invoke-static {p0}, Ll/ܳۨܿ;->ܳ(Ll/ۨۛܿ;)V

    .line 766
    iget-object p0, v0, Ll/۟ۛܿ;->ܽ:Ll/֡ۚۢ;

    const/4 v1, 0x0

    .line 767
    iput-object v1, v0, Ll/۟ۛܿ;->ܽ:Ll/֡ۚۢ;

    .line 768
    iput-object v1, v0, Ll/۟ۛܿ;->ᩳ:Ll/ۨۛܿ;

    if-eqz p0, :cond_2

    .line 769
    invoke-virtual {p0}, Ll/֡ۚۢ;->ۜ()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 770
    invoke-virtual {p0}, Ll/֡ۚۢ;->dismiss()V

    :cond_2
    :goto_0
    return-void
.end method

.method public static synthetic ܿ(Ll/ۨۛܿ;Ll/֡ۚۢ;)V
    .locals 1

    .line 513
    sget-object v0, Ll/ۤۛܿ;->᩹:Ll/ۤۛܿ;

    invoke-static {p0, p1, v0}, Ll/ܳۨܿ;->֫(Ll/ۨۛܿ;Ll/֡ۚۢ;Ll/ۤۛܿ;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 516
    :cond_0
    sget-object v0, Ll/ۤۛܿ;->ۗ:Ll/ۤۛܿ;

    iput-object v0, p0, Ll/ۨۛܿ;->ᩳ:Ll/ۤۛܿ;

    .line 517
    invoke-static {p0, p1}, Ll/ܳۨܿ;->ܳ(Ll/ۨۛܿ;Ll/֡ۚۢ;)V

    const/4 p1, 0x1

    .line 518
    invoke-static {p0, p1}, Ll/ܳۨܿ;->֫(Ll/ۨۛܿ;Z)V

    return-void
.end method

.method public static bridge synthetic ᩳ(Ll/ܳۨܿ;)Landroid/widget/BaseAdapter;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܳۨܿ;->ܽ:Landroid/widget/BaseAdapter;

    return-object p0
.end method

.method public static ᩳ()V
    .locals 4

    .line 704
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 705
    new-instance v0, Ll/᩸ۛܿ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    return-void

    .line 708
    :cond_0
    sget-wide v0, Ll/ܳۨܿ;->ۜ:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    sput-wide v0, Ll/ܳۨܿ;->ۜ:J

    const/4 v0, 0x0

    .line 709
    invoke-static {v0}, Ll/ܳۨܿ;->֫(Z)V

    const/4 v0, 0x0

    .line 710
    sput-object v0, Ll/ܳۨܿ;->᩷:Ll/ۨۛܿ;

    .line 711
    sget-object v1, Ll/ܳۨܿ;->᩻:Ll/ۨۛܿ;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x1

    .line 715
    iput-boolean v2, v1, Ll/ۨۛܿ;->ܿ:Z

    .line 716
    invoke-static {v1}, Ll/ܳۨܿ;->ܿ(Ll/ۨۛܿ;)V

    .line 717
    iget-boolean v2, v1, Ll/ۨۛܿ;->᩻:Z

    if-nez v2, :cond_2

    .line 718
    sget-object v2, Ll/ܰۛܿ;->᩶:Ll/ܰۛܿ;

    .line 923
    invoke-static {v1, v2, v0}, Ll/ܳۨܿ;->֫(Ll/ۨۛܿ;Ll/ܰۛܿ;Ll/ۛۛܿ;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public static synthetic ᩳ(Ll/ۨۛܿ;Ll/֡ۚۢ;)V
    .locals 3

    .line 654
    sget-object v0, Ll/ۤۛܿ;->۬:Ll/ۤۛܿ;

    invoke-static {p0, p1, v0}, Ll/ܳۨܿ;->֫(Ll/ۨۛܿ;Ll/֡ۚۢ;Ll/ۤۛܿ;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 657
    :cond_0
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const/4 v1, 0x0

    const-string v2, "forbid_tip_ar_manual"

    .line 0
    invoke-static {v0, v2, v1}, Ll/᩺۠ܽ;->֫(Ll/۫ۤۡ;Ljava/lang/String;Z)V

    .line 658
    sget-object v0, Ll/ۤۛܿ;->ۗ:Ll/ۤۛܿ;

    iput-object v0, p0, Ll/ۨۛܿ;->ᩳ:Ll/ۤۛܿ;

    .line 659
    invoke-static {p0, p1}, Ll/ܳۨܿ;->ܳ(Ll/ۨۛܿ;Ll/֡ۚۢ;)V

    const/4 p1, 0x1

    .line 660
    invoke-static {p0, p1}, Ll/ܳۨܿ;->֫(Ll/ۨۛܿ;Z)V

    return-void
.end method

.method public static ᩳ(Ll/ۨۛܿ;)Z
    .locals 4

    .line 861
    iget-object v0, p0, Ll/ۨۛܿ;->ܳ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܳۨܿ;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 862
    invoke-static {p0}, Ll/ܳۨܿ;->᩻(Ll/ۨۛܿ;)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 865
    :cond_0
    iget-object v0, v0, Ll/ܳۨܿ;->ܿ:Ll/۟ۛܿ;

    .line 866
    iget-object v2, v0, Ll/۟ۛܿ;->ᩳ:Ll/ۨۛܿ;

    if-eqz v2, :cond_1

    if-eq v2, p0, :cond_1

    .line 867
    invoke-static {v2}, Ll/ܳۨܿ;->ܿ(Ll/ۨۛܿ;)V

    .line 869
    :cond_1
    iput-object p0, v0, Ll/۟ۛܿ;->ᩳ:Ll/ۨۛܿ;

    const/4 v2, 0x0

    .line 870
    iput-object v2, v0, Ll/۟ۛܿ;->ܽ:Ll/֡ۚۢ;

    .line 871
    iput-object v2, v0, Ll/۟ۛܿ;->֫:Ll/۬۬ܿ;

    .line 872
    iget-wide v2, p0, Ll/ۨۛܿ;->ۧ:J

    iput-wide v2, v0, Ll/۟ۛܿ;->ۧ:J

    .line 873
    iput-boolean v1, p0, Ll/ۨۛܿ;->ܿ:Z

    const/4 p0, 0x1

    return p0

    :cond_2
    :goto_0
    return v1
.end method

.method public static ᩻(Ll/ۨۛܿ;Ll/֡ۚۢ;)V
    .locals 3

    .line 737
    iget-object v0, p0, Ll/ۨۛܿ;->ܳ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܳۨܿ;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 739
    iget-object v0, v0, Ll/ܳۨܿ;->ܿ:Ll/۟ۛܿ;

    .line 740
    iget-object v2, v0, Ll/۟ۛܿ;->ᩳ:Ll/ۨۛܿ;

    if-ne v2, p0, :cond_0

    iget-object v2, v0, Ll/۟ۛܿ;->ܽ:Ll/֡ۚۢ;

    if-ne v2, p1, :cond_0

    .line 741
    iput-object v1, v0, Ll/۟ۛܿ;->ܽ:Ll/֡ۚۢ;

    .line 744
    :cond_0
    sget-object p1, Ll/ܳۨܿ;->᩻:Ll/ۨۛܿ;

    if-ne p1, p0, :cond_2

    iget-object p1, p0, Ll/ۨۛܿ;->ᩳ:Ll/ۤۛܿ;

    sget-object v0, Ll/ۤۛܿ;->᩹:Ll/ۤۛܿ;

    if-eq p1, v0, :cond_1

    sget-object v0, Ll/ۤۛܿ;->۬:Ll/ۤۛܿ;

    if-ne p1, v0, :cond_2

    :cond_1
    const/4 p1, 0x1

    .line 747
    iput-boolean p1, p0, Ll/ۨۛܿ;->ܿ:Z

    .line 748
    sget-object p1, Ll/ܰۛܿ;->᩶:Ll/ܰۛܿ;

    .line 923
    invoke-static {p0, p1, v1}, Ll/ܳۨܿ;->֫(Ll/ۨۛܿ;Ll/ܰۛܿ;Ll/ۛۛܿ;)V

    :cond_2
    return-void
.end method

.method public static ᩻(Ll/ܳۨܿ;)V
    .locals 3

    .line 976
    sget-object v0, Ll/ܳۨܿ;->᩷:Ll/ۨۛܿ;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 977
    iget-object v0, v0, Ll/ۨۛܿ;->ܳ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, p0, :cond_0

    .line 978
    sput-object v1, Ll/ܳۨܿ;->᩷:Ll/ۨۛܿ;

    .line 980
    :cond_0
    sget-object v0, Ll/ܳۨܿ;->᩻:Ll/ۨۛܿ;

    if-eqz v0, :cond_2

    .line 981
    iget-object v2, v0, Ll/ۨۛܿ;->ܳ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    if-eq v2, p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p0, 0x1

    .line 984
    iput-boolean p0, v0, Ll/ۨۛܿ;->ܿ:Z

    .line 985
    invoke-static {v0}, Ll/ܳۨܿ;->ܿ(Ll/ۨۛܿ;)V

    .line 986
    iget-boolean p0, v0, Ll/ۨۛܿ;->᩻:Z

    if-nez p0, :cond_2

    .line 987
    sget-object p0, Ll/ܰۛܿ;->᩶:Ll/ܰۛܿ;

    .line 923
    invoke-static {v0, p0, v1}, Ll/ܳۨܿ;->֫(Ll/ۨۛܿ;Ll/ܰۛܿ;Ll/ۛۛܿ;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public static ᩻(Ll/ۨۛܿ;)Z
    .locals 2

    .line 878
    iget-object v0, p0, Ll/ۨۛܿ;->ܳ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܳۨܿ;

    .line 879
    iget-object p0, p0, Ll/ۨۛܿ;->ܽ:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/֡ۚۢ;

    if-eqz v0, :cond_0

    .line 880
    iget-object v1, v0, Ll/ܳۨܿ;->֫:Ll/ۗܺ᩷;

    if-eqz p0, :cond_0

    iget-object v0, v0, Ll/ܳۨܿ;->ᩳ:Ll/֡ۚۢ;

    if-ne v0, p0, :cond_0

    .line 883
    invoke-virtual {p0}, Ll/֡ۚۢ;->ۜ()Z

    move-result p0

    if-eqz p0, :cond_0

    .line 884
    invoke-virtual {v1}, Ll/᩻ܽ;->getLifecycle()Ll/۟ۢ֫;

    move-result-object p0

    invoke-virtual {p0}, Ll/۟ۢ֫;->֫()Ll/ܰۢ֫;

    move-result-object p0

    sget-object v0, Ll/ܰۢ֫;->ۗ:Ll/ܰۢ֫;

    if-ne p0, v0, :cond_0

    .line 885
    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    move-result p0

    if-nez p0, :cond_0

    .line 886
    invoke-virtual {v1}, Landroid/app/Activity;->isDestroyed()Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final ֫()V
    .locals 4

    .line 79
    sget-object v1, Lbin/mt/function/ar/ActivityRecordService;->ۨ:Ljava/util/LinkedList;

    move-object v0, v1

    monitor-enter v0

    .line 80
    :try_start_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, p0, Ll/ܳۨܿ;->ۧ:Ljava/util/ArrayList;

    .line 81
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    new-instance v0, Ll/۬ۛܿ;

    invoke-direct {v0, p0}, Ll/۬ۛܿ;-><init>(Ll/ܳۨܿ;)V

    iput-object v0, p0, Ll/ܳۨܿ;->ܽ:Landroid/widget/BaseAdapter;

    .line 118
    iget-object v0, p0, Ll/ܳۨܿ;->֫:Ll/ۗܺ᩷;

    invoke-virtual {v0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v0

    const v1, 0x7f120028

    .line 119
    invoke-virtual {v0, v1}, Ll/᩵ۚۢ;->ۧ(I)V

    iget-object v1, p0, Ll/ܳۨܿ;->ܽ:Landroid/widget/BaseAdapter;

    const/4 v2, 0x0

    .line 120
    invoke-virtual {v0, v1, v2}, Ll/᩵ۚۢ;->֫(Landroid/widget/BaseAdapter;Ll/֨᩶ܳ;)V

    .line 121
    invoke-static {}, Lbin/mt/function/ar/ActivityRecordService;->ܿ()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Lbin/mt/function/ar/ActivityRecordService;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_0

    const v1, 0x7f1209e1

    goto :goto_0

    :cond_0
    const v1, 0x7f1209d2

    :goto_0
    invoke-virtual {v0, v1, v2}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const v1, 0x7f120189

    const v3, 0x7f120634

    .line 0
    invoke-static {v0, v1, v2, v3, v2}, Ll/ۛۙܽ;->֫(Ll/᩵ۚۢ;ILandroid/content/DialogInterface$OnClickListener;ILandroid/content/DialogInterface$OnClickListener;)Ll/֡ۚۢ;

    move-result-object v0

    .line 124
    iput-object v0, p0, Ll/ܳۨܿ;->ᩳ:Ll/֡ۚۢ;

    .line 126
    invoke-virtual {v0}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object v0

    .line 127
    sget-object v1, Ll/ܳۨܿ;->ۢ:Ljava/util/Set;

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 128
    iget-object v1, p0, Ll/ܳۨܿ;->ᩳ:Ll/֡ۚۢ;

    new-instance v2, Ll/ܺۛܿ;

    invoke-direct {v2, p0, v0}, Ll/ܺۛܿ;-><init>(Ll/ܳۨܿ;Landroid/widget/Button;)V

    invoke-virtual {v1, v2}, Ll/֡ۚۢ;->֫(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 136
    iget-object v0, p0, Ll/ܳۨܿ;->ᩳ:Ll/֡ۚۢ;

    invoke-virtual {v0}, Ll/֡ۚۢ;->ۧ()Ll/ۖܿ;

    move-result-object v0

    new-instance v1, Ll/ܶۛܿ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0, v1}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 142
    iget-object v0, p0, Ll/ܳۨܿ;->ᩳ:Ll/֡ۚۢ;

    invoke-virtual {v0}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object v0

    new-instance v1, Ll/ܰ᩶᩷;

    const/4 v2, 0x2

    invoke-direct {v1, v2, p0}, Ll/ܰ᩶᩷;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 144
    iget-object v0, p0, Ll/ܳۨܿ;->ᩳ:Ll/֡ۚۢ;

    invoke-virtual {v0}, Ll/֡ۚۢ;->ۧ()Ll/ۖܿ;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 145
    iget-object v0, p0, Ll/ܳۨܿ;->֫:Ll/ۗܺ᩷;

    invoke-virtual {v0}, Ll/᩻ܽ;->getLifecycle()Ll/۟ۢ֫;

    move-result-object v0

    new-instance v1, Ll/᩺ۛܿ;

    invoke-direct {v1, p0}, Ll/᩺ۛܿ;-><init>(Ll/ܳۨܿ;)V

    invoke-virtual {v0, v1}, Ll/۟ۢ֫;->֫(Ll/ܳۡ֫;)V

    .line 146
    iget-object v0, p0, Ll/ܳۨܿ;->ᩳ:Ll/֡ۚۢ;

    invoke-virtual {v0}, Ll/֡ۚۢ;->ᩳ()Landroid/widget/Button;

    move-result-object v0

    new-instance v1, Ll/֫۫᩻;

    const/4 v2, 0x1

    invoke-direct {v1, v2, p0}, Ll/֫۫᩻;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void

    :catchall_0
    move-exception v1

    .line 81
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
