.class public abstract Ll/᩹֡ۢ;
.super Ljava/lang/Object;
.source "27BV"


# instance fields
.field public volatile ֫:Z

.field public final ۧ:Ljava/lang/Object;

.field public final ܳ:Ljava/lang/String;

.field public volatile ܽ:Z

.field public volatile ܿ:Ljava/util/LinkedHashMap;

.field public volatile ᩳ:J

.field public final synthetic ᩻:Ll/᩶֡ۢ;


# direct methods
.method public constructor <init>(Ll/᩶֡ۢ;Ljava/lang/String;Ljava/util/LinkedHashMap;)V
    .locals 0

    .line 430
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩹֡ۢ;->᩻:Ll/᩶֡ۢ;

    .line 421
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩹֡ۢ;->ۧ:Ljava/lang/Object;

    .line 431
    iput-object p2, p0, Ll/᩹֡ۢ;->ܳ:Ljava/lang/String;

    .line 432
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1, p3}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    iput-object p1, p0, Ll/᩹֡ۢ;->ܿ:Ljava/util/LinkedHashMap;

    const/4 p1, 0x0

    .line 433
    iput-boolean p1, p0, Ll/᩹֡ۢ;->ܽ:Z

    .line 434
    iput-boolean p1, p0, Ll/᩹֡ۢ;->֫:Z

    const-wide/16 p1, 0x0

    .line 435
    iput-wide p1, p0, Ll/᩹֡ۢ;->ᩳ:J

    return-void
.end method

.method public static synthetic ֫(Ll/᩹֡ۢ;)V
    .locals 2

    .line 444
    :try_start_0
    invoke-virtual {p0}, Ll/᩹֡ۢ;->ᩳ()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 449
    iget-boolean v0, p0, Ll/᩹֡ۢ;->֫:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Ll/᩹֡ۢ;->ܽ:Z

    if-nez v0, :cond_1

    .line 450
    invoke-direct {p0}, Ll/᩹֡ۢ;->ܿ()V

    return-void

    :catchall_0
    move-exception v0

    .line 449
    iget-boolean v1, p0, Ll/᩹֡ۢ;->֫:Z

    if-nez v1, :cond_0

    iget-boolean v1, p0, Ll/᩹֡ۢ;->ܽ:Z

    if-nez v1, :cond_0

    .line 450
    invoke-direct {p0}, Ll/᩹֡ۢ;->ܿ()V

    .line 452
    :cond_0
    throw v0

    .line 449
    :catch_0
    iget-boolean v0, p0, Ll/᩹֡ۢ;->֫:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Ll/᩹֡ۢ;->ܽ:Z

    if-nez v0, :cond_1

    .line 450
    invoke-direct {p0}, Ll/᩹֡ۢ;->ܿ()V

    :cond_1
    return-void
.end method

.method public static synthetic ۧ(Ll/᩹֡ۢ;)V
    .locals 2

    .line 484
    iget-object v0, p0, Ll/᩹֡ۢ;->᩻:Ll/᩶֡ۢ;

    invoke-static {v0}, Ll/᩶֡ۢ;->֫(Ll/᩶֡ۢ;)Ll/ۧۤᩴ;

    move-result-object v0

    iget-object v1, p0, Ll/᩹֡ۢ;->ܳ:Ljava/lang/String;

    invoke-virtual {v0, v1, p0}, Ll/ۧۤᩴ;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method private ܿ()V
    .locals 4

    const/4 v0, 0x1

    .line 482
    iput-boolean v0, p0, Ll/᩹֡ۢ;->ܽ:Z

    .line 483
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Ll/᩹֡ۢ;->ᩳ:J

    .line 484
    iget-object v0, p0, Ll/᩹֡ۢ;->ۧ:Ljava/lang/Object;

    new-instance v1, Ll/᩸֡ۢ;

    invoke-direct {v1, p0}, Ll/᩸֡ۢ;-><init>(Ll/᩹֡ۢ;)V

    const-wide/32 v2, 0x493e0

    invoke-static {v0, v2, v3, v1}, Ll/֫ۨۡ;->֫(Ljava/lang/Object;JLjava/lang/Runnable;)V

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/util/LinkedHashMap;
    .locals 3

    .line 499
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    const-string v1, "taskId"

    .line 500
    iget-object v2, p0, Ll/᩹֡ۢ;->ܳ:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 501
    iget-boolean v1, p0, Ll/᩹֡ۢ;->ܽ:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "done"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "property"

    .line 502
    iget-object v2, p0, Ll/᩹֡ۢ;->ܿ:Ljava/util/LinkedHashMap;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public final ֫(IIJZ)V
    .locals 2

    .line 465
    iget-boolean v0, p0, Ll/᩹֡ۢ;->֫:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 468
    :cond_0
    new-instance v0, Ljava/util/LinkedHashMap;

    iget-object v1, p0, Ll/᩹֡ۢ;->ܿ:Ljava/util/LinkedHashMap;

    invoke-direct {v0, v1}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    const-string v1, "sizeBytes"

    .line 469
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-interface {v0, v1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p3, "fileCount"

    .line 470
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p3, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "folderCount"

    .line 471
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 472
    iput-object v0, p0, Ll/᩹֡ۢ;->ܿ:Ljava/util/LinkedHashMap;

    if-eqz p5, :cond_1

    .line 474
    invoke-direct {p0}, Ll/᩹֡ۢ;->ܿ()V

    :cond_1
    :goto_0
    return-void
.end method

.method public final ֫(J)Z
    .locals 5

    .line 517
    iget-boolean v0, p0, Ll/᩹֡ۢ;->ܽ:Z

    if-eqz v0, :cond_0

    iget-wide v0, p0, Ll/᩹֡ۢ;->ᩳ:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    iget-wide v0, p0, Ll/᩹֡ۢ;->ᩳ:J

    sub-long/2addr p1, v0

    const-wide/32 v0, 0x493e0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ()V
    .locals 2

    const/4 v0, 0x1

    .line 491
    iput-boolean v0, p0, Ll/᩹֡ۢ;->֫:Z

    .line 492
    iget-object v0, p0, Ll/᩹֡ۢ;->ۧ:Ljava/lang/Object;

    .line 66
    invoke-static {}, Ll/֫ۨۡ;->ۧ()Landroid/os/Handler;

    move-result-object v1

    .line 67
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    return-void
.end method

.method public final ܽ()Z
    .locals 1

    .line 510
    iget-boolean v0, p0, Ll/᩹֡ۢ;->֫:Z

    return v0
.end method

.method public abstract ᩳ()V
.end method
