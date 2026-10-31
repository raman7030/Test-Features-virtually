.class public final Ll/ۘ֨᩵;
.super Ljava/lang/Object;
.source "A9YW"

# interfaces
.implements Ll/ᩴ֨᩵;


# static fields
.field public static final ۙ:Ll/֫᩻֨;


# instance fields
.field public final ᩶:Ljava/util/concurrent/atomic/AtomicLong;

.field public final ᩸:Ll/ᩳ֨᩵;

.field public final ᩹:Ll/ۖ֨᩵;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 42
    const-class v0, Ll/ۘ֨᩵;

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/Class;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/ۘ֨᩵;->ۙ:Ll/֫᩻֨;

    return-void
.end method

.method public constructor <init>(Ll/ᩳ֨᩵;Ll/ۖ֨᩵;)V
    .locals 3

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v1, 0x1

    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object v0, p0, Ll/ۘ֨᩵;->᩶:Ljava/util/concurrent/atomic/AtomicLong;

    .line 55
    iput-object p1, p0, Ll/ۘ֨᩵;->᩸:Ll/ᩳ֨᩵;

    .line 56
    invoke-virtual {p2}, Ll/ۖ֨᩵;->֫()V

    iput-object p2, p0, Ll/ۘ֨᩵;->᩹:Ll/ۖ֨᩵;

    return-void
.end method


