.class public final Ll/ۢ֨ۢ;
.super Ljava/lang/Object;
.source "E68Y"


# static fields
.field public static ֫:Ll/ۤۚۢ;

.field public static ۜ:Ll/᩶۫᩷;

.field public static ۡ:Z

.field public static ۢ:Ll/᩷֨ۢ;

.field public static ۧ:J

.field public static final ܳ:Z

.field public static final ܽ:Z

.field public static final ܿ:Z

.field public static ᩳ:Z

.field public static ᩷:J

.field public static ᩻:Ljava/util/concurrent/Future;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 46
    new-instance v0, Ljava/io/File;

    const-string v1, "/system/bin/busybox"

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_1

    new-instance v0, Ljava/io/File;

    const-string v3, "/system/xbin/busybox"

    invoke-direct {v0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    sput-boolean v0, Ll/ۢ֨ۢ;->ܽ:Z

    .line 47
    new-instance v0, Ljava/io/File;

    const-string v3, "/system/bin/toolbox"

    invoke-direct {v0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_3

    new-instance v0, Ljava/io/File;

    const-string v3, "/system/xbin/toolbox"

    invoke-direct {v0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    goto :goto_3

    :cond_3
    :goto_2
    const/4 v0, 0x1

    :goto_3
    sput-boolean v0, Ll/ۢ֨ۢ;->ܿ:Z

    .line 48
    new-instance v0, Ljava/io/File;

    const-string v3, "/system/bin/toybox"

    invoke-direct {v0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_4

    new-instance v0, Ljava/io/File;

    const-string v3, "/system/xbin/toybox"

    invoke-direct {v0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_4
    const/4 v1, 0x1

    :cond_5
    sput-boolean v1, Ll/ۢ֨ۢ;->ܳ:Z

    const/4 v0, 0x0

    .line 49
    sput-object v0, Ll/ۢ֨ۢ;->֫:Ll/ۤۚۢ;

    .line 51
    sget-object v0, Ll/᩷֨ۢ;->᩶:Ll/᩷֨ۢ;

    sput-object v0, Ll/ۢ֨ۢ;->ۢ:Ll/᩷֨ۢ;

    const-wide/16 v0, 0x0

    .line 52
    sput-wide v0, Ll/ۢ֨ۢ;->᩷:J

    const-wide/16 v0, -0x1

    .line 53
    sput-wide v0, Ll/ۢ֨ۢ;->ۧ:J

    .line 55
    new-instance v0, Ll/᩶۫᩷;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ۢ֨ۢ;->ۜ:Ll/᩶۫᩷;

    .line 956
    sput-boolean v2, Ll/ۢ֨ۢ;->ۡ:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֡()Z
    .locals 5

    .line 533
    const-class v0, Ll/ۢ֨ۢ;

    monitor-enter v0

    .line 534
    :try_start_0
    sget-boolean v1, Ll/ۢ֨ۢ;->ᩳ:Z

    const/4 v2, 0x1

    if-eqz v1, :cond_6

    invoke-static {}, Ll/ۢ֨ۢ;->᩻()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_2

    .line 537
    :cond_0
    invoke-static {}, Ll/ܺۤۡ;->֫()Z

    move-result v1

    const/4 v3, 0x0

    if-nez v1, :cond_5

    invoke-static {}, Ll/᩶ۡ᩷;->֫()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 538
    sget-object v1, Ll/᩶ۡ᩷;->᩶:Landroid/content/SharedPreferences;

    const-string v4, "get_adb"

    invoke-interface {v1, v4, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_1

    .line 541
    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 542
    invoke-static {}, Ll/᩶֨ۢ;->ۢ()Z

    move-result v0

    if-nez v0, :cond_2

    return v3

    .line 547
    :cond_2
    :try_start_1
    new-instance v1, Ll/᩶֨ۢ;

    invoke-direct {v1, v3, v3}, Ll/᩶֨ۢ;-><init>(ZZ)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 553
    const-class v0, Ll/ۢ֨ۢ;

    monitor-enter v0

    .line 554
    :try_start_2
    sget-boolean v3, Ll/ۢ֨ۢ;->ᩳ:Z

    if-eqz v3, :cond_4

    invoke-static {}, Ll/ۢ֨ۢ;->᩻()Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_0

    .line 662
    :cond_3
    invoke-static {v1, v2}, Ll/ۢ֨ۢ;->֫(Ll/ۤۚۢ;Z)V

    .line 560
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 562
    invoke-static {}, Ll/ۗ᩶ܿ;->ۧ()V

    .line 563
    invoke-static {}, Ll/ۨۚۢ;->֫()V

    return v2

    .line 555
    :cond_4
    :goto_0
    :try_start_3
    invoke-virtual {v1}, Ll/᩶֨ۢ;->close()V

    .line 556
    monitor-exit v0

    return v2

    :catchall_0
    move-exception v1

    .line 560
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v1

    :catch_0
    move-exception v0

    const-string v1, "Shell.reuse shizuku error"

    .line 549
    invoke-static {v1, v0}, Ll/᩶ۘܽ;->֫(Ljava/lang/String;Ljava/lang/Throwable;)V

    return v3

    .line 539
    :cond_5
    :goto_1
    :try_start_4
    monitor-exit v0

    return v3

    .line 535
    :cond_6
    :goto_2
    monitor-exit v0

    return v2

    :catchall_1
    move-exception v1

    .line 541
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v1
.end method

.method public static ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 862
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 863
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object p0

    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-char v3, p0, v2

    const-string v4, "`!#$&*(){}|[]\\ ;\"\'<>?"

    .line 864
    invoke-virtual {v4, v3}, Ljava/lang/String;->indexOf(I)I

    move-result v4

    const/4 v5, -0x1

    if-eq v4, v5, :cond_0

    const/16 v4, 0x5c

    .line 865
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 866
    :cond_0
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 868
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫()V
    .locals 9

    .line 877
    const-class v0, Ll/ۢ֨ۢ;

    monitor-enter v0

    .line 878
    :try_start_0
    sget-object v1, Ll/ۢ֨ۢ;->᩻:Ljava/util/concurrent/Future;

    const/4 v2, 0x0

    .line 879
    sput-object v2, Ll/ۢ֨ۢ;->᩻:Ljava/util/concurrent/Future;

    .line 880
    sget-object v3, Ll/᩷֨ۢ;->᩶:Ll/᩷֨ۢ;

    sput-object v3, Ll/ۢ֨ۢ;->ۢ:Ll/᩷֨ۢ;

    .line 881
    sget-object v3, Ll/ۢ֨ۢ;->֫:Ll/ۤۚۢ;

    .line 882
    sget-wide v4, Ll/ۢ֨ۢ;->ۧ:J

    const-wide/16 v6, 0x0

    cmp-long v8, v4, v6

    if-ltz v8, :cond_0

    if-eqz v3, :cond_0

    .line 883
    invoke-static {v3}, Ll/ۢ֨ۢ;->֫(Ll/ۤۚۢ;)V

    :cond_0
    const-wide/16 v4, -0x1

    .line 885
    sput-wide v4, Ll/ۢ֨ۢ;->ۧ:J

    .line 886
    sget-wide v4, Ll/ۢ֨ۢ;->᩷:J

    const-wide/16 v6, 0x1

    add-long/2addr v4, v6

    sput-wide v4, Ll/ۢ֨ۢ;->᩷:J

    .line 887
    sput-object v2, Ll/ۢ֨ۢ;->֫:Ll/ۤۚۢ;

    const/4 v2, 0x0

    .line 888
    sput-boolean v2, Ll/ۢ֨ۢ;->ᩳ:Z

    .line 889
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_1

    const/4 v0, 0x1

    .line 891
    invoke-interface {v1, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z

    :cond_1
    if-eqz v3, :cond_2

    .line 894
    invoke-interface {v3}, Ll/ۤۚۢ;->close()V

    :cond_2
    return-void

    :catchall_0
    move-exception v1

    .line 889
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public static synthetic ֫(JLl/۬֨ۢ;)V
    .locals 5

    const-string v1, "Shell.prewarm stage="

    .line 352
    const-class v0, Ll/ۢ֨ۢ;

    monitor-enter v0

    .line 353
    :try_start_0
    sget-wide v2, Ll/ۢ֨ۢ;->᩷:J

    cmp-long v4, p0, v2

    if-eqz v4, :cond_0

    .line 354
    monitor-exit v0

    return-void

    .line 356
    :cond_0
    sget-object v2, Ll/۬֨ۢ;->᩹:Ll/۬֨ۢ;

    if-ne p2, v2, :cond_1

    .line 357
    sget-object p2, Ll/᩷֨ۢ;->ۙ:Ll/᩷֨ۢ;

    goto :goto_0

    .line 358
    :cond_1
    sget-object p2, Ll/᩷֨ۢ;->ۗ:Ll/᩷֨ۢ;

    .line 359
    :goto_0
    sget-object v2, Ll/ۢ֨ۢ;->ۢ:Ll/᩷֨ۢ;

    if-ne v2, p2, :cond_2

    .line 360
    monitor-exit v0

    return-void

    .line 362
    :cond_2
    sput-object p2, Ll/ۢ֨ۢ;->ۢ:Ll/᩷֨ۢ;

    .line 363
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, ", generation="

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/᩶ۘܽ;->ۧ(Ljava/lang/String;)V

    .line 364
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static ֫(JZ)V
    .locals 9

    const-string v1, ", backend=app"

    const-string v2, "Shell.prewarm result: "

    const-string v3, "Shell.prewarm result: "

    const-string v4, "Shell.prewarm result: "

    const-string v5, "Shell.prewarm result ignored: stale generation="

    .line 405
    const-class v0, Ll/ۢ֨ۢ;

    monitor-enter v0

    .line 406
    :try_start_0
    sget-wide v6, Ll/ۢ֨ۢ;->᩷:J

    cmp-long v8, p0, v6

    if-eqz v8, :cond_0

    .line 407
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/᩶ۘܽ;->ۧ(Ljava/lang/String;)V

    .line 408
    monitor-exit v0

    return-void

    :cond_0
    const/4 v5, 0x0

    .line 410
    sput-object v5, Ll/ۢ֨ۢ;->᩻:Ljava/util/concurrent/Future;

    if-eqz p2, :cond_1

    .line 411
    sget-object v5, Ll/᩷֨ۢ;->᩶:Ll/᩷֨ۢ;

    goto :goto_0

    :cond_1
    sget-object v5, Ll/᩷֨ۢ;->᩹:Ll/᩷֨ۢ;

    :goto_0
    sput-object v5, Ll/ۢ֨ۢ;->ۢ:Ll/᩷֨ۢ;

    if-eqz p2, :cond_2

    .line 412
    sget-object v5, Ll/ۢ֨ۢ;->֫:Ll/ۤۚۢ;

    if-eqz v5, :cond_2

    invoke-interface {v5}, Ll/ۤۚۢ;->ۧ()Z

    move-result v5

    if-nez v5, :cond_2

    const/4 v5, 0x1

    goto :goto_1

    :cond_2
    const/4 v5, 0x0

    .line 413
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v5, :cond_3

    .line 414
    invoke-static {p0, p1}, Ll/ۢ֨ۢ;->֫(J)Z

    move-result v0

    if-eqz v0, :cond_3

    return-void

    .line 417
    :cond_3
    const-class v0, Ll/ۢ֨ۢ;

    monitor-enter v0

    .line 419
    :try_start_1
    sget-wide v5, Ll/ۢ֨ۢ;->ۧ:J

    cmp-long v7, v5, p0

    if-eqz v7, :cond_5

    .line 420
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-eqz p2, :cond_4

    const-string p2, "success"

    goto :goto_2

    :cond_4
    const-string p2, "failed"

    :goto_2
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ", generation="

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/᩶ۘܽ;->ۧ(Ljava/lang/String;)V

    .line 421
    monitor-exit v0

    return-void

    :cond_5
    const-wide/16 v4, -0x1

    .line 423
    sput-wide v4, Ll/ۢ֨ۢ;->ۧ:J

    .line 424
    sget-object v4, Ll/ۢ֨ۢ;->֫:Ll/ۤۚۢ;

    if-eqz v4, :cond_9

    .line 425
    invoke-static {v4}, Ll/ۢ֨ۢ;->֫(Ll/ۤۚۢ;)V

    .line 426
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-eqz p2, :cond_6

    const-string p2, "success"

    goto :goto_3

    :cond_6
    const-string p2, "failed"

    :goto_3
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ", generation="

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p0, ", backend="

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p0, Ll/ۢ֨ۢ;->֫:Ll/ۤۚۢ;

    if-eqz p0, :cond_8

    .line 764
    invoke-interface {p0}, Ll/ۤۚۢ;->ܽ()Z

    move-result p1

    if-eqz p1, :cond_7

    const-string p0, "root"

    goto :goto_4

    .line 767
    :cond_7
    invoke-interface {p0}, Ll/ۤۚۢ;->ᩳ()Z

    move-result p0

    if-eqz p0, :cond_8

    const-string p0, "shizuku"

    goto :goto_4

    :cond_8
    const-string p0, "app"

    .line 428
    :goto_4
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 426
    invoke-static {p0}, Ll/᩶ۘܽ;->ۧ(Ljava/lang/String;)V

    goto :goto_6

    .line 430
    :cond_9
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-eqz p2, :cond_a

    const-string p2, "success"

    goto :goto_5

    :cond_a
    const-string p2, "failed"

    :goto_5
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ", generation="

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/᩶ۘܽ;->ۧ(Ljava/lang/String;)V

    .line 434
    :goto_6
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0

    :catchall_1
    move-exception p0

    .line 413
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p0
.end method

.method public static ֫(Ll/ۤۚۢ;)V
    .locals 2

    .line 752
    sget-object v0, Ll/᩶ۡ᩷;->᩶:Landroid/content/SharedPreferences;

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-eqz p0, :cond_2

    .line 764
    invoke-interface {p0}, Ll/ۤۚۢ;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p0, "root"

    goto :goto_0

    .line 767
    :cond_1
    invoke-interface {p0}, Ll/ۤۚۢ;->ᩳ()Z

    move-result p0

    if-eqz p0, :cond_2

    const-string p0, "shizuku"

    goto :goto_0

    :cond_2
    const-string p0, "app"

    .line 756
    :goto_0
    sget-object v0, Ll/᩶ۡ᩷;->᩶:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "last_shell_backend"

    invoke-interface {v0, v1, p0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public static ֫(Ll/ۤۚۢ;Z)V
    .locals 10

    const-string v0, "Error: "

    const-string v1, "mkdir -p "

    const-string v2, "/data/local/tmp/"

    const-string v3, "chmod 755 "

    .line 669
    sget-object v4, Ll/ۢ֨ۢ;->֫:Ll/ۤۚۢ;

    if-eqz v4, :cond_0

    if-eq v4, p0, :cond_0

    .line 671
    invoke-interface {v4}, Ll/ۤۚۢ;->close()V

    .line 673
    :cond_0
    sput-object p0, Ll/ۢ֨ۢ;->֫:Ll/ۤۚۢ;

    const/4 v4, 0x1

    .line 674
    sput-boolean v4, Ll/ۢ֨ۢ;->ᩳ:Z

    .line 675
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Shell.create success, uid="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p0}, Ll/ۤۚۢ;->getUid()I

    move-result v7

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ll/᩶ۘܽ;->ۧ(Ljava/lang/String;)V

    .line 676
    invoke-interface {p0}, Ll/ۤۚۢ;->ܽ()Z

    move-result v5

    const-string v7, "mtio"

    const-string v8, "Writing mtio"

    const-string v9, "/assets/"

    if-eqz v5, :cond_2

    .line 677
    invoke-static {v8}, Ll/᩶ۘܽ;->ۧ(Ljava/lang/String;)V

    .line 679
    :try_start_0
    invoke-static {}, Ll/ۢ֨ۢ;->ᩳ()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    .line 680
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/۠۫ۡ;->֫(Ljava/lang/String;)[B

    move-result-object v0

    .line 682
    new-instance v1, Ljava/io/File;

    invoke-static {}, Ll/ۙ᩸᩷;->ۜ()Ljava/io/File;

    move-result-object v2

    invoke-direct {v1, v2, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 683
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Ljava/io/File;->canExecute()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 684
    invoke-static {v1}, Ll/᩷ۤۡ;->֫(Ljava/io/File;)[B

    move-result-object v2

    .line 685
    invoke-static {v0, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v2

    if-nez v2, :cond_4

    .line 686
    invoke-static {v1}, Ll/ܺۢ֡;->ܽ(Ljava/io/File;)Z

    .line 693
    :cond_1
    invoke-static {v1, v0}, Ll/ܺۢ֡;->֫(Ljava/io/File;[B)V

    .line 694
    invoke-virtual {v1, v4}, Ljava/io/File;->setExecutable(Z)Z

    move-result v0

    if-nez v0, :cond_4

    .line 695
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Ll/ۤۚۢ;->֫(Ljava/lang/String;)Ll/۫ۚۢ;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_1

    :catch_0
    nop

    goto/16 :goto_1

    .line 702
    :cond_2
    invoke-interface {p0}, Ll/ۤۚۢ;->ᩳ()Z

    move-result v3

    if-eqz v3, :cond_4

    .line 703
    invoke-static {v8}, Ll/᩶ۘܽ;->ۧ(Ljava/lang/String;)V

    .line 705
    :try_start_1
    invoke-static {}, Ll/ۢ֨ۢ;->ᩳ()I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    .line 706
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ll/۠۫ۡ;->֫(Ljava/lang/String;)[B

    move-result-object v3

    .line 707
    new-instance v4, Ljava/io/File;

    sget-object v5, Ll/ۙ᩸᩷;->ۧ:Ll/᩶ۡ᩷;

    invoke-virtual {v5}, Landroid/content/Context;->getExternalCacheDir()Ljava/io/File;

    move-result-object v5

    invoke-direct {v4, v5, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 708
    invoke-static {v4, v3}, Ll/ܺۢ֡;->֫(Ljava/io/File;[B)V

    .line 709
    invoke-static {}, Ll/ۙ᩸᩷;->ᩴ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 710
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "/mtio"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 712
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " && cp -f "

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 714
    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " && chmod 711 "

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 712
    invoke-interface {p0, v1}, Ll/ۤۚۢ;->֫(Ljava/lang/String;)Ll/۫ۚۢ;

    move-result-object v1

    .line 716
    invoke-virtual {v1}, Ll/۫ۚۢ;->ۧ()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 717
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 83
    iget-object v0, v1, Ll/۫ۚۢ;->֫:Ljava/lang/String;

    .line 717
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩶ۘܽ;->ۧ(Ljava/lang/String;)V

    .line 718
    invoke-interface {p0}, Ll/ۤۚۢ;->close()V

    const-string v0, "Shell.create sh"

    .line 719
    invoke-static {v0}, Ll/᩶ۘܽ;->ۧ(Ljava/lang/String;)V

    .line 720
    new-instance v0, Ll/۬ۚۢ;

    const-string v1, "sh"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ll/۬ۚۢ;-><init>(Ljava/lang/String;Z)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :try_start_2
    sput-object v0, Ll/ۢ֨ۢ;->֫:Ll/ۤۚۢ;

    .line 721
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ll/۬ۚۢ;->getUid()I

    move-result v1

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/᩶ۘܽ;->ۧ(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    move-object p0, v0

    goto :goto_0

    :catch_1
    move-object p0, v0

    goto :goto_1

    .line 723
    :cond_3
    :goto_0
    :try_start_3
    invoke-static {v4}, Ll/ܺۢ֡;->ܽ(Ljava/io/File;)Z
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    :cond_4
    :goto_1
    if-eqz p1, :cond_5

    .line 731
    invoke-static {p0}, Ll/ۢ֨ۢ;->֫(Ll/ۤۚۢ;)V

    :cond_5
    return-void
.end method

.method public static ֫(Ll/ۧ֨ۢ;)V
    .locals 7

    .line 801
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 803
    sget-boolean v1, Ll/ۢ֨ۢ;->ܽ:Z

    const-string v2, ",remount "

    const-string v3, " "

    const-string v4, "rw"

    if-eqz v1, :cond_0

    const-string v1, "busybox mount -o remount,"

    .line 0
    invoke-static {v1, v4, v3}, Ll/ۗۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    .line 804
    iget-object v6, p0, Ll/ۧ֨ۢ;->᩸:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, p0, Ll/ۧ֨ۢ;->᩹:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 805
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۧ֨ۢ;->᩹:Ljava/lang/String;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 806
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v5, "busybox mount -o "

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, p0, Ll/ۧ֨ۢ;->᩸:Ljava/lang/String;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 807
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Ll/ۧ֨ۢ;->᩹:Ljava/lang/String;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 809
    :cond_0
    sget-boolean v1, Ll/ۢ֨ۢ;->ܿ:Z

    if-eqz v1, :cond_1

    const-string v1, "toolbox mount -o remount,"

    .line 0
    invoke-static {v1, v4, v3}, Ll/ۗۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    .line 810
    iget-object v6, p0, Ll/ۧ֨ۢ;->᩸:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, p0, Ll/ۧ֨ۢ;->᩹:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 811
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۧ֨ۢ;->᩹:Ljava/lang/String;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 812
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v5, "toolbox mount -o "

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, p0, Ll/ۧ֨ۢ;->᩸:Ljava/lang/String;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 813
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Ll/ۧ֨ۢ;->᩹:Ljava/lang/String;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 815
    :cond_1
    sget-boolean v1, Ll/ۢ֨ۢ;->ܳ:Z

    if-eqz v1, :cond_2

    const-string v1, "toybox mount -o remount,"

    .line 0
    invoke-static {v1, v4, v3}, Ll/ۗۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    .line 816
    iget-object v6, p0, Ll/ۧ֨ۢ;->᩸:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, p0, Ll/ۧ֨ۢ;->᩹:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 817
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۧ֨ۢ;->᩹:Ljava/lang/String;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 818
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v5, "toybox mount -o "

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, p0, Ll/ۧ֨ۢ;->᩸:Ljava/lang/String;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 819
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Ll/ۧ֨ۢ;->᩹:Ljava/lang/String;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    const-string v1, "mount -o remount,"

    .line 0
    invoke-static {v1, v4, v3}, Ll/ۗۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    .line 822
    iget-object v6, p0, Ll/ۧ֨ۢ;->᩸:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, p0, Ll/ۧ֨ۢ;->᩹:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 823
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۧ֨ۢ;->᩹:Ljava/lang/String;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 824
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "mount -o "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Ll/ۧ֨ۢ;->᩸:Ljava/lang/String;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 825
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Ll/ۧ֨ۢ;->᩹:Ljava/lang/String;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 827
    sget-object p0, Ll/ۢ֨ۢ;->֫:Ll/ۤۚۢ;

    const-string v1, "\n"

    invoke-static {v0, v1}, Ll/ۢܺ֡;->֫(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Ll/ۤۚۢ;->֫(Ljava/lang/String;)Ll/۫ۚۢ;

    return-void
.end method

.method public static ֫(J)Z
    .locals 5

    .line 441
    const-class v0, Ll/ۢ֨ۢ;

    monitor-enter v0

    .line 442
    :try_start_0
    sget-wide v1, Ll/ۢ֨ۢ;->᩷:J

    const/4 v3, 0x0

    cmp-long v4, p0, v1

    if-nez v4, :cond_2

    sget-object v1, Ll/ۢ֨ۢ;->֫:Ll/ۤۚۢ;

    if-eqz v1, :cond_2

    invoke-interface {v1}, Ll/ۤۚۢ;->ۧ()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 445
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 446
    invoke-static {}, Ll/᩶֨ۢ;->ۢ()Z

    move-result v0

    if-nez v0, :cond_1

    return v3

    .line 450
    :cond_1
    :try_start_1
    new-instance v0, Ll/᩶֨ۢ;

    invoke-direct {v0, v3, v3}, Ll/᩶֨ۢ;-><init>(ZZ)V

    new-instance v1, Ll/۟ۛۡ;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Ll/۟ۛۡ;-><init>(I)V

    invoke-static {p0, p1, v0, v1}, Ll/ۢ֨ۢ;->֫(JLl/᩶֨ۢ;Ll/۟ۛۡ;)Z

    move-result p0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    return p0

    :catch_0
    move-exception v0

    .line 454
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Shell.prewarm take over error, generation="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v0}, Ll/᩶ۘܽ;->֫(Ljava/lang/String;Ljava/lang/Throwable;)V

    return v3

    .line 443
    :cond_2
    :goto_0
    :try_start_2
    monitor-exit v0

    return v3

    :catchall_0
    move-exception p0

    .line 445
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p0
.end method

.method public static ֫(JLl/᩶֨ۢ;Ll/۟ۛۡ;)Z
    .locals 7

    const-string v1, ", backend=shizuku"

    const-string v2, "Shell.prewarm result: success, generation="

    const/4 v3, 0x0

    .line 465
    :try_start_0
    const-class v0, Ll/ۢ֨ۢ;

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 466
    :try_start_1
    sget-wide v4, Ll/ۢ֨ۢ;->᩷:J

    cmp-long v6, p0, v4

    if-nez v6, :cond_4

    sget-object v4, Ll/ۢ֨ۢ;->֫:Ll/ۤۚۢ;

    if-eqz v4, :cond_4

    invoke-interface {v4}, Ll/ۤۚۢ;->ۧ()Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_1

    .line 469
    :cond_0
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 470
    :try_start_2
    invoke-static {p2}, Ll/ۢ֨ۢ;->֫(Ll/᩶֨ۢ;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 472
    const-class v0, Ll/ۢ֨ۢ;

    monitor-enter v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 474
    :try_start_3
    sget-wide v4, Ll/ۢ֨ۢ;->ۧ:J

    cmp-long v6, v4, p0

    if-nez v6, :cond_1

    const-wide/16 v4, -0x1

    .line 475
    sput-wide v4, Ll/ۢ֨ۢ;->ۧ:J

    .line 477
    :cond_1
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 478
    :try_start_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/᩶ۘܽ;->ۧ(Ljava/lang/String;)V

    .line 479
    invoke-virtual {p3}, Ll/۟ۛۡ;->run()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 477
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    throw p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :cond_2
    :goto_0
    if-nez v3, :cond_3

    .line 484
    invoke-virtual {p2}, Ll/᩶֨ۢ;->close()V

    :cond_3
    return v3

    .line 467
    :cond_4
    :goto_1
    :try_start_7
    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 484
    invoke-virtual {p2}, Ll/᩶֨ۢ;->close()V

    return v3

    :catchall_1
    move-exception p0

    .line 469
    :try_start_8
    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    :try_start_9
    throw p0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    :catchall_2
    move-exception p0

    if-nez v3, :cond_5

    .line 484
    invoke-virtual {p2}, Ll/᩶֨ۢ;->close()V

    .line 486
    :cond_5
    throw p0
.end method

.method public static ֫(Landroid/content/Context;)Z
    .locals 6

    .line 959
    invoke-static {p0}, Ll/᩸ᩴܺ;->ۧ(Landroid/content/Context;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    .line 962
    :cond_0
    invoke-static {}, Ll/ۢ֨ۢ;->ۜ()Z

    move-result v0

    const/4 v2, 0x0

    if-nez v0, :cond_1

    return v2

    .line 965
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "pm grant "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " android.permission.SYSTEM_ALERT_WINDOW"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 966
    sget-boolean v3, Ll/ۢ֨ۢ;->ۡ:Z

    if-eqz v3, :cond_3

    .line 967
    sget-object v3, Ll/ۢ֨ۢ;->֫:Ll/ۤۚۢ;

    const-wide/16 v4, 0x7d0

    invoke-interface {v3, v4, v5, v0}, Ll/ۤۚۢ;->֫(JLjava/lang/String;)Ll/۫ۚۢ;

    move-result-object v0

    .line 74
    iget-object v0, v0, Ll/۫ۚۢ;->֫:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 968
    invoke-static {p0}, Ll/᩸ᩴܺ;->ۧ(Landroid/content/Context;)Z

    move-result p0

    if-eqz p0, :cond_2

    return v1

    .line 971
    :cond_2
    sput-boolean v2, Ll/ۢ֨ۢ;->ۡ:Z

    :cond_3
    return v2
.end method

.method public static ֫(Ll/᩶֨ۢ;)Z
    .locals 2

    .line 647
    const-class v0, Ll/ۢ֨ۢ;

    monitor-enter v0

    .line 648
    :try_start_0
    sget-object v1, Ll/ۢ֨ۢ;->֫:Ll/ۤۚۢ;

    if-eqz v1, :cond_1

    .line 649
    invoke-interface {v1}, Ll/ۤۚۢ;->ۧ()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    .line 662
    invoke-static {p0, v1}, Ll/ۢ֨ۢ;->֫(Ll/ۤۚۢ;Z)V

    const/4 p0, 0x1

    .line 653
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p0, :cond_2

    .line 655
    invoke-static {}, Ll/ۗ᩶ܿ;->ۧ()V

    .line 656
    invoke-static {}, Ll/ۨۚۢ;->֫()V

    :cond_2
    return p0

    :catchall_0
    move-exception p0

    .line 653
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static ۖ()Ll/ۜ֨ۢ;
    .locals 5

    .line 335
    sget-wide v0, Ll/ۢ֨ۢ;->᩷:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    sput-wide v0, Ll/ۢ֨ۢ;->᩷:J

    .line 336
    sget-object v2, Ll/᩷֨ۢ;->ۙ:Ll/᩷֨ۢ;

    sput-object v2, Ll/ۢ֨ۢ;->ۢ:Ll/᩷֨ۢ;

    .line 337
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Shell.prewarm start, generation="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v4, ", state="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ll/᩶ۘܽ;->ۧ(Ljava/lang/String;)V

    .line 338
    sget-object v2, Ll/ۢ֨ۢ;->ۜ:Ll/᩶۫᩷;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 347
    sget-object v2, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance v3, Ll/ܿ֨ۢ;

    invoke-direct {v3, v0, v1}, Ll/ܿ֨ۢ;-><init>(J)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object v2

    .line 339
    sput-object v2, Ll/ۢ֨ۢ;->᩻:Ljava/util/concurrent/Future;

    .line 340
    new-instance v3, Ll/ۜ֨ۢ;

    invoke-direct {v3, v0, v1, v2}, Ll/ۜ֨ۢ;-><init>(JLjava/util/concurrent/Future;)V

    return-object v3
.end method

.method public static ۘ()V
    .locals 15

    .line 161
    :goto_0
    const-class v0, Ll/ۢ֨ۢ;

    move-object v14, v0

    monitor-enter v14

    .line 162
    :try_start_0
    invoke-static {}, Ll/ۢ֨ۢ;->᩻()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 163
    monitor-exit v14

    goto/16 :goto_d

    .line 166
    :cond_0
    invoke-static {}, Ll/ܺۤۡ;->֫()Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_1

    invoke-static {}, Ll/᩶ۡ᩷;->֫()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    const/4 v3, 0x0

    :goto_1
    const/4 v4, 0x0

    if-eqz v3, :cond_3

    .line 167
    sget-object v0, Ll/᩶ۡ᩷;->᩶:Landroid/content/SharedPreferences;

    const-string v5, "get_root"

    invoke-interface {v0, v5, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    if-eqz v0, :cond_3

    .line 24
    :try_start_1
    invoke-static {v2}, Ll/۬ۛۡ;->֫(Z)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    const-string v0, "Shell.create su: Permission denied"

    .line 777
    invoke-static {v0}, Ll/᩶ۘܽ;->ۧ(Ljava/lang/String;)V

    goto :goto_2

    :cond_2
    const-string v5, "Shell.create "

    .line 780
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ll/᩶ۘܽ;->ۧ(Ljava/lang/String;)V

    .line 781
    new-instance v5, Ll/۬ۚۢ;

    invoke-direct {v5, v0, v1}, Ll/۬ۚۢ;-><init>(Ljava/lang/String;Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception v0

    :try_start_2
    const-string v5, "Shell.error"

    .line 171
    invoke-static {v5, v0}, Ll/᩶ۘܽ;->֫(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    :goto_2
    move-object v5, v4

    :goto_3
    const-wide/16 v6, -0x1

    if-nez v5, :cond_8

    if-eqz v3, :cond_8

    .line 174
    sget-object v0, Ll/᩶ۡ᩷;->᩶:Landroid/content/SharedPreferences;

    const-string v3, "get_adb"

    invoke-interface {v0, v3, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 175
    invoke-static {}, Ll/ۢ֨ۢ;->ܳ()Ll/᩷֨ۢ;

    move-result-object v0

    .line 176
    sget-object v3, Ll/᩷֨ۢ;->᩹:Ll/᩷֨ۢ;

    if-ne v0, v3, :cond_4

    .line 178
    invoke-static {}, Ll/ۢ֨ۢ;->ۧ()V

    .line 179
    sget-object v0, Ll/᩷֨ۢ;->᩶:Ll/᩷֨ۢ;

    .line 181
    :cond_4
    invoke-static {}, Ll/᩶֨ۢ;->ۢ()Z

    move-result v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_5

    if-eqz v3, :cond_5

    :try_start_3
    const-string v0, "Shell.create shizuku (reuse prewarm)"

    .line 184
    invoke-static {v0}, Ll/᩶ۘܽ;->ۧ(Ljava/lang/String;)V

    .line 185
    new-instance v0, Ll/᩶֨ۢ;

    invoke-direct {v0, v1, v2}, Ll/᩶֨ۢ;-><init>(ZZ)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_4
    move-object v5, v0

    goto :goto_5

    :catchall_1
    move-exception v0

    :try_start_4
    const-string v3, "Shell.error"

    .line 187
    invoke-static {v3, v0}, Ll/᩶ۘܽ;->֫(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_5

    .line 189
    :cond_5
    sget-object v3, Ll/᩷֨ۢ;->ۙ:Ll/᩷֨ۢ;

    if-ne v0, v3, :cond_6

    .line 191
    sget-wide v8, Ll/ۢ֨ۢ;->᩷:J

    .line 193
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Shell.skip shizuku while prewarm waiting binder, generation="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩶ۘܽ;->ۧ(Ljava/lang/String;)V

    const/4 v0, 0x0

    move-wide v9, v8

    move-object v8, v5

    move-object v5, v4

    move-wide v3, v6

    goto :goto_7

    .line 194
    :cond_6
    sget-object v3, Ll/᩷֨ۢ;->ۗ:Ll/᩷֨ۢ;

    if-ne v0, v3, :cond_7

    sget-object v0, Ll/ۢ֨ۢ;->᩻:Ljava/util/concurrent/Future;

    if-eqz v0, :cond_7

    .line 197
    sget-wide v3, Ll/ۢ֨ۢ;->᩷:J

    .line 199
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "Shell.wait shizuku prewarm, generation="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ll/᩶ۘܽ;->ۧ(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    goto :goto_6

    :cond_7
    :try_start_5
    const-string v0, "Shell.create shizuku (no wait binder)"

    .line 203
    invoke-static {v0}, Ll/᩶ۘܽ;->ۧ(Ljava/lang/String;)V

    .line 204
    new-instance v0, Ll/᩶֨ۢ;

    invoke-direct {v0, v1, v2}, Ll/᩶֨ۢ;-><init>(ZZ)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_4

    :catchall_2
    move-exception v0

    :try_start_6
    const-string v3, "Shell.error"

    .line 206
    invoke-static {v3, v0}, Ll/᩶ۘܽ;->֫(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_8
    :goto_5
    move-object v0, v4

    move-wide v3, v6

    :goto_6
    const/4 v8, 0x1

    move-object v8, v5

    move-wide v9, v6

    move-object v5, v0

    const/4 v0, 0x1

    :goto_7
    const-wide/16 v11, 0x0

    if-nez v5, :cond_b

    if-nez v8, :cond_9

    const-string v8, "Shell.create sh"

    .line 212
    invoke-static {v8}, Ll/᩶ۘܽ;->ۧ(Ljava/lang/String;)V

    .line 213
    new-instance v8, Ll/۬ۚۢ;

    const-string v13, "sh"

    invoke-direct {v8, v13, v2}, Ll/۬ۚۢ;-><init>(Ljava/lang/String;Z)V

    :cond_9
    if-nez v0, :cond_a

    cmp-long v13, v9, v11

    if-ltz v13, :cond_a

    .line 216
    sput-wide v9, Ll/ۢ֨ۢ;->ۧ:J

    goto :goto_8

    .line 218
    :cond_a
    sput-wide v6, Ll/ۢ֨ۢ;->ۧ:J

    .line 220
    :goto_8
    invoke-static {v8, v0}, Ll/ۢ֨ۢ;->֫(Ll/ۤۚۢ;Z)V

    .line 222
    :cond_b
    monitor-exit v14
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    if-eqz v5, :cond_11

    .line 228
    :try_start_7
    invoke-interface {v5}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;
    :try_end_7
    .catch Ljava/util/concurrent/CancellationException; {:try_start_7 .. :try_end_7} :catch_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_7 .. :try_end_7} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_7 .. :try_end_7} :catch_0

    goto :goto_9

    :catch_0
    move-exception v0

    move-object v1, v0

    .line 236
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v5, "Shell.wait shizuku prewarm interrupted, generation="

    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Ll/᩶ۘܽ;->֫(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x1

    goto :goto_a

    :catch_1
    move-exception v0

    move-object v1, v0

    .line 233
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v5, "Shell.wait shizuku prewarm error, generation="

    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Ll/᩶ۘܽ;->֫(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_9
    const/4 v0, 0x0

    :goto_a
    const/4 v1, 0x0

    goto :goto_b

    .line 230
    :catch_2
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v5, "Shell.wait shizuku prewarm canceled, generation="

    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩶ۘܽ;->ۧ(Ljava/lang/String;)V

    const/4 v0, 0x0

    :goto_b
    if-eqz v1, :cond_d

    .line 240
    const-class v1, Ll/ۢ֨ۢ;

    move-object v14, v1

    monitor-enter v14

    .line 243
    :try_start_8
    sget-wide v5, Ll/ۢ֨ۢ;->᩷:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_c

    sget-object v1, Ll/ۢ֨ۢ;->᩻:Ljava/util/concurrent/Future;

    if-nez v1, :cond_c

    sget-object v1, Ll/ۢ֨ۢ;->֫:Ll/ۤۚۢ;

    if-nez v1, :cond_c

    .line 244
    monitor-exit v14

    goto :goto_d

    .line 246
    :cond_c
    monitor-exit v14

    goto :goto_c

    :catchall_3
    move-exception v0

    monitor-exit v14
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    throw v0

    :cond_d
    :goto_c
    if-nez v0, :cond_e

    goto/16 :goto_0

    .line 253
    :cond_e
    const-class v0, Ll/ۢ֨ۢ;

    move-object v14, v0

    monitor-enter v14

    .line 254
    :try_start_9
    invoke-static {}, Ll/ۢ֨ۢ;->᩻()Z

    move-result v0

    if-eqz v0, :cond_f

    .line 256
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 257
    monitor-exit v14

    goto :goto_d

    :cond_f
    const-string v0, "Shell.create sh"

    .line 259
    invoke-static {v0}, Ll/᩶ۘܽ;->ۧ(Ljava/lang/String;)V

    .line 262
    sput-wide v3, Ll/ۢ֨ۢ;->ۧ:J

    .line 263
    new-instance v0, Ll/۬ۚۢ;

    const-string v1, "sh"

    invoke-direct {v0, v1, v2}, Ll/۬ۚۢ;-><init>(Ljava/lang/String;Z)V

    invoke-static {v0, v2}, Ll/ۢ֨ۢ;->֫(Ll/ۤۚۢ;Z)V

    .line 264
    monitor-exit v14
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 265
    invoke-static {}, Ll/ۗ᩶ܿ;->ۧ()V

    .line 266
    invoke-static {}, Ll/ۨۚۢ;->֫()V

    cmp-long v0, v3, v11

    if-ltz v0, :cond_10

    .line 269
    invoke-static {v3, v4}, Ll/ۢ֨ۢ;->֫(J)Z

    .line 271
    :cond_10
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    return-void

    :catchall_4
    move-exception v0

    .line 264
    :try_start_a
    monitor-exit v14
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    throw v0

    .line 274
    :cond_11
    invoke-static {}, Ll/ۗ᩶ܿ;->ۧ()V

    .line 275
    invoke-static {}, Ll/ۨۚۢ;->֫()V

    cmp-long v0, v9, v11

    if-ltz v0, :cond_12

    .line 278
    invoke-static {v9, v10}, Ll/ۢ֨ۢ;->֫(J)Z

    :cond_12
    :goto_d
    return-void

    :catchall_5
    move-exception v0

    .line 222
    :try_start_b
    monitor-exit v14
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    throw v0
.end method

.method public static ۜ()Z
    .locals 1

    .line 797
    sget-object v0, Ll/ۢ֨ۢ;->֫:Ll/ۤۚۢ;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ll/ۤۚۢ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static ۡ()Ll/۫ۚۢ;
    .locals 3

    .line 831
    invoke-static {}, Ll/ۢ֨ۢ;->᩷()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 832
    sget-object v0, Ll/ۢ֨ۢ;->֫:Ll/ۤۚۢ;

    const-string v1, "cat /proc/mounts"

    invoke-interface {v0, v1}, Ll/ۤۚۢ;->֫(Ljava/lang/String;)Ll/۫ۚۢ;

    move-result-object v0

    return-object v0

    .line 835
    :cond_0
    :try_start_0
    new-instance v0, Ljava/io/File;

    const-string v1, "/proc/mounts"

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-static {v0}, Ll/ܺۢ֡;->᩻(Ljava/io/File;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    .line 836
    new-instance v1, Ll/۫ۚۢ;

    const-string v2, ""

    .line 49
    invoke-direct {v1, v2, v0}, Ll/۫ۚۢ;-><init>(Ljava/lang/String;[Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception v0

    .line 838
    new-instance v1, Ll/۫ۚۢ;

    invoke-direct {v1, v0}, Ll/۫ۚۢ;-><init>(Ljava/io/IOException;)V

    return-object v1
.end method

.method public static ۢ()Z
    .locals 1

    .line 793
    sget-object v0, Ll/ۢ֨ۢ;->֫:Ll/ۤۚۢ;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ll/ۤۚۢ;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static declared-synchronized ۧ()V
    .locals 3

    .line 2
    const-class v0, Ll/ۢ֨ۢ;

    .line 3
    monitor-enter v0

    .line 386
    :try_start_0
    sget-object v1, Ll/ۢ֨ۢ;->ۢ:Ll/᩷֨ۢ;

    sget-object v2, Ll/᩷֨ۢ;->᩹:Ll/᩷֨ۢ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eq v1, v2, :cond_0

    .line 387
    monitor-exit v0

    return-void

    .line 389
    :cond_0
    :try_start_1
    sget-object v1, Ll/᩷֨ۢ;->᩶:Ll/᩷֨ۢ;

    sput-object v1, Ll/ۢ֨ۢ;->ۢ:Ll/᩷֨ۢ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 390
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

.method public static ۧ(JZ)V
    .locals 4

    .line 595
    const-class v0, Ll/ۢ֨ۢ;

    monitor-enter v0

    .line 621
    :try_start_0
    sget-boolean v1, Ll/ۢ֨ۢ;->ᩳ:Z

    if-eqz v1, :cond_4

    invoke-static {}, Ll/ۢ֨ۢ;->᩻()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    const-wide/16 v1, 0x0

    cmp-long v3, p0, v1

    if-ltz v3, :cond_1

    .line 624
    sget-wide v1, Ll/ۢ֨ۢ;->᩷:J

    cmp-long v3, p0, v1

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    if-eqz p2, :cond_2

    .line 600
    sget-wide v1, Ll/ۢ֨ۢ;->ۧ:J

    cmp-long v3, v1, p0

    if-nez v3, :cond_3

    const-wide/16 p0, -0x1

    .line 601
    sput-wide p0, Ll/ۢ֨ۢ;->ۧ:J

    goto :goto_0

    .line 604
    :cond_2
    sput-wide p0, Ll/ۢ֨ۢ;->ۧ:J

    :cond_3
    :goto_0
    const-string p0, "Shell.create sh"

    .line 606
    invoke-static {p0}, Ll/᩶ۘܽ;->ۧ(Ljava/lang/String;)V

    .line 607
    new-instance p0, Ll/۬ۚۢ;

    const-string p1, "sh"

    const/4 v1, 0x0

    invoke-direct {p0, p1, v1}, Ll/۬ۚۢ;-><init>(Ljava/lang/String;Z)V

    invoke-static {p0, p2}, Ll/ۢ֨ۢ;->֫(Ll/ۤۚۢ;Z)V

    .line 609
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 611
    invoke-static {}, Ll/ۗ᩶ܿ;->ۧ()V

    .line 612
    invoke-static {}, Ll/ۨۚۢ;->֫()V

    return-void

    .line 597
    :cond_4
    :goto_1
    :try_start_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    .line 609
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static declared-synchronized ܳ()Ll/᩷֨ۢ;
    .locals 2

    .line 2
    const-class v0, Ll/ۢ֨ۢ;

    .line 3
    monitor-enter v0

    .line 379
    :try_start_0
    sget-object v1, Ll/ۢ֨ۢ;->ۢ:Ll/᩷֨ۢ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public static ܺ()V
    .locals 6

    .line 288
    const-class v0, Ll/ۢ֨ۢ;

    monitor-enter v0

    .line 289
    :try_start_0
    invoke-static {}, Ll/ۢ֨ۢ;->᩻()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 290
    monitor-exit v0

    return-void

    .line 292
    :cond_0
    invoke-static {}, Ll/ܺۤۡ;->֫()Z

    move-result v1

    if-nez v1, :cond_5

    invoke-static {}, Ll/᩶ۡ᩷;->֫()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 293
    sget-object v1, Ll/᩶ۡ᩷;->᩶:Landroid/content/SharedPreferences;

    const-string v2, "get_adb"

    const/4 v3, 0x1

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_1

    .line 296
    :cond_1
    sget-object v1, Ll/ۢ֨ۢ;->᩻:Ljava/util/concurrent/Future;

    if-eqz v1, :cond_2

    .line 297
    invoke-interface {v1}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v1

    if-nez v1, :cond_2

    .line 298
    monitor-exit v0

    return-void

    .line 300
    :cond_2
    sget-object v1, Ll/᩶ۡ᩷;->᩶:Landroid/content/SharedPreferences;

    const-string v2, "get_root"

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    .line 301
    sget-object v2, Ll/᩶ۡ᩷;->᩶:Landroid/content/SharedPreferences;

    const-string v4, "last_shell_backend"

    const-string v5, "app"

    invoke-interface {v2, v4, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v1, :cond_3

    goto :goto_0

    :cond_3
    const-string v1, "shizuku"

    .line 745
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    :goto_0
    if-nez v3, :cond_4

    .line 303
    monitor-exit v0

    return-void

    .line 305
    :cond_4
    invoke-static {}, Ll/ۢ֨ۢ;->ۖ()Ll/ۜ֨ۢ;

    .line 306
    monitor-exit v0

    return-void

    .line 294
    :cond_5
    :goto_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    .line 306
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static ܽ()Ll/ۜ֨ۢ;
    .locals 6

    .line 313
    invoke-static {}, Ll/ܺۤۡ;->֫()Z

    move-result v0

    if-nez v0, :cond_5

    invoke-static {}, Ll/᩶ۡ᩷;->֫()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 314
    sget-object v0, Ll/᩶ۡ᩷;->᩶:Landroid/content/SharedPreferences;

    const-string v1, "get_adb"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_2

    .line 317
    :cond_0
    sget-object v0, Ll/ۢ֨ۢ;->᩻:Ljava/util/concurrent/Future;

    if-eqz v0, :cond_1

    .line 318
    invoke-interface {v0}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v1

    if-nez v1, :cond_1

    .line 319
    new-instance v1, Ll/ۜ֨ۢ;

    sget-wide v2, Ll/ۢ֨ۢ;->᩷:J

    invoke-direct {v1, v2, v3, v0}, Ll/ۜ֨ۢ;-><init>(JLjava/util/concurrent/Future;)V

    return-object v1

    .line 321
    :cond_1
    sget-object v0, Ll/ۢ֨ۢ;->֫:Ll/ۤۚۢ;

    .line 322
    instance-of v1, v0, Ll/᩶֨ۢ;

    if-eqz v1, :cond_2

    check-cast v0, Ll/᩶֨ۢ;

    invoke-virtual {v0}, Ll/᩶֨ۢ;->֫()Z

    move-result v0

    if-nez v0, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    .line 323
    :goto_0
    sget-object v1, Ll/᩶ۡ᩷;->᩶:Landroid/content/SharedPreferences;

    const-string v3, "get_root"

    invoke-interface {v1, v3, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    .line 324
    sget-object v3, Ll/᩶ۡ᩷;->᩶:Landroid/content/SharedPreferences;

    const-string v4, "last_shell_backend"

    const-string v5, "app"

    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-nez v0, :cond_4

    if-nez v1, :cond_3

    goto :goto_1

    :cond_3
    const-string v0, "shizuku"

    .line 745
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    :goto_1
    if-nez v2, :cond_4

    goto :goto_2

    .line 328
    :cond_4
    invoke-static {}, Ll/ۢ֨ۢ;->ۖ()Ll/ۜ֨ۢ;

    move-result-object v0

    return-object v0

    :cond_5
    :goto_2
    const/4 v0, 0x0

    return-object v0
.end method

.method public static ܿ()Ll/ۤۚۢ;
    .locals 1

    .line 785
    sget-object v0, Ll/ۢ֨ۢ;->֫:Ll/ۤۚۢ;

    return-object v0
.end method

.method public static ᩳ()I
    .locals 7

    .line 843
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 844
    sget-object v1, Landroid/os/Build;->SUPPORTED_ABIS:[Ljava/lang/String;

    invoke-static {v0, v1}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 845
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 846
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, -0x1

    sparse-switch v3, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v3, "arm64-v8a"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    const/4 v6, 0x3

    goto :goto_1

    :sswitch_1
    const-string v3, "armeabi-v7a"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v6, 0x2

    goto :goto_1

    :sswitch_2
    const-string v3, "x86"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    const/4 v6, 0x1

    goto :goto_1

    :sswitch_3
    const-string v3, "x86_64"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_1

    :cond_3
    const/4 v6, 0x0

    :goto_1
    packed-switch v6, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    return v5

    :pswitch_1
    return v2

    :pswitch_2
    return v4

    :pswitch_3
    const/4 v0, 0x4

    return v0

    :cond_4
    return v2

    :sswitch_data_0
    .sparse-switch
        -0x300b59d9 -> :sswitch_3
        0x1c976 -> :sswitch_2
        0x8ab4d72 -> :sswitch_1
        0x5553f3ec -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ᩴ()V
    .locals 6

    .line 104
    const-class v0, Ll/ۢ֨ۢ;

    monitor-enter v0

    .line 105
    :try_start_0
    sget-boolean v1, Ll/ۢ֨ۢ;->ᩳ:Z

    if-eqz v1, :cond_0

    .line 106
    invoke-static {}, Ll/ۢ֨ۢ;->᩻()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 107
    monitor-exit v0

    return-void

    .line 109
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-nez v1, :cond_1

    .line 111
    invoke-static {}, Ll/ۢ֨ۢ;->ۘ()V

    return-void

    .line 114
    :cond_1
    invoke-static {}, Ll/ۢ֨ۢ;->᩵()Z

    move-result v0

    if-eqz v0, :cond_2

    goto/16 :goto_2

    .line 117
    :cond_2
    invoke-static {}, Ll/ۢ֨ۢ;->֡()Z

    move-result v0

    if-eqz v0, :cond_3

    goto/16 :goto_2

    .line 121
    :cond_3
    const-class v0, Ll/ۢ֨ۢ;

    monitor-enter v0

    .line 122
    :try_start_1
    sget-boolean v1, Ll/ۢ֨ۢ;->ᩳ:Z

    if-eqz v1, :cond_a

    invoke-static {}, Ll/ۢ֨ۢ;->᩻()Z

    move-result v1

    if-eqz v1, :cond_4

    goto/16 :goto_3

    .line 125
    :cond_4
    invoke-static {}, Ll/ۢ֨ۢ;->ܽ()Ll/ۜ֨ۢ;

    move-result-object v1

    if-eqz v1, :cond_5

    .line 128
    iget-wide v2, v1, Ll/ۜ֨ۢ;->ۧ:J

    sput-wide v2, Ll/ۢ֨ۢ;->ۧ:J

    .line 130
    :cond_5
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v0, 0x1

    if-nez v1, :cond_6

    const-wide/16 v1, -0x1

    .line 132
    invoke-static {v1, v2, v0}, Ll/ۢ֨ۢ;->ۧ(JZ)V

    return-void

    .line 573
    :cond_6
    :try_start_2
    iget-object v2, v1, Ll/ۜ֨ۢ;->֫:Ljava/util/concurrent/Future;

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v4, 0x4b0

    invoke-interface {v2, v4, v5, v3}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 574
    sget-object v2, Ll/᩻֨ۢ;->᩶:Ll/᩻֨ۢ;
    :try_end_2
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    .line 585
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Shell.auto recovery shizuku interrupted, generation="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v4, v1, Ll/ۜ֨ۢ;->ۧ:J

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v2}, Ll/᩶ۘܽ;->֫(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 586
    sget-object v2, Ll/᩻֨ۢ;->ۗ:Ll/᩻֨ۢ;

    goto :goto_0

    .line 582
    :catch_1
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Shell.auto recovery shizuku canceled, generation="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v3, v1, Ll/ۜ֨ۢ;->ۧ:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ll/᩶ۘܽ;->ۧ(Ljava/lang/String;)V

    .line 583
    sget-object v2, Ll/᩻֨ۢ;->᩹:Ll/᩻֨ۢ;

    goto :goto_0

    :catch_2
    move-exception v2

    .line 579
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Shell.auto recovery shizuku error, generation="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v4, v1, Ll/ۜ֨ۢ;->ۧ:J

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v2}, Ll/᩶ۘܽ;->֫(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 580
    sget-object v2, Ll/᩻֨ۢ;->ۙ:Ll/᩻֨ۢ;

    goto :goto_0

    .line 576
    :catch_3
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Shell.auto recovery shizuku timeout, generation="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v3, v1, Ll/ۜ֨ۢ;->ۧ:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ll/᩶ۘܽ;->ۧ(Ljava/lang/String;)V

    .line 577
    sget-object v2, Ll/᩻֨ۢ;->۬:Ll/᩻֨ۢ;

    .line 136
    :goto_0
    sget-object v3, Ll/᩻֨ۢ;->᩶:Ll/᩻֨ۢ;

    if-ne v2, v3, :cond_7

    iget-wide v3, v1, Ll/ۜ֨ۢ;->ۧ:J

    .line 137
    invoke-static {v3, v4}, Ll/ۢ֨ۢ;->֫(J)Z

    move-result v3

    if-eqz v3, :cond_7

    goto :goto_2

    .line 140
    :cond_7
    sget-object v3, Ll/᩻֨ۢ;->۬:Ll/᩻֨ۢ;

    if-eq v2, v3, :cond_8

    goto :goto_1

    :cond_8
    const/4 v0, 0x0

    .line 141
    :goto_1
    iget-wide v3, v1, Ll/ۜ֨ۢ;->ۧ:J

    invoke-static {v3, v4, v0}, Ll/ۢ֨ۢ;->ۧ(JZ)V

    .line 142
    sget-object v0, Ll/᩻֨ۢ;->ۗ:Ll/᩻֨ۢ;

    if-ne v2, v0, :cond_9

    .line 143
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :cond_9
    :goto_2
    return-void

    .line 123
    :cond_a
    :goto_3
    :try_start_3
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    .line 130
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v1

    :catchall_1
    move-exception v1

    .line 109
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v1
.end method

.method public static ᩵()Z
    .locals 5

    .line 494
    const-class v0, Ll/ۢ֨ۢ;

    monitor-enter v0

    .line 495
    :try_start_0
    sget-boolean v1, Ll/ۢ֨ۢ;->ᩳ:Z

    const/4 v2, 0x1

    if-eqz v1, :cond_7

    invoke-static {}, Ll/ۢ֨ۢ;->᩻()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_5

    .line 498
    :cond_0
    invoke-static {}, Ll/ܺۤۡ;->֫()Z

    move-result v1

    const/4 v3, 0x0

    if-nez v1, :cond_1

    invoke-static {}, Ll/᩶ۡ᩷;->֫()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 499
    sget-object v1, Ll/᩶ۡ᩷;->᩶:Landroid/content/SharedPreferences;

    const-string v4, "get_root"

    invoke-interface {v1, v4, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 500
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    if-nez v1, :cond_2

    goto :goto_3

    :cond_2
    const/4 v0, 0x0

    .line 24
    :try_start_1
    invoke-static {v3}, Ll/۬ۛۡ;->֫(Z)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_3

    const-string v1, "Shell.create su: Permission denied"

    .line 777
    invoke-static {v1}, Ll/᩶ۘܽ;->ۧ(Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    const-string v4, "Shell.create "

    .line 780
    invoke-virtual {v4, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ll/᩶ۘܽ;->ۧ(Ljava/lang/String;)V

    .line 781
    new-instance v4, Ll/۬ۚۢ;

    invoke-direct {v4, v1, v2}, Ll/۬ۚۢ;-><init>(Ljava/lang/String;Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v1

    const-string v4, "Shell.error"

    .line 508
    invoke-static {v4, v1}, Ll/᩶ۘܽ;->֫(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_1
    move-object v4, v0

    :goto_2
    if-nez v4, :cond_4

    :goto_3
    return v3

    .line 514
    :cond_4
    const-class v0, Ll/ۢ֨ۢ;

    monitor-enter v0

    .line 515
    :try_start_2
    sget-boolean v1, Ll/ۢ֨ۢ;->ᩳ:Z

    if-eqz v1, :cond_6

    invoke-static {}, Ll/ۢ֨ۢ;->᩻()Z

    move-result v1

    if-eqz v1, :cond_5

    goto :goto_4

    .line 662
    :cond_5
    invoke-static {v4, v2}, Ll/ۢ֨ۢ;->֫(Ll/ۤۚۢ;Z)V

    .line 521
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 523
    invoke-static {}, Ll/ۗ᩶ܿ;->ۧ()V

    .line 524
    invoke-static {}, Ll/ۨۚۢ;->֫()V

    return v2

    .line 516
    :cond_6
    :goto_4
    :try_start_3
    invoke-virtual {v4}, Ll/۬ۚۢ;->close()V

    .line 517
    monitor-exit v0

    return v2

    :catchall_1
    move-exception v1

    .line 521
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v1

    .line 496
    :cond_7
    :goto_5
    :try_start_4
    monitor-exit v0

    return v2

    :catchall_2
    move-exception v1

    .line 500
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    throw v1
.end method

.method public static ᩷()Z
    .locals 1

    .line 789
    sget-object v0, Ll/ۢ֨ۢ;->֫:Ll/ۤۚۢ;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ll/ۤۚۢ;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static ᩻()Z
    .locals 1

    .line 96
    sget-object v0, Ll/ۢ֨ۢ;->֫:Ll/ۤۚۢ;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ll/ۤۚۢ;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
