.class public final Ll/ۜۛܳ;
.super Ll/֫᩻ᩳ;
.source "HAIH"


# instance fields
.field public final synthetic ᩹:Ll/᩷ۛܳ;


# direct methods
.method public constructor <init>(Ll/᩷ۛܳ;Ll/ۖۛܳ;)V
    .locals 0

    .line 352
    iput-object p1, p0, Ll/ۜۛܳ;->᩹:Ll/᩷ۛܳ;

    invoke-direct {p0, p2}, Ll/֫᩻ᩳ;-><init>(Ll/ۖۛܳ;)V

    return-void
.end method


# virtual methods
.method public final ֫(I)V
    .locals 0

    return-void
.end method

.method public final ۤ()V
    .locals 0

    .line 413
    invoke-virtual {p0}, Ll/ۜۛܳ;->᩹()V

    return-void
.end method

.method public final ܳ()Lnet/sf/sevenzipjbinding/ISequentialOutStream;
    .locals 7

    .line 361
    iget-object v0, p0, Ll/ۜۛܳ;->᩹:Ll/᩷ۛܳ;

    iget-object v1, v0, Ll/᩷ۛܳ;->᩸:Ll/ᩳۜܳ;

    const-wide/32 v2, 0x100000

    .line 363
    invoke-interface {v1}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    long-to-int v3, v2

    const/16 v2, 0x400

    if-ge v3, v2, :cond_0

    const/16 v3, 0x400

    .line 367
    :cond_0
    new-instance v2, Ll/ۢᩳ֡;

    int-to-long v3, v3

    invoke-direct {v2, v3, v4}, Ll/ۢᩳ֡;-><init>(J)V

    .line 368
    invoke-virtual {v2}, Ll/ۢᩳ֡;->֫()Ll/ۚᩳ֡;

    move-result-object v3

    invoke-static {v3}, Ll/᩻ᩳ֡;->֫(Ll/ۚᩳ֡;)Ll/ۤܽ֡;

    move-result-object v3

    iput-object v3, v0, Ll/᩷ۛܳ;->ۙ:Ll/ۤܽ֡;

    .line 369
    iget-object v4, v0, Ll/᩷ۛܳ;->۫:Ljava/util/concurrent/ExecutorService;

    iget-object v5, v0, Ll/᩷ۛܳ;->۬:Ll/᩺ܺܳ;

    new-instance v6, Ll/᩻ۛܳ;

    invoke-direct {v6, p0, v2, v5, v1}, Ll/᩻ۛܳ;-><init>(Ll/ۜۛܳ;Ll/ۢᩳ֡;Ll/᩺ܺܳ;Ll/ᩳۜܳ;)V

    invoke-interface {v4, v6}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object v1

    iput-object v1, v0, Ll/᩷ۛܳ;->᩶:Ljava/util/concurrent/Future;

    .line 386
    new-instance v0, Ll/᩻ۨۡ;

    invoke-direct {v0, v3}, Ll/᩻ۨۡ;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final ܽ()V
    .locals 2

    .line 418
    iget-object v0, p0, Ll/ۜۛܳ;->᩹:Ll/᩷ۛܳ;

    const/4 v1, 0x1

    iput-boolean v1, v0, Ll/᩷ۛܳ;->᩹:Z

    return-void
.end method

.method public final ᩷(I)V
    .locals 2

    .line 356
    iget-object v0, p0, Ll/ۜۛܳ;->᩹:Ll/᩷ۛܳ;

    iget-object v1, v0, Ll/᩷ۛܳ;->ۤ:Ll/ۙۜᩴ;

    invoke-virtual {v1, p1}, Ll/ۙۜᩴ;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ᩳۜܳ;

    iput-object p1, v0, Ll/᩷ۛܳ;->᩸:Ll/ᩳۜܳ;

    return-void
.end method

.method public final ᩹()V
    .locals 6

    .line 397
    iget-object v0, p0, Ll/ۜۛܳ;->᩹:Ll/᩷ۛܳ;

    iget-object v1, v0, Ll/᩷ۛܳ;->ۙ:Ll/ۤܽ֡;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 398
    invoke-static {v1}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 399
    iput-object v2, v0, Ll/᩷ۛܳ;->ۙ:Ll/ۤܽ֡;

    .line 401
    :cond_0
    iget-object v1, v0, Ll/᩷ۛܳ;->᩶:Ljava/util/concurrent/Future;

    if-eqz v1, :cond_1

    .line 403
    :try_start_0
    sget-object v3, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v4, 0x1

    invoke-interface {v1, v4, v5, v3}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 407
    :catch_0
    iput-object v2, v0, Ll/᩷ۛܳ;->᩶:Ljava/util/concurrent/Future;

    :cond_1
    return-void
.end method

.method public final ᩻()Z
    .locals 2

    .line 423
    iget-object v0, p0, Ll/ۜۛܳ;->᩹:Ll/᩷ۛܳ;

    iget-boolean v1, v0, Ll/᩷ۛܳ;->᩹:Z

    if-nez v1, :cond_1

    iget-object v0, v0, Ll/᩷ۛܳ;->۬:Ll/᩺ܺܳ;

    invoke-interface {v0}, Ll/ܿۖ᩷;->᩻()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