# virtual methods
.method public final declared-synchronized close()V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 152
    :try_start_0
    invoke-virtual {p0}, Ll/ۘ֨᩵;->᩹()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 153
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final finalize()V
    .locals 5

    .line 185
    iget-object v0, p0, Ll/ۘ֨᩵;->᩶:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    .line 186
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Tree handle was not properly released "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۘ֨᩵;->᩸:Ll/ᩳ֨᩵;

    invoke-virtual {v1}, Ll/ᩳ֨᩵;->ۢ()Ljava/net/URL;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ll/ۘ֨᩵;->ۙ:Ll/֫᩻֨;

    invoke-interface {v1, v0}, Ll/֫᩻֨;->ᩳ(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final getSendBufferSize()I
    .locals 3

    .line 281
    iget-object v0, p0, Ll/ۘ֨᩵;->᩹:Ll/ۖ֨᩵;

    invoke-virtual {v0}, Ll/ۖ֨᩵;->ᩳ()Ll/᩻֨᩵;

    move-result-object v0

    .line 282
    :try_start_0
    invoke-virtual {v0}, Ll/᩻֨᩵;->ۘ()Ll/᩷֨᩵;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 283
    :try_start_1
    invoke-virtual {v1}, Ll/᩷֨᩵;->᩸()Ll/᩷ۖ᩵;

    move-result-object v2

    invoke-interface {v2}, Ll/᩷ۖ᩵;->getSendBufferSize()I

    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 122
    :try_start_2
    invoke-virtual {v1}, Ll/۟֨᩵;->ۘ()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 213
    invoke-virtual {v0}, Ll/᩻֨᩵;->᩸()V

    return v2

    :catchall_0
    move-exception v2

    .line 122
    :try_start_3
    invoke-virtual {v1}, Ll/۟֨᩵;->ۘ()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v1

    .line 281
    :try_start_4
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception v1

    if-eqz v0, :cond_0

    .line 213
    :try_start_5
    invoke-virtual {v0}, Ll/᩻֨᩵;->᩸()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_1

    :catchall_3
    move-exception v0

    .line 281
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_0
    :goto_1
    throw v1
.end method

.method public final ֡()I
    .locals 1

    .line 250
    iget-object v0, p0, Ll/ۘ֨᩵;->᩹:Ll/ۖ֨᩵;

    invoke-virtual {v0}, Ll/ۖ֨᩵;->ܳ()I

    move-result v0

    return v0
.end method

.method public final varargs ֫(Ll/۟ܺ᩵;Ll/֫ۖ᩵;[Ll/֡ۚ᩵;)Ll/֫ۖ᩵;
    .locals 2

    .line 128
    iget-object v0, p0, Ll/ۘ֨᩵;->᩹:Ll/ۖ֨᩵;

    iget-object v1, p0, Ll/ۘ֨᩵;->᩸:Ll/ᩳ֨᩵;

    invoke-virtual {v0, v1, p1, p2, p3}, Ll/ۖ֨᩵;->֫(Ll/ᩳ֨᩵;Ll/۟ܺ᩵;Ll/֫ۖ᩵;[Ll/֡ۚ᩵;)Ll/֫ۖ᩵;

    move-result-object p1

    return-object p1
.end method

.method public final ֫()V
    .locals 5

    .line 160
    iget-object v0, p0, Ll/ۘ֨᩵;->᩶:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    move-result-wide v0

    const-wide/16 v2, 0x1

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    .line 161
    iget-object v0, p0, Ll/ۘ֨᩵;->᩹:Ll/ۖ֨᩵;

    invoke-virtual {v0}, Ll/ۖ֨᩵;->֫()V

    :cond_0
    return-void
.end method

.method public final ֫(I)Z
    .locals 3

    .line 74
    iget-object v0, p0, Ll/ۘ֨᩵;->᩹:Ll/ۖ֨᩵;

    .line 813
    invoke-virtual {v0}, Ll/ۖ֨᩵;->ᩳ()Ll/᩻֨᩵;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 815
    :try_start_0
    invoke-virtual {v0}, Ll/᩻֨᩵;->ۘ()Ll/᩷֨᩵;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 212
    :try_start_1
    invoke-virtual {v1}, Ll/᩷֨᩵;->᩸()Ll/᩷ۖ᩵;

    move-result-object v2

    invoke-interface {v2, p1}, Ll/᩷ۖ᩵;->ܽ(I)Z

    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 122
    :try_start_2
    invoke-virtual {v1}, Ll/۟֨᩵;->ۘ()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 213
    invoke-virtual {v0}, Ll/᩻֨᩵;->᩸()V

    return p1

    :catchall_0
    move-exception p1

    .line 122
    :try_start_3
    invoke-virtual {v1}, Ll/۟֨᩵;->ۘ()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v1

    .line 815
    :try_start_4
    invoke-virtual {p1, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1

    .line 819
    :cond_0
    new-instance p1, Ll/ۗۚ᩵;

    const-string v1, "Not connected"

    invoke-direct {p1, v1}, Ll/ۗۚ᩵;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception p1

    if-eqz v0, :cond_1

    .line 213
    :try_start_5
    invoke-virtual {v0}, Ll/᩻֨᩵;->᩸()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_1

    :catchall_3
    move-exception v0

    .line 813
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1
    :goto_1
    throw p1
.end method

.method public final ֫(Ll/ᩴ֨᩵;)Z
    .locals 1

    .line 272
    invoke-static {p1}, Ll/۫ۤ᩷;->֫(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 275
    :cond_0
    check-cast p1, Ll/ۘ֨᩵;

    iget-object p1, p1, Ll/ۘ֨᩵;->᩹:Ll/ۖ֨᩵;

    iget-object v0, p0, Ll/ۘ֨᩵;->᩹:Ll/ۖ֨᩵;

    invoke-virtual {v0, p1}, Ll/ۖ֨᩵;->֫(Ll/ۖ֨᩵;)Z

    move-result p1

    return p1
.end method

.method public final ۖ()I
    .locals 3

    .line 290
    iget-object v0, p0, Ll/ۘ֨᩵;->᩹:Ll/ۖ֨᩵;

    invoke-virtual {v0}, Ll/ۖ֨᩵;->ᩳ()Ll/᩻֨᩵;

    move-result-object v0

    .line 291
    :try_start_0
    invoke-virtual {v0}, Ll/᩻֨᩵;->ۘ()Ll/᩷֨᩵;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 292
    :try_start_1
    invoke-virtual {v1}, Ll/᩷֨᩵;->᩸()Ll/᩷ۖ᩵;

    move-result-object v2

    invoke-interface {v2}, Ll/᩷ۖ᩵;->ܺ()I

    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 122
    :try_start_2
    invoke-virtual {v1}, Ll/۟֨᩵;->ۘ()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 213
    invoke-virtual {v0}, Ll/᩻֨᩵;->᩸()V

    return v2

    :catchall_0
    move-exception v2

    .line 122
    :try_start_3
    invoke-virtual {v1}, Ll/۟֨᩵;->ۘ()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v1

    .line 290
    :try_start_4
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception v1

    if-eqz v0, :cond_0

    .line 213
    :try_start_5
    invoke-virtual {v0}, Ll/᩻֨᩵;->᩸()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_1

    :catchall_3
    move-exception v0

    .line 290
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_0
    :goto_1
    throw v1
.end method

.method public final ۘ()J
    .locals 6

    .line 213
    iget-object v0, p0, Ll/ۘ֨᩵;->᩹:Ll/ۖ֨᩵;

    invoke-virtual {v0}, Ll/ۖ֨᩵;->ᩳ()Ll/᩻֨᩵;

    move-result-object v0

    .line 214
    :try_start_0
    invoke-virtual {v0}, Ll/᩻֨᩵;->ۘ()Ll/᩷֨᩵;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 215
    :try_start_1
    invoke-virtual {v1}, Ll/᩷֨᩵;->᩸()Ll/᩷ۖ᩵;

    move-result-object v2

    .line 216
    instance-of v3, v2, Ll/ۡۘ᩵;

    if-eqz v3, :cond_0

    .line 217
    check-cast v2, Ll/ۡۘ᩵;

    invoke-virtual {v2}, Ll/ۡۘ᩵;->᩵֫()Ll/ܰۖ᩵;

    move-result-object v2

    iget v2, v2, Ll/ܰۖ᩵;->ۖ:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    mul-int/lit16 v2, v2, 0x3e8

    int-to-long v2, v2

    const-wide/16 v4, 0x3c

    mul-long v2, v2, v4

    .line 122
    :try_start_2
    invoke-virtual {v1}, Ll/۟֨᩵;->ۘ()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 213
    invoke-virtual {v0}, Ll/᩻֨᩵;->᩸()V

    return-wide v2

    .line 122
    :cond_0
    :try_start_3
    invoke-virtual {v1}, Ll/۟֨᩵;->ۘ()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 213
    invoke-virtual {v0}, Ll/᩻֨᩵;->᩸()V

    const-wide/16 v0, 0x0

    return-wide v0

    :catchall_0
    move-exception v2

    .line 122
    :try_start_4
    invoke-virtual {v1}, Ll/۟֨᩵;->ۘ()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v1

    .line 213
    :try_start_5
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :catchall_2
    move-exception v1

    if-eqz v0, :cond_1

    :try_start_6
    invoke-virtual {v0}, Ll/᩻֨᩵;->᩸()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    goto :goto_1

    :catchall_3
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1
    :goto_1
    throw v1
.end method

.method public final ۜ()Ljava/lang/String;
    .locals 4

    .line 232
    iget-object v0, p0, Ll/ۘ֨᩵;->᩹:Ll/ۖ֨᩵;

    invoke-virtual {v0}, Ll/ۖ֨᩵;->ᩳ()Ll/᩻֨᩵;

    move-result-object v0

    .line 233
    :try_start_0
    invoke-virtual {v0}, Ll/᩻֨᩵;->ۘ()Ll/᩷֨᩵;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 234
    :try_start_1
    invoke-virtual {v1}, Ll/᩷֨᩵;->᩸()Ll/᩷ۖ᩵;

    move-result-object v2

    .line 235
    instance-of v3, v2, Ll/ۡۘ᩵;

    if-eqz v3, :cond_0

    .line 236
    check-cast v2, Ll/ۡۘ᩵;

    invoke-virtual {v2}, Ll/ۡۘ᩵;->᩵֫()Ll/ܰۖ᩵;

    move-result-object v2

    iget-object v2, v2, Ll/ܰۖ᩵;->ۜ:Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 122
    :try_start_2
    invoke-virtual {v1}, Ll/۟֨᩵;->ۘ()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 213
    invoke-virtual {v0}, Ll/᩻֨᩵;->᩸()V

    return-object v2

    .line 122
    :cond_0
    :try_start_3
    invoke-virtual {v1}, Ll/۟֨᩵;->ۘ()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 213
    invoke-virtual {v0}, Ll/᩻֨᩵;->᩸()V

    const/4 v0, 0x0

    return-object v0

    :catchall_0
    move-exception v2

    .line 122
    :try_start_4
    invoke-virtual {v1}, Ll/۟֨᩵;->ۘ()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v1

    .line 232
    :try_start_5
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :catchall_2
    move-exception v1

    if-eqz v0, :cond_1

    .line 213
    :try_start_6
    invoke-virtual {v0}, Ll/᩻֨᩵;->᩸()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    goto :goto_1

    :catchall_3
    move-exception v0

    .line 232
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1
    :goto_1
    throw v1
.end method

.method public final ܳ()Ll/֨ۡ᩵;
    .locals 1

    .line 96
    iget-object v0, p0, Ll/ۘ֨᩵;->᩹:Ll/ۖ֨᩵;

    invoke-virtual {v0}, Ll/ۖ֨᩵;->ܽ()Ll/֨ۡ᩵;

    move-result-object v0

    return-object v0
.end method

.method public final ܶ()Z
    .locals 1

    .line 85
    iget-object v0, p0, Ll/ۘ֨᩵;->᩹:Ll/ۖ֨᩵;

    invoke-virtual {v0}, Ll/ۖ֨᩵;->᩻()Z

    move-result v0

    return v0
.end method

.method public final ܽ()Z
    .locals 3

    .line 308
    iget-object v0, p0, Ll/ۘ֨᩵;->᩹:Ll/ۖ֨᩵;

    invoke-virtual {v0}, Ll/ۖ֨᩵;->ᩳ()Ll/᩻֨᩵;

    move-result-object v0

    .line 309
    :try_start_0
    invoke-virtual {v0}, Ll/᩻֨᩵;->ۘ()Ll/᩷֨᩵;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 310
    :try_start_1
    invoke-virtual {v1}, Ll/᩷֨᩵;->᩸()Ll/᩷ۖ᩵;

    move-result-object v2

    invoke-interface {v2}, Ll/᩷ۖ᩵;->᩸()Z

    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 122
    :try_start_2
    invoke-virtual {v1}, Ll/۟֨᩵;->ۘ()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 213
    invoke-virtual {v0}, Ll/᩻֨᩵;->᩸()V

    return v2

    :catchall_0
    move-exception v2

    .line 122
    :try_start_3
    invoke-virtual {v1}, Ll/۟֨᩵;->ۘ()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v1

    .line 308
    :try_start_4
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception v1

    if-eqz v0, :cond_0

    .line 213
    :try_start_5
    invoke-virtual {v0}, Ll/᩻֨᩵;->᩸()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_1

    :catchall_3
    move-exception v0

    .line 308
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_0
    :goto_1
    throw v1
.end method

.method public final ᩳ()V
    .locals 3

    .line 68
    iget-object v0, p0, Ll/ۘ֨᩵;->᩸:Ll/ᩳ֨᩵;

    const/4 v1, 0x0

    .line 641
    iget-object v2, p0, Ll/ۘ֨᩵;->᩹:Ll/ۖ֨᩵;

    invoke-virtual {v2, v0, v1}, Ll/ۖ֨᩵;->֫(Ll/ᩳ֨᩵;Ll/ܽۖ᩵;)Ll/ۛۡ᩵;

    return-void
.end method

.method public final ᩴ()Ll/᩻֨᩵;
    .locals 1

    .line 62
    iget-object v0, p0, Ll/ۘ֨᩵;->᩹:Ll/ۖ֨᩵;

    invoke-virtual {v0}, Ll/ۖ֨᩵;->ᩳ()Ll/᩻֨᩵;

    move-result-object v0

    return-object v0
.end method

.method public final ᩵()J
    .locals 2

    .line 104
    iget-object v0, p0, Ll/ۘ֨᩵;->᩹:Ll/ۖ֨᩵;

    invoke-virtual {v0}, Ll/ۖ֨᩵;->ܿ()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ᩸()Z
    .locals 3

    .line 320
    :try_start_0
    iget-object v0, p0, Ll/ۘ֨᩵;->᩹:Ll/ۖ֨᩵;

    invoke-virtual {v0}, Ll/ۖ֨᩵;->ᩳ()Ll/᩻֨᩵;

    move-result-object v0
    :try_end_0
    .catch Ll/ۗۚ᩵; {:try_start_0 .. :try_end_0} :catch_0

    .line 321
    :try_start_1
    invoke-virtual {v0}, Ll/᩻֨᩵;->ۘ()Ll/᩷֨᩵;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 322
    :try_start_2
    invoke-virtual {v1}, Ll/᩷֨᩵;->۬()Z

    move-result v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 122
    :try_start_3
    invoke-virtual {v1}, Ll/۟֨᩵;->ۘ()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 213
    :try_start_4
    invoke-virtual {v0}, Ll/᩻֨᩵;->᩸()V
    :try_end_4
    .catch Ll/ۗۚ᩵; {:try_start_4 .. :try_end_4} :catch_0

    return v2

    :catchall_0
    move-exception v2

    .line 122
    :try_start_5
    invoke-virtual {v1}, Ll/۟֨᩵;->ۘ()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v1

    .line 320
    :try_start_6
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catchall_2
    move-exception v1

    if-eqz v0, :cond_0

    .line 213
    :try_start_7
    invoke-virtual {v0}, Ll/᩻֨᩵;->᩸()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    goto :goto_1

    :catchall_3
    move-exception v0

    .line 320
    :try_start_8
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_0
    :goto_1
    throw v1
    :try_end_8
    .catch Ll/ۗۚ᩵; {:try_start_8 .. :try_end_8} :catch_0

    :catch_0
    move-exception v0

    .line 324
    sget-object v1, Ll/ۘ֨᩵;->ۙ:Ll/֫᩻֨;

    const-string v2, "Failed to connect for determining SMB2 support"

    invoke-interface {v1, v2, v0}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Exception;)V

    const/4 v0, 0x0

    return v0
.end method

.method public final ᩹()V
    .locals 5

    .line 169
    iget-object v0, p0, Ll/ۘ֨᩵;->᩶:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->decrementAndGet()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    .line 171
    iget-object v0, p0, Ll/ۘ֨᩵;->᩹:Ll/ۖ֨᩵;

    invoke-virtual {v0}, Ll/ۖ֨᩵;->ۜ()V

    return-void

    :cond_0
    if-ltz v4, :cond_1

    return-void

    .line 173
    :cond_1
    new-instance v0, Ll/۬ۡ᩵;

    const-string v1, "Usage count dropped below zero"

    .line 58
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 173
    throw v0
.end method

.method public final ᩻()I
    .locals 3

    .line 299
    iget-object v0, p0, Ll/ۘ֨᩵;->᩹:Ll/ۖ֨᩵;

    invoke-virtual {v0}, Ll/ۖ֨᩵;->ᩳ()Ll/᩻֨᩵;

    move-result-object v0

    .line 300
    :try_start_0
    invoke-virtual {v0}, Ll/᩻֨᩵;->ۘ()Ll/᩷֨᩵;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 301
    :try_start_1
    invoke-virtual {v1}, Ll/᩷֨᩵;->᩸()Ll/᩷ۖ᩵;

    move-result-object v2

    invoke-interface {v2}, Ll/᩷ۖ᩵;->۫()I

    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 122
    :try_start_2
    invoke-virtual {v1}, Ll/۟֨᩵;->ۘ()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 213
    invoke-virtual {v0}, Ll/᩻֨᩵;->᩸()V

    return v2

    :catchall_0
    move-exception v2

    .line 122
    :try_start_3
    invoke-virtual {v1}, Ll/۟֨᩵;->ۘ()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v1

    .line 299
    :try_start_4
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception v1

    if-eqz v0, :cond_0

    .line 213
    :try_start_5
    invoke-virtual {v0}, Ll/᩻֨᩵;->᩸()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_1

    :catchall_3
    move-exception v0

    .line 299
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_0
    :goto_1
    throw v1
.end method
