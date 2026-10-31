.class public final Ll/֨֫ܿ;
.super Ljava/lang/Object;
.source "L6NC"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final ۗ:Ljava/util/concurrent/Executor;

.field public volatile ۙ:Z

.field public ۛ:J

.field public ۤ:J

.field public ۨ:Z

.field public final ۫:Landroid/os/Handler;

.field public ۬:J

.field public final ܰ:Ll/ۚ۫ᩳ;

.field public final ᩶:Ll/ܺ֫ܿ;

.field public final ᩸:Ll/ۖ֫ܿ;

.field public ᩹:J

.field public final ᩺:Ll/ۤ᩸ᩳ;


# direct methods
.method public constructor <init>(Ll/۟᩺ᩳ;)V
    .locals 7

    .line 34
    new-instance v0, Ll/ܺ֫ܿ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ll/ۜ֡ᩳ;->ۧ()Ljava/util/concurrent/Executor;

    move-result-object v1

    invoke-interface {p1}, Ll/۟᩺ᩳ;->ܳۧ()Ll/᩻۬ᩳ;

    move-result-object v2

    invoke-static {v2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v3, Ll/ۖ֫ܿ;

    const/4 v4, 0x0

    invoke-direct {v3, v4, v2}, Ll/ۖ֫ܿ;-><init>(ILjava/lang/Object;)V

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    new-instance v2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v4

    invoke-direct {v2, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v2, p0, Ll/֨֫ܿ;->۫:Landroid/os/Handler;

    .line 26
    new-instance v4, Ll/ۚ۫ᩳ;

    const/4 v5, 0x1

    invoke-direct {v4, v5, p0}, Ll/ۚ۫ᩳ;-><init>(ILjava/lang/Object;)V

    iput-object v4, p0, Ll/֨֫ܿ;->ܰ:Ll/ۚ۫ᩳ;

    const-wide/32 v5, 0x927c0

    .line 29
    iput-wide v5, p0, Ll/֨֫ܿ;->᩹:J

    const-wide/16 v5, -0x1

    .line 30
    iput-wide v5, p0, Ll/֨֫ܿ;->ۛ:J

    .line 39
    check-cast p1, Ll/ۤ᩸ᩳ;

    iput-object p1, p0, Ll/֨֫ܿ;->᩺:Ll/ۤ᩸ᩳ;

    iput-object v0, p0, Ll/֨֫ܿ;->᩶:Ll/ܺ֫ܿ;

    iput-object v1, p0, Ll/֨֫ܿ;->ۗ:Ljava/util/concurrent/Executor;

    iput-object v3, p0, Ll/֨֫ܿ;->᩸:Ll/ۖ֫ܿ;

    const-wide/16 v0, 0x7d0

    .line 40
    invoke-virtual {v2, v4, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public static ֫(Ll/֨֫ܿ;J)Ll/ۗ᩻᩵;
    .locals 3

    .line 52
    iget-boolean v0, p0, Ll/֨֫ܿ;->ۙ:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/֨֫ܿ;->᩺:Ll/ۤ᩸ᩳ;

    invoke-interface {v0}, Ll/۟᩺ᩳ;->ܳۧ()Ll/᩻۬ᩳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩻۬ᩳ;->᩺()J

    move-result-wide v0

    cmp-long v2, v0, p1

    if-eqz v2, :cond_0

    goto :goto_0

    .line 54
    :cond_0
    iget-object v0, p0, Ll/֨֫ܿ;->᩸:Ll/ۖ֫ܿ;

    new-instance v1, Ll/᩵֫ܿ;

    invoke-direct {v1, p0, p1, p2}, Ll/᩵֫ܿ;-><init>(Ll/֨֫ܿ;J)V

    iget-object p0, v0, Ll/ۖ֫ܿ;->᩹:Ljava/lang/Object;

    check-cast p0, Ll/᩻۬ᩳ;

    invoke-virtual {p0, v1}, Ll/᩻۬ᩳ;->֫(Ljava/util/function/BooleanSupplier;)Ll/ۗ᩻᩵;

    move-result-object p0

    return-object p0

    .line 53
    :cond_1
    :goto_0
    sget-object p0, Ll/ܰۗᩳ;->ۗ:Ll/ܰۗᩳ;

    invoke-static {p0}, Ll/ۗ᩻᩵;->ᩳ(Ljava/lang/Object;)Ll/ۗ᩻᩵;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/֨֫ܿ;)V
    .locals 11

    .line 44
    iget-boolean v0, p0, Ll/֨֫ܿ;->ۙ:Z

    if-eqz v0, :cond_0

    goto :goto_2

    .line 45
    :cond_0
    iget-object v0, p0, Ll/֨֫ܿ;->᩶:Ll/ܺ֫ܿ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Ll/֨֫ܿ;->᩺:Ll/ۤ᩸ᩳ;

    invoke-interface {v2}, Ll/۟᩺ᩳ;->ܳۧ()Ll/᩻۬ᩳ;

    move-result-object v2

    invoke-virtual {v2}, Ll/᩻۬ᩳ;->᩺()J

    move-result-wide v2

    .line 46
    iget-wide v4, p0, Ll/֨֫ܿ;->ۛ:J

    cmp-long v6, v2, v4

    if-eqz v6, :cond_1

    iput-wide v2, p0, Ll/֨֫ܿ;->ۛ:J

    iput-wide v0, p0, Ll/֨֫ܿ;->۬:J

    .line 47
    :cond_1
    iget-boolean v4, p0, Ll/֨֫ܿ;->ۨ:Z

    const-wide/16 v5, 0x7d0

    if-nez v4, :cond_3

    iget-wide v7, p0, Ll/֨֫ܿ;->۬:J

    sub-long v7, v0, v7

    const-wide/16 v9, 0x2710

    cmp-long v4, v7, v9

    if-ltz v4, :cond_3

    iget-wide v7, p0, Ll/֨֫ܿ;->ۤ:J

    cmp-long v4, v0, v7

    if-gez v4, :cond_2

    goto :goto_0

    :cond_2
    const/4 v4, 0x1

    .line 48
    iput-boolean v4, p0, Ll/֨֫ܿ;->ۨ:Z

    .line 51
    :try_start_0
    new-instance v4, Ll/ۘ֫ܿ;

    invoke-direct {v4, p0, v2, v3}, Ll/ۘ֫ܿ;-><init>(Ll/֨֫ܿ;J)V

    iget-object v2, p0, Ll/֨֫ܿ;->ۗ:Ljava/util/concurrent/Executor;

    invoke-static {v4, v2}, Ll/ۗ᩻᩵;->֫(Ll/ۘ֫ܿ;Ljava/util/concurrent/Executor;)Ll/ۗ᩻᩵;

    move-result-object v2

    new-instance v3, Ll/۟֫ᩴ;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 55
    invoke-virtual {v2, v3}, Ll/ۗ᩻᩵;->ܽ(Ll/᩸ۜ᩵;)Ll/ۗ᩻᩵;

    move-result-object v2

    new-instance v3, Ll/ᩴ֫ܿ;

    invoke-direct {v3, p0}, Ll/ᩴ֫ܿ;-><init>(Ll/֨֫ܿ;)V

    invoke-virtual {v2, v3}, Ll/ۗ᩻᩵;->֫(Ll/۠ۜ᩵;)Ll/ۗ᩻᩵;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    nop

    const/4 v2, 0x0

    .line 81
    iput-boolean v2, p0, Ll/֨֫ܿ;->ۨ:Z

    const-wide/32 v2, 0x927c0

    add-long/2addr v0, v2

    .line 82
    iput-wide v0, p0, Ll/֨֫ܿ;->ۤ:J

    .line 88
    iget-boolean v0, p0, Ll/֨֫ܿ;->ۙ:Z

    if-nez v0, :cond_4

    goto :goto_1

    :cond_3
    :goto_0
    iget-boolean v0, p0, Ll/֨֫ܿ;->ۙ:Z

    if-nez v0, :cond_4

    :goto_1
    iget-object v0, p0, Ll/֨֫ܿ;->۫:Landroid/os/Handler;

    iget-object p0, p0, Ll/֨֫ܿ;->ܰ:Ll/ۚ۫ᩳ;

    invoke-virtual {v0, p0, v5, v6}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_4
    :goto_2
    return-void
.end method

.method public static ֫(Ll/ܰۗᩳ;Ll/֨֫ܿ;Ljava/lang/Throwable;)V
    .locals 8

    const/4 v0, 0x0

    .line 56
    iput-boolean v0, p1, Ll/֨֫ܿ;->ۨ:Z

    .line 57
    iget-boolean v1, p1, Ll/֨֫ܿ;->ۙ:Z

    if-eqz v1, :cond_0

    goto/16 :goto_2

    :cond_0
    const-wide/32 v1, 0x927c0

    if-eqz p2, :cond_1

    goto :goto_0

    .line 58
    :cond_1
    sget-object p2, Ll/ۚ֫ܿ;->֫:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget p2, p2, v3

    const/4 v3, 0x1

    if-eq p2, v3, :cond_5

    const/4 v1, 0x2

    const-wide/32 v2, 0x36ee80

    if-eq p2, v1, :cond_4

    const/4 v1, 0x3

    if-eq p2, v1, :cond_3

    const/4 v1, 0x4

    if-ne p2, v1, :cond_2

    const-wide/16 v1, 0x7530

    goto :goto_0

    :cond_2
    new-instance p0, Ljava/lang/IncompatibleClassChangeError;

    invoke-direct {p0}, Ljava/lang/IncompatibleClassChangeError;-><init>()V

    throw p0

    :cond_3
    move-wide v1, v2

    goto :goto_0

    .line 64
    :cond_4
    iget-wide v4, p1, Ll/֨֫ܿ;->᩹:J

    const-wide/16 v6, 0x2

    mul-long v6, v6, v4

    .line 65
    invoke-static {v2, v3, v6, v7}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    iput-wide v1, p1, Ll/֨֫ܿ;->᩹:J

    move-wide v1, v4

    goto :goto_0

    .line 60
    :cond_5
    iput-wide v1, p1, Ll/֨֫ܿ;->᩹:J

    .line 71
    :goto_0
    iget-object p2, p1, Ll/֨֫ܿ;->᩶:Ll/ܺ֫ܿ;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v3

    add-long/2addr v3, v1

    iput-wide v3, p1, Ll/֨֫ܿ;->ۤ:J

    .line 73
    sget-object p2, Ll/ܰۗᩳ;->᩶:Ll/ܰۗᩳ;

    if-ne p0, p2, :cond_6

    .line 75
    iget-object p0, p1, Ll/֨֫ܿ;->᩺:Ll/ۤ᩸ᩳ;

    invoke-virtual {p0}, Ll/ۤ᩸ᩳ;->length()I

    move-result p2

    const-class v1, Ll/ۜ۫ᩳ;

    invoke-virtual {p0, v0, p2, v1}, Ll/ۤ᩸ᩳ;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ll/ۜ۫ᩳ;

    array-length p2, p0

    :goto_1
    if-ge v0, p2, :cond_6

    aget-object v1, p0, v0

    .line 76
    iget-object v2, p1, Ll/֨֫ܿ;->᩺:Ll/ۤ᩸ᩳ;

    invoke-virtual {v1, v2}, Ll/ۜ۫ᩳ;->֫(Ll/۟᩺ᩳ;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 88
    :cond_6
    iget-boolean p0, p1, Ll/֨֫ܿ;->ۙ:Z

    if-nez p0, :cond_7

    iget-object p0, p1, Ll/֨֫ܿ;->۫:Landroid/os/Handler;

    iget-object p1, p1, Ll/֨֫ܿ;->ܰ:Ll/ۚ۫ᩳ;

    const-wide/16 v0, 0x7d0

    invoke-virtual {p0, p1, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_7
    :goto_2
    return-void
.end method

.method public static synthetic ۧ(Ll/ܰۗᩳ;Ll/֨֫ܿ;Ljava/lang/Throwable;)V
    .locals 3

    .line 55
    iget-object v0, p1, Ll/֨֫ܿ;->۫:Landroid/os/Handler;

    new-instance v1, Ll/֡֫ܿ;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p2, p0, v2}, Ll/֡֫ܿ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public static synthetic ۧ(Ll/֨֫ܿ;J)Z
    .locals 2

    .line 54
    iget-boolean v0, p0, Ll/֨֫ܿ;->ۙ:Z

    if-nez v0, :cond_1

    iget-object p0, p0, Ll/֨֫ܿ;->᩺:Ll/ۤ᩸ᩳ;

    invoke-interface {p0}, Ll/۟᩺ᩳ;->ܳۧ()Ll/᩻۬ᩳ;

    move-result-object p0

    invoke-virtual {p0}, Ll/᩻۬ᩳ;->᩺()J

    move-result-wide v0

    cmp-long p0, v0, p1

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


# virtual methods
.method public final close()V
    .locals 2

    const/4 v0, 0x1

    .line 91
    iput-boolean v0, p0, Ll/֨֫ܿ;->ۙ:Z

    .line 92
    iget-object v0, p0, Ll/֨֫ܿ;->۫:Landroid/os/Handler;

    iget-object v1, p0, Ll/֨֫ܿ;->ܰ:Ll/ۚ۫ᩳ;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method
