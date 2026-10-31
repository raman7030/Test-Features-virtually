.class public final Ll/᩶ۛۜ;
.super Ljava/lang/Object;
.source "E6MO"


# instance fields
.field public final ֫:J

.field public final ۧ:Ll/᩹ۛۜ;

.field public ܽ:J

.field public ܿ:J

.field public ᩳ:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(JLl/᩹ۛۜ;)V
    .locals 3

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-lez v2, :cond_0

    .line 16
    iput-wide p1, p0, Ll/᩶ۛۜ;->֫:J

    .line 17
    iput-object p3, p0, Ll/᩶ۛۜ;->ۧ:Ll/᩹ۛۜ;

    return-void

    .line 15
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Bitmap budget must be positive"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static bridge synthetic ֫(Ll/᩶ۛۜ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/᩶ۛۜ;->֫:J

    return-wide v0
.end method

.method public static bridge synthetic ֫(Ll/᩶ۛۜ;J)V
    .locals 0

    .line 0
    iput-wide p1, p0, Ll/᩶ۛۜ;->ܽ:J

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/᩶ۛۜ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/᩶ۛۜ;->ܽ:J

    return-wide v0
.end method

.method public static bridge synthetic ۧ(Ll/᩶ۛۜ;J)V
    .locals 0

    .line 0
    iput-wide p1, p0, Ll/᩶ۛۜ;->ܿ:J

    return-void
.end method

.method public static bridge synthetic ܽ(Ll/᩶ۛۜ;)Ljava/lang/Runnable;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩶ۛۜ;->ᩳ:Ljava/lang/Runnable;

    return-object p0
.end method

.method public static ܽ(Ll/᩶ۛۜ;J)Z
    .locals 2

    .line 40
    iget-object p0, p0, Ll/᩶ۛۜ;->ۧ:Ll/᩹ۛۜ;

    if-eqz p0, :cond_1

    .line 41
    invoke-virtual {p0}, Ll/᩹ۛۜ;->֫()J

    move-result-wide v0

    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Ll/᩹ۛۜ;->ۧ(J)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static bridge synthetic ᩳ(Ll/᩶ۛۜ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/᩶ۛۜ;->ܿ:J

    return-wide v0
.end method


# virtual methods
.method public final ֫()J
    .locals 2

    .line 44
    iget-wide v0, p0, Ll/᩶ۛۜ;->֫:J

    return-wide v0
.end method

.method public final declared-synchronized ֫(J)Ll/᩹ۛۜ;
    .locals 7

    move-object v0, p0

    .line 1
    monitor-enter v0

    const-wide/16 v1, 0x0

    cmp-long v3, p1, v1

    if-ltz v3, :cond_4

    .line 32
    :try_start_0
    iget-wide v1, p0, Ll/᩶ۛۜ;->֫:J

    iget-wide v3, p0, Ll/᩶ۛۜ;->ܿ:J

    sub-long/2addr v1, v3

    cmp-long v5, p1, v1

    if-gtz v5, :cond_3

    add-long/2addr v3, p1

    .line 40
    iget-object v1, p0, Ll/᩶ۛۜ;->ۧ:Ll/᩹ۛۜ;

    if-eqz v1, :cond_1

    .line 41
    invoke-virtual {v1}, Ll/᩹ۛۜ;->֫()J

    move-result-wide v5

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ll/᩹ۛۜ;->ۧ(J)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    if-nez v1, :cond_2

    goto :goto_2

    .line 33
    :cond_2
    iget-wide v1, p0, Ll/᩶ۛۜ;->ܿ:J

    add-long/2addr v1, p1

    iput-wide v1, p0, Ll/᩶ۛۜ;->ܿ:J

    .line 34
    iget-wide v3, p0, Ll/᩶ۛۜ;->ܽ:J

    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    iput-wide v1, p0, Ll/᩶ۛۜ;->ܽ:J

    .line 35
    new-instance v1, Ll/᩹ۛۜ;

    invoke-direct {v1, p0, p1, p2}, Ll/᩹ۛۜ;-><init>(Ll/᩶ۛۜ;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    .line 32
    :cond_3
    :goto_2
    monitor-exit v0

    const/4 p1, 0x0

    return-object p1

    .line 31
    :cond_4
    :try_start_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Reservation must not be negative"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 32
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ֫(Ll/᩵۫᩷;)V
    .locals 1

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 49
    :try_start_0
    iput-object p1, p0, Ll/᩶ۛۜ;->ᩳ:Ljava/lang/Runnable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ۧ()J
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 45
    :try_start_0
    iget-wide v1, p0, Ll/᩶ۛۜ;->ܿ:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-wide v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
