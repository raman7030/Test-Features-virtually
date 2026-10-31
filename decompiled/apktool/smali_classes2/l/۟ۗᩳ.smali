.class public final Ll/۟ۗᩳ;
.super Ljava/lang/Object;
.source "I6U1"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final synthetic ۙ:Ll/᩻۬ᩳ;

.field public final ᩶:Ljava/util/UUID;

.field public ᩸:Ll/ܶۙᩳ;

.field public final ᩹:J


# direct methods
.method public constructor <init>(Ll/᩻۬ᩳ;Ll/ܶۙᩳ;Ljava/util/UUID;J)V
    .locals 0

    .line 747
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۟ۗᩳ;->ۙ:Ll/᩻۬ᩳ;

    .line 748
    iput-object p2, p0, Ll/۟ۗᩳ;->᩸:Ll/ܶۙᩳ;

    iput-object p3, p0, Ll/۟ۗᩳ;->᩶:Ljava/util/UUID;

    iput-wide p4, p0, Ll/۟ۗᩳ;->᩹:J

    return-void
.end method

.method private ᩻()Ll/ܶۙᩳ;
    .locals 2

    .line 796
    iget-object v0, p0, Ll/۟ۗᩳ;->᩸:Ll/ܶۙᩳ;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Checkpoint is closed or already published"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final close()V
    .locals 3

    .line 801
    iget-object v0, p0, Ll/۟ۗᩳ;->ۙ:Ll/᩻۬ᩳ;

    monitor-enter v0

    .line 802
    :try_start_0
    iget-object v1, p0, Ll/۟ۗᩳ;->᩸:Ll/ܶۙᩳ;

    const/4 v2, 0x0

    iput-object v2, p0, Ll/۟ۗᩳ;->᩸:Ll/ܶۙᩳ;

    if-eqz v1, :cond_0

    .line 803
    invoke-virtual {v1}, Ll/ܶۙᩳ;->close()V

    .line 804
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ֫()[B
    .locals 2

    .line 753
    iget-object v0, p0, Ll/۟ۗᩳ;->ۙ:Ll/᩻۬ᩳ;

    monitor-enter v0

    :try_start_0
    invoke-direct {p0}, Ll/۟ۗᩳ;->᩻()Ll/ܶۙᩳ;

    move-result-object v1

    iget-object v1, v1, Ll/ܶۙᩳ;->ۙ:Ll/ۖۗᩳ;

    iget-object v1, v1, Ll/ۖۗᩳ;->᩸:[B

    invoke-virtual {v1}, [B->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ۧ([B)J
    .locals 12

    .line 768
    iget-object v0, p0, Ll/۟ۗᩳ;->ۙ:Ll/᩻۬ᩳ;

    monitor-enter v0

    .line 769
    :try_start_0
    iget-object v1, p0, Ll/۟ۗᩳ;->ۙ:Ll/᩻۬ᩳ;

    invoke-static {v1}, Ll/᩻۬ᩳ;->ۜ(Ll/᩻۬ᩳ;)V

    iget-object v1, p0, Ll/۟ۗᩳ;->ۙ:Ll/᩻۬ᩳ;

    invoke-static {v1}, Ll/᩻۬ᩳ;->᩻(Ll/᩻۬ᩳ;)V

    .line 770
    invoke-direct {p0}, Ll/۟ۗᩳ;->᩻()Ll/ܶۙᩳ;

    move-result-object v1

    .line 771
    iget-wide v2, v1, Ll/ܶۙᩳ;->᩶:J

    iget-object v4, p0, Ll/۟ۗᩳ;->ۙ:Ll/᩻۬ᩳ;

    invoke-static {v4}, Ll/᩻۬ᩳ;->֫(Ll/᩻۬ᩳ;)J

    move-result-wide v4

    cmp-long v6, v2, v4

    if-lez v6, :cond_2

    .line 772
    iget-object v2, p0, Ll/۟ۗᩳ;->ۙ:Ll/᩻۬ᩳ;

    invoke-static {v2}, Ll/᩻۬ᩳ;->ܿ(Ll/᩻۬ᩳ;)Ll/᩸۬ᩳ;

    move-result-object v2

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Ll/۟ۗᩳ;->ۙ:Ll/᩻۬ᩳ;

    invoke-static {v2}, Ll/᩻۬ᩳ;->ܿ(Ll/᩻۬ᩳ;)Ll/᩸۬ᩳ;

    move-result-object v2

    iget-object v2, v2, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    :goto_0
    invoke-static {v2, p1}, Ll/ۖۗᩳ;->֫(Ll/֨۬ᩳ;[B)Ll/ۖۗᩳ;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 774
    :try_start_1
    new-instance v10, Ll/۫᩹ᩳ;

    iget-object v3, v1, Ll/ܶۙᩳ;->ۗ:Ll/۫᩹ᩳ;

    invoke-virtual {v3}, Ll/۬᩹ᩳ;->ܳ()Ll/ۨ᩹ᩳ;

    move-result-object v3

    iget-object v4, v1, Ll/ܶۙᩳ;->ۗ:Ll/۫᩹ᩳ;

    invoke-virtual {v4}, Ll/۫᩹ᩳ;->᩻()J

    move-result-wide v4

    invoke-direct {v10, v3, v4, v5}, Ll/۫᩹ᩳ;-><init>(Ll/ۨ᩹ᩳ;J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 776
    :try_start_2
    new-instance v11, Ll/ܶۙᩳ;

    iget-object v6, v1, Ll/ܶۙᩳ;->᩸:Ll/ۖۙᩳ;

    iget-object v7, v1, Ll/ܶۙᩳ;->᩹:Ll/ۚۙᩳ;

    iget-wide v8, v1, Ll/ܶۙᩳ;->᩶:J

    move-object v3, v11

    move-object v4, v10

    move-object v5, v2

    invoke-direct/range {v3 .. v9}, Ll/ܶۙᩳ;-><init>(Ll/۫᩹ᩳ;Ll/ۖۗᩳ;Ll/ۖۙᩳ;Ll/ۚۙᩳ;J)V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 778
    :try_start_3
    iget-object v3, p0, Ll/۟ۗᩳ;->ۙ:Ll/᩻۬ᩳ;

    invoke-static {v3}, Ll/᩻۬ᩳ;->ܽ(Ll/᩻۬ᩳ;)Ll/ۤۙᩳ;

    move-result-object v3

    iget-wide v4, p0, Ll/۟ۗᩳ;->᩹:J

    array-length p1, p1

    int-to-long v6, p1

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    const-wide/16 v6, 0x1

    invoke-static {v6, v7, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    invoke-virtual {v3, v11, v4, v5}, Ll/ۤۙᩳ;->֫(Ll/ܶۙᩳ;J)V

    .line 779
    iget-object p1, p0, Ll/۟ۗᩳ;->ۙ:Ll/᩻۬ᩳ;

    iget-wide v3, v1, Ll/ܶۙᩳ;->᩶:J

    invoke-static {p1, v3, v4}, Ll/᩻۬ᩳ;->֫(Ll/᩻۬ᩳ;J)V

    .line 781
    iget-object p1, p0, Ll/۟ۗᩳ;->ۙ:Ll/᩻۬ᩳ;

    invoke-static {p1}, Ll/᩻۬ᩳ;->ᩳ(Ll/᩻۬ᩳ;)J

    move-result-wide v3

    iget-wide v5, v1, Ll/ܶۙᩳ;->᩶:J

    cmp-long p1, v3, v5

    if-nez p1, :cond_1

    .line 782
    iget-object p1, p0, Ll/۟ۗᩳ;->ۙ:Ll/᩻۬ᩳ;

    invoke-static {p1}, Ll/᩻۬ᩳ;->ۧ(Ll/᩻۬ᩳ;)Ll/ۖۗᩳ;

    move-result-object p1

    .line 783
    iget-object v3, p0, Ll/۟ۗᩳ;->ۙ:Ll/᩻۬ᩳ;

    invoke-virtual {v2}, Ll/ۖۗᩳ;->᩺ۧ()V

    invoke-static {v3, v2}, Ll/᩻۬ᩳ;->֫(Ll/᩻۬ᩳ;Ll/ۖۗᩳ;)V

    .line 784
    invoke-virtual {p1}, Ll/ۖۗᩳ;->close()V

    .line 786
    iget-object p1, p0, Ll/۟ۗᩳ;->ۙ:Ll/᩻۬ᩳ;

    invoke-static {p1}, Ll/᩻۬ᩳ;->ܳ(Ll/᩻۬ᩳ;)V

    .line 788
    :cond_1
    iget-wide v3, v1, Ll/ܶۙᩳ;->᩶:J

    .line 789
    invoke-virtual {p0}, Ll/۟ۗᩳ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 791
    :try_start_4
    invoke-virtual {v2}, Ll/ۖۗᩳ;->close()V

    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    return-wide v3

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    .line 777
    :goto_1
    :try_start_5
    invoke-virtual {v10}, Ll/۬᩹ᩳ;->close()V

    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :catchall_0
    move-exception p1

    .line 791
    :try_start_6
    invoke-virtual {v2}, Ll/ۖۗᩳ;->close()V

    throw p1

    .line 771
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Checkpoint has been superseded"

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_1
    move-exception p1

    .line 792
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    throw p1
.end method

.method public final ܳ()Ll/۫᩹ᩳ;
    .locals 6

    .line 757
    iget-object v0, p0, Ll/۟ۗᩳ;->ۙ:Ll/᩻۬ᩳ;

    monitor-enter v0

    .line 758
    :try_start_0
    invoke-direct {p0}, Ll/۟ۗᩳ;->᩻()Ll/ܶۙᩳ;

    move-result-object v1

    iget-object v1, v1, Ll/ܶۙᩳ;->ۗ:Ll/۫᩹ᩳ;

    .line 759
    new-instance v2, Ll/۫᩹ᩳ;

    invoke-virtual {v1}, Ll/۬᩹ᩳ;->ܳ()Ll/ۨ᩹ᩳ;

    move-result-object v3

    invoke-virtual {v1}, Ll/۫᩹ᩳ;->᩻()J

    move-result-wide v4

    invoke-direct {v2, v3, v4, v5}, Ll/۫᩹ᩳ;-><init>(Ll/ۨ᩹ᩳ;J)V

    monitor-exit v0

    return-object v2

    :catchall_0
    move-exception v1

    .line 760
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ܽ()J
    .locals 3

    .line 751
    iget-object v0, p0, Ll/۟ۗᩳ;->ۙ:Ll/᩻۬ᩳ;

    monitor-enter v0

    :try_start_0
    invoke-direct {p0}, Ll/۟ۗᩳ;->᩻()Ll/ܶۙᩳ;

    move-result-object v1

    iget-wide v1, v1, Ll/ܶۙᩳ;->᩶:J

    monitor-exit v0

    return-wide v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ᩳ()Ljava/util/UUID;
    .locals 2

    .line 752
    iget-object v0, p0, Ll/۟ۗᩳ;->ۙ:Ll/᩻۬ᩳ;

    monitor-enter v0

    :try_start_0
    invoke-direct {p0}, Ll/۟ۗᩳ;->᩻()Ll/ܶۙᩳ;

    iget-object v1, p0, Ll/۟ۗᩳ;->᩶:Ljava/util/UUID;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
